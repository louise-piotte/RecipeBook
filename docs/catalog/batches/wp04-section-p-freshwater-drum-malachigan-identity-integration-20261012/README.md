# WP04 Section P — freshwater drum / malachigan identity integration (2026-10-12)

## Decision

Added identity-only `freshwater drum / malachigan` as `ingredient-ref-freshwater-drum` in `PROTEIN`
for *Aplodinotus grunniens*. Both alias arrays are empty. OQLF lists the species in its edible-fish
domain, identifies `malachigan` as the preferred Québec term, and maps it to English `freshwater
drum`; TERMIUM and CFIA support the Canadian species/name boundary.

Keep overlapping `sheepshead` and `white perch` terms, Red Drum / `tambour rouge`, Sheepshead Porgy,
Silver Bass, and other taxa distinct. The complete 114-recipe / 1,123-row bundle contains no matching
request. No form, measure, density, unit mapping, recipe link, conversion, yield, package data, or
substitution was added. The ledger records seven sources, no supported measurement value, and no
supported substitute.

## Evidence and review

The [source-backed proposal](../../proposals/wp04-section-p-freshwater-drum-malachigan-identity-boundary-review-20261012.md)
contains the ownership audit, picker projection, recipe scan, limits, and pre-integration snapshot.

Key sources:

- Office québécois de la langue française, [malachigan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198998/malachigan), which identifies *Aplodinotus grunniens*, gives `malachigan` as preferred in Québec, and maps it to `freshwater drum`.
- Government of Canada Translation Bureau, [TERMIUM Plus: SHEEPHEAD](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enr&lang=eng&srchtxt=SHEEPHEAD), which supplies the species-linked English/French name pair and marks overlapping synonyms.
- Canadian Food Inspection Agency, [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), which describes the list of common English/French fish-label names and their scientific names; the proposal records the species-specific Drum query and neighboring taxa.

## Static validation

- Bundled seed package validation passed at 1,288 references, 97 forms, and 114 recipe files.
- Reference normalization and generated Kotlin catalog checks passed; the generated index contains 1,288 references.
- Research ledger validation passed with 1,595 records, 5,706 source entries, 4,737 distinct source IDs, and 8 unit conversions.
- Exact normalized-key ownership found one active owner for `freshwater drum` and `malachigan`; the other qualified/overlapping aliases remain unassigned.
- The 114-file, 1,123-row recipe corpus has zero candidate hits; its digest is unchanged.
- UTF-8 without BOM, escaped JSON Unicode, and scoped whitespace checks passed.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Post-integration fingerprints

| Artifact | SHA-256 |
| --- | --- |
| Ingredient references (1,288) | `d20bc95f97b8d78ee6709655f3321ff000925c135862fd15cbc52e7d85e473ad` |
| Research ledger (1,595 records) | `7d0f8e6e322c07556841bba258220a467b58daf29934e25f554738db735c019b` |
| Ingredient forms (97) | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| Manifest | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
