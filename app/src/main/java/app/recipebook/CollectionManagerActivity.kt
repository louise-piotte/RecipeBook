package app.recipebook

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.CollectionDraft
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import app.recipebook.ui.recipes.CollectionManagerScreen
import app.recipebook.ui.recipes.LibraryManagerSection
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.launch

class CollectionManagerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        keepScreenOnWhileInUse()
        WindowCompat.setDecorFitsSystemWindows(window, true)

        val repository = RecipeRepositoryProvider.create(this)
        val languageStore = AppLanguageStore(this)

        lifecycleScope.launch {
            repository.seedBundledLibraryIfMissing()
        }

        setContent {
            RecipeBookTheme {
                val language by languageStore.language.collectAsState(initial = AppLanguage.EN)
                val collections by repository.observeCollections().collectAsState(initial = emptyList())
                val recipes by repository.observeRecipes().collectAsState(initial = emptyList())

                CollectionManagerScreen(
                    collections = collections,
                    recipes = recipes,
                    language = language,
                    onLanguageChange = { selected ->
                        lifecycleScope.launch { languageStore.setLanguage(selected) }
                    },
                    onNavigateToLibrary = { collectionId ->
                        startActivity(MainActivity.intentForCollection(this, collectionId))
                        finish()
                    },
                    onNavigateToIngredients = {
                        startActivity(IngredientTagManagerActivity.intentForSection(this, LibraryManagerSection.Ingredients))
                        finish()
                    },
                    onNavigateToTags = {
                        startActivity(IngredientTagManagerActivity.intentForSection(this, LibraryManagerSection.Tags))
                        finish()
                    },
                    onCreateCollection = { draft: CollectionDraft ->
                        lifecycleScope.launch { repository.createCollection(draft) }
                    },
                    onUpdateCollection = { id: String, draft: CollectionDraft ->
                        lifecycleScope.launch { repository.updateCollection(id, draft) }
                    },
                    onDeleteCollection = { id: String ->
                        lifecycleScope.launch { repository.deleteCollection(id) }
                    }
                )
            }
        }
    }

    companion object {
        fun intent(context: Context): Intent = Intent(context, CollectionManagerActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        }
    }
}
