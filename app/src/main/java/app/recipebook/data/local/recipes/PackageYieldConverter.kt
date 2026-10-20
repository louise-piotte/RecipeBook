package app.recipebook.data.local.recipes

import app.recipebook.domain.localization.normalizeIngredientUnit
import app.recipebook.domain.localization.parseRecipeQuantity
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientPackageAmount
import app.recipebook.domain.model.IngredientPackageType
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.PackageYieldBasis
import app.recipebook.domain.model.PackageYieldObservation
import app.recipebook.domain.model.UnitDefinition
import kotlin.math.abs
import kotlin.math.max

private val packageCountToken = Regex("^(\\d+(?:[.,]\\d+)?(?:\\s+\\d+/\\d+)?|\\d+/\\d+|[½¼¾⅓⅔⅛⅜⅝⅞])")
private val netSizeToken = Regex(
    "(?i)(?<![\\p{L}\\p{N}])([0-9]+(?:[.,][0-9]+)?|[0-9]+/[0-9]+)\\s*(fl\\.?\\s*oz\\.?|fluid\\s*oz|fluid\\s+ounces?|oz|ounces?|g|kg|ml|l|lbs?|pounds?)(?![\\p{L}])"
)

/** Parse only explicit package expressions; originalText remains the authoritative user wording. */
internal fun parseIngredientPackageAmount(
    originalText: String,
    requestedBasis: PackageYieldBasis? = null
): IngredientPackageAmount? {
    val text = originalText.replace('\u00a0', ' ').replace('\u202f', ' ').trim()
    if (text.isBlank()) return null
    val packageType = findPackageType(text) ?: return null
    val countMatch = packageCountToken.find(text)
    val count = countMatch?.value?.let(::parseRecipeQuantity) ?: 1.0
    if (!count.isFinite() || count <= 0.0) return null

    val sizeSearchText = if (countMatch == null) text else text.removeRange(countMatch.range)
        .replaceFirst(Regex("^\\s*[x×]\\s*", RegexOption.IGNORE_CASE), " ")
    val sizeMatch = netSizeToken.find(sizeSearchText)
    val declaredNetQuantity = sizeMatch?.groupValues?.get(1)?.let(::parseRecipeQuantity)
    val declaredNetUnit = sizeMatch?.groupValues?.get(2)?.normalizePackageNetUnit()
    if ((declaredNetQuantity == null) != (declaredNetUnit == null)) return null

    val lower = text.lowercase()
    val basis = requestedBasis ?: when {
        Regex("(?<![\\p{L}])(drained|rinsed and drained|égoutté|égouttés|égouttée|égouttées)(?![\\p{L}])", RegexOption.IGNORE_CASE).containsMatchIn(text) ->
            PackageYieldBasis.DRAINED_MASS
        Regex("\\b(with liquid|solids and liquid|avec liquide|solides et liquide)\\b", RegexOption.IGNORE_CASE).containsMatchIn(text) ->
            PackageYieldBasis.NET_CONTENTS
        else -> null
    }
    val medium = when {
        Regex("\\b(brine|saumure)\\b").containsMatchIn(lower) -> "brine"
        Regex("\\b(syrup|sirop)\\b").containsMatchIn(lower) -> "syrup"
        Regex("\\b(oil|huile)\\b").containsMatchIn(lower) -> "oil"
        Regex("\\b(sauce)\\b").containsMatchIn(lower) -> "sauce"
        Regex("\\b(water|eau)\\b").containsMatchIn(lower) -> "water"
        else -> null
    }

    return IngredientPackageAmount(
        count = count,
        packageType = packageType,
        declaredNetQuantity = declaredNetQuantity,
        declaredNetUnit = declaredNetUnit,
        packingMedium = medium,
        requestedBasis = basis
    )
}

