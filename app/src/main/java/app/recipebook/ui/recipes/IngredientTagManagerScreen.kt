package app.recipebook.ui.recipes

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import app.recipebook.R
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.IngredientSubstitutionDraft
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.ContextualSubstitutionRule
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.ui.theme.PopupShape

@Composable
fun IngredientTagManagerScreen(
    ingredientReferences: List<IngredientReference>,
    ingredientSubstitutions: List<ContextualSubstitutionRule>,
    tags: List<Tag>,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    initialSection: LibraryManagerSection,
    onNavigateToLibrary: () -> Unit,
    onNavigateToCollections: () -> Unit,
    onCreateIngredient: (IngredientReferenceDraft) -> Unit,
    onUpdateIngredient: (String, IngredientReferenceDraft) -> Unit,
    onCreateIngredientSubstitution: (IngredientSubstitutionDraft) -> Unit,
    onUpdateIngredientSubstitution: (String, IngredientSubstitutionDraft) -> Unit,
    onDeleteIngredientSubstitution: (String) -> Unit,
    onCreateTag: (TagDraft) -> Unit,
    onUpdateTag: (String, TagDraft) -> Unit,
    modifier: Modifier = Modifier
) {
    var currentSection by rememberSaveable { mutableStateOf(initialSection) }
    var ingredientQuery by rememberSaveable { mutableStateOf("") }
    var tagQuery by rememberSaveable { mutableStateOf("") }
    var selectedIngredient by remember { mutableStateOf<IngredientReference?>(null) }
    var editingIngredient by remember { mutableStateOf<IngredientReference?>(null) }
    var showNewIngredientDialog by remember { mutableStateOf(false) }
    var editingTag by remember { mutableStateOf<Tag?>(null) }
    var showNewTagDialog by remember { mutableStateOf(false) }
    var substitutionEditorIngredient by remember { mutableStateOf<IngredientReference?>(null) }
    var editingSubstitution by remember { mutableStateOf<ContextualSubstitutionRule?>(null) }

    val filteredIngredients = remember(ingredientReferences, ingredientQuery) {
        filterManagedIngredientReferences(ingredientReferences, ingredientQuery)
    }
    val filteredTags = remember(tags, tagQuery) {
        filterTags(tags, tagQuery)
    }
    val dishTypeTags = remember(tags) {
        tags.filter { it.category == TagCategory.DISH_TYPE }
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            RecipeBookTopBar(
                title = when (currentSection) {
                    LibraryManagerSection.Ingredients -> localizedString(R.string.ingredients_label, language)
                    LibraryManagerSection.Tags -> localizedString(R.string.tags_label, language)
                },
                language = language,
                onLanguageChange = onLanguageChange,
                onNavigate = { destination ->
                    when (destination) {
                        MainMenuDestination.Library -> onNavigateToLibrary()
                        MainMenuDestination.Import -> Unit
                        MainMenuDestination.Collections -> onNavigateToCollections()
                        MainMenuDestination.Ingredients -> currentSection = LibraryManagerSection.Ingredients
                        MainMenuDestination.Tags -> currentSection = LibraryManagerSection.Tags
                    }
                },
                actions = {
                    AppIconButton(
                        icon = Icons.Filled.Add,
                        contentDescription = when (currentSection) {
                            LibraryManagerSection.Ingredients -> localizedString(R.string.create_ingredient_label, language)
                            LibraryManagerSection.Tags -> localizedString(R.string.create_tag_label, language)
                        },
                        onClick = {
                            when (currentSection) {
                                LibraryManagerSection.Ingredients -> showNewIngredientDialog = true
                                LibraryManagerSection.Tags -> showNewTagDialog = true
                            }
                        }
                    )
                }
            )
        },
        bottomBar = {
            BottomSearchBar {
                SearchField(
                    value = when (currentSection) {
                        LibraryManagerSection.Ingredients -> ingredientQuery
                        LibraryManagerSection.Tags -> tagQuery
                    },
                    onValueChange = { value ->
                        when (currentSection) {
                            LibraryManagerSection.Ingredients -> ingredientQuery = value
                            LibraryManagerSection.Tags -> tagQuery = value
                        }
                    },
                    label = when (currentSection) {
                        LibraryManagerSection.Ingredients -> localizedString(R.string.search_ingredients_label, language)
                        LibraryManagerSection.Tags -> localizedString(R.string.search_tags_label, language)
                    },
                    placeholder = when (currentSection) {
                        LibraryManagerSection.Ingredients -> localizedString(R.string.search_ingredients_placeholder, language)
                        LibraryManagerSection.Tags -> localizedString(R.string.search_tags_placeholder, language)
                    }
                )
            }
        }
    ) { innerPadding ->
        when (currentSection) {
            LibraryManagerSection.Ingredients -> IngredientManagerView(
                language = language,
                ingredients = filteredIngredients,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                onOpen = { selectedIngredient = it }
            )

            LibraryManagerSection.Tags -> TagManagerView(
                language = language,
                tags = filteredTags,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                onEdit = { editingTag = it }
            )
        }
    }

    if (showNewIngredientDialog) {
        IngredientReferenceEditorDialog(
            language = language,
            initial = null,
            onDismiss = { showNewIngredientDialog = false },
            onSave = {
                onCreateIngredient(it)
                showNewIngredientDialog = false
            }
        )
    }

    selectedIngredient?.let { ingredient ->
        IngredientReferenceDetailDialog(
            language = language,
            ingredient = ingredient,
            ingredientReferences = ingredientReferences,
            dishTypeTags = dishTypeTags,
            substitutions = ingredientSubstitutions.filter { it.fromIngredientRefId == ingredient.id },
            onDismiss = { selectedIngredient = null },
            onEdit = {
                selectedIngredient = null
                editingIngredient = ingredient
            },
            onAddSubstitution = {
                selectedIngredient = null
                substitutionEditorIngredient = ingredient
                editingSubstitution = null
            },
            onEditSubstitution = { substitution ->
                selectedIngredient = null
                substitutionEditorIngredient = ingredient
                editingSubstitution = substitution
            }
        )
    }

    editingIngredient?.let { ingredient ->
        IngredientReferenceEditorDialog(
            language = language,
            initial = ingredient,
            onDismiss = { editingIngredient = null },
            onSave = {
                onUpdateIngredient(ingredient.id, it)
                editingIngredient = null
            }
        )
    }

    substitutionEditorIngredient?.let { ingredient ->
        IngredientSubstitutionEditorDialog(
            language = language,
            sourceIngredient = ingredient,
            ingredientReferences = ingredientReferences,
            dishTypeTags = dishTypeTags,
            initial = editingSubstitution,
            onDismiss = {
                substitutionEditorIngredient = null
                editingSubstitution = null
                selectedIngredient = ingredient
            },
            onSave = { draft ->
                val existing = editingSubstitution
                if (existing == null) {
                    onCreateIngredientSubstitution(draft)
                } else {
                    onUpdateIngredientSubstitution(existing.id, draft)
                }
                substitutionEditorIngredient = null
                editingSubstitution = null
                selectedIngredient = ingredient
            },
            onDelete = editingSubstitution?.let { substitution ->
                {
                    onDeleteIngredientSubstitution(substitution.id)
                    substitutionEditorIngredient = null
                    editingSubstitution = null
                    selectedIngredient = ingredient
                }
            }
        )
    }

    if (showNewTagDialog) {
        TagEditorDialog(
            language = language,
            initial = null,
            onDismiss = { showNewTagDialog = false },
            onSave = {
                onCreateTag(it)
                showNewTagDialog = false
            }
        )
    }

    editingTag?.let { tag ->
        TagEditorDialog(
            language = language,
            initial = tag,
            onDismiss = { editingTag = null },
            onSave = {
                onUpdateTag(tag.id, it)
                editingTag = null
            }
        )
    }
}

