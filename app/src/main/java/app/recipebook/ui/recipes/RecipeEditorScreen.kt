package app.recipebook.ui.recipes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.RecipeTimes
import app.recipebook.domain.model.Servings
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.UserNotes
import java.time.Instant
import java.util.UUID
import kotlinx.coroutines.launch

@Composable
fun RecipeEditorScreen(
    initialRecipe: Recipe,
    isNewRecipe: Boolean,
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    onBack: () -> Unit,
    onSave: (Recipe) -> Unit,
    onCreateIngredientReference: suspend (IngredientReferenceDraft) -> IngredientReference,
    onCreateTag: suspend (TagDraft) -> Tag,
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
    val ingredientRows = remember(initialRecipe.id) {
        mutableStateListOf<EditableIngredientRow>().apply {
            addAll(initialRecipe.ingredients.map(IngredientLine::toEditableRow))
            if (isEmpty()) add(blankIngredientRow())
        }
    }
    val selectedTagIds = remember(initialRecipe.id) {
        mutableStateListOf<String>().apply { addAll(initialRecipe.tagIds) }
    }
    var ingredientPickerIndex by remember { mutableStateOf<Int?>(null) }
    var pendingIngredientTargetIndex by remember { mutableStateOf<Int?>(null) }
    var showCreateIngredientDialog by remember { mutableStateOf(false) }
    var showTagPickerDialog by remember { mutableStateOf(false) }
    var showCreateTagDialog by remember { mutableStateOf(false) }
    var ingredientsExpanded by rememberSaveable { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

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
                    IngredientsEditorSection(
                        language = language,
                        ingredientRows = ingredientRows,
                        ingredientReferences = ingredientReferences,
                        expanded = ingredientsExpanded,
                        onToggleExpanded = { ingredientsExpanded = !ingredientsExpanded },
                        onSelectIngredient = { index ->
                            pendingIngredientTargetIndex = index
                            ingredientPickerIndex = index
                        },
                        onQuantityChange = { index, value -> ingredientRows[index] = ingredientRows[index].copy(quantity = value) },
                        onUnitChange = { index, value -> ingredientRows[index] = ingredientRows[index].copy(unit = value) },
                        onPreparationChange = { index, value -> ingredientRows[index] = ingredientRows[index].copy(preparation = value) },
                        onNotesChange = { index, value -> ingredientRows[index] = ingredientRows[index].copy(notes = value) },
                        onOriginalTextChange = { index, value -> ingredientRows[index] = ingredientRows[index].copy(originalText = value) },
                        onRemove = { index ->
                            ingredientRows.removeAt(index)
                            if (ingredientRows.isEmpty()) ingredientRows.add(blankIngredientRow())
                        },
                        onAddIngredientLine = { ingredientRows.add(blankIngredientRow()) },
                        onAddReusableIngredient = {
                            ingredientRows.add(blankIngredientRow())
                            pendingIngredientTargetIndex = ingredientRows.lastIndex
                            ingredientPickerIndex = ingredientRows.lastIndex
                        }
                    )
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
                }
            }


            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = localizedString(R.string.tags_editor_label, language),
                        style = MaterialTheme.typography.titleLarge
                    )
                    if (selectedTagIds.isEmpty()) {
                        Text(
                            text = localizedString(R.string.no_tags_selected_label, language),
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    } else {
                        selectedTagIds.forEach { tagId ->
                            val tag = tags.firstOrNull { it.id == tagId }
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Text(text = tag?.localizedName(language).orEmpty())
                                TextButton(onClick = { selectedTagIds.remove(tagId) }) {
                                    Text(localizedString(R.string.remove_label, language))
                                }
                            }
                        }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(onClick = { showTagPickerDialog = true }) {
                            Text(localizedString(R.string.select_tags_label, language))
                        }
                        Button(onClick = { showCreateTagDialog = true }) {
                            Text(localizedString(R.string.create_tag_label, language))
                        }
                    }
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
                                ingredients = ingredientRows.toIngredientLines(ingredientReferences, language),
                                tagIds = selectedTagIds.distinct()
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

    ingredientPickerIndex?.let { index ->
        IngredientPickerDialog(
            language = language,
            ingredientReferences = ingredientReferences,
            onDismiss = { ingredientPickerIndex = null },
            onSelect = { ingredientReference ->
                val currentRow = ingredientRows[index]
                ingredientRows[index] = currentRow.copy(
                    ingredientRefId = ingredientReference.id,
                    ingredientName = ingredientReference.localizedName(language).ifBlank { currentRow.ingredientName }
                )
                ingredientPickerIndex = null
            },
            onCreateNew = {
                ingredientPickerIndex = null
                showCreateIngredientDialog = true
            }
        )
    }

    if (showCreateIngredientDialog) {
        CreateIngredientDialog(
            language = language,
            onDismiss = { showCreateIngredientDialog = false },
            onConfirm = { draft ->
                coroutineScope.launch {
                    val created = onCreateIngredientReference(draft)
                    val targetIndex = pendingIngredientTargetIndex ?: ingredientRows.lastIndex
                    val currentRow = ingredientRows[targetIndex]
                    ingredientRows[targetIndex] = currentRow.copy(
                        ingredientRefId = created.id,
                        ingredientName = created.localizedName(language)
                    )
                    showCreateIngredientDialog = false
                }
            }
        )
    }

    if (showTagPickerDialog) {
        TagPickerDialog(
            language = language,
            tags = tags,
            selectedTagIds = selectedTagIds,
            onDismiss = { showTagPickerDialog = false },
            onCreateNew = {
                showTagPickerDialog = false
                showCreateTagDialog = true
            }
        )
    }

    if (showCreateTagDialog) {
        CreateTagDialog(
            language = language,
            onDismiss = { showCreateTagDialog = false },
            onConfirm = { draft ->
                coroutineScope.launch {
                    val created = onCreateTag(draft)
                    if (!selectedTagIds.contains(created.id)) {
                        selectedTagIds.add(created.id)
                    }
                    showCreateTagDialog = false
                }
            }
        )
    }
}


