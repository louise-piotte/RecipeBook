package app.recipebook.data.local.recipes

import android.content.Context
import android.net.Uri
import android.webkit.MimeTypeMap
import androidx.core.content.FileProvider
import app.recipebook.domain.model.PhotoRef
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.UUID
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

data class PendingRecipePhotoCapture(
    val photoId: String,
    val localPath: String,
    val uri: Uri
)

class RecipePhotoStore(private val context: Context) {
    private val appContext = context.applicationContext
    private val permanentRoot = File(appContext.filesDir, "recipe-photos")
    private val draftRoot = File(appContext.cacheDir, "recipe-photo-drafts")

    fun createPendingCameraCapture(): PendingRecipePhotoCapture {
        val photoId = UUID.randomUUID().toString()
        val file = File(ensureDirectory(draftRoot), "$photoId.jpg")
        file.parentFile?.mkdirs()
        val uri = FileProvider.getUriForFile(
            appContext,
            "${appContext.packageName}.fileprovider",
            file
        )
        return PendingRecipePhotoCapture(
            photoId = photoId,
            localPath = file.absolutePath,
            uri = uri
        )
    }

    suspend fun importDraftPhoto(sourceUri: Uri): PhotoRef = withContext(Dispatchers.IO) {
        val extension = resolveExtension(sourceUri)
        val photoId = UUID.randomUUID().toString()
        val targetFile = File(ensureDirectory(draftRoot), "$photoId.$extension")
        appContext.contentResolver.openInputStream(sourceUri).use { input ->
            requireNotNull(input) { "Unable to open photo source: $sourceUri" }
            FileOutputStream(targetFile).use { output ->
                input.copyTo(output)
            }
        }
        PhotoRef(id = photoId, localPath = targetFile.absolutePath)
    }

    suspend fun finalizePendingCameraCapture(capture: PendingRecipePhotoCapture): PhotoRef? = withContext(Dispatchers.IO) {
        val file = File(capture.localPath)
        if (!file.exists() || file.length() <= 0L) {
            file.delete()
            null
        } else {
            PhotoRef(id = capture.photoId, localPath = file.absolutePath)
        }
    }

    suspend fun persistRecipePhotos(recipeId: String, photos: List<PhotoRef>): List<PhotoRef> = withContext(Dispatchers.IO) {
        photos.map { photo ->
            val sourceFile = File(photo.localPath)
            if (!sourceFile.exists()) {
                photo
            } else if (isPermanentPath(sourceFile.absolutePath)) {
                photo
            } else {
                val extension = sourceFile.extension.ifBlank { "jpg" }
                val recipeDir = ensureDirectory(File(permanentRoot, recipeId))
                val targetFile = File(recipeDir, "${photo.id}.$extension")
                moveFile(sourceFile, targetFile)
                photo.copy(localPath = targetFile.absolutePath)
            }
        }
    }

    fun discardDraftPhoto(photo: PhotoRef) {
        if (isDraftPath(photo.localPath)) {
            File(photo.localPath).delete()
        }
    }

    fun cleanupDraftPhotos(photos: List<PhotoRef>) {
        photos.forEach(::discardDraftPhoto)
    }

    fun deleteManagedPhoto(photo: PhotoRef) {
        if (isManagedPath(photo.localPath)) {
            File(photo.localPath).delete()
        }
    }

    fun deleteManagedPhotos(photos: List<PhotoRef>) {
        photos.forEach(::deleteManagedPhoto)
    }

    private fun resolveExtension(sourceUri: Uri): String {
        val mimeType = appContext.contentResolver.getType(sourceUri)
        val fromMimeType = mimeType?.let(MimeTypeMap.getSingleton()::getExtensionFromMimeType)
        if (!fromMimeType.isNullOrBlank()) {
            return fromMimeType.lowercase()
        }
        val fromPath = MimeTypeMap.getFileExtensionFromUrl(sourceUri.toString())
        return fromPath?.ifBlank { null }?.lowercase() ?: "jpg"
    }

    private fun moveFile(sourceFile: File, targetFile: File) {
        targetFile.parentFile?.mkdirs()
        if (sourceFile.absolutePath == targetFile.absolutePath) {
            return
        }
        if (!sourceFile.renameTo(targetFile)) {
            FileInputStream(sourceFile).use { input ->
                FileOutputStream(targetFile).use { output ->
                    input.copyTo(output)
                }
            }
            sourceFile.delete()
        }
    }

    private fun ensureDirectory(directory: File): File {
        directory.mkdirs()
        return directory
    }

    private fun isDraftPath(localPath: String): Boolean = isInsideRoot(localPath, draftRoot)

    private fun isPermanentPath(localPath: String): Boolean = isInsideRoot(localPath, permanentRoot)

    private fun isManagedPath(localPath: String): Boolean = isDraftPath(localPath) || isPermanentPath(localPath)

    private fun isInsideRoot(localPath: String, root: File): Boolean {
        val rootPath = root.absoluteFile.toPath().normalize()
        val filePath = File(localPath).absoluteFile.toPath().normalize()
        return filePath.startsWith(rootPath)
    }
}
