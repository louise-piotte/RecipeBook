package app.recipebook.ui.recipes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.data.local.recipes.CollectionDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.Recipe

@Composable
fun CollectionManagerScreen(
    collections: List<Collection>,
    recipes: List<Recipe>,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    onNavigateToLibrary: (String?) -> Unit,
    onNavigateToIngredients: () -> Unit,
    onNavigateToTags: () -> Unit,
    onNavigateToSettings: () -> Unit,
    onCreateCollection: (CollectionDraft) -> Unit,
    onUpdateCollection: (String, CollectionDraft) -> Unit,
    onDeleteCollection: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var showCreateDialog by remember { mutableStateOf(false) }
    var editMode by rememberSaveable { mutableStateOf(false) }
    var editingCollection by remember { mutableStateOf<Collection?>(null) }
    var deletingCollection by remember { mutableStateOf<Collection?>(null) }
    val counts = remember(recipes, collections) {
        collectionRecipeCounts(recipes, collections)
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            RecipeBookTopBar(
                title = localizedString(R.string.manage_collections_label, language),
                language = language,
                onLanguageChange = onLanguageChange,
                onNavigate = { destination ->
                    when (destination) {
                        MainMenuDestination.Library -> onNavigateToLibrary(null)
                        MainMenuDestination.Import -> Unit
                        MainMenuDestination.ExportRecipes -> Unit
                        MainMenuDestination.Collections -> Unit
                        MainMenuDestination.Ingredients -> onNavigateToIngredients()
                        MainMenuDestination.Tags -> onNavigateToTags()
                        MainMenuDestination.Settings -> onNavigateToSettings()
                    }
                },
                disabledDestinations = setOf(MainMenuDestination.Collections),
                actions = {
                    AppIconButton(
                        icon = Icons.Filled.Add,
                        contentDescription = localizedString(R.string.create_collection_label, language),
                        onClick = { showCreateDialog = true }
                    )
                    AppIconButton(
                        icon = Icons.Filled.Edit,
                        contentDescription = localizedString(R.string.edit_collections_label, language),
                        onClick = { editMode = !editMode }
                    )
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            if (collections.isEmpty()) {
                item {
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = localizedString(R.string.no_collections_available_label, language),
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            } else {
                items(
                    items = collections.sortedBy { it.displayName(language) },
                    key = { it.id }
                ) { collection ->
                    CollectionManagerRow(
                        collection = collection,
                        count = counts[collection.id] ?: 0,
                        language = language,
                        editMode = editMode,
                        onOpen = {
                            if (!editMode) {
                                onNavigateToLibrary(collection.id)
                            }
                        },
                        onRename = { editingCollection = collection },
                        onDelete = { deletingCollection = collection }
                    )
                }
            }
        }
    }

    if (showCreateDialog) {
        CollectionEditorDialog(
            language = language,
            title = localizedString(R.string.create_collection_label, language),
            initial = null,
            onDismiss = { showCreateDialog = false },
            onSave = { draft ->
                onCreateCollection(draft)
                showCreateDialog = false
            }
        )
    }

    editingCollection?.let { collection ->
        CollectionEditorDialog(
            language = language,
            title = localizedString(R.string.rename_collection_label, language),
            initial = collection,
            onDismiss = { editingCollection = null },
            onSave = { draft ->
                onUpdateCollection(collection.id, draft)
                editingCollection = null
            }
        )
    }

    deletingCollection?.let { collection ->
        AlertDialog(
            onDismissRequest = { deletingCollection = null },
            shape = app.recipebook.ui.theme.PopupShape,
            title = {
                Text(localizedString(R.string.delete_collection_label, language))
            },
            text = {
                Text(
                    localizedString(
                        R.string.delete_collection_confirmation_label,
                        language,
                        collection.displayName(language)
                    )
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onDeleteCollection(collection.id)
                        deletingCollection = null
                    }
                ) {
                    Text(localizedString(R.string.delete_collection_label, language))
                }
            },
            dismissButton = {
                TextButton(onClick = { deletingCollection = null }) {
                    Text(localizedString(R.string.cancel_label, language))
                }
            }
        )
    }
}

@Composable
private fun CollectionManagerRow(
    collection: Collection,
    count: Int,
    language: AppLanguage,
    editMode: Boolean,
    onOpen: () -> Unit,
    onRename: () -> Unit,
    onDelete: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onOpen)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(0.75f),
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Text(
                    text = collection.displayName(language),
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = localizedString(R.string.collection_recipe_count_label, language, count),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            if (editMode) {
                Row {
                    AppIconButton(
                        icon = Icons.Filled.Edit,
                        contentDescription = localizedString(R.string.rename_collection_label, language),
                        onClick = onRename
                    )
                    AppIconButton(
                        icon = Icons.Filled.Delete,
                        contentDescription = localizedString(R.string.delete_collection_label, language),
                        onClick = onDelete
                    )
                }
            }
        }
    }
}

@Composable
private fun CollectionEditorDialog(
    language: AppLanguage,
    title: String,
    initial: Collection?,
    onDismiss: () -> Unit,
    onSave: (CollectionDraft) -> Unit
) {
    var nameFr by rememberSaveable(initial?.id) { mutableStateOf(initial?.nameFr.orEmpty()) }
    var nameEn by rememberSaveable(initial?.id) { mutableStateOf(initial?.nameEn.orEmpty()) }

    AlertDialog(
        onDismissRequest = onDismiss,
        shape = app.recipebook.ui.theme.PopupShape,
        title = { Text(title) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(
                    value = nameFr,
                    onValueChange = { nameFr = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(localizedString(R.string.collection_name_fr_label, language)) },
                    singleLine = true
                )
                OutlinedTextField(
                    value = nameEn,
                    onValueChange = { nameEn = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(localizedString(R.string.collection_name_en_label, language)) },
                    singleLine = true
                )
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onSave(
                        CollectionDraft(
                            nameFr = nameFr,
                            nameEn = nameEn
                        )
                    )
                },
                enabled = nameFr.isNotBlank() || nameEn.isNotBlank()
            ) {
                Text(localizedString(R.string.save_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.cancel_label, language))
            }
        }
    )
}

private fun Collection.displayName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}
