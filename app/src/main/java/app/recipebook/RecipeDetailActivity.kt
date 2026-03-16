package app.recipebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.ui.recipes.RecipeDetailScreen
import app.recipebook.ui.theme.RecipeBookTheme

class RecipeDetailActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val repository = RecipeRepositoryProvider.create(this)
        val recipeId = intent.getStringExtra(EXTRA_RECIPE_ID)

        setContent {
            RecipeBookTheme {
                val recipe by if (recipeId == null) {
                    kotlinx.coroutines.flow.flowOf(null).collectAsState(initial = null)
                } else {
                    repository.observeRecipeById(recipeId).collectAsState(initial = null)
                }

                RecipeDetailScreen(
                    recipe = recipe,
                    onBack = ::finish,
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
