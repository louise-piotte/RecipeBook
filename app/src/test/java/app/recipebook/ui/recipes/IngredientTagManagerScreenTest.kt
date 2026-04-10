package app.recipebook.ui.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.SubstitutionRiskLevel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertSame
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

    @Test
    fun availableIngredientSubstitutionTargets_excludesSourceAndMatchesAliases() {
        val source = IngredientReference(
            id = "ingredient-ref-butter",
            nameFr = "Beurre non sal\u00e9",
            nameEn = "Unsalted butter",
            updatedAt = "2026-04-10T00:00:00Z"
        )
        val candidate = IngredientReference(
            id = "ingredient-ref-salted-butter",
            nameFr = "Beurre sal\u00e9",
            nameEn = "Salted butter",
            aliasesEn = listOf("table butter"),
            updatedAt = "2026-04-10T00:00:00Z"
        )

        val filtered = availableIngredientSubstitutionTargets(
            ingredientReferences = listOf(source, candidate),
            sourceIngredientRefId = source.id,
            query = "table butter"
        )

        assertEquals(1, filtered.size)
        assertEquals(candidate.id, filtered.single().id)
    }

    @Test
    fun validateIngredientSubstitutionDraft_requiresWarningsForHighRiskRules() {
        val missingFrenchWarning = validateIngredientSubstitutionDraft(
            targetIngredientRefId = "ingredient-ref-cornstarch",
            ratioText = "0.5",
            riskLevel = SubstitutionRiskLevel.HIGH_RISK,
            warningTextFr = "",
            warningTextEn = "Use only for sauces."
        )
        val valid = validateIngredientSubstitutionDraft(
            targetIngredientRefId = "ingredient-ref-cornstarch",
            ratioText = "0.5",
            riskLevel = SubstitutionRiskLevel.HIGH_RISK,
            warningTextFr = "Utiliser seulement pour les sauces.",
            warningTextEn = "Use only for sauces."
        )

        assertSame(IngredientSubstitutionValidationError.MissingWarningFr, missingFrenchWarning)
        assertNull(valid)
    }
}


