package app.recipebook.ui.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import org.junit.Assert.assertEquals
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
            preparation = "divided",
            notes = "baking"
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
            preparation = "divided",
            notes = "baking"
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
}
