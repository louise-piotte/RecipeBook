# WP02 / WP03 / WP04 specialist flour, sorghum-flakes, and fish-ball review

**Reviewed:** 2026-10-11  
**Target:** Android 16 / Pixel 9a profile

## Decisions

- Added identity-only `ingredient-ref-japanese-weak-wheat-flour`: `Japanese weak wheat flour (hakurikiko)` / `farine de blé tendre japonaise (hakurikiko)`. The Québec French compound is provisional, built from the OQLF generic term and a country qualifier. `Japanese soft wheat flour` and `farine de blé mou japonaise` are scoped aliases. Generic cake flour, pastry flour, and broad soft-wheat terms remain separate; no flour crosswalk was inferred.
- Added identity-only `ingredient-ref-fish-balls`: `fish balls` / `boulettes de poisson`, with singular search aliases. It remains separate from raw surimi paste, fish cakes/croquettes, imitation seafood, and actual crab meat.
- Held sorghum flakes in `candidate-sorghum-flakes`. Retail evidence covers instant flakes and ready-to-eat crisp flakes without a shared process definition or a Québec/Canadian French label. The product-specific Well.ca serving remains source-scoped.
- Held unqualified surimi in `candidate-surimi-product-boundary`. Québec terminology and Canadian product labels cover paste inputs and finished surimi-based products; no recipe line says which one is meant.
- No recipes, ingredient rows, or forms changed. Both new references have null density and empty unit mappings; no recipe links, measures, conversions, yields, or substitutions were added.

## Evidence checked

