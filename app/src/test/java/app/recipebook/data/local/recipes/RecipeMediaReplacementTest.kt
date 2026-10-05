package app.recipebook.data.local.recipes

import java.io.File
import java.io.IOException
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class RecipeMediaReplacementTest {
    @get:Rule val temp = TemporaryFolder()

    private fun directory(name: String, content: String): File = temp.newFolder(name).apply { File(this, "file").writeText(content) }

    @Test fun secondMediaInstallFailureRestoresBothPreviousDirectories() {
        val photos = directory("photos", "old photo")
        val attachments = directory("attachments", "old attachment")
        val stagedPhotos = directory("staged-photos", "new photo")
        val stagedAttachments = directory("staged-attachments", "new attachment")
        val replacement = RecipeMediaReplacement(listOf(stagedPhotos, stagedAttachments), listOf(photos, attachments), File(temp.root, "backup")) { source, target ->
            if (source == stagedAttachments) throw IOException("disk failure")
            check(source.renameTo(target))
        }
        try { replacement.install(); fail("Expected failed installation") } catch (_: IOException) { }
        assertEquals("old photo", File(photos, "file").readText())
        assertEquals("old attachment", File(attachments, "file").readText())
    }

    @Test fun databaseCommitFailureCanRollBackInstalledMedia() {
        val photos = directory("photos", "old photo")
        val staged = directory("staged", "new photo")
        val replacement = RecipeMediaReplacement(listOf(staged), listOf(photos), File(temp.root, "backup"))
        replacement.install()
        assertEquals("new photo", File(photos, "file").readText())
        replacement.rollback()
        assertEquals("old photo", File(photos, "file").readText())
    }

    @Test fun completedReplacementDoesNotRollBackAfterCancellationOrCleanup() {
        val photos = directory("photos", "old photo")
        val staged = directory("staged", "new photo")
        val replacement = RecipeMediaReplacement(listOf(staged), listOf(photos), File(temp.root, "backup"))
        replacement.install(); replacement.complete(); replacement.rollback()
        assertEquals("new photo", File(photos, "file").readText())
    }
}
