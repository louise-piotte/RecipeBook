package app.recipebook.data.schema

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.AttachmentRef
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.CollectionSortOrder
import app.recipebook.domain.model.ContextualSubstitutionRule
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientLineSubstitution
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LibraryMetadata
import app.recipebook.domain.model.LibrarySettings
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Ratings
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLibrary
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.RecipeTimes
import app.recipebook.domain.model.Servings
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionConversionType
import app.recipebook.domain.model.SubstitutionRule
import app.recipebook.domain.model.SubstitutionSeverity
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.model.UnitScope
import app.recipebook.domain.model.UnitType
import app.recipebook.domain.model.UserNotes

fun RecipeCreationPayloadDto.toDomainRecipe(): Recipe = recipe.toDomain()

fun FullLibraryPayloadDto.toDomainLibrary(): RecipeLibrary = library.toDomain()

fun Recipe.toRecipeCreationPayloadDto(
    schemaVersion: String = SchemaVersions.RECIPE_CREATION_V1
): RecipeCreationPayloadDto = RecipeCreationPayloadDto(
    schemaVersion = schemaVersion,
    recipe = toDto()
)

fun RecipeLibrary.toFullLibraryPayloadDto(
    schemaVersion: String = SchemaVersions.FULL_LIBRARY_V1
): FullLibraryPayloadDto = FullLibraryPayloadDto(
    schemaVersion = schemaVersion,
    library = toDto()
)

private fun RecipeDto.toDomain(): Recipe = Recipe(
    id = id,
    createdAt = createdAt,
    updatedAt = updatedAt,
    source = source?.toDomain(),
    languages = languages.toDomain(),
    userNotes = userNotes?.toDomain(),
    ingredients = ingredients.map { it.toDomain() },
    servings = servings?.toDomain(),
    times = times?.toDomain(),
    tagIds = tags,
    collectionIds = collections,
    ratings = ratings?.toDomain(),
    photos = photos.map { it.toDomain() },
    attachments = attachments.map { it.toDomain() },
    importMetadata = importMetadata?.toDomain(),
    deletedAt = deletedAt
)

private fun Recipe.toDto(): RecipeDto = RecipeDto(
    id = id,
    createdAt = createdAt,
    updatedAt = updatedAt,
    source = source?.toDto(),
    languages = languages.toDto(),
    userNotes = userNotes?.toDto(),
    ingredients = ingredients.map { it.toDto() },
    servings = servings?.toDto(),
    times = times?.toDto(),
    tags = tagIds,
    collections = collectionIds,
    ratings = ratings?.toDto(),
    photos = photos.map { it.toDto() },
    attachments = attachments.map { it.toDto() },
    importMetadata = importMetadata?.toDto(),
    deletedAt = deletedAt
)

private fun SourceDto.toDomain(): RecipeSource = RecipeSource(
    sourceUrl = sourceUrl,
    sourceName = sourceName
)

private fun RecipeSource.toDto(): SourceDto = SourceDto(
    sourceUrl = sourceUrl,
    sourceName = sourceName
)

private fun LanguagesDto.toDomain(): BilingualText = BilingualText(
    fr = fr.toDomain(),
    en = en.toDomain()
)

private fun BilingualText.toDto(): LanguagesDto = LanguagesDto(
    fr = fr.toDto(),
    en = en.toDto()
)

private fun LocalizedSystemTextDto.toDomain(): LocalizedSystemText = LocalizedSystemText(
    title = title,
    description = description,
    preparationSteps = preparationSteps,
    instructions = instructions,
    notesSystem = notesSystem
)

private fun LocalizedSystemText.toDto(): LocalizedSystemTextDto = LocalizedSystemTextDto(
    title = title,
    description = description,
    preparationSteps = preparationSteps,
    instructions = instructions,
    notesSystem = notesSystem
)

private fun UserNotesDto.toDomain(): UserNotes = UserNotes(
    fr = fr,
    en = en
)

private fun UserNotes.toDto(): UserNotesDto = UserNotesDto(
    fr = fr,
    en = en
)