@Composable
private fun IngredientManagerView(
    language: AppLanguage,
    ingredients: List<IngredientReference>,
    onOpen: (IngredientReference) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        if (ingredients.isEmpty()) {
            item {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = localizedString(R.string.no_ingredient_references_label, language),
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        } else {
            items(ingredients, key = { it.id }) { ingredient ->
                IngredientReferenceRow(
                    ingredient = ingredient,
                    language = language,
                    onOpen = { onOpen(ingredient) }
                )
            }
        }
    }
}

@Composable
private fun TagManagerView(
    language: AppLanguage,
    tags: List<Tag>,
    onEdit: (Tag) -> Unit,
    modifier: Modifier = Modifier
) {
    val groupedTags = remember(tags, language) {
        groupTagsForDisplay(tags = tags, language = language)
    }

    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        if (tags.isEmpty()) {
            item {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = localizedString(R.string.no_tag_references_label, language),
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        } else {
            for (section in groupedTags) {
                item(key = "managed-tag-category-${section.category.name}") {
                    Text(
                        text = section.category.localizedName(language),
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 3.dp)
                    )
                }
                items(section.tags, key = { it.id }) { tag ->
                    TagRow(tag = tag, language = language, onEdit = { onEdit(tag) })
                }
            }
        }
    }
}

