# WP06 guarana seed identity and powder form — 2026-10-09

This coordinator batch models the guarana seed and its simply ground powder form. It keeps distinct
Brazilian products outside the active reference and form.

## Catalog decision

- Reference: `ingredient-ref-guarana-seed` — `guarana seed / graine de guarana`, category
  `NUT_SEED_AND_DRIED_FRUIT`.
- Reference aliases: `guarana seeds` (EN) and `graines de guarana` (fr-CA).
- Form: `ingredient-form-guarana-seed-powder`, `powdered`, labelled `guarana seed powder / poudre de
  graines de guarana`; match terms are `guarana powder`, `ground guarana`, `guarana en poudre`, and
  `poudre de guarana`.
- Density, unit mappings, measurements, conversions, substitutions, package yields, and recipe
  links remain unset.
- The MAPA standard defines powder as finely ground seed kernel and distinguishes whole dried seed
  and smoked sticks. Keep roasted `em rama` seed, `bastão` sticks, extracts, soluble powder, syrups,
  beverages, fruit, and aril outside this identity/form.

## Sources and boundary review

The full source register and product-family analysis are in
[`wp06-guarana-boundary-review-20261009.md`](../../proposals/wp06-guarana-boundary-review-20261009.md).
Ledger evidence reuses `WP06-GUARANA-20261009-S01` through `S12`; the MAPA product standard is
recorded on both the reference and its powder form. [MAPA Portaria 70/1982](https://sistemasweb.agricultura.gov.br/sislegis/action/detalhaAto.do?chave=305705907&method=visualizarAtoPortalMapa)
defines separate groups for `guaraná em grão`, `em bastão`, and `em pó`, and defines powder as
finely crushed, ground, or pounded seed kernel. No general density or cross-form conversion is
supported.

## Collision and recipe checks

The pre-integration proposal audited 481 references, 17 forms, 99 legacy candidates, and all 114
manifest-listed recipes / 1,123 ingredient rows. It found no exact collision or recipe-text hit for
the candidate family terms. The proposal records the full phrase set and hashes. No RecipeBook
recipe was changed or relinked.

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
- The deployment script installed and launched the app. English `guarana seed powder` returned the
  `guarana seed` result with the `guarana seed powder` form hint. French `guarana en poudre` returned
  `graine de guarana` with `poudre de graines de guarana`. The blank drafts were discarded and the
  French home returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English powder picker](en-powder-picker.png) | `cb4ffc79dd58585b20458f42406260edc3f47a8aa843ca422b0a915b09a84962` |
| [French powder picker](fr-powder-picker.png) | `1ecc23663901f593acb25ec03f1688e15abd22dae11558b68a74c400b81f15b5` |
| [French home, 114 recipes](fr-home-114.png) | `c0bc6b29be378f51e71e5838808d56ce7e19c45a3e62d0830f5ea0cd3119d9c7` |

Québec wording review and separate product identities for other guarana forms remain open.
