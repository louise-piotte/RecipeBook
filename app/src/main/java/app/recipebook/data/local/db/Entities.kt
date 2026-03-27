package app.recipebook.data.local.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import app.recipebook.domain.model.IngredientCategory

@Entity(tableName = "recipes")
data class RecipeEntity(
    @PrimaryKey
    val id: String,
    val createdAt: String,
    val updatedAt: String,
    val titleFr: String,
    val titleEn: String,
    val descriptionFr: String,
    val descriptionEn: String,
    val instructionsFr: String,
    val instructionsEn: String,
    val notesFr: String,
    val notesEn: String,
    val sourceUrl: String? = null,
    val sourceName: String? = null,
    val servingsAmount: Double? = null,
    val servingsUnit: String? = null,
    val prepTimeMinutes: Int? = null,
    val cookTimeMinutes: Int? = null,
    val totalTimeMinutes: Int? = null,
    val userRating: Double? = null,
    val madeCount: Int? = null,
    val lastMadeAt: String? = null,
    val mainPhotoId: String? = null,
    val deletedAt: String? = null,
    val ingredientLinesJson: String = "[]",
    val tagIdsJson: String = "[]",
    val collectionIdsJson: String = "[]",
    val photosJson: String = "[]",
    val attachmentsJson: String = "[]",
    val importMetadataJson: String? = null
)

@Entity(tableName = "ingredient_references")
data class IngredientReferenceEntity(
    @PrimaryKey
    val id: String,
    val nameFr: String,
    val nameEn: String,
    val category: String = IngredientCategory.OTHER.name,
    val aliasesFrJson: String = "[]",
    val aliasesEnJson: String = "[]",
    val defaultDensity: Double? = null,
    val unitMappingsJson: String = "[]",
    val updatedAt: String
)

@Entity(tableName = "tags")
data class TagEntity(
    @PrimaryKey
    val id: String,
    val nameFr: String,
    val nameEn: String,
    val slug: String,
    val category: String = "OTHER"
)

@Entity(tableName = "collections")
data class CollectionEntity(
    @PrimaryKey
    val id: String,
    val nameFr: String,
    val nameEn: String,
    val descriptionFr: String? = null,
    val descriptionEn: String? = null,
    val recipeIdsJson: String = "[]",
    val sortOrder: String? = null
)

@Entity(tableName = "library_settings")
data class LibrarySettingsEntity(
    @PrimaryKey
    val id: String = SINGLETON_ID,
    val language: String,
    val driveSyncEnabled: Boolean,
    val driveFileName: String? = null,
    val driveFolderId: String? = null,
    val openSourceInAppBrowser: Boolean? = null
) {
    companion object {
        const val SINGLETON_ID = "singleton"
    }
}

@Entity(tableName = "library_metadata")
data class LibraryMetadataEntity(
    @PrimaryKey
    val libraryId: String,
    val createdAt: String,
    val updatedAt: String,
    val exportedAt: String,
    val appVersion: String? = null,
    val deviceId: String? = null
)
