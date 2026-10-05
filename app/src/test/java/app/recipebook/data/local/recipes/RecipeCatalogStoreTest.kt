package app.recipebook.data.local.recipes

import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.UnitDefinition
import app.recipebook.domain.model.UnitType
import app.recipebook.domain.model.SubstitutionRule
import app.recipebook.domain.model.SubstitutionConversionType
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.UnitScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class RecipeCatalogStoreTest {
    @get:Rule val temp = TemporaryFolder()

    @Test fun catalogSurvivesStoreRecreationAndExplicitEmptyCatalogIsRetained() = runBlocking {
        val file = temp.newFile("catalog.preferences_pb")
        file.delete()
        val catalog = StoredRecipeCatalog(
            ingredientForms = listOf(IngredientForm("form-imported", "ref-flour", "dry", "Sec", "Dry", updatedAt = "now")),
            substitutionRules = listOf(SubstitutionRule("rule", "form-imported", "form-cooked", SubstitutionConversionType.RATIO,
                ratio = 2.0, sourceUnitScope = UnitScope.MASS, targetUnitScope = UnitScope.MASS,
                confidence = SubstitutionConfidence.TESTED, riskLevel = SubstitutionRiskLevel.CAUTION,
                roundingPolicy = "none", warningTextFr = "Vérifier", warningTextEn = "Check", updatedAt = "now")),
            units = listOf(UnitDefinition("g", "g", "gramme", "gram", UnitType.MASS, toBaseFactor = 1.0))
        )
        val firstJob = SupervisorJob()
        val first = PersistentRecipeCatalogStore(PreferenceDataStoreFactory.create(scope = CoroutineScope(Dispatchers.IO + firstJob)) { file })
        first.replace(catalog)
        firstJob.cancel(); firstJob.join()
        val nextJob = SupervisorJob()
        try {
            val reopened = PersistentRecipeCatalogStore(PreferenceDataStoreFactory.create(scope = CoroutineScope(Dispatchers.IO + nextJob)) { file })
            assertEquals(catalog, reopened.catalog.first())
            reopened.replace(StoredRecipeCatalog())
            assertEquals(StoredRecipeCatalog(), reopened.catalog.first())
        } finally { nextJob.cancel(); nextJob.join() }
    }
}
