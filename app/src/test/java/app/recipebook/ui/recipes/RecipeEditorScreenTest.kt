package app.recipebook.ui.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.BilingualSyncStatus
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.LocalizedValue
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.data.local.recipes.ImportWarning
import app.recipebook.data.local.recipes.ImportWarningSeverity
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeEditorScreenTest {
    @Test fun freshCountRowsComposeSourceTextOnceAndRetainSizeDependentUnit() {
        val row = editableIngredientRowForTest(id = "egg", ingredientName = "egg white", quantity = "2", unit = "large egg white",
            preparation = app.recipebook.domain.model.LocalizedValue(en = "lightly beaten"))
        val line = listOf(row).toIngredientLines(emptyList()).single()
        assertEquals("2 large egg whites, lightly beaten", line.originalText)
        assertEquals("large egg white", line.unit)
        assertEquals(2.0, requireNotNull(line.quantity), 0.000001)
        for (unit in listOf("g", "cup", "tbsp")) {
            val measured = listOf(row.copy(unit = unit)).toIngredientLines(emptyList()).single()
            assertEquals("2 $unit egg white, lightly beaten", measured.originalText)
            assertEquals(unit, measured.unit)
            assertEquals(2.0, requireNotNull(measured.quantity), 0.000001)
        }
    }

    @Test
    fun invalidQuantityIsReportedBeforeSaveCanDropIt() {
        assertTrue(isInvalidRecipeQuantity("1,2.3"))
        assertTrue(isInvalidRecipeQuantity("NaN"))
        assertEquals(false, isInvalidRecipeQuantity("1,5"))
        assertEquals(false, isInvalidRecipeQuantity("1½"))
        assertEquals(false, isInvalidRecipeQuantity(""))
    }

    @Test
    fun ingredientEditorRoundTripPreservesOptionalGroupAndSubstitutions() {
        val line = app.recipebook.domain.model.IngredientLine(
            id = "line-1", originalText = "1.5 cups flour", quantity = 1.5, unit = "cup",
            ingredientName = "flour", optional = true, group = "Dough",
            substitutions = listOf(app.recipebook.domain.model.IngredientLineSubstitution(
                id = "sub-1", ingredientLineId = "line-1", substitutionRuleId = "rule-1",
                isPreferred = true, createdAt = "2026-01-01", updatedAt = "2026-01-01"
            ))
        )
        val saved = listOf(line.toEditableRow().copy(quantity = "1,5", unit = "tasses"))
            .toIngredientLines(emptyList()).single()
        assertEquals(line, saved)
    }

    @Test
    fun ingredientEditorAcceptsFractionGlyphsAfterLanguageChanges() {
        val row = editableIngredientRowForTest(id = "line-1", ingredientName = "flour", quantity = "1½", unit = "tasse")
            .withPreparation(AppLanguage.EN, "sifted").withPreparation(AppLanguage.FR, "tamisée")
        val line = listOf(row).toIngredientLines(emptyList()).single()
        assertEquals(1.5, requireNotNull(line.quantity), 0.000001)
        assertEquals("cup", line.unit)
        assertEquals("sifted", line.preparation.en)
        assertEquals("tamisée", line.preparation.fr)
    }


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
    fun editableIngredientRow_tracksPreparationAndNotesPerLanguage() {
        val row = editableIngredientRowForTest(id = "line-1")
            .withPreparation(AppLanguage.EN, "divided")
            .withPreparation(AppLanguage.FR, "divise")
            .withNotes(AppLanguage.EN, "for garnish")
            .withNotes(AppLanguage.FR, "pour garniture")

        assertEquals("divided", row.preparation.forLanguage(AppLanguage.EN))
        assertEquals("divise", row.preparation.forLanguage(AppLanguage.FR))
        assertEquals("for garnish", row.notes.forLanguage(AppLanguage.EN))
        assertEquals("pour garniture", row.notes.forLanguage(AppLanguage.FR))
    }

    @Test
    fun toIngredientLines_preservesBilingualPreparationAndNotes() {
        val rows = listOf(
            editableIngredientRowForTest(
                id = "line-1",
                ingredientName = "butter",
                quantity = "1",
                unit = "cup",
                preparation = LocalizedValue(fr = "ramolli", en = "softened"),
                notes = LocalizedValue(fr = "pour glacage", en = "for frosting")
            )
        )

        val ingredient = rows.toIngredientLines(emptyList()).single()

        assertEquals("ramolli", ingredient.preparation.fr)
        assertEquals("softened", ingredient.preparation.en)
        assertEquals("pour glacage", ingredient.notes.fr)
        assertEquals("for frosting", ingredient.notes.en)
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

    @Test
    fun importWarningMessageRes_mapsKnownCodes() {
        assertEquals(
            app.recipebook.R.string.import_warning_missing_recipe_schema,
            importWarningMessageRes("missing_recipe_schema")
        )
        assertEquals(
            app.recipebook.R.string.import_warning_generic,
            importWarningMessageRes("something_else")
        )
    }

    @Test
    fun dedupeImportWarnings_collapsesDuplicateCodeAndFieldToHighestSeverity() {
        val deduped = dedupeImportWarnings(
            listOf(
                ImportWarning(
                    code = "ingredient_section_missing",
                    severity = ImportWarningSeverity.INFO,
                    field = "ingredients"
                ),
                ImportWarning(
                    code = "ingredient_section_missing",
                    severity = ImportWarningSeverity.WARNING,
                    field = "ingredients"
                ),
                ImportWarning(
                    code = "instruction_section_missing",
                    severity = ImportWarningSeverity.INFO,
                    field = "instructions"
                )
            )
        )

        assertEquals(2, deduped.size)
        assertTrue(
            deduped.any {
                it.code == "ingredient_section_missing" &&
                    it.field == "ingredients" &&
                    it.severity == ImportWarningSeverity.WARNING
            }
        )
    }

    @Test
    fun groupImportWarningsByField_ignoresBlankFields() {
        val grouped = groupImportWarningsByField(
            listOf(
                ImportWarning(
                    code = "ingredient_section_missing",
                    severity = ImportWarningSeverity.INFO,
                    field = "ingredients"
                ),
                ImportWarning(
                    code = "missing_recipe_schema",
                    severity = ImportWarningSeverity.WARNING,
                    field = null
                )
            )
        )

        assertEquals(listOf("ingredients"), grouped.keys.toList())
        assertEquals(1, grouped["ingredients"]?.size)
    }

    @Test
    fun buildImportWarningSummaryLines_mapsSeverityAndMessageResources() {
        val lines = buildImportWarningSummaryLines(
            warnings = listOf(
                ImportWarning(
                    code = "ingredient_section_missing",
                    severity = ImportWarningSeverity.WARNING
                ),
                ImportWarning(
                    code = "missing_source_url",
                    severity = ImportWarningSeverity.BLOCKING
                )
            )
        )

        assertEquals(2, lines.size)
        assertEquals(app.recipebook.R.string.import_warning_warning_prefix, lines[0].severityLabelResId)
        assertEquals(app.recipebook.R.string.import_warning_ingredient_section_missing, lines[0].messageResId)
        assertEquals(app.recipebook.R.string.import_warning_blocking_prefix, lines[1].severityLabelResId)
        assertEquals(app.recipebook.R.string.import_warning_missing_source_url, lines[1].messageResId)
    }

    @Test
    fun importSourceTypeLabelRes_mapsKnownTypes() {
        assertEquals(app.recipebook.R.string.import_source_type_webpage, importSourceTypeLabelRes("shared_webpage_url"))
        assertEquals(app.recipebook.R.string.import_source_type_text, importSourceTypeLabelRes("shared_text"))
        assertEquals(app.recipebook.R.string.import_source_type_image, importSourceTypeLabelRes("image"))
        assertEquals(null, importSourceTypeLabelRes("other"))
    }

    private fun bilingualForStatusTest(): BilingualText = BilingualText(
        fr = LocalizedSystemText(title = "Titre", description = "", instructions = "", notes = ""),
        en = LocalizedSystemText(title = "Title", description = "", instructions = "", notes = "")
    )

}
