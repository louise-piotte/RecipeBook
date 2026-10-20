# WP05 Section T dried black lime identity integration — R299 — 2026-10-16

## Decision

Added identity-only `ingredient-ref-dried-black-lime` as **dried black lime / lime séchée** in `BAKING_AND_SPICE`. English aliases are `dried lime`, `black lime`, `loomi`, and `limoo amani`. The Québec French wording is supported by a Montréal Persian restaurant's Ghormeh Sabzi menu entry; OQLF is reused only for the base term `lime`.

The reference is separate from fresh lime because Canadian spice retailers describe a named whole souring product that is boiled in brine and sun-dried until its pulp turns black. `Black lemon` and `Omani lemon` remain unclaimed because those broad seller terms can point to other dried citrus products. Dried citrus slices and garnish terms remain unclaimed too.

No forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions were added. The listed package weights are package sizes only. No matching demand was found in the 114 bundled recipes and 1,123 ingredient rows.

## Data changes

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added one identity-only reference.
- `docs/catalog/research-ledger.v1.json`: added one reference record and three new sources; reused the existing OQLF lime source under its original ID.
- `BundledIngredientCatalog.kt`: regenerated the picker index from the bundled JSON.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: completed the dried black lime subtask while keeping the broader Section T review open.
- `roadmap.md`: recorded the review and static validation.

## Verification

Static package normalization/validation, reference normalization, generated-index freshness, ledger schema and source ownership, picker projection, corpus scan, UTF-8/no-BOM, explicit Unicode escaping, local links, and scoped whitespace checks passed. No software tests, builds, or emulator checks were run for this database JSON addition, following the repository instruction.

## References

- [R299 proposal](../../proposals/wp05-section-t-dried-black-lime-identity-review-r299-20261016.md)
- [The Silk Road Spice Merchant: Loomi](https://silkroadspices.ca/products/loomi)
- [Cafe Nuts: Dried Lime](https://cafenuts.ca/product/dried-lime/)
- [Maman Sady Montréal: menu](https://mamansady.com/menu/)
- [OQLF GDT: lime](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366576/lime)
