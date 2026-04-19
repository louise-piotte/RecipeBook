package app.recipebook.ui.recipes

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Button
import androidx.compose.material3.TextButton
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import app.recipebook.AiSettingsActivity
import app.recipebook.IngredientTagManagerActivity
import app.recipebook.R
import app.recipebook.CollectionManagerActivity
import app.recipebook.RecipeDetailActivity
import app.recipebook.RecipeEditorActivity
import app.recipebook.data.local.recipes.RecipeAiRuntime
import app.recipebook.data.local.recipes.RecipeLibraryExporter
import app.recipebook.data.local.recipes.RecipeLibrarySyncCoordinator
import app.recipebook.data.local.recipes.RecipeRepository
import app.recipebook.domain.localization.BilingualText
import app.recipebook.domain.localization.BilingualTextResolver
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.Tag
import app.recipebook.ui.theme.PopupShape
import java.util.Locale
import java.io.File
import kotlinx.coroutines.launch

@Composable
fun RecipeLibraryScreen(
    repository: RecipeRepository,
    syncCoordinator: RecipeLibrarySyncCoordinator,
    language: AppLanguage,
    initialSelectedCollectionId: String? = null,
    onLanguageChange: (AppLanguage) -> Unit,
    modifier: Modifier = Modifier
) {
    var searchQuery by rememberSaveable { mutableStateOf("") }
    var selectedTagIds by rememberSaveable { mutableStateOf(emptyList<String>()) }
    var selectedCollectionId by rememberSaveable { mutableStateOf(initialSelectedCollectionId) }
    var showTagFilterDialog by rememberSaveable { mutableStateOf(false) }
    var showAddRecipesToCollectionDialog by rememberSaveable { mutableStateOf(false) }
    var showImportDialog by rememberSaveable { mutableStateOf(false) }
    val recipes by repository.observeRecipes().collectAsState(initial = emptyList())
    val tags by repository.observeTags().collectAsState(initial = emptyList())
    val collections by repository.observeCollections().collectAsState(initial = emptyList())
    val resolver = remember { BilingualTextResolver() }
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val exporter = remember(context, repository) { RecipeLibraryExporter(context, repository) }
    var pendingExportFile by remember { mutableStateOf<File?>(null) }
    var exportInProgress by remember { mutableStateOf(false) }
    var driveSyncInProgress by remember { mutableStateOf(false) }
    val exportFailedLabel = localizedString(R.string.export_recipes_failed_label, language)
    val exportSuccessLabel = localizedString(R.string.export_recipes_success_label, language)
    val driveSetupSuccessLabel = localizedString(R.string.drive_backup_setup_success_label, language)
    val driveSetupFailedLabel = localizedString(R.string.drive_backup_setup_failed_label, language)
    val driveImportSuccessLabel = localizedString(R.string.drive_backup_import_success_label, language)
    val driveImportFailedLabel = localizedString(R.string.drive_backup_import_failed_label, language)
    val exportLauncher = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("application/zip")) { uri: Uri? ->
        val exportFile = pendingExportFile
        pendingExportFile = null
        if (uri == null) {
            exportFile?.delete()
            exportInProgress = false
            return@rememberLauncherForActivityResult
        }
        if (exportFile == null) {
            exportInProgress = false
            Toast.makeText(
                context,
                exportFailedLabel,
                Toast.LENGTH_SHORT
            ).show()
            return@rememberLauncherForActivityResult
        }
        exportInProgress = true
        scope.launch {
            runCatching {
                context.contentResolver.openOutputStream(uri).use { output ->
                    requireNotNull(output) { "Unable to open export destination" }
                    exportFile.inputStream().use { input -> input.copyTo(output) }
                }
            }.onSuccess {
                Toast.makeText(
                    context,
                    exportSuccessLabel,
                    Toast.LENGTH_SHORT
                ).show()
            }.onFailure {
                Toast.makeText(
                    context,
                    exportFailedLabel,
                    Toast.LENGTH_SHORT
                ).show()
            }
            exportFile.delete()
            exportInProgress = false
        }
    }
    val driveSetupLauncher = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("application/zip")) { uri: Uri? ->
        if (uri == null) {
            driveSyncInProgress = false
            return@rememberLauncherForActivityResult
        }
        driveSyncInProgress = true
        scope.launch {
            runCatching {
                syncCoordinator.configureDriveBackupDocument(uri)
            }.onSuccess {
                Toast.makeText(context, driveSetupSuccessLabel, Toast.LENGTH_SHORT).show()
            }.onFailure {
                Toast.makeText(context, driveSetupFailedLabel, Toast.LENGTH_SHORT).show()
            }
            driveSyncInProgress = false
        }
    }
    val driveImportLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
        if (uri == null) {
            driveSyncInProgress = false
            return@rememberLauncherForActivityResult
        }
        driveSyncInProgress = true
        scope.launch {
            runCatching {
                syncCoordinator.replaceLibraryFromDrive(uri)
            }.onSuccess {
                onLanguageChange(repository.getLibrarySettings().language)
                Toast.makeText(context, driveImportSuccessLabel, Toast.LENGTH_SHORT).show()
            }.onFailure {
                Toast.makeText(context, driveImportFailedLabel, Toast.LENGTH_SHORT).show()
            }
            driveSyncInProgress = false
        }
    }

    LaunchedEffect(initialSelectedCollectionId) {
        selectedCollectionId = initialSelectedCollectionId
    }

    LaunchedEffect(collections, selectedCollectionId) {
        if (selectedCollectionId != null && collections.none { it.id == selectedCollectionId }) {
            selectedCollectionId = null
        }
    }

    val filteredRecipes = remember(recipes, searchQuery, selectedTagIds, selectedCollectionId) {
        filterRecipes(
            recipes = recipes,
            searchQuery = searchQuery,
            selectedTagIds = selectedTagIds,
            selectedCollectionId = selectedCollectionId
        )
    }
    val selectedTagNames = remember(tags, selectedTagIds, language) {
        selectedTagIds.mapNotNull { selectedId ->
            tags.firstOrNull { tag -> tag.id == selectedId }?.displayName(language)
        }
    }
    val collectionCounts = remember(recipes, collections) {
        collectionRecipeCounts(recipes, collections)
    }
    val selectedCollection = remember(collections, selectedCollectionId) {
        collections.firstOrNull { it.id == selectedCollectionId }
    }
    val selectedCollectionTitle = remember(language, selectedCollection, collectionCounts, recipes.size) {
        buildSelectedCollectionLabel(
            language = language,
            selectedCollection = selectedCollection,
            collectionCounts = collectionCounts,
            totalRecipes = recipes.size
        )
    }
    val hasActiveFilters = searchQuery.isNotBlank() || selectedTagIds.isNotEmpty()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            RecipeBookTopBar(
                titleContent = {
                    CollectionDropdownTitle(
                        language = language,
                        label = selectedCollectionTitle,
                        collections = collections,
                        collectionCounts = collectionCounts,
                        totalRecipes = recipes.size,
                        onSelectCollection = { collectionId ->
                            selectedCollectionId = collectionId
                        }
                    )
                },
                language = language,
                onLanguageChange = onLanguageChange,
                additionalMenuDestinations = listOf(
                    MainMenuDestination.ExportRecipes,
                    MainMenuDestination.SetupDriveBackup,
                    MainMenuDestination.ImportDriveBackup
                ),
                onNavigate = { destination ->
                    when (destination) {
                        MainMenuDestination.Library -> Unit
                        MainMenuDestination.Ingredients -> {
                            context.startActivity(
                                IngredientTagManagerActivity.intentForSection(
                                    context = context,
                                    section = LibraryManagerSection.Ingredients
                                )
                            )
                        }
                        MainMenuDestination.Collections -> {
                            context.startActivity(
                                CollectionManagerActivity.intent(context)
                            )
                        }
                        MainMenuDestination.Import -> {
                            showImportDialog = true
                        }
                        MainMenuDestination.ExportRecipes -> {
                            if (exportInProgress) return@RecipeBookTopBar
                            exportInProgress = true
                            scope.launch {
                                runCatching {
                                    exporter.createRecipeArchive(language)
                                }.onSuccess { bundle ->
                                    pendingExportFile?.delete()
                                    pendingExportFile = bundle.archiveFile
                                    exportLauncher.launch(bundle.suggestedFileName)
                                }.onFailure {
                                    exportInProgress = false
                                    pendingExportFile?.delete()
                                    pendingExportFile = null
                                    Toast.makeText(
                                        context,
                                        exportFailedLabel,
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                        MainMenuDestination.SetupDriveBackup -> {
                            if (driveSyncInProgress) return@RecipeBookTopBar
                            driveSyncInProgress = true
                            driveSetupLauncher.launch("recipebook-library-backup.zip")
                        }
                        MainMenuDestination.ImportDriveBackup -> {
                            if (driveSyncInProgress) return@RecipeBookTopBar
                            driveSyncInProgress = true
                            scope.launch {
                                val usedConfiguredBackup = runCatching {
                                    if (syncCoordinator.hasConfiguredDriveBackup()) {
                                        syncCoordinator.replaceLibraryFromConfiguredDrive()
                                        true
                                    } else {
                                        false
                                    }
                                }.getOrElse {
                                    Toast.makeText(context, driveImportFailedLabel, Toast.LENGTH_SHORT).show()
                                    driveSyncInProgress = false
                                    return@launch
                                }
                                if (usedConfiguredBackup) {
                                    onLanguageChange(repository.getLibrarySettings().language)
                                    Toast.makeText(context, driveImportSuccessLabel, Toast.LENGTH_SHORT).show()
                                    driveSyncInProgress = false
                                } else {
                                    driveImportLauncher.launch(arrayOf("application/zip"))
                                }
                            }
                        }

                        MainMenuDestination.Tags -> {
                            context.startActivity(
                                IngredientTagManagerActivity.intentForSection(
                                    context = context,
                                    section = LibraryManagerSection.Tags
                                )
                            )
                        }
                        MainMenuDestination.Settings -> {
                            context.startActivity(AiSettingsActivity.intent(context))
                        }
                    }
                }
            ) {
                AppIconButton(
                    icon = Icons.Filled.FilterList,
                    contentDescription = localizedString(R.string.filter_tags_label, language),
                    onClick = { showTagFilterDialog = true }
                )
                AppIconButton(
                    icon = Icons.Filled.Add,
                    contentDescription = localizedString(R.string.add_recipe_label, language),
                    onClick = { context.startActivity(Intent(context, RecipeEditorActivity::class.java)) }
                )
            }
        },
        floatingActionButton = {
            if (selectedCollection != null) {
                SmallFloatingActionButton(
                    onClick = { showAddRecipesToCollectionDialog = true }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = localizedString(R.string.add_recipe_to_collection_label, language)
                    )
                }
            }
        },
        bottomBar = {
            BottomSearchBar {
                SearchField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    label = localizedString(R.string.search_label, language),
                    placeholder = localizedString(R.string.search_placeholder, language)
                )
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            if (selectedTagNames.isNotEmpty()) {
                item {
                    ActiveTagFiltersCard(
                        language = language,
                        selectedTagNames = selectedTagNames,
                        onClear = { selectedTagIds = emptyList() }
                    )
                }
            }
            if (filteredRecipes.isEmpty()) {
                item {
                    EmptyLibraryCard(language = language, hasActiveFilters = hasActiveFilters)
                }
            } else {
                items(filteredRecipes, key = { it.id }) { recipe ->
                    RecipeListCard(
                        recipe = recipe,
                        language = language,
                        resolver = resolver,
                        onClick = {
                            context.startActivity(
                                Intent(context, RecipeDetailActivity::class.java)
                                    .putExtra(RecipeDetailActivity.EXTRA_RECIPE_ID, recipe.id)
                            )
                        }
                    )
                }
            }
        }
    }

    if (showTagFilterDialog) {
        RecipeTagFilterDialog(
            language = language,
            tags = tags,
            selectedTagIds = selectedTagIds,
            onSelectedTagIdsChange = { selectedTagIds = it },
            onDismiss = { showTagFilterDialog = false }
        )
    }

    if (showAddRecipesToCollectionDialog && selectedCollection != null) {
        AddRecipesToCollectionDialog(
            language = language,
            collection = selectedCollection,
            recipes = recipes,
            onDismiss = { showAddRecipesToCollectionDialog = false },
            onAddRecipe = { recipe ->
                repository.upsertRecipe(
                    recipe.copy(collectionIds = (recipe.collectionIds + selectedCollection.id).distinct())
                )
            }
        )
    }

    if (showImportDialog) {
        RecipeImportDialog(
            language = language,
            onDismiss = { showImportDialog = false },
            onImport = { input ->
                val importer = RecipeAiRuntime.createSharedRecipeImporter(context)
                val draft = importer.import(input, activeLanguage = language)
                context.startActivity(
                    RecipeEditorActivity.intentForImportedDraft(
                        context = context,
                        draft = draft,
                        language = language
                    )
                )
            }
        )
    }
}

