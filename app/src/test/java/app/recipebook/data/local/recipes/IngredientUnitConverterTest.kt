package app.recipebook.data.local.recipes

import app.recipebook.loadBundledRecipeForTest
import app.recipebook.loadBundledUnitDefinitionsForTest
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class IngredientUnitConverterTest {
    @Test
    fun standardUnitsUseDocumentedUsCustomaryFactors() {
        val graph = buildIngredientUnitConversionGraph(null, units = loadBundledUnitDefinitionsForTest())
        assertEquals(236.5882, graph.conversionFactor("cup", "ml")!!, 0.0001)
        assertEquals(14.78676, graph.conversionFactor("tbsp", "ml")!!, 0.00001)
        assertEquals(4.928922, graph.conversionFactor("tsp", "ml")!!, 0.000001)
        assertEquals(29.57353, graph.conversionFactor("fl oz", "ml")!!, 0.00001)
        assertEquals(453.5924, graph.conversionFactor("lb", "g")!!, 0.0001)
    }

    @Test
    fun selectedFormDensityBuildsMassVolumePath() {
        val form = IngredientForm(
            id = "form-1", ingredientRefId = "ingredient-1", formCode = "dense",
            labelFr = "dense", labelEn = "dense", densityGPerMl = 1.25, updatedAt = "now"
        )
        val graph = buildIngredientUnitConversionGraph(
            IngredientReference("ingredient-1", "food", "food", updatedAt = "now"), form,
            loadBundledUnitDefinitionsForTest()
        )
        assertEquals(1.25, graph.conversionFactor("ml", "g")!!, 0.000001)
    }

    @Test
    fun conflictingMappingsRejectConversionInsteadOfSelectingOnePath() {
        val reference = IngredientReference(
            id = "ingredient-1",
            nameFr = "aliment",
            nameEn = "food",
            defaultDensity = 0.5,
            unitMappings = listOf(
                IngredientUnitMapping("cup", "g", 120.0),
                IngredientUnitMapping("cup", "g", 121.0)
            ),
            updatedAt = "now"
        )

        val graph = buildIngredientUnitConversionGraph(reference, units = loadBundledUnitDefinitionsForTest())
        assertNull(graph.conversionFactor("cup", "g"))
        assertEquals(false, "g" in graph.unitsConvertibleFrom("cup"))
    }

    @Test
    fun disagreeingMultiStepPathIsRejected() {
        val reference = IngredientReference(
            id = "ingredient-1",
            nameFr = "aliment",
            nameEn = "food",
            defaultDensity = 0.5,
            unitMappings = listOf(IngredientUnitMapping("cup", "g", 120.0)),
            updatedAt = "now"
        )
        val graph = buildIngredientUnitConversionGraph(reference, units = loadBundledUnitDefinitionsForTest())
        assertNull(graph.conversionFactor("cup", "g"))
    }

    @Test
    fun bundledCountAndSizedProduceLinesHaveNoCountToMassMapping() {
        val amaretti = loadBundledRecipeForTest("8ccbf0c1-b6d9-4908-b122-1c7dacba5f0d")
        val peaSoup = loadBundledRecipeForTest("e152b749-db75-4a7c-9bbf-3b94f721451d")
        val cases = listOf(
            amaretti.ingredients.single { it.id.endsWith("-ingredient-4") } to "2 large egg whites (60 g), lightly beaten",
            peaSoup.ingredients.single { it.id.endsWith("-ingredient-3") } to "1 large onion, chopped",
            peaSoup.ingredients.single { it.id.endsWith("-ingredient-6") } to "4 small carrots, diced"
        )
        val units = loadBundledUnitDefinitionsForTest()

        cases.forEach { (line, expectedOriginalText) ->
            val reference = BundledIngredientCatalog.references.single { it.id == line.ingredientRefId }
            val graph = buildIngredientUnitConversionGraph(reference, units = units)

            assertEquals(expectedOriginalText, line.originalText)
            assertNull(reference.defaultDensity)
            assertEquals(emptyList<IngredientUnitMapping>(), reference.unitMappings)
            assertNull(graph.conversionFactor(line.unit.orEmpty(), "g"))
        }
    }
}
