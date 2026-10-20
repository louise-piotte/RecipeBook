package app.recipebook.data.local.recipes

import app.recipebook.loadBundledIngredientFormsForTest
import app.recipebook.loadBundledPackageYieldObservationsForTest
import app.recipebook.loadBundledRecipeForTest
import app.recipebook.loadBundledUnitDefinitionsForTest
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientPackageAmount
import app.recipebook.domain.model.IngredientPackageType
import app.recipebook.domain.model.PackageYieldBasis
import app.recipebook.domain.model.PackageYieldObservation
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.model.UnitType
import app.recipebook.ui.recipes.availableConversionUnits
import app.recipebook.ui.recipes.convertIngredientQuantity
import org.junit.Assert.assertFalse
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class PackageYieldConverterTest {
    private val form = IngredientForm(
        id = "ingredient-form-black-beans-canned-drained",
        ingredientRefId = "ingredient-ref-black-beans",
        formCode = "canned_drained",
        labelFr = "haricots noirs en conserve, égouttés",
        labelEn = "canned black beans, drained",
        prepState = "drained",
        updatedAt = "2026-10-06T00:00:00Z"
    )

    private val swObservation = PackageYieldObservation(
        id = "package-yield-sw-black-beans-15oz-drained",
        ingredientRefId = "ingredient-ref-black-beans",
        ingredientFormId = form.id,
        packageType = IngredientPackageType.CAN,
        declaredNetQuantity = 15.0,
        declaredNetUnit = "oz",
        netMassG = 425.0,
        drainedMassG = 240.0,
        brand = "S&W",
        productName = "Black Beans",
        productCode = "1320217103112",
        countryOfOrigin = "USA",
        sourceUrl = "https://swpremiumfood.com/wp-content/uploads/2017/02/SW-Catalogue_2016.pdf",
        sourceName = "S&W Beans Catalogue",
        sourceVersionOrDate = "2016"
    )

    @Test
    fun unresolvedBundledPackagesAndProductChoicesHaveNoInferredMassConversion() {
        val forms = loadBundledIngredientFormsForTest()
        val references = BundledIngredientCatalog.references
        val referenceById = references.associateBy { it.id }
        val packageYields = loadBundledPackageYieldObservationsForTest()
        val units = loadBundledUnitDefinitionsForTest()
        val unresolvedPackages = listOf(
            Triple("e1e7939b-206f-4839-97d9-2a91febb28eb", "ingredient-4", IngredientPackageType.CAN),
            Triple("1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee", "ingredient-3", IngredientPackageType.BOX),
            Triple("05a7ab4d-bf11-40ff-a570-cc0733da292b", "ingredient-1", IngredientPackageType.BOX)
        )

        unresolvedPackages.forEach { (recipeId, lineSuffix, expectedPackageType) ->
            val line = loadBundledRecipeForTest(recipeId).ingredients.single { it.id.endsWith(lineSuffix) }
            val reference = requireNotNull(line.ingredientRefId?.let(referenceById::get))
            val amount = requireNotNull(packageAmountForIngredientLine(line, forms, references))
            val form = forms.firstOrNull { it.id == line.ingredientFormId }

            assertNull("${line.id} must not declare a package size", amount.declaredNetQuantity)
            assertNull("${line.id} must not choose a mass basis", amount.requestedBasis)
            assertEquals(expectedPackageType, amount.packageType)
            assertFalse(packageYields.any { it.ingredientRefId == reference.id })
            assertNull(
                convertPackageAmount(
                    reference.id,
                    form,
                    amount,
                    packageYields,
                    "g",
                    reference,
                    units
                )
            )
            assertNull(
                convertIngredientQuantity(
                    line.quantity,
                    line.unit,
                    "g",
                    reference,
                    form,
                    units,
                    reference.id,
                    amount,
                    packageYields
                )
            )
            assertFalse(
                "g" in availableConversionUnits(
                    line.unit,
                    reference,
                    form,
                    units,
                    reference.id,
                    amount,
                    packageYields
                )
            )
        }

        val magicCookieBars = loadBundledRecipeForTest("ff66e4f7-c719-4203-970b-06993cdb25de")
        val condensedMilk = magicCookieBars.ingredients.single { it.id.endsWith("ingredient-3") }
        val condensedMilkReference = requireNotNull(condensedMilk.ingredientRefId?.let(referenceById::get))
        val condensedMilkAmount = requireNotNull(packageAmountForIngredientLine(condensedMilk, forms, references))
        val condensedMilkForm = forms.firstOrNull { it.id == condensedMilk.ingredientFormId }

        assertEquals("1 can (300 mL) Eagle Brand® Original or Low Fat Sweetened Condensed Milk", condensedMilk.originalText)
        assertEquals(300.0, requireNotNull(condensedMilk.quantity), 0.0)
        assertEquals("ml", condensedMilk.unit)
        assertEquals(300.0, requireNotNull(condensedMilkAmount.declaredNetQuantity), 0.0)
        assertEquals("ml", condensedMilkAmount.declaredNetUnit)
        assertNull(
            convertIngredientQuantity(
                condensedMilk.quantity,
                condensedMilk.unit,
                "g",
                condensedMilkReference,
                condensedMilkForm,
                units,
                condensedMilkReference.id,
                condensedMilkAmount,
                packageYields
            )
        )
        assertFalse(
            "g" in availableConversionUnits(
                condensedMilk.unit,
                condensedMilkReference,
                condensedMilkForm,
                units,
                condensedMilkReference.id,
                condensedMilkAmount,
                packageYields
            )
        )
    }

    @Test
    fun parsesEnglishPackageSizesAndKeepsFluidOuncesDistinct() {
        val compact = requireNotNull(parseIngredientPackageAmount("1 x 15oz can black beans, drained"))
        assertEquals(1.0, compact.count, 0.0)
        assertEquals(15.0, requireNotNull(compact.declaredNetQuantity), 0.0)
        assertEquals("oz", compact.declaredNetUnit)
        assertEquals(PackageYieldBasis.DRAINED_MASS, compact.requestedBasis)

        val spaced = requireNotNull(parseIngredientPackageAmount("2 15 oz cans black beans, drained"))
        assertEquals(2.0, spaced.count, 0.0)
        assertEquals(IngredientPackageType.CAN, spaced.packageType)

        val fluid = requireNotNull(parseIngredientPackageAmount("1 x 15 fl oz jar coconut milk"))
        assertEquals("fl oz", fluid.declaredNetUnit)
        assertEquals(IngredientPackageType.JAR, fluid.packageType)
        assertNull(fluid.requestedBasis)
    }

    @Test
    fun parsesFrenchPackageAliasesWithoutDiscardingOriginalWording() {
        val parsed = requireNotNull(parseIngredientPackageAmount("1 boîte de conserve de 15 oz de haricots noirs, égouttés"))
        assertEquals(IngredientPackageType.CAN, parsed.packageType)
        assertEquals(15.0, requireNotNull(parsed.declaredNetQuantity), 0.0)
        assertEquals("oz", parsed.declaredNetUnit)
        assertEquals(PackageYieldBasis.DRAINED_MASS, parsed.requestedBasis)
    }

    @Test
    fun canAndTinAliasesNormalizeConsistentlyAcrossTextAndUnitFields() {
        listOf(
            "1 can black beans" to IngredientPackageType.CAN,
            "1 tin black beans" to IngredientPackageType.CAN,
            "1 boîte de conserve de haricots noirs" to IngredientPackageType.CAN,
            "2 boîtes de conserve de haricots noirs" to IngredientPackageType.CAN,
            "1 boite de conserve de haricots noirs" to IngredientPackageType.CAN,
            "2 boites de conserve de haricots noirs" to IngredientPackageType.CAN
        ).forEach { (text, expected) ->
            assertEquals(text, expected, requireNotNull(parseIngredientPackageAmount(text)).packageType)
        }

        listOf(
            "can",
            "tin",
            "boîte",
            "boîtes",
            "boite",
            "boites",
            "boîte de conserve",
            "boîtes de conserve",
            "boite de conserve",
            "boites de conserve"
        ).forEach { unit ->
            assertEquals(unit, IngredientPackageType.CAN, packageTypeFromUnit(unit))
        }
        assertEquals(IngredientPackageType.CAN, packageTypeFromUnit("tin."))
        assertEquals(IngredientPackageType.CAN, parseIngredientPackageAmount("1 tin.")?.packageType)
    }

    @Test
    fun packageAmountCountDoesNotTreatIngredientVolumeAsPackageCount() {
        val ingredient = IngredientLine(
            id = "tomato-paste-line",
            originalText = "156 ml tomato paste",
            quantity = 156.0,
            unit = "ml",
            ingredientName = "tomato paste",
            packageAmount = IngredientPackageAmount(
                count = 1.0,
                packageType = IngredientPackageType.CAN,
                declaredNetQuantity = 156.0,
                declaredNetUnit = "ml"
            )
        )

        val amount = requireNotNull(packageAmountForIngredientLine(ingredient))

        assertEquals(1.0, amount.count, 0.0)
        assertEquals(IngredientPackageType.CAN, amount.packageType)
        assertEquals(156.0, requireNotNull(amount.declaredNetQuantity), 0.0)
        assertEquals("ml", amount.declaredNetUnit)
    }

    @Test
    fun parsedPackageExpressionSuppliesCountWhenIngredientQuantityIsVolume() {
        val ingredient = IngredientLine(
            id = "parsed-tomato-paste-line",
            originalText = "1 can (156 ml) tomato paste",
            quantity = 156.0,
            unit = "ml",
            ingredientName = "tomato paste"
        )

        val amount = requireNotNull(packageAmountForIngredientLine(ingredient))

        assertEquals(1.0, amount.count, 0.0)
        assertEquals(IngredientPackageType.CAN, amount.packageType)
        assertEquals(156.0, requireNotNull(amount.declaredNetQuantity), 0.0)
        assertEquals("ml", amount.declaredNetUnit)
    }

    @Test
    fun explicitPackageUnitQuantityRemainsThePackageCount() {
        val ingredient = IngredientLine(
            id = "two-cans-line",
            originalText = "2 cans tomato paste",
            quantity = 2.0,
            unit = "can",
            ingredientName = "tomato paste"
        )

        val amount = requireNotNull(packageAmountForIngredientLine(ingredient))

        assertEquals(2.0, amount.count, 0.0)
        assertEquals(IngredientPackageType.CAN, amount.packageType)
    }

    @Test
    fun pintoBeanLineRetainsWholeCanContentsBasisWithoutInventingPackageSize() {
        val ingredient = IngredientLine(
            id = "pinto-beans-line",
            originalText = "1 can pinto beans with liquid",
            quantity = 1.0,
            unit = "can",
            ingredientName = "pinto beans",
            preparation = app.recipebook.domain.model.LocalizedValue(fr = "avec le liquide", en = "with liquid")
        )

        val amount = requireNotNull(packageAmountForIngredientLine(ingredient))

        assertEquals(1.0, amount.count, 0.0)
        assertEquals(IngredientPackageType.CAN, amount.packageType)
        assertNull(amount.declaredNetQuantity)
        assertNull(amount.declaredNetUnit)
        assertNull(amount.packingMedium)
        assertEquals(PackageYieldBasis.NET_CONTENTS, amount.requestedBasis)
    }

    @Test
    fun exactProductObservationSeparatesNetContentsFromDrainedYieldAndScalesCount() {
        val drained = convert(PackageYieldBasis.DRAINED_MASS, count = 1.0)
        assertEquals(240.0, drained.quantity, 0.0)
        assertEquals("g", drained.unit)
        assertTrue(drained.sourceSpecificEstimate)

        val net = convert(PackageYieldBasis.NET_CONTENTS, count = 1.0)
        assertEquals(425.0, net.quantity, 0.0)

        val two = convert(PackageYieldBasis.DRAINED_MASS, count = 2.0)
        assertEquals(480.0, two.quantity, 0.0)

        val half = convert(PackageYieldBasis.DRAINED_MASS, count = 0.5)
        assertEquals(120.0, half.quantity, 0.0)
        assertNotNull(half.portioningAssumption)

        val exactBrand = convert(PackageYieldBasis.DRAINED_MASS, count = 1.0, brand = "S&W")
        assertTrue(!exactBrand.sourceSpecificEstimate)
    }

    @Test
    fun mismatchedProductSizeBrandFormMediumAndBasisRemainUnavailable() {
        assertNull(convertOrNull(size = 15.5))
        assertNull(convertOrNull(brand = "Different brand"))
        assertNull(convertOrNull(countryOfOrigin = "Canada"))
        assertNull(convertOrNull(packageType = IngredientPackageType.JAR))
        assertNull(convertOrNull(packingMedium = "water"))
        assertNull(convertOrNull(requestedBasis = null))
        assertNull(convertOrNull(form = form.copy(id = "another-form")))
        assertNull(convertOrNull(netUnit = "fl oz"))
        assertNull(convertOrNull(productCode = "different-code"))
    }

    @Test
    fun explicitProductCodeCanMatchWithoutParsedSizeButConflictingBrandCannot() {
        val exact = packageAmount(size = null, unit = null, productCode = swObservation.productCode)
        assertEquals(
            240.0,
            requireNotNull(convertPackageAmount(
                "ingredient-ref-black-beans", form, exact, listOf(swObservation), "g", units = massUnits
            )).quantity,
            0.0
        )
        val conflict = exact.copy(brand = "Another brand")
        assertNull(convertPackageAmount("ingredient-ref-black-beans", form, conflict, listOf(swObservation), "g", units = massUnits))
    }

    @Test
    fun fluidPackageContentsConvertToVolumeButNeverToMassWithoutEvidence() {
        val observation = swObservation.copy(
            id = "fluid-package-fixture",
            packageType = IngredientPackageType.JAR,
            declaredNetUnit = "fl oz",
            declaredNetQuantity = 15.0,
            netMassG = null,
            netVolumeMl = 443.6,
            drainedMassG = null,
            edibleMassG = null,
            productCode = "fluid-fixture"
        )
        val amount = packageAmount(
            size = 15.0,
            unit = "fl oz",
            packageType = IngredientPackageType.JAR,
            basis = PackageYieldBasis.NET_CONTENTS,
            productCode = "fluid-fixture"
        )
        val volume = convertPackageAmount("ingredient-ref-black-beans", form, amount, listOf(observation), "ml", units = volumeUnits)
        assertEquals(443.6, requireNotNull(volume).quantity, 0.0)
        assertNull(convertPackageAmount("ingredient-ref-black-beans", form, amount, listOf(observation), "g", units = massUnits + volumeUnits))
    }

    private fun convert(
        basis: PackageYieldBasis,
        count: Double,
        brand: String? = null
    ) = requireNotNull(convertPackageAmount(
        ingredientRefId = "ingredient-ref-black-beans",
        ingredientForm = form,
        amount = packageAmount(count = count, basis = basis, brand = brand),
        observations = listOf(swObservation),
        targetUnit = "g",
        units = massUnits
    ))

    private fun convertOrNull(
        size: Double = 15.0,
        brand: String? = null,
        packageType: IngredientPackageType = IngredientPackageType.CAN,
        packingMedium: String? = null,
        countryOfOrigin: String? = null,
        requestedBasis: PackageYieldBasis? = PackageYieldBasis.DRAINED_MASS,
        form: IngredientForm = this.form,
        netUnit: String = "oz",
        productCode: String? = null
    ) = convertPackageAmount(
        ingredientRefId = "ingredient-ref-black-beans",
        ingredientForm = form,
        amount = packageAmount(
            count = 1.0,
            size = size,
            unit = netUnit,
            packageType = packageType,
            basis = requestedBasis,
            brand = brand,
            packingMedium = packingMedium,
            countryOfOrigin = countryOfOrigin,
            productCode = productCode
        ),
        observations = listOf(swObservation),
        targetUnit = "g",
        units = massUnits
    )

    private fun packageAmount(
        count: Double = 1.0,
        size: Double? = 15.0,
        unit: String? = "oz",
        packageType: IngredientPackageType = IngredientPackageType.CAN,
        basis: PackageYieldBasis? = PackageYieldBasis.DRAINED_MASS,
        brand: String? = null,
        packingMedium: String? = null,
        countryOfOrigin: String? = null,
        productCode: String? = null
    ) = IngredientPackageAmount(
        count = count,
        packageType = packageType,
        declaredNetQuantity = size,
        declaredNetUnit = unit,
        packingMedium = packingMedium,
        brand = brand,
        countryOfOrigin = countryOfOrigin,
        productCode = productCode,
        requestedBasis = basis
    )

    private val massUnits = listOf(
        UnitDefinition("g", "g", "gramme", "gram", UnitType.MASS, "g", 1.0),
        UnitDefinition("oz", "oz", "once", "ounce", UnitType.MASS, "g", 28.349523125)
    )

    private val volumeUnits = listOf(
        UnitDefinition("ml", "ml", "millilitre", "milliliter", UnitType.VOLUME, "ml", 1.0),
        UnitDefinition("fl oz", "fl oz", "once liquide", "fluid ounce", UnitType.VOLUME, "ml", 29.5735295625)
    )
}
