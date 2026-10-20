# WP02 Section A7 R653 integration — remilled durum-semolina recipe portion

## Decision

Recorded Caputo Flour's published **300 g Caputo Semolina Flour** amount in its *Traditional Semolina Pasta Dough* formula on the existing `ingredient-ref-semola-rimacinata` research-ledger row. Caputo describes this product as pure durum wheat and double-milled. The recipe links the named flour to that product page, so the observation is specific to this brand and formula.

The recipe also reports 460 g of prepared dough and 160–180 g water. The 460 g figure is a dough yield, not a semolina yield or serving amount. No volume, cup-fill method, separate weighing procedure, reusable measure, density, mapping, conversion, form, recipe link, or substitution is established. Ordinary durum semolina values from R635 remain on their separate ledger row. The active identity, aliases, picker behavior, density, and mappings are unchanged; substitution research remains open.

## Integration and checks

- Added two Caputo sources, one `portion_weight` observation, and one accepted decision to the existing remilled-durum-semolina ledger record; changed measurement state to `researched_supported`.
- Updated the A7 nested checklist and progress log, `roadmap.md`, the workflow, and the R653 proposal status.
- Ledger schema and custom validation passed with zero errors across 2,206 records. Source and observation IDs are unique. Package validation passed; all 114 manifest-listed recipes / 1,123 structured ingredient rows remain unchanged and have no matching demand.
- No app tests, build, emulator run, or deployment were performed. The change only adds research-ledger database JSON under `AGENTS.md`.

## Sources

- [Caputo Flour — Caputo Semolina Flour](https://caputoflour.com/products/caputo-semolina-flour)
- [Caputo Flour — Traditional Semolina Pasta Dough](https://caputoflour.com/blogs/recipes/traditional-semolina-pasta-dough)
- Existing ledger sources `WP02A2-S05` and `WP02A2-S06` for the remilled-semolina identity boundary.

See the [R653 proposal](../../proposals/wp02-a7-remilled-durum-semolina-recipe-portion-review-r653-20261018.md). Section A7 remains open.
