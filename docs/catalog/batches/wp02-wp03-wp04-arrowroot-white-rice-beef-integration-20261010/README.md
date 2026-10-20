# WP02 / WP03 / WP04 residual cohort integration

Date: 2026-10-10  
Status: Catalog, recipe links, evidence ledger, regression coverage, plan, roadmap, and Pixel 9a UI verification are complete. Picker QA ran on a disposable Pixel 9a clone; the owner AVD data image remained unchanged.

Proposal inputs:

- [WP02 B2/B3 residual regional flour and starch review](../proposals/wp02-b2-b3-regional-starches-residual-gap-review-20261010.md)
- [WP03 Section F residual grain and cereal audit](../proposals/wp03-section-f-residual-gap-audit-20261010.md)
- [WP04 animal-food residual coverage audit](../proposals/wp04-animal-foods-residual-coverage-audit-20261010.md)

## Accepted changes

### Arrow-root labels

Keep `ingredient-ref-arrowroot` as the broad extracted-starch identity with the existing `arrowroot / arrow-root` displays. Add these product-label aliases:

- English: `arrowroot starch`, `arrowroot flour`, `arrowroot powder`
- French: `farine d'arrow-root`, `fécule d'arrow-root`

The sources support one food-grade extracted-starch product family; they do not establish a single botanical source for every market label. Keep `marante`, Japanese arrowroot/kudzu, tapioca/cassava starch, and whole-root flour separate. Water-chestnut corm and *Trapa* products remain held because they have distinct materials and no safe shared bilingual names were established.

Bob's Red Mill's chart reports 36 g per 1/4 cup and 144 g per cup for its Arrowroot Starch. Both remain source-specific `portion_weight` ledger observations. The cup convention and packing method are unspecified, so there is no active density, unit mapping, conversion, or household default. The manufacturer's bounded cornstarch-replacement guidance was not activated as a runtime rule.

