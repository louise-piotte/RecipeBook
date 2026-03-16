package app.recipebook.ui.recipes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.RecipeTimes
import app.recipebook.domain.model.Servings
import app.recipebook.domain.model.UserNotes
import java.time.Instant
import java.util.UUID

@Composable
fun RecipeEditorScreen(
    initialRecipe: Recipe,
    isNewRecipe: Boolean,
    onBack: () -> Unit,
    onSave: (Recipe) -> Unit,
    onDelete: (() -> Unit)?,
    modifier: Modifier = Modifier
) {
    var language by rememberSaveable { mutableStateOf(AppLanguage.EN) }
    var titleFr by rememberSaveable { mutableStateOf(initialRecipe.languages.fr.title) }
    var titleEn by rememberSaveable { mutableStateOf(initialRecipe.languages.en.title) }
    var descriptionFr by rememberSaveable { mutableStateOf(initialRecipe.languages.fr.description) }
    var descriptionEn by rememberSaveable { mutableStateOf(initialRecipe.languages.en.description) }
    var instructionsFr by rememberSaveable { mutableStateOf(initialRecipe.languages.fr.instructions) }
    var instructionsEn by rememberSaveable { mutableStateOf(initialRecipe.languages.en.instructions) }
    var systemNotesFr by rememberSaveable { mutableStateOf(initialRecipe.languages.fr.notesSystem) }
    var systemNotesEn by rememberSaveable { mutableStateOf(initialRecipe.languages.en.notesSystem) }
    var userNotesFr by rememberSaveable { mutableStateOf(initialRecipe.userNotes?.fr.orEmpty()) }
    var userNotesEn by rememberSaveable { mutableStateOf(initialRecipe.userNotes?.en.orEmpty()) }
    var sourceName by rememberSaveable { mutableStateOf(initialRecipe.source?.sourceName.orEmpty()) }
    var sourceUrl by rememberSaveable { mutableStateOf(initialRecipe.source?.sourceUrl.orEmpty()) }
    var servingsAmount by rememberSaveable { mutableStateOf(initialRecipe.servings?.amount?.let(::formatNumber).orEmpty()) }
    var servingsUnit by rememberSaveable { mutableStateOf(initialRecipe.servings?.unit.orEmpty()) }
    var prepMinutes by rememberSaveable { mutableStateOf(initialRecipe.times?.prepTimeMinutes?.toString().orEmpty()) }
    var cookMinutes by rememberSaveable { mutableStateOf(initialRecipe.times?.cookTimeMinutes?.toString().orEmpty()) }
    var totalMinutes by rememberSaveable { mutableStateOf(initialRecipe.times?.totalTimeMinutes?.toString().orEmpty()) }
    var ingredientLines by rememberSaveable {
        mutableStateOf(initialRecipe.ingredients.joinToString("\n") { it.originalText })
    }

    val titlePreview = remember(language, titleFr, titleEn) {
        if (language == AppLanguage.FR) titleFr else titleEn
    }

    Scaffold(modifier = modifier) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                AssistChip(onClick = onBack, label = { Text(localizedString(R.string.back_label, language)) })
                AssistChip(onClick = { language = AppLanguage.EN }, label = { Text(localizedString(R.string.language_en, language)) })
                AssistChip(onClick = { language = AppLanguage.FR }, label = { Text(localizedString(R.string.language_fr, language)) })
            }

            Text(
                text = if (isNewRecipe) localizedString(R.string.add_recipe_label, language) else localizedString(R.string.edit_recipe_label, language),
                style = MaterialTheme.typography.headlineMedium
            )

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = titlePreview.ifBlank { localizedString(R.string.editor_preview_placeholder, language) },
                        style = MaterialTheme.typography.titleLarge
                    )

                    LabeledField(localizedString(R.string.title_fr_label, language), titleFr) { titleFr = it }
                    LabeledField(localizedString(R.string.title_en_label, language), titleEn) { titleEn = it }
                    LabeledField(localizedString(R.string.description_fr_label, language), descriptionFr, singleLine = false, minLines = 4) { descriptionFr = it }
                    LabeledField(localizedString(R.string.description_en_label, language), descriptionEn, singleLine = false, minLines = 4) { descriptionEn = it }
                    LabeledField(localizedString(R.string.instructions_fr_label, language), instructionsFr, singleLine = false, minLines = 5) { instructionsFr = it }
                    LabeledField(localizedString(R.string.instructions_en_label, language), instructionsEn, singleLine = false, minLines = 5) { instructionsEn = it }
                    LabeledField(localizedString(R.string.system_notes_fr_label, language), systemNotesFr, singleLine = false, minLines = 4) { systemNotesFr = it }
                    LabeledField(localizedString(R.string.system_notes_en_label, language), systemNotesEn, singleLine = false, minLines = 4) { systemNotesEn = it }
                    LabeledField(localizedString(R.string.user_notes_fr_label, language), userNotesFr, singleLine = false, minLines = 4) { userNotesFr = it }
                    LabeledField(localizedString(R.string.user_notes_en_label, language), userNotesEn, singleLine = false, minLines = 4) { userNotesEn = it }
                    LabeledField(localizedString(R.string.source_name_label, language), sourceName) { sourceName = it }
                    LabeledField(localizedString(R.string.source_url_label, language), sourceUrl) { sourceUrl = it }
                    LabeledField(localizedString(R.string.servings_amount_label, language), servingsAmount) { servingsAmount = it }
                    LabeledField(localizedString(R.string.servings_unit_label, language), servingsUnit) { servingsUnit = it }
                    LabeledField(localizedString(R.string.prep_minutes_label, language), prepMinutes) { prepMinutes = it }
                    LabeledField(localizedString(R.string.cook_minutes_label, language), cookMinutes) { cookMinutes = it }
                    LabeledField(localizedString(R.string.total_minutes_label, language), totalMinutes) { totalMinutes = it }
                    LabeledField(localizedString(R.string.ingredients_multiline_label, language), ingredientLines, singleLine = false, minLines = 8) { ingredientLines = it }
                }
            }

            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Button(
                    onClick = {
                        onSave(
                            initialRecipe.copy(
                                updatedAt = Instant.now().toString(),
                                languages = BilingualText(
                                    fr = LocalizedSystemText(
                                        title = titleFr.trim(),
                                        description = descriptionFr.trim(),
                                        instructions = normalizeMultilineText(instructionsFr),
                                        notesSystem = systemNotesFr.trim()
                                    ),
                                    en = LocalizedSystemText(
                                        title = titleEn.trim(),
                                        description = descriptionEn.trim(),
                                        instructions = normalizeMultilineText(instructionsEn),
                                        notesSystem = systemNotesEn.trim()
                                    )
                                ),
                                userNotes = UserNotes(
                                    fr = userNotesFr.trim().ifBlank { null },
                                    en = userNotesEn.trim().ifBlank { null }
                                ).takeIf { it.fr != null || it.en != null },
                                source = if (sourceName.isBlank() && sourceUrl.isBlank()) null else RecipeSource(
                                    sourceName = sourceName.trim(),
                                    sourceUrl = sourceUrl.trim()
                                ),
                                servings = parseServings(servingsAmount, servingsUnit),
                                times = parseTimes(prepMinutes, cookMinutes, totalMinutes),
                                ingredients = parseIngredients(ingredientLines)
                            )
                        )
                    }
                ) {
                    Text(localizedString(R.string.save_recipe_label, language))
                }
                if (onDelete != null) {
                    Button(onClick = onDelete) {
                        Text(localizedString(R.string.delete_recipe_label, language))
                    }
                }
            }
        }
    }
}

