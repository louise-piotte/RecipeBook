package app.recipebook.ui.recipes

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import app.recipebook.R
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.PendingRecipePhotoCapture
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.RecipeTimes
import app.recipebook.domain.model.Servings
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.ui.theme.PopupShape
import java.time.Instant
import java.util.UUID
import kotlinx.coroutines.launch

@Composable
fun RecipeEditorScreen(
    initialRecipe: Recipe,
    isNewRecipe: Boolean,
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    onBack: () -> Unit,
    onSave: (Recipe) -> Unit,
    onCreateIngredientReference: suspend (IngredientReferenceDraft) -> IngredientReference,
    onCreateTag: suspend (TagDraft) -> Tag,
    onImportPhoto: suspend (Uri) -> PhotoRef,
    onCreatePendingCameraCapture: () -> PendingRecipePhotoCapture,
    onFinalizePendingCameraCapture: suspend (PendingRecipePhotoCapture) -> PhotoRef?,
    onDiscardDraftPhoto: (PhotoRef) -> Unit,
    onDraftPhotosChange: (List<PhotoRef>, String?) -> Unit,
    onDelete: (() -> Unit)?,
    modifier: Modifier = Modifier
) {
    var titleFr by rememberSaveable { mutableStateOf(initialRecipe.languages.fr.title) }
    var titleEn by rememberSaveable { mutableStateOf(initialRecipe.languages.en.title) }
    var descriptionFr by rememberSaveable { mutableStateOf(initialRecipe.languages.fr.description) }
    var descriptionEn by rememberSaveable { mutableStateOf(initialRecipe.languages.en.description) }
    var instructionsFr by rememberSaveable { mutableStateOf(initialRecipe.languages.fr.instructions) }
    var instructionsEn by rememberSaveable { mutableStateOf(initialRecipe.languages.en.instructions) }
    var notesFr by rememberSaveable { mutableStateOf(initialRecipe.languages.fr.notes) }
    var notesEn by rememberSaveable { mutableStateOf(initialRecipe.languages.en.notes) }
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
    val recipePhotos = remember(initialRecipe.id) {
        mutableStateListOf<PhotoRef>().apply { addAll(initialRecipe.photos) }
    }
    var mainPhotoId by rememberSaveable(initialRecipe.id) { mutableStateOf(initialRecipe.mainPhotoId) }
    val selectedTagIds = remember(initialRecipe.id) {
        mutableStateListOf<String>().apply { addAll(initialRecipe.tagIds) }
    }
    var ingredientPickerIndex by remember { mutableStateOf<Int?>(null) }
    var pendingIngredientTargetIndex by remember { mutableStateOf<Int?>(null) }
    var showCreateIngredientDialog by remember { mutableStateOf(false) }
    var showTagPickerDialog by remember { mutableStateOf(false) }
    var showCreateTagDialog by remember { mutableStateOf(false) }
    var ingredientsExpanded by rememberSaveable { mutableStateOf(false) }
    var pendingCameraCapture by remember { mutableStateOf<PendingRecipePhotoCapture?>(null) }
    val coroutineScope = rememberCoroutineScope()
    val saveRecipe = {
        onSave(
            initialRecipe.copy(
                updatedAt = Instant.now().toString(),
                languages = BilingualText(
                    fr = LocalizedSystemText(
                        title = titleFr.trim(),
                        description = descriptionFr.trim(),
                        instructions = normalizeMultilineText(instructionsFr),
                        notes = normalizeMultilineText(notesFr)
                    ),
                    en = LocalizedSystemText(
                        title = titleEn.trim(),
                        description = descriptionEn.trim(),
                        instructions = normalizeMultilineText(instructionsEn),
                        notes = normalizeMultilineText(notesEn)
                    )
                ),
                source = if (sourceName.isBlank() && sourceUrl.isBlank()) null else RecipeSource(
                    sourceName = sourceName.trim(),
                    sourceUrl = sourceUrl.trim()
                ),
                servings = parseServings(servingsAmount, servingsUnit),
                times = parseTimes(prepMinutes, cookMinutes, totalMinutes),
                ingredients = ingredientRows.toIngredientLines(ingredientReferences),
                tagIds = selectedTagIds.distinct(),
                mainPhotoId = normalizedMainPhotoId(mainPhotoId, recipePhotos),
                photos = recipePhotos.toList()
            )
        )
    }

    val titlePreview = remember(language, titleFr, titleEn) {
        if (language == AppLanguage.FR) titleFr else titleEn
    }

    val importPhotoLauncher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if (uri != null) {
            coroutineScope.launch {
                val importedPhoto = onImportPhoto(uri)
                recipePhotos.add(importedPhoto)
                mainPhotoId = normalizedMainPhotoId(mainPhotoId, recipePhotos)
            }
        }
    }

    val takePhotoLauncher = rememberLauncherForActivityResult(ActivityResultContracts.TakePicture()) { success ->
        val capture = pendingCameraCapture ?: return@rememberLauncherForActivityResult
        coroutineScope.launch {
            if (success) {
                val capturedPhoto = onFinalizePendingCameraCapture(capture)
                if (capturedPhoto != null) {
                    recipePhotos.add(capturedPhoto)
                    mainPhotoId = normalizedMainPhotoId(mainPhotoId, recipePhotos)
                } else {
                    onDiscardDraftPhoto(PhotoRef(id = capture.photoId, localPath = capture.localPath))
                }
            } else {
                onDiscardDraftPhoto(PhotoRef(id = capture.photoId, localPath = capture.localPath))
            }
            pendingCameraCapture = null
        }
    }

    LaunchedEffect(recipePhotos.toList(), mainPhotoId) {
        val normalized = normalizedMainPhotoId(mainPhotoId, recipePhotos)
        if (normalized != mainPhotoId) {
            mainPhotoId = normalized
        }
        onDraftPhotosChange(recipePhotos.toList(), normalized)
    }

    Scaffold(
        modifier = modifier,
        topBar = {
            RecipeBookTopBar(
                title = if (isNewRecipe) localizedString(R.string.add_recipe_label, language) else localizedString(R.string.edit_recipe_label, language),
                language = language,
                onLanguageChange = onLanguageChange,
                onNavigate = { },
                disabledDestinations = MainMenuDestination.entries.toSet(),
                navigationIcon = {
                    BackIconButton(
                        contentDescription = localizedString(R.string.back_label, language),
                        onClick = onBack
                    )
                }
            ) {
                AppIconButton(
                    icon = Icons.Filled.Save,
                    contentDescription = localizedString(R.string.save_recipe_label, language),
                    onClick = saveRecipe
                )
                if (onDelete != null) {
                    AppIconButton(
                        icon = Icons.Filled.Delete,
                        contentDescription = localizedString(R.string.delete_recipe_label, language),
                        onClick = onDelete
                    )
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(6.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp)
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
                LabeledField(localizedString(R.string.notes_fr_label, language), notesFr, singleLine = false, minLines = 4) { notesFr = it }
                LabeledField(localizedString(R.string.notes_en_label, language), notesEn, singleLine = false, minLines = 4) { notesEn = it }
                LabeledField(localizedString(R.string.source_name_label, language), sourceName) { sourceName = it }
                LabeledField(localizedString(R.string.source_url_label, language), sourceUrl) { sourceUrl = it }
                LabeledField(localizedString(R.string.servings_amount_label, language), servingsAmount) { servingsAmount = it }
                LabeledField(localizedString(R.string.servings_unit_label, language), servingsUnit) { servingsUnit = it }
                LabeledField(localizedString(R.string.prep_minutes_label, language), prepMinutes) { prepMinutes = it }
                LabeledField(localizedString(R.string.cook_minutes_label, language), cookMinutes) { cookMinutes = it }
                LabeledField(localizedString(R.string.total_minutes_label, language), totalMinutes) { totalMinutes = it }
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = localizedString(R.string.tags_label, language),
                        style = MaterialTheme.typography.titleLarge
                    )
                    AppIconButton(
                        icon = Icons.Filled.Add,
                        contentDescription = localizedString(R.string.select_tags_label, language),
                        onClick = { showTagPickerDialog = true }
                    )
                }
                if (selectedTagIds.isEmpty()) {
                    Text(
                        text = localizedString(R.string.no_tags_selected_label, language),
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                } else {
                    Text(
                        text = selectedTagIds
                            .mapNotNull { tagId -> tags.firstOrNull { it.id == tagId }?.localizedName(language) }
                            .joinToString(", "),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

                RecipePhotoEditorSection(
                    language = language,
                    photos = recipePhotos,
                    mainPhotoId = mainPhotoId,
                    onAddFromFile = { importPhotoLauncher.launch("image/*") },
                    onTakePhoto = {
                        val capture = onCreatePendingCameraCapture()
                        pendingCameraCapture = capture
                        takePhotoLauncher.launch(capture.uri)
                    },
                    onSetMainPhoto = { selectedPhotoId ->
                        mainPhotoId = selectedPhotoId
                    },
                    onRemovePhoto = { photo ->
                        recipePhotos.remove(photo)
                        onDiscardDraftPhoto(photo)
                        mainPhotoId = normalizedMainPhotoId(
                            mainPhotoId = if (mainPhotoId == photo.id) null else mainPhotoId,
                            photos = recipePhotos
                        )
                    }
                )

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
                                    notes = normalizeMultilineText(notesFr)
                                ),
                                en = LocalizedSystemText(
                                    title = titleEn.trim(),
                                    description = descriptionEn.trim(),
                                    instructions = normalizeMultilineText(instructionsEn),
                                    notes = normalizeMultilineText(notesEn)
                                )
                            ),
                            source = if (sourceName.isBlank() && sourceUrl.isBlank()) null else RecipeSource(
                                sourceName = sourceName.trim(),
                                sourceUrl = sourceUrl.trim()
                            ),
                            servings = parseServings(servingsAmount, servingsUnit),
                            times = parseTimes(prepMinutes, cookMinutes, totalMinutes),
                            ingredients = ingredientRows.toIngredientLines(ingredientReferences),
                            tagIds = selectedTagIds.distinct(),
                            mainPhotoId = normalizedMainPhotoId(mainPhotoId, recipePhotos),
                            photos = recipePhotos.toList()
                        )
                    )
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(localizedString(R.string.save_recipe_label, language))
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
                    ingredientName = ingredientReference.canonicalName().ifBlank { currentRow.ingredientName }
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
                        ingredientName = created.canonicalName()
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

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = localizedString(R.string.ingredients_label, language),
                style = MaterialTheme.typography.titleLarge
            )
            AppIconButton(
                icon = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                contentDescription = if (expanded) localizedString(R.string.collapse_ingredients_label, language) else localizedString(R.string.edit_ingredients_label, language),
                onClick = onToggleExpanded
            )
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
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Button(onClick = onAddIngredientLine) {
                    Icon(Icons.Filled.Add, contentDescription = null)
                    Text(localizedString(R.string.add_ingredient_line_label, language))
                }
                Button(onClick = onAddReusableIngredient) {
                    Icon(Icons.Filled.Add, contentDescription = null)
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
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = ingredientReference?.localizedName(language)?.ifBlank { row.ingredientName }
                    ?: row.ingredientName.ifBlank { localizedString(R.string.no_ingredient_selected_label, language) },
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(1f)
            )
            AppIconButton(
                icon = Icons.Filled.Edit,
                contentDescription = localizedString(R.string.select_ingredient_label, language),
                onClick = onSelectIngredient
            )
            AppIconButton(
                icon = Icons.Filled.Delete,
                contentDescription = localizedString(R.string.remove_label, language),
                onClick = onRemove
            )
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
        filterIngredientReferences(ingredientReferences, query)
    }

    PickerDialogContainer(
        title = localizedString(R.string.select_ingredient_label, language),
        onDismiss = onDismiss,
        topAction = {
            AppIconButton(
                icon = Icons.Filled.Add,
                contentDescription = localizedString(R.string.create_ingredient_label, language),
                onClick = onCreateNew
            )
        }
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            SearchField(
                value = query,
                onValueChange = { query = it },
                label = localizedString(R.string.search_ingredients_label, language),
                placeholder = localizedString(R.string.search_ingredients_placeholder, language)
            )
            Surface(tonalElevation = 2.dp) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 320.dp)
                        .padding(horizontal = 4.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    items(filtered, key = { it.id }) { ingredientReference ->
                        TextButton(onClick = { onSelect(ingredientReference) }) {
                            Text(ingredientReference.pickerName(language))
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun PickerDialogContainer(
    title: String,
    onDismiss: () -> Unit,
    topAction: @Composable () -> Unit = {},
    content: @Composable () -> Unit
) {
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .safeDrawingPadding()
                .imePadding()
                .padding(horizontal = 12.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = PopupShape,
                tonalElevation = 6.dp
            ) {
                Column(
                    modifier = Modifier.padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.weight(1f)
                        )
                        topAction()
                    }
                    content()
                }
            }
        }
    }
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
        filterTags(tags, query)
    }
    val groupedTags = remember(filtered, selectedTagIds.toList(), language) {
        groupTagsForDisplay(
            tags = filtered,
            language = language,
            selectedTagIds = selectedTagIds.toSet()
        )
    }

    PickerDialogContainer(
        title = localizedString(R.string.select_tags_label, language),
        onDismiss = onDismiss,
        topAction = {
            AppIconButton(
                icon = Icons.Filled.Add,
                contentDescription = localizedString(R.string.create_tag_label, language),
                onClick = onCreateNew
            )
        }
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            SearchField(
                value = query,
                onValueChange = { query = it },
                label = localizedString(R.string.search_tags_label, language),
                placeholder = localizedString(R.string.search_tags_placeholder, language)
            )
            Surface(tonalElevation = 2.dp) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 320.dp)
                        .padding(horizontal = 4.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    for (section in groupedTags) {
                        item(key = "tag-category-${section.category.name}") {
                            Text(
                                text = section.category.localizedName(language),
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 1.dp)
                            )
                        }
                        items(section.tags, key = { it.id }) { tag ->
                            val isSelected = selectedTagIds.contains(tag.id)
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 1.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = tag.localizedName(language),
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                    modifier = Modifier.weight(1f)
                                )
                                if (isSelected) {
                                    AppIconButton(
                                        icon = Icons.Filled.Delete,
                                        contentDescription = localizedString(R.string.remove_label, language),
                                        onClick = { selectedTagIds.remove(tag.id) }
                                    )
                                } else {
                                    AppIconButton(
                                        icon = Icons.Filled.Add,
                                        contentDescription = localizedString(R.string.add_tag_label, language),
                                        onClick = { selectedTagIds.add(tag.id) }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
@Composable
private fun CreateIngredientDialog(
    language: AppLanguage,
    onDismiss: () -> Unit,
    onConfirm: (IngredientReferenceDraft) -> Unit
) {
    IngredientDraftDialog(
        language = language,
        title = localizedString(R.string.create_ingredient_label, language),
        onDismiss = onDismiss,
        onConfirm = onConfirm
    )
}

@Composable
private fun CreateTagDialog(
    language: AppLanguage,
    onDismiss: () -> Unit,
    onConfirm: (TagDraft) -> Unit
) {
    TagDraftDialog(
        language = language,
        title = localizedString(R.string.create_tag_label, language),
        onDismiss = onDismiss,
        onConfirm = onConfirm
    )
}
@Composable
private fun LabeledField(
    label: String,
    value: String,
    singleLine: Boolean = true,
    minLines: Int = 1,
    leadingIcon: (@Composable () -> Unit)? = null,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
        label = { Text(label) },
        leadingIcon = leadingIcon,
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

internal data class EditableIngredientRow(
    val id: String,
    val ingredientRefId: String? = null,
    val ingredientName: String = "",
    val quantity: String = "",
    val unit: String = "",
    val preparation: String = "",
    val notes: String = "",
    val originalText: String = ""
)


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


internal fun editableIngredientRowForTest(
    id: String,
    ingredientRefId: String? = null,
    ingredientName: String = "",
    quantity: String = "",
    unit: String = "",
    preparation: String = "",
    notes: String = "",
    originalText: String = ""
): EditableIngredientRow = EditableIngredientRow(
    id = id,
    ingredientRefId = ingredientRefId,
    ingredientName = ingredientName,
    quantity = quantity,
    unit = unit,
    preparation = preparation,
    notes = notes,
    originalText = originalText
)
private fun blankIngredientRow(): EditableIngredientRow = EditableIngredientRow(id = UUID.randomUUID().toString())

internal fun List<EditableIngredientRow>.toIngredientLines(
    ingredientReferences: List<IngredientReference>
): List<IngredientLine> {
    val ingredientMap = ingredientReferences.associateBy(IngredientReference::id)
    return mapNotNull { row ->
        val ingredientReference = row.ingredientRefId?.let(ingredientMap::get)
        val ingredientName = ingredientReference?.canonicalName()
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
internal fun filterIngredientReferences(
    ingredientReferences: List<IngredientReference>,
    query: String
): List<IngredientReference> {
    val trimmed = query.trim()
    if (trimmed.isEmpty()) return ingredientReferences
    return ingredientReferences.filter { ingredientReference ->
        listOf(
            ingredientReference.nameFr,
            ingredientReference.nameEn,
            ingredientReference.aliasesFr.joinToString(" "),
            ingredientReference.aliasesEn.joinToString(" ")
        ).any { it.contains(trimmed, ignoreCase = true) }
    }
}

internal fun filterTags(
    tags: List<Tag>,
    query: String
): List<Tag> {
    val trimmed = query.trim()
    if (trimmed.isEmpty()) return tags
    return tags.filter { tag ->
        listOf(
            tag.nameFr,
            tag.nameEn,
            tag.slug,
            tag.category.localizedName(AppLanguage.FR),
            tag.category.localizedName(AppLanguage.EN)
        ).any { it.contains(trimmed, ignoreCase = true) }
    }
}

internal data class TagCategorySection(
    val category: TagCategory,
    val tags: List<Tag>
)

internal fun groupTagsForDisplay(
    tags: List<Tag>,
    language: AppLanguage,
    selectedTagIds: Set<String> = emptySet()
): List<TagCategorySection> {
    return TagCategory.entries.mapNotNull { category ->
        val grouped = tags
            .filter { it.category == category }
            .sortedWith(
                compareByDescending<Tag> { selectedTagIds.contains(it.id) }
                    .thenBy { it.localizedName(language) }
            )
        if (grouped.isEmpty()) {
            null
        } else {
            TagCategorySection(category = category, tags = grouped)
        }
    }
}

private fun IngredientReference.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

private fun IngredientReference.pickerName(language: AppLanguage): String {
    val raw = localizedName(language)
    return raw
        .replace(Regex("^[\\d\\s/.,-]+"), "")
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
internal fun IngredientReference.canonicalName(): String = nameEn.ifBlank { nameFr }

private fun Tag.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}






































































