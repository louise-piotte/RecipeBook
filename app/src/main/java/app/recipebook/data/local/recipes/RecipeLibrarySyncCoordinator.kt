package app.recipebook.data.local.recipes

import android.content.Context
import android.net.Uri
import android.provider.OpenableColumns
import app.recipebook.data.local.settings.DriveSyncSettingsStore
import app.recipebook.domain.model.RecipeLibrary
import java.io.File
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

sealed interface LaunchSyncOutcome {
    data object NotConfigured : LaunchSyncOutcome
    data object PulledFromDrive : LaunchSyncOutcome
    data object RestoredFromLocalCache : LaunchSyncOutcome
    data class Failed(val error: Throwable) : LaunchSyncOutcome
}

class RecipeLibrarySyncCoordinator internal constructor(
    context: Context,
    private val repository: RecipeRepository,
    private val exporter: RecipeLibraryExporter,
    private val assetStore: RecipeLibraryAssetStore,
    private val cacheStore: RecipeLibraryCacheStore,
    private val driveSettingsStore: DriveSyncSettingsStore
) {
    private val appContext = context.applicationContext

    suspend fun refreshBackupAfterMutation() = withContext(Dispatchers.IO) {
        val bundle = exporter.createRecipeArchive(
            fallbackLanguage = repository.getLibrarySettings().language
        )
        try {
            val cacheFile = cacheStore.writeSnapshot(bundle.archiveFile)
            val configuredUri = driveSettingsStore.get().documentUri
            if (configuredUri != null) {
                writeFileToUri(cacheFile, configuredUri)
            }
        } finally {
            bundle.archiveFile.delete()
        }
    }

    suspend fun configureDriveBackupDocument(uri: Uri) = withContext(Dispatchers.IO) {
        persistUriPermission(uri)
        driveSettingsStore.setDocumentUri(uri)
        val currentSettings = repository.getLibrarySettings()
        repository.updateLibrarySettings(
            currentSettings.copy(
                driveSyncEnabled = true,
                driveFileName = queryDisplayName(uri) ?: currentSettings.driveFileName
            ),
            notifyMutation = false
        )
        refreshBackupAfterMutation()
    }

    suspend fun replaceLibraryFromDrive(uri: Uri) = withContext(Dispatchers.IO) {
        persistUriPermission(uri)
        val importSession = assetStore.createImportSession()
        try {
            val importedLibrary = readLibraryFromUri(uri, importSession)
            repository.replaceLibrary(importedLibrary, notifyMutation = false)
            importSession.commitToManagedStorage()
        } catch (error: Throwable) {
            importSession.discardStagedAssets()
            throw error
        }
        driveSettingsStore.setDocumentUri(uri)
        val importedSettings = repository.getLibrarySettings()
        repository.updateLibrarySettings(
            importedSettings.copy(
                driveSyncEnabled = true,
                driveFileName = queryDisplayName(uri) ?: importedSettings.driveFileName
            ),
            notifyMutation = false
        )
        val bundle = exporter.createRecipeArchive(fallbackLanguage = importedSettings.language)
        try {
            cacheStore.writeSnapshot(bundle.archiveFile)
        } finally {
            bundle.archiveFile.delete()
        }
    }

    suspend fun syncFromConfiguredSourceOnLaunch(): LaunchSyncOutcome = withContext(Dispatchers.IO) {
        val settings = repository.getLibrarySettings()
        val configuredUri = driveSettingsStore.get().documentUri
        if (!settings.driveSyncEnabled || configuredUri == null) {
            return@withContext LaunchSyncOutcome.NotConfigured
        }

        return@withContext runCatching {
            replaceLibraryFromDrive(configuredUri)
            LaunchSyncOutcome.PulledFromDrive
        }.recoverCatching {
            val cacheFile = cacheStore.snapshotFileOrNull() ?: throw it
            val importSession = assetStore.createImportSession()
            try {
                val importedLibrary = RecipeLibraryImportCodec(importSession).readSeedPackageZip(cacheFile)
                repository.replaceLibrary(importedLibrary, notifyMutation = false)
                importSession.commitToManagedStorage()
            } catch (error: Throwable) {
                importSession.discardStagedAssets()
                throw error
            }
            LaunchSyncOutcome.RestoredFromLocalCache
        }.getOrElse { error ->
            LaunchSyncOutcome.Failed(error)
        }
    }

    suspend fun hasConfiguredDriveBackup(): Boolean = driveSettingsStore.get().documentUri != null

    suspend fun replaceLibraryFromConfiguredDrive() {
        val configuredUri = requireNotNull(driveSettingsStore.get().documentUri) {
            "No Drive backup document is configured"
        }
        replaceLibraryFromDrive(configuredUri)
    }

    private suspend fun readLibraryFromUri(
        uri: Uri,
        assetSink: RecipeLibraryAssetSink
    ): RecipeLibrary = withContext(Dispatchers.IO) {
        val tempFile = File.createTempFile("drive-library-import", ".zip", appContext.cacheDir)
        try {
            appContext.contentResolver.openInputStream(uri).use { input ->
                requireNotNull(input) { "Unable to open Drive document" }
                tempFile.outputStream().use { output -> input.copyTo(output) }
            }
            RecipeLibraryImportCodec(assetSink).readSeedPackageZip(tempFile)
        } finally {
            tempFile.delete()
        }
    }

    private fun writeFileToUri(sourceFile: File, uri: Uri) {
        appContext.contentResolver.openOutputStream(uri, "rwt").use { output ->
            requireNotNull(output) { "Unable to open Drive document for writing" }
            sourceFile.inputStream().use { input ->
                input.copyTo(output)
            }
        }
    }

    private fun persistUriPermission(uri: Uri) {
        runCatching {
            appContext.contentResolver.takePersistableUriPermission(
                uri,
                android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION or
                    android.content.Intent.FLAG_GRANT_WRITE_URI_PERMISSION
            )
        }
    }

    private fun queryDisplayName(uri: Uri): String? {
        appContext.contentResolver.query(uri, arrayOf(OpenableColumns.DISPLAY_NAME), null, null, null)
            ?.use { cursor ->
                if (cursor.moveToFirst()) {
                    return cursor.getString(0)
                }
            }
        return null
    }
}
