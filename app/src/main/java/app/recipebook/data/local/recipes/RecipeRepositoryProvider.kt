package app.recipebook.data.local.recipes

import android.content.Context
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
            transactionRunner = { block -> db.withTransaction { block() } }
        )
        val syncCoordinator = RecipeLibrarySyncCoordinator(
            context = appContext,
            repository = repository,
            exporter = RecipeLibraryExporter(appContext, repository),
            assetStore = RecipeLibraryAssetStore(appContext),
            cacheStore = RecipeLibraryCacheStore(appContext),
            driveSettingsStore = DriveSyncSettingsStore(appContext)
        )
        repository.onLibraryMutated = {
            syncCoordinator.refreshBackupAfterMutation()
        }
        return RecipeRepositoryServices(
            repository = repository,
            syncCoordinator = syncCoordinator
        )
    }
}
