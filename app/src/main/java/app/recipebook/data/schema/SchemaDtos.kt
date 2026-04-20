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
    @SerialName("recipeLinks")
    val recipeLinks: List<RecipeLinkDto> = emptyList(),
    @SerialName("mainPhotoId")
    val mainPhotoId: String? = null,
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
data class RecipeLinkDto(
    @SerialName("id")
    val id: String,
    @SerialName("targetRecipeId")
    val targetRecipeId: String,
    @SerialName("linkType")
    val linkType: String,
    @SerialName("labelFr")
    val labelFr: String? = null,
    @SerialName("labelEn")
    val labelEn: String? = null
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
    @SerialName("instructions")
    val instructions: String,
    @SerialName("notes")
    val notes: String = ""
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
    val preparation: LocalizedValueDto = LocalizedValueDto(),
    @SerialName("optional")
    val optional: Boolean = false,
    @SerialName("notes")
    val notes: LocalizedValueDto = LocalizedValueDto(),
    @SerialName("group")
    val group: String? = null,
    @SerialName("substitutions")
    val substitutions: List<IngredientLineSubstitutionDto> = emptyList()
)

@Serializable
data class LocalizedValueDto(
    @SerialName("fr")
    val fr: String = "",
    @SerialName("en")
    val en: String = ""
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
    @SerialName("relativePath")
    val relativePath: String,
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
    @SerialName("relativePath")
    val relativePath: String,
    @SerialName("cloudRef")
    val cloudRef: String? = null
)

@Serializable
data class ImportMetadataDto(
    @SerialName("sourceType")
    val sourceType: String? = null,
    @SerialName("parserVersion")
    val parserVersion: String? = null,
    @SerialName("extractorVersion")
    val extractorVersion: String? = null,
    @SerialName("generatorLabel")
    val generatorLabel: String? = null,
    @SerialName("originalUnits")
    val originalUnits: String? = null,
    @SerialName("authoritativeLanguage")
    val authoritativeLanguage: String? = null,
    @SerialName("syncStatusFr")
    val syncStatusFr: String? = null,
    @SerialName("syncStatusEn")
    val syncStatusEn: String? = null
)

@Serializable
data class LibraryDto(
    @SerialName("metadata")
    val metadata: LibraryMetadataDto,
    @SerialName("recipes")
    val recipes: List<RecipeDto>,
    @SerialName("ingredientReferences")
    val ingredientReferences: List<IngredientReferenceDto>,
    @SerialName("ingredientForms")
    val ingredientForms: List<IngredientFormDto> = emptyList(),
    @SerialName("substitutionRules")
    val substitutionRules: List<SubstitutionRuleDto> = emptyList(),
    @SerialName("contextualSubstitutionRules")
    val contextualSubstitutionRules: List<ContextualSubstitutionRuleDto> = emptyList(),
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
    @SerialName("category")
    val category: String = "OTHER",
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
data class IngredientFormDto(
    @SerialName("id")
    val id: String,
    @SerialName("ingredientRefId")
    val ingredientRefId: String,
    @SerialName("formCode")
    val formCode: String,
    @SerialName("labelFr")
    val labelFr: String,
    @SerialName("labelEn")
    val labelEn: String,
    @SerialName("prepState")
    val prepState: String? = null,
    @SerialName("matchTermsFr")
    val matchTermsFr: List<String> = emptyList(),
    @SerialName("matchTermsEn")
    val matchTermsEn: List<String> = emptyList(),
    @SerialName("densityGPerMl")
    val densityGPerMl: Double? = null,
    @SerialName("notesFr")
    val notesFr: String? = null,
    @SerialName("notesEn")
    val notesEn: String? = null,
    @SerialName("updatedAt")
    val updatedAt: String
)

@Serializable
data class SubstitutionRuleDto(
    @SerialName("id")
    val id: String,
    @SerialName("fromFormId")
    val fromFormId: String,
    @SerialName("toFormId")
    val toFormId: String,
    @SerialName("conversionType")
    val conversionType: String,
    @SerialName("ratio")
    val ratio: Double? = null,
    @SerialName("offset")
    val offset: Double? = null,
    @SerialName("sourceUnitScope")
    val sourceUnitScope: String,
    @SerialName("targetUnitScope")
    val targetUnitScope: String,
    @SerialName("minQty")
    val minQty: Double? = null,
    @SerialName("maxQty")
    val maxQty: Double? = null,
    @SerialName("confidence")
    val confidence: String,
    @SerialName("riskLevel")
    val riskLevel: String,
    @SerialName("roundingPolicy")
    val roundingPolicy: String,
    @SerialName("notesFr")
    val notesFr: String? = null,
    @SerialName("notesEn")
    val notesEn: String? = null,
    @SerialName("warningTextFr")
    val warningTextFr: String? = null,
    @SerialName("warningTextEn")
    val warningTextEn: String? = null,
    @SerialName("updatedAt")
    val updatedAt: String
)

@Serializable
data class ContextualSubstitutionRuleDto(
    @SerialName("id")
    val id: String,
    @SerialName("fromIngredientRefId")
    val fromIngredientRefId: String,
    @SerialName("toIngredientRefId")
    val toIngredientRefId: String,
    @SerialName("conversionType")
    val conversionType: String,
    @SerialName("ratio")
    val ratio: Double? = null,
    @SerialName("offset")
    val offset: Double? = null,
    @SerialName("allowedDishTypes")
    val allowedDishTypes: List<String> = emptyList(),
    @SerialName("excludedDishTypes")
    val excludedDishTypes: List<String> = emptyList(),
    @SerialName("allowedIngredientRoles")
    val allowedIngredientRoles: List<String> = emptyList(),
    @SerialName("excludedIngredientRoles")
    val excludedIngredientRoles: List<String> = emptyList(),
    @SerialName("allowedCookingMethods")
    val allowedCookingMethods: List<String> = emptyList(),
    @SerialName("confidence")
    val confidence: String,
    @SerialName("riskLevel")
    val riskLevel: String,
    @SerialName("notesFr")
    val notesFr: String? = null,
    @SerialName("notesEn")
    val notesEn: String? = null,
    @SerialName("warningTextFr")
    val warningTextFr: String? = null,
    @SerialName("warningTextEn")
    val warningTextEn: String? = null,
    @SerialName("updatedAt")
    val updatedAt: String
)

@Serializable
data class IngredientLineSubstitutionDto(
    @SerialName("id")
    val id: String,
    @SerialName("ingredientLineId")
    val ingredientLineId: String,
    @SerialName("substitutionRuleId")
    val substitutionRuleId: String? = null,
    @SerialName("contextualSubstitutionRuleId")
    val contextualSubstitutionRuleId: String? = null,
    @SerialName("isPreferred")
    val isPreferred: Boolean = false,
    @SerialName("customLabelFr")
    val customLabelFr: String? = null,
    @SerialName("customLabelEn")
    val customLabelEn: String? = null,
    @SerialName("createdAt")
    val createdAt: String,
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
    val slug: String,
    @SerialName("category")
    val category: String = "OTHER"
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








