# WP03 Section F — Baddaz identity integration (round 37)

**Date:** 2026-10-13

**Decision:** Add one identity-only reference for the Moroccan Amazigh Baddaz product.

The active row is `Baddaz (Moroccan corn couscous) / Baddaz (couscous de maïs marocain)` in
`GRAIN_AND_CEREAL`. It has no aliases, forms, density, unit mappings, recipe links, conversions,
yields, or substitutions. The identity is bounded to Baddaz and does not represent every regional
maize-couscous product. In particular, keep the distinct Beninese *yeke-yeke* product separate.

The manufacturer supports Baddaz / corn couscous as 100% maize semolina. A Greater Montréal-serving
retailer uses the French listing title `Couscous maïs Baddaz`; it was out of stock when checked, so
the listing supports local-market wording and product identity, not current availability. The
qualified display keeps the Moroccan product boundary visible and avoids adding a generic alias.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (generated)
- `docs/catalog/proposals/wp03-section-f-baddaz-corn-couscous-identity-review-20261013-r37.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

At the Baddaz integration checkpoint, the active catalog had 1,366 references, 100 forms, 64
legacy-import candidates, and 1,699 research-ledger records. The proposal records the pre-integration inventory of 1,365 references,
100 forms, 64 legacy candidates, and 1,699 ledger records.

## Search and recipe effects

The pre-integration picker projection had no result for `baddaz`, `couscous de maïs`, or `corn
couscous`; each now returns the new row. `couscous` grows from four results to five. Broad `corn`
and `maïs` queries grow from 19 to 20 and 21 to 22 results. `couscous maïs` and `maize couscous`
remain unmatched because neither is an exact phrase in the bilingual display.

The 114 manifest-listed recipe files contain 1,123 ingredient rows. None contains Baddaz, couscous
de maïs, couscous maïs, corn couscous, or maize couscous, so no recipe links or quantities were
added.

## Verification

Static package validation, normalized-reference and package checks, generated-index freshness,
active/form/legacy/ledger exact ownership, picker projections, and the recipe-corpus scan passed.
The proposal's five source IDs are distinct. Modified text files are UTF-8 without BOM, the French
reference value is stored with an explicit `\u00ef` JSON escape, local links resolve, and
scoped whitespace checks pass.

No tests were run because the change only adds database JSON data, as specified by `AGENTS.md`.
Section F remains open.