@Composable
private fun IngredientReferenceRow(
    ingredient: IngredientReference,
    language: AppLanguage,
    onOpen: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onOpen)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                Text(
                    text = ingredient.localizedName(language),
                    style = MaterialTheme.typography.titleMedium
                )
                ingredient.secondaryLocalizedName(language)?.let { secondaryName ->
                    Text(
                        text = secondaryName,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun TagRow(
    tag: Tag,
    language: AppLanguage,
    onEdit: () -> Unit
) {
    Text(
        text = tag.localizedName(language),
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = {},
                onLongClick = onEdit
            )
            .padding(vertical = 1.dp)
    )
}

@Composable
private fun IngredientReferenceDetailDialog(
    language: AppLanguage,
    ingredient: IngredientReference,
    ingredientReferences: List<IngredientReference>,
    dishTypeTags: List<Tag>,
    substitutions: List<ContextualSubstitutionRule>,
    onDismiss: () -> Unit,
    onEdit: () -> Unit,
    onAddSubstitution: () -> Unit,
    onEditSubstitution: (ContextualSubstitutionRule) -> Unit
) {
    val ingredientReferenceMap = remember(ingredientReferences) {
        ingredientReferences.associateBy(IngredientReference::id)
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        shape = PopupShape,
        confirmButton = {
            TextButton(onClick = onEdit) {
                Text(localizedString(R.string.edit_ingredient_reference_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.close_label, language))
            }
        },
        title = { Text(ingredient.localizedName(language)) },
        text = {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                IngredientReferenceDetailSection(
                    label = localizedString(R.string.ingredient_name_fr_label, language),
                    value = ingredient.nameFr
                )
                IngredientReferenceDetailSection(
                    label = localizedString(R.string.ingredient_name_en_label, language),
                    value = ingredient.nameEn
                )
                ingredient.defaultDensity?.let { density ->
                    IngredientReferenceDetailSection(
                        label = localizedString(R.string.ingredient_density_label, language),
                        value = localizedString(R.string.ingredient_density_value_label, language, formatNumber(density))
                    )
                }
                if (ingredient.unitMappings.isNotEmpty()) {
                    IngredientReferenceDetailSection(
                        label = localizedString(R.string.unit_conversions_label, language),
                        values = ingredient.unitMappings.map { mapping ->
                            localizedString(
                                R.string.ingredient_conversion_value_label,
                                language,
                                mapping.fromUnit,
                                mapping.toUnit,
                                formatNumber(mapping.factor)
                            )
                        }
                    )
                }
                if (ingredient.aliasesFr.isNotEmpty()) {
                    IngredientReferenceDetailSection(
                        label = localizedString(R.string.ingredient_aliases_fr_label, language),
                        values = ingredient.aliasesFr
                    )
                }
                if (ingredient.aliasesEn.isNotEmpty()) {
                    IngredientReferenceDetailSection(
                        label = localizedString(R.string.ingredient_aliases_en_label, language),
                        values = ingredient.aliasesEn
                    )
                }
                IngredientSubstitutionSection(
                    language = language,
                    substitutions = substitutions,
                    ingredientReferenceMap = ingredientReferenceMap,
                    dishTypeTags = dishTypeTags,
                    onAddSubstitution = onAddSubstitution,
                    onEditSubstitution = onEditSubstitution
                )
            }
        }
    )
}

