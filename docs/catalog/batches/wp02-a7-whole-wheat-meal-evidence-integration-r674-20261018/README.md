# WP02 Section A7 R674 — whole-wheat-meal evidence hold

Integrated 2026-10-18. Added Delishar's double-chocolate-muffin recipe as a source-scoped research lead on the existing `ingredient-ref-wheat-meal` record. The recipe reports **1 cup (128 g)** whole wheat/meal flour and allows an all-purpose-flour alternative in that formula, but it does not specify a coarse meal grade matching the active whole-wheat-meal identity.

## Ledger change

- Added the Delishar source once as `WP02-A7-WHOLE-WHEAT-MEAL-R674-20261018-S01`.
- Set measurement and substitution research states to `blocked_pending_evidence` pending confirmation that the recipe's flour matches coarse whole-wheat meal.
- Recorded one blocked, formula-scoped finding for the all-purpose-flour alternative. Added no measurement observation; the published amount remains source evidence only.
- Kept the active reference, aliases, picker behavior, forms, density, mappings, conversions, recipe links, yields, and substitution rules unchanged.
- The 114 bundled recipes / 1,123 ingredient rows contain no matching target recipe.

The OQLF definition continues to scope the active identity to `farine de blé entier brute / whole wheat meal` and `coarse whole wheat flour`. A matching source grade is still needed before attaching the recipe quantity or alternative to the active identity.

## Validation

Static ledger schema/custom validation, source-ID/URL ownership, decision-source resolution, package/index integrity, recipe-corpus, encoding, and documentation checks passed. No software tests, build, emulator, or deployment were run because this update only adds database JSON data under [AGENTS.md](../../../../AGENTS.md).

At integration time the package contained 1,837 ingredient references, 167 forms, and 114 bundled recipes; the ledger contained 2,213 records.
