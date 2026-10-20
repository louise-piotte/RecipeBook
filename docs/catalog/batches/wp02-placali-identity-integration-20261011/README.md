# WP02 Placali Identity Integration — 2026-10-11

## Decision

Added `ingredient-ref-placali` as one identity-only `FLOUR_AND_STARCH` reference with `placali` in both language fields. Its aliases are empty, density is null, and unit mappings are empty. The ledger records the identity as verified, measurement research as `researched_no_supported_value`, and substitution research as `researched_no_supported_substitute`.

The name is supported by food-science and processing sources and by French-facing Québec product listings. Those sources do not settle whether retail Placali is raw fermented pulp or cooked dough, so no forms, preparation state, household measures, conversions, yields, substitutions, or recipe links were added. The experimental flour-to-water proportions remain in the proposal and are not reusable catalog behavior.

Placali remains separate from cassava root and flour, tapioca starch, gari, lafun, Pupuru, attiéké, and generic fufu/amala. The Agbelima review is a separate hold: the combined Québec title `Placali–Agbelima` does not establish synonymy or a shared product stage; see [the boundary proposal](../../proposals/wp02-agbelima-quebec-identity-boundary-review-20261011.md).

## Evidence

The six source records use IDs `WP02-PLACALI-QUEBEC-20261011-S01` through `S06` and are filed on `ingredient-ref-placali` in the research ledger:

| Source | Contribution | Limit |
|---|---|---|
| Adiko et al., [fermentation and Placali study](https://academicjournals.org/journal/AJMR/article-abstract/59953F673174) | Names Placali as fermented cassava paste. | Process/sample evidence; no general kitchen measure or universal state. |
| IITA, [Attiéké production report](https://cgspace.cgiar.org/server/api/core/bitstreams/e022cd83-d904-4cc6-a663-b5be9007e6de/content) | Describes raw fermented/pressed pulp called Placali in one processing-chain context and records historical cooked-dough usage. | Explicitly documents context-dependent stage; not a product standard. |
| Koko et al., [fermented cassava flour processed into Placali](https://www.ajol.info/index.php/ijbcs/article/view/80512) | Supports the named product and one experimental reconstitution study. | Study-specific flour/water ratios are not generalized. |
| Distribution Armel, [Placali Armel](https://distributionarmel.com/boutique/placali-armel/) | Québec French-facing product name and local listing. | Page does not establish frozen product stage, mass, or volume. |
| Le Marché des Continents, [Placali](https://marchedescontinents.ca/products/placali) | Québec City product listing with the exact name. | No composition, preparation, or package amount. |
| WiniMall, [Placali](https://www.winimall.com/product/detail/placali-5-par-boule-pid1347) | Montréal marketplace listing. | Loose `cassava/manioc semolina` wording is not treated as an alias; per-ball price is not a quantity. |

See the [full source and collision review](../../proposals/wp02-next-b2-b3-flour-starch-review-20261011.md) for scope, recipe audit, and exact source locators.

## Package snapshot

- 889 ingredient references, including Placali; 48 forms.
- 114 recipes and 1,123 ingredient rows; recipe files and manifest order unchanged.
- 1,139 ledger records, 2,876 source entries, 2,285 distinct source IDs, and 179 measurement observations.
- Ingredient-reference JSON SHA-256: `833940a8c7ca9b59e808f543db7b3b697ebbb761eb81230651c7c98df7fe8487`.
- Research-ledger JSON SHA-256: `1c4ea31f1f8b0de978fddc3c143c8b291d7913764e9184c7a7c3776b6897d5d6`.
- Debug APK SHA-256: `1c37bfee0328f671ba4bbeae2a7519b719da451ba77146cb04a60b087e6d7915`.

## Verification

- `python3 -B -m tools.seed_package.test_bundled_seed_package`: 56 tests passed.
- Bundled seed validation and normalization check passed; ingredient-reference normalization check passed; generated Kotlin catalog check passed with 889 references.
- Android unit tests: 375 passed, 0 skipped or failed.
- Connected Android instrumentation on a disposable Pixel 9a / Android 16 (API 36) profile: 32 tests, 30 passed, 2 skipped, 0 failed or errored. The new `placaliBundledIdentityIsSelectableInTheIngredientPicker` case passed.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5558 bash tools/deploy_to_pixel9a_emulator.sh` completed tests, debug assembly, streamed install, and app launch.
- On the live picker, `placali` returned one result in English and one in French. After exiting the unsaved draft, the French home displayed `Toutes les recettes (114)`.
- QA used fresh temporary AVD data at `%TEMP%\RecipeBookPixel9aQA-20261011`; the original owner AVD was not the install or UI target.

## Screenshots

All captures are 1080 × 2424 PNGs:

| Capture | SHA-256 |
|---|---|
| [English home](screenshots/home-en.png) | `d412fa284cc1fcaf6cb7913d901435a3163496cf99b957e08652a3935ea68694` |
| [French home after draft discard](screenshots/home-fr.png) | `6abe3958103ae6c6ce063bb2bc9a721a5c3a06880d53e9994d0d4cf9a162cbb1` |
| [English picker result](screenshots/picker-en-placali.png) | `9093f4f6a3c564dbc29f6e389154707ec4d3ae40c25c087670a35685fe032793` |
| [French picker result](screenshots/picker-fr-placali.png) | `62c3456d879c40726dc8ee5012dad8a3025d7fbc3f2e1ee293a77140911a1dfb` |