@Composable
private fun IngredientSubstitutionSection(
    language: AppLanguage,
    substitutions: List<ContextualSubstitutionRule>,
    ingredientReferenceMap: Map<String, IngredientReference>,
    dishTypeTags: List<Tag>,
    onAddSubstitution: () -> Unit,
    onEditSubstitution: (ContextualSubstitutionRule) -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = localizedString(R.string.ingredient_substitutions_section_label, language),
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            TextButton(onClick = onAddSubstitution) {
                Text(localizedString(R.string.add_ingredient_substitution_label, language))
            }
        }

        if (substitutions.isEmpty()) {
            Text(
                text = localizedString(R.string.ingredient_substitution_unavailable_label, language),
                style = MaterialTheme.typography.bodyMedium
            )
        } else {
            substitutions
                .sortedBy { ingredientReferenceMap[it.toIngredientRefId]?.nameEn ?: it.toIngredientRefId }
                .forEach { substitution ->
                    val targetIngredient = ingredientReferenceMap[substitution.toIngredientRefId]
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onEditSubstitution(substitution) }
                    ) {
                        Column(
                            modifier = Modifier.padding(8.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = targetIngredient?.localizedName(language)
                                    ?: substitution.toIngredientRefId,
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = localizedString(
                                    riskLevelLabelResId(substitution.riskLevel),
                                    language
                                ),
                                style = MaterialTheme.typography.bodySmall,
                                color = riskLevelColor(substitution.riskLevel)
                            )
                            Text(
                                text = localizedString(
                                    R.string.ingredient_substitution_ratio_value_label,
                                    language,
                                    formatNumber(substitution.ratio ?: 1.0)
                                ),
                                style = MaterialTheme.typography.bodySmall
                            )
                            substitution.localizedNotes(language)?.let { notes ->
                                Text(
                                    text = notes,
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                            substitution.allowedDishTypes
                                .takeIf(List<String>::isNotEmpty)
                                ?.let { dishTypes ->
                                    Text(
                                        text = localizedString(
                                            R.string.ingredient_substitution_scope_value_label,
                                            language,
                                            localizedDishTypeLabels(dishTypes, dishTypeTags, language)
                                        ),
                                        style = MaterialTheme.typography.bodySmall
                                    )
                                }
                            substitution.localizedWarning(language)?.let { warning ->
                                Text(
                                    text = localizedString(
                                        R.string.ingredient_substitution_warning_value_label,
                                        language,
                                        warning
                                    ),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.error
                                )
                            }
                        }
                    }
                }
        }
    }
}

