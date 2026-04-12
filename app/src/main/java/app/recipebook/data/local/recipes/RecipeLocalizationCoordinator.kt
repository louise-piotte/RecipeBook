package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.BilingualSyncStatus
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe

class RecipeLocalizationCoordinator {
    fun finalizeForSave(
        recipe: Recipe,
        authoritativeLanguage: AppLanguage
    ): Recipe {
        val authoritativeText = normalizeLocalizedText(recipe.languages.forLanguage(authoritativeLanguage))
        val oppositeLanguage = authoritativeLanguage.opposite()
        val oppositeText = preserveOrInitializeOppositeText(
            existing = recipe.languages.forLanguage(oppositeLanguage)
        )
        val finalizedLanguages = when (authoritativeLanguage) {
            AppLanguage.FR -> BilingualText(fr = authoritativeText, en = oppositeText)
            AppLanguage.EN -> BilingualText(fr = oppositeText, en = authoritativeText)
        }
        return recipe.copy(
            languages = finalizedLanguages,
            importMetadata = (recipe.importMetadata ?: ImportMetadata()).withSyncState(
                authoritativeLanguage = authoritativeLanguage,
                frStatus = if (authoritativeLanguage == AppLanguage.FR) {
                    BilingualSyncStatus.UP_TO_DATE
                } else {
                    oppositeText.toSyncStatus()
                },
                enStatus = if (authoritativeLanguage == AppLanguage.EN) {
                    BilingualSyncStatus.UP_TO_DATE
                } else {
                    oppositeText.toSyncStatus()
                }
            )
        )
    }

    private fun preserveOrInitializeOppositeText(existing: LocalizedSystemText): LocalizedSystemText {
        return if (existing.isBlank()) {
            LocalizedSystemText(
                title = "",
                description = "",
                instructions = "",
                notes = ""
            )
        } else {
            normalizeLocalizedText(existing)
        }
    }
}

private fun normalizeLocalizedText(text: LocalizedSystemText): LocalizedSystemText = text.copy(
    title = text.title.trim(),
    description = text.description.trim(),
    instructions = normalizeRecipeMultilineText(text.instructions),
    notes = normalizeRecipeMultilineText(text.notes)
)

private fun BilingualText.forLanguage(language: AppLanguage): LocalizedSystemText = when (language) {
    AppLanguage.FR -> fr
    AppLanguage.EN -> en
}

private fun AppLanguage.opposite(): AppLanguage = when (this) {
    AppLanguage.FR -> AppLanguage.EN
    AppLanguage.EN -> AppLanguage.FR
}

private fun LocalizedSystemText.isBlank(): Boolean =
    title.isBlank() && description.isBlank() && instructions.isBlank() && notes.isBlank()

private fun LocalizedSystemText.toSyncStatus(): BilingualSyncStatus =
    if (isBlank()) BilingualSyncStatus.MISSING else BilingualSyncStatus.NEEDS_REGENERATION

private fun ImportMetadata.withSyncState(
    authoritativeLanguage: AppLanguage,
    frStatus: BilingualSyncStatus,
    enStatus: BilingualSyncStatus
): ImportMetadata = copy(
    authoritativeLanguage = authoritativeLanguage,
    syncStatusFr = frStatus,
    syncStatusEn = enStatus
)

private fun normalizeRecipeMultilineText(input: String): String = input.lineSequence()
    .map { it.trim() }
    .filter { it.isNotEmpty() }
    .joinToString("\n")