The [MAFF flour classification](https://www.maff.go.jp/j/heya/sodan/1106/02.html) distinguishes the Japanese low-gluten, softer flour class and its uses. The [OQLF entry for farine de blé tendre](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre) supports the French generic base only. The [Nisshin catalog](https://nisshin-seifun.com/assets/pdf/nsf_catalog_english_2p.pdf) shows product-specific pastry-flour specifications, and the [Marukai item listing](https://shop.marukaihawaii.com/store/marukai-hawaii/products/24162212-nisshin-shokai-hakurikiko-violet-weak-wheat-flour-2-2-lb) attests the romanization alongside “weak wheat flour.” These sources support a qualified class identity, not class-wide equivalence to North American cake flour.

The [OQLF boulette de poisson entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435974/boulette-de-poisson) pairs the Québec French and English terms. [Metro's bilingual frozen fish-ball listing](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/boulette-de-poisson-surgelee/p/821964020282) and [Ocean Food's product line](https://www.oceanfoodcompany.com/fresh-sea-market) support the formed-product boundary; neither establishes a universal species or formula. For the held surimi term, [OQLF's surimi entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199047/surimi), [Metro's ready-to-use râpé de surimi listing](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/homards-crabes-et-goberge/rape-de-surimi/p/605453810154), and [CFIA surimi labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) show why the paste input and named finished products stay distinct.

For sorghum flakes, [Statistics Canada's milling survey](https://www23.statcan.gc.ca/imdb/p3Instr_f.pl?Function=assembleInstr&Item_Id=1530723&a=1&lang=fr) and [OQLF's sorgho entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho) supply the grain/human-food context, while [Well.ca](https://well.ca/products/gogo-quinoa-organic-instant-sorghum_132284.html), [OM Foods](https://omfoods.com/products/pastas-cereals-sorghum-crisps-flakes), and [CerealVeneta](https://cerealveneta.it/fr/semi-finis/flocons-de-sorgho-blanc/) show different product descriptions and processing detail. The [Puratos Canada grain mix](https://www.puratos.ca/en/products/Softgrain-Treize) lists cracked sorghum as a separate mix ingredient.

Proposal records: [WP02 Japanese weak wheat flour](../../proposals/wp02-specialist-baking-next-review-20261011.md), [WP03 sorghum flakes](../../proposals/wp03-section-f-next-grain-product-review-20261011.md), and [WP04 fish balls/surimi](../../proposals/wp04-fish-balls-surimi-product-boundary-review-20261011.md).

## Validation

- Bundled seed-package normalization and validation passed; `--check` reports no changes.
- Generated Kotlin catalog is current at 950 references.
- Python seed-package suite: **106 passed**.
- Research ledger: **1,220 records / 3,605 source entries / 2,942 distinct source IDs / 8 unit conversions / 0 validation errors**.
- Android unit tests: **409 passed, 0 failed**.
- Pixel 9a connected instrumentation: **36 tests, 34 passed, 2 skipped, 0 failed, 0 errors**. The first attempt stalled against an unresponsive stale emulator; after restarting the AVD without wiping its data, the full connected run succeeded.
- `tools/deploy_to_pixel9a_emulator.sh` completed the generic Gradle test and assemble steps, installed the app, and launched it on Android 16 (`emulator-5554`, 1080 × 2424).

## Picker QA

No picker result was selected. English searches returned:

| Query | Result |
|---|---|
| `hakurikiko` | Japanese weak wheat flour (hakurikiko) |
| `japanese soft wheat flour` | Japanese weak wheat flour (hakurikiko) |
| `cake flour` | Generic cake flour only |
| `fish ball` | fish balls |

French searches were typed without accents to exercise accent-folded search and returned:

| Query | Result |
|---|---|
| `farine de ble tendre japonaise` | farine de blé tendre japonaise (hakurikiko) |
| `farine de ble mou japonaise` | farine de blé tendre japonaise (hakurikiko) |
| `boulette de poisson` | boulettes de poisson |

The blank draft was discarded without saving. The app returned to `Toutes les recettes (114)` in French.

## Screenshots

SHA-256 values are included for the exact files in `screenshots/`.

| Capture | Screenshot | SHA-256 |
|---|---|---|
| English `hakurikiko` | [picker-hakurikiko-en.png](screenshots/picker-hakurikiko-en.png) | `27a1e478e8dcd7fd3fa252d97cef301c7e9824cf32bdde1786705b47b5c07adb` |
| English soft-wheat alias | [picker-japanese-soft-wheat-en.png](screenshots/picker-japanese-soft-wheat-en.png) | `72154e75ca0f064f0b8470a705b406743e386c475203acf6c0f76dc7543c87bd` |
| Generic cake-flour boundary | [picker-cake-flour-en.png](screenshots/picker-cake-flour-en.png) | `e2a43893ba72a0331a11b89ba00a5ed3dec49fe21b6fb2a0c196e4fc442c7774` |
| English fish-ball singular | [picker-fish-ball-en.png](screenshots/picker-fish-ball-en.png) | `e1c0aa308c9757ba09be76b3ed91ed9d93341791ddb46a7527087e39dde96d20` |
| French blé tendre name | [picker-farine-tendre-fr.png](screenshots/picker-farine-tendre-fr.png) | `c5d0908b3ab7971e1cf6ec50aa75af27911d53a1c7856444af4a5194b591f51e` |
| French blé mou alias | [picker-farine-mou-fr.png](screenshots/picker-farine-mou-fr.png) | `572b3a3d57b75a0781ba0d3475bd600da03ae8e9918befae01ffb9be708a1f0b` |
| French fish-ball singular | [picker-boulette-poisson-fr.png](screenshots/picker-boulette-poisson-fr.png) | `94e413ea2c2fb5d4d6476dec449fd07424c3e87d9c0586546712b0e32cc99fa9` |
| Restored French home | [home-fr-114-recipes.png](screenshots/home-fr-114-recipes.png) | `de7d533d84a2b8a1cef1d860e030eee71c8a38c21683226bfd11d1b4eb84e029` |

The overall ingredient-catalog plan remains open. Continue the remaining WP02/WP03/WP04 gap work and independent Québec terminology review.
