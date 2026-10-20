# WP02/WP03/WP04 R205–R208 gap-review integration — 2026-10-16

## Decisions

- **R206 — whole spelt flour:** Added identity-only `whole spelt flour / farine d'épeautre entière` as `FLOUR_AND_STARCH`. Kept aliases, forms, measures, mappings, recipe links, conversions, yields, and substitutions empty. The row is separate from generic, malted, and sprouted spelt flour, spelt berries, and einkorn flour. The proposed names and limits are documented in the [R206 review](../../proposals/wp02-section-a-next-functional-wheat-flour-gap-review-r206-20261016.md).
- **R208 — white currant:** Added identity-only `white currant / groseille blanche à grappes` as `FRUIT`, with OQLF-backed, color-qualified aliases. It represents the white-fruited currant variant, not a distinct taxon. Bare `currant`, `groseille`, and `gadelle` and botanical names remain unassigned. No recipe links or numeric behavior were added. See the [R208 review](../../proposals/wp03-section-m-white-currant-identity-boundary-review-r208-20261016.md).
- **R205 — cooked quinoa:** Rechecked the official CNF 2026 listing and alternate download routes. The Food Name and Measure Weight Conversion rows remained inaccessible, so no presence/absence claim or new measurement was made. Keep the measurement review open and preserve the historical observations and recipe 016#1 link. See the [R205 review](../../proposals/wp03-section-f-cooked-quinoa-cnf-2026-row-inspection-r205-20261016.md).
- **R207 — dried mussels:** Held `dried mussels / moules séchées` outside active references and the ledger. One Toronto Thai product listing does not establish species, salt/process state, or a stable Québec product name. Leave the generic mussel candidate unresolved. See the [R207 review](../../proposals/wp04-section-p-next-shellfish-gap-review-r207-20261016.md).

No R205–R208 candidate had a matching bundled recipe line. The new rows add no forms, recipe links, substitutions, or reusable numeric data. WP02 Section A, WP03 Sections F and M, and WP04 Section P remain open.

## Data and source ownership

The reference catalog now has **1,595 references**; forms remain at **122**. The research ledger now has **1,940 records**. R206 adds three new source IDs and reuses `WP02A4-SP-S01` (OQLF, base term `épeautre`) and `WP02-A4-WBF-20261011-S03` (Health Canada, general whole-grain concept). R208 adds four new source IDs. The source URL and source-ID checks found no collisions for the new records.

The picker now returns four results for `spelt flour` and `farine d'épeautre`; white-currant-specific searches return the new identity alone. Broad `currant`, `groseille`, and `gadelle` searches remain multi-result. The existing searcher's lack of plural stemming remains visible for `currants`; this batch does not change family-wide search behavior.

## Validation

- Bundled seed package validation and normalized-state checks passed.
- Generated ingredient catalog check passed at 1,595 references.
- Research-ledger JSON Schema validation passed; the two new decision records link to their listed sources.
- New identity, alias, source ownership, picker projection, forms/rules, and recipe-link checks passed. The bundled corpus remains **114 recipes / 1,123 ingredient rows**.
- UTF-8 without BOM, explicit escaped Unicode in database JSON, and scoped whitespace checks passed.
- Existing catalog test expectations were updated for the new identities and picker result sets. No software tests or emulator checks were run because the application change only adds database JSON data, as allowed by `AGENTS.md`.

See the [active catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt) for the nested review records and remaining work.
