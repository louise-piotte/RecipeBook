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
                unitMappings = listOf(IngredientUnitMapping(fromUnit = "cup", toUnit = "g", factor = 120.0)),
                updatedAt = "2026-03-02T12:30:00Z"
            )
        ),
        ingredientForms = listOf(
            IngredientForm(
                id = "3b7cb1f8-79c3-4abc-90ac-99cae87b8eca",
                ingredientRefId = "8c35153a-4bf2-4501-a77f-b7a5af15427b",
                formCode = "raw",
                prepState = "raw",
                densityGPerMl = 0.53,
                notesFr = "Forme de reference",
                notesEn = "Reference form",
                updatedAt = "2026-03-02T12:35:00Z"
            )
        ),
        substitutionRules = listOf(
            SubstitutionRule(
                id = "c324302c-f362-497d-a2ef-83ad6b130f1f",
                fromFormId = "3b7cb1f8-79c3-4abc-90ac-99cae87b8eca",
                toFormId = "3b7cb1f8-79c3-4abc-90ac-99cae87b8eca",
                conversionType = SubstitutionConversionType.RATIO,
                ratio = 1.0,
                offset = null,
                sourceUnitScope = UnitScope.MASS,
                targetUnitScope = UnitScope.MASS,
                minQty = null,
                maxQty = null,
                confidence = SubstitutionConfidence.EXACT,
                roundingPolicy = "none",
                notesFr = "Identite",
                notesEn = "Identity",
                updatedAt = "2026-03-02T12:40:00Z"
            )
        ),
        contextualSubstitutionRules = listOf(
            ContextualSubstitutionRule(
                id = "4dcb26c5-7e02-4f56-8fd0-3cbf95f9cb25",
                fromIngredientRefId = "8c35153a-4bf2-4501-a77f-b7a5af15427b",
                toIngredientRefId = "8c35153a-4bf2-4501-a77f-b7a5af15427b",
                conversionType = SubstitutionConversionType.RATIO,
                ratio = 1.0,
                offset = null,
                allowedDishTypes = listOf("sauce", "gravy"),
                excludedDishTypes = listOf("cake", "pastry"),
                allowedIngredientRoles = listOf("thickener"),
                excludedIngredientRoles = emptyList(),
                allowedCookingMethods = listOf("simmer"),
                severityIfMisused = SubstitutionSeverity.HIGH,
                requiresUserConfirmation = true,
                confidence = SubstitutionConfidence.TESTED,
                notesFr = "Utiliser seulement pour sauces",
                notesEn = "Use only for sauces",
                updatedAt = "2026-03-02T12:42:00Z"
            )
        ),
        units = listOf(
            UnitDefinition("g", "g", "gramme", "gram", UnitType.MASS, "g", 1.0),
            UnitDefinition("ml", "ml", "millilitre", "milliliter", UnitType.VOLUME, "ml", 1.0)
        ),
        tags = listOf(Tag("6bce17f2-67ad-40c3-8267-fee6bac1ac43", "Dejeuner", "Breakfast", "breakfast")),
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
                instructions = "Melanger, verser et cuire des deux cotes.",
                notes = ""
            ),
            en = LocalizedSystemText(
                title = "Classic pancakes",
                description = "Quick fluffy pancakes.",
                instructions = "Mix, pour, and cook both sides.",
                notes = ""
            )
        ),
        ingredients = listOf(
            IngredientLine(
                id = "2f3287f5-a90e-4e2d-b3ca-1bded383a4c2",
                ingredientRefId = "8c35153a-4bf2-4501-a77f-b7a5af15427b",
                originalText = "200 g flour",
                quantity = 200.0,
                unit = "g",
                ingredientName = "flour",
                group = "Batter",
                substitutions = listOf(
                    IngredientLineSubstitution(
                        id = "2cfc2678-7ab3-4094-ac6e-9995fbaede6b",
                        ingredientLineId = "2f3287f5-a90e-4e2d-b3ca-1bded383a4c2",
                        substitutionRuleId = "c324302c-f362-497d-a2ef-83ad6b130f1f",
                        contextualSubstitutionRuleId = "4dcb26c5-7e02-4f56-8fd0-3cbf95f9cb25",
                        isPreferred = true,
                        customLabelFr = "Alternative test",
                        customLabelEn = "Test alternative",
                        createdAt = "2026-03-02T12:43:00Z",
                        updatedAt = "2026-03-02T12:44:00Z"
                    )
                )
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
        photos = listOf(PhotoRef("3f4f2cf1-70fa-42e6-935f-fddc4e7d870e", "photos/pancakes-1.jpg", "drive://photo-1")),
        attachments = listOf(AttachmentRef("f49fbc5c-2b15-47a3-a81d-6fd0da70c2ed", "notes.pdf", "application/pdf", "attachments/notes.pdf", null)),
        importMetadata = ImportMetadata(sourceType = "url", parserVersion = "1.0.0", originalUnits = "metric"),
        deletedAt = null
    )
}
