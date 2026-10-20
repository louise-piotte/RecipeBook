package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.ContextualSubstitutionRule
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.PackageYieldObservation
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionConversionType
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.SubstitutionRule
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.domain.model.UnitScope
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.localization.normalizeIngredientUnit
import kotlin.math.round

data class IngredientSubstitutionCatalog(
    val ingredientForms: List<IngredientForm> = emptyList(),
    val substitutionRules: List<SubstitutionRule> = emptyList(),
    val contextualSubstitutionRules: List<ContextualSubstitutionRule> = emptyList(),
    val units: List<UnitDefinition> = emptyList(),
    val packageYields: List<PackageYieldObservation> = emptyList()
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
): List<IngredientSubstitutionSuggestion> = IngredientSubstitutionResolver(
    recipe = recipe,
    tags = tags,
    ingredientReferences = ingredientReferences,
    catalog = catalog
).resolve(ingredient)

/** Pre-indexed resolver reused while presenting every ingredient line in one recipe. */
internal class IngredientSubstitutionResolver(
    private val recipe: Recipe,
    tags: List<Tag>,
    ingredientReferences: List<IngredientReference>,
    private val catalog: IngredientSubstitutionCatalog
) {
    private val ingredientReferenceMap = ingredientReferences.associateBy(IngredientReference::id)
    private val formMap = catalog.ingredientForms.associateBy(IngredientForm::id)
    private val substitutionRuleMap = catalog.substitutionRules.associateBy(SubstitutionRule::id)
    private val contextualRuleMap = catalog.contextualSubstitutionRules.associateBy(ContextualSubstitutionRule::id)
    private val substitutionRulesBySourceFormId = catalog.substitutionRules.groupBy(SubstitutionRule::fromFormId)
    private val contextualRulesBySourceIngredientRefId = catalog.contextualSubstitutionRules
        .groupBy(ContextualSubstitutionRule::fromIngredientRefId)
    private val recipeDishTypes = recipe.tagIds
        .asSequence()
        .mapNotNull { tagId -> tags.firstOrNull { it.id == tagId && it.category == TagCategory.DISH_TYPE } }
        .map(Tag::normalizedRuleKey)
        .toSet()
    private val hasAnyRules = catalog.ingredientForms.isNotEmpty() ||
        catalog.substitutionRules.isNotEmpty() || catalog.contextualSubstitutionRules.isNotEmpty()

    fun resolve(ingredient: IngredientLine): List<IngredientSubstitutionSuggestion> {
        if (!hasAnyRules) return emptyList()

        val suggestions = linkedMapOf<String, IngredientSubstitutionSuggestion>()
        val ingredientRefId = ingredient.ingredientRefId
        val sourceForm = ingredient.ingredientFormId?.let(formMap::get)
            ?.takeIf { it.ingredientRefId == ingredientRefId }

        // Linked rules receive the same identity, form, scope, and context checks as discovered rules.
        ingredient.substitutions.forEach { explicit ->
            explicit.substitutionRuleId
                ?.let(substitutionRuleMap::get)
                ?.takeIf { it.hasRequiredHighRiskWarnings() }
                ?.resolveFormSuggestion(ingredient, sourceForm, ingredientReferenceMap, formMap, catalog.units)
                ?.let { suggestions[it.id] = it }

            explicit.contextualSubstitutionRuleId
                ?.let(contextualRuleMap::get)
                ?.takeIf {
                    it.fromIngredientRefId == ingredientRefId &&
                        it.hasRequiredHighRiskWarnings() &&
                        it.supportsRecipeContext(recipeDishTypes)
                }
                ?.resolveContextualSuggestion(ingredient, ingredientReferenceMap)
                ?.let { suggestions[it.id] = it }
        }

        if (ingredientRefId != null) {
            if (sourceForm != null) {
                substitutionRulesBySourceFormId[sourceForm.id].orEmpty()
                    .asSequence()
                    .filter { it.riskLevel != SubstitutionRiskLevel.HIGH_RISK }
                    .mapNotNull {
                        it.resolveFormSuggestion(ingredient, sourceForm, ingredientReferenceMap, formMap, catalog.units)
                    }
                    .forEach { suggestions.putIfAbsent(it.id, it) }
            }

            contextualRulesBySourceIngredientRefId[ingredientRefId].orEmpty()
                .asSequence()
                .filter { it.riskLevel != SubstitutionRiskLevel.HIGH_RISK }
                .filter { it.supportsRecipeContext(recipeDishTypes) }
                .mapNotNull { it.resolveContextualSuggestion(ingredient, ingredientReferenceMap) }
                .forEach { suggestions.putIfAbsent(it.id, it) }
        }

        return suggestions.values.sortedWith(
            compareBy<IngredientSubstitutionSuggestion> { it.riskLevel.sortOrder() }
                .thenBy { it.displayNameEn.lowercase() }
        )
    }
}

