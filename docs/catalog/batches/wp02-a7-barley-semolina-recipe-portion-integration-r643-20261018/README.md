# WP02 Section A7 R643 — barley-semolina formula portion

Integrated on 2026-10-18 after root review of the [R643 proposal](../../proposals/wp02-a7-barley-semolina-recipe-portion-review-r643-20261018.md).

## Ledger update

- Updated the existing `ingredient-ref-barley-semolina` measurement state to `researched_supported` and recorded one formula-specific `portion_weight` observation: the Québec *Pouding semoule d'orge* recipe lists 1½ cups (315 g) of medium-size barley semolina for a 25-portion batch.
- Reused R397 source S01 for the same recipe directory; no duplicate source was added. The co-reported quantities remain as published. No per-serving amount, general cup weight, density, conversion, form, recipe link, yield, or substitution was derived.
- Kept `substitutionResearchState: researched_no_supported_substitute`; the active reference retains null density and empty unit mappings. Names, aliases, category, and picker behavior are unchanged.
- The bundled recipe corpus has no matching barley-semolina ingredient line.

## Source and static validation

- [Centdegrés / M361, *Pour des aliments québécois dans nos écoles*](https://apprendre.centdegres.ca/wp-content/uploads/2025/12/MAPAQ_Repertoire-recettes-vf.pdf), printed pp. 28–29, lists 1½ tasse (315 g), medium-size barley semolina, and a 25-portion recipe.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 1,832 references.
- Research-ledger JSON Schema validation passed with zero errors across 2,203 records; source and observation ownership checks passed.
- No software tests, build, emulator run, or deployment were needed because this update only adds database JSON data under `AGENTS.md`.

WP02 Section A7 remains open.
