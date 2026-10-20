# WP02/WP03/WP04/WP05 follow-up integration — 2026-10-11

## Result

Added eleven identity-only ingredient references and recorded four WP04 count reviews. Four grain or rice-cake candidates remain held pending a Québec French product name. No recipe rows, forms, active measurements, conversions, yields, or substitutions were added in this batch. The `sambal ulek` alias for sambal oelek and the exact source-backed Lizano/chimichurri aliases are the only search aliases added.

### Integrated identities

- **WP02:** `whole barley flour / farine d'orge entière`, `fava bean flour / farine de gourgane`, and `rice starch / amidon de riz`. Fava flour is separate from whole gourganes and féverole flour; rice starch is separate from rice flour. The Cuisine Soleil label's 30 g per 1/4 cup remains product-specific and is not a generic measure.
- **WP03:** `rye flakes / flocons de seigle`, `spelt flakes / flocons d’épeautre`, and `wild rice blend / mélange de riz sauvage`. The blend remains distinct from pure wild rice.
- **WP05:** `sambal oelek`, `sambal matah`, `chunjang`, `Lizano sauce / sauce Lizano`, and `chimichurri sauce / sauce chimichurri`. Sambal oelek has the scoped `sambal ulek` alias in both locales; the broad alias `sambal` was not added. The other aliases are limited to the exact variants recorded in the seed rows.

All eleven rows have no new forms, densities, unit mappings, recipe links, or substitution rules. The active seed category and localized fields are in `ingredient-references.v1.json`.

### Held naming candidates

- **Puffed teff** and **puffed rye:** no Québec French product label supports a canonical picker name yet.
- **Korean tteokbokki sticks:** keep the local product title as source wording; the available Québec French wording does not settle a canonical ingredient label.
- **Shanghai-style rice-cake slices:** local *galettes de riz* wording describes prepared dishes, while plain *gâteau de riz* collides with rice pudding. Keep the candidate unallocated until direct Québec product naming is found.

No aliases, forms, measurements, recipe links, conversions, yields, or substitutions were added for these held candidates.

### WP04 count review

- `052#1`: preserve the three-mango reader-reported alternative count; no fruit mass or three-fruit total is supported by the current publisher recipe.
- `045#6`: preserve one vanilla pod with quantity 1 and no unit; no whole-pod mass or basis was found.
- `104#1`: preserve one trimmed asparagus bunch; source-specific spear portions and the ERS 36-spears-per-bunch modeling assumption do not establish this recipe's bunch mass.
- `066#13`: preserve `1/2 lemon, thinly sliced` as 0.5 item. The current publisher card adds “medium,” but neither peel status nor whether the slices are eaten is established, so no mass is assigned.

The next-count sweep found no uncovered, open, non-egg count line eligible for another portion decision. Egg-count work remains outside that sweep. Recipe text and structured quantities remain unchanged.

## Package and verification

The bundled package has **912 ingredient references, 48 forms, 114 recipes, and 1,123 ingredient rows**. The research ledger has **1,168 records, 3,096 source entries, and 2,501 distinct source IDs**. The generated Kotlin catalog is current at 912 references.

Checks passed:

- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package` — 77 tests passed.
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid.
- `python3 -B tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — normalized.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — current.
- `:app:testDebugUnitTest` — 392 tests passed, 0 skipped, 0 failed, 0 errors.
- `:app:connectedDebugAndroidTest` — 37 cases reported: 35 passed, 2 skipped, 0 failed.
- `tools/deploy_to_pixel9a_emulator.sh` installed and launched the debug app on the disposable Android 16 Pixel 9a clone.

Manual picker searches found `fava bean flour`, `rice starch`, `farine de gourgane`, and `amidon de riz`. The French home screen returned to `Toutes les recettes (114)` after discarding the empty verification draft. The owner AVD was not used or modified.

Screenshots are 1080 × 2424 PNG captures from the disposable Pixel 9a clone:

