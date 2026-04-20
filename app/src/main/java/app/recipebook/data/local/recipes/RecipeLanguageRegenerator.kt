package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import kotlinx.coroutines.delay

data class RecipeLanguageRegenerationRequest(
    val recipe: Recipe,
    val authoritativeLanguage: AppLanguage
)

data class RecipeLanguageRegenerationResult(
    val generatedLanguage: AppLanguage,
    val generatedText: LocalizedSystemText,
    val generatorLabel: String,
    val generatedIngredients: List<RegeneratedIngredientLine> = emptyList()
)

data class RegeneratedIngredientLine(
    val id: String,
    val ingredientName: String,
    val originalText: String,
    val preparation: String = "",
    val notes: String = "",
    val referenceDraft: IngredientReferenceDraft? = null
)

data class IngredientReferenceSuggestion(
    val ingredientLineId: String,
    val draft: IngredientReferenceDraft
)

interface RecipeLanguageRegenerator {
    suspend fun regenerateOppositeLanguage(
        request: RecipeLanguageRegenerationRequest
    ): RecipeLanguageRegenerationResult
}

class LocalStubRecipeLanguageRegenerator : RecipeLanguageRegenerator {
    override suspend fun regenerateOppositeLanguage(
        request: RecipeLanguageRegenerationRequest
    ): RecipeLanguageRegenerationResult {
        delay(250)
        val sourceText = normalizeLocalizedText(
            request.recipe.languages.forLanguage(request.authoritativeLanguage)
        )
        val generatedLanguage = request.authoritativeLanguage.opposite()
        return RecipeLanguageRegenerationResult(
            generatedLanguage = generatedLanguage,
            generatedText = sourceText.toStubGeneratedText(generatedLanguage),
            generatorLabel = "local_stub"
        )
    }
}

private fun LocalizedSystemText.toStubGeneratedText(targetLanguage: AppLanguage): LocalizedSystemText {
    val reviewNote = when (targetLanguage) {
        AppLanguage.FR -> "Brouillon local simul\u00e9 \u00e0 r\u00e9viser."
        AppLanguage.EN -> "Local stub draft. Review before trusting."
    }
    val combinedNotes = listOf(notes.trim(), reviewNote)
        .filter { it.isNotBlank() }
        .joinToString("\n")
    return copy(notes = combinedNotes)
}
