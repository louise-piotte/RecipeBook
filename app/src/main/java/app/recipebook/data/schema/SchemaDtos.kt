package app.recipebook.data.schema

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

object SchemaVersions {
    const val RECIPE_CREATION_V1 = "recipe-creation/v1"
    const val FULL_LIBRARY_V1 = "full-library/v1"
}

@Serializable
data class RecipeCreationPayloadDto(
    @SerialName("schemaVersion")
    val schemaVersion: String = SchemaVersions.RECIPE_CREATION_V1,
    @SerialName("recipe")
    val recipe: RecipeDto
)

@Serializable
data class FullLibraryPayloadDto(
    @SerialName("schemaVersion")
    val schemaVersion: String = SchemaVersions.FULL_LIBRARY_V1,
    @SerialName("library")
    val library: LibraryDto
)

@Serializable
data class RecipeDto(
    @SerialName("id")
    val id: String,
    @SerialName("createdAt")
    val createdAt: String,
    @SerialName("updatedAt")
    val updatedAt: String,
    @SerialName("source")
    val source: SourceDto? = null,
    @SerialName("languages")
    val languages: LanguagesDto,
    @SerialName("userNotes")
    val userNotes: UserNotesDto? = null,
    @SerialName("ingredients")
    val ingredients: List<IngredientLineDto>,
    @SerialName("servings")
    val servings: ServingsDto? = null,
    @SerialName("times")
    val times: TimesDto? = null,
    @SerialName("tags")
    val tags: List<String> = emptyList(),
    @SerialName("collections")
    val collections: List<String> = emptyList(),
    @SerialName("ratings")
    val ratings: RatingsDto? = null,
    @SerialName("photos")
    val photos: List<PhotoRefDto> = emptyList(),
    @SerialName("attachments")
    val attachments: List<AttachmentRefDto> = emptyList(),
    @SerialName("importMetadata")
    val importMetadata: ImportMetadataDto? = null,
    @SerialName("deletedAt")
    val deletedAt: String? = null
)

@Serializable
data class SourceDto(
    @SerialName("sourceUrl")
    val sourceUrl: String,
    @SerialName("sourceName")
    val sourceName: String
)

@Serializable
data class LanguagesDto(
    @SerialName("fr")
    val fr: LocalizedSystemTextDto,
    @SerialName("en")
    val en: LocalizedSystemTextDto
)

@Serializable
data class LocalizedSystemTextDto(
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val description: String,
    @SerialName("preparationSteps")
    val preparationSteps: String,
    @SerialName("instructions")
    val instructions: String,
    @SerialName("notesSystem")
    val notesSystem: String
)

@Serializable
data class UserNotesDto(
    @SerialName("fr")
    val fr: String? = null,
    @SerialName("en")
    val en: String? = null
)

@Serializable
data class IngredientLineDto(
    @SerialName("id")
    val id: String,
    @SerialName("ingredientRefId")
    val ingredientRefId: String? = null,
    @SerialName("originalText")
    val originalText: String,
    @SerialName("quantity")
    val quantity: Double? = null,
    @SerialName("unit")
    val unit: String? = null,
    @SerialName("ingredientName")
    val ingredientName: String,
    @SerialName("preparation")
    val preparation: String? = null,
    @SerialName("optional")
    val optional: Boolean = false,
    @SerialName("notes")
    val notes: String? = null,
    @SerialName("group")
    val group: String? = null
)

@Serializable
data class ServingsDto(
    @SerialName("amount")
    val amount: Double,
    @SerialName("unit")
    val unit: String? = null
)

@Serializable
data class TimesDto(
    @SerialName("prepTimeMinutes")
    val prepTimeMinutes: Int? = null,
    @SerialName("cookTimeMinutes")
    val cookTimeMinutes: Int? = null,
    @SerialName("totalTimeMinutes")
    val totalTimeMinutes: Int? = null
)

@Serializable
data class RatingsDto(
    @SerialName("userRating")
    val userRating: Double? = null,
    @SerialName("madeCount")
    val madeCount: Int? = null,
    @SerialName("lastMadeAt")
    val lastMadeAt: String? = null
)

