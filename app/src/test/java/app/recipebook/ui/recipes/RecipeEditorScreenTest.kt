package app.recipebook.ui.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.BilingualSyncStatus
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.ImportMetadata
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
    fun displayedOtherLanguageStatus_marksOtherLanguageStaleWhenActiveLanguageChanges() {
        val initial = bilingualForStatusTest()
        val current = initial.updateForLanguage(AppLanguage.EN) { copy(title = "Updated title") }

        val status = displayedOtherLanguageStatus(
            initialLanguages = initial,
            currentLanguages = current,
            currentLanguage = AppLanguage.EN,
            importMetadata = ImportMetadata(syncStatusFr = BilingualSyncStatus.UP_TO_DATE)
        )

        assertEquals(BilingualSyncStatus.NEEDS_REGENERATION, status)
    }

    @Test
    fun displayedOtherLanguageStatus_marksOtherLanguageMissingWhenBlank() {
        val initial = bilingualForStatusTest()
        val current = initial.copy(
            fr = LocalizedSystemText(title = "", description = "", instructions = "", notes = "")
        ).updateForLanguage(AppLanguage.EN) { copy(title = "Updated title") }

        val status = displayedOtherLanguageStatus(
            initialLanguages = initial,
            currentLanguages = current,
            currentLanguage = AppLanguage.EN,
            importMetadata = null
        )

        assertEquals(BilingualSyncStatus.MISSING, status)
    }

    @Test
    fun displayedOtherLanguageStatus_usesStoredStatusWhenCurrentLanguageUnchanged() {
        val initial = bilingualForStatusTest()

        val status = displayedOtherLanguageStatus(
            initialLanguages = initial,
            currentLanguages = initial,
            currentLanguage = AppLanguage.EN,
            importMetadata = ImportMetadata(syncStatusFr = BilingualSyncStatus.NEEDS_REGENERATION)
        )

        assertEquals(BilingualSyncStatus.NEEDS_REGENERATION, status)
    }

    @Test
    fun displayedOtherLanguageStatus_prefersUpdatedStoredStatusAfterRegeneration() {
        val initial = bilingualForStatusTest().copy(
            fr = LocalizedSystemText(title = "", description = "", instructions = "", notes = "")
        )
        val current = initial.copy(
            fr = LocalizedSystemText(title = "Title", description = "", instructions = "", notes = "Brouillon"),
            en = LocalizedSystemText(title = "Title", description = "", instructions = "", notes = "")
        )

        val status = displayedOtherLanguageStatus(
            initialLanguages = initial,
            currentLanguages = current,
            currentLanguage = AppLanguage.EN,
            importMetadata = ImportMetadata(
                authoritativeLanguage = AppLanguage.EN,
                syncStatusFr = BilingualSyncStatus.UP_TO_DATE,
                syncStatusEn = BilingualSyncStatus.UP_TO_DATE
            )
        )

        assertEquals(BilingualSyncStatus.UP_TO_DATE, status)
    }

    private fun bilingualForStatusTest(): BilingualText = BilingualText(
        fr = LocalizedSystemText(title = "Titre", description = "", instructions = "", notes = ""),
        en = LocalizedSystemText(title = "Title", description = "", instructions = "", notes = "")
    )

}