private fun IngredientLineDto.toDomain(): IngredientLine = IngredientLine(
    id = id,
    ingredientRefId = ingredientRefId,
    originalText = originalText,
    quantity = quantity,
    unit = unit,
    ingredientName = ingredientName,
    preparation = preparation,
    optional = optional,
    notes = notes,
    group = group,
    substitutions = substitutions.map { it.toDomain() }
)

private fun IngredientLine.toDto(): IngredientLineDto = IngredientLineDto(
    id = id,
    ingredientRefId = ingredientRefId,
    originalText = originalText,
    quantity = quantity,
    unit = unit,
    ingredientName = ingredientName,
    preparation = preparation,
    optional = optional,
    notes = notes,
    group = group,
    substitutions = substitutions.map { it.toDto() }
)

private fun ServingsDto.toDomain(): Servings = Servings(
    amount = amount,
    unit = unit
)

private fun Servings.toDto(): ServingsDto = ServingsDto(
    amount = amount,
    unit = unit
)

private fun TimesDto.toDomain(): RecipeTimes = RecipeTimes(
    prepTimeMinutes = prepTimeMinutes,
    cookTimeMinutes = cookTimeMinutes,
    totalTimeMinutes = totalTimeMinutes
)

private fun RecipeTimes.toDto(): TimesDto = TimesDto(
    prepTimeMinutes = prepTimeMinutes,
    cookTimeMinutes = cookTimeMinutes,
    totalTimeMinutes = totalTimeMinutes
)

private fun RatingsDto.toDomain(): Ratings = Ratings(
    userRating = userRating,
    madeCount = madeCount,
    lastMadeAt = lastMadeAt
)

private fun Ratings.toDto(): RatingsDto = RatingsDto(
    userRating = userRating,
    madeCount = madeCount,
    lastMadeAt = lastMadeAt
)

private fun PhotoRefDto.toDomain(): PhotoRef = PhotoRef(
    id = id,
    localPath = localPath,
    cloudRef = cloudRef
)

private fun PhotoRef.toDto(): PhotoRefDto = PhotoRefDto(
    id = id,
    localPath = localPath,
    cloudRef = cloudRef
)

private fun AttachmentRefDto.toDomain(): AttachmentRef = AttachmentRef(
    id = id,
    fileName = fileName,
    mimeType = mimeType,
    localPath = localPath,
    cloudRef = cloudRef
)

private fun AttachmentRef.toDto(): AttachmentRefDto = AttachmentRefDto(
    id = id,
    fileName = fileName,
    mimeType = mimeType,
    localPath = localPath,
    cloudRef = cloudRef
)

private fun ImportMetadataDto.toDomain(): ImportMetadata = ImportMetadata(
    sourceType = sourceType,
    parserVersion = parserVersion,
    originalUnits = originalUnits
)

private fun ImportMetadata.toDto(): ImportMetadataDto = ImportMetadataDto(
    sourceType = sourceType,
    parserVersion = parserVersion,
    originalUnits = originalUnits
)

private fun LibraryDto.toDomain(): RecipeLibrary = RecipeLibrary(
    metadata = metadata.toDomain(),
    recipes = recipes.map { it.toDomain() },
    ingredientReferences = ingredientReferences.map { it.toDomain() },
    ingredientForms = ingredientForms.map { it.toDomain() },
    substitutionRules = substitutionRules.map { it.toDomain() },
    contextualSubstitutionRules = contextualSubstitutionRules.map { it.toDomain() },
    units = units.map { it.toDomain() },
    tags = tags.map { it.toDomain() },
    collections = collections.map { it.toDomain() },
    settings = settings.toDomain()
)

private fun RecipeLibrary.toDto(): LibraryDto = LibraryDto(
    metadata = metadata.toDto(),
    recipes = recipes.map { it.toDto() },
    ingredientReferences = ingredientReferences.map { it.toDto() },
    ingredientForms = ingredientForms.map { it.toDto() },
    substitutionRules = substitutionRules.map { it.toDto() },
    contextualSubstitutionRules = contextualSubstitutionRules.map { it.toDto() },
    units = units.map { it.toDto() },
    tags = tags.map { it.toDto() },
    collections = collections.map { it.toDto() },
    settings = settings.toDto()
)

private fun LibraryMetadataDto.toDomain(): LibraryMetadata = LibraryMetadata(
    libraryId = libraryId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    exportedAt = exportedAt,
    appVersion = appVersion,
    deviceId = deviceId
)

