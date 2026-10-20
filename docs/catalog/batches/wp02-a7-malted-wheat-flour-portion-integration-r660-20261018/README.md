# WP02 Section A7 R660 integration — malted-wheat-flour recipe portion

Integrated on 2026-10-18 after root review of the [R660 proposal](../../proposals/wp02-a7-malted-wheat-flour-portion-review-r660-20261018.md).

## Decision

Recorded one `portion_weight` observation of 50 g on the existing `ingredient-ref-malted-wheat-flour` ledger row. Hodmedod's named *Malted Loaf* recipe makes one loaf and lists `50g Malted Wheat Flour or Malted Naked Oat Flour`. The ledger observation covers only the wheat-flour option and retains the alternative in its source-specific description; it does not create a substitution rule or transfer the option to other recipes.

Attached the existing Hodmedod source record `WP02-A7-ROASTED-OAT-MALT-FLOUR-20261013-R30-S04` to the wheat row without changing its metadata on existing owners; all three owners carry the same source object. The recipe line directly supports the amount. Molino Moras's malted soft-wheat flour page gives brand/product-specific percentage guidance and a 500 g package; IRCA's OROMALT page gives high-diastatic wheat-malt identity, commercial bag sizes, and product/application-specific dosage directions. These do not establish a household measure, transferable density, or general use amount.

Set `measurementState` to `researched_supported`; left `substitutionResearchState` at `not_yet_researched`. No active reference data, picker behavior, density, unit mappings, forms, conversions, yields, recipe links, or substitution rules changed.

## Sources

- [Hodmedod's — Malted Loaf](https://hodmedods.co.uk/blogs/recipes/malted-naked-oat-loaf), published June 28, 2022; one-loaf formula and 50 g ingredient line.
- [Molino Moras — Malted Wheat Flour](https://www.molinomoras.live/en/products/malted-wheat-flour), product identity, use advice, dosage guidance, ingredients, and 500 g packaging.
- [IRCA Group — OROMALT](https://www.ircagroup.com/en/products/oromalt), product identity, professional package sizes, and directions for use.

## Validation

Ledger schema/custom validation, source and observation ID ownership, reused-source metadata equality, UTF-8/no-BOM, local links, scoped whitespace, and `git diff --check` passed. The ledger has 2,208 rows after R658 and R660 integration, with zero validation errors. No software tests, app build, emulator run, or deployment were needed for this database-JSON-only change under `AGENTS.md`.
