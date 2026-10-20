# WP02 Section C R342 — fancy molasses integration

Integrated on 2026-10-16 as one identity-only `SUGAR_AND_SWEETENER` reference:

- `ingredient-ref-fancy-molasses`: `fancy molasses / mélasse de fantaisie`.
- French aliases: `mélasse qualité fantaisie` and `mélasse de qualité fantaisie`; no English aliases.
- Density remains null; unit mappings and forms remain empty.

The current Canadian standard defines the source/process class, and OQLF gives `mélasse de fantaisie` as the preferred Québec French term. CFIA wording and two Québec retailer listings support the qualified aliases. The generic legacy `molasses / mélasse` candidate remains unresolved; accepted blackstrap, golden syrup, and pomegranate-molasses references remain separate.

The ledger retains Crosby’s 1 tablespoon (20 g) serving only as a brand-specific label observation. It also records Crosby’s qualitative Cooking-for-Fancy advice as blocked pending transferable scope; no active substitution was added. The recipe scan found no matching term in 114 manifest-listed recipes / 1,123 ingredient rows.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Result after R342 |
|---|---|
| `fancy molasses`, `mélasse de fantaisie`, `mélasse qualité fantaisie` | `ingredient-ref-fancy-molasses` only |
| `molasses` | Blackstrap molasses, fancy molasses, and pomegranate molasses |
| `mélasse` | Blackstrap molasses, fancy molasses, golden syrup, and pomegranate molasses |
| `blackstrap molasses`, `pomegranate molasses`, `mélasse verte` | Existing qualified identities remain available |
| `black treacle`, `mélasse noire` | No new result |

The French broad query also matches golden syrup through its existing `mélasse claire` and `mélasse légère` aliases. These broad results reflect phrase matching, not equivalence. The existing picker assertion for `molasses` was updated to include the new identity.

The package validator accepted the catalog and ledger, and the normalization check reported no changes. No software tests, builds, emulator checks, or deployment were run under the JSON-data rule in `AGENTS.md`.
