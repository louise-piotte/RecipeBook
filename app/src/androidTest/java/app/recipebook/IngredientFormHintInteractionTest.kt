package app.recipebook

import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import app.recipebook.data.local.recipes.BundledIngredientCatalog
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.ImportWarning
import app.recipebook.data.local.recipes.PendingRecipePhotoCapture
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.Tag
import app.recipebook.ui.recipes.RecipeEditorScreen
import app.recipebook.ui.theme.RecipeBookTheme
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test

class IngredientFormHintInteractionTest {
    @get:Rule
    val composeRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun chocolateChipsSearchSelectsBaseIngredientAndPersistsFormHint() {
        val reference = IngredientReference(
            id = "ingredient-ref-semisweet-chocolate",
            nameFr = "chocolat mi-sucré",
            nameEn = "semisweet chocolate",
            category = IngredientCategory.CHOCOLATE_AND_CANDY,
            aliasesFr = listOf("pépites de chocolat mi-sucré"),
            aliasesEn = listOf("chocolate chips", "semi-sweet chocolate chips"),
            updatedAt = "2026-10-06"
        )
        val chipsForm = IngredientForm(
            id = "ingredient-form-semisweet-chocolate-chips",
            ingredientRefId = reference.id,
            formCode = "chips",
            labelFr = "pépites de chocolat mi-sucré",
            labelEn = "chocolate chips",
            matchTermsFr = listOf("brisures de chocolat mi-sucré"),
            matchTermsEn = listOf("semi-sweet chocolate chips"),
            updatedAt = "2026-10-06"
        )
        val sourceLine = "1 cup chocolate chips"
        val recipe = Recipe(
            id = "recipe-chocolate-form-hint",
            createdAt = "2026-10-06",
            updatedAt = "2026-10-06",
            languages = BilingualText(
                fr = LocalizedSystemText("Biscuits", "", "", ""),
                en = LocalizedSystemText("Cookies", "", "", "")
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "line-chocolate-chips",
                    originalText = sourceLine,
                    quantity = 1.0,
                    unit = "cup",
                    ingredientName = "chocolate chips"
                )
            )
        )
        var savedRecipe: Recipe? = null

        composeRule.setContent {
            RecipeBookTheme {
                RecipeEditorScreen(
                    initialRecipe = recipe,
                    isNewRecipe = false,
                    recipes = listOf(recipe),
                    ingredientReferences = listOf(reference),
                    ingredientForms = listOf(chipsForm),
                    tags = emptyList(),
                    collections = emptyList<Collection>(),
                    importWarnings = emptyList<ImportWarning>(),
                    language = AppLanguage.EN,
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
                            updatedAt = "2026-10-06"
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
                    onDelete = null
                )
            }
        }

        composeRule.onNodeWithContentDescription("Edit ingredients").performClick()
        composeRule.onNodeWithContentDescription("Select ingredient").performClick()
        composeRule.onNodeWithText("Search ingredients").performTextInput("chocolate chips")

        composeRule.onNodeWithText("semisweet chocolate").assertExists().performClick()
        composeRule.onNodeWithText("chocolate chips").assertExists()
        composeRule.onNodeWithContentDescription("Save recipe").performClick()

