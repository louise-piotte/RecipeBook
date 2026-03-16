package app.recipebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.ui.recipes.IngredientTagManagerScreen
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.launch

class IngredientTagManagerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val repository = RecipeRepositoryProvider.create(this)
        lifecycleScope.launch {
            repository.seedBundledLibraryIfMissing()
        }

        setContent {
            RecipeBookTheme {
                val ingredientReferences by repository.observeIngredientReferences().collectAsState(initial = emptyList())
                val tags by repository.observeTags().collectAsState(initial = emptyList())

                IngredientTagManagerScreen(
                    ingredientReferences = ingredientReferences,
                    tags = tags,
                    onBack = ::finish,
                    onCreateIngredient = { draft: IngredientReferenceDraft ->
                        lifecycleScope.launch { repository.createIngredientReference(draft) }
                    },
                    onUpdateIngredient = { id: String, draft: IngredientReferenceDraft ->
                        lifecycleScope.launch { repository.updateIngredientReference(id, draft) }
                    },
                    onCreateTag = { draft: TagDraft ->
                        lifecycleScope.launch { repository.createTag(draft) }
                    },
                    onUpdateTag = { id: String, draft: TagDraft ->
                        lifecycleScope.launch { repository.updateTag(id, draft) }
                    }
                )
            }
        }
    }
}
