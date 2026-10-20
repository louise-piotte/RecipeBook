package app.recipebook.domain.localization

import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientReference
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class IngredientSearchTest {

    private data class SearchItem(val id: String, val terms: List<String>)

    @Test
    fun reusableSearchIndexFindsFrenchNamesAndApostropheAliases() {
        val almondFlour = IngredientReference(
            id = "almond-flour",
            nameFr = "farine d'amande",
            nameEn = "almond flour",
            aliasesFr = listOf("poudre d'amande", "poudre d'amandes"),
            updatedAt = "now"
        )
        val hazelnutFlour = IngredientReference(
            id = "hazelnut-flour",
            nameFr = "farine de noisette",
            nameEn = "hazelnut flour",
            updatedAt = "now"
        )
        val index = IngredientReferenceSearchIndex(listOf(almondFlour, hazelnutFlour))

        assertEquals(listOf("almond-flour"), index.filter("farine d amande").map { it.id })
        assertEquals(listOf("almond-flour"), index.filter("poudre d amandes").map { it.id })
        assertEquals(listOf("hazelnut-flour"), index.filter("farine de noisette").map { it.id })
    }

    @Test
    fun exactWordPhraseSuppressesUnrelatedSubstringMatches() {
        val items = listOf(
            SearchItem("chard", listOf("bette à carde", "Swiss chard")),
            SearchItem("beet", listOf("betterave potagère", "beet")),
            SearchItem("broth", listOf("better than bouillon", "broth concentrate")),
        )

        val results = filterByIngredientSearchQuery(items, "bette") { it.terms }

        assertEquals(listOf("chard"), results.map { it.id })
    }

    @Test
    fun partialSearchStillWorksWhenNoCompleteWordPhraseMatches() {
        val items = listOf(
            SearchItem("spinach", listOf("spinach", "épinard")),
            SearchItem("spinach-beet", listOf("spinach beet", "bette à carde")),
        )

        val results = filterByIngredientSearchQuery(items, "spina") { it.terms }

        assertEquals(listOf("spinach", "spinach-beet"), results.map { it.id })
    }

    @Test
    fun exactChocolateChipAliasesSelectTheirBaseIdentityAndForm() {
        val semisweet = IngredientReference(
            id = "semisweet",
            nameFr = "chocolat mi-sucré",
            nameEn = "semisweet chocolate",
            aliasesFr = listOf("pépites de chocolat", "pépites de chocolat mi-sucré"),
            aliasesEn = listOf("chocolate chips", "semisweet chocolate chips"),
            updatedAt = "now"
        )
        val white = IngredientReference(
            id = "white",
            nameFr = "chocolat blanc",
            nameEn = "white chocolate",
            aliasesFr = listOf("pépites de chocolat blanc"),
            aliasesEn = listOf("white chocolate chips"),
            updatedAt = "now"
        )
        val forms = listOf(
            IngredientForm(
                id = "semisweet-chips", ingredientRefId = semisweet.id, formCode = "chips",
                labelFr = "pépites de chocolat mi-sucré", labelEn = "semisweet chocolate chips",
                matchTermsFr = listOf("brisures de chocolat"), matchTermsEn = listOf("chocolate chips"), updatedAt = "now"
            ),
            IngredientForm(
                id = "white-chips", ingredientRefId = white.id, formCode = "chips",
                labelFr = "pépites de chocolat blanc", labelEn = "white chocolate chips",
                updatedAt = "now"
            )
        )
        val references = listOf(semisweet, white)

        assertEquals(listOf("semisweet"), filterIngredientReferencesWithForms(references, forms, "chocolate chips").map { it.id })
        assertEquals("semisweet-chips", matchIngredientFormHint("semisweet", forms, "chocolate chips")?.id)
        assertEquals(listOf("white"), filterIngredientReferencesWithForms(references, forms, "white chocolate chips").map { it.id })
        assertEquals("white-chips", matchIngredientFormHint("white", forms, "pépites de chocolat blanc")?.id)
        assertEquals(listOf("semisweet"), filterIngredientReferencesWithForms(references, forms, "brisures de chocolat").map { it.id })
        assertEquals("semisweet-chips", matchIngredientFormHint("semisweet", forms, "brisures de chocolat")?.id)
        assertNull(matchIngredientFormHint("semisweet", forms, "chips"))
    }

    @Test
    fun meltedChocolateSearchKeepsChocolateIdentityAndMeltedFormTogether() {
        val semisweet = IngredientReference("semisweet", "chocolat mi-sucré", "semisweet chocolate", updatedAt = "now")
        val white = IngredientReference("white", "chocolat blanc", "white chocolate", updatedAt = "now")
        val forms = listOf(
            IngredientForm(
                id = "semisweet-melted", ingredientRefId = semisweet.id, formCode = "melted",
                labelFr = "chocolat mi-sucré fondu", labelEn = "melted semisweet chocolate",
                matchTermsFr = listOf("chocolat fondu"), matchTermsEn = listOf("melted chocolate"), updatedAt = "now"
            ),
            IngredientForm(
                id = "white-melted", ingredientRefId = white.id, formCode = "melted",
                labelFr = "chocolat blanc fondu", labelEn = "melted white chocolate",
                matchTermsFr = listOf("chocolat fondu"), matchTermsEn = listOf("melted chocolate"), updatedAt = "now"
            )
        )

        val matches = filterIngredientReferencesWithForms(listOf(semisweet, white), forms, "melted chocolate")
        assertEquals(setOf("semisweet", "white"), matches.map { it.id }.toSet())
        assertEquals("semisweet-melted", matchIngredientFormHint("semisweet", forms, "melted chocolate")?.id)
        assertEquals("white-melted", matchIngredientFormHint("white", forms, "chocolat fondu")?.id)
    }

    @Test
    fun explicitRiceAndQuinoaStatesHintFormsWithoutChangingTheirBaseIdentities() {
        val rice = IngredientReference("rice", "riz", "rice", updatedAt = "now")
        val quinoa = IngredientReference("quinoa", "quinoa", "quinoa", updatedAt = "now")
        val forms = listOf(
            IngredientForm(
                id = "rice-dry", ingredientRefId = rice.id, formCode = "dry",
                labelFr = "riz sec", labelEn = "dry rice", updatedAt = "now"
            ),
            IngredientForm(
                id = "rice-cooked", ingredientRefId = rice.id, formCode = "cooked",
                labelFr = "riz cuit", labelEn = "cooked rice", updatedAt = "now"
            ),
            IngredientForm(
                id = "quinoa-dry", ingredientRefId = quinoa.id, formCode = "dry",
                labelFr = "quinoa, sec", labelEn = "quinoa, dry", updatedAt = "now"
            ),
            IngredientForm(
                id = "quinoa-cooked", ingredientRefId = quinoa.id, formCode = "cooked",
                labelFr = "quinoa, cuit", labelEn = "quinoa, cooked", updatedAt = "now"
            )
        )
        val references = listOf(rice, quinoa)

        assertEquals(listOf(rice.id), filterIngredientReferencesWithForms(references, forms, "cooked rice").map { it.id })
        assertEquals("rice-cooked", matchIngredientFormHint(rice.id, forms, "cooked rice")?.id)
        assertEquals("rice-dry", matchIngredientFormHint(rice.id, forms, "riz sec")?.id)
        assertEquals(listOf(quinoa.id), filterIngredientReferencesWithForms(references, forms, "quinoa, cooked").map { it.id })
        assertEquals("quinoa-cooked", matchIngredientFormHint(quinoa.id, forms, "quinoa, cuit")?.id)
        assertNull(matchIngredientFormHint(rice.id, forms, "rice"))
        assertNull(matchIngredientFormHint(quinoa.id, forms, "quinoa"))
    }

    @Test
    fun nonChocolateChipIdentityDoesNotAcquireAChocolateFormHint() {
        val butterscotchChips = IngredientReference(
            id = "butterscotch-chips", nameFr = "pépites de caramel écossais", nameEn = "butterscotch chips", updatedAt = "now"
        )
        val chocolate = IngredientReference(
            id = "semisweet", nameFr = "chocolat mi-sucré", nameEn = "semisweet chocolate",
            aliasesEn = listOf("chocolate chips"), updatedAt = "now"
        )
        val chocolateForm = IngredientForm(
            id = "semisweet-chips", ingredientRefId = chocolate.id, formCode = "chips",
            labelFr = "pépites de chocolat mi-sucré", labelEn = "semisweet chocolate chips",
            matchTermsEn = listOf("chocolate chips"), updatedAt = "now"
        )

        assertEquals(
            listOf("butterscotch-chips"),
            filterIngredientReferencesWithForms(listOf(butterscotchChips, chocolate), listOf(chocolateForm), "butterscotch chips").map { it.id }
        )
        assertNull(matchIngredientFormHint(butterscotchChips.id, listOf(chocolateForm), "butterscotch chips"))
    }

    @Test
    fun reusableSearchIndexKeepsFormPriorityAndCanBeRebuiltForCatalogChanges() {
        val semisweet = IngredientReference(
            id = "semisweet",
            nameFr = "chocolat mi-sucré",
            nameEn = "semisweet chocolate",
            aliasesEn = listOf("chocolate chips"),
            updatedAt = "now"
        )
        val white = IngredientReference(
            id = "white",
            nameFr = "chocolat blanc",
            nameEn = "white chocolate",
            aliasesEn = listOf("white chocolate chips"),
            updatedAt = "now"
        )
        val semisweetForm = IngredientForm(
            id = "semisweet-chips",
            ingredientRefId = semisweet.id,
            formCode = "chips",
            labelFr = "pépites de chocolat mi-sucré",
            labelEn = "semisweet chocolate chips",
            matchTermsEn = listOf("chocolate chips"),
            updatedAt = "now"
        )
        val whiteForm = IngredientForm(
            id = "white-chips",
            ingredientRefId = white.id,
            formCode = "chips",
            labelFr = "pépites de chocolat blanc",
            labelEn = "white chocolate chips",
            updatedAt = "now"
        )
        val originalIndex = IngredientReferenceSearchIndex(
            ingredientReferences = listOf(semisweet, white),
            ingredientForms = listOf(semisweetForm, whiteForm)
        )

        assertEquals(listOf("semisweet"), originalIndex.filter("chocolate chips").map { it.id })
        assertEquals(setOf("semisweet", "white"), originalIndex.filter("ocolate chips").map { it.id }.toSet())
        assertEquals(
            setOf("semisweet", "white"),
            originalIndex.filter("chips").map { it.id }.toSet()
        )
        assertEquals(
            "semisweet-chips",
            originalIndex.matchFormHint("semisweet", "chocolate chips")?.id
        )
        assertNull(originalIndex.matchFormHint("semisweet", "chips"))

        val renamedSemisweet = semisweet.copy(id = "renamed-semisweet", aliasesEn = listOf("chocolate chips"))
        val updatedIndex = IngredientReferenceSearchIndex(
            ingredientReferences = listOf(renamedSemisweet, white),
            ingredientForms = listOf(semisweetForm.copy(ingredientRefId = renamedSemisweet.id), whiteForm)
        )
        assertEquals(listOf("renamed-semisweet"), updatedIndex.filter("chocolate chips").map { it.id })
        assertEquals(listOf("semisweet"), originalIndex.filter("chocolate chips").map { it.id })
    }

    @Test
    fun wrapperAndSourdoughCatalogTermsKeepProductBoundaries() {
        val ricePaper = IngredientReference(
            id = "rice-paper",
            nameFr = "feuilles de riz",
            nameEn = "rice-paper sheets",
            aliasesFr = listOf("galettes de riz pour rouleaux de printemps", "galettes pour rouleaux de printemps"),
            aliasesEn = listOf("rice paper", "rice paper wrappers"),
            updatedAt = "now"
        )
        val wonton = IngredientReference(
            id = "wonton-wrapper",
            nameFr = "pâtes à wonton",
            nameEn = "wonton wrappers",
            aliasesFr = listOf("pâte à wonton", "pâtes à won ton", "feuilles pour wonton"),
            aliasesEn = listOf("wonton skin", "wonton skins"),
            updatedAt = "now"
        )
        val gyoza = IngredientReference(
            id = "gyoza-wrapper",
            nameFr = "feuilles pour gyoza",
            nameEn = "gyoza wrappers",
            aliasesEn = listOf("gyoza skin", "gyoza skins"),
            updatedAt = "now"
        )
        val wheatSpringRoll = IngredientReference(
            id = "wheat-spring-roll-pastry",
            nameFr = "pâte de blé pour rouleaux de printemps",
            nameEn = "wheat spring-roll pastry",
            aliasesEn = listOf("spring roll pastry"),
            updatedAt = "now"
        )
        val eggRoll = IngredientReference(
            id = "egg-roll-wrapper",
            nameFr = "pâte pour rouleaux aux œufs",
            nameEn = "egg-roll wrappers",
            aliasesFr = listOf("pâtes à egg rolls"),
            aliasesEn = listOf("egg roll skins"),
            updatedAt = "now"
        )
        val starter = IngredientReference(
            id = "sourdough-starter",
            nameFr = "levain naturel",
            nameEn = "sourdough starter",
            aliasesFr = listOf("levain chef"),
            updatedAt = "now"
        )
        val driedStarter = IngredientForm(
            id = "dehydrated-reactivatable-starter",
            ingredientRefId = starter.id,
            formCode = "dehydrated_reactivatable",
            labelFr = "levain naturel déshydraté",
            labelEn = "dehydrated sourdough starter",
            prepState = "dry",
            updatedAt = "now"
        )
        val references = listOf(ricePaper, wonton, gyoza, wheatSpringRoll, eggRoll, starter)
        val forms = listOf(driedStarter)
        val index = IngredientReferenceSearchIndex(references, forms)

        assertEquals(listOf(ricePaper.id), index.filter("rice paper").map { it.id })
        assertEquals(listOf(ricePaper.id), index.filter("galettes pour rouleaux de printemps").map { it.id })
        assertEquals(listOf(wonton.id), index.filter("pâtes à won ton").map { it.id })
        assertEquals(listOf(gyoza.id), index.filter("feuilles pour gyoza").map { it.id })
        assertEquals(listOf(wheatSpringRoll.id), index.filter("pâte de blé pour rouleaux de printemps").map { it.id })
        assertEquals(listOf(eggRoll.id), index.filter("pâte pour rouleaux aux œufs").map { it.id })
        assertEquals(emptyList<String>(), index.filter("spring-roll wrapper").map { it.id })
        assertEquals(emptyList<String>(), index.filter("dumpling wrapper").map { it.id })
        assertEquals(emptyList<String>(), index.filter("pâte à rouleaux de printemps").map { it.id })

        assertEquals(listOf(starter.id), index.filter("levain chef").map { it.id })
        assertEquals(listOf(starter.id), index.filter("levain naturel déshydraté").map { it.id })
        assertEquals(emptyList<String>(), index.filter("levain déshydraté").map { it.id })
        assertEquals(driedStarter.id, index.matchFormHint(starter.id, "levain naturel déshydraté")?.id)
        assertNull(index.matchFormHint(starter.id, "levain déshydraté"))
        assertEquals(emptyList<String>(), index.filter("levain tout point").map { it.id })
        assertEquals(emptyList<String>(), index.filter("sourdough discard").map { it.id })
    }
}
