package app.recipebook.data.local.recipes

import android.content.Context
import android.util.Log
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
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.Tag
import java.io.File
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

object BundledRecipeLibraryLoader {
    private const val TAG = "BundledSeedLoader"
    private const val SEED_PACKAGE_ROOT = "seed/bundled-library"
    private const val SEED_MANIFEST_PATH = "$SEED_PACKAGE_ROOT/manifest.v1.json"
    private const val SEED_PACKAGE_SCHEMA_VERSION = "bundled-seed-package/v1"
    private const val SEED_PHOTO_CACHE_DIR = "seed-library-photos"

    private val json = Json {
        ignoreUnknownKeys = true
    }

    fun loadLibrary(context: Context): SeedLibraryData = runCatching {
        val manifest = loadAssetJson(context, SEED_MANIFEST_PATH, BundledSeedManifestDto.serializer())
        require(manifest.schemaVersion == SEED_PACKAGE_SCHEMA_VERSION) {
            "Unsupported bundled seed schema version: ${manifest.schemaVersion}"
        }

        val library = FullLibraryPayloadDto(
            schemaVersion = SchemaVersions.FULL_LIBRARY_V1,
            library = LibraryDto(
                metadata = loadAssetJson(context, manifest.assetPath(manifest.metadataFile), LibraryMetadataDto.serializer()),
                recipes = manifest.recipeFiles.map { recipeFile ->
                    loadAssetJson(context, manifest.assetPath(recipeFile), RecipeDto.serializer())
                },
                ingredientReferences = loadAssetJson(
                    context,
                    manifest.assetPath(manifest.ingredientReferencesFile),
                    ListSerializer(IngredientReferenceDto.serializer())
                ),
                ingredientForms = loadAssetJson(
                    context,
                    manifest.assetPath(manifest.ingredientFormsFile),
                    ListSerializer(IngredientFormDto.serializer())
                ),
                substitutionRules = loadAssetJson(
                    context,
                    manifest.assetPath(manifest.substitutionRulesFile),
                    ListSerializer(SubstitutionRuleDto.serializer())
                ),
                contextualSubstitutionRules = loadAssetJson(
                    context,
                    manifest.assetPath(manifest.contextualSubstitutionRulesFile),
                    ListSerializer(ContextualSubstitutionRuleDto.serializer())
                ),
                units = loadAssetJson(context, manifest.assetPath(manifest.unitsFile), ListSerializer(UnitDefinitionDto.serializer())),
                tags = loadAssetJson(context, manifest.assetPath(manifest.tagsFile), ListSerializer(TagDto.serializer())),
                collections = loadAssetJson(
                    context,
                    manifest.assetPath(manifest.collectionsFile),
                    ListSerializer(CollectionDto.serializer())
                ),
                settings = loadAssetJson(context, manifest.assetPath(manifest.settingsFile), LibrarySettingsDto.serializer())
            )
        ).toDomainLibrary()

        SeedLibraryData(
            recipes = materializeSeedRecipePhotos(context, manifest, library.recipes),
            ingredientReferences = library.ingredientReferences,
            tags = library.tags
        )
    }.getOrElse {
        Log.e(TAG, "Failed to load bundled seed library", it)
        SeedLibraryData()
    }

    private fun materializeSeedRecipePhotos(
        context: Context,
        manifest: BundledSeedManifestDto,
        recipes: List<Recipe>
    ): List<Recipe> = recipes.map { recipe ->
        val photos = recipe.photos.map { photo -> materializeSeedPhoto(context, manifest, photo) }
        val mainPhotoId = photos.firstOrNull { it.id == recipe.mainPhotoId }?.id ?: photos.firstOrNull()?.id
        recipe.copy(
            mainPhotoId = mainPhotoId,
            photos = photos
        )
    }

    private fun materializeSeedPhoto(context: Context, manifest: BundledSeedManifestDto, photo: PhotoRef): PhotoRef {
        val relativePath = photo.localPath.trim().replace('\\', '/')
        if (relativePath.isEmpty() || !isRelativeAssetPath(relativePath)) {
            return photo
        }

        val assetPath = manifest.assetPath(relativePath)
        val targetFile = File(context.filesDir, "$SEED_PHOTO_CACHE_DIR/${relativePath.replace('/', File.separatorChar)}")

        return runCatching {
            targetFile.parentFile?.mkdirs()
            context.assets.open(assetPath).use { input ->
                targetFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            photo.copy(localPath = targetFile.absolutePath)
        }.getOrElse {
            photo
        }
    }

    private fun isRelativeAssetPath(path: String): Boolean {
        if (path.startsWith("/")) return false
        return !Regex("^[A-Za-z]:[/\\\\]").containsMatchIn(path)
    }

    private fun <T> loadAssetJson(
        context: Context,
        assetPath: String,
        deserializer: DeserializationStrategy<T>
    ): T = context.assets.open(assetPath).bufferedReader().use { reader ->
        json.decodeFromString(deserializer, reader.readText().trimStart('\uFEFF'))
    }
}

@Serializable
private data class BundledSeedManifestDto(
    val schemaVersion: String,
    val packageId: String,
    val metadataFile: String,
    val recipeFiles: List<String>,
    val ingredientReferencesFile: String,
    val ingredientFormsFile: String,
    val substitutionRulesFile: String,
    val contextualSubstitutionRulesFile: String,
    val unitsFile: String,
    val tagsFile: String,
    val collectionsFile: String,
    val settingsFile: String
) {
    fun assetPath(fileName: String): String = "seed/bundled-library/$fileName"
}

data class SeedLibraryData(
    val recipes: List<Recipe> = emptyList(),
    val ingredientReferences: List<IngredientReference> = emptyList(),
    val tags: List<Tag> = emptyList()
)