private fun SubstitutionRule.resolveFormSuggestion(
    ingredient: IngredientLine,
    sourceForm: IngredientForm?,
    ingredientReferenceMap: Map<String, IngredientReference>,
    formMap: Map<String, IngredientForm>,
    units: List<UnitDefinition>
): IngredientSubstitutionSuggestion? {
    val selectedSourceForm = sourceForm ?: return null
    if (selectedSourceForm.id != fromFormId || selectedSourceForm.ingredientRefId != ingredient.ingredientRefId) return null
    val targetForm = formMap[toFormId] ?: return null
    val targetReference = ingredientReferenceMap[targetForm.ingredientRefId]
    val sourceReference = ingredientReferenceMap[selectedSourceForm.ingredientRefId] ?: return null
    val conversion = convertForFormRule(ingredient.quantity, ingredient.unit, this, sourceReference, selectedSourceForm, units) ?: return null

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

private fun SubstitutionRule.hasRequiredHighRiskWarnings(): Boolean =
    riskLevel != SubstitutionRiskLevel.HIGH_RISK ||
        (!warningTextFr.isNullOrBlank() && !warningTextEn.isNullOrBlank())

private fun ContextualSubstitutionRule.hasRequiredHighRiskWarnings(): Boolean =
    riskLevel != SubstitutionRiskLevel.HIGH_RISK ||
        (!warningTextFr.isNullOrBlank() && !warningTextEn.isNullOrBlank())

private fun ContextualSubstitutionRule.resolveContextualSuggestion(
    ingredient: IngredientLine,
    ingredientReferenceMap: Map<String, IngredientReference>
): IngredientSubstitutionSuggestion? {
    val targetReference = ingredientReferenceMap[toIngredientRefId] ?: return null
    val amount = ingredient.quantity?.takeIf { it.isFinite() && it >= 0.0 } ?: return null
    val unit = ingredient.unit?.normalizeIngredientUnit()?.takeIf { it.isNotBlank() } ?: return null
    if (inferUnitScope(unit) == null || inferUnitScope(unit) == UnitScope.PACKAGE) return null
    // Contextual ratios have no source/target unit basis in v1. Only same-unit ratios are usable.
    if (conversionType != SubstitutionConversionType.RATIO || offset != null) return null
    val multiplier = ratio?.takeIf { it.isFinite() && it > 0.0 } ?: return null
    val convertedQuantity = (amount * multiplier).takeIf { it.isFinite() && it >= 0.0 } ?: return null

    return IngredientSubstitutionSuggestion(
        id = id,
        displayNameFr = targetReference.nameFr,
        displayNameEn = targetReference.nameEn,
        quantity = convertedQuantity,
        unit = unit,
        riskLevel = riskLevel,
        confidence = confidence,
        notesFr = notesFr,
        notesEn = notesEn,
        warningTextFr = warningTextFr,
        warningTextEn = warningTextEn
    )
}

private fun ContextualSubstitutionRule.supportsRecipeContext(recipeDishTypes: Set<String>): Boolean {
    if (allowedIngredientRoles.isNotEmpty() || excludedIngredientRoles.isNotEmpty() || allowedCookingMethods.isNotEmpty()) return false
    val allowed = allowedDishTypes.map(String::normalizedRuleKey).filter(String::isNotBlank).toSet()
    if (allowed.isEmpty() || recipeDishTypes.intersect(allowed).isEmpty()) return false
    val excluded = excludedDishTypes.map(String::normalizedRuleKey).toSet()
    return recipeDishTypes.intersect(excluded).isEmpty()
}

private fun convertForFormRule(
    quantity: Double?,
    unit: String?,
    rule: SubstitutionRule,
    sourceReference: IngredientReference,
    sourceForm: IngredientForm,
    units: List<UnitDefinition>
): ConvertedSubstitutionAmount? {
    val amount = quantity?.takeIf { it.isFinite() && it >= 0.0 } ?: return null
    val normalizedUnit = unit?.normalizeIngredientUnit()?.takeIf { it.isNotBlank() } ?: return null
    val sourceScope = inferUnitScope(normalizedUnit) ?: return null
    if (sourceScope != rule.sourceUnitScope || sourceScope == UnitScope.PACKAGE || rule.targetUnitScope == UnitScope.PACKAGE) return null
    if (rule.minQty?.isFinite() == false || rule.maxQty?.isFinite() == false) return null
    if (rule.minQty != null && rule.maxQty != null && rule.minQty > rule.maxQty) return null

    val sourceBaseUnit = baseUnitForScope(sourceScope)
    val sourceGraph = buildIngredientUnitConversionGraph(sourceReference, sourceForm, units)
    val sourceFactor = if (sourceScope == UnitScope.COUNT) {
        if (normalizedUnit in countUnits) 1.0 else return null
    } else {
        sourceGraph.conversionFactor(normalizedUnit, sourceBaseUnit) ?: return null
    }
    val sourceBaseAmount = amount * sourceFactor
    if (!sourceBaseAmount.isFinite() || rule.minQty?.let { sourceBaseAmount < it } == true ||
        rule.maxQty?.let { sourceBaseAmount > it } == true
    ) return null

    val targetBaseAmount = transformAmount(sourceBaseAmount, rule.conversionType, rule.ratio, rule.offset) ?: return null
    val targetBaseUnit = baseUnitForScope(rule.targetUnitScope)
    val outputUnit = if (rule.sourceUnitScope == rule.targetUnitScope) normalizedUnit else targetBaseUnit
    val outputFactor = if (rule.targetUnitScope == UnitScope.COUNT) {
        if (outputUnit in countUnits) 1.0 else return null
    } else {
        sourceGraph.conversionFactor(targetBaseUnit, outputUnit) ?: return null
    }
    val converted = applyRounding(targetBaseAmount * outputFactor, rule.roundingPolicy)
        .takeIf { it.isFinite() && it >= 0.0 } ?: return null
    return ConvertedSubstitutionAmount(converted, outputUnit)
}

private fun transformAmount(
    quantity: Double,
    conversionType: SubstitutionConversionType,
    ratio: Double?,
    offset: Double?
): Double? {
    val rawValue = when (conversionType) {
        SubstitutionConversionType.RATIO -> quantity * (ratio ?: return null)
        SubstitutionConversionType.AFFINE -> (quantity * (ratio ?: return null)) + (offset ?: 0.0)
        SubstitutionConversionType.FIXED_AMOUNT -> ratio ?: offset ?: return null
    }
    return rawValue.takeIf { it.isFinite() && it >= 0.0 }
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
    "count", "item", "piece", "pieces", "clove", "cloves", "egg", "eggs", "large egg", "large egg white",
    "large egg yolk", "large banana", "medium onion", "date", "stalk", "bunch", "rack", "drop" -> UnitScope.COUNT
    "can", "cans", "tin", "tins", "jar", "jars", "package", "packages", "pkg", "envelope", "envelopes" -> UnitScope.PACKAGE
    else -> null
}

private fun baseUnitForScope(scope: UnitScope): String = when (scope) {
    UnitScope.MASS -> "g"
    UnitScope.VOLUME -> "ml"
    UnitScope.COUNT -> "count"
    UnitScope.PACKAGE -> error("Package units require a matched package-yield observation")
}

private val countUnits = setOf(
    "count", "item", "piece", "pieces", "clove", "cloves", "egg", "eggs", "large egg", "large egg white",
    "large egg yolk", "large banana", "medium onion", "date", "stalk", "bunch", "rack", "drop"
)

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
