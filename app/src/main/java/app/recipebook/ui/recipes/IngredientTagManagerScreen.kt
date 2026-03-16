package app.recipebook.ui.recipes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.Tag

@Composable
fun IngredientTagManagerScreen(
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    onBack: () -> Unit,
    onCreateIngredient: (IngredientReferenceDraft) -> Unit,
    onUpdateIngredient: (String, IngredientReferenceDraft) -> Unit,
    onCreateTag: (TagDraft) -> Unit,
    onUpdateTag: (String, TagDraft) -> Unit,
    modifier: Modifier = Modifier
) {
    var language by rememberSaveable { mutableStateOf(AppLanguage.EN) }
    var ingredientQuery by rememberSaveable { mutableStateOf("") }
    var tagQuery by rememberSaveable { mutableStateOf("") }
    var editingIngredient by remember { mutableStateOf<IngredientReference?>(null) }
    var showNewIngredientDialog by remember { mutableStateOf(false) }
    var editingTag by remember { mutableStateOf<Tag?>(null) }
    var showNewTagDialog by remember { mutableStateOf(false) }

    val filteredIngredients = remember(ingredientReferences, ingredientQuery) {
        val query = ingredientQuery.trim()
        if (query.isEmpty()) {
            ingredientReferences
        } else {
            ingredientReferences.filter { ingredient ->
                listOf(
                    ingredient.nameFr,
                    ingredient.nameEn,
                    ingredient.aliasesFr.joinToString(" "),
                    ingredient.aliasesEn.joinToString(" ")
                ).any { it.contains(query, ignoreCase = true) }
            }
        }
    }
    val filteredTags = remember(tags, tagQuery) {
        val query = tagQuery.trim()
        if (query.isEmpty()) {
            tags
        } else {
            tags.filter { tag ->
                listOf(tag.nameFr, tag.nameEn, tag.slug).any { it.contains(query, ignoreCase = true) }
            }
        }
    }

    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    AssistChip(onClick = onBack, label = { Text(localizedString(R.string.back_label, language)) })
                    AssistChip(onClick = { language = AppLanguage.EN }, label = { Text(localizedString(R.string.language_en, language)) })
                    AssistChip(onClick = { language = AppLanguage.FR }, label = { Text(localizedString(R.string.language_fr, language)) })
                }
            }
            item {
                Text(
                    text = localizedString(R.string.manage_library_data_label, language),
                    style = MaterialTheme.typography.headlineMedium
                )
            }
            item {
                Text(
                    text = localizedString(R.string.manage_library_data_subtitle, language),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            item {
                ManagerSectionHeader(
                    title = localizedString(R.string.manage_ingredients_section_label, language),
                    trailing = localizedString(R.string.manage_item_count_label, language, filteredIngredients.size)
                )
            }
            item {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = { showNewIngredientDialog = true }) {
                        Text(localizedString(R.string.create_ingredient_label, language))
                    }
                }
            }
            item {
                OutlinedTextField(
                    value = ingredientQuery,
                    onValueChange = { ingredientQuery = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(localizedString(R.string.search_ingredients_label, language)) },
                    singleLine = true
                )
            }
            if (filteredIngredients.isEmpty()) {
                item {
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = localizedString(R.string.no_ingredient_references_label, language),
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            } else {
                items(filteredIngredients, key = { it.id }) { ingredient ->
                    IngredientReferenceCard(
                        ingredient = ingredient,
                        language = language,
                        onEdit = { editingIngredient = ingredient }
                    )
                }
            }
            item {
                ManagerSectionHeader(
                    title = localizedString(R.string.manage_tags_section_label, language),
                    trailing = localizedString(R.string.manage_item_count_label, language, filteredTags.size)
                )
            }
            item {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = { showNewTagDialog = true }) {
                        Text(localizedString(R.string.create_tag_label, language))
                    }
                }
            }
            item {
                OutlinedTextField(
                    value = tagQuery,
                    onValueChange = { tagQuery = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(localizedString(R.string.search_tags_label, language)) },
                    singleLine = true
                )
            }
            if (filteredTags.isEmpty()) {
                item {
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = localizedString(R.string.no_tag_references_label, language),
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            } else {
                items(filteredTags, key = { it.id }) { tag ->
                    TagCard(tag = tag, language = language, onEdit = { editingTag = tag })
                }
            }
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
private fun ManagerSectionHeader(
    title: String,
    trailing: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = title, style = MaterialTheme.typography.titleLarge)
        Text(
            text = trailing,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary
        )
    }
}
@Composable
private fun IngredientReferenceCard(
    ingredient: IngredientReference,
    language: AppLanguage,
    onEdit: () -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = ingredient.localizedName(language),
                style = MaterialTheme.typography.titleMedium
            )
            ingredient.defaultDensity?.let {
                Text(
                    text = localizedString(R.string.ingredient_density_value_label, language, formatNumber(it)),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            if (ingredient.unitMappings.isNotEmpty()) {
                ingredient.unitMappings.forEach { mapping ->
                    Text(
                        text = localizedString(
                            R.string.ingredient_conversion_value_label,
                            language,
                            mapping.fromUnit,
                            mapping.toUnit,
                            formatNumber(mapping.factor)
                        ),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            TextButton(onClick = onEdit) {
                Text(localizedString(R.string.edit_item_label, language))
            }
        }
    }
}

@Composable
private fun TagCard(
    tag: Tag,
    language: AppLanguage,
    onEdit: () -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = tag.localizedName(language), style = MaterialTheme.typography.titleMedium)
            Text(text = tag.slug, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            TextButton(onClick = onEdit) {
                Text(localizedString(R.string.edit_item_label, language))
            }
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
    var nameFr by rememberSaveable(initial?.id) { mutableStateOf(initial?.nameFr.orEmpty()) }
    var nameEn by rememberSaveable(initial?.id) { mutableStateOf(initial?.nameEn.orEmpty()) }
    var density by rememberSaveable(initial?.id) { mutableStateOf(initial?.defaultDensity?.let(::formatNumber).orEmpty()) }
    val conversions = remember(initial?.id) {
        mutableStateListOf<EditableLibraryUnitMapping>().apply {
            addAll(initial?.unitMappings?.map { EditableLibraryUnitMapping(it.fromUnit, it.toUnit, formatNumber(it.factor)) }.orEmpty())
            if (isEmpty()) add(EditableLibraryUnitMapping())
        }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(
                onClick = {
                    onSave(
                        IngredientReferenceDraft(
                            nameFr = nameFr,
                            nameEn = nameEn,
                            defaultDensity = density.trim().toDoubleOrNull(),
                            unitMappings = conversions.mapNotNull { row ->
                                val factor = row.factor.trim().toDoubleOrNull() ?: return@mapNotNull null
                                val fromUnit = row.fromUnit.trim()
                                val toUnit = row.toUnit.trim()
                                if (fromUnit.isBlank() || toUnit.isBlank()) {
                                    null
                                } else {
                                    IngredientUnitMapping(fromUnit = fromUnit, toUnit = toUnit, factor = factor)
                                }
                            }
                        )
                    )
                }
            ) {
                Text(localizedString(R.string.save_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.cancel_label, language))
            }
        },
        title = {
            Text(
                text = if (initial == null) {
                    localizedString(R.string.create_ingredient_label, language)
                } else {
                    localizedString(R.string.edit_ingredient_reference_label, language)
                }
            )
        },
        text = {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                item {
                    OutlinedTextField(
                        value = nameFr,
                        onValueChange = { nameFr = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(localizedString(R.string.ingredient_name_fr_label, language)) }
                    )
                }
                item {
                    OutlinedTextField(
                        value = nameEn,
                        onValueChange = { nameEn = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(localizedString(R.string.ingredient_name_en_label, language)) }
                    )
                }
                item {
                    OutlinedTextField(
                        value = density,
                        onValueChange = { density = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(localizedString(R.string.ingredient_density_label, language)) }
                    )
                }
                item {
                    Text(text = localizedString(R.string.unit_conversions_label, language), style = MaterialTheme.typography.titleSmall)
                }
                items(conversions.size) { index ->
                    val row = conversions[index]
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        OutlinedTextField(
                            value = row.fromUnit,
                            onValueChange = { conversions[index] = row.copy(fromUnit = it) },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.from_unit_label, language)) }
                        )
                        OutlinedTextField(
                            value = row.toUnit,
                            onValueChange = { conversions[index] = row.copy(toUnit = it) },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.to_unit_label, language)) }
                        )
                        OutlinedTextField(
                            value = row.factor,
                            onValueChange = { conversions[index] = row.copy(factor = it) },
                            modifier = Modifier.fillMaxWidth(),
                            label = { Text(localizedString(R.string.conversion_factor_label, language)) }
                        )
                        TextButton(onClick = { if (conversions.size > 1) conversions.removeAt(index) else conversions[index] = EditableLibraryUnitMapping() }) {
                            Text(localizedString(R.string.remove_label, language))
                        }
                    }
                }
                item {
                    TextButton(onClick = { conversions.add(EditableLibraryUnitMapping()) }) {
                        Text(localizedString(R.string.add_conversion_label, language))
                    }
                }
            }
        }
    )
}

