package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.BilingualSyncStatus
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe

data class RecipeRegenerationOutcome(
    val recipe: Recipe,
    val ingredientReferenceSuggestions: List<IngredientReferenceSuggestion> = emptyList()
)

class RecipeLocalizationCoordinator(
    private val regenerator: RecipeLanguageRegenerator = LocalStubRecipeLanguageRegenerator()
) {
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
                    resolveOppositeStatus(
                        text = oppositeText,
                        requestedStatus = recipe.importMetadata.statusForLanguage(AppLanguage.FR)
                    )
                },
                enStatus = if (authoritativeLanguage == AppLanguage.EN) {
                    BilingualSyncStatus.UP_TO_DATE
                } else {
                    resolveOppositeStatus(
                        text = oppositeText,
                        requestedStatus = recipe.importMetadata.statusForLanguage(AppLanguage.EN)
                    )
                }
            )
        )
    }

    suspend fun regenerateOppositeLanguage(
        recipe: Recipe,
        authoritativeLanguage: AppLanguage
    ): RecipeRegenerationOutcome {
        val authoritativeText = normalizeLocalizedText(recipe.languages.forLanguage(authoritativeLanguage))
        val regenerated = regenerator.regenerateOppositeLanguage(
            RecipeLanguageRegenerationRequest(
                recipe = recipe.copy(
                    languages = recipe.languages.replaceForLanguage(authoritativeLanguage, authoritativeText)
                ),
                authoritativeLanguage = authoritativeLanguage
            )
        )
        val normalizedOpposite = normalizeLocalizedText(regenerated.generatedText)
        val regeneratedLanguages = when (regenerated.generatedLanguage) {
            AppLanguage.FR -> BilingualText(fr = normalizedOpposite, en = authoritativeText)
            AppLanguage.EN -> BilingualText(fr = authoritativeText, en = normalizedOpposite)
        }
        val regeneratedRecipe = recipe.copy(
            languages = regeneratedLanguages,
            importMetadata = (recipe.importMetadata ?: ImportMetadata())
                .copy(generatorLabel = regenerated.generatorLabel)
                .withSyncState(
                    authoritativeLanguage = authoritativeLanguage,
                    frStatus = if (regenerated.generatedLanguage == AppLanguage.FR) {
                        resolveGeneratedStatus(normalizedOpposite)
                    } else {
                        BilingualSyncStatus.UP_TO_DATE
                    },
                    enStatus = if (regenerated.generatedLanguage == AppLanguage.EN) {
                        resolveGeneratedStatus(normalizedOpposite)
                    } else {
                        BilingualSyncStatus.UP_TO_DATE
                    }
                )
        )
        return RecipeRegenerationOutcome(
            recipe = regeneratedRecipe,
            ingredientReferenceSuggestions = regenerated.generatedIngredients.mapNotNull { ingredient ->
                ingredient.referenceDraft?.let { draft ->
                    IngredientReferenceSuggestion(
                        ingredientLineId = ingredient.id,
                        draft = draft
                    )
                }
            }
        )
    }

    fun markActiveLanguageEdited(
        importMetadata: ImportMetadata?,
        languages: BilingualText,
        authoritativeLanguage: AppLanguage
    ): ImportMetadata {
        val oppositeLanguage = authoritativeLanguage.opposite()
        val oppositeText = normalizeLocalizedText(languages.forLanguage(oppositeLanguage))
        return (importMetadata ?: ImportMetadata()).withSyncState(
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

internal fun normalizeLocalizedText(text: LocalizedSystemText): LocalizedSystemText = text.copy(
    title = text.title.trim(),
    description = text.description.trim(),
    instructions = normalizeRecipeMultilineText(text.instructions),
    notes = normalizeRecipeMultilineText(text.notes)
)

internal fun BilingualText.forLanguage(language: AppLanguage): LocalizedSystemText = when (language) {
    AppLanguage.FR -> fr
    AppLanguage.EN -> en
}

private fun BilingualText.replaceForLanguage(
    language: AppLanguage,
    text: LocalizedSystemText
): BilingualText = when (language) {
    AppLanguage.FR -> copy(fr = text)
    AppLanguage.EN -> copy(en = text)
}

internal fun AppLanguage.opposite(): AppLanguage = when (this) {
    AppLanguage.FR -> AppLanguage.EN
    AppLanguage.EN -> AppLanguage.FR
}

private fun LocalizedSystemText.isBlank(): Boolean =
    title.isBlank() && description.isBlank() && instructions.isBlank() && notes.isBlank()

private fun LocalizedSystemText.toSyncStatus(): BilingualSyncStatus =
    if (isBlank()) BilingualSyncStatus.MISSING else BilingualSyncStatus.NEEDS_REGENERATION

private fun resolveGeneratedStatus(text: LocalizedSystemText): BilingualSyncStatus =
    if (text.isBlank()) BilingualSyncStatus.MISSING else BilingualSyncStatus.UP_TO_DATE

private fun resolveOppositeStatus(
    text: LocalizedSystemText,
    requestedStatus: BilingualSyncStatus?
): BilingualSyncStatus = when {
    text.isBlank() -> BilingualSyncStatus.MISSING
    requestedStatus == BilingualSyncStatus.UP_TO_DATE -> BilingualSyncStatus.UP_TO_DATE
    else -> BilingualSyncStatus.NEEDS_REGENERATION
}

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

private fun ImportMetadata?.statusForLanguage(language: AppLanguage): BilingualSyncStatus? = when (language) {
    AppLanguage.FR -> this?.syncStatusFr
    AppLanguage.EN -> this?.syncStatusEn
}
