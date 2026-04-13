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
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
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
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.Saver
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
import app.recipebook.domain.model.BilingualSyncStatus
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLink
import app.recipebook.domain.model.RecipeLinkType
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
    recipes: List<Recipe>,
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    collections: List<Collection>,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    onBack: () -> Unit,
    onSave: (Recipe, AppLanguage) -> Unit,
    onRegenerateOtherLanguage: suspend (Recipe, AppLanguage) -> Recipe,
    onLocalizedTextEdited: (ImportMetadata?, BilingualText, AppLanguage) -> ImportMetadata,
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
    var localizedTexts by rememberSaveable(stateSaver = bilingualTextSaver()) {
        mutableStateOf(
            BilingualText(
                fr = initialRecipe.languages.fr,
                en = initialRecipe.languages.en
            )
        )
    }
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
    val recipeLinkRows = remember(initialRecipe.id) {
        mutableStateListOf<EditableRecipeLinkRow>().apply {
            addAll(initialRecipe.recipeLinks.map(RecipeLink::toEditableRow))
        }
    }
    var mainPhotoId by rememberSaveable(initialRecipe.id) { mutableStateOf(initialRecipe.mainPhotoId) }
    val selectedTagIds = remember(initialRecipe.id) {
        mutableStateListOf<String>().apply { addAll(initialRecipe.tagIds) }
    }
    val selectedCollectionIds = remember(initialRecipe.id) {
        mutableStateListOf<String>().apply { addAll(initialRecipe.collectionIds) }
    }
    var ingredientPickerIndex by remember { mutableStateOf<Int?>(null) }
    var pendingIngredientTargetIndex by remember { mutableStateOf<Int?>(null) }
    var showCreateIngredientDialog by remember { mutableStateOf(false) }
    var showTagPickerDialog by remember { mutableStateOf(false) }
    var showCollectionPickerDialog by remember { mutableStateOf(false) }
    var showCreateTagDialog by remember { mutableStateOf(false) }
    var showRecipeLinkPickerDialog by remember { mutableStateOf(false) }
    var pendingRecipeLinkIndex by remember { mutableStateOf<Int?>(null) }
    var ingredientsExpanded by rememberSaveable { mutableStateOf(false) }
    var pendingCameraCapture by remember { mutableStateOf<PendingRecipePhotoCapture?>(null) }
    var currentImportMetadata by rememberSaveable(stateSaver = importMetadataSaver()) {
        mutableStateOf(initialRecipe.importMetadata)
    }
    var isRegeneratingOtherLanguage by remember { mutableStateOf(false) }
    var regenerationNotice by remember { mutableStateOf<RegenerationNotice?>(null) }
    val coroutineScope = rememberCoroutineScope()
    val activeLocalizedText = remember(localizedTexts, language) {
        localizedTexts.forLanguage(language)
    }
    val otherLanguage = remember(language) { language.opposite() }
    val otherLanguageStatus = remember(localizedTexts, language, currentImportMetadata) {
        displayedOtherLanguageStatus(
            initialLanguages = initialRecipe.languages,
            currentLanguages = localizedTexts,
            currentLanguage = language,
            importMetadata = currentImportMetadata
        )
    }
    val saveRecipe = {
        onSave(
            initialRecipe.copy(
                updatedAt = Instant.now().toString(),
                languages = localizedTexts,
                importMetadata = currentImportMetadata,
                source = if (sourceName.isBlank() && sourceUrl.isBlank()) null else RecipeSource(
                    sourceName = sourceName.trim(),
                    sourceUrl = sourceUrl.trim()
                ),
                servings = parseServings(servingsAmount, servingsUnit),
                times = parseTimes(prepMinutes, cookMinutes, totalMinutes),
                ingredients = ingredientRows.toIngredientLines(ingredientReferences),
                tagIds = selectedTagIds.distinct(),
                collectionIds = selectedCollectionIds.distinct(),
                recipeLinks = recipeLinkRows.toRecipeLinks(),
                mainPhotoId = normalizedMainPhotoId(mainPhotoId, recipePhotos),
                photos = recipePhotos.toList()
            ),
            language
        )
    }

    val titlePreview = remember(language, localizedTexts) {
        localizedTexts.forLanguage(language).title
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
                BilingualSyncStatusCard(
                    language = language,
                    otherLanguage = otherLanguage,
                    otherLanguageStatus = otherLanguageStatus,
                    isRegenerating = isRegeneratingOtherLanguage,
                    onRegenerateClick = {
                        if (isRegeneratingOtherLanguage) return@BilingualSyncStatusCard
                        val draftRecipe = initialRecipe.copy(
                            updatedAt = Instant.now().toString(),
                            languages = localizedTexts,
                            importMetadata = currentImportMetadata,
                            source = if (sourceName.isBlank() && sourceUrl.isBlank()) null else RecipeSource(
                                sourceName = sourceName.trim(),
                                sourceUrl = sourceUrl.trim()
                            ),
                            servings = parseServings(servingsAmount, servingsUnit),
                            times = parseTimes(prepMinutes, cookMinutes, totalMinutes),
                            ingredients = ingredientRows.toIngredientLines(ingredientReferences),
                            tagIds = selectedTagIds.distinct(),
                            collectionIds = selectedCollectionIds.distinct(),
                            recipeLinks = recipeLinkRows.toRecipeLinks(),
                            mainPhotoId = normalizedMainPhotoId(mainPhotoId, recipePhotos),
                            photos = recipePhotos.toList()
                        )
                        coroutineScope.launch {
                            isRegeneratingOtherLanguage = true
                            runCatching {
                                onRegenerateOtherLanguage(draftRecipe, language)
                            }.onSuccess { regeneratedRecipe ->
                                localizedTexts = regeneratedRecipe.languages
                                currentImportMetadata = regeneratedRecipe.importMetadata
                                regenerationNotice = RegenerationNotice.Success(otherLanguage)
                            }.onFailure {
                                regenerationNotice = RegenerationNotice.Error(otherLanguage)
                            }
                            isRegeneratingOtherLanguage = false
                        }
                    }
                )

                LabeledField(localizedString(R.string.title_label, language), activeLocalizedText.title) {
                    localizedTexts = localizedTexts.updateForLanguage(language) { copy(title = it) }
                    currentImportMetadata = onLocalizedTextEdited(currentImportMetadata, localizedTexts, language)
                }
                LabeledField(
                    localizedString(R.string.description_label, language),
                    activeLocalizedText.description,
                    singleLine = false,
                    minLines = 4
                ) {
                    localizedTexts = localizedTexts.updateForLanguage(language) { copy(description = it) }
                    currentImportMetadata = onLocalizedTextEdited(currentImportMetadata, localizedTexts, language)
                }
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
                LabeledField(
                    localizedString(R.string.instructions_label, language),
                    activeLocalizedText.instructions,
                    singleLine = false,
                    minLines = 5
                ) {
                    localizedTexts = localizedTexts.updateForLanguage(language) { copy(instructions = it) }
                    currentImportMetadata = onLocalizedTextEdited(currentImportMetadata, localizedTexts, language)
                }
                LabeledField(
                    localizedString(R.string.notes_label, language),
                    activeLocalizedText.notes,
                    singleLine = false,
                    minLines = 4
                ) {
                    localizedTexts = localizedTexts.updateForLanguage(language) { copy(notes = it) }
                    currentImportMetadata = onLocalizedTextEdited(currentImportMetadata, localizedTexts, language)
                }
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

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = localizedString(R.string.collections_label, language),
                        style = MaterialTheme.typography.titleLarge
                    )
                    AppIconButton(
                        icon = Icons.Filled.Add,
                        contentDescription = localizedString(R.string.select_collections_label, language),
                        onClick = { showCollectionPickerDialog = true }
                    )
                }
                if (selectedCollectionIds.isEmpty()) {
                    Text(
                        text = localizedString(R.string.no_collections_selected_label, language),
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                } else {
                    Text(
                        text = selectedCollectionIds
                            .mapNotNull { collectionId -> collections.firstOrNull { it.id == collectionId }?.displayName(language) }
                            .joinToString(", "),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

            LinkedRecipesEditorSection(
                language = language,
                currentRecipeId = initialRecipe.id,
                allRecipes = recipes,
                recipeLinkRows = recipeLinkRows,
                onAddLink = {
                    recipeLinkRows.add(blankRecipeLinkRow())
                    pendingRecipeLinkIndex = recipeLinkRows.lastIndex
                    showRecipeLinkPickerDialog = true
                },
                onPickTarget = { index ->
                    pendingRecipeLinkIndex = index
                    showRecipeLinkPickerDialog = true
                },
                onLabelFrChange = { index, value -> recipeLinkRows[index] = recipeLinkRows[index].copy(labelFr = value) },
                onLabelEnChange = { index, value -> recipeLinkRows[index] = recipeLinkRows[index].copy(labelEn = value) },
                onMoveUp = { index ->
                    if (index > 0) {
                        val current = recipeLinkRows[index]
                        recipeLinkRows[index] = recipeLinkRows[index - 1]
                        recipeLinkRows[index - 1] = current
                    }
                },
                onMoveDown = { index ->
                    if (index < recipeLinkRows.lastIndex) {
                        val current = recipeLinkRows[index]
                        recipeLinkRows[index] = recipeLinkRows[index + 1]
                        recipeLinkRows[index + 1] = current
                    }
                },
                onRemove = { index -> recipeLinkRows.removeAt(index) }
            )

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
                onClick = saveRecipe,
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

    if (showCollectionPickerDialog) {
        CollectionPickerDialog(
            language = language,
            collections = collections,
            selectedCollectionIds = selectedCollectionIds,
            onDismiss = { showCollectionPickerDialog = false }
        )
    }

    if (showRecipeLinkPickerDialog) {
        RecipeLinkTargetPickerDialog(
            language = language,
            currentRecipeId = initialRecipe.id,
            recipes = recipes,
            initialLinkType = pendingRecipeLinkIndex?.let { recipeLinkRows.getOrNull(it)?.linkType } ?: RecipeLinkType.OTHER,
            onDismiss = {
                val index = pendingRecipeLinkIndex
                if (index != null && recipeLinkRows.getOrNull(index)?.targetRecipeId == null) {
                    recipeLinkRows.removeAt(index)
                }
                pendingRecipeLinkIndex = null
                showRecipeLinkPickerDialog = false
            },
            onSelect = { targetRecipe, linkType ->
                val index = pendingRecipeLinkIndex ?: return@RecipeLinkTargetPickerDialog
                recipeLinkRows[index] = recipeLinkRows[index].copy(
                    targetRecipeId = targetRecipe.id,
                    linkType = linkType
                )
                pendingRecipeLinkIndex = null
                showRecipeLinkPickerDialog = false
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

    regenerationNotice?.let { notice ->
        AlertDialog(
            onDismissRequest = { regenerationNotice = null },
            title = {
                Text(
                    localizedString(
                        when (notice) {
                            is RegenerationNotice.Success -> R.string.regeneration_applied_title
                            is RegenerationNotice.Error -> R.string.regeneration_failed_title
                        },
                        language
                    )
                )
            },
            text = {
                val otherTargetLanguage = when (notice) {
                    is RegenerationNotice.Success -> notice.otherLanguage
                    is RegenerationNotice.Error -> notice.otherLanguage
                }
                Text(
                    localizedString(
                        when (notice) {
                            is RegenerationNotice.Success -> R.string.regeneration_applied_message
                            is RegenerationNotice.Error -> R.string.regeneration_failed_message
                        },
                        language,
                        localizedLanguageName(otherTargetLanguage, language)
                    )
                )
            },
            confirmButton = {
                TextButton(onClick = { regenerationNotice = null }) {
                    Text(localizedString(R.string.close_label, language))
                }
            }
        )
    }
}

@Composable
private fun BilingualSyncStatusCard(
    language: AppLanguage,
    otherLanguage: AppLanguage,
    otherLanguageStatus: BilingualSyncStatus,
    isRegenerating: Boolean,
    onRegenerateClick: () -> Unit
) {
    val message = when (otherLanguageStatus) {
        BilingualSyncStatus.UP_TO_DATE -> localizedString(
            R.string.other_language_up_to_date_label,
            language,
            localizedLanguageName(otherLanguage, language)
        )
        BilingualSyncStatus.NEEDS_REGENERATION -> localizedString(
            R.string.other_language_needs_regeneration_label,
            language,
            localizedLanguageName(otherLanguage, language)
        )
        BilingualSyncStatus.MISSING -> localizedString(
            R.string.other_language_missing_label,
            language,
            localizedLanguageName(otherLanguage, language)
        )
    }
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = message,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(1f)
            )
            if (otherLanguageStatus != BilingualSyncStatus.UP_TO_DATE) {
                if (isRegenerating) {
                    Text(
                        text = localizedString(
                            R.string.regeneration_in_progress_label,
                            language,
                            localizedLanguageName(otherLanguage, language)
                        ),
                        style = MaterialTheme.typography.bodySmall
                    )
                } else {
                    TextButton(onClick = onRegenerateClick) {
                        Text(
                            localizedString(
                                R.string.regenerate_other_language_label,
                                language,
                                localizedLanguageName(otherLanguage, language)
                            )
                        )
                    }
                }
            }
        }
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
private fun CollectionPickerDialog(
    language: AppLanguage,
    collections: List<Collection>,
    selectedCollectionIds: MutableList<String>,
    onDismiss: () -> Unit
) {
    var query by rememberSaveable { mutableStateOf("") }
    val filtered = remember(query, collections) {
        filterCollections(collections, query)
    }

    PickerDialogContainer(
        title = localizedString(R.string.select_collections_label, language),
        onDismiss = onDismiss
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            SearchField(
                value = query,
                onValueChange = { query = it },
                label = localizedString(R.string.search_collections_label, language),
                placeholder = localizedString(R.string.search_collections_placeholder, language)
            )
            Surface(tonalElevation = 2.dp) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 320.dp)
                        .padding(horizontal = 4.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    if (filtered.isEmpty()) {
                        item {
                            Text(
                                text = localizedString(R.string.no_collections_found_label, language),
                                modifier = Modifier.padding(8.dp)
                            )
                        }
                    } else {
                        items(filtered, key = { it.id }) { collection ->
                            val isSelected = selectedCollectionIds.contains(collection.id)
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 1.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = collection.displayName(language),
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                    modifier = Modifier.weight(1f)
                                )
                                if (isSelected) {
                                    AppIconButton(
                                        icon = Icons.Filled.Delete,
                                        contentDescription = localizedString(R.string.remove_label, language),
                                        onClick = { selectedCollectionIds.remove(collection.id) }
                                    )
                                } else {
                                    AppIconButton(
                                        icon = Icons.Filled.Add,
                                        contentDescription = localizedString(R.string.add_collection_label, language),
                                        onClick = { selectedCollectionIds.add(collection.id) }
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
private fun LinkedRecipesEditorSection(
    language: AppLanguage,
    currentRecipeId: String,
    allRecipes: List<Recipe>,
    recipeLinkRows: List<EditableRecipeLinkRow>,
    onAddLink: () -> Unit,
    onPickTarget: (Int) -> Unit,
    onLabelFrChange: (Int, String) -> Unit,
    onLabelEnChange: (Int, String) -> Unit,
    onMoveUp: (Int) -> Unit,
    onMoveDown: (Int) -> Unit,
    onRemove: (Int) -> Unit
) {
    val recipeMap = allRecipes.associateBy(Recipe::id)

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = localizedString(R.string.linked_recipes_label, language),
                style = MaterialTheme.typography.titleLarge
            )
            AppIconButton(
                icon = Icons.Filled.Add,
                contentDescription = localizedString(R.string.add_linked_recipe_label, language),
                onClick = onAddLink
            )
        }
        if (recipeLinkRows.isEmpty()) {
            Text(
                text = localizedString(R.string.no_linked_recipes_label, language),
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        } else {
            recipeLinkRows.forEachIndexed { index, row ->
                RecipeLinkEditorCard(
                    language = language,
                    row = row,
                    targetRecipe = row.targetRecipeId?.let(recipeMap::get),
                    canMoveUp = index > 0,
                    canMoveDown = index < recipeLinkRows.lastIndex,
                    currentRecipeId = currentRecipeId,
                    onPickTarget = { onPickTarget(index) },
                    onLabelFrChange = { onLabelFrChange(index, it) },
                    onLabelEnChange = { onLabelEnChange(index, it) },
                    onMoveUp = { onMoveUp(index) },
                    onMoveDown = { onMoveDown(index) },
                    onRemove = { onRemove(index) }
                )
            }
        }
    }
}

@Composable
private fun RecipeLinkEditorCard(
    language: AppLanguage,
    row: EditableRecipeLinkRow,
    targetRecipe: Recipe?,
    canMoveUp: Boolean,
    canMoveDown: Boolean,
    currentRecipeId: String,
    onPickTarget: () -> Unit,
    onLabelFrChange: (String) -> Unit,
    onLabelEnChange: (String) -> Unit,
    onMoveUp: () -> Unit,
    onMoveDown: () -> Unit,
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
            val typePrefix = if (row.linkType == RecipeLinkType.OTHER) {
                null
            } else {
                localizedString(recipeLinkTypeLabelRes(row.linkType), language)
            }
            val title = targetRecipe?.let {
                if (language == AppLanguage.FR) it.languages.fr.title.ifBlank { it.languages.en.title }
                else it.languages.en.title.ifBlank { it.languages.fr.title }
            } ?: localizedString(R.string.select_linked_recipe_label, language)
            Text(
                text = listOfNotNull(typePrefix, title).joinToString(": "),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(1f)
            )
            AppIconButton(
                icon = Icons.Filled.Edit,
                contentDescription = localizedString(R.string.select_linked_recipe_label, language),
                onClick = onPickTarget
            )
            if (canMoveUp) {
                AppIconButton(
                    icon = Icons.Filled.ExpandLess,
                    contentDescription = localizedString(R.string.move_up_label, language),
                    onClick = onMoveUp
                )
            }
            if (canMoveDown) {
                AppIconButton(
                    icon = Icons.Filled.ExpandMore,
                    contentDescription = localizedString(R.string.move_down_label, language),
                    onClick = onMoveDown
                )
            }
            AppIconButton(
                icon = Icons.Filled.Delete,
                contentDescription = localizedString(R.string.remove_label, language),
                onClick = onRemove
            )
        }
        LabeledField(localizedString(R.string.recipe_link_label_fr_label, language), row.labelFr, singleLine = false, onValueChange = onLabelFrChange)
        LabeledField(localizedString(R.string.recipe_link_label_en_label, language), row.labelEn, singleLine = false, onValueChange = onLabelEnChange)
        if (row.targetRecipeId == currentRecipeId) {
            Text(
                text = localizedString(R.string.linked_recipe_self_invalid_label, language),
                color = MaterialTheme.colorScheme.error
            )
        }
    }
}

@Composable
private fun RecipeLinkTargetPickerDialog(
    language: AppLanguage,
    currentRecipeId: String,
    recipes: List<Recipe>,
    onDismiss: () -> Unit,
    initialLinkType: RecipeLinkType,
    onSelect: (Recipe, RecipeLinkType) -> Unit
) {
    var query by rememberSaveable { mutableStateOf("") }
    var selectedType by rememberSaveable { mutableStateOf(initialLinkType) }
    val filtered = remember(query, recipes, currentRecipeId) {
        filterRecipesForLinkPicker(recipes, currentRecipeId, query)
    }

    PickerDialogContainer(
        title = localizedString(R.string.select_linked_recipe_label, language),
        onDismiss = onDismiss
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            RecipeLinkTypeDropdownField(
                language = language,
                selectedType = selectedType,
                onSelect = { selectedType = it }
            )
            SearchField(
                value = query,
                onValueChange = { query = it },
                label = localizedString(R.string.search_recipes_label, language),
                placeholder = localizedString(R.string.search_recipes_placeholder, language)
            )
            Surface(tonalElevation = 2.dp) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 320.dp)
                        .padding(horizontal = 4.dp, vertical = 2.dp),
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    if (filtered.isEmpty()) {
                        item {
                            Text(
                                text = localizedString(R.string.no_linkable_recipes_found_label, language),
                                modifier = Modifier.padding(8.dp)
                            )
                        }
                    } else {
                        items(filtered, key = { it.id }) { recipe ->
                            TextButton(onClick = { onSelect(recipe, selectedType) }) {
                                Text(
                                    if (language == AppLanguage.FR) recipe.languages.fr.title.ifBlank { recipe.languages.en.title }
                                    else recipe.languages.en.title.ifBlank { recipe.languages.fr.title }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun RecipeLinkTypeDropdownField(
    language: AppLanguage,
    selectedType: RecipeLinkType,
    onSelect: (RecipeLinkType) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val selectedLabel = localizedString(recipeLinkTypeLabelRes(selectedType), language)
    Box {
        TextButton(onClick = { expanded = true }) {
            Text("${localizedString(R.string.recipe_link_type_label, language)}: $selectedLabel")
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            RecipeLinkType.entries.forEach { type ->
                DropdownMenuItem(
                    text = { Text(localizedString(recipeLinkTypeLabelRes(type), language)) },
                    onClick = {
                        expanded = false
                        onSelect(type)
                    }
                )
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

private fun bilingualTextSaver(): Saver<BilingualText, Any> = listSaver(
    save = {
        listOf(
            it.fr.title,
            it.fr.description,
            it.fr.instructions,
            it.fr.notes,
            it.en.title,
            it.en.description,
            it.en.instructions,
            it.en.notes
        )
    },
    restore = {
        BilingualText(
            fr = LocalizedSystemText(
                title = it[0] as String,
                description = it[1] as String,
                instructions = it[2] as String,
                notes = it[3] as String
            ),
            en = LocalizedSystemText(
                title = it[4] as String,
                description = it[5] as String,
                instructions = it[6] as String,
                notes = it[7] as String
            )
        )
    }
)

private fun importMetadataSaver(): Saver<ImportMetadata?, Any> = listSaver(
    save = {
        listOf(
            it?.sourceType.orEmpty(),
            it?.parserVersion.orEmpty(),
            it?.originalUnits.orEmpty(),
            it?.authoritativeLanguage?.name.orEmpty(),
            it?.syncStatusFr?.name.orEmpty(),
            it?.syncStatusEn?.name.orEmpty()
        )
    },
    restore = {
        val values = it.map { value -> value as String }
        if (values.all(String::isBlank)) {
            null
        } else {
            ImportMetadata(
                sourceType = values[0].ifBlank { null },
                parserVersion = values[1].ifBlank { null },
                originalUnits = values[2].ifBlank { null },
                authoritativeLanguage = values[3].ifBlank { null }?.let(AppLanguage::valueOf),
                syncStatusFr = values[4].ifBlank { null }?.let(BilingualSyncStatus::valueOf),
                syncStatusEn = values[5].ifBlank { null }?.let(BilingualSyncStatus::valueOf)
            )
        }
    }
)

internal fun BilingualText.forLanguage(language: AppLanguage): LocalizedSystemText = when (language) {
    AppLanguage.FR -> fr
    AppLanguage.EN -> en
}

internal fun BilingualText.updateForLanguage(
    language: AppLanguage,
    update: LocalizedSystemText.() -> LocalizedSystemText
): BilingualText = when (language) {
    AppLanguage.FR -> copy(fr = fr.update())
    AppLanguage.EN -> copy(en = en.update())
}

internal fun AppLanguage.opposite(): AppLanguage = when (this) {
    AppLanguage.FR -> AppLanguage.EN
    AppLanguage.EN -> AppLanguage.FR
}

internal fun displayedOtherLanguageStatus(
    initialLanguages: BilingualText,
    currentLanguages: BilingualText,
    currentLanguage: AppLanguage,
    importMetadata: ImportMetadata?
): BilingualSyncStatus {
    val otherLanguage = currentLanguage.opposite()
    val storedStatus = importMetadata.statusForLanguage(otherLanguage)
    if (storedStatus == BilingualSyncStatus.UP_TO_DATE &&
        importMetadata?.authoritativeLanguage == currentLanguage
    ) {
        return BilingualSyncStatus.UP_TO_DATE
    }
    val activeChanged = currentLanguages.forLanguage(currentLanguage) != initialLanguages.forLanguage(currentLanguage)
    val currentOtherText = currentLanguages.forLanguage(otherLanguage)
    return if (activeChanged) {
        if (currentOtherText.isBlankText()) BilingualSyncStatus.MISSING else BilingualSyncStatus.NEEDS_REGENERATION
    } else {
        storedStatus
            ?: if (currentOtherText.isBlankText()) BilingualSyncStatus.MISSING else BilingualSyncStatus.UP_TO_DATE
    }
}

internal fun localizedLanguageName(targetLanguage: AppLanguage, uiLanguage: AppLanguage): String = when (targetLanguage) {
    AppLanguage.EN -> localizedLanguageOptionLabel(AppLanguage.EN, uiLanguage)
    AppLanguage.FR -> localizedLanguageOptionLabel(AppLanguage.FR, uiLanguage)
}

private fun localizedLanguageOptionLabel(targetLanguage: AppLanguage, uiLanguage: AppLanguage): String = when (targetLanguage) {
    AppLanguage.EN -> if (uiLanguage == AppLanguage.FR) "anglais" else "English"
    AppLanguage.FR -> if (uiLanguage == AppLanguage.FR) "fran\u00e7ais" else "French"
}

private sealed interface RegenerationNotice {
    data class Success(val otherLanguage: AppLanguage) : RegenerationNotice
    data class Error(val otherLanguage: AppLanguage) : RegenerationNotice
}

private fun LocalizedSystemText.isBlankText(): Boolean =
    title.isBlank() && description.isBlank() && instructions.isBlank() && notes.isBlank()

private fun ImportMetadata?.statusForLanguage(language: AppLanguage): BilingualSyncStatus? = when (language) {
    AppLanguage.FR -> this?.syncStatusFr
    AppLanguage.EN -> this?.syncStatusEn
}

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

internal data class EditableRecipeLinkRow(
    val id: String,
    val targetRecipeId: String? = null,
    val linkType: RecipeLinkType = RecipeLinkType.OTHER,
    val labelFr: String = "",
    val labelEn: String = ""
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

private fun RecipeLink.toEditableRow(): EditableRecipeLinkRow = EditableRecipeLinkRow(
    id = id,
    targetRecipeId = targetRecipeId,
    linkType = linkType,
    labelFr = labelFr.orEmpty(),
    labelEn = labelEn.orEmpty()
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

private fun blankRecipeLinkRow(): EditableRecipeLinkRow = EditableRecipeLinkRow(id = UUID.randomUUID().toString())

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

private fun List<EditableRecipeLinkRow>.toRecipeLinks(): List<RecipeLink> = mapNotNull { row ->
    val targetRecipeId = row.targetRecipeId ?: return@mapNotNull null
    RecipeLink(
        id = row.id,
        targetRecipeId = targetRecipeId,
        linkType = row.linkType,
        labelFr = row.labelFr.trim().ifBlank { null },
        labelEn = row.labelEn.trim().ifBlank { null }
    )
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

private fun Collection.displayName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

internal fun filterCollections(collections: List<Collection>, query: String): List<Collection> {
    val trimmedQuery = query.trim()
    return collections
        .filter { collection ->
            trimmedQuery.isBlank() ||
                collection.nameFr.contains(trimmedQuery, ignoreCase = true) ||
                collection.nameEn.contains(trimmedQuery, ignoreCase = true) ||
                collection.descriptionFr.orEmpty().contains(trimmedQuery, ignoreCase = true) ||
                collection.descriptionEn.orEmpty().contains(trimmedQuery, ignoreCase = true)
        }
        .sortedBy { it.nameEn.ifBlank { it.nameFr } }
}

private fun filterRecipesForLinkPicker(
    recipes: List<Recipe>,
    currentRecipeId: String,
    query: String
): List<Recipe> {
    val trimmedQuery = query.trim()
    return recipes
        .filter { it.id != currentRecipeId }
        .filter { recipe ->
            trimmedQuery.isBlank() ||
                recipe.languages.fr.title.contains(trimmedQuery, ignoreCase = true) ||
                recipe.languages.en.title.contains(trimmedQuery, ignoreCase = true) ||
                recipe.languages.fr.description.contains(trimmedQuery, ignoreCase = true) ||
                recipe.languages.en.description.contains(trimmedQuery, ignoreCase = true)
        }
        .sortedBy { it.languages.en.title.ifBlank { it.languages.fr.title } }
}

private fun recipeLinkTypeLabelRes(type: RecipeLinkType): Int = when (type) {
    RecipeLinkType.COMPONENT -> R.string.recipe_link_type_component_label
    RecipeLinkType.TOPPING -> R.string.recipe_link_type_topping_label
    RecipeLinkType.FILLING -> R.string.recipe_link_type_filling_label
    RecipeLinkType.FROSTING -> R.string.recipe_link_type_frosting_label
    RecipeLinkType.SAUCE -> R.string.recipe_link_type_sauce_label
    RecipeLinkType.SEASONING -> R.string.recipe_link_type_seasoning_label
    RecipeLinkType.SIDE -> R.string.recipe_link_type_side_label
    RecipeLinkType.PAIRING -> R.string.recipe_link_type_pairing_label
    RecipeLinkType.VARIATION -> R.string.recipe_link_type_variation_label
    RecipeLinkType.OTHER -> R.string.recipe_link_type_other_label
}






































































