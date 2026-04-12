package app.recipebook.data.local.recipes

import app.recipebook.data.local.db.ContextualSubstitutionRuleDao
import app.recipebook.data.local.db.ContextualSubstitutionRuleEntity
import app.recipebook.data.local.db.IngredientLineSubstitutionEntity
import app.recipebook.data.local.db.IngredientReferenceDao
import app.recipebook.data.local.db.IngredientReferenceEntity
import app.recipebook.data.local.db.IngredientLineWithSubstitutions
import app.recipebook.data.local.db.CollectionDao
import app.recipebook.data.local.db.CollectionEntity
import app.recipebook.data.local.db.RecipeCollectionCrossRef
import app.recipebook.data.local.db.RecipeDao
import app.recipebook.data.local.db.RecipeEntity
import app.recipebook.data.local.db.RecipeIngredientLineEntity
import app.recipebook.data.local.db.RecipeLinkEntity
import app.recipebook.data.local.db.RecipeTagCrossRef
import app.recipebook.data.local.db.RecipeWithRelations
import app.recipebook.data.local.db.TagDao
import app.recipebook.data.local.db.TagEntity
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientLineSubstitution
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLink
import app.recipebook.domain.model.RecipeLinkType
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.Tag
import app.recipebook.ui.recipes.normalizeMultilineText
import app.recipebook.ui.recipes.parseIngredients
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

class RecipeRepositoryTest {

    @Test
    fun recipeStorageRoundTrip_preservesRecipeDetails() = runBlocking {
        val repository = RecipeRepository(FakeRecipeDao())
        val original = sampleRecipe(
            id = "recipe-round-trip",
            ingredient = IngredientLine(
                id = "ingredient-1",
                ingredientRefId = "ingredient-ref-all-purpose-flour",
                originalText = "2 cups flour",
                quantity = 2.0,
                unit = "cups",
                ingredientName = "all-purpose flour",
                substitutions = listOf(
                    IngredientLineSubstitution(
                        id = "substitution-1",
                        ingredientLineId = "ingredient-1",
                        substitutionRuleId = "rule-1",
                        isPreferred = true,
                        createdAt = "2026-03-13T10:00:00Z",
                        updatedAt = "2026-03-13T10:00:00Z"
                    )
                )
            )
        ).copy(
            languages = sampleRecipe(id = "recipe-round-trip").languages.copy(
                en = sampleRecipe(id = "recipe-round-trip").languages.en.copy(notes = "Note")
            ),
            collectionIds = listOf("collection-desserts")
        )

        repository.upsertRecipe(original)
        val roundTrip = repository.getRecipeById(original.id)!!

        assertEquals(original.languages.fr.title, roundTrip.languages.fr.title)
        assertEquals(original.ingredients.first().ingredientRefId, roundTrip.ingredients.first().ingredientRefId)
        assertEquals(original.ingredients.first().quantity, roundTrip.ingredients.first().quantity)
        assertEquals(original.ingredients.first().substitutions.single().substitutionRuleId, roundTrip.ingredients.first().substitutions.single().substitutionRuleId)
        assertEquals(original.languages.en.notes, roundTrip.languages.en.notes)
        assertEquals(original.mainPhotoId, roundTrip.mainPhotoId)
        assertEquals(original.tagIds, roundTrip.tagIds)
        assertEquals(original.collectionIds, roundTrip.collectionIds)
        assertEquals(original.recipeLinks, roundTrip.recipeLinks)
    }

    @Test
    fun upsertRecipe_rejectsSelfLinks() = runBlocking {
        val repository = RecipeRepository(FakeRecipeDao())
        val recipe = sampleRecipe(id = "recipe-self-link").copy(
            recipeLinks = listOf(
                RecipeLink(
                    id = "link-1",
                    targetRecipeId = "recipe-self-link",
                    linkType = RecipeLinkType.COMPONENT
                )
            )
        )

        try {
            repository.upsertRecipe(recipe)
            fail("Expected self-link validation to fail")
        } catch (expected: IllegalArgumentException) {
            assertTrue(expected.message?.contains("cannot target the same recipe") == true)
        }
    }

    @Test
    fun createBlankRecipe_returnsEditableSkeleton() {
        val recipe = RecipeRepository(FakeRecipeDao()).createBlankRecipe("2026-03-13T13:00:00Z")

        assertNotNull(recipe.id)
        assertEquals("2026-03-13T13:00:00Z", recipe.createdAt)
        assertEquals("", recipe.languages.fr.title)
        assertEquals("", recipe.languages.en.instructions)
        assertTrue(recipe.ingredients.isEmpty())
    }

