package app.recipebook

import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import app.recipebook.data.local.recipes.BundledRecipeLibraryLoader
import app.recipebook.data.local.recipes.ImportWarning
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.PendingRecipePhotoCapture
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.Tag
import app.recipebook.ui.recipes.RecipeEditorScreen
import app.recipebook.ui.theme.RecipeBookTheme
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test

class BundledFlourIngredientPickerTest {
    @get:Rule
    val composeRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun bundledGreenLentilFlourSearchSelectsFrenchIdentityFromEnglishQuery() {
        assertBundledIngredientSelection(
            initialText = "green lentil flour",
            searchQuery = "green lentil flour",
            displayName = "farine de lentilles vertes",
            expectedRefId = "ingredient-ref-green-lentil-flour",
        )
    }

    @Test
    fun bundledFavaBeanFlourSearchSelectsQuebecGourganeIdentityFromEnglishQuery() {
        assertBundledIngredientSelection(
            initialText = "fava bean flour",
            searchQuery = "fava bean flour",
            displayName = "farine de gourgane",
            expectedRefId = "ingredient-ref-fava-bean-flour",
        )
    }

    @Test
    fun bundledJumboLumpCrabMeatSearchSelectsGenericIdentityAndGradeForm() {
        assertBundledIngredientSelection(
            initialText = "1 lb jumbo lump crab meat",
            searchQuery = "jumbo lump crab meat",
            displayName = "chair de crabe en gros morceaux (jumbo lump)",
            expectedRefId = "ingredient-ref-crab",
            expectedFormId = "ingredient-form-crab-jumbo-lump",
        )
    }

    @Test
    fun bundledEggNoodlesSearchSelectsQuebecFrenchDisplayFromEnglishQuery() {
        assertBundledIngredientSelection(
            initialText = "egg noodles",
            searchQuery = "egg noodles",
            displayName = "nouilles aux œufs",
            expectedRefId = "ingredient-ref-egg-noodles",
        )
    }

    @Test
    fun bundledEggNoodlesSearchFoldsTheStatutoryPlainOeSpelling() {
        assertBundledIngredientSelection(
            initialText = "nouilles aux oeufs",
            searchQuery = "nouilles aux oeufs",
            displayName = "nouilles aux œufs",
            expectedRefId = "ingredient-ref-egg-noodles",
        )
    }

    @Test
    fun bundledMolePasteSearchSelectsProvisionalFrenchDisplayFromEnglishQuery() {
        assertBundledIngredientSelection(
            initialText = "mole paste",
            searchQuery = "mole paste",
            displayName = "mole en pâte",
            expectedRefId = "ingredient-ref-mole-paste",
        )
    }

    @Test
    fun bundledCoconutButterSearchSelectsProvisionalQuebecFrenchDisplay() {
        assertBundledIngredientSelection(
            initialText = "coconut butter",
            searchQuery = "coconut butter",
            displayName = "beurre de noix de coco",
            expectedRefId = "ingredient-ref-coconut-butter",
        )
    }

    @Test
    fun bundledCoconutButterFrenchSearchSelectsTheSameIdentity() {
        assertBundledIngredientSelection(
            initialText = "beurre de noix de coco",
            searchQuery = "beurre de noix de coco",
            displayName = "beurre de noix de coco",
            expectedRefId = "ingredient-ref-coconut-butter",
        )
    }

    @Test
    fun bundledWholeHempSeedsSearchSelectsSeparateIdentityFromEnglishQuery() {
        assertBundledIngredientSelection(
            initialText = "whole hemp seeds",
            searchQuery = "whole hemp seeds",
            displayName = "graines de chanvre entières",
            expectedRefId = "ingredient-ref-whole-hemp-seeds",
        )
    }

    @Test
    fun bundledChiaSingularEnglishAliasSelectsExistingFrenchDisplay() {
        assertBundledIngredientSelection(
            initialText = "chia seed",
            searchQuery = "chia seed",
            displayName = "graines de chia",
            expectedRefId = "ingredient-ref-chia-seeds",
        )
    }

    @Test
    fun bundledChiaSingularFrenchAliasSelectsTheSameIdentity() {
        assertBundledIngredientSelection(
            initialText = "graine de chia",
            searchQuery = "graine de chia",
            displayName = "graines de chia",
            expectedRefId = "ingredient-ref-chia-seeds",
        )
    }

    @Test
    fun bundledOrangeFootedSeaCucumberEnglishFormQuerySelectsTheSpeciesSpecificForm() {
        assertBundledIngredientSelection(
            initialText = "dried gutted body wall of Cucumaria frondosa",
            searchQuery = "dried gutted body wall of Cucumaria frondosa",
            displayName = "holothurie touffue",
            expectedRefId = "ingredient-ref-orange-footed-sea-cucumber",
            expectedFormId = "ingredient-form-orange-footed-sea-cucumber-dried-gutted-body-wall",
        )
    }

