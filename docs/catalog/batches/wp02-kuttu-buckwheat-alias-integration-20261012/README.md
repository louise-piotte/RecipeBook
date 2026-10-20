# WP02 A6 kuttu / buckwheat-flour alias integration

## Decision

Added English aliases `kuttu atta`, `kuttu ka atta`, and `kuttu flour` to the existing
`ingredient-ref-buckwheat-flour` row. Retained the localized display `buckwheat flour / farine de
sarrasin`; bare `kuttu`, unsupported French regional spellings, separate kuttu identities, forms,
recipe links, and numeric behavior remain out.

The [source review](../../proposals/wp02-a6-kuttu-buckwheat-flour-alias-review-20261012.md)
documents that FSSAI calls buckwheat flour `kuttu atta`, a Mississauga retailer identifies `kuttu ka
atta` and `kuttu atta` as buckwheat flour, and an Ontario listing titles the product `Kuttu Flour`.
OQLF and the Québec Food Directory support retaining `farine de sarrasin` as the Québec display.
Those sources support names only, not a flour grade, process, recipe behavior, or measurement.

## Changes

- Updated only the existing buckwheat-flour reference’s English aliases and `updatedAt` value in the
  bundled reference JSON. The French display, `defaultDensity`, and `unitMappings` remain unchanged.
- Added five source records and one accepted alias decision to the existing buckwheat-flour research
  ledger record; no ledger record or recipe was added.
- Regenerated `BundledIngredientCatalog.kt` from the active reference data.
- Marked the A6 alias checkpoint complete in the catalog plan and roadmap. Broader WP02 A6 review
  remains open.

## Live data snapshot

Snapshot immediately after the kuttu integration and before the later triticale-flakes and
American-lobster integrations on 2026-10-12:

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,222 rows; 390,768 bytes | `adc268b4042a99ef804fe37622df5b7879e80b12e334027bf2f3c093c1ef3fa1` |
| Ingredient forms | 86 rows; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy candidates | 66 rows; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,522 records; 5,179 sources; 4,242 distinct source IDs | `b33869499cd80d2d5ce6ac421dab937fb3a256e913e857b4dbf0c9a4246940c9` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated Kotlin catalog | 1,222 references; 535,244 bytes | `682fc3b8fa9162e5ccc1ec886a180f7cdf64f94093fb76e528e7bac27f0658d8` |

The recipe fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe-file
bytes, and a trailing NUL byte. File hashes cover exact bytes.

## Static verification

- Bundled seed package validation passed.
- Ingredient-reference normalization check passed.
- Generated ingredient-catalog freshness check passed at 1,222 references.
- Research-ledger validation passed with 1,522 records and zero errors.
- Exact normalized-key ownership assigns the three accepted aliases only to
  `ingredient-ref-buckwheat-flour`. Bare `kuttu`, unsupported French phrases, and proposed new IDs
  have no owner.
- All 114 manifest recipes and 1,123 ingredient rows were scanned; no candidate term occurs.
- UTF-8 without BOM and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog entry.
