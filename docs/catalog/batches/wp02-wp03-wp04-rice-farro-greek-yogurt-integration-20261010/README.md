# WP02/WP03/WP04 rice-flour, farro, and Greek-yogurt boundary integration — 2026-10-10

## Coordinator decisions

- Kept `mochiko` and `shiratamako` unassigned. The generic `glutinous rice flour / farine de riz gluant` reference and its existing aliases remain unchanged; neither Japanese product name is an active alias or form.
- Kept unqualified `farro` unresolved across species and grain/flour product states. It is not an alias of emmer grain or flour, spelt, or einkorn. No generic farro reference, form, or recipe link was added.
- Promoted the existing legacy candidate to `Greek-style yogurt / yogourt grec`, with English aliases `Greek yogurt`, `Greek yoghurt`, and `Greek-style yoghurt`. Added `plain Greek-style yogurt / yogourt grec nature` as a product form under that identity.
- Relinked the four recipe lines whose exact source text says `plain Greek yogurt`. The original source text and quantities remain unchanged. `preparation` now carries `plain / nature`; the two redundant `Greek style` notes were removed because the identity itself supplies that qualifier.
- Kept active `plain yogurt / yogourt nature` separate. The optional Strawberry Cake line `75 g sour cream or plain yogurt, room temperature` remains unlinked; generic legacy `yogurt / yogourt` remains unresolved. No strained-yogurt alias, measurements, densities, conversions, yields, or substitutions were added.

## Evidence and limits

The Japanese product review is recorded in the [proposal packet](../../proposals/wp02-japanese-rice-flour-products-boundary-20261010.md). [MAFF's rice-flour overview](https://www.maff.go.jp/j/syouan/keikaku/soukatu/okome_summary/09/rice_flour_pro_cessing_03.html) reports that regional rice-flour products do not have uniform flour-like definitions or standards and that processing methods vary. Maehara Seifun's [product category](https://www.gishi.co.jp/home/item.asp?ct=19) and [comparison page](https://www.gishi.co.jp/home/faq_view.asp?id=77) describe conflicting general mochiko processes. [Télé-Québec](https://cuisinez.telequebec.tv/recettes/6076/mochis-a-la-creme-glacee) uses the local French phrase `farine de riz gluant` and describes a texture distinction, but does not resolve catalog identity versus form. The combined evidence supports withholding universal aliases and process rules.

The farro evidence and complete source register are in the [boundary proposal](../../proposals/wp02-wp03-farro-grain-flour-boundary-20261010.md). [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier) lists farro for emmer, while [TERMIUM](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=2&i=&index=enb&lang=fra&sg_kp_wet=215052&srchtxt=EINKORN) and the federal food-quality source document broader use across einkorn, emmer, and spelt. Current Québec and Canadian products use farro in both grain and flour contexts. These sources do not establish one unqualified global identity or product state.

The Greek-yogurt source register is in the [identity proposal](../../proposals/wp04-greek-style-yogurt-identity-boundary-review-20261010.md). Health Canada's [Canadian Nutrient File entry](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=7469) uses bilingual Greek-style/plain naming; the Québec [food directory listing](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8202503) and [Saputo Foodservice listing](https://www.saputofoodservice.ca/fr-ca/produits-laitiers/yogourt/yogourt-grec-nature) confirm local `yogourt grec nature` product wording. The federal procurement specification's process description is specific to that procurement and was not generalized. No nutrition amounts or serving data were adopted.

## Recipe rows

| Recipe | Exact source text | New reference and form | Quantity |
|---|---|---|---|
| Crab Balls `019#2` | `1/4 cup plain Greek yogurt` | `ingredient-ref-greek-yogurt` / `ingredient-form-greek-yogurt-plain` | unchanged |
| Crab Balls `019#12` | `1/4 cup plain Greek yogurt` | `ingredient-ref-greek-yogurt` / `ingredient-form-greek-yogurt-plain` | unchanged |
| Butter Chicken `086#5` | `1/2 cup plain Greek yogurt` | `ingredient-ref-greek-yogurt` / `ingredient-form-greek-yogurt-plain` | unchanged |
| Tzatziki `113#2` | `1 1/2 cups plain Greek yogurt` | `ingredient-ref-greek-yogurt` / `ingredient-form-greek-yogurt-plain` | unchanged |

The separate Strawberry Cake choice remains unassigned because its text offers generic plain yogurt as an alternative to sour cream.

## Pixel 9a verification

Installed and checked on the Pixel 9a / Android 16 AVD `RecipeBook_Pixel_9a` (`emulator-5556`). Search results were checked in both app locales:

| Locale | Query | Result | Screenshot |
|---|---|---|---|
| English | `Greek yogurt` | `Greek-style yogurt` | [PNG](screenshots/en-greek-yogurt-picker.png) |
| English | `plain Greek yogurt` | `Greek-style yogurt`, with the `plain Greek-style yogurt` form hint | [PNG](screenshots/en-plain-greek-yogurt-form-hint.png) |
| English | `plain yogurt` | only the separate `plain yogurt` identity | [PNG](screenshots/en-plain-yogurt-separate.png) |
| French | `yogourt grec` | `yogourt grec` | [PNG](screenshots/fr-yogourt-grec-picker.png) |
| French | `yogourt grec nature` | `yogourt grec`, with the `yogourt grec nature` form hint | [PNG](screenshots/fr-yogourt-grec-nature-form-hint.png) |
| English | `farro` | no result | [PNG](screenshots/en-farro-unresolved.png) |
| English | `mochiko`, `shiratamako` | no result for either held term | verified in the on-device picker hierarchy |

The temporary QA drafts were discarded without saving. The final French home screen shows all 114 recipes: [screenshot](screenshots/home-fr-ca-114.png). The picker and form screenshots are archived in [`screenshots/`](screenshots/); all nine PNG checksums pass in [`SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 677 generated references.
- `python3 -m unittest discover -s tools/seed_package -p 'test_*.py'` passed all 10 tests.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed 318 tests with zero failures, errors, or skips. The deployment script's full `test` task and `:app:assembleDebug` also passed.
- `ANDROID_SERIAL=emulator-5556 ./gradlew :app:connectedDebugAndroidTest --no-daemon --console=plain` completed 30 instrumentation cases: 28 passed, 2 environment skips, 0 failures. `plainGreekYogurtSearchSelectsGreekIdentityAndPersistsPlainFormHint` passed.
- The deployment script installed and launched successfully on the intended `RecipeBook_Pixel_9a` AVD. A first automatic selection targeted the other attached `Pixel_9a` AVD and failed for low storage; rerunning with `RECIPEBOOK_EMULATOR_SERIAL=emulator-5556` succeeded.
- Live bilingual picker checks and restoration of the French 114-recipe home passed. `git diff --check` passed, and all nine screenshot checksums verified.

## Package snapshot

| Data | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 677 | `2f961dc744b2b30ea13348b3e9c7a1e8fd1f56b6368b6f8a8d0120d872e5c03b` |
| Ingredient forms | 34 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research ledger | 863 records / 1,550 source entries / 1,309 distinct source IDs | `39277b9f467badaabb9fc8d1878180873f8270738ce3d66196eeebb9d8616411` |
| Legacy candidates | 84 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

Recipe corpus digest processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order. Full regional/dairy coverage, the generic-yogurt boundary, unqualified farro, the Japanese rice products, and independent Québec terminology review remain open where listed in the master plan.
