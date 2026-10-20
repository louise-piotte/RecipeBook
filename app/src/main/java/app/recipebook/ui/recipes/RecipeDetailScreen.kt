package app.recipebook.ui.recipes

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.data.local.recipes.IngredientSubstitutionCatalog
import app.recipebook.data.local.recipes.IngredientSubstitutionResolver
import app.recipebook.data.local.recipes.IngredientSubstitutionSuggestion
import app.recipebook.data.local.recipes.buildIngredientUnitConversionGraph
import app.recipebook.data.local.recipes.convertPackageAmount
import app.recipebook.data.local.recipes.packageAmountForIngredientLine
import app.recipebook.domain.localization.BilingualTextResolver
import app.recipebook.domain.localization.formatIngredientAmount
import app.recipebook.domain.localization.formatIngredientBase
import app.recipebook.domain.localization.formatIngredientPreparation
import app.recipebook.domain.localization.formatRecipeNumber
import app.recipebook.domain.localization.parseRecipeQuantity
import app.recipebook.domain.localization.normalizeIngredientUnit
import app.recipebook.domain.localization.localizedMeasurementUnit
import app.recipebook.domain.localization.MissingTextPlaceholders
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.localization.BilingualText
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientPackageAmount
import app.recipebook.domain.model.PackageYieldBasis
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeLink
import app.recipebook.domain.model.RecipeLinkType
import app.recipebook.domain.model.RecipeSource
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.Tag
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.ui.theme.PopupShape
import kotlin.math.round

