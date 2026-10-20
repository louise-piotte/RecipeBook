package app.recipebook.data.local.recipes

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import app.recipebook.domain.localization.IngredientReferenceSearchIndex
import app.recipebook.domain.model.BilingualText
import app.recipebook.domain.model.ContextualSubstitutionRule
import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientLine
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.LocalizedSystemText
import app.recipebook.domain.model.Recipe
import app.recipebook.domain.model.SubstitutionConfidence
import app.recipebook.domain.model.SubstitutionConversionType
import app.recipebook.domain.model.SubstitutionRiskLevel
import app.recipebook.domain.model.SubstitutionRule
import app.recipebook.domain.model.UnitScope
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.system.measureNanoTime

/** Device-side stress profile for the catalog search and per-recipe substitution paths. */
@RunWith(AndroidJUnit4::class)
class CatalogScaleBenchmarkTest {
    @Test
    fun reportsExpandedCatalogSearchAndRecipeResolutionCosts() {
        val references = (0 until REFERENCE_COUNT).map { index ->
            val suffix = index.toString().padStart(5, '0')
            IngredientReference(
                id = "benchmark-ingredient-$suffix",
                nameFr = "aliment de la famille $suffix",
                nameEn = "ingredient family $suffix",
                category = IngredientCategory.OTHER,
                aliasesFr = listOf("terme culinaire $suffix"),
                aliasesEn = listOf("recipe alias $suffix"),
                updatedAt = BENCHMARK_TIMESTAMP
            )
        }
        val forms = (0 until FORM_COUNT).map { index ->
            val suffix = index.toString().padStart(5, '0')
            IngredientForm(
                id = "benchmark-form-$suffix",
                ingredientRefId = references[index].id,
                formCode = "prepared",
                labelFr = "forme préparée $suffix",
                labelEn = "prepared form $suffix",
                matchTermsFr = listOf("terme de forme $suffix"),
                matchTermsEn = listOf("recipe form $suffix"),
                updatedAt = BENCHMARK_TIMESTAMP
            )
        }
        val substitutionRules = (0 until RULE_COUNT).map { index ->
            SubstitutionRule(
                id = "benchmark-rule-$index",
                fromFormId = "benchmark-unmatched-form-$index",
                toFormId = forms[index % forms.size].id,
                conversionType = SubstitutionConversionType.RATIO,
                ratio = 1.0,
                sourceUnitScope = UnitScope.MASS,
                targetUnitScope = UnitScope.MASS,
                confidence = SubstitutionConfidence.TESTED,
                riskLevel = SubstitutionRiskLevel.SAFE,
                roundingPolicy = "none",
                updatedAt = BENCHMARK_TIMESTAMP
            )
        }
        val contextualRules = (0 until RULE_COUNT).map { index ->
            ContextualSubstitutionRule(
                id = "benchmark-context-rule-$index",
                fromIngredientRefId = references[index % references.size].id,
                toIngredientRefId = references[(index + 1) % references.size].id,
                conversionType = SubstitutionConversionType.RATIO,
                ratio = 1.0,
                allowedDishTypes = listOf("benchmark dish"),
                confidence = SubstitutionConfidence.TESTED,
                riskLevel = SubstitutionRiskLevel.SAFE,
                updatedAt = BENCHMARK_TIMESTAMP
            )
        }
        val catalog = IngredientSubstitutionCatalog(
            ingredientForms = forms,
            substitutionRules = substitutionRules,
            contextualSubstitutionRules = contextualRules
        )
        val searchCases = listOf(
            "recipe alias 09999" to references.last().id,
            "recipe form 04999" to references[FORM_COUNT - 1].id
        )
        val partialSearchQuery = "cipe alias 09999"
        lateinit var searchIndex: IngredientReferenceSearchIndex
        val searchIndexBuildNanos = measureNanoTime {
            searchIndex = IngredientReferenceSearchIndex(references, forms)
        }

        searchCases.forEach { (query, expectedId) ->
            assertEquals(
                expectedId,
                searchIndex.filter(query).single().id
            )
        }

        repeat(WARMUP_SEARCHES) { index ->
            val query = searchCases[index % searchCases.size].first
            searchIndex.filter(query)
        }
        repeat(WARMUP_SEARCHES) { searchIndex.filter(partialSearchQuery) }
        val phraseSearchSamplesNanos = mutableListOf<Long>()
        repeat(MEASURED_SEARCHES) { index ->
            val query = searchCases[index % searchCases.size].first
            lateinit var result: List<IngredientReference>
            phraseSearchSamplesNanos += measureNanoTime {
                result = searchIndex.filter(query)
            }
            assertEquals(1, result.size)
        }
        val partialSearchSamplesNanos = mutableListOf<Long>()
        repeat(MEASURED_SEARCHES) {
            lateinit var result: List<IngredientReference>
            partialSearchSamplesNanos += measureNanoTime {
                result = searchIndex.filter(partialSearchQuery)
            }
            assertEquals(references.last().id, result.single().id)
        }

        val referenceMapSamplesNanos = mutableListOf<Long>()
        repeat(WARMUP_MAPS) {
            references.associateBy(IngredientReference::id)
        }
        repeat(MEASURED_MAPS) {
            referenceMapSamplesNanos += measureNanoTime {
                references.associateBy(IngredientReference::id)
            }
        }

        val recipeLines = (0 until DETAIL_LINE_COUNT).map { index ->
            IngredientLine(
                id = "benchmark-line-$index",
                ingredientRefId = references[index].id,
                ingredientFormId = forms[index].id,
                originalText = "1 benchmark unit ingredient $index",
                quantity = 1.0,
                unit = "benchmark-unit",
                ingredientName = references[index].nameEn
            )
        }
        val recipe = Recipe(
            id = "benchmark-recipe",
            createdAt = BENCHMARK_TIMESTAMP,
            updatedAt = BENCHMARK_TIMESTAMP,
            languages = BilingualText(
                fr = LocalizedSystemText("Recette témoin", "", "", ""),
                en = LocalizedSystemText("Benchmark recipe", "", "", "")
            ),
            ingredients = recipeLines
        )
        lateinit var substitutionResolver: IngredientSubstitutionResolver
        val resolverIndexBuildNanos = measureNanoTime {
            substitutionResolver = IngredientSubstitutionResolver(
                recipe = recipe,
                tags = emptyList(),
                ingredientReferences = references,
                catalog = catalog
            )
        }
        lateinit var suggestions: List<List<IngredientSubstitutionSuggestion>>
        val detailResolutionNanos = measureNanoTime {
            suggestions = recipeLines.map(substitutionResolver::resolve)
        }
        assertEquals(DETAIL_LINE_COUNT, suggestions.size)
        assertTrue(suggestions.all(List<IngredientSubstitutionSuggestion>::isEmpty))

        Log.i(
            TAG,
                "profile=10k_references_5k_forms_10k_each_rule_type_40_lines " +
                "search_index_build_ms=${nanosToMillis(searchIndexBuildNanos)} " +
                "phrase_search_ms_mean=${meanMillis(phraseSearchSamplesNanos)} " +
                "phrase_search_ms_p95=${percentileMillis(phraseSearchSamplesNanos, 0.95)} " +
                "partial_search_ms_mean=${meanMillis(partialSearchSamplesNanos)} " +
                "partial_search_ms_p95=${percentileMillis(partialSearchSamplesNanos, 0.95)} " +
                "reference_map_ms_mean=${meanMillis(referenceMapSamplesNanos)} " +
                "resolver_index_build_ms=${nanosToMillis(resolverIndexBuildNanos)} " +
                "detail_resolve_40_lines_ms=${nanosToMillis(detailResolutionNanos)}"
        )
    }

    private fun meanMillis(samplesNanos: List<Long>): Double =
        samplesNanos.average() / NANOS_PER_MILLISECOND

    private fun percentileMillis(samplesNanos: List<Long>, percentile: Double): Double {
        val sorted = samplesNanos.sorted()
        val index = ((sorted.size - 1) * percentile).toInt().coerceIn(sorted.indices)
        return sorted[index] / NANOS_PER_MILLISECOND
    }

    private fun nanosToMillis(nanos: Long): Double = nanos / NANOS_PER_MILLISECOND

    private companion object {
        const val REFERENCE_COUNT = 10_000
        const val FORM_COUNT = 5_000
        const val RULE_COUNT = 10_000
        const val DETAIL_LINE_COUNT = 40
        const val WARMUP_SEARCHES = 4
        const val MEASURED_SEARCHES = 20
        const val WARMUP_MAPS = 2
        const val MEASURED_MAPS = 10
        const val BENCHMARK_TIMESTAMP = "2026-10-06T00:00:00Z"
        const val NANOS_PER_MILLISECOND = 1_000_000.0
        const val TAG = "CatalogScaleBenchmark"
    }
}