private fun LibraryMetadata.toDto(): LibraryMetadataDto = LibraryMetadataDto(
    libraryId = libraryId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    exportedAt = exportedAt,
    appVersion = appVersion,
    deviceId = deviceId
)

private fun IngredientReferenceDto.toDomain(): IngredientReference = IngredientReference(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    aliasesFr = aliasesFr,
    aliasesEn = aliasesEn,
    defaultDensity = defaultDensity,
    unitMappings = unitMappings.map { it.toDomain() },
    updatedAt = updatedAt
)

private fun IngredientReference.toDto(): IngredientReferenceDto = IngredientReferenceDto(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    aliasesFr = aliasesFr,
    aliasesEn = aliasesEn,
    defaultDensity = defaultDensity,
    unitMappings = unitMappings.map { it.toDto() },
    updatedAt = updatedAt
)

private fun IngredientFormDto.toDomain(): IngredientForm = IngredientForm(
    id = id,
    ingredientRefId = ingredientRefId,
    formCode = formCode,
    prepState = prepState,
    densityGPerMl = densityGPerMl,
    notesFr = notesFr,
    notesEn = notesEn,
    updatedAt = updatedAt
)

private fun IngredientForm.toDto(): IngredientFormDto = IngredientFormDto(
    id = id,
    ingredientRefId = ingredientRefId,
    formCode = formCode,
    prepState = prepState,
    densityGPerMl = densityGPerMl,
    notesFr = notesFr,
    notesEn = notesEn,
    updatedAt = updatedAt
)

private fun SubstitutionRuleDto.toDomain(): SubstitutionRule = SubstitutionRule(
    id = id,
    fromFormId = fromFormId,
    toFormId = toFormId,
    conversionType = conversionType.toSubstitutionConversionType(),
    ratio = ratio,
    offset = offset,
    sourceUnitScope = sourceUnitScope.toUnitScope(),
    targetUnitScope = targetUnitScope.toUnitScope(),
    minQty = minQty,
    maxQty = maxQty,
    confidence = confidence.toSubstitutionConfidence(),
    roundingPolicy = roundingPolicy,
    notesFr = notesFr,
    notesEn = notesEn,
    updatedAt = updatedAt
)

private fun SubstitutionRule.toDto(): SubstitutionRuleDto = SubstitutionRuleDto(
    id = id,
    fromFormId = fromFormId,
    toFormId = toFormId,
    conversionType = conversionType.toSchemaValue(),
    ratio = ratio,
    offset = offset,
    sourceUnitScope = sourceUnitScope.toSchemaValue(),
    targetUnitScope = targetUnitScope.toSchemaValue(),
    minQty = minQty,
    maxQty = maxQty,
    confidence = confidence.toSchemaValue(),
    roundingPolicy = roundingPolicy,
    notesFr = notesFr,
    notesEn = notesEn,
    updatedAt = updatedAt
)

private fun ContextualSubstitutionRuleDto.toDomain(): ContextualSubstitutionRule = ContextualSubstitutionRule(
    id = id,
    fromIngredientRefId = fromIngredientRefId,
    toIngredientRefId = toIngredientRefId,
    conversionType = conversionType.toSubstitutionConversionType(),
    ratio = ratio,
    offset = offset,
    allowedDishTypes = allowedDishTypes,
    excludedDishTypes = excludedDishTypes,
    allowedIngredientRoles = allowedIngredientRoles,
    excludedIngredientRoles = excludedIngredientRoles,
    allowedCookingMethods = allowedCookingMethods,
    severityIfMisused = severityIfMisused.toSubstitutionSeverity(),
    requiresUserConfirmation = requiresUserConfirmation,
    confidence = confidence.toSubstitutionConfidence(),
    notesFr = notesFr,
    notesEn = notesEn,
    updatedAt = updatedAt
)

