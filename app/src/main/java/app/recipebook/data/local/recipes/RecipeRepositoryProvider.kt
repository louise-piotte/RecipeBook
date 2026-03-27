package app.recipebook.data.local.recipes

import android.content.Context
import app.recipebook.data.local.db.RecipeBookDatabaseProvider

object RecipeRepositoryProvider {
    fun create(context: Context): RecipeRepository {
        val db = RecipeBookDatabaseProvider.get(context)
        val bundledLibrary = BundledRecipeLibraryLoader.loadLibrary(context)

        return RecipeRepository(
            recipeDao = db.recipeDao(),
            ingredientReferenceDao = db.ingredientReferenceDao(),
            tagDao = db.tagDao(),
            seedLibrary = bundledLibrary
        )
    }
}
