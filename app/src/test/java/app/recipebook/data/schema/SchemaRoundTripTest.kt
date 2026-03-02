package app.recipebook.data.schema

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.AttachmentRef
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.CollectionSortOrder
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.IngredientLine
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
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.model.UnitType
import app.recipebook.domain.model.UserNotes
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Test

class SchemaRoundTripTest {

    private val json = Json {
        prettyPrint = false
        encodeDefaults = true
        explicitNulls = false
        ignoreUnknownKeys = false
    }

    @Test
    fun recipeCreation_roundTrip_preservesRecipe() {
        val recipe = sampleRecipe()
        val payload = recipe.toRecipeCreationPayloadDto()

        assertEquals(SchemaVersions.RECIPE_CREATION_V1, payload.schemaVersion)

        val encoded = json.encodeToString(RecipeCreationPayloadDto.serializer(), payload)
        val decoded = json.decodeFromString(RecipeCreationPayloadDto.serializer(), encoded)
        val roundTrip = decoded.toDomainRecipe()

        assertEquals(recipe, roundTrip)
    }

    @Test
    fun fullLibrary_roundTrip_preservesLibrary() {
        val library = sampleLibrary()
        val payload = library.toFullLibraryPayloadDto()

        assertEquals(SchemaVersions.FULL_LIBRARY_V1, payload.schemaVersion)

        val encoded = json.encodeToString(FullLibraryPayloadDto.serializer(), payload)
        val decoded = json.decodeFromString(FullLibraryPayloadDto.serializer(), encoded)
        val roundTrip = decoded.toDomainLibrary()

        assertEquals(library, roundTrip)
    }

    private fun sampleLibrary(): RecipeLibrary = RecipeLibrary(
        metadata = LibraryMetadata(
            libraryId = "db6aba6f-9f3f-4581-95e6-d7480eb634d4",
            createdAt = "2026-03-02T12:00:00Z",
            updatedAt = "2026-03-02T13:00:00Z",
            exportedAt = "2026-03-02T14:00:00Z",
            appVersion = "0.1.0",
            deviceId = "pixel9a-local"
        ),
        recipes = listOf(sampleRecipe()),
        ingredientReferences = listOf(
            IngredientReference(
                id = "8c35153a-4bf2-4501-a77f-b7a5af15427b",
                nameFr = "Farine tout usage",
                nameEn = "All-purpose flour",
                aliasesFr = listOf("Farine blanche"),
                aliasesEn = listOf("AP flour"),
                defaultDensity = 0.53,
                unitMappings = listOf(
                    IngredientUnitMapping(fromUnit = "cup", toUnit = "g", factor = 120.0)
                ),
                updatedAt = "2026-03-02T12:30:00Z"
            )
        ),
        units = listOf(
            UnitDefinition(
                unitId = "g",
                symbol = "g",
                nameFr = "gramme",
                nameEn = "gram",
                type = UnitType.MASS,
                baseUnitId = "g",
                toBaseFactor = 1.0
            ),
            UnitDefinition(
                unitId = "ml",
                symbol = "ml",
                nameFr = "millilitre",
                nameEn = "milliliter",
                type = UnitType.VOLUME,
                baseUnitId = "ml",
                toBaseFactor = 1.0
            )
        ),
        tags = listOf(
            Tag(
                id = "6bce17f2-67ad-40c3-8267-fee6bac1ac43",
                nameFr = "Dejeuner",
                nameEn = "Breakfast",
                slug = "breakfast"
            )
        ),
        collections = listOf(
            Collection(
                id = "70ac4e1b-b73f-4477-82fd-ff44c643cce6",
                nameFr = "Classiques",
                nameEn = "Classics",
                descriptionFr = "Recettes de base",
                descriptionEn = "Core recipes",
                recipeIds = listOf("9340cc85-dbcf-4b7d-92ed-574e6c8fbf3d"),
                sortOrder = CollectionSortOrder.TITLE_ASC
            )
        ),
        settings = LibrarySettings(
            language = AppLanguage.EN,
            driveSyncEnabled = false,
            driveFileName = "RecipeLibrary.android16.recipes.zip",
            driveFolderId = null,
            openSourceInAppBrowser = true
        )
    )

    private fun sampleRecipe(): Recipe = Recipe(
        id = "9340cc85-dbcf-4b7d-92ed-574e6c8fbf3d",
        createdAt = "2026-03-02T12:00:00Z",
        updatedAt = "2026-03-02T12:45:00Z",
        source = RecipeSource(
            sourceUrl = "https://example.com/pancakes",
            sourceName = "Example Kitchen"
        ),
        languages = BilingualText(
            fr = LocalizedSystemText(
                title = "Pancakes classiques",
                description = "Pancakes moelleux et rapides.",
                preparationSteps = "Mesurer les ingredients et prechauffer la poele.",
                instructions = "Melanger, verser et cuire des deux cotes.",
                notesSystem = ""
            ),
            en = LocalizedSystemText(
                title = "Classic pancakes",
                description = "Quick fluffy pancakes.",
                preparationSteps = "Measure ingredients and preheat the pan.",
                instructions = "Mix, pour, and cook both sides.",
                notesSystem = ""
            )
        ),
        userNotes = UserNotes(
            fr = null,
            en = "Use buttermilk when available."
        ),
        ingredients = listOf(
            IngredientLine(
                id = "2f3287f5-a90e-4e2d-b3ca-1bded383a4c2",
                ingredientRefId = "8c35153a-4bf2-4501-a77f-b7a5af15427b",
                originalText = "200 g flour",
                quantity = 200.0,
                unit = "g",
                ingredientName = "flour",
                preparation = null,
                optional = false,
                notes = null,
                group = "Batter"
            ),
            IngredientLine(
                id = "87d684b2-b945-4f4f-b077-21f7a5fdef1e",
                originalText = "300 ml milk",
                quantity = 300.0,
                unit = "ml",
                ingredientName = "milk"
            )
        ),
        servings = Servings(amount = 4.0, unit = null),
        times = RecipeTimes(prepTimeMinutes = 10, cookTimeMinutes = 15, totalTimeMinutes = 25),
        tagIds = listOf("6bce17f2-67ad-40c3-8267-fee6bac1ac43"),
        collectionIds = listOf("70ac4e1b-b73f-4477-82fd-ff44c643cce6"),
        ratings = Ratings(userRating = 4.5, madeCount = 2, lastMadeAt = "2026-02-20T09:00:00Z"),
        photos = listOf(
            PhotoRef(
                id = "3f4f2cf1-70fa-42e6-935f-fddc4e7d870e",
                localPath = "photos/pancakes-1.jpg",
                cloudRef = "drive://photo-1"
            )
        ),
        attachments = listOf(
            AttachmentRef(
                id = "f49fbc5c-2b15-47a3-a81d-6fd0da70c2ed",
                fileName = "notes.pdf",
                mimeType = "application/pdf",
                localPath = "attachments/notes.pdf",
                cloudRef = null
            )
        ),
        importMetadata = ImportMetadata(
            sourceType = "url",
            parserVersion = "1.0.0",
            originalUnits = "metric"
        ),
        deletedAt = null
    )
}