    @Test
    fun seedBundledLibraryIfMissing_onlyInsertsMissingIds() = runBlocking {
        val fakeDao = FakeRecipeDao()
        val ingredientDao = FakeIngredientReferenceDao()
        val tagDao = FakeTagDao()
        val collectionDao = FakeCollectionDao()
        val repository = RecipeRepository(
            recipeDao = fakeDao,
            ingredientReferenceDao = ingredientDao,
            tagDao = tagDao,
            collectionDao = collectionDao,
            seedLibrary = SeedLibraryData(
                recipes = listOf(
                    sampleRecipe(id = "recipe-existing"),
                    sampleRecipe(id = "recipe-missing", titleEn = "Missing recipe")
                ),
                ingredientReferences = listOf(
                    IngredientReference(
                        id = "ingredient-ref-all-purpose-flour",
                        nameFr = "all-purpose flour",
                        nameEn = "all-purpose flour",
                        updatedAt = "2026-03-16T00:00:00Z"
                    )
                ),
                tags = listOf(Tag(id = "tag-dessert", nameFr = "Dessert", nameEn = "Dessert", slug = "dessert")),
                collections = listOf(
                    Collection(
                        id = "collection-family",
                        nameFr = "Famille",
                        nameEn = "Family"
                    )
                )
            )
        )

        repository.upsertRecipe(sampleRecipe(id = "recipe-existing"))
        repository.seedBundledLibraryIfMissing()

        assertEquals(2, fakeDao.size())
        assertEquals("Missing recipe", fakeDao.stored("recipe-missing")?.recipe?.titleEn)
        assertTrue(ingredientDao.items.containsKey("ingredient-ref-all-purpose-flour"))
        assertTrue(tagDao.items.containsKey("tag-dessert"))
        assertTrue(collectionDao.items.containsKey("collection-family"))
    }

    @Test
    fun seedBundledLibraryIfMissing_doesNotOverwriteExistingRecipe() = runBlocking {
        val fakeDao = FakeRecipeDao()
        val existingRecipe = sampleRecipe(
            id = "seed-existing",
            titleEn = "User recipe",
            ingredient = IngredientLine(
                id = "ingredient-1",
                ingredientRefId = "ingredient-ref-user-choice",
                originalText = "2 cups custom flour",
                quantity = 2.0,
                unit = "cups",
                ingredientName = "custom flour"
            ),
            tagIds = listOf("tag-user")
        )
        val repository = RecipeRepository(
            recipeDao = fakeDao,
            seedLibrary = SeedLibraryData(
                recipes = listOf(
                    sampleRecipe(
                        id = "seed-existing",
                        titleEn = "Bundled recipe",
                        ingredient = IngredientLine(
                            id = "ingredient-1",
                            ingredientRefId = "ingredient-ref-bundled",
                            originalText = "2 cups flour",
                            quantity = 2.0,
                            unit = "cups",
                            ingredientName = "all-purpose flour"
                        ),
                        tagIds = listOf("tag-bundled")
                    )
                )
            )
        )

        repository.upsertRecipe(existingRecipe)
        repository.seedBundledLibraryIfMissing()

        val stored = repository.getRecipeById("seed-existing")!!
        assertEquals("User recipe", stored.languages.en.title)
        assertEquals("ingredient-ref-user-choice", stored.ingredients.first().ingredientRefId)
        assertEquals(listOf("tag-user"), stored.tagIds)
    }