internal fun packageTypeFromUnit(unit: String?): IngredientPackageType? {
    val normalized = unit?.trim()?.lowercase()?.replace('.', ' ')
        ?.replace(Regex("\\s+"), " ")?.trim() ?: return null
    return when (normalized) {
        "can", "cans", "tin", "tins", "boîte", "boîtes", "boite", "boites",
        "boîte de conserve", "boîtes de conserve", "boite de conserve", "boites de conserve" -> IngredientPackageType.CAN
        "jar", "jars", "pot", "pots" -> IngredientPackageType.JAR
        "pouch", "pouches", "pochette", "pochettes" -> IngredientPackageType.POUCH
        "carton", "cartons" -> IngredientPackageType.CARTON
        "tub", "tubs", "bac", "bacs" -> IngredientPackageType.TUB
        "packet", "packets", "package", "packages", "pkg", "paquet", "paquets" -> IngredientPackageType.PACKET
        "block", "blocks", "bloc", "blocs" -> IngredientPackageType.BLOCK
        "sachet", "sachets" -> IngredientPackageType.SACHET
        "stick", "sticks", "bâtonnet", "bâtonnets", "batonnet", "batonnets" -> IngredientPackageType.STICK
        "bag", "bags", "sac", "sacs" -> IngredientPackageType.BAG
        "bottle", "bottles", "bouteille", "bouteilles" -> IngredientPackageType.BOTTLE
        "box", "boxes", "boîte", "boîtes", "boite", "boites" -> IngredientPackageType.BOX
        "tube", "tubes" -> IngredientPackageType.TUBE
        else -> null
    }
}

internal fun packageAmountForIngredientLine(
    ingredient: IngredientLine,
    ingredientForms: List<IngredientForm> = emptyList(),
    ingredientReferences: List<IngredientReference> = emptyList()
): IngredientPackageAmount? {
    val existing = ingredient.packageAmount
    val parsed = parseIngredientPackageAmount(ingredient.originalText)
    val explicitType = packageTypeFromUnit(ingredient.unit)
    val type = explicitType ?: parsed?.packageType ?: existing?.packageType ?: return null
    val form = ingredient.ingredientFormId?.let { id -> ingredientForms.firstOrNull { it.id == id } }
        ?.takeIf { it.ingredientRefId == ingredient.ingredientRefId }
    val reference = ingredient.ingredientRefId?.let { id -> ingredientReferences.firstOrNull { it.id == id } }
    val inferredBrand = inferPackageBrand(ingredient, type, parsed, form, reference)
    val prepText = "${ingredient.preparation.en} ${ingredient.preparation.fr} ${form?.formCode.orEmpty()} ${form?.prepState.orEmpty()}"
    val explicitBasis = when {
        Regex("(?<![\\p{L}])(drained|égoutté|égouttés|égouttée|égouttées)(?![\\p{L}])", RegexOption.IGNORE_CASE).containsMatchIn(prepText) ->
            PackageYieldBasis.DRAINED_MASS
        Regex("\\b(with liquid|solids and liquid|avec liquide|solides et liquide)\\b", RegexOption.IGNORE_CASE).containsMatchIn(prepText) ->
            PackageYieldBasis.NET_CONTENTS
        else -> null
    }
    val quantityIsPackageCount = explicitType != null
    val packageUnitCount = ingredient.quantity
        ?.takeIf { quantityIsPackageCount && it.isFinite() && it > 0.0 }
    val parsedCount = parsed?.count?.takeIf { it.isFinite() && it > 0.0 }
    val existingCount = existing?.count?.takeIf { it.isFinite() && it > 0.0 }
    val count = packageUnitCount ?: parsedCount ?: existingCount ?: return null
    val statedBasis = parsed?.requestedBasis ?: explicitBasis
    val requestedBasis = when {
        statedBasis != null && existing?.requestedBasis != null && statedBasis != existing.requestedBasis -> null
        else -> statedBasis ?: existing?.requestedBasis
    }
    return (parsed ?: existing ?: IngredientPackageAmount(count, type)).copy(
        count = count,
        packageType = type,
        declaredNetQuantity = parsed?.declaredNetQuantity ?: existing?.declaredNetQuantity,
        declaredNetUnit = parsed?.declaredNetUnit ?: existing?.declaredNetUnit,
        packingMedium = parsed?.packingMedium ?: existing?.packingMedium,
        brand = inferredBrand ?: parsed?.brand ?: existing?.brand,
        productCode = parsed?.productCode ?: existing?.productCode,
        countryOfOrigin = parsed?.countryOfOrigin ?: existing?.countryOfOrigin,
        requestedBasis = requestedBasis
    )
}