private fun ContextualSubstitutionRule.toDto(): ContextualSubstitutionRuleDto = ContextualSubstitutionRuleDto(
    id = id,
    fromIngredientRefId = fromIngredientRefId,
    toIngredientRefId = toIngredientRefId,
    conversionType = conversionType.toSchemaValue(),
    ratio = ratio,
    offset = offset,
    allowedDishTypes = allowedDishTypes,
    excludedDishTypes = excludedDishTypes,
    allowedIngredientRoles = allowedIngredientRoles,
    excludedIngredientRoles = excludedIngredientRoles,
    allowedCookingMethods = allowedCookingMethods,
    severityIfMisused = severityIfMisused.toSchemaValue(),
    requiresUserConfirmation = requiresUserConfirmation,
    confidence = confidence.toSchemaValue(),
    notesFr = notesFr,
    notesEn = notesEn,
    updatedAt = updatedAt
)

private fun IngredientLineSubstitutionDto.toDomain(): IngredientLineSubstitution = IngredientLineSubstitution(
    id = id,
    ingredientLineId = ingredientLineId,
    substitutionRuleId = substitutionRuleId,
    contextualSubstitutionRuleId = contextualSubstitutionRuleId,
    isPreferred = isPreferred,
    customLabelFr = customLabelFr,
    customLabelEn = customLabelEn,
    createdAt = createdAt,
    updatedAt = updatedAt
)

private fun IngredientLineSubstitution.toDto(): IngredientLineSubstitutionDto = IngredientLineSubstitutionDto(
    id = id,
    ingredientLineId = ingredientLineId,
    substitutionRuleId = substitutionRuleId,
    contextualSubstitutionRuleId = contextualSubstitutionRuleId,
    isPreferred = isPreferred,
    customLabelFr = customLabelFr,
    customLabelEn = customLabelEn,
    createdAt = createdAt,
    updatedAt = updatedAt
)

private fun IngredientUnitMappingDto.toDomain(): IngredientUnitMapping = IngredientUnitMapping(
    fromUnit = fromUnit,
    toUnit = toUnit,
    factor = factor
)

private fun IngredientUnitMapping.toDto(): IngredientUnitMappingDto = IngredientUnitMappingDto(
    fromUnit = fromUnit,
    toUnit = toUnit,
    factor = factor
)

private fun UnitDefinitionDto.toDomain(): UnitDefinition = UnitDefinition(
    unitId = unitId,
    symbol = symbol,
    nameFr = nameFr,
    nameEn = nameEn,
    type = type.toUnitType(),
    baseUnitId = baseUnitId,
    toBaseFactor = toBaseFactor
)

private fun UnitDefinition.toDto(): UnitDefinitionDto = UnitDefinitionDto(
    unitId = unitId,
    symbol = symbol,
    nameFr = nameFr,
    nameEn = nameEn,
    type = type.toSchemaValue(),
    baseUnitId = baseUnitId,
    toBaseFactor = toBaseFactor
)

private fun TagDto.toDomain(): Tag = Tag(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    slug = slug
)

private fun Tag.toDto(): TagDto = TagDto(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    slug = slug
)

private fun CollectionDto.toDomain(): Collection = Collection(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    descriptionFr = descriptionFr,
    descriptionEn = descriptionEn,
    recipeIds = recipeIds,
    sortOrder = sortOrder?.toCollectionSortOrder()
)

private fun Collection.toDto(): CollectionDto = CollectionDto(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    descriptionFr = descriptionFr,
    descriptionEn = descriptionEn,
    recipeIds = recipeIds,
    sortOrder = sortOrder?.toSchemaValue()
)

private fun LibrarySettingsDto.toDomain(): LibrarySettings = LibrarySettings(
    language = language.toAppLanguage(),
    driveSyncEnabled = driveSyncEnabled,
    driveFileName = driveFileName,
    driveFolderId = driveFolderId,
    openSourceInAppBrowser = openSourceInAppBrowser
)

private fun LibrarySettings.toDto(): LibrarySettingsDto = LibrarySettingsDto(
    language = language.toSchemaValue(),
    driveSyncEnabled = driveSyncEnabled,
    driveFileName = driveFileName,
    driveFolderId = driveFolderId,
    openSourceInAppBrowser = openSourceInAppBrowser
)

private fun String.toAppLanguage(): AppLanguage = when (lowercase()) {
    "fr" -> AppLanguage.FR
    "en" -> AppLanguage.EN
    else -> error("Unsupported language value: $this")
}

