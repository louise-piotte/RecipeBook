package app.recipebook

import android.content.Intent
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.*
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import java.util.UUID

class CountIngredientPersistenceTest {
    @get:Rule val compose = createEmptyComposeRule()
    @Test fun countEditSaveReopenPreservesSizeNotesAndSharedQuantitiesAcrossLanguages() = runBlocking {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val repository = RecipeRepositoryProvider.create(context)
        val store = AppLanguageStore(context)
        val previousLanguage = store.language.first()
        val id = "qa-count-${UUID.randomUUID()}"
        val original = IngredientLine("qa-white", "ingredient-ref-egg-white", "2 large egg whites (60 g), lightly beaten", 2.0,
            "large egg white", "egg white", LocalizedValue(fr = "légèrement battu", en = "lightly beaten"),
            notes = LocalizedValue(fr = "pour la pâte", en = "for the dough"))
        val fixture = Recipe(id = id, createdAt = "2026-10-05T00:00:00Z", updatedAt = "2026-10-05T00:00:00Z",
            languages = BilingualText(fr = LocalizedSystemText("QA compte", "", "", ""), en = LocalizedSystemText("QA count", "", "", "")), ingredients = listOf(original))
        var scenario: ActivityScenario<RecipeEditorActivity>? = null
        try {
            repository.seedBundledLibraryIfMissing();repository.upsertRecipe(fixture);store.setLanguage(AppLanguage.EN)
            val intent = Intent(context, RecipeEditorActivity::class.java).putExtra(RecipeEditorActivity.EXTRA_RECIPE_ID, id)
            scenario = ActivityScenario.launch(intent)
            compose.waitUntil(10000) { compose.onAllNodesWithContentDescription("Edit ingredients").fetchSemanticsNodes().isNotEmpty() }
            compose.onNodeWithContentDescription("Edit ingredients").performClick()
            compose.onNode(hasSetTextAction() and hasText("2")).performScrollTo().performTextReplacement("4")
            store.setLanguage(AppLanguage.FR);compose.waitForIdle()
            compose.onNodeWithContentDescription("Enregistrer la recette").performClick()
            compose.waitUntil(10000) { scenario?.state == Lifecycle.State.DESTROYED }
            val saved = requireNotNull(repository.getRecipeById(id)).ingredients.single()
            assertEquals(original.copy(quantity = 4.0), saved)
            scenario.close();scenario = ActivityScenario.launch(intent)
            compose.waitUntil(10000) { compose.onAllNodesWithContentDescription("Modifier les ingrédients").fetchSemanticsNodes().isNotEmpty() }
            compose.onNodeWithContentDescription("Modifier les ingrédients").performClick()
            compose.onNode(hasSetTextAction() and hasText("4")).performScrollTo().assertExists()
            compose.onNode(hasSetTextAction() and hasText("large egg white")).performScrollTo().assertExists()
            assertEquals(original.copy(quantity = 4.0), requireNotNull(repository.getRecipeById(id)).ingredients.single())
        } finally {
            scenario?.close();repository.deleteRecipeById(id);store.setLanguage(previousLanguage)
        }
    }
}
