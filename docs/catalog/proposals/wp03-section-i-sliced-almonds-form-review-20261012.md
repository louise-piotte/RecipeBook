# WP03 Section I sliced almonds form review — 2026-10-12

## Decision

Add `ingredient-form-almonds-sliced` under `ingredient-ref-almonds` with labels
`sliced almonds / amandes effilées`. Use OQLF’s accepted French terms `amandes émincées` and
`amandes en lamelles`, plus the English synonym `flaked almonds` as match terms. The OQLF defines
this form as thin slices cut lengthwise and says the almonds may be blanched or not; the form does
not encode skin state.

Link only the two rows with source metadata:

| Recipe row | Preserved original text | Source |
|---|---|---|
| 003#6 | `sliced almonds for rolling` | Foodtasia, Italian Almond Paste Cookies |
| 110#16 | `1/2 cup sliced almonds` | TBLSPOON, Almond Frangipane Mini Tarts |

Recipe 070#15 also asks for sliced almonds but has no source metadata, so it remains unlinked pending
provenance. No recipe text, quantity, unit, notes, or preparation string changed. No density, measure,
unit mapping, conversion, yield, or substitution was added. The wider nut and seed form review remains
open.

## Evidence

- [OQLF, amandes effilées](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541577/amandes-effilees) defines thin lengthwise slices, gives the accepted French variants and the English terms “sliced almond” and “flaked almond,” and says the almonds may be blanched or not.
- [Foodtasia, The Best Italian Almond Paste Cookies](https://foodtasia.com/almond-paste-cookies/) names sliced almonds for rolling and instructs pressing almond slices onto the cookies. It distinguishes chopped almonds as another topping option.
- [TBLSPOON, Almond Frangipane Mini Tarts](https://www.tblspoon.com/home/almond-frangipane-mini-tarts) names a sliced-almond topping. Its 1/2 cup quantity is recipe-specific and is not used as a conversion.

## Ledger scope

The `ingredient_form` ledger record reuses Foodtasia source `WP07-EGG-20261010-S09` with an almond-form
locator, and adds separate OQLF and TBLSPOON source entries. Measurement and substitution states
remain `not_yet_researched`; no measurement observation is added.