    @Test
    fun bundledOrangeFootedSeaCucumberFrenchFormQuerySelectsTheSpeciesSpecificForm() {
        assertBundledIngredientSelection(
            initialText = "paroi corporelle séchée d’holothurie touffue",
            searchQuery = "paroi corporelle séchée d’holothurie touffue",
            displayName = "holothurie touffue",
            expectedRefId = "ingredient-ref-orange-footed-sea-cucumber",
            expectedFormId = "ingredient-form-orange-footed-sea-cucumber-dried-gutted-body-wall",
        )
    }

    @Test
    fun bundledScotchBonnetPepperSauceEnglishSearchSelectsTheCondimentIdentity() {
        assertBundledIngredientSelection(
            initialText = "Scotch Bonnet pepper sauce",
            searchQuery = "Scotch Bonnet pepper sauce",
            displayName = "sauce au piment fort Scotch Bonnet",
            expectedRefId = "ingredient-ref-scotch-bonnet-pepper-sauce",
        )
    }

    @Test
    fun bundledScotchBonnetPepperSauceFrenchSearchSelectsTheSameIdentity() {
        assertBundledIngredientSelection(
            initialText = "sauce au piment fort Scotch Bonnet",
            searchQuery = "sauce au piment fort Scotch Bonnet",
            displayName = "sauce au piment fort Scotch Bonnet",
            expectedRefId = "ingredient-ref-scotch-bonnet-pepper-sauce",
        )
    }

    @Test
    fun bundledEggPastaEnglishSearchSelectsCompositionIdentity() {
        assertBundledIngredientSelection(
            initialText = "egg pasta",
            searchQuery = "egg pasta",
            displayName = "pâtes aux œufs",
            expectedRefId = "ingredient-ref-egg-pasta",
        )
    }

    @Test
    fun bundledEggPastaFrenchSearchSelectsTheSameCompositionIdentity() {
        assertBundledIngredientSelection(
            initialText = "pâtes alimentaires aux oeufs",
            searchQuery = "pâtes alimentaires aux oeufs",
            displayName = "pâtes aux œufs",
            expectedRefId = "ingredient-ref-egg-pasta",
        )
    }

    @Test
    fun bundledWholeWheatPastaEnglishSearchSelectsCompositionIdentity() {
        assertBundledIngredientSelection(
            initialText = "whole wheat pasta",
            searchQuery = "whole wheat pasta",
            displayName = "pâtes de blé entier",
            expectedRefId = "ingredient-ref-whole-wheat-pasta",
        )
    }

    @Test
    fun bundledWholeWheatPastaFrenchSearchSelectsTheSameCompositionIdentity() {
        assertBundledIngredientSelection(
            initialText = "pâtes alimentaires de blé entier",
            searchQuery = "pâtes alimentaires de blé entier",
            displayName = "pâtes de blé entier",
            expectedRefId = "ingredient-ref-whole-wheat-pasta",
        )
    }

    @Test
    fun bundledGlutenFreePastaEnglishSearchSelectsTheMarketClaimIdentity() {
        assertBundledIngredientSelection(
            initialText = "gluten free pasta",
            searchQuery = "gluten free pasta",
            displayName = "pâtes sans gluten",
            expectedRefId = "ingredient-ref-gluten-free-pasta",
        )
    }

    @Test
    fun bundledGlutenFreePastaFrenchSearchSelectsTheSameIdentity() {
        assertBundledIngredientSelection(
            initialText = "pâtes sans gluten",
            searchQuery = "pâtes sans gluten",
            displayName = "pâtes sans gluten",
            expectedRefId = "ingredient-ref-gluten-free-pasta",
        )
    }

    @Test
    fun bundledWholeHempSeedsFrenchRetailAliasSelectsTheSameIdentity() {
        assertBundledIngredientSelection(
            initialText = "graines de chanvre rôties entières",
            searchQuery = "graines de chanvre rôties entières",
            displayName = "graines de chanvre entières",
            expectedRefId = "ingredient-ref-whole-hemp-seeds",
        )
    }

    @Test
    fun genericHempSeedsSearchShowsWholeSeedsAndHulledHeartsSeparately() {
        assertBundledIngredientSelection(
            initialText = "hemp seeds",
            searchQuery = "hemp seeds",
            displayName = "graines de chanvre entières",
            expectedRefId = "ingredient-ref-whole-hemp-seeds",
            expectedAdditionalDisplayNames = listOf("graines de chanvre décortiquées"),
        )
    }

