# WP02 whole-rye alias and dark-rye boundary integration — 2026-10-12

## Decision

Added French alias `farine de seigle entière` to the existing `ingredient-ref-whole-rye-flour` identity. Moulin Lacoste’s current Québec product page uses that exact title for a rye flour made from Québec rye. The name is a word-order variant of the existing display `farine entière de seigle`; it does not generalize the source product’s T125 ash grade or stone-milling process.

Kept unqualified dark rye flour unresolved. Current mills and sellers use `dark` for products with different milling scopes, and the French product names do not establish a shared grade definition. No dark-rye identity or alias was added. Light rye, medium rye, whole rye, generic rye flour, and rye meal remain distinct.

## Data changes

- Updated `ingredient-references.v1.json`: one French alias and the reference `updatedAt` date.
- Updated the existing whole-rye evidence record in `research-ledger.v1.json` with the current Québec manufacturer source and an accepted alias decision. The source ID is `WP02-AB-DARK-RYE-GAP-20261012-S01`.
- Regenerated `BundledIngredientCatalog.kt` so the same alias is searchable in the app.
- No recipe rows, forms, measurements, densities, unit mappings, package yields, conversions, or substitutions changed.

The full boundary review, including evidence for holding generic dark rye, is in [the proposal](../../proposals/wp02-ab-next-flour-starch-gap-sweep-20261012.md).

## Checks

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed at 1,214 references.
- Exact-key ownership check: the accent-folded key `farine de seigle entiere` has exactly one owner, `ingredient-ref-whole-rye-flour`.
- Recipe scan: no exact candidate phrase or rye/seigle term occurs in the 114 bundled recipes / 1,123 ingredient rows.
- UTF-8 without BOM and scoped `git diff --check` — passed.
- No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Package snapshot after integration

Counts and hashes describe the shared checkout at this integration checkpoint. The recipe digest is SHA-256 over manifest-listed relative paths, a NUL byte, exact recipe file bytes, and a trailing NUL byte for each file.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,214 | `a8326df9201bae959e611868b29383400d17f6c3ff4ccce961e70751b0962c82` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | 1,517 records; 5,120 source entries; 4,183 distinct source IDs; 8 unit conversions | `3e227f82c0b4b5fe3a59a3d966f51bf1ecfac4a8ade128a8849e651287b3ce03` |
| Legacy import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin catalog | 1,214 references | `1cd5f43080f8d2ba471229b0d2f66c6845a961411c54dba39282dc48e1143599` |