@Composable
private fun IngredientsEditorSection(
    language: AppLanguage,
    ingredientRows: List<EditableIngredientRow>,
    ingredientReferences: List<IngredientReference>,
    expanded: Boolean,
    onToggleExpanded: () -> Unit,
    onSelectIngredient: (Int) -> Unit,
    onQuantityChange: (Int, String) -> Unit,
    onUnitChange: (Int, String) -> Unit,
    onPreparationChange: (Int, String) -> Unit,
    onNotesChange: (Int, String) -> Unit,
    onOriginalTextChange: (Int, String) -> Unit,
    onRemove: (Int) -> Unit,
    onAddIngredientLine: () -> Unit,
    onAddReusableIngredient: () -> Unit
) {
    val ingredientMap = ingredientReferences.associateBy(IngredientReference::id)
    val previewLines = ingredientRows.mapNotNull { row ->
        val line = row.toIngredientLinePreview(ingredientMap, language)
        if (line == null) null else buildDetailIngredientText(line, line.ingredientRefId?.let(ingredientMap::get), language)
    }

    Card(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = localizedString(R.string.ingredients_editor_label, language),
                    style = MaterialTheme.typography.titleLarge
                )
                TextButton(onClick = onToggleExpanded) {
                    Text(
                        if (expanded) localizedString(R.string.collapse_ingredients_label, language)
                        else localizedString(R.string.edit_ingredients_label, language)
                    )
                }
            }

            if (expanded) {
                ingredientRows.forEachIndexed { index, row ->
                    IngredientEditorCard(
                        language = language,
                        row = row,
                        ingredientReference = ingredientReferences.firstOrNull { it.id == row.ingredientRefId },
                        onSelectIngredient = { onSelectIngredient(index) },
                        onQuantityChange = { onQuantityChange(index, it) },
                        onUnitChange = { onUnitChange(index, it) },
                        onPreparationChange = { onPreparationChange(index, it) },
                        onNotesChange = { onNotesChange(index, it) },
                        onOriginalTextChange = { onOriginalTextChange(index, it) },
                        onRemove = { onRemove(index) }
                    )
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = onAddIngredientLine) {
                        Text(localizedString(R.string.add_ingredient_line_label, language))
                    }
                    Button(onClick = onAddReusableIngredient) {
                        Text(localizedString(R.string.add_existing_ingredient_label, language))
                    }
                }
            } else {
                if (previewLines.isEmpty()) {
                    Text(
                        text = localizedString(R.string.no_ingredients_added_label, language),
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                } else {
                    previewLines.forEach { ingredient ->
                        Text(text = ingredient)
                    }
                }
            }
        }
    }
}