private fun inferPackageBrand(
    ingredient: IngredientLine,
    packageType: IngredientPackageType,
    parsed: IngredientPackageAmount?,
    form: IngredientForm?,
    reference: IngredientReference?
): String? {
    var residue = ingredient.originalText
        .replace('\u00a0', ' ')
        .replace('\u202f', ' ')
        .replace(packageCountToken, " ")
        .replace(netSizeToken, " ")
        .replace(Regex("(?i)(?<![\\p{L}])(?:x|×)(?![\\p{L}])"), " ")
    packageTypeAliases(packageType).forEach { alias ->
        residue = residue.replace(
            Regex("(?i)(?<![\\p{L}])${Regex.escape(alias)}(?![\\p{L}])"),
            " "
        )
    }
    val identityTerms = buildList {
        add(ingredient.ingredientName)
        reference?.let { addAll(listOf(it.nameEn, it.nameFr) + it.aliasesEn + it.aliasesFr) }
        form?.let { addAll(listOf(it.labelEn, it.labelFr) + it.matchTermsEn + it.matchTermsFr) }
    }.map(String::trim).filter(String::isNotBlank).distinctBy(String::lowercase).sortedByDescending(String::length)
    identityTerms.forEach { term ->
        residue = residue.replace(
            Regex("(?i)(?<![\\p{L}])${Regex.escape(term)}(?![\\p{L}])"),
            " "
        )
    }
    listOf(
        ingredient.preparation.en,
        ingredient.preparation.fr,
        form?.prepState.orEmpty(),
        form?.formCode.orEmpty(),
        "canned", "drained", "rinsed", "diced", "chopped", "sliced", "minced", "grated", "whole",
        "with liquid", "solids and liquid", "in water", "in brine", "water", "brine", "oil", "syrup",
        "en conserve", "égoutté", "égouttés", "rincé", "rincés", "avec liquide", "dans l'eau",
        "eau", "saumure", "huile", "sirop", "of", "the", "de", "du", "des"
    ).filter(String::isNotBlank).forEach { term ->
        residue = residue.replace(
            Regex("(?i)(?<![\\p{L}])${Regex.escape(term)}(?![\\p{L}])"),
            " "
        )
    }
    residue = residue.replace(Regex("(?i)\\bbrand\\s*[:\\-]?\\s*"), " ")
        .replace(Regex("[^\\p{L}\\p{N}&'’-]+"), " ")
        .trim()
    val brand = residue.replace(Regex("\\s+"), " ").ifBlank { null } ?: return null
    return brand.takeIf { it != ingredient.ingredientName && parsed != null }
}

private fun packageTypeAliases(type: IngredientPackageType): List<String> = when (type) {
    IngredientPackageType.CAN -> listOf("can", "cans", "tin", "tins", "boîte de conserve", "boîtes de conserve", "boite de conserve", "boites de conserve", "boîte", "boîtes", "boite", "boites")
    IngredientPackageType.TIN -> listOf("tin", "tins")
    IngredientPackageType.JAR -> listOf("jar", "jars", "pot", "pots")
    IngredientPackageType.POUCH -> listOf("pouch", "pouches", "pochette", "pochettes")
    IngredientPackageType.CARTON -> listOf("carton", "cartons")
    IngredientPackageType.TUB -> listOf("tub", "tubs", "bac", "bacs")
    IngredientPackageType.PACKET -> listOf("packet", "packets", "package", "packages", "pkg", "paquet", "paquets")
    IngredientPackageType.BLOCK -> listOf("block", "blocks", "bloc", "blocs")
    IngredientPackageType.SACHET -> listOf("sachet", "sachets")
    IngredientPackageType.STICK -> listOf("stick", "sticks", "bâtonnet", "bâtonnets", "batonnet", "batonnets")
    IngredientPackageType.BAG -> listOf("bag", "bags", "sac", "sacs")
    IngredientPackageType.BOTTLE -> listOf("bottle", "bottles", "bouteille", "bouteilles")
    IngredientPackageType.BOX -> listOf("box", "boxes")
    IngredientPackageType.TUBE -> listOf("tube", "tubes")
    IngredientPackageType.OTHER -> emptyList()
}

internal data class PackageYieldConversion(
    val quantity: Double,
    val unit: String,
    val basis: PackageYieldBasis,
    val observation: PackageYieldObservation,
    val sourceSpecificEstimate: Boolean,
    val portioningAssumption: String? = null
)

