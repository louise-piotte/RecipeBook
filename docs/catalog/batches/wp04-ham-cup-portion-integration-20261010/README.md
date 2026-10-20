# WP04 Source-Specific Diced-Ham Portion

## Accepted observation

USDA ARS Standard Reference 28, NDB 10011, reports 135 g for 1 cup diced of fresh whole pork leg ham, separable lean only, cooked and roasted. The official pork-products report identifies this as a source-specific common measure and also lists 85 g per 3 oz. It provides no cup packing method or variability interval.

The research ledger records the 135 g portion under ingredient-ref-ham, with the exact USDA food description, state, method, basis, and source ID preserved. The existing CFIA ham-boundary source remains attached; the USDA record is a new source entry.

## Recipe boundary

Recipe 089#1 remains “1 cup diced ham,” linked to ingredient-ref-ham. Its publisher source was unavailable, and the archived import notes a local normalization from “1/2 ham” to the saved line. The record does not establish that Recipe 089 uses USDA's fresh, lean-only, cooked-and-roasted pork leg item. The 135 g observation is therefore not applied to the recipe and does not reconstruct the old amount.

No recipe text, quantity, link, seed reference, density, unit mapping, form, package yield, conversion, or substitution changed. The ham measurement research state now reflects the accepted source-specific observation; the substitution state remains not_yet_researched.

## Sources

- USDA ARS, [Standard Reference Release 28, Pork Products report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg10.pdf#page=452), PDF p. 452, NDB 10011.
- CFIA, [Canadian Standards of Identity: Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7), previously recorded source for the generic ham boundary.
- Full source comparison and recipe evidence: [proposal review](../../proposals/wp04-ham-cup-measurement-gap-review-20261010.md).

## Validation

- Research-ledger validation passed: 1,107 records, 2,652 source entries, 2,076 distinct source IDs, 166 measurement observations, zero errors.
- All 35 Python seed-package tests passed.
- Bundled seed-package normalization check passed with no changes; `git diff --check` passed.
- No Android build, emulator, or deployment is needed because this is research-ledger sidecar evidence; the app package and runtime are unchanged.
