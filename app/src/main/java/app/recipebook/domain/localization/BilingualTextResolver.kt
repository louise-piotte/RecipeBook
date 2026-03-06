package app.recipebook.domain.localization

import app.recipebook.domain.model.AppLanguage

data class BilingualText(
    val fr: String,
    val en: String
)

data class MissingTextPlaceholders(
    val missingInFrench: String,
    val missingInEnglish: String
)

data class ResolvedText(
    val text: String,
    val isPlaceholder: Boolean
)

class BilingualTextResolver {

    fun resolveSystemText(
        language: AppLanguage,
        value: BilingualText
    ): String = when (language) {
        AppLanguage.FR -> value.fr
        AppLanguage.EN -> value.en
    }

    fun resolveUserText(
        language: AppLanguage,
        valueFr: String?,
        valueEn: String?,
        placeholders: MissingTextPlaceholders
    ): ResolvedText {
        val selected = when (language) {
            AppLanguage.FR -> valueFr
            AppLanguage.EN -> valueEn
        }

        val text = selected?.trim().orEmpty()
        if (text.isNotEmpty()) {
            return ResolvedText(text = text, isPlaceholder = false)
        }

        val placeholder = when (language) {
            AppLanguage.FR -> placeholders.missingInFrench
            AppLanguage.EN -> placeholders.missingInEnglish
        }
        return ResolvedText(text = placeholder, isPlaceholder = true)
    }
}
