package app.recipebook

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
import app.recipebook.data.local.recipes.RecipePhotoStore
import app.recipebook.data.local.recipes.RecipeRepositoryProvider
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.Collection
import app.recipebook.domain.model.PhotoRef
import app.recipebook.domain.model.Recipe
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
        val languageStore = AppLanguageStore(this)
        val recipeId = intent.getStringExtra(EXTRA_RECIPE_ID)
        val isNewRecipe = recipeId == null

        setContent {
            RecipeBookTheme {
                val language by languageStore.language.collectAsState(initial = AppLanguage.EN)
                var recipe by remember { mutableStateOf<Recipe?>(null) }
                val ingredientReferences by repository.observeIngredientReferences().collectAsState(initial = emptyList())
                val tags by repository.observeTags().collectAsState(initial = emptyList())
                val collections by repository.observeCollections().collectAsState(initial = emptyList<Collection>())

                LaunchedEffect(recipeId) {
                    repository.seedBundledLibraryIfMissing()
                    recipe = if (recipeId == null) {
                        repository.createBlankRecipe()
                    } else {
                        repository.getRecipeById(recipeId) ?: repository.createBlankRecipe()
                    }
                    draftPhotos = recipe?.photos.orEmpty()
                }

                recipe?.let { currentRecipe ->
                    RecipeEditorScreen(
                        initialRecipe = currentRecipe,
                        isNewRecipe = isNewRecipe,
                        ingredientReferences = ingredientReferences,
                        tags = tags,
                        collections = collections,
                        language = language,
                        onLanguageChange = { selected ->
                            lifecycleScope.launch { languageStore.setLanguage(selected) }
                        },
                        onBack = ::finish,
                        onSave = { updatedRecipe ->
                            lifecycleScope.launch {
                                val persistedPhotos = photoStore.persistRecipePhotos(updatedRecipe.id, updatedRecipe.photos)
                                val persistedMainPhotoId = persistedPhotos.firstOrNull { it.id == updatedRecipe.mainPhotoId }?.id
                                    ?: persistedPhotos.firstOrNull()?.id
                                val persistedRecipe = updatedRecipe.copy(
                                    mainPhotoId = persistedMainPhotoId,
                                    photos = persistedPhotos
                                )
                                val removedPhotos = currentRecipe.photos.filter { oldPhoto ->
                                    persistedPhotos.none { it.id == oldPhoto.id }
                                }
                                repository.upsertRecipe(persistedRecipe)
                                photoStore.deleteManagedPhotos(removedPhotos)
                                didCommitChanges = true
                                finish()
                            }
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
    }
}



