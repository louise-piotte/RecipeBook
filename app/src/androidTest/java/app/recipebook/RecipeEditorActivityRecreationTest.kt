package app.recipebook

import android.content.Intent
import android.graphics.Bitmap
import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.lifecycle.Lifecycle
import app.recipebook.data.local.recipes.RecipePhotoStore
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.*
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Assume.assumeTrue
import org.junit.Rule
import org.junit.Test
import java.io.File
import java.util.UUID

class RecipeEditorActivityRecreationTest {
    @get:Rule val compose = createEmptyComposeRule()

    @Test fun actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation() = runBlocking {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        // This test saves/deletes a fixture through the real activity; never run it on the user's app.
        assumeTrue("Requires the isolated QA application", context.packageName == "app.recipebook.qa")
        val repository = RecipeRepositoryProvider.createServices(context).repository
        val languageStore = AppLanguageStore(context)
        languageStore.setLanguage(AppLanguage.EN)
        repository.seedBundledLibraryIfMissing()
        val id = "qa-recreation-${UUID.randomUUID()}"
        val photoId = "qa-photo-${UUID.randomUUID()}"
        val draft = File(context.cacheDir, "recipe-photo-drafts/$photoId.png").apply { parentFile?.mkdirs() }
        val bitmap = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888).apply { eraseColor(android.graphics.Color.BLUE) }
        draft.outputStream().use { bitmap.compress(Bitmap.CompressFormat.PNG, 100, it) }; bitmap.recycle()
        val ingredient = IngredientLine(id = "$id-line", originalText = "1,5 tasses sugar", quantity = 1.5,
            unit = "tasses", ingredientName = "sugar", preparation = LocalizedValue("haché", "chopped"),
            notes = LocalizedValue("note française", "English note"), optional = true, group = "Sauce",
            substitutions = listOf(IngredientLineSubstitution("$id-sub", "$id-line", substitutionRuleId = "fixture-rule", createdAt = "now", updatedAt = "now")))
        val recipe = repository.createBlankRecipe().copy(id = id,
            languages = BilingualText(LocalizedSystemText("Brouillon QA", "", "", ""), LocalizedSystemText("QA draft", "", "", "")),
            ingredients = listOf(ingredient), photos = listOf(PhotoRef(photoId, draft.absolutePath)), mainPhotoId = photoId)
        repository.upsertRecipe(recipe)
        var scenario: ActivityScenario<RecipeEditorActivity>? = null
        try {
            scenario = ActivityScenario.launch(Intent(context, RecipeEditorActivity::class.java).putExtra(RecipeEditorActivity.EXTRA_RECIPE_ID, id))
            compose.waitUntil(10000) { compose.onAllNodes(hasSetTextAction() and hasText("QA draft")).fetchSemanticsNodes().isNotEmpty() }
            compose.onNode(hasSetTextAction() and hasText("QA draft")).performTextReplacement("QA edited draft")
            compose.onNodeWithContentDescription("Edit ingredients").performClick()
            compose.onNode(hasSetTextAction() and hasText("1.5")).performScrollTo().performTextReplacement("1,5")
            languageStore.setLanguage(AppLanguage.FR)
            compose.waitForIdle()
            compose.onNode(hasSetTextAction() and hasText("1,5")).performTextReplacement("1 1/2")
            scenario.recreate()
            compose.waitUntil(10000) { compose.onAllNodes(hasSetTextAction() and hasText("1 1/2")).fetchSemanticsNodes().isNotEmpty() }
            assertTrue("Draft source must survive recreation", draft.exists())
            languageStore.setLanguage(AppLanguage.EN)
            compose.waitForIdle()
            compose.onNode(hasSetTextAction() and hasText("QA edited draft")).assertExists()
            compose.onNodeWithContentDescription("Save recipe").performClick()
            compose.waitUntil(10000) { scenario.state == Lifecycle.State.DESTROYED }
            val saved = requireNotNull(repository.getRecipeById(id))
            assertEquals("QA edited draft", saved.languages.en.title)
            assertEquals(1.5, requireNotNull(saved.ingredients.single().quantity), 0.000001)
            assertEquals("cup", saved.ingredients.single().unit)
            assertEquals(ingredient.preparation, saved.ingredients.single().preparation)
            assertEquals(ingredient.notes, saved.ingredients.single().notes)
            assertTrue(saved.ingredients.single().optional)
            assertEquals(ingredient.group, saved.ingredients.single().group)
            assertEquals(ingredient.substitutions, saved.ingredients.single().substitutions)
            assertEquals(photoId, saved.mainPhotoId)
            assertTrue(File(saved.photos.single().localPath).exists())
            assertFalse("Successful save releases draft source", draft.exists())
        } finally {
            scenario?.close()
            repository.getRecipeById(id)?.photos?.let { RecipePhotoStore(context).deleteManagedPhotos(it) }
            repository.deleteRecipeById(id)
            draft.delete()
        }
    }
}
