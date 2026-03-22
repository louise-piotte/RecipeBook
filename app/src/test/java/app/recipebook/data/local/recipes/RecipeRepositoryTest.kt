package app.recipebook.data.local.recipes

import app.recipebook.data.local.db.IngredientReferenceDao
import app.recipebook.data.local.db.IngredientReferenceEntity
import app.recipebook.data.local.db.RecipeDao
import app.recipebook.data.local.db.RecipeEntity
import app.recipebook.data.local.db.TagDao
import app.recipebook.data.local.db.TagEntity
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.Tag
import app.recipebook.ui.recipes.normalizeMultilineText
import app.recipebook.ui.recipes.parseIngredients
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeRepositoryTest {

    @Test
    fun recipeEntityRoundTrip_preservesRecipeDetails() {
        val original = sampleRecipe(
            id = "recipe-round-trip",
            ingredient = IngredientLine(
                id = "ingredient-1",
                ingredientRefId = "ingredient-ref-all-purpose-flour",
                originalText = "2 cups flour",
                quantity = 2.0,
                unit = "cups",
                ingredientName = "all-purpose flour"
            )
        ).copy(languages = sampleRecipe(id = "recipe-round-trip").languages.copy(en = sampleRecipe(id = "recipe-round-trip").languages.en.copy(notes = "Note")))

        val roundTrip = original.toEntity().toDomainRecipe()

        assertEquals(original.languages.fr.title, roundTrip.languages.fr.title)
        assertEquals(original.ingredients.first().ingredientRefId, roundTrip.ingredients.first().ingredientRefId)
        assertEquals(original.ingredients.first().quantity, roundTrip.ingredients.first().quantity)
        assertEquals(original.languages.en.notes, roundTrip.languages.en.notes)
        assertEquals(original.mainPhotoId, roundTrip.mainPhotoId)
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
        val existingRecipe = sampleRecipe(id = "recipe-existing")
        fakeDao.upsert(existingRecipe.toEntity())
        val missingRecipe = sampleRecipe(id = "recipe-missing", titleEn = "Missing recipe")
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-all-purpose-flour",
            nameFr = "all-purpose flour",
            nameEn = "all-purpose flour",
            updatedAt = "2026-03-16T00:00:00Z"
        )
        val tag = Tag(id = "tag-dessert", nameFr = "Dessert", nameEn = "Dessert", slug = "dessert")
        val repository = RecipeRepository(
            recipeDao = fakeDao,
            ingredientReferenceDao = ingredientDao,
            tagDao = tagDao,
            seedLibrary = SeedLibraryData(
                recipes = listOf(existingRecipe, missingRecipe),
                ingredientReferences = listOf(ingredientReference),
                tags = listOf(tag)
            )
        )

        repository.seedBundledLibraryIfMissing()

        assertEquals(2, fakeDao.size())
        assertEquals("Missing recipe", fakeDao.stored("recipe-missing")?.titleEn)
        assertTrue(ingredientDao.items.containsKey("ingredient-ref-all-purpose-flour"))
        assertTrue(tagDao.items.containsKey("tag-dessert"))
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
        fakeDao.upsert(existingRecipe.toEntity())
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

        repository.seedBundledLibraryIfMissing()

        val stored = fakeDao.getById("seed-existing")!!.toDomainRecipe()
        assertEquals("User recipe", stored.languages.en.title)
        assertEquals("ingredient-ref-user-choice", stored.ingredients.first().ingredientRefId)
        assertEquals(listOf("tag-user"), stored.tagIds)
    }

    @Test
    fun recipeEntityRoundTrip_preservesUrlOnlySource() {
        val original = sampleRecipe(id = "recipe-source-only").copy(
            source = app.recipebook.domain.model.RecipeSource(
                sourceUrl = "https://example.com/recipe",
                sourceName = ""
            )
        )

        val roundTrip = original.toEntity().toDomainRecipe()

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
        val repository = RecipeRepository(
            recipeDao = FakeRecipeDao(),
            ingredientReferenceDao = ingredientDao,
            tagDao = tagDao
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

        assertEquals("Icing sugar", updatedIngredient.nameEn)
        assertEquals(listOf("sucre en poudre"), updatedIngredient.aliasesFr)
        assertEquals(listOf("powdered sugar", "confectioners sugar"), updatedIngredient.aliasesEn)
        assertEquals(IngredientCategory.BAKING_AND_SPICE, updatedIngredient.category)
        assertEquals(0.9, updatedIngredient.defaultDensity)
        assertEquals(1, updatedIngredient.unitMappings.size)
        assertEquals("Morning", updatedTag.nameEn)
        assertEquals("morning", updatedTag.slug)
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
    tagIds: List<String> = emptyList()
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
    tagIds = tagIds
)

private class FakeRecipeDao : RecipeDao {
    private val recipes = linkedMapOf<String, RecipeEntity>()

    override suspend fun upsert(recipe: RecipeEntity) {
        recipes[recipe.id] = recipe
    }

    override suspend fun upsertAll(recipes: List<RecipeEntity>) {
        recipes.forEach { recipe ->
            this.recipes[recipe.id] = recipe
        }
    }

    override suspend fun getById(id: String): RecipeEntity? = recipes[id]

    override fun observeById(id: String) = flowOf(recipes[id])

    override fun observeAll() = flowOf(recipes.values.toList())

    override fun observeByTitle(query: String) = flowOf(recipes.values.filter {
        it.titleFr.contains(query, ignoreCase = true) || it.titleEn.contains(query, ignoreCase = true)
    })

    override suspend fun countActive(): Int = recipes.values.count { it.deletedAt == null }

    override suspend fun deleteById(id: String) {
        recipes.remove(id)
    }

    fun stored(id: String): RecipeEntity? = recipes[id]

    fun size(): Int = recipes.size
}

private class FakeIngredientReferenceDao : IngredientReferenceDao {
    val items = linkedMapOf<String, IngredientReferenceEntity>()

    override suspend fun upsert(ingredientReference: IngredientReferenceEntity) {
        items[ingredientReference.id] = ingredientReference
    }

    override suspend fun upsertAll(ingredientReferences: List<IngredientReferenceEntity>) {
        ingredientReferences.forEach { items[it.id] = it }
    }

    override fun observeAll() = flowOf(items.values.toList())

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

    override fun observeAll() = flowOf(items.values.toList())

    override suspend fun getById(id: String): TagEntity? = items[id]
}


