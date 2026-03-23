package app.recipebook.data.local.recipes

import app.recipebook.data.local.db.IngredientReferenceDao
import app.recipebook.data.local.db.IngredientReferenceEntity
import app.recipebook.data.local.db.RecipeDao
import app.recipebook.data.local.db.RecipeEntity
import app.recipebook.data.local.db.TagDao
import app.recipebook.data.local.db.TagEntity
import app.recipebook.domain.model.AttachmentRef
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientLineSubstitution
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Ratings
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.RecipeTimes
import app.recipebook.domain.model.Servings
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import java.text.Normalizer
import java.time.Instant
import java.util.UUID
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class RecipeRepository(
    private val recipeDao: RecipeDao,
    private val ingredientReferenceDao: IngredientReferenceDao = EmptyIngredientReferenceDao,
    private val tagDao: TagDao = EmptyTagDao,
    private val seedLibrary: SeedLibraryData = SeedLibraryData()
) {
    fun observeRecipes(): Flow<List<Recipe>> = recipeDao.observeAll().map { recipes ->
        recipes.map(RecipeEntity::toDomainRecipe)
    }

    fun observeRecipeById(id: String): Flow<Recipe?> = recipeDao.observeById(id).map { entity ->
        entity?.toDomainRecipe()
    }

    fun observeIngredientReferences(): Flow<List<IngredientReference>> = ingredientReferenceDao.observeAll().map { refs ->
        refs.map(IngredientReferenceEntity::toDomain)
    }

    fun observeTags(): Flow<List<Tag>> = tagDao.observeAll().map { tags ->
        tags.map(TagEntity::toDomain)
    }

    suspend fun getRecipeById(id: String): Recipe? = recipeDao.getById(id)?.toDomainRecipe()

    suspend fun upsertRecipe(recipe: Recipe) {
        recipeDao.upsert(recipe.toEntity())
    }

    suspend fun createIngredientReference(
        draft: IngredientReferenceDraft,
        now: String = Instant.now().toString()
    ): IngredientReference {
        val normalizedNameFr = draft.nameFr.trim()
        val normalizedNameEn = draft.nameEn.trim()
        val ingredientReference = IngredientReference(
            id = UUID.randomUUID().toString(),
            nameFr = normalizedNameFr,
            nameEn = normalizedNameEn,
            category = draft.category,
            aliasesFr = normalizeAliases(draft.aliasesFr, normalizedNameFr, normalizedNameEn),
            aliasesEn = normalizeAliases(draft.aliasesEn, normalizedNameEn, normalizedNameFr),
            defaultDensity = draft.defaultDensity,
            unitMappings = draft.unitMappings,
            updatedAt = now
        )
        ingredientReferenceDao.upsert(ingredientReference.toEntity())
        return ingredientReference
    }

    suspend fun updateIngredientReference(
        id: String,
        draft: IngredientReferenceDraft,
        now: String = Instant.now().toString()
    ): IngredientReference {
        val existing = ingredientReferenceDao.getById(id)?.toDomain()
            ?: error("Ingredient reference $id not found")
        val normalizedNameFr = draft.nameFr.trim()
        val normalizedNameEn = draft.nameEn.trim()
        val ingredientReference = existing.copy(
            nameFr = normalizedNameFr,
            nameEn = normalizedNameEn,
            category = draft.category,
            aliasesFr = normalizeAliases(draft.aliasesFr, normalizedNameFr, normalizedNameEn),
            aliasesEn = normalizeAliases(draft.aliasesEn, normalizedNameEn, normalizedNameFr),
            defaultDensity = draft.defaultDensity,
            unitMappings = draft.unitMappings,
            updatedAt = now
        )
        ingredientReferenceDao.upsert(ingredientReference.toEntity())
        return ingredientReference
    }

    suspend fun createTag(draft: TagDraft): Tag {
        val baseName = draft.nameEn.trim().ifBlank { draft.nameFr.trim() }
        val tag = Tag(
            id = UUID.randomUUID().toString(),
            nameFr = draft.nameFr.trim(),
            nameEn = draft.nameEn.trim(),
            slug = slugify(baseName),
            category = draft.category ?: TagCategory.OTHER
        )
        tagDao.upsert(tag.toEntity())
        return tag
    }

    suspend fun updateTag(id: String, draft: TagDraft): Tag {
        val existing = tagDao.getById(id)?.toDomain() ?: error("Tag $id not found")
        val baseName = draft.nameEn.trim().ifBlank { draft.nameFr.trim() }
        val tag = existing.copy(
            nameFr = draft.nameFr.trim(),
            nameEn = draft.nameEn.trim(),
            slug = slugify(baseName),
            category = draft.category ?: existing.category
        )
        tagDao.upsert(tag.toEntity())
        return tag
    }

    suspend fun deleteRecipeById(id: String) {
        recipeDao.deleteById(id)
    }


    suspend fun seedBundledLibraryIfMissing() {
        seedLibrary.recipes
            .distinctBy(Recipe::id)
            .forEach { seedRecipe ->
                if (recipeDao.getById(seedRecipe.id) == null) {
                    recipeDao.upsert(seedRecipe.toEntity())
                }
            }

        seedLibrary.ingredientReferences
            .distinctBy(IngredientReference::id)
            .forEach { ingredientReference ->
                if (ingredientReferenceDao.getById(ingredientReference.id) == null) {
                    ingredientReferenceDao.upsert(ingredientReference.toEntity())
                }
            }

        seedLibrary.tags
            .distinctBy(Tag::id)
            .forEach { tag ->
                if (tagDao.getById(tag.id) == null) {
                    tagDao.upsert(tag.toEntity())
                }
            }
    }

    fun createBlankRecipe(now: String = Instant.now().toString()): Recipe = Recipe(
        id = UUID.randomUUID().toString(),
        createdAt = now,
        updatedAt = now,
        languages = BilingualText(
            fr = LocalizedSystemText(
                title = "",
                description = "",
                instructions = "",
                notes = ""
            ),
            en = LocalizedSystemText(
                title = "",
                description = "",
                instructions = "",
                notes = ""
            )
        ),
        ingredients = emptyList()
    )
}

