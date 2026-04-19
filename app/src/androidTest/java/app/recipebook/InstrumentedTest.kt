package app.recipebook

import androidx.room.Room
import androidx.room.withTransaction
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import app.recipebook.data.local.db.RecipeBookDatabase
import app.recipebook.data.local.db.RecipeCollectionCrossRef
import app.recipebook.data.local.db.RecipeEntity
import app.recipebook.data.local.db.RecipeIngredientLineEntity
import app.recipebook.data.local.db.RecipeLinkEntity
import app.recipebook.data.local.db.RecipeTagCrossRef
import app.recipebook.data.local.recipes.RecipeRepository
import app.recipebook.data.local.recipes.SeedLibraryData
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.LibraryMetadata
import app.recipebook.domain.model.LibrarySettings
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.RecipeLibrary
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
    fun recipeDao_replaceRecipeGraphAndReadById_roundTrips() = runBlocking {
        db.recipeDao().replaceRecipeGraph(
            recipe = RecipeEntity(
                id = "recipe-1",
                createdAt = "2026-03-06T10:00:00Z",
                updatedAt = "2026-03-06T10:00:00Z",
                titleFr = "Crepes",
                titleEn = "Crepes",
                descriptionFr = "Description FR",
                descriptionEn = "EN description",
                instructionsFr = "Cuire 2 minutes",
                instructionsEn = "Cook 2 minutes",
                notesFr = "",
                notesEn = "",
                photosJson = "[]",
                attachmentsJson = "[]"
            ),
            ingredientLines = listOf(
                RecipeIngredientLineEntity(
                    id = "recipe-1-ingredient-1",
                    recipeId = "recipe-1",
                    position = 0,
                    originalText = "2 eggs",
                    quantity = 2.0,
                    unit = "egg",
                    ingredientName = "eggs"
                )
            ),
            ingredientLineSubstitutions = emptyList(),
            recipeLinks = listOf(
                RecipeLinkEntity(
                    id = "recipe-link-1",
                    recipeId = "recipe-1",
                    targetRecipeId = "recipe-2",
                    linkType = "SAUCE",
                    position = 0
                )
            ),
            tagRefs = listOf(
                RecipeTagCrossRef(
                    recipeId = "recipe-1",
                    tagId = "tag-1",
                    position = 0
                )
            ),
            collectionRefs = listOf(
                RecipeCollectionCrossRef(
                    recipeId = "recipe-1",
                    collectionId = "collection-1",
                    position = 0
                )
            )
        )

        val stored = db.recipeDao().getByIdWithRelations("recipe-1")

        assertNotNull(stored)
        assertEquals("Crepes", stored?.recipe?.titleFr)
        assertEquals("2 eggs", stored?.ingredientLines?.single()?.ingredientLine?.originalText)
        assertEquals("recipe-2", stored?.recipeLinks?.single()?.targetRecipeId)
        assertEquals("tag-1", stored?.tagRefs?.single()?.tagId)
        assertEquals("collection-1", stored?.collectionRefs?.single()?.collectionId)
    }

    @Test
    fun recipeRepository_seedBundledLibrary_populatesDatabaseOnce() = runBlocking {
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

        repository.seedBundledLibraryIfMissing()
        repository.seedBundledLibraryIfMissing()

        val storedRecipes = repository.observeRecipes().first()

        assertEquals(2, db.recipeDao().countActive())
        assertEquals(2, storedRecipes.size)
    }

    @Test
    fun recipeRepository_seedBundledLibraryIfMissing_addsOnlyMissingRecipes() = runBlocking {
        val repository = RecipeRepository(db.recipeDao())
        repository.upsertRecipe(
            repository.createBlankRecipe("2026-03-13T10:00:00Z").copy(
                id = "seed-existing",
                languages = BilingualText(
                    fr = LocalizedSystemText("Recette deja stockee", "", "", ""),
                    en = LocalizedSystemText("Already Stored Recipe", "", "", "")
                ),
                ingredients = listOf(
                    IngredientLine(
                        id = "seed-existing-ingredient-1",
                        originalText = "2 cups flour",
                        ingredientName = "flour"
                    )
                )
            )
        )

        val bundledRecipes = listOf(
            repository.createBlankRecipe("2026-03-13T10:00:00Z").copy(
                id = "seed-existing",
                languages = BilingualText(
                    fr = LocalizedSystemText("Remplacement", "", "", ""),
                    en = LocalizedSystemText("Replacement", "", "", "")
                )
            ),
            repository.createBlankRecipe("2026-03-13T10:05:00Z").copy(
                id = "seed-missing",
                languages = BilingualText(
                    fr = LocalizedSystemText("Nouvelle graine", "", "", ""),
                    en = LocalizedSystemText("New Seed", "", "", "")
                )
            )
        )
        val seededRepository = RecipeRepository(db.recipeDao(), seedLibrary = SeedLibraryData(recipes = bundledRecipes))

        seededRepository.seedBundledLibraryIfMissing()

        val storedRecipes = seededRepository.observeRecipes().first()

        assertEquals(2, storedRecipes.size)
        assertEquals("Already Stored Recipe", seededRepository.getRecipeById("seed-existing")?.languages?.en?.title)
        assertEquals("New Seed", seededRepository.getRecipeById("seed-missing")?.languages?.en?.title)
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

    @Test
    fun recipeRepository_replaceLibrary_replacesRoomBackedLibraryState() = runBlocking {
        val repository = RecipeRepository(
            recipeDao = db.recipeDao(),
            ingredientReferenceDao = db.ingredientReferenceDao(),
            contextualSubstitutionRuleDao = db.contextualSubstitutionRuleDao(),
            tagDao = db.tagDao(),
            collectionDao = db.collectionDao(),
            librarySettingsDao = db.librarySettingsDao(),
            libraryMetadataDao = db.libraryMetadataDao(),
            transactionRunner = { block -> db.withTransaction { block() } }
        )
        repository.upsertRecipe(
            repository.createBlankRecipe("2026-04-19T13:00:00Z").copy(
                id = "recipe-old",
                languages = BilingualText(
                    fr = LocalizedSystemText("Ancienne recette", "", "", ""),
                    en = LocalizedSystemText("Old Recipe", "", "", "")
                )
            )
        )

        repository.replaceLibrary(
            RecipeLibrary(
                metadata = LibraryMetadata(
                    libraryId = "library-drive",
                    createdAt = "2026-04-19T13:00:00Z",
                    updatedAt = "2026-04-19T13:05:00Z",
                    exportedAt = "2026-04-19T13:10:00Z"
                ),
                recipes = listOf(
                    repository.createBlankRecipe("2026-04-19T13:05:00Z").copy(
                        id = "recipe-new",
                        languages = BilingualText(
                            fr = LocalizedSystemText("Recette Drive", "", "", ""),
                            en = LocalizedSystemText("Drive Recipe", "", "", "")
                        )
                    )
                ),
                ingredientReferences = listOf(
                    IngredientReference(
                        id = "ingredient-ref-1",
                        nameFr = "Farine",
                        nameEn = "Flour",
                        updatedAt = "2026-04-19T13:10:00Z"
                    )
                ),
                ingredientForms = emptyList(),
                substitutionRules = emptyList(),
                contextualSubstitutionRules = emptyList(),
                units = emptyList(),
                tags = emptyList(),
                collections = listOf(Collection(id = "collection-1", nameFr = "Base", nameEn = "Base")),
                settings = LibrarySettings(
                    language = AppLanguage.FR,
                    driveSyncEnabled = true,
                    driveFileName = "recipebook-library-backup.zip"
                )
            ),
            notifyMutation = false
        )

        assertEquals(1, repository.observeRecipes().first().size)
        assertEquals("Drive Recipe", repository.getRecipeById("recipe-new")?.languages?.en?.title)
        assertEquals("recipebook-library-backup.zip", db.librarySettingsDao().getById()?.driveFileName)
        assertEquals("library-drive", db.libraryMetadataDao().getAny()?.libraryId)
    }
}
