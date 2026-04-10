package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.ContextualSubstitutionRule
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionConversionType
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.SubstitutionRule
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.domain.model.UnitScope
import kotlin.math.round

data class IngredientSubstitutionCatalog(
    val ingredientForms: List<IngredientForm> = emptyList(),
    val substitutionRules: List<SubstitutionRule> = emptyList(),
    val contextualSubstitutionRules: List<ContextualSubstitutionRule> = emptyList()
) {
    companion object {
        val EMPTY = IngredientSubstitutionCatalog()
    }
}

data class IngredientSubstitutionSuggestion(
    val id: String,
    val displayNameFr: String,
    val displayNameEn: String,
    val quantity: Double? = null,
    val unit: String? = null,
    val riskLevel: SubstitutionRiskLevel,
    val confidence: SubstitutionConfidence,
    val notesFr: String? = null,
    val notesEn: String? = null,
    val warningTextFr: String? = null,
    val warningTextEn: String? = null
) {
    fun localizedDisplayName(language: AppLanguage): String = when (language) {
        AppLanguage.FR -> displayNameFr
        AppLanguage.EN -> displayNameEn
    }

    fun localizedNotes(language: AppLanguage): String? = when (language) {
        AppLanguage.FR -> notesFr
        AppLanguage.EN -> notesEn
    }?.trim()?.ifEmpty { null }

    fun localizedWarning(language: AppLanguage): String? = when (language) {
        AppLanguage.FR -> warningTextFr
        AppLanguage.EN -> warningTextEn
    }?.trim()?.ifEmpty { null }
}

internal fun resolveIngredientSubstitutions(
    ingredient: IngredientLine,
    recipe: Recipe,
    tags: List<Tag>,
    ingredientReferences: List<IngredientReference>,
    catalog: IngredientSubstitutionCatalog
): List<IngredientSubstitutionSuggestion> {
    if (
        catalog.ingredientForms.isEmpty() &&
        catalog.substitutionRules.isEmpty() &&
        catalog.contextualSubstitutionRules.isEmpty()
    ) {
        return emptyList()
    }

    val ingredientReferenceMap = ingredientReferences.associateBy(IngredientReference::id)
    val formMap = catalog.ingredientForms.associateBy(IngredientForm::id)
    val substitutionRuleMap = catalog.substitutionRules.associateBy(SubstitutionRule::id)
    val contextualRuleMap = catalog.contextualSubstitutionRules.associateBy(ContextualSubstitutionRule::id)

    val suggestions = linkedMapOf<String, IngredientSubstitutionSuggestion>()

    ingredient.substitutions.forEach { explicit ->
        explicit.substitutionRuleId
            ?.let(substitutionRuleMap::get)
            ?.resolveExplicitFormSuggestion(ingredient, ingredientReferenceMap, formMap)
            ?.let { suggestions[it.id] = it }

        explicit.contextualSubstitutionRuleId
            ?.let(contextualRuleMap::get)
            ?.resolveExplicitContextualSuggestion(ingredient, ingredientReferenceMap)
            ?.let { suggestions[it.id] = it }
    }

    val ingredientRefId = ingredient.ingredientRefId
    if (ingredientRefId != null) {
        val candidateForms = catalog.ingredientForms.filter { it.ingredientRefId == ingredientRefId }
        val inferredForm = inferIngredientForm(ingredient, candidateForms)
        if (inferredForm != null) {
            catalog.substitutionRules
                .asSequence()
                .filter { it.fromFormId == inferredForm.id }
                .mapNotNull { it.resolveExplicitFormSuggestion(ingredient, ingredientReferenceMap, formMap) }
                .forEach { suggestions.putIfAbsent(it.id, it) }
        }

        val recipeDishTypes = recipe.tagIds
            .asSequence()
            .mapNotNull { tagId -> tags.firstOrNull { it.id == tagId && it.category == TagCategory.DISH_TYPE } }
            .map(Tag::normalizedRuleKey)
            .toSet()

        catalog.contextualSubstitutionRules
            .asSequence()
            .filter { it.fromIngredientRefId == ingredientRefId }
            .filter { it.supportsRecipeContext(recipeDishTypes) }
            .mapNotNull { it.resolveExplicitContextualSuggestion(ingredient, ingredientReferenceMap) }
            .forEach { suggestions.putIfAbsent(it.id, it) }
    }

    return suggestions.values.sortedWith(
        compareBy<IngredientSubstitutionSuggestion> { it.riskLevel.sortOrder() }
            .thenBy { it.displayNameEn.lowercase() }
    )
}

private fun inferIngredientForm(
    ingredient: IngredientLine,
    forms: List<IngredientForm>
): IngredientForm? {
    if (forms.isEmpty()) return null
    if (forms.size == 1) return forms.single()

    val searchableText = sequenceOf(
        ingredient.originalText,
        ingredient.ingredientName,
        ingredient.preparation,
        ingredient.notes
    )
        .filterNotNull()
        .joinToString(" ")
        .lowercase()

    val scoredForms = forms.map { form ->
        val matches = (form.matchTermsFr + form.matchTermsEn)
            .map(String::trim)
            .filter(String::isNotEmpty)
            .count { searchableText.contains(it.lowercase()) }
        form to matches
    }

    return scoredForms
        .maxWithOrNull(compareBy<Pair<IngredientForm, Int>> { it.second }.thenBy { it.first.formCode })
        ?.takeIf { it.second > 0 }
        ?.first
}

