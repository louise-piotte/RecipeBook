# WP02 Section A7 R656 integration — Khorasan semolina recipe portion

## Decision

Recorded Kitchen Stories' published **70 g of kamut semolina** in its *Kamut semolina porridge* formula on the existing `ingredient-ref-khorasan-semolina` research-ledger row. The page marks the complete formula as two servings and directs adding the semolina to heated plant-based milk. The amount remains specific to that formula.

The recipe gives no volume, cup-fill method, separate weighing procedure, product SKU, or milling grade. Do not divide the amount into a per-serving quantity. The KAMUT brand-owner source confirms that semolina, re-milled semolina, and whole semolina are distinct product classes; no grade or producer is assigned by the recipe. No alias, reusable measure, density, mapping, conversion, form, package yield, recipe link, or substitution was added. Active names, picker behavior, null density, and empty mappings remain unchanged; substitution research remains open.

## Integration and checks

- Added one recipe source, one `portion_weight` observation, and one accepted decision to the existing Khorasan-semolina ledger record; changed measurement state to `researched_supported`.
- Static package and generated-index validation, ledger schema/custom validation, source and observation ownership checks, UTF-8/no-BOM, local-link, whitespace, and scoped diff checks passed. The 114-recipe / 1,123-row bundle is unchanged and has no matching demand.
- No app tests, build, emulator run, or deployment were performed. The change only adds database JSON data under `AGENTS.md`.

## Sources

- [Kitchen Stories — Kamut semolina porridge](https://www.kitchenstories.com/en/recipes/kamut-semolina-porridge)
- [KAMUT International — Flour](https://www.kamut.com/flour)
- Existing ledger source `WP02-A7-KHORASAN-SEMOLINA-R469-20261017-S01` for the brand-owner product-range description.

See the [R656 proposal](../../proposals/wp02-a7-khorasan-semolina-recipe-portion-review-r656-20261018.md). Section A7 remains open.
