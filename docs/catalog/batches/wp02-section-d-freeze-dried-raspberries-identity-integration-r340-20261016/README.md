# WP02 Section D R340 — freeze-dried raspberry identity and aliases

Reviewed and integrated on 2026-10-16. Verified the existing identity-only `ingredient-ref-freeze-dried-raspberries` reference and added two English search aliases:

- `lyophilized raspberries`
- `lyophilised raspberries`

The display remains `freeze dried raspberries / framboises lyophilisées` in `NUT_SEED_AND_DRIED_FRUIT`. OQLF lists both English spellings for the Québec French preservation adjective `lyophilisé` and says fruits can be lyophilized. The fruit-specific Costco Canada panel directly labels `FREEZE DRIED RASPBERRIES / FRAMBOISES LYOPHILISÉES`; the PDF also contains a separate strawberry panel. Its generic filename does not identify the raspberry SKU. The PDF's `1/4 cup (5 g)` serving remains a product-specific observation and does not create a reusable measure or conversion.

Recipe 112's two existing lines remain linked to the same reference: `10 g freeze-dried raspberries` and `Extra freeze-dried raspberries for coating`. The recipe source grinds the berries into dust, sifts out seeds, and uses that powder in and on the truffles. The powder is made from the linked fruit; it is not a separately requested purchased ingredient. The coating quantity remains unspecified. No recipe text, line, amount, form, package yield, conversion, or substitution rule was changed.

Before integration, the catalog contained 1,686 references, 129 forms, 57 legacy candidates, and 2,033 ledger records. The active raspberry row had no aliases or sources; it had no attached forms. The two existing recipe links were the only corpus demand for this identity among 114 recipes and 1,123 ingredient rows.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms and its complete-phrase-first fallback behavior.

| Query | Before R340 | After R340 |
|---|---|---|
| `freeze dried raspberries`, `freeze-dried raspberries` | Existing raspberry reference | Same reference |
| `framboises lyophilisées` | Existing raspberry reference | Same reference |
| `lyophilized raspberries` | No result | Existing raspberry reference |
| `lyophilised raspberries` | No result | Existing raspberry reference |
| `raspberries` | Fresh raspberries and freeze-dried raspberries | Same two references |
| `freeze-dried` | Curry leaves, freeze-dried raspberries, and freeze-dried strawberries | Same three references |
| `raspberry powder` | No result | No result |

The existing ledger identity is now `verified`. The three R340 sources record the OQLF fruit term, direct bilingual label, and the source recipe; the OQLF adjective source is referenced under its original R337 source ID rather than duplicated. Measurement and general substitution research remain `not_yet_researched`. The ledger records no measurement observation or substitution finding. No density, unit mapping, form, recipe edit, package yield, conversion, or active substitution was added.

The [proposal](../../proposals/wp02-section-d-freeze-dried-raspberries-identity-review-r340-20261016.md) records the ownership audit, label scope, recipe source, and remaining evidence limits. Static package, reference-normalization, generated-index, ledger, picker, corpus, encoding, local-link, and whitespace checks passed. The combined catalog contains 1,686 references, 129 forms, 57 legacy candidates, and 2,033 ledger records. No software tests, builds, emulator checks, or deployment were run under the JSON-data exception in `AGENTS.md`.
