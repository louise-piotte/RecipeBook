package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.TagCategory
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class BundledTagCatalogTest {

    @Test
    fun tagCategory_localizedName_returnsExpectedLabels() {
        assertEquals("Appareil", TagCategory.APPLIANCE.localizedName(AppLanguage.FR))
        assertEquals("Seasonal", TagCategory.SEASONAL.localizedName(AppLanguage.EN))
        assertEquals("Serving Context", TagCategory.SERVING_CONTEXT.localizedName(AppLanguage.EN))
        assertEquals("Other", TagCategory.OTHER.localizedName(AppLanguage.EN))
    }

    @Test
    fun bundledTagCatalog_containsExpectedBuiltInTags() {
        val tags = BundledTagCatalog.tags

        assertTrue(tags.any { it.id == "tag-dessert" && it.category == TagCategory.DISH_TYPE && it.nameEn == "Dessert" })
        assertTrue(tags.any { it.id == "tag-air-fryer" && it.category == TagCategory.APPLIANCE })
        assertTrue(tags.any { it.id == "tag-meal-prep" && it.category == TagCategory.SERVING_CONTEXT })
        assertTrue(tags.any { it.id == "tag-spice-blend" && it.category == TagCategory.USE_CASE })
    }
}