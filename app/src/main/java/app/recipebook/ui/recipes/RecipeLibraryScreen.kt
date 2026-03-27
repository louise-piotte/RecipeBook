package app.recipebook.ui.recipes

import android.content.Intent
import android.content.res.Configuration
import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import app.recipebook.IngredientTagManagerActivity
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
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    modifier: Modifier = Modifier
) {
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

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            RecipeBookTopBar(
                title = localizedString(R.string.menu_recipe_library_label, language),
                language = language,
                onLanguageChange = onLanguageChange,
                onNavigate = { destination ->
                    when (destination) {
                        MainMenuDestination.Library -> Unit
                        MainMenuDestination.Ingredients -> {
                            context.startActivity(
                                IngredientTagManagerActivity.intentForSection(
                                    context = context,
                                    section = LibraryManagerSection.Ingredients
                                )
                            )
                        }

                        MainMenuDestination.Tags -> {
                            context.startActivity(
                                IngredientTagManagerActivity.intentForSection(
                                    context = context,
                                    section = LibraryManagerSection.Tags
                                )
                            )
                        }
                    }
                }
            ) {
                AppIconButton(
                    icon = Icons.Filled.Add,
                    contentDescription = localizedString(R.string.add_recipe_label, language),
                    onClick = { context.startActivity(Intent(context, RecipeEditorActivity::class.java)) }
                )
            }
        },
        bottomBar = {
            BottomSearchBar {
                SearchField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    label = localizedString(R.string.search_label, language),
                    placeholder = localizedString(R.string.search_placeholder, language)
                )
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            if (filteredRecipes.isEmpty()) {
                item {
                    EmptyLibraryCard(language = language)
                }
            } else {
                items(filteredRecipes, key = { it.id }) { recipe ->
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

@Composable
internal fun SearchField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String? = null,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        label = { Text(label) },
        placeholder = placeholder?.let { { Text(it) } },
        leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
        singleLine = true,
        shape = RoundedCornerShape(18.dp)
    )
}

@Composable
internal fun BottomSearchBar(
    useNavigationBarPadding: Boolean = true,
    content: @Composable () -> Unit
) {
    Surface(tonalElevation = 3.dp) {
        val barModifier = if (useNavigationBarPadding) {
            Modifier.navigationBarsPadding()
        } else {
            Modifier
        }
        Column(
            modifier = barModifier
                .fillMaxWidth()
                .imePadding()
                .padding(horizontal = 4.dp, vertical = 4.dp)
        ) {
            content()
        }
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
            .height(68.dp)
            .clickable(onClick = onClick)
    ) {
        Surface(color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.45f)) {
            Row(modifier = Modifier.fillMaxSize()) {
                RecipePhoto(
                    localPath = recipe.mainPhoto()?.localPath,
                    contentDescription = localizedString(R.string.recipe_photo_label, language),
                    modifier = Modifier
                        .fillMaxHeight()
                        .aspectRatio(1f)
                )
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(horizontal = 8.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = resolver.resolveSystemText(language, recipe.titleText()),
                        style = MaterialTheme.typography.titleLarge,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Composable
private fun EmptyLibraryCard(language: AppLanguage) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = localizedString(R.string.empty_results, language),
            modifier = Modifier.padding(6.dp),
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

enum class LibraryManagerSection {
    Ingredients,
    Tags
}

internal enum class MainMenuDestination(@StringRes val labelResId: Int) {
    Library(R.string.menu_recipe_library_label),
    Ingredients(R.string.menu_ingredients_label),
    Tags(R.string.menu_tags_label)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun RecipeBookTopBar(
    title: String,
    language: AppLanguage,
    onLanguageChange: (AppLanguage) -> Unit,
    onNavigate: (MainMenuDestination) -> Unit,
    disabledDestinations: Set<MainMenuDestination> = emptySet(),
    navigationIcon: (@Composable () -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {}
) {
    var menuExpanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = { Text(title) },
        navigationIcon = { navigationIcon?.invoke() },
        actions = {
            actions()
            AppIconButton(
                icon = Icons.Filled.Menu,
                contentDescription = localizedString(R.string.menu_label, language),
                onClick = { menuExpanded = true }
            )
            DropdownMenu(
                expanded = menuExpanded,
                onDismissRequest = { menuExpanded = false }
            ) {
                MainMenuDestination.entries.forEach { destination ->
                    DropdownMenuItem(
                        text = { Text(localizedString(destination.labelResId, language)) },
                        enabled = destination !in disabledDestinations,
                        onClick = {
                            menuExpanded = false
                            onNavigate(destination)
                        }
                    )
                }
                HorizontalDivider()
                DropdownMenuItem(
                    text = { Text(localizedString(R.string.language_option_en_label, language)) },
                    leadingIcon = { Icon(Icons.Filled.Language, contentDescription = null) },
                    onClick = {
                        menuExpanded = false
                        onLanguageChange(AppLanguage.EN)
                    }
                )
                DropdownMenuItem(
                    text = { Text(localizedString(R.string.language_option_fr_label, language)) },
                    leadingIcon = { Icon(Icons.Filled.Language, contentDescription = null) },
                    onClick = {
                        menuExpanded = false
                        onLanguageChange(AppLanguage.FR)
                    }
                )
            }
        }
    )
}

@Composable
internal fun AppIconButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit
) {
    IconButton(onClick = onClick) {
        Icon(imageVector = icon, contentDescription = contentDescription)
    }
}

@Composable
internal fun BackIconButton(
    contentDescription: String,
    onClick: () -> Unit
) {
    AppIconButton(
        icon = Icons.AutoMirrored.Filled.ArrowBack,
        contentDescription = contentDescription,
        onClick = onClick
    )
}

@Composable
internal fun EditIconButton(
    contentDescription: String,
    onClick: () -> Unit
) {
    AppIconButton(
        icon = Icons.Filled.Edit,
        contentDescription = contentDescription,
        onClick = onClick
    )
}

















