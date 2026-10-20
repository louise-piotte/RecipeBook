# Package Yield WP12

| Field | Value |
| --- | --- |
| Owner | Integration lead |
| Reviewer | Measurement reviewer; R627 package-alias review completed |
| Status | In progress |
| Date | 2026-10-06 |
| Dependencies | WP00-WP01; WP07 source evidence; WP09 bilingual parsing/display; WP10 schema and storage integration |
| Input revision | Working tree based on the current repository HEAD; catalog and app changes are still uncommitted |

## Accepted source-backed observation

The S&W 2016 product catalogue lists its Black Beans item (SID code `1320217103112`) at 15 oz / 425 g net weight and 240 g drained weight. It lists origin USA and a case pack of 12. The catalogue does not state the draining test method, whether the beans are rinsed, or the packing medium. The app stores the individual-can relation only; case quantity does not become a recipe package count.

- Source: [S&W Beans product catalogue](https://swpremiumfood.com/wp-content/uploads/2017/02/SW-Catalogue_2016.pdf), Canned Beans table, Black Beans row.
- Research record: `package-yield-sw-black-beans-15oz-drained` in `research-ledger.v1.json`.
- Runtime record: same ID in the canonical `package-yields.v1.json` seed part.
- Supported expressions: 1 / 2 / 0.5 matching 15 oz cans -> 240 / 480 / 120 g drained, with fractional use labeled as proportional. A matching net-contents request yields 425 g. The drained value is an S&W product-specific estimate when the recipe line gives no brand.
- Explicit mismatch cases stay unavailable: another stated brand or product code, a different declared size/unit, a different package type, a selected nonmatching form, a conflicting packing medium, or a missing requested basis.
- `oz` and `fl oz` remain different units. The record has no volume quantity and cannot produce fluid ounces or millilitres from package net mass.

## Implemented integration scope

- Added structured `IngredientPackageAmount` and source-qualified `PackageYieldObservation` domain records.
- Added package amount fields to recipe DTOs and nullable Room storage; Room v10 adds one nullable JSON column without rewriting existing lines.
- Added the `packageYields` full-library catalog part to the canonical split ZIP manifest, bundled loader, import/export, catalog DataStore, and validators.
- Added English/French package expression parsing for supported package aliases, including compact/spaced net sizes and fluid-ounce distinction; source text stays intact. R627 aligned `can`/`tin` and `boîte(s) de conserve` across free-text and unit fields.
- Recipe detail offers evidence-backed conversions for a selected matching form and displays a bilingual source-specific qualifier and fractional-package assumption.
- Added unit, round-trip, editor-parse, Room persistence/migration, package validator, and Pixel 9a interaction coverage.

## Verification checkpoint

- `./gradlew :app:testDebugUnitTest --no-daemon --console=plain`: 224 tests, 0 failures, 0 errors.
- `python3 -B -m unittest discover -s tools/seed_package -p 'test_*.py'`: 9 tests passed.
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check`: package already normalized.
- `git diff --check`: passed.
- Pixel 9a / Android 16 connected instrumentation completed 29 cases with 2 environment-gated skips and no failures before the final package-display rounding refinement. The final APK's focused `PackageYieldInteractionTest` then passed on device.
- After the final display-rounding refinement, `tools/deploy_to_pixel9a_emulator.sh` completed successfully: its `test` task was up to date after the 224-test unit run, debug assembly succeeded, streamed `install -r` succeeded, and `MainActivity` launched. The post-deployment home screen retained all 114 recipes and bundled photos.
- A full connected-suite rerun after the display refinement stopped before starting tests: updating the app APK failed with `INSTALL_FAILED_INSUFFICIENT_STORAGE` on the retained 6 GB AVD. The failed install left `app.recipebook` absent. Before recovery, the fresh-install sandbox was saved to `/tmp/recipebook-current-appdata-before-restore.tar`; then `/tmp/recipebook-appdata-backup-wp04.tar` restored the preserved Room v9 database and WAL, DataStore preferences, and app-managed photos. Relaunch showed all 114 recipes with photos. After startup, the restored database reported Room version 10 and `recipe_ingredient_lines.packageAmountJson`. No AVD data wipe was run. The AVD configuration was restored to its original 6 GB setting after an in-place resize attempt did not expand the mounted filesystem.

## Open work and evidence limits

- This is one product-specific black-bean observation, not a generic yield for all black beans, brands, regions, or 15 oz cans.
- A generic 15 oz can of chickpeas, other beans, or another product has no active drained yield until an exact product source is accepted.
- Product/brand inference from arbitrary free-form text remains conservative. R627 reviewed the `can`/`tin` and `boîte(s) de conserve` parser aliases; other unreviewed package-expression edges remain conservative.
- Recipe-detail serving scaling now scales the structured package count used for package-yield display. It preserves declared package size and unit, package type, qualifiers, packing medium, requested basis, and original ingredient text; reset returns to the stored amount. The focused R634 UI test confirms the displayed yield changes with servings and resets.
- No inverse drained-mass-to-package-count estimate is offered. Shopping/package counts stay unavailable without an explicitly qualified yield path.
- The focused package interaction tests and restored-data v9-to-v10 migration have passed on device. A full connected rerun after the display refinement has not completed; keep the broader regression open pending repair of the catalog/picker unit failures. Inverse package counts remain unavailable without an evidence path.

## Acceptance status

The S&W example is implemented end to end in code and seed data; its focused UI flow and restored-data migration have been checked on device. The R627 package-alias edge review and R634 serving-scaling preservation are complete. WP12 remains in progress because inverse package-count estimates remain unavailable and the full connected regression has not rerun against the latest build.


## 2026-10-18 alias-review checkpoint — R627

- The independent parser review found free-text `tin`/`tins` diverged from explicit unit fields, which already mapped those terms to `CAN`. Accented/unaccented French `boîte(s) de conserve` phrases also lacked consistent handling. The parser now normalizes both forms to `CAN` across text and unit fields and trims punctuation-normalized aliases; the original ingredient wording remains intact.
- `PackageYieldConverterTest`: 12 tests passed. Pixel 9a / Android 16 `PackageYieldInteractionTest`: 2 tests passed. `:app:assembleDebug` passed, the APK installed and launched, and the recipe-list screenshot showed all 114 recipes. See the [R627 proposal](../proposals/wp12-package-yield-alias-normalization-review-r627-20261018.md) and [integration README](wp12-package-alias-review-integration-r627-20261018/README.md).
- The broader unit gate reported 430 tests with 11 failures in catalog/picker search-boundary cases (Japanese mayonnaise, rye, cereal, and recipe-picker assertions). The deploy script stopped at this test gate. The targeted package-yield tests passed.



## 2026-10-18 serving-scaling checkpoint — R634

- `scaleIngredientPackageAmount` scales only `IngredientPackageAmount.count` and preserves the package’s declared size and unit, type, qualifiers, packing medium, and requested basis. Recipe detail derives the package count from the stored ingredient and applies the current serving factor; scale reset returns to the stored count and source expression. The design note in `ui/recipes/DESIGN.md` records this behavior.
- Focused `RecipeDetailScreenTest`: 21 tests passed. Pixel 9a profile / Android 16 `PackageYieldInteractionTest`: 3 tests passed. At four servings the source-qualified drained yield displayed 480 g; reset restored 240 g and retained the original `1 x 15 oz can` expression and drained basis.
- The required deploy script stopped at the broad unit gate after 431 tests with 11 existing catalog and picker search-boundary failures. It did not reach assembly or install. The debug APK was installed and launched manually on the connected emulator, and the bundled library loaded to 114 recipes; a home-screen screenshot was captured in `/tmp/recipebook-validation.png`.
- Inverse drained-mass-to-package-count estimates remain unavailable. The full connected regression remains open. See the [R634 integration README](package-yield-serving-scaling-integration-r634-20261018/README.md).
