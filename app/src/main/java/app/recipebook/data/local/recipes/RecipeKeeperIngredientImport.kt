package app.recipebook.data.local.recipes

import app.recipebook.domain.model.IngredientReference

internal data class RecipeKeeperRecipeIngredients(
    val title: String,
    val ingredientLines: List<String>
)

internal data class RecipeKeeperIngredientOccurrence(
    val recipeTitle: String,
    val originalLine: String,
    val candidateName: String
)

internal data class RecipeKeeperIngredientAudit(
    val matched: List<RecipeKeeperIngredientMatch>,
    val unmatched: List<RecipeKeeperIngredientCandidate>
)

internal data class RecipeKeeperIngredientMatch(
    val ingredientId: String,
    val ingredientName: String,
    val count: Int,
    val sampleLines: List<String>
)

internal data class RecipeKeeperIngredientCandidate(
    val candidateName: String,
    val count: Int,
    val sampleLines: List<String>
)

internal object RecipeKeeperIngredientImport {
    private val titleRegex = Regex("<h2 itemprop=\\\"name\\\">([\\s\\S]*?)</h2>")
    private val ingredientBlockRegex = Regex("<div class=\\\"recipe-ingredients\\\" itemprop=\\\"recipeIngredients\\\">([\\s\\S]*?)</div>")
    private val ingredientLineRegex = Regex("<p>([\\s\\S]*?)</p>")
    private val numericHtmlEntityRegex = Regex("&#(x?[0-9A-Fa-f]+);")
    private val removableLeadPhrases = listOf(
        "optional sweetness:",
        "flavor ideas:",
        "mix-in ideas:",
        "facultatif :",
        "facultatif:",
        "optional:"
    )
    private val directCanonicalization = mapOf(
        "all purpose flour" to "all-purpose flour",
        "unbleached all-purpose flour" to "all-purpose flour",
        "flour" to "all-purpose flour",
        "pure vanilla extract" to "vanilla extract",
        "vanilla" to "vanilla extract",
        "whole milk" to "milk",
        "cold milk" to "milk",
        "heavy whipping cream" to "heavy cream",
        "whipping cream" to "heavy cream",
        "cold heavy cream" to "heavy cream",
        "cold heavy whipping cream" to "heavy cream",
        "cream 33%" to "heavy cream",
        "35% cream" to "heavy cream",
        "powdered sugar" to "icing sugar",
        "confectioners sugar" to "icing sugar",
        "confectioners' sugar" to "icing sugar",
        "confectioners’ sugar" to "icing sugar",
        "light brown sugar" to "brown sugar",
        "packed light brown sugar" to "brown sugar",
        "old-fashion rolled oats" to "rolled oats",
        "old-fashioned rolled oats" to "rolled oats",
        "rolled oat" to "rolled oats",
        "semi-sweet chocolate" to "semisweet chocolate",
        "semi-sweet chocolate chips" to "semisweet chocolate",
        "chocolate chips" to "semisweet chocolate",
        "white chocolate chips" to "white chocolate",
        "dark chocolate chips" to "dark chocolate",
        "milk chocolate chips" to "milk chocolate",
        "unsweetened chocolate" to "unsweetened chocolate",
        "garbanzo beans" to "chickpeas",
        "black beans drained" to "black beans",
        "garbanzo beans drained" to "chickpeas",
        "yellow onion" to "onion",
        "chopped yellow onion" to "onion",
        "garlic cloves" to "garlic",
        "minced garlic" to "garlic",
        "fresh garlic" to "garlic",
        "egg whites" to "egg white",
        "egg whites lightly beaten" to "egg white",
        "egg yolks" to "egg yolk",
        "plain greek yogurt" to "plain yogurt",
        "greek yogurt" to "plain yogurt",
        "full fat sour cream" to "sour cream",
        "flaked coconut" to "shredded coconut",
        "coconut flakes" to "shredded coconut",
        "smoked paprika" to "smoked paprika",
        "hot water" to "water",
        "boiling water" to "water",
        "ice water" to "water",
        "cold water" to "water",
        "cold buttermilk" to "buttermilk",
        "almond paste" to "almond paste",
        "homemade almond paste" to "almond paste",
        "pistachio nuts" to "pistachios",
        "plus 2 tablespoons water" to "water",
        "salt and pepper" to "salt and pepper",
        "cooking oil" to "vegetable oil",
        "corn starch" to "cornstarch",
        "cup flour" to "all-purpose flour",
        "cups all-purpose flour" to "all-purpose flour",
        "all-purpose flour 240g" to "all-purpose flour",
        "clove garlic" to "garlic",
        "coarse salt" to "salt",
        "creamy peanut butter" to "natural peanut butter",
        "canned unsweetened coconut milk" to "coconut milk",
        "bbq sauce" to "BBQ sauce",
        "cardamom" to "ground cardamom",
        "bread crumbs" to "bread crumbs",
        "baby spinach" to "baby spinach",
        "broccoli" to "broccoli",
        "bunch asparagus" to "asparagus",
        "asparagus" to "asparagus",
        "chili powder" to "chili powder",
        "cloves" to "ground cloves",
        "cream cheese" to "cream cheese",
        "sprinkles" to "sprinkles",
        "all spice" to "allspice",
        "cilantro" to "cilantro",
        "cream of tartar" to "cream of tartar",
        "box of cranberries" to "cranberries",
        "cranberries" to "cranberries",
        "custard powder" to "custard powder",
        "curry paste" to "curry paste",
        "curry powder" to "curry powder",
        "chipotle in adobo" to "chipotle in adobo",
        "dijon mustard" to "Dijon mustard",
        "distilled white vinegar" to "white vinegar",
        "white vinegar" to "white vinegar",
        "bananas" to "banana"
    )
    private val leadingDescriptors = listOf(
        "finely chopped",
        "coarsely chopped",
        "pitted and chopped",
        "lightly beaten",
        "at room temperature",
        "room temperature",
        "spooned and leveled",
        "old-fashion",
        "old-fashioned",
        "over-ripe",
        "full fat",
        "packed",
        "fresh",
        "cold",
        "hot",
        "boiling",
        "ice",
        "unbleached",
        "chopped",
        "minced",
        "softened",
        "melted",
        "sifted",
        "crushed",
        "diced",
        "toasted",
        "cubed",
        "chilled",
        "lukewarm",
        "large",
        "small",
        "medium"
    )
    private val ignoreCandidates = setOf(
        "optional",
        "divided",
        "to taste",
        "softened",
        "chopped",
        "minced",
        "melted",
        "room temperature",
        "at room temperature",
        "finely chopped",
        "coarsely chopped",
        "lightly beaten",
        "sifted",
        "crushed",
        "diced",
        "vegetable",
        "whole",
        "extra",
        "more",
        "needed",
        "filling",
        "fresh",
        "frozen",
        "bars"
    )
    fun parseRecipes(html: String): List<RecipeKeeperRecipeIngredients> {
        val titles = titleRegex.findAll(html)
            .map { decodeHtml(it.groupValues[1]).trim() }
            .toList()
        val ingredientBlocks = ingredientBlockRegex.findAll(html)
            .map { block ->
                ingredientLineRegex.findAll(block.groupValues[1])
                    .map { decodeHtml(it.groupValues[1]).trim() }
                    .filter(String::isNotEmpty)
                    .toList()
            }
            .toList()
        return titles.zip(ingredientBlocks).map { (title, lines) ->
            RecipeKeeperRecipeIngredients(title = title, ingredientLines = lines)
        }
    }

