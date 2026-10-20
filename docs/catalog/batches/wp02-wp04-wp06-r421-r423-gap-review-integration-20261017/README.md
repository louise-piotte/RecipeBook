# WP02 A7 R421 / WP04 Section P R422 / WP06 Europe R423 integration

Integrated on 2026-10-17 after root review of [R421](../../proposals/wp02-section-a7-next-milling-gap-review-r421-20261017.md), [R422](../../proposals/wp04-sectionp-tobiko-identity-review-r422-20261017.md), and [R423](../../proposals/wp06-europe-next-regional-identity-review-r423-20261017.md).

## Decisions

- **R421 — wheat grits:** keep `wheat grits` unallocated, with no active reference or new ledger candidate. Statistics Canada's classification lists it separately from wheat groats and wheat meal, but the current Canadian retail example is an instant semolina cereal, and no general milling boundary or product-matched Québec French display was established. Keep `gruau de blé` and `blé concassé` with the existing cracked-wheat terminology. The current picker partially matches `wheat grits` to buckwheat grits; this is a false positive, not ownership. No bundled recipe demand was found.
- **R422 — tobiko:** add identity-only `tobiko / tobiko` as `ingredient-ref-tobiko`, category `PROTEIN`, with only `flying fish roe` and `œufs de poisson volant` as aliases. Keep Tobikko product/brand spelling and SKU-specific species, mixture, color, seasoning, and preparation details outside the shared row. The current Québec menu directly pairs the bilingual roe wording, while supplier products vary. No bundled recipe demand or reusable measurement was found; add no forms, density, mappings, conversions, yields, recipe links, or substitutions.
- **R423 — Taleggio:** add identity-only `Taleggio AOP / Taleggio PDO` as `ingredient-ref-taleggio`, category `CHEESE`, with only `fromage Taleggio` and `Taleggio cheese` as aliases. Use the EU PDO boundary and current Québec retailer and cheese-shop wording. Keep Québec-made `Taleggio Localé` distinct. The external Ricardo arancini recipe's 225 g remains source-specific recipe evidence, not a reusable measurement. No bundled recipe demand was found; add no forms, measures, mappings, conversions, yields, recipe links, or active substitutions. Leave general substitution research `not_yet_researched`.

## Catalog and picker effects

- Active references: **1,723**, up from 1,721. Ingredient forms remain at **141**.
- Research ledger: **2,082 records**, **9,436 source entries**, **7,995 distinct source IDs**, and **6,713 distinct source URLs**. R422 adds five source entries; R423 adds seven; R421 adds no ledger record.
- The manifest bundle remains **114 recipes / 1,123 ingredient rows**. Neither identity has matching bundled-recipe demand.
- `tobiko`, `flying fish roe`, and `œufs de poisson volant` each select only the new tobiko row. Broad `roe` grows from five to six results; `fish roe` now returns bottarga and tobiko. `caviar` remains at its existing three results. `tobikko` remains unallocated.
- `Taleggio`, `Taleggio PDO`, `Taleggio AOP`, `fromage Taleggio`, and `Taleggio cheese` select only the Taleggio row. `cheese` grows from 14 to 15 results and `fromage` from 12 to 13. `Taleggio Localé` remains unallocated.
- `wheat grits` remains unallocated but currently returns buckwheat grits through substring fallback. The hold preserves that result as a picker false positive rather than assigning an unsupported identity or French name.

## Validation

- Bundled seed-package normalization and validation passed. Reference normalization passed at 1,723 references, and the generated `BundledIngredientCatalog.kt` index is current.
- The ledger schema, record IDs, new source IDs, and exact source URLs passed checks. The new references have null density and empty unit mappings; no form, conversion, package yield, recipe link, or substitution row was added.
- Static phrase-first picker projections and a full scan of the 114 manifest-listed recipe files / 1,123 structured ingredient rows confirmed the results above and no candidate-specific recipe matches.
- Seed JSON retains explicit Unicode escapes. UTF-8/no-BOM, proposal and plan links, source-ID/URL uniqueness, and scoped whitespace checks passed.
- No software tests, builds, emulator checks, or deployment were run. The active implementation change only adds database JSON data, as allowed by `AGENTS.md`; R421 is documentation-only.

WP02 A7, Section P roe coverage, and Europe-wide coverage remain open.
