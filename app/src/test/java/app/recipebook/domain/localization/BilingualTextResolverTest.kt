package app.recipebook.domain.localization

import app.recipebook.domain.model.AppLanguage
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class BilingualTextResolverTest {

    private val resolver = BilingualTextResolver()
    private val placeholders = MissingTextPlaceholders(
        missingInFrench = "Non disponible en français",
        missingInEnglish = "Not available in English"
    )

    @Test
    fun resolveSystemText_returnsSelectedLanguageValue() {
        val value = BilingualText(fr = "Bonjour", en = "Hello")

        assertEquals("Bonjour", resolver.resolveSystemText(AppLanguage.FR, value))
        assertEquals("Hello", resolver.resolveSystemText(AppLanguage.EN, value))
    }

    @Test
    fun resolveUserText_doesNotFallbackAcrossLanguages_whenMissing() {
        val resolvedFrench = resolver.resolveUserText(
            language = AppLanguage.FR,
            valueFr = null,
            valueEn = "English note",
            placeholders = placeholders
        )

        assertTrue(resolvedFrench.isPlaceholder)
        assertEquals("Non disponible en français", resolvedFrench.text)
    }

    @Test
    fun resolveUserText_returnsActualText_whenPresent() {
        val resolvedEnglish = resolver.resolveUserText(
            language = AppLanguage.EN,
            valueFr = null,
            valueEn = "Use buttermilk",
            placeholders = placeholders
        )

        assertFalse(resolvedEnglish.isPlaceholder)
        assertEquals("Use buttermilk", resolvedEnglish.text)
    }
}