    @Test
    fun seedBundledLibraryIfMissing_loadsSeedLibraryOnDemandWhenInitialSeedIsEmpty() = runBlocking {
        val fakeDao = FakeRecipeDao()
        val ingredientDao = FakeIngredientReferenceDao()
        val tagDao = FakeTagDao()
        val collectionDao = FakeCollectionDao()
        var loaderCalls = 0
        val repository = RecipeRepository(
            recipeDao = fakeDao,
            ingredientReferenceDao = ingredientDao,
            tagDao = tagDao,
            collectionDao = collectionDao,
            seedLibraryLoader = {
                loaderCalls += 1
                SeedLibraryData(
                    recipes = listOf(sampleRecipe(id = "recipe-loaded", titleEn = "Loaded recipe")),
                    ingredientReferences = listOf(
                        IngredientReference(
                            id = "ingredient-ref-loaded",
                            nameFr = "Sucre",
                            nameEn = "Sugar",
                            updatedAt = "2026-03-27T00:00:00Z"
                        )
                    ),
                    tags = listOf(Tag(id = "tag-loaded", nameFr = "Dessert", nameEn = "Dessert", slug = "dessert")),
                    collections = listOf(
                        Collection(
                            id = "collection-loaded",
                            nameFr = "Charg\u00e9",
                            nameEn = "Loaded"
                        )
                    )
                )
            }
        )

        repository.seedBundledLibraryIfMissing()

        assertEquals(1, loaderCalls)
        assertEquals("Loaded recipe", fakeDao.stored("recipe-loaded")?.recipe?.titleEn)
        assertTrue(ingredientDao.items.containsKey("ingredient-ref-loaded"))
        assertTrue(tagDao.items.containsKey("tag-loaded"))
        assertTrue(collectionDao.items.containsKey("collection-loaded"))
    }

    @Test
    fun recipeStorageRoundTrip_preservesUrlOnlySource() = runBlocking {
        val repository = RecipeRepository(FakeRecipeDao())
        val original = sampleRecipe(id = "recipe-source-only").copy(
            source = RecipeSource(
                sourceUrl = "https://example.com/recipe",
                sourceName = ""
            )
        )

        repository.upsertRecipe(original)
        val roundTrip = repository.getRecipeById(original.id)!!

        assertEquals("https://example.com/recipe", roundTrip.source?.sourceUrl)
        assertEquals("", roundTrip.source?.sourceName)
    }

    @Test
    fun createReusableIngredientAndTag_persistsNormalizedValues() = runBlocking {
        val ingredientDao = FakeIngredientReferenceDao()
        val tagDao = FakeTagDao()
        val repository = RecipeRepository(
            recipeDao = FakeRecipeDao(),
            ingredientReferenceDao = ingredientDao,
            tagDao = tagDao
        )

        val ingredient = repository.createIngredientReference(
            IngredientReferenceDraft(
                nameFr = " Sucre ",
                nameEn = " Sugar ",
                aliasesFr = listOf(" sucre blanc ", "Sucre", "sucre blanc"),
                aliasesEn = listOf(" white sugar ", "Sugar", "White Sugar"),
                category = IngredientCategory.SUGAR_AND_SWEETENER,
                defaultDensity = 0.85,
                unitMappings = listOf(IngredientUnitMapping("cup", "g", 200.0))
            ),
            now = "2026-03-16T10:00:00Z"
        )
        val tag = repository.createTag(TagDraft(nameFr = " Dejeuner ", nameEn = " Breakfast "))

        assertEquals("Sucre", ingredient.nameFr)
        assertEquals("Sugar", ingredient.nameEn)
        assertEquals(listOf("sucre blanc"), ingredient.aliasesFr)
        assertEquals(listOf("white sugar"), ingredient.aliasesEn)
        assertEquals(IngredientCategory.SUGAR_AND_SWEETENER, ingredient.category)
        assertEquals(1, ingredientDao.items.size)
        assertEquals(
            listOf("sucre blanc"),
            Json.decodeFromString<List<String>>(ingredientDao.items.values.single().aliasesFrJson)
        )
        assertEquals(
            listOf("white sugar"),
            Json.decodeFromString<List<String>>(ingredientDao.items.values.single().aliasesEnJson)
        )
        assertEquals("breakfast", tag.slug)
        assertEquals(1, tagDao.items.size)
    }

