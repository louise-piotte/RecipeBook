package app.recipebook.domain.localization

import app.recipebook.domain.model.AppLanguage
import java.util.Locale
import kotlin.math.abs
import kotlin.math.floor

/** Parse shared recipe quantities independently of the current UI language. */
fun parseRecipeQuantity(input: String): Double? {
    var text = input.trim().replace('\u00a0', ' ').replace('\u202f', ' ')
    if (text.isBlank()) return null
    vulgarFractions.forEach { (glyph, value) ->
        if (text.endsWith(glyph)) {
            val whole = text.dropLast(1).trim()
            val parsedWhole = if (whole.isEmpty()) 0.0 else whole.toDoubleOrNull() ?: return null
            return (parsedWhole + value).takeIf { parsedWhole >= 0.0 && it.isFinite() }
        }
    }
    text = text.replace(',', '.')
    val value = if ('/' in text || '\u2044' in text) {
        val parts = text.replace('\u2044', '/').split(Regex("\\s+"))
        if (parts.size !in 1..2) return null
        val whole = if (parts.size == 2) parts[0].toDoubleOrNull() ?: return null else 0.0
        val fraction = parts.last().split('/')
        if (fraction.size != 2) return null
        val numerator = fraction[0].toDoubleOrNull() ?: return null
        val denominator = fraction[1].toDoubleOrNull() ?: return null
        if (!whole.isFinite() || !numerator.isFinite() || !denominator.isFinite() || whole < 0 || numerator < 0 || denominator <= 0) return null
        whole + numerator / denominator
    } else {
        text.toDoubleOrNull() ?: return null
    }
    return value.takeIf { it.isFinite() && it >= 0.0 }
}

fun formatRecipeNumber(value: Double, language: AppLanguage? = null): String {
    val text = if (value.isFinite()) java.math.BigDecimal.valueOf(value).stripTrailingZeros().toPlainString() else value.toString()
    return if (language == AppLanguage.FR) text.replace('.', ',') else text
}

fun String.normalizeIngredientUnit(): String {
    val value = trim().lowercase(Locale.ROOT).replace('\u2019', '\'')
    return unitAliases[value] ?: value
}

fun String.localizedMeasurementUnit(language: AppLanguage, quantity: Double = 1.0): String {
    val normalized = normalizeIngredientUnit()
    val singular = quantity <= 1.0
    return when (normalized) {
        "cup" -> if (language == AppLanguage.FR) { if (singular) "tasse" else "tasses" } else { if (singular) "cup" else "cups" }
        "tbsp" -> if (language == AppLanguage.FR) { if (singular) "cuillère à soupe" else "cuillères à soupe" } else "tbsp"
        "tsp" -> if (language == AppLanguage.FR) { if (singular) "cuillère à thé" else "cuillères à thé" } else "tsp"
        "count", "item" -> ""
        "to taste" -> if (language == AppLanguage.FR) "au goût" else normalized
        "for serving" -> if (language == AppLanguage.FR) "pour servir" else normalized
        "for garnish" -> if (language == AppLanguage.FR) "pour garnir" else normalized
        "optional" -> if (language == AppLanguage.FR) "facultatif" else normalized
        else -> {
            val labels = countedUnitLabels[normalized]
            if (labels != null) labels[if (language == AppLanguage.FR) { if (singular) 2 else 3 } else { if (singular) 0 else 1 }]
            else if (language == AppLanguage.FR) frenchUnitLabels[normalized] ?: normalized else normalized
        }
    }
}

