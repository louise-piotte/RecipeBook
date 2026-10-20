# WP02/WP03/WP04 Roasted-Terminology and Sea-Urchin Review Integration

- **Date:** 2026-10-11
- **Scope:** independent Québec French display review for active roasted-flour references; roasted buckwheat groats display; held sea-urchin gonad/uni product boundary.
- **Global plan status:** open.

## Integrated decisions

- **WP02 roasted flours:** retained the six active English product identities and their current aliases. The review documented that the French displays for roasted quinoa and roasted red-rice flour remain provisional until their manufacturers clarify whether the grain or flour is heated. It also retained source limits for barley and roasted wheat malt flour; the reviewed pages do not establish a common process across manufacturers. Wheat, corn, and urid wording is supported when read as flour-level roasting. No alias, form, numeric behavior, substitution, recipe link, or product equivalence changed. See [the Québec French review](../../proposals/wp02-roasted-flour-quebec-french-display-review-20261011.md).
- **WP03 roasted buckwheat groats:** changed only `nameFr` for `ingredient-ref-roasted-buckwheat-groats-dry` to `grains de sarrasin rôtis et secs`. Retained the English name, category, and separation from buckwheat flour and prepared *kacha/kasha*. Aliases, forms, measurements, conversions, yields, recipe links, and substitutions remain empty. See [the Québec display review](../../proposals/wp03-roasted-buckwheat-groats-quebec-display-review-20261011.md).
- **WP04 sea-urchin gonads/uni:** added `candidate-sea-urchin-gonads-uni` to the research ledger as unresolved and held. No active reference or recipe link was added. The record keeps extracted gonads distinct from whole/live urchins, species-specific `oursin vert`, fish roe, and other roe products; it adds no measurements, forms, conversions, yields, or substitutions. Its seven source entries support a future review only if recipe demand appears. See [the product-boundary review](../../proposals/wp04-sea-urchin-uni-quebec-product-boundary-review-20261011.md).

## Package and ledger checkpoint

- Bundled package: **927 ingredient references / 51 forms / 114 recipes / 1,123 ingredient rows**.
- Research ledger: **1,189 records / 3,308 source entries / 2,659 distinct source IDs / 0 validation errors**.
- Active package change: one French display string for roasted buckwheat groats. The sea-urchin item remains a held ledger candidate.

## Validation and device QA

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package` — **87 passed**.
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check` — package already normalized; validation passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated index is current; **927 references**.
- `GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew :app:testDebugUnitTest --no-daemon --console=plain` — **396 passed**.
- `ADB_SERVER_SOCKET=tcp:127.0.0.1:5037 GRADLE_USER_HOME=/tmp/recipebook-gradle-home ./gradlew :app:connectedDebugAndroidTest --no-daemon --console=plain` — **35 reported / 33 passed / 2 skipped / 0 failed**.
- Deployed with `tools/deploy_to_pixel9a_emulator.sh` and checked on disposable `RecipeBook_Pixel_9a_QA` (Android 16 / API 36, 1080 × 2424). The English search `buckwheat` showed distinct flour, roasted-groat, and flake entries. The French search `sarrasin` showed the updated roasted-groat display. Both blank drafts were discarded; the final French home screen still shows **Toutes les recettes (114)**.

## Screenshots and SHA-256

| Screenshot | What it shows | SHA-256 |
| --- | --- | --- |
| [English buckwheat picker](screenshots/picker-en-buckwheat.png) | Separate buckwheat flour, roasted groats, and flakes | `8b5b072e5d4f7a864c47b18afc39d8e4050f402596d6449a6b14f5199c4e26c7` |
| [French sarrasin picker](screenshots/picker-fr-sarrasin.png) | Updated `grains de sarrasin rôtis et secs` result | `a1d8569a3d527283983cc39190968351fd1cf09f591dd212b0cb83d45fb41ba6` |
| [French home](screenshots/home-fr.png) | `Toutes les recettes (114)` after discarding the draft | `fcd895a10a8710f07e279b4e2623191c6f0d6849ed6e816c48652a888ee8f1ff` |

Changed-data fingerprints at this checkpoint:

- `ingredient-references.v1.json`: `b8c46eff787ec2573607902ec026d4489751ee10bdeba2f01e7dab6bf4276c32`
- `research-ledger.v1.json`: `934035ed90c843e36823e2cb7faba3c149e24103c9114d3c2463da71db64c276`

## Follow-up

The flour process questions remain bounded to the named manufacturers. Keep the sea-urchin candidate held until actual recipe or import demand exists. Continue the broader WP02/WP03/WP04 work and the global catalog plan.
