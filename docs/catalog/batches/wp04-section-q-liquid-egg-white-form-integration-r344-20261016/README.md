# WP04 Section Q R344 — pasteurized liquid egg-white form

Integrated on 2026-10-16 as a form on the existing `ingredient-ref-egg-white` reference:

- `ingredient-form-egg-white-liquid-pasteurized` — `pasteurized liquid egg white / blanc d’œuf liquide pasteurisé`.
- Exact bilingual liquid and pasteurized phrases are attached to the form, not the parent reference.
- Density remains null. Generic egg-white wording remains attached to the parent without a form hint.

CFIA names liquid egg white/albumen separately from dried and frozen products. Burnbrae and an Aliments du Québec listing support pure pasteurized liquid products and local terminology; INSPQ attests the French phrase in recipe guidance. The form ledger record preserves Burnbrae’s 500 g and 1 kg cartons as product-specific package observations. Its 33 mL / 2 tablespoon per-white and carton-equivalent statements remain manufacturer-specific. No active count-to-volume mapping, density, package yield, conversion, recipe link, or substitution was added.

The corpus has no liquid/pasteurized egg-white phrase among 114 manifest-listed recipes / 1,123 ingredient rows. Existing 48 whole-egg, 8 egg-white, and 8 yolk-linked recipe rows remain unchanged.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Result after R344 |
|---|---|
| `liquid egg white(s)`, `pasteurized egg white(s)`, `blanc d’œuf liquide pasteurisé`, `blancs d’œufs liquides pasteurisés` | `ingredient-ref-egg-white` with the new form hint |
| `egg white`, `blanc d’œuf` | Existing `ingredient-ref-egg-white` without a liquid-form hint |

The bundled seed package and ledger validators passed; the normalization check reported no changes. No software tests, builds, emulator checks, or deployment were run under the JSON-data rule in `AGENTS.md`.