@Composable
private fun IngredientEditorCard(
    language: AppLanguage,
    row: EditableIngredientRow,
    ingredientReference: IngredientReference?,
    onSelectIngredient: () -> Unit,
    onQuantityChange: (String) -> Unit,
    onUnitChange: (String) -> Unit,
    onPreparationChange: (String) -> Unit,
    onNotesChange: (String) -> Unit,
    onOriginalTextChange: (String) -> Unit,
    onRemove: () -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = ingredientReference?.localizedName(language)?.ifBlank { row.ingredientName }
                    ?: row.ingredientName.ifBlank { localizedString(R.string.no_ingredient_selected_label, language) },
                style = MaterialTheme.typography.titleMedium
            )
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = onSelectIngredient) {
                    Text(localizedString(R.string.select_ingredient_label, language))
                }
                TextButton(onClick = onRemove) {
                    Text(localizedString(R.string.remove_label, language))
                }
            }
            LabeledField(localizedString(R.string.ingredient_quantity_label, language), row.quantity, onValueChange = onQuantityChange)
            LabeledField(localizedString(R.string.ingredient_unit_label, language), row.unit, onValueChange = onUnitChange)
            LabeledField(localizedString(R.string.ingredient_preparation_label, language), row.preparation, onValueChange = onPreparationChange)
            LabeledField(localizedString(R.string.ingredient_notes_label, language), row.notes, onValueChange = onNotesChange)
            LabeledField(
                localizedString(R.string.ingredient_original_text_label, language),
                row.originalText,
                singleLine = false,
                minLines = 2,
                onValueChange = onOriginalTextChange
            )
        }
    }
}

@Composable
private fun IngredientPickerDialog(
    language: AppLanguage,
    ingredientReferences: List<IngredientReference>,
    onDismiss: () -> Unit,
    onSelect: (IngredientReference) -> Unit,
    onCreateNew: () -> Unit
) {
    var query by rememberSaveable { mutableStateOf("") }
    val filtered = remember(query, ingredientReferences) {
        val trimmed = query.trim()
        if (trimmed.isEmpty()) {
            ingredientReferences
        } else {
            ingredientReferences.filter { ingredientReference ->
                listOf(
                    ingredientReference.nameFr,
                    ingredientReference.nameEn,
                    ingredientReference.aliasesFr.joinToString(" "),
                    ingredientReference.aliasesEn.joinToString(" ")
                ).any { it.contains(trimmed, ignoreCase = true) }
            }
        }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = onCreateNew) {
                Text(localizedString(R.string.create_ingredient_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.cancel_label, language))
            }
        },
        title = { Text(localizedString(R.string.select_ingredient_label, language)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                LabeledField(localizedString(R.string.search_label, language), query, onValueChange = { query = it })
                filtered.take(12).forEach { ingredientReference ->
                    TextButton(onClick = { onSelect(ingredientReference) }) {
                        Text(ingredientReference.pickerName(language))
                    }
                }
            }
        }
    )
}

@Composable
private fun TagPickerDialog(
    language: AppLanguage,
    tags: List<Tag>,
    selectedTagIds: MutableList<String>,
    onDismiss: () -> Unit,
    onCreateNew: () -> Unit
) {
    var query by rememberSaveable { mutableStateOf("") }
    val filtered = remember(query, tags) {
        val trimmed = query.trim()
        if (trimmed.isEmpty()) {
            tags
        } else {
            tags.filter { tag ->
                listOf(tag.nameFr, tag.nameEn, tag.slug).any { it.contains(trimmed, ignoreCase = true) }
            }
        }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = onCreateNew) {
                Text(localizedString(R.string.create_tag_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.done_label, language))
            }
        },
        title = { Text(localizedString(R.string.select_tags_label, language)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                LabeledField(localizedString(R.string.search_label, language), query, onValueChange = { query = it })
                filtered.take(12).forEach { tag ->
                    val isSelected = selectedTagIds.contains(tag.id)
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(text = tag.localizedName(language))
                        TextButton(onClick = {
                            if (isSelected) selectedTagIds.remove(tag.id) else selectedTagIds.add(tag.id)
                        }) {
                            Text(
                                if (isSelected) localizedString(R.string.remove_label, language)
                                else localizedString(R.string.add_tag_label, language)
                            )
                        }
                    }
                }
            }
        }
    )
}

