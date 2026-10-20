# WP04 Section P R95: Spot Prawn Picker Boundary Hold

Review date: 2026-10-14
Decision: documentation-only picker and identity hold.

## Decision

Keep *Pandalus platyceros* outside the active reference catalog and research ledger for now.
Fisheries and Oceans Canada identifies the species as `crevette tachetée`; CFIA lists `Spot Prawn`
and `Spot Shrimp` for it, while also assigning the generic name `Prawn` to multiple shrimp taxa.
The phrase-first picker would return this species alone for `prawn`, implying a narrower meaning than
the Canadian naming source supports. Using only `spot shrimp` would leave the Canadian `spot prawn`
name unsearchable.

Québec product and menu evidence supports local use of `crevette tachetée`, but the bundle has no
spot-prawn demand. Package weights, counts, and the mixed-species CNF portion do not support reusable
measures for this species. Add no reference, ledger record, alias, form, measure, recipe link,
conversion, yield, or substitution.

## Integration record

- Checked the candidate-specific item under the still-open Section P shrimp/prawn checklist.
- No catalog or ledger JSON changed; the global plan and roadmap record only this hold decision.
- No application tests were run because this integration changes documentation only.

See the detailed [R95 review](../../proposals/wp04-section-p-r95-spot-prawn-picker-boundary-review-20261014.md).

## Main sources

- Fisheries and Oceans Canada identifies *Pandalus platyceros* as `crevette tachetée` in its
  [French species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/prawn-crevette-tachetee-fra.html).
- The [CFIA Fish List shrimp results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=shrimp&wbdisable=true)
  list `Spot Prawn` and `Spot Shrimp` for the species and `Prawn` for other taxa.
- Montréal fishmonger La Mer lists a 227 g Québec-market product as
  [crevette tachetée congelée](https://www.lamer.ca/products/queue-crevette-tachetee-congele-c-b).
- The current [Moku Bistro French menu](https://mokubistro.com/fr/) uses `crevette tachetée` for
  Botan Ebi; it does not identify that menu item by scientific name.
- Canadian Living's [Spot Prawn Scampi](https://www.canadianliving.com/food/lunch-and-dinner/recipe/spot-prawn-scampi)
  suggests large shrimp as a replacement only for its off-season recipe.
