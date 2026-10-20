# Catalog product-boundary follow-up — 2026-10-10

## Accepted changes

- Added source-backed search aliases to the existing baking-soda and baking-powder identities. The 21 soda and 22 powder recipe links remain unchanged. Baking soda remains `baking soda / bicarbonate de soude`; baking powder remains `baking powder / poudre à pâte`.
- Added identity-only `cracker crumbs / chapelure de craquelins`, `matzo meal / farine de pain azyme`, and `croutons / croûtons` references. They have no bundled recipe links, forms, density, unit mappings, measurements, conversions, yields, or substitutions.
- Added separate identity-only `corn tortillas / tortillas de maïs`, `flour tortillas / tortillas de farine`, `pita bread / pain pita`, and `lavash bread / pain lavash` references. The flour-tortilla reference reuses and resolves its matching legacy ID. None has bundled recipe links, forms, density, unit mappings, measurements, conversions, yields, or substitutions.
- Kept generic bread cubes as source-level wording. Breadcrumbs, Graham crumbs, panko, cracker crumbs, matzo meal, and croutons remain separate identities.
- Retained the existing panko identity and linked only recipes 019#9, 023#2, and 087#4. Added `strawberry puree / purée de fraises` for recipe 051#12 and preserved its exact line amount, unit, name, and source text with the `reduced / réduite` preparation.
- Added technical search aliases to the existing `cream of tartar / crème de tartre` identity; its exact recipe lines 021#15 and 068#4 and authored quantities remain unchanged.
- Verified the existing breakfast-sausage identity without changing its data. Kept the exact `078#3` ground-lamb alternative as the recipe-local bilingual note, with no general substitution. Ground-beef/turkey species and source qualifiers remain as authored; recipe 018#1's source-version conflict remains unresolved.
- Kept the broad flat rice-noodle candidate inactive because the bundle has no exact ingredient demand and the phrase overlaps broader rice-noodle search results.

## Evidence boundaries

- OQLF defines sodium bicarbonate separately from baking powder and lists Québec terms for both. The CFIA permitted-synonym tables support the French sodium-bicarbonate aliases; the English table lists baking soda under sodium bicarbonate. The CFIA compositional standard defines baking powder as a compound product with variable acid-reacting materials. No fixed formula or substitution was added.
- TERMIUM supports `cracker crumbs / cracker meal / chapelure de craquelins`. The matzo-meal display follows the Canadian French editorial usage `farine de pain azyme`; whole matzo, farfel, prepared matzo-ball mix, and finer cake meal remain distinct.
- OQLF and Dare support crouton identity and Québec French market wording. Product-specific package details were not generalized.
- OQLF and Québec manufacturer/retailer listings distinguish corn and wheat-flour tortillas; the bare word `tortilla` stays off both alias lists because it names both product classes. Pita and lavash remain separate named breads. Pita chips, lavash crackers, tortilla chips, wraps, and generic flatbread are not aliases or inferred forms.
- The chorizo, andouille, and kielbasa review found no bundled recipe demand and conflicting regional product/state boundaries. No sausage references were added; the breakfast-sausage and merguez records remain outside that review.
- Picker filtering returns selectable suggestions. A short phrase can return a broader named product when its display contains that phrase; the picker does not assign a result without user selection. The regression test records this for `cracker crumbs` and `matzo`.

## Source reviews

- [Baking soda and baking powder boundary review](../../proposals/wp02-section-e-soda-powder-boundary-review-20261010.md)
- [Cream-of-tartar identity audit](../../proposals/wp02-section-e-cream-of-tartar-identity-audit-20261010.md)
- [Cracker crumbs and matzo meal boundary review](../../proposals/wp03-section-g-cracker-matzo-crumb-boundary-review-20261010.md)
- [Bread cubes and croutons review](../../proposals/wp03-section-g-bread-cubes-croutons-review-20261010.md)
- [Corn and wheat tortilla boundary review](../../proposals/wp03-section-g-corn-wheat-tortilla-boundary-review-20261010.md)
- [Pita and lavash boundary review](../../proposals/wp02-section-g-pita-lavash-boundary-review-20261010.md)
- [Panko identity review](../../proposals/wp03-section-g-panko-identity-review-20261010.md)
- [Strawberry puree identity review](../../proposals/wp02-section-d-fruit-product-boundary-review-20261010.md)
- [Breakfast-sausage family gap review](../../proposals/wp04-section-o-sausage-family-gap-review-20261010.md)
- [Ground-meat qualifier review](../../proposals/wp04-section-o-ground-meat-qualifier-review-20261010.md)
- [Recipe 078 ground-lamb alternative review](../../proposals/wp04-section-o-recipe-078-ground-lamb-alternative-review-20261010.md)
- [Rice-noodle boundary review](../../proposals/wp03-section-g-rice-noodles-boundary-review-20261010.md)
- [Regional sausage product review](../../proposals/wp04-section-o-regional-sausage-product-review-20261010.md)

