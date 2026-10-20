# WP02 Section A7 R646 integration — cracked-rye recipe portion

## Decision

Recorded Janie's Mill's published ⅓ cup (70 g) of its Organic Cracked Rye in its Pumpkin Rye Scones formula on the existing `ingredient-ref-cracked-rye` research-ledger row. The ingredient amount is before cooking. The recipe does not report a cup-fill or independent weighing procedure, cooked mass or volume, or a per-scone quantity, so none was inferred.

The observation is limited to this mill product in this formula. It does not establish a reusable cracked-rye measure, density, unit conversion, cooking yield, recipe link, or substitution. The active identity, aliases, forms, picker behavior, and all other catalog fields remain unchanged.

## Integration and checks

- Reused the existing Janie's Mill product-boundary source and added the current product and recipe pages as source records.
- Set the ledger measurement state to `researched_supported` for this recorded finding and kept substitution research at `not_yet_researched`.
- Added one `portion_weight` observation with the source-published 70 g value and a new accepted, source-bounded decision.
- Marked the A7 checklist and progress records complete and updated the active roadmap and workflow.
- Static seed-package validation and research-ledger schema, source ownership, and observation ownership checks passed. No app tests, build, emulator run, or deployment were needed because this only adds database JSON data under `AGENTS.md`.

## Sources

- [Janie's Mill — Organic Cracked Rye](https://www.janiesmill.com/products/cracked-rye-chops)
- [Janie's Mill — Pumpkin Rye Scones](https://www.janiesmill.com/blogs/recipes/pumpkin-rye-scones)
- Existing ledger source `WP03-CRYE-20261012-S06` for the product identity boundary.

See the [R646 proposal](../../proposals/wp02-a7-cracked-rye-recipe-portion-review-r646-20261018.md). Section A7 remains open.
