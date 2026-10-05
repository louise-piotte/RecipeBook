package app.recipebook.domain.localization

import app.recipebook.domain.model.AppLanguage
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test

class IngredientPresentationTest {
    @Test fun qualifiedCountsKeepSizeAndUseOnePluralNounPhraseInBothLanguages() {
        assertEquals("2 large egg whites", formatIngredientBase(2.0, "large egg white", "egg white", AppLanguage.EN))
        assertEquals("2 blancs de gros œufs", formatIngredientBase(2.0, "large egg white", "blanc d'œuf", AppLanguage.FR))
        assertEquals("1 blanc de gros œuf", formatIngredientBase(1.0, "large egg white", "blanc d'œuf", AppLanguage.FR))
        assertEquals("3 large eggs", formatIngredientBase(3.0, "large egg", "egg", AppLanguage.EN))
        assertEquals("3 gros œufs", formatIngredientBase(3.0, "large egg", "œuf", AppLanguage.FR))
        assertEquals("2 jaunes de gros œufs", formatIngredientBase(2.0, "large egg yolk", "jaune d'œuf", AppLanguage.FR))
        assertEquals("0,5 grosse banane", formatIngredientBase(0.5, "large banana", "banane", AppLanguage.FR))
        assertEquals("2 oignons moyens", formatIngredientBase(2.0, "medium onion", "oignon", AppLanguage.FR))
        assertEquals("20 medjool dates", formatIngredientBase(20.0, "date", "medjool dates", AppLanguage.EN))
        assertEquals("20 dattes medjool", formatIngredientBase(20.0, "date", "dattes medjool", AppLanguage.FR))
        assertEquals("2 racks of ribs", formatIngredientBase(2.0, "rack", "rack of ribs", AppLanguage.EN))
    }
    @Test fun agreementTracksScaledCountWithoutChangingFreeText() {
        assertEquals("légèrement battus", formatIngredientPreparation("légèrement battu", 2.0, "large egg white", "blanc d'œuf", AppLanguage.FR))
        assertEquals("légèrement battu", formatIngredientPreparation("légèrement battus", 1.0, "large egg white", "blanc d'œuf", AppLanguage.FR))
        assertEquals("très mûre", formatIngredientPreparation("très mûr", 0.5, "large banana", "banane", AppLanguage.FR))
        assertEquals("très mûres", formatIngredientPreparation("très mûr", 2.0, "large banana", "banane", AppLanguage.FR))
        assertEquals("battre pendant 2 min", formatIngredientPreparation("battre pendant 2 min", 2.0, "large egg", "œuf", AppLanguage.FR))
    }
    @Test fun massAndVolumeNamesAmountsUnitsAndPreparationRemainUnchanged() {
        for (unit in listOf("g", "kg", "oz", "lb", "ml", "l", "fl oz", "cup", "tbsp", "tsp")) {
            assertFalse(isCountIngredientUnit(unit))
            for (language in AppLanguage.entries) {
                val name = if (language == AppLanguage.EN) "egg white" else "blanc d'œuf"
                assertEquals("${formatIngredientAmount(2.0, unit, language)} $name", formatIngredientBase(2.0, unit, name, language))
                assertEquals("légèrement battu", formatIngredientPreparation("légèrement battu", 2.0, unit, name, AppLanguage.FR))
            }
        }
    }
    @Test fun aCountUnitNeverReplacesADifferentIngredientIdentity() {
        assertEquals("2 large egg white custard", formatIngredientBase(2.0, "large egg white", "custard", AppLanguage.EN))
        assertEquals("2 large egg white duck egg white", formatIngredientBase(2.0, "large egg white", "duck egg white", AppLanguage.EN))
    }
    @Test fun countUnitsNormalizeFrenchAndPluralAliasesWithoutLosingConversions() {
        assertEquals("large egg white", "blancs de gros œufs".normalizeIngredientUnit())
        assertEquals("large egg white", "large egg whites".normalizeIngredientUnit())
        assertEquals("can", "boîtes".normalizeIngredientUnit())
        assertEquals("2 cans", formatIngredientAmount(2.0, "cans", AppLanguage.EN))
        assertEquals("2 boîtes", formatIngredientAmount(2.0, "boîtes", AppLanguage.FR))
        assertEquals("2 gousses", formatIngredientAmount(2.0, "cloves", AppLanguage.FR))
        assertEquals("4 gousses d'ail", formatIngredientBase(4.0, "clove", "ail", AppLanguage.FR))
        assertEquals("2 boîtes de pois chiches", formatIngredientBase(2.0, "can", "pois chiches", AppLanguage.FR))
        assertEquals("2 dates", formatIngredientBase(2.0, "date", "date", AppLanguage.EN))
    }
}
