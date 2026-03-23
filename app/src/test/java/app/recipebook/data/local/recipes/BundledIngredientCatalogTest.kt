package app.recipebook.data.local.recipes

import app.recipebook.domain.model.IngredientCategory
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class BundledIngredientCatalogTest {

    @Test
    fun bundledCatalog_usesAccentsAndApostrophesInLocalizedIngredientText() {
        val catalog = BundledIngredientCatalog.references.associateBy { it.id }

        assertEquals("farine \u00E0 pain", catalog.getValue("ingredient-ref-bread-flour").nameFr)
        assertEquals("sucre \u00E0 glacer", catalog.getValue("ingredient-ref-icing-sugar").nameFr)
        assertTrue(catalog.getValue("ingredient-ref-icing-sugar").aliasesEn.contains("confectioners' sugar"))
        assertEquals("jalape\u00F1o", catalog.getValue("ingredient-ref-jalapeno").nameEn)
        assertEquals("gruy\u00E8re", catalog.getValue("ingredient-ref-gruyere").nameFr)
        assertEquals("Gruy\u00E8re", catalog.getValue("ingredient-ref-gruyere").nameEn)
        assertEquals("cr\u00E8me fra\u00EEche", catalog.getValue("ingredient-ref-creme-fraiche").nameFr)
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
        assertTrue(catalog.any { it.id == "ingredient-ref-semisweet-chocolate" && it.aliasesEn.contains("chocolate chips") })
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
    }
}