@Composable
private fun TagEditorDialog(
    language: AppLanguage,
    initial: Tag?,
    onDismiss: () -> Unit,
    onSave: (TagDraft) -> Unit
) {
    var nameFr by rememberSaveable(initial?.id) { mutableStateOf(initial?.nameFr.orEmpty()) }
    var nameEn by rememberSaveable(initial?.id) { mutableStateOf(initial?.nameEn.orEmpty()) }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = { onSave(TagDraft(nameFr = nameFr, nameEn = nameEn)) }) {
                Text(localizedString(R.string.save_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.cancel_label, language))
            }
        },
        title = {
            Text(
                text = if (initial == null) {
                    localizedString(R.string.create_tag_label, language)
                } else {
                    localizedString(R.string.edit_tag_reference_label, language)
                }
            )
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(
                    value = nameFr,
                    onValueChange = { nameFr = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(localizedString(R.string.tag_name_fr_label, language)) }
                )
                OutlinedTextField(
                    value = nameEn,
                    onValueChange = { nameEn = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(localizedString(R.string.tag_name_en_label, language)) }
                )
            }
        }
    )
}

private data class EditableLibraryUnitMapping(
    val fromUnit: String = "",
    val toUnit: String = "",
    val factor: String = ""
)

private fun IngredientReference.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

private fun Tag.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}





