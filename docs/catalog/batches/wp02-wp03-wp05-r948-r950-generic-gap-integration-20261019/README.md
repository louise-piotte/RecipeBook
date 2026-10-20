# R948–R950 cross-category generic ingredient integration

**Date:** 2026-10-19  
**Status:** Integrated by the root agent after reviewing the three proposal packets.

## Catalog changes

- **R948 — defatted corn germ flour / farine de germe de maïs déshuilé:** added one identity-only `FLOUR_AND_STARCH` reference for food-grade flour made from defatted corn germ. Kept it distinct from toasted corn germ, feed-grade germ meal, corn germ oil, and other corn fractions. The French display remains provisional. Study-specific sample composition, milling, extraction, and bread-formula details remain source-scoped.
- **R949 — celery leaves / feuilles de céleri:** added one identity-only `VEGETABLE_AND_AROMATIC` reference for culinary leaves of stalk celery (*Apium graveolens* L.). Kept the leaves separate from celery stalks, celeriac, and celery seed. The Télé-Québec soup amount and combined pesto line remain recipe-specific; neither is a reusable celery-leaf measure or substitution.
- **R950 — sinki / sinki:** added one identity-only `SAUCE_AND_CONDIMENT` reference for the named Himalayan fermented-radish food. Kept it separate from raw radish, salt-and-vinegar pickled radish, fermented bamboo shoots, and gundruk. The borrowed French display remains provisional; regional plant-part and preparation descriptions vary.

No forms, reusable measurements, recipe links, conversions, yields, or active substitutions were added. No existing ingredient rows were deleted, renamed, merged, or generalized. Existing branded entries and product-specific evidence remain intact.

## Evidence and source-ID handling

- R948 uses primary food studies for the food-grade ingredient class and food applications. CerealVeneta supports only a descriptive French label; its processing and product claims remain product-specific. The existing CFIA feed-table source ID is reused only for the feed-grade boundary.
- R949 reuses the OQLF base-celery source ID and the R934 Télé-Québec pesto source ID. The latter supports the wording and combined optional line only; its quantity is not assigned to celery leaves. The soup’s 30 mL amount remains tied to that four-portion recipe.
- R950 reuses the J-STAGE sinki study source ID already present on the pickled-radish record. The study's experimental conditions remain specific to that study.
- Existing source records were preserved. Reused source IDs retain their existing URL ownership; no duplicate IDs were created for the same pages.

## Cross-category scope review

These reviews add generic culinary ingredient diversity across cereal milling, produce plant parts, and preserved foods. The queued brand-, product-line-, flavour-family-, SKU-, and retailer-variant-only expansions remain out of scope because commercial-product counts do not add ingredient diversity. The Section F commercial cereal roster clauses and named Anson Mills wheat-meal lead remain recorded as out of scope; generic cereal gaps remain open. No new commercial roster was pursued. Manufacturer evidence was used only for claims that support a generic ingredient, and product-specific claims stayed scoped.

## Static validation

- `normalize_seed_ingredient_references.py --check`, bundled seed package validation, and generated picker-index freshness passed.
- Research-ledger schema validation passed for **2,375 records**. Reused source IDs were checked for stable URL ownership; all new IDs and identity rows are present.
- Exact recipe-text scan found **0 matches across 114 bundled recipes** for the candidate names and IDs. Catalog totals are **1,970 ingredient references and 205 forms**.
- UTF-8/no-BOM, local-link, scoped whitespace, and identity-ownership checks passed. The JSON files retain escaped Unicode as required by the seed-data convention.
- No Gradle, app, instrumentation, emulator, or software tests were run. The application data changes add ingredient database JSON under `AGENTS.md`.

## Reviews

- [R948 defatted corn germ flour review](../../proposals/wp02-generic-gap-r948-20261019.md)
- [R949 celery leaves review](../../proposals/wp03-generic-gap-r949-20261019.md)
- [R950 sinki review](../../proposals/wp05-generic-gap-r950-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
