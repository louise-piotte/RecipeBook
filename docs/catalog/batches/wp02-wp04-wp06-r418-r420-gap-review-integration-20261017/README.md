# WP02 A7 R418 / WP04 Section P R419 / WP06 Europe R420 integration

Integrated on 2026-10-17 after root review of [R418](../../proposals/wp02-section-a7-next-milling-gap-review-r418-20261017.md), [R419](../../proposals/wp04-sectionp-next-seafood-gap-review-r419-20261017.md), and [R420](../../proposals/wp06-europe-next-regional-identity-review-r420-20261017.md).

## Decisions

- **R418 — oat grits:** hold unqualified `oat grits / gruau d'avoine` outside active references, aliases, and the ledger. TERMIUM's bilingual milling term overlaps the groat boundary, while Québec's OQLF defines unqualified `gruau` as a cooked dish. Keep whole oat groats, named Scottish oatmeal, and steel-cut oats distinct. No bundled recipe demand resolves the intended product. Add no reference, candidate, form, measure, or recipe link.
- **R419 — masago:** add identity-only `masago / masago` as `ingredient-ref-masago`, category `PROTEIN`, with only `capelin roe` and `œufs de capelan` as aliases. A current Montréal-market product listing supports the capelin-roe association and the English/French alias pair; Fourchette bleue also names capelin eggs as masago in Asian cuisine. Azuma's current listings show that formulations vary by SKU, including a capelin-and-herring product and a capelin-only product. Keep species composition, color, seasoning, preservation, origin, and package details SKU-specific. Masago is distinct from whole Atlantic capelin and herring roe. No bundled recipe demand or reusable measurement was found; add no forms, measures, conversions, yields, recipe links, or substitutions.
- **R420 — Modena PDO:** add identity-only `Traditional Balsamic Vinegar of Modena DOP / vinaigre balsamique traditionnel de Modène AOP` as `ingredient-ref-traditional-balsamic-vinegar-of-modena`, category `SAUCE_AND_CONDIMENT`. The exact Italian PDO designation is the sole English alias. The qualified Canadian French retailer title ending in `DOP` is the French alias for the AOP display. Keep generic balsamic vinegar, Modena PGI, Reggio Emilia PDO, glazes, reductions, creams, and flavored products separate. Do not convert the specification's analytical density minimum or protected bottle sizes into kitchen measures. No bundled recipe demand or tested substitution was found; add no forms, reusable measures, conversions, yields, recipe links, or substitutions.

## Catalog and picker effects

- Active ingredient references: **1,721**, up from 1,719. Ingredient forms remain at **141**.
- Research ledger: **2,080 records**, **9,424 source entries**, **7,983 distinct source IDs**, and **6,701 distinct source URLs**. R419 adds four new source entries plus the two reused capelin sources; R420 adds six new source entries plus the reused OQLF balsamic source. R418 adds no ledger record.
- `masago`, `capelin roe`, and `œufs de capelan` return only `ingredient-ref-masago`. Broad `roe` increases from four to five results; `capelin` and `capelan` each return whole Atlantic capelin plus masago. `fish roe` remains on bottarga; `caviar` keeps its existing results; `tobiko` remains unallocated.
- The Italian PDO name and qualified English/French display names return only the new Modena row. Generic `balsamic vinegar`, `vinaigre balsamique`, and `balsamic` now return the existing generic row plus the PDO row. `Aceto Balsamico di Modena` PGI remains unallocated. `oat grits` remains unallocated, and `gruau d'avoine` continues to return the qualified oat-groats row.
- The manifest bundle remains **114 recipes / 1,123 ingredient rows**. The proposal scans found no candidate-specific recipe rows or links.

## Data validation

- Bundled seed-package validation passed, including the research-ledger schema and source checks.
- Ingredient-reference normalization passed at 1,721 references, and the generated `BundledIngredientCatalog.kt` index is current.
- The new seed rows have null density, empty unit mappings, and explicit Unicode escapes in the bundled JSON. New source IDs and URLs were checked for collisions; reused evidence retains its existing IDs.
- UTF-8/no-BOM, local proposal links, and scoped whitespace checks passed.
- No software tests, builds, emulator checks, or deployment were run. The active catalog changes add database JSON data, and R418 is documentation-only.

WP02 A7, Section P roe coverage, and Europe-wide coverage remain open.
