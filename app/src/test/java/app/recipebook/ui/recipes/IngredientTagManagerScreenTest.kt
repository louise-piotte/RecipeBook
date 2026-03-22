package app.recipebook.ui.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientReference
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class IngredientTagManagerScreenTest {

    @Test
    fun secondaryLocalizedName_returnsOtherLanguageWhenDistinct() {
        val ingredient = IngredientReference(
            id = "ingredient-ref-sugar",
            nameFr = "Sucre",
            nameEn = "Sugar",
            updatedAt = "2026-03-21T00:00:00Z"
        )

        assertEquals("Sucre", ingredient.secondaryLocalizedName(AppLanguage.EN))
        assertEquals("Sugar", ingredient.secondaryLocalizedName(AppLanguage.FR))
    }

    @Test
    fun filterManagedIngredientReferences_matchesAliasesButReturnsCanonicalIngredient() {
        val ingredient = IngredientReference(
            id = "ingredient-ref-brown-sugar",
            nameFr = "Cassonade",
            nameEn = "Brown sugar",
            aliasesFr = listOf("cassonade claire"),
            aliasesEn = listOf("light brown sugar"),
            updatedAt = "2026-03-21T00:00:00Z"
        )

        val filtered = filterManagedIngredientReferences(listOf(ingredient), "light brown sugar")

        assertEquals(1, filtered.size)
        assertEquals("ingredient-ref-brown-sugar", filtered.single().id)
        assertEquals("Brown sugar", filtered.single().nameEn)
    }

    @Test
    fun secondaryLocalizedName_hidesDuplicateNames() {
        val ingredient = IngredientReference(
            id = "ingredient-ref-tofu",
            nameFr = "Tofu",
            nameEn = "Tofu",
            updatedAt = "2026-03-21T00:00:00Z"
        )

        assertNull(ingredient.secondaryLocalizedName(AppLanguage.EN))
        assertNull(ingredient.secondaryLocalizedName(AppLanguage.FR))
    }
}


