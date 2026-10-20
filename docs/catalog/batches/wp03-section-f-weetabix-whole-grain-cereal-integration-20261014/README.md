# WP03 Section F — Weetabix whole-grain cereal (R101)

Integrated 2026-10-14. Section F cereal-mix and preprocessed-grain coverage remains open.

## Decision

Added identity-only **Weetabix whole-grain cereal / Céréales à grains entiers Weetabix** for the currently listed Canadian plain product. Kept it separate from generic shredded wheat cereal, Weetabix Chocolate and Crispy Minis, wheat grain, and other whole-grain cereals. The aliases `Weetabix cereal` and `Céréales Weetabix` are supported by Canadian product/CNF and Québec retailer wording.

Health Canada CNF code 1249 lists four portions, which are preserved only as product-code-specific ledger observations. Its 2-biscuit weight is 35.0 g, while the current UK manufacturer page says 37.5 g; neither supports a reusable count conversion or confirms the current Canadian label. No default density, unit mappings, forms, active measures, conversions, yields, recipe links, or substitutions were added.

The 114 manifest-listed recipes and 1,123 ingredient rows have no Weetabix demand.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added `ingredient-ref-weetabix-whole-grain-cereal`.
- `docs/catalog/research-ledger.v1.json`: added the accepted identity, nine source records, and four CNF-only observations.
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`: regenerated from canonical reference data.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` and `roadmap.md`: recorded the integration while leaving Section F open.

See the [R101 proposal](../../proposals/wp03-section-f-next-grain-gap-review-r101-20261014.md) for source boundaries, picker projection, and recipe scan.

## Verification

Static package, reference normalization, generated-index, ledger, picker, recipe, encoding, local-link, and whitespace checks passed. No app tests, Gradle tasks, instrumentation tests, emulator runs, or deployment were performed because this change only adds database JSON data and refreshes its generated catalog index.