private fun AppLanguage.toSchemaValue(): String = when (this) {
    AppLanguage.FR -> "fr"
    AppLanguage.EN -> "en"
}

private fun String.toUnitType(): UnitType = when (lowercase()) {
    "mass" -> UnitType.MASS
    "volume" -> UnitType.VOLUME
    "count" -> UnitType.COUNT
    "length" -> UnitType.LENGTH
    "temperature" -> UnitType.TEMPERATURE
    "other" -> UnitType.OTHER
    else -> error("Unsupported unit type value: $this")
}

private fun UnitType.toSchemaValue(): String = when (this) {
    UnitType.MASS -> "mass"
    UnitType.VOLUME -> "volume"
    UnitType.COUNT -> "count"
    UnitType.LENGTH -> "length"
    UnitType.TEMPERATURE -> "temperature"
    UnitType.OTHER -> "other"
}

private fun String.toSubstitutionConversionType(): SubstitutionConversionType = when (lowercase()) {
    "ratio" -> SubstitutionConversionType.RATIO
    "affine" -> SubstitutionConversionType.AFFINE
    "fixed_amount" -> SubstitutionConversionType.FIXED_AMOUNT
    else -> error("Unsupported substitution conversion type: $this")
}

private fun SubstitutionConversionType.toSchemaValue(): String = when (this) {
    SubstitutionConversionType.RATIO -> "ratio"
    SubstitutionConversionType.AFFINE -> "affine"
    SubstitutionConversionType.FIXED_AMOUNT -> "fixed_amount"
}

private fun String.toUnitScope(): UnitScope = when (lowercase()) {
    "mass" -> UnitScope.MASS
    "volume" -> UnitScope.VOLUME
    "count" -> UnitScope.COUNT
    "package" -> UnitScope.PACKAGE
    else -> error("Unsupported unit scope: $this")
}

private fun UnitScope.toSchemaValue(): String = when (this) {
    UnitScope.MASS -> "mass"
    UnitScope.VOLUME -> "volume"
    UnitScope.COUNT -> "count"
    UnitScope.PACKAGE -> "package"
}

private fun String.toSubstitutionConfidence(): SubstitutionConfidence = when (lowercase()) {
    "exact" -> SubstitutionConfidence.EXACT
    "tested" -> SubstitutionConfidence.TESTED
    "approximate" -> SubstitutionConfidence.APPROXIMATE
    else -> error("Unsupported substitution confidence: $this")
}

private fun SubstitutionConfidence.toSchemaValue(): String = when (this) {
    SubstitutionConfidence.EXACT -> "exact"
    SubstitutionConfidence.TESTED -> "tested"
    SubstitutionConfidence.APPROXIMATE -> "approximate"
}

private fun String.toSubstitutionSeverity(): SubstitutionSeverity = when (lowercase()) {
    "low" -> SubstitutionSeverity.LOW
    "medium" -> SubstitutionSeverity.MEDIUM
    "high" -> SubstitutionSeverity.HIGH
    else -> error("Unsupported substitution severity: $this")
}

private fun SubstitutionSeverity.toSchemaValue(): String = when (this) {
    SubstitutionSeverity.LOW -> "low"
    SubstitutionSeverity.MEDIUM -> "medium"
    SubstitutionSeverity.HIGH -> "high"
}

private fun String.toCollectionSortOrder(): CollectionSortOrder = when (lowercase()) {
    "manual" -> CollectionSortOrder.MANUAL
    "title_asc" -> CollectionSortOrder.TITLE_ASC
    "title_desc" -> CollectionSortOrder.TITLE_DESC
    "rating_desc" -> CollectionSortOrder.RATING_DESC
    "recent_desc" -> CollectionSortOrder.RECENT_DESC
    else -> error("Unsupported collection sort order: $this")
}

private fun CollectionSortOrder.toSchemaValue(): String = when (this) {
    CollectionSortOrder.MANUAL -> "manual"
    CollectionSortOrder.TITLE_ASC -> "title_asc"
    CollectionSortOrder.TITLE_DESC -> "title_desc"
    CollectionSortOrder.RATING_DESC -> "rating_desc"
    CollectionSortOrder.RECENT_DESC -> "recent_desc"
}
