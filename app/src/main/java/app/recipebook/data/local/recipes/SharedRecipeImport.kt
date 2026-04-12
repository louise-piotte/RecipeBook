package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.RecipeTimes
import app.recipebook.domain.model.Servings
import java.net.HttpURLConnection
import java.net.URI
import java.net.URL
import java.util.UUID
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

private const val IMPORT_PARSER_VERSION = "shared-import-v1"
private val LD_JSON_SCRIPT_REGEX = Regex(
    "<script[^>]*type=[\"']application/ld\\+json[\"'][^>]*>(.*?)</script>",
    setOf(RegexOption.IGNORE_CASE, RegexOption.DOT_MATCHES_ALL)
)
private val HTML_TITLE_REGEX = Regex(
    "<title[^>]*>(.*?)</title>",
    setOf(RegexOption.IGNORE_CASE, RegexOption.DOT_MATCHES_ALL)
)
private val SECTION_HEADING_REGEX = Regex("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ\\s]{1,40}:?$")
private val NUMBERED_STEP_REGEX = Regex("^\\d+[.)]\\s+.+")
private val BULLET_LINE_REGEX = Regex("^(?:[-*•]|\\d+[.)])\\s+.+")
private val INGREDIENT_QUANTITY_REGEX = Regex(
    "^\\s*(?:\\d+|\\d+[./]\\d+|\\d+\\s+\\d+/\\d+|\\d+\\s*-\\s*\\d+|[¼½¾⅓⅔⅛⅜⅝⅞])(?:\\s|$)"
)
private val URL_ONLY_REGEX = Regex("^https?://\\S+$", RegexOption.IGNORE_CASE)

data class ImportedRecipeDraft(
    val title: String = "",
    val description: String = "",
    val ingredients: List<String> = emptyList(),
    val instructions: String = "",
    val notes: String = "",
    val sourceName: String = "",
    val sourceUrl: String = "",
    val servings: Servings? = null,
    val times: RecipeTimes? = null,
    val importMetadata: ImportMetadata = ImportMetadata(
        sourceType = "shared_text",
        parserVersion = IMPORT_PARSER_VERSION
    )
)

fun ImportedRecipeDraft.applyToRecipe(recipe: Recipe, language: AppLanguage): Recipe {
    val targetText = LocalizedSystemText(
        title = title.trim(),
        description = description.trim(),
        instructions = instructions.trim(),
        notes = notes.trim()
    )
    val languages = when (language) {
        AppLanguage.FR -> recipe.languages.copy(fr = targetText)
        AppLanguage.EN -> recipe.languages.copy(en = targetText)
    }
    return recipe.copy(
        languages = languages,
        ingredients = ingredients.map(::toIngredientLine),
        source = if (sourceName.isBlank() && sourceUrl.isBlank()) {
            null
        } else {
            RecipeSource(
                sourceName = sourceName.trim(),
                sourceUrl = sourceUrl.trim()
            )
        },
        servings = servings,
        times = times,
        importMetadata = importMetadata
    )
}

class SharedRecipeImporter(
    private val fetchUrlContent: suspend (String) -> String = ::fetchUrlText
) {
    suspend fun import(sharedText: String, sourceNameHint: String? = null): ImportedRecipeDraft {
        val normalizedText = sharedText.trim()
        if (normalizedText.isBlank()) {
            return ImportedRecipeDraft(
                sourceName = sourceNameHint.orEmpty()
            )
        }
        return if (URL_ONLY_REGEX.matches(normalizedText)) {
            importFromUrl(normalizedText, sourceNameHint)
        } else {
            importFromText(normalizedText, sourceNameHint)
        }
    }

    private suspend fun importFromUrl(url: String, sourceNameHint: String?): ImportedRecipeDraft {
        val html = runCatching { fetchUrlContent(url) }.getOrNull()
        val sourceName = sourceNameHint.orEmpty().ifBlank { hostLabel(url) }
        val extracted = html?.let { extractRecipeFromHtml(it, url, sourceNameHint) }
        return extracted ?: ImportedRecipeDraft(
            sourceName = sourceName,
            sourceUrl = url,
            importMetadata = ImportMetadata(
                sourceType = "shared_webpage_url",
                parserVersion = IMPORT_PARSER_VERSION
            )
        )
    }

    private fun importFromText(text: String, sourceNameHint: String?): ImportedRecipeDraft {
        val lines = text.lineSequence()
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .toList()
        if (lines.isEmpty()) {
            return ImportedRecipeDraft(sourceName = sourceNameHint.orEmpty())
        }

        val ingredients = mutableListOf<String>()
        val instructions = mutableListOf<String>()
        val notes = mutableListOf<String>()
        val description = mutableListOf<String>()
        var title = ""
        var currentSection = TextSection.BODY

        lines.forEachIndexed { index, line ->
            val section = recognizeSection(line)
            if (section != null) {
                currentSection = section
                return@forEachIndexed
            }
            if (index == 0) {
                title = line
                return@forEachIndexed
            }
            when {
                currentSection == TextSection.INGREDIENTS -> ingredients += cleanListPrefix(line)
                currentSection == TextSection.INSTRUCTIONS -> instructions += cleanStepPrefix(line)
                currentSection == TextSection.NOTES -> notes += cleanListPrefix(line)
                index == 1 && !looksLikeIngredientLine(line) && !looksLikeInstructionLine(line) -> description += line
                looksLikeIngredientLine(line) && instructions.isEmpty() -> ingredients += cleanListPrefix(line)
                looksLikeInstructionLine(line) -> instructions += cleanStepPrefix(line)
                else -> notes += cleanListPrefix(line)
            }
        }

        return ImportedRecipeDraft(
            title = title,
            description = description.joinToString("\n"),
            ingredients = ingredients,
            instructions = instructions.joinToString("\n"),
            notes = notes.joinToString("\n"),
            sourceName = sourceNameHint.orEmpty(),
            importMetadata = ImportMetadata(
                sourceType = "shared_text",
                parserVersion = IMPORT_PARSER_VERSION
            )
        )
    }
}

