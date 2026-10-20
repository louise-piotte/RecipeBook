# WP02 B2: Almond-flour measurement and substitution research

## Integration

Added five source records, three product-specific portion observations, and one bounded substitution
finding to the existing `ingredient-ref-almond-flour` research-ledger record. The observations retain
the King Arthur chart/package-recipe value of 1 cup = 96 g, the same package's nutrition portion of
1/8 cup = 16 g, and Bob's Red Mill Canada's 2 tbsp = 14 g serving separately. The two King Arthur
values conflict when scaled; none is an active conversion, density, or default measure.

The substitution research records the overlap between Bob's Red Mill Canada and King Arthur on a
possible 25% baking replacement, along with the limits that block a reusable contextual rule for the
current unqualified catalog identity. No global or contextual substitution, form, recipe link, active
measurement, ingredient-reference field, or manifest entry changed.

## Validation

- The research ledger and bundled package validate; the generated ingredient catalog remains current.
- Source IDs resolve, and `tbsp` is a canonical unit ID.
- UTF-8/no-BOM and scoped whitespace checks pass.
- No app or emulator tests were run because this change only adds research data to JSON files.

The broader WP02 B2/B3 review remains open. See the [measurement follow-up proposal](../../proposals/wp02-b2-almond-flour-measurement-followup-20261012.md).
