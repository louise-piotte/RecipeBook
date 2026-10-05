package app.recipebook.data.local.recipes

import java.io.IOException
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test

class RecipeBackupResultTest {
    @Test fun cancellationIsNotReportedAsBackupFailure() = runBlocking {
        var warned = false
        try {
            runRecipeBackupAfterMutation(refresh = { throw CancellationException("cancel") }, onFailure = { warned = true })
            fail("Expected cancellation")
        } catch (_: CancellationException) { }
        assertFalse(warned)
    }
}