@Serializable
data class PhotoRefDto(
    @SerialName("id")
    val id: String,
    @SerialName("localPath")
    val localPath: String,
    @SerialName("cloudRef")
    val cloudRef: String? = null
)

@Serializable
data class AttachmentRefDto(
    @SerialName("id")
    val id: String,
    @SerialName("fileName")
    val fileName: String,
    @SerialName("mimeType")
    val mimeType: String,
    @SerialName("localPath")
    val localPath: String,
    @SerialName("cloudRef")
    val cloudRef: String? = null
)

@Serializable
data class ImportMetadataDto(
    @SerialName("sourceType")
    val sourceType: String? = null,
    @SerialName("parserVersion")
    val parserVersion: String? = null,
    @SerialName("originalUnits")
    val originalUnits: String? = null
)

@Serializable
data class LibraryDto(
    @SerialName("metadata")
    val metadata: LibraryMetadataDto,
    @SerialName("recipes")
    val recipes: List<RecipeDto>,
    @SerialName("ingredientReferences")
    val ingredientReferences: List<IngredientReferenceDto>,
    @SerialName("units")
    val units: List<UnitDefinitionDto>,
    @SerialName("tags")
    val tags: List<TagDto>,
    @SerialName("collections")
    val collections: List<CollectionDto>,
    @SerialName("settings")
    val settings: LibrarySettingsDto
)

@Serializable
data class LibraryMetadataDto(
    @SerialName("libraryId")
    val libraryId: String,
    @SerialName("createdAt")
    val createdAt: String,
    @SerialName("updatedAt")
    val updatedAt: String,
    @SerialName("exportedAt")
    val exportedAt: String,
    @SerialName("appVersion")
    val appVersion: String? = null,
    @SerialName("deviceId")
    val deviceId: String? = null
)

@Serializable
data class IngredientReferenceDto(
    @SerialName("id")
    val id: String,
    @SerialName("nameFr")
    val nameFr: String,
    @SerialName("nameEn")
    val nameEn: String,
    @SerialName("aliasesFr")
    val aliasesFr: List<String> = emptyList(),
    @SerialName("aliasesEn")
    val aliasesEn: List<String> = emptyList(),
    @SerialName("defaultDensity")
    val defaultDensity: Double? = null,
    @SerialName("unitMappings")
    val unitMappings: List<IngredientUnitMappingDto> = emptyList(),
    @SerialName("updatedAt")
    val updatedAt: String
)

@Serializable
data class IngredientUnitMappingDto(
    @SerialName("fromUnit")
    val fromUnit: String,
    @SerialName("toUnit")
    val toUnit: String,
    @SerialName("factor")
    val factor: Double
)

@Serializable
data class UnitDefinitionDto(
    @SerialName("unitId")
    val unitId: String,
    @SerialName("symbol")
    val symbol: String,
    @SerialName("nameFr")
    val nameFr: String,
    @SerialName("nameEn")
    val nameEn: String,
    @SerialName("type")
    val type: String,
    @SerialName("baseUnitId")
    val baseUnitId: String? = null,
    @SerialName("toBaseFactor")
    val toBaseFactor: Double
)

@Serializable
data class TagDto(
    @SerialName("id")
    val id: String,
    @SerialName("nameFr")
    val nameFr: String,
    @SerialName("nameEn")
    val nameEn: String,
    @SerialName("slug")
    val slug: String
)

@Serializable
data class CollectionDto(
    @SerialName("id")
    val id: String,
    @SerialName("nameFr")
    val nameFr: String,
    @SerialName("nameEn")
    val nameEn: String,
    @SerialName("descriptionFr")
    val descriptionFr: String? = null,
    @SerialName("descriptionEn")
    val descriptionEn: String? = null,
    @SerialName("recipeIds")
    val recipeIds: List<String> = emptyList(),
    @SerialName("sortOrder")
    val sortOrder: String? = null
)

@Serializable
data class LibrarySettingsDto(
    @SerialName("language")
    val language: String,
    @SerialName("driveSyncEnabled")
    val driveSyncEnabled: Boolean,
    @SerialName("driveFileName")
    val driveFileName: String? = null,
    @SerialName("driveFolderId")
    val driveFolderId: String? = null,
    @SerialName("openSourceInAppBrowser")
    val openSourceInAppBrowser: Boolean? = null
)
