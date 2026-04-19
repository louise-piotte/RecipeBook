package app.recipebook.data.local.recipes

import app.recipebook.data.schema.CollectionDto
import app.recipebook.data.schema.ContextualSubstitutionRuleDto
import app.recipebook.data.schema.FullLibraryPayloadDto
import app.recipebook.data.schema.IngredientFormDto
import app.recipebook.data.schema.IngredientReferenceDto
import app.recipebook.data.schema.LibraryMetadataDto
import app.recipebook.data.schema.LibrarySettingsDto
import app.recipebook.data.schema.RecipeDto
import app.recipebook.data.schema.SubstitutionRuleDto
import app.recipebook.data.schema.TagDto
import app.recipebook.data.schema.UnitDefinitionDto
import app.recipebook.data.schema.toFullLibraryPayloadDto
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLibrary
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.text.Normalizer
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

internal object RecipeExportCodec {
    private const val PACKAGE_SCHEMA_VERSION = "bundled-seed-package/v1"
    private const val MANIFEST_FILE = "manifest.v1.json"
    private const val METADATA_FILE = "metadata.v1.json"
    private const val INGREDIENT_REFERENCES_FILE = "ingredient-references.v1.json"
    private const val INGREDIENT_FORMS_FILE = "ingredient-forms.v1.json"
    private const val SUBSTITUTION_RULES_FILE = "substitution-rules.v1.json"
    private const val CONTEXTUAL_SUBSTITUTION_RULES_FILE = "contextual-substitution-rules.v1.json"
    private const val UNITS_FILE = "units.v1.json"
    private const val TAGS_FILE = "tags.v1.json"
    private const val COLLECTIONS_FILE = "collections.v1.json"
    private const val SETTINGS_FILE = "settings.v1.json"

    private val json = Json {
        prettyPrint = true
        encodeDefaults = true
        explicitNulls = false
        ignoreUnknownKeys = false
    }

    fun writeSeedPackageZip(
        library: RecipeLibrary,
        outputFile: File
    ): SeedExportBundle {
        val payload = library.sortedForExport().toFullLibraryPayloadDto()
        val recipeFiles = payload.library.recipes.mapIndexed { index, recipe ->
            packagedRecipeFileName(index = index, totalRecipes = payload.library.recipes.size, recipe = recipe)
        }
        val manifest = SeedExportManifestDto(
            schemaVersion = PACKAGE_SCHEMA_VERSION,
            packageId = "recipebook-library-export",
            metadataFile = METADATA_FILE,
            ingredientReferencesFile = INGREDIENT_REFERENCES_FILE,
            ingredientFormsFile = INGREDIENT_FORMS_FILE,
            substitutionRulesFile = SUBSTITUTION_RULES_FILE,
            contextualSubstitutionRulesFile = CONTEXTUAL_SUBSTITUTION_RULES_FILE,
            unitsFile = UNITS_FILE,
            tagsFile = TAGS_FILE,
            collectionsFile = COLLECTIONS_FILE,
            settingsFile = SETTINGS_FILE,
            recipeFiles = recipeFiles
        )
        val originalRecipesById = library.recipes.associateBy(Recipe::id)

        outputFile.parentFile?.mkdirs()
        ZipOutputStream(FileOutputStream(outputFile)).use { zip ->
            zip.putJsonEntry(MANIFEST_FILE, SeedExportManifestDto.serializer(), manifest)
            zip.putJsonEntry(METADATA_FILE, LibraryMetadataDto.serializer(), payload.library.metadata)
            zip.putJsonEntry(
                INGREDIENT_REFERENCES_FILE,
                ListSerializer(IngredientReferenceDto.serializer()),
                payload.library.ingredientReferences
            )
            zip.putJsonEntry(
                INGREDIENT_FORMS_FILE,
                ListSerializer(IngredientFormDto.serializer()),
                payload.library.ingredientForms
            )
            zip.putJsonEntry(
                SUBSTITUTION_RULES_FILE,
                ListSerializer(SubstitutionRuleDto.serializer()),
                payload.library.substitutionRules
            )
            zip.putJsonEntry(
                CONTEXTUAL_SUBSTITUTION_RULES_FILE,
                ListSerializer(ContextualSubstitutionRuleDto.serializer()),
                payload.library.contextualSubstitutionRules
            )
            zip.putJsonEntry(UNITS_FILE, ListSerializer(UnitDefinitionDto.serializer()), payload.library.units)
            zip.putJsonEntry(TAGS_FILE, ListSerializer(TagDto.serializer()), payload.library.tags)
            zip.putJsonEntry(COLLECTIONS_FILE, ListSerializer(CollectionDto.serializer()), payload.library.collections)
            zip.putJsonEntry(SETTINGS_FILE, LibrarySettingsDto.serializer(), payload.library.settings)

            payload.library.recipes.zip(recipeFiles).forEach { (recipeDto, recipeFile) ->
                zip.putJsonEntry(recipeFile, RecipeDto.serializer(), recipeDto)
                val sourceRecipe = requireNotNull(originalRecipesById[recipeDto.id]) {
                    "Missing source recipe for export ${recipeDto.id}"
                }
                sourceRecipe.photos.forEach { photo ->
                    val exportedPhoto = recipeDto.photos.firstOrNull { it.id == photo.id }
                        ?: error("Missing exported photo path for ${photo.id}")
                    zip.putFileEntry(exportedPhoto.relativePath, File(photo.localPath))
                }
                sourceRecipe.attachments.forEach { attachment ->
                    val exportedAttachment = recipeDto.attachments.firstOrNull { it.id == attachment.id }
                        ?: error("Missing exported attachment path for ${attachment.id}")
                    zip.putFileEntry(exportedAttachment.relativePath, File(attachment.localPath))
                }
            }
        }

        return SeedExportBundle(
            archiveFile = outputFile,
            suggestedFileName = outputFile.name,
            manifest = manifest
        )
    }

