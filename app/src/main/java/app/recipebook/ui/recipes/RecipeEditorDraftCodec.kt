package app.recipebook.ui.recipes

import app.recipebook.data.schema.RecipeCreationPayloadDto
import app.recipebook.data.schema.toDomainRecipe
import app.recipebook.data.schema.toRecipeCreationPayloadDto
import app.recipebook.domain.model.Recipe
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

internal fun encodeEditorRecipe(recipe: Recipe): String {
    val payload = recipe.toRecipeCreationPayloadDto()
    val dto = payload.recipe.copy(
        photos = payload.recipe.photos.mapIndexed { index, photo -> photo.copy(relativePath = recipe.photos[index].localPath) },
        attachments = payload.recipe.attachments.mapIndexed { index, attachment -> attachment.copy(relativePath = recipe.attachments[index].localPath) }
    )
    return Json.encodeToString(payload.copy(recipe = dto))
}

internal fun decodeEditorRecipe(encoded: String): Recipe =
    Json.decodeFromString<RecipeCreationPayloadDto>(encoded).toDomainRecipe()
