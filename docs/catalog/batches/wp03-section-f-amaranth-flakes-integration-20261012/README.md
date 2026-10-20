# WP03 Section F amaranth-flakes integration — 2026-10-12

## Decision

Added `amaranth flakes / flocons d'amarante` as the identity-only reference `ingredient-ref-amaranth-flakes` in `GRAIN_AND_CEREAL`. A current Canadian retail listing supports a single-ingredient English amaranth-flake product; a Québec grocery ingredient declaration uses the exact French phrase in a composite cereal, and OQLF supports the base noun. Keep the standalone product distinct from amaranth grain, amaranth flour, greens, puffed amaranth, and composite cereals.

The Naturitas product's pre-cooked claim and directions remain product-specific source evidence; no preparation form, universal processing rule, or numeric behavior was inferred. No aliases, forms, measures, density, mappings, conversions, yields, recipe links, or substitutions were added. The complete manifest-listed recipe corpus contains no matching phrase.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated)
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `docs/catalog/ingredient-catalog-workflow.md`
- `roadmap.md`
- This proposal's integration status and source-register note

## Static validation

After integration, the package has 1,217 references (106 `GRAIN_AND_CEREAL`), 86 forms, 114 recipes / 1,123 ingredient rows, 66 legacy candidates, and 1,520 ledger records / 5,133 source entries / 4,196 distinct source IDs / 8 unit conversions. The generated Kotlin catalog contains 1,217 references.

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed.
- `validate_research_ledger()` through `tools/seed_package/bundled_seed_package.py` — passed.
- Exact normalized-key ownership and manifest-listed recipe scan — passed; zero amaranth-flake phrase hits.
- UTF-8 without BOM and scoped whitespace checks — passed.

No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

See the [source-backed proposal](../../proposals/wp03-section-f-next-grain-gap-sweep-20261012.md). Remaining Section F identity and terminology work stays open.

## Snapshot fingerprints

| Artifact | SHA-256 |
| --- | --- |
| Ingredient references (1,217) | `ddae6e2ca49e677e775946d8e4860d8b34e045a9993feb0f850f88767202d9ac` |
| Research ledger (1,520 records) | `7e5c4d725908208bbd1814c1645fd7ba2f2f8ad95d939ae66a0d8f98af65cca4` |
| Generated Kotlin catalog | `457ffd0ca375a04256b2a406a262cf9ceca6b3dec5d18416216aae57243e78a9` |
| Manifest-listed recipe corpus digest | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
