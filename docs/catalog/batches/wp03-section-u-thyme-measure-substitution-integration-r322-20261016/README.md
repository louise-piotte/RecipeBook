# WP03 Section U R322 — thyme measurement and substitution research

Integrated the bounded R322 research on 2026-10-16. The active thyme references, forms, mappings, recipes, and substitution rules remain unchanged.

## Ledger result

- Added 11 separate historical portion observations from online CNF 2015 and USDA SR28 Release 28: four fresh-thyme portions, three ground-dried-thyme portions, and four dried-thyme-leaf portions. Kept the source descriptions and units separate; added no density, unit mapping, or active conversion.
- Set measurement research to `blocked_pending_evidence` for `ingredient-ref-thyme`, `ingredient-ref-dried-thyme`, and `ingredient-ref-dried-thyme-leaves`. Health Canada identifies CNF 2026 as the current relational release and the 2015 online surface as interim, but the exact 2026 thyme food and measure rows were not verified in this review. Historical values remain evidence only; they are not promoted as current general portions.
- Added reciprocal, formula-scoped ledger findings between fresh and dried thyme for one 12–14 lb roast-turkey recipe: 1 tablespoon snipped fresh or 1 teaspoon dried, crushed. The findings do not create an app rule or edit a recipe. The separate dried-thyme-leaves identity remains `blocked_pending_evidence` for substitutions because the recipe's crushed-dried wording does not resolve that narrower picker identity.
- Kept the unexplained CNF fresh-thyme `1 leaf = 4.0 g` entry out of count observations. The cited sources provide no general conversion, spoon-filling method, or comparative outcome.

The Section U form-and-evidence checklist remains open. The 114-recipe bundle has four existing thyme links, all unchanged; none links to the separate dried-thyme-leaves reference.

Static ledger-schema, source-ID, ownership, picker, and bundled-corpus checks passed. At the current workspace checkpoint after R321–R325, the bundle has 1,677 references and 127 forms; the ledger has 2,024 records, 9,023 source occurrences, 7,645 distinct source IDs, and 6,389 distinct source URLs. No software tests, builds, emulator checks, or deployment were run because this change only adds database JSON research data under `AGENTS.md`.

See the [R322 proposal](../../proposals/wp03-section-u-thyme-measure-substitution-review-r322-20261016.md), [Health Canada CNF status](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), [CNF 2015 fresh-thyme entry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=215), [CNF 2015 dried-thyme entry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=210), and [turkey formula](https://www.hr.upenn.edu/docs/default-source/wellness/healthy-holiday-recipes_cwn.pdf?Status=Master&sfvrsn=4b119656_5%2FHealthy-Holiday-Recipes_CWN.pdf).
