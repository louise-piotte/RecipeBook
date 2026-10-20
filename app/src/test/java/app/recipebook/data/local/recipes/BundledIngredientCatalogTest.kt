package app.recipebook.data.local.recipes

import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.localization.filterByIngredientSearchQuery
import app.recipebook.domain.localization.normalizeIngredientSearchKey
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class BundledIngredientCatalogTest {
    @Test
    fun generatedCatalogContainsCanonicalSeedIdentitiesAndLocalizedText() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }

        assertEquals("puffed quinoa", catalog.getValue("ingredient-ref-puffed-quinoa").nameEn)
        assertEquals("quinoa soufflé", catalog.getValue("ingredient-ref-puffed-quinoa").nameFr)
        assertEquals(listOf("millet puffs"), catalog.getValue("ingredient-ref-puffed-millet").aliasesEn)
        assertEquals("spaetzle", catalog.getValue("ingredient-ref-spaetzle").nameEn)
        assertEquals("spätzle", catalog.getValue("ingredient-ref-spaetzle").nameFr)
        val gnocchi = catalog.getValue("ingredient-ref-gnocchi")
        assertEquals("gnocchi", gnocchi.nameEn)
        assertEquals("gnocchi", gnocchi.nameFr)
        assertEquals(listOf("gnocchis"), gnocchi.aliasesFr)
        assertEquals("farine à pain", catalog.getValue("ingredient-ref-bread-flour").nameFr)
        assertEquals("sucre à glacer", catalog.getValue("ingredient-ref-icing-sugar").nameFr)
        assertEquals("jalapeno pepper", catalog.getValue("ingredient-ref-jalapeno-pepper").nameEn)
        assertEquals("gruyère", catalog.getValue("ingredient-ref-gruyere").nameFr)
        assertEquals("crème fraîche", catalog.getValue("ingredient-ref-creme-fraiche").nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, catalog.getValue("ingredient-ref-all-purpose-flour").category)
        val greekYogurt = catalog.getValue("ingredient-ref-greek-yogurt")
        assertEquals("Greek-style yogurt", greekYogurt.nameEn)
        assertEquals("yogourt grec", greekYogurt.nameFr)
        assertEquals(listOf("Greek yogurt", "Greek yoghurt", "Greek-style yoghurt"), greekYogurt.aliasesEn)
        assertEquals(IngredientCategory.DAIRY_AND_ALTERNATIVE, greekYogurt.category)
        assertNotNull(catalog.getValue("ingredient-ref-unsweetened-chocolate"))

        val arrowroot = catalog.getValue("ingredient-ref-arrowroot")
        assertEquals(listOf("arrowroot flour", "arrowroot powder", "arrowroot starch"), arrowroot.aliasesEn)
        assertEquals(listOf("farine d'arrow-root", "fécule d'arrow-root"), arrowroot.aliasesFr)
        assertNull(arrowroot.defaultDensity)
        assertTrue(arrowroot.unitMappings.isEmpty())
        val arrowrootSearchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        assertEquals(
            listOf(arrowroot.id),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "fécule d'arrow-root", arrowrootSearchTerms).map { it.id }
        )
        assertEquals(
            listOf(arrowroot.id),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "arrowroot powder", arrowrootSearchTerms).map { it.id }
        )

        val whiteRice = catalog.getValue("ingredient-ref-white-rice")
        assertEquals("white rice", whiteRice.nameEn)
        assertEquals("riz blanchi", whiteRice.nameFr)
        assertEquals(listOf("milled rice"), whiteRice.aliasesEn)
        assertEquals(listOf("riz blanc"), whiteRice.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, whiteRice.category)
        assertNull(whiteRice.defaultDensity)
        assertTrue(whiteRice.unitMappings.isEmpty())

        val beef = catalog.getValue("ingredient-ref-beef")
        assertEquals("beef", beef.nameEn)
        assertEquals("bœuf", beef.nameFr)
        assertEquals(IngredientCategory.PROTEIN, beef.category)
        assertTrue(beef.aliasesEn.isEmpty())
        assertTrue(beef.aliasesFr.isEmpty())
        assertNull(beef.defaultDensity)
        assertTrue(beef.unitMappings.isEmpty())

        val beefStock = catalog.getValue("ingredient-ref-beef-stock")
        assertEquals("beef stock", beefStock.nameEn)
        assertEquals("fond de bœuf", beefStock.nameFr)
        assertTrue(beefStock.aliasesEn.isEmpty())
        assertTrue(beefStock.aliasesFr.isEmpty())
        val beefBroth = catalog.getValue("ingredient-ref-beef-broth")
        assertEquals("beef broth", beefBroth.nameEn)
        assertEquals("bouillon de bœuf", beefBroth.nameFr)
        assertEquals(IngredientCategory.STOCK_AND_BROTH, beefBroth.category)
        assertTrue(beefBroth.aliasesEn.isEmpty())
        assertTrue(beefBroth.aliasesFr.isEmpty())
        assertNull(beefBroth.defaultDensity)
        assertTrue(beefBroth.unitMappings.isEmpty())
    }

    @Test
    fun reviewedFlourPulseAndPuffedGrainNamesStaySearchableAndDistinct() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val blackChickpeas = catalog.getValue("ingredient-ref-black-chickpeas")
        assertEquals("black chickpeas", blackChickpeas.nameEn)
        assertEquals("pois chiches noirs", blackChickpeas.nameFr)
        assertEquals(IngredientCategory.LEGUME_AND_PULSE, blackChickpeas.category)
        assertEquals(listOf("black chickpea", "kala chana"), blackChickpeas.aliasesEn)
        assertEquals(listOf("pois chiche noir", "kala chana"), blackChickpeas.aliasesFr)
        assertSingle("black chickpeas", blackChickpeas.id)
        assertSingle("pois chiches noirs", blackChickpeas.id)
        assertSingle("kala chana", blackChickpeas.id)

        val puffedBuckwheat = catalog.getValue("ingredient-ref-puffed-buckwheat")
        assertEquals("sarrasin soufflé", puffedBuckwheat.nameFr)
        assertEquals(listOf("buckwheat puffs"), puffedBuckwheat.aliasesEn)
        assertSingle("puffed buckwheat", puffedBuckwheat.id)
        assertSingle("sarrasin soufflé", puffedBuckwheat.id)
        assertSingle("buckwheat puffs", puffedBuckwheat.id)

        val puffedSpelt = catalog.getValue("ingredient-ref-puffed-spelt")
        assertEquals("épeautre soufflé", puffedSpelt.nameFr)
        assertEquals(listOf("spelt puffs"), puffedSpelt.aliasesEn)
        assertSingle("puffed spelt", puffedSpelt.id)
        assertSingle("épeautre soufflé", puffedSpelt.id)
        assertSingle("spelt puffs", puffedSpelt.id)

        val puffedBarley = catalog.getValue("ingredient-ref-puffed-barley")
        assertEquals("orge soufflée", puffedBarley.nameFr)
        assertTrue(puffedBarley.aliasesEn.isEmpty())
        assertTrue(puffedBarley.aliasesFr.isEmpty())
        assertSingle("puffed barley", puffedBarley.id)
        assertSingle("orge soufflée", puffedBarley.id)

        val wholeRyeFlour = catalog.getValue("ingredient-ref-whole-rye-flour")
        assertEquals("farine entière de seigle", wholeRyeFlour.nameFr)
        assertEquals(listOf("complete rye flour", "whole grain rye flour"), wholeRyeFlour.aliasesEn)
        assertSingle("whole rye flour", wholeRyeFlour.id)
        assertSingle("farine entière de seigle", wholeRyeFlour.id)
        assertSingle("complete rye flour", wholeRyeFlour.id)

        val grahamFlour = catalog.getValue("ingredient-ref-graham-flour")
        assertEquals("farine Graham", grahamFlour.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, grahamFlour.category)
        assertTrue(grahamFlour.aliasesEn.isEmpty())
        assertTrue(grahamFlour.aliasesFr.isEmpty())
        assertSingle("Graham flour", grahamFlour.id)
        assertSingle("farine Graham", grahamFlour.id)
        assertSingle("graham cracker crumbs", "ingredient-ref-graham-cracker-crumbs")

        val wholeBarleyFlour = catalog.getValue("ingredient-ref-whole-barley-flour")
        assertEquals("whole barley flour", wholeBarleyFlour.nameEn)
        assertEquals("farine d'orge entière", wholeBarleyFlour.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, wholeBarleyFlour.category)
        assertTrue(wholeBarleyFlour.aliasesEn.isEmpty())
        assertTrue(wholeBarleyFlour.aliasesFr.isEmpty())
        assertSingle("whole barley flour", wholeBarleyFlour.id)
        assertSingle("farine d'orge entière", wholeBarleyFlour.id)
        assertSingle("T150", "ingredient-ref-french-type-150-flour")

        for (reference in listOf(blackChickpeas, puffedBuckwheat, puffedSpelt, puffedBarley, wholeRyeFlour, grahamFlour, wholeBarleyFlour)) {
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }
        assertTrue(filterByIngredientSearchQuery(references, "puffed oats", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "puffed teff", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "mung bean flour", searchTerms).isEmpty())
    }

    @Test
    fun cookingSauceNamesKeepTheirScopedPickerMatches() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val pesto = catalog.getValue("ingredient-ref-pesto")
        assertEquals("pesto", pesto.nameEn)
        assertEquals("pesto", pesto.nameFr)
        assertEquals(listOf("basil pesto"), pesto.aliasesEn)
        assertEquals(listOf("pesto au basilic"), pesto.aliasesFr)
        assertSingle("pesto", pesto.id)
        assertSingle("basil pesto", pesto.id)
        assertSingle("pesto au basilic", pesto.id)
        assertTrue(filterByIngredientSearchQuery(references, "tomato pesto", searchTerms).isEmpty())

        assertSingle("tapenade", "ingredient-ref-tapenade")
        assertSingle("anchovy paste", "ingredient-ref-anchovy-paste")
        assertSingle("pâte d'anchois", "ingredient-ref-anchovy-paste")
        assertSingle("passata", "ingredient-ref-passata")
        assertSingle("coulis de tomates (passata)", "ingredient-ref-passata")
        assertSingle("bagna cauda", "ingredient-ref-bagna-cauda")
        assertSingle("bagna caoda", "ingredient-ref-bagna-cauda")
    }

    @Test
    fun coconutAndAdoboProductsKeepTheirReviewedIdentityBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val coconutButter = catalog.getValue("ingredient-ref-coconut-butter")
        assertEquals("coconut butter", coconutButter.nameEn)
        assertEquals("beurre de noix de coco", coconutButter.nameFr)
        assertTrue(coconutButter.aliasesEn.isEmpty())
        assertTrue(coconutButter.aliasesFr.isEmpty())
        assertNull(coconutButter.defaultDensity)
        assertTrue(coconutButter.unitMappings.isEmpty())
        assertSingle("coconut butter", coconutButter.id)
        assertSingle("beurre de noix de coco", coconutButter.id)
        assertTrue(filterByIngredientSearchQuery(references, "beurre de coco", searchTerms).isEmpty())

        val adoboSauce = catalog.getValue("ingredient-ref-mexican-adobo-sauce")
        assertEquals("Mexican adobo sauce", adoboSauce.nameEn)
        assertEquals("sauce adobo mexicaine", adoboSauce.nameFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, adoboSauce.category)
        assertTrue(adoboSauce.aliasesEn.isEmpty())
        assertTrue(adoboSauce.aliasesFr.isEmpty())
        assertNull(adoboSauce.defaultDensity)
        assertTrue(adoboSauce.unitMappings.isEmpty())
        assertSingle("Mexican adobo sauce", adoboSauce.id)
        assertSingle("sauce adobo mexicaine", adoboSauce.id)
        for (excludedTerm in listOf("adobo seasoning", "adobo paste", "Filipino adobo", "Mole Adobo")) {
            assertTrue(
                "excluded term: $excludedTerm",
                filterByIngredientSearchQuery(references, excludedTerm, searchTerms).none { it.id == adoboSauce.id }
            )
        }
        assertEquals(
            listOf("ingredient-ref-chipotle-in-adobo"),
            filterByIngredientSearchQuery(references, "chipotle in adobo", searchTerms).map { it.id }
        )
    }

    @Test
    fun sambalOelekKeepsItsSpecificBilingualNameAndSpellingAlias() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val sambal = catalog.getValue("ingredient-ref-sambal-oelek")
        assertEquals("sambal oelek", sambal.nameEn)
        assertEquals("sambal oelek", sambal.nameFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, sambal.category)
        assertEquals(listOf("sambal ulek"), sambal.aliasesEn)
        assertEquals(listOf("sambal ulek"), sambal.aliasesFr)
        assertNull(sambal.defaultDensity)
        assertTrue(sambal.unitMappings.isEmpty())
        assertSingle("sambal oelek", sambal.id)
        assertSingle("sambal ulek", sambal.id)
        assertTrue(filterByIngredientSearchQuery(references, "pâte de piment", searchTerms).none { it.id == sambal.id })
    }

    @Test
    fun sambalMatahUsesItsLocalBorrowedNameWithoutBroadSambalAliases() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val matah = catalog.getValue("ingredient-ref-sambal-matah")

        assertEquals("sambal matah", matah.nameEn)
        assertEquals("sambal matah", matah.nameFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, matah.category)
        assertTrue(matah.aliasesEn.isEmpty())
        assertTrue(matah.aliasesFr.isEmpty())
        assertNull(matah.defaultDensity)
        assertTrue(matah.unitMappings.isEmpty())
        assertEquals(
            listOf(matah.id),
            filterByIngredientSearchQuery(references, "sambal matah", searchTerms).map { it.id }
        )
        assertTrue(filterByIngredientSearchQuery(references, "sambal ulek", searchTerms).none { it.id == matah.id })
    }

    @Test
    fun chunjangUsesItsBorrowedNameWithoutBlackBeanPasteAliases() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val chunjang = catalog.getValue("ingredient-ref-chunjang")

        assertEquals("chunjang", chunjang.nameEn)
        assertEquals("chunjang", chunjang.nameFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, chunjang.category)
        assertTrue(chunjang.aliasesEn.isEmpty())
        assertTrue(chunjang.aliasesFr.isEmpty())
        assertNull(chunjang.defaultDensity)
        assertTrue(chunjang.unitMappings.isEmpty())
        assertEquals(
            listOf(chunjang.id),
            filterByIngredientSearchQuery(references, "Chunjang", searchTerms).map { it.id }
        )
        assertTrue(filterByIngredientSearchQuery(references, "black bean paste", searchTerms).none { it.id == chunjang.id })
        assertEquals(
            listOf("ingredient-ref-black-bean-sauce"),
            filterByIngredientSearchQuery(references, "black bean sauce", searchTerms).map { it.id }
        )
    }

    @Test
    fun chimichurriAndSpeltFlakesKeepTheirBilingualProductBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val chimichurri = catalog.getValue("ingredient-ref-chimichurri-sauce")
        assertEquals("chimichurri sauce", chimichurri.nameEn)
        assertEquals("sauce chimichurri", chimichurri.nameFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, chimichurri.category)
        assertEquals(listOf("chimichurri"), chimichurri.aliasesEn)
        assertEquals(listOf("chimichurri"), chimichurri.aliasesFr)
        assertNull(chimichurri.defaultDensity)
        assertTrue(chimichurri.unitMappings.isEmpty())
        assertEquals(
            listOf(chimichurri.id),
            filterByIngredientSearchQuery(references, "chimichurri", searchTerms).map { it.id }
        )
        assertNotEquals(chimichurri.id, catalog.getValue("ingredient-ref-pesto").id)
        assertNotEquals(chimichurri.id, catalog.getValue("ingredient-ref-zhug").id)

        val speltFlakes = catalog.getValue("ingredient-ref-spelt-flakes")
        assertEquals("spelt flakes", speltFlakes.nameEn)
        assertEquals("flocons d’épeautre", speltFlakes.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, speltFlakes.category)
        assertTrue(speltFlakes.aliasesEn.isEmpty())
        assertTrue(speltFlakes.aliasesFr.isEmpty())
        assertNull(speltFlakes.defaultDensity)
        assertTrue(speltFlakes.unitMappings.isEmpty())
        assertEquals(
            listOf(speltFlakes.id),
            filterByIngredientSearchQuery(references, "spelt flakes", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(speltFlakes.id),
            filterByIngredientSearchQuery(references, "flocons d’épeautre", searchTerms).map { it.id }
        )
        assertNotEquals(speltFlakes.id, catalog.getValue("ingredient-ref-spelt-flour").id)
        assertNotEquals(speltFlakes.id, catalog.getValue("ingredient-ref-puffed-spelt").id)
    }

    @Test
    fun favaBeanFlourUsesTheQuebecGourganeNameAsAnIdentityOnlyReference() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val flour = references.single { it.id == "ingredient-ref-fava-bean-flour" }

        assertEquals("fava bean flour", flour.nameEn)
        assertEquals("farine de gourgane", flour.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, flour.category)
        assertTrue(flour.aliasesEn.isEmpty())
        assertTrue(flour.aliasesFr.isEmpty())
        assertNull(flour.defaultDensity)
        assertTrue(flour.unitMappings.isEmpty())
        assertEquals(
            listOf(flour.id),
            filterByIngredientSearchQuery(references, "fava bean flour", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(flour.id),
            filterByIngredientSearchQuery(references, "farine de gourgane", searchTerms).map { it.id }
        )
    }

    @Test
    fun riceStarchHasItsOwnBilingualIdentityAndSearchesSeparatelyFromRiceFlour() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val starch = references.single { it.id == "ingredient-ref-rice-starch" }
        val riceFlour = references.single { it.id == "ingredient-ref-rice-flour" }

        assertEquals("rice starch", starch.nameEn)
        assertEquals("amidon de riz", starch.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, starch.category)
        assertTrue(starch.aliasesEn.isEmpty())
        assertTrue(starch.aliasesFr.isEmpty())
        assertNull(starch.defaultDensity)
        assertTrue(starch.unitMappings.isEmpty())
        assertNotEquals(starch.id, riceFlour.id)
        val riceStarchProducts = setOf(
            "ingredient-ref-rice-starch",
            "ingredient-ref-modified-rice-starch",
            "ingredient-ref-pregelatinized-rice-starch",
            "ingredient-ref-native-waxy-rice-starch",
        )
        assertEquals(riceStarchProducts, filterByIngredientSearchQuery(references, "rice starch", searchTerms).map { it.id }.toSet())
        assertEquals(riceStarchProducts, filterByIngredientSearchQuery(references, "amidon de riz", searchTerms).map { it.id }.toSet())
    }

    @Test
    fun lizanoSalsaAliasesFindTheNamedSauceWithoutActivatingGenericSalsa() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val lizano = catalog.getValue("ingredient-ref-lizano-sauce")

        assertEquals("Lizano sauce", lizano.nameEn)
        assertEquals("sauce Lizano", lizano.nameFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, lizano.category)
        assertEquals(listOf("Salsa Lizano", "Lizano Salsa"), lizano.aliasesEn)
        assertEquals(listOf("Salsa Lizano"), lizano.aliasesFr)
        assertNull(lizano.defaultDensity)
        assertTrue(lizano.unitMappings.isEmpty())
        assertEquals(listOf(lizano.id), filterByIngredientSearchQuery(references, "Salsa Lizano", searchTerms).map { it.id })
        assertEquals(listOf(lizano.id), filterByIngredientSearchQuery(references, "Lizano Salsa", searchTerms).map { it.id })
        assertEquals(
            setOf(lizano.id, "ingredient-ref-salsa-macha"),
            filterByIngredientSearchQuery(references, "salsa", searchTerms).map { it.id }.toSet(),
        )
        assertTrue(catalog.keys.none { it == "ingredient-ref-salsa" })
    }

    @Test
    fun roastedFlourNamesAndBreadAndButterPickleKeepScopedPickerMatches() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val uridFlour = catalog.getValue("ingredient-ref-roasted-urid-flour")
        assertEquals("roasted urid flour", uridFlour.nameEn)
        assertEquals("farine de haricot urd torréfiée", uridFlour.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, uridFlour.category)
        assertTrue(uridFlour.aliasesEn.isEmpty())
        assertTrue(uridFlour.aliasesFr.isEmpty())
        assertNull(uridFlour.defaultDensity)
        assertTrue(uridFlour.unitMappings.isEmpty())
        assertSingle("roasted urid flour", uridFlour.id)
        assertSingle("farine de haricot urd torréfiée", uridFlour.id)

        val redRiceFlour = catalog.getValue("ingredient-ref-roasted-red-rice-flour")
        assertEquals("roasted red rice flour", redRiceFlour.nameEn)
        assertEquals("farine de riz rouge torréfiée", redRiceFlour.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, redRiceFlour.category)
        assertTrue(redRiceFlour.aliasesEn.isEmpty())
        assertTrue(redRiceFlour.aliasesFr.isEmpty())
        assertNull(redRiceFlour.defaultDensity)
        assertTrue(redRiceFlour.unitMappings.isEmpty())
        assertSingle("roasted red rice flour", redRiceFlour.id)
        assertSingle("farine de riz rouge torréfiée", redRiceFlour.id)

        val pickle = catalog.getValue("ingredient-ref-bread-and-butter-pickle")
        assertEquals("cornichons sucrés", pickle.nameFr)
        assertTrue(pickle.aliasesFr.isEmpty())
        assertSingle("cornichons sucrés", pickle.id)
        assertTrue(filterByIngredientSearchQuery(references, "cornichons bread and butter", searchTerms).isEmpty())
    }

    @Test
    fun regionalFloursAndEastAsianSaucesRemainIdentityOnlyAndSearchable() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        fun assertIdentityOnly(
            id: String,
            nameEn: String,
            nameFr: String,
            category: IngredientCategory,
            expectedSearchIds: Set<String> = setOf(id),
        ) {
            val reference = catalog.getValue(id)
            assertEquals(nameEn, reference.nameEn)
            assertEquals(nameFr, reference.nameFr)
            assertEquals(category, reference.category)
            assertTrue(reference.aliasesEn.isEmpty())
            assertTrue(reference.aliasesFr.isEmpty())
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
            assertEquals(expectedSearchIds, filterByIngredientSearchQuery(references, nameEn, searchTerms).map { it.id }.toSet())
            assertEquals(expectedSearchIds, filterByIngredientSearchQuery(references, nameFr, searchTerms).map { it.id }.toSet())
        }

        assertIdentityOnly(
            "ingredient-ref-breadfruit-flour",
            "breadfruit flour",
            "farine de fruit à pain",
            IngredientCategory.FLOUR_AND_STARCH
        )
        assertIdentityOnly(
            "ingredient-ref-tigernut-flour",
            "tigernut flour",
            "farine de souchet",
            IngredientCategory.FLOUR_AND_STARCH,
            setOf("ingredient-ref-tigernut-flour", "ingredient-ref-defatted-tigernut-flour"),
        )
        assertIdentityOnly(
            "ingredient-ref-yam-flour",
            "yam flour",
            "farine d’igname",
            IngredientCategory.FLOUR_AND_STARCH
        )
        assertIdentityOnly(
            "ingredient-ref-taro-flour",
            "taro flour",
            "farine de taro",
            IngredientCategory.FLOUR_AND_STARCH
        )
        assertIdentityOnly(
            "ingredient-ref-chili-oil",
            "chili oil",
            "huile de piment rouge",
            IngredientCategory.SAUCE_AND_CONDIMENT
        )
        assertIdentityOnly(
            "ingredient-ref-chiu-chow-style-chili-crisp-oil",
            "Chiu Chow Style Chili Crisp Oil",
            "huile au piment croustillante de type Chiu Chow",
            IngredientCategory.SAUCE_AND_CONDIMENT
        )
        assertIdentityOnly(
            "ingredient-ref-xo-sauce",
            "XO sauce",
            "sauce de XO",
            IngredientCategory.SAUCE_AND_CONDIMENT
        )
        assertIdentityOnly(
            "ingredient-ref-sa-cha-sauce",
            "Sa Cha sauce",
            "sauce sa cha",
            IngredientCategory.SAUCE_AND_CONDIMENT
        )
        assertIdentityOnly(
            "ingredient-ref-char-siu-sauce",
            "char siu sauce",
            "sauce char siu",
            IngredientCategory.SAUCE_AND_CONDIMENT
        )

        assertTrue(filterByIngredientSearchQuery(references, "elubo", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "taro powder", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "sha cha", searchTerms).isEmpty())
    }

    @Test
    fun saltIdentitiesKeepProductBoundariesAndUnknownConversions() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val saltIds = listOf(
            "ingredient-ref-salt",
            "ingredient-ref-table-salt",
            "ingredient-ref-fine-sea-salt",
            "ingredient-ref-coarse-sea-salt",
            "ingredient-ref-kosher-salt",
            "ingredient-ref-fleur-de-sel",
            "ingredient-ref-fleur-de-sel-guerande-igp",
            "ingredient-ref-flaky-sea-salt",
            "ingredient-ref-kala-namak",
            "ingredient-ref-smoked-salt"
        )
        saltIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
        }

        assertEquals(listOf("paʻakai"), catalog.getValue("ingredient-ref-salt").aliasesEn)
        assertEquals(listOf("paʻakai"), catalog.getValue("ingredient-ref-salt").aliasesFr)
        assertSingle("table salt", "ingredient-ref-table-salt")
        assertSingle("sel de table", "ingredient-ref-table-salt")
        assertSingle("fine sea salt", "ingredient-ref-fine-sea-salt")
        assertSingle("coarse sea salt", "ingredient-ref-coarse-sea-salt")
        assertSingle("kosher salt", "ingredient-ref-kosher-salt")
        assertSingle("gros sel casher", "ingredient-ref-kosher-salt")
        assertEquals(
            listOf("ingredient-ref-fleur-de-sel", "ingredient-ref-fleur-de-sel-guerande-igp"),
            filterByIngredientSearchQuery(references, "fleur de sel", searchTerms).map { it.id }
        )
        assertSingle("Fleur de sel de Guérande", "ingredient-ref-fleur-de-sel-guerande-igp")
        assertSingle("Fleur-de-Sel de Guérande", "ingredient-ref-fleur-de-sel-guerande-igp")
        assertSingle("flaky sea salt", "ingredient-ref-flaky-sea-salt")
        assertSingle("sea salt flakes", "ingredient-ref-flaky-sea-salt")
        assertSingle("kala namak", "ingredient-ref-kala-namak")
        assertSingle("Himalayan black salt", "ingredient-ref-kala-namak")
        assertSingle("smoked salt", "ingredient-ref-smoked-salt")
        assertSingle("sel de fumage", "ingredient-ref-smoked-salt")
        assertSingle("paʻakai", "ingredient-ref-salt")
    }

    @Test
    fun whiteWholeWheatFlourStaysDistinctFromRefinedWhiteAndAllPurposeFlour() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }

        val whiteWholeWheat = catalog.getValue("ingredient-ref-white-whole-wheat-flour")
        val allPurpose = catalog.getValue("ingredient-ref-all-purpose-flour")

        assertEquals("white whole-wheat flour", whiteWholeWheat.nameEn)
        assertEquals("farine intégrale de blé blanc", whiteWholeWheat.nameFr)
        assertEquals(listOf("hard white whole wheat flour"), whiteWholeWheat.aliasesEn)
        assertTrue(whiteWholeWheat.aliasesFr.isEmpty())
        assertNull(whiteWholeWheat.defaultDensity)
        assertTrue(whiteWholeWheat.unitMappings.isEmpty())
        assertFalse(allPurpose.aliasesFr.contains("farine blanche"))

        assertEquals(listOf(whiteWholeWheat.id), matches("white whole-wheat flour"))
        assertEquals(listOf(whiteWholeWheat.id), matches("hard white whole wheat flour"))
        assertEquals(listOf(whiteWholeWheat.id), matches("farine intégrale de blé blanc"))
        assertTrue(matches("farine tout usage non blanchie").isEmpty())
        assertTrue(matches("farine blanche").isEmpty())
    }

    @Test
    fun nutSeedButtersAndPreparedChestnutAndPoppyProductsKeepDistinctSearchIdentities() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val expected = mapOf(
            "cashew butter" to "ingredient-ref-cashew-butter",
            "macadamia butter" to "ingredient-ref-macadamia-butter",
            "walnut butter" to "ingredient-ref-walnut-butter",
            "pecan butter" to "ingredient-ref-pecan-butter",
            "pine nut butter" to "ingredient-ref-pine-nut-butter",
            "Brazil nut butter" to "ingredient-ref-brazil-nut-butter",
            "pumpkin seed butter" to "ingredient-ref-pumpkin-seed-butter",
            "sunflower seed butter" to "ingredient-ref-sunflower-seed-butter",
            "chestnut puree" to "ingredient-ref-chestnut-puree",
            "sweetened chestnut spread" to "ingredient-ref-sweetened-chestnut-spread",
            "poppy seed filling" to "ingredient-ref-poppy-seed-filling",
        )
        expected.forEach { (query, id) -> assertSingle(query, id) }
        assertSingle("beurre de noix de cajou", "ingredient-ref-cashew-butter")
        assertSingle("beurre de cajous", "ingredient-ref-cashew-butter")
        assertSingle("beurre de macadamia", "ingredient-ref-macadamia-butter")
        assertSingle("beurre de noix de Grenoble", "ingredient-ref-walnut-butter")
        assertSingle("beurre de pacanes", "ingredient-ref-pecan-butter")
        assertSingle("beurre de pignon de pin", "ingredient-ref-pine-nut-butter")
        assertSingle("beurre de noix du Brésil", "ingredient-ref-brazil-nut-butter")
        assertSingle("beurre de graines de citrouille", "ingredient-ref-pumpkin-seed-butter")
        assertSingle("beurre de graines de tournesol", "ingredient-ref-sunflower-seed-butter")
        assertSingle("purée de marrons", "ingredient-ref-chestnut-puree")
        assertSingle("pâte à tartiner aux marrons sucrée", "ingredient-ref-sweetened-chestnut-spread")
        assertSingle("crème de marrons", "ingredient-ref-sweetened-chestnut-spread")
        assertSingle("garniture aux graines de pavot", "ingredient-ref-poppy-seed-filling")
        assertSingle("garniture de graines de pavot", "ingredient-ref-poppy-seed-filling")

        expected.values.distinct().forEach { id ->
            val reference = catalog.getValue(id)
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
        }
        assertNotEquals(catalog.getValue("ingredient-ref-cashews").id, "ingredient-ref-cashew-butter")
        assertNotEquals(catalog.getValue("ingredient-ref-pumpkin-squash-seeds").id, "ingredient-ref-pumpkin-seed-butter")
        assertNotEquals(catalog.getValue("ingredient-ref-poppy-seeds").id, "ingredient-ref-poppy-seed-filling")
    }

    @Test
    fun southAsianIdentitiesKeepProductAndSpeciesBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
        fun assertSingle(query: String, expectedId: String) = assertEquals(query, listOf(expectedId), matches(query))

        val expected = mapOf(
            "cumin seeds" to "ingredient-ref-cumin-seeds",
            "graines de cumin" to "ingredient-ref-cumin-seeds",
            "curry leaves" to "ingredient-ref-curry-leaves",
            "feuilles de cari" to "ingredient-ref-curry-leaves",
            "fenugreek seeds" to "ingredient-ref-fenugreek-seeds",
            "graines de fenugrec" to "ingredient-ref-fenugreek-seeds",
            "ajwain" to "ingredient-ref-ajwain",
            "graines d’ajwain" to "ingredient-ref-ajwain",
            "carom seeds" to "ingredient-ref-ajwain",
            "nigella seeds" to "ingredient-ref-nigella-seeds",
            "graines de nigelle" to "ingredient-ref-nigella-seeds",
            "large cardamom" to "ingredient-ref-large-cardamom",
            "cardamome noire" to "ingredient-ref-large-cardamom",
            "ghee" to "ingredient-ref-ghee",
            "beurre de ghee" to "ingredient-ref-ghee",
            "mustard oil" to "ingredient-ref-mustard-oil",
            "mustard seed oil" to "ingredient-ref-mustard-oil",
            "huile de moutarde" to "ingredient-ref-mustard-oil",
            "finger millet flour" to "ingredient-ref-finger-millet-flour",
            "ragi flour" to "ingredient-ref-finger-millet-flour",
            "farine de ragi" to "ingredient-ref-finger-millet-flour",
            "panch phoron" to "ingredient-ref-panch-phoron",
            "panch phoran" to "ingredient-ref-panch-phoron",
            "rihaakuru" to "ingredient-ref-rihaakuru",
            "timur pepper" to "ingredient-ref-timur-pepper",
            "timur" to "ingredient-ref-timur-pepper",
        )
        expected.forEach { (query, id) -> assertSingle(query, id) }

        assertEquals(
            setOf("ingredient-ref-ground-cumin", "ingredient-ref-cumin-seeds"),
            matches("cumin").toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-ground-cardamom", "ingredient-ref-korarima", "ingredient-ref-large-cardamom"),
            matches("cardamom").toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-finger-millet", "ingredient-ref-finger-millet-flour"),
            matches("ragi").toSet(),
        )
        assertTrue(matches("black cardamom").isEmpty())
        assertTrue(matches("black cumin").isEmpty())
        assertTrue(matches("nolen gur").isEmpty())
        assertSingle("goraka", "ingredient-ref-goraka")
        assertTrue(matches("hikimas").isEmpty())
        assertTrue(matches("jimbu").isEmpty())

        val categories = mapOf(
            "ingredient-ref-cumin-seeds" to IngredientCategory.BAKING_AND_SPICE,
            "ingredient-ref-curry-leaves" to IngredientCategory.HERB,
            "ingredient-ref-fenugreek-seeds" to IngredientCategory.BAKING_AND_SPICE,
            "ingredient-ref-ajwain" to IngredientCategory.BAKING_AND_SPICE,
            "ingredient-ref-nigella-seeds" to IngredientCategory.BAKING_AND_SPICE,
            "ingredient-ref-large-cardamom" to IngredientCategory.BAKING_AND_SPICE,
            "ingredient-ref-ghee" to IngredientCategory.FAT_AND_OIL,
            "ingredient-ref-mustard-oil" to IngredientCategory.FAT_AND_OIL,
            "ingredient-ref-finger-millet-flour" to IngredientCategory.FLOUR_AND_STARCH,
            "ingredient-ref-panch-phoron" to IngredientCategory.BAKING_AND_SPICE,
            "ingredient-ref-rihaakuru" to IngredientCategory.SAUCE_AND_CONDIMENT,
            "ingredient-ref-timur-pepper" to IngredientCategory.BAKING_AND_SPICE,
            "ingredient-ref-goraka" to IngredientCategory.BAKING_AND_SPICE,
        )
        categories.forEach { (id, category) ->
            val reference = catalog.getValue(id)
            assertEquals(category, reference.category)
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
        }
    }

    @Test
    fun regionalFloursAndEastAsianFermentsKeepTheirIdentityBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
        fun assertSingle(query: String, expectedId: String) = assertEquals(query, listOf(expectedId), matches(query))

        assertEquals(
            setOf(
                "ingredient-ref-millet-flour",
                "ingredient-ref-pearl-millet-flour",
                "ingredient-ref-foxtail-millet-flour",
                "ingredient-ref-kodo-millet-flour",
                "ingredient-ref-proso-millet-flour",
            ),
            matches("farine de millet").toSet(),
        )
        assertEquals(
            setOf(
                "ingredient-ref-millet-flour",
                "ingredient-ref-pearl-millet-flour",
                "ingredient-ref-finger-millet-flour",
                "ingredient-ref-foxtail-millet-flour",
                "ingredient-ref-kodo-millet-flour",
                "ingredient-ref-proso-millet-flour",
            ),
            matches("millet flour").toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-fonio-flour", "ingredient-ref-black-fonio-flour"),
            matches("fonio flour").toSet(),
        )
        assertSingle("acha flour", "ingredient-ref-fonio-flour")
        assertEquals(setOf("ingredient-ref-white-fonio", "ingredient-ref-fonio-flour"), matches("acha").toSet())
        assertSingle("Job's tears flour", "ingredient-ref-jobs-tears-flour")
        assertSingle("farine de larmes de Job", "ingredient-ref-jobs-tears-flour")
        assertEquals(setOf("ingredient-ref-jobs-tears", "ingredient-ref-jobs-tears-flour"), matches("Job's tears").toSet())

        assertSingle("douchi", "ingredient-ref-douchi")
        assertSingle("fermented black soybeans", "ingredient-ref-douchi")
        assertSingle("white fermented bean curd", "ingredient-ref-white-fermented-bean-curd")
        assertSingle("tofu blanc fermenté", "ingredient-ref-white-fermented-bean-curd")
        assertSingle("red fermented bean curd", "ingredient-ref-red-fermented-bean-curd")
        assertSingle("tofu fermenté rouge", "ingredient-ref-red-fermented-bean-curd")
        assertEquals(
            setOf("ingredient-ref-white-fermented-bean-curd", "ingredient-ref-red-fermented-bean-curd"),
            matches("fermented bean curd").toSet(),
        )
        assertSingle("Chinese sesame paste", "ingredient-ref-chinese-sesame-paste")
        assertSingle("pâte de sésame à la chinoise", "ingredient-ref-chinese-sesame-paste")
        assertSingle("tahini", "ingredient-ref-tahini")
        assertSingle("gochujang", "ingredient-ref-gochujang")
        assertSingle("pâte de soya fermentée au piment fort (gochujang)", "ingredient-ref-gochujang")
        assertSingle("doenjang", "ingredient-ref-doenjang")
        assertSingle("pâte de soya fermentée coréenne (doenjang)", "ingredient-ref-doenjang")
        assertSingle("ssamjang", "ingredient-ref-ssamjang")
        assertSingle("pâte de soya coréenne assaisonnée (ssamjang)", "ingredient-ref-ssamjang")
        assertEquals(
            setOf("ingredient-ref-gochujang", "ingredient-ref-doenjang"),
            matches("pâte de soya fermentée").toSet(),
        )
        assertSingle("doubanjiang", "ingredient-ref-doubanjiang")
        assertSingle("white miso paste", "ingredient-ref-white-miso-paste")
        assertTrue(matches("fermented black beans").isEmpty())
        assertTrue(matches("fermented soybean paste").isEmpty())
        assertTrue(matches("Korean chili paste").isEmpty())
        assertTrue(matches("sesame sauce").isEmpty())

        val expectedCategories = mapOf(
            "ingredient-ref-millet-flour" to IngredientCategory.FLOUR_AND_STARCH,
            "ingredient-ref-fonio-flour" to IngredientCategory.FLOUR_AND_STARCH,
            "ingredient-ref-jobs-tears-flour" to IngredientCategory.FLOUR_AND_STARCH,
            "ingredient-ref-douchi" to IngredientCategory.SAUCE_AND_CONDIMENT,
            "ingredient-ref-white-fermented-bean-curd" to IngredientCategory.SAUCE_AND_CONDIMENT,
            "ingredient-ref-red-fermented-bean-curd" to IngredientCategory.SAUCE_AND_CONDIMENT,
            "ingredient-ref-chinese-sesame-paste" to IngredientCategory.SAUCE_AND_CONDIMENT,
            "ingredient-ref-gochujang" to IngredientCategory.SAUCE_AND_CONDIMENT,
            "ingredient-ref-doenjang" to IngredientCategory.SAUCE_AND_CONDIMENT,
            "ingredient-ref-ssamjang" to IngredientCategory.SAUCE_AND_CONDIMENT,
        )
        expectedCategories.forEach { (id, category) ->
            val reference = catalog.getValue(id)
            assertEquals(category, reference.category)
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
        }
        assertEquals(listOf("acha flour"), catalog.getValue("ingredient-ref-fonio-flour").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-fonio-flour").aliasesFr.isEmpty())
        assertEquals(listOf("fermented black soybeans"), catalog.getValue("ingredient-ref-douchi").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-douchi").aliasesFr.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-chinese-sesame-paste").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-chinese-sesame-paste").aliasesFr.isEmpty())
        listOf("ingredient-ref-gochujang", "ingredient-ref-doenjang", "ingredient-ref-ssamjang").forEach { id ->
            assertTrue(catalog.getValue(id).aliasesEn.isEmpty())
            assertTrue(catalog.getValue(id).aliasesFr.isEmpty())
        }
    }

    @Test
    fun maltedRyeAndGlutenFlourTermsKeepTheirProductBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }

        val maltedRye = catalog.getValue("ingredient-ref-malted-rye-flour")
        assertEquals("malted rye flour", maltedRye.nameEn)
        assertEquals("farine de seigle malté", maltedRye.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, maltedRye.category)
        assertTrue(maltedRye.aliasesEn.isEmpty())
        assertTrue(maltedRye.aliasesFr.isEmpty())
        assertNull(maltedRye.defaultDensity)
        assertTrue(maltedRye.unitMappings.isEmpty())
        assertEquals(listOf(maltedRye.id), matches("malted rye flour"))
        assertEquals(listOf(maltedRye.id), matches("farine de seigle malté"))

        val vitalGluten = catalog.getValue("ingredient-ref-vital-wheat-gluten")
        assertEquals(listOf("gluten flour"), vitalGluten.aliasesEn)
        assertEquals(listOf("gluten de blé vital", "farine de gluten"), vitalGluten.aliasesFr)
        assertEquals(
            setOf("ingredient-ref-vital-wheat-gluten", "ingredient-ref-high-gluten-flour"),
            matches("gluten flour").toSet(),
        )
        assertEquals(listOf(vitalGluten.id), matches("farine de gluten"))
        assertEquals(listOf("ingredient-ref-high-gluten-flour"), matches("high-gluten flour"))
        assertTrue(matches("malt flour").contains("ingredient-ref-roasted-wheat-malt-flour"))
        assertFalse(matches("malt flour").contains(maltedRye.id))

        val maltFlour = catalog.getValue("ingredient-ref-malt-flour")
        assertEquals("malt flour", maltFlour.nameEn)
        assertEquals("farine maltée", maltFlour.nameFr)
        assertEquals(listOf("malted cereal flour"), maltFlour.aliasesEn)
        assertTrue(maltFlour.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, maltFlour.category)
        assertNull(maltFlour.defaultDensity)
        assertTrue(maltFlour.unitMappings.isEmpty())
        listOf("malt flour", "malted cereal flour", "farine maltée", "farine maltee").forEach { query ->
            assertTrue("$query should include the generic malt-flour identity", matches(query).contains(maltFlour.id))
        }
        assertEquals(
            setOf(
                maltFlour.id,
                "ingredient-ref-light-caramelized-barley-malt-flour",
                "ingredient-ref-malted-spelt-flour",
                "ingredient-ref-roasted-barley-malt-flour",
                "ingredient-ref-roasted-oat-malt-flour",
                "ingredient-ref-roasted-wheat-malt-flour",
            ),
            matches("malt flour").toSet(),
        )
    }

    @Test
    fun shioKojiUsesOnlySourceAttestedAliasesAndDoesNotClaimGenericKoji() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }

        val shioKoji = catalog.getValue("ingredient-ref-shio-koji")
        assertEquals("shio koji", shioKoji.nameEn)
        assertEquals("shio koji", shioKoji.nameFr)
        assertEquals(listOf("salt koji"), shioKoji.aliasesEn)
        assertEquals(listOf("koji au sel"), shioKoji.aliasesFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, shioKoji.category)
        assertNull(shioKoji.defaultDensity)
        assertTrue(shioKoji.unitMappings.isEmpty())
        listOf("shio koji", "salt koji", "koji au sel").forEach { query ->
            assertEquals(query, listOf(shioKoji.id), matches(query))
        }
        assertTrue("bare koji may surface shio koji by phrase matching", matches("koji").contains(shioKoji.id))
        assertFalse(shioKoji.aliasesEn.contains("koji"))
        assertFalse(shioKoji.aliasesFr.contains("koji"))
    }

    @Test
    fun japaneseCondimentsKeepExactAndBroadSearchBoundaries() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        assertEquals(
            setOf("ingredient-ref-miso", "ingredient-ref-white-miso-paste"),
            filterByIngredientSearchQuery(references, "miso", searchTerms).map { it.id }.toSet()
        )
        assertSingle("pâte de miso", "ingredient-ref-miso")
        assertSingle("white miso paste", "ingredient-ref-white-miso-paste")
        assertSingle("ponzu sauce", "ingredient-ref-ponzu-sauce")
        assertSingle("sauce ponzu", "ingredient-ref-ponzu-sauce")
        assertSingle("mentsuyu", "ingredient-ref-mentsuyu")
        assertSingle("shiro dashi", "ingredient-ref-shiro-dashi")
        assertSingle("teriyaki sauce", "ingredient-ref-teriyaki-sauce")
        assertSingle("sauce teriyaki", "ingredient-ref-teriyaki-sauce")
        assertSingle("yuzu chili paste", "ingredient-ref-yuzu-kosho")
        assertSingle("piment au yuzu", "ingredient-ref-yuzu-kosho")
        assertEquals(
            setOf("ingredient-ref-yuzu", "ingredient-ref-yuzu-kosho"),
            filterByIngredientSearchQuery(references, "yuzu", searchTerms).map { it.id }.toSet()
        )
        assertSingle("umeboshi", "ingredient-ref-umeboshi")
        assertSingle("Japanese pickled plum", "ingredient-ref-umeboshi")
        assertSingle("beni shoga", "ingredient-ref-beni-shoga")
        assertSingle("red pickled ginger", "ingredient-ref-beni-shoga")
        assertEquals(
            setOf("ingredient-ref-gari", "ingredient-ref-japanese-gari"),
            filterByIngredientSearchQuery(references, "gari", searchTerms).map { it.id }.toSet()
        )
        assertSingle("Japanese gari", "ingredient-ref-japanese-gari")
        assertSingle("garri", "ingredient-ref-gari")
    }

    @Test
    fun andeanTubersKeepIdentityAndAliasBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val oca = catalog.getValue("ingredient-ref-oca")
        assertEquals("oca", oca.nameEn)
        assertEquals("oca", oca.nameFr)
        assertTrue(oca.aliasesEn.isEmpty())
        assertTrue(oca.aliasesFr.isEmpty())

        val ulluco = catalog.getValue("ingredient-ref-ulluco")
        assertEquals("ulluco", ulluco.nameEn)
        assertEquals("ulluque", ulluco.nameFr)
        assertEquals(listOf("papa lisa", "melloca"), ulluco.aliasesEn)
        assertTrue(ulluco.aliasesFr.isEmpty())

        val mashua = catalog.getValue("ingredient-ref-mashua")
        assertEquals("mashua", mashua.nameEn)
        assertEquals("capucine tubéreuse", mashua.nameFr)
        assertEquals(listOf("tuberous nasturtium"), mashua.aliasesEn)
        assertTrue(mashua.aliasesFr.isEmpty())

        listOf(oca, ulluco, mashua).forEach { reference ->
            assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }

        assertSingle("oca", oca.id)
        assertSingle("ulluco", ulluco.id)
        assertSingle("ulluque", ulluco.id)
        assertSingle("papa lisa", ulluco.id)
        assertSingle("melloca", ulluco.id)
        assertSingle("mashua", mashua.id)
        assertSingle("capucine tubéreuse", mashua.id)
        assertSingle("tuberous nasturtium", mashua.id)
        assertFalse(filterByIngredientSearchQuery(references, "ruba", searchTerms).any { it.id in setOf(oca.id, ulluco.id) })
        assertFalse(filterByIngredientSearchQuery(references, "cubio", searchTerms).any { it.id in setOf(oca.id, mashua.id) })
    }

    @Test
    fun recentCatalogIdentitiesAndAliasesKeepTheirSearchBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        fun assertMatches(query: String, expectedIds: Set<String>) {
            assertEquals(
                "query: $query",
                expectedIds,
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }.toSet()
            )
        }

        val identityOnlyIds = listOf(
            "ingredient-ref-cashews",
            "ingredient-ref-macadamia-nuts",
            "ingredient-ref-sweet-chestnuts",
            "ingredient-ref-mustard-greens",
            "ingredient-ref-turnip-greens",
            "ingredient-ref-beet-greens",
            "ingredient-ref-dandelion-greens",
            "ingredient-ref-arugula",
            "ingredient-ref-watercress",
            "ingredient-ref-common-sorrel",
            "ingredient-ref-belgian-endive",
            "ingredient-ref-escarole",
            "ingredient-ref-radicchio",
            "ingredient-ref-arctic-char",
            "ingredient-ref-american-eel",
            "ingredient-ref-blackberry",
            "ingredient-ref-black-currant",
            "ingredient-ref-red-currant",
            "ingredient-ref-white-currant",
            "ingredient-ref-gooseberry",
            "ingredient-ref-elderberry",
            "ingredient-ref-lingonberry",
            "ingredient-ref-cloudberry",
            "ingredient-ref-red-onion",
            "ingredient-ref-white-onion",
            "ingredient-ref-garlic-scape",
            "ingredient-ref-horseradish",
            "ingredient-ref-prepared-horseradish",
            "ingredient-ref-greater-galangal",
            "ingredient-ref-lemongrass",
            "ingredient-ref-taro",
            "ingredient-ref-malanga",
            "ingredient-ref-yam",
            "ingredient-ref-white-salsify",
            "ingredient-ref-black-salsify",
            "ingredient-ref-russet-potato",
            "ingredient-ref-cherry-tomato",
            "ingredient-ref-plum-tomato",
            "ingredient-ref-tomatillo",
            "ingredient-ref-eggplant",
            "ingredient-ref-zucchini",
            "ingredient-ref-summer-squash",
            "ingredient-ref-pumpkin",
            "ingredient-ref-butternut-squash",
            "ingredient-ref-acorn-squash",
            "ingredient-ref-spaghetti-squash",
            "ingredient-ref-bitter-melon",
            "ingredient-ref-winter-melon",
            "ingredient-ref-bottle-gourd",
            "ingredient-ref-ridge-gourd",
            "ingredient-ref-chayote",
            "ingredient-ref-okra",
            "ingredient-ref-orange",
            "ingredient-ref-lime",
            "ingredient-ref-grapefruit",
            "ingredient-ref-pomelo",
            "ingredient-ref-citron-cedrat",
            "ingredient-ref-yellow-onion",
            "ingredient-ref-spanish-onion",
            "ingredient-ref-sweet-onion",
            "ingredient-ref-fingerroot",
            "ingredient-ref-wasabi-root",
            "ingredient-ref-mandarin",
            "ingredient-ref-clementine",
            "ingredient-ref-kumquat",
            "ingredient-ref-yuzu",
            "ingredient-ref-sudachi",
            "ingredient-ref-calamansi",
            "ingredient-ref-bergamot",
            "ingredient-ref-finger-lime",
            "ingredient-ref-bitter-orange",
            "ingredient-ref-shiitake-mushroom",
            "ingredient-ref-oyster-mushroom",
            "ingredient-ref-chanterelle-mushroom",
            "ingredient-ref-morel-mushroom",
            "ingredient-ref-king-oyster-mushroom",
            "ingredient-ref-enoki-mushroom",
            "ingredient-ref-maitake-mushroom",
            "ingredient-ref-culinary-truffle",
            "ingredient-ref-atlantic-cod",
            "ingredient-ref-haddock",
            "ingredient-ref-atlantic-halibut",
            "ingredient-ref-american-plaice",
            "ingredient-ref-channel-catfish",
            "ingredient-ref-pacific-halibut",
            "ingredient-ref-walleye",
            "ingredient-ref-northern-pike",
            "ingredient-ref-yellow-perch",
            "ingredient-ref-rainbow-trout",
            "ingredient-ref-white-hake",
            "ingredient-ref-atlantic-herring",
            "ingredient-ref-apple",
            "ingredient-ref-pear",
            "ingredient-ref-asimina",
            "ingredient-ref-prickly-pear",
            "ingredient-ref-chokecherry",
            "ingredient-ref-haskap-berry",
            "ingredient-ref-mamey-sapote",
            "ingredient-ref-black-sapote",
            "ingredient-ref-white-sapote",
            "ingredient-ref-baobab-fruit-pulp",
            "ingredient-ref-maqui-berry",
            "ingredient-ref-cocona",
            "ingredient-ref-peach",
            "ingredient-ref-nectarine",
            "ingredient-ref-plum",
            "ingredient-ref-apricot",
            "ingredient-ref-grapes",
            "ingredient-ref-fig",
            "ingredient-ref-dates",
            "ingredient-ref-dried-apricot",
            "ingredient-ref-dried-fig",
            "ingredient-ref-prune",
            "ingredient-ref-dried-dates",
            "ingredient-ref-dried-currants",
            "ingredient-ref-dried-tart-cherries",
            "ingredient-ref-dried-barberry",
            "ingredient-ref-dried-wolfberry",
            "ingredient-ref-dried-sweet-cherries",
            "ingredient-ref-bunashimeji-mushroom",
            "ingredient-ref-wood-ear-mushroom",
            "ingredient-ref-snow-fungus",
            "ingredient-ref-straw-mushroom",
            "ingredient-ref-lions-mane-mushroom",
            "ingredient-ref-cremini-mushroom",
            "ingredient-ref-portobello-mushroom",
            "ingredient-ref-sultana-raisins",
            "ingredient-ref-huitlacoche",
            "ingredient-ref-nori",
            "ingredient-ref-kombu",
            "ingredient-ref-arame",
            "ingredient-ref-sea-lettuce",
            "ingredient-ref-dulse",
            "ingredient-ref-wakame",
            "ingredient-ref-alaria-esculenta",
            "ingredient-ref-citrus-zest",
            "ingredient-ref-alaska-pollock",
            "ingredient-ref-atlantic-mackerel",
            "ingredient-ref-pacific-mackerel",
            "ingredient-ref-spotted-spanish-mackerel",
            "ingredient-ref-persimmon",
            "ingredient-ref-pomegranate",
            "ingredient-ref-quince",
            "ingredient-ref-medlar",
            "ingredient-ref-rhubarb",
            "ingredient-ref-watermelon",
            "ingredient-ref-plantain",
            "ingredient-ref-green-banana-flour",
            "ingredient-ref-green-plantain-flour",
            "ingredient-ref-shito",
            "ingredient-ref-awaze",
            "ingredient-ref-mitmita",
            "ingredient-ref-tapioca-pearls",
            "ingredient-ref-ogiri-egusi",
            "ingredient-ref-papaya",
            "ingredient-ref-guava",
            "ingredient-ref-passion-fruit",
            "ingredient-ref-lychee",
            "ingredient-ref-longan",
            "ingredient-ref-rambutan",
            "ingredient-ref-pitaya",
            "ingredient-ref-kiwi",
            "ingredient-ref-star-fruit",
            "ingredient-ref-tamarind",
            "ingredient-ref-breadfruit",
            "ingredient-ref-durian",
            "ingredient-ref-mangosteen",
            "ingredient-ref-soursop",
            "ingredient-ref-cherimoya",
            "ingredient-ref-sapodilla",
            "ingredient-ref-wheat-meal",
            "ingredient-ref-whole-spelt-flour",
            "ingredient-ref-bacon",
            "ingredient-ref-pancetta",
            "ingredient-ref-guanciale",
            "ingredient-ref-prosciutto",
            "ingredient-ref-acerola",
            "ingredient-ref-italian-type-00-flour",
            "ingredient-ref-italian-type-0-flour",
            "ingredient-ref-italian-type-1-flour",
            "ingredient-ref-italian-type-2-flour",
            "ingredient-ref-brazil-polvilho-doce",
            "ingredient-ref-brazil-polvilho-azedo",
            "ingredient-ref-french-type-45-flour",
            "ingredient-ref-french-type-55-flour",
            "ingredient-ref-french-type-65-flour",
            "ingredient-ref-french-type-80-flour",
            "ingredient-ref-french-type-110-flour",
            "ingredient-ref-french-type-150-flour",
            "ingredient-ref-cashew-butter",
            "ingredient-ref-macadamia-butter",
            "ingredient-ref-walnut-butter",
            "ingredient-ref-pecan-butter",
            "ingredient-ref-pine-nut-butter",
            "ingredient-ref-brazil-nut-butter",
            "ingredient-ref-pumpkin-seed-butter",
            "ingredient-ref-sunflower-seed-butter",
            "ingredient-ref-chestnut-puree",
            "ingredient-ref-sweetened-chestnut-spread",
            "ingredient-ref-poppy-seed-filling",
            "ingredient-ref-crab-claws",
            "ingredient-ref-breaded-butterfly-shrimp",
            "ingredient-ref-coconut-butterfly-shrimp",
            "ingredient-ref-pecorino-romano-pdo",
            "ingredient-ref-pomodoro-san-marzano-pdo",
            "ingredient-ref-emmer-semolina",
            "ingredient-ref-ossau-iraty-pdo"
        )
        identityOnlyIds.forEach { id ->
            val reference = catalog.getValue(id)
            val expectedCategory = when (id) {
                "ingredient-ref-cashews",
                "ingredient-ref-macadamia-nuts",
                "ingredient-ref-sweet-chestnuts",
                "ingredient-ref-dried-apricot",
                "ingredient-ref-dried-fig",
                "ingredient-ref-prune",
                "ingredient-ref-dried-dates",
                "ingredient-ref-dried-currants",
                "ingredient-ref-dried-tart-cherries",
                "ingredient-ref-dried-barberry",
                "ingredient-ref-dried-wolfberry",
                "ingredient-ref-dried-sweet-cherries",
                "ingredient-ref-baobab-fruit-pulp" -> IngredientCategory.NUT_SEED_AND_DRIED_FRUIT
                "ingredient-ref-chestnut-puree",
                "ingredient-ref-sweetened-chestnut-spread" -> IngredientCategory.NUT_SEED_AND_DRIED_FRUIT
                "ingredient-ref-arctic-char",
                "ingredient-ref-american-eel",
                "ingredient-ref-american-plaice",
                "ingredient-ref-channel-catfish",
                "ingredient-ref-pacific-halibut",
                "ingredient-ref-walleye",
                "ingredient-ref-northern-pike",
                "ingredient-ref-yellow-perch",
                "ingredient-ref-crab-claws",
                "ingredient-ref-breaded-butterfly-shrimp",
                "ingredient-ref-coconut-butterfly-shrimp" -> IngredientCategory.PROTEIN
                "ingredient-ref-pecorino-romano-pdo",
                "ingredient-ref-ossau-iraty-pdo" -> IngredientCategory.CHEESE
                "ingredient-ref-bacon",
                "ingredient-ref-pancetta",
                "ingredient-ref-guanciale",
                "ingredient-ref-prosciutto" -> IngredientCategory.PROTEIN
                "ingredient-ref-blackberry",
                "ingredient-ref-black-currant",
                "ingredient-ref-red-currant",
                "ingredient-ref-white-currant",
                "ingredient-ref-gooseberry",
                "ingredient-ref-elderberry",
                "ingredient-ref-lingonberry",
                "ingredient-ref-cloudberry" -> IngredientCategory.FRUIT
                "ingredient-ref-mamey-sapote",
                "ingredient-ref-black-sapote",
                "ingredient-ref-white-sapote",
                "ingredient-ref-maqui-berry",
                "ingredient-ref-cocona" -> IngredientCategory.FRUIT
                "ingredient-ref-wheat-meal",
                "ingredient-ref-whole-spelt-flour",
                "ingredient-ref-italian-type-00-flour",
                "ingredient-ref-italian-type-0-flour",
                "ingredient-ref-italian-type-1-flour",
                "ingredient-ref-italian-type-2-flour",
                "ingredient-ref-brazil-polvilho-doce",
                "ingredient-ref-brazil-polvilho-azedo",
                "ingredient-ref-tapioca-pearls",
                "ingredient-ref-french-type-45-flour",
                "ingredient-ref-french-type-55-flour",
                "ingredient-ref-french-type-65-flour",
                "ingredient-ref-french-type-80-flour",
                "ingredient-ref-french-type-110-flour",
                "ingredient-ref-french-type-150-flour",
                "ingredient-ref-green-banana-flour",
                "ingredient-ref-green-plantain-flour",
                "ingredient-ref-emmer-semolina",
                "ingredient-ref-kudzu-starch",
                "ingredient-ref-sweet-potato-starch",
                "ingredient-ref-mung-bean-starch",
                "ingredient-ref-lotus-root-starch" -> IngredientCategory.FLOUR_AND_STARCH
                "ingredient-ref-merguez-sausage",
                "ingredient-ref-biltong" -> IngredientCategory.PROTEIN
                "ingredient-ref-cassava-leaves" -> IngredientCategory.VEGETABLE_AND_AROMATIC
                "ingredient-ref-prepared-horseradish" -> IngredientCategory.SAUCE_AND_CONDIMENT
                "ingredient-ref-safou" -> IngredientCategory.FRUIT
                "ingredient-ref-soumbala" -> IngredientCategory.SAUCE_AND_CONDIMENT
                "ingredient-ref-shito" -> IngredientCategory.SAUCE_AND_CONDIMENT
                "ingredient-ref-awaze" -> IngredientCategory.SAUCE_AND_CONDIMENT
                "ingredient-ref-ogiri-egusi" -> IngredientCategory.SAUCE_AND_CONDIMENT
                "ingredient-ref-mitmita" -> IngredientCategory.BAKING_AND_SPICE
                "ingredient-ref-ogbono-kernels" -> IngredientCategory.NUT_SEED_AND_DRIED_FRUIT
                "ingredient-ref-berbere" -> IngredientCategory.BAKING_AND_SPICE
                "ingredient-ref-niter-kibbeh" -> IngredientCategory.FAT_AND_OIL
                "ingredient-ref-cashew-butter",
                "ingredient-ref-macadamia-butter",
                "ingredient-ref-walnut-butter",
                "ingredient-ref-pecan-butter",
                "ingredient-ref-pine-nut-butter",
                "ingredient-ref-brazil-nut-butter",
                "ingredient-ref-pumpkin-seed-butter",
                "ingredient-ref-sunflower-seed-butter" -> IngredientCategory.FAT_AND_OIL
                "ingredient-ref-poppy-seed-filling" -> IngredientCategory.BAKING_MIXIN_AND_PANTRY
                "ingredient-ref-orange",
                "ingredient-ref-lime",
                "ingredient-ref-grapefruit",
                "ingredient-ref-pomelo",
                "ingredient-ref-citron-cedrat",
                "ingredient-ref-mandarin",
                "ingredient-ref-clementine",
                "ingredient-ref-kumquat",
                "ingredient-ref-yuzu",
                "ingredient-ref-sudachi",
                "ingredient-ref-calamansi",
                "ingredient-ref-bergamot",
                "ingredient-ref-finger-lime",
                "ingredient-ref-bitter-orange" -> IngredientCategory.FRUIT
                "ingredient-ref-apple",
                "ingredient-ref-pear",
                "ingredient-ref-asimina",
                "ingredient-ref-prickly-pear",
                "ingredient-ref-chokecherry",
                "ingredient-ref-haskap-berry",
                "ingredient-ref-peach",
                "ingredient-ref-nectarine",
                "ingredient-ref-plum",
                "ingredient-ref-apricot",
                "ingredient-ref-grapes",
                "ingredient-ref-fig",
                "ingredient-ref-dates",
                "ingredient-ref-persimmon",
                "ingredient-ref-pomegranate",
                "ingredient-ref-quince",
                "ingredient-ref-medlar",
                "ingredient-ref-watermelon",
                "ingredient-ref-plantain",
                "ingredient-ref-papaya",
                "ingredient-ref-guava",
                "ingredient-ref-passion-fruit",
                "ingredient-ref-lychee",
                "ingredient-ref-longan",
                "ingredient-ref-rambutan",
                "ingredient-ref-pitaya",
                "ingredient-ref-kiwi",
                "ingredient-ref-star-fruit",
                "ingredient-ref-tamarind",
                "ingredient-ref-breadfruit",
                "ingredient-ref-durian",
                "ingredient-ref-mangosteen",
                "ingredient-ref-soursop",
                "ingredient-ref-cherimoya",
                "ingredient-ref-sapodilla",
                "ingredient-ref-acerola" -> IngredientCategory.FRUIT
                "ingredient-ref-huitlacoche" -> IngredientCategory.VEGETABLE_AND_AROMATIC
                "ingredient-ref-sultana-raisins" -> IngredientCategory.NUT_SEED_AND_DRIED_FRUIT
                "ingredient-ref-rhubarb" -> IngredientCategory.VEGETABLE_AND_AROMATIC
                "ingredient-ref-atlantic-cod",
                "ingredient-ref-haddock",
                "ingredient-ref-atlantic-halibut",
                "ingredient-ref-rainbow-trout",
                "ingredient-ref-white-hake",
                "ingredient-ref-atlantic-herring",
                "ingredient-ref-alaska-pollock",
                "ingredient-ref-atlantic-mackerel",
                "ingredient-ref-pacific-mackerel",
                "ingredient-ref-spotted-spanish-mackerel" -> IngredientCategory.PROTEIN
                "ingredient-ref-citrus-zest" -> IngredientCategory.SAUCE_AND_CONDIMENT
                "ingredient-ref-lemongrass" -> IngredientCategory.HERB
                else -> IngredientCategory.VEGETABLE_AND_AROMATIC
            }
            assertEquals(expectedCategory, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }
        assertMatches(
            "noix de cajou",
            setOf("ingredient-ref-cashews", "ingredient-ref-cashew-butter", "ingredient-ref-cashew-flour")
        )
        assertSingle("noix de macadamia", "ingredient-ref-macadamia-nuts")
        assertMatches(
            "marrons",
            setOf(
                "ingredient-ref-sweet-chestnuts",
                "ingredient-ref-chestnut-puree",
                "ingredient-ref-sweetened-chestnut-spread",
            )
        )
        assertSingle("noix de pacane", "ingredient-ref-pecans")
        assertSingle("cacahuète", "ingredient-ref-peanuts")
        assertSingle("tipo 00", "ingredient-ref-italian-type-00-flour")
        assertTrue(filterByIngredientSearchQuery(references, "Tipo 00 pizza flour", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "farine à pizza Tipo « 00 »", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "farine de type 00 (Italie)", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "farine de type 0 (Italie)", searchTerms).isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-italian-type-0-flour").aliasesFr.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-italian-type-00-flour").aliasesFr.isEmpty())
        assertFalse(catalog.getValue("ingredient-ref-italian-type-00-flour").aliasesEn.contains("Tipo 00 pizza flour"))
        assertSingle("French type 55 flour", "ingredient-ref-french-type-55-flour")
        assertSingle("French type 65 flour", "ingredient-ref-french-type-65-flour")
        assertSingle("merguez", "ingredient-ref-merguez-sausage")
        assertSingle("merghez", "ingredient-ref-merguez-sausage")
        assertSingle("feuilles de manioc", "ingredient-ref-cassava-leaves")
        assertSingle("safou", "ingredient-ref-safou")
        assertSingle("atanga", "ingredient-ref-safou")
        assertSingle("soumbala", "ingredient-ref-soumbala")
        assertSingle("ogbono kernels", "ingredient-ref-ogbono-kernels")
        assertSingle("graines d’ogbono", "ingredient-ref-ogbono-kernels")
        assertSingle("berbere powder", "ingredient-ref-berbere")
        assertSingle("niter kibbeh", "ingredient-ref-niter-kibbeh")
        assertSingle("biltong", "ingredient-ref-biltong")
        assertSingle("kudzu starch", "ingredient-ref-kudzu-starch")
        assertSingle("kuzu starch", "ingredient-ref-kudzu-starch")
        assertSingle("kouzou", "ingredient-ref-kudzu-starch")
        assertMatches(
            "sweet potato starch",
            setOf("ingredient-ref-sweet-potato-starch", "ingredient-ref-sweet-potato-starch-noodles")
        )
        assertMatches(
            "fécule de patate douce",
            setOf("ingredient-ref-sweet-potato-starch", "ingredient-ref-sweet-potato-starch-noodles")
        )
        assertSingle("mung bean starch", "ingredient-ref-mung-bean-starch")
        assertSingle("amidon de haricot mungo", "ingredient-ref-mung-bean-starch")
        assertSingle("lotus root starch", "ingredient-ref-lotus-root-starch")
        assertSingle("amidon de racine de lotus", "ingredient-ref-lotus-root-starch")
        assertSingle("sweet cassava starch (polvilho doce)", "ingredient-ref-brazil-polvilho-doce")
        assertSingle("polvilho doce", "ingredient-ref-brazil-polvilho-doce")
        assertSingle("sour cassava starch (polvilho azedo)", "ingredient-ref-brazil-polvilho-azedo")
        assertSingle("polvilho azedo", "ingredient-ref-brazil-polvilho-azedo")
        assertSingle("farine de polvilho azedo", "ingredient-ref-brazil-polvilho-azedo")
        assertSingle("green banana flour", "ingredient-ref-green-banana-flour")
        assertSingle("farine de banane verte", "ingredient-ref-green-banana-flour")
        assertSingle("green plantain flour", "ingredient-ref-green-plantain-flour")
        assertSingle("farine de banane plantain verte", "ingredient-ref-green-plantain-flour")
        assertSingle("shito", "ingredient-ref-shito")
        assertSingle("shito sauce", "ingredient-ref-shito")
        assertSingle("sauce au piment ghanéenne", "ingredient-ref-shito")
        assertSingle("awaze", "ingredient-ref-awaze")
        assertSingle("awaze sauce", "ingredient-ref-awaze")
        assertSingle("awaze paste", "ingredient-ref-awaze")
        assertEquals(listOf("awaze sauce", "awaze paste"), catalog.getValue("ingredient-ref-awaze").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-awaze").aliasesFr.isEmpty())
        assertSingle("mitmita", "ingredient-ref-mitmita")
        assertSingle("mitmita powder", "ingredient-ref-mitmita")
        assertEquals(listOf("mitmita powder"), catalog.getValue("ingredient-ref-mitmita").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-mitmita").aliasesFr.isEmpty())
        assertSingle("garri", "ingredient-ref-gari")
        assertEquals(listOf("garri"), catalog.getValue("ingredient-ref-gari").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-gari").aliasesFr.isEmpty())
        assertSingle("tapioca pearls", "ingredient-ref-tapioca-pearls")
        assertSingle("tapioca ball", "ingredient-ref-tapioca-pearls")
        assertSingle("perles de tapioca", "ingredient-ref-tapioca-pearls")
        assertSingle("perle de tapioca", "ingredient-ref-tapioca-pearls")
        assertEquals(listOf("tapioca ball"), catalog.getValue("ingredient-ref-tapioca-pearls").aliasesEn)
        assertEquals(listOf("perle de tapioca"), catalog.getValue("ingredient-ref-tapioca-pearls").aliasesFr)
        assertEquals(
            setOf(
                "ingredient-ref-tapioca-starch",
                "ingredient-ref-modified-tapioca-starch",
                "ingredient-ref-resistant-tapioca-starch",
                "ingredient-ref-tapioca-pearls",
                "ingredient-ref-brazil-tapioca-granulada",
                "ingredient-ref-native-waxy-tapioca-starch",
            ),
            filterByIngredientSearchQuery(references, "tapioca", searchTerms).map { it.id }.toSet()
        )
        assertMatches(
            "tapioca starch",
            setOf("ingredient-ref-tapioca-starch", "ingredient-ref-modified-tapioca-starch", "ingredient-ref-resistant-tapioca-starch", "ingredient-ref-native-waxy-tapioca-starch"),
        )
        assertTrue(filterByIngredientSearchQuery(references, "bulle de tapioca", searchTerms).isEmpty())
        assertSingle("ogiri-egusi", "ingredient-ref-ogiri-egusi")
        assertSingle("ogiri egusi", "ingredient-ref-ogiri-egusi")
        assertSingle("ogiri", "ingredient-ref-ogiri-egusi")
        assertTrue(filterByIngredientSearchQuery(references, "ogiri-isi", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "avrouda", searchTerms).isEmpty())
        assertEquals(
            listOf("ingredient-ref-egusi-seeds", "ingredient-ref-ogiri-egusi"),
            filterByIngredientSearchQuery(references, "egusi", searchTerms).map { it.id }
        )
        assertSingle("berbere", "ingredient-ref-berbere")
        assertSingle("chili powder", "ingredient-ref-chili-powder")
        assertTrue(filterByIngredientSearchQuery(references, "Ethiopian chili powder", searchTerms).isEmpty())
        assertEquals(
            setOf("ingredient-ref-shito", "ingredient-ref-scotch-bonnet-pepper-sauce"),
            filterByIngredientSearchQuery(references, "pepper sauce", searchTerms).map { it.id }.toSet(),
        )
        assertTrue(filterByIngredientSearchQuery(references, "Ethiopian hot sauce", searchTerms).isEmpty())
        assertMatches("almond flour", setOf("ingredient-ref-almond-flour", "ingredient-ref-defatted-almond-flour"))
        assertMatches("farine d'amande", setOf("ingredient-ref-almond-flour", "ingredient-ref-defatted-almond-flour"))
        assertSingle("poudre d'amandes", "ingredient-ref-almond-flour")
        assertTrue(filterByIngredientSearchQuery(references, "ground almonds", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "almond meal", searchTerms).isEmpty())
        assertEquals(
            listOf("ingredient-ref-almonds", "ingredient-ref-honey-bunches-of-oats-with-almonds-cereal"),
            filterByIngredientSearchQuery(references, "almonds", searchTerms).map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-resistant-green-banana-starch"),
            filterByIngredientSearchQuery(references, "banana starch", searchTerms).map { it.id },
        )
        assertTrue(filterByIngredientSearchQuery(references, "plantain starch", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "ripe plantain flour", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "shito mix", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "mako red", searchTerms).isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-green-banana-flour").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-green-banana-flour").aliasesFr.isEmpty())
        assertEquals(listOf("plantain flour"), catalog.getValue("ingredient-ref-green-plantain-flour").aliasesEn)
        assertEquals(listOf("farine de plantain"), catalog.getValue("ingredient-ref-green-plantain-flour").aliasesFr)
        assertEquals(listOf("shito sauce"), catalog.getValue("ingredient-ref-shito").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-shito").aliasesFr.isEmpty())
        assertSingle("farine de type 110 (France)", "ingredient-ref-french-type-110-flour")
        assertSingle("T150", "ingredient-ref-french-type-150-flour")
        assertTrue(filterByIngredientSearchQuery(references, "T50", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "T55", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "T65", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "farine T55", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "farine T65", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "style 00", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "gruau 45", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "sweet tapioca starch", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "sour tapioca starch", searchTerms).isEmpty())

        assertEquals(
            setOf("ingredient-ref-grapes", "ingredient-ref-dried-currants", "ingredient-ref-grape-juice", "ingredient-ref-grape-seed-flour", "ingredient-ref-grapeseed-oil", "ingredient-ref-kelloggs-two-scoops-raisin-bran", "ingredient-ref-kelloggs-two-scoops-raisin-bran-crunch-cereal", "ingredient-ref-quaker-harvest-crunch-light-crisp-raisin-almond-granola-cereal", "ingredient-ref-quaker-harvest-crunch-raisin-almond-cereal"),
            filterByIngredientSearchQuery(references, "raisin", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-raisins", "ingredient-ref-dried-currants", "ingredient-ref-sultana-raisins", "ingredient-ref-mesa-sunrise-with-raisins-cereal", "ingredient-ref-quaker-harvest-crunch-light-crisp-raisin-almond-granola-cereal", "ingredient-ref-quaker-harvest-crunch-raisin-almond-cereal"),
            filterByIngredientSearchQuery(references, "raisins", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-dates", "ingredient-ref-medjool-dates", "ingredient-ref-dried-dates"),
            filterByIngredientSearchQuery(references, "dates", searchTerms).map { it.id }.toSet()
        )
        assertTrue(catalog.getValue("ingredient-ref-medjool-dates").aliasesFr.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-medjool-dates").aliasesEn.isEmpty())

        assertSingle("dried apricot", "ingredient-ref-dried-apricot")
        assertSingle("abricots séchés", "ingredient-ref-dried-apricot")
        assertSingle("dried fig", "ingredient-ref-dried-fig")
        assertSingle("figues séchées", "ingredient-ref-dried-fig")
        assertSingle("dried prune", "ingredient-ref-prune")
        assertSingle("pruneau", "ingredient-ref-prune")
        assertSingle("dried dates", "ingredient-ref-dried-dates")
        assertSingle("dattes séchées", "ingredient-ref-dried-dates")
        assertSingle("dried currants", "ingredient-ref-dried-currants")
        assertSingle("raisin de Corinthe", "ingredient-ref-dried-currants")
        assertSingle("dried tart cherries", "ingredient-ref-dried-tart-cherries")
        assertSingle("dried sour cherries", "ingredient-ref-dried-tart-cherries")
        assertSingle("dried red tart cherries", "ingredient-ref-dried-tart-cherries")
        assertSingle("cerises séchées acidulées", "ingredient-ref-dried-tart-cherries")
        assertSingle("dried barberry", "ingredient-ref-dried-barberry")
        assertSingle("épines-vinettes séchées", "ingredient-ref-dried-barberry")
        assertSingle("dried wolfberries", "ingredient-ref-dried-wolfberry")
        assertSingle("baie du lyciet séchée", "ingredient-ref-dried-wolfberry")
        assertSingle("pawpaw", "ingredient-ref-asimina")
        assertSingle("pawpaw (Asimina triloba)", "ingredient-ref-asimina")
        assertSingle("asimine", "ingredient-ref-asimina")
        assertSingle("prickly pear", "ingredient-ref-prickly-pear")
        assertSingle("figue de Barbarie", "ingredient-ref-prickly-pear")
        assertSingle("cactus pear", "ingredient-ref-prickly-pear")
        assertSingle("chokecherry", "ingredient-ref-chokecherry")
        assertSingle("cerise de Virginie", "ingredient-ref-chokecherry")
        assertSingle("cerise à grappes", "ingredient-ref-chokecherry")
        assertSingle("cerises de Virginie", "ingredient-ref-chokecherry")
        assertSingle("haskap berry", "ingredient-ref-haskap-berry")
        assertSingle("haskap", "ingredient-ref-haskap-berry")
        assertSingle("honeyberry", "ingredient-ref-haskap-berry")
        assertSingle("camerise", "ingredient-ref-haskap-berry")
        assertSingle("mamey sapote", "ingredient-ref-mamey-sapote")
        assertSingle("sapote (Pouteria sapota)", "ingredient-ref-mamey-sapote")
        assertSingle("black sapote", "ingredient-ref-black-sapote")
        assertSingle("sapote noire", "ingredient-ref-black-sapote")
        assertSingle("white sapote", "ingredient-ref-white-sapote")
        assertSingle("sapote blanche", "ingredient-ref-white-sapote")
        assertSingle("baobab fruit pulp", "ingredient-ref-baobab-fruit-pulp")
        assertSingle("pulpe de fruit de baobab", "ingredient-ref-baobab-fruit-pulp")
        assertSingle("maqui berry", "ingredient-ref-maqui-berry")
        assertSingle("maqui du Chili", "ingredient-ref-maqui-berry")
        assertSingle("cocona", "ingredient-ref-cocona")
        assertSingle("whole wheat meal", "ingredient-ref-wheat-meal")
        assertSingle("farine de blé entier brute", "ingredient-ref-wheat-meal")
        assertFalse(
            filterByIngredientSearchQuery(references, "coarse whole wheat flour", searchTerms)
                .any { it.id == "ingredient-ref-wheat-meal" }
        )
        assertSingle("bacon américain", "ingredient-ref-bacon")
        assertSingle("pancetta", "ingredient-ref-pancetta")
        assertSingle("poitrine roulée", "ingredient-ref-pancetta")
        assertSingle("guanciale", "ingredient-ref-guanciale")
        assertEquals(
            listOf("ingredient-ref-prosciutto", "ingredient-ref-prosciutto-di-parma-pdo"),
            filterByIngredientSearchQuery(references, "prosciutto", searchTerms).map { it.id }
        )
        assertSingle("Prosciutto di Parma", "ingredient-ref-prosciutto-di-parma-pdo")
        assertSingle("jambon de Parme AOP", "ingredient-ref-prosciutto-di-parma-pdo")
        assertSingle("prosciutto ham", "ingredient-ref-prosciutto")
        assertFalse(
            filterByIngredientSearchQuery(references, "papaw", searchTerms)
                .any { it.id == "ingredient-ref-asimina" }
        )
        assertSingle("dried sweet cherries", "ingredient-ref-dried-sweet-cherries")
        assertSingle("cerises douces séchées", "ingredient-ref-dried-sweet-cherries")
        assertSingle("sultanas", "ingredient-ref-sultana-raisins")
        assertSingle("Sultana raisins", "ingredient-ref-sultana-raisins")
        assertSingle("raisins sultana", "ingredient-ref-sultana-raisins")

        assertSingle("huitlacoche", "ingredient-ref-huitlacoche")
        assertSingle("cuitlacoche", "ingredient-ref-huitlacoche")
        assertFalse(
            filterByIngredientSearchQuery(references, "corn smut", searchTerms)
                .any { it.id == "ingredient-ref-huitlacoche" }
        )

        assertSingle("nori", "ingredient-ref-nori")
        assertSingle("purple laver", "ingredient-ref-nori")
        assertSingle("laitue pourpre", "ingredient-ref-nori")
        assertSingle("kombu", "ingredient-ref-kombu")
        assertSingle("konbu", "ingredient-ref-kombu")
        assertSingle("aramé", "ingredient-ref-arame")
        assertSingle("arame", "ingredient-ref-arame")
        assertSingle("sea lettuce", "ingredient-ref-sea-lettuce")
        assertSingle("laitue de mer", "ingredient-ref-sea-lettuce")
        assertSingle("main-de-mer palmée", "ingredient-ref-dulse")
        assertEquals(
            setOf("ingredient-ref-canned-quebec-redfish", "ingredient-ref-dulse"),
            filterByIngredientSearchQuery(references, "dulse", searchTerms).map { it.id }.toSet()
        )
        assertSingle("Atlantic wakame", "ingredient-ref-alaria-esculenta")
        assertSingle("wakamé atlantique", "ingredient-ref-alaria-esculenta")
        assertSingle("winged kelp", "ingredient-ref-alaria-esculenta")
        assertSingle("dabberlocks", "ingredient-ref-alaria-esculenta")
        assertEquals(
            setOf("ingredient-ref-wakame", "ingredient-ref-alaria-esculenta"),
            filterByIngredientSearchQuery(references, "wakame", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-wakame", "ingredient-ref-alaria-esculenta"),
            filterByIngredientSearchQuery(references, "wakamé", searchTerms).map { it.id }.toSet()
        )
        assertSingle("citrus zest", "ingredient-ref-citrus-zest")
        assertSingle("zeste d’agrumes", "ingredient-ref-citrus-zest")
        assertEquals(
            setOf("ingredient-ref-lemon-zest", "ingredient-ref-citrus-zest", "ingredient-ref-dried-orange-zest"),
            filterByIngredientSearchQuery(references, "zeste", searchTerms).map { it.id }.toSet()
        )
        assertSingle("lemon zest", "ingredient-ref-lemon-zest")
        assertSingle("zeste de citron", "ingredient-ref-lemon-zest")
        assertSingle("squid", "ingredient-ref-calamari")
        assertSingle("American plaice", "ingredient-ref-american-plaice")
        assertSingle("plie canadienne", "ingredient-ref-american-plaice")
        assertSingle("channel catfish", "ingredient-ref-channel-catfish")
        assertSingle("barbue de rivière", "ingredient-ref-channel-catfish")
        assertSingle("Pacific halibut", "ingredient-ref-pacific-halibut")
        assertSingle("flétan du Pacifique", "ingredient-ref-pacific-halibut")
        assertSingle("walleye", "ingredient-ref-walleye")
        assertSingle("doré jaune", "ingredient-ref-walleye")
        assertSingle("northern pike", "ingredient-ref-northern-pike")
        assertSingle("grand brochet", "ingredient-ref-northern-pike")
        assertEquals(
            setOf("ingredient-ref-eurasian-perch", "ingredient-ref-yellow-perch"),
            filterByIngredientSearchQuery(references, "yellow perch", searchTerms).map { it.id }.toSet()
        )
        assertSingle("perchaude", "ingredient-ref-yellow-perch")
        assertEquals(
            setOf("ingredient-ref-atlantic-halibut", "ingredient-ref-pacific-halibut", "ingredient-ref-greenland-halibut", "ingredient-ref-smoked-greenland-halibut"),
            filterByIngredientSearchQuery(references, "halibut", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-atlantic-halibut", "ingredient-ref-pacific-halibut", "ingredient-ref-greenland-halibut", "ingredient-ref-smoked-greenland-halibut"),
            filterByIngredientSearchQuery(references, "flétan", searchTerms).map { it.id }.toSet()
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "aonori", searchTerms)
                .none { it.id in setOf("ingredient-ref-nori", "ingredient-ref-sea-lettuce") }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "sea grapes", searchTerms)
                .none { it.id in setOf("ingredient-ref-grapes", "ingredient-ref-raisins") }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "encornet", searchTerms)
                .none { it.id == "ingredient-ref-calamari" }
        )
        assertEquals(
            setOf(
                "ingredient-ref-blue-crab",
                "ingredient-ref-crab",
                "ingredient-ref-crab-cake",
                "ingredient-ref-crab-claws",
                "ingredient-ref-crab-flavoured-pollock-flakes",
                "ingredient-ref-crab-legs",
                "ingredient-ref-dungeness-crab",
                "ingredient-ref-dungeness-crab-sections",
                "ingredient-ref-imitation-crab",
                "ingredient-ref-jonah-crab",
                "ingredient-ref-northern-stone-crab",
                "ingredient-ref-snow-crab-sections",
                "ingredient-ref-stone-crab",
            ),
            filterByIngredientSearchQuery(references, "crab", searchTerms).map { it.id }.toSet()
        )
        assertSingle("pinces de crabe", "ingredient-ref-crab-claws")

        assertSingle("breaded butterfly shrimp", "ingredient-ref-breaded-butterfly-shrimp")
        assertSingle("crevettes en papillon panées", "ingredient-ref-breaded-butterfly-shrimp")
        assertSingle("coconut butterfly shrimp", "ingredient-ref-coconut-butterfly-shrimp")
        assertSingle("coconut butterfly shrimp, tail-on", "ingredient-ref-coconut-butterfly-shrimp")
        assertSingle("crevettes papillon à la noix de coco", "ingredient-ref-coconut-butterfly-shrimp")
        assertSingle("crevettes papillons à la noix de coco avec queue", "ingredient-ref-coconut-butterfly-shrimp")
        assertMatches(
            "papillon",
            setOf("ingredient-ref-moth-beans", "ingredient-ref-breaded-butterfly-shrimp", "ingredient-ref-coconut-butterfly-shrimp")
        )
        assertMatches(
            "shrimp",
            setOf(
                "ingredient-ref-canned-cocktail-shrimp",
                "ingredient-ref-dried-shrimp",
                "ingredient-ref-northern-shrimp",
                "ingredient-ref-saeu-jeot",
                "ingredient-ref-shrimp-balls",
                "ingredient-ref-breaded-butterfly-shrimp",
                "ingredient-ref-breaded-shrimp",
                "ingredient-ref-coconut-butterfly-shrimp",
                "ingredient-ref-coconut-shrimp",
                "ingredient-ref-popcorn-shrimp",
            )
        )
        assertMatches(
            "butterfly shrimp",
            setOf("ingredient-ref-breaded-butterfly-shrimp", "ingredient-ref-coconut-butterfly-shrimp")
        )

        assertSingle("emmer semolina", "ingredient-ref-emmer-semolina")
        assertSingle("semoule de blé amidonnier", "ingredient-ref-emmer-semolina")
        assertMatches(
            "emmer",
            setOf("ingredient-ref-emmer-flour", "ingredient-ref-emmer-grain", "ingredient-ref-emmer-semolina")
        )

        assertSingle("Ossau-Iraty AOP", "ingredient-ref-ossau-iraty-pdo")
        assertSingle("Ossau-Iraty PDO", "ingredient-ref-ossau-iraty-pdo")
        assertSingle("Ossau-Iraty, A.O.P.", "ingredient-ref-ossau-iraty-pdo")

        assertSingle("Tomates pelées San Marzano AOP", "ingredient-ref-pomodoro-san-marzano-pdo")
        assertSingle("San Marzano DOP peeled tomatoes", "ingredient-ref-pomodoro-san-marzano-pdo")
        assertMatches(
            "tomatoes",
            setOf(
                "ingredient-ref-cherry-tomato",
                "ingredient-ref-plum-tomato",
                "ingredient-ref-tomatoes",
                "ingredient-ref-pomodoro-san-marzano-pdo",
            )
        )
        assertMatches(
            "tomates",
            setOf(
                "ingredient-ref-green-tomato-ketchup",
                "ingredient-ref-passata",
                "ingredient-ref-tomato-juice",
                "ingredient-ref-tomato-paste",
                "ingredient-ref-tomato-puree",
                "ingredient-ref-tomatoes",
                "ingredient-ref-pomodoro-san-marzano-pdo",
            )
        )

        assertSingle("king oyster", "ingredient-ref-king-oyster-mushroom")
        assertSingle("pleurote royal", "ingredient-ref-king-oyster-mushroom")
        assertSingle("enoki mushrooms", "ingredient-ref-enoki-mushroom")
        assertSingle("champignons enoki", "ingredient-ref-enoki-mushroom")
        assertSingle("maitake", "ingredient-ref-maitake-mushroom")
        assertSingle("polypore en touffes", "ingredient-ref-maitake-mushroom")
        assertSingle("truffe", "ingredient-ref-culinary-truffle")
        assertSingle("truffle", "ingredient-ref-culinary-truffle")
        assertSingle("bunashimeji mushroom", "ingredient-ref-bunashimeji-mushroom")
        assertSingle("wood ear mushroom", "ingredient-ref-wood-ear-mushroom")
        assertSingle("champignon noir", "ingredient-ref-wood-ear-mushroom")
        assertSingle("snow fungus", "ingredient-ref-snow-fungus")
        assertSingle("trémelle blanche", "ingredient-ref-snow-fungus")
        assertSingle("straw mushroom", "ingredient-ref-straw-mushroom")
        assertSingle("volvaire asiatique", "ingredient-ref-straw-mushroom")
        assertSingle("lion's mane mushroom", "ingredient-ref-lions-mane-mushroom")
        assertSingle("hydne hérisson", "ingredient-ref-lions-mane-mushroom")
        assertSingle("cremini", "ingredient-ref-cremini-mushroom")
        assertSingle("crimini mushrooms", "ingredient-ref-cremini-mushroom")
        assertSingle("portobello", "ingredient-ref-portobello-mushroom")
        assertSingle("portabella", "ingredient-ref-portobello-mushroom")
        assertSingle("champignon portabello", "ingredient-ref-portobello-mushroom")
        assertFalse(
            filterByIngredientSearchQuery(references, "champignon café", searchTerms)
                .any { it.id == "ingredient-ref-cremini-mushroom" }
        )

        assertSingle("truite arc-en-ciel", "ingredient-ref-rainbow-trout")
        assertSingle("rainbow trout", "ingredient-ref-rainbow-trout")
        assertSingle("merluche blanche", "ingredient-ref-white-hake")
        assertSingle("white hake", "ingredient-ref-white-hake")
        assertSingle("hareng de l’Atlantique", "ingredient-ref-atlantic-herring")
        assertSingle("Atlantic herring", "ingredient-ref-atlantic-herring")
        assertSingle("Alaska pollock", "ingredient-ref-alaska-pollock")
        assertSingle("goberge de l’Alaska", "ingredient-ref-alaska-pollock")
        assertSingle("Atlantic mackerel", "ingredient-ref-atlantic-mackerel")
        assertSingle("maquereau de l’Atlantique", "ingredient-ref-atlantic-mackerel")
        assertSingle("Pacific mackerel", "ingredient-ref-pacific-mackerel")
        assertSingle("maquereau du Pacifique", "ingredient-ref-pacific-mackerel")
        assertSingle("spotted Spanish mackerel", "ingredient-ref-spotted-spanish-mackerel")
        assertSingle("thazard tacheté", "ingredient-ref-spotted-spanish-mackerel")

        assertMatches("mustard greens", setOf("ingredient-ref-mustard-greens", "ingredient-ref-pickled-mustard-greens"))
        assertSingle("turnip tops", "ingredient-ref-turnip-greens")
        assertSingle("feuilles de betterave", "ingredient-ref-beet-greens")
        assertSingle("dandelion leaves", "ingredient-ref-dandelion-greens")
        assertSingle("roquette", "ingredient-ref-arugula")
        assertSingle("cresson de fontaine", "ingredient-ref-watercress")
        assertSingle("oseille commune", "ingredient-ref-common-sorrel")
        assertSingle("Belgian endive", "ingredient-ref-belgian-endive")
        assertSingle("scarole", "ingredient-ref-escarole")
        assertSingle("radicchio", "ingredient-ref-radicchio")
        assertEquals(
            setOf("ingredient-ref-arctic-char", "ingredient-ref-smoked-arctic-char"),
            filterByIngredientSearchQuery(references, "omble chevalier", searchTerms).map { it.id }.toSet()
        )
        assertSingle("Arctic charr", "ingredient-ref-arctic-char")
        assertSingle("American eel", "ingredient-ref-american-eel")
        assertEquals(
            setOf("ingredient-ref-american-eel", "ingredient-ref-smoked-eel"),
            filterByIngredientSearchQuery(references, "anguille", searchTerms).map { it.id }.toSet(),
        )

        assertSingle("blackberry", "ingredient-ref-blackberry")
        assertSingle("mûre", "ingredient-ref-blackberry")
        assertSingle("blackcurrant", "ingredient-ref-black-currant")
        assertSingle("gadelle noire", "ingredient-ref-black-currant")
        assertSingle("redcurrant", "ingredient-ref-red-currant")
        assertSingle("gadelle rouge", "ingredient-ref-red-currant")
        assertSingle("groseille à maquereau", "ingredient-ref-gooseberry")
        assertSingle("baie de sureau", "ingredient-ref-elderberry")
        assertSingle("lingonberry", "ingredient-ref-lingonberry")
        assertSingle("airelle rouge", "ingredient-ref-lingonberry")
        assertSingle("cloudberry", "ingredient-ref-cloudberry")
        assertSingle("chicouté", "ingredient-ref-cloudberry")
        assertSingle("red onion", "ingredient-ref-red-onion")
        assertSingle("oignon blanc", "ingredient-ref-white-onion")
        assertSingle("garlic scape", "ingredient-ref-garlic-scape")
        assertSingle("fleur d’ail", "ingredient-ref-garlic-scape")
        assertMatches("horseradish", setOf("ingredient-ref-horseradish", "ingredient-ref-prepared-horseradish"))
        assertMatches("raifort", setOf("ingredient-ref-horseradish", "ingredient-ref-prepared-horseradish"))
        assertSingle("prepared horseradish", "ingredient-ref-prepared-horseradish")
        assertSingle("raifort préparé", "ingredient-ref-prepared-horseradish")
        assertSingle("greater galangal", "ingredient-ref-greater-galangal")
        assertSingle("grand galanga", "ingredient-ref-greater-galangal")
        assertSingle("lemongrass", "ingredient-ref-lemongrass")
        assertSingle("verveine des Indes", "ingredient-ref-lemongrass")
        assertMatches(
            "taro",
            setOf("ingredient-ref-taro", "ingredient-ref-taro-flour", "ingredient-ref-taro-leaves")
        )
        assertSingle("malanga", "ingredient-ref-malanga")
        assertSingle("true yam", "ingredient-ref-yam")
        assertMatches("igname", setOf("ingredient-ref-yam", "ingredient-ref-yam-flour"))
        assertSingle("white salsify", "ingredient-ref-white-salsify")
        assertSingle("salsifis blanc", "ingredient-ref-white-salsify")
        assertSingle("black salsify", "ingredient-ref-black-salsify")
        assertSingle("scorsonère", "ingredient-ref-black-salsify")
        assertSingle("russet potato", "ingredient-ref-russet-potato")
        assertFalse(catalog.getValue("ingredient-ref-potato").aliasesEn.contains("russet potato"))

        assertSingle("tomate cerise", "ingredient-ref-cherry-tomato")
        assertSingle("cherry tomatoes", "ingredient-ref-cherry-tomato")
        assertSingle("tomate italienne", "ingredient-ref-plum-tomato")
        assertSingle("tomatille", "ingredient-ref-tomatillo")
        val eggplantVarieties = setOf(
            "ingredient-ref-chinese-eggplant",
            "ingredient-ref-eggplant",
            "ingredient-ref-garden-egg",
            "ingredient-ref-indian-eggplant",
            "ingredient-ref-thai-eggplant",
        )
        assertMatches("aubergine", eggplantVarieties)
        assertMatches("eggplant", eggplantVarieties + "ingredient-ref-gboma-leaves")
        assertMatches("zucchini", setOf("ingredient-ref-zucchini", "ingredient-ref-squash-blossoms"))
        assertSingle("courge d'été", "ingredient-ref-summer-squash")
        assertSingle("butternut squash", "ingredient-ref-butternut-squash")
        assertSingle("courgeron", "ingredient-ref-acorn-squash")
        assertSingle("spaghetti squash", "ingredient-ref-spaghetti-squash")
        assertSingle("margose", "ingredient-ref-bitter-melon")
        assertSingle("bitter gourd", "ingredient-ref-bitter-melon")
        assertSingle("courge amère", "ingredient-ref-bitter-melon")
        assertSingle("winter melon", "ingredient-ref-winter-melon")
        assertSingle("bénincasa", "ingredient-ref-winter-melon")
        assertSingle("wax gourd", "ingredient-ref-winter-melon")
        assertSingle("bottle gourd", "ingredient-ref-bottle-gourd")
        assertSingle("courge-bouteille", "ingredient-ref-bottle-gourd")
        assertSingle("courge calebasse", "ingredient-ref-bottle-gourd")
        assertSingle("ridge gourd", "ingredient-ref-ridge-gourd")
        assertSingle("angled loofah", "ingredient-ref-ridge-gourd")
        assertSingle("luffa à fruit anguleux", "ingredient-ref-ridge-gourd")
        assertSingle("chayote", "ingredient-ref-chayote")
        assertSingle("chayotte", "ingredient-ref-chayote")
        assertSingle("chaïote", "ingredient-ref-chayote")
        assertSingle("okra", "ingredient-ref-okra")
        assertSingle("gombo", "ingredient-ref-okra")
        assertSingle("bhendi", "ingredient-ref-okra")
        assertSingle("bamia", "ingredient-ref-okra")
        assertTrue(
            filterByIngredientSearchQuery(references, "courge d'été", searchTerms)
                .none { it.id == "ingredient-ref-chayote" }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "Chinese Preserving Melon", searchTerms)
                .none { it.id in setOf("ingredient-ref-winter-melon", "ingredient-ref-bottle-gourd") }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "Chinese okra", searchTerms)
                .none { it.id in setOf("ingredient-ref-okra", "ingredient-ref-ridge-gourd") }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "balsam pear", searchTerms)
                .none { it.id == "ingredient-ref-bitter-melon" }
        )
        assertSingle("orange douce", "ingredient-ref-orange")
        assertSingle("yellow onion", "ingredient-ref-yellow-onion")
        assertSingle("oignon jaune", "ingredient-ref-yellow-onion")
        assertSingle("Spanish onion", "ingredient-ref-spanish-onion")
        assertSingle("oignon d’Espagne", "ingredient-ref-spanish-onion")
        assertSingle("sweet onion", "ingredient-ref-sweet-onion")
        assertSingle("oignon doux", "ingredient-ref-sweet-onion")
        assertSingle("fingerroot", "ingredient-ref-fingerroot")
        assertSingle("Chinese key", "ingredient-ref-fingerroot")
        assertSingle("krachai", "ingredient-ref-fingerroot")
        assertSingle("kachai", "ingredient-ref-fingerroot")
        assertSingle("krachaï", "ingredient-ref-fingerroot")
        assertSingle("wasabi root", "ingredient-ref-wasabi-root")
        assertSingle("racine de wasabi", "ingredient-ref-wasabi-root")
        assertEquals(
            setOf("ingredient-ref-lime", "ingredient-ref-lime-juice"),
            filterByIngredientSearchQuery(references, "citron vert", searchTerms).map { it.id }.toSet()
        )
        assertSingle("mandarin orange", "ingredient-ref-mandarin")
        assertSingle("clémentine", "ingredient-ref-clementine")
        assertSingle("cumquat", "ingredient-ref-kumquat")
        assertEquals(
            setOf("ingredient-ref-yuzu", "ingredient-ref-yuzu-kosho"),
            filterByIngredientSearchQuery(references, "yuzu", searchTerms).map { it.id }.toSet()
        )
        assertSingle("sudachi", "ingredient-ref-sudachi")
        assertMatches("calamansi", setOf("ingredient-ref-calamansi", "ingredient-ref-toyomansi-soy-sauce"))
        assertSingle("bergamote", "ingredient-ref-bergamot")
        assertSingle("finger lime", "ingredient-ref-finger-lime")
        assertSingle("citron-caviar", "ingredient-ref-finger-lime")
        assertSingle("orange de Séville", "ingredient-ref-bitter-orange")
        assertSingle("shitaké", "ingredient-ref-shiitake-mushroom")
        assertSingle("pleurote en huître", "ingredient-ref-oyster-mushroom")
        assertSingle("chanterelle", "ingredient-ref-chanterelle-mushroom")
        assertSingle("morel mushroom", "ingredient-ref-morel-mushroom")
        assertSingle("Atlantic cod", "ingredient-ref-atlantic-cod")
        assertMatches("aiglefin", setOf("ingredient-ref-haddock", "ingredient-ref-smoked-haddock"))
        assertSingle("flétan de l’Atlantique", "ingredient-ref-atlantic-halibut")
        assertMatches("grapefruit", setOf("ingredient-ref-grapefruit", "ingredient-ref-grapefruit-juice"))
        assertSingle("citron (cedrat)", "ingredient-ref-citron-cedrat")
        assertSingle("cédrat", "ingredient-ref-citron-cedrat")
        assertEquals(
            setOf("ingredient-ref-grapefruit", "ingredient-ref-pomelo", "ingredient-ref-grapefruit-juice"),
            filterByIngredientSearchQuery(references, "pamplemousse", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-grapefruit", "ingredient-ref-pomelo"),
            filterByIngredientSearchQuery(references, "pomelo", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-lemon", "ingredient-ref-citron-cedrat"),
            filterByIngredientSearchQuery(references, "citron", searchTerms)
                .map { it.id }.filter { it in setOf("ingredient-ref-lemon", "ingredient-ref-citron-cedrat") }.toSet()
        )
        assertSingle("pamplemousse (Citrus maxima)", "ingredient-ref-pomelo")
        assertSingle("pamplemousse (Citrus paradisi)", "ingredient-ref-grapefruit")
        val tomatoMatches = filterByIngredientSearchQuery(references, "tomato", searchTerms).map { it.id }.toSet()
        assertTrue("ingredient-ref-tomatoes" in tomatoMatches)
        assertTrue("ingredient-ref-tomato-paste" in tomatoMatches)
        assertTrue("ingredient-ref-tomato-sauce" in tomatoMatches)
        assertTrue("ingredient-ref-cherry-tomato" in tomatoMatches)
        assertTrue("ingredient-ref-plum-tomato" in tomatoMatches)
        assertFalse("ingredient-ref-tomatillo" in tomatoMatches)
        assertTrue(
            filterByIngredientSearchQuery(references, "citrouille", searchTerms).map { it.id }
                .containsAll(listOf("ingredient-ref-pumpkin", "ingredient-ref-pumpkin-spice"))
        )

        assertMatches("petits pois", setOf("ingredient-ref-peas", "ingredient-ref-frozen-peas-and-carrots"))
        assertSingle("pois jaunes séchés", "ingredient-ref-yellow-peas")
        assertTrue(
            filterByIngredientSearchQuery(references, "petits pois jaunes", searchTerms)
                .none { it.id == "ingredient-ref-yellow-peas" }
        )

        val genericMushroom = catalog.getValue("ingredient-ref-mushroom")
        assertEquals("champignons", genericMushroom.nameFr)
        assertEquals(listOf("mushrooms"), genericMushroom.aliasesEn)
        assertEquals(
            setOf(
                "ingredient-ref-mushroom",
                "ingredient-ref-ground-dried-candy-cap-mushrooms",
                "ingredient-ref-enoki-mushroom",
                "ingredient-ref-cremini-mushroom",
                "ingredient-ref-haitian-djon-djon-mushrooms"
            ),
            filterByIngredientSearchQuery(references, "mushrooms", searchTerms).map { it.id }.toSet()
        )
        assertNull(genericMushroom.defaultDensity)
        assertTrue(genericMushroom.unitMappings.isEmpty())

        assertSingle("food colouring", "ingredient-ref-food-coloring")
        assertSingle("green gel food coloring", "ingredient-ref-green-food-coloring")
        assertSingle("gel red food coloring", "ingredient-ref-red-food-coloring")
    }

    @Test
    fun mapleSugarIsDistinctFromSyrupAndGenericSugarTerms() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val mapleSugar = catalog.getValue("ingredient-ref-maple-sugar")
        assertEquals("maple sugar", mapleSugar.nameEn)
        assertEquals("sucre d'érable", mapleSugar.nameFr)
        assertTrue(mapleSugar.aliasesEn.isEmpty())
        assertTrue(mapleSugar.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.SUGAR_AND_SWEETENER, mapleSugar.category)
        assertNull(mapleSugar.defaultDensity)
        assertTrue(mapleSugar.unitMappings.isEmpty())

        assertSingle("maple sugar", "ingredient-ref-maple-sugar")
        assertSingle("sucre d'érable", "ingredient-ref-maple-sugar")
        assertTrue(
            filterByIngredientSearchQuery(references, "maple syrup", searchTerms)
                .none { it.id == "ingredient-ref-maple-sugar" }
        )
        listOf("sucre du pays", "sucre d'habitant").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == "ingredient-ref-maple-sugar" }
            )
        }
        assertNotEquals("ingredient-ref-maple-syrup", mapleSugar.id)
        assertNotEquals("ingredient-ref-granulated-sugar", mapleSugar.id)
    }

    @Test
    fun saskatoonBerryUsesSpeciesScopedBilingualNamesWithoutBroadBerryAliases() {
        val references = BundledIngredientCatalog.references
        val saskatoon = references.single { it.id == "ingredient-ref-saskatoon-berry" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("Saskatoon berry", saskatoon.nameEn)
        assertEquals("amélanche", saskatoon.nameFr)
        assertTrue(saskatoon.aliasesEn.isEmpty())
        assertTrue(saskatoon.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FRUIT, saskatoon.category)
        assertNull(saskatoon.defaultDensity)
        assertTrue(saskatoon.unitMappings.isEmpty())

        listOf("Saskatoon berry", "Saskatoon", "amélanche", "amelanche").forEach { query ->
            assertEquals(
                "query: $query",
                listOf("ingredient-ref-saskatoon-berry"),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        listOf("blueberry", "juneberry", "serviceberry", "shadbush").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == "ingredient-ref-saskatoon-berry" }
            )
        }
    }

    @Test
    fun makrutLimeLeavesUseLeafQualifiedBilingualNames() {
        val references = BundledIngredientCatalog.references
        val makrut = references.single { it.id == "ingredient-ref-makrut-lime-leaves" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("makrut lime leaves", makrut.nameEn)
        assertEquals("feuilles de combava", makrut.nameFr)
        assertEquals(listOf("makrut lime leaf"), makrut.aliasesEn)
        assertEquals(listOf("feuille de combava"), makrut.aliasesFr)
        assertEquals(IngredientCategory.HERB, makrut.category)
        assertNull(makrut.defaultDensity)
        assertTrue(makrut.unitMappings.isEmpty())

        listOf("makrut lime leaves", "makrut lime leaf", "feuilles de combava", "feuille de combava").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(makrut.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        assertTrue(
            filterByIngredientSearchQuery(references, "kaffir lime leaves", searchTerms)
                .none { it.id == makrut.id }
        )
    }

    @Test
    fun pepperSesameAndRiceVinegarIdentitiesKeepTheirBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val pepperIds = listOf(
            "ingredient-ref-black-pepper",
            "ingredient-ref-white-pepper",
            "ingredient-ref-green-peppercorns",
            "ingredient-ref-pink-pepper",
            "ingredient-ref-sichuan-pepper",
            "ingredient-ref-indian-long-pepper",
            "ingredient-ref-javanese-long-pepper",
            "ingredient-ref-grains-of-paradise",
            "ingredient-ref-cubeb"
        )
        pepperIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertEquals(IngredientCategory.BAKING_AND_SPICE, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }
        listOf(
            "black peppercorns" to "ingredient-ref-black-pepper",
            "white peppercorns" to "ingredient-ref-white-pepper",
            "green peppercorns" to "ingredient-ref-green-peppercorns",
            "pink peppercorns" to "ingredient-ref-pink-pepper",
            "ground Szechuan pepper" to "ingredient-ref-sichuan-pepper",
            "poivre long indien" to "ingredient-ref-indian-long-pepper",
            "poivre long de Java" to "ingredient-ref-javanese-long-pepper",
            "maniguette" to "ingredient-ref-grains-of-paradise",
            "poivre à queue" to "ingredient-ref-cubeb"
        ).forEach { (query, expectedId) -> assertSingle(query, expectedId) }
        listOf("poivre en grains", "poivre de Java", "grains of Selim").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms).none { it.id in pepperIds }
            )
        }

        assertSingle("white sesame seeds", "ingredient-ref-white-sesame-seeds")
        assertSingle("graines de sésame noires", "ingredient-ref-black-sesame-seeds")
        assertSingle("tahini", "ingredient-ref-tahini")
        assertEquals(
            setOf("ingredient-ref-tahini", "ingredient-ref-black-sesame-paste"),
            filterByIngredientSearchQuery(references, "beurre de sésame", searchTerms).map { it.id }.toSet(),
        )
        assertSingle("unseasoned rice vinegar", "ingredient-ref-rice-vinegar")
        assertSingle("seasoned rice vinegar", "ingredient-ref-seasoned-rice-vinegar")
        assertSingle("Chinkiang vinegar", "ingredient-ref-chinkiang-vinegar")
        assertSingle("Zhenjiang vinegar", "ingredient-ref-chinkiang-vinegar")

        val sesameIds = listOf(
            "ingredient-ref-sesame-seeds",
            "ingredient-ref-white-sesame-seeds",
            "ingredient-ref-black-sesame-seeds"
        )
        sesameIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertEquals(IngredientCategory.NUT_SEED_AND_DRIED_FRUIT, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }
        val tahini = catalog.getValue("ingredient-ref-tahini")
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, tahini.category)
        assertNull(tahini.defaultDensity)
        assertTrue(tahini.unitMappings.isEmpty())

        val vinegarIds = listOf(
            "ingredient-ref-rice-vinegar",
            "ingredient-ref-seasoned-rice-vinegar",
            "ingredient-ref-chinkiang-vinegar"
        )
        vinegarIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }
        listOf("black vinegar", "black rice vinegar", "kurozu").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == "ingredient-ref-chinkiang-vinegar" }
            )
        }
    }

    @Test
    fun brazilNutUsesNarrowBilingualNamesAndStaysSeparateFromChestnutAndMixedNuts() {
        val references = BundledIngredientCatalog.references
        val brazilNut = references.single { it.id == "ingredient-ref-brazil-nut" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("Brazil nut", brazilNut.nameEn)
        assertEquals("noix du Brésil", brazilNut.nameFr)
        assertTrue(brazilNut.aliasesEn.isEmpty())
        assertTrue(brazilNut.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.NUT_SEED_AND_DRIED_FRUIT, brazilNut.category)
        assertNull(brazilNut.defaultDensity)
        assertTrue(brazilNut.unitMappings.isEmpty())

        listOf("Brazil nut", "noix du Brésil").forEach { query ->
            assertEquals(
                "query: $query",
                setOf("ingredient-ref-brazil-nut", "ingredient-ref-brazil-nut-butter"),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }.toSet()
            )
        }
        listOf("chestnut", "mixed nuts", "paranut", "châtaigne du Brésil", "noix de Para").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == "ingredient-ref-brazil-nut" }
            )
        }
    }

    @Test
    fun mesoamericanHerbsUseDistinctSourceNamesWithoutUmbrellaAliases() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val epazote = catalog.getValue("ingredient-ref-epazote")
        val hojaSanta = catalog.getValue("ingredient-ref-hoja-santa")
        val chipilin = catalog.getValue("ingredient-ref-chipilin-leaves")
        val loroco = catalog.getValue("ingredient-ref-loroco")

        assertEquals("epazote", epazote.nameEn)
        assertEquals("epazote", epazote.nameFr)
        assertEquals(IngredientCategory.HERB, epazote.category)
        assertEquals("hoja santa", hojaSanta.nameEn)
        assertEquals("hoja santa", hojaSanta.nameFr)
        assertEquals(IngredientCategory.HERB, hojaSanta.category)
        assertEquals("chipilín leaves", chipilin.nameEn)
        assertEquals("feuilles de chipilín", chipilin.nameFr)
        assertEquals(IngredientCategory.HERB, chipilin.category)
        assertEquals("loroco", loroco.nameEn)
        assertEquals("loroco", loroco.nameFr)
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, loroco.category)

        listOf(epazote, hojaSanta, chipilin, loroco).forEach { reference ->
            assertTrue(reference.aliasesEn.isEmpty())
            assertTrue(reference.aliasesFr.isEmpty())
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }

        assertSingle("epazote", epazote.id)
        assertSingle("hoja santa", hojaSanta.id)
        assertSingle("chipilín leaves", chipilin.id)
        assertSingle("feuilles de chipilín", chipilin.id)
        assertSingle("loroco", loroco.id)

        listOf("quelite", "chepil", "chepiles").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id in setOf(epazote.id, hojaSanta.id, chipilin.id, loroco.id) }
            )
        }
    }

    @Test
    fun southAmericanSeasoningsUseSourceScopedNamesAndNoSubstitutionAliases() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val merken = catalog.getValue("ingredient-ref-merken")
        val cassareep = catalog.getValue("ingredient-ref-cassareep")

        assertEquals("merkén", merken.nameEn)
        assertEquals("merkén", merken.nameFr)
        assertEquals(listOf("merquén"), merken.aliasesEn)
        assertEquals(listOf("merquén"), merken.aliasesFr)
        assertEquals(IngredientCategory.BAKING_AND_SPICE, merken.category)
        assertEquals("cassareep", cassareep.nameEn)
        assertEquals("cassareep", cassareep.nameFr)
        assertEquals(listOf("casareep"), cassareep.aliasesEn)
        assertEquals(listOf("casareep"), cassareep.aliasesFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, cassareep.category)

        listOf(merken, cassareep).forEach { reference ->
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }

        assertSingle("merkén", merken.id)
        assertSingle("merquén", merken.id)
        assertSingle("cassareep", cassareep.id)
        assertSingle("casareep", cassareep.id)

        listOf("chili flakes", "chili powder").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == merken.id }
            )
        }
        listOf("tucupi", "cassava flour", "molasses", "pepperpot").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == cassareep.id }
            )
        }
    }

    @Test
    fun yerbaMateElaboradaKeepsTheProcessedProductNameSeparateFromTheInfusion() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val yerbaMate = references.single { it.id == "ingredient-ref-yerba-mate-elaborada" }

        assertEquals("yerba mate elaborada", yerbaMate.nameEn)
        assertEquals("yerba mate elaborada", yerbaMate.nameFr)
        assertTrue(yerbaMate.aliasesEn.isEmpty())
        assertTrue(yerbaMate.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.HERB, yerbaMate.category)
        assertNull(yerbaMate.defaultDensity)
        assertTrue(yerbaMate.unitMappings.isEmpty())
        assertEquals(
            listOf(yerbaMate.id),
            filterByIngredientSearchQuery(references, "yerba mate elaborada", searchTerms).map { it.id }
        )
    }

    @Test
    fun tucupiIsASeparateCassavaCondimentWithoutCassareepOrGumAliases() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val tucupi = catalog.getValue("ingredient-ref-tucupi")

        assertEquals("tucupi", tucupi.nameEn)
        assertEquals("tucupi", tucupi.nameFr)
        assertTrue(tucupi.aliasesEn.isEmpty())
        assertTrue(tucupi.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, tucupi.category)
        assertNull(tucupi.defaultDensity)
        assertTrue(tucupi.unitMappings.isEmpty())
        assertEquals(
            listOf(tucupi.id),
            filterByIngredientSearchQuery(references, "tucupi", searchTerms).map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-cassareep"),
            filterByIngredientSearchQuery(references, "cassareep", searchTerms).map { it.id }
        )
        listOf("manipueira", "tucupi-doce", "cassava flour", "tapioca starch").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == tucupi.id }
            )
        }
    }

    @Test
    fun acaiAndCupuacuAreDistinctFruitIdentitiesWithNarrowNames() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val acai = catalog.getValue("ingredient-ref-acai-fruit")
        val cupuacu = catalog.getValue("ingredient-ref-cupuacu-fruit")

        assertEquals("açaí fruit", acai.nameEn)
        assertEquals("açaï", acai.nameFr)
        assertEquals(listOf("assai"), acai.aliasesEn)
        assertTrue(acai.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FRUIT, acai.category)
        assertNull(acai.defaultDensity)
        assertTrue(acai.unitMappings.isEmpty())

        assertEquals("cupuaçu", cupuacu.nameEn)
        assertEquals("cupuaçu", cupuacu.nameFr)
        assertTrue(cupuacu.aliasesEn.isEmpty())
        assertTrue(cupuacu.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FRUIT, cupuacu.category)
        assertNull(cupuacu.defaultDensity)
        assertTrue(cupuacu.unitMappings.isEmpty())

        listOf("açai", "acai", "açaï", "assai").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(acai.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        assertEquals(
            listOf(cupuacu.id),
            filterByIngredientSearchQuery(references, "cupuaçu", searchTerms).map { it.id }
        )
        listOf("açaí pulp", "cupuaçu pulp", "cocoa", "palm heart").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == acai.id || it.id == cupuacu.id }
            )
        }
    }

    @Test
    fun jambuIsASeparateAmazonianHerbWithoutWatercressAliases() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val jambu = references.single { it.id == "ingredient-ref-jambu" }

        assertEquals("jambu", jambu.nameEn)
        assertEquals("jambu", jambu.nameFr)
        assertTrue(jambu.aliasesEn.isEmpty())
        assertTrue(jambu.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.HERB, jambu.category)
        assertNull(jambu.defaultDensity)
        assertTrue(jambu.unitMappings.isEmpty())
        assertEquals(
            listOf(jambu.id),
            filterByIngredientSearchQuery(references, "jambu", searchTerms).map { it.id }
        )
        listOf("agrião do Pará", "watercress", "tucupi", "tapioca").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == jambu.id }
            )
        }
    }

    @Test
    fun chicoriaDoParaUsesCulantroNameAndStaysSeparateFromCilantroAndChicory() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val culantro = references.single { it.id == "ingredient-ref-culantro" }

        assertEquals("culantro", culantro.nameEn)
        assertEquals("chic\u00f3ria-do-Par\u00e1", culantro.nameFr)
        assertEquals(listOf("chadon beni", "shadon beni", "bandania"), culantro.aliasesEn)
        assertTrue(culantro.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.HERB, culantro.category)
        assertNull(culantro.defaultDensity)
        assertTrue(culantro.unitMappings.isEmpty())
        listOf("culantro", "chicoria do para", "chadon beni", "shadon beni", "bandania").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(culantro.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        listOf("cilantro", "chicory", "coentrão", "jambu").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == culantro.id }
            )
        }
    }

    @Test
    fun caribbeanReferencesKeepTheirIdentityAndSearchBoundaries() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val expectedCategories = mapOf(
            "ingredient-ref-pigeon-peas" to IngredientCategory.LEGUME_AND_PULSE,
            "ingredient-ref-ackee" to IngredientCategory.FRUIT,
            "ingredient-ref-scotch-bonnet-pepper" to IngredientCategory.VEGETABLE_AND_AROMATIC,
            "ingredient-ref-cubanelle-pepper" to IngredientCategory.VEGETABLE_AND_AROMATIC,
            "ingredient-ref-aji-dulce-pepper" to IngredientCategory.VEGETABLE_AND_AROMATIC,
            "ingredient-ref-haitian-djon-djon-mushrooms" to IngredientCategory.VEGETABLE_AND_AROMATIC,
            "ingredient-ref-colombo-powder" to IngredientCategory.BAKING_AND_SPICE,
            "ingredient-ref-bois-dinde-leaves" to IngredientCategory.HERB
        )
        expectedCategories.forEach { (id, category) ->
            val reference = references.single { it.id == id }
            assertEquals(id, category, reference.category)
            assertNull(id, reference.defaultDensity)
            assertTrue(id, reference.unitMappings.isEmpty())
        }

        assertSingle("gungo peas", "ingredient-ref-pigeon-peas")
        assertSingle("pois d’Angole", "ingredient-ref-pigeon-peas")
        assertTrue(
            filterByIngredientSearchQuery(references, "gandules", searchTerms)
                .none { it.id == "ingredient-ref-pigeon-peas" }
        )
        assertSingle("akee", "ingredient-ref-ackee")
        assertSingle("achee", "ingredient-ref-ackee")
        assertSingle("piment Scotch Bonnet", "ingredient-ref-scotch-bonnet-pepper")
        assertSingle("poivron Cubanelle", "ingredient-ref-cubanelle-pepper")
        assertSingle("sweet Cuban pepper", "ingredient-ref-cubanelle-pepper")
        assertSingle("piment ají dulce", "ingredient-ref-aji-dulce-pepper")
        assertSingle("champignons djon djon", "ingredient-ref-haitian-djon-djon-mushrooms")
        assertSingle("poudre à Colombo", "ingredient-ref-colombo-powder")
        assertSingle("feuilles de bois d’Inde", "ingredient-ref-bois-dinde-leaves")

        val cumin = references.single { it.id == "ingredient-ref-ground-cumin" }
        val okra = references.single { it.id == "ingredient-ref-okra" }
        assertTrue("geera powder" in cumin.aliasesEn)
        assertTrue("ochro" in okra.aliasesEn)
        assertTrue("ochros" in okra.aliasesEn)
        assertSingle("geera powder", "ingredient-ref-ground-cumin")
        assertSingle("ochro", "ingredient-ref-okra")
        assertSingle("ochros", "ingredient-ref-okra")

        assertTrue(
            filterByIngredientSearchQuery(references, "pimiento de cocinar", searchTerms)
                .none { it.id == "ingredient-ref-cubanelle-pepper" }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "pimento pepper", searchTerms)
                .none { it.id in setOf("ingredient-ref-allspice", "ingredient-ref-scotch-bonnet-pepper") }
        )
    }

    @Test
    fun pimentaDeCheiroKeepsItsSourceNameAndStaysSeparateFromOtherPepperGroups() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val pimenta = references.single { it.id == "ingredient-ref-pimenta-de-cheiro" }

        assertEquals("pimenta-de-cheiro", pimenta.nameEn)
        assertEquals("pimenta-de-cheiro", pimenta.nameFr)
        assertTrue(pimenta.aliasesEn.isEmpty())
        assertTrue(pimenta.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, pimenta.category)
        assertNull(pimenta.defaultDensity)
        assertTrue(pimenta.unitMappings.isEmpty())
        listOf("pimenta-de-cheiro", "pimenta de cheiro").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(pimenta.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        listOf(
            "jalapeno pepper", "serrano pepper", "black pepper", "pimenta bode", "pimenta murupi",
            "cumari do para", "habanero", "biquinho", "sweet pepper", "chile pepper"
        ).forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == pimenta.id }
            )
        }
    }

    @Test
    fun dendeIsCrudePalmOilAndStaysSeparateFromPalmKernelOilAndFractions() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val dende = references.single { it.id == "ingredient-ref-crude-palm-oil" }

        assertEquals("crude palm oil (azeite de dendê)", dende.nameEn)
        assertEquals("huile de palme brute (azeite de dendê)", dende.nameFr)
        assertTrue(dende.aliasesEn.isEmpty())
        assertTrue(dende.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FAT_AND_OIL, dende.category)
        assertNull(dende.defaultDensity)
        assertTrue(dende.unitMappings.isEmpty())

        listOf("crude palm oil", "huile de palme brute", "azeite de dendê", "azeite de dende").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(dende.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        listOf("palm kernel oil", "palm olein", "palm stearin", "vegetable oil").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == dende.id }
            )
        }
    }

    @Test
    fun freshCassavaRootStaysSeparateFromFlourAndStarchProducts() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val cassava = references.single { it.id == "ingredient-ref-cassava-root" }

        assertEquals("cassava root", cassava.nameEn)
        assertEquals("manioc", cassava.nameFr)
        assertEquals(listOf("yuca"), cassava.aliasesEn)
        assertEquals(listOf("yuca"), cassava.aliasesFr)
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, cassava.category)
        assertNull(cassava.defaultDensity)
        assertTrue(cassava.unitMappings.isEmpty())
        assertEquals(
            listOf(cassava.id),
            filterByIngredientSearchQuery(references, "cassava root", searchTerms).map { it.id }
        )
        assertEquals(listOf(cassava.id), filterByIngredientSearchQuery(references, "yuca", searchTerms).map { it.id })
        assertEquals(
            setOf(
                "ingredient-ref-cassava-root",
                "ingredient-ref-cassava-leaves",
                "ingredient-ref-cassava-flour",
                "ingredient-ref-tapioca-starch"
            ),
            filterByIngredientSearchQuery(references, "manioc", searchTerms).map { it.id }.toSet()
        )
        listOf("gari", "edible sago flour", "polvilho azedo", "polvilho doce").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == cassava.id }
            )
        }
        listOf("pondu", "saka saka", "isombe", "matamba").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == "ingredient-ref-cassava-leaves" }
            )
        }
    }

    @Test
    fun placaliSearchResolvesOnlyItsNamedIdentity() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val placali = references.single { it.id == "ingredient-ref-placali" }

        assertEquals("placali", placali.nameEn)
        assertEquals("placali", placali.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, placali.category)
        assertTrue(placali.aliasesEn.isEmpty())
        assertTrue(placali.aliasesFr.isEmpty())
        assertNull(placali.defaultDensity)
        assertTrue(placali.unitMappings.isEmpty())
        assertEquals(
            listOf(placali.id),
            filterByIngredientSearchQuery(references, "placali", searchTerms).map { it.id }
        )
        listOf(
            "placali flour", "fermented cassava paste", "cassava paste", "semoule de manioc",
            "fufu", "attiéké", "gari", "lafun", "pupuru"
        ).forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms).none { it.id == placali.id }
            )
        }
        assertTrue(filterByIngredientSearchQuery(references, "manioc", searchTerms).none { it.id == placali.id })
        assertTrue(filterByIngredientSearchQuery(references, "cassava", searchTerms).none { it.id == placali.id })
    }

    @Test
    fun papaSecaKeepsItsRecipeSpecificPreparationOutOfCatalogData() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val papaSeca = references.single { it.id == "ingredient-ref-papa-seca" }

        assertEquals("dried potato (papa seca)", papaSeca.nameEn)
        assertEquals("papa seca", papaSeca.nameFr)
        assertTrue(papaSeca.aliasesEn.isEmpty())
        assertTrue(papaSeca.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, papaSeca.category)
        assertNull(papaSeca.defaultDensity)
        assertTrue(papaSeca.unitMappings.isEmpty())
        listOf("papa seca", "dried potato").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(papaSeca.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        listOf("potato flour", "potato starch", "chuño", "tunta").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == papaSeca.id }
            )
        }
    }

    @Test
    fun arracachaRootKeepsItsSourceEnglishNameSeparateFromCarrot() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val arracacha = references.single { it.id == "ingredient-ref-arracacha" }

        assertEquals("arracacha root", arracacha.nameEn)
        assertEquals("arracacha", arracacha.nameFr)
        assertEquals(listOf("Peruvian carrot"), arracacha.aliasesEn)
        assertTrue(arracacha.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, arracacha.category)
        assertNull(arracacha.defaultDensity)
        assertTrue(arracacha.unitMappings.isEmpty())
        listOf("arracacha root", "arracacha", "Peruvian carrot").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(arracacha.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val carrot = references.single { it.id == "ingredient-ref-carrot" }
        assertNotEquals(arracacha.id, carrot.id)
        assertEquals(
            setOf(arracacha.id, carrot.id),
            filterByIngredientSearchQuery(references, "carrot", searchTerms).map { it.id }.toSet()
        )
        listOf("cassava root", "potato", "parsnip").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == arracacha.id }
            )
        }
    }

    @Test
    fun charquiKeepsItsSourceDefinedCamelidIdentityNarrow() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val charqui = references.single { it.id == "ingredient-ref-charqui" }

        assertEquals("charqui (dried salted camelid meat)", charqui.nameEn)
        assertEquals("charqui (viande de camélidé séchée et salée)", charqui.nameFr)
        assertTrue(charqui.aliasesEn.isEmpty())
        assertTrue(charqui.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.PROTEIN, charqui.category)
        assertNull(charqui.defaultDensity)
        assertTrue(charqui.unitMappings.isEmpty())
        listOf("charqui", "dried salted camelid meat", "viande de camélidé séchée et salée").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(charqui.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        listOf("jerky", "charque", "chalona", "cecina", "dried meat").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == charqui.id }
            )
        }
    }

    @Test
    fun huacatayKeepsItsCulinaryNameWithoutOverclaimingSpeciesOrAliases() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val huacatay = references.single { it.id == "ingredient-ref-huacatay" }

        assertEquals("huacatay", huacatay.nameEn)
        assertEquals("huacatay", huacatay.nameFr)
        assertTrue(huacatay.aliasesEn.isEmpty())
        assertTrue(huacatay.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, huacatay.category)
        assertNull(huacatay.defaultDensity)
        assertTrue(huacatay.unitMappings.isEmpty())
        assertEquals(
            listOf(huacatay.id),
            filterByIngredientSearchQuery(references, "huacatay", searchTerms).map { it.id }
        )
        listOf("quincho", "chincho", "Tagetes minuta", "Tagetes terniflora", "Peruvian black mint").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == huacatay.id }
            )
        }
    }

    @Test
    fun peruvianAmazonCecinaStaysDistinctFromCamelidCharqui() {
        val references = BundledIngredientCatalog.references
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val cecina = references.single { it.id == "ingredient-ref-peruvian-amazonian-cecina" }
        val charqui = references.single { it.id == "ingredient-ref-charqui" }

        assertEquals("Peruvian Amazon cecina (smoked, dried meat)", cecina.nameEn)
        assertEquals("cecina de l’Amazonie péruvienne (viande séchée et fumée)", cecina.nameFr)
        assertTrue(cecina.aliasesEn.isEmpty())
        assertTrue(cecina.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.PROTEIN, cecina.category)
        assertNull(cecina.defaultDensity)
        assertTrue(cecina.unitMappings.isEmpty())
        listOf(cecina.nameEn, cecina.nameFr).forEach { query ->
            assertEquals(
                "query: $query",
                listOf(cecina.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        assertTrue(
            filterByIngredientSearchQuery(references, "charqui", searchTerms)
                .none { it.id == cecina.id }
        )
        assertNotEquals(cecina.id, charqui.id)
    }

    @Test
    fun toumUsesNarrowBilingualTermsAndStaysSeparateFromGenericSauces() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val toum = catalog.getValue("ingredient-ref-toum")
        assertEquals("toum", toum.nameEn)
        assertEquals("sauce toum", toum.nameFr)
        assertTrue(toum.aliasesEn.isEmpty())
        assertEquals(listOf("sauce libanaise à l'ail (toum)"), toum.aliasesFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, toum.category)
        assertNull(toum.defaultDensity)
        assertTrue(toum.unitMappings.isEmpty())

        listOf(
            "toum",
            "sauce toum",
            "sauce libanaise à l'ail (toum)"
        ).forEach { assertSingle(it, "ingredient-ref-toum") }

        listOf("garlic sauce", "sauce à l'ail", "aioli").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .none { it.id == "ingredient-ref-toum" }
            )
        }
        assertEquals(
            setOf("ingredient-ref-mayo", "ingredient-ref-japanese-mayonnaise"),
            filterByIngredientSearchQuery(references, "mayonnaise", searchTerms).map { it.id }.toSet()
        )
    }

    @Test
    fun udonAjvarAndUbeHalayaUseConservativeBilingualSearchTerms() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        val udon = byId.getValue("ingredient-ref-udon-noodles")
        assertEquals("udon noodles", udon.nameEn)
        assertEquals("nouilles udon", udon.nameFr)
        assertEquals(listOf("udon"), udon.aliasesEn)
        assertEquals(listOf("udon"), udon.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, udon.category)
        assertNull(udon.defaultDensity)
        assertTrue(udon.unitMappings.isEmpty())
        listOf("udon noodles", "nouilles udon", "udon").forEach { query ->
            assertEquals(
                "ingredient-ref-udon-noodles",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }

        val ajvar = byId.getValue("ingredient-ref-ajvar")
        assertEquals("ajvar", ajvar.nameEn)
        assertEquals("ajvar", ajvar.nameFr)
        assertEquals(listOf("ayvar"), ajvar.aliasesEn)
        assertTrue(ajvar.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, ajvar.category)
        assertNull(ajvar.defaultDensity)
        assertTrue(ajvar.unitMappings.isEmpty())
        listOf("ajvar", "ayvar").forEach { query ->
            assertEquals(
                "ingredient-ref-ajvar",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        assertEquals(
            "ingredient-ref-biber-salcasi",
            filterByIngredientSearchQuery(references, "biber salçası", searchTerms).single().id
        )

        val ubeHalaya = byId.getValue("ingredient-ref-ube-halaya")
        assertEquals("ube halaya (purple yam jam)", ubeHalaya.nameEn)
        assertEquals("confiture d’ube (ube halaya)", ubeHalaya.nameFr)
        assertEquals(listOf("purple yam jam"), ubeHalaya.aliasesEn)
        assertEquals(listOf("confiture d’ube"), ubeHalaya.aliasesFr)
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, ubeHalaya.category)
        assertNull(ubeHalaya.defaultDensity)
        assertTrue(ubeHalaya.unitMappings.isEmpty())
        listOf("ube halaya", "purple yam jam", "confiture d'ube").forEach { query ->
            assertEquals(
                "ingredient-ref-ube-halaya",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        assertTrue(ubeHalaya.aliasesEn.none { it in setOf("ube jam", "purple yam", "halaya") })
    }

    @Test
    fun somenAndPandanUseNarrowBilingualSearchTerms() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        val somen = byId.getValue("ingredient-ref-somen-noodles")
        assertEquals("somen noodles", somen.nameEn)
        assertEquals("somen", somen.nameFr)
        assertTrue(somen.aliasesEn.isEmpty())
        assertTrue(somen.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, somen.category)
        assertNull(somen.defaultDensity)
        assertTrue(somen.unitMappings.isEmpty())
        listOf("somen noodles", "somen").forEach { query ->
            assertEquals(
                "ingredient-ref-somen-noodles",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }

        val pandan = byId.getValue("ingredient-ref-pandan-leaves")
        assertEquals("pandan leaves", pandan.nameEn)
        assertEquals("feuilles de pandan", pandan.nameFr)
        assertTrue(pandan.aliasesEn.isEmpty())
        assertTrue(pandan.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.HERB, pandan.category)
        assertNull(pandan.defaultDensity)
        assertTrue(pandan.unitMappings.isEmpty())
        listOf("pandan leaves", "feuilles de pandan").forEach { query ->
            assertEquals(
                "ingredient-ref-pandan-leaves",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        assertEquals(
            setOf("ingredient-ref-pandan-leaves", "ingredient-ref-mccormick-pandan-flavor"),
            filterByIngredientSearchQuery(references, "pandan", searchTerms).map { it.id }.toSet(),
        )
        assertTrue(filterByIngredientSearchQuery(references, "pandan paste", searchTerms).isEmpty())
    }

    @Test
    fun jobsTearsIsScopedToEdibleGrainWithOnlyReviewedBilingualNames() {
        val references = BundledIngredientCatalog.references
        val jobsTears = references.single { it.id == "ingredient-ref-jobs-tears" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("Job's tears", jobsTears.nameEn)
        assertEquals("larme-de-Job", jobsTears.nameFr)
        assertEquals(listOf("adlay", "adlai"), jobsTears.aliasesEn)
        assertEquals(listOf("larmes-de-Job"), jobsTears.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, jobsTears.category)
        assertNull(jobsTears.defaultDensity)
        assertTrue(jobsTears.unitMappings.isEmpty())
        assertEquals(
            setOf("ingredient-ref-jobs-tears", "ingredient-ref-jobs-tears-flour"),
            filterByIngredientSearchQuery(references, "Job's tears", searchTerms).map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-jobs-tears", "ingredient-ref-jobs-tears-flour"),
            filterByIngredientSearchQuery(references, "larmes-de-Job", searchTerms).map { it.id }.toSet(),
        )
        listOf("larme-de-Job", "adlay", "adlai").forEach { query ->
            assertEquals(
                "ingredient-ref-jobs-tears",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        assertTrue(jobsTears.aliasesEn.none { it in setOf("tear grass", "job's tears tea", "adlay millet") })
        assertTrue(jobsTears.aliasesFr.none { it in setOf("larme-du-Christ", "larmille", "larmille des Indes") })
    }

    @Test
    fun blackRiceHasItsOwnColorIdentityAndDoesNotAliasOtherRiceTypes() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val blackRice = catalog.getValue("ingredient-ref-black-rice")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("black rice", blackRice.nameEn)
        assertEquals("riz noir", blackRice.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, blackRice.category)
        assertTrue(blackRice.aliasesEn.isEmpty())
        assertTrue(blackRice.aliasesFr.isEmpty())
        assertNull(blackRice.defaultDensity)
        assertTrue(blackRice.unitMappings.isEmpty())
        val blackRiceProducts = setOf(
            "ingredient-ref-black-glutinous-rice",
            "ingredient-ref-black-rice",
            "ingredient-ref-puffed-black-rice",
            "ingredient-ref-black-rice-flour",
        )
        assertEquals(blackRiceProducts, filterByIngredientSearchQuery(references, "black rice", searchTerms).map { it.id }.toSet())
        assertEquals(blackRiceProducts, filterByIngredientSearchQuery(references, "riz noir", searchTerms).map { it.id }.toSet())
        assertFalse(blackRice.aliasesEn.any { it in setOf("black glutinous rice", "forbidden rice", "purple rice") })
        assertFalse(blackRice.aliasesFr.any { it == "riz violet" })
        assertNotEquals("ingredient-ref-black-fonio", blackRice.id)
        assertNotEquals("ingredient-ref-brown-rice", blackRice.id)
    }

    @Test
    fun hominyGritsKeepTheGroundProductSeparateFromWholeHominyAndCornmeal() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val hominyGrits = catalog.getValue("ingredient-ref-hominy-grits")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("hominy grits", hominyGrits.nameEn)
        assertEquals("gruau de maïs", hominyGrits.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, hominyGrits.category)
        assertTrue(hominyGrits.aliasesEn.isEmpty())
        assertTrue(hominyGrits.aliasesFr.isEmpty())
        assertNull(hominyGrits.defaultDensity)
        assertTrue(hominyGrits.unitMappings.isEmpty())
        assertEquals(
            "ingredient-ref-hominy-grits",
            filterByIngredientSearchQuery(references, "hominy grits", searchTerms).single().id
        )
        assertEquals(
            "ingredient-ref-hominy-grits",
            filterByIngredientSearchQuery(references, "gruau de maïs", searchTerms).single().id
        )
        assertNotEquals("ingredient-ref-hominy-corn", hominyGrits.id)
        assertNotEquals("ingredient-ref-cornmeal", hominyGrits.id)
    }

    @Test
    fun redRiceGrainAndRoastedFlourKeepTheirProductBoundary() {
        val references = BundledIngredientCatalog.references
        val redRice = references.single { it.id == "ingredient-ref-red-rice" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("red rice", redRice.nameEn)
        assertEquals("riz rouge", redRice.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, redRice.category)
        assertTrue(redRice.aliasesEn.isEmpty())
        assertTrue(redRice.aliasesFr.isEmpty())
        assertNull(redRice.defaultDensity)
        assertTrue(redRice.unitMappings.isEmpty())
        val broadRedRiceResults = setOf(
            "ingredient-ref-red-rice",
            "ingredient-ref-red-rice-flakes",
            "ingredient-ref-roasted-red-rice-flour",
            "ingredient-ref-red-rice-flour",
        )
        assertEquals(
            broadRedRiceResults,
            filterByIngredientSearchQuery(references, "red rice", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            broadRedRiceResults,
            filterByIngredientSearchQuery(references, "riz rouge", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            "ingredient-ref-roasted-red-rice-flour",
            filterByIngredientSearchQuery(references, "roasted red rice flour", searchTerms).single().id
        )
        assertEquals(
            "ingredient-ref-roasted-red-rice-flour",
            filterByIngredientSearchQuery(references, "farine de riz rouge torréfiée", searchTerms).single().id
        )
        assertNotEquals("ingredient-ref-brown-rice", redRice.id)
    }

    @Test
    fun genericPastaIdentityKeepsItsProductScopeAndDoesNotAliasNoodles() {
        val references = BundledIngredientCatalog.references
        val pasta = references.single { it.id == "ingredient-ref-pasta" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("pasta", pasta.nameEn)
        assertEquals("p\u00e2tes alimentaires", pasta.nameFr)
        assertEquals(listOf("p\u00e2te alimentaire"), pasta.aliasesFr)
        assertTrue(pasta.aliasesEn.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, pasta.category)
        assertNull(pasta.defaultDensity)
        assertTrue(pasta.unitMappings.isEmpty())
        assertEquals(
            setOf(
                "ingredient-ref-pasta",
                "ingredient-ref-farfalle",
                "ingredient-ref-egg-pasta",
                "ingredient-ref-gluten-free-pasta",
                "ingredient-ref-whole-wheat-pasta",
            ),
            filterByIngredientSearchQuery(references, "pasta", searchTerms).map { it.id }.toSet()
        )
        listOf("p\u00e2tes alimentaires", "p\u00e2te alimentaire").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query, searchTerms)
                    .any { it.id == "ingredient-ref-pasta" }
            )
        }
        val noodleResults = filterByIngredientSearchQuery(references, "noodles", searchTerms)
        assertTrue(noodleResults.none { it.id == pasta.id })
        assertTrue(noodleResults.any { it.id == "ingredient-ref-bean-thread-cellophane-noodles" })
        assertFalse(pasta.aliasesEn.any { it == "noodles" })
        assertFalse(pasta.aliasesFr.any { it == "nouilles" })
    }

    @Test
    fun spaghettiPastaRemainsSeparateFromSpaghettiSquash() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val spaghetti = catalog.getValue("ingredient-ref-spaghetti")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("spaghetti", spaghetti.nameEn)
        assertEquals("spaghetti", spaghetti.nameFr)
        assertEquals(listOf("spaghettis"), spaghetti.aliasesFr)
        assertTrue(spaghetti.aliasesEn.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, spaghetti.category)
        assertNull(spaghetti.defaultDensity)
        assertTrue(spaghetti.unitMappings.isEmpty())
        assertEquals(
            setOf("ingredient-ref-spaghetti", "ingredient-ref-spaghetti-squash"),
            filterByIngredientSearchQuery(references, "spaghetti", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            listOf("ingredient-ref-spaghetti"),
            filterByIngredientSearchQuery(references, "spaghettis", searchTerms).map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-spaghetti-squash"),
            filterByIngredientSearchQuery(references, "spaghetti squash", searchTerms).map { it.id }
        )
        assertEquals(
            setOf(
                "ingredient-ref-pasta",
                "ingredient-ref-farfalle",
                "ingredient-ref-egg-pasta",
                "ingredient-ref-gluten-free-pasta",
                "ingredient-ref-whole-wheat-pasta",
            ),
            filterByIngredientSearchQuery(references, "pasta", searchTerms).map { it.id }.toSet()
        )
        assertNotEquals(catalog.getValue("ingredient-ref-pasta").id, spaghetti.id)
    }

    @Test
    fun riceVermicelliAndBeanThreadNoodlesKeepTheirIngredientBoundaries() {
        val references = BundledIngredientCatalog.references
        val riceVermicelli = references.single { it.id == "ingredient-ref-rice-vermicelli" }
        val beanThreadNoodles = references.single { it.id == "ingredient-ref-bean-thread-cellophane-noodles" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("rice vermicelli", riceVermicelli.nameEn)
        assertEquals("vermicelle de riz", riceVermicelli.nameFr)
        assertEquals(listOf("vermicelles de riz"), riceVermicelli.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, riceVermicelli.category)
        assertNull(riceVermicelli.defaultDensity)
        assertTrue(riceVermicelli.unitMappings.isEmpty())
        listOf("rice vermicelli", "vermicelle de riz", "vermicelles de riz").forEach { query ->
            assertEquals(
                "ingredient-ref-rice-vermicelli",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }

        assertEquals("bean thread cellophane noodles", beanThreadNoodles.nameEn)
        assertEquals("nouilles à base de farine de haricot mungo", beanThreadNoodles.nameFr)
        assertTrue(beanThreadNoodles.aliasesEn.isEmpty())
        assertTrue(beanThreadNoodles.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.LEGUME_AND_PULSE, beanThreadNoodles.category)
        assertNull(beanThreadNoodles.defaultDensity)
        assertTrue(beanThreadNoodles.unitMappings.isEmpty())
        listOf("bean thread cellophane noodles", "nouilles à base de farine de haricot mungo").forEach { query ->
            assertEquals(
                "ingredient-ref-bean-thread-cellophane-noodles",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        assertTrue(filterByIngredientSearchQuery(references, "rice noodles", searchTerms).isEmpty())
        assertEquals(
            listOf("ingredient-ref-sweet-potato-starch-noodles"),
            filterByIngredientSearchQuery(references, "glass noodles", searchTerms).map { it.id }
        )
    }

    @Test
    fun couscousAndPearlCouscousRemainSeparateIdentityOnlyProducts() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val couscous = catalog.getValue("ingredient-ref-couscous")
        val pearlCouscous = catalog.getValue("ingredient-ref-pearl-couscous")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("couscous", couscous.nameEn)
        assertEquals("couscous", couscous.nameFr)
        assertTrue(couscous.aliasesEn.isEmpty())
        assertTrue(couscous.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, couscous.category)
        assertNull(couscous.defaultDensity)
        assertTrue(couscous.unitMappings.isEmpty())

        assertEquals("pearl couscous", pearlCouscous.nameEn)
        assertEquals("couscous perl\u00e9", pearlCouscous.nameFr)
        assertTrue(pearlCouscous.aliasesEn.isEmpty())
        assertTrue(pearlCouscous.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, pearlCouscous.category)
        assertNull(pearlCouscous.defaultDensity)
        assertTrue(pearlCouscous.unitMappings.isEmpty())

        assertEquals(
            setOf(
                "ingredient-ref-baddaz-corn-couscous",
                "ingredient-ref-barley-couscous",
                "ingredient-ref-couscous",
                "ingredient-ref-keskes-khoumassi",
                "ingredient-ref-maftool",
                "ingredient-ref-millet-couscous-thiere",
                "ingredient-ref-pearl-couscous",
                "ingredient-ref-whole-wheat-couscous",
            ),
            filterByIngredientSearchQuery(references, "couscous", searchTerms).map { it.id }.toSet()
        )
        listOf("pearl couscous", "couscous perl\u00e9").forEach { query ->
            assertEquals(
                "ingredient-ref-pearl-couscous",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        assertNotEquals(couscous.id, pearlCouscous.id)
    }

    @Test
    fun orzoAndMacaroniKeepOnlySourceSupportedSearchNames() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val orzo = catalog.getValue("ingredient-ref-orzo")
        val macaroni = catalog.getValue("ingredient-ref-macaroni")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("orzo", orzo.nameEn)
        assertEquals("orzo", orzo.nameFr)
        assertEquals(listOf("orzos"), orzo.aliasesFr)
        assertEquals(listOf("risoni"), orzo.aliasesEn)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, orzo.category)
        assertNull(orzo.defaultDensity)
        assertTrue(orzo.unitMappings.isEmpty())
        listOf("orzo", "orzos", "risoni").forEach { query ->
            assertEquals(
                "ingredient-ref-orzo",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        assertTrue(filterByIngredientSearchQuery(references, "langue d'oiseau", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "p\u00e2te grecque", searchTerms).isEmpty())

        assertEquals("macaroni", macaroni.nameEn)
        assertEquals("macaroni", macaroni.nameFr)
        assertTrue(macaroni.aliasesEn.isEmpty())
        assertEquals(listOf("macaronis"), macaroni.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, macaroni.category)
        assertNull(macaroni.defaultDensity)
        assertTrue(macaroni.unitMappings.isEmpty())
        listOf("macaroni", "macaronis").forEach { query ->
            assertEquals(
                "ingredient-ref-macaroni",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
    }

    @Test
    fun ramenNoodlesKeepOnlyTheOqlfSupportedBilingualNames() {
        val references = BundledIngredientCatalog.references
        val ramen = references.associateBy { it.id }.getValue("ingredient-ref-ramen-noodles")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("ramen noodles", ramen.nameEn)
        assertEquals("nouilles ramen", ramen.nameFr)
        assertEquals(listOf("ramen"), ramen.aliasesEn)
        assertEquals(listOf("ramen"), ramen.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, ramen.category)
        assertNull(ramen.defaultDensity)
        assertTrue(ramen.unitMappings.isEmpty())
        listOf("ramen noodles", "nouilles ramen", "ramen").forEach { query ->
            assertEquals(
                "ingredient-ref-ramen-noodles",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        listOf("instant noodles", "instant ramen", "ramen soup").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, searchTerms).isEmpty())
        }
    }

    @Test
    fun penneKeepsTheOqlfNamePluralAndEnglishAlternative() {
        val references = BundledIngredientCatalog.references
        val penne = references.associateBy { it.id }.getValue("ingredient-ref-penne")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("penne", penne.nameEn)
        assertEquals("penne", penne.nameFr)
        assertEquals(listOf("mostaccioli"), penne.aliasesEn)
        assertEquals(listOf("pennes"), penne.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, penne.category)
        assertNull(penne.defaultDensity)
        assertTrue(penne.unitMappings.isEmpty())
        listOf("penne", "pennes", "mostaccioli").forEach { query ->
            assertEquals(
                "ingredient-ref-penne",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        listOf("penne lisce", "penne rigate", "plume").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, searchTerms).isEmpty())
        }
    }

    @Test
    fun farfalleKeepsThePreferredNamePluralAndScopedEnglishAlias() {
        val references = BundledIngredientCatalog.references
        val farfalle = references.associateBy { it.id }.getValue("ingredient-ref-farfalle")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("farfalle", farfalle.nameEn)
        assertEquals("farfalle", farfalle.nameFr)
        assertEquals(listOf("bow tie pasta"), farfalle.aliasesEn)
        assertEquals(listOf("farfalles"), farfalle.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, farfalle.category)
        assertNull(farfalle.defaultDensity)
        assertTrue(farfalle.unitMappings.isEmpty())
        listOf("farfalle", "farfalles", "bow tie pasta").forEach { query ->
            assertEquals(
                "ingredient-ref-farfalle",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        listOf("boucle").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, searchTerms).isEmpty())
        }
        assertEquals(
            setOf("ingredient-ref-breaded-butterfly-shrimp", "ingredient-ref-coconut-butterfly-shrimp"),
            filterByIngredientSearchQuery(references, "butterfly", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-moth-beans", "ingredient-ref-breaded-butterfly-shrimp", "ingredient-ref-coconut-butterfly-shrimp"),
            filterByIngredientSearchQuery(references, "papillon", searchTerms).map { it.id }.toSet()
        )
    }

    @Test
    fun cricketPowderSearchKeepsTheSpeciesQualifiedIdentitiesSeparate() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val house = byId.getValue("ingredient-ref-house-cricket-powder")
        val banded = byId.getValue("ingredient-ref-banded-cricket-powder")

        assertEquals("house cricket powder", house.nameEn)
        assertEquals("poudre de grillon domestique", house.nameFr)
        assertEquals("banded cricket powder", banded.nameEn)
        assertEquals("poudre de grillon à bandes", banded.nameFr)
        assertTrue(house.aliasesEn.isEmpty())
        assertTrue(house.aliasesFr.isEmpty())
        assertTrue(banded.aliasesEn.isEmpty())
        assertTrue(banded.aliasesFr.isEmpty())
        assertNull(banded.defaultDensity)
        assertTrue(banded.unitMappings.isEmpty())

        assertEquals(
            listOf(banded.id),
            filterByIngredientSearchQuery(references, "banded cricket powder", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(banded.id),
            filterByIngredientSearchQuery(references, "grillon à bandes", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(banded.id),
            filterByIngredientSearchQuery(references, "poudre de grillon à bandes", searchTerms).map { it.id }
        )
        assertEquals(
            setOf(house.id, banded.id),
            filterByIngredientSearchQuery(references, "cricket powder", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf(house.id, banded.id),
            filterByIngredientSearchQuery(references, "poudre de grillon", searchTerms).map { it.id }.toSet()
        )
    }

    @Test
    fun bambaraPulseUsesItsCanadianFrenchNamesAndStaysDistinctFromMothBeans() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val bambara = byId.getValue("ingredient-ref-bambara-beans")
        val mothBeans = byId.getValue("ingredient-ref-moth-beans")

        assertEquals("Bambara beans", bambara.nameEn)
        assertEquals("pois bambara", bambara.nameFr)
        assertEquals(IngredientCategory.LEGUME_AND_PULSE, bambara.category)
        assertEquals(listOf("Bambara bean", "Bambara groundnut", "Bambara groundnuts"), bambara.aliasesEn)
        assertEquals(listOf("pois de terre", "voandzou"), bambara.aliasesFr)
        assertEquals("moth beans", mothBeans.nameEn)
        assertNotEquals(bambara.id, mothBeans.id)
        assertNull(bambara.defaultDensity)
        assertTrue(bambara.unitMappings.isEmpty())

        listOf("Bambara bean", "Bambara groundnuts", "pois de terre", "voandzou").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(bambara.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        val bambaraBeanAndFlour = setOf(bambara.id, "ingredient-ref-bambara-groundnut-flour")
        listOf("Bambara beans", "Bambara groundnut", "pois bambara").forEach { query ->
            assertEquals(
                "query: $query",
                bambaraBeanAndFlour,
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }.toSet()
            )
        }
        assertTrue(filterByIngredientSearchQuery(references, "Vigna subterranea", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "Voandzeia subterranea", searchTerms).isEmpty())
    }

    @Test
    fun greatNorthernBeanSearchKeepsTheNamedDryBeanClassSeparateFromWhiteBeanTerms() {
        val references = BundledIngredientCatalog.references
        val greatNorthern = references.associateBy { it.id }.getValue("ingredient-ref-great-northern-beans")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("Great Northern beans", greatNorthern.nameEn)
        assertEquals("haricots Great Northern", greatNorthern.nameFr)
        assertEquals(listOf("Great Northern bean"), greatNorthern.aliasesEn)
        assertEquals(listOf("haricot Great Northern"), greatNorthern.aliasesFr)
        assertNull(greatNorthern.defaultDensity)
        assertTrue(greatNorthern.unitMappings.isEmpty())

        listOf("Great Northern beans", "haricot Great Northern").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(greatNorthern.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        listOf("Great Northern bean", "haricots Great Northern", "Great Northern").forEach { query ->
            assertEquals(
                "query: $query",
                setOf(greatNorthern.id, "ingredient-ref-great-northern-bean-flour"),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }.toSet()
            )
        }
        assertEquals(
            listOf("ingredient-ref-great-northern-bean-flour"),
            filterByIngredientSearchQuery(references, "whole Great Northern bean flour", searchTerms)
                .map { it.id }
        )
        listOf(
            "white beans",
            "haricots blancs",
            "navy beans",
            "petits haricots blancs",
            "cannellini beans",
            "haricots cannellini",
            "white kidney beans",
            "gros haricots blancs",
            "grands haricots blancs"
        ).forEach { query ->
            assertFalse(
                "query must not resolve to Great Northern: $query",
                filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == greatNorthern.id }
            )
        }
    }

    @Test
    fun mungBeanSearchKeepsVignaRadiataSeparateFromUradAndProcessedProducts() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val mungBeans = byId.getValue("ingredient-ref-mung-beans")
        val sprouts = byId.getValue("ingredient-ref-mung-bean-sprouts")
        val starch = byId.getValue("ingredient-ref-mung-bean-starch")
        val noodles = byId.getValue("ingredient-ref-bean-thread-cellophane-noodles")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("mung beans", mungBeans.nameEn)
        assertEquals("haricots mungo", mungBeans.nameFr)
        assertEquals(listOf("mung bean", "green gram", "golden gram"), mungBeans.aliasesEn)
        assertEquals(listOf("haricot mungo"), mungBeans.aliasesFr)
        assertNull(mungBeans.defaultDensity)
        assertTrue(mungBeans.unitMappings.isEmpty())
        assertNotEquals(mungBeans.id, sprouts.id)
        assertNotEquals(mungBeans.id, starch.id)
        assertNotEquals(mungBeans.id, noodles.id)

        listOf("mung beans", "mung bean", "green gram", "golden gram", "haricots mungo", "haricot mungo")
            .forEach { query ->
                assertTrue(
                    "query must find the Vigna radiata seed identity: $query",
                    filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == mungBeans.id }
                )
            }
        listOf("black gram", "urd", "urad", "mung bean flour", "mung dal")
            .forEach { query ->
                assertFalse(
                    "query must not resolve to the Vigna radiata seed identity: $query",
                    filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == mungBeans.id }
                )
            }
    }

    @Test
    fun goldenSyrupSearchKeepsTheRefinedSugarSyrupClassSeparateFromCornAndMolasses() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val goldenSyrup = byId.getValue("ingredient-ref-golden-syrup")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("golden syrup", goldenSyrup.nameEn)
        assertEquals("sirop doré", goldenSyrup.nameFr)
        assertEquals(listOf("refined sugar syrup", "refiners' syrup"), goldenSyrup.aliasesEn)
        assertEquals(
            listOf("sirop de sucre raffiné", "sirop de raffineur", "mélasse claire", "mélasse légère"),
            goldenSyrup.aliasesFr
        )
        assertNull(goldenSyrup.defaultDensity)
        assertTrue(goldenSyrup.unitMappings.isEmpty())

        listOf(
            "golden syrup",
            "refined sugar syrup",
            "refiners' syrup",
            "sirop doré",
            "sirop de sucre raffiné",
            "sirop de raffineur",
            "mélasse claire",
            "mélasse légère"
        ).forEach { query ->
            assertTrue(
                "query must find golden syrup: $query",
                filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == goldenSyrup.id }
            )
        }
        listOf("golden corn syrup", "sirop de maïs doré", "blackstrap molasses", "maple syrup")
            .forEach { query ->
                assertFalse(
                    "query must not resolve to golden syrup: $query",
                    filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == goldenSyrup.id }
                )
            }
        listOf(
            "ingredient-ref-corn-syrup",
            "ingredient-ref-dark-corn-syrup",
            "ingredient-ref-glucose-syrup",
            "ingredient-ref-invert-sugar",
            "ingredient-ref-liquid-invert-sugar",
            "ingredient-ref-maple-syrup",
            "ingredient-ref-blackstrap-molasses"
        ).forEach { siblingId ->
            assertNotEquals(goldenSyrup.id, byId.getValue(siblingId).id)
        }
    }

    @Test
    fun navyBeanSearchKeepsTheOqlfTermQualifiedAndSeparateFromOtherBeanClasses() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val navy = byId.getValue("ingredient-ref-navy-beans")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }

        assertEquals("navy beans", navy.nameEn)
        assertEquals("haricots Navy", navy.nameFr)
        assertEquals(listOf("navy bean", "white pea bean", "white pea beans"), navy.aliasesEn)
        assertEquals(listOf("petit haricot blanc"), navy.aliasesFr)
        assertEquals(IngredientCategory.LEGUME_AND_PULSE, navy.category)
        assertNull(navy.defaultDensity)
        assertTrue(navy.unitMappings.isEmpty())

        listOf("navy beans", "white pea bean", "white pea beans", "petit haricot blanc").forEach { query ->
            assertEquals("query: $query", listOf(navy.id), matches(query))
        }
        listOf("navy bean", "haricots Navy").forEach { query ->
            assertEquals(
                "query: $query",
                setOf(navy.id, "ingredient-ref-navy-bean-flour"),
                matches(query).toSet()
            )
        }
        assertEquals(
            listOf("ingredient-ref-navy-bean-flour"),
            matches("whole navy bean flour")
        )
        listOf("white beans", "haricots blancs", "petits haricots blancs", "small white bean")
            .forEach { query ->
                assertFalse("query must not resolve to Navy: $query", navy.id in matches(query))
            }
        listOf(
            "ingredient-ref-great-northern-beans",
            "ingredient-ref-cannellini-beans",
            "ingredient-ref-kidney-beans",
            "ingredient-ref-yellow-peas"
        ).forEach { siblingId -> assertNotEquals(navy.id, byId.getValue(siblingId).id) }
    }

    @Test
    fun lightCornSyrupSearchKeepsGradeTermsSeparateFromGenericAndDarkSyrup() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val light = byId.getValue("ingredient-ref-light-corn-syrup")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }

        assertEquals("light corn syrup", light.nameEn)
        assertEquals("sirop de maïs clair", light.nameFr)
        assertTrue(light.aliasesEn.isEmpty())
        assertEquals(listOf("sirop de maïs léger"), light.aliasesFr)
        assertEquals(IngredientCategory.SUGAR_AND_SWEETENER, light.category)
        assertNull(light.defaultDensity)
        assertTrue(light.unitMappings.isEmpty())

        listOf("light corn syrup", "sirop de maïs clair", "sirop de maïs léger")
            .forEach { query -> assertEquals("query: $query", listOf(light.id), matches(query)) }
        val syrupGrades = setOf(
            "ingredient-ref-corn-syrup",
            "ingredient-ref-dark-corn-syrup",
            light.id
        )
        assertEquals(syrupGrades, matches("corn syrup").toSet())
        assertEquals(syrupGrades, matches("sirop de maïs").toSet())
        assertFalse(light.id in matches("white corn syrup"))
        assertFalse(light.id in matches("Crown Lily White"))
    }

    @Test
    fun cannelliniSearchDoesNotTurnWhiteKidneyWordingIntoTheKidneyBeansIdentity() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val cannellini = byId.getValue("ingredient-ref-cannellini-beans")
        val kidneyBeans = byId.getValue("ingredient-ref-kidney-beans")
        val greatNorthern = byId.getValue("ingredient-ref-great-northern-beans")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("cannellini beans", cannellini.nameEn)
        assertEquals("haricots cannellini", cannellini.nameFr)
        assertEquals(listOf("cannellini bean", "cannellino bean"), cannellini.aliasesEn)
        assertEquals(listOf("haricot cannellini"), cannellini.aliasesFr)
        assertNull(cannellini.defaultDensity)
        assertTrue(cannellini.unitMappings.isEmpty())
        assertNotEquals(cannellini.id, kidneyBeans.id)
        assertNotEquals(cannellini.id, greatNorthern.id)

        listOf("cannellini beans", "cannellini bean", "cannellino bean", "haricots cannellini", "haricot cannellini")
            .forEach { query ->
                assertTrue(
                    "query must find Cannellini beans: $query",
                    filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == cannellini.id }
                )
            }
        listOf("white kidney beans", "white kidney bean", "kidney beans", "haricots blancs", "navy beans")
            .forEach { query ->
                assertFalse(
                    "query must not resolve to Cannellini beans through a broad white-bean phrase: $query",
                    filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == cannellini.id }
                )
            }
    }

    @Test
    fun rabbitMeatSearchUsesOnlyTheBilingualIdentityAndKeepsHareSeparate() {
        val references = BundledIngredientCatalog.references
        val rabbit = references.single { it.id == "ingredient-ref-rabbit-meat" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("rabbit meat", rabbit.nameEn)
        assertEquals("viande de lapin", rabbit.nameFr)
        assertTrue(rabbit.aliasesEn.isEmpty())
        assertTrue(rabbit.aliasesFr.isEmpty())
        assertNull(rabbit.defaultDensity)
        assertTrue(rabbit.unitMappings.isEmpty())

        listOf("rabbit", "rabbit meat", "viande de lapin", "lapin").forEach { query ->
            assertTrue(
                "query must find rabbit meat: $query",
                filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == rabbit.id }
            )
        }
        listOf("hare", "lièvre", "lapin à queue blanche", "cottontail", "wild rabbit").forEach { query ->
            assertFalse(
                "query must not resolve to farmed rabbit meat: $query",
                filterByIngredientSearchQuery(references, query, searchTerms).any { it.id == rabbit.id }
            )
        }
    }

    @Test
    fun brownRiceSyrupAndBlackstrapKeepQualifiedNamesAndBroadSearchBoundaries() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val brownRiceSyrup = byId.getValue("ingredient-ref-brown-rice-syrup")
        val blackstrap = byId.getValue("ingredient-ref-blackstrap-molasses")
        val pomegranateMolasses = byId.getValue("ingredient-ref-pomegranate-molasses")
        val fancyMolasses = byId.getValue("ingredient-ref-fancy-molasses")

        assertEquals("brown rice syrup", brownRiceSyrup.nameEn)
        assertEquals("sirop de riz brun", brownRiceSyrup.nameFr)
        assertTrue(brownRiceSyrup.aliasesEn.isEmpty())
        assertTrue(brownRiceSyrup.aliasesFr.isEmpty())
        assertEquals("blackstrap molasses", blackstrap.nameEn)
        assertEquals("mélasse verte", blackstrap.nameFr)
        assertEquals(listOf("blackstrap", "black strap", "third molasses"), blackstrap.aliasesEn)
        assertTrue(blackstrap.aliasesFr.isEmpty())
        assertNotEquals(blackstrap.id, pomegranateMolasses.id)

        listOf("brown rice syrup", "sirop de riz brun", "rice syrup", "sirop de riz").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(brownRiceSyrup.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        listOf("blackstrap molasses", "blackstrap", "black strap", "third molasses", "mélasse verte").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(blackstrap.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        assertEquals(
            setOf(blackstrap.id, fancyMolasses.id, pomegranateMolasses.id),
            filterByIngredientSearchQuery(references, "molasses", searchTerms).map { it.id }.toSet()
        )
        assertTrue(filterByIngredientSearchQuery(references, "black treacle", searchTerms).isEmpty())
        assertTrue(filterByIngredientSearchQuery(references, "mélasse noire", searchTerms).isEmpty())
    }

    @Test
    fun agaveSyrupUsesTheQualifiedNameWithoutCapturingNectarSearch() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val agave = byId.getValue("ingredient-ref-agave-syrup")
        val nectarine = byId.getValue("ingredient-ref-nectarine")

        assertEquals("agave syrup", agave.nameEn)
        assertEquals("sirop d’agave", agave.nameFr)
        assertTrue(agave.aliasesEn.isEmpty())
        assertTrue(agave.aliasesFr.isEmpty())
        listOf("agave syrup", "sirop d’agave").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(agave.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        assertTrue(filterByIngredientSearchQuery(references, "agave nectar", searchTerms).isEmpty())
        assertEquals(
            listOf(nectarine.id),
            filterByIngredientSearchQuery(references, "nectar", searchTerms).map { it.id }
        )
    }

    @Test
    fun foxtailMilletHasSpeciesQualifiedNamesAndNoBroadAliases() {
        val references = BundledIngredientCatalog.references
        val foxtail = references.associateBy { it.id }.getValue("ingredient-ref-foxtail-millet")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("foxtail millet", foxtail.nameEn)
        assertEquals("millet d'Italie", foxtail.nameFr)
        assertEquals(
            listOf("thinai", "kangni", "korra", "rala", "navane", "kakum", "kakun", "kangani", "kauni", "kaon"),
            foxtail.aliasesEn
        )
        assertTrue(foxtail.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, foxtail.category)
        assertNull(foxtail.defaultDensity)
        assertTrue(foxtail.unitMappings.isEmpty())
        assertEquals(
            setOf("ingredient-ref-foxtail-millet", "ingredient-ref-foxtail-millet-flour"),
            filterByIngredientSearchQuery(references, "foxtail millet", searchTerms).map { it.id }.toSet(),
        )
        assertEquals(
            setOf("ingredient-ref-foxtail-millet", "ingredient-ref-foxtail-millet-flour"),
            filterByIngredientSearchQuery(references, "millet d'Italie", searchTerms).map { it.id }.toSet(),
        )
        listOf("millet des oiseaux", "petit mil").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, searchTerms).isEmpty())
        }
    }

    @Test
    fun commonMilletHasItsQuebecSpeciesNameAndProsoAlias() {
        val references = BundledIngredientCatalog.references
        val common = references.associateBy { it.id }.getValue("ingredient-ref-common-millet")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("common millet", common.nameEn)
        assertEquals("millet commun", common.nameFr)
        assertEquals(
            listOf("chena", "proso millet", "barri", "cheno", "cheena", "cheena millet", "panivaragu"),
            common.aliasesEn,
        )
        assertTrue(common.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, common.category)
        assertNull(common.defaultDensity)
        assertTrue(common.unitMappings.isEmpty())
        assertEquals(listOf(common.id), filterByIngredientSearchQuery(references, "common millet", searchTerms).map { it.id })
        setOf("ingredient-ref-common-millet", "ingredient-ref-proso-millet-flour").let { expected ->
            assertEquals(expected, filterByIngredientSearchQuery(references, "millet commun", searchTerms).map { it.id }.toSet())
            assertEquals(expected, filterByIngredientSearchQuery(references, "proso millet", searchTerms).map { it.id }.toSet())
        }
    }

    @Test
    fun fingerMilletHasASeparateSpeciesQualifiedNameAndRagiAlias() {
        val references = BundledIngredientCatalog.references
        val fingerMillet = references.associateBy { it.id }.getValue("ingredient-ref-finger-millet")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("finger millet", fingerMillet.nameEn)
        assertEquals("éleusine cultivée", fingerMillet.nameFr)
        assertEquals(listOf("ragi", "kurakkan", "mandua", "ragulu"), fingerMillet.aliasesEn)
        assertTrue(fingerMillet.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, fingerMillet.category)
        assertNull(fingerMillet.defaultDensity)
        assertTrue(fingerMillet.unitMappings.isEmpty())
        assertEquals(
            setOf("ingredient-ref-finger-millet", "ingredient-ref-finger-millet-flour"),
            filterByIngredientSearchQuery(references, "finger millet", searchTerms).map { it.id }.toSet(),
        )
        listOf("éleusine cultivée", "eleusine cultivee").forEach { query ->
            assertEquals("ingredient-ref-finger-millet", filterByIngredientSearchQuery(references, query, searchTerms).single().id)
        }
        assertEquals(
            setOf("ingredient-ref-finger-millet", "ingredient-ref-finger-millet-flour"),
            filterByIngredientSearchQuery(references, "ragi", searchTerms).map { it.id }.toSet(),
        )
        assertTrue(filterByIngredientSearchQuery(references, "millet africain", searchTerms).isEmpty())
    }

    @Test
    fun fusilliUsesTheOqlfFrenchPluralAndOmitsTheBroadShapeWord() {
        val references = BundledIngredientCatalog.references
        val fusilli = references.associateBy { it.id }.getValue("ingredient-ref-fusilli")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("fusilli", fusilli.nameEn)
        assertEquals("fusilli", fusilli.nameFr)
        assertTrue(fusilli.aliasesEn.isEmpty())
        assertEquals(listOf("fusillis"), fusilli.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, fusilli.category)
        assertNull(fusilli.defaultDensity)
        assertTrue(fusilli.unitMappings.isEmpty())
        listOf("fusilli", "fusillis").forEach { query ->
            assertEquals(
                "ingredient-ref-fusilli",
                filterByIngredientSearchQuery(references, query, searchTerms).single().id
            )
        }
        assertTrue(filterByIngredientSearchQuery(references, "spirale", searchTerms).isEmpty())
    }

    @Test
    fun bombaRiceIsASeparateNamedVarietyWithoutUnsupportedAliasesOrMeasurements() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val bomba = catalog.getValue("ingredient-ref-bomba-rice")

        assertEquals("bomba rice", bomba.nameEn)
        assertEquals("riz bomba", bomba.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, bomba.category)
        assertTrue(bomba.aliasesEn.isEmpty())
        assertTrue(bomba.aliasesFr.isEmpty())
        assertNull(bomba.defaultDensity)
        assertTrue(bomba.unitMappings.isEmpty())
        assertEquals(
            1,
            references.count { reference ->
                reference.nameEn == "bomba rice" || reference.nameFr == "riz bomba"
            }
        )
        listOf("bomba rice", "riz bomba").forEach { query ->
            val result = filterByIngredientSearchQuery(references, query) { reference ->
                listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
            }
            assertEquals("ingredient-ref-bomba-rice", result.single().id)
        }
    }

    @Test
    fun calroseMarketTypeDoesNotCollapseIntoGenericSushiRice() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val calrose = catalog.getValue("ingredient-ref-calrose-rice")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("calrose rice", calrose.nameEn)
        assertEquals("riz Calrose", calrose.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, calrose.category)
        assertTrue(calrose.aliasesEn.isEmpty())
        assertTrue(calrose.aliasesFr.isEmpty())
        assertNull(calrose.defaultDensity)
        assertTrue(calrose.unitMappings.isEmpty())
        assertEquals(
            "ingredient-ref-calrose-rice",
            filterByIngredientSearchQuery(references, "calrose rice", searchTerms).single().id
        )
        assertEquals(
            "ingredient-ref-calrose-rice",
            filterByIngredientSearchQuery(references, "riz Calrose", searchTerms).single().id
        )
        val sushiRice = catalog.getValue("ingredient-ref-sushi-rice")
        assertEquals("sushi rice", sushiRice.nameEn)
        assertEquals("riz à sushi", sushiRice.nameFr)
        assertEquals(
            listOf(sushiRice.id),
            filterByIngredientSearchQuery(references, "sushi rice", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(sushiRice.id),
            filterByIngredientSearchQuery(references, "riz à sushi", searchTerms).map { it.id }
        )
        assertTrue(filterByIngredientSearchQuery(references, "sushi rice", searchTerms).none { it.id == calrose.id })
        assertTrue(filterByIngredientSearchQuery(references, "riz à sushi", searchTerms).none { it.id == calrose.id })
    }

    @Test
    fun amaranthAndGenericMilletStayDistinctFromTheirFlourAndSpeciesIdentities() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        val amaranth = catalog.getValue("ingredient-ref-amaranth-grain")
        assertEquals("amaranth", amaranth.nameEn)
        assertEquals("amarante", amaranth.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, amaranth.category)
        assertEquals(listOf("ramdana", "rajgira"), amaranth.aliasesEn)
        assertEquals(listOf("grains d'amarante"), amaranth.aliasesFr)
        assertNull(amaranth.defaultDensity)
        assertTrue(amaranth.unitMappings.isEmpty())
        assertEquals(
            setOf(
                "ingredient-ref-amaranth-grain",
                "ingredient-ref-amaranth-flakes",
                "ingredient-ref-amaranth-flour",
                "ingredient-ref-amaranth-greens",
                "ingredient-ref-puffed-amaranth",
                "ingredient-ref-sprouted-amaranth-flour",
            ),
            filterByIngredientSearchQuery(references, "amaranth", searchTerms).map { it.id }.toSet()
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
            filterByIngredientSearchQuery(references, "amarante", searchTerms).map { it.id }.toSet()
        )

        val millet = catalog.getValue("ingredient-ref-millet")
        assertEquals("millet", millet.nameEn)
        assertEquals("millet", millet.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, millet.category)
        assertTrue(millet.aliasesEn.isEmpty())
        assertTrue(millet.aliasesFr.isEmpty())
        assertNull(millet.defaultDensity)
        assertTrue(millet.unitMappings.isEmpty())
        assertEquals(
            setOf(
                "ingredient-ref-arraw",
                "ingredient-ref-biowig-millet-cream",
                "ingredient-ref-millet",
                "ingredient-ref-millet-flour",
                "ingredient-ref-pearl-millet",
                "ingredient-ref-pearl-millet-flour",
                "ingredient-ref-foxtail-millet",
                "ingredient-ref-millet-flakes",
                "ingredient-ref-millet-couscous-thiere",
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
            filterByIngredientSearchQuery(references, "millet", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            listOf("ingredient-ref-puffed-millet"),
            filterByIngredientSearchQuery(references, "millet puffs", searchTerms).map { it.id }
        )
        assertEquals(
            setOf("ingredient-ref-pearl-millet", "ingredient-ref-pearl-millet-flour"),
            filterByIngredientSearchQuery(references, "millet perlé", searchTerms).map { it.id }.toSet()
        )
        assertFalse(millet.aliasesFr.any { it == "mil" || it == "petit mil" })
        assertFalse(millet.aliasesEn.any { it in setOf("pearl millet", "foxtail millet", "proso millet") })
    }

    @Test
    fun flourIdentityBatchKeepsDistinctProductsAndNoUnsupportedMeasurements() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }
        val accepted = mapOf(
            "ingredient-ref-oat-flour" to ("oat flour" to "farine d'avoine"),
            "ingredient-ref-rice-flour" to ("rice flour" to "farine de riz"),
            "ingredient-ref-buckwheat-flour" to ("buckwheat flour" to "farine de sarrasin"),
            "ingredient-ref-quinoa-flour" to ("quinoa flour" to "farine de quinoa"),
            "ingredient-ref-amaranth-flour" to ("amaranth flour" to "farine d'amarante"),
            "ingredient-ref-chickpea-flour" to ("chickpea flour" to "farine de pois chiche"),
            "ingredient-ref-rye-flour" to ("rye flour" to "farine de seigle"),
            "ingredient-ref-spelt-flour" to ("spelt flour" to "farine d'épeautre"),
            "ingredient-ref-whole-spelt-flour" to ("whole spelt flour" to "farine d'épeautre entière"),
            "ingredient-ref-einkorn-flour" to ("einkorn flour" to "farine de petit épeautre"),
            "ingredient-ref-emmer-flour" to ("emmer flour" to "farine d'amidonnier"),
            "ingredient-ref-khorasan-flour" to ("khorasan flour" to "farine de khorasan"),
            "ingredient-ref-barley-flour" to ("barley flour" to "farine d'orge"),
        )

        accepted.forEach { (id, names) ->
            val ingredient = catalog.getValue(id)
            assertEquals(names.first, ingredient.nameEn)
            assertEquals(names.second, ingredient.nameFr)
            assertEquals(IngredientCategory.FLOUR_AND_STARCH, ingredient.category)
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }

        assertTrue(catalog.getValue("ingredient-ref-amaranth-flour").aliasesFr.none { it == "farine d'amaranthe" })
        assertTrue(catalog.getValue("ingredient-ref-rye-flour").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-rye-flour").aliasesFr.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-spelt-flour").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-spelt-flour").aliasesFr.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-einkorn-flour").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-einkorn-flour").aliasesFr.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-emmer-flour").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-emmer-flour").aliasesFr.isEmpty())
        assertFalse(catalog.getValue("ingredient-ref-emmer-flour").aliasesEn.contains("farro"))
        assertFalse(catalog.getValue("ingredient-ref-emmer-flour").aliasesFr.contains("farro"))
        assertTrue(catalog.getValue("ingredient-ref-khorasan-flour").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-khorasan-flour").aliasesFr.isEmpty())
        assertFalse(catalog.getValue("ingredient-ref-khorasan-flour").aliasesEn.contains("kamut"))
        assertFalse(catalog.getValue("ingredient-ref-khorasan-flour").aliasesFr.contains("kamut"))
        assertEquals(listOf("jau atta"), catalog.getValue("ingredient-ref-barley-flour").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-barley-flour").aliasesFr.isEmpty())
        assertEquals(
            "ingredient-ref-chickpea-flour",
            catalog.values.single { "farine de pois chiches" in it.aliasesFr }.id
        )
        assertEquals("ingredient-ref-quinoa", catalog.getValue("ingredient-ref-quinoa").id)
        assertEquals("ingredient-ref-chickpeas", catalog.getValue("ingredient-ref-chickpeas").id)
        assertTrue(catalog.getValue("ingredient-ref-chickpeas").aliasesEn.none { it == "chickpea flour" })
    }

    @Test
    fun specialistWheatFloursKeepTheirProductDistinctionsAndNoNumericData() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val bySearchKey = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { alias -> normalizeIngredientSearchKey(alias) to ingredient.id }
        }.toMap()
        val accepted = mapOf(
            "ingredient-ref-atta" to ("atta" to "atta"),
            "ingredient-ref-durum-flour" to ("durum flour" to "farine de blé dur"),
            "ingredient-ref-maida" to ("maida" to "maida"),
            "ingredient-ref-semola-rimacinata" to ("remilled durum semolina" to "semoule de blé dur remoulue"),
            "ingredient-ref-pastry-flour" to ("pastry flour" to "farine à pâtisserie"),
            "ingredient-ref-whole-wheat-pastry-flour" to ("whole-wheat pastry flour" to "farine de blé entier à pâtisserie"),
            "ingredient-ref-high-gluten-flour" to ("high-gluten flour" to "farine à haute teneur en gluten"),
            "ingredient-ref-self-rising-flour" to ("self-rising flour" to "farine à levure"),
        )

        accepted.forEach { (id, names) ->
            val ingredient = catalog.getValue(id)
            assertEquals(names.first, ingredient.nameEn)
            assertEquals(names.second, ingredient.nameFr)
            assertEquals(IngredientCategory.FLOUR_AND_STARCH, ingredient.category)
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }

        assertEquals("ingredient-ref-pastry-flour", bySearchKey[normalizeIngredientSearchKey("farine à pâtisserie")])
        assertEquals("ingredient-ref-durum-flour", bySearchKey[normalizeIngredientSearchKey("durum wheat flour")])
        assertEquals("ingredient-ref-durum-flour", bySearchKey[normalizeIngredientSearchKey("farine de blé durum")])
        assertEquals("ingredient-ref-atta", bySearchKey[normalizeIngredientSearchKey("farine à chapati")])
        assertEquals("ingredient-ref-atta", bySearchKey[normalizeIngredientSearchKey("chapati flour")])
        assertEquals("ingredient-ref-maida", bySearchKey[normalizeIngredientSearchKey("maida flour")])
        assertEquals("ingredient-ref-semola-rimacinata", bySearchKey[normalizeIngredientSearchKey("semola rimacinata")])
        assertEquals("ingredient-ref-semola-rimacinata", bySearchKey[normalizeIngredientSearchKey("semolina rimacinata")])
        assertEquals("ingredient-ref-semola-rimacinata", bySearchKey[normalizeIngredientSearchKey("semoule de blé dur remoulue")])
        assertEquals("ingredient-ref-all-purpose-flour", bySearchKey[normalizeIngredientSearchKey("all purpose flour")])
        assertEquals("ingredient-ref-all-purpose-flour", bySearchKey[normalizeIngredientSearchKey("farine tout usage")])
        assertEquals("ingredient-ref-whole-wheat-flour", bySearchKey[normalizeIngredientSearchKey("whole wheat flour")])
        assertEquals("ingredient-ref-self-rising-flour", bySearchKey[normalizeIngredientSearchKey("farine autolevante")])
        assertEquals("ingredient-ref-self-rising-flour", bySearchKey[normalizeIngredientSearchKey("self-raising flour")])
        assertTrue(catalog.getValue("ingredient-ref-cake-flour").aliasesFr.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-pastry-flour").id != catalog.getValue("ingredient-ref-cake-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-whole-wheat-pastry-flour").id != catalog.getValue("ingredient-ref-whole-wheat-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-high-gluten-flour").id != catalog.getValue("ingredient-ref-bread-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-atta").id != catalog.getValue("ingredient-ref-whole-wheat-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-spelt-flour").id != catalog.getValue("ingredient-ref-whole-wheat-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-einkorn-flour").id != catalog.getValue("ingredient-ref-spelt-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-einkorn-flour").id != catalog.getValue("ingredient-ref-whole-wheat-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-emmer-flour").id != catalog.getValue("ingredient-ref-einkorn-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-emmer-flour").id != catalog.getValue("ingredient-ref-spelt-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-emmer-flour").id != catalog.getValue("ingredient-ref-whole-wheat-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-khorasan-flour").id != catalog.getValue("ingredient-ref-durum-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-barley-flour").id != catalog.getValue("ingredient-ref-hulled-barley").id)
        assertTrue(catalog.getValue("ingredient-ref-barley-flour").id != catalog.getValue("ingredient-ref-pearl-barley").id)
        assertTrue(catalog.getValue("ingredient-ref-durum-flour").id != catalog.getValue("ingredient-ref-durum-semolina").id)
        assertTrue(catalog.getValue("ingredient-ref-durum-flour").id != catalog.getValue("ingredient-ref-semola-rimacinata").id)
        assertTrue(catalog.getValue("ingredient-ref-maida").id != catalog.getValue("ingredient-ref-all-purpose-flour").id)
        assertTrue(catalog.getValue("ingredient-ref-semola-rimacinata").id != catalog.getValue("ingredient-ref-durum-semolina").id)
    }

    @Test
    fun vitalWheatGlutenUsesQuebecTerminologyAndStaysSeparateFromHighGlutenFlour() {
        val references = BundledIngredientCatalog.references
        val vitalGluten = references.single { it.id == "ingredient-ref-vital-wheat-gluten" }

        assertEquals("vital wheat gluten", vitalGluten.nameEn)
        assertEquals("gluten de froment élastique", vitalGluten.nameFr)
        assertEquals(listOf("gluten de blé vital", "farine de gluten"), vitalGluten.aliasesFr)
        assertEquals(listOf("gluten flour"), vitalGluten.aliasesEn)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, vitalGluten.category)
        assertNull(vitalGluten.defaultDensity)
        assertTrue(vitalGluten.unitMappings.isEmpty())

        assertEquals(
            listOf(vitalGluten.id),
            filterByIngredientSearchQuery(references, "vital wheat gluten") { reference ->
                listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
            }.map { it.id }
        )
        assertEquals(
            listOf(vitalGluten.id),
            filterByIngredientSearchQuery(references, "gluten de froment elastique") { reference ->
                listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
            }.map { it.id }
        )
        assertEquals(
            listOf(vitalGluten.id),
            filterByIngredientSearchQuery(references, "gluten de blé vital") { reference ->
                listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
            }.map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-high-gluten-flour"),
            filterByIngredientSearchQuery(references, "high-gluten flour") { reference ->
                listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
            }.map { it.id }
        )
        assertEquals(
            setOf("ingredient-ref-vital-wheat-gluten", "ingredient-ref-high-gluten-flour"),
            filterByIngredientSearchQuery(references, "gluten flour") { reference ->
                listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
            }.map { it.id }.toSet()
        )
        assertEquals(
            listOf(vitalGluten.id),
            filterByIngredientSearchQuery(references, "farine de gluten") { reference ->
                listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
            }.map { it.id }
        )
    }

    @Test
    fun wheatStarchUsesQuebecTermsAndRemainsSeparateFromFlourAndGluten() {
        val references = BundledIngredientCatalog.references
        val wheatStarch = references.single { it.id == "ingredient-ref-wheat-starch" }
        val searchableNames: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("wheat starch", wheatStarch.nameEn)
        assertEquals("amidon de blé", wheatStarch.nameFr)
        assertEquals(listOf("amidon de froment"), wheatStarch.aliasesFr)
        assertTrue(wheatStarch.aliasesEn.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, wheatStarch.category)
        assertNull(wheatStarch.defaultDensity)
        assertTrue(wheatStarch.unitMappings.isEmpty())
        assertEquals(
            setOf(wheatStarch.id, "ingredient-ref-modified-wheat-starch", "ingredient-ref-resistant-wheat-starch", "ingredient-ref-pregelatinized-wheat-starch"),
            filterByIngredientSearchQuery(references, "wheat starch", searchableNames).map { it.id }.toSet(),
        )
        assertEquals(
            setOf(wheatStarch.id, "ingredient-ref-modified-wheat-starch", "ingredient-ref-pregelatinized-wheat-starch"),
            filterByIngredientSearchQuery(references, "amidon de ble", searchableNames).map { it.id }.toSet(),
        )
        assertEquals(listOf(wheatStarch.id), filterByIngredientSearchQuery(references, "amidon de froment", searchableNames).map { it.id })
        assertTrue(wheatStarch.id != references.single { it.id == "ingredient-ref-whole-wheat-flour" }.id)
        assertTrue(wheatStarch.id != references.single { it.id == "ingredient-ref-vital-wheat-gluten" }.id)
        assertTrue(wheatStarch.id != references.single { it.id == "ingredient-ref-cornstarch" }.id)
    }

    @Test
    fun maltedBarleyFlourUsesQuebecTermsAndRemainsSeparateFromBarleyFlour() {
        val references = BundledIngredientCatalog.references
        val maltedBarleyFlour = references.single { it.id == "ingredient-ref-malted-barley-flour" }
        val barleyFlour = references.single { it.id == "ingredient-ref-barley-flour" }
        val searchableNames: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("malted barley flour", maltedBarleyFlour.nameEn)
        assertEquals("farine d'orge maltée", maltedBarleyFlour.nameFr)
        assertEquals(listOf("malt barley flour"), maltedBarleyFlour.aliasesEn)
        assertTrue(maltedBarleyFlour.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, maltedBarleyFlour.category)
        assertNull(maltedBarleyFlour.defaultDensity)
        assertTrue(maltedBarleyFlour.unitMappings.isEmpty())
        listOf("malted barley flour", "malt barley flour", "farine d'orge maltée", "farine d'orge maltee").forEach { query ->
            assertEquals(
                listOf(maltedBarleyFlour.id),
                filterByIngredientSearchQuery(references, query, searchableNames).map { it.id }
            )
        }
        assertTrue(maltedBarleyFlour.id != barleyFlour.id)
        assertEquals(listOf("jau atta"), barleyFlour.aliasesEn)
        assertTrue(barleyFlour.aliasesFr.isEmpty())
    }

    @Test
    fun roastedBarleyFlourUsesReviewedToastedAliasAndKeepsRegionalTermsSeparate() {
        val references = BundledIngredientCatalog.references
        val roastedBarleyFlour = references.single { it.id == "ingredient-ref-roasted-barley-flour" }
        val searchableNames: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("roasted barley flour", roastedBarleyFlour.nameEn)
        assertEquals("farine d'orge torréfiée", roastedBarleyFlour.nameFr)
        assertEquals(listOf("toasted barley flour"), roastedBarleyFlour.aliasesEn)
        assertTrue(roastedBarleyFlour.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, roastedBarleyFlour.category)
        assertNull(roastedBarleyFlour.defaultDensity)
        assertTrue(roastedBarleyFlour.unitMappings.isEmpty())
        listOf("roasted barley flour", "toasted barley flour", "farine d'orge torréfiée", "farine d'orge torrefiee").forEach { query ->
            assertEquals(
                listOf(roastedBarleyFlour.id),
                filterByIngredientSearchQuery(references, query, searchableNames).map { it.id }
            )
        }
        listOf("hattai-ko", "mugikogashi", "farine d'orge grillée").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, searchableNames).isEmpty())
        }
    }

    @Test
    fun maltedWheatFlourUsesBilingualNamesAndRemainsSeparateFromOtherMaltedFlours() {
        val references = BundledIngredientCatalog.references
        val maltedWheatFlour = references.single { it.id == "ingredient-ref-malted-wheat-flour" }
        val maltedBarleyFlour = references.single { it.id == "ingredient-ref-malted-barley-flour" }
        val searchableNames: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("malted wheat flour", maltedWheatFlour.nameEn)
        assertEquals("farine de blé maltée", maltedWheatFlour.nameFr)
        assertTrue(maltedWheatFlour.aliasesEn.isEmpty() && maltedWheatFlour.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, maltedWheatFlour.category)
        assertNull(maltedWheatFlour.defaultDensity)
        assertTrue(maltedWheatFlour.unitMappings.isEmpty())
        listOf("malted wheat flour", "farine de blé maltée", "farine de ble maltee").forEach { query ->
            assertEquals(
                listOf(maltedWheatFlour.id),
                filterByIngredientSearchQuery(references, query, searchableNames).map { it.id }
            )
        }
        assertTrue(maltedWheatFlour.id != maltedBarleyFlour.id)
        assertTrue(maltedWheatFlour.id != references.single { it.id == "ingredient-ref-whole-wheat-flour" }.id)
        assertTrue(maltedWheatFlour.id != references.single { it.id == "ingredient-ref-vital-wheat-gluten" }.id)
    }

    @Test
    fun roastedWheatFloursRemainSeparateAndIdentityOnly() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val roastedWheatFlour = catalog.getValue("ingredient-ref-roasted-wheat-flour")
        val roastedWheatMaltFlour = catalog.getValue("ingredient-ref-roasted-wheat-malt-flour")

        assertEquals("roasted wheat flour", roastedWheatFlour.nameEn)
        assertEquals("farine de blé torréfiée", roastedWheatFlour.nameFr)
        assertEquals("roasted wheat malt flour", roastedWheatMaltFlour.nameEn)
        assertEquals("farine de malt de blé torréfié", roastedWheatMaltFlour.nameFr)
        listOf(roastedWheatFlour, roastedWheatMaltFlour).forEach { ingredient ->
            assertEquals(IngredientCategory.FLOUR_AND_STARCH, ingredient.category)
            assertTrue(ingredient.aliasesEn.isEmpty())
            assertTrue(ingredient.aliasesFr.isEmpty())
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }

        listOf(
            "roasted wheat flour" to roastedWheatFlour.id,
            "farine de blé torréfiée" to roastedWheatFlour.id,
            "farine de ble torrefiee" to roastedWheatFlour.id,
            "roasted wheat malt flour" to roastedWheatMaltFlour.id,
            "farine de malt de blé torréfié" to roastedWheatMaltFlour.id,
            "farine de malt de ble torrefie" to roastedWheatMaltFlour.id,
        ).forEach { (query, expectedId) ->
            assertEquals(
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query) { ingredient ->
                    listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr
                }.map { it.id }
            )
        }
        listOf("toasted wheat flour", "roasted malt flour").forEach { query ->
            assertTrue(
                filterByIngredientSearchQuery(references, query) { ingredient ->
                    listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr
                }.isEmpty()
            )
        }

        assertTrue(roastedWheatFlour.id != roastedWheatMaltFlour.id)
        assertTrue(roastedWheatFlour.id != "ingredient-ref-malted-wheat-flour")
        assertTrue(roastedWheatMaltFlour.id != "ingredient-ref-malted-wheat-flour")
        assertTrue(roastedWheatMaltFlour.id != "ingredient-ref-malted-barley-flour")
    }

    @Test
    fun roastedCornFlourRemainsSeparateFromPrecookedCornFlour() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val roasted = catalog.getValue("ingredient-ref-roasted-corn-flour")
        val precooked = catalog.getValue("ingredient-ref-precooked-corn-flour")
        val searchableNames: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { ingredient ->
            listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr
        }

        assertEquals("roasted corn flour", roasted.nameEn)
        assertEquals("farine de maïs torréfiée", roasted.nameFr)
        assertTrue(roasted.aliasesEn.isEmpty())
        assertTrue(roasted.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, roasted.category)
        assertNull(roasted.defaultDensity)
        assertTrue(roasted.unitMappings.isEmpty())
        assertEquals("precooked corn flour", precooked.nameEn)
        assertEquals("farine de maïs précuite", precooked.nameFr)
        assertTrue(precooked.aliasesEn.isEmpty() && precooked.aliasesFr.isEmpty())

        listOf("roasted corn flour", "farine de maïs torréfiée", "farine de mais torrefiee").forEach { query ->
            assertEquals(
                listOf(roasted.id),
                filterByIngredientSearchQuery(references, query, searchableNames).map { it.id }
            )
        }
        listOf("precooked corn flour", "farine de maïs précuite").forEach { query ->
            assertEquals(
                listOf(precooked.id),
                filterByIngredientSearchQuery(references, query, searchableNames).map { it.id }
            )
        }
        listOf("toasted corn flour", "farine de maïs grillée").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, searchableNames).isEmpty())
        }
        assertTrue(roasted.id != precooked.id)
        assertTrue(roasted.id != catalog.getValue("ingredient-ref-whole-kernel-corn-flour").id)
        assertTrue(roasted.id != catalog.getValue("ingredient-ref-cornmeal").id)
    }

    @Test
    fun kinakoAndGenericSoyFlourRemainSeparateIdentityOnlyProducts() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val kinako = catalog.getValue("ingredient-ref-kinako")
        val soyFlour = catalog.getValue("ingredient-ref-soy-flour")
        val searchableNames: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { ingredient ->
            listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr
        }

        assertEquals("kinako", kinako.nameEn)
        assertEquals("poudre de soja Kinako", kinako.nameFr)
        assertEquals(listOf("roasted soybean flour"), kinako.aliasesEn)
        assertTrue(kinako.aliasesFr.isEmpty())
        assertEquals("soy flour", soyFlour.nameEn)
        assertEquals("farine de soya", soyFlour.nameFr)
        assertEquals(listOf("soybean flour", "soya flour"), soyFlour.aliasesEn)
        assertEquals(listOf("farine de soja"), soyFlour.aliasesFr)
        listOf(kinako, soyFlour).forEach { ingredient ->
            assertEquals(IngredientCategory.FLOUR_AND_STARCH, ingredient.category)
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }

        listOf("kinako", "roasted soybean flour", "poudre de soja Kinako").forEach { query ->
            assertEquals(
                listOf(kinako.id),
                filterByIngredientSearchQuery(references, query, searchableNames).map { it.id }
            )
        }
        listOf("soy flour", "farine de soya").forEach { query ->
            assertEquals(
                setOf(soyFlour.id, "ingredient-ref-defatted-soy-flour"),
                filterByIngredientSearchQuery(references, query, searchableNames).map { it.id }.toSet()
            )
        }
        assertEquals(listOf(soyFlour.id), filterByIngredientSearchQuery(references, "soya flour", searchableNames).map { it.id })
        assertEquals(listOf(soyFlour.id), filterByIngredientSearchQuery(references, "farine de soja", searchableNames).map { it.id })
        assertEquals(
            setOf(kinako.id, soyFlour.id),
            filterByIngredientSearchQuery(references, "soybean flour", searchableNames).map { it.id }.toSet()
        )
        assertTrue(kinako.id != soyFlour.id)
    }

    @Test
    fun chanaSattuKeepsRoastedBengalGramDistinctFromGenericChickpeaFlour() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val sattu = catalog.getValue("ingredient-ref-chana-sattu")
        val chickpeaFlour = catalog.getValue("ingredient-ref-chickpea-flour")
        val searchableNames: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { ingredient ->
            listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr
        }

        assertEquals("chana sattu", sattu.nameEn)
        assertEquals("farine de sattu", sattu.nameFr)
        assertEquals(listOf("roasted Bengal gram flour", "roasted chickpea flour"), sattu.aliasesEn)
        assertEquals(listOf("farine de pois chiches grillés"), sattu.aliasesFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, sattu.category)
        listOf(sattu, chickpeaFlour).forEach { ingredient ->
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }

        listOf(
            "chana sattu",
            "roasted Bengal gram flour",
            "roasted chickpea flour",
            "farine de sattu",
            "farine de pois chiches grillés",
        ).forEach { query ->
            assertEquals(
                listOf(sattu.id),
                filterByIngredientSearchQuery(references, query, searchableNames).map { it.id }
            )
        }
        val besanMatches = filterByIngredientSearchQuery(references, "besan", searchableNames).map { it.id }.toSet()
        assertEquals(setOf(chickpeaFlour.id, "ingredient-ref-desi-chickpea-flour"), besanMatches)
        assertFalse(sattu.id in besanMatches)
        assertEquals(
            listOf(chickpeaFlour.id),
            filterByIngredientSearchQuery(references, "farine de pois chiche", searchableNames)
                .map { it.id }
        )
        assertEquals(
            setOf(sattu.id, chickpeaFlour.id, "ingredient-ref-desi-chickpea-flour"),
            filterByIngredientSearchQuery(references, "chickpea flour", searchableNames).map { it.id }.toSet()
        )
    }

    @Test
    fun riceAndQuinoaUseBaseIdentitiesWithoutStateAliases() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val rice = byId.getValue("ingredient-ref-rice")
        val quinoa = byId.getValue("ingredient-ref-quinoa")
        val exactNamesAndAliases = references
            .flatMap { ingredient ->
                (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                    .map { alias -> normalizeIngredientSearchKey(alias) to ingredient.id }
            }
            .toMap()

        assertEquals("rice", rice.nameEn)
        assertEquals("riz", rice.nameFr)
        assertEquals(listOf("chawal", "uruchi rice", "uruchimai"), rice.aliasesEn)
        assertTrue(rice.aliasesFr.isEmpty())
        assertEquals("quinoa", quinoa.nameEn)
        assertEquals("quinoa", quinoa.nameFr)
        assertEquals(listOf("quinua"), quinoa.aliasesEn)
        assertEquals("ingredient-ref-rice", exactNamesAndAliases[normalizeIngredientSearchKey("rice")])
        assertEquals("ingredient-ref-rice", exactNamesAndAliases[normalizeIngredientSearchKey("riz")])
        assertEquals("ingredient-ref-quinoa", exactNamesAndAliases[normalizeIngredientSearchKey("quinoa")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("cooked rice")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("cooked quinoa")])
    }

    @Test
    fun quinoaFlakesSearchesByItsEnglishAndQuebecFrenchProductNames() {
        val references = BundledIngredientCatalog.references
        val flakes = references.single { it.id == "ingredient-ref-quinoa-flakes" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("quinoa flakes", flakes.nameEn)
        assertEquals("flocons de quinoa", flakes.nameFr)
        assertTrue(flakes.aliasesEn.isEmpty())
        assertTrue(flakes.aliasesFr.isEmpty())
        assertEquals(
            listOf(flakes.id),
            filterByIngredientSearchQuery(references, "quinoa flakes", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(flakes.id),
            filterByIngredientSearchQuery(references, "flocons de quinoa", searchTerms).map { it.id }
        )
        val broadQuinoaMatches = filterByIngredientSearchQuery(references, "quinoa", searchTerms).map { it.id }.toSet()
        assertTrue("ingredient-ref-quinoa" in broadQuinoaMatches)
        assertTrue(flakes.id in broadQuinoaMatches)
        assertTrue("ingredient-ref-puffed-quinoa" in broadQuinoaMatches)
    }

    @Test
    fun buckwheatFlakesSearchByTheirBilingualProductNamesWithoutMergingNeighbors() {
        val references = BundledIngredientCatalog.references
        val flakes = references.single { it.id == "ingredient-ref-buckwheat-flakes" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("buckwheat flakes", flakes.nameEn)
        assertEquals("flocons de sarrasin", flakes.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, flakes.category)
        assertTrue(flakes.aliasesEn.isEmpty())
        assertTrue(flakes.aliasesFr.isEmpty())
        assertNull(flakes.defaultDensity)
        assertTrue(flakes.unitMappings.isEmpty())
        assertEquals(
            listOf(flakes.id),
            filterByIngredientSearchQuery(references, "buckwheat flakes", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(flakes.id),
            filterByIngredientSearchQuery(references, "flocons de sarrasin", searchTerms).map { it.id }
        )
        val broadBuckwheatMatches = filterByIngredientSearchQuery(references, "buckwheat", searchTerms)
            .map { it.id }
            .toSet()
        assertTrue(flakes.id in broadBuckwheatMatches)
        assertTrue("ingredient-ref-buckwheat-flour" in broadBuckwheatMatches)
        assertTrue("ingredient-ref-roasted-buckwheat-groats-dry" in broadBuckwheatMatches)
    }

    @Test
    fun sweetPotatoFlourSearchesByQualifiedEnglishAndQuebecFrenchNames() {
        val references = BundledIngredientCatalog.references
        val flour = references.single { it.id == "ingredient-ref-sweet-potato-flour" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("sweet potato flour", flour.nameEn)
        assertEquals("farine de patate douce", flour.nameFr)
        assertEquals(listOf("sweetpotato flour"), flour.aliasesEn)
        assertTrue(flour.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, flour.category)
        assertNull(flour.defaultDensity)
        assertTrue(flour.unitMappings.isEmpty())
        assertEquals(
            listOf(flour.id),
            filterByIngredientSearchQuery(references, "sweet potato flour", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(flour.id),
            filterByIngredientSearchQuery(references, "sweetpotato flour", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(flour.id),
            filterByIngredientSearchQuery(references, "farine de patate douce", searchTerms).map { it.id }
        )
        val broadPotatoFlourMatches = filterByIngredientSearchQuery(references, "potato flour", searchTerms)
            .map { it.id }
            .toSet()
        assertTrue("ingredient-ref-potato-flour" in broadPotatoFlourMatches)
        assertTrue(flour.id in broadPotatoFlourMatches)
        assertFalse(
            filterByIngredientSearchQuery(references, "sweet potato starch", searchTerms)
                .any { it.id == flour.id }
        )
    }

    @Test
    fun puffedAmaranthSearchKeepsTheRawGrainAndOtherPuffedGrainsSeparate() {
        val references = BundledIngredientCatalog.references
        val puffed = references.single { it.id == "ingredient-ref-puffed-amaranth" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("puffed amaranth", puffed.nameEn)
        assertEquals("amarante soufflée", puffed.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, puffed.category)
        assertTrue(puffed.aliasesEn.isEmpty())
        assertTrue(puffed.aliasesFr.isEmpty())
        assertNull(puffed.defaultDensity)
        assertTrue(puffed.unitMappings.isEmpty())
        assertEquals(
            listOf(puffed.id),
            filterByIngredientSearchQuery(references, "puffed amaranth", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(puffed.id),
            filterByIngredientSearchQuery(references, "amarante soufflée", searchTerms).map { it.id }
        )
        val broadAmaranthMatches = filterByIngredientSearchQuery(references, "amaranth", searchTerms)
            .map { it.id }
            .toSet()
        assertTrue(puffed.id in broadAmaranthMatches)
        assertTrue("ingredient-ref-amaranth-grain" in broadAmaranthMatches)
        assertTrue("ingredient-ref-amaranth-flour" in broadAmaranthMatches)
    }

    @Test
    fun puffedSorghumSearchKeepsThePuffedProductSeparateFromGrainAndFlour() {
        val references = BundledIngredientCatalog.references
        val puffed = references.single { it.id == "ingredient-ref-puffed-sorghum" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("puffed sorghum", puffed.nameEn)
        assertEquals("sorgho soufflé", puffed.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, puffed.category)
        assertEquals(listOf("popped sorghum", "sorghum puffs"), puffed.aliasesEn)
        assertTrue(puffed.aliasesFr.isEmpty())
        assertNull(puffed.defaultDensity)
        assertTrue(puffed.unitMappings.isEmpty())
        assertEquals(
            listOf(puffed.id),
            filterByIngredientSearchQuery(references, "puffed sorghum", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(puffed.id),
            filterByIngredientSearchQuery(references, "popped sorghum", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(puffed.id),
            filterByIngredientSearchQuery(references, "sorghum puffs", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(puffed.id),
            filterByIngredientSearchQuery(references, "sorgho soufflé", searchTerms).map { it.id }
        )
        val broadSorghumMatches = filterByIngredientSearchQuery(references, "sorghum", searchTerms)
            .map { it.id }
            .toSet()
        assertTrue(puffed.id in broadSorghumMatches)
        assertTrue("ingredient-ref-grain-sorghum" in broadSorghumMatches)
        assertTrue("ingredient-ref-sorghum-flour" in broadSorghumMatches)
    }

    @Test
    fun pintoBeanIdentityDoesNotContainMalformedFrenchAlias() {
        val references = BundledIngredientCatalog.references
        val pintoBeans = references.single { it.id == "ingredient-ref-pinto-beans" }
        val exactNamesAndAliases = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()

        assertEquals("pinto beans", pintoBeans.nameEn)
        assertEquals("haricots pinto", pintoBeans.nameFr)
        assertEquals(listOf("haricot pinto"), pintoBeans.aliasesFr)
        assertEquals("ingredient-ref-pinto-beans", exactNamesAndAliases[normalizeIngredientSearchKey("pinto beans")])
        assertEquals("ingredient-ref-pinto-beans", exactNamesAndAliases[normalizeIngredientSearchKey("haricots pinto")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("of pinto beans")])
    }

    @Test
    fun whiteFonioHasSourceNamesAndRemainsDistinctFromFlourAndBlackFonio() {
        val references = BundledIngredientCatalog.references
        val whiteFonio = references.single { it.id == "ingredient-ref-white-fonio" }
        val exactNamesAndAliases = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()

        assertEquals("white fonio", whiteFonio.nameEn)
        assertEquals("fonio blanc", whiteFonio.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, whiteFonio.category)
        assertEquals(listOf("fonio", "acha", "fundi", "findi"), whiteFonio.aliasesFr)
        assertEquals(listOf("fonio", "acha", "hungry rice"), whiteFonio.aliasesEn)
        assertTrue(whiteFonio.aliasesEn.none { it.contains("flour") })
        assertTrue(whiteFonio.aliasesFr.none { it.contains("farine") })
        assertNull(whiteFonio.defaultDensity)
        assertTrue(whiteFonio.unitMappings.isEmpty())

        listOf("white fonio", "fonio blanc", "fonio", "acha", "fundi", "findi", "hungry rice").forEach { term ->
            assertEquals("ingredient-ref-white-fonio", exactNamesAndAliases[normalizeIngredientSearchKey(term)])
        }
        assertEquals("ingredient-ref-black-fonio", exactNamesAndAliases[normalizeIngredientSearchKey("black fonio")])
        assertEquals("ingredient-ref-black-fonio", exactNamesAndAliases[normalizeIngredientSearchKey("fonio noir")])
    }

    @Test
    fun blackFonioHasDistinctBilingualIdentityWithoutUnverifiedAliasesOrNumericData() {
        val references = BundledIngredientCatalog.references
        val blackFonio = references.single { it.id == "ingredient-ref-black-fonio" }
        val whiteFonio = references.single { it.id == "ingredient-ref-white-fonio" }
        val exactNamesAndAliases = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()

        assertEquals("black fonio", blackFonio.nameEn)
        assertEquals("fonio noir", blackFonio.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, blackFonio.category)
        assertEquals(listOf("iburu"), blackFonio.aliasesEn)
        assertTrue(blackFonio.aliasesFr.isEmpty())
        assertNull(blackFonio.defaultDensity)
        assertTrue(blackFonio.unitMappings.isEmpty())
        assertTrue(blackFonio.id != whiteFonio.id)
        assertEquals("ingredient-ref-white-fonio", exactNamesAndAliases[normalizeIngredientSearchKey("fonio")])
        assertEquals("ingredient-ref-white-fonio", exactNamesAndAliases[normalizeIngredientSearchKey("fonio blanc")])
        assertEquals("ingredient-ref-black-fonio", exactNamesAndAliases[normalizeIngredientSearchKey("black fonio")])
        assertEquals("ingredient-ref-black-fonio", exactNamesAndAliases[normalizeIngredientSearchKey("fonio noir")])
    }

    @Test
    fun arborioRiceUsesOqlfNamesAndRemainsDistinctFromGenericRice() {
        val references = BundledIngredientCatalog.references
        val arborio = references.single { it.id == "ingredient-ref-arborio-rice" }
        val rice = references.single { it.id == "ingredient-ref-rice" }
        val exactNamesAndAliases = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()

        assertEquals("arborio rice", arborio.nameEn)
        assertEquals("riz arborio", arborio.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, arborio.category)
        assertTrue(arborio.aliasesEn.isEmpty())
        assertTrue(arborio.aliasesFr.isEmpty())
        assertNull(arborio.defaultDensity)
        assertTrue(arborio.unitMappings.isEmpty())
        assertTrue(arborio.id != rice.id)
        assertEquals("ingredient-ref-arborio-rice", exactNamesAndAliases[normalizeIngredientSearchKey("arborio rice")])
        assertEquals("ingredient-ref-arborio-rice", exactNamesAndAliases[normalizeIngredientSearchKey("riz arborio")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("arborio")])
        assertEquals("ingredient-ref-rice", exactNamesAndAliases[normalizeIngredientSearchKey("rice")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("cooked rice")])
    }

    @Test
    fun carnaroliRiceUsesOqlfNamesWithoutClaimingBroadRisottoAliases() {
        val references = BundledIngredientCatalog.references
        val carnaroli = references.single { it.id == "ingredient-ref-carnaroli-rice" }
        val arborio = references.single { it.id == "ingredient-ref-arborio-rice" }
        val rice = references.single { it.id == "ingredient-ref-rice" }
        val exactNamesAndAliases = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()

        assertEquals("carnaroli rice", carnaroli.nameEn)
        assertEquals("riz carnaroli", carnaroli.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, carnaroli.category)
        assertTrue(carnaroli.aliasesEn.isEmpty())
        assertTrue(carnaroli.aliasesFr.isEmpty())
        assertNull(carnaroli.defaultDensity)
        assertTrue(carnaroli.unitMappings.isEmpty())
        assertTrue(carnaroli.id != arborio.id)
        assertTrue(carnaroli.id != rice.id)
        assertEquals("ingredient-ref-carnaroli-rice", exactNamesAndAliases[normalizeIngredientSearchKey("carnaroli rice")])
        assertEquals("ingredient-ref-carnaroli-rice", exactNamesAndAliases[normalizeIngredientSearchKey("riz carnaroli")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("carnaroli")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("risotto rice")])
    }

    @Test
    fun glutinousRiceFlourIsDistinctAndUsesOnlyDocumentedSweetRiceAliases() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val bySearchKey = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()
        val glutinousRiceFlour = byId.getValue("ingredient-ref-glutinous-rice-flour")

        assertEquals("glutinous rice flour", glutinousRiceFlour.nameEn)
        assertEquals("farine de riz gluant", glutinousRiceFlour.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, glutinousRiceFlour.category)
        assertEquals(listOf("sweet rice flour", "sweet rice powder"), glutinousRiceFlour.aliasesEn)
        assertTrue(glutinousRiceFlour.aliasesFr.isEmpty())
        assertNull(glutinousRiceFlour.defaultDensity)
        assertTrue(glutinousRiceFlour.unitMappings.isEmpty())
        assertTrue(glutinousRiceFlour.id != byId.getValue("ingredient-ref-rice-flour").id)
        assertTrue(glutinousRiceFlour.id != byId.getValue("ingredient-ref-glutinous-rice").id)

        assertEquals("ingredient-ref-glutinous-rice-flour", bySearchKey[normalizeIngredientSearchKey("glutinous rice flour")])
        assertEquals("ingredient-ref-glutinous-rice-flour", bySearchKey[normalizeIngredientSearchKey("farine de riz gluant")])
        assertEquals("ingredient-ref-glutinous-rice-flour", bySearchKey[normalizeIngredientSearchKey("sweet rice flour")])
        assertEquals("ingredient-ref-glutinous-rice-flour", bySearchKey[normalizeIngredientSearchKey("sweet rice powder")])
        assertEquals("ingredient-ref-glutinous-rice", bySearchKey[normalizeIngredientSearchKey("glutinous rice")])

        val mochiko = byId.getValue("ingredient-ref-mochiko-glutinous-rice-flour")
        assertEquals("Mochiko glutinous rice flour", mochiko.nameEn)
        assertEquals("farine de riz gluant Mochiko", mochiko.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, mochiko.category)
        assertTrue(mochiko.aliasesEn.isEmpty())
        assertTrue(mochiko.aliasesFr.isEmpty())
        assertNull(mochiko.defaultDensity)
        assertTrue(mochiko.unitMappings.isEmpty())

        val shiratamako = byId.getValue("ingredient-ref-shiratamako-glutinous-rice-flour")
        assertEquals("Shiratamako glutinous rice flour", shiratamako.nameEn)
        assertEquals("farine de riz gluant Shiratamako", shiratamako.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, shiratamako.category)
        assertTrue(shiratamako.aliasesEn.isEmpty())
        assertTrue(shiratamako.aliasesFr.isEmpty())
        assertNull(shiratamako.defaultDensity)
        assertTrue(shiratamako.unitMappings.isEmpty())

        assertEquals("ingredient-ref-mochiko-glutinous-rice-flour", bySearchKey[normalizeIngredientSearchKey(mochiko.nameEn)])
        assertEquals("ingredient-ref-shiratamako-glutinous-rice-flour", bySearchKey[normalizeIngredientSearchKey(shiratamako.nameFr)])
        val productMatches = filterByIngredientSearchQuery(references, "Mochiko") {
            listOf(it.nameEn, it.nameFr) + it.aliasesEn + it.aliasesFr
        }
        assertEquals(listOf(mochiko), productMatches)
    }

    @Test
    fun potBarleyHasDisambiguatingFrenchDisplayAndStaysSeparateFromOtherBarleyProducts() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val bySearchKey = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()
        val potBarley = byId.getValue("ingredient-ref-pot-barley")

        assertEquals("pot barley", potBarley.nameEn)
        assertEquals("orge en pot", potBarley.nameFr)
        assertEquals(listOf("Scotch barley"), potBarley.aliasesEn)
        assertTrue(potBarley.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, potBarley.category)
        assertNull(potBarley.defaultDensity)
        assertTrue(potBarley.unitMappings.isEmpty())
        assertTrue(potBarley.id != byId.getValue("ingredient-ref-hulled-barley").id)
        assertTrue(potBarley.id != byId.getValue("ingredient-ref-pearl-barley").id)
        assertEquals("ingredient-ref-pot-barley", bySearchKey[normalizeIngredientSearchKey("orge en pot")])
        assertEquals("ingredient-ref-hulled-barley", bySearchKey[normalizeIngredientSearchKey("orge mondé")])
        assertEquals("ingredient-ref-pearl-barley", bySearchKey[normalizeIngredientSearchKey("orge perlé")])
        assertNull(bySearchKey[normalizeIngredientSearchKey("orge mondée")])
    }

    @Test
    fun whiteAndBrownRiceFloursAreSeparateFromTheRiceFlourFamily() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val bySearchKey = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()
        val riceFlour = byId.getValue("ingredient-ref-rice-flour")
        val brownRiceFlour = byId.getValue("ingredient-ref-brown-rice-flour")
        val whiteRiceFlour = byId.getValue("ingredient-ref-white-rice-flour")
        val glutinousRiceFlour = byId.getValue("ingredient-ref-glutinous-rice-flour")

        assertEquals("rice flour", riceFlour.nameEn)
        assertEquals("farine de riz", riceFlour.nameFr)
        assertEquals("brown rice flour", brownRiceFlour.nameEn)
        assertEquals("farine de riz brun", brownRiceFlour.nameFr)
        assertEquals("white rice flour", whiteRiceFlour.nameEn)
        assertEquals("farine de riz blanc", whiteRiceFlour.nameFr)

        listOf(riceFlour, brownRiceFlour, whiteRiceFlour).forEach { ingredient ->
            assertEquals(IngredientCategory.FLOUR_AND_STARCH, ingredient.category)
            assertTrue(ingredient.aliasesEn.isEmpty())
            assertEquals(
                if (ingredient.id == brownRiceFlour.id) listOf("farine de riz complet", "farine de riz brun complet") else emptyList(),
                ingredient.aliasesFr,
            )
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }
        assertTrue(riceFlour.id != brownRiceFlour.id)
        assertTrue(riceFlour.id != whiteRiceFlour.id)
        assertTrue(brownRiceFlour.id != whiteRiceFlour.id)
        assertTrue(glutinousRiceFlour.id != brownRiceFlour.id)
        assertTrue(glutinousRiceFlour.id != whiteRiceFlour.id)

        assertEquals(riceFlour.id, bySearchKey[normalizeIngredientSearchKey("rice flour")])
        assertEquals(riceFlour.id, bySearchKey[normalizeIngredientSearchKey("farine de riz")])
        assertEquals(brownRiceFlour.id, bySearchKey[normalizeIngredientSearchKey("brown rice flour")])
        assertEquals(brownRiceFlour.id, bySearchKey[normalizeIngredientSearchKey("farine de riz brun")])
        assertEquals(whiteRiceFlour.id, bySearchKey[normalizeIngredientSearchKey("white rice flour")])
        assertEquals(whiteRiceFlour.id, bySearchKey[normalizeIngredientSearchKey("farine de riz blanc")])
    }

    @Test
    fun masaHarinaIsDistinctFromOtherMaizeFloursAndStarch() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val bySearchKey = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()
        val masaHarina = byId.getValue("ingredient-ref-masa-harina")

        assertEquals("masa harina", masaHarina.nameEn)
        assertEquals("farine de maïs nixtamalisée", masaHarina.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, masaHarina.category)
        assertTrue(masaHarina.aliasesEn.isEmpty())
        assertTrue(masaHarina.aliasesFr.isEmpty())
        assertNull(masaHarina.defaultDensity)
        assertTrue(masaHarina.unitMappings.isEmpty())

        listOf(
            "ingredient-ref-whole-kernel-corn-flour",
            "ingredient-ref-cornmeal",
            "ingredient-ref-cornstarch"
        ).forEach { otherId -> assertTrue(masaHarina.id != byId.getValue(otherId).id) }

        assertEquals(masaHarina.id, bySearchKey[normalizeIngredientSearchKey("masa harina")])
        assertEquals(
            masaHarina.id,
            bySearchKey[normalizeIngredientSearchKey("farine de maïs nixtamalisée")]
        )
    }

    @Test
    fun hominyCornUsesItsSupportedProductNamesAndStaysSeparateFromMaizeProducts() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val hominy = byId.getValue("ingredient-ref-hominy-corn")
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("hominy corn", hominy.nameEn)
        assertEquals("maïs lessivé", hominy.nameFr)
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, hominy.category)
        assertEquals(byId.getValue("ingredient-ref-corn-kernels").category, hominy.category)
        assertEquals(listOf("lyed corn"), hominy.aliasesEn)
        assertTrue(hominy.aliasesFr.isEmpty())
        assertNull(hominy.defaultDensity)
        assertTrue(hominy.unitMappings.isEmpty())
        assertTrue(hominy.id != byId.getValue("ingredient-ref-corn-kernels").id)
        assertTrue(hominy.id != byId.getValue("ingredient-ref-cornmeal").id)
        assertTrue(hominy.id != byId.getValue("ingredient-ref-masa-harina").id)

        listOf("hominy corn", "maïs lessivé").forEach { term ->
            val normalized = normalizeIngredientSearchKey(term)
            val matches = references.sumOf { reference ->
                (listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr)
                    .count { normalizeIngredientSearchKey(it) == normalized }
            }
            assertEquals(1, matches)
            assertEquals("ingredient-ref-hominy-corn", filterByIngredientSearchQuery(references, term, searchTerms).single().id)
        }
        assertFalse(hominy.aliasesEn.any { it in setOf("hominy", "lye hominy", "pearled hominy", "hominy grits", "pozole corn") })
    }

    @Test
    fun precookedCornFlourIsDistinctFromMasaHarinaAndOtherMaizeProducts() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val bySearchKey = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()
        val precooked = byId.getValue("ingredient-ref-precooked-corn-flour")

        assertEquals("precooked corn flour", precooked.nameEn)
        assertEquals("farine de maïs précuite", precooked.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, precooked.category)
        assertTrue(precooked.aliasesEn.isEmpty())
        assertTrue(precooked.aliasesFr.isEmpty())
        assertNull(precooked.defaultDensity)
        assertTrue(precooked.unitMappings.isEmpty())

        listOf(
            "ingredient-ref-masa-harina",
            "ingredient-ref-whole-kernel-corn-flour",
            "ingredient-ref-cornmeal",
            "ingredient-ref-cornstarch"
        ).forEach { otherId -> assertTrue(precooked.id != byId.getValue(otherId).id) }

        assertEquals(precooked.id, bySearchKey[normalizeIngredientSearchKey("precooked corn flour")])
        assertEquals(
            precooked.id,
            bySearchKey[normalizeIngredientSearchKey("farine de maïs précuite")]
        )
        assertEquals(
            byId.getValue("ingredient-ref-masa-harina").id,
            bySearchKey[normalizeIngredientSearchKey("masa harina")]
        )
        assertNull(bySearchKey[normalizeIngredientSearchKey("precooked cornmeal")])
    }

    @Test
    fun unqualifiedCornFlourDoesNotResolveAcrossRegionalMaizeProducts() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val bySearchKey = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()
        val cornstarch = byId.getValue("ingredient-ref-cornstarch")
        val wholeKernelFlour = byId.getValue("ingredient-ref-whole-kernel-corn-flour")
        val cornmeal = byId.getValue("ingredient-ref-cornmeal")

        assertEquals(listOf("corn starch"), cornstarch.aliasesEn)
        assertEquals(listOf("amidon de maïs"), cornstarch.aliasesFr)
        assertNull(bySearchKey[normalizeIngredientSearchKey("corn flour")])
        assertEquals(cornstarch.id, bySearchKey[normalizeIngredientSearchKey("cornstarch")])
        assertEquals(cornstarch.id, bySearchKey[normalizeIngredientSearchKey("corn starch")])
        assertEquals(cornstarch.id, bySearchKey[normalizeIngredientSearchKey("fécule de maïs")])
        assertEquals(cornstarch.id, bySearchKey[normalizeIngredientSearchKey("amidon de maïs")])
        assertEquals(
            wholeKernelFlour.id,
            bySearchKey[normalizeIngredientSearchKey("whole-kernel corn flour")]
        )
        assertEquals(
            wholeKernelFlour.id,
            bySearchKey[normalizeIngredientSearchKey("farine de maïs")]
        )
        assertEquals(listOf("makki atta", "makki ka atta"), wholeKernelFlour.aliasesEn)
        assertEquals(cornmeal.id, bySearchKey[normalizeIngredientSearchKey("cornmeal")])
        assertEquals(cornmeal.id, bySearchKey[normalizeIngredientSearchKey("corn meal")])
        assertEquals(listOf("corn meal"), cornmeal.aliasesEn)
        assertNull(bySearchKey[normalizeIngredientSearchKey("fine cornmeal")])
        assertNull(bySearchKey[normalizeIngredientSearchKey("coarse cornmeal")])
    }

    @Test
    fun teffFlourUsesProductSupportedNamesWithoutBareGrainAliases() {
        val references = BundledIngredientCatalog.references
        val teffFlour = references.single { it.id == "ingredient-ref-teff-flour" }
        val bySearchKey = references.flatMap { ingredient ->
            (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                .map { term -> normalizeIngredientSearchKey(term) to ingredient.id }
        }.toMap()

        assertEquals("teff flour", teffFlour.nameEn)
        assertEquals("farine de teff", teffFlour.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, teffFlour.category)
        assertTrue(teffFlour.aliasesEn.isEmpty())
        assertTrue(teffFlour.aliasesFr.isEmpty())
        assertNull(teffFlour.defaultDensity)
        assertTrue(teffFlour.unitMappings.isEmpty())
        assertEquals(
            teffFlour.id,
            bySearchKey[normalizeIngredientSearchKey("teff flour")]
        )
        assertEquals(
            teffFlour.id,
            bySearchKey[normalizeIngredientSearchKey("farine de teff")]
        )
        assertEquals(
            "ingredient-ref-teff-grain",
            bySearchKey[normalizeIngredientSearchKey("teff")]
        )
        assertEquals(
            "ingredient-ref-teff-grain",
            bySearchKey[normalizeIngredientSearchKey("teff d'Abyssinie")]
        )
        assertEquals("ingredient-ref-teff-grain", bySearchKey[normalizeIngredientSearchKey("tef")])
    }

    @Test
    fun quickOatsDoNotClaimInstantOatsAsAnAlias() {
        val quickOats = BundledIngredientCatalog.references.single { it.id == "ingredient-ref-quick-oats" }
        val aliasKeys = (quickOats.aliasesEn + quickOats.aliasesFr)
            .map { normalizeIngredientSearchKey(it) }
            .toSet()

        assertTrue(normalizeIngredientSearchKey("instant oats") !in aliasKeys)
        assertTrue(normalizeIngredientSearchKey("quick-cooking oats") in aliasKeys)
        assertEquals(
            "ingredient-ref-instant-oats",
            BundledIngredientCatalog.references.single { it.nameEn == "instant oats" }.id
        )
    }

    @Test
    fun instantOatsAndPuffedRiceHaveDistinctSourceNamedIdentities() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val instantOats = byId.getValue("ingredient-ref-instant-oats")
        val puffedRice = byId.getValue("ingredient-ref-puffed-rice")

        assertEquals("instant oats", instantOats.nameEn)
        assertEquals("flocons d'avoine à cuisson instantanée", instantOats.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, instantOats.category)
        assertTrue(instantOats.aliasesEn.isEmpty())
        assertTrue(instantOats.aliasesFr.isEmpty())
        assertNull(instantOats.defaultDensity)
        assertTrue(instantOats.unitMappings.isEmpty())

        assertEquals("puffed rice", puffedRice.nameEn)
        assertEquals("riz soufflé", puffedRice.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, puffedRice.category)
        assertEquals(listOf("muri", "murmura"), puffedRice.aliasesEn)
        assertTrue(puffedRice.aliasesFr.isEmpty())
        assertNull(puffedRice.defaultDensity)
        assertTrue(puffedRice.unitMappings.isEmpty())

        assertEquals(
            listOf("ingredient-ref-instant-oats"),
            filterByIngredientSearchQuery(references, "flocons d'avoine à cuisson instantanée") {
                listOf(it.nameEn, it.nameFr, *it.aliasesEn.toTypedArray(), *it.aliasesFr.toTypedArray())
            }.map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-puffed-rice"),
            filterByIngredientSearchQuery(references, "riz souffle") {
                listOf(it.nameEn, it.nameFr, *it.aliasesEn.toTypedArray(), *it.aliasesFr.toTypedArray())
            }.map { it.id }
        )
    }

    @Test
    fun puffedWheatKeepsItsBilingualIdentitySeparateFromPuffedRice() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val puffedWheat = byId.getValue("ingredient-ref-puffed-wheat")

        assertEquals("puffed wheat", puffedWheat.nameEn)
        assertEquals("blé soufflé", puffedWheat.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, puffedWheat.category)
        assertTrue(puffedWheat.aliasesEn.isEmpty())
        assertTrue(puffedWheat.aliasesFr.isEmpty())
        assertNull(puffedWheat.defaultDensity)
        assertTrue(puffedWheat.unitMappings.isEmpty())

        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        assertEquals(
            listOf(puffedWheat.id),
            filterByIngredientSearchQuery(references, "puffed wheat", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(puffedWheat.id),
            filterByIngredientSearchQuery(references, "ble souffle", searchTerms).map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-puffed-rice"),
            filterByIngredientSearchQuery(references, "puffed rice", searchTerms).map { it.id }
        )
    }

    @Test
    fun reviewedGrainCheeseAndDairyIdentitiesHaveSourceNamesAndNoNumericData() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }
        val accepted = mapOf(
            "ingredient-ref-basmati-rice" to ("basmati rice" to "riz basmati"),
            "ingredient-ref-jasmine-rice" to ("jasmine rice" to "riz au jasmin"),
            "ingredient-ref-wild-rice" to ("wild rice" to "riz sauvage"),
            "ingredient-ref-wild-rice-blend" to ("wild rice blend" to "mélange de riz sauvage"),
            "ingredient-ref-parboiled-rice" to ("parboiled rice" to "riz étuvé"),
            "ingredient-ref-rye-grain" to ("rye" to "seigle"),
            "ingredient-ref-steel-cut-oats" to ("steel-cut oats" to "avoine découpée"),
            "ingredient-ref-oat-groats" to ("oat groats" to "gruau d'avoine entier"),
            "ingredient-ref-wheat-berries" to ("wheat berries" to "grains de blé entiers"),
            "ingredient-ref-emmer-grain" to ("emmer wheat" to "blé amidonnier"),
            "ingredient-ref-freekeh" to ("freekeh" to "freekeh"),
            "ingredient-ref-pearl-barley" to ("pearl barley" to "orge perlé"),
            "ingredient-ref-bulgur" to ("bulgur" to "boulgour"),
            "ingredient-ref-cheese-curds" to ("cheese curds" to "fromage en grains"),
            "ingredient-ref-skim-milk" to ("skim milk" to "lait écrémé"),
            "ingredient-ref-glutinous-rice" to ("glutinous rice" to "riz gluant"),
            "ingredient-ref-hulled-barley" to ("hulled barley" to "orge mondé"),
            "ingredient-ref-pearl-millet" to ("pearl millet" to "millet perlé"),
            "ingredient-ref-grain-sorghum" to ("grain sorghum" to "sorgho à graine"),
            "ingredient-ref-corn-flakes" to ("corn flakes" to "flocons de maïs"),
            "ingredient-ref-popcorn" to ("popcorn" to "maïs soufflé"),
        )

        accepted.forEach { (id, names) ->
            val ingredient = catalog.getValue(id)
            assertEquals(names.first, ingredient.nameEn)
            assertEquals(names.second, ingredient.nameFr)
            assertEquals(
                when (id) {
                    "ingredient-ref-cheese-curds" -> IngredientCategory.CHEESE
                    "ingredient-ref-skim-milk" -> IngredientCategory.DAIRY_AND_ALTERNATIVE
                    else -> IngredientCategory.GRAIN_AND_CEREAL
                },
                ingredient.category
            )
            val expectedAliasesEn = when (id) {
                "ingredient-ref-pearl-millet" -> listOf("bajra", "bajri", "sajjalu", "kambu", "sajje")
                "ingredient-ref-pearl-barley" -> listOf("jau")
                "ingredient-ref-hulled-barley" -> listOf("barley groats", "hulless barley", "naked barley")
                "ingredient-ref-grain-sorghum" -> listOf("jowar whole", "guinea corn", "red sorghum")
                "ingredient-ref-glutinous-rice" -> listOf("sweet rice", "waxy rice", "mochigome")
                "ingredient-ref-freekeh" -> listOf("frikeh")
                "ingredient-ref-oat-groats" -> listOf("hulless oats")
                "ingredient-ref-steel-cut-oats" -> listOf("Irish oats", "pinhead oats")
                "ingredient-ref-wheat-berries" -> listOf("whole wheat kernels")
                else -> emptyList()
            }
            val expectedAliasesFr = when (id) {
                "ingredient-ref-hulled-barley" -> listOf("orge à grains nus")
                "ingredient-ref-grain-sorghum" -> listOf("sorgho en grains", "sorgho en grain")
                "ingredient-ref-popcorn" -> listOf("maïs éclaté")
                "ingredient-ref-glutinous-rice" -> listOf("riz doux", "riz glutineux")
                "ingredient-ref-freekeh" -> listOf("frikeh")
                "ingredient-ref-oat-groats" -> listOf("avoine nue")
                "ingredient-ref-steel-cut-oats" -> listOf("avoine irlandaise")
                else -> emptyList()
            }
            assertEquals(expectedAliasesEn, ingredient.aliasesEn)
            assertEquals(expectedAliasesFr, ingredient.aliasesFr)
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }

        val groundBeef = catalog.getValue("ingredient-ref-ground-beef")
        assertEquals("bœuf haché", groundBeef.nameFr)
        assertTrue(groundBeef.aliasesFr.none { it == "bœuf" })
        assertTrue(groundBeef.aliasesEn.none { it == "beef" })

        val beefSearchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        assertEquals(
            setOf("ingredient-ref-beef", "ingredient-ref-beef-bouillon-cubes", "ingredient-ref-beef-broth", "ingredient-ref-beef-stock", "ingredient-ref-beef-suet", "ingredient-ref-ground-beef"),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "beef", beefSearchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-beef", "ingredient-ref-beef-bouillon-cubes", "ingredient-ref-beef-broth", "ingredient-ref-beef-stock", "ingredient-ref-beef-suet", "ingredient-ref-ground-beef"),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "bœuf", beefSearchTerms).map { it.id }.toSet()
        )
        assertEquals(
            listOf("ingredient-ref-beef-broth"),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "beef broth", beefSearchTerms).map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-beef-stock"),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "beef stock", beefSearchTerms).map { it.id }
        )
        assertEquals(
            setOf("ingredient-ref-beef-bouillon-cubes", "ingredient-ref-beef-broth"),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "bouillon de bœuf", beefSearchTerms).map { it.id }.toSet()
        )
        assertEquals(
            listOf("ingredient-ref-beef-stock"),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "fond de bœuf", beefSearchTerms).map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-ground-beef"),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "ground beef", beefSearchTerms).map { it.id }
        )
        assertEquals(
            listOf("ingredient-ref-ground-beef"),
            filterByIngredientSearchQuery(BundledIngredientCatalog.references, "bœuf haché", beefSearchTerms).map { it.id }
        )

        val calamari = catalog.getValue("ingredient-ref-calamari")
        assertEquals("calmar", calamari.nameFr)

        val sourCream = catalog.getValue("ingredient-ref-sour-cream")
        assertEquals("crème sure", sourCream.nameFr)
        assertTrue(sourCream.aliasesFr.none { it == "crème sûre entière" })

        val milk = catalog.getValue("ingredient-ref-milk")
        assertEquals(listOf("whole milk"), milk.aliasesEn)
        assertEquals(listOf("lait entier"), milk.aliasesFr)
        assertTrue(milk.aliasesFr.none { it == "lait 2%" || it == "lait écrémé" })
    }

    @Test
    fun halfSaltedButterStaysDistinctFromSaltedButter() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val halfSalted = catalog.getValue("ingredient-ref-half-salted-butter")
        val salted = catalog.getValue("ingredient-ref-salted-butter")
        assertEquals("half-salted butter", halfSalted.nameEn)
        assertEquals("beurre demi-sel", halfSalted.nameFr)
        assertEquals(listOf("semi-salted butter"), halfSalted.aliasesEn)
        assertTrue(halfSalted.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FAT_AND_OIL, halfSalted.category)
        assertNull(halfSalted.defaultDensity)
        assertTrue(halfSalted.unitMappings.isEmpty())
        assertTrue("beurre demi-sel" !in salted.aliasesFr)

        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        assertEquals(
            listOf(halfSalted.id),
            filterByIngredientSearchQuery(references, "semi-salted butter", searchTerms).map { it.id }
        )
        assertEquals(
            listOf(halfSalted.id),
            filterByIngredientSearchQuery(references, "beurre demi-sel", searchTerms).map { it.id }
        )
    }

    @Test
    fun stemsShootsAndSproutsKeepBilingualProductBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }

        val expected = mapOf(
            "ingredient-ref-florence-fennel" to ("Florence fennel" to "fenouil de Florence"),
            "ingredient-ref-globe-artichoke" to ("globe artichoke" to "artichaut"),
            "ingredient-ref-banana-blossom" to ("banana blossom" to "fleur de bananier"),
            "ingredient-ref-squash-blossoms" to ("squash blossoms" to "fleurs de courgettes"),
            "ingredient-ref-nopal-pads" to ("nopal pads" to "feuilles de cactus nopal"),
            "ingredient-ref-fiddleheads" to ("fiddleheads" to "têtes-de-violon"),
            "ingredient-ref-pea-shoots" to ("pea shoots" to "pousses de pois"),
            "ingredient-ref-alfalfa-sprouts" to ("alfalfa sprouts" to "germes de luzerne"),
            "ingredient-ref-mung-bean-sprouts" to ("mung bean sprouts" to "germes de haricot mungo"),
            "ingredient-ref-soybean-sprouts" to ("soybean sprouts" to "germes de soya"),
        )
        expected.forEach { (id, names) ->
            val reference = catalog.getValue(id)
            assertEquals(names.first, reference.nameEn)
            assertEquals(names.second, reference.nameFr)
            assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
            assertSingle(names.first, id)
            if (id != "ingredient-ref-globe-artichoke") assertSingle(names.second, id)
        }

        val celery = catalog.getValue("ingredient-ref-celery")
        assertTrue("branch celery" in celery.aliasesEn)
        assertTrue("céleri-branche" in celery.aliasesFr)
        assertTrue("céleri à côtes" in celery.aliasesFr)
        val asparagus = catalog.getValue("ingredient-ref-asparagus")
        assertTrue("asperge" in asparagus.aliasesFr)

        assertEquals(listOf("ingredient-ref-florence-fennel"), filterByIngredientSearchQuery(references, "fennel bulb", terms).map { it.id })
        assertEquals(listOf("ingredient-ref-squash-blossoms"), filterByIngredientSearchQuery(references, "zucchini blossoms", terms).map { it.id })
        assertEquals(listOf("ingredient-ref-pea-shoots"), filterByIngredientSearchQuery(references, "pea microgreens", terms).map { it.id })
        assertTrue(catalog.getValue("ingredient-ref-mung-bean-sprouts").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-mung-bean-sprouts").aliasesFr.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-soybean-sprouts").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-soybean-sprouts").aliasesFr.isEmpty())
    }

    @Test
    fun generatedCatalogHasUniqueStableIdsAndBroadCategoryValues() {
        val references = BundledIngredientCatalog.references
        assertEquals(references.size, references.map { it.id }.toSet().size)
        assertTrue(references.all { it.id.startsWith("ingredient-ref-") })
        assertTrue(references.all { it.category in IngredientCategory.entries })
        assertTrue(references.any { it.category == IngredientCategory.OTHER })
    }

    @Test
    fun chocolateChipAliasesResolveOnlyToTheirMatchingChocolateIdentity() {
        val aliasIndex = BundledIngredientCatalog.references
            .flatMap { ingredient ->
                (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                    .map { alias -> normalizeIngredientSearchKey(alias) to ingredient.id }
            }
            .toMap()

        assertEquals(
            "ingredient-ref-semisweet-chocolate",
            aliasIndex[normalizeIngredientSearchKey("chocolate chips")]
        )
        assertEquals(
            "ingredient-ref-semisweet-chocolate",
            aliasIndex[normalizeIngredientSearchKey("semi-sweet chocolate chips")]
        )
        assertEquals(
            "ingredient-ref-white-chocolate",
            aliasIndex[normalizeIngredientSearchKey("white chocolate chips")]
        )
        assertEquals(
            "ingredient-ref-dark-chocolate",
            aliasIndex[normalizeIngredientSearchKey("dark chocolate chips")]
        )
        assertEquals(
            "ingredient-ref-bittersweet-chocolate",
            aliasIndex[normalizeIngredientSearchKey("bittersweet chocolate chips")]
        )
        assertEquals(
            "ingredient-ref-milk-chocolate",
            aliasIndex[normalizeIngredientSearchKey("milk chocolate")]
        )
        assertEquals(
            "ingredient-ref-milk-chocolate",
            aliasIndex[normalizeIngredientSearchKey("milk chocolate chips")]
        )
        assertEquals(
            "ingredient-ref-milk-chocolate",
            aliasIndex[normalizeIngredientSearchKey("chocolat au lait")]
        )
        assertEquals(
            "ingredient-ref-milk-chocolate",
            aliasIndex[normalizeIngredientSearchKey("pépites de chocolat au lait")]
        )

        // Suffix normalization is intentionally not a generic rule for baking chips.
        assertTrue(
            normalizeIngredientSearchKey("butterscotch chips") !=
                normalizeIngredientSearchKey("butterscotch")
        )
    }

    @Test
    fun reviewedPulseIdentitiesKeepDistinctBilingualNamesAndNoUnprovenAliases() {
        val references = BundledIngredientCatalog.references
        val expected = mapOf(
            "ingredient-ref-lentils" to ("lentils" to "lentilles"),
            "ingredient-ref-black-beans" to ("black beans" to "haricots noirs"),
            "ingredient-ref-black-eyed-peas" to ("black-eyed peas" to "doliques à œil noir"),
            "ingredient-ref-lima-beans" to ("lima beans" to "haricots de Lima"),
        )

        expected.forEach { (id, names) ->
            val reference = references.single { it.id == id }
            assertEquals(names.first, reference.nameEn)
            assertEquals(names.second, reference.nameFr)
            assertEquals(IngredientCategory.LEGUME_AND_PULSE, reference.category)
            assertEquals(
                if (id == "ingredient-ref-black-eyed-peas") listOf(
                    "cowpea", "cow pea", "cowpeas", "cow peas", "blackeye pea", "black-eyed bean", "blackeye bean",
                ) else emptyList(),
                reference.aliasesEn,
            )
            assertEquals(
                if (id == "ingredient-ref-black-eyed-peas") listOf("haricot à œil noir") else emptyList(),
                reference.aliasesFr,
            )
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
            listOf(reference.nameEn, reference.nameFr).forEach { query ->
                val results = filterByIngredientSearchQuery(references, query) { ingredient ->
                    listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr
                }
                assertTrue("Expected $id among results for '$query'", results.any { it.id == id })
            }
        }
    }

    @Test
    fun reviewedBakingMillingIdentitiesKeepDistinctProductsAndNoUnprovenConversions() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }
        val wholeWheat = catalog.getValue("ingredient-ref-whole-wheat-flour")
        val durumSemolina = catalog.getValue("ingredient-ref-durum-semolina")
        val cornFlour = catalog.getValue("ingredient-ref-whole-kernel-corn-flour")
        val cornmeal = catalog.getValue("ingredient-ref-cornmeal")
        val tapiocaStarch = catalog.getValue("ingredient-ref-tapioca-starch")
        val polvilhoDoce = catalog.getValue("ingredient-ref-brazil-polvilho-doce")
        val polvilhoAzedo = catalog.getValue("ingredient-ref-brazil-polvilho-azedo")
        val sorghumFlour = catalog.getValue("ingredient-ref-sorghum-flour")
        val pearlMilletFlour = catalog.getValue("ingredient-ref-pearl-millet-flour")
        val cassavaFlour = catalog.getValue("ingredient-ref-cassava-flour")
        val sagoFlour = catalog.getValue("ingredient-ref-sago-flour")
        val tapiocaPearls = catalog.getValue("ingredient-ref-tapioca-pearls")
        val potatoFlour = catalog.getValue("ingredient-ref-potato-flour")
        val potatoStarch = catalog.getValue("ingredient-ref-potato-starch")
        val gari = catalog.getValue("ingredient-ref-gari")

        assertEquals("whole-wheat flour", wholeWheat.nameEn)
        assertEquals("farine de blé entier", wholeWheat.nameFr)
        assertEquals(
            normalizeIngredientSearchKey(wholeWheat.nameEn),
            normalizeIngredientSearchKey("whole wheat flour")
        )
        assertEquals("durum semolina", durumSemolina.nameEn)
        assertTrue(durumSemolina.aliasesEn.isEmpty()) // Generic semolina remains unqualified.
        assertEquals("farine de maïs", cornFlour.nameFr)
        assertEquals(listOf("makki atta", "makki ka atta"), cornFlour.aliasesEn)
        assertEquals("semoule de maïs", cornmeal.nameFr)
        assertEquals(listOf("corn meal"), cornmeal.aliasesEn)
        assertEquals("fécule de manioc", tapiocaStarch.nameFr)
        assertEquals("sweet cassava starch (polvilho doce)", polvilhoDoce.nameEn)
        assertEquals("polvilho doce", polvilhoDoce.nameFr)
        assertEquals("sour cassava starch (polvilho azedo)", polvilhoAzedo.nameEn)
        assertEquals("polvilho azedo", polvilhoAzedo.nameFr)
        listOf(polvilhoDoce, polvilhoAzedo).forEach { polvilho ->
            assertEquals(IngredientCategory.FLOUR_AND_STARCH, polvilho.category)
            assertTrue(polvilho.aliasesEn.isEmpty())
            assertEquals(
                if (polvilho.id == polvilhoAzedo.id) listOf("farine de polvilho azedo") else emptyList(),
                polvilho.aliasesFr,
            )
            assertNull(polvilho.defaultDensity)
            assertTrue(polvilho.unitMappings.isEmpty())
            assertNotEquals(tapiocaStarch.id, polvilho.id)
        }
        assertEquals("sorghum flour", sorghumFlour.nameEn)
        assertEquals("farine de sorgho", sorghumFlour.nameFr)
        assertEquals("pearl millet flour", pearlMilletFlour.nameEn)
        assertEquals("farine de mil chandelle", pearlMilletFlour.nameFr)
        assertEquals("edible cassava flour", cassavaFlour.nameEn)
        assertEquals("farine comestible de manioc", cassavaFlour.nameFr)
        assertEquals("edible sago flour", sagoFlour.nameEn)
        assertEquals("farine de sagou comestible", sagoFlour.nameFr)
        assertEquals("potato flour", potatoFlour.nameEn)
        assertEquals("farine de pomme de terre", potatoFlour.nameFr)
        assertEquals("potato starch", potatoStarch.nameEn)
        assertEquals("fécule de pomme de terre", potatoStarch.nameFr)
        assertEquals(
            listOf("amidon de pomme de terre", "fécule de pommes de terre", "amidon de pommes de terre", "katakuriko"),
            potatoStarch.aliasesFr
        )
        assertEquals(listOf("katakuriko"), potatoStarch.aliasesEn)
        assertTrue(potatoFlour.aliasesEn.isEmpty())
        assertEquals(listOf("farine de pommes de terre"), potatoFlour.aliasesFr)
        assertEquals("gari", gari.nameEn)
        assertEquals("gari", gari.nameFr)
        assertEquals(listOf("garri"), gari.aliasesEn)
        assertTrue(gari.aliasesFr.isEmpty())
        assertEquals("tapioca pearls", tapiocaPearls.nameEn)
        assertEquals("perles de tapioca", tapiocaPearls.nameFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, tapiocaPearls.category)
        assertNull(tapiocaPearls.defaultDensity)
        assertTrue(tapiocaPearls.unitMappings.isEmpty())

        listOf(
            wholeWheat, durumSemolina, cornFlour, cornmeal, tapiocaStarch,
            sorghumFlour, pearlMilletFlour, cassavaFlour, sagoFlour, potatoFlour, potatoStarch, gari
        ).forEach { ingredient ->
            assertEquals(IngredientCategory.FLOUR_AND_STARCH, ingredient.category)
            assertEquals(null, ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }
        assertNotNull(catalog.getValue("ingredient-ref-cornstarch"))
        assertTrue(cornFlour.id != cornmeal.id)
        assertTrue(tapiocaStarch.id != tapiocaPearls.id)
        assertTrue(tapiocaStarch.id != cornFlour.id)
        assertTrue(cassavaFlour.id != tapiocaStarch.id)
        assertTrue(sagoFlour.id != tapiocaStarch.id)
        assertTrue(potatoFlour.id != potatoStarch.id)
        assertTrue(gari.id != cassavaFlour.id)
        assertTrue(gari.id != tapiocaStarch.id)
        assertEquals(
            listOf("jowar flour", "jowar atta", "guinea corn flour", "sweet white sorghum flour", "red sorghum flour"),
            sorghumFlour.aliasesEn
        )
        assertEquals(listOf("farine douce de sorgho blanc"), sorghumFlour.aliasesFr)
        assertEquals(listOf("manioc flour"), cassavaFlour.aliasesEn)
        assertEquals(listOf("farine de manioc"), cassavaFlour.aliasesFr)
        assertTrue(sagoFlour.aliasesEn.isEmpty())
        assertTrue(sagoFlour.aliasesFr.isEmpty())
        assertEquals(listOf("bajra flour", "bajri flour", "sajjalu flour", "kambu flour", "sajje hittu"), pearlMilletFlour.aliasesEn)
        assertEquals(listOf("farine de millet perlé"), pearlMilletFlour.aliasesFr)
    }
    @Test
    fun reviewedRootVegetablesKeepSpeciesAndRegionalNamesDistinct() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }
        val celery = catalog.getValue("ingredient-ref-celery")
        val celeriac = catalog.getValue("ingredient-ref-celeriac")
        val parsnip = catalog.getValue("ingredient-ref-parsnip")
        val jerusalemArtichoke = catalog.getValue("ingredient-ref-jerusalem-artichoke")
        val rutabaga = catalog.getValue("ingredient-ref-rutabaga")
        val turnip = catalog.getValue("ingredient-ref-turnip")
        val carrot = catalog.getValue("ingredient-ref-carrot")

        assertEquals("celeriac", celeriac.nameEn)
        assertEquals("céleri-rave", celeriac.nameFr)
        assertEquals(listOf("celery root", "knob celery"), celeriac.aliasesEn)
        assertEquals(listOf("céleri tubéreux", "céleri-boule"), celeriac.aliasesFr)
        assertEquals("parsnip", parsnip.nameEn)
        assertEquals("panais", parsnip.nameFr)
        assertTrue(parsnip.aliasesEn.isEmpty()) // Avoid resemblance-based carotte blanche / chervis mappings.
        assertTrue(parsnip.aliasesFr.isEmpty())
        assertEquals("Jerusalem artichoke", jerusalemArtichoke.nameEn)
        assertEquals("topinambour", jerusalemArtichoke.nameFr)
        assertEquals(listOf("sunchoke", "sunroot"), jerusalemArtichoke.aliasesEn)
        assertEquals(listOf("artichaut de Jérusalem"), jerusalemArtichoke.aliasesFr)
        assertEquals("rutabaga", rutabaga.nameEn)
        assertEquals("rutabaga", rutabaga.nameFr)
        assertEquals(listOf("swede"), rutabaga.aliasesEn)
        assertTrue(rutabaga.aliasesFr.isEmpty()) // Keep colloquial navet distinct from true turnip.
        assertEquals("turnip", turnip.nameEn)
        assertEquals("navet", turnip.nameFr)
        assertTrue(turnip.aliasesEn.isEmpty())
        assertTrue(turnip.aliasesFr.isEmpty())

        listOf(celeriac, parsnip, jerusalemArtichoke, rutabaga, turnip).forEach { ingredient ->
            assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, ingredient.category)
            assertEquals(null, ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }
        assertTrue(celeriac.id != celery.id)
        assertTrue(parsnip.id != carrot.id)
        assertTrue(rutabaga.id != turnip.id)
        assertTrue("turnip" !in rutabaga.aliasesEn)
        assertTrue("navet" !in rutabaga.aliasesFr)
        assertTrue("rutabaga" !in turnip.aliasesEn)
    }

    @Test
    fun rootVegetableFollowUpKeepsVarietiesAndRelatedFoodsDistinct() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }
        val carrot = catalog.getValue("ingredient-ref-carrot")
        val beet = catalog.getValue("ingredient-ref-beet")
        val radish = catalog.getValue("ingredient-ref-radish")
        val daikon = catalog.getValue("ingredient-ref-daikon")
        val kohlrabi = catalog.getValue("ingredient-ref-kohlrabi")
        val turnip = catalog.getValue("ingredient-ref-turnip")

        assertTrue(carrot.aliasesEn.isEmpty())
        assertTrue(carrot.aliasesFr.isEmpty()) // Keep baby/mini size or product wording explicit.
        assertEquals("beet", beet.nameEn)
        assertEquals("betterave", beet.nameFr)
        assertEquals(listOf("beetroot"), beet.aliasesEn)
        assertEquals(listOf("betterave potagère"), beet.aliasesFr)
        assertTrue("bette" !in beet.aliasesFr)
        assertEquals("radish", radish.nameEn)
        assertEquals("radis", radish.nameFr)
        assertEquals("daikon", daikon.nameEn)
        assertEquals("daïkon", daikon.nameFr)
        assertEquals(listOf("Chinese radish", "Japanese radish", "Oriental radish"), daikon.aliasesEn)
        assertEquals(
            listOf("radis daïkon", "radis oriental", "radis du Japon", "radis japonais", "radis de Satzouma", "radis blanc"),
            daikon.aliasesFr,
        )
        assertTrue("radish" !in daikon.aliasesEn)
        assertTrue("radis" !in daikon.aliasesFr)
        assertEquals("kohlrabi", kohlrabi.nameEn)
        assertEquals("chou-rave", kohlrabi.nameFr)
        assertTrue(kohlrabi.aliasesEn.isEmpty())
        assertTrue(kohlrabi.aliasesFr.isEmpty()) // Keep chou-rave distinct from turnip/chou-navet.
        assertTrue(radish.id != daikon.id)
        assertTrue(kohlrabi.id != turnip.id)

        val searchIndex = catalog.values.flatMap { ingredient ->
            listOf(ingredient.nameEn, ingredient.nameFr, *ingredient.aliasesEn.toTypedArray(), *ingredient.aliasesFr.toTypedArray())
                .map { normalizeIngredientSearchKey(it) to ingredient.id }
        }.toMap()
        assertEquals("ingredient-ref-beet", searchIndex[normalizeIngredientSearchKey("beetroot")])
        assertEquals("ingredient-ref-beet", searchIndex[normalizeIngredientSearchKey("betterave potagère")])
        assertEquals("ingredient-ref-radish", searchIndex[normalizeIngredientSearchKey("radis")])
        assertEquals("ingredient-ref-daikon", searchIndex[normalizeIngredientSearchKey("radis blanc")])
        assertEquals("ingredient-ref-kohlrabi", searchIndex[normalizeIngredientSearchKey("chou-rave")])
        assertNull(searchIndex[normalizeIngredientSearchKey("baby carrots")])
        assertNull(searchIndex[normalizeIngredientSearchKey("petites carottes")])

        listOf(beet, radish, daikon, kohlrabi).forEach { ingredient ->
            assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, ingredient.category)
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }
    }

    @Test
    fun alliumIdentityBatchKeepsQuebecAmbiguityAndChiveTypesDistinct() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }
        val shallot = catalog.getValue("ingredient-ref-shallot")
        val chives = catalog.getValue("ingredient-ref-chives")
        val chineseChives = catalog.getValue("ingredient-ref-chinese-chives")
        val greenOnions = catalog.getValue("ingredient-ref-green-onions")

        assertEquals("shallot", shallot.nameEn)
        assertEquals("échalote française", shallot.nameFr)
        assertEquals(listOf("eschalot", "shallots"), shallot.aliasesEn)
        assertEquals(listOf("échalote sèche"), shallot.aliasesFr)
        assertTrue("échalote" !in shallot.aliasesFr)
        assertEquals("chives", chives.nameEn)
        assertEquals("ciboulette", chives.nameFr)
        assertEquals(listOf("chive"), chives.aliasesEn)
        assertEquals(listOf("civette"), chives.aliasesFr)
        assertEquals("Chinese chives", chineseChives.nameEn)
        assertEquals("ciboulette chinoise", chineseChives.nameFr)
        assertEquals(listOf("garlic chives"), chineseChives.aliasesEn)
        assertTrue(chineseChives.id != chives.id)
        assertEquals(listOf("scallions", "green onion", "scallion"), greenOnions.aliasesEn)

        val exactNamesAndAliases = BundledIngredientCatalog.references
            .flatMap { ingredient ->
                (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                    .map { normalizeIngredientSearchKey(it) to ingredient.id }
            }
            .toMap()
        assertEquals("ingredient-ref-shallot", exactNamesAndAliases[normalizeIngredientSearchKey("échalote française")])
        assertEquals("ingredient-ref-chives", exactNamesAndAliases[normalizeIngredientSearchKey("civette")])
        assertEquals("ingredient-ref-chinese-chives", exactNamesAndAliases[normalizeIngredientSearchKey("garlic chives")])
        assertEquals("ingredient-ref-green-onions", exactNamesAndAliases[normalizeIngredientSearchKey("scallions")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("échalote")])

        listOf(shallot, chives, chineseChives).forEach { ingredient ->
            assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, ingredient.category)
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }
    }

    @Test
    fun regionalRootsAndShootsKeepAmbiguousNamesOutOfAliases() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }
        val jicama = catalog.getValue("ingredient-ref-jicama")
        val lotusRoot = catalog.getValue("ingredient-ref-lotus-root")
        val burdock = catalog.getValue("ingredient-ref-burdock")
        val waterChestnut = catalog.getValue("ingredient-ref-water-chestnut")
        val bambooShoots = catalog.getValue("ingredient-ref-bamboo-shoots")
        val heartsOfPalm = catalog.getValue("ingredient-ref-hearts-of-palm")

        assertEquals("jicama", jicama.nameEn)
        assertEquals("dolique bulbeux", jicama.nameFr)
        assertEquals(listOf("dolique tubéreux"), jicama.aliasesFr)
        assertTrue(jicama.aliasesEn.none { it == "yam bean" || it == "yam-bean" })
        assertEquals("lotus root", lotusRoot.nameEn)
        assertEquals("racine de lotus", lotusRoot.nameFr)
        assertEquals("burdock", burdock.nameEn)
        assertEquals("bardane", burdock.nameFr)
        assertEquals(listOf("burdock root", "gobo"), burdock.aliasesEn)
        assertEquals("water chestnut", waterChestnut.nameEn)
        assertEquals("châtaigne d'eau", waterChestnut.nameFr)
        assertTrue(waterChestnut.aliasesEn.isEmpty())
        assertEquals("bamboo shoots", bambooShoots.nameEn)
        assertEquals("pousses de bambou", bambooShoots.nameFr)
        assertEquals(listOf("bamboo shoot"), bambooShoots.aliasesEn)
        assertEquals(listOf("pousse de bambou"), bambooShoots.aliasesFr)
        assertEquals("hearts of palm", heartsOfPalm.nameEn)
        assertEquals("cœurs de palmier", heartsOfPalm.nameFr)
        assertEquals(listOf("heart of palm"), heartsOfPalm.aliasesEn)
        assertEquals(listOf("cœur de palmier", "chou palmiste"), heartsOfPalm.aliasesFr)

        val exactNamesAndAliases = BundledIngredientCatalog.references
            .flatMap { ingredient ->
                (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                    .map { normalizeIngredientSearchKey(it) to ingredient.id }
            }
            .toMap()
        assertEquals("ingredient-ref-jicama", exactNamesAndAliases[normalizeIngredientSearchKey("jicama")])
        assertEquals("ingredient-ref-jicama", exactNamesAndAliases[normalizeIngredientSearchKey("dolique tubéreux")])
        assertEquals("ingredient-ref-lotus-root", exactNamesAndAliases[normalizeIngredientSearchKey("racine de lotus")])
        assertEquals("ingredient-ref-burdock", exactNamesAndAliases[normalizeIngredientSearchKey("gobo")])
        assertEquals("ingredient-ref-water-chestnut", exactNamesAndAliases[normalizeIngredientSearchKey("châtaigne d'eau")])
        assertEquals("ingredient-ref-bamboo-shoots", exactNamesAndAliases[normalizeIngredientSearchKey("pousse de bambou")])
        assertEquals("ingredient-ref-hearts-of-palm", exactNamesAndAliases[normalizeIngredientSearchKey("chou palmiste")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("yam bean")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("water nut")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("water caltrop")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("palm cabbage")])

        listOf(jicama, lotusRoot, burdock, waterChestnut, bambooShoots, heartsOfPalm).forEach { ingredient ->
            assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, ingredient.category)
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }
    }

    @Test
    fun leafyGreensAndBrassicasKeepNamedTypesDistinctAndMeasurementsEmpty() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }
        val expected = mapOf(
            "ingredient-ref-lettuce" to ("lettuce" to "laitue"),
            "ingredient-ref-leaf-lettuce" to ("leaf lettuce" to "laitue frisée"),
            "ingredient-ref-romaine-lettuce" to ("romaine lettuce" to "laitue romaine"),
            "ingredient-ref-green-cabbage" to ("green cabbage" to "chou pommé vert"),
            "ingredient-ref-red-cabbage" to ("red cabbage" to "chou pommé rouge"),
            "ingredient-ref-savoy-cabbage" to ("Savoy cabbage" to "chou de Savoie"),
            "ingredient-ref-napa-cabbage" to ("Napa cabbage" to "chou nappa"),
            "ingredient-ref-bok-choy" to ("bok choy" to "pak-choï"),
            "ingredient-ref-choy-sum" to ("choy sum" to "choy sum"),
            "ingredient-ref-chinese-broccoli" to ("Chinese broccoli" to "brocoli chinois"),
            "ingredient-ref-minibroccoli" to ("baby broccoli" to "minibrocoli"),
            "ingredient-ref-cauliflower" to ("cauliflower" to "chou-fleur"),
            "ingredient-ref-brussels-sprouts" to ("Brussels sprouts" to "choux de Bruxelles"),
            "ingredient-ref-collard-greens" to ("collard greens" to "chou cavalier"),
            "ingredient-ref-swiss-chard" to ("Swiss chard" to "bette à carde"),
        )

        expected.forEach { (id, names) ->
            val ingredient = catalog.getValue(id)
            assertEquals(names.first, ingredient.nameEn)
            assertEquals(names.second, ingredient.nameFr)
            assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, ingredient.category)
            assertNull(ingredient.defaultDensity)
            assertTrue(ingredient.unitMappings.isEmpty())
        }

        val spinach = catalog.getValue("ingredient-ref-baby-spinach")
        assertEquals("spinach", spinach.nameEn)
        assertEquals("épinard", spinach.nameFr)
        assertTrue("baby spinach" in spinach.aliasesEn)
        assertTrue("jeunes épinards" in spinach.aliasesFr)
        assertEquals(listOf("sprouting broccoli"), catalog.getValue("ingredient-ref-broccoli").aliasesEn)
        assertTrue("kale" !in catalog.getValue("ingredient-ref-kale").aliasesFr)
        assertTrue("chou vert" !in catalog.getValue("ingredient-ref-kale").aliasesFr)

        val exactNamesAndAliases = BundledIngredientCatalog.references
            .flatMap { ingredient ->
                (listOf(ingredient.nameEn, ingredient.nameFr) + ingredient.aliasesEn + ingredient.aliasesFr)
                    .map { normalizeIngredientSearchKey(it) to ingredient.id }
            }
            .toMap()
        assertEquals("ingredient-ref-romaine-lettuce", exactNamesAndAliases[normalizeIngredientSearchKey("cos")])
        assertEquals("ingredient-ref-savoy-cabbage", exactNamesAndAliases[normalizeIngredientSearchKey("chou de Milan")])
        assertEquals("ingredient-ref-napa-cabbage", exactNamesAndAliases[normalizeIngredientSearchKey("napa")])
        assertEquals("ingredient-ref-bok-choy", exactNamesAndAliases[normalizeIngredientSearchKey("pak choi")])
        assertEquals("ingredient-ref-choy-sum", exactNamesAndAliases[normalizeIngredientSearchKey("Chinese flowering cabbage")])
        assertEquals("ingredient-ref-chinese-broccoli", exactNamesAndAliases[normalizeIngredientSearchKey("gai lan")])
        assertEquals("ingredient-ref-swiss-chard", exactNamesAndAliases[normalizeIngredientSearchKey("bette")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("cabbage")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("Chinese cabbage")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("chou chinois")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("bok choy sum")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("Broccolini")])
        assertNull(exactNamesAndAliases[normalizeIngredientSearchKey("savoy")])
    }


    @Test
    fun longGrainRiceIsAnIdentityClassWithoutCopiedPreparationForms() {
        val references = BundledIngredientCatalog.references
        val longGrainRice = references.single { it.id == "ingredient-ref-long-grain-rice" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("long-grain rice", longGrainRice.nameEn)
        assertEquals("riz à grain long", longGrainRice.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, longGrainRice.category)
        assertTrue(longGrainRice.aliasesEn.isEmpty())
        assertEquals(listOf("riz à grains longs"), longGrainRice.aliasesFr)
        assertNull(longGrainRice.defaultDensity)
        assertTrue(longGrainRice.unitMappings.isEmpty())
        assertEquals(
            longGrainRice.id,
            filterByIngredientSearchQuery(references, "long-grain rice", searchTerms).single().id
        )
        assertEquals(
            longGrainRice.id,
            filterByIngredientSearchQuery(references, "long grain rice", searchTerms).single().id
        )
        assertEquals(
            longGrainRice.id,
            filterByIngredientSearchQuery(references, "riz à grains longs", searchTerms).single().id
        )
    }

    @Test
    fun mediumGrainRiceIsAnIdentityClassWithOnlyItsFrenchVariantAlias() {
        val references = BundledIngredientCatalog.references
        val mediumGrainRice = references.single { it.id == "ingredient-ref-medium-grain-rice" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("medium-grain rice", mediumGrainRice.nameEn)
        assertEquals("riz à grain moyen", mediumGrainRice.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, mediumGrainRice.category)
        assertTrue(mediumGrainRice.aliasesEn.isEmpty())
        assertEquals(listOf("riz à grains moyens"), mediumGrainRice.aliasesFr)
        assertNull(mediumGrainRice.defaultDensity)
        assertTrue(mediumGrainRice.unitMappings.isEmpty())
        assertEquals(
            mediumGrainRice.id,
            filterByIngredientSearchQuery(references, "medium-grain rice", searchTerms).single().id
        )
        assertEquals(
            mediumGrainRice.id,
            filterByIngredientSearchQuery(references, "medium grain rice", searchTerms).single().id
        )
        assertEquals(
            mediumGrainRice.id,
            filterByIngredientSearchQuery(references, "riz à grains moyens", searchTerms).single().id
        )
    }

    @Test
    fun brownRiceKeepsItsSupportedAliasesAndBrownRiceFlourDistinct() {
        val references = BundledIngredientCatalog.references
        val brownRice = references.single { it.id == "ingredient-ref-brown-rice" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("brown rice", brownRice.nameEn)
        assertEquals("riz brun", brownRice.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, brownRice.category)
        assertEquals(listOf("hulled rice"), brownRice.aliasesEn)
        assertEquals(listOf("riz cargo", "riz complet"), brownRice.aliasesFr)
        assertNull(brownRice.defaultDensity)
        assertTrue(brownRice.unitMappings.isEmpty())
        val brownRiceFlour = references.single { it.id == "ingredient-ref-brown-rice-flour" }
        assertEquals("brown rice flour", brownRiceFlour.nameEn)
        assertTrue(brownRiceFlour.id != brownRice.id)
        assertTrue(
            filterByIngredientSearchQuery(references, "brown rice", searchTerms)
                .any { it.id == brownRice.id }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "riz brun", searchTerms)
                .any { it.id == brownRice.id }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "hulled rice", searchTerms)
                .any { it.id == brownRice.id }
        )
        assertTrue(
            filterByIngredientSearchQuery(references, "riz cargo", searchTerms)
                .any { it.id == brownRice.id }
        )
        assertEquals(
            setOf(brownRice.id, brownRiceFlour.id),
            filterByIngredientSearchQuery(references, "riz complet", searchTerms).map { it.id }.toSet(),
        )
    }

    @Test
    fun shortGrainRiceIsAnIdentityClassWithOnlyItsFrenchVariantAlias() {
        val references = BundledIngredientCatalog.references
        val shortGrainRice = references.single { it.id == "ingredient-ref-short-grain-rice" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("short-grain rice", shortGrainRice.nameEn)
        assertEquals("riz à grain court", shortGrainRice.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, shortGrainRice.category)
        assertTrue(shortGrainRice.aliasesEn.isEmpty())
        assertEquals(listOf("riz à grains courts"), shortGrainRice.aliasesFr)
        assertNull(shortGrainRice.defaultDensity)
        assertTrue(shortGrainRice.unitMappings.isEmpty())
        assertEquals(
            shortGrainRice.id,
            filterByIngredientSearchQuery(references, "short-grain rice", searchTerms).single().id
        )
        assertEquals(
            shortGrainRice.id,
            filterByIngredientSearchQuery(references, "short grain rice", searchTerms).single().id
        )
        assertEquals(
            shortGrainRice.id,
            filterByIngredientSearchQuery(references, "riz à grains courts", searchTerms).single().id
        )
    }

    @Test
    fun roastedBuckwheatGroatsUseTheExactBilingualProductNameWithoutAliasesOrNumericData() {
        val references = BundledIngredientCatalog.references
        val groats = references.single { it.id == "ingredient-ref-roasted-buckwheat-groats-dry" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("buckwheat groats, roasted, dry", groats.nameEn)
        assertEquals("grains de sarrasin rôtis et secs", groats.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, groats.category)
        assertTrue(groats.aliasesEn.isEmpty())
        assertTrue(groats.aliasesFr.isEmpty())
        assertNull(groats.defaultDensity)
        assertTrue(groats.unitMappings.isEmpty())
        assertEquals(
            groats.id,
            filterByIngredientSearchQuery(references, "buckwheat groats, roasted, dry", searchTerms).single().id
        )
        assertEquals(
            groats.id,
            filterByIngredientSearchQuery(references, "grains de sarrasin rôtis et secs", searchTerms).single().id
        )
        assertTrue(filterByIngredientSearchQuery(references, "kasha", searchTerms).isEmpty())
    }

    @Test
    fun brokenRiceUsesTheBilingualMillingGradeNameWithoutUnsafeAliasesOrNumericData() {
        val references = BundledIngredientCatalog.references
        val brokenRice = references.single { it.id == "ingredient-ref-broken-rice" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }

        assertEquals("broken rice", brokenRice.nameEn)
        assertEquals("riz en brisures", brokenRice.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, brokenRice.category)
        assertEquals(listOf("tukda chawal"), brokenRice.aliasesEn)
        assertTrue(brokenRice.aliasesFr.isEmpty())
        assertNull(brokenRice.defaultDensity)
        assertTrue(brokenRice.unitMappings.isEmpty())
        assertEquals(
            brokenRice.id,
            filterByIngredientSearchQuery(references, "broken rice", searchTerms).single().id
        )
        assertEquals(
            brokenRice.id,
            filterByIngredientSearchQuery(references, "riz en brisures", searchTerms).single().id
        )
        listOf("brewer's rice", "rice grits", "rice screenings", "cracked rice", "brisures de riz", "riz cassé", "riz brisé")
            .forEach { unverifiedTerm ->
                assertTrue(
                    "$unverifiedTerm must not be an active broken-rice alias",
                    filterByIngredientSearchQuery(references, unverifiedTerm, searchTerms).none { it.id == brokenRice.id }
                )
            }
    }

    @Test
    fun wp05PantryCondimentsKeepRegionalProductsSeparateAndMeasurementsUnavailable() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        fun assertIds(query: String, expectedIds: List<String>) {
            assertEquals(
                "query: $query",
                expectedIds,
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }
        val integratedIds = listOf(
            "ingredient-ref-black-bean-sauce", "ingredient-ref-hoisin-sauce", "ingredient-ref-oyster-sauce",
            "ingredient-ref-dark-soy-sauce", "ingredient-ref-kapi-shrimp-paste", "ingredient-ref-kimchi", "ingredient-ref-light-soy-sauce", "ingredient-ref-lime-pickle", "ingredient-ref-mango-pickle", "ingredient-ref-plum-sauce", "ingredient-ref-sweet-mango-chutney", "ingredient-ref-tahini"
        )
        integratedIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }
        assertEquals("sauce de soja noir", catalog.getValue("ingredient-ref-black-bean-sauce").nameFr)
        assertEquals("sauce d'hu\u00eetre", catalog.getValue("ingredient-ref-oyster-sauce").nameFr)
        assertEquals("beurre de s\u00e9same", catalog.getValue("ingredient-ref-tahini").nameFr)
        assertEquals(listOf("nuoc-m\u00e2m","nuocmam","nuoc nam","sauce au poisson","nam pla","patis"),
            catalog.getValue("ingredient-ref-fish-sauce").aliasesFr)
        assertEquals(listOf("sriracha","sriacha","sriacha sauce"), catalog.getValue("ingredient-ref-sriracha-sauce").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-kapi-shrimp-paste").aliasesEn.isEmpty())
        assertTrue(catalog.getValue("ingredient-ref-kapi-shrimp-paste").aliasesFr.isEmpty())
        assertEquals(listOf("kim chi"), catalog.getValue("ingredient-ref-kimchi").aliasesFr)
        assertEquals(listOf("lebneh"), catalog.getValue("ingredient-ref-labneh").aliasesFr)
        assertEquals(listOf("lebneh"), catalog.getValue("ingredient-ref-labneh").aliasesEn)
        assertEquals(listOf("zahtar"), catalog.getValue("ingredient-ref-zaatar").aliasesFr)
        assertEquals(listOf("zahtar"), catalog.getValue("ingredient-ref-zaatar").aliasesEn)
        assertEquals(listOf("amchoor"), catalog.getValue("ingredient-ref-amchur").aliasesFr)
        assertEquals(listOf("aamchur", "amchoor"), catalog.getValue("ingredient-ref-amchur").aliasesEn)
        assertEquals(listOf("kim chi", "kim chee", "kimchee"), catalog.getValue("ingredient-ref-kimchi").aliasesEn)
        val regionalIdentityIds = listOf(
            "ingredient-ref-amchur", "ingredient-ref-labneh", "ingredient-ref-sumac", "ingredient-ref-zaatar"
        )
        regionalIdentityIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }
        assertEquals(IngredientCategory.DAIRY_AND_ALTERNATIVE, catalog.getValue("ingredient-ref-labneh").category)
        assertEquals(IngredientCategory.BAKING_AND_SPICE, catalog.getValue("ingredient-ref-amchur").category)
        assertEquals(IngredientCategory.BAKING_AND_SPICE, catalog.getValue("ingredient-ref-sumac").category)
        assertEquals(IngredientCategory.BAKING_AND_SPICE, catalog.getValue("ingredient-ref-zaatar").category)
        listOf(
            "sauce de soja noir" to "ingredient-ref-black-bean-sauce",
            "sauce de soya noir" to "ingredient-ref-black-bean-sauce",
            "hoi sin sauce" to "ingredient-ref-hoisin-sauce",
            "sauce d'hu\u00eetres" to "ingredient-ref-oyster-sauce",
            "sauce aux prunes" to "ingredient-ref-plum-sauce",
            "chutney de mangue doux" to "ingredient-ref-sweet-mango-chutney",
            "tahin" to "ingredient-ref-tahini",
            "nuoc-m\u00e2m" to "ingredient-ref-fish-sauce",
            "nuoc-mam" to "ingredient-ref-fish-sauce",
            "nam pla" to "ingredient-ref-fish-sauce",
            "sriacha sauce" to "ingredient-ref-sriracha-sauce"
        ).forEach { (query, expectedId) -> assertSingle(query, expectedId) }
        assertIds("beurre de sesame", listOf("ingredient-ref-black-sesame-paste", "ingredient-ref-tahini"))
        assertSingle("black bean sauce", "ingredient-ref-black-bean-sauce")
        assertSingle("black beans", "ingredient-ref-black-beans")
        assertIds("oyster sauce", listOf("ingredient-ref-oyster-sauce", "ingredient-ref-vegan-oyster-sauce"))
        assertSingle("sweet mango chutney", "ingredient-ref-sweet-mango-chutney")
        assertSingle("mango pickle", "ingredient-ref-mango-pickle")
        assertSingle("marinade de mangue", "ingredient-ref-mango-pickle")
        assertSingle("lime pickle", "ingredient-ref-lime-pickle")
        assertSingle("marinade de lime", "ingredient-ref-lime-pickle")
        assertIds("kimchi", listOf("ingredient-ref-kimchi", "ingredient-ref-kkakdugi"))
        assertSingle("kim chi", "ingredient-ref-kimchi")
        assertSingle("kim chee", "ingredient-ref-kimchi")
        assertSingle("kimchee", "ingredient-ref-kimchi")
        assertSingle("light soy sauce", "ingredient-ref-light-soy-sauce")
        assertSingle("sauce soya claire", "ingredient-ref-light-soy-sauce")
        assertSingle("dark soy sauce", "ingredient-ref-dark-soy-sauce")
        assertSingle("sauce soya foncée", "ingredient-ref-dark-soy-sauce")
        assertSingle("kapi", "ingredient-ref-kapi-shrimp-paste")
        assertSingle("pâte de crevettes Kapi", "ingredient-ref-kapi-shrimp-paste")
        assertTrue(filterByIngredientSearchQuery(references, "shrimp paste", searchTerms)
            .none { it.id == "ingredient-ref-kapi-shrimp-paste" })
        assertSingle("labneh", "ingredient-ref-labneh")
        assertSingle("lebneh", "ingredient-ref-labneh")
        assertSingle("za'atar", "ingredient-ref-zaatar")
        assertSingle("zaatar", "ingredient-ref-zaatar")
        assertSingle("zahtar", "ingredient-ref-zaatar")
        assertSingle("sumac", "ingredient-ref-sumac")
        assertSingle("amchur powder", "ingredient-ref-amchur")
        assertSingle("amchur (mangue) en poudre", "ingredient-ref-amchur")
        assertSingle("amchoor", "ingredient-ref-amchur")
        assertSingle("aamchur", "ingredient-ref-amchur")
        assertTrue(filterByIngredientSearchQuery(references, "sauce aux hu\u00eetres", searchTerms)
            .none { it.id == "ingredient-ref-oyster-sauce" })
        assertTrue(filterByIngredientSearchQuery(references, "mango pickle", searchTerms)
            .none { it.id == "ingredient-ref-sweet-mango-chutney" })
    }

    @Test
    fun regionalPantryAndSobaIdentitiesKeepAliasesBoundariesAndUnknownConversions() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val sauceIds = listOf(
            "ingredient-ref-harissa", "ingredient-ref-chermoula", "ingredient-ref-amba",
            "ingredient-ref-zhug", "ingredient-ref-shatta", "ingredient-ref-biber-salcasi",
            "ingredient-ref-muhammara", "ingredient-ref-pomegranate-molasses",
            "ingredient-ref-tkemali", "ingredient-ref-ajika", "ingredient-ref-padaek"
        )
        sauceIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }
        listOf("ingredient-ref-rose-syrup", "ingredient-ref-date-syrup").forEach { id ->
            val reference = catalog.getValue(id)
            assertEquals(IngredientCategory.SUGAR_AND_SWEETENER, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }

        assertEquals(
            listOf("zhoug", "zhough", "schug", "schugg", "skhug", "zhugg"),
            catalog.getValue("ingredient-ref-zhug").aliasesEn
        )
        assertEquals(listOf("mouhamara"), catalog.getValue("ingredient-ref-muhammara").aliasesFr)
        assertEquals(listOf("date honey"), catalog.getValue("ingredient-ref-date-syrup").aliasesEn)
        assertEquals(listOf("adjika"), catalog.getValue("ingredient-ref-ajika").aliasesEn)
        assertEquals(listOf("pa daek"), catalog.getValue("ingredient-ref-padaek").aliasesEn)
        assertEquals(listOf("padek"), catalog.getValue("ingredient-ref-padaek").aliasesFr)
        assertEquals(listOf("soba"), catalog.getValue("ingredient-ref-soba-noodles").aliasesEn)
        assertEquals(listOf("soba"), catalog.getValue("ingredient-ref-soba-noodles").aliasesFr)

        listOf(
            "harissa" to "ingredient-ref-harissa",
            "chermoula" to "ingredient-ref-chermoula",
            "amba" to "ingredient-ref-amba",
            "zhug" to "ingredient-ref-zhug",
            "schug" to "ingredient-ref-zhug",
            "shatta" to "ingredient-ref-shatta",
            "biber salçası" to "ingredient-ref-biber-salcasi",
            "mouhamara" to "ingredient-ref-muhammara",
            "sirop de rose" to "ingredient-ref-rose-syrup",
            "mélasse de grenade" to "ingredient-ref-pomegranate-molasses",
            "date honey" to "ingredient-ref-date-syrup",
            "sauce tkemali" to "ingredient-ref-tkemali",
            "adjika" to "ingredient-ref-ajika",
            "sauce padaek" to "ingredient-ref-padaek",
            "padek" to "ingredient-ref-padaek",
            "nouilles de sarrasin" to "ingredient-ref-soba-noodles"
        ).forEach { (query, expectedId) -> assertSingle(query, expectedId) }

        assertEquals(
            setOf("ingredient-ref-buckwheat-flour", "ingredient-ref-soba-noodles"),
            filterByIngredientSearchQuery(references, "soba", searchTerms).map { it.id }.toSet(),
        )

        assertTrue(filterByIngredientSearchQuery(references, "mango pickle", searchTerms)
            .none { it.id == "ingredient-ref-amba" })
        assertTrue(filterByIngredientSearchQuery(references, "sweet mango chutney", searchTerms)
            .none { it.id == "ingredient-ref-amba" })
        assertTrue(filterByIngredientSearchQuery(references, "plum sauce", searchTerms)
            .none { it.id == "ingredient-ref-tkemali" })
        assertTrue(filterByIngredientSearchQuery(references, "fish sauce", searchTerms)
            .none { it.id == "ingredient-ref-padaek" })
        assertTrue(filterByIngredientSearchQuery(references, "shrimp paste", searchTerms)
            .none { it.id == "ingredient-ref-padaek" })
        assertTrue(filterByIngredientSearchQuery(references, "buckwheat", searchTerms)
            .none { it.id == "ingredient-ref-soba-noodles" })

        val soba = catalog.getValue("ingredient-ref-soba-noodles")
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, soba.category)
        assertNull(soba.defaultDensity)
        assertTrue(soba.unitMappings.isEmpty())
    }

    @Test
    fun reviewedCatalogBatchKeepsNewIdentitiesBilingualAndConversionsUnknown() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        val newIds = listOf(
            "ingredient-ref-cane-jaggery", "ingredient-ref-panela", "ingredient-ref-piloncillo",
            "ingredient-ref-muscovado-sugar", "ingredient-ref-demerara-sugar",
            "ingredient-ref-turbinado-sugar", "ingredient-ref-rapadura", "ingredient-ref-okinawa-kokuto",
            "ingredient-ref-cocoa-butter", "ingredient-ref-couverture-chocolate",
            "ingredient-ref-compound-coating", "ingredient-ref-glucose-syrup",
            "ingredient-ref-dark-corn-syrup", "ingredient-ref-egusi-seeds",
            "ingredient-ref-watermelon-seed-kernels-dried", "ingredient-ref-hiyamugi-noodles",
            "ingredient-ref-duck-egg", "ingredient-ref-quail-egg", "ingredient-ref-salt-cod",
            "ingredient-ref-stockfish", "ingredient-ref-dried-bonito", "ingredient-ref-vegan-oyster-sauce",
            "ingredient-ref-doubanjiang", "ingredient-ref-ginger-garlic-paste", "ingredient-ref-kaya",
            "ingredient-ref-jamaican-jerk-paste", "ingredient-ref-haitian-epis",
            "ingredient-ref-haitian-pikliz", "ingredient-ref-trinidadian-green-seasoning",
            "ingredient-ref-gianduja-nut-chocolate", "ingredient-ref-praline-paste",
            "ingredient-ref-hazelnut-spread-with-cocoa"
        )
        assertEquals(32, newIds.size)
        newIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertTrue("$id should have an English display", reference.nameEn.isNotBlank())
            assertTrue("$id should have a French display", reference.nameFr.isNotBlank())
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
            if (id == "ingredient-ref-glucose-syrup" || id == "ingredient-ref-panela") {
                val overlappingProducts = if (id == "ingredient-ref-glucose-syrup") {
                    setOf("ingredient-ref-glucose-solids", id)
                } else {
                    setOf("ingredient-ref-panela", "ingredient-ref-queso-panela")
                }
                assertEquals(
                    overlappingProducts,
                    filterByIngredientSearchQuery(references, reference.nameEn, searchTerms).map { it.id }.toSet()
                )
                assertEquals(
                    overlappingProducts,
                    filterByIngredientSearchQuery(references, reference.nameFr, searchTerms).map { it.id }.toSet()
                )
            } else if (id == "ingredient-ref-duck-egg") {
                assertEquals(
                    setOf(id, "ingredient-ref-century-egg"),
                    filterByIngredientSearchQuery(references, reference.nameEn, searchTerms).map { it.id }.toSet(),
                )
                assertSingle(reference.nameFr, id)
            } else {
                assertSingle(reference.nameEn, id)
                assertSingle(reference.nameFr, id)
            }
        }

        assertEquals(IngredientCategory.EGG, catalog.getValue("ingredient-ref-duck-egg").category)
        assertEquals(IngredientCategory.EGG, catalog.getValue("ingredient-ref-quail-egg").category)
        assertEquals(listOf("duck eggs"), catalog.getValue("ingredient-ref-duck-egg").aliasesEn)
        assertEquals(
            listOf("œufs de canard", "œufs de cane"),
            catalog.getValue("ingredient-ref-duck-egg").aliasesFr
        )
        assertEquals(listOf("quail eggs"), catalog.getValue("ingredient-ref-quail-egg").aliasesEn)
        assertTrue(catalog.getValue("ingredient-ref-quail-egg").aliasesFr.none { it in setOf("œuf", "œufs") })
        assertEquals(listOf("egusi"), catalog.getValue("ingredient-ref-egusi-seeds").aliasesEn)
        assertEquals(listOf("egusi"), catalog.getValue("ingredient-ref-egusi-seeds").aliasesFr)
        assertTrue(catalog.getValue("ingredient-ref-corn-syrup").aliasesEn.none { it == "glucose syrup" })
        assertEquals("sirop de maïs", catalog.getValue("ingredient-ref-corn-syrup").nameFr)
        assertFalse(catalog.containsKey("ingredient-ref-candlenut"))
        assertFalse(catalog.containsKey("ingredient-ref-molasses"))

        assertEquals(
            setOf("ingredient-ref-glucose-solids", "ingredient-ref-glucose-syrup"),
            filterByIngredientSearchQuery(references, "glucose syrup", searchTerms).map { it.id }.toSet()
        )
        assertEquals(
            setOf("ingredient-ref-glucose-solids", "ingredient-ref-glucose-syrup"),
            filterByIngredientSearchQuery(references, "sirop de glucose", searchTerms).map { it.id }.toSet()
        )
        assertSingle("glucose solids", "ingredient-ref-glucose-solids")
        assertSingle("dried glucose syrup", "ingredient-ref-glucose-solids")
        assertSingle("sirop de glucose déshydraté", "ingredient-ref-glucose-solids")
        assertSingle("dark corn syrup", "ingredient-ref-dark-corn-syrup")
        assertEquals(
            setOf("ingredient-ref-duck-egg", "ingredient-ref-century-egg"),
            filterByIngredientSearchQuery(references, "duck egg", searchTerms).map { it.id }.toSet(),
        )
        assertSingle("quail egg", "ingredient-ref-quail-egg")
        assertSingle("nouilles hiyamugi", "ingredient-ref-hiyamugi-noodles")
        assertSingle("kaya jam", "ingredient-ref-kaya")
        assertSingle("pâte jerk", "ingredient-ref-jamaican-jerk-paste")
        assertSingle("doubanjiang", "ingredient-ref-doubanjiang")
    }

    @Test
    fun makhanaIsSpeciesScopedAndDoesNotUseLotusSeedAsAnAlias() {
        val references = BundledIngredientCatalog.references
        val makhana = references.single { it.id == "ingredient-ref-makhana-seeds" }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String) {
            assertEquals(
                listOf(makhana.id),
                filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
            )
        }

        assertEquals("makhana seeds (Euryale ferox)", makhana.nameEn)
        assertEquals("graines de makhana (Euryale ferox)", makhana.nameFr)
        assertEquals(IngredientCategory.NUT_SEED_AND_DRIED_FRUIT, makhana.category)
        assertEquals(listOf("fox nut", "fox nuts", "gorgon nut"), makhana.aliasesEn)
        assertTrue(makhana.aliasesFr.isEmpty())
        assertNull(makhana.defaultDensity)
        assertTrue(makhana.unitMappings.isEmpty())
        listOf("makhana", "makhana seeds", "graines de makhana", "fox nut", "fox nuts", "gorgon nut")
            .forEach(::assertSingle)
        assertTrue(makhana.aliasesEn.none { it in setOf("lotus seed", "lotus seeds") })
        assertTrue(makhana.aliasesFr.none { it == "graines de lotus soufflées" })
    }

    @Test
    fun sagoPearlsLotusSeedsAndLocustCondimentsKeepTheirIdentityBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val searchTerms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, searchTerms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val sagoPearls = catalog.getValue("ingredient-ref-sago-pearls")
        assertEquals("sago pearls", sagoPearls.nameEn)
        assertEquals("perles de sagou", sagoPearls.nameFr)
        assertTrue(sagoPearls.aliasesEn.isEmpty())
        assertEquals(listOf("perle de sagou"), sagoPearls.aliasesFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, sagoPearls.category)
        assertNull(sagoPearls.defaultDensity)
        assertTrue(sagoPearls.unitMappings.isEmpty())
        listOf("sago pearls", "sago pearl", "perles de sagou", "perle de sagou").forEach {
            assertSingle(it, sagoPearls.id)
        }
        assertEquals(
            setOf("ingredient-ref-sago-flour", "ingredient-ref-sago-pearls"),
            matches("sago").toSet()
        )
        listOf("sabudana", "sagu").forEach { assertTrue(matches(it).isEmpty()) }
        assertSingle("tapioca pearls", "ingredient-ref-tapioca-pearls")

        val lotusSeeds = catalog.getValue("ingredient-ref-lotus-seeds")
        assertEquals("sacred lotus seeds (Nelumbo nucifera)", lotusSeeds.nameEn)
        assertEquals("graines de lotus sacré (Nelumbo nucifera)", lotusSeeds.nameFr)
        assertEquals(listOf("sacred lotus seed"), lotusSeeds.aliasesEn)
        assertTrue(lotusSeeds.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.NUT_SEED_AND_DRIED_FRUIT, lotusSeeds.category)
        assertNull(lotusSeeds.defaultDensity)
        assertTrue(lotusSeeds.unitMappings.isEmpty())
        listOf("sacred lotus seeds", "lotus seeds").forEach {
            assertSingle(it, lotusSeeds.id)
        }
        assertEquals(
            setOf(lotusSeeds.id, "ingredient-ref-lotus-seed-flour", "ingredient-ref-lotus-seed-starch"),
            matches("graines de lotus sacré").toSet(),
        )
        assertSingle("fox nuts", "ingredient-ref-makhana-seeds")
        assertEquals(
            setOf("ingredient-ref-lotus-root", "ingredient-ref-lotus-root-starch"),
            matches("lotus root").toSet()
        )
        assertSingle("lotus root starch", "ingredient-ref-lotus-root-starch")

        assertSingle("soumbala", "ingredient-ref-soumbala")
        listOf("iru", "dawadawa", "soumbara", "daddawa").forEach {
            assertTrue("unexpected global match for $it: ${matches(it)}", matches(it).isEmpty())
        }
    }

    @Test
    fun seedIdentityBatchPreservesHullAndProductBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val identityIds = setOf(
            "ingredient-ref-chia-seeds",
            "ingredient-ref-pumpkin-squash-seeds",
            "ingredient-ref-sunflower-seeds",
            "ingredient-ref-flax-seeds",
            "ingredient-ref-hemp-hearts",
            "ingredient-ref-whole-hemp-seeds",
            "ingredient-ref-poppy-seeds"
        )
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        assertEquals(identityIds, catalog.keys.intersect(identityIds))
        identityIds.forEach { id ->
            val reference = catalog.getValue(id)
            assertEquals(IngredientCategory.NUT_SEED_AND_DRIED_FRUIT, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
        }

        val chia = catalog.getValue("ingredient-ref-chia-seeds")
        assertEquals("chia seeds", chia.nameEn)
        assertEquals("graines de chia", chia.nameFr)
        assertEquals(listOf("chia seed"), chia.aliasesEn)
        assertEquals(listOf("graine de chia"), chia.aliasesFr)
        listOf("chia seeds", "chia seed", "graines de chia", "graine de chia")
            .forEach { assertSingle(it, chia.id) }

        val pumpkin = catalog.getValue("ingredient-ref-pumpkin-squash-seeds")
        assertEquals("pumpkin seeds", pumpkin.nameEn)
        assertEquals("graines de citrouille", pumpkin.nameFr)
        assertTrue(pumpkin.aliasesEn.isEmpty())
        assertEquals(listOf("graine de citrouille"), pumpkin.aliasesFr)
        assertSingle("pumpkin seeds", pumpkin.id)
        assertEquals(
            setOf(pumpkin.id, "ingredient-ref-pumpkin-seed-butter", "ingredient-ref-pumpkin-seed-oil"),
            matches("graines de citrouille").toSet()
        )
        assertEquals(listOf("ingredient-ref-pumpkin-seed-oil"), matches("graines de courge"))
        assertSingle("graine de citrouille", pumpkin.id)

        val sunflower = catalog.getValue("ingredient-ref-sunflower-seeds")
        assertEquals("sunflower seeds", sunflower.nameEn)
        assertEquals("graines de tournesol", sunflower.nameFr)
        assertTrue(sunflower.aliasesEn.isEmpty())
        assertEquals(listOf("graine de tournesol"), sunflower.aliasesFr)
        assertSingle("sunflower seeds", sunflower.id)
        assertEquals(
            setOf(sunflower.id, "ingredient-ref-sunflower-seed-butter"),
            matches("graines de tournesol").toSet()
        )
        assertSingle("graine de tournesol", sunflower.id)

        val flax = catalog.getValue("ingredient-ref-flax-seeds")
        assertEquals("flax seeds", flax.nameEn)
        assertEquals("graines de lin", flax.nameFr)
        assertEquals(listOf("flaxseed", "flax seed", "linseed", "linseeds"), flax.aliasesEn)
        assertEquals(listOf("graine de lin"), flax.aliasesFr)
        listOf("flax seeds", "flaxseed", "flax seed", "linseed", "linseeds", "graines de lin", "graine de lin")
            .forEach { assertSingle(it, flax.id) }

        val hemp = catalog.getValue("ingredient-ref-hemp-hearts")
        assertEquals("hemp hearts", hemp.nameEn)
        assertEquals("graines de chanvre décortiquées", hemp.nameFr)
        assertEquals(listOf("hulled hemp seeds", "shelled hemp seeds"), hemp.aliasesEn)
        assertEquals(listOf("cœurs de chanvre"), hemp.aliasesFr)
        listOf("hemp hearts", "hulled hemp seeds", "shelled hemp seeds", "graines de chanvre décortiquées", "cœurs de chanvre")
            .forEach { assertSingle(it, hemp.id) }

        val wholeHemp = catalog.getValue("ingredient-ref-whole-hemp-seeds")
        assertEquals("whole hemp seeds", wholeHemp.nameEn)
        assertEquals("graines de chanvre entières", wholeHemp.nameFr)
        assertEquals(
            listOf("whole hemp seed", "whole roasted hemp seed", "whole roasted hemp seeds"),
            wholeHemp.aliasesEn
        )
        assertEquals(
            listOf("graine de chanvre entière", "graines de chanvre rôties entières"),
            wholeHemp.aliasesFr
        )
        listOf("whole hemp seeds", "whole hemp seed", "whole roasted hemp seed", "whole roasted hemp seeds", "graines de chanvre entières", "graine de chanvre entière", "graines de chanvre rôties entières")
            .forEach { assertSingle(it, wholeHemp.id) }
        assertEquals(setOf(hemp.id, wholeHemp.id), matches("hemp seeds").toSet())
        assertEquals(setOf(hemp.id, wholeHemp.id), matches("graines de chanvre").toSet())
        assertTrue(matches("unhulled hemp seeds").isEmpty())

        val poppy = catalog.getValue("ingredient-ref-poppy-seeds")
        assertEquals("poppy seeds", poppy.nameEn)
        assertEquals("graines de pavot", poppy.nameFr)
        assertEquals(listOf("poppy seed"), poppy.aliasesEn)
        assertEquals(listOf("graine de pavot"), poppy.aliasesFr)
        assertSingle("poppy seeds", poppy.id)
        assertEquals(
            setOf(poppy.id, "ingredient-ref-poppy-seed-filling", "ingredient-ref-defatted-poppy-seed-flour"),
            matches("poppy seed").toSet(),
        )
        assertEquals(setOf(poppy.id, "ingredient-ref-poppy-seed-filling"), matches("graines de pavot").toSet())
        assertSingle("graine de pavot", poppy.id)

        listOf(
            "pepitas",
            "squash seeds",
            "sunflower kernels",
            "unhulled hemp seeds",
            "flax oil",
            "poppy oil",
            "coquelicot"
        ).forEach { query ->
            assertTrue("unexpected global match for $query: ${matches(query)}", matches(query).isEmpty())
        }

    }

    @Test
    fun seafoodAndYeastProductsKeepIdentityAndSearchBoundaries() {
        val references = BundledIngredientCatalog.references
        val byId = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }

        listOf("ingredient-ref-dried-shrimp", "ingredient-ref-dried-scallop").forEach { id ->
            val seafood = byId.getValue(id)
            assertEquals(IngredientCategory.PROTEIN, seafood.category)
            assertNull(seafood.defaultDensity)
            assertTrue(seafood.unitMappings.isEmpty())
        }
        assertSingle("dried shrimp", "ingredient-ref-dried-shrimp")
        assertSingle("crevettes séchées", "ingredient-ref-dried-shrimp")
        assertSingle("dried scallop", "ingredient-ref-dried-scallop")
        assertSingle("pétoncles séchés", "ingredient-ref-dried-scallop")
        assertSingle("conpoy", "ingredient-ref-dried-scallop")

        val driedOyster = byId.getValue("ingredient-ref-dried-oyster")
        assertEquals(IngredientCategory.PROTEIN, driedOyster.category)
        assertNull(driedOyster.defaultDensity)
        assertTrue(driedOyster.unitMappings.isEmpty())
        assertTrue(driedOyster.aliasesEn.none { it == "Yokhoss" })
        assertSingle("dried oyster", "ingredient-ref-dried-oyster")
        assertSingle("huîtres séchées", "ingredient-ref-dried-oyster")

        val sourdoughStarter = byId.getValue("ingredient-ref-sourdough-starter")
        assertEquals(IngredientCategory.BAKING_MIXIN_AND_PANTRY, sourdoughStarter.category)
        assertNull(sourdoughStarter.defaultDensity)
        assertTrue(sourdoughStarter.unitMappings.isEmpty())
        assertSingle("sourdough starter", "ingredient-ref-sourdough-starter")
        assertSingle("levain naturel", "ingredient-ref-sourdough-starter")

        val whiteSoySauce = byId.getValue("ingredient-ref-white-soy-sauce")
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, whiteSoySauce.category)
        assertNull(whiteSoySauce.defaultDensity)
        assertTrue(whiteSoySauce.unitMappings.isEmpty())
        assertSingle("white soy sauce", "ingredient-ref-white-soy-sauce")
        assertSingle("shiro shoyu", "ingredient-ref-white-soy-sauce")
        assertSingle("sauce soya extra-claire", "ingredient-ref-white-soy-sauce")

        val saishikomiSoySauce = byId.getValue("ingredient-ref-saishikomi-soy-sauce")
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, saishikomiSoySauce.category)
        assertEquals("sauce soya refermentée (saishikomi)", saishikomiSoySauce.nameFr)
        assertEquals(
            listOf("saishikomi shoyu", "refermented soy sauce", "twice-brewed soy sauce"),
            saishikomiSoySauce.aliasesEn
        )
        assertNull(saishikomiSoySauce.defaultDensity)
        assertTrue(saishikomiSoySauce.unitMappings.isEmpty())
        assertSingle("saishikomi soy sauce", "ingredient-ref-saishikomi-soy-sauce")
        assertSingle("twice-brewed soy sauce", "ingredient-ref-saishikomi-soy-sauce")
        assertSingle("sauce soya refermentée", "ingredient-ref-saishikomi-soy-sauce")

        val bakerYeast = byId.getValue("ingredient-ref-yeast")
        assertEquals("baker's yeast", bakerYeast.nameEn)
        assertEquals("levure de boulangerie", bakerYeast.nameFr)
        assertEquals(listOf("baking yeast", "bread yeast", "dry yeast", "dried yeast", "yeast"), bakerYeast.aliasesEn)
        assertTrue(bakerYeast.aliasesFr.containsAll(listOf("levure", "levure sèche", "sachet de levure")))
        assertNull(bakerYeast.defaultDensity)
        assertTrue(bakerYeast.unitMappings.isEmpty())

        val yeastIds = listOf(
            "ingredient-ref-active-dry-yeast",
            "ingredient-ref-instant-yeast",
            "ingredient-ref-compressed-yeast",
            "ingredient-ref-osmotolerant-yeast"
        )
        yeastIds.forEach { id ->
            val yeast = byId.getValue(id)
            assertEquals(IngredientCategory.BAKING_MIXIN_AND_PANTRY, yeast.category)
            assertNull(yeast.defaultDensity)
            assertTrue(yeast.unitMappings.isEmpty())
        }
        assertSingle("active dry yeast", "ingredient-ref-active-dry-yeast")
        assertSingle("levure sèche active", "ingredient-ref-active-dry-yeast")
        assertSingle("instant yeast", "ingredient-ref-instant-yeast")
        assertSingle("levure à action rapide", "ingredient-ref-instant-yeast")
        assertSingle("levure instantanée", "ingredient-ref-instant-yeast")
        assertSingle("compressed yeast", "ingredient-ref-compressed-yeast")
        assertSingle("cake yeast", "ingredient-ref-compressed-yeast")
        assertSingle("levure comprimée", "ingredient-ref-compressed-yeast")
        assertSingle("osmotolerant yeast", "ingredient-ref-osmotolerant-yeast")
        assertTrue(filterByIngredientSearchQuery(references, "fresh yeast", terms).none { it.id == "ingredient-ref-compressed-yeast" })
        assertTrue(filterByIngredientSearchQuery(references, "levure fraîche", terms).none { it.id == "ingredient-ref-compressed-yeast" })

        assertEquals(
            setOf(
                "ingredient-ref-soy-sauce",
                "ingredient-ref-white-soy-sauce",
                "ingredient-ref-saishikomi-soy-sauce",
                "ingredient-ref-koikuchi-soy-sauce",
                "ingredient-ref-usukuchi-soy-sauce",
            ),
            filterByIngredientSearchQuery(references, "shoyu", terms).map { it.id }.toSet()
        )
        assertSingle("tamari", "ingredient-ref-tamari")
        assertTrue(byId.getValue("ingredient-ref-tamari").aliasesEn.none { it == "gluten-free tamari" })
        assertTrue(byId.getValue("ingredient-ref-tamari").aliasesFr.none { it == "tamari sans gluten" })
    }

    @Test
    fun quesoFrescoSerranoGuaranaAndChancacaKeepNarrowSourceNames() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }

        val queso = catalog.getValue("ingredient-ref-queso-fresco-serrano")
        assertEquals("queso fresco serrano", queso.nameEn)
        assertEquals("queso fresco serrano", queso.nameFr)
        assertEquals(IngredientCategory.CHEESE, queso.category)
        assertTrue(queso.aliasesEn.isEmpty())
        assertTrue(queso.aliasesFr.isEmpty())
        assertNull(queso.defaultDensity)
        assertTrue(queso.unitMappings.isEmpty())
        assertSingle("queso fresco serrano", queso.id)
        listOf("fromage frais", "cheese curds", "queso andino").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, terms).none { it.id == queso.id })
        }

        val guarana = catalog.getValue("ingredient-ref-guarana-seed")
        assertEquals("guarana seed", guarana.nameEn)
        assertEquals("graine de guarana", guarana.nameFr)
        assertEquals(IngredientCategory.NUT_SEED_AND_DRIED_FRUIT, guarana.category)
        assertEquals(listOf("guarana seeds"), guarana.aliasesEn)
        assertEquals(listOf("graines de guarana"), guarana.aliasesFr)
        assertNull(guarana.defaultDensity)
        assertTrue(guarana.unitMappings.isEmpty())
        listOf("guarana seed", "guarana seeds", "graine de guarana", "graines de guarana")
            .forEach { assertSingle(it, guarana.id) }

        val chancaca = catalog.getValue("ingredient-ref-chilean-chancaca")
        assertEquals("Chilean chancaca", chancaca.nameEn)
        assertEquals("chancaca chilienne", chancaca.nameFr)
        assertEquals(IngredientCategory.SUGAR_AND_SWEETENER, chancaca.category)
        assertTrue(chancaca.aliasesEn.isEmpty())
        assertTrue(chancaca.aliasesFr.isEmpty())
        assertNull(chancaca.defaultDensity)
        assertTrue(chancaca.unitMappings.isEmpty())
        assertSingle("Chilean chancaca", chancaca.id)
        assertSingle("chancaca chilienne", chancaca.id)
        listOf("panela", "piloncillo", "rapadura").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, terms).none { it.id == chancaca.id })
        }
    }

    @Test
    fun guascasAndAndeanChuñoProductsKeepTheirSourceScopedIdentities() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }

        val guascas = catalog.getValue("ingredient-ref-guascas")
        assertEquals("guascas", guascas.nameEn)
        assertEquals("guascas", guascas.nameFr)
        assertEquals(listOf("guasca"), guascas.aliasesEn)
        assertEquals(listOf("guasca"), guascas.aliasesFr)
        assertEquals(IngredientCategory.HERB, guascas.category)
        assertNull(guascas.defaultDensity)
        assertTrue(guascas.unitMappings.isEmpty())
        listOf("guasca", "guascas").forEach { assertSingle(it, guascas.id) }
        listOf("cilantro", "coriander", "epazote").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, terms).none { it.id == guascas.id })
        }

        val blackChuno = catalog.getValue("ingredient-ref-chuno-negro")
        assertEquals("black chuño", blackChuno.nameEn)
        assertEquals("chuño negro", blackChuno.nameFr)
        assertTrue(blackChuno.aliasesEn.isEmpty())
        assertTrue(blackChuno.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, blackChuno.category)
        assertNull(blackChuno.defaultDensity)
        assertTrue(blackChuno.unitMappings.isEmpty())
        assertSingle("black chuño", blackChuno.id)
        assertSingle("chuño negro", blackChuno.id)

        val tunta = catalog.getValue("ingredient-ref-tunta")
        assertEquals("tunta (white chuño)", tunta.nameEn)
        assertEquals("tunta (chuño blanco)", tunta.nameFr)
        assertTrue(tunta.aliasesEn.isEmpty())
        assertTrue(tunta.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, tunta.category)
        assertNull(tunta.defaultDensity)
        assertTrue(tunta.unitMappings.isEmpty())
        assertSingle("tunta", tunta.id)
        assertSingle("chuño blanco", tunta.id)
        assertEquals(
            setOf(blackChuno.id, tunta.id),
            filterByIngredientSearchQuery(references, "chuño", terms).map { it.id }.toSet()
        )

        listOf("papa seca", "potato flour", "potato starch", "moraya").forEach { query ->
            assertTrue(filterByIngredientSearchQuery(references, query, terms).none { it.id in setOf(blackChuno.id, tunta.id) })
        }
    }

    @Test
    fun andeanAjiesUseDistinctNamesAndDoNotPromoteAmbiguousMarketAliases() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }

        val amarillo = catalog.getValue("ingredient-ref-aji-amarillo-pepper")
        assertEquals("ají amarillo pepper", amarillo.nameEn)
        assertEquals("piment jaune (ají amarillo)", amarillo.nameFr)
        assertTrue(amarillo.aliasesEn.isEmpty())
        assertTrue(amarillo.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, amarillo.category)
        assertNull(amarillo.defaultDensity)
        assertTrue(amarillo.unitMappings.isEmpty())
        assertSingle("ají amarillo", amarillo.id)
        assertSingle("ají amarillo pepper", amarillo.id)
        assertSingle("piment jaune (ají amarillo)", amarillo.id)

        val panca = catalog.getValue("ingredient-ref-aji-panca-pepper")
        assertEquals("ají panca pepper", panca.nameEn)
        assertEquals("piment panca (ají panca)", panca.nameFr)
        assertTrue(panca.aliasesEn.isEmpty())
        assertTrue(panca.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, panca.category)
        assertNull(panca.defaultDensity)
        assertTrue(panca.unitMappings.isEmpty())
        assertSingle("ají panca", panca.id)
        assertSingle("ají panca pepper", panca.id)
        assertSingle("piment panca (ají panca)", panca.id)

        assertNotEquals(amarillo.id, panca.id)
        listOf("mirasol", "ají escabeche", "ají cristal", "ají limo", "ají dulce", "ají habanero").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, terms).none { it.id == amarillo.id || it.id == panca.id }
            )
        }
        listOf("aji amarillo molido", "aji panca molido", "ají amarillo paste", "ají panca paste").forEach { query ->
            assertTrue(
                "query: $query",
                filterByIngredientSearchQuery(references, query, terms).none { it.id == amarillo.id || it.id == panca.id }
            )
        }
    }

    @Test
    fun tropicalLeafyGreensKeepTheirNamesAndDoNotCollapseIntoGenericSpinachOrJute() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }

        val waterSpinach = catalog.getValue("ingredient-ref-water-spinach")
        assertEquals("water spinach", waterSpinach.nameEn)
        assertEquals("épinard d'eau", waterSpinach.nameFr)
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, waterSpinach.category)
        assertEquals(
            listOf("Chinese water spinach", "water convolvulus", "kangkong", "kang kong", "ong choy"),
            waterSpinach.aliasesEn
        )
        assertEquals(listOf("épinard d'eau chinois", "liseron d'eau"), waterSpinach.aliasesFr)
        assertNull(waterSpinach.defaultDensity)
        assertTrue(waterSpinach.unitMappings.isEmpty())
        listOf(
            "water spinach", "Chinese water spinach", "water convolvulus", "kangkong", "kang kong",
            "ong choy", "épinard d'eau", "épinard d'eau chinois", "liseron d'eau"
        ).forEach { assertSingle(it, waterSpinach.id) }

        val malabar = catalog.getValue("ingredient-ref-malabar-spinach")
        assertEquals("Malabar spinach", malabar.nameEn)
        assertEquals("baselle", malabar.nameFr)
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, malabar.category)
        assertEquals(
            listOf("Ceylon spinach", "Indian spinach", "vine spinach", "climbing spinach"),
            malabar.aliasesEn
        )
        assertEquals(listOf("épinard de Malabar", "épinard de Ceylan"), malabar.aliasesFr)
        assertNull(malabar.defaultDensity)
        assertTrue(malabar.unitMappings.isEmpty())
        listOf(
            "Malabar spinach", "baselle", "Ceylon spinach", "Indian spinach", "vine spinach",
            "climbing spinach", "épinard de Malabar", "épinard de Ceylan"
        ).forEach { assertSingle(it, malabar.id) }

        val jute = catalog.getValue("ingredient-ref-jute-leaves")
        assertEquals("jute leaves", jute.nameEn)
        assertEquals("feuilles de jute", jute.nameFr)
        assertTrue(jute.aliasesEn.isEmpty())
        assertTrue(jute.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, jute.category)
        assertNull(jute.defaultDensity)
        assertTrue(jute.unitMappings.isEmpty())
        assertSingle("jute leaves", jute.id)
        assertSingle("feuilles de jute", jute.id)

        val molokhia = catalog.getValue("ingredient-ref-molokhia-leaves")
        assertEquals("molokhia leaves", molokhia.nameEn)
        assertEquals("molokhia (feuilles de corète potagère)", molokhia.nameFr)
        assertEquals(listOf("molokhia", "malukhiyah", "mulloukhia", "meloheeya"), molokhia.aliasesEn)
        assertEquals(listOf("corète potagère"), molokhia.aliasesFr)
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, molokhia.category)
        assertNull(molokhia.defaultDensity)
        assertTrue(molokhia.unitMappings.isEmpty())
        listOf(
            "molokhia leaves", "molokhia", "malukhiyah", "mulloukhia", "meloheeya", "corète potagère"
        ).forEach { assertSingle(it, molokhia.id) }

        assertNotEquals(jute.id, molokhia.id)
        listOf("waterleaf", "sweet potato leaves", "morning glory", "swamp cabbage", "Basella")
            .forEach { query ->
                assertTrue(
                    "query: $query",
                    filterByIngredientSearchQuery(references, query, terms).none {
                        it.id in setOf(waterSpinach.id, malabar.id, jute.id, molokhia.id)
                    }
                )
        }
    }

    @Test
    fun rocotoAndJackfruitKeepSourceScopedNamesAndFormBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        val rocoto = catalog.getValue("ingredient-ref-rocoto-pepper")
        assertEquals("rocoto pepper", rocoto.nameEn)
        assertEquals("piment rocoto", rocoto.nameFr)
        assertEquals(
            listOf("locoto", "rokoto", "ro’qote", "chile manzano", "chile de cera", "chile perón"),
            rocoto.aliasesEn
        )
        assertTrue(rocoto.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, rocoto.category)
        assertNull(rocoto.defaultDensity)
        assertTrue(rocoto.unitMappings.isEmpty())
        listOf(
            "rocoto", "rocoto pepper", "piment rocoto", "locoto", "rokoto", "ro’qote",
            "chile manzano", "chile de cera", "chile perón"
        ).forEach { query ->
            assertEquals("query: $query", listOf(rocoto.id), filterByIngredientSearchQuery(references, query, terms).map { it.id })
        }
        val jackfruit = catalog.getValue("ingredient-ref-jackfruit")
        assertEquals("jackfruit", jackfruit.nameEn)
        assertEquals("jaque", jackfruit.nameFr)
        assertEquals(listOf("jakfruit"), jackfruit.aliasesEn)
        assertEquals(listOf("jacque"), jackfruit.aliasesFr)
        assertEquals(IngredientCategory.FRUIT, jackfruit.category)
        assertNull(jackfruit.defaultDensity)
        assertTrue(jackfruit.unitMappings.isEmpty())
        listOf("jackfruit", "jakfruit", "jaque", "jacque").forEach { query ->
            assertEquals(
                "query: $query",
                listOf(jackfruit.id),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }
        listOf("green jackfruit", "unripe jackfruit", "jaquier", "jacquier").forEach { query ->
            assertTrue("query: $query", filterByIngredientSearchQuery(references, query, terms).none { it.id == jackfruit.id })
        }

        listOf("uchu", "red pepper", "ají rojo", "chile caballo", "piment d'Arequipa").forEach { query ->
            assertTrue("query: $query", filterByIngredientSearchQuery(references, query, terms).none { it.id == rocoto.id })
        }
    }

    @Test
    fun ryeMealAndDriedOrangeZestKeepTheirNarrowBilingualProductBoundaries() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }

        val ryeMeal = catalog.getValue("ingredient-ref-rye-meal")
        assertEquals("rye meal", ryeMeal.nameEn)
        assertEquals("gruau de seigle", ryeMeal.nameFr)
        assertEquals(listOf("coarse rye meal", "pumpernickel meal", "pumpernickel flour"), ryeMeal.aliasesEn)
        assertEquals(listOf("semoule de seigle", "farine à pumpernickel"), ryeMeal.aliasesFr)
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, ryeMeal.category)
        assertNull(ryeMeal.defaultDensity)
        assertTrue(ryeMeal.unitMappings.isEmpty())
        listOf(
            "rye meal", "coarse rye meal", "pumpernickel meal", "pumpernickel flour",
            "gruau de seigle", "semoule de seigle", "farine à pumpernickel"
        ).forEach { assertSingle(it, ryeMeal.id) }
        assertEquals(
            setOf("ingredient-ref-rye-flour", "ingredient-ref-dark-rye-flour", "ingredient-ref-light-rye-flour", "ingredient-ref-medium-rye-flour", "ingredient-ref-malted-rye-flour", "ingredient-ref-whole-rye-flour"),
            filterByIngredientSearchQuery(references, "rye flour", terms).map { it.id }.toSet(),
        )
        assertTrue(filterByIngredientSearchQuery(references, "whole rye flour", terms).none { it.id == ryeMeal.id })

        val driedOrangeZest = catalog.getValue("ingredient-ref-dried-orange-zest")
        assertEquals("dried orange zest", driedOrangeZest.nameEn)
        assertEquals("zeste d'orange déshydraté", driedOrangeZest.nameFr)
        assertTrue(driedOrangeZest.aliasesEn.isEmpty())
        assertTrue(driedOrangeZest.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, driedOrangeZest.category)
        assertNull(driedOrangeZest.defaultDensity)
        assertTrue(driedOrangeZest.unitMappings.isEmpty())
        assertSingle("dried orange zest", driedOrangeZest.id)
        assertSingle("zeste d'orange déshydraté", driedOrangeZest.id)
        assertSingle("citrus zest", "ingredient-ref-citrus-zest")
        assertSingle("lemon zest", "ingredient-ref-lemon-zest")
        assertTrue(filterByIngredientSearchQuery(references, "orange peel", terms).none { it.id == driedOrangeZest.id })
    }

    @Test
    fun hazelnutAndChestnutFloursAreSeparateAndCoconutFlourRemainsUnassigned() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals(
                "query: $query",
                listOf(expectedId),
                filterByIngredientSearchQuery(references, query, terms).map { it.id }
            )
        }

        val hazelnutFlour = catalog.getValue("ingredient-ref-hazelnut-flour")
        assertEquals("hazelnut flour", hazelnutFlour.nameEn)
        assertEquals("farine de noisette", hazelnutFlour.nameFr)
        assertTrue(hazelnutFlour.aliasesEn.isEmpty())
        assertTrue(hazelnutFlour.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, hazelnutFlour.category)
        assertNull(hazelnutFlour.defaultDensity)
        assertTrue(hazelnutFlour.unitMappings.isEmpty())
        val hazelnutFlourResults = setOf(hazelnutFlour.id, "ingredient-ref-defatted-hazelnut-flour")
        assertEquals(hazelnutFlourResults, filterByIngredientSearchQuery(references, "hazelnut flour", terms).map { it.id }.toSet())
        assertEquals(hazelnutFlourResults, filterByIngredientSearchQuery(references, "farine de noisette", terms).map { it.id }.toSet())

        val chestnutFlour = catalog.getValue("ingredient-ref-chestnut-flour")
        assertEquals("chestnut flour", chestnutFlour.nameEn)
        assertEquals("farine de châtaigne", chestnutFlour.nameFr)
        assertTrue(chestnutFlour.aliasesEn.isEmpty())
        assertTrue(chestnutFlour.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, chestnutFlour.category)
        assertNull(chestnutFlour.defaultDensity)
        assertTrue(chestnutFlour.unitMappings.isEmpty())
        assertSingle("chestnut flour", chestnutFlour.id)
        assertSingle("farine de châtaigne", chestnutFlour.id)

        listOf("coconut flour", "farine de noix de coco").forEach { query ->
            assertEquals(
                "query: $query",
                listOf("ingredient-ref-defatted-coconut-flour"),
                filterByIngredientSearchQuery(references, query, terms).map { it.id },
            )
        }
    }

    @Test
    fun pupuruAndKodoSearchNamesStayWithinTheirProducts() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val pupuru = catalog.getValue("ingredient-ref-pupuru")
        assertEquals("pupuru", pupuru.nameEn)
        assertEquals("pupuru", pupuru.nameFr)
        assertEquals(listOf("pupuru flour"), pupuru.aliasesEn)
        assertTrue(pupuru.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, pupuru.category)
        assertNull(pupuru.defaultDensity)
        assertTrue(pupuru.unitMappings.isEmpty())
        listOf("pupuru", "pupuru flour").forEach { assertSingle(it, pupuru.id) }
        assertSingle("cassava flour", "ingredient-ref-cassava-flour")
        assertTrue(matches("pukuru").none { it == pupuru.id })

        val kodo = catalog.getValue("ingredient-ref-kodo-millet")
        assertEquals("kodo millet", kodo.nameEn)
        assertEquals("kodo", kodo.nameFr)
        assertEquals(listOf("koda millet", "varagu", "arikelu", "kodra", "harka", "kodon"), kodo.aliasesEn)
        assertTrue(kodo.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, kodo.category)
        assertNull(kodo.defaultDensity)
        assertTrue(kodo.unitMappings.isEmpty())
        assertEquals(setOf(kodo.id, "ingredient-ref-kodo-millet-flour"), matches("kodo millet").toSet())
        assertSingle("koda millet", kodo.id)
        assertEquals(setOf(kodo.id, "ingredient-ref-kodo-millet-flour"), matches("kodo").toSet())
        assertTrue(matches("millet").containsAll(listOf("ingredient-ref-millet", kodo.id)))
    }

    @Test
    fun yaconSearchKeepsAmbiguousEarthPearAndJicamaNamesSeparate() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val yacon = catalog.getValue("ingredient-ref-yacon")
        assertEquals("yacon", yacon.nameEn)
        assertEquals("yacón", yacon.nameFr)
        assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, yacon.category)
        assertTrue(yacon.aliasesEn.isEmpty())
        assertTrue(yacon.aliasesFr.isEmpty())
        assertNull(yacon.defaultDensity)
        assertTrue(yacon.unitMappings.isEmpty())
        assertSingle("yacon", yacon.id)
        assertSingle("yacón", yacon.id)
        assertTrue(matches("poire de terre").none { it == yacon.id })
        assertSingle("jicama", "ingredient-ref-jicama")
    }

    @Test
    fun sweetPotatoStarchNoodlesStaySeparateFromGenericDangmyeonAndBeanThreads() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val noodles = catalog.getValue("ingredient-ref-sweet-potato-starch-noodles")
        assertEquals("sweet potato starch noodles", noodles.nameEn)
        assertEquals("nouilles à base de fécule de patate douce", noodles.nameFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, noodles.category)
        assertEquals(listOf("sweet potato glass noodles"), noodles.aliasesEn)
        assertEquals(listOf("vermicelles de patate douce"), noodles.aliasesFr)
        assertNull(noodles.defaultDensity)
        assertTrue(noodles.unitMappings.isEmpty())
        listOf(
            "sweet potato starch noodles",
            "sweet potato glass noodles",
            "nouilles à base de fécule de patate douce",
            "vermicelles de patate douce",
        ).forEach { assertSingle(it, noodles.id) }
        assertTrue(matches("dangmyeon").none { it == noodles.id })
        assertSingle("bean thread cellophane noodles", "ingredient-ref-bean-thread-cellophane-noodles")
    }

    @Test
    fun scottishOatmealAndShiratakiUseOnlySourceScopedProductNames() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val scottishOatmeal = catalog.getValue("ingredient-ref-scottish-oatmeal")
        assertEquals("Scottish oatmeal", scottishOatmeal.nameEn)
        assertEquals("gruau écossais", scottishOatmeal.nameFr)
        assertEquals(listOf("Scotch oatmeal", "Scottish oats"), scottishOatmeal.aliasesEn)
        assertTrue(scottishOatmeal.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, scottishOatmeal.category)
        assertNull(scottishOatmeal.defaultDensity)
        assertTrue(scottishOatmeal.unitMappings.isEmpty())
        listOf("Scottish oatmeal", "Scotch oatmeal", "Scottish oats", "gruau écossais").forEach {
            assertSingle(it, scottishOatmeal.id)
        }
        assertTrue(matches("dry oatmeal").none { it == scottishOatmeal.id })

        val shirataki = catalog.getValue("ingredient-ref-shirataki-noodles")
        assertEquals("shirataki noodles", shirataki.nameEn)
        assertEquals("nouilles shirataki", shirataki.nameFr)
        assertEquals(listOf("konjac noodles"), shirataki.aliasesEn)
        assertEquals(listOf("nouilles de konjac"), shirataki.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, shirataki.category)
        assertNull(shirataki.defaultDensity)
        assertTrue(shirataki.unitMappings.isEmpty())
        listOf("shirataki noodles", "konjac noodles", "nouilles shirataki", "nouilles de konjac").forEach {
            assertSingle(it, shirataki.id)
        }
        assertTrue(matches("bean thread cellophane noodles").contains("ingredient-ref-bean-thread-cellophane-noodles"))
        assertTrue(matches("sweet potato starch noodles").contains("ingredient-ref-sweet-potato-starch-noodles"))
        assertTrue(matches("tofu shirataki").none { it == shirataki.id })
    }

    @Test
    fun orangeFootedSeaCucumberUsesSpeciesSpecificNamesWithoutGenericAliases() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val seaCucumber = catalog.getValue("ingredient-ref-orange-footed-sea-cucumber")
        assertEquals("orange-footed sea cucumber", seaCucumber.nameEn)
        assertEquals("holothurie touffue", seaCucumber.nameFr)
        assertEquals(
            listOf("Atlantic sea cucumber", "Cucumaria frondosa", "North Atlantic sea cucumber", "northern sea cucumber"),
            seaCucumber.aliasesEn,
        )
        assertEquals(listOf("concombre de mer du Nord"), seaCucumber.aliasesFr)
        assertEquals(IngredientCategory.PROTEIN, seaCucumber.category)
        assertNull(seaCucumber.defaultDensity)
        assertTrue(seaCucumber.unitMappings.isEmpty())
        listOf(
            "orange-footed sea cucumber",
            "Atlantic sea cucumber",
            "North Atlantic sea cucumber",
            "northern sea cucumber",
            "Cucumaria frondosa",
            "holothurie touffue",
            "concombre de mer du Nord",
        ).forEach { assertSingle(it, seaCucumber.id) }
        assertTrue(seaCucumber.aliasesEn.none { it == "sea cucumber" || it == "bêche-de-mer" || it == "trepang" })
        assertTrue(seaCucumber.aliasesFr.none { it == "concombre de mer" || it == "bêche-de-mer" })
    }

    @Test
    fun scotchBonnetPepperSauceKeepsFreshPepperAndRegionalSaucesDistinct() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val sauceId = "ingredient-ref-scotch-bonnet-pepper-sauce"
        val sauce = catalog.getValue(sauceId)
        assertEquals("Scotch Bonnet pepper sauce", sauce.nameEn)
        assertEquals("sauce au piment fort Scotch Bonnet", sauce.nameFr)
        assertEquals(
            listOf("Scotch Bonnet hot pepper sauce", "hot Scotch Bonnet pepper sauce", "Scotch Bonnet sauce"),
            sauce.aliasesEn,
        )
        assertTrue(sauce.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, sauce.category)
        assertNull(sauce.defaultDensity)
        assertTrue(sauce.unitMappings.isEmpty())
        listOf(
            "Scotch Bonnet pepper sauce",
            "Scotch Bonnet hot pepper sauce",
            "hot Scotch Bonnet pepper sauce",
            "Scotch Bonnet sauce",
            "sauce au piment fort Scotch Bonnet",
        ).forEach { assertSingle(it, sauceId) }

        val freshPepperId = "ingredient-ref-scotch-bonnet-pepper"
        assertEquals(freshPepperId, matches("piment Scotch Bonnet").single())
        assertEquals(sauceId, matches("sauce au piment fort Scotch Bonnet").single())
        assertTrue(matches("hot sauce").none { it == sauceId })
        assertEquals(setOf("ingredient-ref-shito", sauceId), matches("pepper sauce").toSet())
        assertTrue(matches("green Scotch Bonnet sauce").none { it == sauceId })
        assertTrue(matches("Caribbean curry Scotch Bonnet sauce").none { it == sauceId })
        assertTrue(matches("shito sauce").none { it == sauceId })
        assertTrue(matches("Jamaican jerk paste").none { it == sauceId })
    }

    @Test
    fun eggPastaKeepsCompositionSeparateFromPastaShapesAndEggNoodles() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val eggPastaId = "ingredient-ref-egg-pasta"
        val eggPasta = catalog.getValue(eggPastaId)
        assertEquals("egg pasta", eggPasta.nameEn)
        assertEquals("pâtes aux œufs", eggPasta.nameFr)
        assertTrue(eggPasta.aliasesEn.isEmpty())
        assertEquals(listOf("pâtes alimentaires aux œufs"), eggPasta.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, eggPasta.category)
        assertNull(eggPasta.defaultDensity)
        assertTrue(eggPasta.unitMappings.isEmpty())
        listOf("egg pasta", "pâtes aux œufs", "pâtes alimentaires aux oeufs").forEach {
            assertSingle(it, eggPastaId)
        }

        assertTrue(matches("pasta").contains("ingredient-ref-pasta"))
        assertTrue(matches("pasta").contains(eggPastaId))
        assertSingle("egg noodles", "ingredient-ref-egg-noodles")
        assertSingle("nouilles aux œufs", "ingredient-ref-egg-noodles")
        assertTrue(matches("fettuccine").none { it == eggPastaId })
        assertTrue(matches("fresh pasta").none { it == eggPastaId })
        assertTrue(matches("dry pasta").none { it == eggPastaId })
    }

    @Test
    fun wholeWheatPastaKeepsCompositionSeparateFromFlourAndOtherPastaClasses() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val wholeWheatPastaId = "ingredient-ref-whole-wheat-pasta"
        val wholeWheatPasta = catalog.getValue(wholeWheatPastaId)
        assertEquals("whole-wheat pasta", wholeWheatPasta.nameEn)
        assertEquals("pâtes de blé entier", wholeWheatPasta.nameFr)
        assertTrue(wholeWheatPasta.aliasesEn.isEmpty())
        assertEquals(listOf("pâtes alimentaires de blé entier"), wholeWheatPasta.aliasesFr)
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, wholeWheatPasta.category)
        assertNull(wholeWheatPasta.defaultDensity)
        assertTrue(wholeWheatPasta.unitMappings.isEmpty())
        listOf("whole-wheat pasta", "whole wheat pasta", "pâtes de blé entier", "pâtes alimentaires de blé entier")
            .forEach { assertSingle(it, wholeWheatPastaId) }

        assertTrue(matches("pasta").contains("ingredient-ref-pasta"))
        assertTrue(matches("pasta").contains("ingredient-ref-egg-pasta"))
        assertTrue(matches("whole-wheat flour").contains("ingredient-ref-whole-wheat-flour"))
        assertFalse(matches("whole-wheat flour").contains(wholeWheatPastaId))
        assertTrue(matches("whole-grain pasta").none { it == wholeWheatPastaId })
        assertTrue(matches("fresh pasta").none { it == wholeWheatPastaId })
        assertTrue(matches("dry pasta").none { it == wholeWheatPastaId })
        assertTrue(matches("egg noodles").none { it == wholeWheatPastaId })
    }

    @Test
    fun glutenFreePastaKeepsItsMarketClaimSeparateFromGrainAndShapeIdentities() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val glutenFreePastaId = "ingredient-ref-gluten-free-pasta"
        val glutenFreePasta = catalog.getValue(glutenFreePastaId)
        assertEquals("gluten-free pasta", glutenFreePasta.nameEn)
        assertEquals("pâtes sans gluten", glutenFreePasta.nameFr)
        assertTrue(glutenFreePasta.aliasesEn.isEmpty())
        assertTrue(glutenFreePasta.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, glutenFreePasta.category)
        assertNull(glutenFreePasta.defaultDensity)
        assertTrue(glutenFreePasta.unitMappings.isEmpty())
        listOf("gluten-free pasta", "gluten free pasta", "pâtes sans gluten")
            .forEach { assertSingle(it, glutenFreePastaId) }

        assertTrue(matches("pasta").contains("ingredient-ref-pasta"))
        assertTrue(matches("pasta").contains("ingredient-ref-egg-pasta"))
        assertTrue(matches("pasta").contains("ingredient-ref-whole-wheat-pasta"))
        assertTrue(matches("gluten-free spaghetti").none { it == glutenFreePastaId })
        assertTrue(matches("rice pasta").none { it == glutenFreePastaId })
        assertTrue(matches("chickpea pasta").none { it == glutenFreePastaId })
        assertTrue(matches("egg noodles").none { it == glutenFreePastaId })
    }

    @Test
    fun molePasteUsesOnlyThePasteStateNameAndProvisionalFrenchDisplay() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val molePaste = catalog.getValue("ingredient-ref-mole-paste")
        assertEquals("mole paste", molePaste.nameEn)
        assertEquals("mole en pâte", molePaste.nameFr)
        assertTrue(molePaste.aliasesEn.isEmpty())
        assertTrue(molePaste.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, molePaste.category)
        assertNull(molePaste.defaultDensity)
        assertTrue(molePaste.unitMappings.isEmpty())
        listOf("mole paste", "mole en pâte").forEach { assertSingle(it, molePaste.id) }
        listOf("mole sauce", "sauce mole", "ready-to-serve mole", "mole powder", "pipián")
            .forEach { assertTrue("query: $it", matches(it).none { id -> id == molePaste.id }) }
        assertTrue(matches("mole").contains(molePaste.id))
    }

    @Test
    fun eggNoodlesStayDistinctFromGenericPastaAndRamen() {
        val references = BundledIngredientCatalog.references
        val catalog = references.associateBy { it.id }
        val terms: (app.recipebook.domain.model.IngredientReference) -> Iterable<String> = { reference ->
            listOf(reference.nameEn, reference.nameFr) + reference.aliasesEn + reference.aliasesFr
        }
        fun matches(query: String) = filterByIngredientSearchQuery(references, query, terms).map { it.id }
        fun assertSingle(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), matches(query))
        }

        val eggNoodles = catalog.getValue("ingredient-ref-egg-noodles")
        assertEquals("egg noodles", eggNoodles.nameEn)
        assertEquals("nouilles aux œufs", eggNoodles.nameFr)
        assertTrue(eggNoodles.aliasesEn.isEmpty())
        assertTrue(eggNoodles.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, eggNoodles.category)
        assertNull(eggNoodles.defaultDensity)
        assertTrue(eggNoodles.unitMappings.isEmpty())
        listOf("egg noodles", "nouilles aux œufs", "nouilles aux oeufs").forEach {
            assertSingle(it, eggNoodles.id)
        }
        listOf("egg pasta", "pâtes alimentaires aux œufs", "ramen", "nouilles ramen", "nouilles chinoises")
            .forEach { assertTrue("query: $it", matches(it).none { id -> id == eggNoodles.id }) }
        assertTrue(matches("ramen").contains("ingredient-ref-ramen-noodles"))
        assertTrue(matches("pasta").contains("ingredient-ref-pasta"))
    }

}
