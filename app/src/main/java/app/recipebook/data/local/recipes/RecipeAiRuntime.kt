package app.recipebook.data.local.recipes

import android.content.Context
import app.recipebook.data.local.settings.AiBackendSettings
import app.recipebook.data.local.settings.AiBackendSettingsStore
import app.recipebook.data.local.settings.normalized
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.LocalizedSystemText
import java.net.HttpURLConnection
import java.net.URL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.runInterruptible
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

private val aiJson = Json { ignoreUnknownKeys = true; encodeDefaults = true }

object RecipeAiRuntime {
    fun createSharedRecipeImporter(context: Context): SharedRecipeImporter {
        val settingsStore = AiBackendSettingsStore(context)
        val repository = RecipeRepositoryProvider.create(context)
        val importerPrompt = RecipeAiPrompts.loadImporterSystemPrompt(context)
        val completionClient = OpenRouterRecipeAiClient(
            loadSettings = { settingsStore.settings.first() }
        )
        return SharedRecipeImporter(
            aiRecipeImportService = OpenAiCompatibleRecipeImportService(
                completionClient = completionClient,
                systemPrompt = importerPrompt
            ),
            loadIngredientCatalogJson = {
                repository.seedBundledLibraryIfMissing()
                RecipeExportCodec.encodeIngredientCatalogJson(
                    repository.buildExportLibrary()
                )
            }
        )
    }

    fun createLocalizationCoordinator(context: Context): RecipeLocalizationCoordinator {
        val settingsStore = AiBackendSettingsStore(context)
        val regeneratorPrompt = RecipeAiPrompts.loadRegeneratorSystemPrompt(context)
        val completionClient = OpenRouterRecipeAiClient(
            loadSettings = { settingsStore.settings.first() }
        )
        val regenerator = SettingsAwareRecipeLanguageRegenerator(
            completionClient = completionClient,
            fallback = LocalStubRecipeLanguageRegenerator(),
            systemPrompt = regeneratorPrompt
        )
        return RecipeLocalizationCoordinator(regenerator = regenerator)
    }
}

data class RecipeAiCompletionRequest(
    val systemPrompt: String,
    val userPrompt: String,
    val responseSchema: JsonObject? = null
)

sealed interface RecipeAiCompletionResult {
    data class Success(
        val responseJson: String,
        val generatorLabel: String
    ) : RecipeAiCompletionResult

    data class Failed(
        val reasonCode: String,
        val retryable: Boolean
    ) : RecipeAiCompletionResult

    object NotConfigured : RecipeAiCompletionResult
}

interface RecipeAiCompletionClient {
    suspend fun completeJson(request: RecipeAiCompletionRequest): RecipeAiCompletionResult
}

class OpenRouterRecipeAiClient(
    private val loadSettings: suspend () -> AiBackendSettings,
    private val postCompletion: suspend (AiBackendSettings, String) -> String = { settings, body -> postOpenRouterCompletion(settings, body) }
) : RecipeAiCompletionClient {
    override suspend fun completeJson(request: RecipeAiCompletionRequest): RecipeAiCompletionResult = runCatchingRecipeWork {
        val settings = loadSettings().normalized()
        if (!settings.isConfigured) return@runCatchingRecipeWork RecipeAiCompletionResult.NotConfigured
        currentCoroutineContext().ensureActive()
        val requestBody = buildChatCompletionRequestBody(settings.model, request.systemPrompt, request.userPrompt, request.responseSchema)
        val response = postCompletion(settings, requestBody)
        currentCoroutineContext().ensureActive()
        RecipeAiCompletionResult.Success(responseJson = response, generatorLabel = "openrouter:${settings.model}")
    }.getOrElse { error ->
        RecipeAiCompletionResult.Failed(
            reasonCode = if (error is RecipeAiHttpException) "http_${error.statusCode}" else "ai_request_failed",
            retryable = error is java.io.IOException ||
                (error is RecipeAiHttpException && (error.statusCode in 500..599 || error.statusCode in setOf(408, 429)))
        )
    }
}

