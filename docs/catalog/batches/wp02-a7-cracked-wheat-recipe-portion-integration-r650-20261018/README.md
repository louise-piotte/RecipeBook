# WP02 Section A7 R650 integration — cracked-wheat recipe portion

## Decision

Recorded King Arthur Test Kitchen's published 1/4 cup (39 g) of cracked wheat in its *Harvest Wheat Bread for the Bread Machine* formula as one source-bounded observation on the existing `ingredient-ref-cracked-wheat` research-ledger row. The recipe lists the cracked wheat before combining it with boiling water and soaking for 30 minutes. It yields one 8 1/2-inch by 4 1/2-inch loaf.

The page does not name a product or brand, specify particle size, or report a cup-fill or independent weighing method. The pair remains specific to that formula. It does not establish a reusable measure, product or grind equivalence, density, mapping, conversion, per-serving amount, or cooking yield. The active identity, aliases, picker behavior, density, forms, and substitution behavior remain unchanged. The 40 g Dalia serving remains excluded from cracked-wheat evidence.

## Integration and checks

- Reused existing Canadian standard source `WP02-S101` for the cracked-wheat identity and grind boundary.
- Added one King Arthur Test Kitchen source and one `portion_weight` observation to the existing ledger row; set measurement research to `researched_supported` and kept substitution research `not_yet_researched`.
- Added one accepted decision with the formula-specific limits.
- Marked the A7 checklist and progress records complete and updated the active roadmap and workflow.
- Static seed-package validation and ledger schema, source ownership, and observation ownership checks passed. No app tests, build, emulator run, or deployment were needed because this only adds database JSON data under `AGENTS.md`.

## Sources

- [King Arthur Baking Test Kitchen — Harvest Wheat Bread for the Bread Machine](https://www.kingarthurbaking.com/recipes/harvest-wheat-bread-for-the-bread-machine-recipe)
- Existing ledger source `WP02-S101`: Canadian Food Compositional Standards, standard 12.1.7.

See the [R650 proposal](../../proposals/wp02-a7-cracked-wheat-recipe-portion-review-r650-20261018.md). Section A7 remains open.
