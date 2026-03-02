package app.recipebook.domain.model

enum class AppLanguage {
    FR,
    EN
}

data class LocalizedSystemText(
    val title: String,
    val description: String,
    val preparationSteps: String,
    val instructions: String,
    val notesSystem: String
)

data class BilingualText(
    val fr: LocalizedSystemText,
    val en: LocalizedSystemText
)

data class UserNotes(
    val fr: String? = null,
    val en: String? = null
)

data class RecipeSource(
    val sourceUrl: String,
    val sourceName: String
)

data class IngredientLine(
    val id: String,
    val ingredientRefId: String? = null,
    val originalText: String,
    val quantity: Double? = null,
    val unit: String? = null,
    val ingredientName: String,
    val preparation: String? = null,
    val optional: Boolean = false,
    val notes: String? = null,
    val group: String? = null
)

data class Servings(
    val amount: Double,
    val unit: String? = null
)

data class RecipeTimes(
    val prepTimeMinutes: Int? = null,
    val cookTimeMinutes: Int? = null,
    val totalTimeMinutes: Int? = null
)

data class Ratings(
    val userRating: Double? = null,
    val madeCount: Int? = null,
    val lastMadeAt: String? = null
)

data class PhotoRef(
    val id: String,
    val localPath: String,
    val cloudRef: String? = null
)

data class AttachmentRef(
    val id: String,
    val fileName: String,
    val mimeType: String,
    val localPath: String,
    val cloudRef: String? = null
)

data class ImportMetadata(
    val sourceType: String? = null,
    val parserVersion: String? = null,
    val originalUnits: String? = null
)

data class Recipe(
    val id: String,
    val createdAt: String,
    val updatedAt: String,
    val source: RecipeSource? = null,
    val languages: BilingualText,
    val userNotes: UserNotes? = null,
    val ingredients: List<IngredientLine>,
    val servings: Servings? = null,
    val times: RecipeTimes? = null,
    val tagIds: List<String> = emptyList(),
    val collectionIds: List<String> = emptyList(),
    val ratings: Ratings? = null,
    val photos: List<PhotoRef> = emptyList(),
    val attachments: List<AttachmentRef> = emptyList(),
    val importMetadata: ImportMetadata? = null,
    val deletedAt: String? = null
)

data class IngredientUnitMapping(
    val fromUnit: String,
    val toUnit: String,
    val factor: Double
)

data class IngredientReference(
    val id: String,
    val nameFr: String,
    val nameEn: String,
    val aliasesFr: List<String> = emptyList(),
    val aliasesEn: List<String> = emptyList(),
    val defaultDensity: Double? = null,
    val unitMappings: List<IngredientUnitMapping> = emptyList(),
    val updatedAt: String
)

enum class UnitType {
    MASS,
    VOLUME,
    COUNT,
    LENGTH,
    TEMPERATURE,
    OTHER
}

data class UnitDefinition(
    val unitId: String,
    val symbol: String,
    val nameFr: String,
    val nameEn: String,
    val type: UnitType,
    val baseUnitId: String? = null,
    val toBaseFactor: Double
)

data class Tag(
    val id: String,
    val nameFr: String,
    val nameEn: String,
    val slug: String
)

enum class CollectionSortOrder {
    MANUAL,
    TITLE_ASC,
    TITLE_DESC,
    RATING_DESC,
    RECENT_DESC
}

data class Collection(
    val id: String,
    val nameFr: String,
    val nameEn: String,
    val descriptionFr: String? = null,
    val descriptionEn: String? = null,
    val recipeIds: List<String> = emptyList(),
    val sortOrder: CollectionSortOrder? = null
)

data class LibrarySettings(
    val language: AppLanguage,
    val driveSyncEnabled: Boolean,
    val driveFileName: String? = null,
    val driveFolderId: String? = null,
    val openSourceInAppBrowser: Boolean? = null
)

data class LibraryMetadata(
    val libraryId: String,
    val createdAt: String,
    val updatedAt: String,
    val exportedAt: String,
    val appVersion: String? = null,
    val deviceId: String? = null
)

data class RecipeLibrary(
    val metadata: LibraryMetadata,
    val recipes: List<Recipe>,
    val ingredientReferences: List<IngredientReference>,
    val units: List<UnitDefinition>,
    val tags: List<Tag>,
    val collections: List<Collection>,
    val settings: LibrarySettings
)
