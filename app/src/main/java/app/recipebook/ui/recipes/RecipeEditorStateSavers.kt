package app.recipebook.ui.recipes

import androidx.core.net.toUri
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import app.recipebook.data.local.recipes.PendingRecipePhotoCapture
import app.recipebook.data.schema.*
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.RecipeLink
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
private data class SavedIngredientRow(val line: IngredientLineDto, val rawQuantity: String)

internal fun ingredientRowsSaver(): Saver<SnapshotStateList<EditableIngredientRow>, String> = Saver(
    save = { rows -> encodeIngredientRows(rows) },
    restore = { encoded -> decodeIngredientRows(encoded).toMutableStateList() }
)

internal fun encodeIngredientRows(rows: List<EditableIngredientRow>): String = Json.encodeToString(rows.map { row ->
    SavedIngredientRow(IngredientLine(id = row.id, ingredientRefId = row.ingredientRefId,
        ingredientName = row.ingredientName, originalText = row.originalText, unit = row.unit,
        preparation = row.preparation, notes = row.notes, optional = row.optional,
        group = row.group, substitutions = row.substitutions,
        ingredientFormId = row.ingredientFormId, ingredientAliasHint = row.ingredientAliasHint,
        packageAmount = row.packageAmount).toDto(), row.quantity)
})

internal fun decodeIngredientRows(encoded: String): List<EditableIngredientRow> =
    Json.decodeFromString<List<SavedIngredientRow>>(encoded).map { saved ->
        saved.line.toDomain().toEditableRow().copy(quantity = saved.rawQuantity)
    }

internal fun photoRowsSaver(): Saver<SnapshotStateList<PhotoRef>, String> = Saver(
    save = { photos -> encodeEditorPhotos(photos) },
    restore = { encoded -> decodeEditorPhotos(encoded).toMutableStateList() }
)

internal fun encodeEditorPhotos(photos: List<PhotoRef>): String =
    Json.encodeToString(photos.map { PhotoRefDto(it.id, it.localPath, it.cloudRef) })

internal fun decodeEditorPhotos(encoded: String): List<PhotoRef> =
    Json.decodeFromString<List<PhotoRefDto>>(encoded).map { PhotoRef(it.id, it.relativePath, it.cloudRef) }

internal fun recipeLinkRowsSaver(): Saver<SnapshotStateList<EditableRecipeLinkRow>, String> = Saver(
    save = { rows -> Json.encodeToString(rows.map { row ->
        RecipeLink(row.id, row.targetRecipeId.orEmpty(), row.linkType, row.labelFr, row.labelEn).toDto()
    }) },
    restore = { encoded -> Json.decodeFromString<List<RecipeLinkDto>>(encoded).map { link ->
        EditableRecipeLinkRow(link.id, link.targetRecipeId.ifBlank { null }, link.toDomain().linkType,
            link.labelFr.orEmpty(), link.labelEn.orEmpty())
    }.toMutableStateList() }
)

internal fun selectedIdsSaver(): Saver<SnapshotStateList<String>, Any> = listSaver(
    save = { it.toList() }, restore = { it.toMutableStateList() }
)

internal fun pendingCameraCaptureSaver(): Saver<PendingRecipePhotoCapture?, Any> = listSaver(
    save = { capture -> listOf(capture?.photoId.orEmpty(), capture?.localPath.orEmpty(), capture?.uri?.toString().orEmpty()) },
    restore = { values -> if (values[0].isBlank()) null else PendingRecipePhotoCapture(values[0], values[1], values[2].toUri()) }
)