    fun extractOccurrences(html: String): List<RecipeKeeperIngredientOccurrence> =
        parseRecipes(html).flatMap { recipe ->
            recipe.ingredientLines.flatMap { line ->
                extractCandidateNames(line).map { candidateName ->
                    RecipeKeeperIngredientOccurrence(
                        recipeTitle = recipe.title,
                        originalLine = line,
                        candidateName = candidateName
                    )
                }
            }
        }

    fun auditAgainstCatalog(
        html: String,
        ingredientReferences: List<IngredientReference> = BundledIngredientCatalog.references
    ): RecipeKeeperIngredientAudit {
        val aliasIndex = buildAliasIndex(ingredientReferences)
        val matched = linkedMapOf<String, MutableList<RecipeKeeperIngredientOccurrence>>()
        val unmatched = linkedMapOf<String, MutableList<RecipeKeeperIngredientOccurrence>>()
        extractOccurrences(html).forEach { occurrence ->
            val ingredientId = aliasIndex[normalizeKey(occurrence.candidateName)]
            if (ingredientId == null) {
                unmatched.getOrPut(occurrence.candidateName) { mutableListOf() }.add(occurrence)
            } else {
                matched.getOrPut(ingredientId) { mutableListOf() }.add(occurrence)
            }
        }
        val ingredientMap = ingredientReferences.associateBy(IngredientReference::id)
        return RecipeKeeperIngredientAudit(
            matched = matched.entries.mapNotNull { (ingredientId, occurrences) ->
                val ingredient = ingredientMap[ingredientId] ?: return@mapNotNull null
                RecipeKeeperIngredientMatch(
                    ingredientId = ingredientId,
                    ingredientName = ingredient.nameEn,
                    count = occurrences.size,
                    sampleLines = occurrences.map(RecipeKeeperIngredientOccurrence::originalLine).distinct().take(3)
                )
            }.sortedWith(compareByDescending<RecipeKeeperIngredientMatch> { it.count }.thenBy { it.ingredientName }),
            unmatched = unmatched.entries.map { (candidateName, occurrences) ->
                RecipeKeeperIngredientCandidate(
                    candidateName = candidateName,
                    count = occurrences.size,
                    sampleLines = occurrences.map(RecipeKeeperIngredientOccurrence::originalLine).distinct().take(3)
                )
            }.sortedWith(compareByDescending<RecipeKeeperIngredientCandidate> { it.count }.thenBy { it.candidateName })
        )
    }

