package app.recipebook.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
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
    val photosJson: String = "[]",
    val attachmentsJson: String = "[]",
    val importMetadataJson: String? = null
)

@Entity(
    tableName = "recipe_ingredient_lines",
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipeId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["recipeId", "position"], unique = true),
        Index(value = ["recipeId"]),
        Index(value = ["ingredientRefId"])
    ]
)
data class RecipeIngredientLineEntity(
    @PrimaryKey
    val id: String,
    val recipeId: String,
    val position: Int,
    val ingredientRefId: String? = null,
    val originalText: String,
    val quantity: Double? = null,
    val unit: String? = null,
    val ingredientName: String,
    val preparationFr: String = "",
    val preparationEn: String = "",
    val optional: Boolean = false,
    val notesFr: String = "",
    val notesEn: String = "",
    @ColumnInfo(name = "groupName")
    val group: String? = null
)

@Entity(
    tableName = "recipe_ingredient_line_substitutions",
    foreignKeys = [
        ForeignKey(
            entity = RecipeIngredientLineEntity::class,
            parentColumns = ["id"],
            childColumns = ["ingredientLineId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["ingredientLineId", "position"], unique = true),
        Index(value = ["ingredientLineId"])
    ]
)
data class IngredientLineSubstitutionEntity(
    @PrimaryKey
    val id: String,
    val ingredientLineId: String,
    val position: Int,
    val substitutionRuleId: String? = null,
    val contextualSubstitutionRuleId: String? = null,
    val isPreferred: Boolean = false,
    val customLabelFr: String? = null,
    val customLabelEn: String? = null,
    val createdAt: String,
    val updatedAt: String
)

@Entity(
    tableName = "recipe_links",
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipeId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["recipeId", "position"], unique = true),
        Index(value = ["recipeId"]),
        Index(value = ["targetRecipeId"])
    ]
)
data class RecipeLinkEntity(
    @PrimaryKey
    val id: String,
    val recipeId: String,
    val targetRecipeId: String,
    val linkType: String,
    val labelFr: String? = null,
    val labelEn: String? = null,
    val position: Int
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

@Entity(
    tableName = "contextual_substitution_rules",
    indices = [
        Index(value = ["fromIngredientRefId"]),
        Index(value = ["toIngredientRefId"])
    ]
)
data class ContextualSubstitutionRuleEntity(
    @PrimaryKey
    val id: String,
    val fromIngredientRefId: String,
    val toIngredientRefId: String,
    val conversionType: String,
    val ratio: Double? = null,
    val offset: Double? = null,
    val allowedDishTypesJson: String = "[]",
    val excludedDishTypesJson: String = "[]",
    val allowedIngredientRolesJson: String = "[]",
    val excludedIngredientRolesJson: String = "[]",
    val allowedCookingMethodsJson: String = "[]",
    val confidence: String,
    val riskLevel: String,
    val notesFr: String? = null,
    val notesEn: String? = null,
    val warningTextFr: String? = null,
    val warningTextEn: String? = null,
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

@Entity(
    tableName = "recipe_tag_cross_refs",
    primaryKeys = ["recipeId", "tagId"],
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipeId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["recipeId", "position"], unique = true),
        Index(value = ["tagId"])
    ]
)
data class RecipeTagCrossRef(
    val recipeId: String,
    val tagId: String,
    val position: Int
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

@Entity(
    tableName = "recipe_collection_cross_refs",
    primaryKeys = ["recipeId", "collectionId"],
    foreignKeys = [
        ForeignKey(
            entity = RecipeEntity::class,
            parentColumns = ["id"],
            childColumns = ["recipeId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["recipeId", "position"], unique = true),
        Index(value = ["collectionId"])
    ]
)
data class RecipeCollectionCrossRef(
    val recipeId: String,
    val collectionId: String,
    val position: Int
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
