# WP02 Section A7 R647 integration — cornmeal label portion

## Decision

Recorded Bob’s Red Mill Canada’s declared serving of 1/4 cup (41 g) for its named coarse-ground cornmeal product as one manufacturer-label observation on the existing `ingredient-ref-cornmeal` ledger record. The Canadian French page identifies stone-ground whole corn, retained germ and bran, and whole-grain corn as the product ingredient. Its serving value remains limited to this product.

The page does not specify a cup-volume convention, filling method, or independent weighing procedure. The observation does not establish a generic cornmeal measure, density, unit mapping, conversion, recipe link, or substitution. The active cornmeal identity, Québec display, aliases, picker behavior, and all catalog numeric fields remain unchanged; corn grits remain separate.

## Integration and checks

- Reused existing OQLF source `S5-cornmeal` for terminology and grind-boundary evidence.
- Added the Bob’s Red Mill Canada manufacturer source and one `portion_weight` observation to the existing cornmeal ledger row; set measurement research to `researched_supported` while keeping substitution research `not_yet_researched`.
- Added one accepted decision bounded to the named product serving.
- Marked the A7 checklist and progress records complete and updated the active roadmap and workflow.
- Static seed-package validation and research-ledger schema, source ownership, and observation ownership checks passed. No app tests, build, emulator run, or deployment were needed because this only adds database JSON data under `AGENTS.md`.

## Sources

- [Bob’s Red Mill Canada — Semoule de maïs à broyage grossier](https://www.bobsredmill.ca/produit/semoule-de-mais-a-broyage-grossier)
- Existing ledger source `S5-cornmeal`: [OQLF — semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais)

See the [R647 proposal](../../proposals/wp02-a7-cornmeal-label-portion-review-r647-20261018.md). Section A7 remains open.
