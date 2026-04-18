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
import app.recipebook.data.local.settings.AiBackendSettings
import app.recipebook.data.local.settings.AiBackendSettingsStore
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import app.recipebook.ui.recipes.AiSettingsScreen
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.launch

class AiSettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        keepScreenOnWhileInUse()
        WindowCompat.setDecorFitsSystemWindows(window, true)

        val languageStore = AppLanguageStore(this)
        val aiSettingsStore = AiBackendSettingsStore(this)

        setContent {
            RecipeBookTheme {
                val language by languageStore.language.collectAsState(initial = AppLanguage.EN)
                val aiSettings by aiSettingsStore.settings.collectAsState(initial = AiBackendSettings())

                AiSettingsScreen(
                    language = language,
                    settings = aiSettings,
                    onLanguageChange = { selected ->
                        lifecycleScope.launch { languageStore.setLanguage(selected) }
                    },
                    onBack = ::finish,
                    onSave = { updated ->
                        lifecycleScope.launch { aiSettingsStore.save(updated) }
                    },
                    onNavigateToLibrary = {
                        startActivity(MainActivity.intentForCollection(this, null))
                        finish()
                    },
                    onNavigateToCollections = {
                        startActivity(CollectionManagerActivity.intent(this))
                        finish()
                    },
                    onNavigateToIngredients = {
                        startActivity(IngredientTagManagerActivity.intentForSection(this, app.recipebook.ui.recipes.LibraryManagerSection.Ingredients))
                        finish()
                    },
                    onNavigateToTags = {
                        startActivity(IngredientTagManagerActivity.intentForSection(this, app.recipebook.ui.recipes.LibraryManagerSection.Tags))
                        finish()
                    }
                )
            }
        }
    }

    companion object {
        fun intent(context: Context): Intent = Intent(context, AiSettingsActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        }
    }
}
