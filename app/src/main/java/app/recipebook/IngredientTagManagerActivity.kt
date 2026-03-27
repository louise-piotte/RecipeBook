package app.recipebook

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import app.recipebook.ui.recipes.IngredientTagManagerScreen
import app.recipebook.ui.recipes.LibraryManagerSection
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.launch

class IngredientTagManagerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)

        val repository = RecipeRepositoryProvider.create(this)
        val languageStore = AppLanguageStore(this)
        val initialSection = intent.getStringExtra(EXTRA_INITIAL_SECTION)
            ?.let { runCatching { LibraryManagerSection.valueOf(it) }.getOrNull() }
            ?: LibraryManagerSection.Ingredients

        lifecycleScope.launch {
            repository.seedBundledLibraryIfMissing()
        }

        setContent {
            RecipeBookTheme {
                val language by languageStore.language.collectAsState(initial = AppLanguage.EN)
                val ingredientReferences by repository.observeIngredientReferences().collectAsState(initial = emptyList())
                val tags by repository.observeTags().collectAsState(initial = emptyList())

                IngredientTagManagerScreen(
                    ingredientReferences = ingredientReferences,
                    tags = tags,
                    language = language,
                    onLanguageChange = { selected ->
                        lifecycleScope.launch { languageStore.setLanguage(selected) }
                    },
                    initialSection = initialSection,
                    onNavigateToLibrary = {
                        startActivity(
                            Intent(this, MainActivity::class.java).apply {
                                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                            }
                        )
                        finish()
                    },
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

    companion object {
        private const val EXTRA_INITIAL_SECTION = "initial_section"

        fun intentForSection(context: Context, section: LibraryManagerSection): Intent {
            return Intent(context, IngredientTagManagerActivity::class.java).apply {
                putExtra(EXTRA_INITIAL_SECTION, section.name)
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            }
        }
    }
}