class OpenAiCompatibleRecipeImportService(
    private val completionClient: RecipeAiCompletionClient,
    private val systemPrompt: String,
    private val json: Json = Json { ignoreUnknownKeys = true }
) : AiRecipeImportService {
    override suspend fun buildDraft(request: AiRecipeImportRequest): AiRecipeImportResult {
        val completion = completionClient.completeJson(
            RecipeAiCompletionRequest(
                systemPrompt = systemPrompt,
                userPrompt = importerUserPrompt(request),
                responseSchema = ImporterDraftPayloadDto.serializer().descriptor.toRecipeJsonSchema()
            )
        )

        return when (completion) {
            RecipeAiCompletionResult.NotConfigured -> AiRecipeImportResult.Skipped
            is RecipeAiCompletionResult.Failed -> AiRecipeImportResult.Failed(
                reasonCode = completion.reasonCode,
                retryable = completion.retryable
            )
            is RecipeAiCompletionResult.Success -> runCatching {
                val payloadDto = json.decodeFromString(ImporterDraftPayloadDto.serializer(), completion.responseJson)
                AiRecipeImportResult.Success(
                    AiRecipeImportResponse(
                        payload = payloadDto.toPayload(),
                        generatorLabel = completion.generatorLabel
                    )
                )
            }.getOrElse {
                AiRecipeImportResult.Failed(
                    reasonCode = "invalid_ai_json",
                    retryable = false
                )
            }
        }
    }
}

class SettingsAwareRecipeLanguageRegenerator(
    private val completionClient: RecipeAiCompletionClient,
    private val fallback: RecipeLanguageRegenerator,
    private val systemPrompt: String,
    private val json: Json = Json { ignoreUnknownKeys = true }
) : RecipeLanguageRegenerator {
    override suspend fun regenerateOppositeLanguage(
        request: RecipeLanguageRegenerationRequest
    ): RecipeLanguageRegenerationResult {
        val completion = completionClient.completeJson(
            RecipeAiCompletionRequest(
                systemPrompt = systemPrompt,
                userPrompt = regeneratorUserPrompt(request),
                responseSchema = RegeneratedLocalizedTextDto.serializer().descriptor.toRecipeJsonSchema()
            )
        )

        val aiResult = when (completion) {
            RecipeAiCompletionResult.NotConfigured -> null
            is RecipeAiCompletionResult.Failed -> null
            is RecipeAiCompletionResult.Success -> runCatching {
                val regenerated = json.decodeFromString(RegeneratedLocalizedTextDto.serializer(), completion.responseJson)
                require(regenerated.title.isNotBlank())
                RecipeLanguageRegenerationResult(
                    generatedLanguage = request.authoritativeLanguage.opposite(),
                    generatedText = regenerated.toTextDomain(),
                    generatorLabel = completion.generatorLabel,
                    generatedIngredients = regenerated.ingredients.map(RegeneratedIngredientDto::toDomain)
                )
            }.getOrNull()
        }

        return aiResult ?: fallback.regenerateOppositeLanguage(request)
    }
}

@Serializable
private data class ChatCompletionMessageDto(
    @SerialName("role")
    val role: String,
    @SerialName("content")
    val content: String
)

@Serializable
private data class ChatCompletionRequestDto(
    @SerialName("model")
    val model: String,
    @SerialName("messages")
    val messages: List<ChatCompletionMessageDto>,
    @SerialName("temperature")
    val temperature: Double,
    @SerialName("response_format")
    val responseFormat: JsonObject,
    @SerialName("provider")
    val provider: JsonObject,
    @SerialName("stream")
    val stream: Boolean = false
)

@Serializable
private data class ChatCompletionResponseDto(
    @SerialName("choices")
    val choices: List<ChatCompletionChoiceDto> = emptyList()
)

@Serializable
private data class ChatCompletionChoiceDto(
    @SerialName("message")
    val message: ChatCompletionResponseMessageDto? = null,
    @SerialName("finish_reason")
    val finishReason: String? = null
)

@Serializable
private data class ChatCompletionResponseMessageDto(
    @SerialName("content")
    val content: JsonElement? = null
)

@Serializable
private data class ImporterDraftPayloadDto(
    @SerialName("title")
    val title: String = "",
    @SerialName("description")
    val description: String = "",
    @SerialName("ingredients")
    val ingredients: List<ImporterIngredientDto> = emptyList(),
    @SerialName("instructions")
    val instructions: String = "",
    @SerialName("notes")
    val notes: String = "",
    @SerialName("sourceName")
    val sourceName: String = "",
    @SerialName("sourceUrl")
    val sourceUrl: String = "",
    @SerialName("servingsAmount")
    val servingsAmount: Double? = null,
    @SerialName("servingsUnit")
    val servingsUnit: String? = null,
    @SerialName("prepTimeMinutes")
    val prepTimeMinutes: Int? = null,
    @SerialName("cookTimeMinutes")
    val cookTimeMinutes: Int? = null,
    @SerialName("totalTimeMinutes")
    val totalTimeMinutes: Int? = null
) {
    fun toPayload(): AiRecipeDraftPayload = AiRecipeDraftPayload(
        title = title,
        description = description,
        ingredients = ingredients.map(ImporterIngredientDto::toDraft),
        instructions = instructions,
        notes = notes,
        sourceName = sourceName,
        sourceUrl = sourceUrl,
        servings = servingsAmount?.let { app.recipebook.domain.model.Servings(amount = it, unit = servingsUnit) },
        times = app.recipebook.domain.model.RecipeTimes(
            prepTimeMinutes = prepTimeMinutes,
            cookTimeMinutes = cookTimeMinutes,
            totalTimeMinutes = totalTimeMinutes
        ).takeIf { prepTimeMinutes != null || cookTimeMinutes != null || totalTimeMinutes != null }
    )
}

