package app.recipebook.domain.localization

import app.recipebook.domain.model.AppLanguage
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class IngredientAmountsTest {
    @Test
    fun parsesDecimalsAndFractionsWithoutDependingOnLanguage() {
        listOf("1.5", "1,5", "1 1/2", "1½", "1 ½", "1\u00a01/2").forEach {
            assertEquals(it, 1.5, requireNotNull(parseRecipeQuantity(it)), 0.000001)
        }
        assertEquals(0.375, requireNotNull(parseRecipeQuantity("⅜")), 0.000001)
        assertEquals(1.0 / 3.0, requireNotNull(parseRecipeQuantity("1/3")), 0.000001)
        listOf("NaN", "Infinity", "-1", "1/0", "1/Infinity", "Infinity/2", "-1 1/2", "words", "1,2.3", "").forEach {
            assertNull(it, parseRecipeQuantity(it))
        }
    }

    @Test
    fun preservesAmountsAcrossRepeatedLanguageChangesAndFrenchUnitAliases() {
        repeat(5) {
            assertEquals("1 ½ cups", formatIngredientAmount(1.5, "tasses", AppLanguage.EN))
            assertEquals("1 ½ tasses", formatIngredientAmount(1.5, "cups", AppLanguage.FR))
            assertEquals("½ tbsp", formatIngredientAmount(0.5, "cuillère à soupe", AppLanguage.EN))
            assertEquals("½ cuillère à soupe", formatIngredientAmount(0.5, "tbsp", AppLanguage.FR))
            assertEquals("0,1 g", formatIngredientAmount(0.1, "grammes", AppLanguage.FR))
            assertEquals("0.1 g", formatIngredientAmount(0.1, "g", AppLanguage.EN))
        }
    }

    @Test
    fun preservesExplicitConversionUnitsAndSmallPositiveQuantities() {
        assertEquals("0.1 cup", formatIngredientAmount(0.1, "cup", AppLanguage.EN, preserveUnit = true))
        assertEquals("0,375 tasse", formatIngredientAmount(0.375, "cup", AppLanguage.FR, preserveUnit = true))
        assertEquals("0.01 tsp", formatIngredientAmount(0.01, "tsp", AppLanguage.EN))
        assertEquals("0", formatIngredientAmount(0.0, "count", AppLanguage.EN))
    }

    @Test
    fun formatsLargeIntegersWithoutIntOverflow() {
        assertEquals("3000000000", formatRecipeNumber(3000000000.0))
        assertEquals("1,5", formatRecipeNumber(1.5, AppLanguage.FR))
    }
}
