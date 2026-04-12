package app.recipebook

import androidx.activity.ComponentActivity
import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performSemanticsAction
import app.recipebook.data.local.recipes.IngredientSubstitutionCatalog
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.ContextualSubstitutionRule
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLink
import app.recipebook.domain.model.RecipeLinkType
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionConversionType
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.ui.recipes.RecipeDetailScreen
import org.junit.Rule
import org.junit.Test
import org.junit.Assert.assertEquals

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
                recipes = listOf(recipe),
                ingredientReferences = listOf(ingredientReference),
                substitutionCatalog = IngredientSubstitutionCatalog.EMPTY,
                tags = emptyList(),
                language = AppLanguage.EN,
                onLanguageChange = {},
                onBack = {},
                onNavigate = {},
                onEdit = {},
                onOpenLinkedRecipe = {}
            )
        }

        composeRule.onNodeWithTag("ingredient-row-ingredient-1")
            .assert(hasStateDescription("Pending"))
            .performClick()

        composeRule.waitForIdle()

        composeRule.onNodeWithTag("ingredient-row-ingredient-1")
            .assert(hasStateDescription("Done"))
            .performSemanticsAction(SemanticsActions.OnLongClick)

        composeRule.onNodeWithText("Convert sugar").assert(hasText("Convert sugar"))
        composeRule.onNodeWithTag("ingredient-convert-g").performClick()
        composeRule.onNodeWithText("200 g sugar").assert(hasText("200 g sugar"))
    }

    @Test
    fun instructionTapTogglesEmphasisStateBackAndForth() {
        val recipe = Recipe(
            id = "recipe-1",
            createdAt = "2026-03-21T00:00:00Z",
            updatedAt = "2026-03-21T00:00:00Z",
            languages = BilingualText(
                fr = LocalizedSystemText("Crepes", "", "Melanger\nCuire", ""),
                en = LocalizedSystemText("Crepes", "", "Mix\nCook", "")
            ),
            ingredients = emptyList()
        )

        composeRule.setContent {
            RecipeDetailScreen(
                recipe = recipe,
                recipes = listOf(recipe),
                ingredientReferences = emptyList(),
                substitutionCatalog = IngredientSubstitutionCatalog.EMPTY,
                tags = emptyList(),
                language = AppLanguage.EN,
                onLanguageChange = {},
                onBack = {},
                onNavigate = {},
                onEdit = {},
                onOpenLinkedRecipe = {}
            )
        }

        composeRule.onNodeWithTag("instruction-row-0")
            .assert(hasStateDescription("Normal"))
            .performClick()

        composeRule.onNodeWithTag("instruction-row-0")
            .assert(hasStateDescription("Bold"))
            .performClick()

        composeRule.onNodeWithTag("instruction-row-0")
            .assert(hasStateDescription("Normal"))
    }

    @Test
    fun substitutionIconOpensDialogAndShowsWarningText() {
        val recipe = Recipe(
            id = "recipe-1",
            createdAt = "2026-04-21T00:00:00Z",
            updatedAt = "2026-04-21T00:00:00Z",
            languages = BilingualText(
                fr = LocalizedSystemText("Sauce", "", "", ""),
                en = LocalizedSystemText("Sauce", "", "", "")
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "ingredient-1",
                    ingredientRefId = "ingredient-ref-all-purpose-flour",
                    originalText = "2 tbsp flour",
                    quantity = 2.0,
                    unit = "tbsp",
                    ingredientName = "flour"
                )
            ),
            tagIds = listOf("tag-sauce")
        )
        val ingredientReferences = listOf(
            IngredientReference(
                id = "ingredient-ref-all-purpose-flour",
                nameFr = "farine tout usage",
                nameEn = "flour",
                updatedAt = "2026-04-21T00:00:00Z"
            ),
            IngredientReference(
                id = "ingredient-ref-cornstarch",
                nameFr = "f\u00e9cule de ma\u00efs",
                nameEn = "cornstarch",
                updatedAt = "2026-04-21T00:00:00Z"
            )
        )
        val tag = app.recipebook.domain.model.Tag(
            id = "tag-sauce",
            nameFr = "Sauce",
            nameEn = "Sauce",
            slug = "sauce",
            category = app.recipebook.domain.model.TagCategory.DISH_TYPE
        )
        val substitutionCatalog = IngredientSubstitutionCatalog(
            contextualSubstitutionRules = listOf(
                ContextualSubstitutionRule(
                    id = "rule-flour-cornstarch",
                    fromIngredientRefId = "ingredient-ref-all-purpose-flour",
                    toIngredientRefId = "ingredient-ref-cornstarch",
                    conversionType = SubstitutionConversionType.RATIO,
                    ratio = 0.5,
                    allowedDishTypes = listOf("sauce"),
                    confidence = SubstitutionConfidence.TESTED,
                    riskLevel = SubstitutionRiskLevel.HIGH_RISK,
                    warningTextFr = "Utiliser seulement pour \u00e9paissir une sauce.",
                    warningTextEn = "Use only to thicken a sauce.",
                    updatedAt = "2026-04-21T00:00:00Z"
                )
            )
        )

        composeRule.setContent {
            RecipeDetailScreen(
                recipe = recipe,
                recipes = listOf(recipe),
                ingredientReferences = ingredientReferences,
                substitutionCatalog = substitutionCatalog,
                tags = listOf(tag),
                language = AppLanguage.EN,
                onLanguageChange = {},
                onBack = {},
                onNavigate = {},
                onEdit = {},
                onOpenLinkedRecipe = {}
            )
        }

        composeRule.onNodeWithTag("ingredient-substitute-ingredient-1").performClick()

        composeRule.onNodeWithText("Substitute flour").assert(hasText("Substitute flour"))
        composeRule.onNodeWithTag("ingredient-substitution-option-rule-flour-cornstarch")
            .assert(hasText("1 tbsp cornstarch"))
        composeRule.onNodeWithText("Warning: Use only to thicken a sauce.")
            .assert(hasText("Warning: Use only to thicken a sauce."))
    }

    @Test
    fun linkedRecipeRowOpensTargetRecipe() {
        val linkedRecipeId = "recipe-sauce"
        val recipe = Recipe(
            id = "recipe-main",
            createdAt = "2026-04-21T00:00:00Z",
            updatedAt = "2026-04-21T00:00:00Z",
            languages = BilingualText(
                fr = LocalizedSystemText("Pates", "", "", ""),
                en = LocalizedSystemText("Pasta", "", "", "")
            ),
            ingredients = emptyList(),
            recipeLinks = listOf(
                RecipeLink(
                    id = "link-1",
                    targetRecipeId = linkedRecipeId,
                    linkType = RecipeLinkType.SAUCE
                )
            )
        )
        val sauceRecipe = Recipe(
            id = linkedRecipeId,
            createdAt = "2026-04-21T00:00:00Z",
            updatedAt = "2026-04-21T00:00:00Z",
            languages = BilingualText(
                fr = LocalizedSystemText("Sauce tomate", "", "", ""),
                en = LocalizedSystemText("Tomato Sauce", "", "", "")
            ),
            ingredients = emptyList()
        )
        var openedRecipeId: String? = null

        composeRule.setContent {
            RecipeDetailScreen(
                recipe = recipe,
                recipes = listOf(recipe, sauceRecipe),
                ingredientReferences = emptyList(),
                substitutionCatalog = IngredientSubstitutionCatalog.EMPTY,
                tags = emptyList(),
                language = AppLanguage.EN,
                onLanguageChange = {},
                onBack = {},
                onNavigate = {},
                onEdit = {},
                onOpenLinkedRecipe = { recipeId -> openedRecipeId = recipeId }
            )
        }

        composeRule.onNodeWithText("Sauce: Tomato Sauce").performClick()

        composeRule.runOnIdle {
            assertEquals(linkedRecipeId, openedRecipeId)
        }
    }

    private fun hasStateDescription(expected: String): SemanticsMatcher =
        SemanticsMatcher.expectValue(SemanticsProperties.StateDescription, expected)
}