@Serializable
private data class ImporterIngredientDto(
    @SerialName("id")
    val id: String? = null,
    @SerialName("ingredientName")
    val ingredientName: String = "",
    @SerialName("quantity")
    val quantity: Double? = null,
    @SerialName("unit")
    val unit: String? = null,
    @SerialName("preparation")
    val preparation: String? = null,
    @SerialName("notes")
    val notes: String? = null,
    @SerialName("originalText")
    val originalText: String = "",
    @SerialName("ingredientRefId")
    val ingredientRefId: String? = null,
    @SerialName("referenceNameFr")
    val referenceNameFr: String = "",
    @SerialName("referenceNameEn")
    val referenceNameEn: String = "",
    @SerialName("referenceAliasesFr")
    val referenceAliasesFr: List<String> = emptyList(),
    @SerialName("referenceAliasesEn")
    val referenceAliasesEn: List<String> = emptyList(),
    @SerialName("referenceCategory")
    val referenceCategory: String? = null,
    @SerialName("referenceDefaultDensity")
    val referenceDefaultDensity: Double? = null,
    @SerialName("referenceUnitMappings")
    val referenceUnitMappings: List<app.recipebook.domain.model.IngredientUnitMapping> = emptyList()
) {
    fun toDraft(): ImportedIngredientDraft {
        val normalizedOriginalText = originalText.trim()
        val normalizedIngredientName = ingredientName.trim().ifBlank { normalizedOriginalText }
        val resolvedId = id ?: java.util.UUID.randomUUID().toString()
        val pendingReference = if (referenceNameFr.isBlank() || referenceNameEn.isBlank()) {
            null
        } else {
            ImportedIngredientReferenceDraft(
                nameFr = referenceNameFr,
                nameEn = referenceNameEn,
                category = referenceCategory,
                aliasesFr = referenceAliasesFr,
                aliasesEn = referenceAliasesEn,
                defaultDensity = referenceDefaultDensity,
                unitMappings = referenceUnitMappings
            )
        }
        return ImportedIngredientDraft(
            id = resolvedId,
            ingredientName = normalizedIngredientName,
            quantity = quantity,
            unit = unit?.trim()?.ifBlank { null },
            preparation = preparation?.trim()?.ifBlank { null },
            notes = notes?.trim()?.ifBlank { null },
            originalText = normalizedOriginalText.ifBlank { normalizedIngredientName },
            ingredientRefId = ingredientRefId ?: pendingReference?.let { "imported-pending-ref:$resolvedId" },
            pendingReference = pendingReference
        )
    }
}

@Serializable
private data class RegeneratedLocalizedTextDto(
    @SerialName("title")
    val title: String = "",
    @SerialName("description")
    val description: String = "",
    @SerialName("instructions")
    val instructions: String = "",
    @SerialName("notes")
    val notes: String = "",
    @SerialName("ingredients")
    val ingredients: List<RegeneratedIngredientDto> = emptyList()
) {
    fun toTextDomain(): LocalizedSystemText = LocalizedSystemText(
        title = title,
        description = description,
        instructions = instructions,
        notes = notes
    )
}