@Composable
internal fun RecipeDetailScreen(
    recipe: Recipe?,
    recipes: List<Recipe>,
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    onBack: () -> Unit,
    onNavigate: (MainMenuDestination) -> Unit,
    onEdit: (String) -> Unit,
    onOpenLinkedRecipe: (String) -> Unit,
    modifier: Modifier = Modifier,
    substitutionCatalog: IngredientSubstitutionCatalog = IngredientSubstitutionCatalog.EMPTY
) {
    val resolver = BilingualTextResolver()
    val placeholders = MissingTextPlaceholders(
        missingInFrench = localizedString(R.string.placeholder_missing_fr, AppLanguage.FR),
        missingInEnglish = localizedString(R.string.placeholder_missing_en, AppLanguage.EN)
    )
    var doneIngredientIds by remember { mutableStateOf(setOf<String>()) }
    var emphasizedInstructionIndexes by remember { mutableStateOf(setOf<Int>()) }
    var convertedUnits by remember { mutableStateOf<Map<String, String>>(emptyMap()) }
    var conversionDialogIngredientId by remember { mutableStateOf<String?>(null) }
    var substitutionDialogIngredientId by remember { mutableStateOf<String?>(null) }
    var recipeScaleFactor by remember(recipe?.id, recipe?.servings) { mutableStateOf(1.0) }
    var isScaleDialogOpen by remember(recipe?.id) { mutableStateOf(false) }

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
                    recipes = recipes,
                    ingredientReferences = ingredientReferences,
                    substitutionCatalog = substitutionCatalog,
                    tags = tags,
                    language = language,
                    resolver = resolver,
                    placeholders = placeholders,
                    doneIngredientIds = doneIngredientIds,
                    emphasizedInstructionIndexes = emphasizedInstructionIndexes,
                    convertedUnits = convertedUnits,
                    recipeScaleFactor = recipeScaleFactor,
                    conversionDialogIngredientId = conversionDialogIngredientId,
                    onToggleIngredientDone = { ingredientId ->
                        doneIngredientIds = if (ingredientId in doneIngredientIds) {
                            doneIngredientIds - ingredientId
                        } else {
                            doneIngredientIds + ingredientId
                        }
                    },
                    onToggleInstructionEmphasis = { instructionIndex ->
                        emphasizedInstructionIndexes = if (instructionIndex in emphasizedInstructionIndexes) {
                            emphasizedInstructionIndexes - instructionIndex
                        } else {
                            emphasizedInstructionIndexes + instructionIndex
                        }
                    },
                    onOpenIngredientConversion = { ingredientId ->
                        conversionDialogIngredientId = ingredientId
                    },
                    onOpenScaleDialog = { isScaleDialogOpen = true },
                    onResetRecipeScale = { recipeScaleFactor = 1.0 },
                    onOpenIngredientSubstitutions = { ingredientId ->
                        substitutionDialogIngredientId = ingredientId
                    },
                    onDismissIngredientConversion = {
                        conversionDialogIngredientId = null
                    },
                    onDismissIngredientSubstitutions = {
                        substitutionDialogIngredientId = null
                    },
                    onOpenLinkedRecipe = onOpenLinkedRecipe,
                    onSelectIngredientConversion = { ingredientId, unit ->
                        convertedUnits = if (unit == null) {
                            convertedUnits - ingredientId
                        } else {
                            convertedUnits + (ingredientId to unit)
                        }
                        conversionDialogIngredientId = null
                    },
                    substitutionDialogIngredientId = substitutionDialogIngredientId
                )
                if (isScaleDialogOpen) {
                    RecipeScaleDialog(
                        recipe = recipe,
                        currentScaleFactor = recipeScaleFactor,
                        language = language,
                        onDismiss = { isScaleDialogOpen = false },
                        onApply = { scaleFactor ->
                            recipeScaleFactor = scaleFactor
                            isScaleDialogOpen = false
                        }
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun RecipeDetailCard(
    recipe: Recipe,
    recipes: List<Recipe>,
    ingredientReferences: List<IngredientReference>,
    substitutionCatalog: IngredientSubstitutionCatalog,
    tags: List<Tag>,
    language: AppLanguage,
    resolver: BilingualTextResolver,
    placeholders: MissingTextPlaceholders,
    doneIngredientIds: Set<String>,
    emphasizedInstructionIndexes: Set<Int>,
    convertedUnits: Map<String, String>,
    recipeScaleFactor: Double,
    conversionDialogIngredientId: String?,
    substitutionDialogIngredientId: String?,
    onToggleIngredientDone: (String) -> Unit,
    onToggleInstructionEmphasis: (Int) -> Unit,
    onOpenIngredientConversion: (String) -> Unit,
    onOpenScaleDialog: () -> Unit,
    onResetRecipeScale: () -> Unit,
    onOpenIngredientSubstitutions: (String) -> Unit,
    onDismissIngredientConversion: () -> Unit,
    onDismissIngredientSubstitutions: () -> Unit,
    onOpenLinkedRecipe: (String) -> Unit,
    onSelectIngredientConversion: (String, String?) -> Unit
) {
    val ingredientReferenceMap = remember(ingredientReferences) { ingredientReferences.associateBy(IngredientReference::id) }
    val recipeMap = remember(recipes) { recipes.associateBy(Recipe::id) }
    val uriHandler = LocalUriHandler.current
    val resolvedTags = recipe.tagIds.mapNotNull { tagId -> tags.firstOrNull { it.id == tagId } }
    val notes = resolver.resolveUserText(
        language = language,
        valueFr = recipe.languages.fr.notes.ifBlank { null },
        valueEn = recipe.languages.en.notes.ifBlank { null },
        placeholders = placeholders
    )
    val instructions = parseTextEntries(resolver.resolveSystemText(language, recipe.instructionsText()))
    val substitutionsByLineId = remember(recipe, tags, ingredientReferences, substitutionCatalog) {
        val substitutionResolver = IngredientSubstitutionResolver(
            recipe = recipe,
            tags = tags,
            ingredientReferences = ingredientReferences,
            catalog = substitutionCatalog
        )
        recipe.ingredients.associate { ingredient ->
            ingredient.id to substitutionResolver.resolve(ingredient)
        }
    }
    val ingredientItems = recipe.ingredients.mapNotNull { ingredient ->
        val scaledQuantity = scaleRecipeQuantity(ingredient.quantity, recipeScaleFactor)
        val scaledIngredient = ingredient.copy(quantity = scaledQuantity)
        val ingredientReference = ingredient.ingredientRefId?.let(ingredientReferenceMap::get)
        val packageAmount = scaleIngredientPackageAmount(
            packageAmountForIngredientLine(ingredient, substitutionCatalog.ingredientForms, ingredientReferences),
            recipeScaleFactor
        )
        val ingredientForm = ingredient.selectedForm(substitutionCatalog.ingredientForms)
        val convertedUnit = convertedUnits[ingredient.id]
        val convertedQuantity = convertedUnit?.let { unit ->
            convertIngredientQuantity(
                quantity = scaledQuantity,
                fromUnit = ingredient.unit,
                toUnit = unit,
                ingredientReference = ingredientReference,
                ingredientForm = ingredientForm,
                units = substitutionCatalog.units,
                ingredientRefId = ingredient.ingredientRefId,
                packageAmount = packageAmount,
                packageYields = substitutionCatalog.packageYields
            )
        }
        val activeConvertedUnit = convertedUnit.takeIf { convertedQuantity != null }
        val activePackageConversion = if (activeConvertedUnit != null) {
            convertPackageAmount(
                ingredientRefId = ingredient.ingredientRefId,
                ingredientForm = ingredientForm,
                amount = packageAmount,
                observations = substitutionCatalog.packageYields,
                targetUnit = activeConvertedUnit,
                ingredientReference = ingredientReference,
                units = substitutionCatalog.units
            )
        } else null
        val lineForDisplay = if (
            activePackageConversion?.basis == PackageYieldBasis.DRAINED_MASS &&
            ingredient.preparation.fr.isBlank() && ingredient.preparation.en.isBlank()
        ) scaledIngredient.copy(preparation = app.recipebook.domain.model.LocalizedValue(fr = "égouttés", en = "drained"))
        else scaledIngredient
        val displayText = buildDetailIngredientText(
            ingredient = lineForDisplay,
            ingredientReference = ingredientReference,
            language = language,
            quantityOverride = convertedQuantity ?: scaledQuantity,
            unitOverride = activeConvertedUnit ?: ingredient.unit,
            ingredientForm = ingredientForm
        ).let { text ->
            if (activePackageConversion?.sourceSpecificEstimate == true) {
                "$text (${localizedString(R.string.package_yield_source_qualifier, language, activePackageConversion.observation.brand ?: activePackageConversion.observation.sourceName)})"
            } else text
        }
        val substitutions = substitutionsByLineId[ingredient.id].orEmpty()
        displayText.takeIf { it.isNotEmpty() }?.let {
            DetailIngredientItem(
                ingredient = ingredient,
                text = it,
                substitutions = substitutions,
                isDone = ingredient.id in doneIngredientIds
            )
        }
    }
    val selectedIngredientItem = conversionDialogIngredientId?.let { selectedId ->
        recipe.ingredients.firstOrNull { it.id == selectedId }?.let { ingredient ->
            val scaledIngredient = ingredient.copy(
                quantity = scaleRecipeQuantity(ingredient.quantity, recipeScaleFactor)
            )
            val ingredientReference = ingredient.ingredientRefId?.let(ingredientReferenceMap::get)
            val packageAmount = scaleIngredientPackageAmount(
                packageAmountForIngredientLine(ingredient, substitutionCatalog.ingredientForms, ingredientReferences),
                recipeScaleFactor
            )
            ConversionDialogState(
                ingredient = scaledIngredient,
                ingredientReference = ingredientReference,
                ingredientForm = ingredient.selectedForm(substitutionCatalog.ingredientForms),
                packageAmount = packageAmount,
                targetUnits = availableConversionUnits(
                    ingredient.unit,
                    ingredientReference,
                    ingredient.selectedForm(substitutionCatalog.ingredientForms),
                    substitutionCatalog.units,
                    ingredient.ingredientRefId,
                    packageAmount,
                    substitutionCatalog.packageYields
                ),
                selectedUnit = convertedUnits[selectedId]
            )
        }
    }
    val selectedSubstitutionItem = substitutionDialogIngredientId?.let { selectedId ->
        ingredientItems.firstOrNull { it.ingredient.id == selectedId }?.let { item ->
            SubstitutionDialogState(
                ingredient = item.ingredient,
                substitutions = item.substitutions
            )
        }
    }
    val recipeLinks = recipe.recipeLinks.map { link ->
        DetailRecipeLinkItem(
            link = link,
            targetRecipe = recipeMap[link.targetRecipeId]
        )
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
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = resolver.resolveSystemText(language, recipe.titleText()),
                style = MaterialTheme.typography.headlineSmall
            )
            RecipeRatingStars(
                rating = recipe.ratings?.userRating,
                orientation = RecipeRatingOrientation.Horizontal,
                ratingDescription = recipe.ratings?.userRating?.let { rating ->
                    localizedString(R.string.detail_rating_value, language, rating)
                }
            )
        }
        Text(
            text = resolver.resolveSystemText(language, recipe.descriptionText()),
            style = MaterialTheme.typography.bodyLarge
        )

        Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                recipe.servings?.let { servings ->
                    val scaledServings = scaleRecipeQuantity(servings.amount, recipeScaleFactor) ?: servings.amount
                    Text(
                        text = localizedString(
                            R.string.detail_amount_value,
                            language,
                            if (servings.unit.isNullOrBlank()) {
                                formatRecipeNumber(scaledServings, language)
                            } else {
                                localizedString(R.string.servings_value_with_unit, language, formatRecipeNumber(scaledServings, language), servings.unit)
                            }
                        ),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                TextButton(
                    onClick = onOpenScaleDialog,
                    modifier = Modifier.testTag("recipe-scale-button")
                ) {
                    Text(localizedString(R.string.recipe_scale_label, language))
                }
            }
            if (recipeScaleFactor != 1.0) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = localizedString(
                            R.string.recipe_scale_factor_value,
                            language,
                            formatRecipeNumber(recipeScaleFactor, language)
                        ),
                        style = MaterialTheme.typography.bodySmall
                    )
                    TextButton(
                        onClick = onResetRecipeScale,
                        modifier = Modifier.testTag("recipe-scale-reset")
                    ) {
                        Text(localizedString(R.string.ingredient_conversion_reset_label, language))
                    }
                }
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
        }

        if (resolvedTags.isNotEmpty()) {
            DetailSection(localizedString(R.string.tags_label, language)) {
                Text(
                    text = buildDetailTagText(resolvedTags, language),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }

        if (recipeLinks.isNotEmpty()) {
            DetailSection(localizedString(R.string.linked_recipes_label, language)) {
                recipeLinks.forEach { linkItem ->
                    DetailRecipeLinkRow(
                        item = linkItem,
                        language = language,
                        resolver = resolver,
                        onOpen = onOpenLinkedRecipe
                    )
                }
            }
        }

        DetailSection(localizedString(R.string.ingredients_label, language)) {
            ingredientItems.forEach { ingredient ->
                DetailIngredientRow(
                    ingredient = ingredient,
                    language = language,
                    onToggleDone = { onToggleIngredientDone(ingredient.ingredient.id) },
                    onOpenConversion = { onOpenIngredientConversion(ingredient.ingredient.id) },
                    onOpenSubstitutions = { onOpenIngredientSubstitutions(ingredient.ingredient.id) }
                )
            }
        }

        DetailSection(localizedString(R.string.instructions_label, language)) {
            instructions.forEachIndexed { index, instruction ->
                DetailInstructionRow(
                    index = index,
                    instruction = instruction,
                    isEmphasized = index in emphasizedInstructionIndexes,
                    language = language,
                    onToggleEmphasis = { onToggleInstructionEmphasis(index) }
                )
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
            ingredientForm = dialogState.ingredientForm,
            packageAmount = dialogState.packageAmount,
            ingredientRefId = dialogState.ingredient.ingredientRefId,
            packageYields = substitutionCatalog.packageYields,
            units = substitutionCatalog.units,
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

    selectedSubstitutionItem?.let { dialogState ->
        IngredientSubstitutionDialog(
            ingredient = dialogState.ingredient,
            substitutions = dialogState.substitutions,
            scaleFactor = recipeScaleFactor,
            language = language,
            onDismiss = onDismissIngredientSubstitutions
        )
    }
}

private data class DetailRecipeLinkItem(
    val link: RecipeLink,
    val targetRecipe: Recipe?
)

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

@Composable
private fun DetailRecipeLinkRow(
    item: DetailRecipeLinkItem,
    language: AppLanguage,
    resolver: BilingualTextResolver,
    onOpen: (String) -> Unit
) {
    val title = item.targetRecipe?.let { resolver.resolveSystemText(language, it.titleText()) }
        ?: localizedString(R.string.linked_recipe_unavailable_label, language)
    val label = item.link.localizedLabel(language)
        ?: localizedString(recipeLinkTypeLabelRes(item.link.linkType), language)
    val modifier = if (item.targetRecipe == null) {
        Modifier
    } else {
        Modifier.clickable { onOpen(item.targetRecipe.id) }
    }

    Surface(
        tonalElevation = 2.dp,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RecipePhoto(
                localPath = item.targetRecipe?.mainPhoto()?.localPath,
                contentDescription = localizedString(R.string.recipe_photo_preview_label, language),
                modifier = Modifier
                    .size(52.dp)
            )
            Text(
                text = "$label: $title",
                style = MaterialTheme.typography.bodyLarge,
                color = if (item.targetRecipe == null) {
                    MaterialTheme.colorScheme.onSurfaceVariant
                } else {
                    MaterialTheme.colorScheme.primary
                },
                textDecoration = if (item.targetRecipe == null) TextDecoration.None else TextDecoration.Underline,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun DetailInstructionRow(
    index: Int,
    instruction: String,
    isEmphasized: Boolean,
    language: AppLanguage,
    onToggleEmphasis: () -> Unit
) {
    val stateLabel = if (isEmphasized) {
        localizedString(R.string.instruction_state_emphasized, language)
    } else {
        localizedString(R.string.instruction_state_normal, language)
    }
    Text(
        text = "${index + 1}. $instruction",
        style = MaterialTheme.typography.bodyMedium,
        fontWeight = if (isEmphasized) FontWeight.Bold else FontWeight.Normal,
        modifier = Modifier
            .fillMaxWidth()
            .testTag("instruction-row-$index")
            .semantics { stateDescription = stateLabel }
            .clickable(onClick = onToggleEmphasis)
            .padding(vertical = 1.dp)
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun DetailIngredientRow(
    ingredient: DetailIngredientItem,
    language: AppLanguage,
    onToggleDone: () -> Unit,
    onOpenConversion: () -> Unit,
    onOpenSubstitutions: () -> Unit
) {
    val stateLabel = if (ingredient.isDone) {
        localizedString(R.string.ingredient_state_done, language)
    } else {
        localizedString(R.string.ingredient_state_pending, language)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("ingredient-row-${ingredient.ingredient.id}")
            .semantics { stateDescription = stateLabel }
            .combinedClickable(
                onClick = onToggleDone,
                onLongClick = onOpenConversion
            )
            .padding(vertical = 1.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = ingredient.text,
            style = MaterialTheme.typography.bodyMedium,
            color = if (ingredient.isDone) {
                DoneIngredientTextColor
            } else {
                MaterialTheme.colorScheme.onSurface
            },
            modifier = Modifier
                .weight(1f)
        )
        Box(modifier = Modifier.width(28.dp)) {
            IconButton(
                onClick = onOpenSubstitutions,
                modifier = Modifier
                    .size(28.dp)
                    .testTag("ingredient-substitute-${ingredient.ingredient.id}")
            ) {
                Icon(
                    imageVector = Icons.Filled.SwapHoriz,
                    contentDescription = localizedString(R.string.ingredient_substitution_button_label, language),
                    tint = if (ingredient.substitutions.isEmpty()) {
                        MaterialTheme.colorScheme.onSurface.copy(alpha = 0.35f)
                    } else {
                        when (ingredient.substitutions.first().riskLevel) {
                            SubstitutionRiskLevel.SAFE -> MaterialTheme.colorScheme.primary
                            SubstitutionRiskLevel.CAUTION -> MaterialTheme.colorScheme.tertiary
                            SubstitutionRiskLevel.HIGH_RISK -> MaterialTheme.colorScheme.error
                        }
                    }
                )
            }
        }
    }
}

private enum class RecipeScaleMode { SERVINGS, MULTIPLIER }

@Composable
private fun RecipeScaleDialog(
    recipe: Recipe,
    currentScaleFactor: Double,
    language: AppLanguage,
    onDismiss: () -> Unit,
    onApply: (Double) -> Unit
) {
    val baseServings = recipe.servings?.amount?.takeIf { it.isFinite() && it > 0.0 }
    val initialMode = if (baseServings != null) RecipeScaleMode.SERVINGS else RecipeScaleMode.MULTIPLIER
    var mode by remember(recipe.id) { mutableStateOf(initialMode) }
    var input by remember(recipe.id, currentScaleFactor) {
        mutableStateOf(
            formatRecipeNumber(
                if (mode == RecipeScaleMode.SERVINGS) {
                    requireNotNull(baseServings) * currentScaleFactor
                } else {
                    currentScaleFactor
                },
                language
            )
        )
    }
    val enteredValue = parseRecipeQuantity(input)?.takeIf { it.isFinite() && it > 0.0 }
    val requestedScaleFactor = when (mode) {
        RecipeScaleMode.SERVINGS -> enteredValue?.let { servings ->
            baseServings?.let { original -> servings / original }
        }
        RecipeScaleMode.MULTIPLIER -> enteredValue
    }?.takeIf { it.isFinite() && it > 0.0 }

    AlertDialog(
        onDismissRequest = onDismiss,
        shape = PopupShape,
        confirmButton = {
            TextButton(
                enabled = requestedScaleFactor != null,
                onClick = { requestedScaleFactor?.let(onApply) }
            ) {
                Text(localizedString(R.string.apply_label, language))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.cancel_label, language))
            }
        },
        title = { Text(localizedString(R.string.recipe_scale_dialog_title, language)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(localizedString(R.string.recipe_scale_times_unchanged_note, language))
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    if (baseServings != null) {
                        TextButton(
                            onClick = {
                                mode = RecipeScaleMode.SERVINGS
                                input = formatRecipeNumber(baseServings * currentScaleFactor, language)
                            },
                            modifier = Modifier.testTag("recipe-scale-mode-servings")
                        ) {
                            Text(
                                if (mode == RecipeScaleMode.SERVINGS) {
                                    "✓ ${localizedString(R.string.recipe_scale_by_servings_label, language)}"
                                } else {
                                    localizedString(R.string.recipe_scale_by_servings_label, language)
                                }
                            )
                        }
                    }
                    TextButton(
                        onClick = {
                            mode = RecipeScaleMode.MULTIPLIER
                            input = formatRecipeNumber(currentScaleFactor, language)
                        },
                        modifier = Modifier.testTag("recipe-scale-mode-multiplier")
                    ) {
                        Text(
                            if (mode == RecipeScaleMode.MULTIPLIER) {
                                "✓ ${localizedString(R.string.recipe_scale_by_multiplier_label, language)}"
                            } else {
                                localizedString(R.string.recipe_scale_by_multiplier_label, language)
                            }
                        )
                    }
                }
                OutlinedTextField(
                    value = input,
                    onValueChange = { input = it },
                    label = {
                        Text(
                            localizedString(
                                if (mode == RecipeScaleMode.SERVINGS) {
                                    R.string.servings_amount_label
                                } else {
                                    R.string.recipe_scale_multiplier_label
                                },
                                language
                            )
                        )
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("recipe-scale-input")
                )
            }
        }
    )
}

internal fun scaleRecipeQuantity(quantity: Double?, scaleFactor: Double): Double? {
    if (quantity == null || !quantity.isFinite() || !scaleFactor.isFinite() || scaleFactor <= 0.0) {
        return quantity
    }
    val scaledQuantity = quantity * scaleFactor
    return scaledQuantity.takeIf { it.isFinite() } ?: quantity
}

internal fun scaleIngredientPackageAmount(
    packageAmount: IngredientPackageAmount?,
    scaleFactor: Double
): IngredientPackageAmount? {
    val amount = packageAmount ?: return null
    val scaledCount = scaleRecipeQuantity(amount.count, scaleFactor) ?: return amount
    return amount.copy(count = scaledCount)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun IngredientConversionDialog(
    ingredient: IngredientLine,
    ingredientReference: IngredientReference?,
    ingredientForm: IngredientForm?,
    packageAmount: IngredientPackageAmount?,
    ingredientRefId: String?,
    packageYields: List<app.recipebook.domain.model.PackageYieldObservation>,
    units: List<UnitDefinition>,
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
        shape = PopupShape,
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.close_label, language))
            }
        },
        dismissButton = if (selectedUnit != null) {
            {
                TextButton(
                    onClick = onReset,
                    modifier = Modifier.testTag("ingredient-conversion-reset")
                ) {
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
                            ingredientReference = ingredientReference,
                            ingredientForm = ingredientForm,
                            units = units,
                            ingredientRefId = ingredientRefId,
                            packageAmount = packageAmount,
                            packageYields = packageYields
                        )
                        val packageConversion = convertPackageAmount(
                            ingredientRefId = ingredientRefId,
                            ingredientForm = ingredientForm,
                            amount = packageAmount,
                            observations = packageYields,
                            targetUnit = unit,
                            ingredientReference = ingredientReference,
                            units = units
                        )
                        val ingredientForDisplay = if (
                            packageConversion?.basis == PackageYieldBasis.DRAINED_MASS &&
                            ingredient.preparation.fr.isBlank() && ingredient.preparation.en.isBlank()
                        ) ingredient.copy(preparation = app.recipebook.domain.model.LocalizedValue(fr = "égouttés", en = "drained"))
                        else ingredient
                        val optionLabel = buildIngredientConversionOptionLabel(
                            quantity = convertedQuantity,
                            unit = unit,
                            ingredient = ingredientForDisplay,
                            ingredientReference = ingredientReference,
                            language = language
                        )
                        val qualifiedOptionLabel = if (packageConversion?.sourceSpecificEstimate == true) {
                            "$optionLabel (${localizedString(R.string.package_yield_source_qualifier, language, packageConversion.observation.brand ?: packageConversion.observation.sourceName)})"
                        } else optionLabel
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("ingredient-convert-$unit")
                                .combinedClickable(onClick = { onSelectUnit(unit) })
                                .padding(vertical = 1.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = qualifiedOptionLabel,
                                color = if (unit == selectedUnit) {
                                    MaterialTheme.colorScheme.primary
                                } else {
                                    Color.Unspecified
                                }
                            )
                        }
                    }
                    if (packageAmount != null && packageAmount.count % 1.0 != 0.0) {
                        Text(
                            text = localizedString(R.string.package_yield_fractional_note, language),
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
        }
    )
}

@Composable
private fun IngredientSubstitutionDialog(
    ingredient: IngredientLine,
    substitutions: List<IngredientSubstitutionSuggestion>,
    scaleFactor: Double,
    language: AppLanguage,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        shape = PopupShape,
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(localizedString(R.string.close_label, language))
            }
        },
        title = {
            Text(localizedString(R.string.ingredient_substitution_dialog_title, language, ingredient.ingredientName))
        },
        text = {
            if (substitutions.isEmpty()) {
                Text(localizedString(R.string.ingredient_substitution_unavailable_label, language))
            } else {
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    substitutions.forEach { substitution ->
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("ingredient-substitution-option-${substitution.id}")
                                .semantics(mergeDescendants = true) {},
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = buildIngredientSubstitutionOptionLabel(
                                    ingredient,
                                    substitution.copy(quantity = scaleRecipeQuantity(substitution.quantity, scaleFactor)),
                                    language
                                ),
                                color = when (substitution.riskLevel) {
                                    SubstitutionRiskLevel.SAFE -> MaterialTheme.colorScheme.onSurface
                                    SubstitutionRiskLevel.CAUTION -> MaterialTheme.colorScheme.tertiary
                                    SubstitutionRiskLevel.HIGH_RISK -> MaterialTheme.colorScheme.error
                                }
                            )
                            Text(
                                text = localizedString(
                                    riskLevelLabelResId(substitution.riskLevel),
                                    language
                                ),
                                style = MaterialTheme.typography.labelSmall
                            )
                            substitution.localizedNotes(language)?.let { note ->
                                Text(
                                    text = note,
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                            substitution.localizedWarning(language)?.let { warning ->
                                Text(
                                    text = localizedString(
                                        R.string.ingredient_substitution_warning_value_label,
                                        language,
                                        warning
                                    ),
                                    color = MaterialTheme.colorScheme.error,
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
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
    preserveUnitOverride: Boolean = unitOverride != null && unitOverride.normalizeIngredientUnit() != ingredient.unit?.normalizeIngredientUnit(),
    ingredientForm: IngredientForm? = null
): String {
    val localizedPreparation = when (language) {
        AppLanguage.FR -> ingredient.preparation.fr
        AppLanguage.EN -> ingredient.preparation.en
    }.ifBlank { ingredient.preparation.primaryValue().orEmpty() }
    val selectedFormName = ingredientForm
        ?.takeIf { it.ingredientRefId == ingredient.ingredientRefId && localizedPreparation.isBlank() }
        ?.let { form -> if (language == AppLanguage.FR) form.labelFr else form.labelEn }
        ?.ifBlank { null }
    val ingredientName = selectedFormName
        ?: ingredientReference?.localizedName(language)
            ?.ifBlank { ingredient.ingredientName }
        ?: ingredient.ingredientName
    val localizedNotes = when (language) {
        AppLanguage.FR -> ingredient.notes.fr
        AppLanguage.EN -> ingredient.notes.en
    }.ifBlank { ingredient.notes.primaryValue().orEmpty() }
    val base = formatIngredientBase(quantityOverride, unitOverride, ingredientName, language, preserveUnitOverride)
    val preparationDisplay = formatIngredientPreparation(localizedPreparation, quantityOverride, unitOverride, ingredientName, language)
    val withPreparation = if (preparationDisplay.isBlank()) base else "$base, $preparationDisplay"
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

internal fun buildIngredientSubstitutionOptionLabel(
    ingredient: IngredientLine,
    substitution: IngredientSubstitutionSuggestion,
    language: AppLanguage
): String = buildDetailIngredientText(
    ingredient = ingredient.copy(ingredientName = substitution.localizedDisplayName(language)),
    ingredientReference = null,
    language = language,
    quantityOverride = substitution.quantity,
    unitOverride = substitution.unit
)

private fun riskLevelLabelResId(riskLevel: SubstitutionRiskLevel): Int = when (riskLevel) {
    SubstitutionRiskLevel.SAFE -> R.string.ingredient_substitution_risk_safe_label
    SubstitutionRiskLevel.CAUTION -> R.string.ingredient_substitution_risk_caution_label
    SubstitutionRiskLevel.HIGH_RISK -> R.string.ingredient_substitution_risk_high_label
}

internal fun availableConversionUnits(
    currentUnit: String?,
    ingredientReference: IngredientReference?,
    ingredientForm: IngredientForm? = null,
    units: List<UnitDefinition> = emptyList(),
    ingredientRefId: String? = null,
    packageAmount: IngredientPackageAmount? = null,
    packageYields: List<app.recipebook.domain.model.PackageYieldObservation> = emptyList()
): List<String> {
    if (packageAmount?.requestedBasis != null) {
        val candidateUnits = (units.map(UnitDefinition::unitId) + listOf("g", "kg", "oz", "lb", "ml", "l", "fl oz")).distinct()
        return candidateUnits.asSequence()
            .filter { target -> convertPackageAmount(ingredientRefId, ingredientForm, packageAmount, packageYields, target, ingredientReference, units) != null }
            .map(String::toUnitSortKey)
            .sortedWith(compareBy(UnitOptionSortKey::category, UnitOptionSortKey::rank, UnitOptionSortKey::unit))
            .map(UnitOptionSortKey::unit)
            .toList()
    }
    val fromUnit = currentUnit?.normalizeIngredientUnit() ?: return emptyList()
    val graph = buildIngredientUnitConversionGraph(ingredientReference, ingredientForm, units)
    return graph.unitsConvertibleFrom(fromUnit)
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
    ingredientReference: IngredientReference?,
    ingredientForm: IngredientForm? = null,
    units: List<UnitDefinition> = emptyList(),
    ingredientRefId: String? = null,
    packageAmount: IngredientPackageAmount? = null,
    packageYields: List<app.recipebook.domain.model.PackageYieldObservation> = emptyList()
): Double? {
    if (packageAmount != null) {
        return convertPackageAmount(
            ingredientRefId = ingredientRefId,
            ingredientForm = ingredientForm,
            amount = packageAmount,
            observations = packageYields,
            targetUnit = toUnit,
            ingredientReference = ingredientReference,
            units = units
        )?.quantity?.let { roundIngredientQuantity(it, toUnit.normalizeIngredientUnit()) }
    }
    val amount = quantity?.takeIf { it.isFinite() && it >= 0.0 } ?: return null
    val normalizedFrom = fromUnit?.normalizeIngredientUnit() ?: return null
    val normalizedTo = toUnit.normalizeIngredientUnit()
    if (normalizedFrom == normalizedTo) return amount
    val factor = buildIngredientUnitConversionGraph(ingredientReference, ingredientForm, units)
        .conversionFactor(normalizedFrom, normalizedTo) ?: return null
    return roundIngredientQuantity(amount * factor, normalizedTo)
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
    val rounded = round(value / increment) * increment
    return if (rounded == 0.0 && value > 0.0) value else rounded
}

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
    val substitutions: List<IngredientSubstitutionSuggestion>,
    val isDone: Boolean
)

private data class ConversionDialogState(
    val ingredient: IngredientLine,
    val ingredientReference: IngredientReference?,
    val ingredientForm: IngredientForm?,
    val packageAmount: IngredientPackageAmount?,
    val targetUnits: List<String>,
    val selectedUnit: String?
)

private data class SubstitutionDialogState(
    val ingredient: IngredientLine,
    val substitutions: List<IngredientSubstitutionSuggestion>
)

private data class UnitOptionSortKey(
    val unit: String,
    val category: Int,
    val rank: Int
)

private fun RecipeLink.localizedLabel(language: AppLanguage): String? = when (language) {
    AppLanguage.FR -> labelFr?.trim()?.ifBlank { null }
    AppLanguage.EN -> labelEn?.trim()?.ifBlank { null }
}

private fun app.recipebook.domain.model.LocalizedValue.primaryValue(): String? =
    en.ifBlank { fr }.ifBlank { null }

private fun recipeLinkTypeLabelRes(type: RecipeLinkType): Int = when (type) {
    RecipeLinkType.COMPONENT -> R.string.recipe_link_type_component_label
    RecipeLinkType.TOPPING -> R.string.recipe_link_type_topping_label
    RecipeLinkType.FILLING -> R.string.recipe_link_type_filling_label
    RecipeLinkType.FROSTING -> R.string.recipe_link_type_frosting_label
    RecipeLinkType.SAUCE -> R.string.recipe_link_type_sauce_label
    RecipeLinkType.SEASONING -> R.string.recipe_link_type_seasoning_label
    RecipeLinkType.SIDE -> R.string.recipe_link_type_side_label
    RecipeLinkType.PAIRING -> R.string.recipe_link_type_pairing_label
    RecipeLinkType.VARIATION -> R.string.recipe_link_type_variation_label
    RecipeLinkType.OTHER -> R.string.recipe_link_type_other_label
}

private val DoneIngredientTextColor = Color(0xFFB8B8B8)

private fun String.toUnitSortKey(): UnitOptionSortKey {
    val normalized = normalizeIngredientUnit()
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

private fun IngredientLine.selectedForm(forms: List<IngredientForm>): IngredientForm? =
    ingredientFormId?.let { selectedId -> forms.firstOrNull { it.id == selectedId && it.ingredientRefId == ingredientRefId } }























