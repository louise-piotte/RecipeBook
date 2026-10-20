# WP03 Section F — Keskes Khoumassi identity integration (round 38)

**Date:** 2026-10-13

**Decision:** Add one identity-only reference for the protected Moroccan GI couscous.

The row is `Keskes Khoumassi (five-cereal couscous) / couscous Khoumassi (cinq céréales)` in
`GRAIN_AND_CEREAL`, with `Keskes Moukhamess` as its only French alias. The Moroccan GI decree
specifies the product as five cereal flours that are hand-agglomerated with water, then cooked and
dried. The recipe bundle has no matching demand; the catalog includes the identity because the
product is real and its protected name and composition are well-defined. No forms, measurements,
density, mappings, recipe links, conversions, yields, or substitutions were added.

Keep this GI identity separate from generic couscous, Baddaz, and variable marketplace products
using Khoumassi or multi-cereal wording without the same verified specification. A Terroir du Maroc
listing describes the product as five cereals, while a second current cooperative listing calls its
product “tri-céréales” and also describes five flour types. These seller descriptions do not change
the GI specification and are not added as generic aliases.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (generated)
- `docs/catalog/proposals/wp03-section-f-keskes-khoumassi-five-cereal-couscous-boundary-review-20261013-r38.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

At this integration checkpoint, the catalog has 1,367 references, 100 forms, 64 legacy-import
candidates, and 1,699 research-ledger records. The proposal records the pre-integration inventory
of 1,366 references, 100 forms, 64 legacy candidates, and 1,699 ledger records.

## Search and recipe effects

The picker projection uses the current phrase-first and substring-fallback behavior. `Khoumassi`,
`Keskes Moukhamess`, `couscous Khoumassi`, and `five-cereal couscous` each gain a direct result.
`couscous` grows from five results to six, including the existing generic, pearl, barley, millet,
and Baddaz identities. `couscous multi-céréales` remains unmatched; no generic multi-cereal alias
was added.

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. No candidate-specific
recipe file or ingredient row was found. One recipe contains general couscous prose, which does not
identify this GI product; no recipe links or quantities were added.

## Verification

Static package validation, normalized reference/package checks, generated-index freshness, exact
active/form/legacy/ledger ownership, picker projections, and the recipe-corpus scan passed. The
proposal's five source IDs are distinct and the source prefix is unique in the catalog archive.
Modified text is UTF-8 without BOM, the French display is stored with escaped Unicode in JSON, local
links resolve, and scoped whitespace checks pass.

No tests were run because this change only adds database JSON data, as specified by `AGENTS.md`.
Section F remains open.
