# WP02 brown and pearl sugar integration — 2026-10-11

## Decisions

- Added light and dark brown-sugar forms under the existing cassonade / brown-sugar identity. The form terms identify a shade and relative molasses grade; they do not define a universal formulation, measurement, conversion, or substitution.
- Moved light/dark shade aliases off the base brown-sugar identity. Generic packed-brown-sugar wording stays on the base identity. The OQLF distinction for `sucre roux` remains respected because its larger crystals do not describe the same product.
- Linked only seven recipe rows whose source text explicitly says `light brown sugar`. Recipe 114's `light or dark brown sugar` row remains on the base identity without a form.
- Added `pearl sugar / sucre perlé` as a baking-sugar identity, with narrowly supported `sanding sugar`, `decorating sugar`, and `sucre décoratif` search terms. It remains separate from `sugar pearls / perles de sucre` and generic sprinkles. The potentially overlapping `sucre cristallisé` term is excluded.
- No quantities, authored recipe text, densities, unit mappings, conversions, yields, or substitutions changed. Pearl sugar has no recipe links.

## Evidence

- OQLF, [cassonade (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26507299/cassonade): supports the Québec base identity and distinguishes `sucre roux` by crystal size.
- Canadian Sugar Institute, [Types of Sugar](https://www.sugar.ca/sugar-basics/types-of-sugar): supports brown sugar's light-to-dark grade continuum and the relationship to molasses; also describes pearl sugar and decorative/sanding sugar.
- Metro, [Cassonade claire](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/sucres-et-edulcorants/cassonade-claire/p/055144685828): supports current Québec retail wording for light brown sugar.
- Lantic, [Cassonade foncée](https://lanticrogers.com/fr/products/cassonade-foncee/): supports current Québec retail/manufacturer wording for dark brown sugar.
- Translation Bureau, [TERMIUM Plus, sucre perlé](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frt&lang=eng&srchtxt=SUCRE+PERLE): supports `pearl sugar`, `sanding sugar`, `decorating sugar`, and `sucre décoratif` terminology.
- OQLF, [bonbons décoratifs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532746/bonbons-decoratifs): keeps `perles de sucre` in the separate confectionery-decoration class.

Detailed source locators and dispositions are in `docs/catalog/research-ledger.v1.json` for the brown-sugar identity and forms, and `ingredient-ref-pearl-sugar`.

## Verification

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py` completed with 0 package parts changed; `--check` passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py` regenerated the import audit index at 913 references; `--check` passed.
- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: 79 tests passed.
- `./gradlew :app:testDebugUnitTest --no-daemon`: 394 tests passed, 0 failed.
- `./gradlew :app:connectedDebugAndroidTest --no-daemon --console=plain`: 37 cases on the disposable Pixel 9a / Android 16 (API 36) emulator, 2 skipped, 0 failed.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5560 ./tools/deploy_to_pixel9a_emulator.sh`: test and assemble steps passed; APK installed and MainActivity launched.
- Pixel picker QA confirmed English `light brown sugar` and `dark brown sugar` form hints under brown sugar, with separate `pearl sugar` and `sugar pearls` results. French searches returned cassonade with the `cassonade claire` hint and the separate `sucre perlé` identity. The temporary draft was discarded and the French home returned to 114 recipes.
- The original owner AVD `userdata-qemu.img` checksum remained `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997`; app QA used the disposable `RecipeBook_Pixel_9a_QA` clone.
- UTF-8/no-BOM and ledger validation passed. The package checkpoint is 913 references, 51 forms, 114 recipes / 1,123 ingredient rows, and 1,172 ledger records / 3,108 source entries / 2,511 distinct source IDs.

Screenshots:

- [English light brown sugar](screenshots/picker-en-light-brown-sugar.png)
- [English dark brown sugar](screenshots/picker-en-dark-brown-sugar.png)
- [English pearl sugar](screenshots/picker-en-pearl-sugar.png)
- [English sugar pearls](screenshots/picker-en-sugar-pearls.png)
- [French cassonade claire](screenshots/picker-fr-cassonade-claire.png)
- [French sucre perlé](screenshots/picker-fr-sucre-perle.png)
- [French home with 114 recipes](screenshots/picker-fr-home.png)
