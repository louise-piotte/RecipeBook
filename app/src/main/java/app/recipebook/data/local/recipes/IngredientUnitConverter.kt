package app.recipebook.data.local.recipes

import app.recipebook.domain.localization.normalizeIngredientUnit
import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.UnitDefinition
import kotlin.math.abs
import kotlin.math.max

private const val CONVERSION_RELATIVE_TOLERANCE = 5e-7

internal class IngredientUnitConversionGraph internal constructor(
    private val edges: Map<String, Map<String, Double>>,
    private val ambiguousPairs: Set<Pair<String, String>> = emptySet()
) {
    fun unitsConvertibleFrom(unit: String): Set<String> {
        val source = unit.normalizeIngredientUnit()
        return edges.keys.asSequence()
            .filter { target -> conversionFactor(source, target) != null }
            .toSet()
    }

    fun conversionFactor(fromUnit: String, toUnit: String): Double? {
        val source = fromUnit.normalizeIngredientUnit()
        val target = toUnit.normalizeIngredientUnit()
        if (source == target) return 1.0
        if (unitPairKey(source, target) in ambiguousPairs) return null

        val factors = mutableListOf<Double>()
        val visited = mutableSetOf(source)
        var exceededPathLimit = false

        fun visit(unit: String, factor: Double) {
            if (factors.size >= MAX_PATHS) {
                exceededPathLimit = true
                return
            }
            for ((neighbor, edgeFactor) in edges[unit].orEmpty()) {
                if (neighbor in visited) continue
                val nextFactor = factor * edgeFactor
                if (!nextFactor.isFinite() || nextFactor <= 0.0) continue
                if (neighbor == target) {
                    factors += nextFactor
                } else {
                    visited += neighbor
                    visit(neighbor, nextFactor)
                    visited -= neighbor
                }
                if (exceededPathLimit) return
            }
        }

        visit(source, 1.0)
        if (exceededPathLimit || factors.isEmpty()) return null
        val first = factors.first()
        return first.takeIf { candidate -> factors.all { areEquivalent(candidate, it) } }
    }

    companion object {
        private const val MAX_PATHS = 512
    }
}

internal fun buildIngredientUnitConversionGraph(
    ingredientReference: IngredientReference?,
    ingredientForm: IngredientForm? = null,
    units: List<UnitDefinition>
): IngredientUnitConversionGraph {
    val edges = mutableMapOf<String, MutableMap<String, Double>>()
    val ambiguousPairs = mutableSetOf<Pair<String, String>>()

    fun pairKey(from: String, to: String): Pair<String, String> =
        if (from <= to) from to to else to to from

    fun addEdge(fromUnit: String, toUnit: String, factor: Double) {
        val from = fromUnit.normalizeIngredientUnit()
        val to = toUnit.normalizeIngredientUnit()
        if (from.isBlank() || to.isBlank() || from == to || !factor.isFinite() || factor <= 0.0) return
        val pair = pairKey(from, to)
        if (pair in ambiguousPairs) return

        val previous = edges[from]?.get(to)
        val reverse = edges[to]?.get(from)
        if ((previous != null && !areEquivalent(previous, factor)) ||
            (reverse != null && !areEquivalent(reverse, 1.0 / factor))
        ) {
            edges[from]?.remove(to)
            edges[to]?.remove(from)
            ambiguousPairs += pair
            return
        }

        edges.getOrPut(from) { linkedMapOf() }[to] = factor
        edges.getOrPut(to) { linkedMapOf() }[from] = 1.0 / factor
    }

    units.forEach { definition ->
        val baseUnit = definition.baseUnitId?.normalizeIngredientUnit()
        val unit = definition.unitId.normalizeIngredientUnit()
        if (baseUnit != null && unit != baseUnit) {
            addEdge(unit, baseUnit, definition.toBaseFactor)
        }
    }
    ingredientReference?.unitMappings.orEmpty().forEach { mapping ->
        addEdge(mapping.fromUnit, mapping.toUnit, mapping.factor)
    }
    val density = when {
        ingredientForm != null -> ingredientForm.densityGPerMl
        else -> ingredientReference?.defaultDensity
    }
    density?.takeIf { it.isFinite() && it > 0.0 }?.let { addEdge("ml", "g", it) }

    val validEdges = edges.mapValues { (from, neighbors) ->
        neighbors.filterKeys { neighbor -> pairKey(from, neighbor) !in ambiguousPairs }
    }
    return IngredientUnitConversionGraph(validEdges, ambiguousPairs)
}

private fun areEquivalent(left: Double, right: Double): Boolean =
    abs(left - right) <= max(abs(left), abs(right)) * CONVERSION_RELATIVE_TOLERANCE

private fun unitPairKey(from: String, to: String): Pair<String, String> =
    if (from <= to) from to to else to to from
