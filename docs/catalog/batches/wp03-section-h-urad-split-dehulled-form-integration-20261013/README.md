# WP03 Section H split/dehulled urad form — R73 integration

## Decision

Added one dried form, `ingredient-form-urad-beans-split-dehulled`, under the existing `ingredient-ref-urad-beans` identity for *Vigna mungo*. The form uses `split_dehulled` for `formCode` and `prepState`, with English label `split, dehulled urad beans` and descriptive French label `haricots urd fendus et décortiqués`. Match terms remain fully qualified: `split huskless black matpe beans`, `split and dehusked black gram`, and the same-SKU French wording `haricots matpe noirs écossés fendus`.

Unqualified `urad dal`, `black gram dal`, `haricot mungo`, and `black lentils` were not added. The eNAM commodity class allows split product with or without husk. The ICAR-CIPHET report's 842 kg/m³ observation is for a broader mixture of dehulled whole and split dal and does not isolate this form. The ledger records no supported exact-form measurement or substitution.

## Data changes

- Added the form to `ingredient-forms.v1.json` and nine evidence sources plus an accepted form decision to its ledger record.
- Kept the parent reference, all recipes, and the generated reference index unchanged.
- Added no density, unit mapping, package yield, cooking yield, conversion, recipe link, or substitution.

No app tests or emulator checks were run because this integration only adds database JSON data. Static validation covered package normalization, form/ledger structure, source IDs, encoding, local links, and whitespace. See the [proposal](../../proposals/wp03-section-h-urad-split-dehulled-form-review-20261013-r73.md) and the [global plan](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3445).
