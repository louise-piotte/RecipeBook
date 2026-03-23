package app.recipebook.data.schema

import java.io.File
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class BundledSeedPackageTest {

    private val json = Json { ignoreUnknownKeys = true }

    @Test
    fun bundledSeedPackage_decodesToCanonicalLibraryData() {
        val root = File("src/main/assets/seed/bundled-library")
        val manifest = json.decodeFromString(BundledSeedManifestTestDto.serializer(), File(root, "manifest.v1.json").readText())

        assertEquals("bundled-seed-package/v1", manifest.schemaVersion)
        assertEquals("bundled-library", manifest.packageId)
        assertFalse(manifest.packageId.contains("boite", ignoreCase = true))

        val payload = FullLibraryPayloadDto(
            schemaVersion = SchemaVersions.FULL_LIBRARY_V1,
            library = LibraryDto(
                metadata = json.decodeFromString(LibraryMetadataDto.serializer(), File(root, manifest.metadataFile).readText()),
                recipes = json.decodeFromString(ListSerializer(RecipeDto.serializer()), File(root, manifest.recipesFile).readText()),
                ingredientReferences = json.decodeFromString(
                    ListSerializer(IngredientReferenceDto.serializer()),
                    File(root, manifest.ingredientReferencesFile).readText()
                ),
                ingredientForms = json.decodeFromString(
                    ListSerializer(IngredientFormDto.serializer()),
                    File(root, manifest.ingredientFormsFile).readText()
                ),
                substitutionRules = json.decodeFromString(
                    ListSerializer(SubstitutionRuleDto.serializer()),
                    File(root, manifest.substitutionRulesFile).readText()
                ),
                contextualSubstitutionRules = json.decodeFromString(
                    ListSerializer(ContextualSubstitutionRuleDto.serializer()),
                    File(root, manifest.contextualSubstitutionRulesFile).readText()
                ),
                units = json.decodeFromString(ListSerializer(UnitDefinitionDto.serializer()), File(root, manifest.unitsFile).readText()),
                tags = json.decodeFromString(ListSerializer(TagDto.serializer()), File(root, manifest.tagsFile).readText()),
                collections = json.decodeFromString(ListSerializer(CollectionDto.serializer()), File(root, manifest.collectionsFile).readText()),
                settings = json.decodeFromString(LibrarySettingsDto.serializer(), File(root, manifest.settingsFile).readText())
            )
        )

        val library = payload.toDomainLibrary()

        assertEquals(SchemaVersions.FULL_LIBRARY_V1, payload.schemaVersion)
        assertEquals("library-bundled-default", library.metadata.libraryId)
        assertFalse(library.metadata.libraryId.contains("boite", ignoreCase = true))
        assertFalse(library.ingredientReferences.isEmpty())
        assertTrue(library.tags.size >= 12)
        assertTrue(library.collections.isEmpty())
        assertTrue(library.ingredientReferences.any { it.nameEn == "all-purpose flour" })
        assertTrue(library.ingredientReferences.any { it.nameEn == "icing sugar" })
        assertTrue(library.recipes.all { recipe ->
            recipe.languages.fr.title.isNotBlank() &&
                recipe.languages.en.title.isNotBlank() &&
                recipe.ingredients.all { it.ingredientRefId == null || it.ingredientRefId.isNotBlank() } &&
                recipe.photos.all { it.localPath.startsWith("photos/") } &&
                (recipe.mainPhotoId == null || recipe.photos.any { photo -> photo.id == recipe.mainPhotoId })
        })
    }
}

@kotlinx.serialization.Serializable
private data class BundledSeedManifestTestDto(
    val schemaVersion: String,
    val packageId: String,
    val metadataFile: String,
    val recipesFile: String,
    val ingredientReferencesFile: String,
    val ingredientFormsFile: String,
    val substitutionRulesFile: String,
    val contextualSubstitutionRulesFile: String,
    val unitsFile: String,
    val tagsFile: String,
    val collectionsFile: String,
    val settingsFile: String
)