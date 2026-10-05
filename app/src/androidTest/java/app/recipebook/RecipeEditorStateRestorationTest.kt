package app.recipebook

import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.StateRestorationTester
import app.recipebook.data.local.recipes.PendingRecipePhotoCapture
import app.recipebook.domain.model.PhotoRef
import app.recipebook.ui.recipes.*
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class RecipeEditorStateRestorationTest {
    @get:Rule val compose = createAndroidComposeRule<ComponentActivity>()

    @Test fun editedListsAndPendingCameraCaptureSurviveSavedStateRestoration() {
        val restoration = StateRestorationTester(compose)
        lateinit var rows: SnapshotStateList<EditableIngredientRow>
        lateinit var photos: SnapshotStateList<PhotoRef>
        lateinit var links: SnapshotStateList<EditableRecipeLinkRow>
        lateinit var tags: SnapshotStateList<String>
        var restoredCapture: PendingRecipePhotoCapture? = null
        val capture = PendingRecipePhotoCapture("camera", "/cache/camera.jpg", Uri.parse("content://photo/camera"))
        restoration.setContent {
            val savedRows = rememberSaveable(saver = ingredientRowsSaver()) { mutableStateListOf(EditableIngredientRow("initial")) }
            val savedPhotos = rememberSaveable(saver = photoRowsSaver()) { mutableStateListOf<PhotoRef>() }
            val savedLinks = rememberSaveable(saver = recipeLinkRowsSaver()) { mutableStateListOf<EditableRecipeLinkRow>() }
            val savedTags = rememberSaveable(saver = selectedIdsSaver()) { mutableStateListOf<String>() }
            var pending by rememberSaveable(stateSaver = pendingCameraCaptureSaver()) { mutableStateOf<PendingRecipePhotoCapture?>(capture) }
            SideEffect { rows = savedRows; photos = savedPhotos; links = savedLinks; tags = savedTags; restoredCapture = pending }
        }
        compose.runOnIdle {
            rows[0] = rows[0].copy(quantity = "1 1/2", optional = true, group = "Sauce")
            photos.add(PhotoRef("draft-photo", "/cache/draft-photo.jpg"))
            links.add(EditableRecipeLinkRow("link", targetRecipeId = "target", labelFr = "Sauce", labelEn = "Sauce"))
            tags.add("tag-family")
        }
        restoration.emulateSavedInstanceStateRestore()
        compose.runOnIdle {
            assertEquals("1 1/2", rows.single().quantity)
            assertTrue(rows.single().optional)
            assertEquals("Sauce", rows.single().group)
            assertEquals("/cache/draft-photo.jpg", photos.single().localPath)
            assertEquals("target", links.single().targetRecipeId)
            assertEquals(listOf("tag-family"), tags.toList())
            assertEquals(capture, restoredCapture)
        }
    }
}