    internal fun extractCandidateNames(line: String): List<String> {
        val decodedLine = decodeHtml(line).trim()
        if (decodedLine.isEmpty()) return emptyList()
        val englishSide = decodedLine.substringAfter(" - ", decodedLine).trim()
        val withoutLeadLabel = removableLeadPhrases.fold(englishSide) { current, phrase ->
            if (current.startsWith(phrase, ignoreCase = true)) current.drop(phrase.length).trim() else current
        }
        val splitPattern = if (decodedLine.contains(':')) Regex("\\s+or\\s+|\\s*,\\s*") else Regex("\\s+or\\s+")
        val normalizedCandidates = splitPattern.split(withoutLeadLabel)
            .mapNotNull(::normalizeCandidate)
            .flatMap { candidate ->
                when (candidate) {
                    "salt and pepper" -> listOf("salt", "black pepper")
                    else -> listOf(candidate)
                }
            }
        return normalizedCandidates.distinct()
    }

    private fun normalizeCandidate(raw: String): String? {
        var value = raw.trim()
        if (value.isEmpty()) return null
        value = value.replace(Regex("\\([^)]*\\)"), " ")
        value = value.replace(Regex("(?i)^[a-z ]+ideas\\s*"), "")
        value = value.replace(Regex("(?i)^any\\s+"), "")
        value = value.replace(Regex("(?i)^extra\\s+"), "")
        value = value.replace(Regex("(?i)^raw\\s+"), "")
        value = value.replace(Regex("(?i)^of\\s+"), "")
        value = value.replace(Regex("(?i)^de\\s+"), "")
        value = value.replace(Regex("(?i)^dried\\s+"), "dried ")
        value = stripQuantityPrefix(value)
        value = value.substringBefore(",").trim()
        value = value.substringBefore("; ").trim()
        value = value.replace(Regex("(?i)\\s+for .*$"), "")
        value = value.replace(Regex("(?i)\\s+plus .*$"), "")
        value = value.replace(Regex("(?i)\\s+as needed.*$"), "")
        value = value.replace(Regex("(?i)\\s+if needed.*$"), "")
        value = value.replace(Regex("(?i)\\s+to taste.*$"), "")
        value = value.replace(Regex("(?i)\\s+on top.*$"), "")
        value = value.replace(Regex("(?i)\\s+for rolling.*$"), "")
        value = value.replace(Regex("(?i)\\s+for dusting.*$"), "")
        value = value.replace(Regex("(?i)\\s+for serving.*$"), "")
        leadingDescriptors.forEach { descriptor ->
            value = value.replace(Regex("(?i)^${Regex.escape(descriptor)}\\s+"), "")
        }
        value = value.replace(Regex("(?i)\\bdrained\\b"), "")
        value = value.replace(Regex("(?i)\\boptional\\b"), "")
        value = value.replace(Regex("(?i)\\bdivided\\b"), "")
        value = value.replace(Regex("(?i)\\bfreshly ground\\b"), "")
        value = value.replace(Regex("(?i)\\bground\\s+black\\s+pepper\\b"), "black pepper")
        value = value.replace(Regex("(?i)\\bunsweetened natural\\b"), "unsweetened natural cocoa powder")
        value = value.replace(Regex("(?i)\\s+"), " ").trim().trim('.', ':', '*')
        value = value.lowercase()
        value = value.removePrefix("of ")
        value = value.removePrefix("de ")
        value = value.removePrefix("du ")
        value = value.removePrefix("des ")
        value = value.removePrefix("the ")
        value = value.removePrefix("a ")
        value = value.removePrefix("an ")
        value = value.trim()
        if (value in ignoreCandidates || value.length < 2) return null
        return directCanonicalization[value] ?: value
    }