    @Test
    fun updateIngredientReferenceAndTag_persistEditedValues() = runBlocking {
        val ingredientDao = FakeIngredientReferenceDao()
        val tagDao = FakeTagDao()
        val collectionDao = FakeCollectionDao()
        val repository = RecipeRepository(
            recipeDao = FakeRecipeDao(),
            ingredientReferenceDao = ingredientDao,
            tagDao = tagDao,
            collectionDao = collectionDao
        )
        ingredientDao.upsert(
            IngredientReferenceEntity(
                id = "ingredient-ref-sugar",
                nameFr = "Sucre",
                nameEn = "Sugar",
                updatedAt = "2026-03-16T09:00:00Z"
            )
        )
        tagDao.upsert(TagEntity(id = "tag-breakfast", nameFr = "Breakfast", nameEn = "Breakfast", slug = "breakfast"))
        collectionDao.upsert(
            CollectionEntity(
                id = "collection-breakfast",
                nameFr = "Matin",
                nameEn = "Breakfast"
            )
        )

        val updatedIngredient = repository.updateIngredientReference(
            id = "ingredient-ref-sugar",
            draft = IngredientReferenceDraft(
                nameFr = "Sucre a glacer",
                nameEn = "Icing sugar",
                aliasesFr = listOf("sucre en poudre", "Sucre a glacer"),
                aliasesEn = listOf("powdered sugar", "confectioners sugar", "Icing sugar"),
                category = IngredientCategory.BAKING_AND_SPICE,
                defaultDensity = 0.9,
                unitMappings = listOf(IngredientUnitMapping("cup", "g", 120.0))
            ),
            now = "2026-03-16T11:00:00Z"
        )
        val updatedTag = repository.updateTag(
            id = "tag-breakfast",
            draft = TagDraft(nameFr = "Dejeuner", nameEn = "Morning")
        )
        val updatedCollection = repository.updateCollection(
            id = "collection-breakfast",
            draft = CollectionDraft(
                nameFr = "Brunch",
                nameEn = "Brunch",
                descriptionFr = "Fin de semaine",
                descriptionEn = "Weekend"
            )
        )

        assertEquals("Icing sugar", updatedIngredient.nameEn)
        assertEquals(listOf("sucre en poudre"), updatedIngredient.aliasesFr)
        assertEquals(listOf("powdered sugar", "confectioners sugar"), updatedIngredient.aliasesEn)
        assertEquals(IngredientCategory.BAKING_AND_SPICE, updatedIngredient.category)
        assertEquals(0.9, updatedIngredient.defaultDensity)
        assertEquals(1, updatedIngredient.unitMappings.size)
        assertEquals("Morning", updatedTag.nameEn)
        assertEquals("morning", updatedTag.slug)
        assertEquals("Brunch", updatedCollection.nameEn)
        assertEquals("Weekend", updatedCollection.descriptionEn)
    }

    @Test
    fun createAndDeleteCollection_persistsAndRemovesCollection() = runBlocking {
        val collectionDao = FakeCollectionDao()
        val repository = RecipeRepository(
            recipeDao = FakeRecipeDao(),
            collectionDao = collectionDao
        )

        val created = repository.createCollection(
            CollectionDraft(
                nameFr = "Desserts",
                nameEn = "Desserts"
            )
        )

        assertTrue(collectionDao.items.containsKey(created.id))

        repository.deleteCollection(created.id)

        assertFalse(collectionDao.items.containsKey(created.id))
        assertEquals(listOf(created.id), collectionDao.deletedRecipeRefCollectionIds)
    }

    @Test
    fun createUpdateAndDeleteIngredientSubstitution_persistsIngredientOwnedRules() = runBlocking {
        val ingredientDao = FakeIngredientReferenceDao()
        val substitutionDao = FakeContextualSubstitutionRuleDao()
        val repository = RecipeRepository(
            recipeDao = FakeRecipeDao(),
            ingredientReferenceDao = ingredientDao,
            contextualSubstitutionRuleDao = substitutionDao
        )
        ingredientDao.upsert(
            IngredientReferenceEntity(
                id = "ingredient-ref-butter",
                nameFr = "Beurre non sal\u00e9",
                nameEn = "Unsalted butter",
                updatedAt = "2026-04-10T09:00:00Z"
            )
        )
        ingredientDao.upsert(
            IngredientReferenceEntity(
                id = "ingredient-ref-salted-butter",
                nameFr = "Beurre sal\u00e9",
                nameEn = "Salted butter",
                updatedAt = "2026-04-10T09:00:00Z"
            )
        )

        val created = repository.createIngredientSubstitution(
            IngredientSubstitutionDraft(
                fromIngredientRefId = "ingredient-ref-butter",
                toIngredientRefId = "ingredient-ref-salted-butter",
                ratio = 1.0,
                riskLevel = SubstitutionRiskLevel.CAUTION,
                notesFr = "R\u00e9duire le sel ailleurs.",
                notesEn = "Reduce salt elsewhere.",
                allowedDishTypes = listOf("sauce")
            ),
            now = "2026-04-10T10:00:00Z"
        )

        assertEquals(1, substitutionDao.items.size)
        assertEquals("ingredient-ref-butter", created.fromIngredientRefId)
        assertEquals(listOf("sauce"), created.allowedDishTypes)

        val updated = repository.updateIngredientSubstitution(
            id = created.id,
            draft = IngredientSubstitutionDraft(
                fromIngredientRefId = "ingredient-ref-butter",
                toIngredientRefId = "ingredient-ref-salted-butter",
                ratio = 1.5,
                riskLevel = SubstitutionRiskLevel.HIGH_RISK,
                notesFr = "Seulement si la sauce reste sal\u00e9e.",
                notesEn = "Only if the sauce still needs salt.",
                warningTextFr = "Go\u00fbter avant d'ajouter du sel.",
                warningTextEn = "Taste before adding salt.",
                allowedDishTypes = listOf("sauce", "soup")
            ),
            now = "2026-04-10T11:00:00Z"
        )

        assertEquals(1.5, updated.ratio)
        assertEquals(SubstitutionRiskLevel.HIGH_RISK, updated.riskLevel)
        assertEquals("Taste before adding salt.", substitutionDao.items[created.id]?.warningTextEn)

        repository.deleteIngredientSubstitution(created.id)

        assertTrue(created.id in substitutionDao.deletedIds)
        assertNull(substitutionDao.items[created.id])
    }

