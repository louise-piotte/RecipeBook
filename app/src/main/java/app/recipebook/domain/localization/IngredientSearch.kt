package app.recipebook.domain.localization

import app.recipebook.domain.model.IngredientForm
import app.recipebook.domain.model.IngredientReference
import java.text.Normalizer
import java.util.Locale

/** Search key used for bilingual ingredient names and aliases; display values remain unchanged. */
fun normalizeIngredientSearchKey(input: String): String {
    val compatibilityFolded = Normalizer.normalize(input.lowercase(Locale.ROOT), Normalizer.Form.NFKD)
        .replace("œ", "oe")
        .replace("æ", "ae")
        .replace("ß", "ss")
        .replace("&", " and ")
    val unaccented = compatibilityFolded.filterNot { character ->
        Character.getType(character) == Character.NON_SPACING_MARK.toInt() ||
            Character.getType(character) == Character.COMBINING_SPACING_MARK.toInt() ||
            Character.getType(character) == Character.ENCLOSING_MARK.toInt()
    }
    return NON_SEARCH_CHARACTERS.replace(unaccented, " ").trim().replace(MULTIPLE_SPACES, " ")
}

/** Prefer complete normalized word phrases across a result set, then fall back to partial matching. */
fun <T> filterByIngredientSearchQuery(
    items: List<T>,
    query: String,
    termsForItem: (T) -> Iterable<String>,
): List<T> {
    val normalizedQuery = normalizeIngredientSearchKey(query)
    if (normalizedQuery.isEmpty()) return items

    val queryWords = normalizedQuery.split(' ')
    val exactPhraseMatches = items.filter { item ->
        termsForItem(item).any { term ->
            normalizedWordsContainPhrase(normalizeIngredientSearchKey(term), queryWords)
        }
    }
    if (exactPhraseMatches.isNotEmpty()) return exactPhraseMatches

    return items.filter { item ->
        termsForItem(item).any { term ->
            normalizeIngredientSearchKey(term).contains(normalizedQuery)
        }
    }
}

