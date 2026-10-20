# WP07 lemon-juice portion observations — 2026-10-12

**Status:** Integrated into the research ledger; no active conversion was added.

## Decision

Record source-specific raw lemon-juice portion observations on the existing
`ingredient-ref-lemon-juice` ledger record:

- USDA SR28, NDB No. 09152, lists 244 g per cup, 30.5 g per fluid ounce, and 48 g per
  “lemon yields.” The source does not state the cup capacity, filling method, lemon size, or
  extraction method.
- King Arthur Baking's Ingredient Weight Chart lists lemon juice at 14 g per tablespoon. It does not
  specify whether this means raw/fresh or another lemon-juice preparation.

Keep the four observations separate and source-qualified. They do not support a generic density or
active unit mapping. Do not derive a tablespoon weight from the USDA cup measure, infer a universal
lemon count yield, or generalize the USDA raw-juice result to bottled or reconstituted products.
The existing reference keeps `defaultDensity` null and `unitMappings` empty; no recipe lines,
ingredient forms, conversions, or substitution rules changed.

## Recipe demand

The bundled corpus contains eight exact `lemon juice` ingredient rows across eight recipes. Seven
use spoon measures and one uses 60 mL of fresh lemon juice. This supports preserving the source
observations for review, but not enabling a conversion or changing the recipe lines.

## Sources

| ID | Source | Supports |
|---|---|---|
| `WP07-LEMON-20261012-S01` | [USDA ARS, SR28: Lemon juice, raw (NDB No. 09152)](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf) | The source's common-measures table reports 244 g per cup, 30.5 g per fluid ounce, and 48 g per lemon yield. |
| `WP07-LEMON-20261012-S02` | [King Arthur Baking, Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) | The lemon-juice row reports 1 tablespoon = 1/2 ounce = 14 g. The chart notes that gram values may differ from recipe-site values because of rounding. |

## Remaining limits

The observation-only evidence does not establish a source-neutral conversion. Cup conventions,
raw/fresh versus bottled or reconstituted product scope, and whole-lemon size/yield remain
unresolved. No density or unit mapping should be activated from this batch.
