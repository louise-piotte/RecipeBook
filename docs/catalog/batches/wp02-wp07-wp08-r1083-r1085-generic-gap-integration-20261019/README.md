# R1083–R1085 generic ingredient review integration

**Date:** 2026-10-19

**Scope:** Finish only the three already identified reviews. No new ingredient discovery or candidate search was started.

## Integrated decisions

- **R1083 — barley meal:** Added the 1905 *Home Cook Book* griddle-cake and Manx bonnag corpus sources to the existing `candidate-barley-meal` ledger record. Generic historical culinary use is supported, but the recipes do not settle a transferable milling boundary against whole barley flour and barley grits or establish a distinct Québec French display. The candidate remains `needs_clarification`; no active reference, alias, form, measure, recipe link, or substitution was added. Existing product-scoped evidence remains attached to its named products. See the [R1083 review](../../proposals/wp02-a7-barley-meal-add-vs-hold-review-r1083-20261019.md).
- **R1084 — vegetable oil:** Added two historical USDA CSFII 1986 `published_portion` observations to the existing generic `ingredient-ref-vegetable-oil`: 1 source cup = 218 g and 1 source tablespoon = 13.6 g for Food Code 821-0100, `Vegetable oil, NFS`. The row and historical measurement method remain source-scoped. Density remains null; no mappings, form, or conversion were added. The uninspected current FNDDS row contributes no value or continuity claim. See the [R1084 review](../../proposals/wp07-next-generic-measurement-review-r1084-20261019.md) and [USDA codebook](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/8586/csfii85_4days_codebook.pdf).
- **R1085 — breakfast sausage to mushroom:** Added one qualitative finding to the existing generic `ingredient-ref-breakfast-sausage` ledger row. It applies only to Preppy Kitchen’s current named 12-serving casserole formula. The source gives no mushroom amount or preparation adjustment. RecipeBook `027#1` is not linked because its saved formula differs materially despite sharing the source URL. No active substitution rule, line link, or recipe edit was added. See the [R1085 review](../../proposals/wp08-next-generic-substitution-review-r1085-20261019.md).

## Scope and preservation

This batch contains no brand, product-line, flavour, SKU, retailer-variant, or commercial-roster research. Commercial-product counts do not add ingredient diversity. Preserve existing branded entries and their source-specific claims or measurements; do not generalize product data without a separate transferability review. No existing entries were deleted or merged.

The user asked to stop finding new ingredients for now. This batch closes the already selected work only; generic catalog coverage remains open for a later direction.

## Validation

- Research ledger passed its Draft 2020-12 JSON Schema.
- New source ownership, observation/finding links, and record/observation/finding ID uniqueness checks passed.
- Ledger totals: **2,477 records, 11,565 source entries, 9,718 distinct source IDs, 933 measurement observations, and 434 substitution findings**. The bundled catalog remains at **2,072 references and 205 forms**; 114 recipes / 1,123 ingredient rows are unchanged.
- UTF-8/no-BOM, local documentation links, and scoped whitespace checks passed.
- No software tests, build, emulator, or deployment were run. `AGENTS.md` says no testing is needed when a change only adds data to the database JSON files; this batch adds only research data to the existing ledger JSON and documentation.
