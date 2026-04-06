package app.recipebook.ui.recipes

import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.TagCategory
import org.junit.Assert.assertEquals
import org.junit.Test

class RecipeLibraryScreenTest {

    @Test
    fun visibleStarCount_roundsAndClampsRatingsForDisplay() {
        assertEquals(0, visibleStarCount(null))
        assertEquals(0, visibleStarCount(0.0))
        assertEquals(3, visibleStarCount(3.2))
        assertEquals(4, visibleStarCount(3.6))
        assertEquals(5, visibleStarCount(5.8))
    }

    @Test
    fun filterRecipes_returnsAllRecipesWhenNoSearchOrTagFiltersAreActive() {
        val recipes = listOf(
            recipeForFilterTest(id = "recipe-1", titleEn = "Waffles"),
            recipeForFilterTest(id = "recipe-2", titleEn = "Soup")
        )

        val filtered = filterRecipes(
            recipes = recipes,
            searchQuery = "",
            selectedTagIds = emptyList()
        )

        assertEquals(listOf("recipe-1", "recipe-2"), filtered.map { it.id })
    }

    @Test
    fun filterRecipes_requiresEverySelectedTagToMatch() {
        val recipes = listOf(
            recipeForFilterTest(
                id = "recipe-breakfast-quick",
                titleEn = "Quick Omelette",
                tagIds = listOf("tag-breakfast", "tag-quick")
            ),
            recipeForFilterTest(
                id = "recipe-breakfast-only",
                titleEn = "French Toast",
                tagIds = listOf("tag-breakfast")
            ),
            recipeForFilterTest(
                id = "recipe-quick-only",
                titleEn = "Fast Soup",
                tagIds = listOf("tag-quick")
            )
        )

        val filtered = filterRecipes(
            recipes = recipes,
            searchQuery = "",
            selectedTagIds = listOf("tag-breakfast", "tag-quick")
        )

        assertEquals(listOf("recipe-breakfast-quick"), filtered.map { it.id })
    }

    @Test
    fun filterRecipes_combinesTextSearchWithTagFiltering() {
        val recipes = listOf(
            recipeForFilterTest(
                id = "recipe-match",
                titleEn = "Quick Pasta",
                descriptionEn = "Easy dinner idea",
                tagIds = listOf("tag-quick", "tag-dinner")
            ),
            recipeForFilterTest(
                id = "recipe-wrong-tag",
                titleEn = "Quick Salad",
                descriptionEn = "Easy dinner idea",
                tagIds = listOf("tag-quick")
            ),
            recipeForFilterTest(
                id = "recipe-wrong-search",
                titleEn = "Slow Stew",
                descriptionEn = "Weekend project",
                tagIds = listOf("tag-quick", "tag-dinner")
            )
        )

        val filtered = filterRecipes(
            recipes = recipes,
            searchQuery = "pasta",
            selectedTagIds = listOf("tag-quick", "tag-dinner")
        )

        assertEquals(listOf("recipe-match"), filtered.map { it.id })
    }

    @Test
    fun selectedTagsForFilterDialog_returnsOnlySelectedTagsSortedByName() {
        val tags = listOf(
            Tag(
                id = "tag-dessert",
                nameFr = "Dessert",
                nameEn = "Dessert",
                slug = "dessert",
                category = TagCategory.DISH_TYPE
            ),
            Tag(
                id = "tag-cake",
                nameFr = "Gateau",
                nameEn = "Cake",
                slug = "cake",
                category = TagCategory.DISH_TYPE
            ),
            Tag(
                id = "tag-quick",
                nameFr = "Rapide",
                nameEn = "Quick",
                slug = "quick",
                category = TagCategory.EFFORT
            )
        )

        val selected = selectedTagsForFilterDialog(
            tags = tags,
            selectedTagIds = listOf("tag-quick", "tag-cake"),
            language = AppLanguage.EN
        )

        assertEquals(listOf("tag-cake", "tag-quick"), selected.map { it.id })
    }
}

private fun recipeForFilterTest(
    id: String,
    titleEn: String,
    descriptionEn: String = "",
    tagIds: List<String> = emptyList()
): Recipe = Recipe(
    id = id,
    createdAt = "2026-04-06T00:00:00Z",
    updatedAt = "2026-04-06T00:00:00Z",
    languages = BilingualText(
        fr = LocalizedSystemText(
            title = titleEn,
            description = descriptionEn,
            instructions = "",
            notes = ""
        ),
        en = LocalizedSystemText(
            title = titleEn,
            description = descriptionEn,
            instructions = "",
            notes = ""
        )
    ),
    ingredients = listOf(
        IngredientLine(
            id = "$id-ingredient",
            originalText = "ingredient",
            ingredientName = "ingredient"
        )
    ),
    tagIds = tagIds
)
