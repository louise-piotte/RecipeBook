package app.recipebook.data.local.recipes

import android.content.Context
import java.io.File
import java.io.InputStream
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecipeLibraryCacheStore(context: Context) {
    private val appContext = context.applicationContext
    private val cacheFile = File(appContext.filesDir, "library-cache/recipebook-library.zip")

    suspend fun writeSnapshot(sourceFile: File): File = withContext(Dispatchers.IO) {
        sourceFile.inputStream().use { input -> writeLibrarySnapshot(input, cacheFile) }
    }

    fun snapshotFileOrNull(): File? = cacheFile.takeIf(File::exists)
}

internal fun writeLibrarySnapshot(input: InputStream, cacheFile: File): File {
    val directory = requireNotNull(cacheFile.absoluteFile.parentFile)
    check(directory.isDirectory || directory.mkdirs()) { "Unable to create library cache directory" }
    val staged = File.createTempFile("library-snapshot-", ".zip", directory)
    try {
        staged.outputStream().use { output -> input.copyTo(output) }
        try {
            Files.move(staged.toPath(), cacheFile.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING)
        } catch (_: AtomicMoveNotSupportedException) {
            Files.move(staged.toPath(), cacheFile.toPath(), StandardCopyOption.REPLACE_EXISTING)
        }
        return cacheFile
    } finally {
        staged.delete()
    }
}
