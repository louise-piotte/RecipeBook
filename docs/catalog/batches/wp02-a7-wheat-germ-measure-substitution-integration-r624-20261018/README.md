# WP02 A7 wheat-germ evidence integration — R624 — 2026-10-18

## Accepted changes

The existing `ingredient-ref-wheat-germ` identity and bilingual names remain unchanged. Its research-ledger record now has two source-bounded portion observations and two recipe-specific optional-alternative findings:

- King Arthur Baking's [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) lists 1/4 cup = 1 oz = 28 g. Its [Whole Grain Dinner Rolls](https://www.kingarthurbaking.com/recipes/whole-grain-dinner-rolls-recipe) and [Banana Pancakes](https://www.kingarthurbaking.com/recipes/banana-pancakes-recipe) each list 1/4 cup (28 g) wheat germ.
- The Banana Pancakes formula lists 1/4 cup (16 g) wheat bran or 1/4 cup (28 g) wheat germ as an optional choice. The distinct masses stay intact; no equal-mass replacement is inferred.
- [Morning Glory Muffins](https://www.kingarthurbaking.com/recipes/morning-glory-muffins-recipe) lists 1/3 cup (42 g) sunflower seeds or 1/3 cup (43 g) wheat germ as optional. This remains specific to that formula and role.

The two alternatives are recorded as ledger evidence only. No density, default measure, active conversion, form, package yield, bundled recipe link, or runtime substitution rule was added. The 114-recipe / 1,123-line bundle has no wheat-germ demand.

## Files

- Updated `docs/catalog/research-ledger.v1.json` on the existing wheat-germ row, preserving prior identity sources and decisions. The existing chart source ID `WP07-KAB-IWC` was reused; the three recipe sources use the R624 IDs.
- No active reference, form, recipe, unit mapping, package-yield, or substitution-rule JSON changed for R624.
- Review proposal: [`wp02-a7-wheat-germ-measure-substitution-review-r624-20261018.md`](../../proposals/wp02-a7-wheat-germ-measure-substitution-review-r624-20261018.md).

## Validation

The full bundled seed package normalized and validated; the generated reference index was refreshed and is current; the research ledger schema and custom source/unit checks passed (2,198 records). No app tests were required specifically for this database-JSON-only evidence update under the current `AGENTS.md` rule. The separate R627 parser change was verified with focused unit and emulator tests.
