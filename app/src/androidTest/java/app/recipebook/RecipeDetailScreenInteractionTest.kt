package app.recipebook

import androidx.activity.ComponentActivity
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.longClick
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.ui.recipes.RecipeDetailScreen
import org.junit.Rule
import org.junit.Test

class RecipeDetailScreenInteractionTest {

    @get:Rule
    val composeRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun ingredientTapTogglesDoneAndLongPressOpensConversionDialog() {
        val recipe = Recipe(
            id = "recipe-1",
            createdAt = "2026-03-21T00:00:00Z",
            updatedAt = "2026-03-21T00:00:00Z",
            languages = BilingualText(
                fr = LocalizedSystemText("Sucre", "", "", ""),
                en = LocalizedSystemText("Sugar", "", "", "")
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "ingredient-1",
                    ingredientRefId = "ingredient-ref-sugar",
                    originalText = "1 cup sugar",
                    quantity = 1.0,
                    unit = "cup",
                    ingredientName = "sugar"
                )
            )
        )
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-sugar",
            nameFr = "sucre",
            nameEn = "sugar",
            unitMappings = listOf(IngredientUnitMapping(fromUnit = "cup", toUnit = "g", factor = 200.0)),
            updatedAt = "2026-03-21T00:00:00Z"
        )

        composeRule.setContent {
            RecipeDetailScreen(
                recipe = recipe,
                ingredientReferences = listOf(ingredientReference),
                tags = emptyList(),
                language = AppLanguage.EN,
                onLanguageChange = {},
                onBack = {},
                onNavigate = {},
                onEdit = {}
            )
        }

        composeRule.onNodeWithTag("ingredient-row-ingredient-1")
            .assert(hasStateDescription("Pending"))
            .performClick()

        composeRule.onNodeWithTag("ingredient-row-ingredient-1")
            .assert(hasStateDescription("Done"))
            .performTouchInput { longClick() }

        composeRule.onNodeWithText("Convert sugar").assert(hasText("Convert sugar"))
        composeRule.onNodeWithTag("ingredient-convert-g").performClick()
        composeRule.onNodeWithText("200 g sugar").assert(hasText("200 g sugar"))
    }

    private fun hasStateDescription(expected: String): SemanticsMatcher =
        SemanticsMatcher.expectValue(SemanticsProperties.StateDescription, expected)
}
