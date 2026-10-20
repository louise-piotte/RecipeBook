# WP03 Section F Greek sour trahana identity integration — 2026-10-13

## Decision

Added `ingredient-ref-sour-trahana` as an identity-only `GRAIN_AND_CEREAL` reference:
`sour trahana / trahana sûre`. The bilingual names are taken from Krinos Foods Canada's VLAHA product
pages. No aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, or
substitutions were added. Keep Greek sour trahana distinct from Turkish `tarhana`, `trahanas`,
couscous, and semolina.

The 500 g package size and ingredient-statement formulation figures describe the manufacturer's SKU;
they do not establish reusable recipe measures or a universal trahana formula. The French product
page supports its title and ingredient statement, but its description includes an apparent typo and
is not adopted as usage guidance.

## Evidence

- [Krinos Foods Canada, VLAHA — Sour Trahana](https://krinos.ca/products/vlaha-sour-trahana/):
  English product title, presentation, use description, package size, and product-specific ingredient
  statement.
- [Krinos Foods Canada, VLAHA — Trahana sûre](https://krinos.ca/fr/products/vlaha-trahana-sure/):
  French product title and ingredient statement for the same product.
- [About Krinos Canada](https://krinos.ca/about/): Canadian supplier context, including its Montréal
  origins and Greek-food distribution.
- [Lazos, Aggelousis, and Bratakos, “The fermentation of trahanas”](https://pubmed.ncbi.nlm.nih.gov/8332586/):
  primary research supporting the Greek milk-and-wheat fermented-food context, not the current SKU's
  formula or measures.

The source IDs from the proposal are attached to the accepted ingredient-reference record in
`docs/catalog/research-ledger.v1.json`. Measurement and substitution research remain blocked pending
exact-form or recipe-specific evidence. The recipe bundle contains no matching demand.

## Data changes

- Added one reference to `ingredient-references.v1.json`; the French accent is stored as a JSON Unicode
  escape.
- Added the accepted identity and four source records to `research-ledger.v1.json`.
- Regenerated `BundledIngredientCatalog.kt` from the canonical reference JSON.
- Left the seed manifest and schema unchanged; they already point to the reference file and no schema
  shape changed.

No tests or emulator checks were run because this change only adds database JSON data. Static data
validation and generated-file freshness checks were used. See the [proposal](../../proposals/wp03-section-f-greek-sour-trahana-identity-review-20261013-r48.md)
and the [Section F checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
