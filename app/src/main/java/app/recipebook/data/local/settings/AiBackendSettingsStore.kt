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

enum class AiBackendProvider { OPENROUTER, LEGACY_POE }

data class AiBackendSettings(
    val apiKey: String = "",
    val baseUrl: String = DEFAULT_BASE_URL,
    val model: String = DEFAULT_MODEL,
    val provider: AiBackendProvider = AiBackendProvider.OPENROUTER
) {
    val isConfigured: Boolean
        get() = provider == AiBackendProvider.OPENROUTER && apiKey.isNotBlank() &&
            baseUrl.trim().trimEnd('/') == DEFAULT_BASE_URL && model.isNotBlank()

    override fun toString(): String =
        "AiBackendSettings(provider=$provider, apiKey=<redacted>, baseUrl=$baseUrl, model=$model)"

    companion object {
        const val DEFAULT_BASE_URL = "https://openrouter.ai/api/v1"
        const val DEFAULT_MODEL = "openai/gpt-5.4"
    }
}

internal val openRouterApiKeyPreference = stringPreferencesKey("openrouter_api_key")
internal val openRouterModelPreference = stringPreferencesKey("openrouter_model")

// Legacy unscoped credentials are intentionally never used for OpenRouter.
internal fun readOpenRouterSettings(prefs: Preferences): AiBackendSettings = AiBackendSettings(
    apiKey = prefs[openRouterApiKeyPreference].orEmpty(),
    model = prefs[openRouterModelPreference] ?: AiBackendSettings.DEFAULT_MODEL
)

class AiBackendSettingsStore(private val context: Context) {
    val settings: Flow<AiBackendSettings> = context.aiBackendSettingsDataStore.data.map(::readOpenRouterSettings)

    suspend fun save(settings: AiBackendSettings) {
        val normalized = settings.normalized()
        require(normalized.provider == AiBackendProvider.OPENROUTER && normalized.baseUrl == AiBackendSettings.DEFAULT_BASE_URL)
        context.aiBackendSettingsDataStore.edit { prefs ->
            prefs[openRouterApiKeyPreference] = normalized.apiKey
            prefs[openRouterModelPreference] = normalized.model
            prefs.remove(stringPreferencesKey("api_key"))
            prefs.remove(stringPreferencesKey("base_url"))
            prefs.remove(stringPreferencesKey("model"))
        }
    }
}

internal fun AiBackendSettings.normalized(): AiBackendSettings = copy(
    apiKey = apiKey.trim(),
    baseUrl = baseUrl.trim().trimEnd('/'),
    model = model.trim()
)
