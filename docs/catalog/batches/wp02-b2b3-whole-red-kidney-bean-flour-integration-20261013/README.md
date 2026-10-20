# WP02 B2/B3 whole red kidney bean flour integration

Reviewed and integrated on 2026-10-13 from
[`wp02-b2b3-whole-red-kidney-bean-flour-review-20261013.md`](../../proposals/wp02-b2b3-whole-red-kidney-bean-flour-review-20261013.md).

## Decision

Add identity-only `whole red kidney bean flour / farine de haricots rouges entiers` as
`ingredient-ref-red-kidney-bean-flour` in `FLOUR_AND_STARCH`. Celiac Canada's July 2026 finder lists
AGT's exact product title, while warning that listings are not real-time and may include
manufacturer-only ingredients. Current commercial availability, product specifications, and exact
French package wording remain unresolved. The French display is a transparent provisional compound
from OQLF's base-bean term.

Keep the existing whole-bean row and its aliases/forms unchanged. Keep both alias arrays empty on the
flour row. Add no forms, active measures, density default, unit mappings, recipe links, yields, or
substitutions. Preserve Siddiq et al.'s 0.556 g/mL result only as a study-specific bulk-density
observation in the research ledger. The noodle/cupcake research does not support a reusable flour
replacement ratio or a process/form for the listed product. The bundle has no red-kidney-flour
demand.

The research record reuses the existing Celiac Canada, OQLF, Canadian Nutrient File, and Siddiq
source IDs. It adds sources for the historical certificate, current AGT list, Québec whole-bean
recipe, noodle/cupcake/extrusion studies, and Health Canada lectin guidance. The ledger explicitly
keeps the provisional French term, product status, sample density, and study-specific treatments
bounded.

## Files

- Active reference: `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- Research evidence: `docs/catalog/research-ledger.v1.json`
- Generated import index: `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`
- Plan and roadmap: `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `roadmap.md`
- Review proposal: [`proposal`](../../proposals/wp02-b2b3-whole-red-kidney-bean-flour-review-20261013.md)

## Verification

Static seed-package and ledger validation, generated-index freshness, exact-key/picker ownership,
recipe-corpus, source-ID/URL, UTF-8/no-BOM, local-link, and whitespace checks passed. No tests or
emulator checks were run because the active change only adds database JSON data, per `AGENTS.md`.