/** Reusable immutable search index for repeated queries over one reference/form catalog snapshot. */
class IngredientReferenceSearchIndex(
    ingredientReferences: List<IngredientReference>,
    ingredientForms: List<IngredientForm> = emptyList()
) {
    private data class IndexedReference(
        val reference: IngredientReference,
        val normalizedTerms: List<String>
    )

    private val entries: List<IndexedReference>
    private val exactFormEntryIndices: Map<String, IntArray>
    private val wordTokenEntryIndices: Map<String, IntArray>
    private val formHintsByReferenceAndTerm: Map<String, Map<String, List<IngredientForm>>>

    init {
        val formsByReference = ingredientForms.groupBy(IngredientForm::ingredientRefId)
        val entryBuilder = ArrayList<IndexedReference>(ingredientReferences.size)
        val exactFormIndicesBuilder = hashMapOf<String, MutableList<Int>>()
        val wordTokenIndicesBuilder = hashMapOf<String, MutableList<Int>>()
        val formHintsBuilder = hashMapOf<String, MutableMap<String, MutableList<IngredientForm>>>()

        ingredientReferences.forEachIndexed { entryIndex, reference ->
            val terms = linkedSetOf<String>()
            reference.searchTerms().forEach { term ->
                normalizeIngredientSearchKey(term).takeIf(String::isNotEmpty)?.let(terms::add)
            }
            val exactFormTermsForReference = hashSetOf<String>()
            val formTermsForReference = formHintsBuilder.getOrPut(reference.id) { hashMapOf() }
            val seenFormTermIds = hashSetOf<Pair<String, String>>()
            formsByReference[reference.id].orEmpty().forEach { form ->
                form.searchTerms().forEach { term ->
                    val normalizedTerm = normalizeIngredientSearchKey(term)
                    if (normalizedTerm.isNotEmpty()) {
                        terms += normalizedTerm
                        val matchingForms = formTermsForReference.getOrPut(normalizedTerm) { mutableListOf() }
                        if (seenFormTermIds.add(normalizedTerm to form.id)) matchingForms += form
                        exactFormTermsForReference += normalizedTerm
                    }
                }
            }
            val normalizedTerms = terms.toList()
            entryBuilder += IndexedReference(reference, normalizedTerms)

            exactFormTermsForReference.forEach { normalizedTerm ->
                exactFormIndicesBuilder.getOrPut(normalizedTerm) { mutableListOf() } += entryIndex
            }
            val wordTokensForReference = hashSetOf<String>()
            normalizedTerms.forEach { term ->
                term.split(' ').forEach { token ->
                    wordTokensForReference += token
                }
            }
            wordTokensForReference.forEach { token ->
                wordTokenIndicesBuilder.getOrPut(token) { mutableListOf() } += entryIndex
            }
        }

        entries = entryBuilder
        exactFormEntryIndices = exactFormIndicesBuilder.mapValues { (_, indices) -> indices.toIntArray() }
        wordTokenEntryIndices = wordTokenIndicesBuilder.mapValues { (_, indices) -> indices.toIntArray() }
        formHintsByReferenceAndTerm = formHintsBuilder.mapValues { (_, terms) ->
            terms.mapValues { (_, forms) -> forms.toList() }
        }
    }

    fun filter(query: String): List<IngredientReference> = filterNormalized(
        normalizedQuery = normalizeIngredientSearchKey(query)
    )

    fun filterNormalized(normalizedQuery: String): List<IngredientReference> {
        if (normalizedQuery.isEmpty()) return entries.map(IndexedReference::reference)

        exactFormEntryIndices[normalizedQuery]?.let { entryIndices ->
            return entryIndices.map { entries[it].reference }
        }

        val queryWords = normalizedQuery.split(' ')
        val exactPhraseMatches = candidateEntryIndices(queryWords, wordTokenEntryIndices)
            .asSequence()
            .map(entries::get)
            .filter { entry ->
                entry.normalizedTerms.any { term -> normalizedWordsContainPhrase(term, queryWords) }
            }
            .map(IndexedReference::reference)
            .toList()
        if (exactPhraseMatches.isNotEmpty()) {
            return exactPhraseMatches
        }

        return entries.asSequence()
            .filter { entry -> entry.normalizedTerms.any { it.contains(normalizedQuery) } }
            .map(IndexedReference::reference)
            .toList()
    }

    fun matchFormHint(ingredientReferenceId: String, query: String): IngredientForm? =
        matchFormHintNormalized(ingredientReferenceId, normalizeIngredientSearchKey(query))

    fun matchFormHintNormalized(ingredientReferenceId: String, normalizedQuery: String): IngredientForm? {
        if (normalizedQuery.isEmpty()) return null
        return formHintsByReferenceAndTerm[ingredientReferenceId]?.get(normalizedQuery)?.singleOrNull()
    }

    private fun candidateEntryIndices(
        keys: List<String>,
        index: Map<String, IntArray>
    ): IntArray {
        if (keys.isEmpty()) return IntArray(0)
        val postings = keys.distinct().map { key -> index[key] ?: return IntArray(0) }
        val smallestPosting = postings.minByOrNull(IntArray::size) ?: return IntArray(0)
        return smallestPosting.filter { entryIndex ->
            postings.all { posting -> posting.binarySearch(entryIndex) >= 0 }
        }.toIntArray()
    }
}

/** Search ingredient aliases and their attached forms without turning forms into ingredient identities. */
fun filterIngredientReferencesWithForms(
    ingredientReferences: List<IngredientReference>,
    ingredientForms: List<IngredientForm>,
    query: String
): List<IngredientReference> = IngredientReferenceSearchIndex(ingredientReferences, ingredientForms).filter(query)

/** Return a form only when the complete bilingual form phrase is explicit in the query. */
fun matchIngredientFormHint(
    ingredientReferenceId: String,
    ingredientForms: List<IngredientForm>,
    query: String
): IngredientForm? {
    val normalizedQuery = normalizeIngredientSearchKey(query)
    if (normalizedQuery.isEmpty()) return null

    val matchingForms = ingredientForms.asSequence()
        .filter { it.ingredientRefId == ingredientReferenceId }
        .filter { form -> form.searchTerms().any { term -> normalizeIngredientSearchKey(term) == normalizedQuery } }
    return matchingForms.singleOrNull()
}

private fun IngredientReference.searchTerms(): List<String> =
    listOf(nameFr, nameEn) + aliasesFr + aliasesEn

private fun IngredientForm.searchTerms(): List<String> =
    listOf(labelFr, labelEn) + matchTermsFr + matchTermsEn

private fun normalizedWordsContainPhrase(normalizedTerm: String, queryWords: List<String>): Boolean {
    if (normalizedTerm.isEmpty() || queryWords.isEmpty()) return false
    val termWords = normalizedTerm.split(' ')
    if (queryWords.size > termWords.size) return false
    return (0..termWords.size - queryWords.size).any { start ->
        termWords.subList(start, start + queryWords.size) == queryWords
    }
}

private val NON_SEARCH_CHARACTERS = Regex("[^a-z0-9]+")
private val MULTIPLE_SPACES = Regex("\\s+")
