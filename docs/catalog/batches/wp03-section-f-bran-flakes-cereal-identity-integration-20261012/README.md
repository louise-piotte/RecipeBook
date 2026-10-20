# WP03 Section F — bran-flakes cereal identity integration (2026-10-12)

## Decision

Added identity-only `ingredient-ref-bran-flakes-cereal` with the bilingual display
`bran flakes cereal / céréales de son en flocons` in `GRAIN_AND_CEREAL`. Kept the cereal separate
from wheat bran as a milling fraction, wheat flakes as a single-grain flake product, and branded,
frosted, nugget, or composite cereal products. Added no aliases, forms, density, unit mappings,
measurements, conversions, yields, recipe links, or substitutions.

The [source review](../../proposals/wp03-section-f-bran-flakes-cereal-identity-review-20261012.md)
uses the current Canadian manufacturer's English product page, its Québec-facing French product page,
and a Québec Super C listing. The manufacturer identifies All-Bran Flakes as a cereal made with whole
grain wheat and wheat bran; Super C uses the product wording `Céréales de son en flocons` and lists
the ingredient panel for the same branded cereal SKU. The French display generalizes that Québec
product wording without importing the brand or its specific formula into the catalog.

## Live package snapshot

Snapshot immediately after integration. Hashes cover exact file bytes. The recipe-corpus fingerprint
hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in
manifest order.

| Artifact | Count | Bytes | SHA-256 / fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,226 references | 392,103 | `4946cf6b6256f8d1ef2714ee534ebad44f02d29bdfbf0dfa84f20146a133220f` |
| `ingredient-forms.v1.json` | 86 forms | 64,612 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,525 records; 5,212 sources; 4,275 distinct source IDs | 5,053,058 | `6954a3784dfff117b9ab926914123af8a503e32c18aee5ea7f90859ba115e953` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 752,942 | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated `BundledIngredientCatalog.kt` | 1,226 references | 537,040 | `8cf3119845a873644779c118a3e58963d8215058a46564954546b2362ecf5a3c` |

## Static verification

- Seed-package validation, ingredient-reference normalization check, generated-catalog freshness,
  and research-ledger validation passed.
- Exact normalized names `bran flakes cereal` and `céréales de son en flocons` are owned only by
  `ingredient-ref-bran-flakes-cereal`. The existing wheat-bran, wheat-flakes, corn-flakes, and
  other cereal identities remain separate.
- Scanned all 114 manifest-listed recipe files / 1,123 ingredient rows for candidate phrases and the
  new ID; no recipe matched and no recipe links to the new identity.
- The bundled reference JSON stores the French accent as an explicit Unicode escape. Changed files
  passed UTF-8 without BOM and scoped whitespace checks.
- No tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog entry.