data class IngredientReferenceDraft(
    val nameFr: String,
    val nameEn: String,
    val category: IngredientCategory = IngredientCategory.OTHER,
    val aliasesFr: List<String> = emptyList(),
    val aliasesEn: List<String> = emptyList(),
    val defaultDensity: Double? = null,
    val unitMappings: List<IngredientUnitMapping> = emptyList()
)

data class TagDraft(
    val nameFr: String,
    val nameEn: String,
    val category: TagCategory? = null
)

internal fun RecipeEntity.toDomainRecipe(): Recipe = Recipe(
    id = id,
    createdAt = createdAt,
    updatedAt = updatedAt,
    source = if (sourceUrl != null) {
        RecipeSource(sourceUrl = sourceUrl, sourceName = sourceName.orEmpty())
    } else {
        null
    },
    languages = BilingualText(
        fr = LocalizedSystemText(
            title = titleFr,
            description = descriptionFr,
            instructions = instructionsFr,
            notes = notesFr
        ),
        en = LocalizedSystemText(
            title = titleEn,
            description = descriptionEn,
            instructions = instructionsEn,
            notes = notesEn
        )
    ),
    ingredients = storageJson.decodeFromString<List<StoredIngredientLine>>(ingredientLinesJson).map(StoredIngredientLine::toDomain),
    servings = if (servingsAmount != null) {
        Servings(amount = servingsAmount, unit = servingsUnit)
    } else {
        null
    },
    times = if (prepTimeMinutes != null || cookTimeMinutes != null || totalTimeMinutes != null) {
        RecipeTimes(
            prepTimeMinutes = prepTimeMinutes,
            cookTimeMinutes = cookTimeMinutes,
            totalTimeMinutes = totalTimeMinutes
        )
    } else {
        null
    },
    tagIds = storageJson.decodeFromString(tagIdsJson),
    collectionIds = storageJson.decodeFromString(collectionIdsJson),
    ratings = if (userRating != null || madeCount != null || lastMadeAt != null) {
        Ratings(userRating = userRating, madeCount = madeCount, lastMadeAt = lastMadeAt)
    } else {
        null
    },
    mainPhotoId = mainPhotoId,
    photos = storageJson.decodeFromString<List<StoredPhotoRef>>(photosJson).map(StoredPhotoRef::toDomain),
    attachments = storageJson.decodeFromString<List<StoredAttachmentRef>>(attachmentsJson).map(StoredAttachmentRef::toDomain),
    importMetadata = importMetadataJson?.let {
        storageJson.decodeFromString<StoredImportMetadata>(it).toDomain()
    },
    deletedAt = deletedAt
)

