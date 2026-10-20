# WP03 Section F triticale-flakes identity integration

## Decision

Added identity-only `triticale flakes / flocons de triticale` as
`ingredient-ref-triticale-flakes` in `GRAIN_AND_CEREAL`. Kept it separate from whole triticale grain,
triticale flour or meal, other flakes, and composite cereal mixes. Added no aliases, forms, density,
unit mappings, measurements, recipe links, conversions, yields, or substitutions.

The [source review](../../proposals/wp03-section-f-triticale-flakes-identity-review-20261012.md)
records a standalone Ontario mill listing under the English name, a Canadian bread ingredient
declaration, and matching French ingredient wording on the same product number. Current Québec food
directory products independently attest `flocons de triticale`. OQLF supports the masculine base
noun `triticale`; the product wording itself comes from current food labels. These sources establish
the product name, not a universal flaking process or a transferable quantity.

The new reference is not linked to any recipe. The manifest scan found no triticale phrase in any of
the 114 recipes or 1,123 ingredient rows.

## Live data snapshot

Snapshot after the 2026-10-12 integration batch:

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,224 rows; 391,453 bytes | `cb5bc0962c77e97dcad944c6352ed933002dd6d2ea2c7ef9a578c6064c3f8fcf` |
| Ingredient forms | 86 rows; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy candidates | 66 rows; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,523 records; 5,192 sources; 4,255 distinct source IDs; 5,037,117 bytes | `05223549fbf89b9e452282865ea1c551013d12f5d3a4214fa5d8792c984732fb` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin catalog | 1,224 references; 536,146 bytes | `dad935ecd939cdbea8cc1e53b511ac8ffce5f36b4f74b4d4e29bbb6cc3f0e751` |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file
bytes, and a trailing NUL byte. File hashes cover exact bytes.

## Static verification

- Bundled seed package validation passed.
- Ingredient-reference normalization and generated-catalog freshness checks passed.
- Research-ledger validation passed with 1,523 records and zero errors.
- `triticale` remains owned by `ingredient-ref-triticale-grain`; `triticale flakes` and
  `flocons de triticale` are owned only by the new flakes reference. Other proposed flake spellings
  and the new ID had no prior owner.
- All 114 manifest recipes / 1,123 ingredient rows were scanned; no candidate phrase occurs.
- UTF-8 without BOM and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog entry.
