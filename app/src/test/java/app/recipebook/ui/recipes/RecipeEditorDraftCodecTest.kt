package app.recipebook.ui.recipes

import app.recipebook.domain.model.*
import org.junit.Assert.*
import org.junit.Test

class RecipeEditorDraftCodecTest {
    @Test fun ingredientStateRetainsRawInvalidInputAndNestedMetadata() {
        val row = EditableIngredientRow(id = "line", quantity = "1,2oops", unit = "tasse",
            preparation = LocalizedValue(fr = "haché", en = "chopped"), optional = true, group = "Sauce",
            substitutions = listOf(IngredientLineSubstitution("sub", "line", substitutionRuleId = "rule", createdAt = "now", updatedAt = "now")))
        assertEquals(listOf(row), decodeIngredientRows(encodeIngredientRows(listOf(row))))
    }

    @Test fun editorRecipeRetainsDraftIdActualMediaPathsAndAllFields() {
        val recipe = Recipe(id = "draft-stable-id", createdAt = "now", updatedAt = "now",
            languages = BilingualText(LocalizedSystemText("Titre", "", "Étape", ""), LocalizedSystemText("Title", "", "Step", "")),
            ingredients = emptyList(), mainPhotoId = "photo",
            photos = listOf(PhotoRef("photo", "/cache/recipe-photo-drafts/photo.jpg", "cloud-photo")),
            attachments = listOf(AttachmentRef("attachment", "source.pdf", "application/pdf", "/files/recipe-attachments/source.pdf")))
        assertEquals(recipe, decodeEditorRecipe(encodeEditorRecipe(recipe)))
        assertEquals(recipe.photos, decodeEditorPhotos(encodeEditorPhotos(recipe.photos)))
    }
}
