# WP07 lemon-juice portion observations — 2026-10-12

## Integration

Added two source records and four source-specific `portion_weight` observations to
`ingredient-ref-lemon-juice` in `docs/catalog/research-ledger.v1.json`:

- USDA SR28 NDB 09152: 244 g per cup, 30.5 g per fluid ounce, and 48 g per “lemon yields.”
- King Arthur Baking Ingredient Weight Chart: 14 g per tablespoon.

The observations preserve the source food descriptions and the missing cup convention, filling,
juice preparation, fruit size, and extraction-method details. No values were averaged or derived.
The active bundled reference still has `defaultDensity: null` and no unit mappings. No ingredient
form, conversion, substitution rule, or recipe line changed.

The bundled corpus contains eight exact `lemon juice` ingredient rows in eight recipes. Seven rows
use spoon measures and one calls for 60 mL of fresh lemon juice.

## Verification

- Research-ledger schema/evidence validation: 1,609 records, zero errors.
- Checked the four observation IDs and values against the source-qualified ledger record.
- Confirmed the active reference still has null density and empty unit mappings.
- UTF-8/no-BOM, escaped-Unicode, mojibake, and scoped whitespace checks passed.
- No app tests or emulator checks were run. This batch only adds database JSON evidence and related
  documentation, so `AGENTS.md` does not require tests.

## Sources

- [USDA ARS, SR28: Lemon juice, raw (NDB No. 09152)](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf)
- [King Arthur Baking, Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart)

See [the proposal](../../proposals/wp07-lemon-juice-portion-observations-review-20261012.md) for
the source register, full measurement limits, and decision.
