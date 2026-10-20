package app.recipebook.ui.recipes

import app.recipebook.loadBundledUnitDefinitionsForTest
import app.recipebook.loadBundledRecipeForTest
import app.recipebook.data.local.recipes.IngredientSubstitutionSuggestion
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientPackageAmount
import app.recipebook.domain.model.IngredientPackageType
import app.recipebook.domain.model.PackageYieldBasis
import app.recipebook.domain.model.PackageYieldObservation
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.LocalizedValue
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.model.UnitType
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionRiskLevel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class RecipeDetailScreenTest {
    @Test
    fun scaleRecipeQuantityChangesOnlyFiniteStructuredAmounts() {
        assertEquals(6.0, requireNotNull(scaleRecipeQuantity(2.0, 3.0)), 0.0)
        assertNull(scaleRecipeQuantity(null, 3.0))
        assertEquals(2.0, requireNotNull(scaleRecipeQuantity(2.0, 0.0)), 0.0)
        assertEquals(2.0, requireNotNull(scaleRecipeQuantity(2.0, Double.POSITIVE_INFINITY)), 0.0)
    }

    @Test
    fun scalingPackageAmountChangesOnlyCountAndResetUsesStoredAmount() {
        val original = IngredientPackageAmount(
            count = 1.0,
            packageType = IngredientPackageType.CAN,
            declaredNetQuantity = 15.0,
            declaredNetUnit = "oz",
            packingMedium = "water",
            brand = "S&W",
            productCode = "1320217103112",
            countryOfOrigin = "USA",
            requestedBasis = PackageYieldBasis.DRAINED_MASS
        )

        assertEquals(original.copy(count = 2.0), scaleIngredientPackageAmount(original, 2.0))
        assertEquals(original.copy(count = 0.5), scaleIngredientPackageAmount(original, 0.5))
        assertEquals(original, scaleIngredientPackageAmount(original, 1.0))
        assertEquals(original, scaleIngredientPackageAmount(original, 0.0))
        assertEquals(original, scaleIngredientPackageAmount(original, Double.POSITIVE_INFINITY))
        assertEquals(1.0, original.count, 0.0)
    }

    @Test
    fun bundledEggWhiteCountDoesNotOfferGramConversion() {
        val recipe = loadBundledRecipeForTest("8ccbf0c1-b6d9-4908-b122-1c7dacba5f0d")
        val line = recipe.ingredients.single { it.id.endsWith("-ingredient-4") }
        val reference = app.recipebook.data.local.recipes.BundledIngredientCatalog.references
            .single { it.id == "ingredient-ref-egg-white" }
        val units = loadBundledUnitDefinitionsForTest()

        assertEquals("2 large egg whites (60 g), lightly beaten", line.originalText)
        assertEquals("2 large egg whites, lightly beaten", buildDetailIngredientText(line, reference, AppLanguage.EN))
        assertEquals(2.0, requireNotNull(line.quantity), 0.0)
        assertEquals("large egg white", line.unit)
        assertNull(
            convertIngredientQuantity(
                line.quantity,
                line.unit,
                "g",
                reference,
                units = units,
                ingredientRefId = reference.id
            )
        )
        assertFalse(
            "g" in availableConversionUnits(
                line.unit,
                reference,
                units = units,
                ingredientRefId = reference.id
            )
        )
    }

    @Test
    fun selectedIngredientFormKeepsSpecificGradeVisibleInRecipeDetail() {
        val crab = IngredientReference(
            id = "ingredient-ref-crab",
            nameFr = "chair de crabe",
            nameEn = "crab meat",
            updatedAt = "2026-10-11T00:00:00Z"
        )
        val jumboLump = IngredientForm(
            id = "ingredient-form-crab-jumbo-lump",
            ingredientRefId = crab.id,
            formCode = "jumbo_lump",
            labelFr = "chair de crabe en gros morceaux (jumbo lump)",
            labelEn = "jumbo lump crab meat",
            updatedAt = "2026-10-11T00:00:00Z"
        )
        val line = IngredientLine(
            id = "crab-line",
            ingredientRefId = crab.id,
            ingredientFormId = jumboLump.id,
            originalText = "1 lb jumbo lump crab meat",
            quantity = 1.0,
            unit = "lb",
            ingredientName = "jumbo lump crab meat"
        )

        assertEquals(
            "1 lb jumbo lump crab meat",
            buildDetailIngredientText(line, crab, AppLanguage.EN, ingredientForm = jumboLump)
        )
        assertEquals(
            "1 lb chair de crabe en gros morceaux (jumbo lump)",
            buildDetailIngredientText(line, crab, AppLanguage.FR, ingredientForm = jumboLump)
        )
    }

    @Test fun countDisplayScalingAndConversionsPreserveStoredIngredientEvidence() {
        val line = IngredientLine(id = "egg", originalText = "2 large egg whites (60 g), lightly beaten", quantity = 2.0,
            unit = "large egg white", ingredientName = "egg white",
            preparation = LocalizedValue(fr = "légèrement battu", en = "lightly beaten"),
            notes = LocalizedValue(fr = "pour la pâte", en = "for the dough"))
        val reference = IngredientReference(id = "egg-white", nameFr = "blanc d'œuf", nameEn = "egg white",
            unitMappings = listOf(IngredientUnitMapping("large egg white", "g", 30.0)), updatedAt = "2026-10-05T00:00:00Z")
        assertEquals("2 large egg whites, lightly beaten (for the dough)", buildDetailIngredientText(line, reference, AppLanguage.EN))
        assertEquals("2 blancs de gros œufs, légèrement battus (pour la pâte)", buildDetailIngredientText(line, reference, AppLanguage.FR))
        assertEquals("1 blanc de gros œuf, légèrement battu (pour la pâte)", buildDetailIngredientText(line, reference, AppLanguage.FR, quantityOverride = 1.0))
        assertEquals(60.0, requireNotNull(convertIngredientQuantity(line.quantity, line.unit, "g", reference, units = loadBundledUnitDefinitionsForTest())), 0.000001)
        assertEquals("60 g egg white, lightly beaten (for the dough)", buildIngredientConversionOptionLabel(60.0, "g", line, reference, AppLanguage.EN))
        assertEquals("2 large egg whites (60 g), lightly beaten", line.originalText)
        assertEquals("large egg white", line.unit)
        assertEquals("légèrement battu", line.preparation.fr)
        assertEquals(2.0, requireNotNull(line.quantity), 0.000001)
    }

    @Test fun massAndVolumeDetailTextIsNotPluralizedByCountGrammar() {
        val line = IngredientLine(id = "egg", originalText = "", quantity = 2.0, unit = "g", ingredientName = "egg white",
            preparation = LocalizedValue(fr = "légèrement battu", en = "lightly beaten"))
        val reference = IngredientReference(id = "egg-white", nameFr = "blanc d'œuf", nameEn = "egg white", updatedAt = "2026-10-05T00:00:00Z")
        assertEquals("2 g egg white, lightly beaten", buildDetailIngredientText(line, reference, AppLanguage.EN))
        assertEquals("2 g blanc d'œuf, légèrement battu", buildDetailIngredientText(line, reference, AppLanguage.FR))
        assertEquals("2 cups egg white, lightly beaten", buildDetailIngredientText(line.copy(unit = "cup"), reference, AppLanguage.EN))
        assertEquals("2 tasses blanc d'œuf, légèrement battu", buildDetailIngredientText(line.copy(unit = "cup"), reference, AppLanguage.FR))
    }

    @Test
    fun smallMassConversionDoesNotBecomeZero() {
        assertTrue(requireNotNull(convertIngredientQuantity(0.01, "g", "kg", null, units = loadBundledUnitDefinitionsForTest())) > 0.0)
    }

    @Test
    fun packageYieldDetailConversionsUseCompactMeasurementPrecision() {
        val form = IngredientForm(
            id = "black-beans-canned-drained",
            ingredientRefId = "black-beans",
            formCode = "canned_drained",
            labelFr = "haricots noirs en conserve, égouttés",
            labelEn = "canned black beans, drained",
            prepState = "drained",
            updatedAt = "2026-10-06T00:00:00Z"
        )
        val observation = PackageYieldObservation(
            id = "sw-black-beans-15oz",
            ingredientRefId = "black-beans",
            ingredientFormId = form.id,
            packageType = IngredientPackageType.CAN,
            declaredNetQuantity = 15.0,
            declaredNetUnit = "oz",
            netMassG = 425.0,
            drainedMassG = 240.0,
            brand = "S&W",
            sourceUrl = "https://example.com/source",
            sourceName = "S&W Catalogue"
        )
        val amount = IngredientPackageAmount(
            count = 1.0,
            packageType = IngredientPackageType.CAN,
            declaredNetQuantity = 15.0,
            declaredNetUnit = "oz",
            requestedBasis = PackageYieldBasis.DRAINED_MASS
        )
        val units = listOf(
            UnitDefinition("g", "g", "gramme", "gram", UnitType.MASS, "g", 1.0),
            UnitDefinition("oz", "oz", "once", "ounce", UnitType.MASS, "g", 28.349523125)
        )

        val converted = convertIngredientQuantity(
            quantity = 1.0,
            fromUnit = "can",
            toUnit = "oz",
            ingredientReference = null,
            ingredientForm = form,
            units = units,
            ingredientRefId = "black-beans",
            packageAmount = amount,
            packageYields = listOf(observation)
        )

        assertEquals(8.45, requireNotNull(converted), 0.000001)
    }

    @Test
    fun frenchUnitsHaveTheSameConversionsAsCanonicalEnglishUnits() {
        val units = loadBundledUnitDefinitionsForTest()
        assertEquals(convertIngredientQuantity(1.0, "cup", "ml", null, units = units), convertIngredientQuantity(1.0, "tasse", "millilitres", null, units = units))
    }


    @Test
    fun buildDetailTagText_formatsTagsAsCommaSeparatedText() {
        val tags = listOf(
            app.recipebook.domain.model.Tag(id = "tag-1", nameFr = "Dessert", nameEn = "Dessert", slug = "dessert"),
            app.recipebook.domain.model.Tag(id = "tag-2", nameFr = "Fete", nameEn = "Holiday", slug = "holiday")
        )

        val result = buildDetailTagText(tags, AppLanguage.EN)

        assertEquals("Dessert, Holiday", result)
    }

    @Test
    fun buildDetailIngredientText_localizesStructuredIngredientLineInFrench() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-butter",
            originalText = "1 cup butter, divided",
            quantity = 1.0,
            unit = "cup",
            ingredientName = "butter",
            preparation = LocalizedValue(fr = "divis\u00e9", en = "divided"),
            notes = LocalizedValue(fr = "pour cuisson", en = "baking")
        )
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-butter",
            nameFr = "beurre",
            nameEn = "butter",
            updatedAt = "2026-03-16T00:00:00Z"
        )

        val result = buildDetailIngredientText(ingredient, ingredientReference, AppLanguage.FR)

        assertEquals("1 tasse beurre, divis\u00E9 (pour cuisson)", result)
    }

    @Test
    fun buildDetailIngredientText_keepsEnglishStructuredIngredientLineInEnglish() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            ingredientRefId = "ingredient-ref-butter",
            originalText = "1 cup butter, divided",
            quantity = 1.0,
            unit = "cup",
            ingredientName = "butter",
            preparation = LocalizedValue(fr = "divis\u00e9", en = "divided"),
            notes = LocalizedValue(fr = "pour cuisson", en = "baking")
        )
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-butter",
            nameFr = "beurre",
            nameEn = "butter",
            updatedAt = "2026-03-16T00:00:00Z"
        )

        val result = buildDetailIngredientText(ingredient, ingredientReference, AppLanguage.EN)

        assertEquals("1 cup butter, divided (baking)", result)
    }

    @Test
    fun buildDetailIngredientText_usesFractionGlyphsForCommonCupAmounts() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            originalText = "",
            quantity = 2.0 / 3.0,
            unit = "cup",
            ingredientName = "sugar"
        )

        val result = buildDetailIngredientText(ingredient, null, AppLanguage.EN)

        assertEquals("\u2154 cup sugar", result)
    }

    @Test
    fun buildDetailIngredientText_usesTablespoonsForAwkwardCupAmounts() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            originalText = "",
            quantity = 0.375,
            unit = "cup",
            ingredientName = "sugar"
        )

        val result = buildDetailIngredientText(ingredient, null, AppLanguage.EN)

        assertEquals("6 tbsp sugar", result)
    }

    @Test
    fun buildDetailIngredientText_usesTeaspoonFractionsForAwkwardTablespoons() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            originalText = "",
            quantity = 0.25,
            unit = "tbsp",
            ingredientName = "vanilla"
        )

        val result = buildDetailIngredientText(ingredient, null, AppLanguage.EN)

        assertEquals("\u00BE tsp vanilla", result)
    }

    @Test
    fun buildIngredientSubstitutionOptionLabel_usesSubstitutionNameAndAmount() {
        val ingredient = IngredientLine(
            id = "ingredient-1",
            originalText = "2 tbsp flour",
            quantity = 2.0,
            unit = "tbsp",
            ingredientName = "flour"
        )
        val substitution = IngredientSubstitutionSuggestion(
            id = "sub-1",
            displayNameFr = "f\u00e9cule de ma\u00efs",
            displayNameEn = "cornstarch",
            quantity = 1.0,
            unit = "tbsp",
            riskLevel = SubstitutionRiskLevel.HIGH_RISK,
            confidence = SubstitutionConfidence.TESTED,
            warningTextFr = "Utiliser seulement pour \u00e9paissir une sauce.",
            warningTextEn = "Use only to thicken a sauce."
        )

        val result = buildIngredientSubstitutionOptionLabel(ingredient, substitution, AppLanguage.EN)

        assertEquals("1 tbsp cornstarch", result)
    }

    @Test
    fun convertIngredientQuantity_usesIngredientMappingsAndDensity() {
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-flour",
            nameFr = "farine",
            nameEn = "flour",
            defaultDensity = null,
            unitMappings = listOf(
                IngredientUnitMapping(fromUnit = "cup", toUnit = "g", factor = 120.0),
                IngredientUnitMapping(fromUnit = "tbsp", toUnit = "g", factor = 7.5)
            ),
            updatedAt = "2026-03-21T00:00:00Z"
        )

        val units = loadBundledUnitDefinitionsForTest()
        assertEquals(120.0, requireNotNull(convertIngredientQuantity(1.0, "cup", "g", ingredientReference, units = units)), 0.001)
        assertEquals(16.0, requireNotNull(convertIngredientQuantity(120.0, "g", "tbsp", ingredientReference, units = units)), 0.001)
        assertEquals(1.0, requireNotNull(convertIngredientQuantity(120.0, "g", "cup", ingredientReference, units = units)), 0.001)
    }

    @Test
    fun convertIngredientQuantity_supportsStandardUnitsWithoutIngredientMapping() {
        val units = loadBundledUnitDefinitionsForTest()
        assertEquals(454.0, requireNotNull(convertIngredientQuantity(1.0, "lb", "g", null, units = units)), 0.001)
        assertEquals(8.0, requireNotNull(convertIngredientQuantity(1.0, "cup", "fl oz", null, units = units)), 0.001)
    }

    @Test
    fun availableConversionUnits_returnsReachableUnitsSortedByCategory() {
        val ingredientReference = IngredientReference(
            id = "ingredient-ref-water",
            nameFr = "eau",
            nameEn = "water",
            defaultDensity = 1.0,
            unitMappings = emptyList(),
            updatedAt = "2026-03-21T00:00:00Z"
        )

        val units = availableConversionUnits("cup", ingredientReference, units = loadBundledUnitDefinitionsForTest())

        assertTrue(units.containsAll(listOf("g", "ml", "tbsp", "tsp", "fl oz")))
        assertEquals("g", units.first())
    }

    @Test
    fun recipeSource_displayText_prefersNameWhenPresent() {
        val source = RecipeSource(
            sourceUrl = "https://example.com/recipe",
            sourceName = "Example Kitchen"
        )

        assertEquals("Example Kitchen", source.displayText())
        assertEquals("https://example.com/recipe", source.clickableUrlOrNull())
    }

    @Test
    fun recipeSource_withoutUrl_staysPlainText() {
        val source = RecipeSource(
            sourceUrl = "   ",
            sourceName = "Family recipe card"
        )

        assertEquals("Family recipe card", source.displayText())
        assertEquals(null, source.clickableUrlOrNull())
    }
}




