# WP02 residual flour and starch integration — 2026-10-11

## Integrated identities

Added five identity-only references: green lentil flour, yellow pea flour, partially defatted peanut flour, sweet white lupin flour, and sweet blue lupin flour. Each uses `FLOUR_AND_STARCH`, has no aliases, forms, density, unit mappings, recipe links, conversion, yield, or substitution. The current 114-recipe package has no matching ingredient lines. The French lupin displays remain subject to independent Québec terminology review.

Source analysis and the candidate boundaries are documented in [the WP02 proposal](../../proposals/wp02-b2-b3-flour-starch-residual-review-20261010.md).

## Verification

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: 59 passed.
- `:app:testDebugUnitTest --no-daemon`: 377 passed.
- `:app:connectedDebugAndroidTest --no-daemon` on the Android 16 Pixel 9a-profile clone: 34 cases completed, 2 QA-gated skips, 0 failures.
- `tools/deploy_to_pixel9a_emulator.sh` installed and launched the build on the disposable clone.
- Package normalization, reference normalization, and generated-catalog checks passed; the generated catalog contains 895 references.
- Live picker checks in French returned `farine de lentilles vertes` for both `green lentil flour` and `farine de lentilles vertes`; selecting it displayed the French identity. The temporary unsaved recipe was discarded, and the French home returned to 114 recipes.
- Scoped `git diff --check` passed for the changed catalog, ledger, tests, plan, and roadmap. A whole-worktree `git diff --check` still reports CRLF trailing-whitespace findings in pre-existing files under `docs/exported-recipe-lists/`; those imported files were not edited for this batch.

Screenshots:

- [English query, French result](screenshots/en-query-fr-result.png)
- [French query](screenshots/fr-query.png)
- [Selected French ingredient in the editor](screenshots/selected-fr-ingredient.png)
- [Restored French home with 114 recipes](screenshots/restored-fr-home-114.png)

The owner AVD was left running and its `userdata-qemu.img` SHA-256 matched the pre-QA value `48D6753085207CBBDF6B1C2BC9416AF3FE92AD42F6000ED5CFA49103ED0F9997`. The temporary QA AVD was shut down and its dedicated Temp directory removed.

## Package snapshot

Counts at integration: 895 references, 48 forms, 114 recipes, 1,123 ingredient lines, 1,145 research-ledger records, 2,895 source entries, and 2,300 distinct source IDs.

| File | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `bdbc64b60d828ee44fd3515ca4c37929e58c44fef4e0e8afd2231d17233be608` |
| `ingredient-forms.v1.json` | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `research-ledger.v1.json` | `1add103daec0a0467dd4c5dcd74cd190a7d473c7289018af5b7c637c1c0293b4` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `BundledIngredientCatalog.kt` | `dc6793638e01b6db7d9fc89aaea732aeb323c18ce9ea809e7a5a543813aeb5dc` |

| Screenshot | SHA-256 |
|---|---|
| `en-query-fr-result.png` | `fa3c5729cb93150306bf51d3b5929bcd9a0e1108d820f78bf1a98b4bbfbe5995` |
| `fr-query.png` | `24daad61e765868b6e528f99ebdc3d54830bdf8c827998ce0ce9a3f53ac3528c` |
| `restored-fr-home-114.png` | `74c882c3cd3a16b9b1890948a242bea26860a66b17d5464108cdf657ecd0aaca` |
| `selected-fr-ingredient.png` | `2b026d6b060400bd69d633a3a4d302f5e75ee0f187cd07cc3947b58c9383c73f` |
