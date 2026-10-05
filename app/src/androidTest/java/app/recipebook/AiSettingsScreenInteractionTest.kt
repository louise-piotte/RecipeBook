package app.recipebook

import androidx.activity.ComponentActivity
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.espresso.Espresso
import app.recipebook.data.local.settings.AiBackendSettings
import app.recipebook.domain.model.AppLanguage
import app.recipebook.ui.recipes.AiSettingsScreen
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class AiSettingsScreenInteractionTest {
    @get:Rule val rule = createAndroidComposeRule<ComponentActivity>()
    private val saved = mutableListOf<AiBackendSettings>()
    private fun show(language: AppLanguage) = rule.setContent {
        AiSettingsScreen(language = language, settings = AiBackendSettings(), onLanguageChange = {}, onBack = {},
            onSave = { saved.add(it) }, onNavigateToLibrary = {}, onNavigateToCollections = {}, onNavigateToIngredients = {}, onNavigateToTags = {})
    }
    @Test fun englishKeyCanBeEnteredSavedAndClearedWithoutAnApiRequest() {
        show(AppLanguage.EN)
        rule.onNodeWithTag("ai-settings-api-key").performScrollTo().performTextReplacement(" fixture-openrouter-key ")
        rule.onNodeWithTag("ai-settings-model").performScrollTo().performTextReplacement(" test/model ")
        Espresso.closeSoftKeyboard()
        rule.onNodeWithTag("ai-settings-save").performScrollTo().performClick()
        rule.runOnIdle { assertEquals("fixture-openrouter-key", saved.last().apiKey); assertEquals("test/model", saved.last().model); assertTrue(saved.last().isConfigured) }
        rule.onNodeWithTag("ai-settings-api-key").performScrollTo().performTextReplacement("")
        Espresso.closeSoftKeyboard()
        rule.onNodeWithTag("ai-settings-save").performScrollTo().performClick()
        rule.runOnIdle { assertFalse(saved.last().isConfigured); assertTrue(saved.last().apiKey.isEmpty()) }
    }
    @Test fun frenchScreenMasksKeyAndShowsOpenRouterModelAndEndpoint() {
        show(AppLanguage.FR)
        rule.onNodeWithTag("ai-settings-api-key").performScrollTo().assert(SemanticsMatcher.keyIsDefined(SemanticsProperties.Password))
        rule.onNodeWithText("Clé API OpenRouter").assertExists()
        rule.onNodeWithTag("ai-settings-endpoint").performScrollTo().assertTextContains(AiBackendSettings.DEFAULT_BASE_URL)
        rule.onNodeWithTag("ai-settings-model").performScrollTo().assertTextContains("openai/gpt-5.4")
    }
}
