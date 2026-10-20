# WP02 alternative flours: hazelnut, coconut, and chestnut — 2026-10-10

## Coordinator decisions

- Added `ingredient-ref-hazelnut-flour` as identity-only `hazelnut flour / farine de noisette` in `FLOUR_AND_STARCH`, with no aliases.
- Added `ingredient-ref-chestnut-flour` as identity-only `chestnut flour / farine de châtaigne` in `FLOUR_AND_STARCH`, with no aliases.
- Held the unqualified `coconut flour / farine de noix de coco` candidate. The same broad product name is used for markedly different products, and the available sources do not establish a shared process.
- Kept hazelnut meal, defatted or roast-qualified hazelnut flour, chestnut powder, sweetened chestnut products, and water-chestnut flour distinct. No recipe links, forms, measurements, density, unit mappings, conversions, yields, or substitutions changed.

The pre-integration audit covered 679 active references, 34 forms, 84 legacy candidates, 865 ledger records, and 114 manifest-listed recipes / 1,123 ingredient rows. Neither accepted name nor the held coconut phrase had an exact owner or a recipe match. The reviewed proposals record the full key audit and source limits: [hazelnut flour](../../proposals/wp02-hazelnut-flour-identity-review-20261010.md), [coconut flour](../../proposals/wp02-coconut-flour-product-boundary-20261010.md), and [chestnut flour](../../proposals/wp02-chestnut-flour-identity-review-20261010.md).

## Evidence

- [Noccioro](https://www.noccioro.it/en/prodotti/farina-di-nocciole/) describes a hazelnut flour made from roasted, finely ground hazelnuts. [ABC Emballuxe's 2025 catalogue](https://abcemballuxe.com/wp-content/uploads/2025/06/Catalogue-ABC-EMBALLUXE_NOEL-XMAS-06-2025V1.pdf) lists `Farine de noisette Royale / Royale hazelnut flour`; this is source-attested bilingual wording, not an OQLF ruling. [Edora Hazelnuts](https://edorahazelnuts.com/products/hazelnut-flour/) describes particle-size and fat controls and project-specific defatted options, so those qualifiers were not made global aliases.
- [Markal](https://www.markal.fr/en/product/farcc500-chestnut-flour) describes chestnuts that are dried, peeled, and stone-ground. [Foricher](https://www.foricher.com/en/our-flours) lists `Farine Châtaigne / Chestnut flour`; [SIAL Paris's SAGI listing](https://www.sialparis.com/fr-FR/EXHIBITORS-2024/Produit/Chataignes-et-farine-de-chataigne-SAGI-SRL) also uses `farine de châtaigne`. The French display remains open to independent Québec terminology review.
- [Svansø](https://svansoe.dk/en/product/kokosmel/) calls a gently dried, grated product coconut flour and reports 65 g fat per 100 g. [Farm Boy](https://www.farmboy.ca/products/farm-boy-organic-coconut-flour-1-kg/) lists a finely milled Sri Lankan product as `Organic Coconut Flour / Farine De Noix De Coco Biologique` and reports 1 g fat per 15 g. These are product-label observations only: the retailer does not state the processing step, so no process or measurement was inferred.

## Pixel 9a picker verification

The debug app was installed on the `RecipeBook_Pixel_9a` AVD (`emulator-5556`, Android 16 / API 36). The table records the query and visible picker result:

| App locale | Search | Result | Screenshot |
| --- | --- | --- | --- |
| English | `hazelnut flour` | `hazelnut flour` | [PNG](screenshots/en-hazelnut-flour.png) |
| French | `farine de noisette` | `farine de noisette` | [PNG](screenshots/fr-hazelnut-flour.png) |
| English | `chestnut flour` | `chestnut flour` | [PNG](screenshots/en-chestnut-flour.png) |
| French | accent-folded `farine de chataigne` | `farine de châtaigne` | [PNG](screenshots/fr-chestnut-flour.png) |
| English | `coconut flour` | no result | [PNG](screenshots/en-coconut-flour-no-result.png) |
| French | `farine de noix de coco` | no result | [PNG](screenshots/fr-coconut-flour-no-result.png) |

Both blank QA drafts were discarded without saving. The pre-test database snapshot and WAL were restored before UI checks; the app's seed refresh added the two accepted references. A final read-only database check confirmed 114 recipes, 1,123 ingredient rows, and 681 references. The app was returned to French, and both final home screenshots show 114 recipes: [English](screenshots/home-en-114-recipes.png), [French](screenshots/home-fr-114-recipes.png). All eight screenshot files pass the recorded checksums in [SHA256SUMS.txt](screenshots/SHA256SUMS.txt).

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 681 references.
- `python3 -m unittest discover -s tools/seed_package -p 'test_*.py'` passed all 10 tests.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed 322 tests with zero failures, errors, or skips.
- Connected Android instrumentation on `emulator-5556` completed 30 cases: 28 passed, 2 skipped, zero failures or errors.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5556 bash tools/deploy_to_pixel9a_emulator.sh` completed its test/build/install/launch flow.
- The live picker results, restored database counts, screenshots and checksums were verified. `git diff --check` passed.

## Package snapshot

| Data | Count | SHA-256 / digest |
| --- | ---: | --- |
| Ingredient references | 681 | `719bf518ca9156789d629268b9cf8f3b85e5d177bee161b3606cb9bdf326f77a` |
| Ingredient forms | 34 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research ledger | 868 records / 1,566 source entries / 1,325 distinct source IDs | `1e9c1e466d269d68aa0f91a06230d6630cc1c65ea3fdd7b9515e30f7ae962131` |
| Legacy candidates | 84 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

The recipe corpus digest processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order. Independent Québec terminology review, hazelnut meal/process qualifiers, and a product specification that resolves the coconut-flour boundary remain open.
