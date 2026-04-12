package app.recipebook.data.local.recipes

import app.recipebook.domain.model.RecipeLink
import app.recipebook.domain.model.RecipeLinkType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
internal data class RecipeKeeperProcessedRecipeDto(
    @SerialName("recipeId")
    val recipeId: String,
    @SerialName("title")
    val title: String,
    @SerialName("linkedRecipeId")
    val linkedRecipeId: String? = null,
    @SerialName("course")
    val course: String? = null,
    @SerialName("categories")
    val categories: List<String> = emptyList()
)

internal object RecipeKeeperRecipeImport {
    private val json = Json { ignoreUnknownKeys = true }

    fun parseRecipe(jsonText: String): RecipeKeeperProcessedRecipeDto =
        json.decodeFromString(RecipeKeeperProcessedRecipeDto.serializer(), jsonText)

    fun mapLegacyLinkedRecipeIds(recipeJsonTexts: List<String>): Map<String, List<RecipeLink>> {
        val recipes = recipeJsonTexts.map(::parseRecipe)
        val recipesById = recipes.associateBy(RecipeKeeperProcessedRecipeDto::recipeId)
        return recipes.associate { recipe ->
            recipe.recipeId to canonicalRecipeLinksFor(recipe, recipesById)
        }
    }

    internal fun canonicalRecipeLinksFor(
        recipe: RecipeKeeperProcessedRecipeDto,
        recipesById: Map<String, RecipeKeeperProcessedRecipeDto>
    ): List<RecipeLink> {
        val linkedRecipeId = recipe.linkedRecipeId
            ?.trim()
            ?.takeUnless(String::isBlank)
            ?.takeUnless { it == recipe.recipeId }
            ?: return emptyList()
        val targetRecipe = recipesById[linkedRecipeId]
        return listOf(
            RecipeLink(
                id = "recipe-link-${recipe.recipeId}-$linkedRecipeId",
                targetRecipeId = linkedRecipeId,
                linkType = inferLinkType(recipe, targetRecipe)
            )
        )
    }

    private fun inferLinkType(
        recipe: RecipeKeeperProcessedRecipeDto,
        targetRecipe: RecipeKeeperProcessedRecipeDto?
    ): RecipeLinkType {
        val searchText = buildString {
            append(recipe.title)
            append(' ')
            append(recipe.course.orEmpty())
            append(' ')
            append(recipe.categories.joinToString(" "))
            append(' ')
            if (targetRecipe != null) {
                append(targetRecipe.title)
                append(' ')
                append(targetRecipe.course.orEmpty())
                append(' ')
                append(targetRecipe.categories.joinToString(" "))
            }
        }.lowercase()

        return when {
            searchText.containsAny("frosting", "buttercream", "icing", "glassage", "gla") -> RecipeLinkType.FROSTING
            searchText.containsAny("filling", "garniture") -> RecipeLinkType.FILLING
            searchText.containsAny("sauce") -> RecipeLinkType.SAUCE
            searchText.containsAny("rub", "seasoning", "epice", "spice") -> RecipeLinkType.SEASONING
            searchText.containsAny("topping") -> RecipeLinkType.TOPPING
            searchText.containsAny("side", "accompagnement") -> RecipeLinkType.SIDE
            searchText.containsAny("pairing") -> RecipeLinkType.PAIRING
            searchText.containsAny("crust", "dough", "paste", "marzipan", "ingredient") -> RecipeLinkType.COMPONENT
            else -> RecipeLinkType.OTHER
        }
    }
}

private fun String.containsAny(vararg needles: String): Boolean = needles.any(this::contains)
