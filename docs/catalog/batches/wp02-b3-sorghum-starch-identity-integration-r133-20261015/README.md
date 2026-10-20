# WP02 Section 04 B3 R133 — sorghum starch integration

## Decision

Added identity-only `sorghum starch / amidon de sorgho` as `ingredient-ref-sorghum-starch` in `FLOUR_AND_STARCH`. The OQLF food-domain entry pairs the Québec French and English terms; a 2026 primary study isolates starch from Canadian sorghum varieties. The reviewed Québec product sources support sorghum flour, not a standalone sorghum-starch package, so the catalog row does not claim local retail availability.

Aliases remain empty. In particular, `milo starch` is omitted because the phrase-first picker would also assign bare `milo` to the starch row. No forms, measurements, density, unit mappings, recipe links, conversions, yields, or active substitutions were added. The bundled recipes have no sorghum ingredient demand.

## Evidence and review

The proposal records the source boundary and full links: [R133 sorghum-starch review](../../proposals/wp02-b3-sorghum-starch-identity-review-r133-20261015.md). Root independently rechecked the [OQLF term](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086044/amidon-de-sorgho), [2026 primary study](https://onlinelibrary.wiley.com/doi/full/10.1002/star.70182), and Québec product sources. The paper concerns research isolates, not commercial availability or a kitchen measure.

## Static verification

- Reference and ledger schema validation passed.
- Bundled package semantic validation and normalization checks passed.
- Generated ingredient index is current at 1,486 references.
- Static picker projection assigns `sorghum starch` and `amidon de sorgho` to this row; bare `milo` remains unassigned.
- Ingredient-field scan found 0 matches across 114 manifest-listed recipes / 1,123 ingredient rows.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.

No app, Gradle, unit, instrumentation, emulator, or deployment tests were run because this change adds database JSON data and refreshes its generated index under `AGENTS.md`. WP02 Section 04 B3 remains open.
