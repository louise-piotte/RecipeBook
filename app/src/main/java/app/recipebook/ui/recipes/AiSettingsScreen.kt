package app.recipebook.ui.recipes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.data.local.settings.AiBackendSettings
import app.recipebook.data.local.settings.normalized
import app.recipebook.domain.model.AppLanguage

@Composable
fun AiSettingsScreen(
    language: AppLanguage,
    settings: AiBackendSettings,
    onLanguageChange: (AppLanguage) -> Unit,
    onBack: () -> Unit,
    onSave: (AiBackendSettings) -> Unit,
    onNavigateToLibrary: () -> Unit,
    onNavigateToCollections: () -> Unit,
    onNavigateToIngredients: () -> Unit,
    onNavigateToTags: () -> Unit,
    modifier: Modifier = Modifier
) {
    var apiKey by rememberSaveable { mutableStateOf(settings.apiKey) }
    var baseUrl by rememberSaveable { mutableStateOf(settings.baseUrl) }
    var model by rememberSaveable { mutableStateOf(settings.model) }

    LaunchedEffect(settings) {
        apiKey = settings.apiKey
        baseUrl = settings.baseUrl
        model = settings.model
    }

    val editedSettings = AiBackendSettings(
        apiKey = apiKey,
        baseUrl = baseUrl,
        model = model
    ).normalized()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            RecipeBookTopBar(
                title = localizedString(R.string.menu_ai_settings_label, language),
                language = language,
                onLanguageChange = onLanguageChange,
                onNavigate = { destination ->
                    when (destination) {
                        MainMenuDestination.Library -> onNavigateToLibrary()
                        MainMenuDestination.Import -> Unit
                        MainMenuDestination.Collections -> onNavigateToCollections()
                        MainMenuDestination.Ingredients -> onNavigateToIngredients()
                        MainMenuDestination.Tags -> onNavigateToTags()
                        MainMenuDestination.Settings -> Unit
                    }
                },
                disabledDestinations = setOf(MainMenuDestination.Settings),
                navigationIcon = {
                    BackIconButton(
                        contentDescription = localizedString(R.string.back_label, language),
                        onClick = onBack
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 8.dp, vertical = 6.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(localizedString(R.string.ai_settings_info_title, language))
                    Text(localizedString(R.string.ai_settings_info_message, language))
                    Text(
                        localizedString(
                            if (editedSettings.isConfigured) R.string.ai_settings_status_configured
                            else R.string.ai_settings_status_incomplete,
                            language
                        )
                    )
                }
            }

            OutlinedTextField(
                value = apiKey,
                onValueChange = { apiKey = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(localizedString(R.string.ai_settings_api_key_label, language)) },
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true
            )

            OutlinedTextField(
                value = baseUrl,
                onValueChange = { baseUrl = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(localizedString(R.string.ai_settings_base_url_label, language)) },
                singleLine = true
            )

            OutlinedTextField(
                value = model,
                onValueChange = { model = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(localizedString(R.string.ai_settings_model_label, language)) },
                singleLine = true
            )

            Button(
                onClick = { onSave(editedSettings) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(localizedString(R.string.ai_settings_save_label, language))
            }

            Text(localizedString(R.string.ai_settings_fallback_message, language))
        }
    }
}