private val unitAliases = mapOf(
    "cups" to "cup", "tasse" to "cup", "tasses" to "cup",
    "tablespoon" to "tbsp", "tablespoons" to "tbsp", "c. à soupe" to "tbsp", "c. a soupe" to "tbsp",
    "cuillère à soupe" to "tbsp", "cuillères à soupe" to "tbsp", "cuillere a soupe" to "tbsp",
    "teaspoon" to "tsp", "teaspoons" to "tsp", "c. à thé" to "tsp", "c. a the" to "tsp",
    "cuillère à thé" to "tsp", "cuillères à thé" to "tsp", "cuillere a the" to "tsp",
    "gram" to "g", "grams" to "g", "gramme" to "g", "grammes" to "g",
    "kilogram" to "kg", "kilograms" to "kg", "kilogramme" to "kg", "kilogrammes" to "kg",
    "milliliter" to "ml", "milliliters" to "ml", "millilitre" to "ml", "millilitres" to "ml",
    "liter" to "l", "liters" to "l", "litre" to "l", "litres" to "l",
    "ounce" to "oz", "ounces" to "oz", "once" to "oz", "onces" to "oz",
    "pound" to "lb", "pounds" to "lb", "lbs" to "lb", "livre" to "lb", "livres" to "lb",
    "fluid ounce" to "fl oz", "fluid ounces" to "fl oz", "once liquide" to "fl oz", "onces liquides" to "fl oz",
    "cloves" to "clove", "gousse" to "clove", "gousses" to "clove",
    "stalks" to "stalk", "tige" to "stalk", "tiges" to "stalk",
    "cans" to "can", "boîte" to "can", "boîtes" to "can", "boite" to "can", "boites" to "can",
    "jars" to "jar", "pot" to "jar", "pots" to "jar", "packages" to "package", "paquet" to "package", "paquets" to "package",
    "bunches" to "bunch", "botte" to "bunch", "bottes" to "bunch", "drops" to "drop", "goutte" to "drop", "gouttes" to "drop",
    "large eggs" to "large egg", "gros œuf" to "large egg", "gros œufs" to "large egg", "gros oeuf" to "large egg", "gros oeufs" to "large egg",
    "large egg whites" to "large egg white", "blanc de gros œuf" to "large egg white", "blancs de gros œufs" to "large egg white",
    "large egg yolks" to "large egg yolk", "jaune de gros œuf" to "large egg yolk", "jaunes de gros œufs" to "large egg yolk",
    "large bananas" to "large banana", "grosse banane" to "large banana", "grosses bananes" to "large banana",
    "medium onions" to "medium onion", "oignon moyen" to "medium onion", "oignons moyens" to "medium onion",
    "dates" to "date", "datte" to "date", "dattes" to "date",
    "au goût" to "to taste", "pour servir" to "for serving", "pour garnir" to "for garnish"
)
private val countedUnitLabels = mapOf(
    "clove" to listOf("clove", "cloves", "gousse", "gousses"),
    "stalk" to listOf("stalk", "stalks", "tige", "tiges"),
    "can" to listOf("can", "cans", "boîte", "boîtes"),
    "jar" to listOf("jar", "jars", "pot", "pots"),
    "package" to listOf("package", "packages", "paquet", "paquets"),
    "bunch" to listOf("bunch", "bunches", "botte", "bottes"),
    "rack" to listOf("rack", "racks", "carré", "carrés"),
    "drop" to listOf("drop", "drops", "goutte", "gouttes"),
    "date" to listOf("date", "dates", "datte", "dattes")
)
private val frenchUnitLabels = mapOf(
    "clove" to "gousse", "stalk" to "tige", "can" to "boîte", "bunch" to "botte", "rack" to "carré",
    "drop" to "goutte", "date" to "datte", "square" to "carré", "squares" to "carrés",
    "cookie" to "biscuit", "cookies" to "biscuits", "large egg" to "gros œuf",
    "large egg white" to "blanc de gros œuf", "large egg yolk" to "jaune de gros œuf",
    "large banana" to "grosse banane", "medium onion" to "oignon moyen"
)
private val vulgarFractions = mapOf(
    '½' to 0.5, '¼' to 0.25, '¾' to 0.75, '⅓' to 1.0 / 3.0, '⅔' to 2.0 / 3.0,
    '⅛' to 0.125, '⅜' to 0.375, '⅝' to 0.625, '⅞' to 0.875
)

fun formatIngredientAmount(
    quantity: Double?,
    unit: String?,
    language: AppLanguage,
    preserveUnit: Boolean = false
): String? {
    val normalizedUnit = unit?.normalizeIngredientUnit()?.takeIf { it.isNotEmpty() }
    return when {
        quantity == null -> normalizedUnit?.localizedMeasurementUnit(language, 1.0)?.takeIf { it.isNotBlank() }
        normalizedUnit == null -> formatRecipeNumber(quantity, language)
        normalizedUnit == "cup" -> formatCupAmount(quantity, language, preserveUnit)
        normalizedUnit == "tbsp" -> formatTablespoonAmount(quantity, language, preserveUnit)
        normalizedUnit == "tsp" -> formatTeaspoonAmount(quantity, language)
        else -> listOf(formatRecipeNumber(quantity, language), normalizedUnit.localizedMeasurementUnit(language, quantity)).filter { it.isNotBlank() }.joinToString(" ")
    }
}

