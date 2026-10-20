# WP06 Chilean chancaca identity — 2026-10-09

This coordinator batch adds a Chile-qualified chancaca identity based on Chilean food regulation and
regional use. It does not treat similarly named sweeteners in other countries as aliases.

## Catalog decision

- ID: `ingredient-ref-chilean-chancaca`
- English display: `Chilean chancaca`
- French display: `chancaca chilienne` (provisional pending Québec terminology review)
- Category: `SUGAR_AND_SWEETENER`
- No aliases, forms, density, unit mappings, measurements, conversions, substitutions, package
  yields, or recipe links were added.
- Keep this Chile-scoped identity separate from panela, piloncillo, rapadura, cane jaggery/gur, and
  generic brown sugar. Chile’s RSA defines chancaca from concentrated and crystallized purified
  cane or beet juice; this does not define every product sold under the name elsewhere.

## Sources and boundary review

The full source register and comparative review are in
[`wp06-chancaca-boundary-review-20261009.md`](../../proposals/wp06-chancaca-boundary-review-20261009.md).
The integrated ledger record reuses `WP06-CHANCACA-20261009-S01` through `S05`; the coordinator
also reuses the South American sweep’s existing `WP06-SOUTHAM-20261009-S16` by reference. Chile’s
[current Reglamento Sanitario de los Alimentos, Article 382](https://www.bcn.cl/leychile/navegar?idNorma=71271)
defines chancaca and gives composition limits. Argentina’s separate product wording and regional
dictionary evidence are not treated as permission to merge cross-country sweeteners.

## Collision and recipe checks

The proposal’s pre-integration audit scanned 481 references, 17 forms, 99 legacy candidates, and all
114 manifest-listed recipes / 1,123 ingredient rows. It found no exact normalized-key collision or
regional-name recipe hit. The proposal records the scan phrases and pre-integration hashes. No
RecipeBook recipe was changed or relinked.

## Validation

- Current package: 484 ingredient references (SHA-256
  `9f5f96bfc9c9e13b9347f2e1a410e05c75357384586b04bce45dbdc3ce3c0b23`), 18 forms (SHA-256
  `ee299dbe8f4a2349a16c495b37ac6ee4830a128fdceffd91f3bf2001f1e10617`), and 114 recipes
  (manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`).
- Research ledger: 651 records, 940 source entries, 826 distinct source IDs (SHA-256
  `559954ed9afd499b2fd73e4d3cd9e5bcfcf0c14f0428f1fa043c8ad1626e7f51`); schema validation
  reported zero errors.
- Package normalization, reference normalization, generated-index freshness, ledger/package
  validation, all 9 Python package tests, and `git diff --check` passed.
- Android unit tests: 303 passed, 0 failures/errors/skips. Pixel 9a / Android 16 instrumentation on
  `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures/errors.
- The deployment script installed and launched the app. English `Chilean chancaca` and French
  `chancaca chilienne` each returned one result with the expected localized display. The blank
  drafts were discarded and the French home returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker](en-picker.png) | `64e8f95a42794d783b347948525de1b9088db2bbfcbfe8ee959b261df7384ff4` |
| [French picker](fr-picker.png) | `edbe503bf8d455e1a934f90f573c9d0ac6ad190537e1b2f95c7e7e5d91e22b41` |
| [French home, 114 recipes](fr-home-114.png) | `c0bc6b29be378f51e71e5838808d56ce7e19c45a3e62d0830f5ea0cd3119d9c7` |

Independent Québec French review, cross-country chancaca boundaries, and any future conversions or
substitutions remain open.
