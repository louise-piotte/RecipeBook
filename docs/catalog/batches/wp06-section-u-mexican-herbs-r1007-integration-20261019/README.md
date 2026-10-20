# WP06 Section U Mexican herb integration, R1007

Integrated the terminology review and generic pápalo identity described in the [proposal](../../proposals/wp06-section-u-mexican-herbs-papalo-french-review-r1007-20261019.md).

- Updated the existing epazote reference to the OQLF-preferred French display `épazote` and added `fausse-ambroisie` as a French alias.
- Added the source-backed Mexican culinary aliases `acuyo` and `hierba santa` to the existing hoja-santa reference. The avocado-leaf identity remains separate.
- Added identity-only `papalo / pápalo` in `HERB`. No aliases, forms, recipe links, measurements, conversions, yields, or active substitutions were added.
- Recorded SADER’s broad pápalo-for-cilantro statement as blocked pending contextual evidence. Product or recipe amounts were not generalized.
- No brand, product-line, flavour, SKU, or retailer-variant work was pursued. Existing branded references and product-specific evidence remain untouched.

The pre-change package audit found 2,018 references, 205 forms, 99 legacy candidates, and 114 recipes / 1,123 ingredient rows. No exact pápalo candidate or recipe match was found.

## Static validation

- Bundled seed package validation passed; final catalog has 2,019 references and 205 forms.
- Research-ledger schema and source-ownership validation passed with 2,425 records and zero errors. Three new source IDs were added.
- Generated Kotlin ingredient index is current at 2,019 references.
- Exact normalized ownership checks found one intended reference for `fausse-ambroisie`, `acuyo`, `hierba santa`, `papalo`, and `pápalo`; no competitor in forms or legacy candidates. The recipe scan found zero matches in 114 files / 1,123 ingredient rows.
- UTF-8/no-BOM checks passed for the seed JSON, ledger, generated index, proposal, batch README, plan, and roadmap. Scoped `git diff --check` passed.

No software tests, build, emulator, or deployment were run: the app change only adds database JSON data, covered by the exception in `AGENTS.md`.

