# WP02, WP03, and WP04 dairy, broth, sweetener, and leafy-green integration

**Integrated:** 2026-10-10  
**Status:** package, unit, instrumentation, and isolated Pixel 9a verification complete. Broader catalog coverage and independent Québec terminology review remain open.

## Integrated catalog decisions

- **Dairy powders:** added whole-milk-powder and skim-milk-powder forms under their matching milk references. Added buttermilk powder and whey powder as separate identity-only references. No density, reconstitution ratio, recipe link, or conversion was added. Malted-milk powder, milk solids, and other unresolved powder classes remain deferred.
- **Beef stock and broth:** kept `beef stock / fond de bœuf` separate from `beef broth / bouillon de bœuf`. Linked only the exact beef-broth rows in recipes 015, 034, and 078. Recipe 015 remains `1 can`; no package size was inferred.
- **Non-sucrose sweeteners:** added 13 identity-only references: dextrose, fructose, fructose syrup, fondant sugar, isomalt, invert sugar, liquid invert sugar, glucose solids, erythritol, xylitol, stevia leaves, purified steviol glycosides, and monk-fruit extract. Added separate anhydrous and monohydrate dextrose forms. Allulose, crude stevia extract, monk-fruit juice concentrate, and commercial blends remain deferred. No recipe links, density, unit mappings, conversions, yields, or substitutions were added.
- **Residual leafy greens:** added amaranth greens, sweet-potato leaves, taro leaves, fenugreek leaves, and moringa leaves as part-qualified identities. No recipe line, form, density, or unit mapping was added. The two Hawaiʻi taro-leaf portions remain source-specific ledger observations. Law-uy alternatives remain dish-specific proposal evidence, with no runtime substitution.

The package now contains **821 references and 40 forms**. The research ledger contains **1,054 records, 2,294 source entries, and 1,844 distinct source IDs**. The bundle still contains 114 recipes and 1,123 ingredient rows.

## Evidence and open wording decisions

The source registers and recipe-demand audits are in the [WP02 sweetener review](../../proposals/wp02-non-sucrose-sweetener-gap-review-20261010.md), [WP03 leafy-green review](../../proposals/wp03-residual-leafy-greens-boundary-review-20261010.md), [WP04 dairy-powder review](../../proposals/wp04-dairy-powders-concentrates-gap-review-20261010.md), and [WP04 beef stock/broth review](../../proposals/wp04-beef-stock-broth-identity-review-20261010.md). Their evidence records are in the [research ledger](../../research-ledger.v1.json).

The leafy displays are plant-part-qualified. `Feuilles d'amarante` and `feuilles de taro` remain provisional pending independent Québec retail terminology review. Taro cup and leaf-count observations retain their source preparation and sample conditions in the ledger; neither is an active conversion. `WP03-S14` is a reused OQLF source with the same title and URL, not a source-ID conflict.

## Verification

- Bundled seed normalizer and validation, ingredient-reference normalization check, generated catalog freshness check, ledger schema validation, UTF-8/no-BOM checks, and `git diff --check` passed.
- Python seed-package suite: **28 passed**.
- Android debug unit suite: **347 passed**.
- Android connected instrumentation on the disposable Pixel 9a/API 36 clone, serial `emulator-5558`: **30 tests, 0 failures, 2 skipped**.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test and debug-assembly steps, installed the latest build, and launched the app on `emulator-5558`.
- English picker checks showed broad `amaranth` results for amaranth, amaranth flour, and amaranth greens; `taro leaves` returned only taro leaves; erythritol and invert sugar resolved to their intended entries, with invert sugar also showing the distinct liquid form; beef broth and beef stock resolved separately; and whole/skim milk-powder queries showed their scoped form hints.
- In French UI, `amarante` showed amarante, farine d'amarante, and feuilles d'amarante. `feuilles de taro` returned only feuilles de taro. English aliases for sweet-potato, fenugreek, and moringa leaves displayed the corresponding French names. The unaccented `erythritol` query displayed `érythritol`; unaccented `bouillon de boeuf` and `fond de boeuf` queries displayed `bouillon de bœuf` and `fond de bœuf` separately. The English whole-milk-powder query displayed `lait` with the French `lait entier en poudre` form hint.
- The clone returned to `Toutes les recettes (114)`. The owner Pixel 9a data-image SHA-256 values matched their pre-QA values: `userdata-qemu.img` `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` and `sdcard.img` `5f2d56e8dcd5f647175ea2ff9818471a0757f0bb28ec3959e658b99716abcd1a`. The disposable emulator was stopped and its AVD image/config files were removed after capture.

| Artifact | SHA-256 |
| --- | --- |
| `ingredient-references.v1.json` | `d293ce1506a683d8ee119fd0afaecace2729a2be2ab16a40bc1784652f9249b1` |
| `ingredient-forms.v1.json` | `50350ac4c7f498d7db2589ae58a2bf71971426bb634c56d616517a8c31d39787` |
| `research-ledger.v1.json` | `a69c045241e2a81263204ec75cba88777ce5520be0b36ad7de35420f3ead98d8` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | `39d9ad020cbbb08cbee5528dffb13e138af4ce2981fe4702a0fbc084ad3628b6` |
| Debug APK | `8e51990db627db1817a7ce48bb84f714dbc1b8e690a3b0e034f6c3b17c97ac50` |

## Pixel 9a screenshots

All screenshots are from the disposable Pixel 9a/API 36 clone. Their SHA-256 checksums are in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).

| Picker check | Screenshot |
| --- | --- |
| English broad amaranth results | [amaranth, flour, and greens](screenshots/en-amaranth-broad.png) |
| English plant-part search | [taro leaves](screenshots/en-taro-leaves.png) |
| English sweetener identities | [erythritol](screenshots/en-erythritol.png), [invert sugar and liquid invert sugar](screenshots/en-invert-sugar.png) |
| English beef boundary | [beef broth](screenshots/en-beef-broth.png), [beef stock](screenshots/en-beef-stock.png) |
| English milk-powder forms | [whole milk powder](screenshots/en-whole-milk-powder.png), [skim milk powder](screenshots/en-skim-milk-powder.png) |
| French broad amaranth results | [amarante, farine d'amarante, and feuilles d'amarante](screenshots/fr-amarante-broad.png) |
| French leafy identities | [taro](screenshots/fr-taro-leaves.png), [sweet potato](screenshots/fr-sweet-potato-leaves.png), [fenugreek](screenshots/fr-fenugreek-leaves.png), [moringa](screenshots/fr-moringa-leaves.png) |
| French accent and beef terminology | [érythritol](screenshots/fr-erythritol.png), [bouillon de bœuf](screenshots/fr-beef-broth.png), [fond de bœuf](screenshots/fr-beef-stock.png) |
| French milk-powder display | [lait entier en poudre](screenshots/fr-whole-milk-powder.png) |
| Restored French library | [114-recipe home](screenshots/fr-library-home-114.png) |

Broader WP02 sweetener coverage, WP03 Section K identities, WP04 animal-food coverage, and independent Québec terminology review remain open in the global ingredient-catalog plan.
