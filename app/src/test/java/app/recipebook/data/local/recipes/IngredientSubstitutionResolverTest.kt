package app.recipebook.data.local.recipes

import app.recipebook.loadBundledUnitDefinitionsForTest
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.ContextualSubstitutionRule
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientLineSubstitution
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
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class IngredientSubstitutionResolverTest {

    @Test
    fun formRuleRequiresSelectedFormAndNormalizesMixedUnitsAndBounds() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-chickpeas",
            ingredientFormId = "form-canned",
            originalText = "2 tbsp chickpea puree",
            quantity = 2.0,
            unit = "tbsp",
            ingredientName = "chickpeas"
        )
        val catalog = formCatalog(
            rule = SubstitutionRule(
                id = "rule-canned-to-dried",
                fromFormId = "form-canned",
                toFormId = "form-dried",
                conversionType = SubstitutionConversionType.RATIO,
                ratio = 2.0, // destination grams per source millilitre
                sourceUnitScope = UnitScope.VOLUME,
                targetUnitScope = UnitScope.MASS,
                minQty = 25.0,
                maxQty = 35.0,
                confidence = SubstitutionConfidence.TESTED,
                riskLevel = SubstitutionRiskLevel.SAFE,
                roundingPolicy = "nearest_5g",
                updatedAt = "2026-04-10T00:00:00Z"
            )
        )

        val suggestions = resolveIngredientSubstitutions(
            ingredient = ingredient,
            recipe = sampleRecipe(ingredient),
            tags = emptyList(),
            ingredientReferences = listOf(chickpeasReference),
            catalog = catalog
        )
        val withoutSelection = resolveIngredientSubstitutions(
            ingredient = ingredient.copy(ingredientFormId = null),
            recipe = sampleRecipe(ingredient),
            tags = emptyList(),
            ingredientReferences = listOf(chickpeasReference),
            catalog = catalog
        )
        val wrongSelection = resolveIngredientSubstitutions(
            ingredient = ingredient.copy(ingredientFormId = "form-dried"),
            recipe = sampleRecipe(ingredient),
            tags = emptyList(),
            ingredientReferences = listOf(chickpeasReference),
            catalog = catalog
        )

        assertEquals(1, suggestions.size)
        assertEquals("dried chickpeas", suggestions.single().displayNameEn)
        assertEquals(60.0, suggestions.single().quantity!!, 0.001)
        assertEquals("g", suggestions.single().unit)
        assertEquals(SubstitutionRiskLevel.SAFE, suggestions.single().riskLevel)
        assertTrue(withoutSelection.isEmpty())
        assertTrue(wrongSelection.isEmpty())

        val belowMinimum = resolveIngredientSubstitutions(
            ingredient = ingredient.copy(quantity = 1.0, unit = "tsp"),
            recipe = sampleRecipe(ingredient),
            tags = emptyList(),
            ingredientReferences = listOf(chickpeasReference),
            catalog = catalog
        )
        val aboveMaximum = resolveIngredientSubstitutions(
            ingredient = ingredient.copy(quantity = 3.0, unit = "tbsp"),
            recipe = sampleRecipe(ingredient),
            tags = emptyList(),
            ingredientReferences = listOf(chickpeasReference),
            catalog = catalog
        )
        assertTrue(belowMinimum.isEmpty())
        assertTrue(aboveMaximum.isEmpty())
    }

    @Test
    fun formRuleBlocksPackageUnitsUntilPackageYieldIsModeled() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-chickpeas",
            ingredientFormId = "form-canned",
            originalText = "1 can chickpeas",
            quantity = 1.0,
            unit = "can",
            ingredientName = "chickpeas"
        )
        val catalog = formCatalog(
            SubstitutionRule(
                id = "package-rule",
                fromFormId = "form-canned",
                toFormId = "form-dried",
                conversionType = SubstitutionConversionType.RATIO,
                ratio = 155.0,
                sourceUnitScope = UnitScope.PACKAGE,
                targetUnitScope = UnitScope.MASS,
                confidence = SubstitutionConfidence.TESTED,
                riskLevel = SubstitutionRiskLevel.SAFE,
                roundingPolicy = "nearest_5g",
                updatedAt = "2026-04-10T00:00:00Z"
            )
        )

        assertTrue(resolveIngredientSubstitutions(
            ingredient, sampleRecipe(ingredient), emptyList(), listOf(chickpeasReference), catalog
        ).isEmpty())
    }

    @Test
    fun explicitlyLinkedHighRiskFormRuleRequiresBilingualWarnings() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-chickpeas",
            ingredientFormId = "form-canned",
            originalText = "1 cup chickpeas",
            quantity = 1.0,
            unit = "cup",
            ingredientName = "chickpeas",
            substitutions = listOf(
                IngredientLineSubstitution(
                    id = "line-rule",
                    ingredientLineId = "ingredient-1",
                    substitutionRuleId = "high-risk-form-rule",
                    createdAt = "2026-04-10T00:00:00Z",
                    updatedAt = "2026-04-10T00:00:00Z"
                )
            )
        )
        val baseRule = SubstitutionRule(
            id = "high-risk-form-rule",
            fromFormId = "form-canned",
            toFormId = "form-dried",
            conversionType = SubstitutionConversionType.RATIO,
            ratio = 1.0,
            sourceUnitScope = UnitScope.VOLUME,
            targetUnitScope = UnitScope.VOLUME,
            confidence = SubstitutionConfidence.TESTED,
            riskLevel = SubstitutionRiskLevel.SAFE,
            roundingPolicy = "none",
            updatedAt = "2026-04-10T00:00:00Z"
        )
        val references = listOf(chickpeasReference)
        val recipe = sampleRecipe(ingredient)

        val verifiedSafePath = resolveIngredientSubstitutions(
            ingredient,
            recipe,
            emptyList(),
            references,
            formCatalog(baseRule)
        )
        assertEquals(1, verifiedSafePath.size)

        for (incompleteWarning in listOf(
            baseRule.copy(riskLevel = SubstitutionRiskLevel.HIGH_RISK),
            baseRule.copy(riskLevel = SubstitutionRiskLevel.HIGH_RISK, warningTextEn = "Use with care.")
        )) {
            assertTrue(resolveIngredientSubstitutions(
                ingredient,
                recipe,
                emptyList(),
                references,
                formCatalog(incompleteWarning)
            ).isEmpty())
        }
    }

    @Test
    fun contextualRuleRequiresPositiveDishScopeAndKeepsHighRiskExplicitOnly() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-all-purpose-flour",
            originalText = "2 tbsp flour",
            quantity = 2.0,
            unit = "tbsp",
            ingredientName = "flour"
        )
        val sauceTag = Tag("tag-sauce", "Sauce", "Sauce", "sauce", TagCategory.DISH_TYPE)
        val cakeTag = Tag("tag-cake", "Gâteau", "Cake", "cake", TagCategory.DISH_TYPE)
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
            warningTextFr = "Utiliser seulement pour épaissir une sauce.",
            warningTextEn = "Use only to thicken a sauce.",
            updatedAt = "2026-04-10T00:00:00Z"
        )
        val references = listOf(
            IngredientReference("ingredient-ref-all-purpose-flour", "farine tout usage", "all-purpose flour", updatedAt = "2026-04-10T00:00:00Z"),
            IngredientReference("ingredient-ref-cornstarch", "fécule de maïs", "cornstarch", updatedAt = "2026-04-10T00:00:00Z")
        )
        val catalog = IngredientSubstitutionCatalog(contextualSubstitutionRules = listOf(rule))

        val automaticInScope = resolveIngredientSubstitutions(
            ingredient, sampleRecipe(ingredient, listOf("tag-sauce")), listOf(sauceTag), references, catalog
        )
        val automaticOutOfScope = resolveIngredientSubstitutions(
            ingredient, sampleRecipe(ingredient, listOf("tag-cake")), listOf(cakeTag), references, catalog
        )
        val explicitlyLinked = ingredient.copy(substitutions = listOf(
            IngredientLineSubstitution(
                id = "line-rule",
                ingredientLineId = ingredient.id,
                contextualSubstitutionRuleId = rule.id,
                createdAt = "2026-04-10T00:00:00Z",
                updatedAt = "2026-04-10T00:00:00Z"
            )
        ))
        val explicitInScope = resolveIngredientSubstitutions(
            explicitlyLinked, sampleRecipe(explicitlyLinked, listOf("tag-sauce")), listOf(sauceTag), references, catalog
        )
        val explicitOutOfScope = resolveIngredientSubstitutions(
            explicitlyLinked, sampleRecipe(explicitlyLinked, listOf("tag-cake")), listOf(cakeTag), references, catalog
        )

        assertTrue(automaticInScope.isEmpty())
        assertTrue(automaticOutOfScope.isEmpty())
        assertEquals(1, explicitInScope.size)
        assertEquals(1.0, explicitInScope.single().quantity!!, 0.001)
        assertEquals("Use only to thicken a sauce.", explicitInScope.single().warningTextEn)
        assertTrue(explicitOutOfScope.isEmpty())

        for (incompleteWarning in listOf(
            rule.copy(warningTextFr = null),
            rule.copy(warningTextEn = null)
        )) {
            assertTrue(resolveIngredientSubstitutions(
                explicitlyLinked,
                sampleRecipe(explicitlyLinked, listOf("tag-sauce")),
                listOf(sauceTag),
                references,
                IngredientSubstitutionCatalog(contextualSubstitutionRules = listOf(incompleteWarning))
            ).isEmpty())
        }

        val unscoped = rule.copy(allowedDishTypes = emptyList(), excludedDishTypes = emptyList())
        assertTrue(resolveIngredientSubstitutions(
            explicitlyLinked,
            sampleRecipe(explicitlyLinked, listOf("tag-sauce")),
            listOf(sauceTag),
            references,
            IngredientSubstitutionCatalog(contextualSubstitutionRules = listOf(unscoped))
        ).isEmpty())
    }

    @Test
    fun contextualRuleRejectsUnknownRoleAndPackageQuantity() {
        val ingredient = IngredientLine(
            id = "ingredient-1", ingredientRefId = "from", originalText = "1 can from", quantity = 1.0,
            unit = "can", ingredientName = "from"
        )
        val tag = Tag("sauce", "Sauce", "Sauce", "sauce", TagCategory.DISH_TYPE)
        val rule = ContextualSubstitutionRule(
            id = "context-rule", fromIngredientRefId = "from", toIngredientRefId = "to",
            conversionType = SubstitutionConversionType.RATIO, ratio = 1.0, allowedDishTypes = listOf("sauce"),
            confidence = SubstitutionConfidence.TESTED, riskLevel = SubstitutionRiskLevel.CAUTION,
            updatedAt = "now"
        )
        val refs = listOf(
            IngredientReference("from", "source", "source", updatedAt = "now"),
            IngredientReference("to", "target", "target", updatedAt = "now")
        )
        val restricted = rule.copy(allowedIngredientRoles = listOf("thickener"))
        assertTrue(resolveIngredientSubstitutions(
            ingredient.copy(substitutions = listOf(IngredientLineSubstitution(
                id = "linked", ingredientLineId = ingredient.id, contextualSubstitutionRuleId = rule.id,
                createdAt = "now", updatedAt = "now"
            ))),
            sampleRecipe(ingredient, listOf("sauce")), listOf(tag), refs,
            IngredientSubstitutionCatalog(contextualSubstitutionRules = listOf(restricted))
        ).isEmpty())
        assertTrue(resolveIngredientSubstitutions(
            ingredient, sampleRecipe(ingredient, listOf("sauce")), listOf(tag), refs,
            IngredientSubstitutionCatalog(contextualSubstitutionRules = listOf(rule))
        ).isEmpty())
    }

    private fun formCatalog(rule: SubstitutionRule) = IngredientSubstitutionCatalog(
        ingredientForms = listOf(
            IngredientForm("form-canned", "ingredient-ref-chickpeas", "canned_drained", "pois chiches égouttés", "canned drained chickpeas", updatedAt = "2026-04-10T00:00:00Z"),
            IngredientForm("form-dried", "ingredient-ref-chickpeas", "dried", "pois chiches secs", "dried chickpeas", updatedAt = "2026-04-10T00:00:00Z")
        ),
        substitutionRules = listOf(rule),
        units = loadBundledUnitDefinitionsForTest()
    )

    private fun sampleRecipe(ingredient: IngredientLine, tagIds: List<String> = emptyList()): Recipe = Recipe(
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

    private val chickpeasReference = IngredientReference(
        id = "ingredient-ref-chickpeas", nameFr = "pois chiches", nameEn = "chickpeas", updatedAt = "2026-04-10T00:00:00Z"
    )
}
