# WP03 egg-pasta identity integration

Date: 2026-10-11

## Decision

Added identity-only `egg pasta / pâtes aux œufs` in `GRAIN_AND_CEREAL`, with the formal French alias `pâtes alimentaires aux œufs`. The English statutory spelling uses `oeufs`; search normalization handles the accent and ligature without storing a duplicate alias. Generic pasta, egg noodles, named shapes, and fresh/dry states remain separate.

The federal 4% egg-yolk-solids rule is product-name evidence only. No forms, density, mappings, package yield, conversion, substitution, or recipe link was added. The bundle has no matching ingredient line among its 114 recipes / 1,123 rows.

## Evidence and files

- Full identity/form boundary review and nine source entries: `docs/catalog/proposals/wp03-section-g-egg-pasta-identity-form-boundary-review-20261011.md`.
- Canonical identity and generated index: `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` and `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`.
- Research-ledger entry: `docs/catalog/research-ledger.v1.json`.
- Regression coverage: `tools/seed_package/test_bundled_seed_package.py`, `app/src/test/java/app/recipebook/data/local/recipes/BundledIngredientCatalogTest.kt`, and `app/src/androidTest/java/app/recipebook/BundledFlourIngredientPickerTest.kt`.

At integration the package had 973 references / 61 forms / 114 recipes / 1,123 ingredient rows; the ledger had 1,248 records / 3,936 source entries / 3,228 distinct source IDs / 8 unit conversions. After the following whole-wheat and gluten-free integrations, the live package is 975 references / 61 forms and the ledger is 1,250 records / 3,952 source entries / 3,244 distinct source IDs.

## Verification and Pixel 9a QA

The shared integrated package checks passed: 115 Python package tests, 428 Android unit tests, and Android 16/API 36 connected instrumentation (62 total: 60 executed, 2 skipped, 0 failures). Deployment launched the APK on disposable `RecipeBook_Pixel_9a_QA` (`emulator-5556`).

English `egg pasta` returned `egg pasta`; French `pates alimentaires aux oeufs` returned `pâtes aux œufs`. The unsaved draft was discarded after the shared bilingual QA session, and the French home returned to `Toutes les recettes (114)`. Captures are 1080 × 2424; hashes are in [SHA256SUMS.txt](screenshots/SHA256SUMS.txt).

| Screen | SHA-256 |
| --- | --- |
| English egg-pasta result | `7dc1dd6b46a9720e98f6d424e4b4d36d84ba0ebcb72c00e5af6cc2613373ac76` |
| French egg-pasta result | `fa1e5288e965183c7471f687543c31406e3ee9b3fe6f8b5747557e07f8426ec0` |

Broader Section G and independent bilingual review remain open.
