package app.recipebook.ui.recipes

import app.recipebook.domain.model.PhotoRef

internal fun photosToDeleteForRecipeDeletion(
    originalPhotos: List<PhotoRef>,
    currentPhotos: List<PhotoRef>
): List<PhotoRef> = (originalPhotos + currentPhotos).distinctBy(PhotoRef::id)