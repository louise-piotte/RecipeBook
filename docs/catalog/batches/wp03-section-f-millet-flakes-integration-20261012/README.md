# WP03 Section F — millet flakes identity integration (2026-10-12)

## Decision

Added `ingredient-ref-millet-flakes` as identity-only `millet flakes / flocons de millet` in
`GRAIN_AND_CEREAL`, with no aliases. Canadian retail naming and Québec/Canadian French product and
ingredient wording support the unqualified consumer product name without choosing a species or a
universal production/readiness state.

Keep species-qualified flakes, millet flour, puffed millet, and formulated or multigrain cereals
separate. Do not generalize seller-specific pre-cooking, directions, package sizes, ingredient details,
or nutrition. The 114 bundled recipes have no matching ingredient row, so no recipe link was added. No
form, density, unit mapping, conversion, yield, or substitution was added. Measurement and substitution
research remain unresearched in the ledger.

Full source register and the four Section F hold rechecks are in the
[millet-flakes identity review](../../proposals/wp03-section-f-millet-flakes-identity-review-20261012.md).

## Updated package snapshot

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,220 references | `fd9b020e6938097508e264c0674262f5cae43579744fdc204dce7adbb07b7f2c` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,521 records; 5,150 source entries; 4,213 distinct source IDs | `165c9edc5ecd7876136f93db01d00f359781057ff7da6f664eed474138d46be9` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `BundledIngredientCatalog.kt` | 1,220 generated reference entries | `66b567a40639ffa2ab5139dd728c535249f644d8bf61050587fee14632aa16f0` |

The recipe corpus digest hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a
trailing NUL byte, in manifest order.

## Validation

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed.
- Research-ledger schema validation reported zero errors.
- Normalized exact ownership confirms `millet flakes` and `flocons de millet` resolve only to
  `ingredient-ref-millet-flakes`; `millet flour`, `puffed millet`, and species-level millet identities
  remain separate. No singular/plural or process aliases were added.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows: zero millet-flakes hits.
- UTF-8/no-BOM and trailing-whitespace checks passed for the batch docs. Scoped `git diff --check`
  passed on the tracked package, generated index, plan, roadmap, and workflow files.
- No unit tests, instrumentation tests, or emulator checks were run because this change only adds
  database JSON data and its generated index, per `AGENTS.md`.