private fun formatCupAmount(quantity: Double, language: AppLanguage, preserveUnit: Boolean): String {
    val wholeCups = floor(quantity + MEASUREMENT_TOLERANCE).toInt()
    val remainder = (quantity - wholeCups).coerceAtLeast(0.0)
    if (remainder == 0.0) {
        return joinAmountWithUnit(wholeCups.toString(), "cup", wholeCups.toDouble(), language)
    }

    val matchingFraction = nearestAllowedFraction(remainder, CUP_FRACTIONS, CUP_FRACTION_TOLERANCE)
    if (matchingFraction != null) {
        return joinAmountWithUnit(
            formatMixedNumberText(wholeCups, matchingFraction),
            "cup",
            wholeCups + matchingFraction,
            language
        )
    }

    if (preserveUnit) {
        return joinAmountWithUnit(formatRecipeNumber(quantity, language), "cup", quantity, language)
    }

    val tablespoonText = formatTablespoonAmount(remainder * TABLESPOONS_PER_CUP, language, preserveUnit = false)
    return if (wholeCups > 0) {
        "${joinAmountWithUnit(wholeCups.toString(), "cup", wholeCups.toDouble(), language)} $tablespoonText"
    } else {
        tablespoonText
    }
}

private fun formatTablespoonAmount(quantity: Double, language: AppLanguage, preserveUnit: Boolean): String {
    val wholeTablespoons = floor(quantity + MEASUREMENT_TOLERANCE).toInt()
    val remainder = (quantity - wholeTablespoons).coerceAtLeast(0.0)
    if (remainder == 0.0) {
        return joinAmountWithUnit(wholeTablespoons.toString(), "tbsp", wholeTablespoons.toDouble(), language)
    }

    val matchingFraction = nearestAllowedFraction(remainder, TABLESPOON_FRACTIONS, TABLESPOON_FRACTION_TOLERANCE)
    if (matchingFraction != null) {
        return joinAmountWithUnit(
            formatMixedNumberText(wholeTablespoons, matchingFraction),
            "tbsp",
            wholeTablespoons + matchingFraction,
            language
        )
    }

    if (preserveUnit) {
        return joinAmountWithUnit(formatRecipeNumber(quantity, language), "tbsp", quantity, language)
    }

    val teaspoonText = formatTeaspoonAmount(remainder * TEASPOONS_PER_TABLESPOON, language)
    return if (wholeTablespoons > 0) {
        "${joinAmountWithUnit(wholeTablespoons.toString(), "tbsp", wholeTablespoons.toDouble(), language)} $teaspoonText"
    } else {
        teaspoonText
    }
}

private fun formatTeaspoonAmount(quantity: Double, language: AppLanguage): String {
    val whole = floor(quantity).toInt()
    val remainder = quantity - whole
    val fraction = nearestAllowedFraction(remainder, TEASPOON_FRACTIONS, MEASUREMENT_TOLERANCE)
    val amount = when {
        quantity == whole.toDouble() -> whole.toString()
        fraction != null -> formatMixedNumberText(whole, fraction)
        else -> formatRecipeNumber(quantity, language)
    }
    return joinAmountWithUnit(amount, "tsp", quantity, language)
}

private fun joinAmountWithUnit(
    amountText: String,
    unit: String,
    quantity: Double,
    language: AppLanguage
): String = "$amountText ${unit.localizedMeasurementUnit(language, quantity)}"

private fun formatMixedNumberText(whole: Int, fraction: Double): String {
    val fractionText = fractionGlyphs[fraction]
    return when {
        fractionText == null || isNearZero(fraction) -> whole.toString()
        whole <= 0 -> fractionText
        else -> "$whole$FRACTION_SPACING$fractionText"
    }
}

private fun nearestAllowedFraction(
    value: Double,
    fractions: List<Double>,
    tolerance: Double
): Double? = fractions
    .map { fraction -> fraction to abs(value - fraction) }
    .filter { (_, delta) -> delta <= tolerance }
    .minByOrNull { (_, delta) -> delta }
    ?.first

private fun isNearZero(value: Double): Boolean = abs(value) <= MEASUREMENT_TOLERANCE

private const val TABLESPOONS_PER_CUP = 16.0
private const val TEASPOONS_PER_TABLESPOON = 3.0
private const val MEASUREMENT_TOLERANCE = 0.02
private const val CUP_FRACTION_TOLERANCE = 0.04
private const val TABLESPOON_FRACTION_TOLERANCE = 0.08
private const val FRACTION_SPACING = " "
private val CUP_FRACTIONS = listOf(0.25, 1.0 / 3.0, 0.5, 2.0 / 3.0, 0.75)
private val TABLESPOON_FRACTIONS = listOf(0.5)
private val TEASPOON_FRACTIONS = listOf(0.125, 0.25, 0.5, 0.75)
private val fractionGlyphs = mapOf(
    0.125 to "\u215B",
    0.25 to "\u00BC",
    (1.0 / 3.0) to "\u2153",
    0.5 to "\u00BD",
    (2.0 / 3.0) to "\u2154",
    0.75 to "\u00BE"
)