## Picker verification

Verified in the deployed app on the disposable Pixel 9a / Android 16 clone (`emulator-5556`). Each row remained a selectable suggestion; no ingredient was selected and no draft was saved. The blank drafts were discarded and the French home was restored at 114 recipes.

| Screenshot | Query and result |
| --- | --- |
| [03-picker-panko-en.png](screenshots/03-picker-panko-en.png) | English `panko` → `panko bread crumbs` |
| [04-picker-strawberry-puree-en.png](screenshots/04-picker-strawberry-puree-en.png) | English `strawberry puree` → `strawberry puree` |
| [05-picker-panko-fr.png](screenshots/05-picker-panko-fr.png) | French UI, `chapelure japonaise` → `chapelure panko` |
| [06-picker-matzo-fr.png](screenshots/06-picker-matzo-fr.png) | French UI, `farine de pain azyme` → `farine de pain azyme` |
| [07-picker-cracker-crumbs-fr.png](screenshots/07-picker-cracker-crumbs-fr.png) | French UI, `chapelure de craquelins` → `chapelure de craquelins` |
| [08-picker-bicarbonate-fr.png](screenshots/08-picker-bicarbonate-fr.png) | French UI, `bicarbonate de sodium` → `bicarbonate de soude` |
| [09-picker-tortillas-en.png](screenshots/09-picker-tortillas-en.png) | English `tortilla` → both `corn tortillas` and `flour tortillas` |
| [10-picker-pita-en.png](screenshots/10-picker-pita-en.png) | English `pita` → `pita bread` |
| [11-picker-lavash-en.png](screenshots/11-picker-lavash-en.png) | English `lavash` → `lavash bread` |
| [12-picker-tortillas-fr.png](screenshots/12-picker-tortillas-fr.png) | French UI, `tortilla` → `tortillas de maïs` and `tortillas de farine` |
| [13-picker-pita-fr.png](screenshots/13-picker-pita-fr.png) | French UI, `pain pita` → `pain pita` |
| [14-picker-lavash-fr.png](screenshots/14-picker-lavash-fr.png) | French UI, `pain lavash` → `pain lavash` |
| [15-home-fr-ca-114.png](screenshots/15-home-fr-ca-114.png) | Restored French library home, 114 recipes |

The search regression test also confirms that tortilla chips, pita chips, lavash crackers, generic flatbread, and wraps do not resolve to these bread identities.

## Validation

Passed:

- Ingredient-reference normalization, bundled-package normalization/validation, and generated-index freshness checks (876 references).
- All 37 Python bundled-seed-package tests.
- All 361 Android unit tests.
- Connected Android 16 instrumentation on `emulator-5556`: 31 tests, 29 passed, 2 skipped, 0 failures or errors. The skipped tests were `AiBackendSettingsPersistenceTest.openRouterSettingsPersistAndBlankKeyDisablesRemoteAi` and `RecipeEditorActivityRecreationTest.actualActivityRetainsEditedAmountsMetadataAndDraftPhotoAcrossRecreation`.
- `tools/deploy_to_pixel9a_emulator.sh`: test task, assemble, streamed install, and app launch succeeded.
- Final visual picker inspection and French 114-recipe home restoration.

## Package snapshot

The batch added four active references, resolved one matching legacy candidate, and added four ledger records (the existing flour-tortilla candidate ledger record was promoted in place). No recipe corpus entry, form, measurement, or runtime conversion changed.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 876 | `3aaf4b0623a6a3fcd69dfbd77cf3cc0935c2be6c0d18bd2b7b71d3e02a6363d8` |
| Ingredient forms | 48 | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| Research ledger | 1,121 records / 2,731 source entries / 2,145 distinct source IDs | `2baa4cf3dca147215d4ab5f4ff17888881669f5d55e2c1bbc3d1ef6e19040425` |
| Legacy identity candidates | 77 | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| Generated ingredient index | 876 references | `5fa624b4e16dcb2c9584d91a0f052b646c2f97f6e9f28245ca95e7e14c9bdeb2` |
| Seed manifest | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The manifest-listed recipe corpus remains 114 files / 1,123 ingredient rows / 751,959 bytes, with ordered digest `009a0dbd340a3e85e8a6809bc19e871f911b110357b127d55f7eb50c0cbf1055`. The forms, seed manifest, and recipe corpus are unchanged in this batch.

PNG checksums for the screenshots above are in [`screenshots/SHA256SUMS.txt`](screenshots/SHA256SUMS.txt).
