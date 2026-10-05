package app.recipebook.data.local.settings

import androidx.datastore.preferences.core.mutablePreferencesOf
import androidx.datastore.preferences.core.stringPreferencesKey
import org.junit.Assert.*
import org.junit.Test

class AiBackendSettingsStoreTest {
    @Test fun defaultsRequireUserEnteredOpenRouterCredential() {
        val settings = AiBackendSettings()
        assertTrue(settings.apiKey.isEmpty())
        assertFalse(settings.isConfigured)
        assertEquals("https://openrouter.ai/api/v1", settings.baseUrl)
        assertEquals("openai/gpt-5.4", settings.model)
    }
    @Test fun legacyPoePreferencesAreNeverReadAsOpenRouterCredentials() {
        val prefs = mutablePreferencesOf(stringPreferencesKey("api_key") to "legacy-fixture",
            stringPreferencesKey("base_url") to "https://api.poe.com/v1", stringPreferencesKey("model") to "gpt-5.4")
        assertEquals(AiBackendSettings(), readOpenRouterSettings(prefs))
    }
    @Test fun scopedSettingsAreUsedWithoutBorrowingLegacyKeyOrModel() {
        val prefs = mutablePreferencesOf(stringPreferencesKey("api_key") to "legacy-fixture",
            openRouterApiKeyPreference to "openrouter-fixture", openRouterModelPreference to "test/model")
        assertEquals("openrouter-fixture", readOpenRouterSettings(prefs).apiKey)
        assertEquals("test/model", readOpenRouterSettings(prefs).model)
    }
    @Test fun clearingScopedKeyDoesNotReactivateLegacyCredential() {
        val prefs = mutablePreferencesOf(stringPreferencesKey("api_key") to "legacy-fixture", openRouterApiKeyPreference to "")
        assertFalse(readOpenRouterSettings(prefs).isConfigured)
    }
    @Test fun normalizedTrimsEditableFields() {
        val settings = AiBackendSettings(apiKey = " fixture ", baseUrl = " https://openrouter.ai/api/v1/ ", model = " test/model ").normalized()
        assertEquals("fixture", settings.apiKey)
        assertEquals(AiBackendSettings.DEFAULT_BASE_URL, settings.baseUrl)
        assertEquals("test/model", settings.model)
        assertTrue(settings.isConfigured)
    }
    @Test fun providerAndEndpointMustBothBeOpenRouter() {
        assertFalse(AiBackendSettings(apiKey = "fixture", provider = AiBackendProvider.LEGACY_POE).isConfigured)
        assertFalse(AiBackendSettings(apiKey = "fixture", baseUrl = "https://api.poe.com/v1").isConfigured)
        assertFalse(AiBackendSettings(apiKey = "fixture", baseUrl = "https://openrouter.ai.evil.invalid/api/v1").isConfigured)
        assertFalse(AiBackendSettings(apiKey = "fixture", model = "").isConfigured)
    }
    @Test fun settingsStringNeverContainsCredential() {
        assertFalse(AiBackendSettings(apiKey = "synthetic-private-fixture").toString().contains("synthetic-private-fixture"))
    }
}
