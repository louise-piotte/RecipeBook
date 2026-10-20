# Brown rice flakes integration — 2026-10-12

## Decision

Added identity-only `brown rice flakes / flocons de riz brun` as
`ingredient-ref-brown-rice-flakes` in `GRAIN_AND_CEREAL`, with no aliases. The identity records the
named whole-grain flake product. Canadian manufacturer and retailer evidence supports the English
name and Canadian French label wording; `flocons de riz brun` is documented as product-language
evidence, not an OQLF ruling.

Keep intact brown rice, brown-rice flour and syrup, generic flattened rice/poha, red rice flakes, and
cream of rice distinct. The display preserves the product boundary in the current picker, where
queries such as `brown rice` and `flocons de riz` can return multiple qualified rice products. The
full 114-recipe, 1,123-row scan found no candidate or neighboring rice-flake demand.

No aliases, forms, default measures, density, unit mappings, recipe links, conversions, yields, or
substitutions were added. Package sizes and cooking directions remain supplier-specific and were
not generalized. The source evidence and exact owner/picker audit are in
[`wp03-section-f-brown-rice-flakes-identity-review-20261012.md`](../../proposals/wp03-section-f-brown-rice-flakes-identity-review-20261012.md).

## Package snapshot after integration

Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a
NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,261 references | 403,707 | `5a464c9946adab22bc711abedc370635dcb57e544c26d04e0619cb786a0d4cc4` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,570 records; 5,507 sources; 4,545 distinct source IDs | 5,383,255 | `aae4715ecca72cafae0234e88c4f479cdc9683e3eb4944c48c94e0036109f530` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,261 references | 552,681 | `7cd243fa092409fbce84dbee5c505e4cd7bec6e91060ef22ce1e06ee68ef0409` |

## Static verification

- Reference normalization, generated-index freshness, seed-package validation, research-ledger
  schema validation, and exact phrase ownership passed.
- The exact normalized candidate keys are owned only by the new reference; generic rice-flake/poha
  terms remain on existing identities. The recipe corpus and recipe links are unchanged.
- UTF-8 without BOM, explicit Unicode escapes in the database JSON, scoped whitespace, and
  `git diff --check` validation passed.
- No app, unit, instrumentation, emulator, or deployment tests were run because the change only adds
  database JSON data, as allowed by `AGENTS.md`.
