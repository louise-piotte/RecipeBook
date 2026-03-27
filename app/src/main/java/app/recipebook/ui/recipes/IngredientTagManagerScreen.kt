package app.recipebook.ui.recipes

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Tag

@Composable
fun IngredientTagManagerScreen(
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    initialSection: LibraryManagerSection,
    onNavigateToLibrary: () -> Unit,
    onCreateIngredient: (IngredientReferenceDraft) -> Unit,
    onUpdateIngredient: (String, IngredientReferenceDraft) -> Unit,
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

    val filteredIngredients = remember(ingredientReferences, ingredientQuery) {
        filterManagedIngredientReferences(ingredientReferences, ingredientQuery)
    }
    val filteredTags = remember(tags, tagQuery) {
        filterTags(tags, tagQuery)
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
            onDismiss = { selectedIngredient = null },
            onEdit = {
                selectedIngredient = null
                editingIngredient = ingredient
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
    onDismiss: () -> Unit,
    onEdit: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
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
            }
        }
    )
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

private fun Tag.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}















