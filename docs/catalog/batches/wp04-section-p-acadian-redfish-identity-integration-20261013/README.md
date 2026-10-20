# WP04 Section P Acadian redfish identity integration — 2026-10-13

## Decision

Added identity-only `ingredient-ref-acadian-redfish` in `PROTEIN`:

- English: `Acadian redfish`
- Québec French: `sébaste acadien`
- species: *Sebastes fasciatus*
- aliases, forms, active measures, recipe links, conversions, yields, and substitutions: none

TERMIUM Plus and the CFIA Fish List support the species-scoped Canadian name. A Québec food
information source confirms the bilingual species pairing. The existing `Québec redfish / sébaste
du Québec` remains a broader local *Sebastes* market group; generic `redfish` and `sébaste` searches
show both qualified rows. No generic aliases were added to the new species row.

## Numeric and recipe boundaries

The 114-recipe / 1,123-row bundle contains no Acadian-redfish species-qualified ingredient line.
An external Québec recipe gives 10 generic sébaste fillets for two portions, without a species
name on the ingredient line or fillet mass; it is not retained as a species-specific measure.
Fishery totals and group-level Québec retail pack sizes remain out of active ingredient quantities.
No form, conversion, yield, or substitution is supported.

## Records

- Research packet: [R72 WP04 review](../../proposals/wp04-section-p-next-open-seafood-boundary-review-20261013-r72.md)
- Canonical reference and research ledger: `ingredient-ref-acadian-redfish`

The database JSON package was normalized and structurally validated, and the generated ingredient
catalog was refreshed. No app tests or emulator checks were run because this change adds database
JSON data. Section P remains open.
