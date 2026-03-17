package app.recipebook.ui.recipes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.domain.localization.BilingualText
import app.recipebook.domain.localization.BilingualTextResolver
import app.recipebook.domain.localization.MissingTextPlaceholders
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.Tag

@Composable
fun RecipeDetailScreen(
    recipe: Recipe?,
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    onBack: () -> Unit,
    onEdit: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val resolver = BilingualTextResolver()
    val placeholders = MissingTextPlaceholders(
        missingInFrench = localizedString(R.string.placeholder_missing_fr, AppLanguage.FR),
        missingInEnglish = localizedString(R.string.placeholder_missing_en, AppLanguage.EN)
    )

    Scaffold(
        modifier = modifier,
        topBar = {
            RecipeBookTopBar(
                title = localizedString(R.string.detail_section_title, language),
                language = language,
                onLanguageChange = onLanguageChange,
                onNavigate = { },
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
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
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
                    placeholders = placeholders
                )
            }
        }
    }
}

@Composable
private fun RecipeDetailCard(
    recipe: Recipe,
    ingredientReferences: List<IngredientReference>,
    tags: List<Tag>,
    language: AppLanguage,
    resolver: BilingualTextResolver,
    placeholders: MissingTextPlaceholders
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
    val ingredients = recipe.ingredients.map { ingredient ->
        val ingredientReference = ingredient.ingredientRefId?.let(ingredientReferenceMap::get)
        buildDetailIngredientText(ingredient, ingredientReference, language)
    }.filter { it.isNotEmpty() }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
            Text(
                text = resolver.resolveSystemText(language, recipe.titleText()),
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = resolver.resolveSystemText(language, recipe.descriptionText()),
                style = MaterialTheme.typography.bodyLarge
            )

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
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
                ingredients.forEach { ingredient ->
                    Text(text = ingredient)
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
                        text = source.sourceName.ifBlank { source.sourceUrl },
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier.clickable { uriHandler.openUri(source.sourceUrl) }
                    )
                }
            }
        }
    }

@Composable
private fun DetailSection(
    label: String,
    content: @Composable () -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = label, style = MaterialTheme.typography.titleMedium)
        content()
    }
}

internal fun buildDetailTagText(tags: List<Tag>, language: AppLanguage): String =
    tags.joinToString(", ") { it.localizedName(language) }

internal fun Recipe.instructionsText(): BilingualText = BilingualText(
    fr = languages.fr.instructions,
    en = languages.en.instructions
)

internal fun buildDetailIngredientText(
    ingredient: app.recipebook.domain.model.IngredientLine,
    ingredientReference: IngredientReference?,
    language: AppLanguage
): String {
    val ingredientName = ingredientReference?.localizedName(language)
        ?.ifBlank { ingredient.ingredientName }
        ?: ingredient.ingredientName
    val localizedUnit = ingredient.unit?.localizedIngredientUnit(language)
    val localizedPreparation = ingredient.preparation?.localizedIngredientDescriptor(language)
    val localizedNotes = ingredient.notes?.localizedIngredientDescriptor(language)
    val base = listOfNotNull(
        ingredient.quantity?.let(::formatNumber),
        localizedUnit,
        ingredientName.ifBlank { null }
    ).joinToString(" ")
    val withPreparation = if (localizedPreparation.isNullOrBlank()) base else "$base, $localizedPreparation"
    val withNotes = if (localizedNotes.isNullOrBlank()) withPreparation else "$withPreparation ($localizedNotes)"
    return withNotes.ifBlank { ingredient.originalText.trim() }
}

private fun String.localizedIngredientUnit(language: AppLanguage): String {
    val normalized = trim()
    if (normalized.isEmpty()) return normalized
    return when (language) {
        AppLanguage.EN -> normalized
        AppLanguage.FR -> ingredientUnitTranslations[normalized.lowercase()] ?: normalized
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
    "cups" to "tasses",
    "tablespoon" to "cuill\u00E8re \u00E0 soupe",
    "tablespoons" to "cuill\u00E8res \u00E0 soupe",
    "teaspoon" to "cuill\u00E8re \u00E0 th\u00E9",
    "teaspoons" to "cuill\u00E8res \u00E0 th\u00E9",
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


