# WP02 / WP03 / WP06 sago, lotus-seed, and locust-condiment checkpoint — 2026-10-10

## Integration decisions

- Added `sago pearls / perles de sagou` as an identity-only `FLOUR_AND_STARCH` reference for pearls made from palm-pith sago starch. Its sole stored alias is French singular `perle de sagou`; no English alias is needed because `sago pearl` is found by the picker’s substring fallback. Kept palm sago separate from the existing edible sago flour, cassava-derived sabudana/sagu, tapioca pearls, and tapioca starch. The Canadian French goods-list phrase supports wording but is not an OQLF pearl-specific recommendation.
- Added `sacred lotus seeds (Nelumbo nucifera) / graines de lotus sacré (Nelumbo nucifera)` as a separate identity with no aliases. The species qualifier stays in both displays while independent Québec French terminology review remains open. Existing lotus root, lotus-root starch, and `makhana seeds (Euryale ferox)` remain separate. The historical USDA SR28 dried-seed observation, 1 cup = 32 g for `Nelumbo` spp., remains evidence-only in the ledger; it creates no form or active conversion.
- Kept the existing `soumbala` row and alias arrays unchanged. The ledger now records the source-bounded related condiment family and process distinctions among soumbala, iru, dawadawa, afitin, sonru, and related regional names. No broader aliases, new rows, recipe links, measurements, forms, yields, or substitutions were added.
- A scan of all 114 manifest-listed recipes / 1,123 ingredient rows found no sago, sabudana, sagu, lotus-seed, makhana, or locust-condiment candidate text. No recipe links changed.

## Evidence

The [sago terminology proposal](../../proposals/wp02-sago-pearl-quebec-terminology-review-20261010.md), [lotus and fox-nut boundary proposal](../../proposals/wp03-lotus-seed-fox-nut-boundary-review-20261010.md), and [West African locust-condiment proposal](../../proposals/wp06-west-african-locust-bean-condiment-boundary-review-20261010.md) retain source locators and detailed limits.

Key independent references used for integration:

- [OQLF, “sagou”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8977829/sagou) defines the Québec French base term using grains from sago-palm pith. [FAO’s sago chapter](https://www.fao.org/4/x5045e/x5045E08.HTM) describes pearl sago as pellets made from palm-pith starch. The [Canadian CIPO goods list](https://publications.gc.ca/collections/collection_2011/opic-cipo/RG42-2-58-2980.pdf) documents `perles de sagou` in French administrative product wording, but does not establish OQLF preference or botanical source. India’s [BIS tapioca-sago preview](https://www.services.bis.gov.in/tmp/tbl5_2024-11-11-03-03.pdf) identifies Indian saboodana as cassava-derived, supporting the no-`sabudana`-alias boundary.
- Kew accepts [*Nelumbo nucifera*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:605422-1/general-information) and [*Euryale ferox*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:605350-1/general-information) as different species. India’s [eNAM makhana specification](https://enam.gov.in/web/docs/221_commodity_list.pdf) associates fox nut/gorgon nut/makhana with *E. ferox*; the [EU regulation’s French text](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32023R0652) defines its roasted-popped snack product. USDA [Standard Reference 28](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg12.pdf) is retained only as a historical, source-specific dried-seed portion observation.
- The Oxford [soumbala study](https://academic.oup.com/ijfst/article/56/2/804/7806253) names several regional products in the broad fermented locust-bean family. The Benin [product comparison](https://www.sciencedirect.com/science/article/pii/S0168160505005611) shows distinct processes/products from the same seed species, and FAO’s [iru processing description](https://www.fao.org/4/y4640e/y4640e02.htm) distinguishes `iru woro` from `iru pete`. These links support related-family context, not global synonym or substitution rules.

## Pixel 9a / Android 16 picker QA

The verified APK was installed and launched on `RecipeBook_Pixel_9a` (`emulator-5556`, API 36). Queries were checked against the live picker hierarchy; the listed PNGs capture the visible result.

| Locale | Query | Verified result | Screenshot |
|---|---|---|---|
| English | `sago pearl` | `sago pearls` | [PNG](screenshots/en-sago-pearl.png) |
| English | `sago` | `edible sago flour` and `sago pearls` | [PNG](screenshots/en-sago-broad.png) |
| English | `sabudana` | no result | [PNG](screenshots/en-sabudana-no-result.png) |
| English | `sagu` | no result | verified in the live picker hierarchy |
| French | `perle de sagou` | `perles de sagou` | [PNG](screenshots/fr-perle-de-sagou.png) |
| English | `sacred lotus seed` | `sacred lotus seeds (Nelumbo nucifera)` | [PNG](screenshots/en-sacred-lotus-seed.png) |
| French | `graines de lotus` | `graines de lotus sacré (Nelumbo nucifera)` | [PNG](screenshots/fr-graines-de-lotus.png) |
| French | `lotus` | separate lotus root, lotus-root starch, and sacred-lotus-seed rows | [PNG](screenshots/fr-lotus-boundaries.png) |
| English / French | `fox nut` | `makhana seeds (Euryale ferox)` / `graines de makhana (Euryale ferox)` | [English PNG](screenshots/en-fox-nut-makhana-distinct.png), [French PNG](screenshots/fr-fox-nut-makhana-distinct.png) |
| French | `soumbala` | existing `soumbala` row | [PNG](screenshots/fr-soumbala-existing.png) |
| French | `dawadawa` | no result | [PNG](screenshots/fr-dawadawa-no-result.png) |

All temporary blank-recipe probes were discarded without saving. The final screenshot shows the French home with all 114 recipes: [PNG](screenshots/home-fr-ca-114.png). The app was stopped after QA while the saved owner database and recipe-catalog preference were restored byte-for-byte. Their SHA-256 values match `/tmp/recipebook-owner-recipebook.db` (`4e5175c27806ed5778755164716b9e2fbf8f09ca0616df7e387211afa4c22621`) and `/tmp/recipebook-owner-recipe_catalog.preferences_pb` (`6d10aedaacfdb21227ab2053e3f6925cdee41da910111f0258dcb384f33073c8`). French remains selected in the app-language preference.

All screenshot checksums are in [`SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Verification

- Bundled package normalization and ingredient-reference normalization checks passed; generated `BundledIngredientCatalog.kt` is current at 714 references.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed. Research-ledger schema validation passed for 903 records with zero errors. `python3 -m unittest tools.seed_package.test_bundled_seed_package` passed all 10 tests.
- `:app:testDebugUnitTest` passed all 324 tests. The connected Pixel 9a `:app:connectedDebugAndroidTest` suite completed 30 cases: 28 passed, 2 skipped, 0 failed.
- `tools/deploy_to_pixel9a_emulator.sh` passed its `test` task and debug APK build, then installed and launched the app successfully on `emulator-5556`.
- `git diff --check` passed after the integration and documentation edits.

## Package snapshot

| Artifact | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 714 | `200a6b7d0651b86cb8ccb286d8799c321d01fd41a8e6f7524fff432725cc8489` |
| Ingredient forms | 34 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research ledger | 903 records / 1,773 source entries / 1,457 distinct source IDs / 8 unit conversions | `fcaf888322909022780f94d1744cf0bce70a01c265a4d1cdae0896fe4a61df20` |
| Legacy import candidates | 84 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

The broader flour/starch, seed/kernel, and African condiment checklist remains open for the other candidates, source-specific measurements, substitutions, and independent Québec terminology work.
