package app.recipebook

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import app.recipebook.data.local.db.RecipeBookDatabase
import app.recipebook.data.local.db.RecipeEntity
import app.recipebook.data.local.recipes.RecipeRepository
import app.recipebook.data.local.recipes.SeedLibraryData
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.LocalizedSystemText
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InstrumentedTest {

    private lateinit var db: RecipeBookDatabase

    @Before
    fun setup() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context, RecipeBookDatabase::class.java)
            .allowMainThreadQueries()
            .build()
    }

    @After
    fun teardown() {
        db.close()
    }

    @Test
    fun recipeDao_upsertAndReadById_roundTrips() = runBlocking {
        val recipe = RecipeEntity(
            id = "recipe-1",
            createdAt = "2026-03-06T10:00:00Z",
            updatedAt = "2026-03-06T10:00:00Z",
            titleFr = "Crepes",
            titleEn = "Crepes",
            descriptionFr = "Description FR",
            descriptionEn = "EN description",
            instructionsFr = "Cuire 2 minutes",
            instructionsEn = "Cook 2 minutes",
            notesSystemFr = "",
            notesSystemEn = "",
            ingredientLinesJson = "[]",
            tagIdsJson = "[\"tag-1\"]",
            collectionIdsJson = "[]",
            photosJson = "[]",
            attachmentsJson = "[]"
        )

        db.recipeDao().upsert(recipe)

        val stored = db.recipeDao().getById("recipe-1")

        assertNotNull(stored)
        assertEquals("Crepes", stored?.titleFr)
        assertEquals("[\"tag-1\"]", stored?.tagIdsJson)
    }

    @Test
    fun recipeRepository_seedBundledRecipes_populatesDatabaseOnce() = runBlocking {
        val factoryRepository = RecipeRepository(db.recipeDao())
        val bundledRecipes = listOf(
            factoryRepository.createBlankRecipe("2026-03-13T10:00:00Z").copy(
                id = "seed-1",
                languages = BilingualText(
                    fr = LocalizedSystemText("Recette 1", "", "", ""),
                    en = LocalizedSystemText("Recipe 1", "", "", "")
                )
            ),
            factoryRepository.createBlankRecipe("2026-03-13T10:05:00Z").copy(
                id = "seed-2",
                languages = BilingualText(
                    fr = LocalizedSystemText("Recette 2", "", "", ""),
                    en = LocalizedSystemText("Recipe 2", "", "", "")
                )
            )
        )
        val repository = RecipeRepository(db.recipeDao(), seedLibrary = SeedLibraryData(recipes = bundledRecipes))

        repository.seedBundledRecipesIfMissing()
        repository.seedBundledRecipesIfMissing()

        val storedRecipes = db.recipeDao().observeAll().first()

        assertEquals(2, db.recipeDao().countActive())
        assertEquals(2, storedRecipes.size)
    }

    @Test
    fun recipeRepository_seedBundledRecipesIfMissing_addsOnlyMissingRecipes() = runBlocking {
        val existing = RecipeEntity(
            id = "seed-existing",
            createdAt = "2026-03-13T10:00:00Z",
            updatedAt = "2026-03-13T10:00:00Z",
            titleFr = "Recette deja stockee",
            titleEn = "Already Stored Recipe",
            descriptionFr = "Description FR",
            descriptionEn = "EN description",
            instructionsFr = "Une etape",
            instructionsEn = "One step",
            notesSystemFr = "",
            notesSystemEn = "",
            ingredientLinesJson = "[]",
            tagIdsJson = "[]",
            collectionIdsJson = "[]",
            photosJson = "[]",
            attachmentsJson = "[]"
        )
        db.recipeDao().upsert(existing)

        val factoryRepository = RecipeRepository(db.recipeDao())
        val bundledRecipes = listOf(
            factoryRepository.createBlankRecipe("2026-03-13T10:00:00Z").copy(
                id = "seed-existing",
                languages = BilingualText(
                    fr = LocalizedSystemText("Remplacement", "", "", ""),
                    en = LocalizedSystemText("Replacement", "", "", "")
                )
            ),
            factoryRepository.createBlankRecipe("2026-03-13T10:05:00Z").copy(
                id = "seed-missing",
                languages = BilingualText(
                    fr = LocalizedSystemText("Nouvelle graine", "", "", ""),
                    en = LocalizedSystemText("New Seed", "", "", "")
                )
            )
        )
        val repository = RecipeRepository(db.recipeDao(), seedLibrary = SeedLibraryData(recipes = bundledRecipes))

        repository.seedBundledRecipesIfMissing()

        val storedRecipes = db.recipeDao().observeAll().first()

        assertEquals(2, storedRecipes.size)
        assertEquals("Already Stored Recipe", db.recipeDao().getById("seed-existing")?.titleEn)
        assertEquals("New Seed", db.recipeDao().getById("seed-missing")?.titleEn)
    }

    @Test
    fun recipeRepository_upsertAndDeleteRecipe_updatesObservedRecipes() = runBlocking {
        val repository = RecipeRepository(db.recipeDao())
        val recipe = repository.createBlankRecipe("2026-03-13T14:00:00Z").copy(
            languages = BilingualText(
                fr = LocalizedSystemText("Nouvelle recette", "", "", ""),
                en = LocalizedSystemText("New Recipe", "", "", "")
            )
        )

        repository.upsertRecipe(recipe)
        val storedAfterInsert = repository.observeRecipes().first()

        assertEquals(1, storedAfterInsert.size)
        assertEquals("New Recipe", storedAfterInsert.first().languages.en.title)

        repository.deleteRecipeById(recipe.id)
        val storedAfterDelete = repository.observeRecipes().first()

        assertTrue(storedAfterDelete.isEmpty())
    }
}


