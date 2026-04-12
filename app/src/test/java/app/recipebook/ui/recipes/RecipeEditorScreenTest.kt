package app.recipebook.ui.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
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
                slug = "tag-$index",
                category = TagCategory.OTHER
            )
        }

        val filtered = filterTags(tags, "tag")

        assertEquals(15, filtered.size)
        assertEquals("tag-15", filtered.last().id)
    }

    @Test
    fun filterTags_matchesLocalizedCategoryNames() {
        val tags = listOf(
            Tag(
                id = "tag-air-fryer",
                nameFr = "Friteuse a air",
                nameEn = "Air Fryer",
                slug = "air-fryer",
                category = TagCategory.APPLIANCE
            )
        )

        assertEquals(1, filterTags(tags, "appliance").size)
        assertEquals(1, filterTags(tags, "appareil").size)
    }

    @Test
    fun groupTagsForDisplay_ordersByCategoryThenSelectedThenName() {
        val tags = listOf(
            Tag(
                id = "tag-dinner",
                nameFr = "Souper",
                nameEn = "Dinner",
                slug = "dinner",
                category = TagCategory.MEAL
            ),
            Tag(
                id = "tag-breakfast",
                nameFr = "Dejeuner",
                nameEn = "Breakfast",
                slug = "breakfast",
                category = TagCategory.MEAL
            ),
            Tag(
                id = "tag-french",
                nameFr = "Francais",
                nameEn = "French",
                slug = "french",
                category = TagCategory.CUISINE
            )
        )

        val grouped = groupTagsForDisplay(
            tags = tags,
            language = AppLanguage.EN,
            selectedTagIds = setOf("tag-dinner")
        )

        assertEquals(listOf(TagCategory.CUISINE, TagCategory.MEAL), grouped.map { it.category })
        assertEquals(listOf("tag-french"), grouped[0].tags.map { it.id })
        assertEquals(listOf("tag-dinner", "tag-breakfast"), grouped[1].tags.map { it.id })
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

    @Test
    fun filterCollections_returnsLocalizedMatchesWithoutTruncation() {
        val collections = listOf(
            Collection(id = "collection-holiday", nameFr = "F\u00eates", nameEn = "Holiday Baking"),
            Collection(id = "collection-family", nameFr = "Famille", nameEn = "Family")
        )

        val filtered = filterCollections(collections, "holiday")

        assertEquals(listOf("collection-holiday"), filtered.map { it.id })
    }

    @Test
    fun updateForLanguage_updatesOnlySelectedLanguage() {
        val bilingual = BilingualText(
            fr = LocalizedSystemText(title = "Soupe", description = "", instructions = "", notes = ""),
            en = LocalizedSystemText(title = "Soup", description = "", instructions = "", notes = "")
        )

        val updated = bilingual.updateForLanguage(AppLanguage.EN) { copy(title = "Stew") }

        assertEquals("Soupe", updated.fr.title)
        assertEquals("Stew", updated.en.title)
    }

    @Test
    fun normalizedForSave_trimsAndNormalizesBothLanguages() {
        val bilingual = BilingualText(
            fr = LocalizedSystemText(
                title = "  Titre  ",
                description = "  Desc  ",
                instructions = "  Etape 1  \n\n Etape 2 ",
                notes = "  Note  "
            ),
            en = LocalizedSystemText(
                title = "  Title  ",
                description = "  Desc  ",
                instructions = " Step 1 \n\n Step 2 ",
                notes = "  Note  "
            )
        )

        val normalized = bilingual.normalizedForSave()

        assertEquals("Titre", normalized.fr.title)
        assertEquals("Desc", normalized.fr.description)
        assertEquals("Etape 1\nEtape 2", normalized.fr.instructions)
        assertEquals("Note", normalized.fr.notes)
        assertEquals("Title", normalized.en.title)
        assertEquals("Step 1\nStep 2", normalized.en.instructions)
    }
}
