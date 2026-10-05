package app.recipebook.data.local.recipes

import java.io.File
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeLibraryCacheStoreTest {
    @Test
    fun failedCopyPreservesLastUsableSnapshot() {
        val directory = Files.createTempDirectory("recipe-cache-test").toFile()
        try {
            val cache = File(directory, "library.zip").apply { writeText("previous complete archive") }
            val brokenInput = object : InputStream() {
                var count = 0
                override fun read(): Int = if (count++ < 4) 65 else throw IOException("read failed")
            }
            try {
                writeLibrarySnapshot(brokenInput, cache)
                error("Expected failed copy")
            } catch (_: IOException) {
                assertEquals("previous complete archive", cache.readText())
                assertEquals(listOf("library.zip"), directory.list()?.toList())
            }
            writeLibrarySnapshot("new complete archive".byteInputStream(), cache)
            assertEquals("new complete archive", cache.readText())
        } finally {
            directory.deleteRecursively()
        }
    }
}