@Composable
private fun LabeledField(
    label: String,
    value: String,
    singleLine: Boolean = true,
    minLines: Int = 1,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
        label = { Text(label) },
        singleLine = singleLine,
        minLines = minLines
    )
}

internal fun parseTextEntries(input: String): List<String> {
    return input.lineSequence()
        .map { it.trim() }
        .filter { it.isNotEmpty() }
        .toList()
}

internal fun normalizeMultilineText(input: String): String = parseTextEntries(input).joinToString("\n")

internal fun parseIngredients(input: String): List<app.recipebook.domain.model.IngredientLine> {
    return parseTextEntries(input)
        .map {
            app.recipebook.domain.model.IngredientLine(
                id = UUID.randomUUID().toString(),
                originalText = it,
                ingredientName = it.substringAfterLast(' ').trim().ifBlank { it }
            )
        }
}

private fun parseServings(amountText: String, unitText: String): Servings? {
    val amount = amountText.trim().toDoubleOrNull() ?: return null
    return Servings(amount = amount, unit = unitText.trim().ifBlank { null })
}

private fun parseTimes(prep: String, cook: String, total: String): RecipeTimes? {
    val prepValue = prep.trim().toIntOrNull()
    val cookValue = cook.trim().toIntOrNull()
    val totalValue = total.trim().toIntOrNull()
    return if (prepValue == null && cookValue == null && totalValue == null) {
        null
    } else {
        RecipeTimes(
            prepTimeMinutes = prepValue,
            cookTimeMinutes = cookValue,
            totalTimeMinutes = totalValue
        )
    }
}
