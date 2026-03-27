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
        val payload = loadBundledPayload()
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

    @Test
    fun bundledSeedPackage_ingredientReferenceAliasesRemainNormalizedAndUnambiguous() {
        val references = loadBundledPayload().library.ingredientReferences

        val keyOwners = linkedMapOf<String, MutableSet<String>>()
        references.forEach { reference ->
            val canonicalFr = reference.nameFr.normalizedKey()
            val canonicalEn = reference.nameEn.normalizedKey()

            assertTrue(reference.aliasesFr == reference.aliasesFr.map(String::trim).filter(String::isNotEmpty).distinct())
            assertTrue(reference.aliasesEn == reference.aliasesEn.map(String::trim).filter(String::isNotEmpty).distinct())
            assertFalse(reference.aliasesFr.any { it.normalizedKey() == canonicalFr })
            assertFalse(reference.aliasesEn.any { it.normalizedKey() == canonicalEn })
            assertFalse(reference.aliasesFr.any { canonicalFr != canonicalEn && it.normalizedKey() == canonicalEn })
            assertFalse(reference.aliasesEn.any { canonicalFr != canonicalEn && it.normalizedKey() == canonicalFr })

            sequenceOf(reference.nameFr, reference.nameEn)
                .plus(reference.aliasesFr.asSequence())
                .plus(reference.aliasesEn.asSequence())
                .map(String::normalizedKey)
                .forEach { key -> keyOwners.getOrPut(key) { linkedSetOf() }.add(reference.id) }
        }

        assertTrue(keyOwners.none { (_, owners) -> owners.size > 1 })
    }

    @Test
    fun bundledSeedPackage_crossFileReferencesRemainValid() {
        val library = loadBundledPayload().library

        assertUnique(library.recipes.map { it.id }, "recipe ids")
        assertUnique(library.ingredientReferences.map { it.id }, "ingredient reference ids")
        assertUnique(library.ingredientForms.map { it.id }, "ingredient form ids")
        assertUnique(library.substitutionRules.map { it.id }, "substitution rule ids")
        assertUnique(library.contextualSubstitutionRules.map { it.id }, "contextual substitution rule ids")
        assertUnique(library.tags.map { it.id }, "tag ids")
        assertUnique(library.tags.map { it.slug }, "tag slugs")
        assertUnique(library.collections.map { it.id }, "collection ids")
        assertUnique(library.units.map { it.unitId }, "unit ids")

        val recipeIds = library.recipes.map { it.id }.toSet()
        val ingredientReferenceIds = library.ingredientReferences.map { it.id }.toSet()
        val ingredientFormIds = library.ingredientForms.map { it.id }.toSet()
        val substitutionRuleIds = library.substitutionRules.map { it.id }.toSet()
        val contextualRuleIds = library.contextualSubstitutionRules.map { it.id }.toSet()
        val tagIds = library.tags.map { it.id }.toSet()
        val collectionIds = library.collections.map { it.id }.toSet()
        val unitIds = library.units.map { it.unitId }.toSet()

        library.units.forEach { unit ->
            assertTrue(unit.baseUnitId == null || unit.baseUnitId in unitIds)
        }

        library.ingredientReferences.forEach { reference ->
            reference.unitMappings.forEach { mapping ->
                assertTrue(mapping.toUnit in unitIds)
            }
        }

        library.ingredientForms.forEach { form ->
            assertTrue(form.ingredientRefId in ingredientReferenceIds)
        }

        library.substitutionRules.forEach { rule ->
            assertTrue(rule.fromFormId in ingredientFormIds)
            assertTrue(rule.toFormId in ingredientFormIds)
        }

        library.contextualSubstitutionRules.forEach { rule ->
            assertTrue(rule.fromIngredientRefId in ingredientReferenceIds)
            assertTrue(rule.toIngredientRefId in ingredientReferenceIds)
        }

        library.collections.forEach { collection ->
            assertTrue(collection.recipeIds.all { it in recipeIds })
        }

        library.recipes.forEach { recipe ->
            val photoIds = recipe.photos.map { it.id }
            val attachmentIds = recipe.attachments.map { it.id }
            val ingredientIds = recipe.ingredients.map { it.id }

            assertUnique(photoIds, "photo ids for ${recipe.id}")
            assertUnique(attachmentIds, "attachment ids for ${recipe.id}")
            assertUnique(ingredientIds, "ingredient line ids for ${recipe.id}")
            assertTrue(recipe.mainPhotoId == null || recipe.mainPhotoId in photoIds)
            assertTrue(recipe.tags.all { tagId -> tagId in tagIds })
            assertTrue(recipe.collections.all { collectionId -> collectionId in collectionIds })
            assertTrue(recipe.photos.all { photo -> photo.relativePath.startsWith("photos/") })
            assertTrue(recipe.attachments.all { attachment -> attachment.relativePath.startsWith("attachments/") })

            recipe.ingredients.forEach { ingredient ->
                assertTrue(ingredient.ingredientRefId == null || ingredient.ingredientRefId in ingredientReferenceIds)
                ingredient.substitutions.forEach { substitution ->
                    assertEquals(ingredient.id, substitution.ingredientLineId)
                    assertTrue(substitution.substitutionRuleId == null || substitution.substitutionRuleId in substitutionRuleIds)
                    assertTrue(
                        substitution.contextualSubstitutionRuleId == null ||
                            substitution.contextualSubstitutionRuleId in contextualRuleIds
                    )
                }
            }
        }
    }

    private fun loadBundledPayload(): FullLibraryPayloadDto {
        val root = File("src/main/assets/seed/bundled-library")
        val manifest = json.decodeFromString(BundledSeedManifestTestDto.serializer(), File(root, "manifest.v1.json").readText())

        assertEquals("bundled-seed-package/v1", manifest.schemaVersion)
        assertEquals("bundled-library", manifest.packageId)
        assertFalse(manifest.packageId.contains("boite", ignoreCase = true))

        return FullLibraryPayloadDto(
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
    }
}

private fun String.normalizedKey(): String = trim().lowercase()

private fun assertUnique(values: List<String>, label: String) {
    assertEquals(label, values.size, values.distinct().size)
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
