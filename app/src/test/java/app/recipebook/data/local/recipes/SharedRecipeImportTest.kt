package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.LocalizedValue
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SharedRecipeImportTest {

    @Test
    fun applyToRecipe_placesIngredientPreparationAndNotesInAuthoritativeLanguageOnly() {
        val draft = ImportedRecipeDraft(
            ingredients = listOf(
                ImportedIngredientDraft(
                    id = "ingredient-1",
                    ingredientName = "butter",
                    preparation = "softened",
                    notes = "for frosting",
                    originalText = "1 cup butter, softened"
                )
            )
        )

        val applied = draft.applyToRecipe(blankRecipe(), AppLanguage.EN)
        val ingredient = applied.ingredients.single()

        assertEquals(LocalizedValue(en = "softened"), ingredient.preparation)
        assertEquals(LocalizedValue(en = "for frosting"), ingredient.notes)
    }

    @Test
    fun import_urlWithRecipeSchema_extractsStructuredDraft() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(
            fetchUrlContent = {
                """
                <html>
                <head>
                  <title>Best Pancakes</title>
                  <script type="application/ld+json">
                  {
                    "@context": "https://schema.org",
                    "@type": "Recipe",
                    "name": "Best Pancakes",
                    "description": "Easy weekend pancakes.",
                    "recipeYield": "4 servings",
                    "prepTime": "PT10M",
                    "cookTime": "PT15M",
                    "totalTime": "PT25M",
                    "image": "https://example.com/images/pancakes.jpg",
                    "recipeIngredient": [
                      "2 cups flour",
                      "1 cup milk"
                    ],
                    "recipeInstructions": [
                      {"@type": "HowToStep", "text": "Whisk the dry ingredients."},
                      {"@type": "HowToStep", "text": "Cook on a hot griddle."}
                    ],
                    "author": {
                      "@type": "Person",
                      "name": "Chef Alex"
                    }
                  }
                  </script>
                </head>
                <body></body>
                </html>
                """.trimIndent()
            }
        )

        val draft = importer.import("https://example.com/pancakes")

        assertEquals("Best Pancakes", draft.title)
        assertEquals("Easy weekend pancakes.", draft.description)
        assertEquals(listOf("2 cups flour", "1 cup milk"), draft.ingredients.map(ImportedIngredientDraft::originalText))
        assertEquals("Whisk the dry ingredients.\nCook on a hot griddle.", draft.instructions)
        assertEquals("https://example.com/images/pancakes.jpg", draft.mainPhotoUrl)
        assertEquals("Chef Alex", draft.sourceName)
        assertEquals("https://example.com/pancakes", draft.sourceUrl)
        assertEquals(4.0, draft.servings?.amount)
        assertEquals("servings", draft.servings?.unit)
        assertEquals(10, draft.times?.prepTimeMinutes)
        assertEquals(15, draft.times?.cookTimeMinutes)
        assertEquals(25, draft.times?.totalTimeMinutes)
        assertEquals("shared_webpage_url", draft.importMetadata.sourceType)
        assertEquals("shared-import-extractor-v1", draft.importMetadata.extractorVersion)
    }

    @Test
    fun import_urlWithRecipeSchema_extractsPrimaryImageFromImageObject() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(
            fetchUrlContent = {
                """
                <html>
                <head>
                  <script type="application/ld+json">
                  {
                    "@context": "https://schema.org",
                    "@type": "Recipe",
                    "name": "Soup",
                    "image": {
                      "@type": "ImageObject",
                      "url": "/media/soup.png"
                    },
                    "recipeIngredient": ["1 onion"],
                    "recipeInstructions": "Cook."
                  }
                  </script>
                </head>
                </html>
                """.trimIndent()
            }
        )

        val draft = importer.import("https://example.com/recipes/soup")

        assertEquals("https://example.com/media/soup.png", draft.mainPhotoUrl)
    }

    @Test
    fun extract_urlWithoutRecipeImage_usesOpenGraphFallback() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(
            fetchUrlContent = {
                """
                <html>
                <head>
                  <title>Fancy Pasta</title>
                  <meta property="og:image" content="/images/pasta-hero.jpg" />
                  <script type="application/ld+json">
                  {
                    "@context": "https://schema.org",
                    "@type": "Recipe",
                    "name": "Fancy Pasta",
                    "recipeIngredient": ["200 g pasta"],
                    "recipeInstructions": "Boil."
                  }
                  </script>
                </head>
                </html>
                """.trimIndent()
            }
        )

        val bundle = importer.extract(importer.createImportSource("https://example.com/pasta"))

        assertEquals(
            "https://example.com/images/pasta-hero.jpg",
            bundle.deterministicFields.mainPhotoUrl
        )
    }

    @Test
    fun extract_urlWithoutRecipeSchema_returnsFallbackBundleWarning() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(
            fetchUrlContent = {
                """
                <html>
                <head><title>Story Page</title></head>
                <body><p>No structured recipe here.</p></body>
                </html>
                """.trimIndent()
            }
        )

        val source = importer.createImportSource("https://example.com/story")
        val bundle = importer.extract(source)

        assertEquals("shared_webpage_url", bundle.sourceType)
        assertEquals("Story Page", bundle.deterministicFields.title)
        assertEquals("https://example.com/story", bundle.deterministicFields.sourceUrl)
        assertTrue(bundle.warnings.any { it.code == "missing_recipe_schema" })
    }

    @Test
    fun extract_plainRecipeText_buildsRawExtractionBundle() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(fetchUrlContent = { error("network not expected") })

        val source = importer.createImportSource(
            """
            Chocolate Cake

            Ingredients
            2 cups flour
            1 cup sugar

            Instructions
            1. Mix everything together.
            2. Bake for 30 minutes.
            """.trimIndent()
        )
        val bundle = importer.extract(source)

        assertEquals("shared_text", bundle.sourceType)
        assertEquals("Chocolate Cake", bundle.deterministicFields.title)
        assertEquals(listOf("2 cups flour", "1 cup sugar"), bundle.deterministicFields.ingredientLines)
        assertEquals(
            listOf("Mix everything together.", "Bake for 30 minutes."),
            bundle.deterministicFields.instructionLines
        )
        assertTrue(bundle.warnings.isEmpty())
    }

    @Test
    fun import_plainRecipeText_separatesTitleIngredientsAndInstructions() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(fetchUrlContent = { error("network not expected") })

        val draft = importer.import(
            """
            Chocolate Cake

            Ingredients
            2 cups flour
            1 cup sugar

            Instructions
            1. Mix everything together.
            2. Bake for 30 minutes.
            """.trimIndent()
        )

        assertEquals("Chocolate Cake", draft.title)
        assertEquals(listOf("2 cups flour", "1 cup sugar"), draft.ingredients.map(ImportedIngredientDraft::originalText))
        assertEquals("Mix everything together.\nBake for 30 minutes.", draft.instructions)
        assertEquals("shared_text", draft.importMetadata.sourceType)
    }

    @Test
    fun finishDraft_aiSuccessPrefersAiContentAndPreservesMetadata() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(
            fetchUrlContent = { error("network not expected") },
            aiRecipeImportService = object : AiRecipeImportService {
                override suspend fun buildDraft(request: AiRecipeImportRequest): AiRecipeImportResult {
                    assertEquals(AppLanguage.FR, request.activeLanguage)
                    assertEquals("shared_text", request.sourceType)
                    return AiRecipeImportResult.Success(
                        AiRecipeImportResponse(
                            payload = AiRecipeDraftPayload(
                                title = "Gateau affine",
                                description = "Description AI",
                                ingredients = listOf(
                                    ImportedIngredientDraft(
                                        id = "ingredient-1",
                                        ingredientName = "farine",
                                        quantity = 2.0,
                                        unit = "tasses",
                                        originalText = "2 tasses de farine"
                                    )
                                ),
                                instructions = "Melanger.\nCuire.",
                                notes = "Note AI",
                                sourceName = "AI Source",
                                sourceUrl = "https://example.com/ai"
                            ),
                            warnings = listOf(
                                ImportWarning(
                                    code = "ai_partial_cleanup",
                                    severity = ImportWarningSeverity.INFO,
                                    field = "ingredients"
                                )
                            ),
                            generatorLabel = "fake_ai",
                            isPartial = true
                        )
                    )
                }
            }
        )

        val source = importer.createImportSource(
            """
            Cake

            Ingredients
            2 cups flour

            Instructions
            1. Bake.
            """.trimIndent()
        )
        val bundle = importer.extract(source)
        val draft = importer.finishDraft(bundle, activeLanguage = AppLanguage.FR)

        assertEquals("Gateau affine", draft.title)
        assertEquals(listOf("2 tasses de farine"), draft.ingredients.map(ImportedIngredientDraft::originalText))
        assertEquals(2.0, draft.ingredients.first().quantity)
        assertEquals("tasses", draft.ingredients.first().unit)
        assertEquals("Melanger.\nCuire.", draft.instructions)
        assertEquals("fake_ai", draft.importMetadata.generatorLabel)
        assertEquals("shared-import-extractor-v1", draft.importMetadata.extractorVersion)
        assertTrue(draft.warnings.any { it.code == "ai_partial_cleanup" })
    }

    @Test
    fun finishDraft_aiInvalidFallsBackToDeterministicDraft() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(
            fetchUrlContent = { error("network not expected") },
            aiRecipeImportService = object : AiRecipeImportService {
                override suspend fun buildDraft(request: AiRecipeImportRequest): AiRecipeImportResult =
                    AiRecipeImportResult.Success(
                        AiRecipeImportResponse(
                            payload = AiRecipeDraftPayload(),
                            generatorLabel = "broken_ai"
                        )
                    )
            }
        )

        val source = importer.createImportSource(
            """
            Chocolate Cake

            Ingredients
            2 cups flour
            1 cup sugar

            Instructions
            1. Mix everything together.
            2. Bake for 30 minutes.
            """.trimIndent()
        )
        val bundle = importer.extract(source)
        val draft = importer.finishDraft(bundle, activeLanguage = AppLanguage.EN)

        assertEquals("Chocolate Cake", draft.title)
        assertEquals(listOf("2 cups flour", "1 cup sugar"), draft.ingredients.map(ImportedIngredientDraft::originalText))
        assertEquals("Mix everything together.\nBake for 30 minutes.", draft.instructions)
        assertEquals(null, draft.importMetadata.generatorLabel)
        assertTrue(draft.warnings.any { it.code == "ai_response_invalid" })
    }

    @Test
    fun finishDraft_aiFailureFallsBackToDeterministicDraftWithInfoWarning() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(
            fetchUrlContent = { error("network not expected") },
            aiRecipeImportService = object : AiRecipeImportService {
                override suspend fun buildDraft(request: AiRecipeImportRequest): AiRecipeImportResult =
                    AiRecipeImportResult.Failed(
                        reasonCode = "network_timeout",
                        retryable = true
                    )
            }
        )

        val draft = importer.import(
            """
            Toast

            Ingredients
            2 slices bread

            Instructions
            1. Toast bread.
            """.trimIndent()
        )

        assertEquals("Toast", draft.title)
        assertTrue(draft.warnings.any { it.code == "ai_draft_unavailable" })
    }

    @Test
    fun extract_noteLikeSharedText_emitsMissingSectionWarnings() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(fetchUrlContent = { error("network not expected") })

        val source = importer.createImportSource(
            """
            Grandma's note
            Delicious with tea.
            Best made the day before.
            """.trimIndent()
        )
        val bundle = importer.extract(source)

        assertFalse(bundle.warnings.isEmpty())
        assertTrue(bundle.warnings.any { it.code == "ingredient_section_missing" })
        assertTrue(bundle.warnings.any { it.code == "instruction_section_missing" })
    }

    @Test
    fun mapToDraft_preservesJobIdAndWarnings() {
        val importer = SharedRecipeImporter(fetchUrlContent = { error("network not expected") })

        val draft = importer.mapToDraft(
            RawExtractionBundle(
                jobId = "job-123",
                sourceId = "source-123",
                extractorVersion = "extractor-v1",
                sourceType = "shared_text",
                deterministicFields = DeterministicRecipeFields(
                    title = "Imported title",
                    ingredientLines = listOf("1 cup milk")
                ),
                warnings = listOf(
                    ImportWarning(
                        code = "ingredient_section_missing",
                        severity = ImportWarningSeverity.INFO,
                        field = "ingredients"
                    )
                )
            )
        )

        assertEquals("job-123", draft.importJobId)
        assertEquals(1, draft.warnings.size)
        assertEquals("ingredient_section_missing", draft.warnings.first().code)
        assertEquals("extractor-v1", draft.importMetadata.extractorVersion)
        assertEquals(listOf("1 cup milk"), draft.ingredients.map(ImportedIngredientDraft::originalText))
    }

    @Test
    fun applyToRecipe_populatesOnlyTargetLanguage() {
        val draft = ImportedRecipeDraft(
            title = "Imported Soup",
            description = "A simple soup.",
            ingredients = listOf(
                ImportedIngredientDraft(
                    id = "ingredient-1",
                    ingredientName = "onion",
                    quantity = 1.0,
                    originalText = "1 onion"
                )
            ),
            instructions = "Cook gently.",
            notes = "Shared from notes.",
            mainPhotoUrl = "https://example.com/images/soup.jpg",
            sourceUrl = "https://example.com/soup"
        )

        val recipe = draft.applyToRecipe(blankRecipe(), AppLanguage.EN)

        assertEquals("Imported Soup", recipe.languages.en.title)
        assertEquals("", recipe.languages.fr.title)
        assertEquals("Cook gently.", recipe.languages.en.instructions)
        assertTrue(recipe.ingredients.isNotEmpty())
        assertEquals("onion", recipe.ingredients.first().ingredientName)
        assertEquals(1.0, recipe.ingredients.first().quantity)
        assertTrue(recipe.photos.isEmpty())
        assertEquals("https://example.com/soup", recipe.source?.sourceUrl)
    }

    @Test
    fun finishDraft_aiNewIngredientAssignsPendingPlaceholderReferenceId() = kotlinx.coroutines.runBlocking {
        val importer = SharedRecipeImporter(
            fetchUrlContent = { error("network not expected") },
            aiRecipeImportService = object : AiRecipeImportService {
                override suspend fun buildDraft(request: AiRecipeImportRequest): AiRecipeImportResult =
                    AiRecipeImportResult.Success(
                        AiRecipeImportResponse(
                            payload = AiRecipeDraftPayload(
                                title = "Soup",
                                ingredients = listOf(
                                    ImportedIngredientDraft(
                                        id = "ingredient-1",
                                        ingredientName = "shallot",
                                        originalText = "1 shallot",
                                        ingredientRefId = "imported-pending-ref:ingredient-1",
                                        pendingReference = ImportedIngredientReferenceDraft(
                                            nameFr = "\u00c9chalote",
                                            nameEn = "Shallot",
                                            aliasesEn = listOf("shallot")
                                        )
                                    )
                                ),
                                instructions = "Cook."
                            ),
                            generatorLabel = "fake_ai"
                        )
                    )
            }
        )

        val draft = importer.import(
            """
            Soup

            Ingredients
            1 shallot

            Instructions
            1. Cook.
            """.trimIndent()
        )

        assertEquals("imported-pending-ref:ingredient-1", draft.ingredients.first().ingredientRefId)
        assertEquals("Shallot", draft.ingredients.first().pendingReference?.nameEn)
    }

    private fun blankRecipe(): Recipe = Recipe(
        id = "recipe-1",
        createdAt = "2026-04-12T00:00:00Z",
        updatedAt = "2026-04-12T00:00:00Z",
        languages = BilingualText(
            fr = LocalizedSystemText(title = "", description = "", instructions = "", notes = ""),
            en = LocalizedSystemText(title = "", description = "", instructions = "", notes = "")
        ),
        ingredients = emptyList()
    )
}
