package app.recipebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.Recipe
import app.recipebook.ui.recipes.RecipeEditorScreen
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.launch

class RecipeEditorActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val repository = RecipeRepositoryProvider.create(this)
        val languageStore = AppLanguageStore(this)
        val recipeId = intent.getStringExtra(EXTRA_RECIPE_ID)
        val isNewRecipe = recipeId == null

        setContent {
            RecipeBookTheme {
                val language by languageStore.language.collectAsState(initial = AppLanguage.EN)
                var recipe by remember { mutableStateOf<Recipe?>(null) }
                val ingredientReferences by repository.observeIngredientReferences().collectAsState(initial = emptyList())
                val tags by repository.observeTags().collectAsState(initial = emptyList())

                LaunchedEffect(recipeId) {
                    repository.seedBundledLibraryIfMissing()
                    recipe = if (recipeId == null) {
                        repository.createBlankRecipe()
                    } else {
                        repository.getRecipeById(recipeId) ?: repository.createBlankRecipe()
                    }
                }

                recipe?.let { currentRecipe ->
                    RecipeEditorScreen(
                        initialRecipe = currentRecipe,
                        isNewRecipe = isNewRecipe,
                        ingredientReferences = ingredientReferences,
                        tags = tags,
                        language = language,
                        onLanguageChange = { selected ->
                            lifecycleScope.launch { languageStore.setLanguage(selected) }
                        },
                        onBack = ::finish,
                        onSave = { updatedRecipe ->
                            lifecycleScope.launch {
                                repository.upsertRecipe(updatedRecipe)
                                finish()
                            }
                        },
                        onCreateIngredientReference = { draft -> repository.createIngredientReference(draft) },
                        onCreateTag = { draft -> repository.createTag(draft) },
                        onDelete = if (isNewRecipe) null else {
                            {
                                lifecycleScope.launch {
                                    repository.deleteRecipeById(currentRecipe.id)
                                    finish()
                                }
                            }
                        }
                    )
                }
            }
        }
    }

    companion object {
        const val EXTRA_RECIPE_ID = "recipe_id"
    }
}
