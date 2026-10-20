# WP03 seed and kernel identity integration — 2026-10-10

## Result

Integrated five identity-only seed references in `NUT_SEED_AND_DRIED_FRUIT`:

| Stable ID | English | fr-CA | Search aliases |
| --- | --- | --- | --- |
| `ingredient-ref-pumpkin-squash-seeds` | pumpkin seeds | graines de citrouille | FR: `graine de citrouille` |
| `ingredient-ref-sunflower-seeds` | sunflower seeds | graines de tournesol | FR: `graine de tournesol` |
| `ingredient-ref-flax-seeds` | flax seeds | graines de lin | EN: `flaxseed`, `flax seed`, `linseed`, `linseeds`; FR: `graine de lin` |
| `ingredient-ref-hemp-hearts` | hemp hearts | graines de chanvre décortiquées | EN: `hulled hemp seeds`, `shelled hemp seeds`; FR: `cœurs de chanvre` |
| `ingredient-ref-poppy-seeds` | poppy seeds | graines de pavot | EN: `poppy seed`; FR: `graine de pavot` |

No forms, densities, mappings, measurements, yields, substitutions, or recipe links were added. Source databases may show portions, but this identity pass deliberately adopted no numeric observations. The bundled recipe audit found zero matching files, rows, or links across 114 recipes and 1,123 ingredient rows.

## Boundary decisions

- Keep the pumpkin/squash seed row species-unspecified. Canadian procurement and USDA food-composition sources group pumpkin and other squash seeds while distinguishing hull and roast/salt states. Do not add `pepitas`, `graines de courge`, or the broader English alias `squash seeds`; the reviewed sources do not establish those as universal synonyms for the unqualified seed identity.
- Keep sunflower seeds as one identity whose food name covers hulled and unhulled achenes. Do not add `sunflower kernels`, which implies dehulled product; sunflower oil and seed butter remain separate products. The one external sunflower-to-egusi recipe alternative remains only in the existing egusi ledger record.
- Treat flax seed, flaxseed, and linseed as names for one culinary seed identity. Do not add bare `flax`, oil, meal, or flour products as aliases.
- Keep hemp hearts specifically hulled. Do not store unqualified `hemp seeds`, `graines de chanvre`, or whole/unhulled hemp wording as aliases; whole hemp seed remains a separate unresolved candidate. Because picker fallback uses phrase containment, the unqualified searches `hemp seeds` and `graines de chanvre` still surface the clearly labeled hulled hearts item. The English and French UI screenshots document that behavior.
- Keep culinary poppy seed separate from the poppy plant/flower, `coquelicot`, and poppy-seed oil.

The WP03 Section I identity proposals remain available for review: [pumpkin/squash seed and pepita boundary](../../proposals/wp03-pumpkin-seeds-pepitas-boundary-review-20261010.md), [sunflower seed and kernel boundary](../../proposals/wp03-sunflower-seed-kernel-boundary-review-20261010.md), and [flax, hemp-hearts, and poppy-seed gaps](../../proposals/wp03-flax-hemp-poppy-seed-gap-review-20261010.md). Each proposal was read-only; root rechecked the live catalog and recipe corpus before integration.

## Evidence