internal fun Recipe.toEntity(): RecipeEntity = RecipeEntity(
    id = id,
    createdAt = createdAt,
    updatedAt = updatedAt,
    titleFr = languages.fr.title,
    titleEn = languages.en.title,
    descriptionFr = languages.fr.description,
    descriptionEn = languages.en.description,
    instructionsFr = languages.fr.instructions,
    instructionsEn = languages.en.instructions,
    notesFr = languages.fr.notes,
    notesEn = languages.en.notes,
    sourceUrl = source?.sourceUrl,
    sourceName = source?.sourceName,
    servingsAmount = servings?.amount,
    servingsUnit = servings?.unit,
    prepTimeMinutes = times?.prepTimeMinutes,
    cookTimeMinutes = times?.cookTimeMinutes,
    totalTimeMinutes = times?.totalTimeMinutes,
    userRating = ratings?.userRating,
    madeCount = ratings?.madeCount,
    lastMadeAt = ratings?.lastMadeAt,
    mainPhotoId = mainPhotoId,
    deletedAt = deletedAt,
    ingredientLinesJson = storageJson.encodeToString(ingredients.map(IngredientLine::toStored)),
    tagIdsJson = storageJson.encodeToString(tagIds),
    collectionIdsJson = storageJson.encodeToString(collectionIds),
    photosJson = storageJson.encodeToString(photos.map(PhotoRef::toStored)),
    attachmentsJson = storageJson.encodeToString(attachments.map(AttachmentRef::toStored)),
    importMetadataJson = importMetadata?.let { storageJson.encodeToString(it.toStored()) }
)

private fun IngredientReferenceEntity.toDomain(): IngredientReference = IngredientReference(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    category = IngredientCategory.valueOf(category),
    aliasesFr = storageJson.decodeFromString(aliasesFrJson),
    aliasesEn = storageJson.decodeFromString(aliasesEnJson),
    defaultDensity = defaultDensity,
    unitMappings = storageJson.decodeFromString<List<IngredientUnitMapping>>(unitMappingsJson),
    updatedAt = updatedAt
)

private fun IngredientReference.toEntity(): IngredientReferenceEntity = IngredientReferenceEntity(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    category = category.name,
    aliasesFrJson = storageJson.encodeToString(aliasesFr),
    aliasesEnJson = storageJson.encodeToString(aliasesEn),
    defaultDensity = defaultDensity,
    unitMappingsJson = storageJson.encodeToString(unitMappings),
    updatedAt = updatedAt
)

private fun TagEntity.toDomain(): Tag = Tag(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    slug = slug,
    category = TagCategory.valueOf(category)
)

private fun Tag.toEntity(): TagEntity = TagEntity(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    slug = slug,
    category = category.name
)

private val storageJson = Json {
    ignoreUnknownKeys = true
    encodeDefaults = true
}

@Serializable
private data class StoredIngredientLine(
    val id: String,
    val ingredientRefId: String? = null,
    val originalText: String,
    val quantity: Double? = null,
    val unit: String? = null,
    val ingredientName: String,
    val preparation: String? = null,
    val optional: Boolean = false,
    val notes: String? = null,
    val group: String? = null,
    val substitutions: List<StoredIngredientLineSubstitution> = emptyList()
) {
    fun toDomain(): IngredientLine = IngredientLine(
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
        substitutions = substitutions.map(StoredIngredientLineSubstitution::toDomain)
    )
}