        val savedIngredient = requireNotNull(savedRecipe).ingredients.single()
        assertEquals(reference.id, savedIngredient.ingredientRefId)
        assertEquals(chipsForm.id, savedIngredient.ingredientFormId)
        assertEquals(sourceLine, savedIngredient.originalText)
        assertNotNull(savedRecipe)
    }

    @Test
    fun plainGreekYogurtSearchSelectsGreekIdentityAndPersistsPlainFormHint() {
        val reference = IngredientReference(
            id = "ingredient-ref-greek-yogurt",
            nameFr = "yogourt grec",
            nameEn = "Greek-style yogurt",
            category = IngredientCategory.DAIRY_AND_ALTERNATIVE,
            aliasesEn = listOf("Greek yogurt", "Greek yoghurt", "Greek-style yoghurt"),
            updatedAt = "2026-10-10"
        )
        val plainForm = IngredientForm(
            id = "ingredient-form-greek-yogurt-plain",
            ingredientRefId = reference.id,
            formCode = "plain",
            labelFr = "yogourt grec nature",
            labelEn = "plain Greek-style yogurt",
            prepState = "plain",
            matchTermsEn = listOf("plain Greek yogurt"),
            updatedAt = "2026-10-10"
        )
        val sourceLine = "1/2 cup plain Greek yogurt"
        val recipe = Recipe(
            id = "recipe-greek-yogurt-form-hint",
            createdAt = "2026-10-10",
            updatedAt = "2026-10-10",
            languages = BilingualText(
                fr = LocalizedSystemText("Sauce", "", "", ""),
                en = LocalizedSystemText("Sauce", "", "", "")
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "line-greek-yogurt-plain",
                    originalText = sourceLine,
                    quantity = 0.5,
                    unit = "cup",
                    ingredientName = "plain Greek yogurt"
                )
            )
        )
        var savedRecipe: Recipe? = null

        composeRule.setContent {
            RecipeBookTheme {
                RecipeEditorScreen(
                    initialRecipe = recipe,
                    isNewRecipe = false,
                    recipes = listOf(recipe),
                    ingredientReferences = listOf(reference),
                    ingredientForms = listOf(plainForm),
                    tags = emptyList(),
                    collections = emptyList<Collection>(),
                    importWarnings = emptyList<ImportWarning>(),
                    language = AppLanguage.EN,
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
                            updatedAt = "2026-10-10"
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
                    onDelete = null
                )
            }
        }

        composeRule.onNodeWithContentDescription("Edit ingredients").performClick()
        composeRule.onNodeWithContentDescription("Select ingredient").performClick()
        composeRule.onNodeWithText("Search ingredients").performTextInput("plain Greek yogurt")

        composeRule.onNodeWithText("Greek-style yogurt").assertExists().performClick()
        composeRule.onNodeWithText("plain Greek-style yogurt").assertExists()
        composeRule.onNodeWithContentDescription("Save recipe").performClick()

        val savedIngredient = requireNotNull(savedRecipe).ingredients.single()
        assertEquals(reference.id, savedIngredient.ingredientRefId)
        assertEquals(plainForm.id, savedIngredient.ingredientFormId)
        assertEquals(sourceLine, savedIngredient.originalText)
    }

    @Test
    fun placaliBundledIdentityIsSelectableInTheIngredientPicker() {
        val recipe = Recipe(
            id = "recipe-placali-picker",
            createdAt = "2026-10-11",
            updatedAt = "2026-10-11",
            languages = BilingualText(
                fr = LocalizedSystemText("Test", "", "", ""),
                en = LocalizedSystemText("Test", "", "", "")
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "line-placali-picker",
                    originalText = "cassava root",
                    quantity = null,
                    unit = "",
                    ingredientName = "cassava root"
                )
            )
        )
        var savedRecipe: Recipe? = null

        composeRule.setContent {
            RecipeBookTheme {
                RecipeEditorScreen(
                    initialRecipe = recipe,
                    isNewRecipe = false,
                    recipes = listOf(recipe),
                    ingredientReferences = BundledIngredientCatalog.references,
                    ingredientForms = emptyList(),
                    tags = emptyList(),
                    collections = emptyList<Collection>(),
                    importWarnings = emptyList<ImportWarning>(),
                    language = AppLanguage.EN,
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
                            updatedAt = "2026-10-11"
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
                    onDelete = null
                )
            }
        }

        composeRule.onNodeWithContentDescription("Edit ingredients").performClick()
        composeRule.onNodeWithContentDescription("Select ingredient").performClick()
        composeRule.onNodeWithText("Search ingredients").performTextInput("placali")
        composeRule.onAllNodesWithText("placali")[1].performClick()
        composeRule.onNodeWithContentDescription("Save recipe").performClick()

        assertEquals("ingredient-ref-placali", requireNotNull(savedRecipe).ingredients.single().ingredientRefId)
    }

    @Test
    fun puffedSorghumBundledIdentityIsSelectableByItsEnglishAlias() {
        val recipe = Recipe(
            id = "recipe-puffed-sorghum-picker",
            createdAt = "2026-10-11",
            updatedAt = "2026-10-11",
            languages = BilingualText(
                fr = LocalizedSystemText("Test", "", "", ""),
                en = LocalizedSystemText("Test", "", "", "")
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "line-puffed-sorghum-picker",
                    originalText = "test ingredient",
                    quantity = null,
                    unit = "",
                    ingredientName = "test ingredient"
                )
            )
        )
        var savedRecipe: Recipe? = null

        composeRule.setContent {
            RecipeBookTheme {
                RecipeEditorScreen(
                    initialRecipe = recipe,
                    isNewRecipe = false,
                    recipes = listOf(recipe),
                    ingredientReferences = BundledIngredientCatalog.references,
                    ingredientForms = emptyList(),
                    tags = emptyList(),
                    collections = emptyList<Collection>(),
                    importWarnings = emptyList<ImportWarning>(),
                    language = AppLanguage.EN,
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
                            updatedAt = "2026-10-11"
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
                    onDelete = null
                )
            }
        }

        composeRule.onNodeWithContentDescription("Edit ingredients").performClick()
        composeRule.onNodeWithContentDescription("Select ingredient").performClick()
        composeRule.onNodeWithText("Search ingredients").performTextInput("popped sorghum")
        composeRule.onNodeWithText("puffed sorghum").performClick()
        composeRule.onNodeWithContentDescription("Save recipe").performClick()

        assertEquals(
            "ingredient-ref-puffed-sorghum",
            requireNotNull(savedRecipe).ingredients.single().ingredientRefId
        )
    }
}
