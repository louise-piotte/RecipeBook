package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.LibraryMetadata
import app.recipebook.domain.model.LibrarySettings
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLibrary
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.model.UnitType
import java.io.File
import java.nio.file.Files
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeLibraryImportCodecTest {
    @Test
    fun readSeedPackageZip_materializesRecipeAssetsThroughTheAssetSink() {
        val tempDir = Files.createTempDirectory("recipe-import-codec").toFile()
        val photoFile = File(tempDir, "photo.jpg").apply { writeBytes(byteArrayOf(1, 2, 3)) }
        val outputZip = File(tempDir, "library.zip")
        val exportedLibrary = RecipeLibrary(
            metadata = LibraryMetadata(
                libraryId = "library-local",
                createdAt = "2026-04-19T12:00:00Z",
                updatedAt = "2026-04-19T12:05:00Z",
                exportedAt = "2026-04-19T12:10:00Z"
            ),
            recipes = listOf(
                Recipe(
                    id = "recipe-1",
                    createdAt = "2026-04-19T12:00:00Z",
                    updatedAt = "2026-04-19T12:05:00Z",
                    languages = BilingualText(
                        fr = LocalizedSystemText("Crepes", "", "", ""),
                        en = LocalizedSystemText("Crepes", "", "", "")
                    ),
                    ingredients = listOf(
                        IngredientLine(
                            id = "ingredient-1",
                            ingredientRefId = "ingredient-ref-1",
                            originalText = "1 cup flour",
                            quantity = 1.0,
                            unit = "cup",
                            ingredientName = "flour"
                        )
                    ),
                    mainPhotoId = "photo-1",
                    photos = listOf(PhotoRef(id = "photo-1", localPath = photoFile.absolutePath))
                )
            ),
            ingredientReferences = listOf(
                IngredientReference(
                    id = "ingredient-ref-1",
                    nameFr = "Farine",
                    nameEn = "Flour",
                    updatedAt = "2026-04-19T12:00:00Z"
                )
            ),
            ingredientForms = emptyList(),
            substitutionRules = emptyList(),
            contextualSubstitutionRules = emptyList(),
            units = listOf(UnitDefinition("g", "g", "gramme", "gram", UnitType.MASS, "g", 1.0)),
            tags = listOf(Tag("tag-breakfast", "Déjeuner", "Breakfast", "breakfast", TagCategory.MEAL)),
            collections = listOf(Collection("collection-classics", "Classiques", "Classics", recipeIds = listOf("recipe-1"))),
            settings = LibrarySettings(language = AppLanguage.EN, driveSyncEnabled = false)
        )
        RecipeExportCodec.writeSeedPackageZip(exportedLibrary, outputZip)

        val importedLibrary = RecipeLibraryImportCodec(FakeAssetSink()).readSeedPackageZip(outputZip)

        assertEquals(1, importedLibrary.recipes.size)
        assertEquals("/imported/photos/recipe-1/photo-1.jpg", importedLibrary.recipes.single().photos.single().localPath)
        assertTrue(importedLibrary.recipes.single().mainPhotoId == "photo-1")
    }
}

private class FakeAssetSink : RecipeLibraryAssetSink {
    override fun importPhoto(
        recipeId: String,
        photoId: String,
        archivePath: String,
        input: java.io.InputStream
    ) = PhotoRef(
        id = photoId,
        localPath = "/imported/photos/$recipeId/${File(archivePath).name}"
    )

    override fun importAttachment(
        recipeId: String,
        attachmentId: String,
        fileName: String,
        archivePath: String,
        mimeType: String,
        input: java.io.InputStream
    ) = app.recipebook.domain.model.AttachmentRef(
        id = attachmentId,
        fileName = fileName,
        mimeType = mimeType,
        localPath = "/imported/attachments/$recipeId/${File(archivePath).name}"
    )
}
