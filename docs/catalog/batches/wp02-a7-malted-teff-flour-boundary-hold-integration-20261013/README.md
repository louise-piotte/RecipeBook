# WP02 A7 — malted teff flour boundary hold (round 37)

**Date:** 2026-10-13  
**Decision:** Keep experimental malted teff flour outside the active catalog and research ledger.

The exact English phrase appears as an ingredient in an experimental malt-porridge study. Separate cereal research documents malting teff and changes to flour properties. Neither establishes a current Canadian or Québec standalone flour product, a consistent commercial specification, or a Québec French product name. OQLF's GDT entry covers the crop and spells it `tef`; a Québec-facing plain-flour listing uses `farine de teff`. Neither source names a malted flour, so do not invent `farine de teff maltée` as an active display.

The candidate remains distinct from plain teff flour, whole teff grain, whole-grain brewing malt, generic malt flour, and other cereal-specific malted or toasted flours. The live picker currently returns the plain teff-flour reference for `teff flour` and `farine de teff`; `teff` returns the teff-flour and teff-grain references. A hypothetical display `malted teff flour / farine de teff maltée` would add a result to those three queries. The 114 manifest-listed recipe files (1,123 ingredient rows) contain no matching teff or candidate terms.

The study's mass is specific to its malt-porridge formula. Plain whole-grain teff flour's package serving and replacement suggestion do not transfer to the malted experimental blend. No reusable measure, density, mapping, form conversion, yield, recipe link, or substitution is supported.

## Files updated

- `docs/catalog/proposals/wp02-a7-malted-teff-flour-boundary-review-20261013-round37.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

The A7 parent remains open for other meals, malted/toasted flour identities, and gluten-flour equivalence. No catalog or ledger entry was added.

## Verification

Static package validation, generated-index freshness, exact active/form/legacy/ledger ownership and picker projections, the bundled-recipe scan, proposal source-prefix uniqueness, UTF-8/no-BOM, local links, and scoped whitespace checks passed. No tests were run because this integration changed documentation only and no database JSON data.
