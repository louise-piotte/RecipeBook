package app.recipebook.data.local.recipes

import android.content.Context
import app.recipebook.data.schema.FullLibraryPayloadDto
import app.recipebook.data.schema.toDomainLibrary
import app.recipebook.domain.model.Recipe
import kotlinx.serialization.json.Json

object BundledRecipeLibraryLoader {
    private const val BOITE_DE_NOEL_ASSET_PATH = "seed/boite-de-noel.converted.library.v1.json"

    private val json = Json {
        ignoreUnknownKeys = true
    }

    fun loadRecipes(context: Context): List<Recipe> = runCatching {
        context.assets.open(BOITE_DE_NOEL_ASSET_PATH).bufferedReader().use { reader ->
            val rawJson = reader.readText().trimStart('\uFEFF')
            json.decodeFromString(FullLibraryPayloadDto.serializer(), rawJson)
                .toDomainLibrary()
                .recipes
        }
    }.getOrElse {
        emptyList()
    }
}
