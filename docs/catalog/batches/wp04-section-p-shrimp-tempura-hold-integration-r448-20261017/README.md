# WP04 Section P R448 — shrimp tempura picker-boundary hold

Integrated on 2026-10-17 after root review of the [R448 proposal](../../proposals/wp04-section-p-shrimp-tempura-product-boundary-review-r448-20261017.md).

## Decision

Keep shrimp tempura unallocated. Current Canadian and Québec-facing product pages support a distinct shrimp-tempura product and bilingual names, but adding this one prepared seafood identity would make broad `tempura` search resolve to shrimp tempura alone. OQLF defines tempura across fish, seafood, and vegetables. The earlier [R224 frozen-tempura-fish hold](../../proposals/wp04-section-p-frozen-tempura-fish-product-boundary-review-r224-20261016.md) uses the same picker boundary; adding both seafood rows would still omit vegetable tempura. The 114-recipe bundle has no matching demand.

No active ingredient reference, alias, form, ledger candidate, measurement, recipe link, package yield, conversion, or substitution was added. R448 source IDs remain proposal-local. The Section P parent item remains open.

## Evidence and limits

- OQLF’s *tempura* definition includes fish, seafood, and vegetables fried in batter, so the broad term is a dish/technique query as well as a prepared-product name.
- Azuma Foods Canada directly lists `Shrimp Tempura` and `Tempura de crevettes`; Costco Business Centre Canada lists `Crevettes Tempura`; and Québec distributor Aubut lists frozen shrimp tempura. These sources establish product naming, not a common species, state, formula, or reusable package measure.
- Metro listings support additional names and package-specific descriptions through indexed results, but direct item pages did not load during the review. Their indexed measurements are not reused.
- The full manifest scan found no matching recipe files or ingredient rows. Adding no catalog data keeps the broad picker unchanged.

## Validation

This documentation-only hold changes no database JSON, generated index, recipe, or runtime code. No tests, build, or emulator run were needed.

WP04 Section P remains open for the other shrimp, crab, crayfish, and seafood gaps.