- The [OQLF pumpkin-seed entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18053242/graine-de-citrouille) supports the Québec French name and singular lookup alias. The [Canadian Department of National Defence food specification](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-20-2018-fra.pdf) covers pumpkin and other squash seeds and documents hull-state ambiguity. USDA’s [Food Group 12 records](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg12.pdf) distinguish dried, roasted salted, and roasted unsalted pumpkin/squash kernels; no measures were adopted.
- The [OQLF sunflower-seed entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015064/graine-de-tournesol) gives the Québec French term and states that the food-industry name covers hulled and unhulled achenes. USDA’s [sunflower-seed standard](https://www.ams.usda.gov/sites/default/files/media/SunflowerSeedStandards.pdf) defines hull-bearing seed separately from dehulled seed. Québec product labels document the dehulled state without making it a universal alias: [Arôme des champs](https://boutiquearomedeschamps.com/products/graine-tournesol) and [La Moisson](https://lamoisson.com/products/graines-de-tournesol-crues-decortiquees-biologique).
- Health Canada’s [CNF flax record](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4528) pairs “flaxseed (linseed)” and “graines, lin.” Its [hulled-hemp record](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=7568) gives “Graines de chanvre, décortiquées.” Canadian product sources support `hemp hearts` / `cœurs de chanvre`: [Manitoba Harvest](https://manitobaharvest.ca/fr/products/natural-hemp-hearts) and [Nutworks Canada](https://store.nutworks.ca/fr/products/hemp-hearts).
- The [OQLF food entry for graine de pavot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095300/graine-de-pavot) pairs the culinary French and English names and identifies *Papaver somniferum*. OQLF’s [coquelicot entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17067491/coquelicot) is botanical, supporting its exclusion from the seed aliases.

## Pixel 9a picker QA

Verified on `emulator-5556` (Pixel 9a profile, Android 16 / API 36). The English and French searches below showed the expected localized identity. Held terms showed no seed result unless noted.

| Locale | Query | Result | Screenshot |
| --- | --- | --- | --- |
| EN | `pumpkin seeds` | pumpkin seeds | [PNG](screenshots/en-pumpkin-seeds.png) |
| EN | `sunflower seeds` | sunflower seeds | [PNG](screenshots/en-sunflower-seeds.png) |
| EN | `flaxseed` | flax seeds | [PNG](screenshots/en-flaxseed.png) |
| EN | `hemp hearts` | hemp hearts | [PNG](screenshots/en-hemp-hearts.png) |
| EN | `hulled hemp seeds` | hemp hearts | [PNG](screenshots/en-hulled-hemp-seeds.png) |
| EN | `poppy seeds` | poppy seeds | [PNG](screenshots/en-poppy-seeds.png) |
| EN | `pepitas` | no result | [PNG](screenshots/en-pepitas-no-result.png) |
| EN | `sunflower kernels` | no result | [PNG](screenshots/en-sunflower-kernels-no-result.png) |
| EN | `whole hemp seeds` | no result | [PNG](screenshots/en-whole-hemp-seeds-no-result.png) |
| FR | `graines de citrouille` | graines de citrouille | [PNG](screenshots/fr-pumpkin-seeds.png) |
| FR | `graines de tournesol` | graines de tournesol | [PNG](screenshots/fr-sunflower-seeds.png) |
| FR | `graines de lin` | graines de lin | [PNG](screenshots/fr-flax-seeds.png) |
| FR | `coeurs de chanvre` | graines de chanvre décortiquées | [PNG](screenshots/fr-hemp-hearts.png) |
| FR | `graines de chanvre` | graines de chanvre décortiquées through phrase containment | [PNG](screenshots/fr-hemp-unqualified-query.png) |
| FR | `graines de chanvre decortiquees` | graines de chanvre décortiquées | [PNG](screenshots/fr-hemp-hulled-label.png) |
| FR | `graines de pavot` | graines de pavot | [PNG](screenshots/fr-poppy-seeds.png) |
| FR | `graines de courge` | no result | [PNG](screenshots/fr-graines-de-courge-no-result.png) |
| FR | `coquelicot` | no result | [PNG](screenshots/fr-coquelicot-no-result.png) |

The final screenshot shows the restored French home with 114 recipes: [PNG](screenshots/home-fr-ca-114.png). Screenshot checksums are recorded in [`SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Pixel profile restoration

The captured owner files were restored byte-for-byte after QA. The app-language preference contains `FR`; the saved Room `library_settings` row contains `EN`, so a cold launch initially displayed English. French was selected in the app menu for picker QA and the final screenshot; then the app was force-stopped and the captured database and preferences were restored. No recipes or local rows were changed by this batch.

| File | Restored SHA-256 |
| --- | --- |
| `databases/recipebook.db` | `4e5175c27806ed5778755164716b9e2fbf8f09ca0616df7e387211afa4c22621` |
| `files/datastore/recipe_catalog.preferences_pb` | `6d10aedaacfdb21227ab2053e3f6925cdee41da910111f0258dcb384f33073c8` |
| `files/datastore/app_language.preferences_pb` | `d116672ec5a029be8308bac97ad535bd4365844149bb44a97ec4edbffbe83ba0` |

## Verification

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py` normalized the 719 reference rows; `python3 tools/seed_package/normalize_bundled_seed_package.py` completed with zero additional part changes; `--validate-only` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed; generated `BundledIngredientCatalog.kt` is current at 719 references.
- Research-ledger validation passed for 908 records with zero errors. `python3 -m unittest tools.seed_package.test_bundled_seed_package` passed all 10 tests.
- `:app:testDebugUnitTest --no-daemon` passed all 326 tests. Pixel 9a `:app:connectedDebugAndroidTest --no-daemon` completed 30 cases: 28 passed, 2 skipped, 0 failures or errors.
- `tools/deploy_to_pixel9a_emulator.sh` passed its unit-test/build tasks, installed the debug APK, and launched `app.recipebook/.MainActivity` on `emulator-5556`.
- Owner database, recipe-catalog preference, and app-language preference matched their captured SHA-256 values after restoration. The final app process was force-stopped after the French home screenshot.
- `git diff --check` passed after the integration and documentation edits.

## Package snapshot

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 719 | `8fd20068788d49cf51b2dd07c031468865f83cfb848e6c8bf9f7c77baaa548ea` |
| Ingredient forms | 34 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research ledger | 908 records; 1,791 source entries / 1,475 unique source IDs | `29f29c3f77264ff1ae304b1329e5743c8910e0483b53968452d7b3e012691ac7` |
| Legacy candidates | 84 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe set | 114 files / 1,123 ingredient rows | `83daad2b3cab9782f079d0e976b7493a23899676ef18185c0b98d4225d860695` |

Forms, recipes, unit definitions, substitutions, package yields, and recipe links are unchanged. WP03 Section I and the broader global catalog plan remain open; chia, whole hemp seeds, other melon-seed products, regional kernels, product-state measures, and nut/seed pastes remain for later review.
