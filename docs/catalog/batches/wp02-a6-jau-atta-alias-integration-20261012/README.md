# WP02 A6: jau atta and jau alias integration

## Decision

Added two narrow English aliases to existing identities:

- `jau atta` on `ingredient-ref-barley-flour` (`barley flour / farine d'orge`)
- `jau` on `ingredient-ref-pearl-barley` (`pearl barley / orge perlé`)

FSSAI names `Pearl Barley (Jau)`, and Canada-facing product listings pair `Barley Flour` with `Jau Atta`. The existing Québec French displays remain unchanged, with no French aliases. Do not add `jau ka atta`, `jau flour`, or `farine de jau`, and do not map `jau atta` to whole barley flour: the sources do not establish a universal milling class for products sold under that name.

## Evidence and numeric behavior

The barley-flour ledger now preserves USDA's historical `1 cup, unsifted = 0.225 lb` portion and one study's experimental `0.44 g/mL` bulk-density result as source-specific observations. Neither is a reusable default; `defaultDensity` remains null and unit mappings remain empty. Bread-study barley replacement ratios are recorded only as formula-specific evidence. General wheat-for-barley replacement remains blocked pending evidence; no active substitution rule, measure, conversion, yield, form, or recipe link was added.

The full 114-file / 1,123-row recipe corpus has no matching recipe or ingredient row. The exact source register, query audit, and evidence limitations are in [the accepted proposal](../../proposals/wp02-a6-jau-atta-barley-flour-alias-review-20261012-round11.md). The broader A6 review remains open.

## Validation

After integration, the following static checks passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- Ledger, ownership, recipe-corpus, encoding, and whitespace checks

No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data.

## Live snapshot after integration

Counts and file hashes are for exact bytes; the corpus fingerprint hashes each manifest-relative path, NUL, recipe bytes, and trailing NUL in manifest order.

| Artifact | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,324; 139 `GRAIN_AND_CEREAL` | `6b4a1e34d8b7e8b75fdaf48c1bbf27c6ca1ce6562a75dc958a00d1b9e5014a7d` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,632 records; 6,017 source entries; 5,033 distinct source IDs; 8 unit conversions | `b959f36a409e902795dfc8f5322cfbce667e7e7c0030eecef6c6c49ca3298d0d` |
| Generated `BundledIngredientCatalog.kt` | 1,324 references | `d2f206e8499e985c8195a76ce1d38cd39de4f9781f283f5d5fc05f485f4472ba` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
