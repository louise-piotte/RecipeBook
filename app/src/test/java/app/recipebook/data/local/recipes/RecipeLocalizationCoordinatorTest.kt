package app.recipebook.data.local.recipes

import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.BilingualSyncStatus
import app.recipebook.domain.model.ImportMetadata
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.LocalizedValue
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlinx.coroutines.runBlocking

class RecipeLocalizationCoordinatorTest {

    private val coordinator = RecipeLocalizationCoordinator()

    @Test
    fun finalizeForSave_normalizesAuthoritativeLanguageAndPreservesOppositeLanguage() {
        val recipe = sampleRecipe().copy(
            languages = BilingualText(
                fr = LocalizedSystemText(
                    title = "  Titre revu  ",
                    description = "  Description revue  ",
                    instructions = " Etape 1 \n\n Etape 2 ",
                    notes = "  Note revue  "
                ),
                en = LocalizedSystemText(
                    title = "Existing English",
                    description = "Existing description",
                    instructions = "Existing step",
                    notes = "Existing note"
                )
            )
        )

        val finalized = coordinator.finalizeForSave(recipe, AppLanguage.FR)

        assertEquals("Titre revu", finalized.languages.fr.title)
        assertEquals("Description revue", finalized.languages.fr.description)
        assertEquals("Etape 1\nEtape 2", finalized.languages.fr.instructions)
        assertEquals("Note revue", finalized.languages.fr.notes)
        assertEquals("Existing English", finalized.languages.en.title)
        assertEquals("Existing description", finalized.languages.en.description)
        assertEquals(AppLanguage.FR, finalized.importMetadata?.authoritativeLanguage)
        assertEquals(BilingualSyncStatus.UP_TO_DATE, finalized.importMetadata?.syncStatusFr)
        assertEquals(BilingualSyncStatus.NEEDS_REGENERATION, finalized.importMetadata?.syncStatusEn)
    }

    @Test
    fun finalizeForSave_leavesBlankOppositeLanguageBlank() {
        val recipe = sampleRecipe().copy(
            languages = BilingualText(
                fr = LocalizedSystemText(title = "", description = "", instructions = "", notes = ""),
                en = LocalizedSystemText(
                    title = "  Reviewed title  ",
                    description = "",
                    instructions = " Step 1 ",
                    notes = ""
                )
            )
        )

        val finalized = coordinator.finalizeForSave(recipe, AppLanguage.EN)

        assertEquals("", finalized.languages.fr.title)
        assertEquals("", finalized.languages.fr.instructions)
        assertEquals("Reviewed title", finalized.languages.en.title)
        assertEquals("Step 1", finalized.languages.en.instructions)
        assertEquals(BilingualSyncStatus.MISSING, finalized.importMetadata?.syncStatusFr)
        assertEquals(BilingualSyncStatus.UP_TO_DATE, finalized.importMetadata?.syncStatusEn)
    }

    @Test
    fun finalizeForSave_preservesUpToDateOppositeLanguageAfterRegeneration() {
        val recipe = sampleRecipe().copy(
            languages = BilingualText(
                fr = LocalizedSystemText(
                    title = "Titre g\u00e9n\u00e9r\u00e9",
                    description = "",
                    instructions = "Etape 1",
                    notes = "Brouillon"
                ),
                en = LocalizedSystemText(
                    title = "Reviewed title",
                    description = "",
                    instructions = "Step 1",
                    notes = ""
                )
            ),
            importMetadata = ImportMetadata(
                authoritativeLanguage = AppLanguage.EN,
                syncStatusFr = BilingualSyncStatus.UP_TO_DATE,
                syncStatusEn = BilingualSyncStatus.UP_TO_DATE
            )
        )

        val finalized = coordinator.finalizeForSave(recipe, AppLanguage.EN)

        assertEquals(BilingualSyncStatus.UP_TO_DATE, finalized.importMetadata?.syncStatusFr)
        assertEquals(BilingualSyncStatus.UP_TO_DATE, finalized.importMetadata?.syncStatusEn)
    }

    @Test
    fun regenerateOppositeLanguage_appliesStubContentAndMarksBothLanguagesUpToDate() = runBlocking {
        val recipe = sampleRecipe().copy(
            languages = BilingualText(
                fr = LocalizedSystemText(title = "", description = "", instructions = "", notes = ""),
                en = LocalizedSystemText(
                    title = "Reviewed title",
                    description = "Reviewed description",
                    instructions = "Step 1\nStep 2",
                    notes = ""
                )
            )
        )

        val regenerated = coordinator.regenerateOppositeLanguage(recipe, AppLanguage.EN).recipe

        assertEquals("Reviewed title", regenerated.languages.fr.title)
        assertEquals("Reviewed description", regenerated.languages.fr.description)
        assertEquals("Step 1\nStep 2", regenerated.languages.fr.instructions)
        assertEquals(
            "Brouillon local simul\u00e9 \u00e0 r\u00e9viser.",
            regenerated.languages.fr.notes
        )
        assertEquals("local_stub", regenerated.importMetadata?.generatorLabel)
        assertEquals(BilingualSyncStatus.UP_TO_DATE, regenerated.importMetadata?.syncStatusFr)
        assertEquals(BilingualSyncStatus.UP_TO_DATE, regenerated.importMetadata?.syncStatusEn)
    }

    @Test
    fun regenerateOppositeLanguage_keepsSharedIngredientTextInAuthoritativeLanguage() = runBlocking {
        val coordinator = RecipeLocalizationCoordinator(
            regenerator = object : RecipeLanguageRegenerator {
                override suspend fun regenerateOppositeLanguage(
                    request: RecipeLanguageRegenerationRequest
                ): RecipeLanguageRegenerationResult = RecipeLanguageRegenerationResult(
                    generatedLanguage = AppLanguage.FR,
                    generatedText = LocalizedSystemText(
                        title = "Titre regenere",
                        description = "",
                        instructions = "",
                        notes = ""
                    ),
                    generatorLabel = "test",
                    generatedIngredients = listOf(
                        RegeneratedIngredientLine(
                            id = "ingredient-1",
                            ingredientName = "farine",
                            originalText = "200 g farine",
                            preparation = "tamisee",
                            notes = "pour decorer"
                        )
                    )
                )
            }
        )

        val regenerated = coordinator.regenerateOppositeLanguage(sampleRecipe(), AppLanguage.EN).recipe

        assertEquals("flour", regenerated.ingredients.single().ingredientName)
        assertEquals("200 g flour", regenerated.ingredients.single().originalText)
        assertEquals("Titre regenere", regenerated.languages.fr.title)
        assertEquals("tamisee", regenerated.ingredients.single().preparation.fr)
        assertEquals("sifted", regenerated.ingredients.single().preparation.en)
        assertEquals("pour decorer", regenerated.ingredients.single().notes.fr)
        assertEquals("for garnish", regenerated.ingredients.single().notes.en)
    }

    private fun sampleRecipe(): Recipe = Recipe(
        id = "recipe-1",
        createdAt = "2026-04-12T00:00:00Z",
        updatedAt = "2026-04-12T00:00:00Z",
        languages = BilingualText(
            fr = LocalizedSystemText(title = "", description = "", instructions = "", notes = ""),
            en = LocalizedSystemText(title = "", description = "", instructions = "", notes = "")
        ),
        ingredients = listOf(
            IngredientLine(
                id = "ingredient-1",
                originalText = "200 g flour",
                ingredientName = "flour",
                preparation = LocalizedValue(en = "sifted"),
                notes = LocalizedValue(en = "for garnish")
            )
        )
    )
}
