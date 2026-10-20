# WP06 jackfruit identity and maturity boundary — 2026-10-09

## Catalog decision

Added one `FRUIT` identity: `ingredient-ref-jackfruit`, displayed as `jackfruit` / OQLF-supported fr-CA `jaque`, with the spelling aliases `jakfruit` and `jacque`. The short English translation `jack` is excluded after a collision check with inactive legacy `Monterey Jack`; tree names `jaquier` and `jacquier` are not fruit aliases.

No forms, numeric data, conversions, substitutions, package yields, or recipe links were added. `green`, `young`, `tender`, `unripe`, and `raw` source labels remain distinct/unresolved because the consulted sources do not provide one shared maturity-stage definition. Seeds and processed products are also outside this fruit-flesh identity.

## Evidence and audit

Kew accepts *Artocarpus heterophyllus* and records food use. The OQLF GDT identifies the edible fruit as `jaque` / `jacque` and lists `jackfruit` / `jakfruit`; its separate `jaquier` record identifies the tree. See the [full jackfruit ripeness-boundary review](../../proposals/wp06-jackfruit-ripeness-boundary-20261009.md) for the maturity and product-source analysis.

After the tropical-greens integration and before this identity was added, a coordinator recheck covered 21 display and maturity comparison phrases against 493 references, 22 forms, and 99 legacy candidates. There was no exact or phrase owner in active references or forms. The only legacy phrase owner was `jack` on the inactive `ingredient-ref-monterey-jack` record; it is not an alias. The 114-recipe / 1,123-row scan found no jackfruit phrase hit. No recipe text or link changed.

## Validation

- Current package after the rocoto and jackfruit decisions: 495 references, SHA-256 `da7b807bdca06eb986c474ffc3357a4645b6cb7d3ef47ca1eb3e4d3cdd48a8a8`.
- Ingredient forms: 27, SHA-256 `77714ce34b71f84fc0fc5fe6027d4b54fa7ca58a6816f9028b9a97f5f6cbb053`.
- Manifest: 114 recipe paths, SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Legacy candidates: 99, SHA-256 `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b`.
- Research ledger: 671 records / 1,030 source entries / 881 distinct source IDs, SHA-256 `8218d17bd33ef9ecf66ae7b2ce6683c3f0a55a9cfa1a88f2d6fbe4f9fef7a83e`.
- Package normalization, reference normalization, generated-index freshness, ledger schema validation, all 9 Python package tests, and all 311 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures or errors. The deploy script installed and launched the app.
- English `jackfruit` and French `jaque` each returned the intended identity. English `green jackfruit` and French `jaque vert` returned no ingredient result. The temporary drafts were discarded and French home returned to 114 recipes.

## Pixel 9a screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: jackfruit](en-jackfruit-picker.png) | `98c6f95ef6ba0828614ad9d47440697660996338a806b321cf07d216ee0fbba1` |
| [English picker: unresolved green jackfruit](en-green-jackfruit-unresolved-picker.png) | `c34d394691ec4caac96831b6a20ca11db22eca9e63c70acb33980dadb4840ce4` |
| [French picker: jaque](fr-jackfruit-picker.png) | `d8bb333f110e12a42398f644dbc839c43d7a4b218f5c84af9b38b3dc1e6878d3` |
| [French picker: unresolved jaque vert](fr-green-jackfruit-unresolved-picker.png) | `ca562217c8afc7214bc37c45aeb110e61830d485605b77135fc8081c3a7eaf20` |
| [French library home, 114 recipes](fr-library-home.png) | `c7c0d517d08ff8c5b650ca180ea0772ee31f607c559d992561152d7d94a1a479` |

## Open work

Maturity-specific forms and translations, green/unripe product scope, seeds, and processed jackfruit products remain unreviewed for integration until their identities or stages can be represented without collapsing distinct source descriptions.
