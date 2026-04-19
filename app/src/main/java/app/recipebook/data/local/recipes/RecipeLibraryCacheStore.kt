package app.recipebook.data.local.recipes

import android.content.Context
import java.io.File
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecipeLibraryCacheStore(context: Context) {
    private val appContext = context.applicationContext
    private val cacheFile = File(appContext.filesDir, "library-cache/recipebook-library.zip")

    suspend fun writeSnapshot(sourceFile: File): File = withContext(Dispatchers.IO) {
        cacheFile.parentFile?.mkdirs()
        sourceFile.inputStream().use { input ->
            cacheFile.outputStream().use { output ->
                input.copyTo(output)
            }
        }
        cacheFile
    }

    fun snapshotFileOrNull(): File? = cacheFile.takeIf(File::exists)
}
