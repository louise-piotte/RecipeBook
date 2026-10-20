# WP02 B3 R595 — tapioca-starch chart portions

Date: 2026-10-17

## Decision

Added two source-specific `portion_weight` observations to the existing `ingredient-ref-tapioca-starch` ledger record:

- King Arthur Baking chart: 1 cup tapioca starch or flour = 113 g.
- Bob’s Red Mill chart: 1 cup tapioca flour/starch = 120 g. Its same row also lists 1/4 cup = 30 g; only the one-cup observation was recorded.

The observations remain separate because the charts differ by 7 g per nominal cup and do not define a common cup capacity or a tapioca-row-specific filling method. Kept `measurementState: blocked_pending_evidence`; the reference retains `defaultDensity: null` and `unitMappings: []`. The existing directional qualitative tapioca-starch-to-cornstarch substitution finding remains unchanged. No form, active conversion, recipe link, yield, or substitution change was added.

## Evidence

- King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart): the “Tapioca starch or flour” row lists 1 cup = 4 oz = 113 g. The separate quick-cooking-tapioca row was excluded.
- Bob’s Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart): its “Tapioca Flour/Starch” row lists 30 g per 1/4 cup and 120 g per 1 cup. Only the one-cup portion is recorded.
- The existing OQLF source `WP02-S24` continues to support the FR-CA display `fécule de manioc`, the English term tapioca starch, and the extracted-starch identity. Existing aliases and forms were not changed.

See the [R595 proposal](../../proposals/wp02-b3-tapioca-starch-measurement-review-r595-20261017.md), the [B3 starch checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3042), and the broader [B2/B3 review](../../../RecipeBook-global-ingredient-catalog-plan.txt#L15900). Both larger plan items remain open.

## Static verification

Research-ledger schema and source-URL ownership validation, bundled package validation, reference normalizer, generated-index freshness, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No application tests, build, emulator check, or deployment were needed because this change only adds database JSON data and tracking documentation under `AGENTS.md`.
