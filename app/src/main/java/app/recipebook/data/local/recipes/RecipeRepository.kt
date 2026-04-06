package app.recipebook.data.local.recipes

import android.util.Log
import app.recipebook.data.local.db.IngredientLineSubstitutionEntity
import app.recipebook.data.local.db.IngredientReferenceDao
import app.recipebook.data.local.db.IngredientReferenceEntity
import app.recipebook.data.local.db.IngredientLineWithSubstitutions
import app.recipebook.data.local.db.CollectionDao
import app.recipebook.data.local.db.CollectionEntity
import app.recipebook.data.local.db.RecipeDao
import app.recipebook.data.local.db.RecipeIngredientLineEntity
import app.recipebook.data.local.db.RecipeCollectionCrossRef
import app.recipebook.data.local.db.RecipeEntity
import app.recipebook.data.local.db.RecipeTagCrossRef
import app.recipebook.data.local.db.RecipeWithRelations
import app.recipebook.data.local.db.TagDao
import app.recipebook.data.local.db.TagEntity
import app.recipebook.domain.model.AttachmentRef
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.CollectionSortOrder
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
    private val collectionDao: CollectionDao = EmptyCollectionDao,
    private val seedLibrary: SeedLibraryData = SeedLibraryData(),
    private val seedLibraryLoader: (() -> SeedLibraryData)? = null
) {
    private var cachedSeedLibrary: SeedLibraryData = seedLibrary

    fun observeRecipes(): Flow<List<Recipe>> = recipeDao.observeAll().map { recipes ->
        recipes.map(RecipeWithRelations::toDomainRecipe)
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

    fun observeCollections(): Flow<List<Collection>> = collectionDao.observeAll().map { collections ->
        collections.map(CollectionEntity::toDomain)
    }

    suspend fun getRecipeById(id: String): Recipe? = recipeDao.getByIdWithRelations(id)?.toDomainRecipe()

    suspend fun upsertRecipe(recipe: Recipe) {
        val storage = recipe.toStorageGraph()
        recipeDao.replaceRecipeGraph(
            recipe = storage.recipe,
            ingredientLines = storage.ingredientLines,
            ingredientLineSubstitutions = storage.ingredientLineSubstitutions,
            tagRefs = storage.tagRefs,
            collectionRefs = storage.collectionRefs
        )
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

    suspend fun createCollection(draft: CollectionDraft): Collection {
        val collection = Collection(
            id = UUID.randomUUID().toString(),
            nameFr = draft.nameFr.trim(),
            nameEn = draft.nameEn.trim(),
            descriptionFr = draft.descriptionFr.trim().ifBlank { null },
            descriptionEn = draft.descriptionEn.trim().ifBlank { null }
        )
        collectionDao.upsert(collection.toEntity())
        return collection
    }

    suspend fun updateCollection(id: String, draft: CollectionDraft): Collection {
        val existing = collectionDao.getById(id)?.toDomain() ?: error("Collection $id not found")
        val collection = existing.copy(
            nameFr = draft.nameFr.trim(),
            nameEn = draft.nameEn.trim(),
            descriptionFr = draft.descriptionFr.trim().ifBlank { null },
            descriptionEn = draft.descriptionEn.trim().ifBlank { null }
        )
        collectionDao.upsert(collection.toEntity())
        return collection
    }

    suspend fun deleteCollection(id: String) {
        collectionDao.deleteRecipeRefsByCollectionId(id)
        collectionDao.deleteById(id)
    }

    suspend fun deleteRecipeById(id: String) {
        recipeDao.deleteById(id)
    }


    suspend fun seedBundledLibraryIfMissing() {
        val resolvedSeedLibrary = resolveSeedLibrary()
        if (resolvedSeedLibrary.isEmpty()) {
            Log.e(TAG, "Bundled library seeding skipped because no seed data could be loaded")
            return
        }

        resolvedSeedLibrary.recipes
            .distinctBy(Recipe::id)
            .forEach { seedRecipe ->
                if (recipeDao.getById(seedRecipe.id) == null) {
                    val storage = seedRecipe.toStorageGraph()
                    recipeDao.replaceRecipeGraph(
                        recipe = storage.recipe,
                        ingredientLines = storage.ingredientLines,
                        ingredientLineSubstitutions = storage.ingredientLineSubstitutions,
                        tagRefs = storage.tagRefs,
                        collectionRefs = storage.collectionRefs
                    )
                }
            }

        resolvedSeedLibrary.ingredientReferences
            .distinctBy(IngredientReference::id)
            .forEach { ingredientReference ->
                if (ingredientReferenceDao.getById(ingredientReference.id) == null) {
                    ingredientReferenceDao.upsert(ingredientReference.toEntity())
                }
            }

        resolvedSeedLibrary.tags
            .distinctBy(Tag::id)
            .forEach { tag ->
                if (tagDao.getById(tag.id) == null) {
                    tagDao.upsert(tag.toEntity())
                }
            }

        resolvedSeedLibrary.collections
            .distinctBy(Collection::id)
            .takeIf(List<Collection>::isNotEmpty)
            ?.let { collections ->
                collectionDao.upsertAll(collections.map(Collection::toEntity))
            }
    }

    private fun resolveSeedLibrary(): SeedLibraryData {
        if (!cachedSeedLibrary.isEmpty()) {
            return cachedSeedLibrary
        }

        val loadedSeedLibrary = seedLibraryLoader?.invoke() ?: SeedLibraryData()
        if (!loadedSeedLibrary.isEmpty()) {
            cachedSeedLibrary = loadedSeedLibrary
        }
        return loadedSeedLibrary
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

private const val TAG = "RecipeRepository"

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

data class CollectionDraft(
    val nameFr: String,
    val nameEn: String,
    val descriptionFr: String = "",
    val descriptionEn: String = ""
)

private fun SeedLibraryData.isEmpty(): Boolean =
    recipes.isEmpty() && ingredientReferences.isEmpty() && tags.isEmpty() && collections.isEmpty()

internal fun RecipeWithRelations.toDomainRecipe(): Recipe = Recipe(
    id = recipe.id,
    createdAt = recipe.createdAt,
    updatedAt = recipe.updatedAt,
    source = if (recipe.sourceUrl != null) {
        RecipeSource(sourceUrl = recipe.sourceUrl, sourceName = recipe.sourceName.orEmpty())
    } else {
        null
    },
    languages = BilingualText(
        fr = LocalizedSystemText(
            title = recipe.titleFr,
            description = recipe.descriptionFr,
            instructions = recipe.instructionsFr,
            notes = recipe.notesFr
        ),
        en = LocalizedSystemText(
            title = recipe.titleEn,
            description = recipe.descriptionEn,
            instructions = recipe.instructionsEn,
            notes = recipe.notesEn
        )
    ),
    ingredients = ingredientLines
        .sortedBy { it.ingredientLine.position }
        .map(IngredientLineWithSubstitutions::toDomain),
    servings = if (recipe.servingsAmount != null) {
        Servings(amount = recipe.servingsAmount, unit = recipe.servingsUnit)
    } else {
        null
    },
    times = if (recipe.prepTimeMinutes != null || recipe.cookTimeMinutes != null || recipe.totalTimeMinutes != null) {
        RecipeTimes(
            prepTimeMinutes = recipe.prepTimeMinutes,
            cookTimeMinutes = recipe.cookTimeMinutes,
            totalTimeMinutes = recipe.totalTimeMinutes
        )
    } else {
        null
    },
    tagIds = tagRefs.sortedBy(RecipeTagCrossRef::position).map(RecipeTagCrossRef::tagId),
    collectionIds = collectionRefs.sortedBy(RecipeCollectionCrossRef::position).map(RecipeCollectionCrossRef::collectionId),
    ratings = if (recipe.userRating != null || recipe.madeCount != null || recipe.lastMadeAt != null) {
        Ratings(userRating = recipe.userRating, madeCount = recipe.madeCount, lastMadeAt = recipe.lastMadeAt)
    } else {
        null
    },
    mainPhotoId = recipe.mainPhotoId,
    photos = storageJson.decodeFromString<List<StoredPhotoRef>>(recipe.photosJson).map(StoredPhotoRef::toDomain),
    attachments = storageJson.decodeFromString<List<StoredAttachmentRef>>(recipe.attachmentsJson).map(StoredAttachmentRef::toDomain),
    importMetadata = recipe.importMetadataJson?.let {
        storageJson.decodeFromString<StoredImportMetadata>(it).toDomain()
    },
    deletedAt = recipe.deletedAt
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
    photosJson = storageJson.encodeToString(photos.map(PhotoRef::toStored)),
    attachmentsJson = storageJson.encodeToString(attachments.map(AttachmentRef::toStored)),
    importMetadataJson = importMetadata?.let { storageJson.encodeToString(it.toStored()) }
)

private data class RecipeStorageGraph(
    val recipe: RecipeEntity,
    val ingredientLines: List<RecipeIngredientLineEntity>,
    val ingredientLineSubstitutions: List<IngredientLineSubstitutionEntity>,
    val tagRefs: List<RecipeTagCrossRef>,
    val collectionRefs: List<RecipeCollectionCrossRef>
)

private fun Recipe.toStorageGraph(): RecipeStorageGraph {
    val ingredientLines = ingredients.mapIndexed { index, ingredient ->
        ingredient.toEntity(recipeId = id, position = index)
    }
    val substitutions = ingredients.flatMap { ingredient ->
        ingredient.substitutions.mapIndexed { index, substitution ->
            substitution.toEntity(position = index)
        }
    }
    val tagRefs = tagIds.distinct().mapIndexed { index, tagId ->
        RecipeTagCrossRef(recipeId = id, tagId = tagId, position = index)
    }
    val collectionRefs = collectionIds.distinct().mapIndexed { index, collectionId ->
        RecipeCollectionCrossRef(recipeId = id, collectionId = collectionId, position = index)
    }

    return RecipeStorageGraph(
        recipe = toEntity(),
        ingredientLines = ingredientLines,
        ingredientLineSubstitutions = substitutions,
        tagRefs = tagRefs,
        collectionRefs = collectionRefs
    )
}

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

private fun CollectionEntity.toDomain(): Collection = Collection(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    descriptionFr = descriptionFr,
    descriptionEn = descriptionEn,
    recipeIds = storageJson.decodeFromString(recipeIdsJson),
    sortOrder = sortOrder?.let(::toCollectionSortOrder)
)

private fun Collection.toEntity(): CollectionEntity = CollectionEntity(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    descriptionFr = descriptionFr,
    descriptionEn = descriptionEn,
    recipeIdsJson = storageJson.encodeToString(recipeIds),
    sortOrder = sortOrder?.toStorageValue()
)

private val storageJson = Json {
    ignoreUnknownKeys = true
    encodeDefaults = true
}

private fun IngredientLineWithSubstitutions.toDomain(): IngredientLine = IngredientLine(
    id = ingredientLine.id,
    ingredientRefId = ingredientLine.ingredientRefId,
    originalText = ingredientLine.originalText,
    quantity = ingredientLine.quantity,
    unit = ingredientLine.unit,
    ingredientName = ingredientLine.ingredientName,
    preparation = ingredientLine.preparation,
    optional = ingredientLine.optional,
    notes = ingredientLine.notes,
    group = ingredientLine.group,
    substitutions = substitutions
        .sortedBy(IngredientLineSubstitutionEntity::position)
        .map(IngredientLineSubstitutionEntity::toDomain)
)

private fun IngredientLine.toEntity(recipeId: String, position: Int): RecipeIngredientLineEntity = RecipeIngredientLineEntity(
    id = id,
    recipeId = recipeId,
    position = position,
    ingredientRefId = ingredientRefId,
    originalText = originalText,
    quantity = quantity,
    unit = unit,
    ingredientName = ingredientName,
    preparation = preparation,
    optional = optional,
    notes = notes,
    group = group
)

private fun IngredientLineSubstitutionEntity.toDomain(): IngredientLineSubstitution = IngredientLineSubstitution(
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

private fun IngredientLineSubstitution.toEntity(position: Int): IngredientLineSubstitutionEntity = IngredientLineSubstitutionEntity(
    id = id,
    ingredientLineId = ingredientLineId,
    position = position,
    substitutionRuleId = substitutionRuleId,
    contextualSubstitutionRuleId = contextualSubstitutionRuleId,
    isPreferred = isPreferred,
    customLabelFr = customLabelFr,
    customLabelEn = customLabelEn,
    createdAt = createdAt,
    updatedAt = updatedAt
)

private fun toCollectionSortOrder(value: String): CollectionSortOrder = when (value) {
    "MANUAL" -> CollectionSortOrder.MANUAL
    "TITLE_ASC" -> CollectionSortOrder.TITLE_ASC
    "TITLE_DESC" -> CollectionSortOrder.TITLE_DESC
    "RATING_DESC" -> CollectionSortOrder.RATING_DESC
    "RECENT_DESC" -> CollectionSortOrder.RECENT_DESC
    else -> error("Unsupported collection sort order: $value")
}

private fun CollectionSortOrder.toStorageValue(): String = name

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

private object EmptyCollectionDao : CollectionDao {
    override suspend fun upsertAll(collections: List<CollectionEntity>) = Unit

    override suspend fun upsert(collection: CollectionEntity) = Unit

    override fun observeAll(): Flow<List<CollectionEntity>> = flowOf(emptyList())

    override suspend fun getById(id: String): CollectionEntity? = null

    override suspend fun deleteById(id: String) = Unit

    override suspend fun deleteRecipeRefsByCollectionId(collectionId: String) = Unit
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





























