package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.LocalizedSystemText
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SharedRecipeImportTest {

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
        assertEquals(listOf("2 cups flour", "1 cup milk"), draft.ingredients)
        assertEquals("Whisk the dry ingredients.\nCook on a hot griddle.", draft.instructions)
        assertEquals("Chef Alex", draft.sourceName)
        assertEquals("https://example.com/pancakes", draft.sourceUrl)
        assertEquals(4.0, draft.servings?.amount)
        assertEquals("servings", draft.servings?.unit)
        assertEquals(10, draft.times?.prepTimeMinutes)
        assertEquals(15, draft.times?.cookTimeMinutes)
        assertEquals(25, draft.times?.totalTimeMinutes)
        assertEquals("shared_webpage_url", draft.importMetadata.sourceType)
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
        assertEquals(listOf("2 cups flour", "1 cup sugar"), draft.ingredients)
        assertEquals("Mix everything together.\nBake for 30 minutes.", draft.instructions)
        assertEquals("shared_text", draft.importMetadata.sourceType)
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
    fun applyToRecipe_populatesOnlyTargetLanguage() {
        val draft = ImportedRecipeDraft(
            title = "Imported Soup",
            description = "A simple soup.",
            ingredients = listOf("1 onion"),
            instructions = "Cook gently.",
            notes = "Shared from notes.",
            sourceUrl = "https://example.com/soup"
        )

        val recipe = draft.applyToRecipe(blankRecipe(), AppLanguage.EN)

        assertEquals("Imported Soup", recipe.languages.en.title)
        assertEquals("", recipe.languages.fr.title)
        assertEquals("Cook gently.", recipe.languages.en.instructions)
        assertTrue(recipe.ingredients.isNotEmpty())
        assertEquals("1 onion", recipe.ingredients.first().ingredientName)
        assertEquals("https://example.com/soup", recipe.source?.sourceUrl)
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
