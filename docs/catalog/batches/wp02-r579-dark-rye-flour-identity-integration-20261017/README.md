# WP02 Section A4 R579 — dark rye flour

Date: 2026-10-17

## Integrated data

Added `ingredient-ref-dark-rye-flour` as identity-only **dark rye flour / farine de seigle foncée** in `FLOUR_AND_STARCH`, with no aliases, forms, density, unit mappings, or active measure. TERMIUM supplies the bilingual market-grade wording, and Mayrand currently lists an R.Fortin product under the exact French title. Suppliers vary in how dark rye is milled; the new identity is not a universal extraction specification and is not an alias for whole rye flour.

Recorded Save-On's published **1/4 cup (30 g)** serving on the new ledger row as one limited product-label observation. The Save-On title is `Rogers Rye Flour`, while Rogers names a discontinued 2.5 kg retail bag `Dark Rye Flour`; the connection is based on maker and package size, with no product-number match verified. No physical package was inspected, and the filling or leveling method is unstated. Do not generalize this observation or assign it to the rye-bran component.

Recorded Rogers's November 2025 20–40% colour/flavour suggestion and separate 25–50% lighter-loaf suggestion as product-specific evidence in a no-general-replacement finding. Neither is an active substitution rule. The bundle has no matching recipe demand.

The active package now has **1,806 references** and **154 forms**. The research ledger has **2,176 records**, **10,097 source entries**, **8,520 distinct source IDs**, and **7,180 distinct URLs**. The wider WP02 A4 rye-grade parent remains open.

## Verification

- Bundled seed package normalization and validation passed; the generated Kotlin ingredient index is current at 1,806 references.
- Research-ledger schema and source-ownership validation passed; the new source IDs remain distinct from the reused Mayrand, Save-On, and Ardent Mills source IDs.
- The 114-recipe / 1,123-row bundle has no dark-rye mentions or direct links.
- UTF-8/no-BOM, escaped seed accents, local links, and scoped whitespace checks passed.
- No app tests, build, emulator run, or deployment were run, in line with the JSON database-data exception in `AGENTS.md`.

See the [R579 proposal](../../proposals/wp02-next-gap-review-r579-20261017.md), the [open WP02 Section A4 rye-grade checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L1658), and the existing [medium-rye integration](../../batches/wp02-medium-rye-flour-integration-20261011/README.md).
