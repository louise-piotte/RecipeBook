# WP02/WP03/WP04 R184 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [Global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [*Artocarpus camansi* breadnut-seed flour hold](../../proposals/wp02-b2-artocarpus-camansi-seed-flour-boundary-hold-r184-20261016.md), [Kellogg’s Crispix cereal](../../proposals/wp03-section-f-kelloggs-crispix-cereal-identity-review-r184-20261016.md), and [smoked cod](../../proposals/wp04-section-p-smoked-cod-market-boundary-review-r184-20261016.md).

## Integrated decisions

- **WP02 Section 04 B2 — breadnut-seed flour:** Held outside active references and the ledger pending a current Canadian/Québec culinary flour product and product-matched Québec French flour name. Maxi’s English `Breadnut` and French `Châtaigne` pages are the same whole-produce SKU and do not establish flour. Keep it separate from *Artocarpus altilis* flesh flour/starch, *A. camansi* seed starch, and *Brosimum alicastrum* flour.
- **WP03 Section F — Crispix:** Added identity-only `Kellogg’s Crispix Cereal / Céréales Crispix` as `ingredient-ref-kelloggs-crispix-cereal` in `GRAIN_AND_CEREAL`. Aliases remain empty. The 350 g package is SKU package context, not a recipe quantity or measure. The manufacturer’s English and French snack-mix recipes are separate recipes (4 cups/yields 15 and 6 cups/yields about 16); neither supports a mass-volume value, active measure, or recipe link.
- **WP04 Section P — smoked cod:** Added identity-only `smoked cod / morue fumée` as `ingredient-ref-smoked-cod` in `PROTEIN`, a species/process-neutral finished-food market group. Keep `morue noire` with sablefish and do not imply *Gadus morhua* for every product.

Both added rows have empty aliases, no forms, default density, unit mappings, measurement observations, recipe links, conversions, yields, or substitution findings. The manifest-ordered corpus remains at 114 recipes / 1,123 ingredient rows and has no matching demand.

## Ledger and package totals

The ledger additions comprise two accepted identity records and 19 source entries. Six Crispix sources and eight smoked-cod sources have new source IDs; five smoked-cod sources reuse existing ledger IDs for the same URLs. The breadnut flour hold adds no source or candidate record.

Totals: **1,563 ingredient references**, **122 forms**, and **1,908 ledger records / 8,199 source entries / 7,004 distinct source IDs / 5,799 distinct URLs**; the bundle remains **114 recipes / 1,123 ingredient rows**.

## Static validation

- Bundled seed package and ingredient-reference normalization checks passed; package validation passed.
- Generated `BundledIngredientCatalog.kt` freshness passed with 1,563 references.
- Research-ledger JSON schema, record/source linkage, new source-ID/URL ownership, and UTF-8/no-BOM checks passed.
- Static picker projection returned one result for `Kellogg’s Crispix Cereal`, `Céréales Crispix`, `smoked cod`, and `morue fumée`; broad cereal/cod/morue queries remain multi-result.
- Parsed all 114 manifest-listed recipe files / 1,123 structured rows and found no candidate mentions.
- Checked explicit Unicode escapes in bundled JSON, Markdown local links, and scoped whitespace.

No software tests, builds, emulator runs, or deployment were performed because the active catalog changes only add data to database JSON files under the updated `AGENTS.md` rule. Broader WP02 B2, WP03 Section F, and WP04 Section P coverage remains open.
