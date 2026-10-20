# WP03 Section U R341 — tarragon identity integration

Reviewed and integrated on 2026-10-16. Promoted the existing legacy candidate to one identity-only HERB reference:

- `ingredient-ref-tarragon`: `tarragon / estragon` for culinary *Artemisia dracunculus* L.
- English and French aliases: none.
- Density: null; unit mappings: empty.

OQLF directly maps the Québec French term `estragon` to English `tarragon` and *A. dracunculus* L.; its definition describes the aromatic stem and leaves as condiment material. Kew accepts the species and records food use. UQAC documents fresh and dried leaf use under its `estragon français` profile, without generalizing that source-specific wording to all tarragon cultivars. Mayrand lists fresh `Estragon` products in Québec. An archived CFIA draft describes whole or ground tarragon as dried leaves and flowering tops, but the draft is not adopted as a current standard or active form. These sources support the bounded culinary identity; none establishes a recipe measure or substitution.

Before integration, the catalog contained 1,686 references, 129 forms, 57 legacy candidates, and 2,033 ledger records. The exact ID existed only as an unreviewed legacy candidate and matching candidate ledger record. Root promoted the ID and removed the candidate, leaving 56 legacy candidates. No active name owner or attached tarragon form existed.

The manifest scan found no tarragon phrase in 114 bundled recipes / 1,123 ingredient rows. No recipe link, form, measure, density, mapping, conversion, yield, or active substitution was added. Measurement and general substitution research remain `not_yet_researched`.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The exact bilingual display terms resolve to the new row. Qualified, part-specific, genus-level, and botanical phrases remain outside its alias set:

| Query | Result |
|---|---|
| `tarragon`, `estragon` | `ingredient-ref-tarragon` only |
| `French tarragon`, `estragon français` | No result from the new row |
| `Russian tarragon`, `Mexican tarragon` | No result from the new row |
| `tarragon leaves`, `feuilles d'estragon` | No result from the new row |
| *Artemisia dracunculus*, `Artemisia` | No result from the new row |
| `armoise`, `wormwood`, `mugwort` | No result from the new row |

The [proposal](../../proposals/wp03-section-u-tarragon-identity-review-r341-20261016.md) records the ownership audit, source limits, and unassigned name families. Static package, reference-normalization, legacy-candidate, generated-index, ledger, picker, corpus, encoding, local-link, and whitespace checks passed. The resulting catalog contains 1,687 references, 129 forms, 56 legacy candidates, and 2,033 ledger records. No software tests, builds, emulator checks, or deployment were run under the JSON-data exception in `AGENTS.md`.
