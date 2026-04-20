package app.recipebook.domain.model

import kotlinx.serialization.Serializable

enum class AppLanguage {
    FR,
    EN
}

data class LocalizedValue(
    val fr: String = "",
    val en: String = ""
)

data class LocalizedSystemText(
    val title: String,
    val description: String,
    val instructions: String,
    val notes: String
)

data class BilingualText(
    val fr: LocalizedSystemText,
    val en: LocalizedSystemText
)


data class RecipeSource(
    val sourceUrl: String,
    val sourceName: String
)

enum class RecipeLinkType {
    COMPONENT,
    TOPPING,
    FILLING,
    FROSTING,
    SAUCE,
    SEASONING,
    SIDE,
    PAIRING,
    VARIATION,
    OTHER
}

data class RecipeLink(
    val id: String,
    val targetRecipeId: String,
    val linkType: RecipeLinkType,
    val labelFr: String? = null,
    val labelEn: String? = null
)

data class IngredientLine(
    val id: String,
    val ingredientRefId: String? = null,
    val originalText: String,
    val quantity: Double? = null,
    val unit: String? = null,
    val ingredientName: String,
    val preparation: LocalizedValue = LocalizedValue(),
    val optional: Boolean = false,
    val notes: LocalizedValue = LocalizedValue(),
    val group: String? = null,
    val substitutions: List<IngredientLineSubstitution> = emptyList()
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

enum class BilingualSyncStatus {
    UP_TO_DATE,
    NEEDS_REGENERATION,
    MISSING
}

data class ImportMetadata(
    val sourceType: String? = null,
    val parserVersion: String? = null,
    val extractorVersion: String? = null,
    val generatorLabel: String? = null,
    val originalUnits: String? = null,
    val authoritativeLanguage: AppLanguage? = null,
    val syncStatusFr: BilingualSyncStatus? = null,
    val syncStatusEn: BilingualSyncStatus? = null
)

data class Recipe(
    val id: String,
    val createdAt: String,
    val updatedAt: String,
    val source: RecipeSource? = null,
    val languages: BilingualText,
    val ingredients: List<IngredientLine>,
    val servings: Servings? = null,
    val times: RecipeTimes? = null,
    val tagIds: List<String> = emptyList(),
    val collectionIds: List<String> = emptyList(),
    val ratings: Ratings? = null,
    val recipeLinks: List<RecipeLink> = emptyList(),
    val mainPhotoId: String? = null,
    val photos: List<PhotoRef> = emptyList(),
    val attachments: List<AttachmentRef> = emptyList(),
    val importMetadata: ImportMetadata? = null,
    val deletedAt: String? = null
)

@Serializable
data class IngredientUnitMapping(
    val fromUnit: String,
    val toUnit: String,
    val factor: Double
)

enum class IngredientCategory {
    FLOUR_AND_STARCH,
    GRAIN_AND_CEREAL,
    SUGAR_AND_SWEETENER,
    BAKING_AND_SPICE,
    HERB,
    CHOCOLATE_AND_CANDY,
    FAT_AND_OIL,
    DAIRY_AND_ALTERNATIVE,
    EGG,
    CHEESE,
    BAKING_MIXIN_AND_PANTRY,
    NUT_SEED_AND_DRIED_FRUIT,
    FRUIT,
    VEGETABLE_AND_AROMATIC,
    LEGUME_AND_PULSE,
    STOCK_AND_BROTH,
    SAUCE_AND_CONDIMENT,
    PROTEIN,
    OTHER
}

data class IngredientReference(
    val id: String,
    val nameFr: String,
    val nameEn: String,
    val category: IngredientCategory = IngredientCategory.OTHER,
    val aliasesFr: List<String> = emptyList(),
    val aliasesEn: List<String> = emptyList(),
    val defaultDensity: Double? = null,
    val unitMappings: List<IngredientUnitMapping> = emptyList(),
    val updatedAt: String
)

enum class SubstitutionConversionType {
    RATIO,
    AFFINE,
    FIXED_AMOUNT
}

enum class UnitScope {
    MASS,
    VOLUME,
    COUNT,
    PACKAGE
}

enum class SubstitutionConfidence {
    EXACT,
    TESTED,
    APPROXIMATE
}

enum class SubstitutionRiskLevel {
    SAFE,
    CAUTION,
    HIGH_RISK
}

data class IngredientForm(
    val id: String,
    val ingredientRefId: String,
    val formCode: String,
    val labelFr: String,
    val labelEn: String,
    val prepState: String? = null,
    val matchTermsFr: List<String> = emptyList(),
    val matchTermsEn: List<String> = emptyList(),
    val densityGPerMl: Double? = null,
    val notesFr: String? = null,
    val notesEn: String? = null,
    val updatedAt: String
)

data class SubstitutionRule(
    val id: String,
    val fromFormId: String,
    val toFormId: String,
    val conversionType: SubstitutionConversionType,
    val ratio: Double? = null,
    val offset: Double? = null,
    val sourceUnitScope: UnitScope,
    val targetUnitScope: UnitScope,
    val minQty: Double? = null,
    val maxQty: Double? = null,
    val confidence: SubstitutionConfidence,
    val riskLevel: SubstitutionRiskLevel,
    val roundingPolicy: String,
    val notesFr: String? = null,
    val notesEn: String? = null,
    val warningTextFr: String? = null,
    val warningTextEn: String? = null,
    val updatedAt: String
)

data class ContextualSubstitutionRule(
    val id: String,
    val fromIngredientRefId: String,
    val toIngredientRefId: String,
    val conversionType: SubstitutionConversionType,
    val ratio: Double? = null,
    val offset: Double? = null,
    val allowedDishTypes: List<String> = emptyList(),
    val excludedDishTypes: List<String> = emptyList(),
    val allowedIngredientRoles: List<String> = emptyList(),
    val excludedIngredientRoles: List<String> = emptyList(),
    val allowedCookingMethods: List<String> = emptyList(),
    val confidence: SubstitutionConfidence,
    val riskLevel: SubstitutionRiskLevel,
    val notesFr: String? = null,
    val notesEn: String? = null,
    val warningTextFr: String? = null,
    val warningTextEn: String? = null,
    val updatedAt: String
)

data class IngredientLineSubstitution(
    val id: String,
    val ingredientLineId: String,
    val substitutionRuleId: String? = null,
    val contextualSubstitutionRuleId: String? = null,
    val isPreferred: Boolean = false,
    val customLabelFr: String? = null,
    val customLabelEn: String? = null,
    val createdAt: String,
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

enum class TagCategory(
    val nameFr: String,
    val nameEn: String
) {
    CUISINE(nameFr = "Cuisine", nameEn = "Cuisine"),
    MEAL(nameFr = "Repas", nameEn = "Meal"),
    DISH_TYPE(nameFr = "Type de plat", nameEn = "Dish Type"),
    SEASONAL(nameFr = "Saison et f\u00eates", nameEn = "Seasonal"),
    APPLIANCE(nameFr = "Appareil", nameEn = "Appliance"),
    SERVING_CONTEXT(nameFr = "Contexte de service", nameEn = "Serving Context"),
    USE_CASE(nameFr = "Usage", nameEn = "Use Case"),
    EFFORT(nameFr = "Effort", nameEn = "Effort"),
    DIETARY(nameFr = "Alimentation", nameEn = "Dietary"),
    OTHER(nameFr = "Autre", nameEn = "Other");

    fun localizedName(language: AppLanguage): String = when (language) {
        AppLanguage.FR -> nameFr
        AppLanguage.EN -> nameEn
    }
}

data class Tag(
    val id: String,
    val nameFr: String,
    val nameEn: String,
    val slug: String,
    val category: TagCategory = TagCategory.OTHER
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
    val ingredientForms: List<IngredientForm> = emptyList(),
    val substitutionRules: List<SubstitutionRule> = emptyList(),
    val contextualSubstitutionRules: List<ContextualSubstitutionRule> = emptyList(),
    val units: List<UnitDefinition>,
    val tags: List<Tag>,
    val collections: List<Collection>,
    val settings: LibrarySettings
)