private enum class TextSection {
    BODY,
    INGREDIENTS,
    INSTRUCTIONS,
    NOTES
}

private suspend fun fetchUrlText(url: String): String = withContext(Dispatchers.IO) {
    val connection = URL(url).openConnection() as HttpURLConnection
    connection.instanceFollowRedirects = true
    connection.connectTimeout = 10000
    connection.readTimeout = 10000
    connection.requestMethod = "GET"
    connection.setRequestProperty("User-Agent", "RecipeBook/1.0")
    connection.inputStream.bufferedReader().use { it.readText() }
}

private fun extractRecipeFromHtml(
    html: String,
    url: String,
    sourceNameHint: String?
): ImportedRecipeDraft? {
    val json = Json { ignoreUnknownKeys = true; isLenient = true }
    val recipeObject = LD_JSON_SCRIPT_REGEX.findAll(html)
        .mapNotNull { scriptMatch ->
            runCatching { json.parseToJsonElement(scriptMatch.groupValues[1].trim()) }.getOrNull()
        }
        .flatMap { flattenJsonLdCandidates(it).asSequence() }
        .firstOrNull(::isRecipeSchema)
        ?: return null

    val ingredientLines = recipeObject["recipeIngredient"]?.stringList().orEmpty()
    val instructions = extractInstructions(recipeObject["recipeInstructions"])
    val title = recipeObject["name"]?.stringValue().orEmpty()
    if (title.isBlank() && ingredientLines.isEmpty() && instructions.isBlank()) {
        return null
    }

    return ImportedRecipeDraft(
        title = title.ifBlank { extractHtmlTitle(html) },
        description = recipeObject["description"]?.stringValue().orEmpty(),
        ingredients = ingredientLines,
        instructions = instructions,
        notes = "",
        sourceName = sourceNameHint.orEmpty()
            .ifBlank { extractSourceName(recipeObject) }
            .ifBlank { hostLabel(url) },
        sourceUrl = url,
        servings = parseServings(recipeObject["recipeYield"]?.stringValue().orEmpty()),
        times = RecipeTimes(
            prepTimeMinutes = parseIsoDurationMinutes(recipeObject["prepTime"]?.stringValue()),
            cookTimeMinutes = parseIsoDurationMinutes(recipeObject["cookTime"]?.stringValue()),
            totalTimeMinutes = parseIsoDurationMinutes(recipeObject["totalTime"]?.stringValue())
        ).takeIf { it.prepTimeMinutes != null || it.cookTimeMinutes != null || it.totalTimeMinutes != null },
        importMetadata = ImportMetadata(
            sourceType = "shared_webpage_url",
            parserVersion = IMPORT_PARSER_VERSION
        )
    )
}

private fun flattenJsonLdCandidates(element: JsonElement): List<JsonObject> = when (element) {
    is JsonArray -> element.flatMap(::flattenJsonLdCandidates)
    is JsonObject -> buildList {
        add(element)
        addAll(element["@graph"]?.jsonArray?.flatMap(::flattenJsonLdCandidates).orEmpty())
    }
    else -> emptyList()
}

private fun isRecipeSchema(candidate: JsonObject): Boolean {
    val typeElement = candidate["@type"] ?: return false
    return when (typeElement) {
        is JsonPrimitive -> typeElement.content.equals("Recipe", ignoreCase = true)
        is JsonArray -> typeElement.any { it.jsonPrimitive.content.equals("Recipe", ignoreCase = true) }
        else -> false
    }
}