@Serializable
private data class RegeneratedIngredientDto(
    @SerialName("id")
    val id: String,
    @SerialName("ingredientName")
    val ingredientName: String = "",
    @SerialName("originalText")
    val originalText: String = "",
    @SerialName("preparation")
    val preparation: String = "",
    @SerialName("notes")
    val notes: String = "",
    @SerialName("referenceNameFr")
    val referenceNameFr: String = "",
    @SerialName("referenceNameEn")
    val referenceNameEn: String = "",
    @SerialName("referenceAliasesFr")
    val referenceAliasesFr: List<String> = emptyList(),
    @SerialName("referenceAliasesEn")
    val referenceAliasesEn: List<String> = emptyList(),
    @SerialName("referenceCategory")
    val referenceCategory: String? = null
) {
    fun toDomain(): RegeneratedIngredientLine = RegeneratedIngredientLine(
        id = id,
        ingredientName = ingredientName,
        originalText = originalText,
        preparation = preparation.trim(),
        notes = notes.trim(),
        referenceDraft = if (referenceNameFr.isBlank() || referenceNameEn.isBlank()) {
            null
        } else {
            IngredientReferenceDraft(
                nameFr = referenceNameFr,
                nameEn = referenceNameEn,
                aliasesFr = referenceAliasesFr,
                aliasesEn = referenceAliasesEn,
                category = referenceCategory
                    ?.let { runCatching { IngredientCategory.valueOf(it) }.getOrNull() }
                    ?: IngredientCategory.OTHER
            )
        }
    )
}

private fun importerUserPrompt(request: AiRecipeImportRequest): String = buildString {
    appendLine("Build one RecipeBook import draft JSON object.")
    appendLine("Return JSON only with keys:")
    appendLine("title, description, ingredients, instructions, notes, sourceName, sourceUrl, servingsAmount, servingsUnit, prepTimeMinutes, cookTimeMinutes, totalTimeMinutes")
    appendLine("Keep missing values blank or null.")
    appendLine("Do not invent quantities, temperatures, times, or servings.")
    appendLine("Each item in ingredients must be an object with keys:")
    appendLine("id, ingredientName, quantity, unit, preparation, notes, originalText, ingredientRefId, referenceNameFr, referenceNameEn, referenceAliasesFr, referenceAliasesEn, referenceCategory, referenceDefaultDensity, referenceUnitMappings")
    appendLine("Preserve ingredient amounts, units, and preparation text whenever the evidence supports them.")
    appendLine("Reuse an existing ingredientRefId from the ingredient catalog whenever the ingredient is already known.")
    appendLine("If source wording should become an alias of an existing ingredient, keep the existing ingredientRefId and include alias additions in the referenceAliases arrays.")
    appendLine("If multiple ingredient lines are functionally the same ingredient and differ only by decorative or minor variant details, collapse them to one reusable canonical ingredient name.")
    appendLine("Keep those distinguishing details in preparation or notes instead of creating near-duplicate ingredients. Example: colored sprinkles should usually reuse one sprinkles ingredient.")
    appendLine("Only leave ingredientRefId null when no existing ingredient fits and a new reference must be proposed.")
    appendLine("Active app language: ${request.activeLanguage.name}")
    appendLine("Source type: ${request.sourceType}")
    appendLine("Extractor version: ${request.extractorVersion}")
    appendLine("Deterministic draft JSON:")
    appendLine(request.deterministicDraftJson)
    appendLine("Ingredient catalog JSON:")
    appendLine(request.ingredientCatalogJson.take(24000))
    appendLine("HTML title: ${request.htmlTitle}")
    appendLine("Deterministic title: ${request.deterministicFields.title}")
    appendLine("Deterministic description: ${request.deterministicFields.description}")
    appendLine("Deterministic ingredients:")
    request.deterministicFields.ingredientLines.forEach { appendLine("- $it") }
    appendLine("Deterministic instructions:")
    request.deterministicFields.instructionLines.forEach { appendLine("- $it") }
    appendLine("Deterministic notes: ${request.deterministicFields.notes}")
    appendLine("Deterministic source name: ${request.deterministicFields.sourceName}")
    appendLine("Deterministic source url: ${request.deterministicFields.sourceUrl}")
    appendLine("Warnings:")
    request.warnings.forEach { appendLine("- ${it.code}:${it.field.orEmpty()}") }
    appendLine("Cleaned text:")
    appendLine(request.cleanedText.take(12000))
    if (request.rawText != request.cleanedText) {
        appendLine("Raw text excerpt:")
        appendLine(request.rawText.take(12000))
    }
}

