package app.recipebook

import androidx.activity.ComponentActivity
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import app.recipebook.data.local.recipes.IngredientSubstitutionCatalog
import app.recipebook.domain.model.*
import app.recipebook.ui.recipes.RecipeDetailScreen
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class CountIngredientInteractionTest {
    @get:Rule val compose = createAndroidComposeRule<ComponentActivity>()

    @Test fun countGrammarLanguageFlipsConversionsAndSubstitutionKeepEvidence() {
        val white = IngredientLine(id = "white", ingredientRefId = "white", originalText = "2 large egg whites, lightly beaten", quantity = 2.0,
            unit = "large egg white", ingredientName = "egg white", preparation = LocalizedValue(fr = "légèrement battu", en = "lightly beaten"))
        val beans = IngredientLine(id = "beans", ingredientRefId = "beans", originalText = "2 cans chickpeas, drained", quantity = 2.0,
            unit = "can", ingredientName = "chickpeas", preparation = LocalizedValue(fr = "égouttés", en = "drained"))
        val refs = listOf(
            IngredientReference("white", "blanc d'œuf", "egg white", unitMappings = listOf(IngredientUnitMapping("large egg white", "g", 30.0)), updatedAt = "2026-10-05T00:00:00Z"),
            IngredientReference("beans", "pois chiches", "chickpeas", updatedAt = "2026-10-05T00:00:00Z")
        )
        val recipe = mutableStateOf(Recipe(id = "fixture", createdAt = "2026-10-05T00:00:00Z", updatedAt = "2026-10-05T00:00:00Z",
            languages = BilingualText(fr = LocalizedSystemText("Fixture", "", "", ""), en = LocalizedSystemText("Fixture", "", "", "")),
            ingredients = listOf(white, white.copy(id = "mass", unit = "g", quantity = 60.0), white.copy(id = "volume", unit = "cup", quantity = 2.0), beans)))
        val language = mutableStateOf(AppLanguage.EN)
        val catalog = IngredientSubstitutionCatalog(
            ingredientForms = listOf(
                IngredientForm("canned", "beans", "canned", "pois chiches en conserve", "canned chickpeas", matchTermsEn = listOf("can", "drained"), updatedAt = "2026-10-05T00:00:00Z"),
                IngredientForm("dried", "beans", "dried", "pois chiches secs", "dried chickpeas", matchTermsEn = listOf("dried"), updatedAt = "2026-10-05T00:00:00Z")),
            substitutionRules = listOf(SubstitutionRule("can-to-dried", "canned", "dried", SubstitutionConversionType.RATIO, ratio = 155.0,
                sourceUnitScope = UnitScope.PACKAGE, targetUnitScope = UnitScope.MASS, confidence = SubstitutionConfidence.APPROXIMATE,
                riskLevel = SubstitutionRiskLevel.CAUTION, roundingPolicy = "nearest_5g", updatedAt = "2026-10-05T00:00:00Z")))
        compose.setContent {
            RecipeDetailScreen(recipe.value, listOf(recipe.value), refs, emptyList(), language.value,
                onLanguageChange = { language.value = it }, onBack = {}, onNavigate = {}, onEdit = {}, onOpenLinkedRecipe = {}, substitutionCatalog = catalog)
        }
        compose.onNodeWithText("2 large egg whites, lightly beaten").performScrollTo().assertExists()
        compose.onNodeWithText("60 g egg white, lightly beaten").assertExists()
        compose.onNodeWithText("2 cups egg white, lightly beaten").assertExists()
        compose.onNodeWithTag("ingredient-row-white").performSemanticsAction(SemanticsActions.OnLongClick)
        compose.onNodeWithTag("ingredient-convert-g").performClick()
        compose.onNodeWithTag("ingredient-row-white").assert(hasText("60 g egg white, lightly beaten"))
        compose.onNodeWithContentDescription("Menu").performClick()
        compose.onNodeWithText("Français").performClick()
        compose.onNodeWithTag("ingredient-row-white").assert(hasText("60 g blanc d'œuf, légèrement battu"))
        compose.onNodeWithTag("ingredient-substitute-beans").performScrollTo().performClick()
        compose.onNodeWithTag("ingredient-substitution-option-can-to-dried").assert(hasText("310 g pois chiches secs", substring = true))
        compose.onNodeWithText("Fermer").performClick()
        // Recreate the screen with a scaled count fixture; serving-scaling controls are not implemented yet.
        compose.runOnIdle { recipe.value = recipe.value.copy(id = "scaled", ingredients = listOf(white.copy(id = "scaled-white", quantity = 1.0))) }
        compose.onNodeWithText("1 blanc de gros œuf, légèrement battu").performScrollTo().assertExists()
        compose.onNodeWithContentDescription("Menu").performClick()
        compose.onNodeWithText("Anglais").performClick()
        compose.onNodeWithText("1 large egg white, lightly beaten").assertExists()
        compose.runOnIdle {
            assertEquals(2.0, requireNotNull(white.quantity), 0.000001)
            assertEquals("large egg white", white.unit)
            assertEquals("légèrement battu", white.preparation.fr)
        }
    }
}
