package app.recipebook

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.SharedRecipeImporter
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class ImportRecipeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        keepScreenOnWhileInUse()
        WindowCompat.setDecorFitsSystemWindows(window, true)

        val languageStore = AppLanguageStore(this)
        setContent {
            RecipeBookTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = getString(R.string.import_loading_label),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }

        lifecycleScope.launch {
            val sharedText = intent.getStringExtra(Intent.EXTRA_TEXT).orEmpty()
            val subject = intent.getStringExtra(Intent.EXTRA_SUBJECT)
            val language = languageStore.language.first()
            val importer = SharedRecipeImporter()
            val source = importer.createImportSource(sharedText, sourceNameHint = subject)
            val job = importer.createImportJob(source)
            val extraction = importer.extract(source, job)
            val draft = importer.mapToDraft(extraction)
            startActivity(RecipeEditorActivity.intentForImportedDraft(this@ImportRecipeActivity, draft, language))
            finish()
        }
    }
}