private fun SubstitutionRule.resolveExplicitFormSuggestion(
    ingredient: IngredientLine,
    ingredientReferenceMap: Map<String, IngredientReference>,
    formMap: Map<String, IngredientForm>
): IngredientSubstitutionSuggestion? {
    val targetForm = formMap[toFormId] ?: return null
    val targetReference = ingredientReferenceMap[targetForm.ingredientRefId]
    val conversion = convertForFormRule(ingredient.quantity, ingredient.unit, this, targetForm) ?: return null

    return IngredientSubstitutionSuggestion(
        id = id,
        displayNameFr = targetForm.labelFr.ifBlank { targetReference?.nameFr.orEmpty() },
        displayNameEn = targetForm.labelEn.ifBlank { targetReference?.nameEn.orEmpty() },
        quantity = conversion.quantity,
        unit = conversion.unit,
        riskLevel = riskLevel,
        confidence = confidence,
        notesFr = notesFr,
        notesEn = notesEn,
        warningTextFr = warningTextFr,
        warningTextEn = warningTextEn
    )
}

private fun ContextualSubstitutionRule.resolveExplicitContextualSuggestion(
    ingredient: IngredientLine,
    ingredientReferenceMap: Map<String, IngredientReference>
): IngredientSubstitutionSuggestion? {
    val targetReference = ingredientReferenceMap[toIngredientRefId] ?: return null
    val convertedQuantity = convertQuantity(ingredient.quantity, conversionType, ratio, offset, roundingPolicy = "none")

    return IngredientSubstitutionSuggestion(
        id = id,
        displayNameFr = targetReference.nameFr,
        displayNameEn = targetReference.nameEn,
        quantity = convertedQuantity,
        unit = ingredient.unit,
        riskLevel = riskLevel,
        confidence = confidence,
        notesFr = notesFr,
        notesEn = notesEn,
        warningTextFr = warningTextFr,
        warningTextEn = warningTextEn
    )
}

private fun ContextualSubstitutionRule.supportsRecipeContext(recipeDishTypes: Set<String>): Boolean {
    if (allowedIngredientRoles.isNotEmpty() || excludedIngredientRoles.isNotEmpty() || allowedCookingMethods.isNotEmpty()) {
        return false
    }

    if (allowedDishTypes.isNotEmpty() && recipeDishTypes.none { it in allowedDishTypes.map(String::normalizedRuleKey) }) {
        return false
    }

    if (excludedDishTypes.any { excluded -> excluded.normalizedRuleKey() in recipeDishTypes }) {
        return false
    }

    return true
}

private fun convertForFormRule(
    quantity: Double?,
    unit: String?,
    rule: SubstitutionRule,
    targetForm: IngredientForm
): ConvertedSubstitutionAmount? {
    val currentScope = inferUnitScope(unit)
    if (quantity != null && currentScope != null && currentScope != rule.sourceUnitScope) {
        return null
    }

    val convertedQuantity = convertQuantity(quantity, rule.conversionType, rule.ratio, rule.offset, rule.roundingPolicy)
    val convertedUnit = when {
        convertedQuantity == null -> unit
        rule.sourceUnitScope == rule.targetUnitScope -> unit
        else -> defaultUnitForScope(rule.targetUnitScope, targetForm)
    }

    return ConvertedSubstitutionAmount(convertedQuantity, convertedUnit)
}

private fun convertQuantity(
    quantity: Double?,
    conversionType: SubstitutionConversionType,
    ratio: Double?,
    offset: Double?,
    roundingPolicy: String
): Double? {
    if (quantity == null) return null

    val rawValue = when (conversionType) {
        SubstitutionConversionType.RATIO -> quantity * (ratio ?: return null)
        SubstitutionConversionType.AFFINE -> (quantity * (ratio ?: return null)) + (offset ?: 0.0)
        SubstitutionConversionType.FIXED_AMOUNT -> ratio ?: offset ?: return null
    }

    return applyRounding(rawValue, roundingPolicy)
}

private fun applyRounding(value: Double, policy: String): Double = when (policy.lowercase()) {
    "none" -> value
    "nearest_5g" -> round(value / 5.0) * 5.0
    "nearest_0.25" -> round(value / 0.25) * 0.25
    "nearest_0.5" -> round(value / 0.5) * 0.5
    "nearest_whole", "nearest_whole_package" -> round(value)
    else -> value
}

private fun inferUnitScope(unit: String?): UnitScope? = when (unit?.trim()?.lowercase()) {
    "g", "kg", "oz", "lb" -> UnitScope.MASS
    "ml", "l", "tsp", "tbsp", "cup", "fl oz" -> UnitScope.VOLUME
    "count", "piece", "pieces", "clove", "cloves", "egg", "eggs" -> UnitScope.COUNT
    "can", "cans", "tin", "tins", "jar", "jars", "package", "packages", "pkg", "envelope", "envelopes" -> UnitScope.PACKAGE
    else -> null
}

private fun defaultUnitForScope(scope: UnitScope, targetForm: IngredientForm): String = when (scope) {
    UnitScope.MASS -> "g"
    UnitScope.VOLUME -> "ml"
    UnitScope.COUNT -> "count"
    UnitScope.PACKAGE -> when {
        targetForm.matchTermsEn.any { it.contains("can", ignoreCase = true) } ||
            targetForm.labelEn.contains("can", ignoreCase = true) -> "can"
        else -> "package"
    }
}

private fun Tag.normalizedRuleKey(): String = slug.ifBlank { nameEn }.normalizedRuleKey()

private fun String.normalizedRuleKey(): String = trim().lowercase().replace(' ', '_')

private fun SubstitutionRiskLevel.sortOrder(): Int = when (this) {
    SubstitutionRiskLevel.SAFE -> 0
    SubstitutionRiskLevel.CAUTION -> 1
    SubstitutionRiskLevel.HIGH_RISK -> 2
}

private data class ConvertedSubstitutionAmount(
    val quantity: Double?,
    val unit: String?
)
