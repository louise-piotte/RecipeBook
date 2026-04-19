package app.recipebook

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.LaunchSyncOutcome
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.ui.recipes.RecipeLibraryScreen
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private var initialCollectionId by mutableStateOf<String?>(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        keepScreenOnWhileInUse()
        WindowCompat.setDecorFitsSystemWindows(window, true)
        initialCollectionId = intent.getStringExtra(EXTRA_INITIAL_COLLECTION_ID)

        val services = RecipeRepositoryProvider.createServices(this)
        val repository = services.repository
        val languageStore = AppLanguageStore(this)
        lifecycleScope.launch {
            when (val outcome = services.syncCoordinator.syncFromConfiguredSourceOnLaunch()) {
                LaunchSyncOutcome.NotConfigured -> repository.seedBundledLibraryIfMissing()
                LaunchSyncOutcome.PulledFromDrive -> {
                    Toast.makeText(this@MainActivity, getString(R.string.drive_sync_pull_success_label), Toast.LENGTH_SHORT).show()
                }
                LaunchSyncOutcome.RestoredFromLocalCache -> {
                    Toast.makeText(this@MainActivity, getString(R.string.drive_sync_cache_restore_label), Toast.LENGTH_SHORT).show()
                }
                is LaunchSyncOutcome.Failed -> {
                    repository.seedBundledLibraryIfMissing()
                    Toast.makeText(this@MainActivity, getString(R.string.drive_sync_pull_failed_label), Toast.LENGTH_SHORT).show()
                }
            }
            languageStore.setLanguage(repository.getLibrarySettings().language)
        }

        setContent {
            RecipeBookTheme {
                val language by languageStore.language.collectAsState(initial = app.recipebook.domain.model.AppLanguage.EN)
                RecipeLibraryScreen(
                    repository = repository,
                    syncCoordinator = services.syncCoordinator,
                    language = language,
                    initialSelectedCollectionId = initialCollectionId,
                    onLanguageChange = { selected ->
                        lifecycleScope.launch {
                            languageStore.setLanguage(selected)
                            repository.updateLibrarySettings(
                                repository.getLibrarySettings().copy(language = selected)
                            )
                        }
                    }
                )
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        initialCollectionId = intent.getStringExtra(EXTRA_INITIAL_COLLECTION_ID)
    }

    companion object {
        private const val EXTRA_INITIAL_COLLECTION_ID = "initial_collection_id"

        fun intentForCollection(context: Context, collectionId: String?): Intent {
            return Intent(context, MainActivity::class.java).apply {
                if (collectionId != null) {
                    putExtra(EXTRA_INITIAL_COLLECTION_ID, collectionId)
                }
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            }
        }
    }
}


