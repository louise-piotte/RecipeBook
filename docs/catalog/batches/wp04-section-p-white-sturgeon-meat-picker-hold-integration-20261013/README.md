# WP04 Section P white-sturgeon meat picker hold — 2026-10-13

Integrated the [round-66 white-sturgeon review](../../proposals/wp04-section-p-white-sturgeon-meat-species-boundary-review-20261013-round66.md).

## Decision

Keep white sturgeon flesh outside active references, forms, and the research ledger. Canadian
sources establish a farmed white-sturgeon fillet product and the Canadian French name `esturgeon
blanc`; however, CFIA assigns broad `sturgeon / esturgeon` names across multiple taxa, and Québec
uses `esturgeon jaune` for lake sturgeon. Under the current phrase-first search, one white-sturgeon
row would make both broad searches return that species alone. No bundled recipe requests sturgeon.

Do not create a generic sturgeon identity or alias lake sturgeon, caviar, or other sturgeon species
to white sturgeon. The seller's side weight, a separate Québec retailer portion, mixed-species
Canadian Nutrient File serving, and age-specific processing yields do not support an active
conversion, measure, density, yield, or substitution.

No catalog or research-ledger data changed. Revisit only if recipe demand appears and picker results
can preserve the broader species choices.

## Checks

- Read-only reference, form, ledger, and recipe search found no existing white-sturgeon allocation or recipe demand.
- Current `IngredientSearch` projection confirms a single searchable species row would own broad `sturgeon` and `esturgeon` phrase results.
- No app tests or emulator checks were run; this is a documentation-only hold.

Section P remains open.
