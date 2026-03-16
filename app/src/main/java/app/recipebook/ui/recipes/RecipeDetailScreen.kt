package app.recipebook.ui.recipes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
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
    onBack: () -> Unit,
    onEdit: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var language by rememberSaveable { mutableStateOf(AppLanguage.EN) }
    val resolver = BilingualTextResolver()
    val placeholders = MissingTextPlaceholders(
        missingInFrench = localizedString(R.string.placeholder_missing_fr, AppLanguage.FR),
        missingInEnglish = localizedString(R.string.placeholder_missing_en, AppLanguage.EN)
    )

    Scaffold(modifier = modifier) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                AssistChip(onClick = onBack, label = { Text(localizedString(R.string.back_label, language)) })
                AssistChip(onClick = { language = AppLanguage.EN }, label = { Text(localizedString(R.string.language_en, language)) })
                AssistChip(onClick = { language = AppLanguage.FR }, label = { Text(localizedString(R.string.language_fr, language)) })
                if (recipe != null) {
                    AssistChip(onClick = { onEdit(recipe.id) }, label = { Text(localizedString(R.string.edit_recipe_label, language)) })
                }
            }

            Text(
                text = localizedString(R.string.detail_section_title, language),
                style = MaterialTheme.typography.headlineMedium
            )

            if (recipe == null) {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = localizedString(R.string.recipe_not_found, language),
                        modifier = Modifier.padding(16.dp),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
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
    val resolvedTags = recipe.tagIds.mapNotNull { tagId -> tags.firstOrNull { it.id == tagId } }
    val userNotes = resolver.resolveUserText(
        language = language,
        valueFr = recipe.userNotes?.fr,
        valueEn = recipe.userNotes?.en,
        placeholders = placeholders
    )
    val instructions = parseTextEntries(resolver.resolveSystemText(language, recipe.instructionsText()))
    val ingredients = recipe.ingredients.map { ingredient ->
        val ingredientReference = ingredient.ingredientRefId?.let(ingredientReferenceMap::get)
        buildDetailIngredientText(ingredient, ingredientReference, language)
    }.filter { it.isNotEmpty() }

    Card(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(16.dp),
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
                    MetaChip(
                        text = if (servings.unit.isNullOrBlank()) {
                            localizedString(R.string.servings_value_plain, language, formatNumber(servings.amount))
                        } else {
                            localizedString(R.string.servings_value_with_unit, language, formatNumber(servings.amount), servings.unit)
                        }
                    )
                }
                recipe.times?.prepTimeMinutes?.let { prep -> MetaChip(text = localizedString(R.string.prep_time_value, language, prep)) }
                recipe.times?.cookTimeMinutes?.let { cook -> MetaChip(text = localizedString(R.string.cook_time_value, language, cook)) }
                recipe.times?.totalTimeMinutes?.let { total -> MetaChip(text = localizedString(R.string.total_time_value, language, total)) }
                recipe.ratings?.userRating?.let { rating -> MetaChip(text = localizedString(R.string.rating_value, language, rating)) }
            }

            if (resolvedTags.isNotEmpty()) {
                DetailSection(localizedString(R.string.tags_label, language)) {
                    resolvedTags.forEach { tag ->
                        MetaChip(text = tag.localizedName(language))
                    }
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

            DetailSection(localizedString(R.string.system_notes_label, language)) {
                Text(text = resolver.resolveSystemText(language, recipe.systemNotesText()))
            }

            DetailSection(localizedString(R.string.user_notes_label, language)) {
                Text(
                    text = userNotes.text,
                    fontStyle = if (userNotes.isPlaceholder) FontStyle.Italic else FontStyle.Normal
                )
            }

            recipe.source?.let { source ->
                DetailSection(localizedString(R.string.source_label, language)) {
                    Text(text = source.sourceName)
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = source.sourceUrl, color = MaterialTheme.colorScheme.primary, style = MaterialTheme.typography.bodyMedium)
                }
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

@Composable
private fun MetaChip(text: String) {
    Surface(
        color = MaterialTheme.colorScheme.tertiaryContainer,
        shape = MaterialTheme.shapes.large
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            style = MaterialTheme.typography.labelLarge
        )
    }
}

internal fun Recipe.instructionsText(): BilingualText = BilingualText(
    fr = languages.fr.instructions,
    en = languages.en.instructions
)

internal fun Recipe.systemNotesText(): BilingualText = BilingualText(
    fr = languages.fr.notesSystem,
    en = languages.en.notesSystem
)

internal fun buildDetailIngredientText(
    ingredient: app.recipebook.domain.model.IngredientLine,
    ingredientReference: IngredientReference?,
    language: AppLanguage
): String {
    val ingredientName = ingredientReference?.localizedName(language)
        ?.ifBlank { ingredient.ingredientName }
        ?: ingredient.ingredientName
    val base = listOfNotNull(
        ingredient.quantity?.let(::formatNumber),
        ingredient.unit,
        ingredientName.ifBlank { null }
    ).joinToString(" ")
    val withPreparation = if (ingredient.preparation.isNullOrBlank()) base else "$base, ${ingredient.preparation}"
    val withNotes = if (ingredient.notes.isNullOrBlank()) withPreparation else "$withPreparation (${ingredient.notes})"
    return withNotes.ifBlank { ingredient.originalText.trim() }
}

private fun IngredientReference.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

private fun Tag.localizedName(language: AppLanguage): String = when (language) {
    AppLanguage.FR -> nameFr.ifBlank { nameEn }
    AppLanguage.EN -> nameEn.ifBlank { nameFr }
}