/** Returns null unless exactly one evidence record matches the ingredient, form, package, and product qualifiers. */
internal fun convertPackageAmount(
    ingredientRefId: String?,
    ingredientForm: IngredientForm?,
    amount: IngredientPackageAmount?,
    observations: List<PackageYieldObservation>,
    targetUnit: String,
    ingredientReference: IngredientReference? = null,
    units: List<UnitDefinition> = emptyList()
): PackageYieldConversion? {
    val refId = ingredientRefId ?: return null
    val packageAmount = amount ?: return null
    val basis = packageAmount.requestedBasis ?: return null
    if (!packageAmount.count.isFinite() || packageAmount.count <= 0.0) return null
    val form = ingredientForm?.takeIf { it.ingredientRefId == refId } ?: return null
    val normalizedTarget = targetUnit.normalizeIngredientUnit()
    val matching = observations.filter { observation ->
        observation.ingredientRefId == refId &&
            observation.ingredientFormId == form.id &&
            observation.packageType == packageAmount.packageType &&
            packageAmountMatches(packageAmount, observation, units) &&
            productQualifiersMatch(packageAmount, observation)
    }
    val observation = matching.singleOrNull() ?: return null
    val perPackage = when (basis) {
        PackageYieldBasis.NET_CONTENTS -> netContentsInUnit(observation, normalizedTarget, ingredientReference, form, units)
        PackageYieldBasis.DRAINED_MASS -> massInUnit(observation.drainedMassG, normalizedTarget, ingredientReference, form, units)
        PackageYieldBasis.EDIBLE_MASS -> massInUnit(observation.edibleMassG, normalizedTarget, ingredientReference, form, units)
    } ?: return null
    val result = perPackage * packageAmount.count
    if (!result.isFinite() || result <= 0.0) return null
    val hasExactProductQualifier = packageAmount.productCode?.let { it == observation.productCode } == true ||
        packageAmount.brand?.equals(observation.brand, ignoreCase = true) == true
    return PackageYieldConversion(
        quantity = result,
        unit = normalizedTarget,
        basis = basis,
        observation = observation,
        sourceSpecificEstimate = !hasExactProductQualifier,
        portioningAssumption = if (packageAmount.count % 1.0 != 0.0) {
            "Assumes a proportional share of this package's observed yield."
        } else null
    )
}

private fun packageAmountMatches(
    amount: IngredientPackageAmount,
    observation: PackageYieldObservation,
    units: List<UnitDefinition>
): Boolean {
    val enteredNet = amount.declaredNetQuantity
    val enteredUnit = amount.declaredNetUnit?.normalizeIngredientUnit()
    if ((enteredNet == null) != (enteredUnit == null)) return false
    if (enteredNet != null && enteredUnit != null) {
        val observedUnit = observation.declaredNetUnit.normalizeIngredientUnit()
        val factor = buildIngredientUnitConversionGraph(null, units = units).conversionFactor(observedUnit, enteredUnit)
            ?: return false
        val observedAtEnteredUnit = observation.declaredNetQuantity * factor
        if (!areEquivalentSize(observedAtEnteredUnit, enteredNet)) return false
    } else if (amount.productCode.isNullOrBlank() || amount.productCode != observation.productCode) {
        return false
    }
    return true
}

private fun productQualifiersMatch(amount: IngredientPackageAmount, observation: PackageYieldObservation): Boolean {
    if (!amount.brand.isNullOrBlank() && !amount.brand.equals(observation.brand, ignoreCase = true)) return false
    if (!amount.productCode.isNullOrBlank() && amount.productCode != observation.productCode) return false
    if (!amount.countryOfOrigin.isNullOrBlank() &&
        !amount.countryOfOrigin.equals(observation.countryOfOrigin, ignoreCase = true)
    ) return false
    if (!amount.packingMedium.isNullOrBlank() &&
        !amount.packingMedium.equals(observation.packingMedium, ignoreCase = true)
    ) return false
    return true
}

private fun netContentsInUnit(
    observation: PackageYieldObservation,
    targetUnit: String,
    reference: IngredientReference?,
    form: IngredientForm,
    units: List<UnitDefinition>
): Double? {
    // Net contents may include packing liquid; do not use food density to turn their mass into volume.
    val graph = buildIngredientUnitConversionGraph(ingredientReference = null, ingredientForm = null, units = units)
    if (observation.netMassG != null) {
        return convertObservedQuantity(observation.netMassG, "g", targetUnit, graph)
    }
    if (observation.netVolumeMl != null) {
        return convertObservedQuantity(observation.netVolumeMl, "ml", targetUnit, graph)
    }
    return convertObservedQuantity(observation.declaredNetQuantity, observation.declaredNetUnit, targetUnit, graph)
}

