package app.recipebook.data.local.recipes

import android.content.Context
import app.recipebook.data.local.db.RecipeBookDatabaseProvider

object RecipeRepositoryProvider {
    fun create(context: Context): RecipeRepository {
        val db = RecipeBookDatabaseProvider.get(context)

        return RecipeRepository(
            recipeDao = db.recipeDao(),
            ingredientReferenceDao = db.ingredientReferenceDao(),
            contextualSubstitutionRuleDao = db.contextualSubstitutionRuleDao(),
            tagDao = db.tagDao(),
            collectionDao = db.collectionDao(),
            seedLibraryLoader = { BundledRecipeLibraryLoader.loadLibrary(context.applicationContext) }
        )
    }
}
