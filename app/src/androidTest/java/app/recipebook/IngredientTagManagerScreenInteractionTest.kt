package app.recipebook

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import app.recipebook.data.local.recipes.IngredientSubstitutionDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.ui.recipes.IngredientTagManagerScreen
import app.recipebook.ui.recipes.LibraryManagerSection
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test

class IngredientTagManagerScreenInteractionTest {

    @get:Rule
    val composeRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun addSubstitutionFromIngredientDetail_savesIngredientOwnedRule() {
        val butter = IngredientReference(
            id = "ingredient-ref-butter",
            nameFr = "Beurre non sal\u00e9",
            nameEn = "Unsalted butter",
            updatedAt = "2026-04-10T00:00:00Z"
        )
        val saltedButter = IngredientReference(
            id = "ingredient-ref-salted-butter",
            nameFr = "Beurre sal\u00e9",
            nameEn = "Salted butter",
            updatedAt = "2026-04-10T00:00:00Z"
        )
        val sauceTag = Tag(
            id = "tag-sauce",
            nameFr = "Sauce",
            nameEn = "Sauce",
            slug = "sauce",
            category = TagCategory.DISH_TYPE
        )
        var savedDraft: IngredientSubstitutionDraft? = null

        composeRule.setContent {
            IngredientTagManagerScreen(
                ingredientReferences = listOf(butter, saltedButter),
                ingredientSubstitutions = emptyList(),
                tags = listOf(sauceTag),
                language = AppLanguage.EN,
                onLanguageChange = {},
                initialSection = LibraryManagerSection.Ingredients,
                onNavigateToLibrary = {},
                onNavigateToCollections = {},
                onNavigateToSettings = {},
                onCreateIngredient = {},
                onUpdateIngredient = { _, _ -> },
                onCreateIngredientSubstitution = { savedDraft = it },
                onUpdateIngredientSubstitution = { _, _ -> },
                onDeleteIngredientSubstitution = {},
                onCreateTag = {},
                onUpdateTag = { _, _ -> }
            )
        }

        composeRule.onNodeWithText("Unsalted butter").performClick()
        composeRule.onNodeWithText("Add substitution").performClick()
        composeRule.onNodeWithTag("ingredient-substitution-target-ingredient-ref-salted-butter").performClick()
        composeRule.onNodeWithText("Ratio").performTextInput("1")
        composeRule.onNodeWithText("Save").performClick()

        composeRule.runOnIdle {
            assertNotNull(savedDraft)
            assertEquals("ingredient-ref-butter", savedDraft?.fromIngredientRefId)
            assertEquals("ingredient-ref-salted-butter", savedDraft?.toIngredientRefId)
            assertEquals(1.0, savedDraft?.ratio)
        }
    }
}
