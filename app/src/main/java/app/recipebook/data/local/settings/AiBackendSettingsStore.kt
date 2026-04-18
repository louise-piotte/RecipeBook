package app.recipebook.data.local.settings

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.aiBackendSettingsDataStore: DataStore<Preferences> by preferencesDataStore(name = "ai_backend_settings")

data class AiBackendSettings(
    val apiKey: String = "",
    val baseUrl: String = "",
    val model: String = ""
) {
    val isConfigured: Boolean
        get() = apiKey.isNotBlank() && baseUrl.isNotBlank() && model.isNotBlank()
}

class AiBackendSettingsStore(private val context: Context) {
    private val apiKeyKey = stringPreferencesKey("api_key")
    private val baseUrlKey = stringPreferencesKey("base_url")
    private val modelKey = stringPreferencesKey("model")

    val settings: Flow<AiBackendSettings> = context.aiBackendSettingsDataStore.data.map { prefs ->
        AiBackendSettings(
            apiKey = prefs[apiKeyKey].orEmpty(),
            baseUrl = prefs[baseUrlKey].orEmpty(),
            model = prefs[modelKey].orEmpty()
        )
    }

    suspend fun save(settings: AiBackendSettings) {
        val normalized = settings.normalized()
        context.aiBackendSettingsDataStore.edit { prefs ->
            prefs[apiKeyKey] = normalized.apiKey
            prefs[baseUrlKey] = normalized.baseUrl
            prefs[modelKey] = normalized.model
        }
    }
}

internal fun AiBackendSettings.normalized(): AiBackendSettings = copy(
    apiKey = apiKey.trim(),
    baseUrl = baseUrl.trim().trimEnd('/'),
    model = model.trim()
)