@Composable
internal fun SearchField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String? = null,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        label = { Text(label) },
        placeholder = placeholder?.let { { Text(it) } },
        leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
        singleLine = true,
        shape = RoundedCornerShape(18.dp)
    )
}

@Composable
internal fun BottomSearchBar(
    useNavigationBarPadding: Boolean = true,
    content: @Composable () -> Unit
) {
    Surface(tonalElevation = 3.dp) {
        val barModifier = if (useNavigationBarPadding) {
            Modifier.navigationBarsPadding()
        } else {
            Modifier
        }
        Column(
            modifier = barModifier
                .fillMaxWidth()
                .imePadding()
                .padding(horizontal = 4.dp, vertical = 4.dp)
        ) {
            content()
        }
    }
}

@Composable
private fun RecipeListCard(
    recipe: Recipe,
    language: AppLanguage,
    resolver: BilingualTextResolver,
    onClick: () -> Unit
) {
    val ratingDescription = recipe.ratings?.userRating?.let { rating ->
        localizedString(R.string.detail_rating_value, language, rating)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(68.dp)
            .clickable(onClick = onClick)
    ) {
        Surface(color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.45f)) {
            Row(modifier = Modifier.fillMaxSize()) {
                RecipePhoto(
                    localPath = recipe.mainPhoto()?.localPath,
                    contentDescription = localizedString(R.string.recipe_photo_label, language),
                    modifier = Modifier
                        .fillMaxHeight()
                        .aspectRatio(1f)
                )
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(horizontal = 8.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = resolver.resolveSystemText(language, recipe.titleText()),
                        style = MaterialTheme.typography.titleLarge,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                RecipeRatingStars(
                    rating = recipe.ratings?.userRating,
                    orientation = RecipeRatingOrientation.Vertical,
                    ratingDescription = ratingDescription,
                    modifier = Modifier
                        .padding(end = 8.dp, top = 4.dp, bottom = 4.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Composable
private fun EmptyLibraryCard(
    language: AppLanguage,
    hasActiveFilters: Boolean
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = localizedString(
                if (hasActiveFilters) R.string.empty_filtered_results else R.string.empty_results,
                language
            ),
            modifier = Modifier.padding(6.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
private fun ActiveTagFiltersCard(
    language: AppLanguage,
    selectedTagNames: List<String>,
    onClear: () -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = localizedString(
                    R.string.active_tag_filters_label,
                    language,
                    selectedTagNames.joinToString(", ")
                ),
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.bodyMedium
            )
            TextButton(onClick = onClear) {
                Text(localizedString(R.string.clear_filters_label, language))
            }
        }
    }
}

@Composable
private fun RecipeTagFilterDialog(
    language: AppLanguage,
    tags: List<Tag>,
    selectedTagIds: List<String>,
    onSelectedTagIdsChange: (List<String>) -> Unit,
    onDismiss: () -> Unit
) {
    var query by rememberSaveable { mutableStateOf("") }
    val filteredTags = remember(tags, query) {
        filterTags(tags, query)
    }
    val selectedTags = remember(filteredTags, selectedTagIds, language) {
        selectedTagsForFilterDialog(
            tags = filteredTags,
            selectedTagIds = selectedTagIds,
            language = language
        )
    }
    val groupedTags = remember(filteredTags, selectedTagIds, language) {
        groupTagsForDisplay(
            tags = filteredTags.filterNot { tag -> selectedTagIds.contains(tag.id) },
            language = language,
            selectedTagIds = emptySet()
        )
    }

    Dialog(onDismissRequest = onDismiss) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = PopupShape
        ) {
            Column(
                modifier = Modifier.padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = localizedString(R.string.filter_tags_label, language),
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.weight(1f)
                    )
                    if (selectedTagIds.isNotEmpty()) {
                        TextButton(onClick = { onSelectedTagIdsChange(emptyList()) }) {
                            Text(localizedString(R.string.clear_filters_label, language))
                        }
                    }
                }
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
                            .height(320.dp)
                            .padding(horizontal = 4.dp, vertical = 2.dp),
                        verticalArrangement = Arrangement.spacedBy(3.dp)
                    ) {
                        if (selectedTags.isEmpty() && groupedTags.isEmpty()) {
                            item {
                                Text(
                                    text = localizedString(R.string.no_tag_references_label, language),
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        } else {
                            if (selectedTags.isNotEmpty()) {
                                item(key = "recipe-library-tag-category-selected") {
                                    Text(
                                        text = localizedString(R.string.selected_tags_label, language),
                                        style = MaterialTheme.typography.titleSmall,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 2.dp)
                                    )
                                }
                                items(selectedTags, key = { "selected-${it.id}" }) { tag ->
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 1.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            text = tag.displayName(language),
                                            style = MaterialTheme.typography.bodyMedium,
                                            modifier = Modifier.weight(1f)
                                        )
                                        AppIconButton(
                                            icon = Icons.Filled.Delete,
                                            contentDescription = localizedString(R.string.remove_label, language),
                                            onClick = { onSelectedTagIdsChange(selectedTagIds - tag.id) }
                                        )
                                    }
                                }
                            }
                            for (section in groupedTags) {
                                item(key = "recipe-library-tag-category-${section.category.name}") {
                                    Text(
                                        text = section.category.localizedName(language),
                                        style = MaterialTheme.typography.titleSmall,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 2.dp)
                                    )
                                }
                                items(section.tags, key = { it.id }) { tag ->
                                    val isSelected = selectedTagIds.contains(tag.id)
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 1.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(
                                            text = tag.displayName(language),
                                            style = MaterialTheme.typography.bodyMedium,
                                            modifier = Modifier.weight(1f)
                                        )
                                        AppIconButton(
                                            icon = if (isSelected) Icons.Filled.Delete else Icons.Filled.Add,
                                            contentDescription = localizedString(
                                                if (isSelected) R.string.remove_label else R.string.add_tag_label,
                                                language
                                            ),
                                            onClick = {
                                                onSelectedTagIdsChange(
                                                    if (isSelected) {
                                                        selectedTagIds - tag.id
                                                    } else {
                                                        selectedTagIds + tag.id
                                                    }
                                                )
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onDismiss) {
                        Text(localizedString(R.string.close_label, language))
                    }
                }
            }
        }
    }
}

@Composable
private fun CollectionDropdownTitle(
    language: AppLanguage,
    label: String,
    collections: List<Collection>,
    collectionCounts: Map<String, Int>,
    totalRecipes: Int,
    onSelectCollection: (String?) -> Unit
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    Box {
        Row(
            modifier = Modifier.clickable(onClick = { expanded = true }),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = label, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Spacer(modifier = Modifier.width(4.dp))
            Icon(imageVector = Icons.Filled.ExpandMore, contentDescription = null)
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            shape = PopupShape
        ) {
            DropdownMenuItem(
                text = { Text(localizedString(R.string.all_recipes_count_label, language, totalRecipes)) },
                onClick = {
                    expanded = false
                    onSelectCollection(null)
                }
            )
            collections
                .sortedBy { it.displayName(language) }
                .forEach { collection ->
                    DropdownMenuItem(
                        text = {
                            Text(
                                localizedString(
                                    R.string.collection_name_with_count,
                                    language,
                                    collection.displayName(language),
                                    collectionCounts[collection.id] ?: 0
                                )
                            )
                        },
                        onClick = {
                            expanded = false
                            onSelectCollection(collection.id)
                        }
                    )
                }
        }
    }
}

@Composable
private fun AddRecipesToCollectionDialog(
    language: AppLanguage,
    collection: Collection,
    recipes: List<Recipe>,
    onDismiss: () -> Unit,
    onAddRecipe: suspend (Recipe) -> Unit
) {
    var query by rememberSaveable(collection.id) { mutableStateOf("") }
    val coroutineScope = rememberCoroutineScope()
    val candidateRecipes = remember(collection.id, recipes, query) {
        filterRecipesNotInCollection(
            recipes = recipes,
            collectionId = collection.id,
            query = query
        )
    }

    Dialog(onDismissRequest = onDismiss) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = PopupShape
        ) {
            Column(
                modifier = Modifier.padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = localizedString(
                        R.string.add_to_collection_dialog_title,
                        language,
                        collection.displayName(language)
                    ),
                    style = MaterialTheme.typography.titleLarge
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
                            .height(320.dp)
                            .padding(horizontal = 4.dp, vertical = 2.dp),
                        verticalArrangement = Arrangement.spacedBy(3.dp)
                    ) {
                        if (candidateRecipes.isEmpty()) {
                            item {
                                Text(
                                    text = localizedString(R.string.no_recipes_available_for_collection_label, language),
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        } else {
                            items(candidateRecipes, key = { it.id }) { recipe ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 1.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = resolverText(recipe, language),
                                        style = MaterialTheme.typography.bodyMedium,
                                        modifier = Modifier.weight(1f)
                                    )
                                    AppIconButton(
                                        icon = Icons.Filled.Add,
                                        contentDescription = localizedString(R.string.add_recipe_to_collection_label, language),
                                        onClick = {
                                            coroutineScope.launch {
                                                onAddRecipe(recipe)
                                            }
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onDismiss) {
                        Text(localizedString(R.string.close_label, language))
                    }
                }
            }
        }
    }
}

@Composable
private fun RecipeImportDialog(
    language: AppLanguage,
    onDismiss: () -> Unit,
    onImport: suspend (String) -> Unit
) {
    var input by rememberSaveable { mutableStateOf("") }
    var isImporting by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    Dialog(onDismissRequest = { if (!isImporting) onDismiss() }) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = PopupShape
        ) {
            Column(
                modifier = Modifier.padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = localizedString(R.string.import_recipe_label, language),
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = localizedString(R.string.import_recipe_help_label, language),
                    style = MaterialTheme.typography.bodyMedium
                )
                OutlinedTextField(
                    value = input,
                    onValueChange = { input = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp),
                    label = { Text(localizedString(R.string.import_recipe_input_label, language)) }
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(
                        enabled = !isImporting,
                        onClick = onDismiss
                    ) {
                        Text(localizedString(R.string.cancel_label, language))
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        enabled = input.isNotBlank() && !isImporting,
                        onClick = {
                            isImporting = true
                            coroutineScope.launch {
                                runCatching {
                                    onImport(input.trim())
                                }
                                isImporting = false
                                onDismiss()
                            }
                        }
                    ) {
                        Text(localizedString(R.string.import_action_label, language))
                    }
                }
            }
        }
    }
}

