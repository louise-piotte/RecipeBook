# WP02 Section D R337 — freeze-dried strawberry identity and aliases

Reviewed and integrated on 2026-10-16. Verified the existing `ingredient-ref-freeze-dried-strawberries` reference and added two English search aliases:

- `lyophilized strawberries`
- `lyophilised strawberries`

The displayed names remain `freeze-dried strawberries / fraises lyophilisées` in `NUT_SEED_AND_DRIED_FRUIT`. OQLF lists both English spellings for the Québec French preservation adjective `lyophilisé` and says fruits can be lyophilized. A Costco Canada bilingual panel directly labels a strawberry product `FREEZE DRIED STRAWBERRIES / FRAISES LYOPHILISÉES`; a current Canadian product page corroborates the product identity. The proposal’s original S02 link pointed to a peach nutrition panel; root corrected it to the strawberry panel at `690611_NFT.pdf` before integration.

Recipe 062’s existing ingredient line remains `25 g freeze-dried strawberries`, linked to the existing reference. The recipe’s own method grinds these strawberries for its buttercream, and it offers freeze-dried raspberries for a raspberry-buttercream variation. That option stays formula-specific and creates no active substitution. The existing density remains null, unit mappings and forms remain empty, and measurement/substitution research remains `not_yet_researched`. No recipe, package yield, reusable measure, conversion, or numeric behavior was added.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete phrases are preferred across names and aliases, with substring matching only when no complete phrase matches.

| Query | Before R337 | After R337 |
|---|---|---|
| `freeze-dried strawberries`, `freeze dried strawberries` | Existing strawberry reference | Same reference |
| `fraises lyophilisées` | Existing strawberry reference | Same reference |
| `lyophilized strawberries` | No result | Existing strawberry reference |
| `lyophilised strawberries` | No result | Existing strawberry reference |
| `strawberries` | Fresh strawberries and freeze-dried strawberries | Same two references |
| `freeze-dried` | Three existing reference/form matches | Same results |
| `strawberry powder` | No result | No result |

No alias was added for the adjective alone or for the recipe-produced powder. The 114-recipe / 1,123-row manifest corpus has the single existing linked line in recipe 062; it was not edited.

The [proposal](../../proposals/wp02-section-d-freeze-dried-strawberries-identity-review-r337-20261016.md) records the source-bound label and recipe quantities without generalizing them. The ledger now has three identity sources and an accepted decision; no measurement observations or substitution findings were added. Static package, reference-normalization, generated-index, ledger, picker, corpus, encoding, local-link, and whitespace checks passed. The combined catalog contains 1,684 references, 129 forms, 58 legacy candidates, and 2,032 ledger records. No software tests, builds, emulator checks, or deployment were run because the change only adds database JSON data and its generated catalog projection under `AGENTS.md`.