@Composable
private fun CreateIngredientDialog(
    language: AppLanguage,
    onDismiss: () -> Unit,
    onConfirm: (IngredientReferenceDraft) -> Unit
) {
    var nameFr by rememberSaveable { mutableStateOf("") }
    var nameEn by rememberSaveable { mutableStateOf("") }
    var density by rememberSaveable { mutableStateOf("") }
    val mappings = remember { mutableStateListOf(EditableUnitMapping()) }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = {
                onConfirm(
                    IngredientReferenceDraft(
                        nameFr = nameFr,
                        nameEn = nameEn,
                        defaultDensity = density.trim().toDoubleOrNull(),
                        unitMappings = mappings.mapNotNull(EditableUnitMapping::toDomain)
                    )
                )
            }) {
                Text(localizedString(R.string.save_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.cancel_label, language))
            }
        },
        title = { Text(localizedString(R.string.create_ingredient_label, language)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                LabeledField(localizedString(R.string.ingredient_name_fr_label, language), nameFr, onValueChange = { nameFr = it })
                LabeledField(localizedString(R.string.ingredient_name_en_label, language), nameEn, onValueChange = { nameEn = it })
                LabeledField(localizedString(R.string.ingredient_density_label, language), density, onValueChange = { density = it })
                Text(text = localizedString(R.string.unit_conversions_label, language), style = MaterialTheme.typography.titleSmall)
                mappings.forEachIndexed { index, mapping ->
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.padding(8.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                            LabeledField(localizedString(R.string.from_unit_label, language), mapping.fromUnit) {
                                mappings[index] = mapping.copy(fromUnit = it)
                            }
                            LabeledField(localizedString(R.string.to_unit_label, language), mapping.toUnit) {
                                mappings[index] = mapping.copy(toUnit = it)
                            }
                            LabeledField(localizedString(R.string.conversion_factor_label, language), mapping.factor) {
                                mappings[index] = mapping.copy(factor = it)
                            }
                            if (mappings.size > 1) {
                                TextButton(onClick = { mappings.removeAt(index) }) {
                                    Text(localizedString(R.string.remove_label, language))
                                }
                            }
                        }
                    }
                }
                TextButton(onClick = { mappings.add(EditableUnitMapping()) }) {
                    Text(localizedString(R.string.add_conversion_label, language))
                }
            }
        }
    )
}

@Composable
private fun CreateTagDialog(
    language: AppLanguage,
    onDismiss: () -> Unit,
    onConfirm: (TagDraft) -> Unit
) {
    var nameFr by rememberSaveable { mutableStateOf("") }
    var nameEn by rememberSaveable { mutableStateOf("") }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = { onConfirm(TagDraft(nameFr = nameFr, nameEn = nameEn)) }) {
                Text(localizedString(R.string.save_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.cancel_label, language))
            }
        },
        title = { Text(localizedString(R.string.create_tag_label, language)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                LabeledField(localizedString(R.string.tag_name_fr_label, language), nameFr, onValueChange = { nameFr = it })
                LabeledField(localizedString(R.string.tag_name_en_label, language), nameEn, onValueChange = { nameEn = it })
            }
        }
    )
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