internal fun Recipe.titleText(): BilingualText = BilingualText(
    fr = languages.fr.title,
    en = languages.en.title
)

internal fun Recipe.descriptionText(): BilingualText = BilingualText(
    fr = languages.fr.description,
    en = languages.en.description
)

internal fun formatNumber(value: Double): String = if (value % 1.0 == 0.0) {
    value.toInt().toString()
} else {
    value.toString()
}

internal fun filterRecipes(
    recipes: List<Recipe>,
    searchQuery: String,
    selectedTagIds: List<String>,
    selectedCollectionId: String? = null
): List<Recipe> {
    val trimmedQuery = searchQuery.trim()
    return recipes.filter { recipe ->
        val matchesSearch = trimmedQuery.isEmpty() || listOf(
            recipe.languages.fr.title,
            recipe.languages.en.title,
            recipe.languages.fr.description,
            recipe.languages.en.description
        ).any { value ->
            value.contains(trimmedQuery, ignoreCase = true)
        }
        val matchesTags = selectedTagIds.isEmpty() || selectedTagIds.all { selectedTagId ->
            recipe.tagIds.contains(selectedTagId)
        }
        val matchesCollection = selectedCollectionId == null || recipe.collectionIds.contains(selectedCollectionId)
        matchesSearch && matchesTags && matchesCollection
    }
}

