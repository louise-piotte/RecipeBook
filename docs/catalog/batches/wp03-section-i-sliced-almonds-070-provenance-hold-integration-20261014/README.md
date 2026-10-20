# WP03 Section I: Source-less Sliced-Almond Row Hold

Reviewed and integrated 2026-10-14. The broader Section I form review remains open.

## Decision

Keep saved recipe row `070#15` (`20 g sliced almonds`) unlinked to `ingredient-form-almonds-sliced`.
The recipe has no source metadata. Its note identifies Baked by an Introvert's Chocolate Coconut
Cake as inspiration, but the indexed current source lists no almonds. A separately reviewed current
Nanaimo Bars recipe uses roughly chopped almonds, which does not establish this row's sliced form or
provenance. The existing sourced sliced-almond links on `003#6` and `110#16` remain unchanged.

No recipe or database data changed. The source register remains proposal-local; no ledger record or
new form was added.

## Integration and validation

- Added a candidate-specific hold item under the still-open Section I nut-form checklist.
- Updated `roadmap.md` with the provenance decision.
- UTF-8/no-BOM, local-link, and whitespace checks passed. This documentation-only decision required
  no tests.

See the detailed [provenance review](../../proposals/wp03-section-i-sliced-almonds-070-provenance-boundary-review-20261014.md).

## Main sources

- Baked by an Introvert's [Chocolate Coconut Cake](https://www.bakedbyanintrovert.com/chocolate-coconut-cake/)
  is named as inspiration in the saved recipe note; its current indexed ingredient list does not
  include almonds.
- Mrs Jones's Kitchen [Nanaimo Bars](https://www.mrsjoneskitchen.com/nanaimo-bars/) specifies
  roughly chopped almonds, not sliced almonds, in a different recipe.
- The existing [OQLF definition of amandes effilées](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541577/amandes-effilees)
  supports the sliced-almond form name and boundary; it does not attribute the saved 070#15 row.
