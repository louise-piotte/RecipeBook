# WP02 B2: sprouted black-bean-flour form integration

Integrated on 2026-10-12 from the [focused form-boundary review](../../proposals/wp02-b2-sprouted-black-bean-flour-form-boundary-review-20261012.md).

## Catalog change

Added `ingredient-form-black-bean-flour-sprouted` under `ingredient-ref-black-bean-flour` with `formCode` and `prepState` set to `sprouted`. The labels are `sprouted black bean flour / farine de haricots noirs germés`; `matchTerms` is empty. This is one named process form, not a second ingredient identity or an alias on the base flour.

The base reference remains unchanged: no aliases, `defaultDensity: null`, and `unitMappings: []`. The existing `0.515 g/mL` research observation belongs to one selected dry, unsprouted sample and is not assigned to the new form. The form ledger record has no supported measurement or substitute; no conversion, yield, recipe link, or substitution was added.

Canadian product and ingredient wording supports the process-form name, but the sources do not establish a universal species lot, sprouting or drying protocol, dehulling state, household measure, or recipe ratio. The French compound is attested in a Canadian French ingredient declaration; it is not presented as an OQLF ruling. No bundled recipe requires this form: all 114 manifest-listed files and 1,123 ingredient rows were scanned, with zero phrase hits and zero linked rows.

## Validation record

- Seed package validation passed.
- Ingredient-reference normalization check passed.
- Generated bundled-catalog index is current at 1,288 references.
- Research ledger validation reports 1,596 records and zero errors.
- Exact ownership checks find one owner for each sprouted-flour label; no duplicate owner or legacy candidate was found.
- Recipe corpus remains 114 files / 1,123 rows, with no candidate phrase hit and no row linked to the base flour or new form.
- JSON is UTF-8 without BOM and uses escaped non-ASCII text. Documentation links and whitespace were checked.
- Final data counts: 1,288 references, 98 forms, 1,596 ledger records, 5,718 source entries, and 4,743 distinct source IDs.
- SHA-256: references `d20bc95f97b8d78ee6709655f3321ff000925c135862fd15cbc52e7d85e473ad`; forms `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c`; research ledger `91c80a5c5fc283dbdea2b1e6bda350f0eb1caf08ca8e4a596bd0a99cd5e9ceb1`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; recipe corpus `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

No app tests or emulator checks were run because this change only adds database JSON data under the updated `AGENTS.md` rule.