private fun massInUnit(
    massG: Double?,
    targetUnit: String,
    reference: IngredientReference?,
    form: IngredientForm,
    units: List<UnitDefinition>
): Double? = massG?.let { mass ->
    convertObservedQuantity(mass, "g", targetUnit, buildIngredientUnitConversionGraph(reference, form, units))
}

private fun convertObservedQuantity(
    quantity: Double,
    fromUnit: String,
    toUnit: String,
    graph: IngredientUnitConversionGraph
): Double? {
    if (!quantity.isFinite() || quantity <= 0.0) return null
    val factor = graph.conversionFactor(fromUnit, toUnit) ?: return null
    return (quantity * factor).takeIf { it.isFinite() && it > 0.0 }
}

private fun String.normalizePackageNetUnit(): String = when (
    lowercase().replace(".", "").replace(Regex("\\s+"), " ").trim()
) {
    "fluid ounce", "fluid ounces", "fluid oz", "fl oz" -> "fl oz"
    "ounce", "ounces", "oz" -> "oz"
    "pound", "pounds", "lb", "lbs" -> "lb"
    else -> normalizeIngredientUnit()
}

private fun findPackageType(text: String): IngredientPackageType? {
    val lower = text.lowercase()
    val candidates = listOf(
        "boîte de conserve" to IngredientPackageType.CAN,
        "boîtes de conserve" to IngredientPackageType.CAN,
        "boites de conserve" to IngredientPackageType.CAN,
        "can" to IngredientPackageType.CAN,
        "cans" to IngredientPackageType.CAN,
        // English "tin" is a package alias for CAN, matching packageTypeFromUnit.
        "tin" to IngredientPackageType.CAN,
        "tins" to IngredientPackageType.CAN,
        "jar" to IngredientPackageType.JAR,
        "jars" to IngredientPackageType.JAR,
        "pouch" to IngredientPackageType.POUCH,
        "pouches" to IngredientPackageType.POUCH,
        "carton" to IngredientPackageType.CARTON,
        "cartons" to IngredientPackageType.CARTON,
        "tub" to IngredientPackageType.TUB,
        "tubs" to IngredientPackageType.TUB,
        "packet" to IngredientPackageType.PACKET,
        "packets" to IngredientPackageType.PACKET,
        "package" to IngredientPackageType.PACKET,
        "packages" to IngredientPackageType.PACKET,
        "sachet" to IngredientPackageType.SACHET,
        "sachets" to IngredientPackageType.SACHET,
        "block" to IngredientPackageType.BLOCK,
        "blocks" to IngredientPackageType.BLOCK,
        "stick" to IngredientPackageType.STICK,
        "sticks" to IngredientPackageType.STICK,
        "bag" to IngredientPackageType.BAG,
        "bags" to IngredientPackageType.BAG,
        "bottle" to IngredientPackageType.BOTTLE,
        "bottles" to IngredientPackageType.BOTTLE,
        "box" to IngredientPackageType.BOX,
        "boxes" to IngredientPackageType.BOX,
        "tube" to IngredientPackageType.TUBE,
        "tubes" to IngredientPackageType.TUBE,
        "boîte" to IngredientPackageType.CAN,
        "boîtes" to IngredientPackageType.CAN,
        "boite" to IngredientPackageType.CAN,
        "boites" to IngredientPackageType.CAN,
        "pot" to IngredientPackageType.JAR,
        "pots" to IngredientPackageType.JAR,
        "sac" to IngredientPackageType.BAG,
        "sacs" to IngredientPackageType.BAG,
        "paquet" to IngredientPackageType.PACKET,
        "paquets" to IngredientPackageType.PACKET,
        "bouteille" to IngredientPackageType.BOTTLE,
        "bouteilles" to IngredientPackageType.BOTTLE
    )
    return candidates.firstOrNull { (alias, _) ->
        Regex("(?<![\\p{L}])${Regex.escape(alias)}(?![\\p{L}])").containsMatchIn(lower)
    }?.second
}

private fun areEquivalentSize(left: Double, right: Double): Boolean =
    left.isFinite() && right.isFinite() && abs(left - right) <= max(abs(left), abs(right)) * 1e-6
