# WP02 / WP04 / WP05 malt flour, shio koji, and pepper-count integration

Date: 2026-10-10  
Status: Catalog, evidence ledger, regression coverage, plan, roadmap, and Pixel 9a picker QA are complete. Bilingual picker checks ran on a disposable Pixel 9a / Android 16 clone; the owner AVD base image remained unchanged.

Proposal inputs:

- [WP02 A7 held-candidate recheck](../../proposals/wp02-a7-held-candidate-recheck-20261010.md)
- [WP04 residual produce-count review](../../proposals/wp04-residual-produce-counts-review-20261010.md)
- [WP05 shio-koji identity-boundary review](../../proposals/wp05-shio-koji-identity-boundary-review-20261010.md)

## Accepted changes

### Generic malt flour

Add `ingredient-ref-malt-flour` as `malt flour / farine maltée`, category `FLOUR_AND_STARCH`, with only the English alias `malted cereal flour`. Keep malted barley/rye and other cereal-specific flours distinct, and keep malt extract or syrup distinct from flour. The former `candidate-generic-malt-flour` ledger record is merged into the accepted identity. Add no forms, measurements, recipe links, or substitutions.

The Government of Canada TERMIUM record supports the bilingual term pair; IREKS and Molino Merano describe product and cereal boundaries that do not justify broader aliases. Sources: [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=CEREAL+PREPARATION), [IREKS Compendium](https://www.ireks-kompendium.com/en/malt-flours-and-malt-extracts/definition-and-composition-of-malt-flour-and-malt-extract), and [Molino Merano 2024 catalogue](https://www.meranermuehle.it/media/74/b3/01/1707726283/EN_catalogo_generale_molino_merano.pdf).

### Shio koji

Add `ingredient-ref-shio-koji` as an identity-only `SAUCE_AND_CONDIMENT` entry. Use `shio koji` for both English and French display names, with English alias `salt koji` and French alias `koji au sel`. Keep it distinct from generic koji, rice koji/rice malt, amazake, and shoyu koji. Add no forms, numeric data, recipe links, or substitutions.

MAFF and JETRO describe shio koji as a distinct salted koji condiment and distinguish related products; Quebec product sources use `koji au sel`. Sources: [MAFF fermented-food guide](https://traditional-foods.maff.go.jp/files/user/pdf/An_Introduction_to_Japanese_fermented_foods.pdf), [JETRO](https://japan-food.jetro.go.jp/en/japanesecuisine/117.html), [MAFF beverages](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/inryou.html), [Aliments du Québec](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/shio-koji), and [San-Ô Shio Koji](https://labrasseriesan-o.ca/fr/products/koji-au-sel-salt-koji).

### Raw jalapeño and serrano portions

Record USDA SR28 source-specific portions only for the matching raw recipe lines:

- Jalapeño, NDB 11979: one raw pepper = 14.0 g; 8% refuse for stems and seeds. Link only recipe 034's pepper line, whose seed preparation is optional. Do not infer a seed-retained or cooked weight.
- Serrano, NDB 11977: one raw pepper = 6.1 g; 3% refuse for stems. Link only recipe 066's optional raw pepper line.

These are evidence observations, not active unit mappings or conversions. No recipe source text changed. See USDA SR28 [Food Group 11, jalapeño entry](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=1297) and [serrano entry](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=1301).

## Package snapshot

SHA-256 values below cover exact file bytes. The recipe fingerprint is computed from sorted manifest-relative recipe paths with NUL separators around each file's exact bytes.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 783 | `198dcc88fb36ecaad6515a3a5ad367a99d397ccd0f8e5dcfe8e1bb310eb865a2` |
| Ingredient forms | 36 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Research ledger | 1,006 records / 2,135 source entries / 1,730 source IDs | `efd9d4de54cda5f9f9c64b2bdc87e77da3ce931f4cb7ca5a60c1dfd8ec22f90c` |
| Seed manifest | — | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

## Verification

- Android unit tests: 341 passed, 0 failed, 0 skipped.
- Python seed-package tests: 24 passed.
- The repository deploy workflow completed `./gradlew test`, `:app:assembleDebug`, installation, and launch.
- Bundled package normalization, ingredient-reference normalization, generated-catalog freshness, and research-ledger validation passed; ledger validation reported 1,006 records and no errors.
- Changed seed JSON is UTF-8 without a BOM and stores localized accents as JSON Unicode escapes. `git diff --check` passed.
- Pixel QA ran on a disposable Pixel 9a / Android 16 clone at 1080 × 2424 and 420 dpi, serial `emulator-5558`. The app loaded 114 recipes.
- English `malt flour` returned `malt flour` and `roasted wheat malt flour`; `malted cereal flour` returned only `malt flour`. English `shio koji` and `salt koji` each returned only `shio koji`.
- With French displays active, accentless `farine maltee` returned only `farine maltée`, and `koji au sel` returned only `shio koji`. After discarding the unsaved draft, the French home displayed `Toutes les recettes (114)`.
- Screenshot SHA-256 values:

  | Screenshot | SHA-256 |
  |---|---|
  | `en-malt-flour-overlap.png` | `23c075628352c525c6cd84f548d458bd34301f35f0f183501fb46f15cebbe599` |
  | `en-malted-cereal-flour.png` | `2f17d174a6cae6f51f25ec2ccab111af4db578ae259471561b16cf107e17ef44` |
  | `en-shio-koji.png` | `3175b5c68126198e782c73a09b1838c4118eb8eb30a525990bab6b830f2068d1` |
  | `en-salt-koji.png` | `3b48d777110cf34a4133d675dbaa5f96870a97ee11607134bef3dafed80bfd0c` |
  | `fr-farine-maltee.png` | `d7bfb002eafbecd5b616dcd693f667c8ef70bb6754c93eaad18697c49fba07eb` |
  | `fr-koji-au-sel.png` | `7bf89b0490314d2c611c83dd6ac6e8353bbb40312d43a6079dc0b5717e3257ab` |
  | `fr-home-114-recipes.png` | `51195d01e601e5d0b98f92eaa5ec9ae8ffce3d3643dfdb0fee7a759bb5d81f87` |

- The owner AVD `userdata-qemu.img` SHA-256 was `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` before and after QA. Only serial 5558 was shut down; the disposable clone was removed.

## Remaining scope

Broader WP02 grain/flour coverage, WP04 animal-food and count/edible-portion fixtures, WP05 condiment coverage, and independent Québec terminology review remain open. This batch records narrow, source-backed additions without marking those sections complete.
