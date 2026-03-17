package app.recipebook.ui.recipes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.data.local.recipes.IngredientReferenceDraft
import app.recipebook.data.local.recipes.TagDraft
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientUnitMapping

@Composable
internal fun IngredientDraftDialog(
    language: AppLanguage,
    title: String,
    initialNameFr: String = "",
    initialNameEn: String = "",
    initialDensity: String = "",
    initialMappings: List<DraftUnitMappingRow> = listOf(DraftUnitMappingRow()),
    onDismiss: () -> Unit,
    onConfirm: (IngredientReferenceDraft) -> Unit
) {
    var nameFr by rememberSaveable(title, initialNameFr) { mutableStateOf(initialNameFr) }
    var nameEn by rememberSaveable(title, initialNameEn) { mutableStateOf(initialNameEn) }
    var density by rememberSaveable(title, initialDensity) { mutableStateOf(initialDensity) }
    val mappings = remember(title, initialMappings) {
        mutableStateListOf<DraftUnitMappingRow>().apply {
            addAll(initialMappings.ifEmpty { listOf(DraftUnitMappingRow()) })
        }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirm(
                        IngredientReferenceDraft(
                            nameFr = nameFr,
                            nameEn = nameEn,
                            defaultDensity = density.trim().toDoubleOrNull(),
                            unitMappings = mappings.mapNotNull(DraftUnitMappingRow::toDomain)
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
        title = { Text(title) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
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
                            modifier = Modifier.padding(8.dp),
                            verticalArrangement = Arrangement.spacedBy(6.dp)
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
            }
        }
    )
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
        title = { Text(title) },
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

