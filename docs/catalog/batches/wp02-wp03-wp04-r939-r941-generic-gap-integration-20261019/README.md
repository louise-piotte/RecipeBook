# R939–R941 generic ingredient gap integration

**Date:** 2026-10-19
**Status:** Integrated. Root reviewed the three proposal-only investigations, accepted each generic identity boundary, and applied the shared seed-data updates.

## Catalog changes

- **R939 — rye germ / germe de seigle:** added an identity-only `GRAIN_AND_CEREAL` reference. Reused the existing Barnes cereal-germ source ID with rye-specific, study-scoped support and added the exact OQLF bilingual term source. The study’s extraction and oxidation observations remain sample-specific; no retail prevalence, handling advice, or reusable measure was inferred.
- **R940 — broccoli leaves / feuilles de brocoli:** added an identity-only `VEGETABLE_AND_AROMATIC` reference for the leaves of ordinary cultivated broccoli. Kept Chinese broccoli, baby broccoli, rapini, florets, stalks, sprouts, and other Brassica leaves separate. The kale/collard comparison remains contextual guidance, not a substitution.
- **R941 — fish trimmings / parures de poisson:** added an identity-only `PROTEIN` reference for variable-composition fish cuttings used in fumet and stock. Added only singular inflection aliases. Kept heads, bones, frames, prepared stock, and named species separate. Ricardo’s 1 kg composite input and 1 L yield, and Académie Culinaire’s 625 g composite input and 1 L yield, remain scoped to those recipes; no generic measurement or yield was added. The existing Zeste source remains attached to the fish-frames record and was not copied or broadened.

The DFO PDF’s opening publication/copyright information identifies 1984, while the DFO catalogue title includes 1995. The ledger and R941 proposal record that distinction; the fumet definition is on printed page 33 (PDF page 36).

No existing branded reference was deleted, edited, or merged. No forms, recipe links, densities, unit mappings, conversions, reusable measures, yields, or active substitutions were added. The package remains at 205 forms; counts are now 1,961 ingredient references and 2,366 ledger records.

## Queue scope review

The plan’s open-task scan found no active assignment whose only deliverable is a brand, product-line, flavour-family, SKU, or retailer-variant roster. The two Section F cereal-roster clauses and the named Anson Mills wheat-meal lead already have explicit out-of-scope dispositions because commercial-product counts do not add ingredient diversity. Their generic cereal and wheat-meal parents remain open. No other ingredient-type-specific commercial roster task was found.

Manufacturer, producer, recipe, and research sources remain usable when they support a generic ingredient claim. Measurements and findings tied to a named product, source recipe, or study sample remain scoped to that source. Existing branded rows and their evidence remain unchanged.

## Static checks

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Research-ledger schema and source-ID checks, exact identity ownership, UTF-8/no-BOM, local links, and scoped whitespace checks.

No software tests were run. The app data change only adds database JSON, as allowed by `AGENTS.md`. The generated ingredient-picker index is maintained from the seed reference JSON.

## Research proposals

- [R939 rye-germ review](../../proposals/wp02-plan-generic-gap-r939-20261019.md)
- [R940 broccoli-leaves review](../../proposals/wp03-plan-generic-gap-r940-20261019.md)
- [R941 fish-trimmings review](../../proposals/wp04-plan-generic-gap-r941-20261019.md)
- [Cross-category ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)
