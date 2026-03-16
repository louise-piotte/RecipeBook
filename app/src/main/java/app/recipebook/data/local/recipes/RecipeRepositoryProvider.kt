package app.recipebook.data.local.recipes

import android.content.Context
import app.recipebook.data.local.db.RecipeBookDatabaseProvider
import app.recipebook.domain.model.Recipe

object RecipeRepositoryProvider {
    fun create(context: Context): RecipeRepository {
        val seedRecipes = (PlaceholderRecipes.recipes + BundledRecipeLibraryLoader.loadRecipes(context))
            .distinctBy(Recipe::id)

        return RecipeRepository(
            recipeDao = RecipeBookDatabaseProvider.get(context).recipeDao(),
            seedRecipes = seedRecipes
        )
    }
}