Evidence: [OQLF arrow-root](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522596/arrow-root), [eNAM Raw Arrowroot Powder specification](https://enam.gov.in/web/docs/221_commodity_list.pdf), [Bob's Red Mill starch guidance](https://www.bobsredmill.com/articles/all-about-starches), [Bob's Red Mill flour weight chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart), and the [Metro Canada French product listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-d-arrow-root-sans-gluten/p/039978335050).

### White rice

Add `ingredient-ref-white-rice` as `white rice / riz blanchi`, with English alias `milled rice` and French alias `riz blanc`. Add dry and cooked forms with null density. Link only recipe 066's exact `Cooked white rice, for serving` line to `ingredient-form-white-rice-cooked`; preserve its optional flag, quantity `1`, serving unit, and source text.

The bilingual broad queries `white rice` and `riz blanc` also return the existing white-rice-flour reference by phrase containment. The more specific `riz blanchi` and cooked-form queries identify white rice. Tests preserve this picker overlap and verify form hints. The 2015 CNF portions remain historical/product-specific; the current 2026 rice rows were not reviewed. Measurement state remains blocked, with no density, unit mapping, cooking yield, conversion, or substitution.

Evidence: [OQLF riz blanchi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432775/riz-blanchi), [Codex Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf), [Health Canada CNF information](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), and [The Kitchn source recipe](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937).

### Generic beef

Add `ingredient-ref-beef` as `beef / bœuf`, `PROTEIN`, with no aliases, forms, or numeric data. Link only recipe 015's exact `400 g beef` line. Keep ground beef / bœuf haché, beef stock, stew meat, named cuts, and other species distinct. Broad `beef` and `bœuf` searches return generic beef, ground beef, and beef stock; `ground beef` and `bœuf haché` remain specific to ground beef.

Evidence: [OQLF bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434373/boeuf), [OQLF viande de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434368/viande-de-boeuf), and the [CFIA beef meat-cut manual](https://inspection.canada.ca/DAM/DAM-food-aliments/STAGING/text-texte/meat_labelling_cutman_beef_1348582087107_eng.pdf).

## Package snapshot

Hashes are SHA-256 of exact file bytes. Recipe fingerprint uses each sorted manifest-relative recipe path, NUL, exact file bytes, NUL.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 753 | `9b84507e9c7bf13f70a6389fa13b7f7d0cf035c5569c5eef13c77688a02e48e6` |
| Ingredient forms | 36 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Evidence ledger | 958 records / 1,945 source entries / 1,576 source IDs | `efccb44cd5ede7f5b8eea9ad7e0bce604ee0302b3544e75adcab0a28ec16ee92` |
| Legacy candidates | 82 | `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| Seed manifest | — | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `d2b4eb5cfd668aaf3d375b6439ce40781a0c784879732d8c28d648a58a43ac98` |

## Verification

- Android unit tests: 334 passed, 0 failed.
- Python seed-package tests: 13 passed.
- Bundled seed package normalization and validation passed.
- Ingredient-reference normalization, generated Kotlin catalog freshness, and research-ledger schema validation passed.
- `git diff --check` passed.
- The repository deploy script completed its full Gradle `test` task and `:app:assembleDebug` on the confirmed `Pixel_9a` AVD (`emulator-5554`). Windows ADB then failed to install with `INSTALL_FAILED_INSUFFICIENT_STORAGE`; `/data` reported 409 MB available. `pm trim-caches 1G` freed no space. No app data was cleared and no AVD image was wiped.
- Follow-up UI verification used the current 781-reference debug APK (`6de2034126fa6390f0f152e971076e50ee57cff2a8fd8c24d196f967fdd42987`) on a disposable Pixel 9a clone at 1080×2424 / 420 dpi, serial `emulator-5558`. The package loaded to 114 recipes. English `arrowroot starch` returned one `arrowroot`; `white rice` returned `white rice` and `white rice flour`; `cooked white rice` returned the white-rice identity with the `cooked white rice` form hint; and broad `beef` returned `beef`, `beef stock`, and `ground beef`.
- French `riz blanchi` returned one `riz blanchi`; accentless `boeuf` returned `bœuf`, `bouillon de bœuf`, and `bœuf haché`; accentless `boeuf hache` returned only `bœuf haché`. The accent-insensitive `fecule` prefix showed `arrow-root` among the French starch results. After discarding the unsaved draft, the French home showed `Toutes les recettes (114)`.
- Screenshots are in [`screenshots/`](screenshots/). SHA-256 values:

  | Screenshot | SHA-256 |
  |---|---|
  | `en-arrowroot-starch.png` | `b218f3815c7da2ad01f7056febf3ff55249f14998a233fc76fab5eedd0a7f4ed` |
  | `en-white-rice-overlap.png` | `e7226f960f3fe8486b0af6cc35ef17159449581e4e8d7e37c6313f1f4bd8e91d` |
  | `en-cooked-white-rice-form-hint.png` | `e0b2004e3301b504b5dc5534ec26e5513bdfea4fa660fd9b20006f06623b414f` |
  | `en-beef-boundary.png` | `4cab32a4f1d5737140e0c525032c569236fdf2b65cde29e58ca2d8a3f2e5562f` |
  | `fr-riz-blanchi.png` | `48cff97b6434a68029481ca54bd556538252ff9f249418fad7ebd99126633313` |
  | `fr-boeuf-boundary.png` | `3cde97e9b36c6e25a71a5d288d57336bd71063dac69902bbed18f6a51a2000b2` |
  | `fr-boeuf-hache.png` | `486198552fb3025ec1c1e98c28c2f9369d870719987f93e08532f56d1389a35d` |
  | `fr-fecule-prefix.png` | `c7cfba5378281f1568e29aa67930da91094f3a6627137d1b725945bbd0c265e1` |
  | `fr-home-114-recipes.png` | `b4a5b4343e13b7b3692fb9226b45840cf4d0d1c0856db81917b3a0d569830090` |

- The owner AVD base `userdata-qemu.img` SHA-256 was `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` both before and after QA. Only `emulator-5558` was shut down; the disposable clone was removed.

## Remaining scope

The broad WP02 B2/B3 checklist, WP03 Section F checklist, WP04 animal-food checklist, WP04 count/edible-portion/composition fixtures, and independent Québec terminology review remain open. This cohort records narrow source-backed progress without marking those categories complete.
