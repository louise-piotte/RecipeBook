package app.recipebook.data.local.settings

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class AiBackendSettingsStoreTest {

    @Test
    fun normalized_trimsFieldsAndDropsTrailingSlashFromBaseUrl() {
        val normalized = AiBackendSettings(
            apiKey = "  sk-test  ",
            baseUrl = " https://api.example.com/v1/ ",
            model = " gpt-test "
        ).normalized()

        assertEquals("sk-test", normalized.apiKey)
        assertEquals("https://api.example.com/v1", normalized.baseUrl)
        assertEquals("gpt-test", normalized.model)
    }

    @Test
    fun isConfigured_requiresAllThreeValues() {
        assertFalse(AiBackendSettings(apiKey = "key", baseUrl = "", model = "model").isConfigured)
        assertTrue(
            AiBackendSettings(
                apiKey = "key",
                baseUrl = "https://api.example.com/v1",
                model = "model"
            ).isConfigured
        )
    }
}
