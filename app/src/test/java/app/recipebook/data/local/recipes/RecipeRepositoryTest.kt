package app.recipebook.data.local.recipes

import app.recipebook.data.local.db.RecipeEntity
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.ui.recipes.normalizeMultilineText
import app.recipebook.ui.recipes.parseIngredients
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeRepositoryTest {

    @Test
    fun recipeEntityRoundTrip_preservesRecipeDetails() {
        val original = PlaceholderRecipes.recipes.first()

        val roundTrip = original.toEntity().toDomainRecipe()

        assertEquals(original.languages.fr.title, roundTrip.languages.fr.title)
        assertEquals(original.languages.en.instructions, roundTrip.languages.en.instructions)
        assertEquals(original.ingredients.first().originalText, roundTrip.ingredients.first().originalText)
        assertEquals(original.userNotes?.en, roundTrip.userNotes?.en)
        assertEquals(original.servings?.amount, roundTrip.servings?.amount)
    }

    @Test
    fun placeholderRecipes_keepBilingualSystemFieldsFilled() {
        PlaceholderRecipes.recipes.forEach { recipe ->
            assertTrue(recipe.languages.fr.title.isNotBlank())
            assertTrue(recipe.languages.en.title.isNotBlank())
            assertTrue(recipe.languages.fr.description.isNotBlank())
            assertTrue(recipe.languages.en.description.isNotBlank())
            assertTrue(recipe.languages.fr.instructions.isNotBlank())
            assertTrue(recipe.languages.en.instructions.isNotBlank())
        }
    }

    @Test
    fun createBlankRecipe_returnsEditableSkeleton() {
        val recipe = RecipeRepository(FakeRecipeDao()).createBlankRecipe("2026-03-13T13:00:00Z")

        assertNotNull(recipe.id)
        assertEquals("2026-03-13T13:00:00Z", recipe.createdAt)
        assertEquals("", recipe.languages.fr.title)
        assertEquals("", recipe.languages.en.instructions)
        assertTrue(recipe.ingredients.isEmpty())
    }

    @Test
    fun seedBundledRecipesIfMissing_onlyInsertsMissingIds() = runBlocking {
        val fakeDao = FakeRecipeDao()
        val existingRecipe = PlaceholderRecipes.recipes.first().copy(
            languages = BilingualText(
                fr = PlaceholderRecipes.recipes.first().languages.fr.copy(title = "Recette deja la"),
                en = PlaceholderRecipes.recipes.first().languages.en.copy(title = "Existing recipe")
            )
        )
        fakeDao.upsert(existingRecipe.toEntity())

        val missingRecipe = PlaceholderRecipes.recipes[1].copy(id = "seed-missing")
        val repository = RecipeRepository(
            recipeDao = fakeDao,
            seedRecipes = listOf(PlaceholderRecipes.recipes.first(), missingRecipe)
        )

        repository.seedBundledRecipesIfMissing()

        assertEquals(2, fakeDao.size())
        assertEquals("Existing recipe", fakeDao.stored(existingRecipe.id)?.titleEn)
        assertEquals(missingRecipe.languages.en.title, fakeDao.stored(missingRecipe.id)?.titleEn)
    }

    @Test
    fun parseIngredients_createsOneIngredientPerLine() {
        val ingredients = parseIngredients("1 cup flour\n\n2 eggs\n pinch salt ")

        assertEquals(3, ingredients.size)
        assertEquals("1 cup flour", ingredients[0].originalText)
        assertEquals("flour", ingredients[0].ingredientName)
        assertEquals("salt", ingredients[2].ingredientName)
    }

    @Test
    fun normalizeMultilineText_ignoresBlankLines() {
        val normalized = normalizeMultilineText("Step one\n   \nStep two\n")

        assertEquals("Step one\nStep two", normalized)
    }
}

private class FakeRecipeDao : app.recipebook.data.local.db.RecipeDao {
    private val recipes = linkedMapOf<String, RecipeEntity>()

    override suspend fun upsert(recipe: RecipeEntity) {
        recipes[recipe.id] = recipe
    }

    override suspend fun upsertAll(recipes: List<RecipeEntity>) {
        recipes.forEach { recipe ->
            this.recipes[recipe.id] = recipe
        }
    }

    override suspend fun getById(id: String): RecipeEntity? = recipes[id]

    override fun observeById(id: String) = flowOf(recipes[id])

    override fun observeAll() = flowOf(recipes.values.toList())

    override fun observeByTitle(query: String) = flowOf(recipes.values.filter {
        it.titleFr.contains(query, ignoreCase = true) || it.titleEn.contains(query, ignoreCase = true)
    })

    override suspend fun countActive(): Int = recipes.values.count { it.deletedAt == null }

    override suspend fun deleteById(id: String) {
        recipes.remove(id)
    }

    fun stored(id: String): RecipeEntity? = recipes[id]

    fun size(): Int = recipes.size
}
