# WP03 Section I sliced almonds form integration — 2026-10-12

## Decision

Added `ingredient-form-almonds-sliced` (`sliced almonds / amandes effilées`) under
`ingredient-ref-almonds`. OQLF supports the Québec French label and the match terms
`amandes émincées`, `amandes en lamelles`, and `flaked almonds`. The form represents thin lengthwise
slices; blanching remains unspecified because the OQLF entry says the almonds may be blanched or not.

Linked recipe 003#6 (`sliced almonds for rolling`) and 110#16 (`1/2 cup sliced almonds`). Both rows
have source metadata. Preserved their original text, amounts, units, notes, and preparation strings.
Recipe 070#15 requests sliced almonds too, but has no source metadata and remains unlinked pending
provenance. No measure, density, unit mapping, conversion, yield, or substitution was added.

See the [source review](../../proposals/wp03-section-i-sliced-almonds-form-review-20261012.md). Other
nut and seed forms remain open.

## Evidence

- [OQLF, amandes effilées](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541577/amandes-effilees): form definition, bilingual terminology, and blanching boundary.
- [Foodtasia, Italian Almond Paste Cookies](https://foodtasia.com/almond-paste-cookies/): sliced almonds for rolling; the instructions describe pressing almond slices onto the cookies.
- [TBLSPOON, Almond Frangipane Mini Tarts](https://www.tblspoon.com/home/almond-frangipane-mini-tarts): sliced almonds used as the tart topping.

## Static verification

- Bundled package validation passed.
- Ingredient-reference normalization passed; the generated catalog is current at 1,243 references.
- Research ledger validation passed with 1,544 records and 0 errors.
- The six French and English form terms have unique catalog ownership. Rows 003#6 and 110#16 link to the form; source-less row 070#15 remains unlinked.
- All 114 recipes and 1,123 ingredient rows remain present. The recipe corpus is 753,411 bytes with manifest-ordered SHA-256 `7be0fba0b0e0b14e22604a1b32ef5b488321051fe3a38d5007aa92f47da94e21`.
- Updated JSON has no BOM and stores non-ASCII text as Unicode escapes. Scoped `git diff --check` passed.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-forms.v1.json` | 89 forms | `fcc4845d3f66de4ad042889ceba19c7505fd3148916d28ec93b23520c44125ac` |
| `research-ledger.v1.json` | 1,544 records; 5,354 source entries; 4,394 distinct source IDs | `acfe7bd7e802c292cac13f90415500661e147fc4d1f02b5682ec5e2d06426f37` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,411 bytes | `7be0fba0b0e0b14e22604a1b32ef5b488321051fe3a38d5007aa92f47da94e21` |
