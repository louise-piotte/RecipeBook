# WP04 sea-cucumber identity and dried body-wall form integration

- **Date:** 2026-10-11
- **Status:** Integrated a species-scoped *Cucumaria frondosa* identity and one documented dried, gutted body-wall form. Generic sea cucumber remains unresolved.
- **Review packet:** [current-product-state reassessment](../../proposals/wp04-sea-cucumber-current-product-state-reassessment-20261011.md).

## Integrated decision

Added `ingredient-ref-orange-footed-sea-cucumber` with English display `orange-footed sea cucumber`, Québec/Canada French display `holothurie touffue`, and category `PROTEIN`. Its English aliases are `Atlantic sea cucumber`, `Cucumaria frondosa`, `North Atlantic sea cucumber`, and `northern sea cucumber`; its French alias is `concombre de mer du Nord`. These are species-scoped names. Bare `sea cucumber` / `concombre de mer`, `bêche-de-mer`, `trepang`, and `sea slug` are not aliases.

Added `ingredient-form-orange-footed-sea-cucumber-dried-gutted-body-wall` with English label `dried gutted body wall of orange-footed sea cucumber`, French label `paroi corporelle séchée d’holothurie touffue éviscérée`, and `prepState: dry`. The form remains separate from the edible muscles, frozen or whole products, and products from other species. No recipe link, density, unit mapping, measurement, package behavior, conversion, rehydration ratio, yield, or substitution was added.

The 114 bundled recipes have no matching sea-cucumber, species, edible-part, or synonym text. The broader `candidate-sea-cucumber` remains `needs_clarification`; its evidence record now explains that the narrow identity and form do not resolve generic wording.

## Evidence reviewed

The 2026 OQLF entry maps *Cucumaria frondosa* to `holothurie touffue`, lists `concombre de mer du Nord`, and gives species-qualified English terms. The dynamic CFIA Fish List applies `Sea Cucumber / Concombre De Mer` to multiple species. Fisheries and Oceans Canada describes the body wall and muscles as edible parts; the 2021 Québec processing study reports that *C. frondosa* is usually sold to Asian markets as dried, gutted body wall. Current Fourchette bleue and Québec product listings corroborate dried or frozen sales. The 2026 MAPAQ directory lists a Québec dried product and separately maps its sea-cucumber nomenclature to *C. frondosa*; it does not combine all species and part details on a consumer-facing SKU.

Sources: [OQLF species entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26583978/holothurie-touffue), [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=s), [DFO Minganie fishery report](https://publications.gc.ca/collections/collection_2015/mpo-dfo/Fs97-6-3052-fra.pdf), [2021 processing study](https://journals.plos.org/plosone/article?id=10.1371/journal.pone.0245238), [Fourchette bleue](https://fourchettebleue.ca/produits/concombre-de-mer/), [Aliments du Québec](https://alimentsduquebec.com/aliments-dici/poissons-et-fruits-de-mer/concombre-de-mer-seche), and [MAPAQ 2026 export directory](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/GM_entreprises-maritimes-exportatrices-produits-mer_MAPAQ.pdf).

The sources establish a species and a commercial form, not household quantities. Fishery processing recovery, package sizes, and rehydration claims were not converted into culinary measurements.

The package now has **971 references / 61 forms / 114 recipes / 1,123 ingredient rows / 1 package yield**. The ledger has **1,245 records / 3,900 source entries / 3,192 distinct source IDs / 8 unit conversions / 0 validation errors**.

## Verification

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: **110 tests passed**.
- `:app:testDebugUnitTest`: **424 tests passed; 0 failures, 0 errors, 0 skipped**.
- `:app:connectedDebugAndroidTest`: **52 tests total; 50 executed, 2 skipped, 0 failures** on Android 16 / API 36 Pixel 9a QA. Both new English and French form-picker cases passed.
- Bundled seed-package normalization, ingredient-reference normalization, generated Kotlin catalog freshness, and research-ledger validation passed. The generated catalog contains **971 references**; ledger validation found **0 errors**.
- `tools/deploy_to_pixel9a_emulator.sh` passed test and assemble stages, installed the APK on disposable `emulator-5556`, and launched the app.
- Manual English picker search for `dried gutted body wall of Cucumaria frondosa` returned `orange-footed sea cucumber` and displayed the dried body-wall form. French search for `concombre de mer du Nord` returned `holothurie touffue`; the French form label remained selected. The empty draft was discarded and the home screen returned to `Toutes les recettes (114)`.
- Instrumentation ran on `emulator-5556`; the connected-device runner logged a property-read timeout for registered `emulator-5554`, but scheduled all tests on `5556`. No app installation or test execution was directed to `5554`.
- The seed package retains escaped Unicode; maintained text is UTF-8 without BOM and scoped whitespace checks passed.

## Screenshots

Captures are **1080 × 2424**. SHA-256 values are stored in [SHA256SUMS.txt](SHA256SUMS.txt).

| Screen | SHA-256 |
| --- | --- |
| [English home after deploy](screenshots/home-after-deploy.png) | `81b869abb51999b9406bdc1849e40c80c8307f70d1a928007b4b689d0c116df5` |
| [English dried-form picker result](screenshots/picker-en-dried-body-wall-form.png) | `1a620cbf7429f714474b975c00b52942460c8ddc17e50907dcc221350f2d3ab5` |
| [English selected identity and form](screenshots/selected-form-en.png) | `c6664ed6149153fd02df33486a6fc1151ace97718e9aa114eeb74c6b212f5956` |
| [French species-name picker result](screenshots/picker-fr-concombre-de-mer-du-nord.png) | `4238c907b9cb9819f4cd0e8b26f59c4ef039e740af9e1917768326bd0149db92` |
| [French selected identity and form](screenshots/selected-form-fr.png) | `a2a2e0cb32ebfe52be6415c8e80f54e4976c5a395774d0b7a6813183a68f953b` |
| [Restored French home](screenshots/home-fr-after-qa.png) | `606a0f5a8d710ffd9e89e6f35a7b92a1f7514f9a0ceca45be1a8d08ac0c2c1cd` |

## Remaining WP04 seafood gaps

Keep the generic sea-cucumber candidate unresolved and leave muscles, frozen/whole products, rehydration behavior, and other species for separate evidence reviews. The broader WP04 regional-seafood checklist remains open.
