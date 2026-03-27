package app.recipebook.ui.recipes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import app.recipebook.R
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.ui.theme.PopupShape

@Composable
internal fun IngredientDraftDialog(
    language: AppLanguage,
    title: String,
    initialNameFr: String = "",
    initialNameEn: String = "",
    initialAliasesFr: String = "",
    initialAliasesEn: String = "",
    initialDensity: String = "",
    initialMappings: List<DraftUnitMappingRow> = listOf(DraftUnitMappingRow()),
    onDismiss: () -> Unit,
    onConfirm: (IngredientReferenceDraft) -> Unit
) {
    var nameFr by rememberSaveable(title, initialNameFr) { mutableStateOf(initialNameFr) }
    var nameEn by rememberSaveable(title, initialNameEn) { mutableStateOf(initialNameEn) }
    var aliasesFr by rememberSaveable(title, initialAliasesFr) { mutableStateOf(initialAliasesFr) }
    var aliasesEn by rememberSaveable(title, initialAliasesEn) { mutableStateOf(initialAliasesEn) }
    var density by rememberSaveable(title, initialDensity) { mutableStateOf(initialDensity) }
    val mappings = remember(title, initialMappings) {
        mutableStateListOf<DraftUnitMappingRow>().apply {
            addAll(initialMappings.ifEmpty { listOf(DraftUnitMappingRow()) })
        }
    }

    EditorDialogContainer(
        title = title,
        language = language,
        onDismiss = onDismiss,
        onConfirm = {
            onConfirm(
                IngredientReferenceDraft(
                    nameFr = nameFr,
                    nameEn = nameEn,
                    aliasesFr = parseAliasList(aliasesFr),
                    aliasesEn = parseAliasList(aliasesEn),
                    defaultDensity = density.trim().toDoubleOrNull(),
                    unitMappings = mappings.mapNotNull(DraftUnitMappingRow::toDomain)
                )
            )
        }
    ) {
        OutlinedTextField(
            value = nameFr,
            onValueChange = { nameFr = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(localizedString(R.string.ingredient_name_fr_label, language)) }
        )
        OutlinedTextField(
            value = nameEn,
            onValueChange = { nameEn = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(localizedString(R.string.ingredient_name_en_label, language)) }
        )
        OutlinedTextField(
            value = density,
            onValueChange = { density = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(localizedString(R.string.ingredient_density_label, language)) }
        )
        Text(
            text = localizedString(R.string.unit_conversions_label, language),
            style = MaterialTheme.typography.titleSmall
        )
        mappings.forEachIndexed { index, mapping ->
            val conversionTitle = if (
                mapping.fromUnit.isNotBlank() &&
                mapping.toUnit.isNotBlank() &&
                mapping.factor.isNotBlank()
            ) {
                localizedString(
                    R.string.ingredient_conversion_value_label,
                    language,
                    mapping.fromUnit,
                    mapping.toUnit,
                    mapping.factor
                )
            } else {
                localizedString(R.string.add_conversion_label, language)
            }
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(4.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = conversionTitle,
                        style = MaterialTheme.typography.titleSmall
                    )
                    OutlinedTextField(
                        value = mapping.fromUnit,
                        onValueChange = { mappings[index] = mapping.copy(fromUnit = it) },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(localizedString(R.string.from_unit_label, language)) }
                    )
                    OutlinedTextField(
                        value = mapping.toUnit,
                        onValueChange = { mappings[index] = mapping.copy(toUnit = it) },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(localizedString(R.string.to_unit_label, language)) }
                    )
                    OutlinedTextField(
                        value = mapping.factor,
                        onValueChange = { mappings[index] = mapping.copy(factor = it) },
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(localizedString(R.string.conversion_factor_label, language)) }
                    )
                }
            }
        }
        OutlinedTextField(
            value = aliasesFr,
            onValueChange = { aliasesFr = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(localizedString(R.string.ingredient_aliases_fr_label, language)) },
            minLines = 3,
            maxLines = 6
        )
        OutlinedTextField(
            value = aliasesEn,
            onValueChange = { aliasesEn = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(localizedString(R.string.ingredient_aliases_en_label, language)) },
            minLines = 3,
            maxLines = 6
        )
    }
}

@Composable
internal fun TagDraftDialog(
    language: AppLanguage,
    title: String,
    initialNameFr: String = "",
    initialNameEn: String = "",
    onDismiss: () -> Unit,
    onConfirm: (TagDraft) -> Unit
) {
    var nameFr by rememberSaveable(title, initialNameFr) { mutableStateOf(initialNameFr) }
    var nameEn by rememberSaveable(title, initialNameEn) { mutableStateOf(initialNameEn) }

    EditorDialogContainer(
        title = title,
        language = language,
        onDismiss = onDismiss,
        onConfirm = { onConfirm(TagDraft(nameFr = nameFr, nameEn = nameEn)) }
    ) {
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

@Composable
private fun EditorDialogContainer(
    title: String,
    language: AppLanguage,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit,
    content: @Composable ColumnScope.() -> Unit
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
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(max = 560.dp)
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(4.dp),
                        content = content
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        TextButton(onClick = onDismiss) {
                            Text(localizedString(R.string.cancel_label, language))
                        }
                        TextButton(onClick = onConfirm) {
                            Text(localizedString(R.string.save_label, language))
                        }
                    }
                }
            }
        }
    }
}

internal data class DraftUnitMappingRow(
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

internal fun parseAliasList(rawValue: String): List<String> {
    val seen = linkedSetOf<String>()
    return rawValue
        .split(',', ';', '\n')
        .mapNotNull { alias ->
            val normalized = alias.trim()
            if (normalized.isEmpty()) {
                null
            } else {
                val key = normalized.lowercase()
                if (!seen.add(key)) null else normalized
            }
        }
}

internal fun formatAliasList(aliases: List<String>): String = aliases.joinToString(separator = "\n")

