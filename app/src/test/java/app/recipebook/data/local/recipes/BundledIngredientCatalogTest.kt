package app.recipebook.data.local.recipes

import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class BundledIngredientCatalogTest {

    @Test
    fun mergeBundledIngredientReferences_overridesExistingRecordsAndAddsCatalogEntries() {
        val bundled = listOf(
            app.recipebook.domain.model.IngredientReference(
                id = "ingredient-ref-all-purpose-flour",
                nameFr = "temp",
                nameEn = "temp",
                category = IngredientCategory.OTHER,
                updatedAt = "2026-03-01T00:00:00Z"
            ),
            app.recipebook.domain.model.IngredientReference(
                id = "ingredient-ref-butter",
                nameFr = "beurre",
                nameEn = "butter",
                category = IngredientCategory.FAT_AND_OIL,
                updatedAt = "2026-03-01T00:00:00Z"
            )
        )

        val merged = mergeBundledIngredientReferences(bundled)
        val flour = merged.first { it.id == "ingredient-ref-all-purpose-flour" }

        assertEquals("all-purpose flour", flour.nameEn)
        assertTrue(flour.aliasesEn.contains("AP flour"))
        assertEquals(IngredientCategory.FLOUR_AND_STARCH, flour.category)
        assertTrue(merged.any { it.id == "ingredient-ref-water" })
        assertFalse(merged.any { it.id == "ingredient-ref-butter" })
    }

    @Test
    fun normalizeBundledRecipes_mapsDeprecatedIngredientIdsToCanonicalOnes() {
        val recipe = Recipe(
            id = "recipe-1",
            createdAt = "2026-03-20T00:00:00Z",
            updatedAt = "2026-03-20T00:00:00Z",
            languages = BilingualText(
                fr = LocalizedSystemText("Titre", "", "", ""),
                en = LocalizedSystemText("Title", "", "", "")
            ),
            ingredients = listOf(
                IngredientLine(id = "1", ingredientRefId = "ingredient-ref-butter", originalText = "butter", ingredientName = "butter"),
                IngredientLine(id = "2", ingredientRefId = "ingredient-ref-light-brown-sugar", originalText = "light brown sugar", ingredientName = "light brown sugar"),
                IngredientLine(id = "3", ingredientRefId = "ingredient-ref-canned-chickpeas", originalText = "chickpeas", ingredientName = "chickpeas")
            )
        )

        val normalized = normalizeBundledRecipes(listOf(recipe)).single()

        assertEquals("ingredient-ref-unsalted-butter", normalized.ingredients[0].ingredientRefId)
        assertEquals("ingredient-ref-brown-sugar", normalized.ingredients[1].ingredientRefId)
        assertEquals("ingredient-ref-chickpeas", normalized.ingredients[2].ingredientRefId)
    }

    @Test
    fun bundledCatalog_usesAccentsAndApostrophesInLocalizedIngredientText() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }

        assertEquals("farine à pain", catalog.getValue("ingredient-ref-bread-flour").nameFr)
        assertEquals("sucre à glacer", catalog.getValue("ingredient-ref-icing-sugar").nameFr)
        assertTrue(catalog.getValue("ingredient-ref-icing-sugar").aliasesEn.contains("confectioners' sugar"))
        assertEquals("jalapeño", catalog.getValue("ingredient-ref-jalapeno").nameEn)
        assertEquals("gruyère", catalog.getValue("ingredient-ref-gruyere").nameFr)
        assertEquals("Gruyère", catalog.getValue("ingredient-ref-gruyere").nameEn)
        assertEquals("crème fraîche", catalog.getValue("ingredient-ref-creme-fraiche").nameFr)
    }

    @Test
    fun bundledCatalog_providesBroadConversionCoverage() {
        val catalog = BundledIngredientCatalog.references

        assertTrue(catalog.size >= 130)
        assertTrue(catalog.count { it.defaultDensity != null } >= 70)
        assertTrue(catalog.count { it.unitMappings.isNotEmpty() } >= 80)
        assertTrue(catalog.none { it.category == IngredientCategory.OTHER })
        assertTrue(catalog.any { it.id == "ingredient-ref-icing-sugar" && it.aliasesEn.contains("powdered sugar") })
        assertTrue(catalog.any { it.id == "ingredient-ref-brown-sugar" && it.aliasesEn.contains("light brown sugar") })
        assertTrue(catalog.any { it.id == "ingredient-ref-unsalted-butter" && it.aliasesEn.contains("butter") })
        assertTrue(catalog.any { it.id == "ingredient-ref-salt" && it.aliasesEn.contains("kosher salt") })
        assertTrue(catalog.any { it.id == "ingredient-ref-cheddar-cheese" && it.nameEn == "cheddar cheese" })
        assertTrue(catalog.any { it.id == "ingredient-ref-black-beans" && it.nameEn == "black beans" })
        assertTrue(catalog.any { it.id == "ingredient-ref-water" && it.unitMappings.any { mapping -> mapping.fromUnit == "fl oz" && mapping.toUnit == "ml" } })
        assertTrue(catalog.any { it.id == "ingredient-ref-smoked-paprika" && it.nameEn == "smoked paprika" })
        assertTrue(catalog.any { it.id == "ingredient-ref-unsweetened-chocolate" && it.nameEn == "unsweetened chocolate" })
        assertTrue(catalog.any { it.id == "ingredient-ref-pistachios" && it.nameEn == "pistachios" })
        assertTrue(catalog.any { it.id == "ingredient-ref-bbq-sauce" && it.nameEn == "BBQ sauce" })
        assertTrue(catalog.any { it.id == "ingredient-ref-bread-crumbs" && it.nameEn == "bread crumbs" })
        assertTrue(catalog.any { it.id == "ingredient-ref-cardamom" && it.nameEn == "ground cardamom" })
        assertTrue(catalog.any { it.id == "ingredient-ref-allspice" && it.nameEn == "allspice" })
        assertTrue(catalog.any { it.id == "ingredient-ref-curry-powder" && it.nameEn == "curry powder" })
        assertTrue(catalog.any { it.id == "ingredient-ref-chipotle-in-adobo" && it.nameEn == "chipotle in adobo" })
        assertTrue(catalog.any { it.id == "ingredient-ref-white-vinegar" && it.nameEn == "white vinegar" })
        assertTrue(catalog.any { it.id == "ingredient-ref-five-spice-powder" && it.nameEn == "five-spice powder" })
        assertTrue(catalog.any { it.id == "ingredient-ref-apple" && it.nameEn == "apple" })
        assertTrue(catalog.any { it.id == "ingredient-ref-lentils" && it.nameEn == "lentils" })
        assertTrue(catalog.any { it.id == "ingredient-ref-mozzarella" && it.nameEn == "mozzarella" })
        assertTrue(catalog.any { it.id == "ingredient-ref-flour-tortillas" && it.nameEn == "flour tortillas" })
        assertTrue(catalog.any { it.id == "ingredient-ref-tahini" && it.nameEn == "tahini" })
        assertTrue(catalog.any { it.id == "ingredient-ref-broth-concentrate" && it.nameEn == "broth concentrate" && it.category == IngredientCategory.STOCK_AND_BROTH })
        assertTrue(catalog.any { it.id == "ingredient-ref-all-purpose-flour" && it.unitMappings.any { mapping -> mapping.fromUnit == "cup" && mapping.toUnit == "g" && mapping.factor == 120.0 } })
        assertFalse(catalog.any { it.id == "ingredient-ref-light-brown-sugar" })
        assertFalse(catalog.any { it.id == "ingredient-ref-fine-salt" })
        assertFalse(catalog.any { it.id == "ingredient-ref-kosher-salt" })
        assertFalse(catalog.any { it.id == "ingredient-ref-butter" })
        assertFalse(catalog.any { it.id == "ingredient-ref-cold-unsalted-butter" })
    }
}













