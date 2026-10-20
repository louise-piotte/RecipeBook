# WP02 / WP03 / WP05 oatmeal, coconut, hemp, and adobo integration

- **Date:** 2026-10-11
- **Status:** Catalog, ledger, recipe-form links, regression coverage, checklist, roadmap, deployment, and Pixel 9a QA are integrated. `beurre de noix de coco`, `sauce adobo mexicaine`, and `graines de chanvre entières` remain provisional Québec displays. The broader catalog plan remains open.
- **Review packets:** [dry oat-meal boundary](../../proposals/wp02-a7-dry-oat-meal-product-boundary-review-20261011.md), [shirataki boundary](../../proposals/wp03-shirataki-konjac-noodle-boundary-review-20261011.md), [coconut products](../../proposals/wp03-coconut-products-quebec-boundary-review-20261011.md), [coconut-butter display](../../proposals/wp03-coconut-butter-quebec-display-independent-review-20261011.md), [whole hemp seeds](../../proposals/wp03-whole-hemp-seed-canadian-quebec-boundary-review-20261011.md), [Mexican adobo sauce](../../proposals/wp05-adobo-sauce-quebec-boundary-review-20261011.md), and [independent adobo display review](../../proposals/wp05-adobo-sauce-independent-quebec-display-review-20261011.md).

## Integrated decisions

- Added identity-only `Scottish oatmeal / gruau écossais` for the source-defined coarse meal made from whole oat groats. Kept generic `oatmeal`, `oat meal`, oat flour, rolled oats, and groats separate. The only aliases are the source-attested `Scotch oatmeal` and `Scottish oats`; no recipe link, form, measurement, conversion, yield, density, or substitution was added.
- Added identity-only `shirataki noodles / nouilles shirataki` with only the phrase-level `konjac noodles / nouilles de konjac` aliases. Tofu shirataki, konnyaku blocks, generic glass/cellophane noodles, mung-bean threads, and sweet-potato-starch noodles remain distinct.
- Consolidated shredded coconut into the existing coconut identity and added seven product forms: fresh meat, desiccated, flaked, toasted, toasted flakes, sweetened shredded, and unsweetened shredded. Linked ten exact recipe ingredient rows to their supported forms while preserving the authored ingredient text and quantities. No general density or mass-volume conversion was added.
- Added identity-only `coconut butter / beurre de noix de coco` and `Mexican adobo sauce / sauce adobo mexicaine`. Both French displays are provisional. Neither reference has aliases, forms, numeric behavior, substitutions, or recipe links. Adobo seasoning, paste, Filipino products, Mole Adobo, and chipotles packed in adobo remain outside the sauce identity.
- Added identity-only `whole hemp seeds / graines de chanvre entières`, separate from hulled hemp hearts. Search aliases remain whole-qualified; generic `hemp seeds / graines de chanvre` can surface both identities and are not assigned to either one. No forms, measurements, conversions, substitutions, or recipe links were added.
- Retained the independently reviewed `yacón` display without claiming an OQLF ruling. Updated existing wheat-meal, barley-meal, toasted-rye-flour, and Abacha candidate records with reviewed evidence while keeping their unresolved product boundaries out of the active catalog.

The canonical package contains **970 references / 60 forms / 114 recipes / 1,123 ingredient rows / 1 package yield**. The research ledger contains **1,243 records / 3,875 source entries / 3,179 distinct source IDs / 8 unit conversions / 0 validation errors**.

## Verification

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package` passed **110 tests**.
- Bundled seed-package validation passed; the generated Kotlin ingredient index is current at **970 references**.
- Android unit tests passed: **421 tests, 0 failures, 0 errors, 0 skipped**.
- Connected Android instrumentation passed on Android 16 / API 36 Pixel 9a QA: **50 total, 48 executed, 2 skipped, 0 failures**. Coverage includes English and French picker selection for coconut butter, adobo sauce, whole hemp seeds, and the toasted-coconut-flakes form hint, plus the broad hemp-seed distinction.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test and assemble stages, installed the debug APK to disposable serial `emulator-5556`, and launched the app.
- Live English picker searches showed `coconut butter`, `Mexican adobo sauce`, and `whole hemp seeds`. French searches displayed `beurre de noix de coco`, `sauce adobo mexicaine`, and both `graines de chanvre décortiquées` and `graines de chanvre entières` for a broad `hemp` query. The blank draft was discarded. The final French home displayed `Toutes les recettes (114)`; the English home also showed `All Recipes (114)`.
- Only the disposable Pixel 9a QA emulator was used. The owner emulator on `emulator-5554` was left untouched.
- Bundled JSON retains escaped French Unicode. Maintained text files are UTF-8 without BOM; scoped whitespace and encoding checks passed.

## Screenshots

The screenshots are 1080 × 2424 captures from the Pixel 9a profile. SHA-256 values are also in [SHA256SUMS.txt](SHA256SUMS.txt).

| Screen | SHA-256 |
| --- | --- |
| [English home after deploy](screenshots/home-en-after-deploy.png) | `e82757364a933a061edf54aef373280eee851f499714eca8567eec266b2cc8f5` |
| [French home after QA](screenshots/home-fr-after-deploy.png) | `77e26dc57e75d871d39796564cd4bdeee614bc12e31e36261b0d6c62a790e4f6` |
| [English coconut-butter picker](screenshots/picker-en-coconut-butter.png) | `500b7586b8617a92c71c50fa168edb2f0172f25bee738629f066ee6766cab585` |
| [French coconut-butter picker](screenshots/picker-fr-coconut-butter.png) | `00279a368f6ddbedda702e84deea503b4fe4ce8461a4a2e24f1eae218ba65729` |
| [English adobo picker](screenshots/picker-en-adobo-sauce.png) | `5e4b0b0672ea1e083d1f86839b7c64a2e5b229ccbcb08e0733dbd9581f061fc7` |
| [French adobo picker](screenshots/picker-fr-adobo-sauce.png) | `c61c3d7024c32f710a1a5134f19e3bd01af821c7046c3cf42215e5d22295bc3f` |
| [English whole-hemp search](screenshots/picker-en-whole-hemp-seeds.png) | `62b93b659bf6e86d977475634f3ec7fb48b40bbd2c1f3eea7227894f67507430` |
| [French broad hemp search](screenshots/picker-fr-hemp-search.png) | `17d8e2c3b17986b962cf654249c48bba798c0d5ee4daa638acaf25108180c9bb` |

## Remaining review

The French names for coconut butter, Mexican adobo sauce, and whole hemp seeds remain provisional and are documented with their source limits in the linked proposals. The independent Québec bilingual approval of `orge en pot`, Mochiko, and Shiratamako remains open from the preceding batch. Chia identity/alias coverage and the wider WP02/WP03/WP05/WP06 catalog work also remain open.
