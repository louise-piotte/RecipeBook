package app.recipebook

import androidx.test.platform.app.InstrumentationRegistry
import app.recipebook.data.local.settings.AiBackendSettings
import app.recipebook.data.local.settings.AiBackendSettingsStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Assume.assumeTrue
import org.junit.Test

class AiBackendSettingsPersistenceTest {
    @Test fun openRouterSettingsPersistAndBlankKeyDisablesRemoteAi() = runBlocking {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        assumeTrue("This persistence fixture requires the isolated QA package", context.packageName == "app.recipebook.qa")
        val store = AiBackendSettingsStore(context)
        val previous = store.settings.first()
        try {
            store.save(AiBackendSettings(apiKey = "fixture-only", model = "test/model"))
            val reopened = AiBackendSettingsStore(context).settings.first()
            assertTrue(reopened.apiKey == "fixture-only"); assertEquals("test/model", reopened.model); assertTrue(reopened.isConfigured)
            store.save(reopened.copy(apiKey = ""))
            assertFalse(AiBackendSettingsStore(context).settings.first().isConfigured)
        } finally { store.save(previous) }
    }
}