    @Test
    fun createIngredientSubstitution_requiresWarningsForHighRiskRules() = runBlocking {
        val ingredientDao = FakeIngredientReferenceDao()
        val repository = RecipeRepository(
            recipeDao = FakeRecipeDao(),
            ingredientReferenceDao = ingredientDao,
            contextualSubstitutionRuleDao = FakeContextualSubstitutionRuleDao()
        )
        ingredientDao.upsert(
            IngredientReferenceEntity(
                id = "ingredient-ref-flour",
                nameFr = "Farine",
                nameEn = "Flour",
                updatedAt = "2026-04-10T09:00:00Z"
            )
        )
        ingredientDao.upsert(
            IngredientReferenceEntity(
                id = "ingredient-ref-cornstarch",
                nameFr = "F\u00e9cule de ma\u00efs",
                nameEn = "Cornstarch",
                updatedAt = "2026-04-10T09:00:00Z"
            )
        )

        try {
            repository.createIngredientSubstitution(
                IngredientSubstitutionDraft(
                    fromIngredientRefId = "ingredient-ref-flour",
                    toIngredientRefId = "ingredient-ref-cornstarch",
                    ratio = 0.5,
                    riskLevel = SubstitutionRiskLevel.HIGH_RISK
                )
            )
            fail("Expected high-risk ingredient substitutions without warnings to be rejected")
        } catch (_: IllegalArgumentException) {
        }
    }

    @Test
    fun parseIngredients_createsOneIngredientPerLine() {
        val ingredients = parseIngredients("1 cup flour\n\n2 eggs\n pinch salt ")

        assertEquals(3, ingredients.size)
        assertEquals("1 cup flour", ingredients[0].originalText)
        assertEquals("flour", ingredients[0].ingredientName)
        assertEquals("salt", ingredients[2].ingredientName)
    }

    @Test
    fun normalizeMultilineText_ignoresBlankLines() {
        val normalized = normalizeMultilineText("Step one\n   \nStep two\n")

        assertEquals("Step one\nStep two", normalized)
    }
}

private fun sampleRecipe(
    id: String,
    titleEn: String = "Recipe",
    ingredient: IngredientLine = IngredientLine(
        id = "ingredient-1",
        originalText = "1 cup flour",
        ingredientName = "flour"
    ),
    tagIds: List<String> = emptyList(),
    recipeLinks: List<RecipeLink> = emptyList()
): Recipe = Recipe(
    id = id,
    createdAt = "2026-03-13T10:00:00Z",
    updatedAt = "2026-03-13T10:00:00Z",
    languages = BilingualText(
        fr = LocalizedSystemText(titleEn, "", "", ""),
        en = LocalizedSystemText(titleEn, "", "", "")
    ),
    ingredients = listOf(ingredient),
    mainPhotoId = "photo-main",
    photos = listOf(PhotoRef("photo-main", "C:/photos/photo-main.jpg")),
    tagIds = tagIds,
    recipeLinks = recipeLinks
)

