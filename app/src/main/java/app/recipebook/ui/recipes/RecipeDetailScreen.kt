package app.recipebook.ui.recipes

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.domain.localization.BilingualTextResolver
import app.recipebook.domain.localization.MissingTextPlaceholders
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.localization.BilingualText
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.Tag
import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.round

@Composable
internal fun RecipeDetailScreen(
    recipe: Recipe?,
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    onBack: () -> Unit,
    onNavigate: (MainMenuDestination) -> Unit,
    onEdit: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val resolver = BilingualTextResolver()
    val placeholders = MissingTextPlaceholders(
        missingInFrench = localizedString(R.string.placeholder_missing_fr, AppLanguage.FR),
        missingInEnglish = localizedString(R.string.placeholder_missing_en, AppLanguage.EN)
    )
    var doneIngredientIds by remember { mutableStateOf(setOf<String>()) }
    var convertedUnits by remember { mutableStateOf<Map<String, String>>(emptyMap()) }
    var conversionDialogIngredientId by remember { mutableStateOf<String?>(null) }

    Scaffold(
        modifier = modifier,
        topBar = {
            RecipeBookTopBar(
                title = localizedString(R.string.detail_section_title, language),
                language = language,
                onLanguageChange = onLanguageChange,
                onNavigate = onNavigate,
                navigationIcon = {
                    BackIconButton(
                        contentDescription = localizedString(R.string.back_label, language),
                        onClick = onBack
                    )
                }
            ) {
                recipe?.let {
                    EditIconButton(
                        contentDescription = localizedString(R.string.edit_recipe_label, language),
                        onClick = { onEdit(it.id) }
                    )
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(6.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            if (recipe == null) {
                Text(
                    text = localizedString(R.string.recipe_not_found, language),
                    style = MaterialTheme.typography.bodyLarge
                )
            } else {
                RecipeDetailCard(
                    recipe = recipe,
                    ingredientReferences = ingredientReferences,
                    tags = tags,
                    language = language,
                    resolver = resolver,
                    placeholders = placeholders,
                    doneIngredientIds = doneIngredientIds,
                    convertedUnits = convertedUnits,
                    conversionDialogIngredientId = conversionDialogIngredientId,
                    onToggleIngredientDone = { ingredientId ->
                        doneIngredientIds = if (ingredientId in doneIngredientIds) {
                            doneIngredientIds - ingredientId
                        } else {
                            doneIngredientIds + ingredientId
                        }
                    },
                    onOpenIngredientConversion = { ingredientId ->
                        conversionDialogIngredientId = ingredientId
                    },
                    onDismissIngredientConversion = {
                        conversionDialogIngredientId = null
                    },
                    onSelectIngredientConversion = { ingredientId, unit ->
                        convertedUnits = if (unit == null) {
                            convertedUnits - ingredientId
                        } else {
                            convertedUnits + (ingredientId to unit)
                        }
                        conversionDialogIngredientId = null
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun RecipeDetailCard(
    recipe: Recipe,
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    language: AppLanguage,
    resolver: BilingualTextResolver,
    placeholders: MissingTextPlaceholders,
    doneIngredientIds: Set<String>,
    convertedUnits: Map<String, String>,
    conversionDialogIngredientId: String?,
    onToggleIngredientDone: (String) -> Unit,
    onOpenIngredientConversion: (String) -> Unit,
    onDismissIngredientConversion: () -> Unit,
    onSelectIngredientConversion: (String, String?) -> Unit
) {
    val ingredientReferenceMap = ingredientReferences.associateBy(IngredientReference::id)
    val uriHandler = LocalUriHandler.current
    val resolvedTags = recipe.tagIds.mapNotNull { tagId -> tags.firstOrNull { it.id == tagId } }
    val notes = resolver.resolveUserText(
        language = language,
        valueFr = recipe.languages.fr.notes.ifBlank { null },
        valueEn = recipe.languages.en.notes.ifBlank { null },
        placeholders = placeholders
    )
    val instructions = parseTextEntries(resolver.resolveSystemText(language, recipe.instructionsText()))
    val ingredientItems = recipe.ingredients.mapNotNull { ingredient ->
        val ingredientReference = ingredient.ingredientRefId?.let(ingredientReferenceMap::get)
        val convertedUnit = convertedUnits[ingredient.id]
        val convertedQuantity = convertedUnit?.let { unit ->
            convertIngredientQuantity(
                quantity = ingredient.quantity,
                fromUnit = ingredient.unit,
                toUnit = unit,
                ingredientReference = ingredientReference
            )
        }
        val displayText = buildDetailIngredientText(
            ingredient = ingredient,
            ingredientReference = ingredientReference,
            language = language,
            quantityOverride = convertedQuantity ?: ingredient.quantity,
            unitOverride = convertedUnit ?: ingredient.unit
        )
        displayText.takeIf { it.isNotEmpty() }?.let {
            DetailIngredientItem(
                ingredient = ingredient,
                text = it,
                isDone = ingredient.id in doneIngredientIds
            )
        }
    }
    val selectedIngredientItem = conversionDialogIngredientId?.let { selectedId ->
        recipe.ingredients.firstOrNull { it.id == selectedId }?.let { ingredient ->
            val ingredientReference = ingredient.ingredientRefId?.let(ingredientReferenceMap::get)
            ConversionDialogState(
                ingredient = ingredient,
                ingredientReference = ingredientReference,
                targetUnits = availableConversionUnits(ingredient.unit, ingredientReference),
                selectedUnit = convertedUnits[selectedId]
            )
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        RecipePhoto(
            localPath = recipe.mainPhoto()?.localPath,
            contentDescription = localizedString(R.string.recipe_photo_label, language),
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        )
        Text(
            text = resolver.resolveSystemText(language, recipe.titleText()),
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = resolver.resolveSystemText(language, recipe.descriptionText()),
            style = MaterialTheme.typography.bodyLarge
        )

        Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
            recipe.servings?.let { servings ->
                Text(
                    text = localizedString(
                        R.string.detail_amount_value,
                        language,
                        if (servings.unit.isNullOrBlank()) {
                            formatNumber(servings.amount)
                        } else {
                            localizedString(R.string.servings_value_with_unit, language, formatNumber(servings.amount), servings.unit)
                        }
                    ),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            recipe.times?.prepTimeMinutes?.let { prep ->
                Text(
                    text = localizedString(R.string.detail_prep_time_value, language, prep),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            recipe.times?.cookTimeMinutes?.let { cook ->
                Text(
                    text = localizedString(R.string.detail_cook_time_value, language, cook),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            recipe.ratings?.userRating?.let { rating ->
                Text(
                    text = localizedString(R.string.detail_rating_value, language, rating),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }

        if (resolvedTags.isNotEmpty()) {
            DetailSection(localizedString(R.string.tags_label, language)) {
                Text(
                    text = buildDetailTagText(resolvedTags, language),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }

        DetailSection(localizedString(R.string.ingredients_label, language)) {
            ingredientItems.forEach { ingredient ->
                DetailIngredientRow(
                    ingredient = ingredient,
                    language = language,
                    onToggleDone = { onToggleIngredientDone(ingredient.ingredient.id) },
                    onOpenConversion = { onOpenIngredientConversion(ingredient.ingredient.id) }
                )
            }
        }

        DetailSection(localizedString(R.string.instructions_label, language)) {
            instructions.forEachIndexed { index, instruction ->
                Text(text = "${index + 1}. $instruction")
            }
        }

        DetailSection(localizedString(R.string.notes_label, language)) {
            Text(
                text = notes.text,
                fontStyle = if (notes.isPlaceholder) FontStyle.Italic else FontStyle.Normal
            )
        }

        recipe.source?.let { source ->
            DetailSection(localizedString(R.string.source_label, language)) {
                Text(
                    text = source.displayText(),
                    color = if (source.clickableUrlOrNull() == null) {
                        MaterialTheme.colorScheme.onSurface
                    } else {
                        MaterialTheme.colorScheme.primary
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    textDecoration = if (source.clickableUrlOrNull() == null) {
                        TextDecoration.None
                    } else {
                        TextDecoration.Underline
                    },
                    modifier = source.clickableUrlOrNull()?.let { url ->
                        Modifier.clickable { uriHandler.openUri(url) }
                    } ?: Modifier
                )
            }
        }
    }

    selectedIngredientItem?.let { dialogState ->
        IngredientConversionDialog(
            ingredient = dialogState.ingredient,
            ingredientReference = dialogState.ingredientReference,
            targetUnits = dialogState.targetUnits,
            selectedUnit = dialogState.selectedUnit,
            language = language,
            onDismiss = onDismissIngredientConversion,
            onReset = {
                onSelectIngredientConversion(dialogState.ingredient.id, null)
            },
            onSelectUnit = { unit ->
                onSelectIngredientConversion(dialogState.ingredient.id, unit)
            }
        )
    }
}

@Composable
private fun DetailSection(
    label: String,
    content: @Composable () -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
        Text(text = label, style = MaterialTheme.typography.titleMedium)
        content()
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun DetailIngredientRow(
    ingredient: DetailIngredientItem,
    language: AppLanguage,
    onToggleDone: () -> Unit,
    onOpenConversion: () -> Unit
) {
    val stateLabel = if (ingredient.isDone) {
        localizedString(R.string.ingredient_state_done, language)
    } else {
        localizedString(R.string.ingredient_state_pending, language)
    }
    Text(
        text = ingredient.text,
        style = MaterialTheme.typography.bodyMedium,
        color = if (ingredient.isDone) {
            DoneIngredientTextColor
        } else {
            MaterialTheme.colorScheme.onSurface
        },
        modifier = Modifier
            .fillMaxWidth()
            .testTag("ingredient-row-${ingredient.ingredient.id}")
            .semantics { stateDescription = stateLabel }
            .combinedClickable(
                onClick = onToggleDone,
                onLongClick = onOpenConversion
            )
            .padding(vertical = 1.dp)
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun IngredientConversionDialog(
    ingredient: IngredientLine,
    ingredientReference: IngredientReference?,
    targetUnits: List<String>,
    selectedUnit: String?,
    language: AppLanguage,
    onDismiss: () -> Unit,
    onReset: () -> Unit,
    onSelectUnit: (String) -> Unit
) {
    val title = ingredientReference?.localizedName(language)
        ?.ifBlank { ingredient.ingredientName }
        ?: ingredient.ingredientName
    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.close_label, language))
            }
        },
        dismissButton = if (selectedUnit != null) {
            {
                TextButton(onClick = onReset) {
                    Text(localizedString(R.string.ingredient_conversion_reset_label, language))
                }
            }
        } else {
            null
        },
        title = {
            Text(localizedString(R.string.ingredient_conversion_dialog_title, language, title))
        },
        text = {
            if (targetUnits.isEmpty()) {
                Text(localizedString(R.string.ingredient_conversion_unavailable_label, language))
            } else {
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    targetUnits.forEach { unit ->
                        val convertedQuantity = convertIngredientQuantity(
                            quantity = ingredient.quantity,
                            fromUnit = ingredient.unit,
                            toUnit = unit,
                            ingredientReference = ingredientReference
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("ingredient-convert-$unit")
                                .combinedClickable(onClick = { onSelectUnit(unit) })
                                .padding(vertical = 1.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = buildIngredientConversionOptionLabel(
                                    quantity = convertedQuantity,
                                    unit = unit,
                                    ingredient = ingredient,
                                    ingredientReference = ingredientReference,
                                    language = language
                                ),
                                color = if (unit == selectedUnit) {
                                    MaterialTheme.colorScheme.primary
                                } else {
                                    Color.Unspecified
                                }
                            )
                        }
                    }
                }
            }
        }
    )
}

internal fun buildDetailTagText(tags: List<Tag>, language: AppLanguage): String =
    tags.joinToString(", ") { it.localizedName(language) }

internal fun Recipe.instructionsText(): BilingualText = BilingualText(
    fr = languages.fr.instructions,
    en = languages.en.instructions
)

internal fun buildDetailIngredientText(
    ingredient: IngredientLine,
    ingredientReference: IngredientReference?,
    language: AppLanguage,
    quantityOverride: Double? = ingredient.quantity,
    unitOverride: String? = ingredient.unit,
    preserveUnitOverride: Boolean = unitOverride != null && unitOverride.normalizeUnit() != ingredient.unit?.normalizeUnit()
): String {
    val ingredientName = ingredientReference?.localizedName(language)
        ?.ifBlank { ingredient.ingredientName }
        ?: ingredient.ingredientName
    val localizedPreparation = ingredient.preparation?.localizedIngredientDescriptor(language)
    val localizedNotes = ingredient.notes?.localizedIngredientDescriptor(language)
    val amountDisplay = formatIngredientAmount(
        quantity = quantityOverride,
        unit = unitOverride,
        language = language,
        preserveUnit = preserveUnitOverride
    )
    val base = listOfNotNull(
        amountDisplay,
        ingredientName.ifBlank { null }
    ).joinToString(" ")
    val withPreparation = if (localizedPreparation.isNullOrBlank()) base else "$base, $localizedPreparation"
    val withNotes = if (localizedNotes.isNullOrBlank()) withPreparation else "$withPreparation ($localizedNotes)"
    return withNotes.ifBlank { ingredient.originalText.trim() }
}

internal fun buildIngredientConversionOptionLabel(
    quantity: Double?,
    unit: String,
    ingredient: IngredientLine,
    ingredientReference: IngredientReference?,
    language: AppLanguage
): String = buildDetailIngredientText(
    ingredient = ingredient,
    ingredientReference = ingredientReference,
    language = language,
    quantityOverride = quantity,
    unitOverride = unit,
    preserveUnitOverride = true
)

private fun formatIngredientAmount(
    quantity: Double?,
    unit: String?,
    language: AppLanguage,
    preserveUnit: Boolean
): String? {
    val normalizedUnit = unit?.normalizeUnit()
    return when {
        quantity == null -> normalizedUnit?.localizedMeasurementUnit(language, 1.0)
        normalizedUnit == null -> formatNumber(quantity)
        normalizedUnit == "cup" -> formatCupAmount(quantity, language, preserveUnit)
        normalizedUnit == "tbsp" -> formatTablespoonAmount(quantity, language, preserveUnit)
        normalizedUnit == "tsp" -> formatTeaspoonAmount(quantity, language)
        else -> "${formatNumber(quantity)} ${normalizedUnit.localizedMeasurementUnit(language, quantity)}"
    }
}

private fun formatCupAmount(quantity: Double, language: AppLanguage, preserveUnit: Boolean): String {
    val wholeCups = floor(quantity + MEASUREMENT_TOLERANCE).toInt()
    val remainder = (quantity - wholeCups).coerceAtLeast(0.0)
    if (isNearZero(remainder)) {
        return joinAmountWithUnit(wholeCups.toString(), "cup", wholeCups.toDouble(), language)
    }

    val matchingFraction = nearestAllowedFraction(remainder, CUP_FRACTIONS, CUP_FRACTION_TOLERANCE)
    if (matchingFraction != null) {
        return joinAmountWithUnit(
            formatMixedNumberText(wholeCups, matchingFraction),
            "cup",
            wholeCups + matchingFraction,
            language
        )
    }

    if (preserveUnit) {
        return joinAmountWithUnit(formatRoundedCupText(quantity), "cup", quantity, language)
    }

    val tablespoonText = formatTablespoonAmount(remainder * TABLESPOONS_PER_CUP, language, preserveUnit = false)
    return if (wholeCups > 0) {
        "${joinAmountWithUnit(wholeCups.toString(), "cup", wholeCups.toDouble(), language)} $tablespoonText"
    } else {
        tablespoonText
    }
}

private fun formatTablespoonAmount(quantity: Double, language: AppLanguage, preserveUnit: Boolean): String {
    val wholeTablespoons = floor(quantity + MEASUREMENT_TOLERANCE).toInt()
    val remainder = (quantity - wholeTablespoons).coerceAtLeast(0.0)
    if (isNearZero(remainder)) {
        return joinAmountWithUnit(wholeTablespoons.toString(), "tbsp", wholeTablespoons.toDouble(), language)
    }

    val matchingFraction = nearestAllowedFraction(remainder, TABLESPOON_FRACTIONS, TABLESPOON_FRACTION_TOLERANCE)
    if (matchingFraction != null) {
        return joinAmountWithUnit(
            formatMixedNumberText(wholeTablespoons, matchingFraction),
            "tbsp",
            wholeTablespoons + matchingFraction,
            language
        )
    }

    if (preserveUnit) {
        return joinAmountWithUnit(formatRoundedTablespoonText(quantity), "tbsp", quantity, language)
    }

    val teaspoonText = formatTeaspoonAmount(remainder * TEASPOONS_PER_TABLESPOON, language)
    return if (wholeTablespoons > 0) {
        "${joinAmountWithUnit(wholeTablespoons.toString(), "tbsp", wholeTablespoons.toDouble(), language)} $teaspoonText"
    } else {
        teaspoonText
    }
}

private fun formatTeaspoonAmount(quantity: Double, language: AppLanguage): String {
    val roundedQuantity = roundToNearestAllowedTeaspoon(quantity)
    val wholeTeaspoons = floor(roundedQuantity + MEASUREMENT_TOLERANCE).toInt()
    val remainder = (roundedQuantity - wholeTeaspoons).coerceAtLeast(0.0)
    val fraction = nearestAllowedFraction(remainder, TEASPOON_FRACTIONS, 1.0) ?: 0.0
    return joinAmountWithUnit(
        formatMixedNumberText(wholeTeaspoons, fraction),
        "tsp",
        roundedQuantity,
        language
    )
}

private fun formatRoundedCupText(quantity: Double): String {
    val roundedWhole = floor(quantity + MEASUREMENT_TOLERANCE).toInt()
    val roundedFraction = nearestAllowedFraction(
        value = (quantity - roundedWhole).coerceAtLeast(0.0),
        fractions = CUP_FRACTIONS,
        tolerance = CUP_FRACTION_TOLERANCE
    ) ?: nearestAllowedFraction(
        value = (quantity - roundedWhole).coerceAtLeast(0.0),
        fractions = HALF_FRACTIONS,
        tolerance = HALF_FRACTION_TOLERANCE
    ) ?: 0.0
    return formatMixedNumberText(roundedWhole, roundedFraction)
}

private fun formatRoundedTablespoonText(quantity: Double): String {
    val roundedWhole = floor(quantity + MEASUREMENT_TOLERANCE).toInt()
    val roundedFraction = nearestAllowedFraction(
        value = (quantity - roundedWhole).coerceAtLeast(0.0),
        fractions = HALF_FRACTIONS,
        tolerance = HALF_FRACTION_TOLERANCE
    ) ?: 0.0
    return formatMixedNumberText(roundedWhole, roundedFraction)
}
private fun joinAmountWithUnit(
    amountText: String,
    unit: String,
    quantity: Double,
    language: AppLanguage
): String = "$amountText ${unit.localizedMeasurementUnit(language, quantity)}"

private fun formatMixedNumberText(whole: Int, fraction: Double): String {
    val fractionText = fractionGlyphs[fraction]
    return when {
        fractionText == null || isNearZero(fraction) -> whole.toString()
        whole <= 0 -> fractionText
        else -> "$whole$FRACTION_SPACING$fractionText"
    }
}

private fun nearestAllowedFraction(
    value: Double,
    fractions: List<Double>,
    tolerance: Double
): Double? = fractions
    .map { fraction -> fraction to abs(value - fraction) }
    .filter { (_, delta) -> delta <= tolerance }
    .minByOrNull { (_, delta) -> delta }
    ?.first

private fun roundToNearestAllowedTeaspoon(value: Double): Double {
    val whole = floor(value + MEASUREMENT_TOLERANCE).toInt()
    val remainder = (value - whole).coerceAtLeast(0.0)
    val fraction = TEASPOON_FRACTIONS
        .minByOrNull { candidate -> abs(remainder - candidate) }
        ?: 0.0
    val roundedWhole = if (fraction >= 0.875 && abs(remainder - 1.0) <= 0.125) whole + 1 else whole
    return if (roundedWhole > whole) {
        roundedWhole.toDouble()
    } else {
        whole + fraction
    }
}

private fun isNearZero(value: Double): Boolean = abs(value) <= MEASUREMENT_TOLERANCE

private fun String.localizedMeasurementUnit(language: AppLanguage, quantity: Double): String {
    val normalized = normalizeUnit()
    val isSingular = quantity < 1.0 + MEASUREMENT_TOLERANCE || abs(quantity - 1.0) <= MEASUREMENT_TOLERANCE
    return when (language) {
        AppLanguage.EN -> when (normalized) {
            "cup" -> if (isSingular) "cup" else "cups"
            "tbsp" -> "tbsp"
            "tsp" -> "tsp"
            else -> localizedIngredientUnit(language)
        }
        AppLanguage.FR -> when (normalized) {
            "cup" -> if (isSingular) "tasse" else "tasses"
            "tbsp" -> if (isSingular) "cuill\u00e8re \u00e0 soupe" else "cuill\u00e8res \u00e0 soupe"
            "tsp" -> if (isSingular) "cuill\u00e8re \u00e0 th\u00e9" else "cuill\u00e8res \u00e0 th\u00e9"
            else -> localizedIngredientUnit(language)
        }
    }
}

internal fun availableConversionUnits(
    currentUnit: String?,
    ingredientReference: IngredientReference?
): List<String> {
    val fromUnit = currentUnit?.normalizeUnit() ?: return emptyList()
    val graph = buildIngredientConversionGraph(ingredientReference)
    if (fromUnit !in graph) return emptyList()
    val visited = linkedSetOf(fromUnit)
    val queue = ArrayDeque<String>()
    queue.add(fromUnit)
    while (queue.isNotEmpty()) {
        val unit = queue.removeFirst()
        graph[unit].orEmpty().keys.forEach { neighbor ->
            if (visited.add(neighbor)) {
                queue.add(neighbor)
            }
        }
    }
    return visited
        .asSequence()
        .filterNot { it == fromUnit }
        .map(String::toUnitSortKey)
        .sortedWith(compareBy(UnitOptionSortKey::category, UnitOptionSortKey::rank, UnitOptionSortKey::unit))
        .map(UnitOptionSortKey::unit)
        .toList()
}

internal fun convertIngredientQuantity(
    quantity: Double?,
    fromUnit: String?,
    toUnit: String,
    ingredientReference: IngredientReference?
): Double? {
    val amount = quantity ?: return null
    val normalizedFrom = fromUnit?.normalizeUnit() ?: return null
    val normalizedTo = toUnit.normalizeUnit()
    if (normalizedFrom == normalizedTo) return amount
    val factor = findConversionFactor(
        graph = buildIngredientConversionGraph(ingredientReference),
        fromUnit = normalizedFrom,
        toUnit = normalizedTo
    ) ?: return null
    return roundIngredientQuantity(amount * factor, normalizedTo)
}

private fun buildIngredientConversionGraph(
    ingredientReference: IngredientReference?
): Map<String, Map<String, Double>> {
    val graph = mutableMapOf<String, MutableMap<String, Double>>()
    standardUnitDefinitions.forEach { definition ->
        if (definition.unit != definition.baseUnit) {
            addConversionEdge(graph, definition.unit, definition.baseUnit, definition.toBaseFactor)
        }
    }
    ingredientReference?.unitMappings.orEmpty().forEach { mapping ->
        addConversionEdge(graph, mapping.fromUnit.normalizeUnit(), mapping.toUnit.normalizeUnit(), mapping.factor)
    }
    ingredientReference?.defaultDensity?.takeIf { it > 0.0 }?.let { density ->
        addConversionEdge(graph, "ml", "g", density)
    }
    return graph
}

private fun addConversionEdge(
    graph: MutableMap<String, MutableMap<String, Double>>,
    fromUnit: String,
    toUnit: String,
    factor: Double
) {
    if (factor <= 0.0) return
    graph.getOrPut(fromUnit) { mutableMapOf() }[toUnit] = factor
    graph.getOrPut(toUnit) { mutableMapOf() }[fromUnit] = 1.0 / factor
}

private fun findConversionFactor(
    graph: Map<String, Map<String, Double>>,
    fromUnit: String,
    toUnit: String
): Double? {
    if (fromUnit == toUnit) return 1.0
    val visited = mutableSetOf<String>()
    val queue = ArrayDeque<Pair<String, Double>>()
    queue.add(fromUnit to 1.0)
    while (queue.isNotEmpty()) {
        val (unit, factor) = queue.removeFirst()
        if (!visited.add(unit)) continue
        graph[unit].orEmpty().forEach { (neighbor, edgeFactor) ->
            val nextFactor = factor * edgeFactor
            if (neighbor == toUnit) return nextFactor
            if (neighbor !in visited) {
                queue.add(neighbor to nextFactor)
            }
        }
    }
    return null
}

private fun roundIngredientQuantity(value: Double, unit: String): Double {
    val increment = when (unit) {
        "g", "ml" -> if (value >= 10.0) 1.0 else 0.5
        "kg", "l" -> 0.01
        "lb", "oz", "fl oz" -> 0.05
        "cup" -> 0.125
        "tbsp", "tsp" -> 0.25
        else -> 0.25
    }
    return round(value / increment) * increment
}

private fun String.normalizeUnit(): String = when (trim().lowercase()) {
    "gram", "grams" -> "g"
    "kilogram", "kilograms" -> "kg"
    "milliliter", "milliliters", "millilitre", "millilitres" -> "ml"
    "liter", "liters", "litre", "litres" -> "l"
    "tablespoon", "tablespoons" -> "tbsp"
    "teaspoon", "teaspoons" -> "tsp"
    "ounce", "ounces" -> "oz"
    "pound", "pounds", "lbs" -> "lb"
    "fluid ounce", "fluid ounces" -> "fl oz"
    "cups" -> "cup"
    else -> trim().lowercase()
}

private fun String.localizedIngredientUnit(language: AppLanguage): String {
    val normalized = normalizeUnit()
    if (normalized.isEmpty()) return normalized
    return when (language) {
        AppLanguage.EN -> normalized
        AppLanguage.FR -> ingredientUnitTranslations[normalized] ?: normalized
    }
}

private fun String.localizedIngredientDescriptor(language: AppLanguage): String {
    val normalized = trim()
    if (normalized.isEmpty()) return normalized
    return when (language) {
        AppLanguage.EN -> normalized
        AppLanguage.FR -> ingredientDescriptorTranslations[normalized.lowercase()] ?: normalized
    }
}

private val ingredientUnitTranslations = mapOf(
    "cup" to "tasse",
    "tbsp" to "cuill\u00E8re \u00E0 soupe",
    "tsp" to "cuill\u00E8re \u00E0 th\u00E9",
    "tablespoon" to "cuill\u00E8re \u00E0 soupe",
    "tablespoons" to "cuill\u00E8res \u00E0 soupe",
    "teaspoon" to "cuill\u00E8re \u00E0 th\u00E9",
    "teaspoons" to "cuill\u00E8res \u00E0 th\u00E9",
    "g" to "g",
    "kg" to "kg",
    "ml" to "ml",
    "l" to "l",
    "oz" to "oz",
    "lb" to "lb",
    "fl oz" to "fl oz",
    "ounce" to "once",
    "ounces" to "onces",
    "square" to "carr\u00E9",
    "squares" to "carr\u00E9s",
    "cookie" to "biscuit",
    "cookies" to "biscuits"
)

private val ingredientDescriptorTranslations = mapOf(
    "divided" to "divis\u00E9",
    "beaten" to "battu",
    "chopped" to "hach\u00E9",
    "baking" to "pour cuisson",
    "room temperature" to "temp\u00E9rature ambiante",
    "softened" to "ramolli"
)

private fun IngredientReference.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

private fun Tag.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

internal fun RecipeSource.displayText(): String = sourceName.ifBlank { sourceUrl }

internal fun RecipeSource.clickableUrlOrNull(): String? = sourceUrl.trim().takeIf { it.isNotBlank() }

private data class DetailIngredientItem(
    val ingredient: IngredientLine,
    val text: String,
    val isDone: Boolean
)

private data class ConversionDialogState(
    val ingredient: IngredientLine,
    val ingredientReference: IngredientReference?,
    val targetUnits: List<String>,
    val selectedUnit: String?
)

private data class StandardUnitDefinition(
    val unit: String,
    val baseUnit: String,
    val toBaseFactor: Double
)

private data class UnitOptionSortKey(
    val unit: String,
    val category: Int,
    val rank: Int
)

private val DoneIngredientTextColor = Color(0xFFB8B8B8)
private const val TABLESPOONS_PER_CUP = 16.0
private const val TEASPOONS_PER_TABLESPOON = 3.0
private const val MEASUREMENT_TOLERANCE = 0.02
private const val CUP_FRACTION_TOLERANCE = 0.04
private const val TABLESPOON_FRACTION_TOLERANCE = 0.08
private const val FRACTION_SPACING = " "
private const val HALF_FRACTION_TOLERANCE = 0.14
private val HALF_FRACTIONS = listOf(0.5)
private val CUP_FRACTIONS = listOf(0.25, 1.0 / 3.0, 0.5, 2.0 / 3.0, 0.75)
private val TABLESPOON_FRACTIONS = listOf(0.5)
private val TEASPOON_FRACTIONS = listOf(0.125, 0.25, 0.5, 0.75)
private val fractionGlyphs = mapOf(
    0.125 to "\u215B",
    0.25 to "\u00BC",
    (1.0 / 3.0) to "\u2153",
    0.5 to "\u00BD",
    (2.0 / 3.0) to "\u2154",
    0.75 to "\u00BE"
)

private val standardUnitDefinitions = listOf(
    StandardUnitDefinition(unit = "g", baseUnit = "g", toBaseFactor = 1.0),
    StandardUnitDefinition(unit = "kg", baseUnit = "g", toBaseFactor = 1000.0),
    StandardUnitDefinition(unit = "oz", baseUnit = "g", toBaseFactor = 28.349523125),
    StandardUnitDefinition(unit = "lb", baseUnit = "g", toBaseFactor = 453.59237),
    StandardUnitDefinition(unit = "ml", baseUnit = "ml", toBaseFactor = 1.0),
    StandardUnitDefinition(unit = "l", baseUnit = "ml", toBaseFactor = 1000.0),
    StandardUnitDefinition(unit = "tsp", baseUnit = "ml", toBaseFactor = 4.92892159375),
    StandardUnitDefinition(unit = "tbsp", baseUnit = "ml", toBaseFactor = 14.78676478125),
    StandardUnitDefinition(unit = "cup", baseUnit = "ml", toBaseFactor = 236.5882365),
    StandardUnitDefinition(unit = "fl oz", baseUnit = "ml", toBaseFactor = 29.5735295625)
)

private fun String.toUnitSortKey(): UnitOptionSortKey {
    val normalized = normalizeUnit()
    val category = when (normalized) {
        "g", "kg", "oz", "lb" -> 0
        "ml", "l", "tsp", "tbsp", "cup", "fl oz" -> 1
        else -> 2
    }
    val rank = when (normalized) {
        "g" -> 0
        "kg" -> 1
        "oz" -> 2
        "lb" -> 3
        "ml" -> 0
        "l" -> 1
        "tsp" -> 2
        "tbsp" -> 3
        "cup" -> 4
        "fl oz" -> 5
        else -> 99
    }
    return UnitOptionSortKey(unit = normalized, category = category, rank = rank)
}























