# WP02 A7 wheat-bran evidence integration — R628 — 2026-10-18

## Accepted changes

Updated only the verified `ingredient-ref-wheat-bran` research-ledger record. Its active identity, names, empty alias arrays, `defaultDensity: null`, and `unitMappings: []` remain unchanged.

- King Arthur Baking's [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) lists wheat bran at 1/2 cup = 1 1/8 oz = 32 g.
- Its [Banana Pancakes](https://www.kingarthurbaking.com/recipes/banana-pancakes-recipe) lists 1/4 cup (16 g) wheat bran or 1/4 cup (28 g) wheat germ as an optional ingredient. This is a single-formula alternative only.
- The manufacturer page for [Bob's Red Mill Wheat Bran](https://www.bobsredmill.com/product/wheat-bran) lists a 1/4 cup (13 g) product serving. Keep this product-specific.

The distinct 1/4-cup values are retained as separate ledger observations. No density, default measure, active conversion, form, package yield, recipe link, or runtime substitution rule was added. No bundled recipe contains wheat bran.

## Files

- Updated the existing wheat-bran record in `docs/catalog/research-ledger.v1.json`; reused `WP07-KAB-IWC` for the chart and the R624 Banana Pancakes source ID. The Bob's Red Mill product source uses the R628 prefix.
- No active ingredient, form, recipe, conversion, package-yield, or substitution-rule JSON changed.
- Review proposal: [`wp02-a7-next-grain-meal-evidence-review-r628-20261018.md`](../../proposals/wp02-a7-next-grain-meal-evidence-review-r628-20261018.md).

## Validation

The full seed package was validated, the generated reference index is current, and the ledger schema/custom checks passed (2,198 records). No software tests were required specifically for this database-JSON-only evidence update under `AGENTS.md`.
