# WP02 / WP03 / WP04 R148 gap-review integration

Reviewed current gaps in WP02 Section A, WP03 Section F, and WP04 Section P.

- **WP02 Section A — Red Fife grades:** Added identity-only `white Red Fife flour / farine Red Fife blanche`, separate from R147's whole Red Fife flour and generic white flour. The mill's T55, protein, all-purpose-use, and package claims remain specific to its product; the whole flour's `1/2 cup (60 g)` observation was not transferred.
- **WP03 Section F — farro flour:** Added species-neutral `farro flour / farine de farro` as a separate market product identity. Canadian and Québec listings support farro wording with emmer and spelt products; producer listings and certification evidence also use it for einkorn and a three-species blend. Bare `farro` remains unresolved, and the R147 grain row remains separate.
- **WP04 Section P — shrimp balls:** Added identity-only `shrimp balls / boulettes de crevettes`, with singular aliases `shrimp ball` and `boulette de crevettes`. Kept it separate from shrimp, generic fish balls, and shrimp-flavoured balls; one retailer's fish-and-shrimp formulation remains product-specific.

The bundled recipe corpus has no matching demand. No forms, reusable measures, density, unit mappings, recipe links, conversions, yields, or active substitutions were added. Current package totals are **1,511 references and 119 forms**; the research ledger has **1,856 records, 7,821 source entries, and 6,676 distinct source IDs**. The generated Kotlin catalog index contains 1,511 references. The bundle remains **114 recipes and 1,123 ingredient rows**.

Static package normalization and validation, reference normalization, generated-index freshness, ledger-schema and R148 source-ID checks, picker projections, recipe-corpus scan, UTF-8/no-BOM, local-link, and whitespace checks passed. No app or Android tests were run because this round only adds database JSON data under the current `AGENTS.md` rule.

See the [WP02 white Red Fife proposal](../../proposals/wp02-a-white-red-fife-flour-boundary-review-r148-20261015.md), [WP03 farro-flour proposal](../../proposals/wp03-section-f-farro-flour-boundary-review-r148-20261015.md), [WP04 shrimp-balls proposal](../../proposals/wp04-section-p-next-seafood-product-gap-review-r148-20261015.md), and the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). The broader WP02 Section A, Section F, and Section P scopes remain open.