private fun extractInstructions(element: JsonElement?): String = when (element) {
    null, JsonNull -> ""
    is JsonPrimitive -> normalizeWhitespace(element.content)
    is JsonArray -> element.mapNotNull { item ->
        when (item) {
            is JsonPrimitive -> item.content
            is JsonObject -> {
                when {
                    item["@type"]?.stringValue().equals("HowToSection", ignoreCase = true) ->
                        extractInstructions(item["itemListElement"])
                    else -> item["text"]?.stringValue()
                }
            }
            else -> null
        }
    }.flatMap { instruction ->
        instruction.lineSequence().map { it.trim() }.filter { it.isNotEmpty() }.toList()
    }.joinToString("\n")
    else -> ""
}

private fun extractSourceName(recipeObject: JsonObject): String {
    val authorName = nestedName(recipeObject["author"])
    if (authorName.isNotBlank()) return authorName
    val publisherName = nestedName(recipeObject["publisher"])
    if (publisherName.isNotBlank()) return publisherName
    return ""
}

private fun nestedName(element: JsonElement?): String = when (element) {
    null, JsonNull -> ""
    is JsonPrimitive -> element.content
    is JsonObject -> element["name"]?.stringValue().orEmpty()
    is JsonArray -> element.firstNotNullOfOrNull { nestedName(it).ifBlank { null } }.orEmpty()
}

private fun recognizeSection(line: String): TextSection? {
    val normalized = line.trim().lowercase().removeSuffix(":")
    return when (normalized) {
        "ingredients", "ingredient", "ingrédients", "ingredient list", "liste d'ingrédients" -> TextSection.INGREDIENTS
        "instructions", "instruction", "directions", "method", "préparation", "etapes", "étapes" -> TextSection.INSTRUCTIONS
        "notes", "note", "remarques" -> TextSection.NOTES
        else -> null
    }
}

private fun looksLikeIngredientLine(line: String): Boolean {
    if (INGREDIENT_QUANTITY_REGEX.containsMatchIn(line)) return true
    val cleaned = cleanListPrefix(line)
    return cleaned.contains(" cup ", ignoreCase = true) ||
        cleaned.contains(" cups", ignoreCase = true) ||
        cleaned.contains(" tbsp", ignoreCase = true) ||
        cleaned.contains(" tsp", ignoreCase = true) ||
        cleaned.contains(" g ", ignoreCase = true) ||
        cleaned.contains(" ml ", ignoreCase = true)
}

private fun looksLikeInstructionLine(line: String): Boolean {
    val cleaned = cleanListPrefix(line)
    return NUMBERED_STEP_REGEX.matches(line) ||
        cleaned.contains(". ") ||
        cleaned.split(' ').size >= 5 && !SECTION_HEADING_REGEX.matches(cleaned)
}

private fun cleanListPrefix(line: String): String = line.replace(Regex("^(?:[-*•]|\\d+[.)])\\s*"), "").trim()

private fun cleanStepPrefix(line: String): String = cleanListPrefix(line)

private fun parseServings(rawYield: String): Servings? {
    val normalized = rawYield.trim()
    if (normalized.isBlank()) return null
    val match = Regex("([0-9]+(?:\\.[0-9]+)?)\\s*(.*)").find(normalized) ?: return Servings(amount = 1.0, unit = normalized)
    val amount = match.groupValues[1].toDoubleOrNull() ?: return null
    val unit = match.groupValues[2].trim().ifBlank { null }
    return Servings(amount = amount, unit = unit)
}

private fun parseIsoDurationMinutes(value: String?): Int? {
    val text = value?.trim().orEmpty()
    if (text.isBlank()) return null
    val match = Regex("^P(?:T(?:(\\d+)H)?(?:(\\d+)M)?)$", RegexOption.IGNORE_CASE).matchEntire(text) ?: return null
    val hours = match.groupValues[1].toIntOrNull() ?: 0
    val minutes = match.groupValues[2].toIntOrNull() ?: 0
    return hours * 60 + minutes
}

private fun extractHtmlTitle(html: String): String {
    val rawTitle = HTML_TITLE_REGEX.find(html)?.groupValues?.get(1).orEmpty()
    return normalizeWhitespace(rawTitle)
}

private fun normalizeWhitespace(value: String): String = value
    .replace(Regex("<[^>]+>"), " ")
    .replace(Regex("\\s+"), " ")
    .trim()

private fun hostLabel(url: String): String = runCatching {
    URI(url).host.orEmpty().removePrefix("www.")
}.getOrDefault("")

private fun toIngredientLine(line: String): IngredientLine = IngredientLine(
    id = UUID.randomUUID().toString(),
    originalText = line,
    ingredientName = line
)

private fun JsonElement.stringValue(): String = when (this) {
    JsonNull -> ""
    is JsonPrimitive -> content
    is JsonObject -> this["name"]?.stringValue().orEmpty()
    is JsonArray -> firstOrNull()?.stringValue().orEmpty()
}

private fun JsonElement.stringList(): List<String> = when (this) {
    JsonNull -> emptyList()
    is JsonPrimitive -> listOf(content)
    is JsonArray -> mapNotNull { item ->
        item.stringValue().trim().ifBlank { null }
    }
    is JsonObject -> emptyList()
}
