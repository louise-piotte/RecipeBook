package app.recipebook.ui.recipes

import app.recipebook.domain.model.PhotoRef
import org.junit.Assert.assertEquals
import org.junit.Test

class RecipePhotoLifecycleTest {

    @Test
    fun photosToDeleteForRecipeDeletion_keepsRemovedPersistedPhotos() {
        val originalPhotos = listOf(
            PhotoRef(id = "persisted-1", localPath = "C:/recipe-photos/recipe-1/persisted-1.jpg"),
            PhotoRef(id = "persisted-2", localPath = "C:/recipe-photos/recipe-1/persisted-2.jpg")
        )
        val currentPhotos = listOf(
            PhotoRef(id = "persisted-2", localPath = "C:/recipe-photos/recipe-1/persisted-2.jpg"),
            PhotoRef(id = "draft-1", localPath = "C:/recipe-photo-drafts/draft-1.jpg")
        )

        val photosToDelete = photosToDeleteForRecipeDeletion(originalPhotos, currentPhotos)

        assertEquals(listOf("persisted-1", "persisted-2", "draft-1"), photosToDelete.map(PhotoRef::id))
    }
}