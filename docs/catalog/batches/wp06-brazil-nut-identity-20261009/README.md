# WP06 Brazil nut identity integration and Pixel 9a QA

## Accepted scope

Added `ingredient-ref-brazil-nut` as `Brazil nut / noix du Brésil` in
`NUT_SEED_AND_DRIED_FRUIT`, separate from chestnut and mixed nuts. OQLF's entry identifies
*Bertholletia excelsa*. No aliases were activated: OQLF's alternate terms and the Portuguese
regional names are useful research evidence but do not fit the current English/French alias fields
without losing their language or scope. No form, density, unit mapping, measurement, conversion,
substitution, or recipe link was added.

## Evidence and package snapshot

- [OQLF Grand dictionnaire terminologique, noix du Brésil](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296932/noix-du-bresil), updated in 1991 and accessed 2026-10-09: pairs the preferred French term `noix du Brésil` with English `Brazil nut` and identifies *Bertholletia excelsa*. Other terms listed in the entry were not activated as aliases.
- [Brazil Ministry of Health, *Alimentos regionais brasileiros*, 2nd ed.](https://bvsms.saude.gov.br/bvs/publicacoes/alimentos_regionais_brasileiros_2ed.pdf), 2015: the North-region fruit contents entry on page 45 lists `castanha-do-brasil`, `castanha-do-pará`, and `castanha-da-amazônia`. This supports regional food context only. The PDF exceeded the browser viewer's payload limit during coordinator recheck, so it does not support the bilingual canonical name or any product form. Canonical source IDs are `WP06-SOUTHAM-20261009-S29` and `WP06-SOUTHAM-20261009-S11`; locator notes and regional gap review are in the [South American WP06 proposal](../../proposals/wp06-south-american-cuisine-gap-sweep-20261009.md).

After integration:

- 461 ingredient references; SHA-256
  `6db36eaa428b7695e249ed84f805bb1bda10dd86fd88973f370d043a0449dd00`.
- 17 ingredient forms.
- 627 research-ledger records, 848 source entries, and 743 distinct source IDs; ledger SHA-256
  `6ba0f8db7f8acd3f572f0b128029ebabc498dd10e053cd7af60eb8de972b3b83`.
- 99 legacy candidates; 114 recipes and 1,123 ingredient lines. The regional proposal's manifest
  scan found no Brazil-nut recipe-line hit.

## Verification

- Bundled package and research-ledger validation passed; the seed normalizer and generated catalog
  check passed at 461 references; `git diff --check` passed.
- All 9 Python package tests and all 286 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML test cases, 27 passed, 2
  skipped, 0 failures, and 0 errors. The repository deploy script installed and launched the debug
  app on this emulator.
- English query `Brazil nut` displayed `Brazil nut`. Accent-folded French query `noix du bresil`
  displayed `noix du Brésil`. The blank draft was discarded; French home returned to
  `Toutes les recettes (114)`.

## Screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English `Brazil nut` result | [english-brazil-nut-picker.png](english-brazil-nut-picker.png) | `2c11bd7a0ae57d60c91abd50b7213e6740679204ceb09a7a060b3d2b454ef963` |
| French `noix du Brésil` result | [french-brazil-nut-picker.png](french-brazil-nut-picker.png) | `821d350a547c4c3ed52305aa192971d140b8e4db88a679781c0c0ccf0e1e5753` |
| French library home after discarding the draft | [home-fr-ca-114.png](home-fr-ca-114.png) | `e3e160c3494c1a683510ab5ed576c597b8c46c5abd5812cd550fac1c6f50b964` |
