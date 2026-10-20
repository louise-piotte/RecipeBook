# WP04 Section P red-hake integration — 2026-10-12

## Decision

Added `red hake / merluche-écureuil` as `ingredient-ref-red-hake`, category `PROTEIN`, scoped to *Urophycis chuss*. CFIA and DFO pair the English and French names with this species. Generic `hake / merluche`, generic pollock, Atlantic pollock, and bare `goberge` remain unallocated; the Québec commercial term `merluche` also covers more than one species.

No aliases, forms, measurements, unit mappings, conversions, yields, recipe links, or substitutions were added. The complete bundled recipe corpus had no red-hake or Atlantic-pollock phrase hits. Existing Alaska pollock and white hake references remain unchanged.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated)
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `docs/catalog/ingredient-catalog-workflow.md`
- `roadmap.md`
- This proposal’s status and source-register notes

## Static validation

The combined WP03/WP04 package snapshot after integration has 1,216 references, 86 forms, 114 recipes / 1,123 ingredient rows, 66 legacy candidates, and 1,519 ledger records / 5,130 source entries / 4,193 distinct source IDs / 8 unit conversions. The generated Kotlin catalog contains 1,216 references.

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed.
- `validate_research_ledger()` through `tools/seed_package/bundled_seed_package.py` — passed.
- Exact normalized-key ownership and manifest-listed recipe scan — passed; no red-hake or Atlantic-pollock phrase hits.
- UTF-8 without BOM and scoped `git diff --check` — passed.

No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

See the [source-backed proposal](../../proposals/wp04-section-p-next-finfish-gap-sweep-20261012.md). Section P and the broader species/product coverage remain open.


## Snapshot fingerprints

| Artifact | SHA-256 |
| --- | --- |
| Ingredient references (1,216) | `aeab72e4fc30c6938fb8beefa4b68820962b3b69cd1d60fa0ec565c20b79d982` |
| Research ledger (1,519 records) | `016629dc79b4f70bf566639807af58af4e352866ddd9a893452f191612f9337d` |
| Generated Kotlin catalog | `0a5a3e93dadd38ea212d248135da462d4304bcf06d244741f02ba3f21cb47787` |
| Manifest-listed recipe corpus digest | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
