package app.recipebook.data.local.recipes

import app.recipebook.data.schema.CollectionDto
import app.recipebook.data.schema.ContextualSubstitutionRuleDto
import app.recipebook.data.schema.FullLibraryPayloadDto
import app.recipebook.data.schema.IngredientFormDto
import app.recipebook.data.schema.IngredientReferenceDto
import app.recipebook.data.schema.LibraryDto
import app.recipebook.data.schema.LibraryMetadataDto
import app.recipebook.data.schema.LibrarySettingsDto
import app.recipebook.data.schema.RecipeDto
import app.recipebook.data.schema.SchemaVersions
import app.recipebook.data.schema.SubstitutionRuleDto
import app.recipebook.data.schema.TagDto
import app.recipebook.data.schema.UnitDefinitionDto
import app.recipebook.data.schema.toDomainLibrary
import app.recipebook.domain.model.AttachmentRef
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLibrary
import java.io.File
import java.util.zip.ZipFile
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

class RecipeLibraryImportCodec(
    private val assetSink: RecipeLibraryAssetSink
) {
    private val json = Json {
        ignoreUnknownKeys = false
    }

    fun readSeedPackageZip(zipFile: File): RecipeLibrary {
        ZipFile(zipFile).use { zip ->
            val manifest = zip.readJsonEntry("manifest.v1.json", SeedExportManifestDto.serializer())
            require(manifest.schemaVersion == "bundled-seed-package/v1") {
                "Unsupported library package schema version: ${manifest.schemaVersion}"
            }

            val library = FullLibraryPayloadDto(
                schemaVersion = SchemaVersions.FULL_LIBRARY_V1,
                library = LibraryDto(
                    metadata = zip.readJsonEntry(manifest.metadataFile, LibraryMetadataDto.serializer()),
                    recipes = manifest.recipeFiles.map { zip.readJsonEntry(it, RecipeDto.serializer()) },
                    ingredientReferences = zip.readJsonEntry(
                        manifest.ingredientReferencesFile,
                        ListSerializer(IngredientReferenceDto.serializer())
                    ),
                    ingredientForms = zip.readJsonEntry(
                        manifest.ingredientFormsFile,
                        ListSerializer(IngredientFormDto.serializer())
                    ),
                    substitutionRules = zip.readJsonEntry(
                        manifest.substitutionRulesFile,
                        ListSerializer(SubstitutionRuleDto.serializer())
                    ),
                    contextualSubstitutionRules = zip.readJsonEntry(
                        manifest.contextualSubstitutionRulesFile,
                        ListSerializer(ContextualSubstitutionRuleDto.serializer())
                    ),
                    units = zip.readJsonEntry(manifest.unitsFile, ListSerializer(UnitDefinitionDto.serializer())),
                    tags = zip.readJsonEntry(manifest.tagsFile, ListSerializer(TagDto.serializer())),
                    collections = zip.readJsonEntry(manifest.collectionsFile, ListSerializer(CollectionDto.serializer())),
                    settings = zip.readJsonEntry(manifest.settingsFile, LibrarySettingsDto.serializer())
                )
            ).toDomainLibrary()

            validateLibrary(library)

            return library.copy(
                recipes = library.recipes.map { recipe -> materializeRecipeAssets(zip, recipe) }
            )
        }
    }

    private fun materializeRecipeAssets(zip: ZipFile, recipe: Recipe): Recipe {
        val photos = recipe.photos.map { photo ->
            materializePhoto(zip, recipe.id, photo)
        }
        val attachments = recipe.attachments.map { attachment ->
            materializeAttachment(zip, recipe.id, attachment)
        }
        val mainPhotoId = photos.firstOrNull { it.id == recipe.mainPhotoId }?.id ?: photos.firstOrNull()?.id
        return recipe.copy(
            mainPhotoId = mainPhotoId,
            photos = photos,
            attachments = attachments
        )
    }

    private fun materializePhoto(zip: ZipFile, recipeId: String, photo: PhotoRef): PhotoRef {
        val entry = requireNotNull(zip.getEntry(photo.localPath)) { "Missing packaged photo ${photo.localPath}" }
        zip.getInputStream(entry).use { input ->
            return assetSink.importPhoto(
                recipeId = recipeId,
                photoId = photo.id,
                archivePath = photo.localPath,
                input = input
            ).copy(cloudRef = photo.cloudRef)
        }
    }

    private fun materializeAttachment(zip: ZipFile, recipeId: String, attachment: AttachmentRef): AttachmentRef {
        val entry = requireNotNull(zip.getEntry(attachment.localPath)) {
            "Missing packaged attachment ${attachment.localPath}"
        }
        zip.getInputStream(entry).use { input ->
            return assetSink.importAttachment(
                recipeId = recipeId,
                attachmentId = attachment.id,
                fileName = attachment.fileName,
                archivePath = attachment.localPath,
                mimeType = attachment.mimeType,
                input = input
            ).copy(cloudRef = attachment.cloudRef)
        }
    }

    private fun validateLibrary(library: RecipeLibrary) {
        val recipeIds = library.recipes.map { it.id }
        val ingredientReferenceIds = library.ingredientReferences.map { it.id }.toSet()
        val substitutionRuleIds = library.substitutionRules.map { it.id }.toSet()
        val contextualRuleIds = library.contextualSubstitutionRules.map { it.id }.toSet()
        val tagIds = library.tags.map { it.id }.toSet()
        val collectionIds = library.collections.map { it.id }.toSet()

        require(recipeIds.size == recipeIds.distinct().size) { "Duplicate recipe ids in imported library" }

        library.collections.forEach { collection ->
            require(collection.recipeIds.all { it in recipeIds }) {
                "Collection ${collection.id} references missing recipes"
            }
        }

        library.recipes.forEach { recipe ->
            require(recipe.tagIds.all { it in tagIds }) { "Recipe ${recipe.id} references missing tags" }
            require(recipe.collectionIds.all { it in collectionIds }) { "Recipe ${recipe.id} references missing collections" }
            require(recipe.ingredients.all { it.ingredientRefId == null || it.ingredientRefId in ingredientReferenceIds }) {
                "Recipe ${recipe.id} references missing ingredient references"
            }
            require(recipe.recipeLinks.all { it.targetRecipeId in recipeIds }) {
                "Recipe ${recipe.id} references missing linked recipes"
            }
            recipe.ingredients.forEach { ingredient ->
                ingredient.substitutions.forEach { substitution ->
                    require(substitution.ingredientLineId == ingredient.id) {
                        "Ingredient substitution ${substitution.id} references the wrong ingredient line"
                    }
                    require(
                        substitution.substitutionRuleId == null || substitution.substitutionRuleId in substitutionRuleIds
                    ) {
                        "Ingredient substitution ${substitution.id} references a missing substitution rule"
                    }
                    require(
                        substitution.contextualSubstitutionRuleId == null ||
                            substitution.contextualSubstitutionRuleId in contextualRuleIds
                    ) {
                        "Ingredient substitution ${substitution.id} references a missing contextual substitution rule"
                    }
                }
            }
        }
    }

    private fun <T> ZipFile.readJsonEntry(path: String, serializer: DeserializationStrategy<T>): T {
        val entry = requireNotNull(getEntry(path)) { "Missing zip entry $path" }
        return getInputStream(entry).bufferedReader().use { reader ->
            json.decodeFromString(serializer, reader.readText().trimStart('\uFEFF'))
        }
    }
}
