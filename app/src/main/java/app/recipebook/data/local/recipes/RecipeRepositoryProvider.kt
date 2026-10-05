package app.recipebook.data.local.recipes

import android.content.Context
import android.content.res.Configuration
import android.util.Log
import android.widget.Toast
import app.recipebook.R
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import java.util.Locale
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import androidx.room.withTransaction
import app.recipebook.data.local.db.RecipeBookDatabaseProvider
import app.recipebook.data.local.settings.DriveSyncSettingsStore

data class RecipeRepositoryServices(
    val repository: RecipeRepository,
    val syncCoordinator: RecipeLibrarySyncCoordinator
)

object RecipeRepositoryProvider {
    fun create(context: Context): RecipeRepository = createServices(context).repository

    fun createServices(context: Context): RecipeRepositoryServices {
        val appContext = context.applicationContext
        val db = RecipeBookDatabaseProvider.get(appContext)
        val repository = RecipeRepository(
            recipeDao = db.recipeDao(),
            ingredientReferenceDao = db.ingredientReferenceDao(),
            contextualSubstitutionRuleDao = db.contextualSubstitutionRuleDao(),
            tagDao = db.tagDao(),
            collectionDao = db.collectionDao(),
            librarySettingsDao = db.librarySettingsDao(),
            libraryMetadataDao = db.libraryMetadataDao(),
            seedLibraryLoader = { BundledRecipeLibraryLoader.loadLibrary(appContext) },
            transactionRunner = { block -> db.withTransaction { block() } },
            catalogStore = PersistentRecipeCatalogStore(appContext)
        )
        val onBackupFailure: suspend (Exception) -> Unit = { error ->
            Log.w("RecipeBackup", "Backup update failed: ${error.javaClass.simpleName}")
            val language = runCatchingRecipeWork { AppLanguageStore(appContext).language.first() }.getOrDefault(AppLanguage.EN)
            val configuration = Configuration(appContext.resources.configuration).apply {
                setLocale(if (language == AppLanguage.FR) Locale.CANADA_FRENCH else Locale.ENGLISH)
            }
            val message = appContext.createConfigurationContext(configuration).getString(R.string.local_save_backup_failed_label)
            withContext(Dispatchers.Main) { Toast.makeText(appContext, message, Toast.LENGTH_LONG).show() }
        }
        val syncCoordinator = RecipeLibrarySyncCoordinator(
            context = appContext,
            repository = repository,
            exporter = RecipeLibraryExporter(appContext, repository),
            assetStore = RecipeLibraryAssetStore(appContext),
            cacheStore = RecipeLibraryCacheStore(appContext),
            driveSettingsStore = DriveSyncSettingsStore(appContext),
            onBackupFailure = onBackupFailure
        )
        repository.onLibraryMutated = {
            runRecipeBackupAfterMutation(
                refresh = syncCoordinator::refreshBackupAfterMutation, onFailure = onBackupFailure
            )
        }
        return RecipeRepositoryServices(
            repository = repository,
            syncCoordinator = syncCoordinator
        )
    }
}
