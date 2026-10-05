package app.recipebook.data.local.recipes

import org.junit.Assert.assertEquals
import org.junit.Test

class RecipeStoragePathsTest {
    @Test
    fun rejectsIdentifiersThatEscapeTheirRecipeDirectory() {
        listOf("../outside", "/absolute", "a\\b", ".", "..", "", "a\u0000b").forEach { value ->
            try {
                requireValidStorageId(value)
                error("Expected rejection")
            } catch (_: IllegalArgumentException) {
                // Unsafe archive identifiers must fail before any directory is created.
            }
        }
        requireValidStorageId("recipe-1")
        requireValidStorageId("d3022099-c736-48ab-99bb-b8002dc77e34")
        assertEquals("jpg", safeStorageExtension("png/../other", "jpg"))
        assertEquals("png", safeStorageExtension("png", "jpg"))
    }

    @Test(expected = kotlinx.coroutines.CancellationException::class)
    fun backupRecoveryPropagatesCancellation() {
        runCatchingRecipeWork { error("Drive unavailable") }.recoverCatchingRecipeWork {
            throw kotlinx.coroutines.CancellationException("canceled")
        }
    }
}
