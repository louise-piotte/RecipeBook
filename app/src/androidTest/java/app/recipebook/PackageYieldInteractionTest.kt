package app.recipebook

import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.activity.ComponentActivity
import app.recipebook.data.local.recipes.IngredientSubstitutionCatalog
import app.recipebook.domain.model.*
import app.recipebook.ui.recipes.RecipeDetailScreen
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class PackageYieldInteractionTest {
    @get:Rule val compose = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun declaredCanAmountIsDisplayedWithLocalizedPackageNote() {
        val now = "2026-10-10T00:00:00Z"
        val reference = IngredientReference(
            id = "ingredient-ref-tomato-paste",
            nameFr = "pâte de tomates",
            nameEn = "tomato paste",
            category = IngredientCategory.VEGETABLE_AND_AROMATIC,
            updatedAt = now
        )
        val ingredient = IngredientLine(
            id = "tomato-paste-line",
            ingredientRefId = reference.id,
            originalText = "156 ml tomato paste",
            quantity = 156.0,
            unit = "ml",
            ingredientName = reference.nameEn,
            notes = LocalizedValue(fr = "1 boîte", en = "1 can"),
            packageAmount = IngredientPackageAmount(
                count = 1.0,
                packageType = IngredientPackageType.CAN,
                declaredNetQuantity = 156.0,
                declaredNetUnit = "ml"
            )
        )
        val recipe = Recipe(
            id = "tomato-paste-package-fixture",
            createdAt = now,
            updatedAt = now,
            languages = BilingualText(
                fr = LocalizedSystemText("Pâte de tomates", "", "", ""),
                en = LocalizedSystemText("Tomato paste", "", "", "")
            ),
            ingredients = listOf(ingredient)
        )
        val language = androidx.compose.runtime.mutableStateOf(AppLanguage.EN)

        compose.setContent {
            RecipeDetailScreen(
                recipe = recipe,
                recipes = listOf(recipe),
                ingredientReferences = listOf(reference),
                tags = emptyList(),
                language = language.value,
                onLanguageChange = { language.value = it },
                onBack = {},
                onNavigate = {},
                onEdit = {},
                onOpenLinkedRecipe = {},
                substitutionCatalog = IngredientSubstitutionCatalog()
            )
        }

        compose.onNodeWithText("156 ml tomato paste (1 can)").assertExists()
        language.value = AppLanguage.FR
        compose.onNodeWithText("156 ml pâte de tomates (1 boîte)").assertExists()
    }

    @Test
    fun drainedPackageYieldIsQualifiedAndLocalizedInRecipeDetails() {
        val now = "2026-10-06T00:00:00Z"
        val reference = IngredientReference(
            id = "ingredient-ref-black-beans",
            nameFr = "haricots noirs",
            nameEn = "black beans",
            category = IngredientCategory.LEGUME_AND_PULSE,
            updatedAt = now
        )
        val form = IngredientForm(
            id = "ingredient-form-black-beans-canned-drained",
            ingredientRefId = reference.id,
            formCode = "canned_drained",
            labelFr = "haricots noirs en conserve, égouttés",
            labelEn = "canned black beans, drained",
            prepState = "drained",
            updatedAt = now
        )
        val observation = PackageYieldObservation(
            id = "package-yield-sw-black-beans-15oz-drained",
            ingredientRefId = reference.id,
            ingredientFormId = form.id,
            packageType = IngredientPackageType.CAN,
            declaredNetQuantity = 15.0,
            declaredNetUnit = "oz",
            netMassG = 425.0,
            drainedMassG = 240.0,
            brand = "S&W",
            productName = "Black Beans",
            productCode = "1320217103112",
            countryOfOrigin = "USA",
            sourceUrl = "https://swpremiumfood.com/wp-content/uploads/2017/02/SW-Catalogue_2016.pdf",
            sourceName = "S&W Beans Catalogue",
            sourceVersionOrDate = "2016"
        )
        val ingredient = IngredientLine(
            id = "black-beans-line",
            ingredientRefId = reference.id,
            ingredientFormId = form.id,
            originalText = "1 x 15 oz can black beans, drained",
            quantity = 1.0,
            unit = "can",
            ingredientName = reference.nameEn,
            packageAmount = IngredientPackageAmount(
                count = 1.0,
                packageType = IngredientPackageType.CAN,
                declaredNetQuantity = 15.0,
                declaredNetUnit = "oz",
                requestedBasis = PackageYieldBasis.DRAINED_MASS
            )
        )
        val recipe = Recipe(
            id = "package-yield-fixture",
            createdAt = now,
            updatedAt = now,
            languages = BilingualText(
                fr = LocalizedSystemText("Haricots", "", "", ""),
                en = LocalizedSystemText("Beans", "", "", "")
            ),
            ingredients = listOf(ingredient)
        )
        val catalog = IngredientSubstitutionCatalog(
            ingredientForms = listOf(form),
            units = emptyList(),
            packageYields = listOf(observation)
        )
        val language = androidx.compose.runtime.mutableStateOf(AppLanguage.EN)

        compose.setContent {
            RecipeDetailScreen(
                recipe = recipe,
                recipes = listOf(recipe),
                ingredientReferences = listOf(reference),
                tags = emptyList(),
                language = language.value,
                onLanguageChange = { language.value = it },
                onBack = {},
                onNavigate = {},
                onEdit = {},
                onOpenLinkedRecipe = {},
                substitutionCatalog = catalog
            )
        }

        compose.onNodeWithTag("ingredient-row-black-beans-line").performSemanticsAction(SemanticsActions.OnLongClick)
        compose.onNodeWithTag("ingredient-convert-g").performClick()
        compose.onNodeWithText("240 g black beans, drained (Source-specific estimate: S&W)").assertExists()
        language.value = AppLanguage.FR
        compose.onNodeWithText("240 g haricots noirs, égouttés (Estimation propre à la source : S&W)").assertExists()
    }

    @Test
    fun servingScaleUpdatesPackageYieldCountAndResetRestoresBaseYield() {
        val now = "2026-10-18T00:00:00Z"
        val reference = IngredientReference(
            id = "ingredient-ref-black-beans",
            nameFr = "haricots noirs",
            nameEn = "black beans",
            category = IngredientCategory.LEGUME_AND_PULSE,
            updatedAt = now
        )
        val form = IngredientForm(
            id = "ingredient-form-black-beans-canned-drained",
            ingredientRefId = reference.id,
            formCode = "canned_drained",
            labelFr = "haricots noirs en conserve, égouttés",
            labelEn = "canned black beans, drained",
            prepState = "drained",
            updatedAt = now
        )
        val observation = PackageYieldObservation(
            id = "package-yield-sw-black-beans-15oz-drained",
            ingredientRefId = reference.id,
            ingredientFormId = form.id,
            packageType = IngredientPackageType.CAN,
            declaredNetQuantity = 15.0,
            declaredNetUnit = "oz",
            netMassG = 425.0,
            drainedMassG = 240.0,
            brand = "S&W",
            productName = "Black Beans",
            productCode = "1320217103112",
            countryOfOrigin = "USA",
            sourceUrl = "https://swpremiumfood.com/wp-content/uploads/2017/02/SW-Catalogue_2016.pdf",
            sourceName = "S&W Beans Catalogue",
            sourceVersionOrDate = "2016"
        )
        val ingredient = IngredientLine(
            id = "black-beans-line",
            ingredientRefId = reference.id,
            ingredientFormId = form.id,
            originalText = "1 x 15 oz can black beans, drained",
            quantity = 15.0,
            unit = "oz",
            ingredientName = reference.nameEn,
            packageAmount = IngredientPackageAmount(
                count = 1.0,
                packageType = IngredientPackageType.CAN,
                declaredNetQuantity = 15.0,
                declaredNetUnit = "oz",
                requestedBasis = PackageYieldBasis.DRAINED_MASS
            )
        )
        val recipe = Recipe(
            id = "scaled-package-yield-fixture",
            createdAt = now,
            updatedAt = now,
            languages = BilingualText(
                fr = LocalizedSystemText("Haricots", "", "", ""),
                en = LocalizedSystemText("Beans", "", "", "")
            ),
            ingredients = listOf(ingredient),
            servings = Servings(amount = 2.0, unit = "servings")
        )
        val catalog = IngredientSubstitutionCatalog(
            ingredientForms = listOf(form),
            units = emptyList(),
            packageYields = listOf(observation)
        )

        compose.setContent {
            RecipeDetailScreen(
                recipe = recipe,
                recipes = listOf(recipe),
                ingredientReferences = listOf(reference),
                tags = emptyList(),
                language = AppLanguage.EN,
                onLanguageChange = {},
                onBack = {},
                onNavigate = {},
                onEdit = {},
                onOpenLinkedRecipe = {},
                substitutionCatalog = catalog
            )
        }

        compose.onNodeWithTag("recipe-scale-button").performClick()
        compose.onNodeWithTag("recipe-scale-input").performTextReplacement("4")
        compose.onNodeWithText("Apply").performClick()
        compose.onNodeWithTag("ingredient-row-black-beans-line")
            .performSemanticsAction(SemanticsActions.OnLongClick)
        compose.onNodeWithTag("ingredient-convert-g").performClick()
        compose.onNodeWithText("480 g black beans, drained (Source-specific estimate: S&W)").assertExists()

        compose.onNodeWithTag("recipe-scale-reset").performClick()
        compose.onNodeWithText("240 g black beans, drained (Source-specific estimate: S&W)").assertExists()
        assertEquals("1 x 15 oz can black beans, drained", ingredient.originalText)
        assertEquals(1.0, requireNotNull(ingredient.packageAmount).count, 0.0)
        assertEquals(PackageYieldBasis.DRAINED_MASS, ingredient.packageAmount?.requestedBasis)
    }
}
