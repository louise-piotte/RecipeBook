package app.recipebook.data.local.recipes

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import app.recipebook.data.schema.*
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.PackageYieldObservation
import app.recipebook.domain.model.SubstitutionRule
import app.recipebook.domain.model.UnitDefinition
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

internal data class StoredRecipeCatalog(
    val ingredientForms: List<IngredientForm> = emptyList(),
    val substitutionRules: List<SubstitutionRule> = emptyList(),
    val units: List<UnitDefinition> = emptyList(),
    val packageYields: List<PackageYieldObservation> = emptyList()
)

internal interface RecipeCatalogStore {
    val catalog: Flow<StoredRecipeCatalog?>
    suspend fun replace(catalog: StoredRecipeCatalog?)
}

internal class InMemoryRecipeCatalogStore : RecipeCatalogStore {
    override val catalog = MutableStateFlow<StoredRecipeCatalog?>(null)
    override suspend fun replace(catalog: StoredRecipeCatalog?) { this.catalog.value = catalog }
}

private val Context.recipeCatalogDataStore by preferencesDataStore(name = "recipe_catalog")

internal class PersistentRecipeCatalogStore(private val store: DataStore<Preferences>) : RecipeCatalogStore {
    constructor(context: Context) : this(context.applicationContext.recipeCatalogDataStore)
    private val key = stringPreferencesKey("catalog")
    override val catalog = store.data.map { preferences ->
        preferences[key]?.let { encoded ->
            val dto = Json.decodeFromString<StoredRecipeCatalogDto>(encoded)
            StoredRecipeCatalog(dto.ingredientForms.map { it.toDomain() },
                dto.substitutionRules.map { it.toDomain() }, dto.units.map { it.toDomain() },
                dto.packageYields.map { it.toDomain() })
        }
    }
    override suspend fun replace(catalog: StoredRecipeCatalog?) {
        val encoded = catalog?.let {
            Json.encodeToString(StoredRecipeCatalogDto(it.ingredientForms.map { form -> form.toDto() },
                it.substitutionRules.map { rule -> rule.toDto() }, it.units.map { unit -> unit.toDto() },
                it.packageYields.map { yield -> yield.toDto() }))
        }
        store.edit { preferences ->
            if (encoded == null) preferences.remove(key) else preferences[key] = encoded
        }
    }
}

// Internal persistence of catalog parts; full-library interchange remains the canonical ZIP.
@Serializable
private data class StoredRecipeCatalogDto(
    val ingredientForms: List<IngredientFormDto>,
    val substitutionRules: List<SubstitutionRuleDto>,
    val units: List<UnitDefinitionDto>,
    val packageYields: List<PackageYieldObservationDto> = emptyList()
)