internal fun collectionRecipeCounts(
    recipes: List<Recipe>,
    collections: List<Collection>
): Map<String, Int> = collections.associate { collection ->
    collection.id to recipes.count { recipe -> recipe.collectionIds.contains(collection.id) }
}

internal fun filterRecipesNotInCollection(
    recipes: List<Recipe>,
    collectionId: String,
    query: String
): List<Recipe> {
    val trimmedQuery = query.trim()
    return recipes
        .filterNot { recipe -> recipe.collectionIds.contains(collectionId) }
        .filter { recipe ->
            trimmedQuery.isBlank() || listOf(
                recipe.languages.fr.title,
                recipe.languages.en.title,
                recipe.languages.fr.description,
                recipe.languages.en.description
            ).any { value ->
                value.contains(trimmedQuery, ignoreCase = true)
            }
        }
        .sortedBy { resolverText(it, AppLanguage.EN) }
}

internal fun buildSelectedCollectionLabel(
    language: AppLanguage,
    selectedCollection: Collection?,
    collectionCounts: Map<String, Int>,
    totalRecipes: Int
): String {
    if (selectedCollection == null) {
        return when (language) {
            AppLanguage.FR -> "Toutes les recettes ($totalRecipes)"
            AppLanguage.EN -> "All Recipes ($totalRecipes)"
        }
    }
    return "${selectedCollection.displayName(language)} (${collectionCounts[selectedCollection.id] ?: 0})"
}