private fun IngredientLine.toStored(): StoredIngredientLine = StoredIngredientLine(
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
    substitutions = substitutions.map(IngredientLineSubstitution::toStored)
)

@Serializable
private data class StoredIngredientLineSubstitution(
    val id: String,
    val ingredientLineId: String,
    val substitutionRuleId: String? = null,
    val contextualSubstitutionRuleId: String? = null,
    val isPreferred: Boolean = false,
    val customLabelFr: String? = null,
    val customLabelEn: String? = null,
    val createdAt: String,
    val updatedAt: String
) {
    fun toDomain(): IngredientLineSubstitution = IngredientLineSubstitution(
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
}

private fun IngredientLineSubstitution.toStored(): StoredIngredientLineSubstitution = StoredIngredientLineSubstitution(
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

@Serializable
private data class StoredPhotoRef(
    val id: String,
    val localPath: String,
    val cloudRef: String? = null
) {
    fun toDomain(): PhotoRef = PhotoRef(id = id, localPath = localPath, cloudRef = cloudRef)
}

private fun PhotoRef.toStored(): StoredPhotoRef = StoredPhotoRef(
    id = id,
    localPath = localPath,
    cloudRef = cloudRef
)

@Serializable
private data class StoredAttachmentRef(
    val id: String,
    val fileName: String,
    val mimeType: String,
    val localPath: String,
    val cloudRef: String? = null
) {
    fun toDomain(): AttachmentRef = AttachmentRef(
        id = id,
        fileName = fileName,
        mimeType = mimeType,
        localPath = localPath,
        cloudRef = cloudRef
    )
}

private fun AttachmentRef.toStored(): StoredAttachmentRef = StoredAttachmentRef(
    id = id,
    fileName = fileName,
    mimeType = mimeType,
    localPath = localPath,
    cloudRef = cloudRef
)

@Serializable
private data class StoredImportMetadata(
    val sourceType: String? = null,
    val parserVersion: String? = null,
    val originalUnits: String? = null
) {
    fun toDomain(): ImportMetadata = ImportMetadata(
        sourceType = sourceType,
        parserVersion = parserVersion,
        originalUnits = originalUnits
    )
}

private fun ImportMetadata.toStored(): StoredImportMetadata = StoredImportMetadata(
    sourceType = sourceType,
    parserVersion = parserVersion,
    originalUnits = originalUnits
)

private object EmptyIngredientReferenceDao : IngredientReferenceDao {
    override suspend fun upsert(ingredientReference: IngredientReferenceEntity) = Unit

    override suspend fun upsertAll(ingredientReferences: List<IngredientReferenceEntity>) = Unit

    override fun observeAll(): Flow<List<IngredientReferenceEntity>> = flowOf(emptyList())

    override suspend fun getById(id: String): IngredientReferenceEntity? = null
}

private object EmptyTagDao : TagDao {
    override suspend fun upsert(tag: TagEntity) = Unit

    override suspend fun upsertAll(tags: List<TagEntity>) = Unit

    override fun observeAll(): Flow<List<TagEntity>> = flowOf(emptyList())

    override suspend fun getById(id: String): TagEntity? = null
}

private fun slugify(input: String): String {
    val normalized = Normalizer.normalize(input.lowercase(), Normalizer.Form.NFD)
        .replace("\\p{M}+".toRegex(), "")
    return normalized
        .replace("[^a-z0-9]+".toRegex(), "-")
        .trim('-')
        .ifBlank { UUID.randomUUID().toString() }
}

private fun normalizeAliases(
    aliases: List<String>,
    primaryName: String,
    counterpartName: String
): List<String> {
    val excluded = setOf(primaryName, counterpartName)
        .map(String::trim)
        .filter(String::isNotEmpty)
        .map(String::lowercase)
        .toSet()
    val seen = linkedSetOf<String>()
    return aliases.mapNotNull { alias ->
        val normalized = alias.trim()
        if (normalized.isEmpty()) {
            null
        } else {
            val key = normalized.lowercase()
            if (key in excluded || !seen.add(key)) null else normalized
        }
    }
}





























