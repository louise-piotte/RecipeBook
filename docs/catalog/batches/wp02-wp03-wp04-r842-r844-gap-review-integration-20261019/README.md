# WP02/WP03/WP04 R842–R844 integration — 2026-10-19

Integrated three reviewed catalog-plan items. The broader A7, F, and P parent checklists remain open.

## Changes

- **R842 — cracked-rye porridge alternative:** added Janie's Mill's Cracked Wheat option to the existing cracked-rye ledger row for its named hot-breakfast-cereal formula only. The shared one-cup amount stays contextual. No active rule, alias, form, conversion, or bundled recipe link was added; R646's separate scone portion remains unchanged.
- **R843 — Fruity Cheerios:** added identity-only `ingredient-ref-fruity-cheerios` / `Fruity Cheerios / Cheerios fruitées` as a separate `GRAIN_AND_CEREAL` reference and recorded one product-specific manufacturer-label serving, 1 cup (38 g). The French `1 tasse` wording corroborates the same serving, not another observation. The serving does not establish generic cereal cup mass, density, conversion, or substitution. No recipe link or component identity was added.
- **R844 — Atlantic mackerel:** recorded the historical CNF 2015 Food Code 3021 portions, 1 fillet = 115.2 g and 1 food-guide serving = 90.0 g. The separately reported 0% refuse remains context only. No whole-fish mass, yield, or reusable fillet conversion was inferred; CNF 2026 continuity remains unverified.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed; `--check` reports the package is already normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 1,887 generated references.
- Research-ledger schema and integrity checks passed: 2,295 records, 10,812 source entries, 9,094 unique source IDs, 7,727 unique source URLs, 875 measurement observations, and 366 substitution findings. Every source ID maps to one URL; observation and finding IDs are unique.
- The active package has 1,887 references and 201 forms; its manifest still lists 114 recipes and 1,123 ingredient rows. The recipe scan found no new candidate demand.
- Static picker projection returns the new reference alone for `Fruity Cheerios` and accent-folded `Cheerios fruitées`; `Cheerios` remains a ten-result family query. Existing substitutions and recipes are unchanged.
- UTF-8/no-BOM, scoped whitespace, local-link, and plan-anchor checks passed.
- A broader cross-record source-membership scan surfaced an unrelated existing mismatch on `ingredient-ref-light-corn-syrup`: finding `WP02-C-LCS-F-CORN-SYRUP-BRAND-SCOPE` cites `WP02-C-SYR-20261009-S06` and `WP02-C-SYR-20261009-S07`, which are not attached to that record. It does not affect the new R842–R844 rows and was left unchanged.
- No software tests, app build, emulator run, or deployment were performed because the application data changes add database JSON under `AGENTS.md`.

## Review records

- [R842 proposal](../../proposals/wp02-section-a7-next-gap-review-r842-20261019.md)
- [R843 proposal](../../proposals/wp03-section-f-next-gap-review-r843-20261019.md)
- [R844 proposal](../../proposals/wp04-section-p-next-gap-review-r844-20261019.md)
- [Catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
