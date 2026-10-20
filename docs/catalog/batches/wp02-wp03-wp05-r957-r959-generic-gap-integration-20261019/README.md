# R957–R959 cross-category generic ingredient integration

**Date:** 2026-10-19
**Status:** Integrated by the root agent after reviewing all three proposal packets.

## Catalog changes

- **R957 — barley middlings / fraction intermédiaire de mouture d’orge:** added an identity-only `GRAIN_AND_CEREAL` reference for the human-food barley milling fraction. Kept it distinct from barley bran, germ, flour, grits, semolina, starch, feed-grade by-products, and wheat middlings. The French display is provisional; study samples, milling descriptions, and bread formulations remain source-specific.
- **R958 — cauliflower leaves / feuilles de chou-fleur:** added one identity-only `VEGETABLE_AND_AROMATIC` reference for the edible leaves of culinary cauliflower, *Brassica oleracea* var. *botrytis*. Kept it separate from cauliflower curd/head and broccoli leaves. The existing OQLF source remains on the parent cauliflower identity; the source recipe's preparation details remain specific to that recipe.
- **R959 — inziangsang / inziangsang:** added one identity-only `SAUCE_AND_CONDIMENT` reference for the named fermented mustard-leaf food, with only the source-attested English spelling alias `inziang-sang`. The borrowed French display remains provisional. Kept it separate from gundruk, generic pickled mustard greens, sinki, khalpi, and the separately named liquid inziang-dui.

No forms, recipe links, reusable measurements, conversions, yields, or substitutions were added. Experimental, recipe-specific, and regional preparation details remain scoped to their sources. Existing entries and evidence were not deleted, merged, or generalized.

## Cross-category scope review

All three assignments addressed generic ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched or added. R958's Montréal recipe PDF also mentions a named chili-crisp product; that ingredient was not pursued as catalog coverage. The queue review found no pending task whose sole deliverable is a commercial roster. Existing branded rows and product-specific evidence remain intact.

## Static validation

Reference normalization, bundled-package validation, generated-index freshness, research-ledger schema/source-ID checks, exact ownership, recipe-demand, UTF-8/no-BOM, local-link, and whitespace checks passed. Final totals: **1,978 ingredient references**, **205 forms**, and **2,383 ledger records**. The recipe scan found **0 candidate hits across 114 recipe files and 1,123 ingredient rows**. No Gradle, app, instrumentation, emulator, deployment, or software tests were run; the app changes only add ingredient database JSON under `AGENTS.md`.

## Reviews

- [R957 barley middlings review](../../proposals/wp02-a7-generic-grain-gap-review-r957-20261019.md)
- [R958 cauliflower leaves review](../../proposals/wp03-section-k-generic-produce-gap-review-r958-20261019.md)
- [R959 inziangsang review](../../proposals/wp05-section-w-generic-preserved-food-gap-review-r959-20261019.md)
- [Cross-category generic ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
