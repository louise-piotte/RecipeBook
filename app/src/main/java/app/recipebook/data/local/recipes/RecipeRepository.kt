package app.recipebook.data.local.recipes

import app.recipebook.data.local.db.RecipeDao
import app.recipebook.data.local.db.RecipeEntity
import app.recipebook.domain.model.AttachmentRef
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientLineSubstitution
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Ratings
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.RecipeTimes
import app.recipebook.domain.model.Servings
import app.recipebook.domain.model.UserNotes
import java.time.Instant
import java.util.UUID
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class RecipeRepository(
    private val recipeDao: RecipeDao,
    private val seedRecipes: List<Recipe> = PlaceholderRecipes.recipes
) {
    fun observeRecipes(): Flow<List<Recipe>> = recipeDao.observeAll().map { recipes ->
        recipes.map(RecipeEntity::toDomainRecipe)
    }

    fun observeRecipeById(id: String): Flow<Recipe?> = recipeDao.observeById(id).map { entity ->
        entity?.toDomainRecipe()
    }

    suspend fun getRecipeById(id: String): Recipe? = recipeDao.getById(id)?.toDomainRecipe()

    suspend fun upsertRecipe(recipe: Recipe) {
        recipeDao.upsert(recipe.toEntity())
    }

    suspend fun deleteRecipeById(id: String) {
        recipeDao.deleteById(id)
    }

    suspend fun seedPlaceholderRecipesIfEmpty() {
        if (recipeDao.countActive() > 0) {
            return
        }
        recipeDao.upsertAll(PlaceholderRecipes.recipes.map(Recipe::toEntity))
    }

    suspend fun seedBundledRecipesIfMissing() {
        val missingRecipes = seedRecipes
            .distinctBy(Recipe::id)
            .filter { recipeDao.getById(it.id) == null }

        if (missingRecipes.isEmpty()) {
            return
        }

        recipeDao.upsertAll(missingRecipes.map(Recipe::toEntity))
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
                notesSystem = ""
            ),
            en = LocalizedSystemText(
                title = "",
                description = "",
                instructions = "",
                notesSystem = ""
            )
        ),
        userNotes = UserNotes(fr = null, en = null),
        ingredients = emptyList()
    )
}

