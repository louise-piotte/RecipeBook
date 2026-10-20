# WP02/WP03/WP04 roasted gram, chapati, and Bonga fish powder integration

**Date:** 2026-10-11

## Decisions integrated

- Kept `candidate-pottukadalai-maavu` unresolved. The evidence distinguishes roasted whole chickpeas, split roasted Bengal gram, besan, and chana sattu, but does not establish a stable separate flour identity or Québec display. No active alias or flour row was added.
- Added identity-only `chapati / chapati` in `BAKING_MIXIN_AND_PANTRY`, with English spelling aliases `chapatti`, `chappati`, and `chapathi`, and French plural alias `chapatis`. Chapati flour terms remain on `atta`; no `roti` alias was inferred.
- Added identity-only `Bonga dried fish powder / poudre de poisson Bonga` in `PROTEIN`, with no aliases. The generic fish-powder phrase remains outside aliases; its search result occurs because it is part of the Bonga display name.
- No recipe rows, ingredient forms, measurements, conversions, yields, or substitutions changed. The 114-recipe corpus had no matching rows for these candidates.

See the reviewed proposals and source registers:

- [WP02 roasted gram flour product boundary](../../proposals/wp02-roasted-gram-flour-product-boundary-review-20261011.md)
- [WP03 chapati bread identity review](../../proposals/wp03-section-g-chapati-bread-identity-review-20261011.md)
- [WP04 Bonga fish powder identity boundary](../../proposals/wp04-section-p-fish-powder-identity-boundary-review-20261011.md)

## Package state

- 948 ingredient references, 53 forms, 114 recipes, and 1,123 ingredient rows.
- 1,216 research-ledger records, 3,581 source entries, and 2,920 distinct source IDs; ledger validation returned 0 errors.
- Sixteen source entries were added in this batch: five for the unresolved roasted-gram candidate, three for chapati, and eight for Bonga powder.
- Chapati and Bonga powder are identity-only. Both have null density and empty unit mappings.

## Verification and emulator QA

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`: passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`: passed; generated catalog is current at 948 references.
- `python3 -m tools.seed_package.test_bundled_seed_package`: 106 passed.
- `GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew :app:testDebugUnitTest --no-daemon`: 409 passed.
- `GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew :app:connectedDebugAndroidTest --no-daemon`: 36 reported, 34 passed, 2 skipped, 0 failures or errors.
- `RECIPEBOOK_ADB_EXE=adb RECIPEBOOK_EMULATOR_SERIAL=emulator-5556 ./tools/deploy_to_pixel9a_emulator.sh`: installed and launched successfully on the disposable Android 16 / API 36 Pixel 9a QA profile.
- English picker: `chapati` → atta and chapati; `chapatti` → chapati; `chapati flour` → atta; `Bonga` and `fish powder` → Bonga dried fish powder.
- French picker: `chapatis` → chapati; `farine a chapati` → atta through the accent-folded `farine à chapati` alias; `poudre de poisson Bonga` and `poudre de poisson` → `poudre de poisson Bonga`.
- Search QA did not select an ingredient. The empty draft was discarded. The French home was restored and verified at `Toutes les recettes (114)`.

## Screenshots and SHA-256

Screenshots are from `emulator-5556`. Picker screenshots show the query and visible result list.

| Screenshot | SHA-256 |
|---|---|
| [English chapati](screenshots/recipebook-chapati-en.png) | `5fe24a0cc8a4bdd5c183684510b9efa234ef9259ed4cb389a7936f8ef5bb0ae7` |
| [English chapatti](screenshots/recipebook-chapatti-en.png) | `19975729928073484ad60bde9123cd127ecd2532ec01dad46d35ea4eab0ca595` |
| [English chapati flour](screenshots/recipebook-chapati-flour-en.png) | `158bbc55a5ed22eb453f2a0869ed08ad10f8be5a5356cb7aca65ee15069c0979` |
| [English Bonga](screenshots/recipebook-bonga-en.png) | `ae72d7dfc1c91cb1d16c5238b84c48afa2d9efe02e367fafd1a7201b5d2f9c18` |
| [English fish powder](screenshots/recipebook-fish-powder-en.png) | `23c65f3fd339a89973c03e64c88a6d8d122d679b9359ce24aff4c155dadea061` |
| [French chapatis](screenshots/recipebook-chapatis-fr.png) | `6608aa63add0d53279beedc7d81dd6c1b0c2cd81669dd42ae2202d2677d3e804` |
| [French farine à chapati](screenshots/recipebook-farine-chapati-fr.png) | `44012cf32fb8196b8e1e958ed2b857eaa303b431d29255619425a416aac69b56` |
| [French Bonga powder](screenshots/recipebook-bonga-poudre-fr.png) | `a31235fcd47818c090360c0302d52b8e2dd1ee7618faa36387b7f66c495508a7` |
| [French fish powder](screenshots/recipebook-poudre-poisson-fr.png) | `22129dfa015b1a2ba18beafc04aa9590a2e9492683c5ea39d693060350909dd5` |
| [French home, 114 recipes](screenshots/recipebook-french-home-final.png) | `ea249946ee708cfe71eb96409bb4a43afea76f6bedd8a0fde5b00eb2827b4d5d` |
- 1,216 research-ledger records, 3,581 source entries, and 2,920 distinct source IDs; ledger validation returned 0 errors.
