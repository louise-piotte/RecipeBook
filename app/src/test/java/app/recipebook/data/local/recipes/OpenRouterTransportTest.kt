package app.recipebook.data.local.recipes

import app.recipebook.data.local.settings.AiBackendProvider
import app.recipebook.data.local.settings.AiBackendSettings
import app.recipebook.domain.model.AppLanguage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.net.HttpURLConnection
import java.net.URL
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.*
import org.junit.Assert.*
import org.junit.Test

class OpenRouterTransportTest {
    @Test fun missingKeyAndLegacyProviderNeverMakeRequests() = runBlocking {
        for (settings in listOf(AiBackendSettings(), AiBackendSettings(apiKey = "legacy-fixture", provider = AiBackendProvider.LEGACY_POE),
            AiBackendSettings(apiKey = "legacy-fixture", baseUrl = "https://api.poe.com/v1"))) {
            var called = false
            val result = OpenRouterRecipeAiClient({ settings }, { _, _ -> called = true; "{}" })
                .completeJson(RecipeAiCompletionRequest("system", "synthetic recipe"))
            assertEquals(RecipeAiCompletionResult.NotConfigured, result)
            assertFalse(called)
        }
    }
    @Test fun transportUsesFixedOpenRouterEndpointAndNeverFollowsRedirects() = runBlocking {
        val connection = FakeConnection(200, """{"choices":[{"message":{"content":"{\"title\":\"Synthetic\"}"},"finish_reason":"stop"}]}""")
        var endpoint = ""
        val settings = AiBackendSettings(apiKey = "fixture-key")
        assertEquals("{\"title\":\"Synthetic\"}", postOpenRouterCompletion(settings, "{}") { endpoint = it.toString(); connection })
        assertEquals("https://openrouter.ai/api/v1/chat/completions", endpoint)
        assertEquals("Bearer fixture-key", connection.getRequestProperty("Authorization"))
        assertEquals("RecipeBook", connection.getRequestProperty("X-OpenRouter-Title"))
        assertFalse(connection.instanceFollowRedirects)
        assertTrue(connection.disconnected)
    }
    @Test fun httpFailuresAreSanitizedAndHaveCorrectRetryability() = runBlocking {
        for (status in listOf(401, 403, 402, 429, 503, 302)) {
            val connection = FakeConnection(status, "private backend response")
            val result = OpenRouterRecipeAiClient({ AiBackendSettings(apiKey = "fixture-key") }, { s, b ->
                postOpenRouterCompletion(s, b) { connection }
            }).completeJson(RecipeAiCompletionRequest("system", "synthetic recipe")) as RecipeAiCompletionResult.Failed
            assertEquals("http_$status", result.reasonCode)
            assertEquals(status == 429 || status == 503, result.retryable)
            assertFalse(connection.inputWasRead)
            assertTrue(connection.disconnected)
        }
    }
    @Test fun malformedEmptyTruncatedAndErrorEnvelopesFailWithoutBackendDetails() = runBlocking {
        for (body in listOf("private malformed response", "{\"choices\":[]}", "{\"error\":{\"message\":\"private backend response\"}}",
            """{"choices":[{"message":{"content":"{}"},"finish_reason":"length"}]}""",
            """{"choices":[{"message":{"content":"[]"}}]}""")) {
            val result = OpenRouterRecipeAiClient({ AiBackendSettings(apiKey = "fixture") }, { s, b ->
                postOpenRouterCompletion(s, b) { FakeConnection(200, body) }
            }).completeJson(RecipeAiCompletionRequest("system", "synthetic recipe")) as RecipeAiCompletionResult.Failed
            assertEquals("ai_request_failed", result.reasonCode)
            assertFalse(result.reasonCode.contains("private"))
        }
    }
    @Test fun importerRequestCarriesDtoSchemaAndPrivacyPreferences() = runBlocking {
        var captured: RecipeAiCompletionRequest? = null
        val service = OpenAiCompatibleRecipeImportService(object : RecipeAiCompletionClient {
            override suspend fun completeJson(request: RecipeAiCompletionRequest): RecipeAiCompletionResult { captured = request; return RecipeAiCompletionResult.NotConfigured }
        }, "system")
        service.buildDraft(AiRecipeImportRequest(jobId = "fixture", sourceType = "shared_text", extractorVersion = "fixture",
            activeLanguage = AppLanguage.EN, rawText = "Synthetic toast", cleanedText = "Synthetic toast", htmlTitle = "",
            deterministicFields = DeterministicRecipeFields(title = "Synthetic toast"), warnings = emptyList(), deterministicDraftJson = "{}", ingredientCatalogJson = "{}"))
        val schema = requireNotNull(captured?.responseSchema)
        val fields = schema["properties"]!!.jsonObject
        assertTrue(fields.containsKey("title")); assertTrue(fields.containsKey("ingredients"))
        val ingredient = fields["ingredients"]!!.jsonObject["items"]!!.jsonObject
        assertTrue(ingredient["properties"]!!.jsonObject["quantity"]!!.jsonObject.containsKey("anyOf"))
        val body = Json.parseToJsonElement(buildChatCompletionRequestBody("openai/gpt-5.4", "system", "fixture", schema)).jsonObject
        assertEquals("json_schema", body["response_format"]!!.jsonObject["type"]!!.jsonPrimitive.content)
        assertTrue(body["response_format"]!!.jsonObject["json_schema"]!!.jsonObject["strict"]!!.jsonPrimitive.boolean)
        assertEquals(schema, body["response_format"]!!.jsonObject["json_schema"]!!.jsonObject["schema"])
        assertEquals("deny", body["provider"]!!.jsonObject["data_collection"]!!.jsonPrimitive.content)
        assertTrue(body["provider"]!!.jsonObject["require_parameters"]!!.jsonPrimitive.boolean)
        assertFalse(body["stream"]!!.jsonPrimitive.boolean)
    }
    private class FakeConnection(private val status: Int, private val body: String) : HttpURLConnection(URL("https://openrouter.ai/api/v1/chat/completions")) {
        var disconnected = false
        var inputWasRead = false
        private val sent = ByteArrayOutputStream()
        override fun connect() {}
        override fun disconnect() { disconnected = true }
        override fun usingProxy() = false
        override fun getOutputStream() = sent
        override fun getResponseCode() = status
        override fun getInputStream(): ByteArrayInputStream { inputWasRead = true; return ByteArrayInputStream(body.toByteArray()) }
    }
}
