package app.recipebook.ui.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Tag
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeEditorScreenTest {

    @Test
    fun filterIngredientReferences_returnsAllMatchesWithoutTruncation() {
        val references = (1..15).map { index ->
            IngredientReference(
                id = "ingredient-$index",
                nameFr = "Ingredient $index",
                nameEn = "Ingredient $index",
                updatedAt = "2026-03-16T00:00:00Z"
            )
        }

        val filtered = filterIngredientReferences(references, "ingredient")

        assertEquals(15, filtered.size)
        assertEquals("ingredient-15", filtered.last().id)
    }

    @Test
    fun filterTags_returnsAllMatchesWithoutTruncation() {
        val tags = (1..15).map { index ->
            Tag(
                id = "tag-$index",
                nameFr = "Tag $index",
                nameEn = "Tag $index",
                slug = "tag-$index"
            )
        }

        val filtered = filterTags(tags, "tag")

        assertEquals(15, filtered.size)
        assertEquals("tag-15", filtered.last().id)
    }

    @Test
    fun toIngredientLines_usesCanonicalReferenceNameInsteadOfUiLanguage() {
        val references = listOf(
            IngredientReference(
                id = "ingredient-ref-flour",
                nameFr = "Farine",
                nameEn = "Flour",
                updatedAt = "2026-03-16T00:00:00Z"
            )
        )
        val rows = listOf(
            editableIngredientRowForTest(
                id = "line-1",
                ingredientRefId = "ingredient-ref-flour",
                quantity = "2",
                unit = "cups"
            )
        )

        val ingredientLines = rows.toIngredientLines(references)

        assertEquals(1, ingredientLines.size)
        assertEquals("Flour", ingredientLines.first().ingredientName)
        assertTrue(ingredientLines.first().originalText.contains("Flour"))
    }

    @Test
    fun referenceCanonicalName_prefersEnglish() {
        val reference = IngredientReference(
            id = "ingredient-ref-butter",
            nameFr = "Beurre",
            nameEn = "Butter",
            updatedAt = "2026-03-16T00:00:00Z"
        )

        assertEquals("Butter", reference.canonicalName())
    }
}

