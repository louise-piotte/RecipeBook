package app.recipebook.domain.localization

import app.recipebook.domain.model.AppLanguage
import java.util.Locale

/** A count unit may already name the ingredient (e.g. large egg white).
 * Keep its stored identity for conversions, but compose one grammatical noun phrase. */
fun formatIngredientBase(
    quantity: Double?,
    unit: String?,
    ingredientName: String,
    language: AppLanguage,
    preserveUnit: Boolean = false
): String {
    val normalizedUnit = unit?.normalizeIngredientUnit()
    val counted = countedIngredient(ingredientName, normalizedUnit)
    if (counted != null) {
        val plural = quantity != null && quantity > 1.0
        val name = counted.label(language, plural)
        return listOfNotNull(quantity?.let { formatRecipeNumber(it, language) }, name).joinToString(" ")
    }
    val amount = formatIngredientAmount(quantity, unit, language, preserveUnit)
    if (language == AppLanguage.FR && normalizedUnit in setOf("clove", "stalk", "can", "jar", "package", "bunch", "rack", "drop") && ingredientName.isNotBlank()) {
        val connector = if (ingredientName.first().lowercaseChar() in "aàâäeéèêëiîïoôöuùûüœ") "d'" else "de "
        return listOfNotNull(amount, connector + ingredientName).joinToString(" ")
    }
    return listOfNotNull(amount, ingredientName.ifBlank { null }).joinToString(" ")
}

/** Only recognized count nouns and whole preparation phrases have deterministic agreement.
 * Free-form user instructions and stored bilingual text remain untouched. */
fun formatIngredientPreparation(
    preparation: String,
    quantity: Double?,
    unit: String?,
    ingredientName: String,
    language: AppLanguage
): String {
    if (language != AppLanguage.FR) return preparation
    val counted = countedIngredient(ingredientName, unit?.normalizeIngredientUnit()) ?: return preparation
    val plural = quantity != null && quantity > 1.0
    val phrases = listOf(
        "légèrement " to "battu", "" to "battu", "légèrement " to "fouetté", "" to "fouetté",
        "" to "séparé", "finement " to "haché", "" to "haché", "très " to "mûr"
    )
    for ((prefix, adjective) in phrases) {
        if (preparation in listOf(prefix + adjective, prefix + adjective + "e", prefix + adjective + "s", prefix + adjective + "es")) {
            return prefix + adjective + (if (counted.feminine) "e" else "") + (if (plural) "s" else "")
        }
    }
    return preparation
}

fun isCountIngredientUnit(unit: String?): Boolean {
    val normalized = unit?.normalizeIngredientUnit()
    return normalized == null || normalized in setOf("count", "item", "clove", "stalk", "can", "jar", "package", "bunch", "rack", "drop", "date") ||
        countedIngredients.any { noun -> listOf("large", "medium", "small").any { normalized == "$it ${noun.en}" } }
}

private data class CountedIngredient(
    val en: String, val enPlural: String,
    val fr: String, val frPlural: String,
    val feminine: Boolean = false
) {
    fun label(language: AppLanguage, plural: Boolean): String = when (language) {
        AppLanguage.EN -> if (plural) enPlural else en
        AppLanguage.FR -> if (plural) frPlural else fr
    }
}

private val countedIngredients = listOf(
    CountedIngredient("egg", "eggs", "œuf", "œufs"),
    CountedIngredient("egg white", "egg whites", "blanc d'œuf", "blancs d'œufs"),
    CountedIngredient("egg yolk", "egg yolks", "jaune d'œuf", "jaunes d'œufs"),
    CountedIngredient("banana", "bananas", "banane", "bananes", feminine = true),
    CountedIngredient("onion", "onions", "oignon", "oignons"),
    CountedIngredient("date", "dates", "datte", "dattes", feminine = true),
    CountedIngredient("medjool date", "medjool dates", "datte medjool", "dattes medjool", feminine = true),
    CountedIngredient("rack of ribs", "racks of ribs", "carré de côtes levées", "carrés de côtes levées")
)

private fun nameKey(value: String): String = value.trim().lowercase(Locale.ROOT).replace('’', '\'').replace("oe", "œ")

private fun countedIngredient(name: String, unit: String?): CountedIngredient? {
    val noun = countedIngredients.firstOrNull { counted ->
        listOf(counted.en, counted.enPlural, counted.fr, counted.frPlural).any { nameKey(it) == nameKey(name) }
    } ?: return null
    if (unit == null || unit in setOf("count", "item")) return noun
    if (unit == "date" && noun.en in setOf("date", "medjool date")) return noun
    if (unit == "rack" && noun.en == "rack of ribs") return noun
    val size = listOf("large", "medium", "small").firstOrNull { unit == "$it ${noun.en}" } ?: return null
    val frSize = when (size) {
        "large" -> if (noun.feminine) "grosse" else "gros"
        "small" -> if (noun.feminine) "petite" else "petit"
        else -> if (noun.feminine) "moyenne" else "moyen"
    }
    return when (noun.en) {
        "egg white", "egg yolk" -> {
            val part = if (noun.en == "egg white") "blanc" else "jaune"
            noun.copy(en = "$size ${noun.en}", enPlural = "$size ${noun.enPlural}",
                fr = "$part de $frSize œuf", frPlural = "${part}s de ${if (frSize == "gros") frSize else frSize + "s"} œufs")
        }
        "onion" -> noun.copy(en = "$size ${noun.en}", enPlural = "$size ${noun.enPlural}",
            fr = "${noun.fr} $frSize", frPlural = "${noun.frPlural} ${frSize}s")
        else -> noun.copy(en = "$size ${noun.en}", enPlural = "$size ${noun.enPlural}",
            fr = "$frSize ${noun.fr}", frPlural = "${if (frSize == "gros") frSize else frSize + "s"} ${noun.frPlural}")
    }
}
