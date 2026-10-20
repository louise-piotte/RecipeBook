# WP03 Section U R343 — holy basil identity integration

Integrated on 2026-10-16 as one identity-only `HERB` reference for culinary *Ocimum tenuiflorum* L.:

- `ingredient-ref-holy-basil`: `holy basil / basilic sacré`.
- English aliases: `sacred basil`, `tulsi`, `kra prao`; French alias: `tulsi`.
- Density remains null; unit mappings and forms remain empty.

The Thai Department of Agricultural Extension and Kew support the botanical and food-crop scope. Québec-facing product listings attest `basilic sacré` and `tulsi`; the French display is supported by local product use, not an OQLF ruling. The existing `Thai basil / basilic thaï` reference stays separate and retains no assigned species. Medicinal products, extracts, seeds, cultivar-qualified names, and botanical names remain outside the picker aliases.

The ledger leaves measurement and substitution research `not_yet_researched`. The scan found no matching phrase in 114 manifest-listed recipes / 1,123 ingredient rows; no form, recipe link, measure, conversion, yield, or active substitution was added.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Result after R343 |
|---|---|
| `holy basil`, `sacred basil`, `basilic sacré`, `tulsi`, `kra prao` | `ingredient-ref-holy-basil` only |
| `Thai basil`, `basilic thaï` | Existing `ingredient-ref-thai-basil` only |
| `basil`, `basilic` | Existing basil, dried basil, pesto, and Thai basil rows, plus holy basil |
| `Rama tulsi`, `kra phrao`, `kaphrao`, `kraprao` | No result from the new row |

The bundled seed package and ledger validators passed; the normalization check reported no changes. No software tests, builds, emulator checks, or deployment were run under the JSON-data rule in `AGENTS.md`.
