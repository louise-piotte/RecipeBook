package app.recipebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.ui.recipes.RecipeLibraryScreen
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val repository = RecipeRepositoryProvider.create(this)
        lifecycleScope.launch {
            repository.seedBundledRecipesIfMissing()
        }

        setContent {
            RecipeBookTheme {
                RecipeLibraryScreen(repository = repository)
            }
        }
    }
}
