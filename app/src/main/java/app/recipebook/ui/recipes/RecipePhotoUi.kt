package app.recipebook.ui.recipes

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import java.io.File

internal fun Recipe.mainPhoto(): PhotoRef? = photos.firstOrNull { it.id == mainPhotoId } ?: photos.firstOrNull()

internal fun normalizedMainPhotoId(mainPhotoId: String?, photos: List<PhotoRef>): String? {
    if (photos.isEmpty()) return null
    return photos.firstOrNull { it.id == mainPhotoId }?.id ?: photos.first().id
}

@Composable
internal fun RecipePhoto(
    localPath: String?,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    val imageBitmap = remember(localPath) {
        localPath
            ?.takeIf { File(it).exists() }
            ?.let(BitmapFactory::decodeFile)
            ?.asImageBitmap()
    }

    Box(
        modifier = modifier.background(MaterialTheme.colorScheme.surfaceVariant),
        contentAlignment = Alignment.Center
    ) {
        if (imageBitmap == null) {
            Icon(
                imageVector = Icons.Filled.Image,
                contentDescription = contentDescription,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(24.dp)
            )
        } else {
            Image(
                bitmap = imageBitmap,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth().fillMaxHeight()
            )
        }
    }
}

@Composable
internal fun RecipePhotoEditorSection(
    language: AppLanguage,
    photos: List<PhotoRef>,
    mainPhotoId: String?,
    onAddFromFile: () -> Unit,
    onTakePhoto: () -> Unit,
    onSetMainPhoto: (String) -> Unit,
    onRemovePhoto: (PhotoRef) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = localizedString(R.string.photos_editor_label, language),
                style = MaterialTheme.typography.titleLarge
            )
            Row(horizontalArrangement = Arrangement.spacedBy(0.dp)) {
                AppIconButton(
                    icon = Icons.Filled.PhotoLibrary,
                    contentDescription = localizedString(R.string.add_photo_from_file_label, language),
                    onClick = onAddFromFile
                )
                AppIconButton(
                    icon = Icons.Filled.CameraAlt,
                    contentDescription = localizedString(R.string.take_photo_label, language),
                    onClick = onTakePhoto
                )
            }
        }
        if (photos.isEmpty()) {
            Text(
                text = localizedString(R.string.no_photos_added_label, language),
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        } else {
            photos.forEach { photo ->
                PhotoEditorRow(
                    photo = photo,
                    isMainPhoto = photo.id == mainPhotoId,
                    language = language,
                    onSetMainPhoto = { onSetMainPhoto(photo.id) },
                    onRemovePhoto = { onRemovePhoto(photo) }
                )
            }
        }
    }
}

@Composable
private fun PhotoEditorRow(
    photo: PhotoRef,
    isMainPhoto: Boolean,
    language: AppLanguage,
    onSetMainPhoto: () -> Unit,
    onRemovePhoto: () -> Unit
) {
    Surface(
        tonalElevation = 2.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RecipePhoto(
                localPath = photo.localPath,
                contentDescription = localizedString(R.string.recipe_photo_preview_label, language),
                modifier = Modifier.size(56.dp)
            )
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                Text(
                    text = if (isMainPhoto) {
                        localizedString(R.string.main_photo_label, language)
                    } else {
                        localizedString(R.string.additional_photo_label, language)
                    },
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Row(horizontalArrangement = Arrangement.spacedBy(0.dp)) {
                AppIconButton(
                    icon = if (isMainPhoto) Icons.Filled.Star else Icons.Outlined.StarOutline,
                    contentDescription = localizedString(R.string.set_main_photo_label, language),
                    onClick = onSetMainPhoto
                )
                AppIconButton(
                    icon = Icons.Filled.Delete,
                    contentDescription = localizedString(R.string.remove_photo_label, language),
                    onClick = onRemovePhoto
                )
            }
        }
    }
}