private fun regeneratorUserPrompt(request: RecipeLanguageRegenerationRequest): String = buildString {
    val authoritativeText = request.recipe.languages.forLanguage(request.authoritativeLanguage)
    val targetLanguage = request.authoritativeLanguage.opposite()
    appendLine("Regenerate the opposite RecipeBook language as one JSON object.")
    appendLine("Return JSON only with keys: title, description, instructions, notes, ingredients")
    appendLine("Authoritative language: ${request.authoritativeLanguage.name}")
    appendLine("Target language: ${targetLanguage.name}")
    appendLine("Title: ${authoritativeText.title}")
    appendLine("Description: ${authoritativeText.description}")
    appendLine("Ingredients:")
    request.recipe.ingredients.forEach { ingredient ->
        appendLine("- id=${ingredient.id}")
        appendLine("  ingredientName=${ingredient.ingredientName}")
        appendLine("  originalText=${ingredient.originalText}")
        appendLine("  preparation=${ingredient.preparation.forLanguage(request.authoritativeLanguage)}")
        appendLine("  notes=${ingredient.notes.forLanguage(request.authoritativeLanguage)}")
        appendLine("  ingredientRefId=${ingredient.ingredientRefId.orEmpty()}")
    }
    appendLine("Instructions:")
    appendLine(authoritativeText.instructions)
    appendLine("Notes:")
    appendLine(authoritativeText.notes)
}

internal fun buildChatCompletionRequestBody(
    model: String,
    systemPrompt: String,
    userPrompt: String,
    responseSchema: JsonObject? = null
): String = aiJson.encodeToString(
    ChatCompletionRequestDto(
        model = model,
        messages = listOf(
            ChatCompletionMessageDto(role = "system", content = systemPrompt.trim()),
            ChatCompletionMessageDto(role = "user", content = userPrompt.trim())
        ),
        temperature = 0.2,
        responseFormat = buildJsonObject {
            put("type", if (responseSchema == null) "json_object" else "json_schema")
            if (responseSchema != null) put("json_schema", buildJsonObject {
                put("name", "recipebook_recipe"); put("strict", true); put("schema", responseSchema)
            })
        },
        provider = buildJsonObject {
            put("require_parameters", true)
            put("data_collection", "deny")
        }
    )
)

internal class RecipeAiHttpException(val statusCode: Int) : Exception("http_$statusCode")

internal suspend fun postOpenRouterCompletion(
    settings: AiBackendSettings,
    requestBody: String,
    openConnection: (URL) -> HttpURLConnection = { it.openConnection() as HttpURLConnection }
): String = runInterruptible(Dispatchers.IO) {
    require(settings.isConfigured)
    val connection = openConnection(URL(AiBackendSettings.DEFAULT_BASE_URL + "/chat/completions"))
    try {
        connection.instanceFollowRedirects = false
        connection.requestMethod = "POST"
        connection.connectTimeout = 20000
        connection.readTimeout = 60000
        connection.doOutput = true
        connection.setRequestProperty("Content-Type", "application/json")
        connection.setRequestProperty("Authorization", "Bearer ${settings.apiKey}")
        connection.setRequestProperty("X-OpenRouter-Title", "RecipeBook")
        connection.outputStream.bufferedWriter(Charsets.UTF_8).use { it.write(requestBody) }
        val responseCode = connection.responseCode
        if (responseCode !in 200..299) throw RecipeAiHttpException(responseCode)
        val responseText = connection.inputStream.bufferedReader(Charsets.UTF_8).use { it.readText() }
        val response = aiJson.decodeFromString(ChatCompletionResponseDto.serializer(), responseText)
        val choice = response.choices.firstOrNull()
        check(choice?.finishReason !in setOf("length", "content_filter")) { "incomplete_ai_response" }
        val content = choice?.message?.content.extractAssistantText()?.trim()
            ?.removeSurroundingMarkdownCodeFence()?.trim().orEmpty()
        check(content.isNotBlank() && aiJson.parseToJsonElement(content) is JsonObject) { "invalid_ai_response" }
        content
    } finally { connection.disconnect() }
}

private fun JsonElement?.extractAssistantText(): String? = when (this) {
    null -> null
    is JsonPrimitive -> content
    is JsonArray -> joinToString("\n") { item ->
        when (item) {
            is JsonPrimitive -> item.content
            is JsonObject -> item["text"]?.jsonPrimitiveContentOrNull().orEmpty()
            else -> ""
        }
    }.trim().ifBlank { null }
    is JsonObject -> this["text"]?.jsonPrimitiveContentOrNull()
}

private fun JsonElement.jsonPrimitiveContentOrNull(): String? =
    (this as? JsonPrimitive)?.content

private fun app.recipebook.domain.model.LocalizedValue.forLanguage(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> fr
    AppLanguage.EN -> en
}

private fun String.removeSurroundingMarkdownCodeFence(): String {
    val trimmed = trim()
    if (!trimmed.startsWith("```")) return this
    return trimmed
        .removePrefix("```json")
        .removePrefix("```JSON")
        .removePrefix("```")
        .removeSuffix("```")
        .trim()
}
