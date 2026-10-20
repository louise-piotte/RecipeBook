# WP02 Section A7 R659 integration — roasted-wheat-flour measurement review

Integrated on 2026-10-18 after root review of the [R659 proposal](../../proposals/wp02-a7-roasted-wheat-flour-measurement-review-r659-20261018.md).

## Ledger decision

- Set `measurementState` to `researched_no_supported_value` on the existing `ingredient-ref-roasted-wheat-flour` record.
- Refreshed its two existing manufacturer source entries (`WP02-S126` and `WP02-S127`) with current page locators and the measurement limits. Added no source ID or URL and appended one accepted decision.
- The current [English product page](https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/) and [French product page](https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/) provide product names and broad bakery-use suggestions, but no recipe quantity, serving, package amount, mass-volume pair, density, or measurement method.
- Kept measurement observations empty and substitution research `not_yet_researched`. Active density remains null; unit mappings remain empty. The reference, aliases, forms, picker behavior, conversions, yields, recipe links, and substitutions are unchanged.

## Validation

- Ledger schema/custom validation passed with zero errors; both source IDs and URLs remain owned by this record.
- Static package validation, generated-index freshness, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed because this change only updates database JSON data under `AGENTS.md`.

Section A7 remains open.
