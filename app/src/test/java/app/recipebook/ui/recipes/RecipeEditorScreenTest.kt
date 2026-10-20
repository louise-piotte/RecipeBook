package app.recipebook.ui.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.BilingualSyncStatus
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientPackageType
import app.recipebook.domain.model.PackageYieldBasis
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.LocalizedValue
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.data.local.recipes.ImportWarning
import app.recipebook.data.local.recipes.ImportWarningSeverity
import app.recipebook.data.local.recipes.BundledIngredientCatalog
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeEditorScreenTest {
    @Test
    fun packageParserKeepsSourceTextAndStructuresCountNetSizeAndDrainedBasis() {
        val reference = IngredientReference(
            id = "ingredient-ref-black-beans", nameFr = "haricots noirs", nameEn = "black beans", updatedAt = "now"
        )
        val form = IngredientForm(
            id = "ingredient-form-black-beans-canned-drained",
            ingredientRefId = reference.id,
            formCode = "canned_drained",
            labelFr = "haricots noirs en conserve, égouttés",
            labelEn = "canned black beans, drained",
            prepState = "drained",
            updatedAt = "now"
        )
        val sourceText = "1 x 15oz can black beans, drained"
        val row = editableIngredientRowForTest(
            id = "package-line",
            ingredientRefId = reference.id,
            ingredientName = reference.nameEn,
            quantity = "1",
            unit = "can",
            originalText = sourceText,
            ingredientFormId = form.id
        )

        val line = listOf(row).toIngredientLines(listOf(reference), listOf(form)).single()
        val amount = requireNotNull(line.packageAmount)
        assertEquals(sourceText, line.originalText)
        assertEquals(1.0, amount.count, 0.0)
        assertEquals(IngredientPackageType.CAN, amount.packageType)
        assertEquals(15.0, requireNotNull(amount.declaredNetQuantity), 0.0)
        assertEquals("oz", amount.declaredNetUnit)
        assertEquals(PackageYieldBasis.DRAINED_MASS, amount.requestedBasis)

        val namedBrand = listOf(row.copy(originalText = "1 x 15oz can OtherBrand black beans, drained"))
            .toIngredientLines(listOf(reference), listOf(form)).single().packageAmount
        assertEquals("OtherBrand", requireNotNull(namedBrand).brand)
    }

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
            ingredientFormId = "form-whole",
            ingredientAliasHint = "plain flour",
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
    fun ingredientReferenceSearchFoldsFrenchAccentsAndCommonLigatures() {
        val creme = IngredientReference("creme", "crème fraîche", "creme fraiche", updatedAt = "now")
        val egg = IngredientReference("egg", "œuf", "egg", updatedAt = "now")

        assertEquals(listOf("creme"), filterIngredientReferences(listOf(creme, egg), "creme fraiche").map { it.id })
        assertEquals(listOf("egg"), filterIngredientReferences(listOf(creme, egg), "oeuf").map { it.id })
        assertEquals(listOf("egg"), filterIngredientReferences(listOf(creme, egg), "œuf").map { it.id })
    }

    @Test
    fun ingredientPickerShowsAmaranthAndMilletIdentityChoicesClearly() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            setOf(
                "ingredient-ref-amaranth-grain",
                "ingredient-ref-amaranth-flakes",
                "ingredient-ref-amaranth-flour",
                "ingredient-ref-amaranth-greens",
                "ingredient-ref-puffed-amaranth",
                "ingredient-ref-sprouted-amaranth-flour",
            ),
            filterIngredientReferences(references, "amaranth").map { it.id }.toSet()
        )
        assertEquals(
            setOf(
                "ingredient-ref-amaranth-grain",
                "ingredient-ref-amaranth-flakes",
                "ingredient-ref-amaranth-flour",
                "ingredient-ref-amaranth-greens",
                "ingredient-ref-puffed-amaranth",
                "ingredient-ref-sprouted-amaranth-flour",
            ),
            filterIngredientReferences(references, "amarante").map { it.id }.toSet()
        )
        assertEquals(
            setOf(
                "ingredient-ref-arraw",
                "ingredient-ref-biowig-millet-cream",
                "ingredient-ref-millet",
                "ingredient-ref-millet-flakes",
                "ingredient-ref-millet-flour",
                "ingredient-ref-millet-couscous-thiere",
                "ingredient-ref-pearl-millet",
                "ingredient-ref-pearl-millet-flour",
                "ingredient-ref-foxtail-millet",
                "ingredient-ref-common-millet",
                "ingredient-ref-finger-millet",
                "ingredient-ref-finger-millet-flour",
                "ingredient-ref-puffed-millet",
                "ingredient-ref-kodo-millet",
                "ingredient-ref-foxtail-millet-flour",
                "ingredient-ref-kodo-millet-flour",
                "ingredient-ref-proso-millet-flour",
                "ingredient-ref-sankhal",
                "ingredient-ref-sprouted-millet",
                "ingredient-ref-thiakry-millet-granules",
            ),
            filterIngredientReferences(references, "millet").map { it.id }.toSet()
        )
        assertEquals(
            listOf("ingredient-ref-puffed-millet"),
            filterIngredientReferences(references, "millet puffs").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-puffed-millet"),
            filterIngredientReferences(references, "millet soufflé").map { it.id }
        )
        assertEquals(
            setOf("ingredient-ref-pearl-millet", "ingredient-ref-pearl-millet-flour"),
            filterIngredientReferences(references, "millet perlé").map { it.id }.toSet()
        )
    }

    @Test
    fun ingredientPickerShowsParboiledRiceByItsDistinctBilingualName() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            listOf("ingredient-ref-parboiled-rice"),
            filterIngredientReferences(references, "parboiled rice").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-parboiled-rice"),
            filterIngredientReferences(references, "riz étuvé").map { it.id }
        )
        assertTrue(
            references.single { it.id == "ingredient-ref-parboiled-rice" }
                .aliasesEn.isEmpty()
        )
        assertTrue(
            references.single { it.id == "ingredient-ref-parboiled-rice" }
                .aliasesFr.isEmpty()
        )
    }

    @Test
    fun ingredientPickerKeepsRyeProductsSeparate() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            setOf("ingredient-ref-cracked-rye", "ingredient-ref-dark-rye-flour", "ingredient-ref-rye-grain", "ingredient-ref-rye-berries", "ingredient-ref-rye-flakes", "ingredient-ref-rye-flour", "ingredient-ref-rye-meal", "ingredient-ref-light-rye-flour", "ingredient-ref-medium-rye-flour", "ingredient-ref-malted-rye-flour", "ingredient-ref-whole-rye-flour", "ingredient-ref-rye-bran"),
            filterIngredientReferences(references, "rye").map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-cracked-rye", "ingredient-ref-dark-rye-flour", "ingredient-ref-rye-grain", "ingredient-ref-rye-berries", "ingredient-ref-rye-flakes", "ingredient-ref-rye-flour", "ingredient-ref-rye-meal", "ingredient-ref-light-rye-flour", "ingredient-ref-medium-rye-flour", "ingredient-ref-malted-rye-flour", "ingredient-ref-whole-rye-flour", "ingredient-ref-rye-bran"),
            filterIngredientReferences(references, "seigle").map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-rye-flour", "ingredient-ref-dark-rye-flour", "ingredient-ref-light-rye-flour", "ingredient-ref-medium-rye-flour", "ingredient-ref-malted-rye-flour", "ingredient-ref-whole-rye-flour"),
            filterIngredientReferences(references, "farine de seigle").map { it.id }
                .toSet()
        )
    }

    @Test
    fun ingredientPickerFindsReviewedNutFloursButLeavesAmbiguousCoconutFlourUnassigned() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            setOf("ingredient-ref-hazelnut-flour", "ingredient-ref-defatted-hazelnut-flour"),
            filterIngredientReferences(references, "hazelnut flour").map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-hazelnut-flour", "ingredient-ref-defatted-hazelnut-flour"),
            filterIngredientReferences(references, "farine de noisette").map { it.id }.toSet()
        )
        assertEquals(
            listOf("ingredient-ref-chestnut-flour"),
            filterIngredientReferences(references, "chestnut flour").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-chestnut-flour"),
            filterIngredientReferences(references, "farine de châtaigne").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-defatted-coconut-flour"),
            filterIngredientReferences(references, "coconut flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-defatted-coconut-flour"),
            filterIngredientReferences(references, "farine de noix de coco").map { it.id },
        )
    }

    @Test
    fun ingredientPickerShowsReviewedWholeGrainsAndKeepsAmbiguousNamesUnassigned() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            setOf("ingredient-ref-wheat-berries", "ingredient-ref-durum-wheat-berries", "ingredient-ref-sprouted-wheat-berries", "ingredient-ref-red-fife-wheat-berries", "ingredient-ref-hard-red-spring-wheat-berries", "ingredient-ref-hard-white-spring-wheat-berries", "ingredient-ref-soft-white-wheat-berries", "ingredient-ref-soft-red-winter-wheat-berries", "ingredient-ref-hard-red-winter-wheat-berries", "ingredient-ref-soft-red-wheat-berries", "ingredient-ref-soft-white-winter-wheat-berries"),
            filterIngredientReferences(references, "wheat berries").map { it.id }.toSet()
        )
        assertEquals(
            listOf("ingredient-ref-wheat-berries"),
            filterIngredientReferences(references, "grains de blé entiers").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-steel-cut-oats"),
            filterIngredientReferences(references, "steel-cut oats").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-steel-cut-oats"),
            filterIngredientReferences(references, "avoine découpée").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-oat-groats"),
            filterIngredientReferences(references, "oat groats").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-oat-groats"),
            filterIngredientReferences(references, "gruau d'avoine entier").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-emmer-grain"),
            filterIngredientReferences(references, "emmer wheat").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-emmer-grain", "ingredient-ref-emmer-semolina"),
            filterIngredientReferences(references, "blé amidonnier").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-emmer-semolina"),
            filterIngredientReferences(references, "semoule de blé amidonnier").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-freekeh"),
            filterIngredientReferences(references, "freekeh").map { it.id }
        )
        assertEquals(
            setOf("ingredient-ref-farro-grain", "ingredient-ref-farro-flour"),
            filterIngredientReferences(references, "farro").map { it.id }.toSet()
        )
        assertEquals(
            listOf("ingredient-ref-instant-oats"),
            filterIngredientReferences(references, "instant oats").map { it.id }
        )
        assertTrue(filterIngredientReferences(references, "avoine épointée").isEmpty())
    }

    @Test
    fun wheatDerivedProductsRemainSeparateWithoutNumericData() {
        val references = BundledIngredientCatalog.references
        val wheatBran = references.single { it.id == "ingredient-ref-wheat-bran" }
        val wheatGerm = references.single { it.id == "ingredient-ref-wheat-germ" }
        val crackedWheat = references.single { it.id == "ingredient-ref-cracked-wheat" }
        val vitalWheatGluten = references.single { it.id == "ingredient-ref-vital-wheat-gluten" }
        val wheatStarch = references.single { it.id == "ingredient-ref-wheat-starch" }

        assertEquals(listOf(wheatBran.id), filterIngredientReferences(references, "wheat bran").map { it.id })
        assertEquals(listOf(wheatBran.id), filterIngredientReferences(references, "son de ble").map { it.id })
        assertEquals(listOf(wheatGerm.id), filterIngredientReferences(references, "wheat germ").map { it.id })
        assertEquals(listOf(wheatGerm.id), filterIngredientReferences(references, "germe de blé").map { it.id })
        assertEquals(listOf(crackedWheat.id), filterIngredientReferences(references, "cracked wheat").map { it.id })
        assertEquals(listOf(crackedWheat.id), filterIngredientReferences(references, "blé concassé").map { it.id })
        assertEquals(listOf(crackedWheat.id), filterIngredientReferences(references, "ble concasse").map { it.id })
        assertEquals(listOf(vitalWheatGluten.id), filterIngredientReferences(references, "vital wheat gluten").map { it.id })
        assertEquals(listOf(vitalWheatGluten.id), filterIngredientReferences(references, "gluten de froment elastique").map { it.id })
        assertEquals(listOf(vitalWheatGluten.id), filterIngredientReferences(references, "gluten de blé vital").map { it.id })
        assertEquals(setOf(wheatStarch.id, "ingredient-ref-modified-wheat-starch", "ingredient-ref-resistant-wheat-starch", "ingredient-ref-pregelatinized-wheat-starch"), filterIngredientReferences(references, "wheat starch").map { it.id }.toSet())
        assertEquals(setOf(wheatStarch.id, "ingredient-ref-modified-wheat-starch", "ingredient-ref-pregelatinized-wheat-starch"), filterIngredientReferences(references, "amidon de ble").map { it.id }.toSet())
        assertEquals(listOf(wheatStarch.id), filterIngredientReferences(references, "amidon de froment").map { it.id })
        assertEquals(listOf("ingredient-ref-bulgur"), filterIngredientReferences(references, "bulgur").map { it.id })
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, wheatBran.category)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, wheatGerm.category)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, crackedWheat.category)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, vitalWheatGluten.category)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, wheatStarch.category)
        assertNotEquals(wheatBran.id, wheatGerm.id)
        assertNotEquals(crackedWheat.id, "ingredient-ref-bulgur")
        assertTrue(wheatBran.aliasesEn.isEmpty() && wheatBran.aliasesFr.isEmpty())
        assertTrue(wheatGerm.aliasesEn.isEmpty() && wheatGerm.aliasesFr.isEmpty())
        assertTrue(crackedWheat.aliasesEn.isEmpty() && crackedWheat.aliasesFr.isEmpty())
        assertEquals(listOf("gluten flour"), vitalWheatGluten.aliasesEn)
        assertTrue(wheatStarch.aliasesEn.isEmpty())
        assertTrue(wheatBran.defaultDensity == null && wheatBran.unitMappings.isEmpty())
        assertTrue(wheatGerm.defaultDensity == null && wheatGerm.unitMappings.isEmpty())
        assertTrue(crackedWheat.defaultDensity == null && crackedWheat.unitMappings.isEmpty())
        assertTrue(vitalWheatGluten.defaultDensity == null && vitalWheatGluten.unitMappings.isEmpty())
        assertTrue(wheatStarch.defaultDensity == null && wheatStarch.unitMappings.isEmpty())
        assertNotEquals(vitalWheatGluten.id, "ingredient-ref-high-gluten-flour")
        assertNotEquals(wheatStarch.id, "ingredient-ref-whole-wheat-flour")
        assertNotEquals(wheatStarch.id, vitalWheatGluten.id)
        assertNotEquals(wheatStarch.id, "ingredient-ref-cornstarch")
    }

    @Test
    fun ingredientPickerKeepsCakePastryAndOtherSpecialistFloursDistinct() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            setOf("ingredient-ref-rye-flour", "ingredient-ref-dark-rye-flour", "ingredient-ref-light-rye-flour", "ingredient-ref-medium-rye-flour", "ingredient-ref-malted-rye-flour", "ingredient-ref-whole-rye-flour"),
            filterIngredientReferences(references, "rye flour").map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-rye-flour", "ingredient-ref-dark-rye-flour", "ingredient-ref-light-rye-flour", "ingredient-ref-medium-rye-flour", "ingredient-ref-malted-rye-flour", "ingredient-ref-whole-rye-flour"),
            filterIngredientReferences(references, "farine de seigle").map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-spelt-flour", "ingredient-ref-malted-spelt-flour", "ingredient-ref-sprouted-spelt-flour", "ingredient-ref-white-spelt-flour", "ingredient-ref-whole-spelt-flour"),
            filterIngredientReferences(references, "spelt flour").map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-spelt-flour", "ingredient-ref-malted-spelt-flour", "ingredient-ref-sprouted-spelt-flour", "ingredient-ref-white-spelt-flour", "ingredient-ref-whole-spelt-flour"),
            filterIngredientReferences(references, "farine d'épeautre").map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-spelt-flour", "ingredient-ref-malted-spelt-flour", "ingredient-ref-sprouted-spelt-flour", "ingredient-ref-white-spelt-flour", "ingredient-ref-whole-spelt-flour"),
            filterIngredientReferences(references, "farine d'epeautre").map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-einkorn-flour", "ingredient-ref-einkorn-berries"),
            filterIngredientReferences(references, "petit épeautre").map { it.id }.toSet(),
        )
        assertEquals(
            listOf("ingredient-ref-einkorn-flour"),
            filterIngredientReferences(references, "einkorn flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-einkorn-flour"),
            filterIngredientReferences(references, "farine de petit épeautre").map { it.id },
        )
        assertEquals(
            setOf("ingredient-ref-spelt-flour", "ingredient-ref-white-spelt-flour", "ingredient-ref-einkorn-flour", "ingredient-ref-einkorn-berries", "ingredient-ref-puffed-spelt", "ingredient-ref-spelt-flakes", "ingredient-ref-malted-spelt-flour", "ingredient-ref-sprouted-spelt-flour", "ingredient-ref-spelt-berries", "ingredient-ref-whole-spelt-flour"),
            filterIngredientReferences(references, "épeautre").map { it.id }.toSet(),
        )
        assertEquals(
            listOf("ingredient-ref-emmer-flour"),
            filterIngredientReferences(references, "emmer flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-emmer-flour"),
            filterIngredientReferences(references, "farine d'amidonnier").map { it.id },
        )
        assertTrue(
            filterIngredientReferences(references, "farro").none { it.id == "ingredient-ref-emmer-flour" },
        )
        assertEquals(
            listOf("ingredient-ref-khorasan-flour"),
            filterIngredientReferences(references, "khorasan flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-khorasan-flour"),
            filterIngredientReferences(references, "farine de khorasan").map { it.id },
        )
        assertTrue(
            filterIngredientReferences(references, "kamut").none { it.id == "ingredient-ref-khorasan-flour" },
        )
        assertEquals(
            setOf("ingredient-ref-barley-flour", "ingredient-ref-whole-barley-flour", "ingredient-ref-malted-barley-flour", "ingredient-ref-roasted-barley-flour"),
            filterIngredientReferences(references, "barley flour").map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-barley-flour", "ingredient-ref-whole-barley-flour", "ingredient-ref-malted-barley-flour", "ingredient-ref-roasted-barley-flour"),
            filterIngredientReferences(references, "farine d'orge").map { it.id }.toSet(),
        )
        assertEquals(
            listOf("ingredient-ref-whole-barley-flour"),
            filterIngredientReferences(references, "farine d'orge entière").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-french-type-150-flour"),
            filterIngredientReferences(references, "T150").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-roasted-barley-flour"),
            filterIngredientReferences(references, "roasted barley flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-roasted-barley-flour"),
            filterIngredientReferences(references, "farine d'orge torréfiée").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-roasted-barley-flour"),
            filterIngredientReferences(references, "toasted barley flour").map { it.id },
        )
        assertTrue(
            filterIngredientReferences(references, "hattai-ko").none { it.id == "ingredient-ref-roasted-barley-flour" },
        )
        assertTrue(
            filterIngredientReferences(references, "mugikogashi").none { it.id == "ingredient-ref-roasted-barley-flour" },
        )
        assertEquals(
            listOf("ingredient-ref-malted-barley-flour"),
            filterIngredientReferences(references, "malt barley flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-malted-barley-flour"),
            filterIngredientReferences(references, "farine d'orge maltée").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-malted-wheat-flour"),
            filterIngredientReferences(references, "malted wheat flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-malted-wheat-flour"),
            filterIngredientReferences(references, "farine de blé maltée").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-roasted-wheat-flour"),
            filterIngredientReferences(references, "roasted wheat flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-roasted-wheat-flour"),
            filterIngredientReferences(references, "farine de ble torrefiee").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-roasted-wheat-malt-flour"),
            filterIngredientReferences(references, "roasted wheat malt flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-roasted-wheat-malt-flour"),
            filterIngredientReferences(references, "farine de malt de blé torréfié").map { it.id },
        )
        assertTrue(
            filterIngredientReferences(references, "toasted wheat flour").isEmpty(),
        )
        assertTrue(
            filterIngredientReferences(references, "roasted malt flour").isEmpty(),
        )
        assertEquals(
            listOf("ingredient-ref-durum-flour"),
            filterIngredientReferences(references, "durum flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-durum-flour"),
            filterIngredientReferences(references, "durum wheat flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-durum-flour"),
            filterIngredientReferences(references, "farine de blé durum").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-semola-rimacinata"),
            filterIngredientReferences(references, "semola rimacinata").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-semola-rimacinata"),
            filterIngredientReferences(references, "semolina rimacinata").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-semola-rimacinata"),
            filterIngredientReferences(references, "semoule de blé dur remoulue").map { it.id },
        )
        assertEquals(
            setOf("ingredient-ref-durum-semolina", "ingredient-ref-semola-rimacinata"),
            filterIngredientReferences(references, "durum semolina").map { it.id }.toSet(),
        )
        assertEquals(
            listOf("ingredient-ref-maida"),
            filterIngredientReferences(references, "maida").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-maida"),
            filterIngredientReferences(references, "maida flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-all-purpose-flour"),
            filterIngredientReferences(references, "all purpose flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-all-purpose-flour"),
            filterIngredientReferences(references, "farine tout usage").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-atta"),
            filterIngredientReferences(references, "chapati flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-atta"),
            filterIngredientReferences(references, "farine à chapati").map { it.id },
        )
        assertEquals(
            setOf("ingredient-ref-white-whole-wheat-flour", "ingredient-ref-whole-wheat-flour", "ingredient-ref-sprouted-whole-wheat-flour"),
            filterIngredientReferences(references, "whole wheat flour").map { it.id }.toSet(),
        )
        assertEquals(
            listOf("ingredient-ref-pastry-flour"),
            filterIngredientReferences(references, "farine à pâtisserie").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-cake-flour"),
            filterIngredientReferences(references, "farine à gâteau").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-whole-wheat-pastry-flour"),
            filterIngredientReferences(references, "whole wheat pastry flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-high-gluten-flour"),
            filterIngredientReferences(references, "farine à haute teneur en gluten").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-self-rising-flour"),
            filterIngredientReferences(references, "farine autolevante").map { it.id },
        )
    }

    @Test
    fun ingredientPickerKeepsRoastedAndPrecookedCornFloursDistinct() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            listOf("ingredient-ref-roasted-corn-flour"),
            filterIngredientReferences(references, "roasted corn flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-roasted-corn-flour"),
            filterIngredientReferences(references, "farine de mais torrefiee").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-precooked-corn-flour"),
            filterIngredientReferences(references, "precooked corn flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-precooked-corn-flour"),
            filterIngredientReferences(references, "farine de maïs précuite").map { it.id },
        )
        assertTrue(filterIngredientReferences(references, "toasted corn flour").isEmpty())
    }

    @Test
    fun ingredientPickerKeepsKinakoSeparateFromGenericSoyFlour() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            listOf("ingredient-ref-kinako"),
            filterIngredientReferences(references, "kinako").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-kinako"),
            filterIngredientReferences(references, "roasted soybean flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-kinako"),
            filterIngredientReferences(references, "poudre de soja Kinako").map { it.id },
        )
        assertEquals(
            setOf("ingredient-ref-soy-flour", "ingredient-ref-defatted-soy-flour"),
            filterIngredientReferences(references, "soy flour").map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-soy-flour", "ingredient-ref-defatted-soy-flour"),
            filterIngredientReferences(references, "farine de soya").map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-kinako", "ingredient-ref-soy-flour"),
            filterIngredientReferences(references, "soybean flour").map { it.id }.toSet(),
        )
    }

    @Test
    fun ingredientPickerSeparatesChanaSattuFromGenericChickpeaFlour() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            listOf("ingredient-ref-chana-sattu"),
            filterIngredientReferences(references, "chana sattu").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-chana-sattu"),
            filterIngredientReferences(references, "roasted Bengal gram flour").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-chana-sattu"),
            filterIngredientReferences(references, "farine de sattu").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-chana-sattu"),
            filterIngredientReferences(references, "farine de pois chiches grillés").map { it.id },
        )
        assertEquals(
            listOf("ingredient-ref-chickpea-flour"),
            filterIngredientReferences(references, "farine de pois chiche").map { it.id },
        )
        assertEquals(
            setOf("ingredient-ref-chana-sattu", "ingredient-ref-chickpea-flour", "ingredient-ref-desi-chickpea-flour"),
            filterIngredientReferences(references, "chickpea flour").map { it.id }.toSet(),
        )
    }

    @Test
    fun ingredientReferencePickerUsesReviewedDairyNamesWithoutFatClassAliases() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            listOf("ingredient-ref-skim-milk"),
            filterIngredientReferences(references, "lait écrémé").map { it.id }
        )
        assertTrue(filterIngredientReferences(references, "lait 2%").isEmpty())
        assertEquals(
            listOf("ingredient-ref-sour-cream"),
            filterIngredientReferences(references, "crème sûre").map { it.id }
        )
        assertTrue(filterIngredientReferences(references, "crème sûre entière").isEmpty())
    }

    @Test
    fun ingredientReferencePickerKeepsLeafAndBrassicaQueriesDistinct() {
        val references = BundledIngredientCatalog.references

        assertEquals(
            listOf("ingredient-ref-napa-cabbage"),
            filterIngredientReferences(references, "Napa cabbage").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-choy-sum"),
            filterIngredientReferences(references, "Chinese flowering cabbage").map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-chinese-broccoli"),
            filterIngredientReferences(references, "gai lan").map { it.id }
        )
        assertEquals(
            setOf("ingredient-ref-broccoli", "ingredient-ref-chinese-broccoli", "ingredient-ref-minibroccoli", "ingredient-ref-rapini"),
            filterIngredientReferences(references, "broccoli").map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-swiss-chard"),
            filterIngredientReferences(references, "bette").map { it.id }.toSet()
        )
        assertTrue(filterIngredientReferences(references, "Chinese cabbage").isEmpty())
        assertTrue(filterIngredientReferences(references, "chou chinois").isEmpty())
        assertTrue(filterIngredientReferences(references, "bok choy sum").isEmpty())
        assertTrue(filterIngredientReferences(references, "Broccolini").isEmpty())
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
