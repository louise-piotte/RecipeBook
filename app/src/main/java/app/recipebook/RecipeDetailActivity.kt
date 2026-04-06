package app.recipebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import app.recipebook.ui.recipes.LibraryManagerSection
import app.recipebook.ui.recipes.MainMenuDestination
import app.recipebook.ui.recipes.RecipeDetailScreen
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

class RecipeDetailActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        keepScreenOnWhileInUse()
        WindowCompat.setDecorFitsSystemWindows(window, true)

        val repository = RecipeRepositoryProvider.create(this)
        val languageStore = AppLanguageStore(this)
        val recipeId = intent.getStringExtra(EXTRA_RECIPE_ID)

        lifecycleScope.launch {
            repository.seedBundledLibraryIfMissing()
        }

        setContent {
            RecipeBookTheme {
                val language by languageStore.language.collectAsState(initial = AppLanguage.EN)
                val recipe by if (recipeId == null) {
                    flowOf(null).collectAsState(initial = null)
                } else {
                    repository.observeRecipeById(recipeId).collectAsState(initial = null)
                }
                val ingredientReferences by repository.observeIngredientReferences().collectAsState(initial = emptyList())
                val tags by repository.observeTags().collectAsState(initial = emptyList())

                RecipeDetailScreen(
                    recipe = recipe,
                    ingredientReferences = ingredientReferences,
                    tags = tags,
                    language = language,
                    onLanguageChange = { selected ->
                        lifecycleScope.launch { languageStore.setLanguage(selected) }
                    },
                    onBack = ::finish,
                    onNavigate = { destination ->
                        when (destination) {
                            MainMenuDestination.Library -> {
                                startActivity(MainActivity.intentForCollection(this, null))
                                finish()
                            }
                            MainMenuDestination.Collections -> {
                                startActivity(CollectionManagerActivity.intent(this))
                                finish()
                            }
                            MainMenuDestination.Ingredients -> {
                                startActivity(IngredientTagManagerActivity.intentForSection(this, LibraryManagerSection.Ingredients))
                                finish()
                            }
                            MainMenuDestination.Tags -> {
                                startActivity(IngredientTagManagerActivity.intentForSection(this, LibraryManagerSection.Tags))
                                finish()
                            }
                        }
                    },
                    onEdit = {
                        startActivity(
                            android.content.Intent(this, RecipeEditorActivity::class.java)
                                .putExtra(RecipeEditorActivity.EXTRA_RECIPE_ID, it)
                        )
                    }
                )
            }
        }
    }

    companion object {
        const val EXTRA_RECIPE_ID = "recipe_id"
    }
}


