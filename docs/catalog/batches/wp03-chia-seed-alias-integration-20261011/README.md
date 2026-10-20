# WP03 chia-seed identity and singular-alias integration

- **Date:** 2026-10-11
- **Status:** Integrated. The existing identity and its one recipe link are preserved; only two singular search aliases and source-backed ledger evidence were added. Measurement, form, and substitution research remain open.
- **Review packet:** [chia-seed identity proposal](../../proposals/wp03-chia-seed-identity-review-20261011.md).

## Integrated decision

Kept the existing `ingredient-ref-chia-seeds` reference with display names `chia seeds / graines de chia`. Added only `chia seed` and `graine de chia` as aliases. No duplicate identity was created, and no bare plant name, color or processing qualifier, oil, flour, powder, or prepared-chia term was added as an alias.

The existing recipe 065 line `1/8 part chia seeds` remains linked to the same reference without a text or quantity edit. The identity retains null density, empty unit mappings, and no forms, conversions, yields, or substitutions. Measurement and substitution research remain `not_yet_researched`.

Independent source review confirmed Health Canada's bilingual chia-seed label, its separate whole/minimally processed seed and cold-pressed oil entries, OQLF's botanical definition of `chia`, Metro Québec's whole-seed product wording, and the singular French phrase in Healthy Planet's ingredient declaration. The OQLF page supports the plant name rather than a formal product term; the French display remains product-backed market wording. See the [Health Canada food file](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2511&lang=fre), [Health Canada non-novel list](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html), [OQLF entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26505019/chia), [Metro product listing](https://www.metro.ca/epicerie-en-ligne/allees/epicerie-biologique/garde-manger/noix-graines-et-fruits-seches-bio/graines-de-chia-noires-entieres/p/059749979443), and [Healthy Planet ingredient declaration](https://www.healthyplanetcanada.com/fr/grocery/better-breakfast/navitas-organics-chia-seeds-organic-227g.html).

The package remains at **970 references / 60 forms / 114 recipes / 1,123 ingredient rows / 1 package yield**. The ledger now contains **1,243 records / 3,881 source entries / 3,185 distinct source IDs / 8 unit conversions / 0 validation errors**. The six chia source IDs are `WP03-CHIA-20261011-S01` through `S06`.

## Verification

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package` passed **110 tests**.
- `:app:testDebugUnitTest` passed **422 tests, 0 failures, 0 errors, 0 skipped**.
- `:app:connectedDebugAndroidTest` passed **52 tests total: 50 executed, 2 skipped, 0 failed** on Android 16 / API 36 Pixel 9a QA.
- Bundled seed-package validation and the generated Kotlin ingredient-index freshness check passed; the index contains **970 references**. Ledger validation reported zero errors.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test and assemble stages, installed the APK on disposable serial `emulator-5556`, and launched the app.
- English picker query `chia seed` returned `chia seeds`; French query `graine de chia` returned `graines de chia`. The blank draft was discarded, and French home showed `Toutes les recettes (114)` afterward.
- Only the disposable Pixel 9a QA AVD was used; owner emulator `emulator-5554` was excluded from instrumentation and left untouched.
- Seed JSON retains escaped Unicode. Touched maintained text is UTF-8 without BOM, with final newlines and clean scoped whitespace.

## Screenshots

Captures are 1080 × 2424. SHA-256 values are stored in [SHA256SUMS.txt](SHA256SUMS.txt).

| Screen | SHA-256 |
| --- | --- |
| [English home after deploy](screenshots/home-en-after-deploy.png) | `5b4c94b4ac3d7b2f16c6840cd9a387d1f5ed715c284250b161ab2abb48c24892` |
| [English singular-alias picker](screenshots/picker-en-chia-seed.png) | `370664b9aaa199f2edecc383f4ed4ec30532e154e3358c733d5a02e61d2fb20c` |
| [French singular-alias picker](screenshots/picker-fr-graine-de-chia.png) | `197787ebcb43cf6fde39f8bb4ed2a5e1cc99c5304b0bbf87b7f5f98ee0c39e3d` |
| [Restored French home](screenshots/home-fr-after-qa.png) | `3e105cf31cc6f5a3893a8857a3aaba04148230c98a7418531adb6136f19c5718` |

## Remaining seed work

The broad plan now leaves additional melon-seed products and regional culinary kernels open. Chia measurement and substitution research remain separate questions; no quantities were inferred from source nutrition or serving-size pages.
