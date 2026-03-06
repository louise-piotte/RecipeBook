package app.recipebook

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import app.recipebook.data.local.db.RecipeBookDatabase
import app.recipebook.data.local.db.RecipeEntity
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

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
            preparationStepsFr = "Etape 1",
            preparationStepsEn = "Step 1",
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
}