internal fun parseIngredients(input: String): List<IngredientLine> {
    return parseTextEntries(input)
        .map {
            IngredientLine(
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

private data class EditableIngredientRow(
    val id: String,
    val ingredientRefId: String? = null,
    val ingredientName: String = "",
    val quantity: String = "",
    val unit: String = "",
    val preparation: String = "",
    val notes: String = "",
    val originalText: String = ""
)

private data class EditableUnitMapping(
    val fromUnit: String = "",
    val toUnit: String = "",
    val factor: String = ""
) {
    fun toDomain(): IngredientUnitMapping? {
        val parsedFactor = factor.trim().toDoubleOrNull() ?: return null
        val normalizedFrom = fromUnit.trim()
        val normalizedTo = toUnit.trim()
        if (normalizedFrom.isEmpty() || normalizedTo.isEmpty()) return null
        return IngredientUnitMapping(
            fromUnit = normalizedFrom,
            toUnit = normalizedTo,
            factor = parsedFactor
        )
    }
}

private fun IngredientLine.toEditableRow(): EditableIngredientRow = EditableIngredientRow(
    id = id,
    ingredientRefId = ingredientRefId,
    ingredientName = ingredientName,
    quantity = quantity?.let(::formatNumber).orEmpty(),
    unit = unit.orEmpty(),
    preparation = preparation.orEmpty(),
    notes = notes.orEmpty(),
    originalText = originalText
)

private fun blankIngredientRow(): EditableIngredientRow = EditableIngredientRow(id = UUID.randomUUID().toString())

private fun List<EditableIngredientRow>.toIngredientLines(
    ingredientReferences: List<IngredientReference>,
    language: AppLanguage
): List<IngredientLine> {
    val ingredientMap = ingredientReferences.associateBy(IngredientReference::id)
    return mapNotNull { row ->
        val ingredientReference = row.ingredientRefId?.let(ingredientMap::get)
        val ingredientName = ingredientReference?.localizedName(language)
            ?.ifBlank { row.ingredientName.trim() }
            ?: row.ingredientName.trim()
        val quantity = row.quantity.trim().toDoubleOrNull()
        val unit = row.unit.trim().ifBlank { null }
        val preparation = row.preparation.trim().ifBlank { null }
        val notes = row.notes.trim().ifBlank { null }
        val originalText = row.originalText.trim().ifBlank {
            buildIngredientPreview(quantity, unit, ingredientName, preparation, notes)
        }
        if (ingredientName.isBlank() && originalText.isBlank()) {
            null
        } else {
            IngredientLine(
                id = row.id,
                ingredientRefId = row.ingredientRefId,
                originalText = originalText,
                quantity = quantity,
                unit = unit,
                ingredientName = ingredientName.ifBlank { originalText },
                preparation = preparation,
                notes = notes
            )
        }
    }
}

private fun buildIngredientPreview(
    quantity: Double?,
    unit: String?,
    ingredientName: String,
    preparation: String?,
    notes: String?
): String {
    val base = listOfNotNull(
        quantity?.let(::formatNumber),
        unit,
        ingredientName.ifBlank { null }
    ).joinToString(" ")

    val withPreparation = if (preparation.isNullOrBlank()) base else "$base, $preparation"
    return if (notes.isNullOrBlank()) withPreparation else "$withPreparation ($notes)"
}


private fun EditableIngredientRow.toIngredientLinePreview(
    ingredientMap: Map<String, IngredientReference>,
    language: AppLanguage
): IngredientLine? {
    val ingredientReference = ingredientRefId?.let(ingredientMap::get)
    val resolvedName = ingredientReference?.localizedName(language)
        ?.ifBlank { ingredientName.trim() }
        ?: ingredientName.trim()
    val quantityValue = quantity.trim().toDoubleOrNull()
    val resolvedUnit = unit.trim().ifBlank { null }
    val resolvedPreparation = preparation.trim().ifBlank { null }
    val resolvedNotes = notes.trim().ifBlank { null }
    val resolvedOriginalText = originalText.trim().ifBlank {
        buildIngredientPreview(quantityValue, resolvedUnit, resolvedName, resolvedPreparation, resolvedNotes)
    }
    if (resolvedName.isBlank() && resolvedOriginalText.isBlank()) {
        return null
    }
    return IngredientLine(
        id = id,
        ingredientRefId = ingredientRefId,
        originalText = resolvedOriginalText,
        quantity = quantityValue,
        unit = resolvedUnit,
        ingredientName = resolvedName.ifBlank { resolvedOriginalText },
        preparation = resolvedPreparation,
        notes = resolvedNotes
    )
}
private fun IngredientReference.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

private fun IngredientReference.pickerName(language: AppLanguage): String {
    val raw = localizedName(language)
    return raw
        .replace(Regex("^[\\d\\s/.,¼½¾??????-]+"), "")
        .replace(
            Regex(
                "^(cup|cups|tablespoon|tablespoons|tbsp|teaspoon|teaspoons|tsp|ounce|ounces|oz|gram|grams|g|kilogram|kilograms|kg|milliliter|milliliters|ml|liter|liters|l|pound|pounds|lb|lbs|bag|bags|package|packages|pkg|jar|jars|can|cans|box|boxes)\\s+",
                RegexOption.IGNORE_CASE
            ),
            ""
        )
        .trim()
        .ifBlank { raw }
}
private fun Tag.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}