@Composable
private fun IngredientReferenceDetailSection(
    label: String,
    value: String? = null,
    values: List<String> = emptyList()
) {
    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        value?.let {
            Text(text = it, style = MaterialTheme.typography.bodyMedium)
        }
        values.forEach { item ->
            Text(text = item, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Composable
private fun IngredientReferenceEditorDialog(
    language: AppLanguage,
    initial: IngredientReference?,
    onDismiss: () -> Unit,
    onSave: (IngredientReferenceDraft) -> Unit
) {
    IngredientDraftDialog(
        language = language,
        title = if (initial == null) {
            localizedString(R.string.create_ingredient_label, language)
        } else {
            localizedString(R.string.edit_ingredient_reference_label, language)
        },
        initialNameFr = initial?.nameFr.orEmpty(),
        initialNameEn = initial?.nameEn.orEmpty(),
        initialAliasesFr = formatAliasList(initial?.aliasesFr.orEmpty()),
        initialAliasesEn = formatAliasList(initial?.aliasesEn.orEmpty()),
        initialDensity = initial?.defaultDensity?.let(::formatNumber).orEmpty(),
        initialMappings = initial?.unitMappings
            ?.map { DraftUnitMappingRow(it.fromUnit, it.toUnit, formatNumber(it.factor)) }
            .orEmpty()
            .ifEmpty { listOf(DraftUnitMappingRow()) },
        onDismiss = onDismiss,
        onConfirm = onSave
    )
}

@Composable
private fun IngredientSubstitutionEditorDialog(
    language: AppLanguage,
    sourceIngredient: IngredientReference,
    ingredientReferences: List<IngredientReference>,
    dishTypeTags: List<Tag>,
    initial: ContextualSubstitutionRule?,
    onDismiss: () -> Unit,
    onSave: (IngredientSubstitutionDraft) -> Unit,
    onDelete: (() -> Unit)?
) {
    val initialTarget = ingredientReferences.firstOrNull { it.id == initial?.toIngredientRefId }
    var targetSearch by rememberSaveable(sourceIngredient.id, initial?.id) {
        mutableStateOf(initialTarget?.localizedName(language).orEmpty())
    }
    var selectedTargetId by rememberSaveable(sourceIngredient.id, initial?.id) {
        mutableStateOf(initial?.toIngredientRefId.orEmpty())
    }
    var ratioText by rememberSaveable(sourceIngredient.id, initial?.id) {
        mutableStateOf(initial?.ratio?.let(::formatNumber).orEmpty())
    }
    var riskLevel by rememberSaveable(sourceIngredient.id, initial?.id) {
        mutableStateOf(initial?.riskLevel ?: SubstitutionRiskLevel.SAFE)
    }
    var notesFr by rememberSaveable(sourceIngredient.id, initial?.id) {
        mutableStateOf(initial?.notesFr.orEmpty())
    }
    var notesEn by rememberSaveable(sourceIngredient.id, initial?.id) {
        mutableStateOf(initial?.notesEn.orEmpty())
    }
    var warningTextFr by rememberSaveable(sourceIngredient.id, initial?.id) {
        mutableStateOf(initial?.warningTextFr.orEmpty())
    }
    var warningTextEn by rememberSaveable(sourceIngredient.id, initial?.id) {
        mutableStateOf(initial?.warningTextEn.orEmpty())
    }
    val selectedDishTypes = remember(sourceIngredient.id, initial?.id) {
        mutableStateListOf<String>().apply { addAll(initial?.allowedDishTypes.orEmpty()) }
    }
    var validationError by remember { mutableStateOf<IngredientSubstitutionValidationError?>(null) }

    val selectedTarget = remember(selectedTargetId, ingredientReferences) {
        ingredientReferences.firstOrNull { it.id == selectedTargetId }
    }
    val targetMatches = remember(sourceIngredient.id, ingredientReferences, targetSearch) {
        availableIngredientSubstitutionTargets(
            ingredientReferences = ingredientReferences,
            sourceIngredientRefId = sourceIngredient.id,
            query = targetSearch
        ).take(8)
    }

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
                    Text(
                        text = if (initial == null) {
                            localizedString(
                                R.string.add_ingredient_substitution_dialog_title,
                                language,
                                sourceIngredient.localizedName(language)
                            )
                        } else {
                            localizedString(
                                R.string.edit_ingredient_substitution_dialog_title,
                                language,
                                sourceIngredient.localizedName(language)
                            )
                        },
                        style = MaterialTheme.typography.titleLarge
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(max = 560.dp)
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        IngredientReferenceDetailSection(
                            label = localizedString(R.string.ingredient_substitution_source_label, language),
                            value = sourceIngredient.localizedName(language)
                        )
                        selectedTarget?.let { target ->
                            IngredientReferenceDetailSection(
                                label = localizedString(R.string.ingredient_substitution_target_selected_label, language),
                                value = target.localizedName(language)
                            )
                        }
                        OutlinedTextField(
                            value = targetSearch,
                            onValueChange = {
                                targetSearch = it
                                validationError = null
                            },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.ingredient_substitution_target_label, language)) }
                        )
                        if (targetMatches.isEmpty()) {
                            Text(
                                text = localizedString(R.string.no_ingredient_references_label, language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        } else {
                            targetMatches.forEach { target ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("ingredient-substitution-target-${target.id}")
                                        .clickable {
                                            selectedTargetId = target.id
                                            targetSearch = target.localizedName(language)
                                            validationError = null
                                        }
                                ) {
                                    Column(
                                        modifier = Modifier.padding(8.dp),
                                        verticalArrangement = Arrangement.spacedBy(2.dp)
                                    ) {
                                        Text(
                                            text = target.localizedName(language),
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = if (selectedTargetId == target.id) FontWeight.SemiBold else FontWeight.Normal
                                        )
                                        target.secondaryLocalizedName(language)?.let { secondaryName ->
                                            Text(
                                                text = secondaryName,
                                                style = MaterialTheme.typography.bodySmall,
                                                color = MaterialTheme.colorScheme.onSurfaceVariant
                                            )
                                        }
                                    }
                                }
                            }
                        }
                        OutlinedTextField(
                            value = ratioText,
                            onValueChange = {
                                ratioText = it
                                validationError = null
                            },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.ingredient_substitution_ratio_label, language)) }
                        )
                        Text(
                            text = localizedString(R.string.ingredient_substitution_risk_label, language),
                            style = MaterialTheme.typography.titleSmall
                        )
                        SubstitutionRiskLevel.entries.forEach { level ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        riskLevel = level
                                        validationError = null
                                    }
                                    .padding(vertical = 2.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Checkbox(
                                    checked = riskLevel == level,
                                    onCheckedChange = {
                                        riskLevel = level
                                        validationError = null
                                    }
                                )
                                Text(text = localizedString(riskLevelLabelResId(level), language))
                            }
                        }
                        Text(
                            text = localizedString(R.string.ingredient_substitution_scope_label, language),
                            style = MaterialTheme.typography.titleSmall
                        )
                        if (dishTypeTags.isEmpty()) {
                            Text(
                                text = localizedString(R.string.ingredient_substitution_no_dish_types_label, language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        } else {
                            dishTypeTags.forEach { tag ->
                                val ruleKey = tag.normalizedRuleKey()
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            if (ruleKey in selectedDishTypes) {
                                                selectedDishTypes.remove(ruleKey)
                                            } else {
                                                selectedDishTypes.add(ruleKey)
                                            }
                                        }
                                        .padding(vertical = 2.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Checkbox(
                                        checked = ruleKey in selectedDishTypes,
                                        onCheckedChange = { checked ->
                                            if (checked) {
                                                if (ruleKey !in selectedDishTypes) selectedDishTypes.add(ruleKey)
                                            } else {
                                                selectedDishTypes.remove(ruleKey)
                                            }
                                        }
                                    )
                                    Text(text = tag.localizedName(language))
                                }
                            }
                        }
                        OutlinedTextField(
                            value = notesFr,
                            onValueChange = { notesFr = it },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.ingredient_substitution_notes_fr_label, language)) },
                            minLines = 2
                        )
                        OutlinedTextField(
                            value = notesEn,
                            onValueChange = { notesEn = it },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.ingredient_substitution_notes_en_label, language)) },
                            minLines = 2
                        )
                        OutlinedTextField(
                            value = warningTextFr,
                            onValueChange = {
                                warningTextFr = it
                                validationError = null
                            },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.ingredient_substitution_warning_fr_label, language)) },
                            minLines = 2
                        )
                        OutlinedTextField(
                            value = warningTextEn,
                            onValueChange = {
                                warningTextEn = it
                                validationError = null
                            },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.ingredient_substitution_warning_en_label, language)) },
                            minLines = 2
                        )
                        validationError?.let { error ->
                            Text(
                                text = localizedString(error.messageResId, language),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.error
                            )
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        onDelete?.let {
                            TextButton(onClick = it) {
                                Text(localizedString(R.string.delete_ingredient_substitution_label, language))
                            }
                        }
                        TextButton(onClick = onDismiss) {
                            Text(localizedString(R.string.cancel_label, language))
                        }
                        TextButton(
                            onClick = {
                                val error = validateIngredientSubstitutionDraft(
                                    targetIngredientRefId = selectedTarget?.id,
                                    ratioText = ratioText,
                                    riskLevel = riskLevel,
                                    warningTextFr = warningTextFr,
                                    warningTextEn = warningTextEn
                                )
                                if (error != null) {
                                    validationError = error
                                } else {
                                    onSave(
                                        IngredientSubstitutionDraft(
                                            fromIngredientRefId = sourceIngredient.id,
                                            toIngredientRefId = checkNotNull(selectedTarget?.id),
                                            ratio = ratioText.trim().toDouble(),
                                            riskLevel = riskLevel,
                                            notesFr = notesFr,
                                            notesEn = notesEn,
                                            warningTextFr = warningTextFr,
                                            warningTextEn = warningTextEn,
                                            allowedDishTypes = selectedDishTypes.toList()
                                        )
                                    )
                                }
                            }
                        ) {
                            Text(localizedString(R.string.save_label, language))
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun TagEditorDialog(
    language: AppLanguage,
    initial: Tag?,
    onDismiss: () -> Unit,
    onSave: (TagDraft) -> Unit
) {
    TagDraftDialog(
        language = language,
        title = if (initial == null) {
            localizedString(R.string.create_tag_label, language)
        } else {
            localizedString(R.string.edit_tag_reference_label, language)
        },
        initialNameFr = initial?.nameFr.orEmpty(),
        initialNameEn = initial?.nameEn.orEmpty(),
        onDismiss = onDismiss,
        onConfirm = onSave
    )
}

private fun IngredientReference.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

internal fun IngredientReference.secondaryLocalizedName(language: AppLanguage): String? {
    val secondary = when (language) {
        AppLanguage.FR -> nameEn.trim()
        AppLanguage.EN -> nameFr.trim()
    }
    if (secondary.isEmpty()) return null
    return secondary.takeUnless { it.equals(localizedName(language), ignoreCase = true) }
}

internal fun filterManagedIngredientReferences(
    ingredientReferences: List<IngredientReference>,
    query: String
): List<IngredientReference> {
    val trimmedQuery = query.trim()
    if (trimmedQuery.isEmpty()) return ingredientReferences
    return ingredientReferences.filter { ingredient ->
        listOf(
            ingredient.nameFr,
            ingredient.nameEn,
            ingredient.aliasesFr.joinToString(" "),
            ingredient.aliasesEn.joinToString(" ")
        ).any { it.contains(trimmedQuery, ignoreCase = true) }
    }
}

internal fun availableIngredientSubstitutionTargets(
    ingredientReferences: List<IngredientReference>,
    sourceIngredientRefId: String,
    query: String
): List<IngredientReference> = filterManagedIngredientReferences(
    ingredientReferences = ingredientReferences.filterNot { it.id == sourceIngredientRefId },
    query = query
).sortedBy { it.nameEn.lowercase() }

internal enum class IngredientSubstitutionValidationError(val messageResId: Int) {
    MissingTarget(R.string.ingredient_substitution_validation_target_label),
    InvalidRatio(R.string.ingredient_substitution_validation_ratio_label),
    MissingWarningFr(R.string.ingredient_substitution_validation_warning_fr_label),
    MissingWarningEn(R.string.ingredient_substitution_validation_warning_en_label)
}

internal fun validateIngredientSubstitutionDraft(
    targetIngredientRefId: String?,
    ratioText: String,
    riskLevel: SubstitutionRiskLevel,
    warningTextFr: String,
    warningTextEn: String
): IngredientSubstitutionValidationError? {
    if (targetIngredientRefId.isNullOrBlank()) {
        return IngredientSubstitutionValidationError.MissingTarget
    }
    val parsedRatio = ratioText.trim().toDoubleOrNull()
    if (parsedRatio == null || parsedRatio <= 0.0) {
        return IngredientSubstitutionValidationError.InvalidRatio
    }
    if (riskLevel == SubstitutionRiskLevel.HIGH_RISK && warningTextFr.isBlank()) {
        return IngredientSubstitutionValidationError.MissingWarningFr
    }
    if (riskLevel == SubstitutionRiskLevel.HIGH_RISK && warningTextEn.isBlank()) {
        return IngredientSubstitutionValidationError.MissingWarningEn
    }
    return null
}

private fun ContextualSubstitutionRule.localizedNotes(language: AppLanguage): String? = when (language) {
    AppLanguage.FR -> notesFr
    AppLanguage.EN -> notesEn
}?.trim()?.ifEmpty { null }

private fun ContextualSubstitutionRule.localizedWarning(language: AppLanguage): String? = when (language) {
    AppLanguage.FR -> warningTextFr
    AppLanguage.EN -> warningTextEn
}?.trim()?.ifEmpty { null }

private fun riskLevelLabelResId(riskLevel: SubstitutionRiskLevel): Int = when (riskLevel) {
    SubstitutionRiskLevel.SAFE -> R.string.ingredient_substitution_risk_safe_label
    SubstitutionRiskLevel.CAUTION -> R.string.ingredient_substitution_risk_caution_label
    SubstitutionRiskLevel.HIGH_RISK -> R.string.ingredient_substitution_risk_high_label
}

@Composable
private fun riskLevelColor(riskLevel: SubstitutionRiskLevel): Color = when (riskLevel) {
    SubstitutionRiskLevel.SAFE -> MaterialTheme.colorScheme.primary
    SubstitutionRiskLevel.CAUTION -> MaterialTheme.colorScheme.tertiary
    SubstitutionRiskLevel.HIGH_RISK -> MaterialTheme.colorScheme.error
}

private fun Tag.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

private fun localizedDishTypeLabels(
    allowedDishTypes: List<String>,
    dishTypeTags: List<Tag>,
    language: AppLanguage
): String {
    val availableTags = dishTypeTags.associateBy { it.normalizedRuleKey() }
    return allowedDishTypes.joinToString(", ") { ruleKey ->
        availableTags[ruleKey.normalizedRuleKey()]?.localizedName(language) ?: ruleKey
    }
}

private fun Tag.normalizedRuleKey(): String = slug.ifBlank { nameEn }.normalizedRuleKey()

private fun String.normalizedRuleKey(): String = trim().lowercase().replace(' ', '_')
