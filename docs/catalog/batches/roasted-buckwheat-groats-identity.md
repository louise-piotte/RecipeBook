# WP03 roasted buckwheat groats identity

- **Reviewed:** 2026-10-07
- **Status:** identity integrated; English and fr-CA picker results and connected instrumentation verified on Pixel 9a using an isolated temporary data image. Independent Québec French review remains open.
- **Scope:** exact dry, roasted groats identity. No recipe links, forms, measurements, yields, conversions, or substitutions.

## Integrated reference

| ID | English | fr-CA | Aliases | Category | Boundary |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-roasted-buckwheat-groats-dry` | buckwheat groats, roasted, dry | gruau de sarrasin, rôti, sec | none | `GRAIN_AND_CEREAL` | Keep separate from buckwheat flour and prepared *kacha / kasha*. |

Density is null and unit mappings are empty. The row has no aliases or forms. The exact English display preserves Health Canada's product-label word order. No CNF serving weights were imported.

## Evidence and naming limits

Health Canada's [Canadian Nutrient File food code 4412](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4412) labels the product `buckwheat groats, roasted, dry / gruau de sarrasin, rôti, sec` [WP03-S15]. The source page lists serving weights, but they are not measurement or conversion evidence for the catalog row.

The OQLF [*kacha* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506505/kacha) defines the food as a gruel made from roasted buckwheat and gives *kacha / kasha* with English *kasha* [WP03-S56]. That identifies a prepared dish, not a same-identity alias for dry groats. The existing `ingredient-ref-kasha` ledger candidate remains unresolved and separate.

## Recipe and collision audit

All 114 bundled recipe JSON files were scanned for buckwheat, sarrasin, and kasha wording; none contains a matching recipe ingredient line. The prior live catalog-key audit found no normalized-key collision. Existing `ingredient-ref-buckwheat-flour` remains a separate flour product.

## Verification record

- Seed package: 358 ingredient references, 16 forms, and 114 recipe files; evidence ledger: 523 records.
- Ingredient-reference normalization, bundled-package normalization and validation, generated Kotlin catalog freshness, and all 9 Python package tests passed.
- Android unit tests passed: 255 tests, zero failures, errors, or skips.
- `connectedDebugAndroidTest` reached Pixel 9a / Android 16 API 36 but failed before starting tests with `INSTALL_FAILED_INSUFFICIENT_STORAGE`; the emulator had 512 MB free (8%). The run started zero tests. A retry after app installation failed the same way. The repository deploy script installed and launched the debug APK successfully.
- On Pixel 9a, English search `buckwheat` returned `buckwheat flour` and `buckwheat groats, roasted, dry`. French search `sarrasin` returned `farine de sarrasin` and `gruau de sarrasin, rôti, sec`. The two empty QA drafts were discarded; the French home screen still shows 114 recipes.
- Screenshots: [English picker](screenshots/picker-roasted-buckwheat-groats-en.png), [fr-CA picker](screenshots/picker-roasted-buckwheat-groats-fr-ca.png).
- Screenshot SHA-256: English `988c75498fea187cd734147b70ba60af6b274f54763585256971fd3e07b16097`; fr-CA `6053c449409d3430c806bf92282a9d8c456eeb4b17c15e541946d707db6a5a2f`.
- Package SHA-256: ingredient references `16e1cf609be65e2c8d249bae2a71974e61d3d92543a8cb555908f2d395a18004`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `0122e6882660f6c25f427e57a602c02d7adedee89d4366382b27b84a2cda39d2`; generated Kotlin catalog `e7d30e93ed6e1f0d62d4294894c4930c546383a192836aac9bdc95a0c2cd94d2`.
- Scoped UTF-8/no-BOM and mojibake checks passed for the maintained files in this checkpoint. The bundled seed text uses explicit Unicode escapes. `git diff --check` passed.
- Keep connected instrumentation verification open until the Pixel 9a emulator has enough free storage. No emulator data wipe was performed. Independent Québec French review and broader Section F coverage remain open.