    @Test
    fun bundledMexicanAdoboSauceSearchSelectsProvisionalQuebecFrenchDisplay() {
        assertBundledIngredientSelection(
            initialText = "Mexican adobo sauce",
            searchQuery = "Mexican adobo sauce",
            displayName = "sauce adobo mexicaine",
            expectedRefId = "ingredient-ref-mexican-adobo-sauce",
        )
    }

    @Test
    fun bundledMexicanAdoboSauceFrenchSearchSelectsTheSameIdentity() {
        assertBundledIngredientSelection(
            initialText = "sauce adobo mexicaine",
            searchQuery = "sauce adobo mexicaine",
            displayName = "sauce adobo mexicaine",
            expectedRefId = "ingredient-ref-mexican-adobo-sauce",
        )
    }

    @Test
    fun bundledToastedCoconutFlakesSearchSelectsCoconutAndPersistsFormHint() {
        assertBundledIngredientSelection(
            initialText = "1 cup toasted coconut flakes",
            searchQuery = "toasted coconut flakes",
            displayName = "noix de coco",
            expectedRefId = "ingredient-ref-coconut",
            expectedFormId = "ingredient-form-coconut-toasted-flakes",
        )
    }

    private fun assertBundledIngredientSelection(
        initialText: String,
        searchQuery: String,
        displayName: String,
        expectedRefId: String,
        expectedFormId: String? = null,
        expectedAdditionalDisplayNames: List<String> = emptyList(),
    ) {
        val context = composeRule.activity
        val seed = BundledRecipeLibraryLoader.loadLibrary(context)
        val recipe = Recipe(
            id = "recipe-${expectedRefId.removePrefix("ingredient-ref-")}-picker",
            createdAt = "2026-10-11",
            updatedAt = "2026-10-11",
            languages = BilingualText(
                fr = LocalizedSystemText("Test", "", "", ""),
                en = LocalizedSystemText("Test", "", "", ""),
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "line-${expectedRefId.removePrefix("ingredient-ref-")}-picker",
                    originalText = initialText,
                    quantity = null,
                    unit = "",
                    ingredientName = initialText,
                ),
            ),
        )
        var savedRecipe: Recipe? = null

        composeRule.setContent {
            RecipeBookTheme {
                RecipeEditorScreen(
                    initialRecipe = recipe,
                    isNewRecipe = false,
                    recipes = listOf(recipe),
                    ingredientReferences = seed.ingredientReferences,
                    ingredientForms = seed.ingredientForms,
                    tags = emptyList(),
                    collections = emptyList<Collection>(),
                    importWarnings = emptyList<ImportWarning>(),
                    language = AppLanguage.FR,
                    onLanguageChange = {},
                    onBack = {},
                    onSave = { updated, _ -> savedRecipe = updated },
                    onRegenerateOtherLanguage = { current, _ -> current },
                    onLocalizedTextEdited = { metadata, _, _ -> metadata ?: ImportMetadata() },
                    onCreateIngredientReference = { draft: IngredientReferenceDraft ->
                        IngredientReference(
                            id = "unused-created-reference",
                            nameFr = draft.nameFr,
                            nameEn = draft.nameEn,
                            category = draft.category,
                            updatedAt = "2026-10-11",
                        )
                    },
                    onCreateTag = { draft: TagDraft ->
                        Tag("unused-created-tag", draft.nameFr, draft.nameEn, "unused")
                    },
                    onImportPhoto = { error("Photo import is unused in this test") },
                    onCreatePendingCameraCapture = {
                        PendingRecipePhotoCapture("unused", "unused", Uri.EMPTY)
                    },
                    onFinalizePendingCameraCapture = { _: PendingRecipePhotoCapture -> null },
                    onDiscardDraftPhoto = {},
                    onDraftPhotosChange = { _, _ -> },
                    onDelete = null,
                )
            }
        }

        composeRule.onNodeWithContentDescription("Modifier les ingrédients").performClick()
        composeRule.onNodeWithContentDescription("Choisir l'ingrédient").performClick()
        composeRule.onNodeWithText("Rechercher des ingrédients").performTextInput(searchQuery)
        expectedAdditionalDisplayNames.forEach { additionalDisplayName ->
            composeRule.onNodeWithText(additionalDisplayName).assertExists()
        }
        composeRule.onNode(
            hasText(displayName, substring = false) and
                SemanticsMatcher.expectValue(SemanticsProperties.Role, Role.Button),
        ).performClick()
        composeRule.onNodeWithContentDescription("Enregistrer la recette").performClick()

        val savedIngredient = requireNotNull(savedRecipe).ingredients.single()
        assertEquals(expectedRefId, savedIngredient.ingredientRefId)
        assertEquals(expectedFormId, savedIngredient.ingredientFormId)
        assertEquals(initialText, savedIngredient.originalText)
        assertNotNull(savedRecipe)
    }
}
