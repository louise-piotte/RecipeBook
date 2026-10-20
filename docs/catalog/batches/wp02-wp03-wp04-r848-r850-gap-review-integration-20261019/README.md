# WP02/WP03/WP04 R848–R850 integration — 2026-10-19

Integrated three reviewed checklist items. The broader Section A7, Section F, and Section P parents remain open.

## Changes

- **R848 — durum-flour substitution lead:** added King Arthur Baking’s recipe-specific “finely ground semolina” note as a blocked finding on the existing durum-flour ledger row. The recipe does not identify the semolina grade or the basis for “up to half.” Its 7 cups (868 g) remains formula context only. No replacement identity, measure, bundled recipe link, or active substitution rule was added.
- **R849 — Chocolate Cheerios:** added identity-only Chocolate Cheerios / Chocolat Cheerios as a separate `GRAIN_AND_CEREAL` reference and one product-specific manufacturer-label observation (1 cup / 38 g). No generic cereal measure, form, component link, recipe link, or substitution was added.
- **R850 — Channel Catfish:** recorded four historical CNF 2015 portions on the existing Channel Catfish ledger row. Wild Food Code 2993 and farmed Food Code 3180 each list 1 fillet = 159.0 g and 1 food-guide serving = 90.0 g. The wild row’s 65% refuse remains context; farmed refuse is unreported. No yield, generic fillet weight, or reusable conversion was inferred. CNF 2026 continuity remains unchecked.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed; `--check` reports the package is normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with 1,889 generated references.
- Research-ledger JSON Schema validation passed: 2,297 records, 10,829 source entries, 9,103 unique source IDs, 7,736 unique source URLs, 883 measurement observations, and 368 substitution findings. Every source ID maps to one URL; observation and finding IDs are unique.
- The package has 1,889 references and 201 forms. Its manifest lists 114 recipes with 1,123 ingredient-array rows, including 1,097 rows with an `ingredientRefId`.
- Static phrase-first picker projection returns the new Chocolate Cheerios row alone for both English and French product titles. `Cheerios` returns 12 identities. Channel Catfish remains the sole result for `channel catfish`, `barbue de rivière`, and `barbue`; R848 changed no picker terms.
- Recipe scans found no candidate text or reference link in the 114 bundled recipes. New R848/R849/R850 source references resolve on their owning ledger rows; the four Channel Catfish observations and blocked durum-flour finding cite attached sources.
- UTF-8/no-BOM, plan anchors, local Markdown links, and scoped whitespace checks passed. R848’s external recipe and linked product page were accessible; the EUR-Lex direct-open cache miss affects only its corroborating grade context. CNF 2026 row presence and values were not inspected.
- No software tests, app build, emulator run, or deployment were performed. These changes add database JSON data; the generated catalog index was refreshed and checked.

## Review records

- [R848 proposal](../../proposals/wp02-a7-next-gap-review-r848-20261019.md)
- [R849 proposal](../../proposals/wp03-section-f-next-gap-review-r849-20261019.md)
- [R850 proposal](../../proposals/wp04-section-p-next-gap-review-r850-20261019.md)
- [Catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)
