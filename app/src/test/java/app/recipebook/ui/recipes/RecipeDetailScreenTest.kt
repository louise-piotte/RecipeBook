package app.recipebook.ui.recipes

import app.recipebook.data.local.recipes.IngredientSubstitutionSuggestion
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LocalizedValue
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionRiskLevel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeDetailScreenTest {

    @Test
    fun buildDetailTagText_formatsTagsAsCommaSeparatedText() {
        val tags = listOf(
            app.recipebook.domain.model.Tag(id = "tag-1", nameFr = "Dessert", nameEn = "Dessert", slug = "dessert"),
            app.recipebook.domain.model.Tag(id = "tag-2", nameFr = "Fete", nameEn = "Holiday", slug = "holiday")
        )

        val result = buildDetailTagText(tags, AppLanguage.EN)

        assertEquals("Dessert, Holiday", result)
    }

    @Test
    fun buildDetailIngredientText_localizesStructuredIngredientLineInFrench() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-butter",
            originalText = "1 cup butter, divided",
            quantity = 1.0,
            unit = "cup",
            ingredientName = "butter",
            preparation = LocalizedValue(fr = "divis\u00e9", en = "divided"),
            notes = LocalizedValue(fr = "pour cuisson", en = "baking")
        )
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-butter",
            nameFr = "beurre",
            nameEn = "butter",
            updatedAt = "2026-03-16T00:00:00Z"
        )

        val result = buildDetailIngredientText(ingredient, ingredientReference, AppLanguage.FR)

        assertEquals("1 tasse beurre, divis\u00E9 (pour cuisson)", result)
    }

    @Test
    fun buildDetailIngredientText_keepsEnglishStructuredIngredientLineInEnglish() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-butter",
            originalText = "1 cup butter, divided",
            quantity = 1.0,
            unit = "cup",
            ingredientName = "butter",
            preparation = LocalizedValue(fr = "divis\u00e9", en = "divided"),
            notes = LocalizedValue(fr = "pour cuisson", en = "baking")
        )
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-butter",
            nameFr = "beurre",
            nameEn = "butter",
            updatedAt = "2026-03-16T00:00:00Z"
        )

        val result = buildDetailIngredientText(ingredient, ingredientReference, AppLanguage.EN)

        assertEquals("1 cup butter, divided (baking)", result)
    }

    @Test
    fun buildDetailIngredientText_usesFractionGlyphsForCommonCupAmounts() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            originalText = "",
            quantity = 2.0 / 3.0,
            unit = "cup",
            ingredientName = "sugar"
        )

        val result = buildDetailIngredientText(ingredient, null, AppLanguage.EN)

        assertEquals("\u2154 cup sugar", result)
    }

    @Test
    fun buildDetailIngredientText_usesTablespoonsForAwkwardCupAmounts() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            originalText = "",
            quantity = 0.375,
            unit = "cup",
            ingredientName = "sugar"
        )

        val result = buildDetailIngredientText(ingredient, null, AppLanguage.EN)

        assertEquals("6 tbsp sugar", result)
    }

    @Test
    fun buildDetailIngredientText_usesTeaspoonFractionsForAwkwardTablespoons() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            originalText = "",
            quantity = 0.25,
            unit = "tbsp",
            ingredientName = "vanilla"
        )

        val result = buildDetailIngredientText(ingredient, null, AppLanguage.EN)

        assertEquals("\u00BE tsp vanilla", result)
    }

    @Test
    fun buildIngredientSubstitutionOptionLabel_usesSubstitutionNameAndAmount() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            originalText = "2 tbsp flour",
            quantity = 2.0,
            unit = "tbsp",
            ingredientName = "flour"
        )
        val substitution = IngredientSubstitutionSuggestion(
            id = "sub-1",
            displayNameFr = "f\u00e9cule de ma\u00efs",
            displayNameEn = "cornstarch",
            quantity = 1.0,
            unit = "tbsp",
            riskLevel = SubstitutionRiskLevel.HIGH_RISK,
            confidence = SubstitutionConfidence.TESTED,
            warningTextFr = "Utiliser seulement pour \u00e9paissir une sauce.",
            warningTextEn = "Use only to thicken a sauce."
        )

        val result = buildIngredientSubstitutionOptionLabel(ingredient, substitution, AppLanguage.EN)

        assertEquals("1 tbsp cornstarch", result)
    }

    @Test
    fun convertIngredientQuantity_usesIngredientMappingsAndDensity() {
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-flour",
            nameFr = "farine",
            nameEn = "flour",
            defaultDensity = 0.53,
            unitMappings = listOf(
                IngredientUnitMapping(fromUnit = "cup", toUnit = "g", factor = 120.0),
                IngredientUnitMapping(fromUnit = "tbsp", toUnit = "g", factor = 7.5)
            ),
            updatedAt = "2026-03-21T00:00:00Z"
        )

        assertEquals(120.0, requireNotNull(convertIngredientQuantity(1.0, "cup", "g", ingredientReference)), 0.001)
        assertEquals(16.0, requireNotNull(convertIngredientQuantity(120.0, "g", "tbsp", ingredientReference)), 0.001)
        assertEquals(1.0, requireNotNull(convertIngredientQuantity(120.0, "g", "cup", ingredientReference)), 0.001)
    }

    @Test
    fun convertIngredientQuantity_supportsStandardUnitsWithoutIngredientMapping() {
        assertEquals(454.0, requireNotNull(convertIngredientQuantity(1.0, "lb", "g", null)), 0.001)
        assertEquals(8.0, requireNotNull(convertIngredientQuantity(1.0, "cup", "fl oz", null)), 0.001)
    }

    @Test
    fun availableConversionUnits_returnsReachableUnitsSortedByCategory() {
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-water",
            nameFr = "eau",
            nameEn = "water",
            defaultDensity = 1.0,
            unitMappings = listOf(IngredientUnitMapping(fromUnit = "fl oz", toUnit = "ml", factor = 29.57)),
            updatedAt = "2026-03-21T00:00:00Z"
        )

        val units = availableConversionUnits("cup", ingredientReference)

        assertTrue(units.containsAll(listOf("g", "ml", "tbsp", "tsp", "fl oz")))
        assertEquals("g", units.first())
    }

    @Test
    fun recipeSource_displayText_prefersNameWhenPresent() {
        val source = RecipeSource(
            sourceUrl = "https://example.com/recipe",
            sourceName = "Example Kitchen"
        )

        assertEquals("Example Kitchen", source.displayText())
        assertEquals("https://example.com/recipe", source.clickableUrlOrNull())
    }

    @Test
    fun recipeSource_withoutUrl_staysPlainText() {
        val source = RecipeSource(
            sourceUrl = "   ",
            sourceName = "Family recipe card"
        )

        assertEquals("Family recipe card", source.displayText())
        assertEquals(null, source.clickableUrlOrNull())
    }
}




