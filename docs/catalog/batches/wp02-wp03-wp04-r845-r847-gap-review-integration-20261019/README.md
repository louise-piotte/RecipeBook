# WP02/WP03/WP04 R845–R847 integration — 2026-10-19

Integrated three reviewed catalog-plan items. The broader A7, F, and P parent checklists remain open.

## Changes

- **R845 — wheat-starch replacement lead:** recorded Lantmännen Biorefineries’ native wheat-starch statement on the existing wheat-starch ledger row as a blocked, product-specific lead. The source does not identify the flour, amount, ratio, formula, or method. No replacement, alias, or active substitution rule was added.
- **R846 — Very Berry Cheerios:** added the identity-only ingredient-ref-very-berry-cheerios reference, Very Berry Cheerios / Cheerios Petits fruits exquis, as a separate GRAIN_AND_CEREAL entry and recorded one product-specific manufacturer-label serving, 1 cup (36 g). The direct English and French product pages support the identity and serving. Existing product-list source entries were not changed. No generic cereal measure, form, component link, or recipe link was added.
- **R847 — Alaska pollock:** recorded the historical CNF 2015 Food Code 3039 portions, 1 fillet = 84.9 g and 1 food-guide serving = 90.0 g. The separate 66% refuse remains context only. No whole-fish mass, yield, or reusable fillet conversion was inferred; the observations were not transferred to the frozen fillet form, and CNF 2026 continuity remains unverified.

## Validation

- python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only passed; --check reports the package is normalized.
- python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check passed with 1,888 generated references.
- Research-ledger JSON Schema validation passed: 2,296 records, 10,818 source entries, 9,098 unique source IDs, 7,731 unique source URLs, 878 measurement observations, and 367 substitution findings. Each source ID maps to one URL; observation and finding IDs are unique.
- The active package has 1,888 references and 201 forms; its manifest lists 114 recipes and 1,123 ingredient rows. Recipe scans found no candidate demand for the three reviewed items.
- Static picker projection returns Very Berry Cheerios alone for the English and French product titles; Cheerios remains an eleven-result family query and petits fruits returns two results. Wheat-starch searches remain unchanged, and Alaska-pollock exact English/French queries remain species-qualified.
- New R845–R847 source, observation, and finding references resolve on their owning ledger rows. One unrelated existing finding on ingredient-ref-light-corn-syrup still cites WP02-C-SYR-20261009-S06 and WP02-C-SYR-20261009-S07, which are not attached to that row; it was left unchanged.
- UTF-8/no-BOM, changed-file whitespace, local-link, and plan-anchor checks passed.
- No software tests, app build, emulator run, or deployment were performed because the active application data change adds database JSON under AGENTS.md.

## Review records

- [R845 proposal](../../proposals/wp02-section-a7-wheat-starch-substitution-review-r845-20261019.md)
- [R846 proposal](../../proposals/wp03-section-f-next-gap-review-r846-20261019.md)
- [R847 proposal](../../proposals/wp04-section-p-next-gap-review-r847-20261019.md)
- [Catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
