# WP02/WP03/WP04 R839–R841 integration — 2026-10-19

Integrated three reviewed catalog-plan items. The broader A7, F, and P parent checklists remain open.

## Changes

- **R839 — white whole-wheat flour:** added King Arthur Baking’s recommendation to replace up to 50% of all-purpose flour with its white whole-wheat flour as a source-scoped research-ledger finding. The source leaves the mass/volume basis unstated, so the finding does not supply an equal-weight or equal-volume ratio. No active rule, alias, form, measurement, or recipe link was added; generic whole-wheat findings remain unchanged.
- **R840 — couscous forms:** added `couscous, dry / couscous, sec` and `couscous, cooked / couscous, cuit` under the existing couscous identity. Linked the two CNF 2015 Food Code 4420 dry portions and three Food Code 4490 cooked portions to their matching forms. This supersedes R822’s no-form conclusion only for the dry/cooked form question. The 34.5 g dry input to the stated 125 mL prepared-product amount remains ledger-only and has no form link, recipe method, density, reusable conversion, or generalized cooking yield.
- **R841 — Atlantic cod:** recorded CNF 2015 Food Code 3194’s one-fillet portion (231.0 g) and food-guide serving (90.0 g) on the existing Atlantic-cod ledger row. The separate 66% refuse remains context only; no whole-fish mass, yield, or reusable fillet conversion was inferred. CNF 2026 row continuity was not verified. The active catalog and recipes are unchanged.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py` completed with zero changed package parts.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed, including the bundled data and research-ledger schema checks.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed; all 1,886 generated ingredient references are current.
- Static integrity checks passed: 2,294 ledger records, 10,805 source entries, 9,089 unique source IDs, 7,723 unique source URLs, 872 unique measurement observations, and 365 unique substitution findings. Every source ID maps to one URL. The active package contains 1,886 references and 201 forms; the bundle contains 114 recipes and 1,123 ingredient rows.
- Couscous’s five portion observations point to the matching dry/cooked forms; the 34.5 g amount-to-make observation remains unassigned. No app logic or generated reference index changed.
- No software tests, app build, emulator run, or deployment were performed. The shared changes are database JSON and catalog documentation, covered by the data-only exception in `AGENTS.md`.

## Review records

- [R839 proposal](../../proposals/wp02-section-a7-next-gap-review-r839-20261019.md)
- [R840 proposal](../../proposals/wp03-section-f-next-gap-review-r840-20261019.md)
- [R841 proposal](../../proposals/wp04-section-p-next-gap-review-r841-20261019.md)
- [Catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
