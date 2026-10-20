# WP02 A6 nachni / finger-millet-flour alias integration

## Decision

Added `nachni flour` as one English alias on the existing verified
`ingredient-ref-finger-millet-flour`. Retained the canonical display
`finger millet flour / farine de ragi` and its existing `ragi flour` alias. Bare `nachni`,
`nachni atta`, and `farine de nachni` remain outside the row. No new identity, French alias, form,
recipe link, measurement, conversion, yield, substitution, or other numeric behavior was added.

The [source review](../../proposals/wp02-a6-nachni-finger-millet-flour-alias-review-20261012.md)
records FSSAI's ingredient wording `Ragi flour (finger millet flour or nachni)`, Canadian flour
product headings that group Ragi, Nachni, and Finger Millet, and FSSAI's Marathi source-grain name.
The Canadian French listing supports the retained display `farine de ragi`; it was out of stock when
checked and was used only for terminology. The retailer title groups the terms but does not print the
contiguous phrase `nachni flour`; the alias follows the combined naming evidence.

The 114 manifest-listed recipes contain no matching phrase or reference link. The alias was not
linked to a recipe and has no numeric behavior.

## Live data snapshot

Snapshot immediately after this alias integration, before the subsequent Khorasan-flakes identity
integration. File SHA-256 values cover exact bytes. The recipe fingerprint hashes each
manifest-ordered relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,224 rows; 391,475 bytes | `de4ca013b14d4873322532e0445d4efed3b9b8cecf6e4f25d4b88fc55732784c` |
| Ingredient forms | 86 rows; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy candidates | 66 rows; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,523 records; 5,196 sources; 4,259 distinct source IDs; 5,040,342 bytes | `c8733891c4c4ebae9a4fa0564096fa195bc75ace88a5237588dd24a5f9a6cf68` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin catalog | 1,224 references; 536,162 bytes | `39a7390a7ced70b512c0c5ca0e8722dc1bbe5c7568ca2af307562b9d8ca8f39f` |

## Static verification

- Bundled seed package validation passed.
- Ingredient-reference normalization and generated-catalog freshness passed.
- Research-ledger validation passed with 1,523 records and zero errors.
- The normalized phrase `nachni flour` is owned only by `ingredient-ref-finger-millet-flour`; bare
  `nachni`, `nachni atta`, and `farine de nachni` remain unallocated.
- All 114 manifest recipes / 1,123 ingredient rows were scanned; no candidate phrase or target ID
  occurs, and no recipe links to the flour reference.
- UTF-8 without BOM and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog entry.
