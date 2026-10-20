# WP05 Scotch Bonnet pepper sauce integration

Date: 2026-10-11

## Decision

Added identity-only `Scotch Bonnet pepper sauce / sauce au piment fort Scotch Bonnet` in `SAUCE_AND_CONDIMENT`, with three source-attested English product aliases. Fresh Scotch Bonnet pepper, green and curry variants, Jamaican jerk products, Ghanaian shito, and generic hot/pepper sauces remain separate. There are no forms, recipe links, densities, mappings, conversions, yields, or substitutions for this identity.

## Evidence and files

- Boundary review and source map: `docs/catalog/proposals/wp05-scotch-bonnet-hot-sauce-quebec-boundary-review-20261011.md`.
- Accepted identity and ten product/terminology sources: `docs/catalog/research-ledger.v1.json`.
- Canonical reference and generated index: `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` and `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`.
- Regression coverage: `tools/seed_package/test_bundled_seed_package.py`, `app/src/test/java/app/recipebook/data/local/recipes/BundledIngredientCatalogTest.kt`, and `app/src/androidTest/java/app/recipebook/BundledFlourIngredientPickerTest.kt`.

The 114-recipe bundle has no matching Scotch Bonnet ingredient row among 1,123 ingredient rows. At integration the package had 972 references / 61 forms and the ledger had 1,247 records / 3,915 source entries / 3,207 source IDs. After the subsequent pasta integrations, the live package has 975 references / 61 forms; the ledger has 1,250 records / 3,952 sources / 3,244 source IDs.

## Verification and Pixel 9a QA

The shared integrated package checks passed: 115 Python package tests, 428 Android unit tests, and Android 16/API 36 connected instrumentation (62 total: 60 executed, 2 skipped, 0 failures). Deployment launched the APK on disposable `RecipeBook_Pixel_9a_QA` (`emulator-5556`).

English `scotch bonnet pepper sauce` returned `Scotch Bonnet pepper sauce`; French `scotch bonnet` displayed both the fresh-pepper identity and `sauce au piment fort Scotch Bonnet`, preserving the sauce/pepper distinction. The blank draft was discarded after the shared bilingual QA session; see the pasta-composition batch for the restored French home screenshot. Captures are 1080 × 2424; hashes are in [SHA256SUMS.txt](screenshots/SHA256SUMS.txt).

| Screen | SHA-256 |
| --- | --- |
| English Scotch Bonnet sauce result | `a61f4ccabc8fbffe30b6bcbdbe2e123ad2e93649a199f70b2693190df2f50303` |
| French Scotch Bonnet query and distinct sauce result | `852695078e4384885396516815b88a4f57f03f94ca602e77cdee1ffba315b253` |

Section Z remains open.
