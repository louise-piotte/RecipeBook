package app.recipebook

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.lifecycleScope
import app.recipebook.data.local.recipes.ImportWarning
import app.recipebook.data.local.recipes.ImportWarningSeverity
import app.recipebook.data.local.recipes.ImportedRecipeDraft
import app.recipebook.data.local.recipes.RecipePhotoStore
import app.recipebook.data.local.recipes.RecipeLocalizationCoordinator
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.recipes.applyToRecipe
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.RecipeTimes
import app.recipebook.domain.model.Servings
import app.recipebook.ui.recipes.RecipeEditorScreen
import app.recipebook.ui.recipes.photosToDeleteForRecipeDeletion
import app.recipebook.ui.theme.RecipeBookTheme
import kotlinx.coroutines.launch

class RecipeEditorActivity : ComponentActivity() {

    private lateinit var photoStore: RecipePhotoStore
    private var draftPhotos: List<PhotoRef> = emptyList()
    private var didCommitChanges = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        keepScreenOnWhileInUse()
        WindowCompat.setDecorFitsSystemWindows(window, true)

        photoStore = RecipePhotoStore(this)

        val repository = RecipeRepositoryProvider.create(this)
        val localizationCoordinator = RecipeLocalizationCoordinator()
        val languageStore = AppLanguageStore(this)
        val recipeId = intent.getStringExtra(EXTRA_RECIPE_ID)
        val isNewRecipe = recipeId == null
        val importedDraft = importedDraftFromIntent(intent)
        val importLanguage = intent.getStringExtra(EXTRA_IMPORT_LANGUAGE)
            ?.let { runCatching { AppLanguage.valueOf(it) }.getOrNull() }
            ?: AppLanguage.EN

