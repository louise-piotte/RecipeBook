# WP02/WP03/WP04 rye meal, dried orange zest, and salt pork — 2026-10-10

## Coordinator decisions

- Added `ingredient-ref-rye-meal` as `rye meal / gruau de seigle` in `FLOUR_AND_STARCH`. Its aliases are `coarse rye meal`, `pumpernickel meal`, `pumpernickel flour`, `semoule de seigle`, and `farine à pumpernickel`. General rye-flour grades and generic whole-rye-flour wording stay separate.
- Added `ingredient-ref-dried-orange-zest` as `dried orange zest / zeste d'orange déshydraté` in `SAUCE_AND_CONDIMENT`, with no aliases. Generic citrus zest, lemon zest, full orange peel, dried peel, and candied citrus remain separate.
- Rechecked the existing salt-pork candidate and kept it unresolved. `salt pork`, `petit salé`, `lard salé`, and `porc salé` are not active names or aliases. The sources do not settle one cut and cooked/brined state that can safely cover broad recipe usage.
- No recipe links, ingredient forms, measurements, density, unit mappings, conversions, yields, or substitutions changed.

The audit covered 677 active references, 34 forms, 84 legacy candidates, 114 manifest-listed recipes, and 1,123 ingredient rows. No recipe row requested these products. Exact owners and exclusions, source registers, and boundary notes are in the [rye-meal proposal](../../proposals/wp02-rye-meal-identity-boundary-20261010.md), [dried-orange-zest proposal](../../proposals/wp03-dried-orange-zest-identity-review-20261010.md), and [salt-pork follow-up](../../proposals/wp04-salt-pork-identity-followup-20261010.md).

## Evidence

- [TERMIUM Plus, rye meal](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE) describes coarse-ground whole rye, gives `gruau de seigle` and `semoule de seigle`, and lists `farine à pumpernickel` in context. [Ardent Mills](https://www.ardentmills.com/products/alternative-grains/additional-gluten-free-flours-grains-seeds/rye/) distinguishes rye meal/pumpernickel flour from other rye flours, chops, and flakes. [Montréal Kosher Bakery](https://www.montrealkosher.ca/products/bread-bagels/breads/pumpernickel-bread.html) lists rye meal separately in a Montréal pumpernickel-bread ingredient declaration. The OQLF [pumpernickel entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17020971/pumpernickel) names the bread, so standalone `pumpernickel` was not added as an ingredient alias.
- The [OQLF GDT entry for dried orange zest](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2299059/zeste-dorange-deshydrate) supplies both accepted names and distinguishes the colored aromatic zest from the whole peel. Its orange-specific entry does not define generic dried citrus peel or candied citrus.
- The [OQLF GDT salt-pork entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298616/petit-sale) maps `salt pork` to `petit salé` and `lard salé` in some contexts, while describing a commonly sold salted-and-cooked product. [CFIA meat-labelling guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products) mentions salt pork in narrow labelling exceptions without defining general composition or readiness. Québec listings from [Super C](https://www.superc.ca/allees/viandes-et-volailles/porc/bacon/lard-sale/p/206232) and [Les Viandes d'Autrefois](https://www.maturin.ca/index.php/produit/les-viandes-dautrefois/lard-sale-de-mangalitsa/15361/) show current salted-pork products but do not resolve the broad recipe meaning.

## Pixel 9a verification

Installed and checked on the `RecipeBook_Pixel_9a` AVD, serial `emulator-5556`, Android API 36. Picker results were checked in both English and French:

| App locale | Search | Observed result | Screenshot |
|---|---|---|---|
| French | `pumpernickel flour` | `gruau de seigle` | [PNG](screenshots/en-pumpernickel-flour-picker-fr.png) |
| English | `pumpernickel flour` | `rye meal` | [PNG](screenshots/en-pumpernickel-flour-picker-en.png) |
| French | `dried orange zest` | `zeste d'orange déshydraté` | [PNG](screenshots/en-dried-orange-zest-picker-fr.png) |
| English | `dried orange zest` | `dried orange zest` | [PNG](screenshots/en-dried-orange-zest-picker-en.png) |
| French | `zeste` | generic citrus zest, dried orange zest, and lemon zest appear separately | [PNG](screenshots/fr-zeste-picker.png) |
| English | `salt pork` | no result | [PNG](screenshots/en-salt-pork-unresolved-picker.png) |

The temporary draft was discarded. After instrumentation had removed the installed package, the pre-test database snapshot was restored and the app's insert-only seed refresh added the two accepted references. Read-only database checks confirmed 114 recipes, 1,123 ingredient rows, and 679 ingredient references. The French home screen returned to 114 recipes; English and French home screenshots are [here](screenshots/home-en-restored-114.png) and [here](screenshots/home-fr-restored-114.png). All eight PNG checksums pass in [SHA256SUMS.txt](screenshots/SHA256SUMS.txt).

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 679 generated references.
- `python3 -m unittest discover -s tools/seed_package -p 'test_*.py'` passed all 10 tests.
- `./gradlew :app:testDebugUnitTest --no-daemon` passed 320 tests with zero failures, errors, or skips.
- Connected Pixel 9a / Android 16 instrumentation completed 30 reported cases: 28 passed, 2 skipped, zero failures/errors.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5556 bash tools/deploy_to_pixel9a_emulator.sh` passed its test/build steps, installed the app, and launched it on the target AVD.
- The package, generated index, restored database, bilingual picker results, screenshot checksums, and final French home screen were checked. `git diff --check` passed.

## Package snapshot

| Data | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 679 | `6f3d19c7c222a875d0a22b932623a048143c180676ca6de99c91675c0458a6bd` |
| Ingredient forms | 34 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research ledger | 865 records / 1,558 source entries / 1,317 distinct source IDs | `c2a43e1612bec4e88de8e0f892aacd04de984b68165707469663e539080b9b35` |
| Legacy candidates | 84 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

The recipe corpus digest processes each manifest-relative recipe path, a NUL byte, exact recipe-file bytes, and another NUL byte in manifest order. General rye-flour grades, broader dried-citrus products, salt-pork product/state scope, and independent Québec terminology review remain open in the master plan.