object PlaceholderRecipes {
    val recipes: List<Recipe> = listOf(
        Recipe(
            id = "recipe-placeholder-overnight-oats",
            createdAt = "2026-03-13T12:00:00Z",
            updatedAt = "2026-03-13T12:00:00Z",
            source = RecipeSource(
                sourceUrl = "https://example.com/overnight-oats",
                sourceName = "RecipeBook Sample"
            ),
            languages = BilingualText(
                fr = LocalizedSystemText(
                    title = "Gruau du lendemain aux pommes",
                    description = "Un dejeuner froid prepare la veille avec pommes, yogourt et cannelle.",
                    instructions = "Melanger le gruau, le yogourt et le lait. Ajouter la pomme et laisser reposer au refrigerateur toute la nuit.",
                    notesSystem = "Servir froid ou tiedir 30 secondes au micro-ondes."
                ),
                en = LocalizedSystemText(
                    title = "Apple Overnight Oats",
                    description = "A make-ahead cold breakfast with apples, yogurt, and cinnamon.",
                    instructions = "Stir together the oats, yogurt, and milk. Fold in the apple and refrigerate overnight.",
                    notesSystem = "Serve cold or warm for 30 seconds in the microwave."
                )
            ),
            userNotes = UserNotes(
                fr = null,
                en = "Add extra maple syrup if the apples are tart."
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "ingredient-oats-1",
                    originalText = "1 cup rolled oats",
                    quantity = 1.0,
                    unit = "cup",
                    ingredientName = "rolled oats"
                ),
                IngredientLine(
                    id = "ingredient-milk-1",
                    originalText = "3/4 cup milk",
                    quantity = 0.75,
                    unit = "cup",
                    ingredientName = "milk"
                ),
                IngredientLine(
                    id = "ingredient-apple-1",
                    originalText = "1 apple, diced",
                    quantity = 1.0,
                    unit = "count",
                    ingredientName = "apple",
                    preparation = "diced"
                )
            ),
            servings = Servings(amount = 2.0, unit = "bowls"),
            times = RecipeTimes(prepTimeMinutes = 10, totalTimeMinutes = 480),
            ratings = Ratings(userRating = 4.5, madeCount = 3, lastMadeAt = "2026-03-12")
        ),
        Recipe(
            id = "recipe-placeholder-sheet-pan",
            createdAt = "2026-03-13T12:05:00Z",
            updatedAt = "2026-03-13T12:05:00Z",
            source = RecipeSource(
                sourceUrl = "https://example.com/sheet-pan-salmon",
                sourceName = "RecipeBook Sample"
            ),
            languages = BilingualText(
                fr = LocalizedSystemText(
                    title = "Saumon et legumes sur une plaque",
                    description = "Un souper rapide au four avec saumon, pommes de terre et haricots verts.",
                    instructions = "Rotir les pommes de terre 15 minutes, ajouter le saumon et les haricots, puis cuire jusqu'a ce que le poisson soit cuit.",
                    notesSystem = "Verifier la cuisson du saumon a la partie la plus epaisse."
                ),
                en = LocalizedSystemText(
                    title = "Sheet Pan Salmon and Vegetables",
                    description = "A quick oven dinner with salmon, potatoes, and green beans.",
                    instructions = "Roast the potatoes for 15 minutes, add the salmon and beans, then bake until the fish flakes easily.",
                    notesSystem = "Check the salmon at the thickest part for doneness."
                )
            ),
            userNotes = UserNotes(
                fr = "Tres bon avec une sauce au yogourt et a l'aneth.",
                en = "Great with a yogurt-dill sauce."
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "ingredient-salmon-1",
                    originalText = "4 salmon fillets",
                    quantity = 4.0,
                    unit = "count",
                    ingredientName = "salmon fillets"
                ),
                IngredientLine(
                    id = "ingredient-potato-1",
                    originalText = "600 g potatoes",
                    quantity = 600.0,
                    unit = "g",
                    ingredientName = "potatoes"
                ),
                IngredientLine(
                    id = "ingredient-beans-1",
                    originalText = "300 g green beans",
                    quantity = 300.0,
                    unit = "g",
                    ingredientName = "green beans"
                )
            ),
            servings = Servings(amount = 4.0),
            times = RecipeTimes(prepTimeMinutes = 15, cookTimeMinutes = 25, totalTimeMinutes = 40),
            ratings = Ratings(userRating = 5.0, madeCount = 1)
        ),
        Recipe(
            id = "recipe-placeholder-muffins",
            createdAt = "2026-03-13T12:10:00Z",
            updatedAt = "2026-03-13T12:10:00Z",
            languages = BilingualText(
                fr = LocalizedSystemText(
                    title = "Muffins banane et chocolat",
                    description = "Des muffins tendres pour collations ou dejeuners rapides.",
                    instructions = "Melanger les ingredients humides, incorporer les ingredients secs, puis cuire jusqu'a ce qu'un cure-dents ressorte propre.",
                    notesSystem = "Laisser refroidir 10 minutes avant de demouler."
                ),
                en = LocalizedSystemText(
                    title = "Banana Chocolate Muffins",
                    description = "Soft muffins for snacks or quick breakfasts.",
                    instructions = "Whisk the wet ingredients, fold in the dry ingredients, and bake until a toothpick comes out clean.",
                    notesSystem = "Cool for 10 minutes before removing from the pan."
                )
            ),
            userNotes = UserNotes(
                fr = "Utiliser des mini pepites de chocolat pour une meilleure repartition.",
                en = null
            ),
            ingredients = listOf(
                IngredientLine(
                    id = "ingredient-banana-1",
                    originalText = "3 ripe bananas",
                    quantity = 3.0,
                    unit = "count",
                    ingredientName = "bananas"
                ),
                IngredientLine(
                    id = "ingredient-flour-1",
                    originalText = "250 g flour",
                    quantity = 250.0,
                    unit = "g",
                    ingredientName = "flour"
                ),
                IngredientLine(
                    id = "ingredient-chocolate-1",
                    originalText = "1 cup chocolate chips",
                    quantity = 1.0,
                    unit = "cup",
                    ingredientName = "chocolate chips"
                )
            ),
            servings = Servings(amount = 12.0, unit = "muffins"),
            times = RecipeTimes(prepTimeMinutes = 15, cookTimeMinutes = 22, totalTimeMinutes = 37),
            ratings = Ratings(userRating = 4.0, madeCount = 5, lastMadeAt = "2026-03-01")
        )
    )
}

internal fun RecipeEntity.toDomainRecipe(): Recipe = Recipe(
    id = id,
    createdAt = createdAt,
    updatedAt = updatedAt,
    source = if (sourceUrl != null && sourceName != null) {
        RecipeSource(sourceUrl = sourceUrl, sourceName = sourceName)
    } else {
        null
    },
    languages = BilingualText(
        fr = LocalizedSystemText(
            title = titleFr,
            description = descriptionFr,
            instructions = instructionsFr,
            notesSystem = notesSystemFr
        ),
        en = LocalizedSystemText(
            title = titleEn,
            description = descriptionEn,
            instructions = instructionsEn,
            notesSystem = notesSystemEn
        )
    ),
    userNotes = if (userNotesFr != null || userNotesEn != null) {
        UserNotes(fr = userNotesFr, en = userNotesEn)
    } else {
        null
    },
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
    notesSystemFr = languages.fr.notesSystem,
    notesSystemEn = languages.en.notesSystem,
    userNotesFr = userNotes?.fr,
    userNotesEn = userNotes?.en,
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
    deletedAt = deletedAt,
    ingredientLinesJson = storageJson.encodeToString(ingredients.map(IngredientLine::toStored)),
    tagIdsJson = storageJson.encodeToString(tagIds),
    collectionIdsJson = storageJson.encodeToString(collectionIds),
    photosJson = storageJson.encodeToString(photos.map(PhotoRef::toStored)),
    attachmentsJson = storageJson.encodeToString(attachments.map(AttachmentRef::toStored)),
    importMetadataJson = importMetadata?.let { storageJson.encodeToString(it.toStored()) }
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