    fun encodeIngredientCatalogJson(library: RecipeLibrary): String {
        val payload = library.sortedForExport().toFullLibraryPayloadDto()
        return json.encodeToString(
            IngredientCatalogExportDto.serializer(),
            IngredientCatalogExportDto(
                schemaVersion = "ingredient-catalog/v1",
                ingredientReferences = payload.library.ingredientReferences,
                ingredientForms = payload.library.ingredientForms,
                substitutionRules = payload.library.substitutionRules,
                contextualSubstitutionRules = payload.library.contextualSubstitutionRules
            )
        )
    }

    private fun RecipeLibrary.sortedForExport(): RecipeLibrary = copy(
        recipes = recipes.sortedWith(
            compareBy(
                { recipeSlugCandidate(it) },
                Recipe::id
            )
        )
    )

    private fun recipeSlugCandidate(recipe: Recipe): String {
        return listOf(
            recipe.languages.fr.title,
            recipe.languages.en.title
        ).firstOrNull { it.isNotBlank() } ?: recipe.id
    }

    private fun packagedRecipeFileName(index: Int, totalRecipes: Int, recipe: RecipeDto): String {
        val digits = maxOf(3, totalRecipes.toString().length)
        val recipeSlug = slugify(
            listOf(
                recipe.languages.fr.title,
                recipe.languages.en.title
            ).firstOrNull { it.isNotBlank() } ?: recipe.id
        )
        return "recipes/${(index + 1).toString().padStart(digits, '0')}-$recipeSlug-${recipe.id}.v1.json"
    }

    private fun slugify(input: String): String {
        val normalized = Normalizer.normalize(input.lowercase(), Normalizer.Form.NFD)
            .replace("\\p{M}+".toRegex(), "")
        return normalized
            .replace("[^a-z0-9]+".toRegex(), "-")
            .trim('-')
            .ifBlank { "recipe" }
    }

    private fun ZipOutputStream.putFileEntry(path: String, file: File) {
        require(file.exists()) { "Export asset is missing: ${file.absolutePath}" }
        putNextEntry(ZipEntry(path))
        FileInputStream(file).use { input -> input.copyTo(this) }
        closeEntry()
    }

    private fun <T> ZipOutputStream.putJsonEntry(
        path: String,
        serializer: kotlinx.serialization.SerializationStrategy<T>,
        value: T
    ) {
        putNextEntry(ZipEntry(path))
        write(json.encodeToString(serializer, value).toByteArray(Charsets.UTF_8))
        closeEntry()
    }
}

internal data class SeedExportBundle(
    val archiveFile: File,
    val suggestedFileName: String,
    val manifest: SeedExportManifestDto
)

@Serializable
internal data class SeedExportManifestDto(
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
)

@Serializable
internal data class IngredientCatalogExportDto(
    val schemaVersion: String,
    val ingredientReferences: List<IngredientReferenceDto>,
    val ingredientForms: List<IngredientFormDto>,
    val substitutionRules: List<SubstitutionRuleDto>,
    val contextualSubstitutionRules: List<ContextualSubstitutionRuleDto>
)