        setContent {
            RecipeBookTheme {
                val language by languageStore.language.collectAsState(initial = AppLanguage.EN)
                var recipe by remember { mutableStateOf<Recipe?>(null) }
                val recipes by repository.observeRecipes().collectAsState(initial = emptyList())
                val ingredientReferences by repository.observeIngredientReferences().collectAsState(initial = emptyList())
                val tags by repository.observeTags().collectAsState(initial = emptyList())
                val collections by repository.observeCollections().collectAsState(initial = emptyList<Collection>())

                LaunchedEffect(recipeId) {
                    repository.seedBundledLibraryIfMissing()
                    recipe = if (recipeId == null) {
                        val blankRecipe = repository.createBlankRecipe()
                        importedDraft?.applyToRecipe(blankRecipe, importLanguage) ?: blankRecipe
                    } else {
                        repository.getRecipeById(recipeId) ?: repository.createBlankRecipe()
                    }
                    draftPhotos = recipe?.photos.orEmpty()
                }

                recipe?.let { currentRecipe ->
                    RecipeEditorScreen(
                        initialRecipe = currentRecipe,
                        isNewRecipe = isNewRecipe,
                        recipes = recipes,
                        ingredientReferences = ingredientReferences,
                        tags = tags,
                        collections = collections,
                        importWarnings = importedDraft?.warnings.orEmpty(),
                        language = language,
                        onLanguageChange = { selected ->
                            lifecycleScope.launch { languageStore.setLanguage(selected) }
                        },
                        onBack = ::finish,
                        onSave = { updatedRecipe, authoritativeLanguage ->
                            lifecycleScope.launch {
                                val persistedPhotos = photoStore.persistRecipePhotos(updatedRecipe.id, updatedRecipe.photos)
                                val persistedMainPhotoId = persistedPhotos.firstOrNull { it.id == updatedRecipe.mainPhotoId }?.id
                                    ?: persistedPhotos.firstOrNull()?.id
                                val persistedRecipe = updatedRecipe.copy(
                                    mainPhotoId = persistedMainPhotoId,
                                    photos = persistedPhotos
                                )
                                val finalizedRecipe = localizationCoordinator.finalizeForSave(
                                    recipe = persistedRecipe,
                                    authoritativeLanguage = authoritativeLanguage
                                )
                                val removedPhotos = currentRecipe.photos.filter { oldPhoto ->
                                    persistedPhotos.none { it.id == oldPhoto.id }
                                }
                                repository.upsertRecipe(finalizedRecipe)
                                photoStore.deleteManagedPhotos(removedPhotos)
                                didCommitChanges = true
                                finish()
                            }
                        },
                        onRegenerateOtherLanguage = { draftRecipe, authoritativeLanguage ->
                            localizationCoordinator.regenerateOppositeLanguage(
                                recipe = draftRecipe,
                                authoritativeLanguage = authoritativeLanguage
                            )
                        },
                        onLocalizedTextEdited = { importMetadata, draftLanguages, authoritativeLanguage ->
                            localizationCoordinator.markActiveLanguageEdited(
                                importMetadata = importMetadata,
                                languages = draftLanguages,
                                authoritativeLanguage = authoritativeLanguage
                            )
                        },
                        onCreateIngredientReference = { draft -> repository.createIngredientReference(draft) },
                        onCreateTag = { draft -> repository.createTag(draft) },
                        onImportPhoto = { sourceUri -> photoStore.importDraftPhoto(sourceUri) },
                        onCreatePendingCameraCapture = { photoStore.createPendingCameraCapture() },
                        onFinalizePendingCameraCapture = { capture -> photoStore.finalizePendingCameraCapture(capture) },
                        onDiscardDraftPhoto = { photo -> photoStore.discardDraftPhoto(photo) },
                        onDraftPhotosChange = { photos, _ ->
                            draftPhotos = photos
                        },
                        onDelete = if (isNewRecipe) null else {
                            {
                                lifecycleScope.launch {
                                    photoStore.deleteManagedPhotos(photosToDeleteForRecipeDeletion(currentRecipe.photos, draftPhotos))
                                    repository.deleteRecipeById(currentRecipe.id)
                                    didCommitChanges = true
                                    finish()
                                }
                            }
                        }
                    )
                }
            }
        }
    }

    override fun onDestroy() {
        if (::photoStore.isInitialized && !didCommitChanges) {
            photoStore.cleanupDraftPhotos(draftPhotos)
        }
        super.onDestroy()
    }

    companion object {
        const val EXTRA_RECIPE_ID = "recipe_id"
        private const val EXTRA_IMPORT_LANGUAGE = "import_language"
        private const val EXTRA_IMPORTED_TITLE = "imported_title"
        private const val EXTRA_IMPORTED_DESCRIPTION = "imported_description"
        private const val EXTRA_IMPORTED_INGREDIENTS = "imported_ingredients"
        private const val EXTRA_IMPORTED_INSTRUCTIONS = "imported_instructions"
        private const val EXTRA_IMPORTED_NOTES = "imported_notes"
        private const val EXTRA_IMPORTED_SOURCE_NAME = "imported_source_name"
        private const val EXTRA_IMPORTED_SOURCE_URL = "imported_source_url"
        private const val EXTRA_IMPORTED_SERVINGS_AMOUNT = "imported_servings_amount"
        private const val EXTRA_IMPORTED_SERVINGS_UNIT = "imported_servings_unit"
        private const val EXTRA_IMPORTED_PREP_MINUTES = "imported_prep_minutes"
        private const val EXTRA_IMPORTED_COOK_MINUTES = "imported_cook_minutes"
        private const val EXTRA_IMPORTED_TOTAL_MINUTES = "imported_total_minutes"
        private const val EXTRA_IMPORTED_JOB_ID = "imported_job_id"
        private const val EXTRA_IMPORTED_WARNING_CODES = "imported_warning_codes"
        private const val EXTRA_IMPORTED_WARNING_SEVERITIES = "imported_warning_severities"
        private const val EXTRA_IMPORTED_WARNING_FIELDS = "imported_warning_fields"
        private const val EXTRA_IMPORTED_WARNING_EVIDENCE = "imported_warning_evidence"
        private const val EXTRA_IMPORTED_SOURCE_TYPE = "imported_source_type"
        private const val EXTRA_IMPORTED_PARSER_VERSION = "imported_parser_version"
        private const val EXTRA_IMPORTED_EXTRACTOR_VERSION = "imported_extractor_version"
        private const val EXTRA_IMPORTED_GENERATOR_LABEL = "imported_generator_label"
        private const val EXTRA_IMPORTED_ORIGINAL_UNITS = "imported_original_units"

        fun intentForImportedDraft(
            context: Context,
            draft: ImportedRecipeDraft,
            language: AppLanguage
        ): Intent = Intent(context, RecipeEditorActivity::class.java).apply {
            putExtra(EXTRA_IMPORT_LANGUAGE, language.name)
            putExtra(EXTRA_IMPORTED_TITLE, draft.title)
            putExtra(EXTRA_IMPORTED_DESCRIPTION, draft.description)
            putStringArrayListExtra(EXTRA_IMPORTED_INGREDIENTS, ArrayList(draft.ingredients))
            putExtra(EXTRA_IMPORTED_INSTRUCTIONS, draft.instructions)
            putExtra(EXTRA_IMPORTED_NOTES, draft.notes)
            putExtra(EXTRA_IMPORTED_SOURCE_NAME, draft.sourceName)
            putExtra(EXTRA_IMPORTED_SOURCE_URL, draft.sourceUrl)
            putExtra(EXTRA_IMPORTED_SERVINGS_AMOUNT, draft.servings?.amount)
            putExtra(EXTRA_IMPORTED_SERVINGS_UNIT, draft.servings?.unit)
            putExtra(EXTRA_IMPORTED_PREP_MINUTES, draft.times?.prepTimeMinutes)
            putExtra(EXTRA_IMPORTED_COOK_MINUTES, draft.times?.cookTimeMinutes)
            putExtra(EXTRA_IMPORTED_TOTAL_MINUTES, draft.times?.totalTimeMinutes)
            putExtra(EXTRA_IMPORTED_JOB_ID, draft.importJobId)
            putStringArrayListExtra(EXTRA_IMPORTED_WARNING_CODES, ArrayList(draft.warnings.map(ImportWarning::code)))
            putStringArrayListExtra(
                EXTRA_IMPORTED_WARNING_SEVERITIES,
                ArrayList(draft.warnings.map { it.severity.name })
            )
            putStringArrayListExtra(
                EXTRA_IMPORTED_WARNING_FIELDS,
                ArrayList(draft.warnings.map { it.field.orEmpty() })
            )
            putStringArrayListExtra(
                EXTRA_IMPORTED_WARNING_EVIDENCE,
                ArrayList(draft.warnings.map { it.sourceEvidence.orEmpty() })
            )
            putExtra(EXTRA_IMPORTED_SOURCE_TYPE, draft.importMetadata.sourceType)
            putExtra(EXTRA_IMPORTED_PARSER_VERSION, draft.importMetadata.parserVersion)
            putExtra(EXTRA_IMPORTED_EXTRACTOR_VERSION, draft.importMetadata.extractorVersion)
            putExtra(EXTRA_IMPORTED_GENERATOR_LABEL, draft.importMetadata.generatorLabel)
            putExtra(EXTRA_IMPORTED_ORIGINAL_UNITS, draft.importMetadata.originalUnits)
        }

        private fun importedDraftFromIntent(intent: Intent): ImportedRecipeDraft? {
            val title = intent.getStringExtra(EXTRA_IMPORTED_TITLE).orEmpty()
            val description = intent.getStringExtra(EXTRA_IMPORTED_DESCRIPTION).orEmpty()
            val ingredients = intent.getStringArrayListExtra(EXTRA_IMPORTED_INGREDIENTS).orEmpty()
            val instructions = intent.getStringExtra(EXTRA_IMPORTED_INSTRUCTIONS).orEmpty()
            val notes = intent.getStringExtra(EXTRA_IMPORTED_NOTES).orEmpty()
            val sourceName = intent.getStringExtra(EXTRA_IMPORTED_SOURCE_NAME).orEmpty()
            val sourceUrl = intent.getStringExtra(EXTRA_IMPORTED_SOURCE_URL).orEmpty()
            val warningCodes = intent.getStringArrayListExtra(EXTRA_IMPORTED_WARNING_CODES).orEmpty()
            val warningSeverities = intent.getStringArrayListExtra(EXTRA_IMPORTED_WARNING_SEVERITIES).orEmpty()
            val warningFields = intent.getStringArrayListExtra(EXTRA_IMPORTED_WARNING_FIELDS).orEmpty()
            val warningEvidence = intent.getStringArrayListExtra(EXTRA_IMPORTED_WARNING_EVIDENCE).orEmpty()
            val hasImportedContent = listOf(
                title,
                description,
                instructions,
                notes,
                sourceName,
                sourceUrl
            ).any { it.isNotBlank() } || ingredients.isNotEmpty() || warningCodes.isNotEmpty()
            if (!hasImportedContent) return null

            return ImportedRecipeDraft(
                title = title,
                description = description,
                ingredients = ingredients,
                instructions = instructions,
                notes = notes,
                sourceName = sourceName,
                sourceUrl = sourceUrl,
                servings = intent.takeIf { it.hasExtra(EXTRA_IMPORTED_SERVINGS_AMOUNT) }?.let {
                    Servings(
                        amount = it.getDoubleExtra(EXTRA_IMPORTED_SERVINGS_AMOUNT, 0.0),
                        unit = it.getStringExtra(EXTRA_IMPORTED_SERVINGS_UNIT)
                    )
                },
                times = RecipeTimes(
                    prepTimeMinutes = intent.getSerializableExtraCompat(EXTRA_IMPORTED_PREP_MINUTES),
                    cookTimeMinutes = intent.getSerializableExtraCompat(EXTRA_IMPORTED_COOK_MINUTES),
                    totalTimeMinutes = intent.getSerializableExtraCompat(EXTRA_IMPORTED_TOTAL_MINUTES)
                ).takeIf { it.prepTimeMinutes != null || it.cookTimeMinutes != null || it.totalTimeMinutes != null },
                importJobId = intent.getStringExtra(EXTRA_IMPORTED_JOB_ID),
                warnings = warningCodes.mapIndexed { index, code ->
                    ImportWarning(
                        code = code,
                        severity = warningSeverities.getOrNull(index)
                            ?.let { runCatching { ImportWarningSeverity.valueOf(it) }.getOrNull() }
                            ?: ImportWarningSeverity.INFO,
                        field = warningFields.getOrNull(index)?.ifBlank { null },
                        sourceEvidence = warningEvidence.getOrNull(index)?.ifBlank { null }
                    )
                },
                importMetadata = app.recipebook.domain.model.ImportMetadata(
                    sourceType = intent.getStringExtra(EXTRA_IMPORTED_SOURCE_TYPE),
                    parserVersion = intent.getStringExtra(EXTRA_IMPORTED_PARSER_VERSION),
                    extractorVersion = intent.getStringExtra(EXTRA_IMPORTED_EXTRACTOR_VERSION),
                    generatorLabel = intent.getStringExtra(EXTRA_IMPORTED_GENERATOR_LABEL),
                    originalUnits = intent.getStringExtra(EXTRA_IMPORTED_ORIGINAL_UNITS)
                )
            )
        }
    }
}

private fun Intent.getSerializableExtraCompat(key: String): Int? {
    if (!hasExtra(key)) return null
    return getIntExtra(key, 0)
}



