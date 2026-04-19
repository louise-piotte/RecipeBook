package app.recipebook.data.local.recipes

import android.content.Context
import app.recipebook.domain.model.AppLanguage
import java.io.File
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal class RecipeLibraryExporter(
    context: Context,
    private val repository: RecipeRepository
) {
    private val appContext = context.applicationContext
    private val timestampFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss").withZone(ZoneOffset.UTC)

    suspend fun createRecipeArchive(
        fallbackLanguage: AppLanguage
    ): SeedExportBundle = withContext(Dispatchers.IO) {
        val now = Instant.now()
        val timestamp = timestampFormatter.format(now)
        val outputFile = File(appContext.cacheDir, "exports/recipebook-library-$timestamp.zip")
        val library = repository.buildExportLibrary(
            fallbackLanguage = fallbackLanguage,
            now = now.toString(),
            appVersion = appVersionName(),
            deviceId = android.os.Build.MODEL
        )
        RecipeExportCodec.writeSeedPackageZip(library = library, outputFile = outputFile)
    }

    suspend fun exportIngredientCatalogJson(
        fallbackLanguage: AppLanguage
    ): String = withContext(Dispatchers.IO) {
        val library = repository.buildExportLibrary(
            fallbackLanguage = fallbackLanguage,
            now = Instant.now().toString(),
            appVersion = appVersionName(),
            deviceId = android.os.Build.MODEL
        )
        RecipeExportCodec.encodeIngredientCatalogJson(library)
    }

    private fun appVersionName(): String? = runCatching {
        appContext.packageManager.getPackageInfo(appContext.packageName, 0).versionName
    }.getOrNull()
}
