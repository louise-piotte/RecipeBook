# WP03 Section F Khorasan-flakes identity integration

## Decision

Added identity-only `Khorasan flakes / flocons de khorasan` as
`ingredient-ref-khorasan-flakes` in `GRAIN_AND_CEREAL`. Kept the entry separate from Khorasan flour,
other species-specific grain flakes, and composite cereal mixes. Added no aliases, forms, measurements,
density, unit mappings, conversions, yields, recipe links, or substitutions. `Kamut` and `blé Kamut`
remain out of generic aliases because OQLF marks those names as trademarks.

The [source review](../../proposals/wp03-section-f-khorasan-flakes-identity-review-20261012.md)
records the manufacturer's current English and French product catalogs, its retail product page, and
the Québec Metro listing for the same 500 g product. The manufacturer recipe confirms French food use
but provides no weight for its cup measure. The composite multigrain-flakes listing contains Khorasan
as one of several grains and remains separate from the single-grain product.

The full 114-recipe corpus has no Khorasan-flakes phrase or reference link. No recipe link or numeric
behavior was added.

## Live data snapshot

Snapshot after the 2026-10-12 Khorasan-flakes integration. File hashes cover exact bytes. The recipe
fingerprint hashes each manifest-ordered relative path, a NUL byte, exact recipe-file bytes, and a
trailing NUL byte.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,225 rows; 391,768 bytes | `c6a949abe54b0598fa9db207aad047a51ecb2fdfac72d689bf4454c70bae141e` |
| Ingredient forms | 86 rows; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy candidates | 66 rows; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,524 records; 5,203 sources; 4,266 distinct source IDs; 5,045,553 bytes | `b21803cad548fec3e0ed94ceeced3eea072c2e96b393393dfe3c5d29e81e7433` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin catalog | 1,225 references; 536,587 bytes | `d4f678974c5ac8939108afbd2f54f72642bdacd049f417f94afca5215c89eabc` |

## Static verification

- Bundled seed package validation passed.
- Ingredient-reference normalization and generated-catalog freshness passed.
- Research-ledger validation passed with 1,524 records and zero errors.
- Exact normalized names `Khorasan flakes` and `flocons de khorasan` are owned only by the new
  reference; `Kamut flakes` remains unallocated.
- All 114 manifest recipes / 1,123 ingredient rows were scanned; no candidate phrase or target ID
  occurs.
- UTF-8 without BOM and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog entry.
