package app.recipebook.data.local.recipes

import android.content.Context
import app.recipebook.data.schema.FullLibraryPayloadDto
import app.recipebook.data.schema.toDomainLibrary
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.Tag
import kotlinx.serialization.json.Json

object BundledRecipeLibraryLoader {
    private const val BOITE_DE_NOEL_ASSET_PATH = "seed/boite-de-noel.converted.library.v1.json"

    private val json = Json {
        ignoreUnknownKeys = true
    }

    fun loadLibrary(context: Context): SeedLibraryData = runCatching {
        context.assets.open(BOITE_DE_NOEL_ASSET_PATH).bufferedReader().use { reader ->
            val rawJson = reader.readText().trimStart('\uFEFF')
            val library = json.decodeFromString(FullLibraryPayloadDto.serializer(), rawJson)
                .toDomainLibrary()
            SeedLibraryData(
                recipes = normalizeBundledRecipes(library.recipes),
                ingredientReferences = mergeBundledIngredientReferences(library.ingredientReferences),
                tags = library.tags
            )
        }
    }.getOrElse {
        SeedLibraryData(ingredientReferences = mergeBundledIngredientReferences(emptyList()))
    }
}

data class SeedLibraryData(
    val recipes: List<Recipe> = emptyList(),
    val ingredientReferences: List<IngredientReference> = emptyList(),
    val tags: List<Tag> = emptyList()
)

