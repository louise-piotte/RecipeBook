# WP02 / WP03 / WP04 Mochiko, pot barley, and onion portion integration

- **Date:** 2026-10-11
- **Status:** Catalog, ledger, regression coverage, checklist, roadmap, and Pixel 9a verification are integrated. Independent source-based reviews recommend the Mochiko display and provisionally support Shiratamako; the pot-barley display remains provisional. Québec bilingual reviewer approval remains open, as does broader catalog work.
- **Review packets:** [Mochiko and Shiratamako product boundary](../../proposals/wp02-mochiko-shiratamako-canadian-product-boundary-review-20261011.md), [pot-barley French name resolution](../../proposals/wp03-pot-barley-quebec-french-name-resolution-20261011.md), and [recipe 105#3 onion portion review](../../proposals/wp04-next-count-edible-portion-review-20261011.md).

## Integrated decisions

- Added identity-only `Mochiko glutinous rice flour / farine de riz gluant Mochiko` and `Shiratamako glutinous rice flour / farine de riz gluant Shiratamako`. The existing generic glutinous-rice-flour identity and aliases remain intact. Neither product has aliases, forms, density, conversions, or recipe links. Télé-Québec's Mochiko replacement for Shiratamako is recorded only as a recipe-specific substitution finding with a texture caveat; no universal equivalence or runtime rule was added.
- Promoted the existing pot-barley candidate as identity-only `pot barley / orge en pot`, separate from hulled and pearl barley. Retained only the narrowly source-paired English alias `Scotch barley`. `orge mondé(e)` and `orge entière` remain outside its aliases because French sources use them inconsistently. No recipes, forms, measurements, conversions, yields, or substitutions were added.
- Matched recipe 105#3's exact publisher wording, `1 large onion, chopped`, to CNF 2026's source-specific `1 large = 150 g` measure. The existing observation remains scoped to its source; the separate 10% refuse qualifier is preserved. Recipe text and count-only behavior remain unchanged, and no active conversion was added.

The package contains **954 references / 53 forms / 114 recipes / 1,123 ingredient rows**. The ledger contains **1,223 records / 3,679 source entries / 2,993 distinct source IDs / 8 unit conversions / 0 validation errors**.

## Verification

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package` passed **108 tests**.
- Bundled-package normalization, ingredient-reference normalization, and generated Kotlin freshness checks passed; the generated index contains **954 references**.
- The evidence ledger validated with zero errors. Android unit tests passed: **410 tests, 0 failures**.
- `:app:connectedDebugAndroidTest` passed on Android 16 / API 36 Pixel 9a QA clone `RecipeBook_Pixel_9a_QA`, at 1080 × 2424 and 420 dpi: **36 tests, 34 passed, 2 skipped, 0 failed**.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test and assemble stages, installed the debug APK to disposable serial `emulator-5556`, and launched the app.
- Live English picker searches returned one result each for `Mochiko`, `Shiratamako`, and `pot barley`. French searches returned `farine de riz gluant Mochiko`, `farine de riz gluant Shiratamako`, and `orge en pot`. A broad French `farine de riz gluant` search returned the generic flour plus both named products. `orge monde` returned the distinct `orge mondé` hulled-barley row. The blank draft was discarded; the French library returned to `Toutes les recettes (114)`.
- The original owner AVD image hashes matched their pre-QA values: `userdata-qemu.img` `48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` and `sdcard.img` `5f2d56e8dcd5f647175ea2ff9818471a0757f0bb28ec3959e658b99716abcd1a`. Only the disposable QA emulator was used for installation and picker interactions.
- Seed JSON retains escaped French Unicode. Changed maintained text files are UTF-8 without BOM; targeted whitespace and encoding checks passed.

Screenshots and SHA-256 fingerprints:

| Screenshot | SHA-256 |
|---|---|
| [English launch home](screenshots/00-launch.png) | `8b930ced85acc81687239ebfa96a2a2dd0aac7b04563ca001d163a5a4a5c025a` |
| [English Mochiko search](screenshots/picker-en-mochiko.png) | `3f314dbc6cf089415c430b845c3da8929455796373d666550dcaf67c36f1edee` |
| [English Shiratamako search](screenshots/picker-en-shiratamako.png) | `79068be5cc3660db14366fb8cc3068d69f9e19f3968b67ec907275e8197fb40d` |
| [English pot barley search](screenshots/picker-en-pot-barley.png) | `3a1bcc561f4088e41e288229a1a91c8c380759c8520f80b76a1b8d6e522b0841` |
| [French Mochiko search](screenshots/picker-fr-mochiko.png) | `ed74661c6479e7f7b9028280ead956fefc828d62a8c7e4579b59ad9b75f9abd1` |
| [French Shiratamako search](screenshots/picker-fr-shiratamako.png) | `de9857fcd442dd6beb27d5918407ef0b3087cb4acd3736659364714ff18363ab` |
| [French pot barley search](screenshots/picker-fr-orge-en-pot.png) | `7fb79a5fdaf2dc3fefc71a66f6edac9ffd0c64087bdb6e89bccbe3a94fb37316` |
| [French hulled barley search](screenshots/picker-fr-orge-monde.png) | `622d5848f32ac5531592fdd67b82cc5acb653fdfc92f49d2010d118dd23d589d` |
| [Broad French glutinous-rice-flour search](screenshots/picker-fr-glutinous-rice-flour.png) | `d104418929290716318edafa944b144fc7cc364d34dded3974b1f8b6317fe80d` |
| [Restored French home](screenshots/home-fr-restored.png) | `ce848d160c1a7b4bc11e13a21abade6d9afc98bfb723e0ff07fd664f2da80d49` |

## Remaining review

Independent source-based reviews now recommend `farine de riz gluant Mochiko` for internal fr-CA display and provisionally accept `farine de riz gluant Shiratamako`; see [Mochiko review](../../proposals/wp02-mochiko-quebec-display-independent-review-20261011.md) and [Shiratamako review](../../proposals/wp02-shiratamako-quebec-display-independent-review-20261011.md). Both preserve the Japanese product name and distinguish component-term support from an official ruling or manufacturer French package.

The [pot-barley review](../../proposals/wp03-pot-barley-display-independent-quebec-review-20261011.md) keeps `orge en pot` provisional: product titles attest the phrase, while Québec retail use of `orge mondé` conflicts with OQLF's hulled-barley definition. These source reviews document recommendations, not external OQLF or bilingual-reviewer endorsement. Keep the plan's Québec bilingual approval checkpoint open. The global WP02/WP03/WP04 and ingredient-catalog plan remain active.