    private fun stripQuantityPrefix(value: String): String {
        var result = value.trim()
        val quantityPrefix = Regex(
            pattern = "^(?:about\\s+)?(?:[0-9¼½¾??????/.,\\s-]+|one|two|three|four|five|six|seven|eight|nine|ten)+(?:and\\s+[0-9¼½¾??????/.,\\s-]+)?\\s*(?:oz|ounce|ounces|g|kg|ml|l|lb|lbs|cup|cups|tbsp|tablespoon|tablespoons|tsp|teaspoon|teaspoons|large|small|medium|clove|cloves|slice|slices|stick|sticks|can|cans|jar|jars|package|packages)?\\s+",
            options = setOf(RegexOption.IGNORE_CASE)
        )
        repeat(3) {
            val updated = result.replaceFirst(quantityPrefix, "")
            if (updated == result) return@repeat
            result = updated.trim()
        }
        return result
    }

    private fun buildAliasIndex(ingredientReferences: List<IngredientReference>): Map<String, String> {
        val index = linkedMapOf<String, String>()
        ingredientReferences.forEach { ingredient ->
            listOf(ingredient.nameEn, ingredient.nameFr)
                .plus(ingredient.aliasesEn)
                .plus(ingredient.aliasesFr)
                .map(::normalizeKey)
                .filter(String::isNotEmpty)
                .forEach { key -> index.putIfAbsent(key, ingredient.id) }
        }
        return index
    }

    private fun normalizeKey(value: String): String = value
        .lowercase()
        .replace("&", "and")
        .replace(Regex("[^a-z0-9]+"), " ")
        .trim()

    private fun decodeHtml(value: String): String {
        val namedDecoded = value
            .replace("&nbsp;", " ")
            .replace("&amp;", "&")
            .replace("&quot;", "\"")
            .replace("&apos;", "'")
            .replace("&#39;", "'")
            .replace("&#160;", " ")
            .replace("&frac12;", "1/2")
            .replace("&frac14;", "1/4")
            .replace("&frac34;", "3/4")
            .replace("&frac13;", "1/3")
            .replace("&frac23;", "2/3")
        return numericHtmlEntityRegex.replace(namedDecoded) { matchResult ->
            val token = matchResult.groupValues[1]
            val codePoint = if (token.startsWith("x", ignoreCase = true)) {
                token.drop(1).toIntOrNull(16)
            } else {
                token.toIntOrNull()
            } ?: return@replace matchResult.value
            String(Character.toChars(codePoint))
        }
    }
}


