package app.recipebook.data.schema

import app.recipebook.domain.localization.IngredientReferenceSearchIndex
import app.recipebook.domain.model.IngredientCategory
import java.io.File
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class BundledSeedPackageTest {

    private val json = Json { ignoreUnknownKeys = true }

    @Test
    fun bundledSeedPackage_decodesToCanonicalLibraryData() {
        val payload = loadBundledPayload()
        val library = payload.toDomainLibrary()

        assertEquals(SchemaVersions.FULL_LIBRARY_V1, payload.schemaVersion)
        assertEquals("library-bundled-default", library.metadata.libraryId)
        assertFalse(library.metadata.libraryId.contains("boite", ignoreCase = true))
        assertFalse(library.ingredientReferences.isEmpty())
        assertTrue(library.tags.size >= 12)
        assertTrue(library.collections.any { it.nameEn == "Christmas Box" })
        assertTrue(library.ingredientReferences.any { it.nameEn == "all-purpose flour" })
        assertTrue(library.ingredientReferences.any { it.nameEn == "white whole-wheat flour" })
        assertTrue(library.ingredientReferences.any { it.nameEn == "icing sugar" })
        assertTrue(library.ingredientReferences.any { it.nameEn == "tamari" })
        assertTrue(library.ingredientReferences.any { it.nameEn == "apple cider vinegar" })
        assertTrue(library.ingredientReferences.any { it.nameEn == "cashew butter" })
        assertTrue(library.ingredientReferences.any { it.nameEn == "poppy seed filling" })
        assertTrue(library.contextualSubstitutionRules.isEmpty())
        assertTrue(library.recipes.all { recipe ->
            recipe.languages.fr.title.isNotBlank() &&
                recipe.languages.en.title.isNotBlank() &&
                recipe.ingredients.all { it.ingredientRefId == null || it.ingredientRefId.isNotBlank() } &&
                recipe.photos.all { it.localPath.startsWith("photos/") } &&
                (recipe.mainPhotoId == null || recipe.photos.any { photo -> photo.id == recipe.mainPhotoId })
        })
    }

    @Test
    fun bundledSeedPackage_crabMeatKeepsJumboLumpAsAForm() {
        val library = loadBundledPayload().toDomainLibrary()
        val crab = library.ingredientReferences.single { it.id == "ingredient-ref-crab" }
        val jumboLump = library.ingredientForms.single { it.id == "ingredient-form-crab-jumbo-lump" }
        val line = library.recipes.flatMap { it.ingredients }
            .single { it.id == "135813a6-75e2-4596-8c71-ffd450fab0ca-ingredient-8" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals("crab meat", crab.nameEn)
        assertEquals("chair de crabe", crab.nameFr)
        assertEquals(IngredientCategory.PROTEIN, crab.category)
        assertTrue(crab.aliasesEn.isEmpty())
        assertTrue(crab.aliasesFr.isEmpty())
        assertNull(crab.defaultDensity)
        assertTrue(crab.unitMappings.isEmpty())
        assertEquals(crab.id, jumboLump.ingredientRefId)
        assertEquals("jumbo_lump", jumboLump.formCode)
        assertEquals("jumbo lump crab meat", jumboLump.labelEn)
        assertEquals("chair de crabe en gros morceaux (jumbo lump)", jumboLump.labelFr)
        assertNull(jumboLump.densityGPerMl)
        assertTrue(library.ingredientReferences.none { it.id == "ingredient-ref-jumbo-lump-crab-meat" })

        assertEquals(crab.id, line.ingredientRefId)
        assertEquals(jumboLump.id, line.ingredientFormId)
        assertEquals("1 lb jumbo lump crab meat", line.originalText)
        assertEquals("jumbo lump crab meat", line.ingredientName)
        assertEquals(1.0, line.quantity!!, 0.0)
        assertEquals("lb", line.unit)
        assertTrue(line.substitutions.isEmpty())

        assertEquals(setOf(crab.id, "ingredient-ref-imitation-crab"), index.filter("crab meat").map { it.id }.toSet())
        assertEquals(listOf(crab.id), index.filter("jumbo lump crab meat").map { it.id })
        assertEquals(setOf(crab.id, "ingredient-ref-imitation-crab"), index.filter("chair de crabe").map { it.id }.toSet())
        assertEquals(jumboLump.id, index.matchFormHint(crab.id, "jumbo lump crab meat")?.id)
        assertEquals(
            jumboLump.id,
            index.matchFormHint(crab.id, "chair de crabe en gros morceaux (jumbo lump)")?.id
        )
        assertNull(index.matchFormHint(crab.id, "crab meat"))
    }

    @Test
    fun bundledSeedPackage_keepsNamedSaltRecipeLinesSpecific() {
        val library = loadBundledPayload().library
        val ingredientLines = library.recipes.flatMap { it.ingredients }

        fun assertLinked(originalText: String, expectedRefId: String) {
            val matches = ingredientLines.filter { it.originalText == originalText }
            assertFalse("Expected bundled recipe line: $originalText", matches.isEmpty())
            assertTrue(matches.all { it.ingredientRefId == expectedRefId })
        }

        assertLinked("1/2 tsp kosher salt", "ingredient-ref-kosher-salt")
        assertLinked("1 tsp kosher salt", "ingredient-ref-kosher-salt")
        assertLinked("flaky sea salt, for topping", "ingredient-ref-flaky-sea-salt")

        val ambiguousCoarseSalt = ingredientLines.single { it.originalText == "2 tbsp coarse salt" }
        assertEquals("ingredient-ref-salt", ambiguousCoarseSalt.ingredientRefId)
    }

    @Test
    fun bundledSeedPackage_brandyUsesBilingualNameAndOnlyExactRecipeLine() {
        val library = loadBundledPayload().toDomainLibrary()
        val brandy = library.ingredientReferences.single { it.id == "ingredient-ref-brandy" }
        val line = library.recipes.flatMap { it.ingredients }
            .single { it.id == "f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-25" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.OTHER, brandy.category)
        assertEquals("brandy", brandy.nameEn)
        assertEquals("brandy", brandy.nameFr)
        assertEquals(listOf("eau-de-vie de vin"), brandy.aliasesFr)
        assertTrue(brandy.aliasesEn.isEmpty())
        assertNull(brandy.defaultDensity)
        assertTrue(brandy.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == brandy.id })

        assertEquals(brandy.id, line.ingredientRefId)
        assertEquals("1 tbsp brandy", line.originalText)
        assertEquals("brandy", line.ingredientName)
        assertEquals(1.0, line.quantity!!, 0.0)
        assertEquals("tbsp", line.unit)
        assertEquals("Chocolate frosting", line.group)
        assertTrue(line.substitutions.isEmpty())
        assertEquals(listOf(brandy.id), index.filter("brandy").map { it.id })
        assertEquals(listOf(brandy.id), index.filter("eau de vie de vin").map { it.id })
        assertTrue(index.filter("cognac").none { it.id == brandy.id })
        assertTrue(index.filter("armagnac").none { it.id == brandy.id })
    }

    @Test
    fun bundledSeedPackage_attiekeUsesOnlySourceBackedProductNamesAndStaysIdentityOnly() {
        val library = loadBundledPayload().toDomainLibrary()
        val attieke = library.ingredientReferences.single { it.id == "ingredient-ref-attieke" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.FLOUR_AND_STARCH, attieke.category)
        assertEquals("attiéké", attieke.nameEn)
        assertEquals("attiéké", attieke.nameFr)
        assertEquals(listOf("steamed cassava grits", "akyeke"), attieke.aliasesEn)
        assertTrue(attieke.aliasesFr.isEmpty())
        assertNull(attieke.defaultDensity)
        assertTrue(attieke.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == attieke.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == attieke.id })

        assertEquals(listOf(attieke.id), index.filter("attiéké").map { it.id })
        assertEquals(listOf(attieke.id), index.filter("attieke").map { it.id })
        assertEquals(listOf(attieke.id), index.filter("steamed cassava grits").map { it.id })
        assertEquals(listOf(attieke.id), index.filter("akyeke").map { it.id })
        assertTrue(index.filter("tapioca").none { it.id == attieke.id })
        assertTrue(index.filter("gari").none { it.id == attieke.id })
        assertTrue(index.filter("semolina").none { it.id == attieke.id })
    }

    @Test
    fun bundledSeedPackage_lafunStaysAnIdentityOnlyCassavaFlourProduct() {
        val library = loadBundledPayload().toDomainLibrary()
        val lafun = library.ingredientReferences.single { it.id == "ingredient-ref-lafun" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.FLOUR_AND_STARCH, lafun.category)
        assertEquals("lafun", lafun.nameEn)
        assertEquals("lafun", lafun.nameFr)
        assertTrue(lafun.aliasesEn.isEmpty())
        assertTrue(lafun.aliasesFr.isEmpty())
        assertNull(lafun.defaultDensity)
        assertTrue(lafun.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == lafun.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == lafun.id })

        assertEquals(listOf(lafun.id), index.filter("lafun").map { it.id })
        assertEquals(listOf("ingredient-ref-cassava-flour"), index.filter("cassava flour").map { it.id })
    }

    @Test
    fun bundledSeedPackage_pupuruAndKodoKeepTheirDistinctNamesAndProducts() {
        val library = loadBundledPayload().toDomainLibrary()
        val pupuru = library.ingredientReferences.single { it.id == "ingredient-ref-pupuru" }
        val kodo = library.ingredientReferences.single { it.id == "ingredient-ref-kodo-millet" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.FLOUR_AND_STARCH, pupuru.category)
        assertEquals("pupuru", pupuru.nameEn)
        assertEquals("pupuru", pupuru.nameFr)
        assertEquals(listOf("pupuru flour"), pupuru.aliasesEn)
        assertTrue(pupuru.aliasesFr.isEmpty())
        assertNull(pupuru.defaultDensity)
        assertTrue(pupuru.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == pupuru.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == pupuru.id })
        assertEquals(listOf(pupuru.id), index.filter("pupuru").map { it.id })
        assertEquals(listOf(pupuru.id), index.filter("pupuru flour").map { it.id })
        assertEquals(listOf("ingredient-ref-cassava-flour"), index.filter("cassava flour").map { it.id })
        assertTrue(index.filter("pukuru").none { it.id == pupuru.id })

        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, kodo.category)
        assertEquals("kodo millet", kodo.nameEn)
        assertEquals("kodo", kodo.nameFr)
        assertEquals(listOf("koda millet", "varagu", "arikelu", "kodra", "harka", "kodon"), kodo.aliasesEn)
        assertTrue(kodo.aliasesFr.isEmpty())
        assertNull(kodo.defaultDensity)
        assertTrue(kodo.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == kodo.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == kodo.id })
        assertEquals(setOf(kodo.id, "ingredient-ref-kodo-millet-flour"), index.filter("kodo millet").map { it.id }.toSet())
        assertEquals(listOf(kodo.id), index.filter("koda millet").map { it.id })
        assertEquals(setOf(kodo.id, "ingredient-ref-kodo-millet-flour"), index.filter("kodo").map { it.id }.toSet())
        assertTrue(index.filter("millet").map { it.id }.containsAll(listOf("ingredient-ref-millet", kodo.id)))
    }

    @Test
    fun bundledSeedPackage_bajraAliasesKeepPearlMilletGrainAndFlourDistinct() {
        val library = loadBundledPayload().toDomainLibrary()
        val grain = library.ingredientReferences.single { it.id == "ingredient-ref-pearl-millet" }
        val flour = library.ingredientReferences.single { it.id == "ingredient-ref-pearl-millet-flour" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(listOf("bajra", "bajri", "sajjalu", "kambu", "sajje"), grain.aliasesEn)
        assertTrue(grain.aliasesFr.isEmpty())
        assertEquals(listOf("bajra flour", "bajri flour", "sajjalu flour", "kambu flour", "sajje hittu"), flour.aliasesEn)
        assertEquals(listOf("farine de millet perlé"), flour.aliasesFr)
        assertNull(grain.defaultDensity)
        assertNull(flour.defaultDensity)
        assertTrue(grain.unitMappings.isEmpty())
        assertTrue(flour.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == grain.id || it.ingredientRefId == flour.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none {
            it.ingredientRefId == grain.id || it.ingredientRefId == flour.id
        })

        assertEquals(setOf(grain.id, flour.id), index.filter("bajra").map { it.id }.toSet())
        assertEquals(listOf(flour.id), index.filter("bajra flour").map { it.id })
        assertEquals(setOf(grain.id, flour.id), index.filter("millet perlé").map { it.id }.toSet())
    }

    @Test
    fun bundledSeedPackage_barleyFlakesRemainIdentityOnlyAndDistinctFromOtherBarleyProducts() {
        val library = loadBundledPayload().toDomainLibrary()
        val flakes = library.ingredientReferences.single { it.id == "ingredient-ref-barley-flakes" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, flakes.category)
        assertEquals("barley flakes", flakes.nameEn)
        assertEquals("flocons d'orge", flakes.nameFr)
        assertTrue(flakes.aliasesEn.isEmpty())
        assertTrue(flakes.aliasesFr.isEmpty())
        assertNull(flakes.defaultDensity)
        assertTrue(flakes.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == flakes.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == flakes.id })
        assertEquals(listOf(flakes.id), index.filter("barley flakes").map { it.id })
        assertEquals(listOf(flakes.id), index.filter("flocons d'orge").map { it.id })
        assertTrue(index.filter("hulled barley").none { it.id == flakes.id })
        assertTrue(index.filter("barley flour").none { it.id == flakes.id })
    }

    @Test
    fun bundledSeedPackage_ryeFlakesStayDistinctFromKernelsAndMilledRye() {
        val library = loadBundledPayload().toDomainLibrary()
        val flakes = library.ingredientReferences.single { it.id == "ingredient-ref-rye-flakes" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, flakes.category)
        assertEquals("rye flakes", flakes.nameEn)
        assertEquals("flocons de seigle", flakes.nameFr)
        assertTrue(flakes.aliasesEn.isEmpty())
        assertTrue(flakes.aliasesFr.isEmpty())
        assertNull(flakes.defaultDensity)
        assertTrue(flakes.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == flakes.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == flakes.id })
        assertEquals(listOf(flakes.id), index.filter("rye flakes").map { it.id })
        assertEquals(listOf(flakes.id), index.filter("flocons de seigle").map { it.id })
        assertTrue(index.filter("rye berries").none { it.id == flakes.id })
        assertTrue(index.filter("rye meal").none { it.id == flakes.id })
    }

    @Test
    fun bundledSeedPackage_wildRiceBlendStaysSeparateFromPureWildRice() {
        val library = loadBundledPayload().toDomainLibrary()
        val blend = library.ingredientReferences.single { it.id == "ingredient-ref-wild-rice-blend" }
        val wildRice = library.ingredientReferences.single { it.id == "ingredient-ref-wild-rice" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, blend.category)
        assertEquals("wild rice blend", blend.nameEn)
        assertEquals("mélange de riz sauvage", blend.nameFr)
        assertTrue(blend.aliasesEn.isEmpty())
        assertTrue(blend.aliasesFr.isEmpty())
        assertNull(blend.defaultDensity)
        assertTrue(blend.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == blend.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == blend.id })
        assertEquals(listOf(blend.id), index.filter("wild rice blend").map { it.id })
        assertEquals(listOf(blend.id), index.filter("mélange de riz sauvage").map { it.id })
        assertEquals(
            setOf(wildRice.id, blend.id, "ingredient-ref-puffed-wild-rice", "ingredient-ref-wild-rice-flour"),
            index.filter("wild rice").map { it.id }.toSet()
        )
        assertEquals(
            setOf(wildRice.id, blend.id, "ingredient-ref-puffed-wild-rice", "ingredient-ref-wild-rice-flour"),
            index.filter("riz sauvage").map { it.id }.toSet()
        )
    }

    @Test
    fun bundledSeedPackage_wholeBarleyFlourKeepsItsGradeAndT150OutOfAliases() {
        val library = loadBundledPayload().toDomainLibrary()
        val wholeFlour = library.ingredientReferences.single { it.id == "ingredient-ref-whole-barley-flour" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.FLOUR_AND_STARCH, wholeFlour.category)
        assertEquals("whole barley flour", wholeFlour.nameEn)
        assertEquals("farine d'orge entière", wholeFlour.nameFr)
        assertTrue(wholeFlour.aliasesEn.isEmpty())
        assertTrue(wholeFlour.aliasesFr.isEmpty())
        assertNull(wholeFlour.defaultDensity)
        assertTrue(wholeFlour.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == wholeFlour.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == wholeFlour.id })
        assertEquals(listOf(wholeFlour.id), index.filter("whole barley flour").map { it.id })
        assertEquals(listOf(wholeFlour.id), index.filter("farine d'orge entière").map { it.id })
        assertEquals(listOf("ingredient-ref-french-type-150-flour"), index.filter("T150").map { it.id })
    }

    @Test
    fun bundledSeedPackage_sambalOelekUsesQuebecNameWithoutBroadFamilyAliases() {
        val library = loadBundledPayload().toDomainLibrary()
        val sambal = library.ingredientReferences.single { it.id == "ingredient-ref-sambal-oelek" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, sambal.category)
        assertEquals("sambal oelek", sambal.nameEn)
        assertEquals("sambal oelek", sambal.nameFr)
        assertEquals(listOf("sambal ulek"), sambal.aliasesEn)
        assertEquals(listOf("sambal ulek"), sambal.aliasesFr)
        assertNull(sambal.defaultDensity)
        assertTrue(sambal.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == sambal.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == sambal.id })
        assertEquals(listOf(sambal.id), index.filter("sambal oelek").map { it.id })
        assertEquals(listOf(sambal.id), index.filter("sambal ulek").map { it.id })
    }

    @Test
    fun bundledSeedPackage_sambalMatahKeepsItsBorrowedBilingualNameAndNoBroadAliases() {
        val library = loadBundledPayload().toDomainLibrary()
        val matah = library.ingredientReferences.single { it.id == "ingredient-ref-sambal-matah" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, matah.category)
        assertEquals("sambal matah", matah.nameEn)
        assertEquals("sambal matah", matah.nameFr)
        assertTrue(matah.aliasesEn.isEmpty())
        assertTrue(matah.aliasesFr.isEmpty())
        assertNull(matah.defaultDensity)
        assertTrue(matah.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == matah.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == matah.id })
        assertEquals(listOf(matah.id), index.filter("sambal matah").map { it.id })
        assertEquals(listOf("ingredient-ref-sambal-oelek"), index.filter("sambal ulek").map { it.id })
    }

    @Test
    fun bundledSeedPackage_chunjangStaysSeparateFromPreparedBlackBeanSauce() {
        val library = loadBundledPayload().toDomainLibrary()
        val chunjang = library.ingredientReferences.single { it.id == "ingredient-ref-chunjang" }
        val blackBeanSauce = library.ingredientReferences.single { it.id == "ingredient-ref-black-bean-sauce" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, chunjang.category)
        assertEquals("chunjang", chunjang.nameEn)
        assertEquals("chunjang", chunjang.nameFr)
        assertTrue(chunjang.aliasesEn.isEmpty())
        assertTrue(chunjang.aliasesFr.isEmpty())
        assertNull(chunjang.defaultDensity)
        assertTrue(chunjang.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == chunjang.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == chunjang.id })
        assertEquals(listOf(chunjang.id), index.filter("chunjang").map { it.id })
        assertEquals(listOf(blackBeanSauce.id), index.filter("black bean sauce").map { it.id })
        assertTrue(index.filter("black bean paste").none { it.id == chunjang.id })
    }

    @Test
    fun bundledSeedPackage_lizanoSaucePreservesProductAliasesWithoutNumericData() {
        val library = loadBundledPayload().toDomainLibrary()
        val lizano = library.ingredientReferences.single { it.id == "ingredient-ref-lizano-sauce" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.SAUCE_AND_CONDIMENT, lizano.category)
        assertEquals("Lizano sauce", lizano.nameEn)
        assertEquals("sauce Lizano", lizano.nameFr)
        assertEquals(listOf("Salsa Lizano", "Lizano Salsa"), lizano.aliasesEn)
        assertEquals(listOf("Salsa Lizano"), lizano.aliasesFr)
        assertNull(lizano.defaultDensity)
        assertTrue(lizano.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == lizano.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == lizano.id })
        assertEquals(listOf(lizano.id), index.filter("Salsa Lizano").map { it.id })
        assertEquals(
            setOf(lizano.id, "ingredient-ref-salsa-macha"),
            index.filter("salsa").map { it.id }.toSet()
        )
        assertTrue(library.ingredientReferences.none { it.id == "ingredient-ref-salsa" })
    }

    @Test
    fun bundledSeedPackage_ryeBerriesRemainSeparateFromBroadRyeAndUseProvisionalFrenchName() {
        val library = loadBundledPayload().toDomainLibrary()
        val berries = library.ingredientReferences.single { it.id == "ingredient-ref-rye-berries" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, berries.category)
        assertEquals("rye berries", berries.nameEn)
        assertEquals("grains de seigle", berries.nameFr)
        assertEquals(listOf("rye kernels"), berries.aliasesEn)
        assertTrue(berries.aliasesFr.isEmpty())
        assertNull(berries.defaultDensity)
        assertTrue(berries.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == berries.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == berries.id })
        assertEquals(listOf(berries.id), index.filter("rye berries").map { it.id })
        assertEquals(listOf(berries.id), index.filter("rye kernels").map { it.id })
        assertEquals(listOf(berries.id), index.filter("grains de seigle").map { it.id })
        assertTrue(index.filter("rye flour").none { it.id == berries.id })
    }

    @Test
    fun bundledSeedPackage_keepsWhiteWholeWheatSeparateFromAllPurposeFlour() {
        val references = loadBundledPayload().library.ingredientReferences.associateBy { it.id }
        val whiteWholeWheat = references.getValue("ingredient-ref-white-whole-wheat-flour")
        val allPurpose = references.getValue("ingredient-ref-all-purpose-flour")

        assertEquals("farine intégrale de blé blanc", whiteWholeWheat.nameFr)
        assertEquals(listOf("hard white whole wheat flour"), whiteWholeWheat.aliasesEn)
        assertTrue(whiteWholeWheat.aliasesFr.isEmpty())
        assertFalse(allPurpose.aliasesFr.contains("farine blanche"))
        assertFalse(allPurpose.aliasesFr.contains("farine tout usage non blanchie"))
    }

    @Test
    fun bundledSeedPackage_keepsNutSeedButtersAndPreparedFillingsIdentityOnly() {
        val references = loadBundledPayload().library.ingredientReferences.associateBy { it.id }
        val distinctProductIds = listOf(
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
        )
        distinctProductIds.forEach { id ->
            val reference = references.getValue(id)
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
        }

        assertEquals("beurre de noix de cajou", references.getValue("ingredient-ref-cashew-butter").nameFr)
        assertEquals(listOf("beurre de cajous"), references.getValue("ingredient-ref-cashew-butter").aliasesFr)
        assertEquals("purée de marrons", references.getValue("ingredient-ref-chestnut-puree").nameFr)
        assertEquals(
            "pâte à tartiner aux marrons sucrée",
            references.getValue("ingredient-ref-sweetened-chestnut-spread").nameFr,
        )
        assertEquals("garniture aux graines de pavot", references.getValue("ingredient-ref-poppy-seed-filling").nameFr)
    }

    @Test
    fun bundledSeedPackage_keepsSouthAsianIdentitiesIdentityOnly() {
        val library = loadBundledPayload().library
        val references = library.ingredientReferences.associateBy { it.id }
        val identityOnlyIds = listOf(
            "ingredient-ref-cumin-seeds",
            "ingredient-ref-curry-leaves",
            "ingredient-ref-fenugreek-seeds",
            "ingredient-ref-ajwain",
            "ingredient-ref-nigella-seeds",
            "ingredient-ref-large-cardamom",
            "ingredient-ref-ghee",
            "ingredient-ref-mustard-oil",
            "ingredient-ref-finger-millet-flour",
            "ingredient-ref-panch-phoron",
            "ingredient-ref-rihaakuru",
            "ingredient-ref-timur-pepper",
        )
        identityOnlyIds.forEach { id ->
            val reference = references.getValue(id)
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
        }
        assertEquals("graines de cumin", references.getValue("ingredient-ref-cumin-seeds").nameFr)
        assertEquals("feuilles de cari", references.getValue("ingredient-ref-curry-leaves").nameFr)
        assertEquals("graines de fenugrec", references.getValue("ingredient-ref-fenugreek-seeds").nameFr)
        assertEquals("graines d’ajwain", references.getValue("ingredient-ref-ajwain").nameFr)
        assertEquals("graines de nigelle", references.getValue("ingredient-ref-nigella-seeds").nameFr)
        assertEquals("cardamome noire", references.getValue("ingredient-ref-large-cardamom").nameFr)
        assertEquals("beurre de ghee", references.getValue("ingredient-ref-ghee").nameFr)
        assertEquals("huile de moutarde", references.getValue("ingredient-ref-mustard-oil").nameFr)
        assertEquals("farine de ragi", references.getValue("ingredient-ref-finger-millet-flour").nameFr)
        assertEquals("rihaakuru", references.getValue("ingredient-ref-rihaakuru").nameFr)
        val expectedFormsByReference = mapOf(
            "ingredient-ref-curry-leaves" to setOf("ingredient-form-curry-leaves-dried"),
        )
        identityOnlyIds.forEach { id ->
            val expectedFormIds = expectedFormsByReference[id].orEmpty()
            assertEquals(
                "$id form boundary",
                expectedFormIds,
                library.ingredientForms.filter { it.ingredientRefId == id }.map { it.id }.toSet(),
            )
        }
        val driedCurryLeaves = library.ingredientForms.single { it.id == "ingredient-form-curry-leaves-dried" }
        assertEquals("dried curry leaves", driedCurryLeaves.labelEn)
        assertEquals("feuilles de cari séchées", driedCurryLeaves.labelFr)
        assertNull(driedCurryLeaves.densityGPerMl)
    }

    @Test
    fun bundledSeedPackage_ingredientReferenceAliasesRemainNormalizedAndUnambiguous() {
        val references = loadBundledPayload().library.ingredientReferences

        val keyOwners = linkedMapOf<String, MutableSet<String>>()
        references.forEach { reference ->
            val canonicalFr = reference.nameFr.normalizedKey()
            val canonicalEn = reference.nameEn.normalizedKey()

            assertTrue(reference.aliasesFr == reference.aliasesFr.map(String::trim).filter(String::isNotEmpty).distinct())
            assertTrue(reference.aliasesEn == reference.aliasesEn.map(String::trim).filter(String::isNotEmpty).distinct())
            assertFalse(reference.aliasesFr.any { it.normalizedKey() == canonicalFr })
            assertFalse(reference.aliasesEn.any { it.normalizedKey() == canonicalEn })
            assertFalse(reference.aliasesFr.any { canonicalFr != canonicalEn && it.normalizedKey() == canonicalEn })
            assertFalse(reference.aliasesEn.any { canonicalFr != canonicalEn && it.normalizedKey() == canonicalFr })

            sequenceOf(reference.nameFr, reference.nameEn)
                .plus(reference.aliasesFr.asSequence())
                .plus(reference.aliasesEn.asSequence())
                .map(String::normalizedKey)
                .forEach { key -> keyOwners.getOrPut(key) { linkedSetOf() }.add(reference.id) }
        }

        assertTrue(keyOwners.none { (_, owners) -> owners.size > 1 })
    }

    @Test
    fun bundledSeedPackage_crossFileReferencesRemainValid() {
        val library = loadBundledPayload().library

        assertUnique(library.recipes.map { it.id }, "recipe ids")
        assertUnique(library.ingredientReferences.map { it.id }, "ingredient reference ids")
        assertUnique(library.ingredientForms.map { it.id }, "ingredient form ids")
        assertUnique(library.substitutionRules.map { it.id }, "substitution rule ids")
        assertUnique(library.contextualSubstitutionRules.map { it.id }, "contextual substitution rule ids")
        assertUnique(library.tags.map { it.id }, "tag ids")
        assertUnique(library.tags.map { it.slug }, "tag slugs")
        assertUnique(library.collections.map { it.id }, "collection ids")
        assertUnique(library.units.map { it.unitId }, "unit ids")

        val recipeIds = library.recipes.map { it.id }.toSet()
        val ingredientReferenceIds = library.ingredientReferences.map { it.id }.toSet()
        val ingredientFormIds = library.ingredientForms.map { it.id }.toSet()
        val substitutionRuleIds = library.substitutionRules.map { it.id }.toSet()
        val contextualRuleIds = library.contextualSubstitutionRules.map { it.id }.toSet()
        val tagIds = library.tags.map { it.id }.toSet()
        val collectionIds = library.collections.map { it.id }.toSet()
        val unitIds = library.units.map { it.unitId }.toSet()

        library.units.forEach { unit ->
            assertTrue(unit.baseUnitId == null || unit.baseUnitId in unitIds)
        }

        library.ingredientReferences.forEach { reference ->
            reference.unitMappings.forEach { mapping ->
                assertTrue(mapping.toUnit in unitIds)
            }
        }

        library.ingredientForms.forEach { form ->
            assertTrue(form.ingredientRefId in ingredientReferenceIds)
            assertTrue(form.labelFr.isNotBlank())
            assertTrue(form.labelEn.isNotBlank())
        }

        library.substitutionRules.forEach { rule ->
            assertTrue(rule.fromFormId in ingredientFormIds)
            assertTrue(rule.toFormId in ingredientFormIds)
            if (rule.riskLevel == "high_risk") {
                assertTrue(!rule.warningTextFr.isNullOrBlank())
                assertTrue(!rule.warningTextEn.isNullOrBlank())
            }
        }

        library.contextualSubstitutionRules.forEach { rule ->
            assertTrue(rule.fromIngredientRefId in ingredientReferenceIds)
            assertTrue(rule.toIngredientRefId in ingredientReferenceIds)
            if (rule.riskLevel == "high_risk") {
                assertTrue(!rule.warningTextFr.isNullOrBlank())
                assertTrue(!rule.warningTextEn.isNullOrBlank())
            }
        }

        library.collections.forEach { collection ->
            assertTrue(collection.recipeIds.all { it in recipeIds })
        }

        library.recipes.forEach { recipe ->
            val photoIds = recipe.photos.map { it.id }
            val attachmentIds = recipe.attachments.map { it.id }
            val ingredientIds = recipe.ingredients.map { it.id }

            assertUnique(photoIds, "photo ids for ${recipe.id}")
            assertUnique(attachmentIds, "attachment ids for ${recipe.id}")
            assertUnique(ingredientIds, "ingredient line ids for ${recipe.id}")
            assertTrue(recipe.mainPhotoId == null || recipe.mainPhotoId in photoIds)
            assertTrue(recipe.tags.all { tagId -> tagId in tagIds })
            assertTrue(recipe.collections.all { collectionId -> collectionId in collectionIds })
            assertTrue(recipe.photos.all { photo -> photo.relativePath.startsWith("photos/") })
            assertTrue(recipe.attachments.all { attachment -> attachment.relativePath.startsWith("attachments/") })

            recipe.ingredients.forEach { ingredient ->
                assertTrue(ingredient.ingredientRefId == null || ingredient.ingredientRefId in ingredientReferenceIds)
                ingredient.ingredientFormId?.let { formId ->
                    val form = library.ingredientForms.singleOrNull { it.id == formId }
                    assertTrue(form != null)
                    assertEquals(ingredient.ingredientRefId, form?.ingredientRefId)
                }
                ingredient.substitutions.forEach { substitution ->
                    assertEquals(ingredient.id, substitution.ingredientLineId)
                    assertTrue(substitution.substitutionRuleId == null || substitution.substitutionRuleId in substitutionRuleIds)
                    assertTrue(
                        substitution.contextualSubstitutionRuleId == null ||
                            substitution.contextualSubstitutionRuleId in contextualRuleIds
                    )
                }
            }
        }
    }

    @Test
    fun bundledSeedPackage_babySpinachIsAnExplicitFormOfSpinach() {
        val library = loadBundledPayload().toDomainLibrary()
        val spinach = library.ingredientReferences.single { it.id == "ingredient-ref-baby-spinach" }
        val babyLeaves = library.ingredientForms.single { it.id == "ingredient-form-spinach-baby-leaves" }
        val recipeLine = library.recipes.flatMap { it.ingredients }
            .single { it.originalText == "3 cups baby spinach" }

        assertEquals("spinach", spinach.nameEn)
        assertEquals("épinard", spinach.nameFr)
        assertEquals(spinach.id, babyLeaves.ingredientRefId)
        assertEquals("baby spinach", babyLeaves.labelEn)
        assertEquals("jeunes épinards", babyLeaves.labelFr)
        assertEquals(spinach.id, recipeLine.ingredientRefId)
        assertEquals(babyLeaves.id, recipeLine.ingredientFormId)
        assertEquals(null, babyLeaves.densityGPerMl)
    }

    @Test
    fun bundledSeedPackage_cannedDicedTomatoesStayAFormOfTomatoesForClassicChili() {
        val library = loadBundledPayload().toDomainLibrary()
        val tomatoes = library.ingredientReferences.single { it.id == "ingredient-ref-tomatoes" }
        val cannedDiced = library.ingredientForms.single { it.id == "ingredient-form-tomatoes-canned-diced" }
        val recipeLine = library.recipes.flatMap { it.ingredients }
            .single { it.originalText == "798 ml canned diced tomatoes" }

        assertEquals("tomatoes", tomatoes.nameEn)
        assertEquals("tomates", tomatoes.nameFr)
        assertEquals(tomatoes.id, cannedDiced.ingredientRefId)
        assertEquals("canned diced tomatoes", cannedDiced.labelEn)
        assertEquals("tomates en dés en conserve", cannedDiced.labelFr)
        assertEquals(tomatoes.id, recipeLine.ingredientRefId)
        assertEquals(cannedDiced.id, recipeLine.ingredientFormId)
        assertEquals(798.0, recipeLine.quantity!!, 0.0)
        assertEquals("ml", recipeLine.unit)
        assertEquals("canned, diced", recipeLine.preparation?.en)
        assertEquals(null, cannedDiced.densityGPerMl)
    }

    @Test
    fun bundledGreekStyleYogurtKeepsPlainProductFormSeparateFromGenericPlainYogurt() {
        val library = loadBundledPayload().toDomainLibrary()
        val greekId = "ingredient-ref-greek-yogurt"
        val greek = library.ingredientReferences.single { it.id == greekId }
        val genericPlain = library.ingredientReferences.single { it.id == "ingredient-ref-plain-yogurt" }
        val plainForm = library.ingredientForms.single { it.id == "ingredient-form-greek-yogurt-plain" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val explicitGreekLines = library.recipes.flatMap { it.ingredients }
            .filter { it.originalText == "1/4 cup plain Greek yogurt" ||
                it.originalText == "1/2 cup plain Greek yogurt" ||
                it.originalText == "1 1/2 cups plain Greek yogurt" }

        assertEquals("Greek-style yogurt", greek.nameEn)
        assertEquals("yogourt grec", greek.nameFr)
        assertEquals(listOf("Greek yogurt", "Greek yoghurt", "Greek-style yoghurt"), greek.aliasesEn)
        assertEquals("plain", plainForm.formCode)
        assertEquals("plain", plainForm.prepState)
        assertEquals("plain Greek-style yogurt", plainForm.labelEn)
        assertEquals("yogourt grec nature", plainForm.labelFr)
        assertEquals(listOf("plain Greek yogurt"), plainForm.matchTermsEn)
        assertEquals(null, plainForm.densityGPerMl)
        assertEquals(greekId, plainForm.ingredientRefId)
        assertTrue(genericPlain.aliasesEn.none { it.contains("Greek", ignoreCase = true) })

        assertEquals(listOf(greekId), index.filter("Greek yogurt").map { it.id })
        assertEquals(listOf(greekId), index.filter("yogourt grec").map { it.id })
        assertEquals(listOf(greekId), index.filter("yogourt grec nature").map { it.id })
        assertEquals(listOf(greekId), index.filter("plain Greek yogurt").map { it.id })
        assertEquals(plainForm.id, index.matchFormHint(greekId, "yogourt grec nature")?.id)
        assertEquals(plainForm.id, index.matchFormHint(greekId, "plain Greek yogurt")?.id)
        assertEquals(listOf(genericPlain.id), index.filter("plain yogurt").map { it.id })
        assertEquals(4, explicitGreekLines.size)
        assertTrue(explicitGreekLines.all { it.ingredientRefId == greekId })
        assertTrue(explicitGreekLines.all { it.ingredientFormId == plainForm.id })
        assertTrue(explicitGreekLines.all { it.ingredientName == "Greek-style yogurt" })
        assertTrue(explicitGreekLines.all { it.preparation?.en == "plain" && it.preparation.fr == "nature" })

        val optionalLine = library.recipes.flatMap { it.ingredients }
            .single { it.originalText == "75 g sour cream or plain yogurt, room temperature" }
        assertEquals(null, optionalLine.ingredientRefId)
        assertEquals(null, optionalLine.ingredientFormId)
    }

    @Test
    fun bundledDairyPowdersKeepMilkFatClassAndProductBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val wholeMilk = library.ingredientReferences.single { it.id == "ingredient-ref-milk" }
        val skimMilk = library.ingredientReferences.single { it.id == "ingredient-ref-skim-milk" }
        val buttermilkPowder = library.ingredientReferences.single { it.id == "ingredient-ref-buttermilk-powder" }
        val wheyPowder = library.ingredientReferences.single { it.id == "ingredient-ref-whey-powder" }
        val wholePowder = library.ingredientForms.single { it.id == "ingredient-form-whole-milk-powder" }
        val skimPowder = library.ingredientForms.single { it.id == "ingredient-form-skim-milk-powder" }

        assertEquals(wholeMilk.id, wholePowder.ingredientRefId)
        assertEquals("whole milk powder", wholePowder.labelEn)
        assertEquals("lait entier en poudre", wholePowder.labelFr)
        assertEquals(listOf("powdered whole milk", "dried whole milk"), wholePowder.matchTermsEn)
        assertEquals(listOf("poudre de lait entier"), wholePowder.matchTermsFr)
        assertEquals(null, wholePowder.densityGPerMl)
        assertEquals(skimMilk.id, skimPowder.ingredientRefId)
        assertEquals("skim milk powder", skimPowder.labelEn)
        assertEquals("lait écrémé en poudre", skimPowder.labelFr)
        assertEquals(null, skimPowder.densityGPerMl)
        assertEquals(listOf(wholeMilk.id), index.filter("whole milk powder").map { it.id })
        assertEquals(wholePowder.id, index.matchFormHint(wholeMilk.id, "whole milk powder")?.id)
        assertEquals(listOf(wholeMilk.id), index.filter("lait entier en poudre").map { it.id })
        assertEquals(wholePowder.id, index.matchFormHint(wholeMilk.id, "lait entier en poudre")?.id)
        assertEquals(listOf(skimMilk.id), index.filter("skim milk powder").map { it.id })
        assertEquals(skimPowder.id, index.matchFormHint(skimMilk.id, "skim milk powder")?.id)
        assertNull(index.matchFormHint(wholeMilk.id, "milk powder"))
        assertNull(index.matchFormHint(skimMilk.id, "milk powder"))

        assertEquals("buttermilk powder", buttermilkPowder.nameEn)
        assertEquals("babeurre en poudre", buttermilkPowder.nameFr)
        assertEquals(listOf("powdered buttermilk"), buttermilkPowder.aliasesEn)
        assertEquals(listOf("poudre de babeurre"), buttermilkPowder.aliasesFr)
        assertEquals(listOf(buttermilkPowder.id), index.filter("powdered buttermilk").map { it.id })
        assertEquals("whey powder", wheyPowder.nameEn)
        assertEquals("lactosérum en poudre", wheyPowder.nameFr)
        assertEquals(listOf("petit-lait en poudre"), wheyPowder.aliasesFr)
        assertEquals(listOf(wheyPowder.id), index.filter("whey powder").map { it.id })
        assertEquals(listOf(wheyPowder.id), index.filter("lactosérum en poudre").map { it.id })
        assertTrue(listOf(buttermilkPowder.id, wheyPowder.id).all { id ->
            library.ingredientForms.none { it.ingredientRefId == id }
        })
        assertNull(buttermilkPowder.defaultDensity)
        assertTrue(buttermilkPowder.unitMappings.isEmpty())
        assertNull(wheyPowder.defaultDensity)
        assertTrue(wheyPowder.unitMappings.isEmpty())
        assertTrue(index.filter("milk solids").isEmpty())
        assertTrue(index.filter("dairy concentrate").isEmpty())
        assertTrue(library.recipes.flatMap { it.ingredients }.none { line ->
            line.ingredientRefId in setOf(buttermilkPowder.id, wheyPowder.id) ||
                line.ingredientFormId in setOf(wholePowder.id, skimPowder.id)
        })
    }

    @Test
    fun bundledSweetenersKeepStandardizedProductBoundariesAndUnknownConversions() {
        val library = loadBundledPayload().toDomainLibrary()
        val references = library.ingredientReferences.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val identityIds = setOf(
            "ingredient-ref-dextrose",
            "ingredient-ref-erythritol",
            "ingredient-ref-fondant-sugar",
            "ingredient-ref-fructose",
            "ingredient-ref-fructose-syrup",
            "ingredient-ref-glucose-solids",
            "ingredient-ref-invert-sugar",
            "ingredient-ref-isomalt",
            "ingredient-ref-liquid-invert-sugar",
            "ingredient-ref-monk-fruit-extract",
            "ingredient-ref-stevia-leaves",
            "ingredient-ref-steviol-glycosides",
            "ingredient-ref-xylitol",
        )
        val dextrose = references.getValue("ingredient-ref-dextrose")
        val anhydrous = library.ingredientForms.single { it.id == "ingredient-form-dextrose-anhydrous" }
        val monohydrate = library.ingredientForms.single { it.id == "ingredient-form-dextrose-monohydrate" }

        assertEquals(identityIds, references.keys.intersect(identityIds))
        identityIds.forEach { id ->
            val reference = references.getValue(id)
            assertEquals(IngredientCategory.SUGAR_AND_SWEETENER, reference.category)
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
        }
        assertEquals("D-glucose", dextrose.aliasesEn.single())
        assertEquals(dextrose.id, anhydrous.ingredientRefId)
        assertEquals("anhydrous dextrose", anhydrous.labelEn)
        assertEquals("dextrose anhydre", anhydrous.labelFr)
        assertEquals("monohydrate", monohydrate.formCode)
        assertEquals(dextrose.id, monohydrate.ingredientRefId)
        assertNull(anhydrous.densityGPerMl)
        assertNull(monohydrate.densityGPerMl)
        assertEquals(listOf(dextrose.id), index.filter("D-glucose").map { it.id })
        assertEquals(anhydrous.id, index.matchFormHint(dextrose.id, "anhydrous dextrose")?.id)
        assertEquals(monohydrate.id, index.matchFormHint(dextrose.id, "dextrose monohydrate")?.id)

        assertEquals("sucre à glacer fondant", references.getValue("ingredient-ref-fondant-sugar").nameFr)
        assertEquals("icing sugar", references.getValue("ingredient-ref-icing-sugar").nameEn)
        assertTrue(references.getValue("ingredient-ref-fondant-sugar").aliasesEn.isEmpty())
        assertEquals("sucre inverti", references.getValue("ingredient-ref-invert-sugar").nameFr)
        assertEquals("sucre inverti liquide", references.getValue("ingredient-ref-liquid-invert-sugar").nameFr)
        assertEquals("solides de glucose", references.getValue("ingredient-ref-glucose-solids").nameFr)
        assertEquals("sirop de glucose", references.getValue("ingredient-ref-glucose-syrup").nameFr)
        assertEquals("glycosides de stéviol", references.getValue("ingredient-ref-steviol-glycosides").nameFr)
        assertEquals("extrait de fruit de moines", references.getValue("ingredient-ref-monk-fruit-extract").nameFr)

        assertTrue(
            index.filter("invert sugar").map { it.id }.containsAll(
                listOf("ingredient-ref-invert-sugar", "ingredient-ref-liquid-invert-sugar"),
            ),
        )
        assertEquals(listOf("ingredient-ref-liquid-invert-sugar"), index.filter("liquid invert sugar").map { it.id })
        assertEquals(listOf("ingredient-ref-glucose-solids"), index.filter("dried glucose syrup").map { it.id })
        assertEquals(listOf("ingredient-ref-fructose-syrup"), index.filter("sirop de fructose").map { it.id })
        assertTrue(index.filter("allulose").isEmpty())
        assertTrue(index.filter("stevia extract").isEmpty())
        assertEquals(
            listOf("ingredient-ref-monk-fruit-juice-concentrate"),
            index.filter("monk fruit juice concentrate").map { it.id },
        )
        assertTrue(library.ingredientForms.none { it.ingredientRefId in identityIds - dextrose.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { line ->
            line.ingredientRefId in identityIds || line.ingredientFormId in setOf(anhydrous.id, monohydrate.id)
        })
    }

    @Test
    fun fineCrystalSugarUsesGranulatedIdentityAndKeepsIcingSugarSeparate() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val granulated = library.ingredientReferences.single { it.id == "ingredient-ref-granulated-sugar" }
        val icing = library.ingredientReferences.single { it.id == "ingredient-ref-icing-sugar" }
        val fine = library.ingredientForms.single { it.id == "ingredient-form-granulated-sugar-fine-grain" }

        assertEquals("granulated sugar", granulated.nameEn)
        assertEquals("sucre granulé", granulated.nameFr)
        assertEquals(granulated.id, fine.ingredientRefId)
        assertEquals("fine_grain", fine.formCode)
        assertEquals("superfine granulated sugar", fine.labelEn)
        assertEquals("sucre très fin", fine.labelFr)
        assertNull(fine.densityGPerMl)
        assertNull(granulated.defaultDensity)
        assertTrue(granulated.unitMappings.isEmpty())

        listOf("caster sugar", "castor sugar", "superfine sugar", "super-fine sugar", "sucre semoule", "sucre-semoule", "sucre superfin")
            .forEach { query ->
                assertEquals(query, listOf(granulated.id), index.filter(query).map { it.id })
                assertEquals(query, fine.id, index.matchFormHint(granulated.id, query)?.id)
            }

        assertEquals(listOf(icing.id), index.filter("powdered sugar").map { it.id })
        assertEquals(listOf(icing.id), index.filter("sucre en poudre").map { it.id })
        assertNull(index.matchFormHint(granulated.id, "powdered sugar"))
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientFormId == fine.id })
    }

    @Test
    fun brownSugarGradesAndPearlSugarKeepTheirCatalogBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val references = library.ingredientReferences.associateBy { it.id }
        val forms = library.ingredientForms.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        val brown = references.getValue("ingredient-ref-brown-sugar")
        val light = forms.getValue("ingredient-form-brown-sugar-light")
        val dark = forms.getValue("ingredient-form-brown-sugar-dark")
        assertEquals(listOf("cassonade bien tassée", "sucre brun tassé"), brown.aliasesFr)
        assertTrue(brown.aliasesEn.isEmpty())
        assertEquals(brown.id, light.ingredientRefId)
        assertEquals("light_brown", light.formCode)
        assertEquals("light brown sugar", light.labelEn)
        assertEquals("cassonade claire", light.labelFr)
        assertEquals(brown.id, dark.ingredientRefId)
        assertEquals("dark_brown", dark.formCode)
        assertEquals("dark brown sugar", dark.labelEn)
        assertEquals("cassonade foncée", dark.labelFr)
        assertNull(light.densityGPerMl)
        assertNull(dark.densityGPerMl)
        listOf(
            "light brown sugar", "packed light brown sugar", "light brown sugar, packed",
            "cassonade claire", "sucre brun clair",
        )
            .forEach { query ->
                assertEquals(query, listOf(brown.id), index.filter(query).map { it.id })
                assertEquals(query, light.id, index.matchFormHint(brown.id, query)?.id)
            }
        listOf("dark brown sugar", "cassonade foncée").forEach { query ->
            assertEquals(query, listOf(brown.id), index.filter(query).map { it.id })
            assertEquals(query, dark.id, index.matchFormHint(brown.id, query)?.id)
        }
        assertNull(index.matchFormHint(brown.id, "cassonade bien tassée"))

        val pearlSugar = references.getValue("ingredient-ref-pearl-sugar")
        val sugarPearls = references.getValue("ingredient-ref-sugar-pearls")
        val sprinkles = references.getValue("ingredient-ref-sprinkles")
        assertEquals("pearl sugar", pearlSugar.nameEn)
        assertEquals("sucre perlé", pearlSugar.nameFr)
        assertEquals(listOf("sanding sugar", "decorating sugar"), pearlSugar.aliasesEn)
        assertEquals(listOf("sucre décoratif"), pearlSugar.aliasesFr)
        assertNull(pearlSugar.defaultDensity)
        assertTrue(pearlSugar.unitMappings.isEmpty())
        assertEquals(listOf(pearlSugar.id), index.filter("sanding sugar").map { it.id })
        assertEquals(listOf(pearlSugar.id), index.filter("decorating sugar").map { it.id })
        assertEquals(listOf(pearlSugar.id), index.filter("sucre perlé").map { it.id })
        assertEquals(listOf(sugarPearls.id), index.filter("sugar pearls").map { it.id })
        assertEquals(listOf(sprinkles.id), index.filter("sprinkles").map { it.id })

        val recipeRows = library.recipes.flatMap { it.ingredients }.associateBy { it.id }
        val linkedLightRows = recipeRows.values
            .filter { it.ingredientFormId == light.id }
            .map { it.id }
            .toSet()
        assertEquals(
            setOf(
                "f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-10",
                "ad2f1317-aa4d-4d1e-9aec-0d70a72228af-ingredient-5",
                "4207e09a-429f-437f-b7bd-14e862d6d696-ingredient-9",
                "f6d10ccb-a696-4898-813b-a5a01e7f82ce-ingredient-1",
                "f6d10ccb-a696-4898-813b-a5a01e7f82ce-ingredient-16",
                "c97910fb-2301-40c7-8019-433bb361c44c-ingredient-4",
                "d73d6bff-fc0c-4b79-a607-441e546d32ad-ingredient-7",
            ),
            linkedLightRows,
        )
        assertNull(recipeRows.getValue("e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-15").ingredientFormId)
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == pearlSugar.id })
    }

    @Test
    fun residualLeafyGreensKeepPlantPartsDistinctWithoutGeneralizedConversions() {
        val library = loadBundledPayload().toDomainLibrary()
        val references = library.ingredientReferences.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val leafIds = setOf(
            "ingredient-ref-amaranth-greens",
            "ingredient-ref-sweet-potato-leaves",
            "ingredient-ref-taro-leaves",
            "ingredient-ref-fenugreek-leaves",
            "ingredient-ref-moringa-leaves",
        )
        val searchExpectations = listOf(
            "feuilles d'amarante" to "ingredient-ref-amaranth-greens",
            "vegetable amaranth" to "ingredient-ref-amaranth-greens",
            "sweet potato leaves" to "ingredient-ref-sweet-potato-leaves",
            "sweetpotato greens" to "ingredient-ref-sweet-potato-leaves",
            "taro leaves" to "ingredient-ref-taro-leaves",
            "luau leaves" to "ingredient-ref-taro-leaves",
            "feuilles de fenugrec" to "ingredient-ref-fenugreek-leaves",
            "methi leaves" to "ingredient-ref-fenugreek-leaves",
            "kasuri methi" to "ingredient-ref-fenugreek-leaves",
            "moringa leaves" to "ingredient-ref-moringa-leaves",
            "balunggay leaves" to "ingredient-ref-moringa-leaves",
            "kalamungay leaves" to "ingredient-ref-moringa-leaves",
        )

        assertEquals(leafIds, references.keys.intersect(leafIds))
        leafIds.forEach { id ->
            val reference = references.getValue(id)
            assertEquals(IngredientCategory.VEGETABLE_AND_AROMATIC, reference.category)
            assertNull("$id must not infer a density", reference.defaultDensity)
            assertTrue("$id must not infer unit mappings", reference.unitMappings.isEmpty())
            val expectedFormIds = if (id == "ingredient-ref-fenugreek-leaves") {
                setOf("ingredient-form-fenugreek-leaves-dried", "ingredient-form-fenugreek-leaves-fresh")
            } else {
                emptySet()
            }
            assertEquals(
                "$id product-state form boundary",
                expectedFormIds,
                library.ingredientForms.filter { it.ingredientRefId == id }.map { it.id }.toSet(),
            )
        }
        searchExpectations.forEach { (query, id) ->
            assertEquals("query: $query", listOf(id), index.filter(query).map { it.id })
        }
        library.ingredientForms
            .filter { it.ingredientRefId == "ingredient-ref-fenugreek-leaves" }
            .forEach { form ->
                assertNull("${form.id} must not infer density", form.densityGPerMl)
                if (form.id == "ingredient-form-fenugreek-leaves-dried") {
                    assertEquals(listOf("feuille de fenugrec séchée"), form.matchTermsFr)
                    assertEquals(
                        listOf("dried fenugreek leaf", "fenugreek leaf, dried", "kasuri methi", "kasoori methi"),
                        form.matchTermsEn,
                    )
                } else {
                    assertEquals(listOf("feuille de fenugrec fraîche"), form.matchTermsFr)
                    assertEquals(listOf("fresh fenugreek leaf"), form.matchTermsEn)
                }
            }
        assertEquals(
            setOf("ingredient-ref-taro", "ingredient-ref-taro-leaves", "ingredient-ref-taro-flour"),
            index.filter("taro").map { it.id }.toSet(),
        )
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in leafIds })
        assertTrue(library.contextualSubstitutionRules.isEmpty())
    }

    @Test
    fun bundledRyeMealDriedOrangeZestAndAlternativeFloursKeepTheirBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val ryeMealId = "ingredient-ref-rye-meal"
        val orangeZestId = "ingredient-ref-dried-orange-zest"
        val ryeMeal = library.ingredientReferences.single { it.id == ryeMealId }
        val orangeZest = library.ingredientReferences.single { it.id == orangeZestId }

        assertEquals("rye meal", ryeMeal.nameEn)
        assertEquals("gruau de seigle", ryeMeal.nameFr)
        assertEquals(listOf("coarse rye meal", "pumpernickel meal", "pumpernickel flour"), ryeMeal.aliasesEn)
        assertEquals(listOf("semoule de seigle", "farine à pumpernickel"), ryeMeal.aliasesFr)
        assertNull(ryeMeal.defaultDensity)
        assertTrue(ryeMeal.unitMappings.isEmpty())
        assertEquals(listOf(ryeMealId), index.filter("pumpernickel flour").map { it.id })
        assertEquals(
            setOf("ingredient-ref-rye-flour", "ingredient-ref-dark-rye-flour", "ingredient-ref-light-rye-flour", "ingredient-ref-medium-rye-flour", "ingredient-ref-malted-rye-flour", "ingredient-ref-whole-rye-flour"),
            index.filter("rye flour").map { it.id }.toSet(),
        )
        assertFalse(library.ingredientForms.any { it.ingredientRefId == ryeMealId })

        assertEquals("dried orange zest", orangeZest.nameEn)
        assertEquals("zeste d'orange déshydraté", orangeZest.nameFr)
        assertTrue(orangeZest.aliasesEn.isEmpty())
        assertTrue(orangeZest.aliasesFr.isEmpty())
        assertNull(orangeZest.defaultDensity)
        assertTrue(orangeZest.unitMappings.isEmpty())
        assertEquals(listOf(orangeZestId), index.filter("dried orange zest").map { it.id })
        assertEquals(listOf(orangeZestId), index.filter("zeste d'orange déshydraté").map { it.id })
        assertEquals(listOf("ingredient-ref-citrus-zest"), index.filter("citrus zest").map { it.id })
        assertEquals(listOf("ingredient-ref-lemon-zest"), index.filter("lemon zest").map { it.id })
        assertFalse(library.ingredientForms.any { it.ingredientRefId == orangeZestId })
        assertFalse(library.recipes.flatMap { it.ingredients }.any {
            it.ingredientRefId == ryeMealId || it.ingredientRefId == orangeZestId
        })

        val hazelnutFlourId = "ingredient-ref-hazelnut-flour"
        val hazelnutFlour = library.ingredientReferences.single { it.id == hazelnutFlourId }
        assertEquals("hazelnut flour", hazelnutFlour.nameEn)
        assertEquals("farine de noisette", hazelnutFlour.nameFr)
        assertTrue(hazelnutFlour.aliasesEn.isEmpty())
        assertTrue(hazelnutFlour.aliasesFr.isEmpty())
        assertNull(hazelnutFlour.defaultDensity)
        assertTrue(hazelnutFlour.unitMappings.isEmpty())
        assertEquals(
            setOf(hazelnutFlourId, "ingredient-ref-defatted-hazelnut-flour"),
            index.filter("hazelnut flour").map { it.id }.toSet()
        )
        assertEquals(
            setOf(hazelnutFlourId, "ingredient-ref-defatted-hazelnut-flour"),
            index.filter("farine de noisette").map { it.id }.toSet()
        )
        assertFalse(library.ingredientForms.any { it.ingredientRefId == hazelnutFlourId })

        val chestnutFlourId = "ingredient-ref-chestnut-flour"
        val chestnutFlour = library.ingredientReferences.single { it.id == chestnutFlourId }
        assertEquals("chestnut flour", chestnutFlour.nameEn)
        assertEquals("farine de châtaigne", chestnutFlour.nameFr)
        assertTrue(chestnutFlour.aliasesEn.isEmpty())
        assertTrue(chestnutFlour.aliasesFr.isEmpty())
        assertNull(chestnutFlour.defaultDensity)
        assertTrue(chestnutFlour.unitMappings.isEmpty())
        assertEquals(listOf(chestnutFlourId), index.filter("chestnut flour").map { it.id })
        assertEquals(listOf(chestnutFlourId), index.filter("farine de châtaigne").map { it.id })
        assertFalse(library.ingredientForms.any { it.ingredientRefId == chestnutFlourId })
        assertTrue(library.recipes.flatMap { it.ingredients }.none {
            it.ingredientRefId == hazelnutFlourId || it.ingredientRefId == chestnutFlourId
        })

        assertTrue(index.filter("salt pork").isEmpty())
        assertTrue(index.filter("petit salé").isEmpty())
        assertTrue(index.filter("lard salé").isEmpty())
        assertEquals(listOf("ingredient-ref-defatted-coconut-flour"), index.filter("coconut flour").map { it.id })
        assertEquals(listOf("ingredient-ref-defatted-coconut-flour"), index.filter("farine de noix de coco").map { it.id })
    }

    @Test
    fun bundledRiceQuinoaAndOatBranKeepPreparationStatesAsForms() {
        val library = loadBundledPayload().toDomainLibrary()
        val rice = library.ingredientReferences.single { it.id == "ingredient-ref-rice" }
        val whiteRice = library.ingredientReferences.single { it.id == "ingredient-ref-white-rice" }
        val quinoa = library.ingredientReferences.single { it.id == "ingredient-ref-quinoa" }
        val oatBran = library.ingredientReferences.single { it.id == "ingredient-ref-oat-bran" }
        val forms = library.ingredientForms.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals("rice", rice.nameEn)
        assertEquals("riz", rice.nameFr)
        assertEquals("white rice", whiteRice.nameEn)
        assertEquals("riz blanchi", whiteRice.nameFr)
        assertEquals(listOf("milled rice"), whiteRice.aliasesEn)
        assertEquals(listOf("riz blanc"), whiteRice.aliasesFr)
        assertEquals("quinoa", quinoa.nameEn)
        assertEquals("quinoa", quinoa.nameFr)
        assertEquals("oat bran", oatBran.nameEn)
        assertEquals("son d'avoine", oatBran.nameFr)
        assertEquals(setOf("dry", "cooked"), library.ingredientForms.filter { it.ingredientRefId == rice.id }.map { it.formCode }.toSet())
        assertEquals(setOf("dry", "cooked"), library.ingredientForms.filter { it.ingredientRefId == whiteRice.id }.map { it.formCode }.toSet())
        assertEquals(setOf("dry", "cooked"), library.ingredientForms.filter { it.ingredientRefId == quinoa.id }.map { it.formCode }.toSet())
        assertEquals(setOf("dry", "cooked"), library.ingredientForms.filter { it.ingredientRefId == oatBran.id }.map { it.formCode }.toSet())
        assertEquals(null, forms.getValue("ingredient-form-rice-dry").densityGPerMl)
        assertEquals(null, forms.getValue("ingredient-form-white-rice-dry").densityGPerMl)
        assertEquals(null, forms.getValue("ingredient-form-white-rice-cooked").densityGPerMl)
        assertEquals(null, forms.getValue("ingredient-form-quinoa-cooked").densityGPerMl)
        assertEquals(null, forms.getValue("ingredient-form-oat-bran-dry").densityGPerMl)
        assertEquals(
            setOf(whiteRice.id, "ingredient-ref-white-rice-flour"),
            index.filter("white rice").map { it.id }.toSet()
        )
        assertEquals(
            setOf(whiteRice.id, "ingredient-ref-white-rice-flour"),
            index.filter("riz blanc").map { it.id }.toSet()
        )
        assertEquals(listOf(whiteRice.id), index.filter("riz blanchi").map { it.id })
        assertEquals(listOf(whiteRice.id), index.filter("cooked white rice").map { it.id })
        assertEquals("ingredient-form-white-rice-cooked", index.matchFormHint(whiteRice.id, "cooked white rice")?.id)
        assertEquals("ingredient-form-white-rice-cooked", index.matchFormHint(whiteRice.id, "riz blanchi cuit")?.id)

        val riceLines = library.recipes.flatMap { it.ingredients }.filter { it.ingredientRefId == rice.id }
        val quinoaLines = library.recipes.flatMap { it.ingredients }.filter { it.ingredientRefId == quinoa.id }
        assertEquals(3, riceLines.size)
        assertTrue(riceLines.all { it.ingredientFormId == "ingredient-form-rice-cooked" })
        assertEquals(1, quinoaLines.size)
        assertEquals("ingredient-form-quinoa-cooked", quinoaLines.single().ingredientFormId)

        val cookedWhiteRice = library.recipes.flatMap { it.ingredients }.single { it.originalText == "Cooked white rice, for serving" }
        assertEquals(whiteRice.id, cookedWhiteRice.ingredientRefId)
        assertEquals("ingredient-form-white-rice-cooked", cookedWhiteRice.ingredientFormId)
        assertEquals(1.0, cookedWhiteRice.quantity!!, 0.0)
        assertEquals("for serving", cookedWhiteRice.unit)
        assertTrue(cookedWhiteRice.optional)

        val beef = library.ingredientReferences.single { it.id == "ingredient-ref-beef" }
        assertEquals("beef", beef.nameEn)
        assertEquals("bœuf", beef.nameFr)
        assertEquals(setOf("ingredient-ref-beef", "ingredient-ref-beef-bouillon-cubes", "ingredient-ref-beef-broth", "ingredient-ref-beef-stock", "ingredient-ref-beef-suet", "ingredient-ref-ground-beef"),
            index.filter("beef").map { it.id }.toSet())
        assertEquals(setOf("ingredient-ref-beef", "ingredient-ref-beef-bouillon-cubes", "ingredient-ref-beef-broth", "ingredient-ref-beef-stock", "ingredient-ref-beef-suet", "ingredient-ref-ground-beef"),
            index.filter("bœuf").map { it.id }.toSet())
        assertEquals(listOf("ingredient-ref-beef-broth"), index.filter("beef broth").map { it.id })
        assertEquals(listOf("ingredient-ref-beef-stock"), index.filter("beef stock").map { it.id })
        assertEquals(setOf("ingredient-ref-beef-bouillon-cubes", "ingredient-ref-beef-broth"), index.filter("bouillon de bœuf").map { it.id }.toSet())
        assertEquals(listOf("ingredient-ref-beef-stock"), index.filter("fond de bœuf").map { it.id })
        assertEquals(listOf("ingredient-ref-ground-beef"), index.filter("ground beef").map { it.id })
        assertEquals(listOf("ingredient-ref-ground-beef"), index.filter("bœuf haché").map { it.id })
        val linkedBeef = library.recipes.flatMap { it.ingredients }.single { it.originalText == "400 g beef" }
        assertEquals(beef.id, linkedBeef.ingredientRefId)
        assertEquals(400.0, linkedBeef.quantity!!, 0.0)
        assertEquals("g", linkedBeef.unit)

        val brothLines = library.recipes.flatMap { it.ingredients }
            .filter { it.ingredientRefId == "ingredient-ref-beef-broth" }
        assertEquals(3, brothLines.size)
        assertTrue(brothLines.all { it.ingredientName == "beef broth" })
        val cannedBroth = brothLines.single { it.originalText == "1 can beef broth" }
        assertEquals(1.0, cannedBroth.quantity!!, 0.0)
        assertEquals("can", cannedBroth.unit)
        val stock = library.ingredientReferences.single { it.id == "ingredient-ref-beef-stock" }
        assertEquals("beef stock", stock.nameEn)
        assertEquals("fond de bœuf", stock.nameFr)
        assertTrue(stock.aliasesEn.isEmpty())
        assertTrue(stock.aliasesFr.isEmpty())
    }

    @Test
    fun quinoaFlakesAreASeparateBilingualIdentityWithoutRecipeFormsOrLinks() {
        val library = loadBundledPayload().toDomainLibrary()
        val flakes = library.ingredientReferences.single { it.id == "ingredient-ref-quinoa-flakes" }
        val forms = library.ingredientForms.filter { it.ingredientRefId == flakes.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals("quinoa flakes", flakes.nameEn)
        assertEquals("flocons de quinoa", flakes.nameFr)
        assertTrue(flakes.aliasesEn.isEmpty())
        assertTrue(flakes.aliasesFr.isEmpty())
        assertEquals(IngredientCategory.GRAIN_AND_CEREAL, flakes.category)
        assertEquals(null, flakes.defaultDensity)
        assertTrue(flakes.unitMappings.isEmpty())
        assertTrue(forms.isEmpty())
        assertEquals(listOf(flakes.id), index.filter("quinoa flakes").map { it.id })
        assertEquals(listOf(flakes.id), index.filter("flocons de quinoa").map { it.id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == flakes.id })
        assertFalse(flakes.id in setOf("ingredient-ref-quinoa", "ingredient-ref-puffed-quinoa"))
    }

    @Test
    fun bundledMakhanaKeepsRoastedPoppedKernelsAsASeparateForm() {
        val library = loadBundledPayload().toDomainLibrary()
        val makhana = library.ingredientReferences.single { it.id == "ingredient-ref-makhana-seeds" }
        val form = library.ingredientForms.single { it.id == "ingredient-form-makhana-roasted-popped" }

        assertEquals("makhana seeds (Euryale ferox)", makhana.nameEn)
        assertEquals("graines de makhana (Euryale ferox)", makhana.nameFr)
        assertEquals(makhana.id, form.ingredientRefId)
        assertEquals("roasted_popped", form.formCode)
        assertEquals("roasted_popped", form.prepState)
        assertEquals("roasted, popped makhana kernels", form.labelEn)
        assertEquals("graines de makhana grillées et soufflées", form.labelFr)
        assertTrue(form.matchTermsEn.containsAll(listOf("roasted makhana", "popped makhana", "puffed makhana")))
        assertEquals(listOf("graines de makhana soufflées", "noix de renard"), form.matchTermsFr)
        assertEquals(null, form.densityGPerMl)
        assertTrue(library.recipes.flatMap { it.ingredients }.none { ingredient ->
            ingredient.originalText.contains("makhana", ignoreCase = true) ||
                ingredient.originalText.contains("fox nut", ignoreCase = true)
        })
    }

    @Test
    fun bundledGuaranaPowderIsASearchableGroundSeedForm() {
        val library = loadBundledPayload().toDomainLibrary()
        val guarana = library.ingredientReferences.single { it.id == "ingredient-ref-guarana-seed" }
        val powder = library.ingredientForms.single { it.id == "ingredient-form-guarana-seed-powder" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals("guarana seed", guarana.nameEn)
        assertEquals("graine de guarana", guarana.nameFr)
        assertEquals(guarana.id, powder.ingredientRefId)
        assertEquals("powdered", powder.formCode)
        assertEquals("powdered", powder.prepState)
        assertEquals("guarana seed powder", powder.labelEn)
        assertEquals("poudre de graines de guarana", powder.labelFr)
        assertEquals(listOf("guarana en poudre", "poudre de guarana"), powder.matchTermsFr)
        assertEquals(listOf("guarana powder", "ground guarana"), powder.matchTermsEn)
        assertNull(powder.densityGPerMl)
        assertEquals(listOf(guarana.id), index.filter("ground guarana").map { it.id })
        assertEquals(powder.id, index.matchFormHint(guarana.id, "ground guarana")?.id)
        assertEquals(powder.id, index.matchFormHint(guarana.id, "poudre de guarana")?.id)
        assertNull(index.matchFormHint(guarana.id, "guaraná em pó"))
        assertNull(index.matchFormHint(guarana.id, "soluble guarana powder"))
    }

    @Test
    fun bundledGuascasAndAndeanChuñoIdentitiesHaveNoRecipeLinksOrFormData() {
        val library = loadBundledPayload().toDomainLibrary()
        val ids = setOf("ingredient-ref-guascas", "ingredient-ref-chuno-negro", "ingredient-ref-tunta")

        assertEquals(ids.size, library.ingredientReferences.count { it.id in ids })
        assertTrue(library.ingredientForms.none { it.ingredientRefId in ids })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { ingredient ->
            ingredient.ingredientRefId?.let(ids::contains) == true
        })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { ingredient ->
            listOf("guasca", "guascas", "chuño", "chuno", "tunta", "moraya").any { term ->
                ingredient.originalText.contains(term, ignoreCase = true)
            }
        })
    }

    @Test
    fun bundledAndeanAjiesKeepFreshAndDriedFormsSeparateWithoutConversionsOrRecipeLinks() {
        val library = loadBundledPayload().toDomainLibrary()
        val amarilloId = "ingredient-ref-aji-amarillo-pepper"
        val pancaId = "ingredient-ref-aji-panca-pepper"
        val refIds = setOf(amarilloId, pancaId)
        val forms = library.ingredientForms.filter { it.ingredientRefId in refIds }
        val formsById = forms.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(2, library.ingredientReferences.count { it.id in refIds })
        assertEquals(4, forms.size)
        assertEquals(
            setOf(
                "ingredient-form-aji-amarillo-pepper-fresh",
                "ingredient-form-aji-amarillo-pepper-dried",
                "ingredient-form-aji-panca-pepper-fresh",
                "ingredient-form-aji-panca-pepper-dried"
            ),
            formsById.keys
        )
        assertEquals("fresh", formsById.getValue("ingredient-form-aji-amarillo-pepper-fresh").prepState)
        assertEquals("dry", formsById.getValue("ingredient-form-aji-amarillo-pepper-dried").prepState)
        assertEquals("fresh", formsById.getValue("ingredient-form-aji-panca-pepper-fresh").prepState)
        assertEquals("dry", formsById.getValue("ingredient-form-aji-panca-pepper-dried").prepState)
        assertTrue(forms.all { it.densityGPerMl == null })

        listOf(
            Triple(amarilloId, "fresh ají amarillo pepper", "ingredient-form-aji-amarillo-pepper-fresh"),
            Triple(amarilloId, "ají amarillo seco", "ingredient-form-aji-amarillo-pepper-dried"),
            Triple(pancaId, "fresh ají panca pepper", "ingredient-form-aji-panca-pepper-fresh"),
            Triple(pancaId, "ají panca seco", "ingredient-form-aji-panca-pepper-dried")
        ).forEach { (refId, query, formId) ->
            assertEquals(listOf(refId), index.filter(query).map { it.id })
            assertEquals(formId, index.matchFormHint(refId, query)?.id)
        }
        listOf(
            Triple(amarilloId, "piment jaune (ají amarillo), frais", "ingredient-form-aji-amarillo-pepper-fresh"),
            Triple(amarilloId, "piment jaune (ají amarillo), séché", "ingredient-form-aji-amarillo-pepper-dried"),
            Triple(pancaId, "piment panca (ají panca), frais", "ingredient-form-aji-panca-pepper-fresh"),
            Triple(pancaId, "piment panca (ají panca), séché", "ingredient-form-aji-panca-pepper-dried")
        ).forEach { (refId, query, formId) ->
            assertEquals(listOf(refId), index.filter(query).map { it.id })
            assertEquals(formId, index.matchFormHint(refId, query)?.id)
        }

        listOf("mirasol", "ají escabeche", "ají limo", "ají dulce", "ají habanero").forEach { query ->
            assertTrue(index.filter(query).none { it.id in refIds })
        }
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in refIds })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { ingredient ->
            listOf("ají amarillo", "aji amarillo", "ají panca", "aji panca", "mirasol").any { term ->
                ingredient.originalText.contains(term, ignoreCase = true)
            }
        })
        assertTrue(library.substitutionRules.none { it.fromFormId in formsById.keys || it.toFormId in formsById.keys })
    }

    @Test
    fun bundledTropicalLeafyGreensStayDistinctAndIdentityOnly() {
        val library = loadBundledPayload().toDomainLibrary()
        val waterSpinachId = "ingredient-ref-water-spinach"
        val malabarId = "ingredient-ref-malabar-spinach"
        val juteId = "ingredient-ref-jute-leaves"
        val molokhiaId = "ingredient-ref-molokhia-leaves"
        val ids = setOf(waterSpinachId, malabarId, juteId, molokhiaId)
        val references = library.ingredientReferences.filter { it.id in ids }.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(ids, references.keys)
        assertTrue(library.ingredientForms.none { it.ingredientRefId in ids })
        assertTrue(library.contextualSubstitutionRules.none { rule ->
            rule.fromIngredientRefId in ids || rule.toIngredientRefId in ids
        })

        assertEquals("water spinach", references.getValue(waterSpinachId).nameEn)
        assertEquals("épinard d'eau", references.getValue(waterSpinachId).nameFr)
        assertEquals("Malabar spinach", references.getValue(malabarId).nameEn)
        assertEquals("baselle", references.getValue(malabarId).nameFr)
        assertEquals("jute leaves", references.getValue(juteId).nameEn)
        assertEquals("feuilles de jute", references.getValue(juteId).nameFr)
        assertEquals("molokhia leaves", references.getValue(molokhiaId).nameEn)
        assertEquals("molokhia (feuilles de corète potagère)", references.getValue(molokhiaId).nameFr)

        listOf(
            "water spinach" to waterSpinachId,
            "ong choy" to waterSpinachId,
            "épinard d'eau" to waterSpinachId,
            "Malabar spinach" to malabarId,
            "baselle" to malabarId,
            "Ceylon spinach" to malabarId,
            "jute leaves" to juteId,
            "feuilles de jute" to juteId,
            "molokhia" to molokhiaId,
            "meloheeya" to molokhiaId,
            "corète potagère" to molokhiaId
        ).forEach { (query, expectedId) ->
            assertEquals("query: $query", listOf(expectedId), index.filter(query).map { it.id })
        }
        listOf("waterleaf", "sweet potato leaves", "swamp cabbage", "Basella").forEach { query ->
            assertTrue("query: $query", index.filter(query).none { it.id in ids })
        }

        assertTrue(library.recipes.flatMap { it.ingredients }.none { ingredient -> ingredient.ingredientRefId in ids })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { ingredient ->
            listOf("water spinach", "Malabar spinach", "jute leaves", "molokhia")
                .any { term -> ingredient.originalText.contains(term, ignoreCase = true) }
        })
    }

    @Test
    fun bundledRocotoFormsStayQualifiedAndJackfruitKeepsOnlyNamedYoungForm() {
        val library = loadBundledPayload().toDomainLibrary()
        val rocotoId = "ingredient-ref-rocoto-pepper"
        val jackfruitId = "ingredient-ref-jackfruit"
        val ids = setOf(rocotoId, jackfruitId)
        val references = library.ingredientReferences.filter { it.id in ids }.associateBy { it.id }
        val forms = library.ingredientForms.filter { it.ingredientRefId == rocotoId }.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(ids, references.keys)
        assertEquals(
            setOf(
                "ingredient-form-rocoto-pepper-fresh",
                "ingredient-form-rocoto-pepper-whole-dehydrated",
                "ingredient-form-rocoto-pepper-powdered",
                "ingredient-form-rocoto-pepper-qacha",
                "ingredient-form-rocoto-pepper-fresh-ground-with-skin-unsalted-water"
            ),
            forms.keys
        )
        assertTrue(forms.values.all { it.densityGPerMl == null })
        assertEquals("rocoto pepper", references.getValue(rocotoId).nameEn)
        assertEquals("piment rocoto", references.getValue(rocotoId).nameFr)
        assertEquals("jackfruit", references.getValue(jackfruitId).nameEn)
        assertEquals("jaque", references.getValue(jackfruitId).nameFr)
        val jackfruitForms = library.ingredientForms.filter { it.ingredientRefId == jackfruitId }
        assertEquals(listOf("ingredient-form-jackfruit-young-in-brine"), jackfruitForms.map { it.id })
        assertEquals("young jackfruit in brine", jackfruitForms.single().labelEn)
        assertEquals("jeune fruit du jacquier en saumure", jackfruitForms.single().labelFr)
        assertNull(jackfruitForms.single().densityGPerMl)
        assertTrue(library.substitutionRules.none { it.fromFormId in forms.keys || it.toFormId in forms.keys })
        assertTrue(library.contextualSubstitutionRules.none { rule ->
            rule.fromIngredientRefId in ids || rule.toIngredientRefId in ids
        })

        fun assertForm(query: String, expectedFormId: String) {
            assertEquals("query: $query", listOf(rocotoId), index.filter(query).map { it.id })
            assertEquals(expectedFormId, index.matchFormHint(rocotoId, query)?.id)
        }
        assertForm("fresh rocoto pepper", "ingredient-form-rocoto-pepper-fresh")
        assertForm("piment rocoto frais", "ingredient-form-rocoto-pepper-fresh")
        assertForm("rocoto fresco", "ingredient-form-rocoto-pepper-fresh")
        assertForm("whole dried rocoto pepper", "ingredient-form-rocoto-pepper-whole-dehydrated")
        assertForm("rocoto entero deshidratado", "ingredient-form-rocoto-pepper-whole-dehydrated")
        assertForm("rocoto powder", "ingredient-form-rocoto-pepper-powdered")
        assertForm("rocoto en polvo", "ingredient-form-rocoto-pepper-powdered")
        assertForm("qacha", "ingredient-form-rocoto-pepper-qacha")
        assertForm("qacha rocoto", "ingredient-form-rocoto-pepper-qacha")
        assertForm(
            "fresh ground rocoto with skin, in unsalted water",
            "ingredient-form-rocoto-pepper-fresh-ground-with-skin-unsalted-water"
        )
        assertForm(
            "rocoto fresco molido con cáscara en agua sin sal",
            "ingredient-form-rocoto-pepper-fresh-ground-with-skin-unsalted-water"
        )
        assertNull(index.matchFormHint(rocotoId, "rocoto molido"))
        assertNull(index.matchFormHint(rocotoId, "ground rocoto"))

        listOf("uchu", "chile caballo", "piment d'Arequipa", "rocoto paste", "canned rocoto")
            .forEach { query -> assertTrue("query: $query", index.filter(query).none { it.id == rocotoId }) }
        listOf("jackfruit", "jakfruit", "jaque", "jacque", "jacquier").forEach { query ->
            assertEquals("query: $query", listOf(jackfruitId), index.filter(query).map { it.id })
        }
        listOf("green jackfruit", "unripe jackfruit", "tender jackfruit", "jaquier")
            .forEach { query -> assertTrue("query: $query", index.filter(query).none { it.id == jackfruitId }) }

        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in ids })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { ingredient ->
            listOf("rocoto", "jackfruit", "jaque").any { term -> ingredient.originalText.contains(term, ignoreCase = true) }
        })
    }

    @Test
    fun bundledMakrutLeavesKeepFreshFrozenAndDriedStatesDistinct() {
        val library = loadBundledPayload().toDomainLibrary()
        val id = "ingredient-ref-makrut-lime-leaves"
        val reference = library.ingredientReferences.single { it.id == id }
        val forms = library.ingredientForms.filter { it.ingredientRefId == id }.associateBy { it.id }
        val expectedForms = setOf(
            "ingredient-form-makrut-lime-leaves-fresh",
            "ingredient-form-makrut-lime-leaves-frozen",
            "ingredient-form-makrut-lime-leaves-dried"
        )
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals("makrut lime leaves", reference.nameEn)
        assertEquals("feuilles de combava", reference.nameFr)
        assertEquals(expectedForms, forms.keys)
        assertTrue(forms.values.all { it.densityGPerMl == null })
        assertNull(reference.defaultDensity)
        assertTrue(reference.unitMappings.isEmpty())
        assertTrue(library.substitutionRules.none { it.fromFormId in expectedForms || it.toFormId in expectedForms })
        assertTrue(library.contextualSubstitutionRules.none { it.fromIngredientRefId == id || it.toIngredientRefId == id })

        fun assertForm(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(id), index.filter(query).map { it.id })
            assertEquals(expectedId, index.matchFormHint(id, query)?.id)
        }
        assertForm("fresh makrut lime leaves", "ingredient-form-makrut-lime-leaves-fresh")
        assertForm("feuilles fraîches de combava", "ingredient-form-makrut-lime-leaves-fresh")
        assertForm("frozen makrut lime leaves", "ingredient-form-makrut-lime-leaves-frozen")
        assertForm("feuilles de combava congelées", "ingredient-form-makrut-lime-leaves-frozen")
        assertForm("dried makrut lime leaves", "ingredient-form-makrut-lime-leaves-dried")
        assertForm("feuilles de combava séchées", "ingredient-form-makrut-lime-leaves-dried")
        assertTrue(index.filter("kaffir lime leaves").none { it.id == id })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == id })
    }

    @Test
    fun bundledPepperSesameAndRiceVinegarEntriesKeepSourceBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val pepperIds = setOf(
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
        val sesameIds = setOf(
            "ingredient-ref-sesame-seeds",
            "ingredient-ref-white-sesame-seeds",
            "ingredient-ref-black-sesame-seeds"
        )
        val vinegarIds = setOf(
            "ingredient-ref-rice-vinegar",
            "ingredient-ref-seasoned-rice-vinegar",
            "ingredient-ref-chinkiang-vinegar"
        )
        val referenceIds = pepperIds + sesameIds + vinegarIds + "ingredient-ref-tahini"
        val references = library.ingredientReferences.filter { it.id in referenceIds }.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals(referenceIds, references.keys)
        assertTrue(library.ingredientForms.none { it.ingredientRefId in pepperIds + vinegarIds })
        assertTrue(references.values.all { it.defaultDensity == null && it.unitMappings.isEmpty() })
        assertTrue(library.ingredientForms.filter { it.ingredientRefId in sesameIds }.all { it.densityGPerMl == null })

        fun assertReference(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), index.filter(query).map { it.id })
        }
        fun assertForm(query: String, referenceId: String, expectedFormId: String) {
            assertEquals("query: $query", listOf(referenceId), index.filter(query).map { it.id })
            assertEquals(expectedFormId, index.matchFormHint(referenceId, query)?.id)
        }

        assertReference("white peppercorns", "ingredient-ref-white-pepper")
        assertReference("green peppercorns", "ingredient-ref-green-peppercorns")
        assertReference("poivre d’Amérique", "ingredient-ref-pink-pepper")
        assertReference("ground Szechuan pepper", "ingredient-ref-sichuan-pepper")
        assertReference("poivre long indien", "ingredient-ref-indian-long-pepper")
        assertReference("poivre long de Java", "ingredient-ref-javanese-long-pepper")
        assertReference("graines de paradis", "ingredient-ref-grains-of-paradise")
        assertReference("cubèbe", "ingredient-ref-cubeb")

        assertForm(
            "toasted sesame seeds",
            "ingredient-ref-sesame-seeds",
            "ingredient-form-sesame-seeds-toasted"
        )
        assertForm(
            "toasted white sesame seeds",
            "ingredient-ref-white-sesame-seeds",
            "ingredient-form-white-sesame-seeds-toasted"
        )
        assertNull(index.matchFormHint("ingredient-ref-black-sesame-seeds", "black sesame, toasted"))
        assertTrue(library.substitutionRules.none { rule ->
            val from = library.ingredientForms.single { it.id == rule.fromFormId }
            val to = library.ingredientForms.single { it.id == rule.toFormId }
            from.ingredientRefId in sesameIds || to.ingredientRefId in sesameIds
        })
        assertTrue(library.contextualSubstitutionRules.none {
            it.fromIngredientRefId in sesameIds || it.toIngredientRefId in sesameIds
        })

        assertEquals(
            setOf("ingredient-ref-rice-vinegar", "ingredient-ref-seasoned-rice-vinegar"),
            index.filter("rice vinegar").map { it.id }.toSet()
        )
        assertReference("seasoned rice vinegar", "ingredient-ref-seasoned-rice-vinegar")
        assertReference("unseasoned rice vinegar", "ingredient-ref-rice-vinegar")
        assertReference("Chinkiang vinegar", "ingredient-ref-chinkiang-vinegar")
        assertReference("Zhenjiang vinegar", "ingredient-ref-chinkiang-vinegar")
        listOf("black vinegar", "black rice vinegar", "kurozu").forEach { query ->
            assertTrue(index.filter(query).none { it.id == "ingredient-ref-chinkiang-vinegar" })
        }
        assertEquals(
            setOf("ingredient-ref-black-rice", "ingredient-ref-black-glutinous-rice", "ingredient-ref-puffed-black-rice", "ingredient-ref-black-rice-flour"),
            index.filter("black rice").map { it.id }.toSet()
        )

        val sesameLines = library.recipes.flatMap { it.ingredients }
            .filter { it.originalText.contains("sesame", ignoreCase = true) }
        val whiteToast = sesameLines.single { it.originalText == "1 tbsp toasted white sesame seeds" }
        assertEquals("ingredient-ref-white-sesame-seeds", whiteToast.ingredientRefId)
        assertEquals("ingredient-form-white-sesame-seeds-toasted", whiteToast.ingredientFormId)
        val genericToast = sesameLines.single { it.originalText == "Sesame seeds, toasted" }
        assertEquals("ingredient-ref-sesame-seeds", genericToast.ingredientRefId)
        assertEquals("ingredient-form-sesame-seeds-toasted", genericToast.ingredientFormId)

        val newPepperIds = pepperIds - "ingredient-ref-black-pepper"
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in newPepperIds + vinegarIds })
    }

    @Test
    fun bundledSeedIdentityBatchAddsNoFormsMeasurementsSubstitutionsOrRecipeLinks() {
        val library = loadBundledPayload().toDomainLibrary()
        val identityIds = setOf(
            "ingredient-ref-pumpkin-squash-seeds",
            "ingredient-ref-sunflower-seeds",
            "ingredient-ref-flax-seeds",
            "ingredient-ref-hemp-hearts",
            "ingredient-ref-whole-hemp-seeds",
            "ingredient-ref-poppy-seeds"
        )
        val references = library.ingredientReferences.filter { it.id in identityIds }.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val formsById = library.ingredientForms.associateBy { it.id }

        assertEquals(identityIds, references.keys)
        assertTrue(references.values.all { it.defaultDensity == null && it.unitMappings.isEmpty() })
        assertTrue(references.values.all { it.category == IngredientCategory.NUT_SEED_AND_DRIED_FRUIT })
        assertTrue(library.ingredientForms.none { it.ingredientRefId in identityIds })
        assertTrue(library.substitutionRules.none { rule ->
            formsById.getValue(rule.fromFormId).ingredientRefId in identityIds ||
                formsById.getValue(rule.toFormId).ingredientRefId in identityIds
        })
        assertTrue(library.contextualSubstitutionRules.none {
            it.fromIngredientRefId in identityIds || it.toIngredientRefId in identityIds
        })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in identityIds })

        fun assertReference(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), index.filter(query).map { it.id })
        }
        fun assertReferences(query: String, expectedIds: Set<String>) {
            assertEquals("query: $query", expectedIds, index.filter(query).map { it.id }.toSet())
        }
        assertReference("pumpkin seeds", "ingredient-ref-pumpkin-squash-seeds")
        assertReferences(
            "graines de citrouille",
            setOf("ingredient-ref-pumpkin-squash-seeds", "ingredient-ref-pumpkin-seed-butter", "ingredient-ref-pumpkin-seed-oil")
        )
        assertReference("graine de citrouille", "ingredient-ref-pumpkin-squash-seeds")
        assertReference("sunflower seeds", "ingredient-ref-sunflower-seeds")
        assertReferences(
            "graines de tournesol",
            setOf("ingredient-ref-sunflower-seeds", "ingredient-ref-sunflower-seed-butter")
        )
        assertReference("graine de tournesol", "ingredient-ref-sunflower-seeds")
        assertReference("linseed", "ingredient-ref-flax-seeds")
        assertReference("flaxseed", "ingredient-ref-flax-seeds")
        assertReference("graine de lin", "ingredient-ref-flax-seeds")
        assertReference("hulled hemp seeds", "ingredient-ref-hemp-hearts")
        assertReference("cœurs de chanvre", "ingredient-ref-hemp-hearts")
        assertReference("whole hemp seeds", "ingredient-ref-whole-hemp-seeds")
        assertReference("whole roasted hemp seeds", "ingredient-ref-whole-hemp-seeds")
        assertReference("graines de chanvre entières", "ingredient-ref-whole-hemp-seeds")
        assertReference("graines de chanvre rôties entières", "ingredient-ref-whole-hemp-seeds")
        assertReferences(
            "hemp seeds",
            setOf("ingredient-ref-hemp-hearts", "ingredient-ref-whole-hemp-seeds")
        )
        assertReferences(
            "graines de chanvre",
            setOf("ingredient-ref-hemp-hearts", "ingredient-ref-whole-hemp-seeds")
        )
        assertReference("poppy seeds", "ingredient-ref-poppy-seeds")
        assertReferences(
            "poppy seed",
            setOf("ingredient-ref-poppy-seeds", "ingredient-ref-poppy-seed-filling", "ingredient-ref-defatted-poppy-seed-flour")
        )
        assertReferences(
            "graines de pavot",
            setOf("ingredient-ref-poppy-seeds", "ingredient-ref-poppy-seed-filling")
        )
        assertReference("graine de pavot", "ingredient-ref-poppy-seeds")

        listOf(
            "pepitas",
            "graines de courge",
            "squash seeds",
            "sunflower kernels",
            "unhulled hemp seeds",
            "flax oil",
            "poppy oil",
            "coquelicot"
        ).forEach { query ->
            assertTrue("unexpected seed identity match for $query", index.filter(query).none { it.id in identityIds })
        }
    }

    @Test
    fun bundledChiaSingularAliasesPreserveTheExistingRecipeLink() {
        val library = loadBundledPayload().toDomainLibrary()
        val chia = library.ingredientReferences.single { it.id == "ingredient-ref-chia-seeds" }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

        assertEquals("chia seeds", chia.nameEn)
        assertEquals("graines de chia", chia.nameFr)
        assertEquals(listOf("chia seed"), chia.aliasesEn)
        assertEquals(listOf("graine de chia"), chia.aliasesFr)
        assertNull(chia.defaultDensity)
        assertTrue(chia.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == chia.id })
        assertEquals(listOf(chia.id), index.filter("chia seed").map { it.id })
        assertEquals(listOf(chia.id), index.filter("graine de chia").map { it.id })

        val chiaLines = library.recipes.flatMap { it.ingredients }.filter { it.ingredientRefId == chia.id }
        assertEquals(1, chiaLines.size)
        assertEquals("1/8 part chia seeds", chiaLines.single().originalText)
    }

    @Test
    fun bundledSeaCucumberIdentityAndDriedBodyWallFormKeepGenericProductNamesUnresolved() {
        val library = loadBundledPayload().toDomainLibrary()
        val seaCucumber = library.ingredientReferences.single {
            it.id == "ingredient-ref-orange-footed-sea-cucumber"
        }
        val form = library.ingredientForms.single {
            it.id == "ingredient-form-orange-footed-sea-cucumber-dried-gutted-body-wall"
        }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)

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

        assertEquals(seaCucumber.id, form.ingredientRefId)
        assertEquals("dried_gutted_body_wall", form.formCode)
        assertEquals("dry", form.prepState)
        assertNull(form.densityGPerMl)
        assertEquals(
            listOf(seaCucumber.id),
            index.filter("dried gutted body wall of Cucumaria frondosa").map { it.id },
        )
        assertEquals(
            listOf(seaCucumber.id),
            index.filter("paroi corporelle séchée d’holothurie touffue").map { it.id },
        )
        assertEquals(
            form.id,
            index.matchFormHint(seaCucumber.id, "dried gutted body wall of Cucumaria frondosa")?.id,
        )
        assertEquals(
            form.id,
            index.matchFormHint(seaCucumber.id, "paroi corporelle séchée d’holothurie touffue")?.id,
        )
        assertNull(index.matchFormHint(seaCucumber.id, "dried sea cucumber"))
        assertNull(index.matchFormHint(seaCucumber.id, "concombre de mer séché"))
        assertTrue(index.filter("dried sea cucumber").none { it.id == seaCucumber.id })
        assertTrue(index.filter("concombre de mer séché").none { it.id == seaCucumber.id })

        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == seaCucumber.id })
        assertTrue(library.packageYields.none { it.ingredientRefId == seaCucumber.id })
        assertTrue(library.substitutionRules.none {
            it.fromFormId == form.id || it.toFormId == form.id
        })
        assertTrue(library.contextualSubstitutionRules.none {
            it.fromIngredientRefId == seaCucumber.id || it.toIngredientRefId == seaCucumber.id
        })
    }

    @Test
    fun bundledYeastAndSoySauceBoundariesKeepOnlyTheExplicitInstantLineLinked() {
        val library = loadBundledPayload().toDomainLibrary()
        val yeastLines = library.recipes.flatMap { it.ingredients }.filter { ingredient ->
            ingredient.originalText.contains("yeast", ignoreCase = true)
        }
        val instant = yeastLines.single { it.originalText == "8 g instant yeast" }
        assertEquals("ingredient-ref-instant-yeast", instant.ingredientRefId)
        assertEquals("instant yeast", instant.ingredientName)
        assertEquals("instant", instant.preparation.en)
        assertTrue(yeastLines.filterNot { it.id == instant.id }.all { it.ingredientRefId == "ingredient-ref-yeast" })

        val soySauce = library.ingredientReferences.single { it.id == "ingredient-ref-soy-sauce" }
        val tamari = library.ingredientReferences.single { it.id == "ingredient-ref-tamari" }
        assertTrue(soySauce.aliasesEn.contains("shoyu"))
        assertTrue(tamari.aliasesEn.none { it == "gluten-free tamari" })
        assertTrue(tamari.aliasesFr.none { it == "tamari sans gluten" })
    }

    @Test
    fun bundledBarbecueAliasAndMayonnaiseLinkPreserveCondimentBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val barbecueId = "ingredient-ref-bbq-sauce"
        val barbecue = library.ingredientReferences.single { it.id == barbecueId }
        val mayonnaiseId = "ingredient-ref-mayo"
        val mayonnaise = library.ingredientReferences.single { it.id == mayonnaiseId }

        assertEquals("BBQ sauce", barbecue.nameEn)
        assertEquals("sauce barbecue", barbecue.nameFr)
        assertEquals(listOf("barbecue sauce"), barbecue.aliasesEn)
        assertEquals(listOf("sauce bbq"), barbecue.aliasesFr)
        assertNull(barbecue.defaultDensity)
        assertTrue(barbecue.unitMappings.isEmpty())
        assertFalse(library.ingredientForms.any { it.ingredientRefId == barbecueId })
        listOf("barbecue sauce", "BBQ sauce", "sauce barbecue", "sauce bbq").forEach { query ->
            assertEquals(query, listOf(barbecueId), index.filter(query).map { it.id })
        }
        assertFalse(index.filter("Chinese barbecue sauce").any { it.id == barbecueId })

        assertEquals("mayonnaise", mayonnaise.nameEn)
        assertEquals("mayonnaise", mayonnaise.nameFr)
        assertNull(mayonnaise.defaultDensity)
        assertTrue(mayonnaise.unitMappings.isEmpty())
        val crabRecipe = library.recipes.single { it.id == "135813a6-75e2-4596-8c71-ffd450fab0ca" }
        val mayonnaiseLine = crabRecipe.ingredients.single {
            it.id == "135813a6-75e2-4596-8c71-ffd450fab0ca-ingredient-13"
        }
        assertEquals("1/4 cup mayonnaise", mayonnaiseLine.originalText)
        assertEquals(mayonnaiseId, mayonnaiseLine.ingredientRefId)
        assertEquals(0.25, mayonnaiseLine.quantity!!, 0.0)
        assertEquals("cup", mayonnaiseLine.unit)
        assertEquals(
            setOf(mayonnaiseId, "ingredient-ref-japanese-mayonnaise"),
            index.filter("mayonnaise").map { it.id }.toSet()
        )
        assertTrue(index.filter("aioli").none { it.id == mayonnaiseId })
    }

    @Test
    fun bundledSourdoughAndWrapperIdentitiesKeepProductBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val wrappers = setOf(
            "ingredient-ref-rice-paper-wrapper",
            "ingredient-ref-wonton-wrapper",
            "ingredient-ref-gyoza-wrapper",
            "ingredient-ref-wheat-spring-roll-pastry",
            "ingredient-ref-egg-roll-wrapper"
        )
        val starterId = "ingredient-ref-sourdough-starter"
        val scopedIds = wrappers + starterId
        val references = library.ingredientReferences.filter { it.id in scopedIds }.associateBy { it.id }

        assertEquals(scopedIds, references.keys)
        assertTrue(references.values.all { it.defaultDensity == null && it.unitMappings.isEmpty() })
        assertTrue(references.values.filter { it.id in wrappers }.all {
            it.category == IngredientCategory.GRAIN_AND_CEREAL
        })
        assertTrue(library.ingredientForms.none { it.ingredientRefId in wrappers })
        assertTrue(library.substitutionRules.none { rule ->
            library.ingredientForms.single { it.id == rule.fromFormId }.ingredientRefId in scopedIds ||
                library.ingredientForms.single { it.id == rule.toFormId }.ingredientRefId in scopedIds
        })
        assertTrue(library.contextualSubstitutionRules.none {
            it.fromIngredientRefId in scopedIds || it.toIngredientRefId in scopedIds
        })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in scopedIds })

        fun assertReference(query: String, expectedId: String) {
            assertEquals("query: $query", listOf(expectedId), index.filter(query).map { it.id })
        }

        assertReference("rice paper", "ingredient-ref-rice-paper-wrapper")
        assertReference("galettes pour rouleaux de printemps", "ingredient-ref-rice-paper-wrapper")
        assertReference("pâtes à won ton", "ingredient-ref-wonton-wrapper")
        assertReference("gyoza skin", "ingredient-ref-gyoza-wrapper")
        assertReference("spring roll pastry", "ingredient-ref-wheat-spring-roll-pastry")
        assertReference("egg roll skins", "ingredient-ref-egg-roll-wrapper")
        assertReference("levain chef", starterId)

        listOf("spring-roll wrapper", "dumpling wrapper", "pâte à rouleaux de printemps", "levain tout point",
            "sourdough discard", "levain déshydraté").forEach { query ->
            assertTrue("unexpected reviewed identity match for $query", index.filter(query).none { it.id in scopedIds })
        }

        val starter = references.getValue(starterId)
        assertTrue("levain chef" in starter.aliasesFr)
        val driedStarter = library.ingredientForms.single { it.ingredientRefId == starterId }
        assertEquals("dehydrated_reactivatable", driedStarter.formCode)
        assertEquals("dehydrated sourdough starter", driedStarter.labelEn)
        assertEquals("levain naturel déshydraté", driedStarter.labelFr)
        assertEquals("dry", driedStarter.prepState)
        assertTrue(driedStarter.matchTermsEn.isEmpty() && driedStarter.matchTermsFr.isEmpty())
        assertEquals(driedStarter.id, index.matchFormHint(starterId, "levain naturel déshydraté")?.id)
        assertNull(index.matchFormHint(starterId, "levain déshydraté"))
    }

    @Test
    fun bundledPankoIsSeparateFromGenericBreadcrumbsAndKeepsExactRecipeRows() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val pankoId = "ingredient-ref-panko"
        val panko = library.ingredientReferences.single { it.id == pankoId }
        val breadcrumbs = library.ingredientReferences.single { it.id == "ingredient-ref-breadcrumbs" }
        val pankoLines = library.recipes.flatMap { it.ingredients }
            .filter { it.originalText.contains("panko", ignoreCase = true) }

        assertEquals("chapelure panko", panko.nameFr)
        assertEquals("panko bread crumbs", panko.nameEn)
        assertEquals(listOf("panko", "chapelure japonaise"), panko.aliasesFr)
        assertEquals(listOf("panko", "panko breadcrumbs", "Japanese breadcrumbs", "Japanese bread crumbs"), panko.aliasesEn)
        assertEquals(IngredientCategory.BAKING_MIXIN_AND_PANTRY, panko.category)
        assertNull(panko.defaultDensity)
        assertTrue(panko.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == pankoId })
        assertTrue(breadcrumbs.aliasesFr.none { it.contains("panko", ignoreCase = true) })
        assertTrue(breadcrumbs.aliasesEn.none { it.contains("panko", ignoreCase = true) })

        assertEquals(3, pankoLines.size)
        assertTrue(pankoLines.all { it.ingredientRefId == pankoId })
        assertTrue(pankoLines.all { it.ingredientName == "panko bread crumbs" })
        assertEquals(listOf(pankoId), index.filter("panko").map { it.id })
        assertEquals(listOf(pankoId), index.filter("chapelure japonaise").map { it.id })
        assertEquals(listOf(pankoId), index.filter("Japanese breadcrumbs").map { it.id })
        assertEquals(listOf(pankoId), index.filter("panko bread crumbs").map { it.id })
        assertEquals(setOf(breadcrumbs.id, pankoId), index.filter("breadcrumbs").map { it.id }.toSet())
        assertEquals(listOf(breadcrumbs.id), index.filter("dried bread crumbs").map { it.id })

        val crabBalls = pankoLines.single { it.originalText == "1 cup panko bread crumbs" && it.group == "Crab balls" }
        assertEquals(1.0, crabBalls.quantity!!, 0.0)
        assertEquals("cup", crabBalls.unit)
        assertEquals("panko", crabBalls.preparation?.en)
        val calamari = pankoLines.single { it.originalText == "1/2 cup panko" }
        assertEquals(0.5, calamari.quantity!!, 0.0)
        assertEquals("cup", calamari.unit)
        assertEquals("panko", calamari.preparation?.en)
        val chickenParmesan = pankoLines.single { it.originalText == "1 cup panko bread crumbs" && it.notes?.en == "panko" }
        assertEquals(1.0, chickenParmesan.quantity!!, 0.0)
        assertEquals("cup", chickenParmesan.unit)
        assertEquals("panko", chickenParmesan.notes?.en)
    }

    @Test
    fun bundledCreamOfTartarAliasesRemainSeparateFromOtherLeaveners() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val references = library.ingredientReferences.associateBy { it.id }
        val creamOfTartar = references.getValue("ingredient-ref-cream-of-tartar")

        assertEquals("crème de tartre", creamOfTartar.nameFr)
        assertEquals("cream of tartar", creamOfTartar.nameEn)
        assertEquals(
            listOf("hydrogénotartrate de potassium", "tartrate acide de potassium", "tartrate monopotassique"),
            creamOfTartar.aliasesFr,
        )
        assertEquals(listOf("potassium acid tartrate", "potassium bitartrate"), creamOfTartar.aliasesEn)
        assertNull(creamOfTartar.defaultDensity)
        assertTrue(creamOfTartar.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == creamOfTartar.id })

        assertEquals(listOf(creamOfTartar.id), index.filter("potassium acid tartrate").map { it.id })
        assertEquals(listOf(creamOfTartar.id), index.filter("tartrate acide de potassium").map { it.id })
        assertEquals(listOf(creamOfTartar.id), index.filter("potassium bitartrate").map { it.id })
        assertEquals(listOf("ingredient-ref-baking-soda"), index.filter("bicarbonate de soude").map { it.id })
        assertEquals(listOf("ingredient-ref-baking-powder"), index.filter("baking powder").map { it.id })
        assertFalse(creamOfTartar.aliasesEn.contains("potassium tartrate"))
        assertFalse(creamOfTartar.aliasesEn.contains("tartaric acid"))
    }

    @Test
    fun bundledBakingSodaAndPowderKeepSeparateIdentityWithSourceBackedAliases() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val soda = library.ingredientReferences.single { it.id == "ingredient-ref-baking-soda" }
        val powder = library.ingredientReferences.single { it.id == "ingredient-ref-baking-powder" }

        assertEquals("bicarbonate de soude", soda.nameFr)
        assertEquals("baking soda", soda.nameEn)
        assertEquals(
            listOf("soda à pâte", "petite vache", "bicarbonate de sodium", "carbonate acide de sodium", "hydrogénocarbonate de sodium"),
            soda.aliasesFr,
        )
        assertEquals(listOf("bicarbonate of soda", "sodium bicarbonate"), soda.aliasesEn)
        assertEquals("poudre à pâte", powder.nameFr)
        assertEquals("baking powder", powder.nameEn)
        assertEquals(listOf("levure chimique", "poudre levante", "poudre à lever"), powder.aliasesFr)
        assertEquals(IngredientCategory.BAKING_AND_SPICE, soda.category)
        assertEquals(IngredientCategory.BAKING_AND_SPICE, powder.category)
        assertNull(soda.defaultDensity)
        assertNull(powder.defaultDensity)
        assertTrue(soda.unitMappings.isEmpty())
        assertTrue(powder.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == soda.id || it.ingredientRefId == powder.id })

        assertEquals(listOf(soda.id), index.filter("sodium bicarbonate").map { it.id })
        assertEquals(listOf(soda.id), index.filter("hydrogénocarbonate de sodium").map { it.id })
        assertEquals(listOf(powder.id), index.filter("levure chimique").map { it.id })
        assertEquals(listOf(powder.id), index.filter("poudre levante").map { it.id })
        assertEquals(listOf(soda.id), index.filter("bicarbonate de soude").map { it.id })
        assertEquals(listOf(powder.id), index.filter("baking powder").map { it.id })
    }

    @Test
    fun bundledCrumbProductsKeepDistinctIdentityAndShowSelectableSearchCandidates() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val refs = library.ingredientReferences.associateBy { it.id }
        val crackerCrumbs = refs.getValue("ingredient-ref-cracker-crumbs")
        val croutons = refs.getValue("ingredient-ref-croutons")
        val matzoMeal = refs.getValue("ingredient-ref-matzo-meal")
        val genericBreadcrumbs = refs.getValue("ingredient-ref-breadcrumbs")
        val grahamCrumbs = refs.getValue("ingredient-ref-graham-cracker-crumbs")
        val panko = refs.getValue("ingredient-ref-panko")
        val identityIds = setOf(crackerCrumbs.id, croutons.id, matzoMeal.id)

        assertEquals("chapelure de craquelins", crackerCrumbs.nameFr)
        assertEquals("cracker crumbs", crackerCrumbs.nameEn)
        assertEquals(listOf("cracker meal"), crackerCrumbs.aliasesEn)
        assertEquals("croûtons", croutons.nameFr)
        assertEquals("croutons", croutons.nameEn)
        assertEquals(listOf("croûton"), croutons.aliasesFr)
        assertEquals(listOf("crouton", "stuffing croutons"), croutons.aliasesEn)
        assertEquals("farine de pain azyme", matzoMeal.nameFr)
        assertEquals("matzo meal", matzoMeal.nameEn)
        assertEquals(listOf("matzoh meal", "matza meal", "matzah meal"), matzoMeal.aliasesEn)
        assertTrue(matzoMeal.aliasesFr.isEmpty())
        assertTrue(identityIds.all { id -> refs.getValue(id).category == IngredientCategory.BAKING_MIXIN_AND_PANTRY })
        assertTrue(identityIds.all { id -> refs.getValue(id).defaultDensity == null && refs.getValue(id).unitMappings.isEmpty() })
        assertTrue(library.ingredientForms.none { it.ingredientRefId in identityIds })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in identityIds })

        assertEquals(listOf(crackerCrumbs.id), index.filter("chapelure de craquelins").map { it.id })
        assertEquals(listOf(crackerCrumbs.id), index.filter("cracker meal").map { it.id })
        assertEquals(setOf(crackerCrumbs.id, grahamCrumbs.id), index.filter("cracker crumbs").map { it.id }.toSet())
        assertEquals(listOf(croutons.id), index.filter("croûton").map { it.id })
        assertEquals(listOf(croutons.id), index.filter("croutons").map { it.id })
        assertEquals(listOf(matzoMeal.id), index.filter("matzoh meal").map { it.id })
        assertEquals(listOf(matzoMeal.id), index.filter("matzah meal").map { it.id })
        assertEquals(listOf(matzoMeal.id), index.filter("farine de pain azyme").map { it.id })
        assertTrue(index.filter("matzo").map { it.id }.contains(matzoMeal.id))
        assertEquals(listOf(genericBreadcrumbs.id), index.filter("chapelure").map { it.id })
        assertEquals(
            setOf(genericBreadcrumbs.id, panko.id, crackerCrumbs.id, grahamCrumbs.id),
            index.filter("crumbs").map { it.id }.toSet(),
        )
        assertTrue(index.filter("bread cubes").isEmpty())
    }

    @Test
    fun bundledTortillasAndFlatbreadsKeepBreadProductBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val references = library.ingredientReferences.associateBy { it.id }
        val cornId = "ingredient-ref-corn-tortillas"
        val flourId = "ingredient-ref-flour-tortillas"
        val pitaId = "ingredient-ref-pita-bread"
        val lavashId = "ingredient-ref-lavash-bread"
        val identityIds = setOf(cornId, flourId, pitaId, lavashId)
        val corn = references.getValue(cornId)
        val flour = references.getValue(flourId)
        val pita = references.getValue(pitaId)
        val lavash = references.getValue(lavashId)

        assertEquals("corn tortillas", corn.nameEn)
        assertEquals("tortillas de maïs", corn.nameFr)
        assertEquals(listOf("corn tortilla"), corn.aliasesEn)
        assertEquals(listOf("tortilla de maïs", "tortillas au maïs", "tortilla au maïs"), corn.aliasesFr)
        assertEquals("flour tortillas", flour.nameEn)
        assertEquals("tortillas de farine", flour.nameFr)
        assertEquals(listOf("flour tortilla"), flour.aliasesEn)
        assertEquals(
            listOf("tortilla de farine", "tortillas de farine de blé", "tortilla de farine de blé"),
            flour.aliasesFr,
        )
        assertEquals("pita bread", pita.nameEn)
        assertEquals("pain pita", pita.nameFr)
        assertTrue(pita.aliasesEn.isEmpty() && pita.aliasesFr.isEmpty())
        assertEquals("lavash bread", lavash.nameEn)
        assertEquals("pain lavash", lavash.nameFr)
        assertTrue(lavash.aliasesEn.isEmpty() && lavash.aliasesFr.isEmpty())

        assertTrue(identityIds.all { id ->
            val reference = references.getValue(id)
            reference.category == IngredientCategory.BAKING_MIXIN_AND_PANTRY &&
                reference.defaultDensity == null && reference.unitMappings.isEmpty()
        })
        assertTrue(library.ingredientForms.none { it.ingredientRefId in identityIds })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in identityIds })
        val formsById = library.ingredientForms.associateBy { it.id }
        assertTrue(library.substitutionRules.none { rule ->
            formsById.getValue(rule.fromFormId).ingredientRefId in identityIds ||
                formsById.getValue(rule.toFormId).ingredientRefId in identityIds
        })
        assertTrue(library.contextualSubstitutionRules.none {
            it.fromIngredientRefId in identityIds || it.toIngredientRefId in identityIds
        })

        fun assertReference(query: String, id: String) {
            assertEquals("query: $query", listOf(id), index.filter(query).map { it.id })
        }
        assertReference("corn tortillas", cornId)
        assertReference("corn tortilla", cornId)
        assertReference("tortillas de maïs", cornId)
        assertReference("tortilla au maïs", cornId)
        assertReference("flour tortillas", flourId)
        assertReference("flour tortilla", flourId)
        assertReference("tortillas de farine", flourId)
        assertReference("tortilla de farine de blé", flourId)
        assertReference("pita bread", pitaId)
        assertReference("pain pita", pitaId)
        assertReference("lavash bread", lavashId)
        assertReference("pain lavash", lavashId)
        assertEquals(setOf(cornId, flourId), index.filter("tortilla").map { it.id }.toSet())
        assertEquals(setOf(cornId, flourId), index.filter("tortillas").map { it.id }.toSet())
        listOf("tortilla chips", "pita chips", "lavash crackers", "flatbread", "pain plat", "wrap")
            .forEach { query -> assertTrue("unexpected bread match for $query", index.filter(query).none { it.id in identityIds }) }
    }

    @Test
    fun bundledStrawberryPureeIsSeparateFromFreshFruitAndKeepsRecipePreparation() {
        val library = loadBundledPayload().toDomainLibrary()
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val pureeId = "ingredient-ref-strawberry-puree"
        val puree = library.ingredientReferences.single { it.id == pureeId }
        val strawberries = library.ingredientReferences.single { it.id == "ingredient-ref-strawberries" }
        val recipe = library.recipes.single { it.id == "eadf54de-0fa2-4ef3-a620-3f6fbeac7c90" }
        val freshFruitLine = recipe.ingredients.single {
            it.id == "eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-1"
        }
        val reducedPureeLine = recipe.ingredients.single {
            it.id == "eadf54de-0fa2-4ef3-a620-3f6fbeac7c90-ingredient-12"
        }

        assertEquals("purée de fraises", puree.nameFr)
        assertEquals("strawberry puree", puree.nameEn)
        assertTrue(puree.aliasesFr.isEmpty() && puree.aliasesEn.isEmpty())
        assertEquals(IngredientCategory.FRUIT, puree.category)
        assertNull(puree.defaultDensity)
        assertTrue(puree.unitMappings.isEmpty())
        assertTrue(library.ingredientForms.none { it.ingredientRefId == pureeId })

        assertEquals(strawberries.id, freshFruitLine.ingredientRefId)
        assertEquals("ingredient-ref-strawberry-puree", reducedPureeLine.ingredientRefId)
        assertEquals("1/2 cup reduced strawberry puree", reducedPureeLine.originalText)
        assertEquals("reduced strawberry puree", reducedPureeLine.ingredientName)
        assertEquals(0.5, reducedPureeLine.quantity!!, 0.0)
        assertEquals("cup", reducedPureeLine.unit)
        assertEquals("Cake", reducedPureeLine.group)
        assertEquals("reduced", reducedPureeLine.preparation?.en)
        assertEquals("réduite", reducedPureeLine.preparation?.fr)

        assertEquals(listOf(pureeId), index.filter("strawberry puree").map { it.id })
        assertEquals(listOf(pureeId), index.filter("purée de fraises").map { it.id })
        assertEquals(
            setOf(strawberries.id, "ingredient-ref-freeze-dried-strawberries", "ingredient-ref-honey-bunches-of-oats-with-real-strawberries-cereal"),
            index.filter("strawberries").map { it.id }.toSet(),
        )
        assertFalse(index.filter("strawberries").any { it.id == pureeId })
        assertTrue(index.filter("reduced strawberry puree").none { it.id == pureeId })
        assertTrue(index.filter("fruit sauce").none { it.id == pureeId })
    }

    @Test
    fun bundledSeedPackage_residualPulseAndLupinFloursStayIdentityOnlyAndSearchable() {
        val library = loadBundledPayload().toDomainLibrary()
        val references = library.ingredientReferences.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val expected = mapOf(
            "ingredient-ref-green-lentil-flour" to ("green lentil flour" to "farine de lentilles vertes"),
            "ingredient-ref-yellow-pea-flour" to ("yellow pea flour" to "farine de pois jaune"),
            "ingredient-ref-partially-defatted-peanut-flour" to (
                "partially defatted peanut flour" to "farine d’arachide partiellement dégraissée"
            ),
            "ingredient-ref-sweet-lupin-flour" to ("sweet lupin flour" to "farine de lupin blanc"),
            "ingredient-ref-sweet-blue-lupin-flour" to (
                "sweet blue lupin flour" to "farine de lupin à feuilles étroites"
            ),
        )
        val identityIds = expected.keys

        assertEquals(identityIds, references.keys.intersect(identityIds))
        expected.forEach { (id, names) ->
            val (nameEn, nameFr) = names
            val reference = references.getValue(id)
            assertEquals(IngredientCategory.FLOUR_AND_STARCH, reference.category)
            assertEquals(nameEn, reference.nameEn)
            assertEquals(nameFr, reference.nameFr)
            assertTrue(reference.aliasesEn.isEmpty())
            assertTrue(reference.aliasesFr.isEmpty())
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
            assertEquals(listOf(id), index.filter(nameEn).map { it.id })
            assertEquals(listOf(id), index.filter(nameFr).map { it.id })
        }
        assertTrue(library.ingredientForms.none { it.ingredientRefId in identityIds })
        assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId in identityIds })
    }

    @Test
    fun wp06CuisineGapIdentitiesKeepBilingualSearchAndRegionalBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val references = library.ingredientReferences.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val addedIds = setOf(
            "ingredient-ref-five-spice-powder",
            "ingredient-ref-matcha",
            "ingredient-ref-indian-gooseberry",
            "ingredient-ref-khoya",
            "ingredient-ref-anardana",
            "ingredient-ref-thai-basil",
            "ingredient-ref-vietnamese-coriander",
            "ingredient-ref-yardlong-bean",
            "ingredient-ref-toasted-rice-powder",
        )

        val expected = mapOf(
            "ingredient-ref-five-spice-powder" to Triple("five-spice powder", "cinq épices chinoises", IngredientCategory.BAKING_AND_SPICE),
            "ingredient-ref-matcha" to Triple("matcha", "matcha", IngredientCategory.OTHER),
            "ingredient-ref-indian-gooseberry" to Triple("Indian gooseberry", "groseille indienne", IngredientCategory.FRUIT),
            "ingredient-ref-khoya" to Triple("khoya", "khoya", IngredientCategory.DAIRY_AND_ALTERNATIVE),
            "ingredient-ref-anardana" to Triple("anardana", "graines entières de grenade anardana", IngredientCategory.BAKING_AND_SPICE),
            "ingredient-ref-thai-basil" to Triple("Thai basil", "basilic thaï", IngredientCategory.HERB),
            "ingredient-ref-vietnamese-coriander" to Triple("Vietnamese coriander", "coriandre vietnamienne", IngredientCategory.HERB),
            "ingredient-ref-yardlong-bean" to Triple("yardlong bean", "dolique asperge", IngredientCategory.VEGETABLE_AND_AROMATIC),
            "ingredient-ref-toasted-rice-powder" to Triple("toasted rice powder", "poudre de riz rôti", IngredientCategory.BAKING_AND_SPICE),
        )
        assertEquals(addedIds, references.keys.intersect(addedIds))
        expected.forEach { (id, names) ->
            val reference = references.getValue(id)
            assertEquals(names.first, reference.nameEn)
            assertEquals(names.second, reference.nameFr)
            assertEquals(names.third, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
            assertTrue(library.ingredientForms.none { it.ingredientRefId == id })
            assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == id })
        }

        assertTrue(references.getValue("ingredient-ref-five-spice-powder").aliasesEn.isEmpty())
        assertTrue(references.getValue("ingredient-ref-five-spice-powder").aliasesFr.isEmpty())
        assertEquals(listOf("thé matcha"), references.getValue("ingredient-ref-matcha").aliasesFr)
        assertEquals(listOf("amla"), references.getValue("ingredient-ref-indian-gooseberry").aliasesEn)
        assertEquals(listOf("khoa", "mawa"), references.getValue("ingredient-ref-khoya").aliasesEn)
        assertEquals(listOf("anar dana"), references.getValue("ingredient-ref-anardana").aliasesEn)
        assertTrue(references.getValue("ingredient-ref-vietnamese-coriander").aliasesEn.isEmpty())
        assertTrue(references.getValue("ingredient-ref-vietnamese-coriander").aliasesFr.isEmpty())

        val yardlong = references.getValue("ingredient-ref-yardlong-bean")
        assertEquals(listOf("asparagus bean", "Chinese long bean"), yardlong.aliasesEn)
        assertEquals(listOf("dolic asperge", "haricot vert chinois", "dolique à longue cosse"), yardlong.aliasesFr)
        assertEquals(listOf(yardlong.id), index.filter("Chinese long bean").map { it.id })
        assertTrue(index.filter("green beans").none { it.id == yardlong.id })

        val expectedSearches = mapOf(
            "five-spice powder" to "ingredient-ref-five-spice-powder",
            "cinq épices chinoises" to "ingredient-ref-five-spice-powder",
            "thé matcha" to "ingredient-ref-matcha",
            "amla" to "ingredient-ref-indian-gooseberry",
            "groseille indienne" to "ingredient-ref-indian-gooseberry",
            "mawa" to "ingredient-ref-khoya",
            "anar dana" to "ingredient-ref-anardana",
            "basilic thaï" to "ingredient-ref-thai-basil",
            "coriandre vietnamienne" to "ingredient-ref-vietnamese-coriander",
            "dolique à longue cosse" to "ingredient-ref-yardlong-bean",
            "khao khua" to "ingredient-ref-toasted-rice-powder",
        )
        expectedSearches.forEach { (query, id) ->
            assertEquals(query, listOf(id), index.filter(query).map { it.id })
        }

        assertTrue(index.filter("panch phoron").none { it.id == "ingredient-ref-five-spice-powder" })
        assertTrue(index.filter("groseille à maquereau").none { it.id == "ingredient-ref-indian-gooseberry" })
        assertTrue(index.filter("rau ram").none { it.id == "ingredient-ref-vietnamese-coriander" })
        assertTrue(index.filter("rice flour").none { it.id == "ingredient-ref-toasted-rice-powder" })
    }

    @Test
    fun wp02Wp03Wp04ResidualIdentitiesKeepProductBoundaries() {
        val library = loadBundledPayload().toDomainLibrary()
        val references = library.ingredientReferences.associateBy { it.id }
        val index = IngredientReferenceSearchIndex(library.ingredientReferences, library.ingredientForms)
        val expected = mapOf(
            "ingredient-ref-crude-stevia-extract" to Triple(
                "crude aqueous stevia-leaf extract",
                "extrait aqueux brut de la feuille de stévia",
                IngredientCategory.SUGAR_AND_SWEETENER,
            ),
            "ingredient-ref-monk-fruit-juice-concentrate" to Triple(
                "monk fruit juice concentrate",
                "concentré de jus de fruit de moines",
                IngredientCategory.SUGAR_AND_SWEETENER,
            ),
            "ingredient-ref-rice-paddy-herb" to Triple(
                "rice paddy herb", "herbe à paddy", IngredientCategory.HERB,
            ),
            "ingredient-ref-seitan" to Triple(
                "seitan", "seitan", IngredientCategory.PROTEIN,
            ),
            "ingredient-ref-textured-vegetable-protein" to Triple(
                "textured vegetable protein", "protéine végétale texturée", IngredientCategory.PROTEIN,
            ),
        )
        assertEquals(expected.keys, references.keys.intersect(expected.keys))
        expected.forEach { (id, names) ->
            val reference = references.getValue(id)
            assertEquals(names.first, reference.nameEn)
            assertEquals(names.second, reference.nameFr)
            assertEquals(names.third, reference.category)
            assertNull(reference.defaultDensity)
            assertTrue(reference.unitMappings.isEmpty())
            if (id != "ingredient-ref-textured-vegetable-protein") {
                assertTrue(library.ingredientForms.none { it.ingredientRefId == id })
            }
            assertTrue(library.recipes.flatMap { it.ingredients }.none { it.ingredientRefId == id })
        }

        val tvpForms = library.ingredientForms.filter {
            it.ingredientRefId == "ingredient-ref-textured-vegetable-protein"
        }
        assertEquals(setOf("balls", "flakes", "pieces", "strips"), tvpForms.map { it.formCode }.toSet())
        assertTrue(tvpForms.all { it.densityGPerMl == null && it.matchTermsEn.isEmpty() && it.matchTermsFr.isEmpty() })

        assertTrue(references.getValue("ingredient-ref-crude-stevia-extract").aliasesEn.isEmpty())
        assertTrue(references.getValue("ingredient-ref-crude-stevia-extract").aliasesFr.isEmpty())
        assertTrue(references.getValue("ingredient-ref-monk-fruit-juice-concentrate").aliasesEn.isEmpty())
        assertTrue(references.getValue("ingredient-ref-monk-fruit-juice-concentrate").aliasesFr.isEmpty())
        assertEquals(listOf("rau om"), references.getValue("ingredient-ref-rice-paddy-herb").aliasesEn)
        assertEquals(
            listOf("limnophile aromatique"),
            references.getValue("ingredient-ref-rice-paddy-herb").aliasesFr,
        )
        assertEquals(listOf("wheat meat"), references.getValue("ingredient-ref-seitan").aliasesEn)
        assertTrue(references.getValue("ingredient-ref-seitan").aliasesFr.isEmpty())
        assertEquals(
            listOf("TVP", "texturized vegetable protein", "texturised vegetable protein"),
            references.getValue("ingredient-ref-textured-vegetable-protein").aliasesEn,
        )
        assertEquals(listOf("PVT"), references.getValue("ingredient-ref-textured-vegetable-protein").aliasesFr)

        val expectedSearches = mapOf(
            "crude aqueous stevia-leaf extract" to "ingredient-ref-crude-stevia-extract",
            "extrait aqueux brut de la feuille de stévia" to "ingredient-ref-crude-stevia-extract",
            "monk fruit juice concentrate" to "ingredient-ref-monk-fruit-juice-concentrate",
            "concentré de jus de fruit de moines" to "ingredient-ref-monk-fruit-juice-concentrate",
            "rau om" to "ingredient-ref-rice-paddy-herb",
            "limnophile aromatique" to "ingredient-ref-rice-paddy-herb",
            "seitan" to "ingredient-ref-seitan",
            "wheat meat" to "ingredient-ref-seitan",
            "TVP" to "ingredient-ref-textured-vegetable-protein",
            "texturised vegetable protein" to "ingredient-ref-textured-vegetable-protein",
            "protéine végétale texturée" to "ingredient-ref-textured-vegetable-protein",
            "PVT" to "ingredient-ref-textured-vegetable-protein",
        )
        expectedSearches.forEach { (query, id) ->
            assertEquals(query, listOf(id), index.filter(query).map { it.id })
        }

        assertEquals(
            listOf("ingredient-ref-vietnamese-coriander"),
            index.filter("coriandre vietnamienne").map { it.id },
        )
        assertTrue(index.filter("rau ram").none { it.id == "ingredient-ref-rice-paddy-herb" })
        assertTrue(index.filter("textured soy protein").none { it.id == "ingredient-ref-textured-vegetable-protein" })
        assertTrue(index.filter("TSP").none { it.id == "ingredient-ref-textured-vegetable-protein" })
        assertTrue(index.filter("seitan").none { it.id == "ingredient-ref-vital-wheat-gluten" })
        assertEquals(
            listOf("ingredient-ref-monk-fruit-extract"),
            index.filter("monk fruit extract").map { it.id },
        )
        assertTrue(index.filter("allulose").isEmpty())
        assertTrue(index.filter("sweetener blend").isEmpty())

        val payload = loadBundledPayload()
        val activeIds = payload.library.ingredientReferences.map { it.id }.toSet()
        assertFalse("ingredient-ref-allulose" in activeIds)
        assertFalse("ingredient-ref-commercial-sweetener-blend" in activeIds)
    }

    private fun loadBundledPayload(): FullLibraryPayloadDto {
        val root = File("src/main/assets/seed/bundled-library")
        val manifest = json.decodeFromString(BundledSeedManifestTestDto.serializer(), File(root, "manifest.v1.json").readText())

        assertEquals("bundled-seed-package/v1", manifest.schemaVersion)
        assertEquals("bundled-library", manifest.packageId)
        assertFalse(manifest.packageId.contains("boite", ignoreCase = true))

        return FullLibraryPayloadDto(
            schemaVersion = SchemaVersions.FULL_LIBRARY_V1,
            library = LibraryDto(
                metadata = json.decodeFromString(LibraryMetadataDto.serializer(), File(root, manifest.metadataFile).readText()),
                recipes = manifest.recipeFiles.map { recipeFile ->
                    json.decodeFromString(RecipeDto.serializer(), File(root, recipeFile).readText())
                },
                ingredientReferences = json.decodeFromString(
                    ListSerializer(IngredientReferenceDto.serializer()),
                    File(root, manifest.ingredientReferencesFile).readText()
                ),
                ingredientForms = json.decodeFromString(
                    ListSerializer(IngredientFormDto.serializer()),
                    File(root, manifest.ingredientFormsFile).readText()
                ),
                substitutionRules = json.decodeFromString(
                    ListSerializer(SubstitutionRuleDto.serializer()),
                    File(root, manifest.substitutionRulesFile).readText()
                ),
                contextualSubstitutionRules = json.decodeFromString(
                    ListSerializer(ContextualSubstitutionRuleDto.serializer()),
                    File(root, manifest.contextualSubstitutionRulesFile).readText()
                ),
                units = json.decodeFromString(ListSerializer(UnitDefinitionDto.serializer()), File(root, manifest.unitsFile).readText()),
                tags = json.decodeFromString(ListSerializer(TagDto.serializer()), File(root, manifest.tagsFile).readText()),
                collections = json.decodeFromString(ListSerializer(CollectionDto.serializer()), File(root, manifest.collectionsFile).readText()),
                settings = json.decodeFromString(LibrarySettingsDto.serializer(), File(root, manifest.settingsFile).readText())
            )
        )
    }
}

private fun String.normalizedKey(): String = trim().lowercase()

private fun assertUnique(values: List<String>, label: String) {
    assertEquals(label, values.size, values.distinct().size)
}

@kotlinx.serialization.Serializable
private data class BundledSeedManifestTestDto(
    val schemaVersion: String,
    val packageId: String,
    val metadataFile: String,
    val recipeFiles: List<String>,
    val ingredientReferencesFile: String,
    val ingredientFormsFile: String,
    val substitutionRulesFile: String,
    val contextualSubstitutionRulesFile: String,
    val unitsFile: String,
    val tagsFile: String,
    val collectionsFile: String,
    val settingsFile: String
)
