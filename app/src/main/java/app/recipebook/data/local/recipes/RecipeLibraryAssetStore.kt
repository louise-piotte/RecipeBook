package app.recipebook.data.local.recipes

import android.content.Context
import app.recipebook.domain.model.AttachmentRef
import app.recipebook.domain.model.PhotoRef
import java.io.File
import java.io.InputStream
import java.util.UUID

interface RecipeLibraryAssetSink {
    fun importPhoto(recipeId: String, photoId: String, archivePath: String, input: InputStream): PhotoRef
    fun importAttachment(
        recipeId: String,
        attachmentId: String,
        fileName: String,
        archivePath: String,
        mimeType: String,
        input: InputStream
    ): AttachmentRef
}

class RecipeLibraryAssetStore(context: Context) {
    private val appContext = context.applicationContext
    private val photoRoot = File(appContext.filesDir, "recipe-photos")
    private val attachmentRoot = File(appContext.filesDir, "recipe-attachments")
    private val stagingRoot = File(appContext.filesDir, "library-import-staging")

    fun createImportSession(): ImportSession {
        val sessionRoot = File(stagingRoot, UUID.randomUUID().toString())
        val sessionPhotoRoot = File(sessionRoot, "recipe-photos")
        val sessionAttachmentRoot = File(sessionRoot, "recipe-attachments")
        return ImportSession(
            sessionPhotoRoot = sessionPhotoRoot,
            sessionAttachmentRoot = sessionAttachmentRoot,
            finalPhotoRoot = photoRoot,
            finalAttachmentRoot = attachmentRoot,
            replacement = RecipeMediaReplacement(
                staged = listOf(sessionPhotoRoot, sessionAttachmentRoot),
                managed = listOf(photoRoot, attachmentRoot),
                backupRoot = File(sessionRoot, "previous-media")
            ),
            discard = { sessionRoot.deleteRecursively() }
        )
    }

    class ImportSession internal constructor(
        private val sessionPhotoRoot: File,
        private val sessionAttachmentRoot: File,
        private val finalPhotoRoot: File,
        private val finalAttachmentRoot: File,
        private val replacement: RecipeMediaReplacement,
        private val discard: () -> Unit
    ) : RecipeLibraryAssetSink {
        override fun importPhoto(
            recipeId: String,
            photoId: String,
            archivePath: String,
            input: InputStream
        ): PhotoRef {
            requireValidStorageId(recipeId)
            requireValidStorageId(photoId)
            val extension = safeStorageExtension(File(archivePath).extension, "jpg")
            val targetFile = File(ensureDirectory(File(sessionPhotoRoot, recipeId)), "$photoId.$extension")
            targetFile.outputStream().use { output -> input.copyTo(output) }
            return PhotoRef(
                id = photoId,
                localPath = File(finalPhotoRoot, "$recipeId/${targetFile.name}").absolutePath
            )
        }

        override fun importAttachment(
            recipeId: String,
            attachmentId: String,
            fileName: String,
            archivePath: String,
            mimeType: String,
            input: InputStream
        ): AttachmentRef {
            requireValidStorageId(recipeId)
            requireValidStorageId(attachmentId)
            val extension = safeStorageExtension(File(fileName).extension.ifBlank { File(archivePath).extension }, "bin")
            val safeBaseName = fileName.substringBeforeLast('.', fileName)
                .replace("[^A-Za-z0-9._-]".toRegex(), "-")
                .trim('-')
                .ifBlank { attachmentId }
            val targetFile = File(
                ensureDirectory(File(sessionAttachmentRoot, recipeId)),
                "$attachmentId-$safeBaseName.$extension"
            )
            targetFile.outputStream().use { output -> input.copyTo(output) }
            return AttachmentRef(
                id = attachmentId,
                fileName = fileName,
                mimeType = mimeType,
                localPath = File(finalAttachmentRoot, "$recipeId/${targetFile.name}").absolutePath
            )
        }

        fun installToManagedStorage() { replacement.install() }

        fun completeCommit() {
            replacement.complete()
            discard()
        }

        fun discardStagedAssets() {
            replacement.rollback()
            discard()
        }

        private fun ensureDirectory(directory: File): File {
            directory.mkdirs()
            return directory
        }

    }
}
