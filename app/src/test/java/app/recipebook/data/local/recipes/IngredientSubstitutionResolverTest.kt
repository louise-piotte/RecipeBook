package app.recipebook.data.local.recipes

import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionConversionType
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.SubstitutionRule
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.domain.model.UnitScope
import app.recipebook.domain.model.ContextualSubstitutionRule
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class IngredientSubstitutionResolverTest {

    @Test
    fun resolveIngredientSubstitutions_returnsSafeFormSubstitutionWithConvertedAmount() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-chickpeas",
            originalText = "1 can chickpeas, drained",
            quantity = 1.0,
            unit = "can",
            ingredientName = "chickpeas"
        )
        val catalog = IngredientSubstitutionCatalog(
            ingredientForms = listOf(
                IngredientForm(
                    id = "form-canned",
                    ingredientRefId = "ingredient-ref-chickpeas",
                    formCode = "canned_drained",
                    labelFr = "pois chiches en conserve, rinc\u00e9s et \u00e9goutt\u00e9s",
                    labelEn = "canned chickpeas, drained",
                    matchTermsFr = listOf("conserve"),
                    matchTermsEn = listOf("can", "canned", "drained"),
                    updatedAt = "2026-04-10T00:00:00Z"
                ),
                IngredientForm(
                    id = "form-dried",
                    ingredientRefId = "ingredient-ref-chickpeas",
                    formCode = "dried",
                    labelFr = "pois chiches secs",
                    labelEn = "dried chickpeas",
                    matchTermsFr = listOf("secs"),
                    matchTermsEn = listOf("dried"),
                    updatedAt = "2026-04-10T00:00:00Z"
                )
            ),
            substitutionRules = listOf(
                SubstitutionRule(
                    id = "rule-canned-to-dried",
                    fromFormId = "form-canned",
                    toFormId = "form-dried",
                    conversionType = SubstitutionConversionType.RATIO,
                    ratio = 155.0,
                    sourceUnitScope = UnitScope.PACKAGE,
                    targetUnitScope = UnitScope.MASS,
                    confidence = SubstitutionConfidence.TESTED,
                    riskLevel = SubstitutionRiskLevel.SAFE,
                    roundingPolicy = "nearest_5g",
                    notesFr = "1 canette standard de 14 oz, \u00e9goutt\u00e9e",
                    notesEn = "Uses one standard 14 oz can, drained",
                    updatedAt = "2026-04-10T00:00:00Z"
                )
            )
        )

        val suggestions = resolveIngredientSubstitutions(
            ingredient = ingredient,
            recipe = sampleRecipe(ingredient),
            tags = emptyList(),
            ingredientReferences = listOf(
                IngredientReference(
                    id = "ingredient-ref-chickpeas",
                    nameFr = "pois chiches",
                    nameEn = "chickpeas",
                    updatedAt = "2026-04-10T00:00:00Z"
                )
            ),
            catalog = catalog
        )

        assertEquals(1, suggestions.size)
        assertEquals("dried chickpeas", suggestions.single().displayNameEn)
        assertEquals(155.0, suggestions.single().quantity!!, 0.001)
        assertEquals("g", suggestions.single().unit)
        assertEquals(SubstitutionRiskLevel.SAFE, suggestions.single().riskLevel)
    }

    @Test
    fun resolveIngredientSubstitutions_returnsCautionContextualSubstitutionWithNotes() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-unsalted-butter",
            originalText = "1 cup unsalted butter",
            quantity = 1.0,
            unit = "cup",
            ingredientName = "unsalted butter"
        )
        val suggestions = resolveIngredientSubstitutions(
            ingredient = ingredient,
            recipe = sampleRecipe(ingredient),
            tags = emptyList(),
            ingredientReferences = listOf(
                IngredientReference(
                    id = "ingredient-ref-unsalted-butter",
                    nameFr = "beurre non sal\u00e9",
                    nameEn = "unsalted butter",
                    updatedAt = "2026-04-10T00:00:00Z"
                ),
                IngredientReference(
                    id = "ingredient-ref-salted-butter",
                    nameFr = "beurre sal\u00e9",
                    nameEn = "salted butter",
                    updatedAt = "2026-04-10T00:00:00Z"
                )
            ),
            catalog = IngredientSubstitutionCatalog(
                contextualSubstitutionRules = listOf(
                    ContextualSubstitutionRule(
                        id = "rule-butter",
                        fromIngredientRefId = "ingredient-ref-unsalted-butter",
                        toIngredientRefId = "ingredient-ref-salted-butter",
                        conversionType = SubstitutionConversionType.RATIO,
                        ratio = 1.0,
                        confidence = SubstitutionConfidence.TESTED,
                        riskLevel = SubstitutionRiskLevel.CAUTION,
                        notesFr = "R\u00e9duire le sel ajout\u00e9 dans la recette.",
                        notesEn = "Reduce the added salt elsewhere in the recipe.",
                        updatedAt = "2026-04-10T00:00:00Z"
                    )
                )
            )
        )

        assertEquals(1, suggestions.size)
        assertEquals("salted butter", suggestions.single().displayNameEn)
        assertEquals("Reduce the added salt elsewhere in the recipe.", suggestions.single().notesEn)
        assertEquals(SubstitutionRiskLevel.CAUTION, suggestions.single().riskLevel)
    }

    @Test
    fun resolveIngredientSubstitutions_blocksHighRiskContextualSubstitutionOutsideAllowedDishType() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-all-purpose-flour",
            originalText = "2 tbsp flour",
            quantity = 2.0,
            unit = "tbsp",
            ingredientName = "flour"
        )
        val sauceTag = Tag(
            id = "tag-sauce",
            nameFr = "Sauce",
            nameEn = "Sauce",
            slug = "sauce",
            category = TagCategory.DISH_TYPE
        )
        val cakeTag = sauceTag.copy(id = "tag-cake", nameFr = "G\u00e2teau", nameEn = "Cake", slug = "cake")
        val rule = ContextualSubstitutionRule(
            id = "rule-flour-cornstarch",
            fromIngredientRefId = "ingredient-ref-all-purpose-flour",
            toIngredientRefId = "ingredient-ref-cornstarch",
            conversionType = SubstitutionConversionType.RATIO,
            ratio = 0.5,
            allowedDishTypes = listOf("sauce", "gravy"),
            excludedDishTypes = listOf("cake", "pastry"),
            confidence = SubstitutionConfidence.TESTED,
            riskLevel = SubstitutionRiskLevel.HIGH_RISK,
            warningTextFr = "Utiliser seulement pour \u00e9paissir une sauce.",
            warningTextEn = "Use only to thicken a sauce.",
            updatedAt = "2026-04-10T00:00:00Z"
        )
        val ingredientReferences = listOf(
            IngredientReference(
                id = "ingredient-ref-all-purpose-flour",
                nameFr = "farine tout usage",
                nameEn = "all-purpose flour",
                updatedAt = "2026-04-10T00:00:00Z"
            ),
            IngredientReference(
                id = "ingredient-ref-cornstarch",
                nameFr = "f\u00e9cule de ma\u00efs",
                nameEn = "cornstarch",
                updatedAt = "2026-04-10T00:00:00Z"
            )
        )

        val sauceSuggestions = resolveIngredientSubstitutions(
            ingredient = ingredient,
            recipe = sampleRecipe(ingredient, tagIds = listOf("tag-sauce")),
            tags = listOf(sauceTag),
            ingredientReferences = ingredientReferences,
            catalog = IngredientSubstitutionCatalog(contextualSubstitutionRules = listOf(rule))
        )
        val cakeSuggestions = resolveIngredientSubstitutions(
            ingredient = ingredient,
            recipe = sampleRecipe(ingredient, tagIds = listOf("tag-cake")),
            tags = listOf(cakeTag),
            ingredientReferences = ingredientReferences,
            catalog = IngredientSubstitutionCatalog(contextualSubstitutionRules = listOf(rule))
        )

        assertEquals(1, sauceSuggestions.size)
        assertEquals(1.0, sauceSuggestions.single().quantity!!, 0.001)
        assertEquals("Use only to thicken a sauce.", sauceSuggestions.single().warningTextEn)
        assertTrue(cakeSuggestions.isEmpty())
    }

    private fun sampleRecipe(
        ingredient: IngredientLine,
        tagIds: List<String> = emptyList()
    ): Recipe = Recipe(
        id = "recipe-1",
        createdAt = "2026-04-10T00:00:00Z",
        updatedAt = "2026-04-10T00:00:00Z",
        languages = BilingualText(
            fr = LocalizedSystemText("Recette", "", "", ""),
            en = LocalizedSystemText("Recipe", "", "", "")
        ),
        ingredients = listOf(ingredient),
        tagIds = tagIds
    )
}
