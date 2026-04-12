package app.recipebook.data.local.recipes

import app.recipebook.domain.model.RecipeLinkType
import java.io.File
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeKeeperRecipeImportTest {

    @Test
    fun mapLegacyLinkedRecipeIds_convertsLinkedRecipeIdIntoCanonicalRecipeLinks() {
        val mappedLinks = RecipeKeeperRecipeImport.mapLegacyLinkedRecipeIds(recipeKeeperRecipeFiles().map(File::readText))

        val amarettiLink = mappedLinks.getValue("8ccbf0c1-b6d9-4908-b122-1c7dacba5f0d").single()
        assertEquals("1dca3c8b-ed68-4397-b804-ae62e769ee5e", amarettiLink.targetRecipeId)
        assertEquals(RecipeLinkType.COMPONENT, amarettiLink.linkType)

        val ribsLink = mappedLinks.getValue("a8429c9a-dcc8-4694-b09d-81c62d51af2d").single()
        assertEquals("f137bc89-dee6-46e1-b9cd-1bb426bdbdda", ribsLink.targetRecipeId)
        assertEquals(RecipeLinkType.SEASONING, ribsLink.linkType)

        val buttercreamLink = mappedLinks.getValue("c9022b89-8181-425a-9141-6a4e6086b5c8").single()
        assertEquals("4207e09a-429f-437f-b7bd-14e862d6d696", buttercreamLink.targetRecipeId)
        assertEquals(RecipeLinkType.FROSTING, buttercreamLink.linkType)

        val raspberryPieLink = mappedLinks.getValue("166eae41-5c40-4a1c-8c3e-2cec590ab18c").single()
        assertEquals("1d0e8bf3-4792-46f3-8766-5f2ab51af7ca", raspberryPieLink.targetRecipeId)
        assertEquals(RecipeLinkType.COMPONENT, raspberryPieLink.linkType)

        assertTrue(mappedLinks.getValue("0a8b29b8-faf0-4597-8514-e09335de6c03").isEmpty())
    }

    @Test
    fun canonicalRecipeLinksFor_preservesUnknownTargetsAsOtherLinks() {
        val recipe = RecipeKeeperRecipeImport.parseRecipe(
            """
            {
              "recipeId": "source-recipe",
              "title": "Legacy recipe",
              "linkedRecipeId": "missing-target",
              "course": "Dessert",
              "categories": []
            }
            """.trimIndent()
        )

        val links = RecipeKeeperRecipeImport.canonicalRecipeLinksFor(
            recipe = recipe,
            recipesById = mapOf(recipe.recipeId to recipe)
        )

        assertEquals(1, links.size)
        assertEquals("missing-target", links.single().targetRecipeId)
        assertEquals(RecipeLinkType.OTHER, links.single().linkType)
    }

    private fun recipeKeeperRecipeFiles(): List<File> {
        val root = listOf(
            File("docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes"),
            File("../docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes")
        ).firstOrNull(File::exists)
            ?: error("RecipeKeeper processed recipe fixtures not found")
        return root.listFiles()
            ?.filter { it.isFile && it.name.startsWith("processed_") && it.extension == "json" }
            ?.sortedBy { it.name }
            .orEmpty()
    }
}
