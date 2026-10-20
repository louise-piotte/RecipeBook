# WP02/WP03/WP04 Abacha, Injera, and Whelk Integration

- **Date:** 2026-10-11
- **Status:** Injera is integrated as an identity-only reference. Abacha and generic whelk remain held candidates. The broader WP02, WP03, WP04, and global catalog work remains open.
- **Review packets:** [Abacha product boundary](../../proposals/wp02-abacha-dried-cassava-strip-product-boundary-review-20261011.md), [Injera prepared-bread identity](../../proposals/wp03-injera-prepared-bread-identity-review-20261011.md), and [Whelk species/product boundary](../../proposals/wp04-whelk-species-product-boundary-review-20261011.md).

## Catalog decisions

- **Abacha:** Keep `candidate-abacha` held with `identityState=needs_clarification`. A Canadian French-facing storefront lists the product as “Abacha,” supporting the unchanged retail name in that storefront. The listing does not establish Québec-specific usage or product state, while technical sources distinguish dry, wet, and rehydrated strips and the prepared Abacha Ncha dish. No active reference, aliases, form, measurement, recipe link, or substitution behavior was added.
- **Injera:** Add `ingredient-ref-injera` with `nameEn=nameFr=injera`, category `BAKING_MIXIN_AND_PANTRY`, and the sole English alias `injera bread`. Keep French aliases empty. The prepared bread remains distinct from teff grain or flour, fermentation starter, and generic flatbread. No recipe link, form, measure, conversion, yield, or substitution behavior was added.
- **Whelk:** Keep `candidate-whelk` held because the unqualified Canadian market name can refer to multiple taxa and the bundle has no species-qualified demand. Reserve `waved whelk / buccin commun` for explicit *Buccinum undatum* evidence. No active reference or numeric behavior was added.

The integrated package contains **943 references / 53 forms / 114 recipes / 1,123 ingredient rows**. The ledger contains **1,210 records / 3,520 source entries / 2,867 distinct source IDs / 8 unit conversions / 0 validation errors**.

## Verification

- `python3 -m tools.seed_package.test_bundled_seed_package` passed all **106 tests**.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 943 references.
- `GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew test --no-daemon` passed **409 Android unit tests** with no failures or skips.
- `GRADLE_USER_HOME=/tmp/recipebook-gradle-home ANDROID_SERIAL=emulator-5556 ./gradlew :app:connectedDebugAndroidTest --no-daemon` passed **36 instrumentation tests: 34 passed, 2 skipped, 0 failed** on Android 16 / API 36 (`RecipeBook_Pixel_9a_QA`). An earlier run on `emulator-5560` stalled at case 12 when the emulator stopped responding; after cold-restarting only the disposable QA AVD, the clean run completed.
- `RECIPEBOOK_ADB_EXE=adb RECIPEBOOK_EMULATOR_SERIAL=emulator-5556 ./tools/deploy_to_pixel9a_emulator.sh` passed its test and assemble steps, installed the debug APK, and launched the app.
- On the fresh QA app state, the English picker returned one `injera` result for `injera`; the French picker returned the same identity and display. No ingredient was selected. The temporary drafts were discarded, and the French home was restored with **114 recipes**.

Screenshots and SHA-256 fingerprints are in [`screenshots/`](screenshots/).

| Screenshot | SHA-256 |
|---|---|
| [English picker search](screenshots/injera-picker-en.png) | `cf79c42fddba128fe6eb081e27f7bb441ef29fb6cc27835e2a7de1bfa3e7882b` |
| [French picker search](screenshots/injera-picker-fr.png) | `dbd14a29d21ff28d30f484da2d0517321259facc52d6d7b124ebf84f27e820ca` |
| [Restored French home](screenshots/home-fr-restored.png) | `f69565335cdf87b9b07bcdd23613249c2c21c612c4198b4fa2c426e07d7ea021` |

## Ongoing work

The broader Section B flour/starch scope, Section G bread and regional grain scope, Section P seafood scope, and global catalog plan remain open. These reviews close only the named Abacha, Injera, and whelk checkpoints.
