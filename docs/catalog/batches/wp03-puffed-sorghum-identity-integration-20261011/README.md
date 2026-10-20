# WP03 Section F puffed sorghum integration

- **Date:** 2026-10-11
- **Status:** Catalog identity, evidence, regression coverage, and Android 16 / Pixel 9a QA are complete. Broader Section F review remains open.
- **Review:** [Identity proposal](../../proposals/wp03-section-f-puffed-sorghum-identity-review-20261011.md)

## Catalog change

Added `ingredient-ref-puffed-sorghum` as `puffed sorghum / sorgho soufflé` in `GRAIN_AND_CEREAL`, with only `popped sorghum` and `sorghum puffs` as English aliases. It names a plain ready-to-eat puffed grain product, separate from raw grain sorghum and sorghum flour. No French aliases, forms, density, unit mappings, measures, conversions, yields, substitutions, recipe links, species/cultivar, puffing method, or hull state were added. Sources and their limits are recorded on the ingredient research-ledger record and in the proposal.

The pre-integration audit found no exact normalized-key collisions and no matching recipe demand. It covered 889 existing references, 48 forms, 114 recipes, and 1,123 ingredient rows. The active package now contains 890 references; all recipe and line data remain unchanged. The full package has 1,140 research-ledger records, 2,882 source entries, 2,291 distinct source IDs, and 179 measurement observations.

## Verification

### Automated checks

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package` — **58 passed**.
- `GRADLE_USER_HOME=/home/louise/RecipeBook/.gradle-user-home bash ./gradlew :app:testDebugUnitTest --no-daemon` — **376 passed**.
- `ADB_SERVER_SOCKET=tcp:127.0.0.1:5037 GRADLE_USER_HOME=/home/louise/RecipeBook/.gradle-user-home bash ./gradlew :app:connectedDebugAndroidTest --no-daemon` on `emulator-5560` — **33 cases, 31 passed, 2 skipped, 0 failures/errors**. This includes the Compose test selecting `puffed sorghum` by the `popped sorghum` alias and asserting `ingredient-ref-puffed-sorghum`.
- Bundled-package normalization, ingredient-reference normalization, and generated Kotlin catalog freshness checks passed. The generated catalog contains **890 references**.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test and debug-assembly stages, installed the APK, and launched `app.recipebook/.MainActivity` on `emulator-5560`. Debug APK SHA-256: `20c6702015de6361096f6f3fc0f8f28c7e5ecc2e8e8d5636d1d8fc1def416a35`.

### Pixel 9a picker QA

QA used a fresh disposable Pixel 9a profile on Android 16 / API 36 at 1080 × 2424 and 420 dpi. The English query `popped sorghum` showed the selectable `puffed sorghum` row. In French, the accent-folded query `sorgho souffle` showed `sorgho soufflé`; the editor controls and French home were localized. No ingredient was selected in either manual picker check. Both unsaved drafts were discarded, and the home returned to `Toutes les recettes (114)`.

The owner AVD `userdata-qemu.img` SHA-256 was `48D6753085207CBBDF6B1C2BC9416AF3FE92AD42F6000ED5CFA49103ED0F9997` before and after QA. Only the disposable `emulator-5560` profile was shut down and removed.

Screenshots and SHA-256 values:

- [English home](screenshots/home-en.png) — `a9260d7959b7a01bcb0a61c0d784bc9e459d8c1d5469c7b31f0e4561631283e8`
- [English picker: `popped sorghum`](screenshots/picker-en-popped-sorghum.png) — `12919c585dacfd2b5e5ddbfa8fb4fbd6b5a35c0babd003f3066ac7a3b1479c40`
- [French picker: `sorgho soufflé`](screenshots/picker-fr-sorgho-souffle.png) — `cdb7e4561df9e73576e448f3863737ebde4bfcb3dbfd7ec1e0fdf49ca645bba1`
- [French home after draft discard](screenshots/home-fr-restored.png) — `3a0c2db30a310f96f884341337d9a25a730d36db0836cd5039c5855fd29b3677`

The unrelated broader Section F candidates and independent Québec French review remain open.