internal fun selectedTagsForFilterDialog(
    tags: List<Tag>,
    selectedTagIds: List<String>,
    language: AppLanguage
): List<Tag> = tags
    .filter { tag -> selectedTagIds.contains(tag.id) }
    .sortedBy { tag -> tag.displayName(language) }

private fun resolverText(recipe: Recipe, language: AppLanguage): String = when (language) {
    AppLanguage.FR -> recipe.languages.fr.title.ifBlank { recipe.languages.en.title }
    AppLanguage.EN -> recipe.languages.en.title.ifBlank { recipe.languages.fr.title }
}

@Composable
internal fun localizedString(
    resId: Int,
    language: AppLanguage,
    vararg formatArgs: Any
): String {
    val context = LocalContext.current
    val locale = when (language) {
        AppLanguage.FR -> Locale.CANADA_FRENCH
        AppLanguage.EN -> Locale.CANADA
    }
    val config = Configuration(context.resources.configuration)
    config.setLocale(locale)
    val localizedContext = context.createConfigurationContext(config)
    return localizedContext.resources.getString(resId, *formatArgs)
}

enum class LibraryManagerSection {
    Ingredients,
    Tags
}

internal enum class MainMenuDestination(@StringRes val labelResId: Int) {
    Library(R.string.menu_recipe_library_label),
    Import(R.string.import_recipe_label),
    ExportRecipes(R.string.menu_export_recipes_label),
    SetupDriveBackup(R.string.menu_setup_drive_backup_label),
    ImportDriveBackup(R.string.menu_import_drive_backup_label),
    Collections(R.string.menu_collections_label),
    Ingredients(R.string.menu_ingredients_label),
    Tags(R.string.menu_tags_label),
    Settings(R.string.menu_ai_settings_label)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun RecipeBookTopBar(
    title: String? = null,
    titleContent: (@Composable () -> Unit)? = null,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    onNavigate: (MainMenuDestination) -> Unit,
    additionalMenuDestinations: List<MainMenuDestination> = emptyList(),
    disabledDestinations: Set<MainMenuDestination> = emptySet(),
    navigationIcon: (@Composable () -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {}
) {
    var menuExpanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = { titleContent?.invoke() ?: Text(title.orEmpty()) },
        navigationIcon = { navigationIcon?.invoke() },
        actions = {
            actions()
            AppIconButton(
                icon = Icons.Filled.Menu,
                contentDescription = localizedString(R.string.menu_label, language),
                onClick = { menuExpanded = true }
            )
            DropdownMenu(
                expanded = menuExpanded,
                onDismissRequest = { menuExpanded = false },
                shape = PopupShape
            ) {
                (listOf(MainMenuDestination.Library, MainMenuDestination.Import) + additionalMenuDestinations + listOf(
                    MainMenuDestination.Collections,
                    MainMenuDestination.Ingredients,
                    MainMenuDestination.Tags,
                    MainMenuDestination.Settings
                )).forEach { destination ->
                    DropdownMenuItem(
                        text = { Text(localizedString(destination.labelResId, language)) },
                        enabled = destination !in disabledDestinations,
                        onClick = {
                            menuExpanded = false
                            onNavigate(destination)
                        }
                    )
                }
                HorizontalDivider()
                DropdownMenuItem(
                    text = { Text(localizedString(R.string.language_option_en_label, language)) },
                    leadingIcon = { Icon(Icons.Filled.Language, contentDescription = null) },
                    onClick = {
                        menuExpanded = false
                        onLanguageChange(AppLanguage.EN)
                    }
                )
                DropdownMenuItem(
                    text = { Text(localizedString(R.string.language_option_fr_label, language)) },
                    leadingIcon = { Icon(Icons.Filled.Language, contentDescription = null) },
                    onClick = {
                        menuExpanded = false
                        onLanguageChange(AppLanguage.FR)
                    }
                )
            }
        }
    )
}

@Composable
internal fun AppIconButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit
) {
    IconButton(onClick = onClick) {
        Icon(imageVector = icon, contentDescription = contentDescription)
    }
}

@Composable
internal fun BackIconButton(
    contentDescription: String,
    onClick: () -> Unit
) {
    AppIconButton(
        icon = Icons.AutoMirrored.Filled.ArrowBack,
        contentDescription = contentDescription,
        onClick = onClick
    )
}

@Composable
internal fun EditIconButton(
    contentDescription: String,
    onClick: () -> Unit
) {
    AppIconButton(
        icon = Icons.Filled.Edit,
        contentDescription = contentDescription,
        onClick = onClick
    )
}

private fun Tag.displayName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

private fun Collection.displayName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

