| Capture | SHA-256 |
| --- | --- |
| [Fava picker, EN](screenshots/fava-picker.png) | `27716e595d7cd4a58fcb227d91dcdda3cacfbdf330b204fa0678106d919bca1c` |
| [Fava picker, FR](screenshots/fava-picker-fr.png) | `ace0839e50e893cc2da9bd868635af4259f16c25eda946a719b0bc3605c4dd37` |
| [Rice-starch picker, EN](screenshots/rice-starch-picker.png) | `3771368a75deb0efd22a391bb6751e11e7a5296b950e0cfbb62fcda923be329c` |
| [Rice-starch picker, FR](screenshots/rice-starch-picker-fr.png) | `f7759604182b522744ecdf162f96ec14bb4a0599601f880b17b6d913367b0540` |
| [Final home, EN](screenshots/home-final.png) | `808a5142e8947ae65f6568bf8f5731228fa1208a66cab21b9504237618d5c7e9` |
| [Final home, FR](screenshots/home-final-fr.png) | `f19d55c61c8687eac4d1b2407c8a93cc6a5693505e140af5f7959e5acb4613e8` |

Selected file fingerprints:

| File | SHA-256 |
| --- | --- |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | `144ab072aff63cf208da5dc42a2c8eef095c97a180e0285c574336a46f627a35` |
| `ingredient-forms.v1.json` | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `research-ledger.v1.json` | `28e8054b06e1c4165c41090b83916d34f06d7b2535b89292ea30b049679821b5` |
| Deployed `app-debug.apk` | `75db126ad37e5fdddf26c3ad34c51f2964000e926eefacbd2ef1cdfe52d04771` |

The focused task-file whitespace and encoding checks passed. A broader `git diff --check` also reported 1,574 trailing-whitespace findings in 69 files under the already-dirty `docs/exported-recipe-lists/RecipeKeeper_20260320_143058` snapshot; those files are outside this batch.

## Source review packets

- **WP02:** [whole barley flour](../../proposals/wp02-a4-whole-barley-flour-grade-boundary-review-20261011.md), [fava bean flour](../../proposals/wp02-b2-fava-bean-flour-quebec-identity-review-20261011.md), [rice starch](../../proposals/wp02-rice-starch-quebec-name-boundary-review-20261011.md).
- **WP03:** [rye flakes](../../proposals/wp03-section-f-rye-flakes-identity-review-20261011.md), [spelt flakes](../../proposals/wp03-section-f-spelt-flakes-identity-review-20261011.md), [wild-rice blend](../../proposals/wp03-section-f-wild-rice-blend-identity-review-20261011.md), [puffed teff hold](../../proposals/wp03-section-f-puffed-teff-boundary-review-20261011.md), [puffed rye hold](../../proposals/wp03-section-f-puffed-rye-quebec-name-hold-review-20261011.md), [Korean rice-cake stick hold](../../proposals/wp03-section-f-korean-tteokbokki-rice-cake-sticks-review-20261011.md), [Shanghai-style slice hold](../../proposals/wp03-section-f-shanghai-rice-cake-slices-review-20261011.md).
- **WP04:** [three mangos](../../proposals/wp04-next-count-portion-review-20261011-three-mangos.md), [vanilla pod](../../proposals/wp04-next-count-portion-review-20261011-vanilla-pod.md), [asparagus bunch](../../proposals/wp04-next-count-portion-review-20261011-asparagus-bunch.md), and [half lemon](../../proposals/wp04-lemon-half-medium-edible-portion-review-20261011.md).
- **WP05:** [sambal oelek](../../proposals/wp05-sambal-oelek-quebec-identity-boundary-review-20261011.md), [sambal matah](../../proposals/wp05-sambal-matah-quebec-identity-boundary-review-20261011.md), [chunjang](../../proposals/wp05-chunjang-quebec-name-boundary-review-20261011.md), [Lizano sauce](../../proposals/wp05-lizano-sauce-identity-boundary-review-20261011.md), [chimichurri](../../proposals/wp05-chimichurri-quebec-identity-boundary-review-20261011.md).

Broader WP02/WP03/WP04/WP05 coverage and independent Québec terminology review remain open in the global catalog plan.
