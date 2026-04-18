package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import kotlinx.coroutines.runBlocking

class RecipeAiRuntimeTest {

    @Test
    fun openAiCompatibleRecipeImportService_notConfiguredSkips() = runBlocking {
        val service = OpenAiCompatibleRecipeImportService(
            completionClient = object : RecipeAiCompletionClient {
                override suspend fun completeJson(request: RecipeAiCompletionRequest): RecipeAiCompletionResult =
                    RecipeAiCompletionResult.NotConfigured
            },
            systemPrompt = "prompt"
        )

        val result = service.buildDraft(
            AiRecipeImportRequest(
                jobId = "job-1",
                sourceType = "shared_text",
                extractorVersion = "extractor-v1",
                activeLanguage = AppLanguage.EN,
                rawText = "Toast",
                cleanedText = "Toast",
                htmlTitle = "",
                deterministicFields = DeterministicRecipeFields(title = "Toast"),
                warnings = emptyList()
            )
        )

        assertTrue(result is AiRecipeImportResult.Skipped)
    }

    @Test
    fun openAiCompatibleRecipeImportService_successParsesJsonPayload() = runBlocking {
        val service = OpenAiCompatibleRecipeImportService(
            completionClient = object : RecipeAiCompletionClient {
                override suspend fun completeJson(request: RecipeAiCompletionRequest): RecipeAiCompletionResult =
                    RecipeAiCompletionResult.Success(
                        responseJson = """
                            {
                              "title": "Toast",
                              "description": "Simple toast.",
                              "ingredients": ["2 slices bread"],
                              "instructions": "Toast bread.",
                              "notes": "",
                              "sourceName": "Notebook",
                              "sourceUrl": "",
                              "servingsAmount": 1,
                              "servingsUnit": "portion",
                              "prepTimeMinutes": 1,
                              "cookTimeMinutes": 2,
                              "totalTimeMinutes": 3
                            }
                        """.trimIndent(),
                        generatorLabel = "openai_compatible:test-model"
                    )
            },
            systemPrompt = "prompt"
        )

        val result = service.buildDraft(
            AiRecipeImportRequest(
                jobId = "job-1",
                sourceType = "shared_text",
                extractorVersion = "extractor-v1",
                activeLanguage = AppLanguage.EN,
                rawText = "Toast",
                cleanedText = "Toast",
                htmlTitle = "",
                deterministicFields = DeterministicRecipeFields(title = "Toast"),
                warnings = emptyList()
            )
        )

        val success = result as AiRecipeImportResult.Success
        assertEquals("Toast", success.response.payload.title)
        assertEquals("Simple toast.", success.response.payload.description)
        assertEquals(listOf("2 slices bread"), success.response.payload.ingredients)
        assertEquals("openai_compatible:test-model", success.response.generatorLabel)
        assertEquals(3, success.response.payload.times?.totalTimeMinutes)
    }

    @Test
    fun settingsAwareRecipeLanguageRegenerator_usesAiWhenValid() = runBlocking {
        val regenerator = SettingsAwareRecipeLanguageRegenerator(
            completionClient = object : RecipeAiCompletionClient {
                override suspend fun completeJson(request: RecipeAiCompletionRequest): RecipeAiCompletionResult =
                    RecipeAiCompletionResult.Success(
                        responseJson = """
                            {
                              "title": "Pain dore",
                              "description": "Description traduite",
                              "instructions": "Cuire doucement.",
                              "notes": "Verifier."
                            }
                        """.trimIndent(),
                        generatorLabel = "openai_compatible:test-model"
                    )
            },
            fallback = LocalStubRecipeLanguageRegenerator(),
            systemPrompt = "prompt"
        )

        val result = regenerator.regenerateOppositeLanguage(
            RecipeLanguageRegenerationRequest(
                recipe = sampleRecipe(),
                authoritativeLanguage = AppLanguage.EN
            )
        )

        assertEquals(AppLanguage.FR, result.generatedLanguage)
        assertEquals("Pain dore", result.generatedText.title)
        assertEquals("openai_compatible:test-model", result.generatorLabel)
    }

    @Test
    fun settingsAwareRecipeLanguageRegenerator_parsesIngredientUpdatesAndReferenceDrafts() = runBlocking {
        val regenerator = SettingsAwareRecipeLanguageRegenerator(
            completionClient = object : RecipeAiCompletionClient {
                override suspend fun completeJson(request: RecipeAiCompletionRequest): RecipeAiCompletionResult =
                    RecipeAiCompletionResult.Success(
                        responseJson = """
                            {
                              "title": "Pain dore",
                              "description": "",
                              "instructions": "",
                              "notes": "",
                              "ingredients": [
                                {
                                  "id": "ingredient-1",
                                  "ingredientName": "farine",
                                  "originalText": "200 g farine",
                                  "referenceNameFr": "Farine tout usage",
                                  "referenceNameEn": "All-purpose flour",
                                  "referenceAliasesFr": ["farine"],
                                  "referenceAliasesEn": ["flour"],
                                  "referenceCategory": "FLOUR_AND_STARCH"
                                }
                              ]
                            }
                        """.trimIndent(),
                        generatorLabel = "openai_compatible:test-model"
                    )
            },
            fallback = LocalStubRecipeLanguageRegenerator(),
            systemPrompt = "prompt"
        )

        val result = regenerator.regenerateOppositeLanguage(
            RecipeLanguageRegenerationRequest(
                recipe = sampleRecipe(),
                authoritativeLanguage = AppLanguage.EN
            )
        )

        assertEquals(1, result.generatedIngredients.size)
        assertEquals("ingredient-1", result.generatedIngredients.first().id)
        assertEquals("200 g farine", result.generatedIngredients.first().originalText)
        assertEquals("Farine tout usage", result.generatedIngredients.first().referenceDraft?.nameFr)
    }

    @Test
    fun settingsAwareRecipeLanguageRegenerator_fallsBackToStubWhenAiFails() = runBlocking {
        val regenerator = SettingsAwareRecipeLanguageRegenerator(
            completionClient = object : RecipeAiCompletionClient {
                override suspend fun completeJson(request: RecipeAiCompletionRequest): RecipeAiCompletionResult =
                    RecipeAiCompletionResult.Failed(
                        reasonCode = "network_timeout",
                        retryable = true
                    )
            },
            fallback = LocalStubRecipeLanguageRegenerator(),
            systemPrompt = "prompt"
        )

        val result = regenerator.regenerateOppositeLanguage(
            RecipeLanguageRegenerationRequest(
                recipe = sampleRecipe(),
                authoritativeLanguage = AppLanguage.EN
            )
        )

        assertEquals("local_stub", result.generatorLabel)
        assertEquals("Reviewed title", result.generatedText.title)
    }

    private fun sampleRecipe(): Recipe = Recipe(
        id = "recipe-1",
        createdAt = "2026-04-18T00:00:00Z",
        updatedAt = "2026-04-18T00:00:00Z",
        languages = BilingualText(
            fr = LocalizedSystemText("", "", "", ""),
            en = LocalizedSystemText(
                title = "Reviewed title",
                description = "Reviewed description",
                instructions = "Cook gently.",
                notes = ""
            )
        ),
        ingredients = listOf(
            IngredientLine(
                id = "ingredient-1",
                originalText = "200 g flour",
                ingredientName = "flour"
            )
        )
    )
}
