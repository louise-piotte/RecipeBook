package app.recipebook.data.local.recipes

import app.recipebook.data.schema.RecipeDto
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.CollectionSortOrder
import app.recipebook.domain.model.ContextualSubstitutionRule
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LibraryMetadata
import app.recipebook.domain.model.LibrarySettings
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLibrary
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionConversionType
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.SubstitutionRule
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.model.UnitScope
import app.recipebook.domain.model.UnitType
import java.io.File
import java.nio.file.Files
import java.util.zip.ZipFile
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeExportCodecTest {
    private val json = Json {
        ignoreUnknownKeys = false
    }

    @Test
    fun writeSeedPackageZip_writesManifestRecipeJsonAndPhotos() {
        val tempDir = Files.createTempDirectory("recipe-export-test").toFile()
        val photoFile = File(tempDir, "recipe-photo.jpg").apply {
            writeBytes(byteArrayOf(1, 2, 3, 4))
        }
        val outputFile = File(tempDir, "library.zip")
        val library = sampleLibrary(photoFile)

        val bundle = RecipeExportCodec.writeSeedPackageZip(library, outputFile)

        ZipFile(bundle.archiveFile).use { zip ->
            val manifest = zip.readJsonEntry("manifest.v1.json", SeedExportManifestDto.serializer())
            val recipePath = manifest.recipeFiles.single()
            val recipe = zip.readJsonEntry(recipePath, RecipeDto.serializer())

            assertEquals("bundled-seed-package/v1", manifest.schemaVersion)
            assertEquals(listOf(recipePath), manifest.recipeFiles)
            assertTrue(zip.getEntry("metadata.v1.json") != null)
            assertTrue(zip.getEntry("ingredient-references.v1.json") != null)
            assertTrue(zip.getEntry("ingredient-forms.v1.json") != null)
            assertTrue(zip.getEntry("substitution-rules.v1.json") != null)
            assertTrue(zip.getEntry("contextual-substitution-rules.v1.json") != null)
            assertTrue(zip.getEntry("units.v1.json") != null)
            assertTrue(zip.getEntry("tags.v1.json") != null)
            assertTrue(zip.getEntry("collections.v1.json") != null)
            assertTrue(zip.getEntry("settings.v1.json") != null)
            assertTrue(zip.getEntry(recipe.photos.single().relativePath) != null)
            assertEquals("recipe-1", recipe.id)
            assertEquals("photos/photo-1.jpg", recipe.photos.single().relativePath)
            assertTrue(recipePath.startsWith("recipes/001-"))
        }
    }

    @Test
    fun encodeIngredientCatalogJson_includesAllIngredientCatalogSections() {
        val library = sampleLibrary(File("recipe-photo.jpg"))

        val encoded = RecipeExportCodec.encodeIngredientCatalogJson(library)
        val payload = json.decodeFromString(IngredientCatalogExportDto.serializer(), encoded)

        assertEquals("ingredient-catalog/v1", payload.schemaVersion)
        assertEquals(1, payload.ingredientReferences.size)
        assertEquals(1, payload.ingredientForms.size)
        assertEquals(1, payload.substitutionRules.size)
        assertEquals(1, payload.contextualSubstitutionRules.size)
    }

    private fun <T> ZipFile.readJsonEntry(
        path: String,
        serializer: kotlinx.serialization.DeserializationStrategy<T>
    ): T {
        val entry = requireNotNull(getEntry(path)) { "Missing zip entry $path" }
        return getInputStream(entry).bufferedReader().use { reader ->
            json.decodeFromString(serializer, reader.readText())
        }
    }

    private fun sampleLibrary(photoFile: File): RecipeLibrary {
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-1",
            nameFr = "Farine tout usage",
            nameEn = "All-purpose flour",
            category = IngredientCategory.FLOUR_AND_STARCH,
            aliasesFr = listOf("Farine blanche"),
            aliasesEn = listOf("Plain flour"),
            defaultDensity = 0.53,
            unitMappings = listOf(IngredientUnitMapping("cup", "g", 120.0)),
            updatedAt = "2026-04-18T10:00:00Z"
        )
        val ingredientForm = IngredientForm(
            id = "ingredient-form-1",
            ingredientRefId = ingredientReference.id,
            formCode = "raw",
            labelFr = "farine crue",
            labelEn = "raw flour",
            updatedAt = "2026-04-18T10:05:00Z"
        )
        val substitutionRule = SubstitutionRule(
            id = "substitution-rule-1",
            fromFormId = ingredientForm.id,
            toFormId = ingredientForm.id,
            conversionType = SubstitutionConversionType.RATIO,
            ratio = 1.0,
            sourceUnitScope = UnitScope.MASS,
            targetUnitScope = UnitScope.MASS,
            confidence = SubstitutionConfidence.EXACT,
            riskLevel = SubstitutionRiskLevel.SAFE,
            roundingPolicy = "none",
            updatedAt = "2026-04-18T10:10:00Z"
        )
        val contextualRule = ContextualSubstitutionRule(
            id = "contextual-rule-1",
            fromIngredientRefId = ingredientReference.id,
            toIngredientRefId = ingredientReference.id,
            conversionType = SubstitutionConversionType.RATIO,
            ratio = 1.0,
            confidence = SubstitutionConfidence.TESTED,
            riskLevel = SubstitutionRiskLevel.CAUTION,
            updatedAt = "2026-04-18T10:15:00Z"
        )
        return RecipeLibrary(
            metadata = LibraryMetadata(
                libraryId = "library-local",
                createdAt = "2026-04-18T10:00:00Z",
                updatedAt = "2026-04-18T10:20:00Z",
                exportedAt = "2026-04-18T10:30:00Z",
                appVersion = "1.0.0",
                deviceId = "Pixel 9a"
            ),
            recipes = listOf(
                Recipe(
                    id = "recipe-1",
                    createdAt = "2026-04-18T10:00:00Z",
                    updatedAt = "2026-04-18T10:20:00Z",
                    languages = BilingualText(
                        fr = LocalizedSystemText(
                            title = "Crepes",
                            description = "",
                            instructions = "Mélanger.",
                            notes = ""
                        ),
                        en = LocalizedSystemText(
                            title = "Crepes",
                            description = "",
                            instructions = "Mix.",
                            notes = ""
                        )
                    ),
                    ingredients = listOf(
                        IngredientLine(
                            id = "ingredient-line-1",
                            ingredientRefId = ingredientReference.id,
                            originalText = "1 cup flour",
                            quantity = 1.0,
                            unit = "cup",
                            ingredientName = "flour"
                        )
                    ),
                    tagIds = listOf("tag-breakfast"),
                    collectionIds = listOf("collection-classics"),
                    mainPhotoId = "photo-1",
                    photos = listOf(PhotoRef(id = "photo-1", localPath = photoFile.absolutePath))
                )
            ),
            ingredientReferences = listOf(ingredientReference),
            ingredientForms = listOf(ingredientForm),
            substitutionRules = listOf(substitutionRule),
            contextualSubstitutionRules = listOf(contextualRule),
            units = listOf(
                UnitDefinition("g", "g", "gramme", "gram", UnitType.MASS, "g", 1.0),
                UnitDefinition("ml", "ml", "millilitre", "milliliter", UnitType.VOLUME, "ml", 1.0)
            ),
            tags = listOf(
                Tag(
                    id = "tag-breakfast",
                    nameFr = "Déjeuner",
                    nameEn = "Breakfast",
                    slug = "breakfast",
                    category = TagCategory.MEAL
                )
            ),
            collections = listOf(
                Collection(
                    id = "collection-classics",
                    nameFr = "Classiques",
                    nameEn = "Classics",
                    recipeIds = listOf("recipe-1"),
                    sortOrder = CollectionSortOrder.TITLE_ASC
                )
            ),
            settings = LibrarySettings(
                language = AppLanguage.EN,
                driveSyncEnabled = false
            )
        )
    }
}
