# WP06 rocoto identity and forms — 2026-10-09

## Catalog decision

Added `ingredient-ref-rocoto-pepper` in `VEGETABLE_AND_AROMATIC`, displayed as `rocoto pepper` / provisional fr-CA `piment rocoto`. The internal evidence associates documented Peruvian rocoto with *Capsicum pubescens*; the UI name remains culinary. Accepted complete source-named aliases are `locoto`, `rokoto`, `ro’qote`, `chile manzano`, `chile de cera`, and `chile perón`. Generic `uchu`, `ají`, `chile`, `pepper`, color terms, and broad regional synonym lists remain out of the active aliases.

Added five distinct forms, all without density values:

- `ingredient-form-rocoto-pepper-fresh`: `fresh rocoto pepper` / `piment rocoto frais`.
- `ingredient-form-rocoto-pepper-whole-dehydrated`: `whole dried rocoto pepper` / `piment rocoto entier séché`.
- `ingredient-form-rocoto-pepper-powdered`: `rocoto powder` / `poudre de rocoto`.
- `ingredient-form-rocoto-pepper-qacha`: `qacha (split, deseeded, sun-dried rocoto)` / `qacha (rocoto fendu, épépiné et séché au soleil)`.
- `ingredient-form-rocoto-pepper-fresh-ground-with-skin-unsalted-water`: `fresh ground rocoto with skin, in unsalted water` / `piment rocoto frais, moulu avec la pelure, dans l’eau sans sel`.

The whole dehydrated fruit, powder, qacha, and narrowly specified fresh-ground item stay separate. Generic `rocoto molido`, paste, sauces, and canned/preserved items remain unresolved. No density, unit mapping, measurement conversion, yield, substitution, or recipe link was added.

## Evidence and audit

Kew, Peru's INIA, and PROMPERÚ support the distinct Peruvian rocoto identity and the documented *C. pubescens* association. PROMPERÚ distinguishes fresh, whole dehydrated, powder, preserved, and paste presentations; INS separately names fresh rocoto and one specific fresh-ground item. The PROMPERÚ cultural guide defines qacha with split, deseeded, sun-dried qualifiers. The French label is attested by the Muséum national d’Histoire naturelle, but is not an OQLF or TERMIUM ruling. See the complete [rocoto boundary review](../../proposals/wp06-rocoto-identity-boundary-review-20261009.md) for source locators and limits.

The pre-integration live audit used 493 references, 22 forms, 99 legacy candidates, 114 recipes, and 1,123 ingredient rows. The proposal's 110 raw phrases / 101 normalized keys found no rocoto-family exact owner or recipe-row hit. Broad pepper and chili comparators resolve to other ingredients and were not used as aliases. No recipe text or link changed.

## Validation

- Current package after the rocoto and jackfruit decisions: 495 references, SHA-256 `da7b807bdca06eb986c474ffc3357a4645b6cb7d3ef47ca1eb3e4d3cdd48a8a8`.
- Ingredient forms: 27, SHA-256 `77714ce34b71f84fc0fc5fe6027d4b54fa7ca58a6816f9028b9a97f5f6cbb053`.
- Manifest: 114 recipe paths, SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Legacy candidates: 99, SHA-256 `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b`.
- Research ledger: 671 records / 1,030 source entries / 881 distinct source IDs, SHA-256 `8218d17bd33ef9ecf66ae7b2ce6683c3f0a55a9cfa1a88f2d6fbe4f9fef7a83e`.
- Package normalization, reference normalization, generated-index freshness, ledger schema validation, all 9 Python package tests, and all 311 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures or errors. The deploy script installed and launched the updated app.
- English searches confirmed the base identity and fresh / qacha hints. `rocoto molido` showed no result. In French, the picker showed `piment rocoto` plus localized fresh, qacha, powder, and fully qualified fresh-ground labels. The temporary draft was discarded and French home returned to 114 recipes.

## Pixel 9a screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: rocoto identity](en-rocoto-picker.png) | `8885b7661cf576be10111629677435d2a9f129716182f7f959aff95051e8688b` |
| [English picker: fresh rocoto form](en-rocoto-fresh-picker.png) | `da158815e46566ed498ccbda18df309f072f9480f75718b4d61cf4bf438966b3` |
| [English picker: ambiguous rocoto molido stays unmatched](en-rocoto-ambiguous-ground-picker.png) | `8fed9bb9f912326d616f108a7bfea13a79a7dcc74df947838f1bf30c9289068f` |
| [English picker: qacha form](en-rocoto-qacha-picker.png) | `913e8b538519482602a7d9b7fd50a605e9e08131f3550b57c11b0fa745efddcb` |
| [French picker: rocoto identity](fr-rocoto-picker.png) | `19f4c5bdbc8eb3650fc9e1b3d6def3beeb2e037a62676a96aee4fd06b7d76660` |
| [French picker: fresh rocoto form](fr-rocoto-fresh-picker.png) | `1d0d225c4803da86ae2a010c6ae938da485eac9b6ca834696f8f5022ae7920b8` |
| [French picker: qacha form](fr-rocoto-qacha-picker.png) | `e87a2c358ee29dd5d0d96be14ae3a18b6089ccbbfe130dbbfaea899d34ae3a67` |
| [French picker: powder form](fr-rocoto-powder-picker.png) | `b26527c67b5961fa53375d879c085b60f9c52eca57a635d18c4a8194168993a8` |
| [French picker: fully qualified fresh-ground form](fr-rocoto-ground-picker.png) | `8a1aa4c1ee99993a4bac374331ea771723de581fc5ee22f18c8e217f1ab30c93` |
| [French library home, 114 recipes](fr-library-home.png) | `c7c0d517d08ff8c5b650ca180ea0772ee31f607c559d992561152d7d94a1a479` |

## Open work

The borrowed French display `piment rocoto` remains provisional pending independent Québec terminology review. Broader Capsicum identity and product boundaries remain open; the deferred ground, paste, sauce, and preserved products require specific product definitions.
