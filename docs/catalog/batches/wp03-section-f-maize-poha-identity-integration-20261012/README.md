# WP03 Section F maize poha identity integration

- **Date:** 2026-10-12.
- **Status:** Integrated as one identity-only ingredient reference and one research-ledger record.
- **Proposal:** [Maize poha product-boundary review](../../proposals/wp03-section-f-maize-poha-product-boundary-review-20261012.md).

## Accepted catalog scope

Added `ingredient-ref-corn-poha` as `corn poha / poha de maïs`, category `GRAIN_AND_CEREAL`, with English aliases `maize poha`, `makai poha`, and `makka poha`, plus French alias `makkai poha`. The Québec French display is provisional market-attested wording, not an OQLF or TERMIUM terminology ruling.

The row represents a plain human-food flattened-maize product marketed as poha. Manufacturer process descriptions remain source-specific. No size form, density, unit mapping, measure, conversion, cooking time, yield, recipe link, or substitution was added. Feed products, cornmeal, grits, rice poha, and the existing ready-to-eat corn-flakes identity remain separate.

## Picker and recipe audit

The static phrase audit against `IngredientSearch.kt` found:

- `corn poha`, `maize poha`, `makai poha`, `makka poha`, `makkai poha`, and `poha de maïs` resolve to the new row alone.
- `corn flakes` and `flocons de maïs` continue to resolve only to `ingredient-ref-corn-flakes`, the OQLF-defined breakfast cereal.
- Broad `poha` returns flattened rice poha, red rice flakes through its `red rice poha` alias, and corn poha. The names preserve the rice/maize distinction.

The full bundled corpus has 114 recipes and 1,123 ingredient rows. No candidate-name matches were found, so no recipe row was changed.

## Evidence limits

The ledger records four new sources: a regional manufacturer’s Makai Poha product and process description; a Canadian French Rani listing with maize ingredient and market names; an indexed Canadian French Makkai Poha listing; and a second manufacturer’s product boundary descriptions. The existing OQLF `flocons de maïs / corn flakes` source was reused as a boundary check and not duplicated in the maize-poha ledger record. No source establishes a universal manufacturing process, product size, measure, yield, or interchangeability with ready-to-eat corn flakes.

## Verification

After integration the package has 1,248 references / 94 forms / 114 recipes / 1,123 ingredient rows. The ledger has 1,555 records / 5,400 source entries / 4,438 distinct source IDs / 0 errors. Static package normalization, reference normalization, generated-index freshness, picker phrase ownership, and ledger validation passed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
