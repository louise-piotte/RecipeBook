package app.recipebook.data.local.recipes

import java.io.File
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeKeeperIngredientImportTest {

    @Test
    fun parseRecipes_readsRecipeKeeperExportStructure() {
        val html = recipeKeeperExportFile().readText()

        val recipes = RecipeKeeperIngredientImport.parseRecipes(html)

        assertEquals(114, recipes.size)
        assertTrue(recipes.all { it.title.isNotBlank() })
        assertTrue(recipes.any { it.ingredientLines.isNotEmpty() })
    }

    @Test
    fun extractCandidateNames_normalizesBilingualAndOptionalLines() {
        assertEquals(
            listOf("sugar"),
            RecipeKeeperIngredientImport.extractCandidateNames("1 tasse (198 g) de sucre - 1 cup (198g) sugar")
        )
        assertEquals(
            listOf("honey", "maple syrup"),
            RecipeKeeperIngredientImport.extractCandidateNames("Optional Sweetness: 1 tbsp honey or maple syrup")
        )
        assertEquals(
            listOf("almond milk", "oat milk"),
            RecipeKeeperIngredientImport.extractCandidateNames("3 tbsp almond milk or oat milk (I love vanilla unsweetened almond milk)")
        )
        assertEquals(
            listOf("rolled oats"),
            RecipeKeeperIngredientImport.extractCandidateNames("1/2 cup old-fashion rolled oats (gluten-free if needed)")
        )
        assertEquals(
            listOf("garlic"),
            RecipeKeeperIngredientImport.extractCandidateNames("1 tablespoon minced fresh garlic")
        )
        assertEquals(
            listOf("brown sugar"),
            RecipeKeeperIngredientImport.extractCandidateNames("1/2 cup packed light brown sugar")
        )
        assertEquals(
            listOf("salt", "black pepper"),
            RecipeKeeperIngredientImport.extractCandidateNames("Salt and pepper to taste")
        )
        assertEquals(
            listOf("BBQ sauce"),
            RecipeKeeperIngredientImport.extractCandidateNames("1/2 cup BBQ sauce")
        )
        assertEquals(
            listOf("cream of tartar"),
            RecipeKeeperIngredientImport.extractCandidateNames("1/2 teaspoon cream of tartar")
        )
        assertEquals(
            listOf("white vinegar"),
            RecipeKeeperIngredientImport.extractCandidateNames("1 teaspoon distilled white vinegar")
        )
    }

    @Test
    fun auditAgainstCatalog_separatesMatchedAndUnmatchedIngredientCandidates() {
        val html = recipeKeeperExportFile().readText()

        val audit = RecipeKeeperIngredientImport.auditAgainstCatalog(html)

        assertTrue(audit.matched.any { it.ingredientName == "all-purpose flour" })
        assertTrue(audit.matched.any { it.ingredientName == "vanilla extract" })
        assertTrue(audit.matched.any { it.ingredientName == "almond milk" })
        assertTrue(audit.matched.any { it.ingredientName == "oat milk" })
        assertTrue(audit.matched.any { it.ingredientName == "banana" })
        assertTrue(audit.matched.any { it.ingredientName == "black pepper" })
        assertTrue(audit.unmatched.isNotEmpty())
    }

    private fun recipeKeeperExportFile(): File {
        return listOf(
            File("docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes.html"),
            File("../docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes.html")
        ).firstOrNull(File::exists)
            ?: error("RecipeKeeper export fixture not found")
    }
}