private class FakeRecipeDao : RecipeDao() {
    private val recipes = linkedMapOf<String, RecipeEntity>()
    private val ingredientLines = linkedMapOf<String, RecipeIngredientLineEntity>()
    private val substitutions = linkedMapOf<String, IngredientLineSubstitutionEntity>()
    private val recipeLinks = linkedMapOf<String, MutableList<RecipeLinkEntity>>()
    private val tagRefs = linkedMapOf<String, MutableList<RecipeTagCrossRef>>()
    private val collectionRefs = linkedMapOf<String, MutableList<RecipeCollectionCrossRef>>()

    override suspend fun upsert(recipe: RecipeEntity) {
        recipes[recipe.id] = recipe
    }

    override suspend fun upsertAll(recipes: List<RecipeEntity>) {
        recipes.forEach { recipe -> this.recipes[recipe.id] = recipe }
    }

    override suspend fun upsertIngredientLines(lines: List<RecipeIngredientLineEntity>) {
        lines.forEach { line -> ingredientLines[line.id] = line }
    }

    override suspend fun upsertIngredientLineSubstitutions(substitutions: List<IngredientLineSubstitutionEntity>) {
        substitutions.forEach { substitution -> this.substitutions[substitution.id] = substitution }
    }

    override suspend fun upsertRecipeLinks(recipeLinks: List<RecipeLinkEntity>) {
        recipeLinks.groupBy(RecipeLinkEntity::recipeId).forEach { (recipeId, links) ->
            this.recipeLinks[recipeId] = links.sortedBy(RecipeLinkEntity::position).toMutableList()
        }
    }

    override suspend fun upsertRecipeTagRefs(tagRefs: List<RecipeTagCrossRef>) {
        tagRefs.groupBy(RecipeTagCrossRef::recipeId).forEach { (recipeId, refs) ->
            this.tagRefs[recipeId] = refs.sortedBy(RecipeTagCrossRef::position).toMutableList()
        }
    }

    override suspend fun upsertRecipeCollectionRefs(collectionRefs: List<RecipeCollectionCrossRef>) {
        collectionRefs.groupBy(RecipeCollectionCrossRef::recipeId).forEach { (recipeId, refs) ->
            this.collectionRefs[recipeId] = refs.sortedBy(RecipeCollectionCrossRef::position).toMutableList()
        }
    }

    override suspend fun deleteTagRefsByRecipeId(recipeId: String) {
        tagRefs.remove(recipeId)
    }

    override suspend fun deleteCollectionRefsByRecipeId(recipeId: String) {
        collectionRefs.remove(recipeId)
    }

    override suspend fun deleteIngredientLinesByRecipeId(recipeId: String) {
        val deletedLineIds = ingredientLines.values
            .filter { it.recipeId == recipeId }
            .map(RecipeIngredientLineEntity::id)
            .toSet()
        ingredientLines.entries.removeIf { it.value.recipeId == recipeId }
        substitutions.entries.removeIf { it.value.ingredientLineId in deletedLineIds }
    }

    override suspend fun deleteRecipeLinksByRecipeId(recipeId: String) {
        recipeLinks.remove(recipeId)
    }

    override suspend fun getById(id: String): RecipeEntity? = recipes[id]

    override suspend fun getByIdWithRelations(id: String): RecipeWithRelations? = relationFor(id)

    override fun observeById(id: String): Flow<RecipeWithRelations?> = flowOf(relationFor(id))

    override fun observeAll(): Flow<List<RecipeWithRelations>> = flowOf(
        recipes.values
            .filter { it.deletedAt == null }
            .sortedByDescending(RecipeEntity::updatedAt)
            .mapNotNull { relationFor(it.id) }
    )

    override fun observeByTitle(query: String): Flow<List<RecipeWithRelations>> = flowOf(
        recipes.values
            .filter { it.deletedAt == null }
            .filter { recipe ->
                recipe.titleFr.contains(query, ignoreCase = true) ||
                    recipe.titleEn.contains(query, ignoreCase = true) ||
                    recipe.instructionsFr.contains(query, ignoreCase = true) ||
                    recipe.instructionsEn.contains(query, ignoreCase = true) ||
                    ingredientLines.values
                        .filter { it.recipeId == recipe.id }
                        .any { line ->
                            line.originalText.contains(query, ignoreCase = true) ||
                                line.ingredientName.contains(query, ignoreCase = true)
                        }
            }
            .sortedByDescending(RecipeEntity::updatedAt)
            .mapNotNull { relationFor(it.id) }
    )

