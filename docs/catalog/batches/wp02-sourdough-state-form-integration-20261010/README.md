# WP02 sourdough starter state and form integration — 2026-10-10

## Result

Kept maintained sourdough culture under the existing `ingredient-ref-sourdough-starter` identity. Added the precise fr-CA alias `levain chef` and one form for a dried culture explicitly sold for reactivation:

| Field | Value |
| --- | --- |
| Form ID | `ingredient-form-sourdough-starter-dehydrated-reactivatable` |
| Form code | `dehydrated_reactivatable` |
| EN / fr-CA | `dehydrated sourdough starter` / `levain naturel déshydraté` |
| Preparation state | `dry` |
| Match terms | None |

Recipe-built levain, starter discard, and activity/timing words remain recipe-specific states. Bare `levain`, `levain tout point`, `levain écarté`, `sourdough discard`, and unqualified `levain déshydraté` were not added as global aliases. The reviewed reactivatable culture remains separate from a devitalized sourdough-flavor baking product. No bundled recipe contains a sourdough-starter ingredient line.

No recipe links, density, measurements, package yield, unit mappings, conversions, or substitutions were added. The independent Québec terminology review remains open.

## Evidence and boundaries

- The [OQLF entry for *levain*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8887672/levain) is broader than a maintained sourdough starter, so bare `levain` is not added as an alias.
- A [Québec fermentation guide](https://revolutionfermentation.com/blogs/tempeh-soya-cereales/comment-faire-son-levain-maison/) distinguishes the retained `levain chef`, a refreshed `levain tout point`, and `levain écarté` removed during maintenance.
- The [Québec reactivatable dehydrated starter product](https://shop.revolutionfermentation.ca/products/levain-poudre-deshydrate) and its [activation manual](https://revolutionfermentation.com/fra/blogs/tempeh-soja-cereales/manuel-levain-deshydrate/) support the qualified form. A separate [devitalized product](https://primeal.bio/fr/nos-produits/farines-aides-a-la-panification/aides-a-la-panification/levble-bio-260g/) is added directly to dough, so generic `levain déshydraté` is not an automatic match.
- Proposal and source IDs: [`wp02-levain-discard-dried-starter-gap-review-20261010.md`](../../proposals/wp02-levain-discard-dried-starter-gap-review-20261010.md), `WP02-E-STARTER-STATE-20261010-S01`–`S10`.

## Picker verification

Verified on the disposable Pixel 9a-profile clone (`emulator-5556`, Android 16 / API 36). Query text is ASCII in the screenshots because the emulator keyboard did not accept accented characters through shell text input; the search is accent-folded, and the displayed French result preserves its accents.

| Locale | Query | Result | Screenshot |
| --- | --- | --- | --- |
| FR | `levain chef` | `levain naturel` | [PNG](screenshots/fr-levain-chef.png) |
| FR | `levain naturel deshydrate` | `levain naturel`, with `levain naturel déshydraté` as the form hint | [PNG](screenshots/fr-levain-naturel-deshydrate.png) |
| FR | `levain deshydrate` | no result | [PNG](screenshots/fr-levain-deshydrate-no-result.png) |
| FR | `sourdough discard` | no result | [PNG](screenshots/fr-sourdough-discard-no-result.png) |

After dismissing the picker, the unsaved draft was discarded. The final French library screen shows all 114 recipes: [PNG](screenshots/fr-library-home-114.png). Screenshot SHA-256 values are in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Validation

- `python3 -m unittest tools.seed_package.test_bundled_seed_package` — passed, 37 tests.
- Seed-reference and full-package normalizers, generated ingredient-index `--check`, and research-ledger validation — passed; ledger has 1,113 records and zero validation errors.
- `tools/deploy_to_pixel9a_emulator.sh` — passed generic `test`, debug APK assembly, streamed install, and app launch.
- The first full connected attempt hit a Compose `SlotWriter` exception during `CountIngredientPersistenceTest` teardown after 8 cases. The isolated case passed on rerun, then the complete connected suite passed: 31 cases, 29 passed, 2 skipped, 0 failures.
- The final generic Gradle test run passed all 355 Android unit tests. The seed-package regression confirms the canonical starter alias/form and excludes the held terms.
- UI screenshots are 1080×2424 PNGs; all five screenshot checksums pass. The 114-recipe French home was restored after the unsaved draft was discarded.
- The original `emulator-5554` AVD was left untouched; all UI work used the disposable clone. The clone is shut down and removed after verification.

## Package snapshot

Snapshot after the integration; the recipe corpus remains 114 files / 1,123 ingredient rows.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 867 | `6fb175c66019050aaef8e8f34a405200eda893bfb3fd67c5acaf77ad3a1cdf95` |
| Ingredient forms | 48 | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| Research ledger | 1,113 records; 2,679 source entries / 2,096 source IDs | `92192fb3de6c0707ab7ea3ad0e6b0f66ecf40aa348e4a9b40eaf6b60c0b1b040` |
| Generated ingredient index | 867 references | `6ce4dcafaaf076fd59d1c31aecd591f1897a58184424642e6bbfbcdfa2816795` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
