# WP04 crab meat and Jumbo Lump integration

- **Date:** 2026-10-11
- **Status:** Crab-meat identity, grade form, recipe link, regression coverage, and Android 16 / Pixel 9a QA are complete. The broader WP04 and global catalog reviews remain open.
- **Evidence review:** [Crab-meat identity and grade proposal](../../proposals/wp04-crab-meat-grade-and-identity-review-20261011.md)
- **Prior boundary review:** [WP04 Section P shellfish and cephalopod review](../../proposals/wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md)

## Catalog decision

The broad edible product is now `ingredient-ref-crab` (`crab meat / chair de crabe`, `PROTEIN`). It has no loose `crab` or `crabe` aliases, species assignment, density, or unit mapping. Imitation crab remains distinct.

`ingredient-form-crab-jumbo-lump` represents the named grade under the generic reference. Recipe 019 row 8 now links to both the generic reference and the form. The source line, ingredient name, quantity (`1 lb`), unit, and order remain unchanged. The previous grade-specific reference is retired. No measurement, conversion, yield, or substitution behavior was added.

The selected form is now displayed in recipe detail and editor previews when no separate preparation phrase already carries the wording. This preserves `jumbo lump` in the English recipe and shows `chair de crabe en gros morceaux (jumbo lump)` in French.

The package contains **942 references / 53 forms / 114 recipes / 1,123 ingredient rows**. The research ledger has **1,205 records / 3,483 source entries / 2,831 source IDs / 8 unit conversions / 0 validation errors**.

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 942 references.
- `python3 -m unittest tools.seed_package.test_bundled_seed_package` passed all **106 tests**.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed **409 tests**, with no failures or skips.
- `./gradlew :app:connectedDebugAndroidTest --no-daemon` on `emulator-5560` (Android 16 / API 36, Pixel 9a profile) completed **36 tests: 34 passed, 2 skipped, 0 failed**. XML reports are the count source.
- `RECIPEBOOK_ADB_EXE=adb RECIPEBOOK_EMULATOR_SERIAL=emulator-5560 ./tools/deploy_to_pixel9a_emulator.sh` passed its test and assemble stages, installed the debug APK, and launched the app.
- Manual emulator QA confirmed the English recipe detail keeps `1 lb jumbo lump crab meat`. The French editor showed the localized form label. In the French picker, `jumbo lump crab meat` displayed the generic `chair de crabe` result with the Jumbo Lump form label; generic `crab meat` and `chair de crabe` queries returned the generic identity without a grade hint. No picker selection was saved. The unchanged editor was discarded, and the French home was restored at 114 recipes.

Screenshots are from disposable `emulator-5560`; hashes are listed in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

| Screenshot | SHA-256 |
|---|---|
| [English crab recipe search](screenshots/recipe-search-en.png) | `25815cfed075d60ff467dcbd3aa7142c9b831f4afe5665272e52a48674843726` |
| [English recipe detail with Jumbo Lump visible](screenshots/recipe-detail-crab-ingredient-en.png) | `58e34646fa64db9cc0382ac98ba843406a7210ccd3db0ce3ea16f3273086ad8d` |
| [French editor preview with localized form](screenshots/editor-fr.png) | `10e32ccf66025b7790046118355facac1ff7e2ccd634d314e4d75ac80093e` |
| [French picker, English Jumbo Lump query](screenshots/picker-fr-jumbo-lump-en-query.png) | `c37c1ede512a360bb348759bd8774a5bca3d0b8713e2f32b28540628bc89b16f` |
| [French picker, generic English query](screenshots/picker-fr-generic-crab-meat.png) | `4a5ba9aa0369bc7e75cd444b8e986dcc091a25458ca8d87dcab72eb3ef9d2ded` |
| [French picker, canonical French query](screenshots/picker-fr-chair-de-crabe.png) | `fca9a7ea11469b39492cf9296f93962ca3aa3ef42cd4247989af24b3d85217bf` |
| [Restored French home, 114 recipes](screenshots/home-fr-restored.png) | `8fdaff44b30f7fec8e20dc3540bfacefd995987efeeff90555d5f1118430e3b9` |

## Ongoing work

The broader catalog plan remains open. The other shellfish and cephalopod holds from the Section P proposal are unchanged.