    override suspend fun countActive(): Int = recipes.values.count { it.deletedAt == null }

    override suspend fun deleteById(id: String) {
        recipes.remove(id)
        deleteIngredientLinesByRecipeId(id)
        deleteRecipeLinksByRecipeId(id)
        deleteTagRefsByRecipeId(id)
        deleteCollectionRefsByRecipeId(id)
    }

    fun stored(id: String): RecipeWithRelations? = relationFor(id)

    fun size(): Int = recipes.size

    private fun relationFor(id: String): RecipeWithRelations? {
        val recipe = recipes[id] ?: return null
        val ingredientLineRelations = ingredientLines.values
            .filter { it.recipeId == id }
            .sortedBy(RecipeIngredientLineEntity::position)
            .map { line ->
                IngredientLineWithSubstitutions(
                    ingredientLine = line,
                    substitutions = substitutions.values
                        .filter { it.ingredientLineId == line.id }
                        .sortedBy(IngredientLineSubstitutionEntity::position)
                )
            }
        return RecipeWithRelations(
            recipe = recipe,
            ingredientLines = ingredientLineRelations,
            recipeLinks = recipeLinks[id].orEmpty().sortedBy(RecipeLinkEntity::position),
            tagRefs = tagRefs[id].orEmpty().sortedBy(RecipeTagCrossRef::position),
            collectionRefs = collectionRefs[id].orEmpty().sortedBy(RecipeCollectionCrossRef::position)
        )
    }
}

private class FakeIngredientReferenceDao : IngredientReferenceDao {
    val items = linkedMapOf<String, IngredientReferenceEntity>()

    override suspend fun upsert(ingredientReference: IngredientReferenceEntity) {
        items[ingredientReference.id] = ingredientReference
    }

    override suspend fun upsertAll(ingredientReferences: List<IngredientReferenceEntity>) {
        ingredientReferences.forEach { items[it.id] = it }
    }

    override fun observeAll(): Flow<List<IngredientReferenceEntity>> = flowOf(items.values.toList())

    override suspend fun getById(id: String): IngredientReferenceEntity? = items[id]
}

private class FakeTagDao : TagDao {
    val items = linkedMapOf<String, TagEntity>()

    override suspend fun upsert(tag: TagEntity) {
        items[tag.id] = tag
    }

    override suspend fun upsertAll(tags: List<TagEntity>) {
        tags.forEach { items[it.id] = it }
    }

    override fun observeAll(): Flow<List<TagEntity>> = flowOf(items.values.toList())

    override suspend fun getById(id: String): TagEntity? = items[id]
}

private class FakeContextualSubstitutionRuleDao : ContextualSubstitutionRuleDao {
    val items = linkedMapOf<String, ContextualSubstitutionRuleEntity>()
    val deletedIds = mutableListOf<String>()

    override suspend fun upsert(rule: ContextualSubstitutionRuleEntity) {
        items[rule.id] = rule
    }

    override suspend fun upsertAll(rules: List<ContextualSubstitutionRuleEntity>) {
        rules.forEach { items[it.id] = it }
    }

    override fun observeAll(): Flow<List<ContextualSubstitutionRuleEntity>> = flowOf(items.values.toList())

    override fun observeBySourceIngredientId(ingredientRefId: String): Flow<List<ContextualSubstitutionRuleEntity>> =
        flowOf(items.values.filter { it.fromIngredientRefId == ingredientRefId })

    override suspend fun getById(id: String): ContextualSubstitutionRuleEntity? = items[id]

    override suspend fun deleteById(id: String) {
        deletedIds += id
        items.remove(id)
    }
}

private class FakeCollectionDao : CollectionDao {
    val items = linkedMapOf<String, CollectionEntity>()
    val deletedRecipeRefCollectionIds = mutableListOf<String>()

    override suspend fun upsertAll(collections: List<CollectionEntity>) {
        collections.forEach { items[it.id] = it }
    }

    override suspend fun upsert(collection: CollectionEntity) {
        items[collection.id] = collection
    }

    override fun observeAll(): Flow<List<CollectionEntity>> = flowOf(items.values.toList())

    override suspend fun getById(id: String): CollectionEntity? = items[id]

    override suspend fun deleteById(id: String) {
        items.remove(id)
    }

    override suspend fun deleteRecipeRefsByCollectionId(collectionId: String) {
        deletedRecipeRefCollectionIds += collectionId
    }
}
