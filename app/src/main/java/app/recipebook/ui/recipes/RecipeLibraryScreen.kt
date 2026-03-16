package app.recipebook.ui.recipes

import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import app.recipebook.R
import app.recipebook.RecipeDetailActivity
import app.recipebook.RecipeEditorActivity
import app.recipebook.data.local.recipes.RecipeRepository
import app.recipebook.domain.localization.BilingualText
import app.recipebook.domain.localization.BilingualTextResolver
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.Recipe
import java.util.Locale

@Composable
fun RecipeLibraryScreen(
    repository: RecipeRepository,
    modifier: Modifier = Modifier
) {
    var language by rememberSaveable { mutableStateOf(AppLanguage.EN) }
    var searchQuery by rememberSaveable { mutableStateOf("") }
    val recipes by repository.observeRecipes().collectAsState(initial = emptyList())
    val resolver = remember { BilingualTextResolver() }
    val context = LocalContext.current

    LaunchedEffect(repository) {
        repository.seedBundledLibraryIfMissing()
    }

    val filteredRecipes = remember(recipes, searchQuery) {
        val trimmedQuery = searchQuery.trim()
        if (trimmedQuery.isEmpty()) {
            recipes
        } else {
            recipes.filter { recipe ->
                listOf(
                    recipe.languages.fr.title,
                    recipe.languages.en.title,
                    recipe.languages.fr.description,
                    recipe.languages.en.description
                ).any { value -> value.contains(trimmedQuery, ignoreCase = true) }
            }
        }
    }

    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = localizedString(R.string.recipe_library_title, language),
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = localizedString(R.string.recipe_library_subtitle, language),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                LanguageChip(
                    label = localizedString(R.string.language_en, language),
                    onClick = { language = AppLanguage.EN }
                )
                LanguageChip(
                    label = localizedString(R.string.language_fr, language),
                    onClick = { language = AppLanguage.FR }
                )
                LanguageChip(
                    label = localizedString(R.string.add_recipe_label, language),
                    onClick = {
                        context.startActivity(Intent(context, RecipeEditorActivity::class.java))
                    }
                )
            }

            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(localizedString(R.string.search_label, language)) },
                placeholder = { Text(localizedString(R.string.search_placeholder, language)) },
                singleLine = true,
                shape = RoundedCornerShape(18.dp)
            )

            SectionHeader(
                title = localizedString(R.string.library_section_title, language),
                trailing = localizedString(R.string.recipe_count, language, filteredRecipes.size)
            )

            if (filteredRecipes.isEmpty()) {
                EmptyLibraryCard(language = language)
            } else {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    filteredRecipes.forEach { recipe ->
                        RecipeListCard(
                            recipe = recipe,
                            language = language,
                            resolver = resolver,
                            onClick = {
                                context.startActivity(
                                    Intent(context, RecipeDetailActivity::class.java)
                                        .putExtra(RecipeDetailActivity.EXTRA_RECIPE_ID, recipe.id)
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun LanguageChip(
    label: String,
    onClick: () -> Unit
) {
    AssistChip(
        onClick = onClick,
        label = { Text(label) }
    )
}

@Composable
private fun SectionHeader(
    title: String,
    trailing: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = title, style = MaterialTheme.typography.titleLarge)
        Text(
            text = trailing,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
private fun RecipeListCard(
    recipe: Recipe,
    language: AppLanguage,
    resolver: BilingualTextResolver,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
    ) {
        Surface(color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.45f)) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = resolver.resolveSystemText(language, recipe.titleText()),
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = resolver.resolveSystemText(language, recipe.descriptionText()),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                recipe.times?.totalTimeMinutes?.let { totalTime ->
                    Text(
                        text = localizedString(R.string.total_time_value, language, totalTime),
                        style = MaterialTheme.typography.labelLarge
                    )
                }
                Text(
                    text = localizedString(R.string.open_recipe_detail, language),
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
private fun EmptyLibraryCard(language: AppLanguage) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = localizedString(R.string.empty_results, language),
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

internal fun Recipe.titleText(): BilingualText = BilingualText(
    fr = languages.fr.title,
    en = languages.en.title
)

internal fun Recipe.descriptionText(): BilingualText = BilingualText(
    fr = languages.fr.description,
    en = languages.en.description
)

internal fun formatNumber(value: Double): String = if (value % 1.0 == 0.0) {
    value.toInt().toString()
} else {
    value.toString()
}

@Composable
internal fun localizedString(
    resId: Int,
    language: AppLanguage,
    vararg formatArgs: Any
): String {
    val context = LocalContext.current
    val locale = when (language) {
        AppLanguage.FR -> Locale.CANADA_FRENCH
        AppLanguage.EN -> Locale.CANADA
    }
    val config = Configuration(context.resources.configuration)
    config.setLocale(locale)
    val localizedContext = context.createConfigurationContext(config)
    return localizedContext.resources.getString(resId, *formatArgs)
}


