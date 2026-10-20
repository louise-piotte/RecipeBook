# WP03 Section G wrapper identity integration — 2026-10-10

## Result

Added five source-backed, identity-only wrapper references in `GRAIN_AND_CEREAL`:

| Stable ID | English | fr-CA display | Accepted aliases |
| --- | --- | --- | --- |
| `ingredient-ref-rice-paper-wrapper` | rice-paper sheets | feuilles de riz | EN: `rice paper`, `rice paper wrappers`; FR: `galettes de riz pour rouleaux de printemps`, `galettes pour rouleaux de printemps` |
| `ingredient-ref-wonton-wrapper` | wonton wrappers | pâtes à wonton | EN: `wonton skin`, `wonton skins`; FR: `pâte à wonton`, `pâtes à won ton`, `feuilles pour wonton` |
| `ingredient-ref-gyoza-wrapper` | gyoza wrappers | feuilles pour gyoza | EN: `gyoza skin`, `gyoza skins` |
| `ingredient-ref-wheat-spring-roll-pastry` | wheat spring-roll pastry | pâte de blé pour rouleaux de printemps | EN: `spring roll pastry` |
| `ingredient-ref-egg-roll-wrapper` | egg-roll wrappers | pâte pour rouleaux aux œufs | EN: `egg roll skins`; FR: `pâtes à egg rolls` |

The category stays `GRAIN_AND_CEREAL` for all five rows. Generic dumpling wrappers, bare `spring-roll wrapper`, and unqualified `pâte à rouleaux de printemps` remain unresolved because the sources distinguish rice sheets and wheat pastry without establishing one shared wrapper product. The OQLF entries for wonton, gyoza, and spring rolls name prepared foods; their terms were not misused as wrapper aliases. There are no wrapper ingredient lines in the bundled recipe corpus.

No forms, density, measurements, sheet-count conversions, yields, recipe links, or substitutions were added. The broader Section G checklist and independent Québec terminology review remain open.

## Evidence and boundaries

- OQLF distinguishes the prepared dishes [*wonton*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557347/wonton), [*gyoza*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557606/gyoza), and [*rouleau de printemps*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502859/rouleau-de-printemps); the last entry allows rice galette or wheat dough.
- Québec recipe/product wording supports `pâtes à wonton` ([Télé-Québec](https://cuisinez.telequebec.tv/recettes/6552/soupe-wonton)), `feuilles de riz` ([Télé-Québec](https://cuisinez.telequebec.tv/recettes/6965/rouleaux-de-printemps-aux-crevettes), [MITO Sushi](https://mito.ca/produit/feuilles-de-riz/)), and `galettes pour rouleaux de printemps` ([Loblaws](https://www.loblaws.ca/fr/galettes-pour-rouleaux-de-printemps/p/20189688_EA?source=nspt)). Québec specialty retailers separately list wonton and gyoza sheets and egg-roll products.
- Manufacturer product ranges distinguish spring-roll pastry, wonton skin, and gyoza skin ([Tee Yih Jia](https://tyjfood.com/Brands/Spring-Roll-Pastry)); another manufacturer lists separate wonton, spring-roll, egg-roll, and dumpling wrapper lines ([Wonton Food](https://www.wontonfood.com/en/products/wrappers/)). The exact product names and recipe examples do not supply universal sheet composition, size, yield, or conversion rules.
- Proposal and source IDs: [`wp03-section-g-wrapper-boundaries-review-20261010.md`](../../proposals/wp03-section-g-wrapper-boundaries-review-20261010.md), `WP03-WRAPPERS-20261010-S01`–`S17`.

## Picker verification

Verified on the disposable Pixel 9a-profile clone (`emulator-5556`, Android 16 / API 36). The screenshots cover all five accepted identities, French display labels, and unresolved generic phrases.

| Locale | Query | Result | Screenshot |
| --- | --- | --- | --- |
| EN | `rice paper` | rice-paper sheets | [PNG](screenshots/en-rice-paper.png) |
| FR | `galettes pour rouleaux de printemps` | feuilles de riz | [PNG](screenshots/fr-rice-paper.png) |
| EN | `wonton skin` | wonton wrappers | [PNG](screenshots/en-wonton-wrapper.png) |
| FR | `pates a won ton` | pâtes à wonton | [PNG](screenshots/fr-wonton-wrapper.png) |
| EN | `gyoza skin` | gyoza wrappers | [PNG](screenshots/en-gyoza-wrapper.png) |
| EN | `spring roll pastry` | wheat spring-roll pastry | [PNG](screenshots/en-wheat-spring-roll-pastry.png) |
| EN | `egg roll skins` | egg-roll wrappers | [PNG](screenshots/en-egg-roll-wrapper.png) |
| FR | `pates a egg rolls` | pâte pour rouleaux aux œufs | [PNG](screenshots/fr-egg-roll-wrapper.png) |
| EN | `dumpling wrapper` | no result | [PNG](screenshots/en-dumpling-wrapper-no-result.png) |
| EN | `spring-roll wrapper` | no result | [PNG](screenshots/en-spring-roll-wrapper-no-result.png) |
| FR | `pates a rouleaux de printemps` | no result | [PNG](screenshots/fr-spring-roll-wrapper-no-result.png) |

French query text uses accentless input where the emulator keyboard did not accept accents; displayed catalog labels preserve their French accents. `pates a rouleaux de printemps` was keyboard-corrected to the plural in the live UI. The seed-backed test separately asserts that the exact singular `pâte à rouleaux de printemps` remains unresolved. The final French library home shows 114 recipes: [PNG](screenshots/fr-library-home-114.png). Screenshot SHA-256 values are in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

## Validation

- `python3 -m unittest tools.seed_package.test_bundled_seed_package` — passed, 37 tests.
- Seed-reference and full-package normalizers, generated ingredient-index `--check`, and research-ledger validation — passed; ledger has 1,113 records and zero validation errors.
- `tools/deploy_to_pixel9a_emulator.sh` — passed generic `test`, debug APK assembly, streamed install, and app launch.
- The first full connected attempt hit a Compose `SlotWriter` exception during an existing persistence-test teardown after 8 cases. The isolated case passed on rerun, then the complete connected suite passed: 31 cases, 29 passed, 2 skipped, 0 failures.
- The final generic Gradle test run passed all 355 Android unit tests. The seed-package regression confirms wrapper identities/aliases, category, and held generic phrases from the canonical package.
- UI screenshots are 1080×2424 PNGs; all twelve screenshot checksums pass. The 114-recipe French home was restored after the unsaved draft was discarded.
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
