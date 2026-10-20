# WP02 A6 `ragi atta` / finger-millet-flour alias integration

## Decision

Added `ragi atta` as the sole new English alias on the existing verified
`ingredient-ref-finger-millet-flour`. Retained `finger millet flour / farine de ragi` and the
existing `ragi flour` and `nachni flour` aliases. Bare `ragi` remains on the separate grain identity;
`sprouted ragi atta` remains outside the unqualified alias. Added no French alias, identity, form,
recipe link, measurement, density, mapping, conversion, yield, or substitution.

The [source review](../../proposals/wp02-a6-ragi-atta-finger-millet-flour-alias-review-20261012.md)
combines FSSAI's finger-millet/ragi identity and ragi-flour definition with current Canadian product
wording. Bloom Global Foods titles a product `Ragi Atta (Finger Millet)` and describes it as ragi
flour/finger-millet flour. Veehacart uses `Ragi Atta` for a finger-millet flour product. Walmart
Canada's French-facing listing pairs `Ragi Atta` with the existing `Farine de Ragi` wording; it was
out of stock and is used only for naming evidence. No bundled recipe uses the alias or links to the
target reference.

## Live data snapshot

Snapshot immediately after integration. File hashes cover exact bytes. The recipe-corpus fingerprint
hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in
manifest order.

| Surface | Count | Bytes | SHA-256 / fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,225 references | 391,787 | `3f04052f75f6b3978451c3a2d186f2d45355202f44b215eb0648b15bba810ba3` |
| `ingredient-forms.v1.json` | 86 forms | 64,612 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,524 records; 5,208 sources; 4,271 distinct source IDs | 5,049,561 | `7392023b740efd7d64ff2d70aa1e755bc5174b507f32e7bbfe815ce4f46e2609` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 752,942 | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated `BundledIngredientCatalog.kt` | 1,225 references | 536,600 | `b91d8f9bc5e7ecda096e5662c88c740cb82744c9ab450ac0bf47db0adfc5c6e9` |

## Static verification

- Seed-package validation, ingredient-reference normalization check, generated-catalog freshness,
  and research-ledger validation passed.
- The normalized key `ragi atta` is owned only by `ingredient-ref-finger-millet-flour`; bare `ragi`
  remains owned by `ingredient-ref-finger-millet`. `ragi aata`, `ragi ka atta`, `finger millet atta`,
  and `nachni atta` remain unallocated.
- All 114 manifest-listed recipes / 1,123 ingredient rows were scanned; no candidate phrase or
  target ID occurs, and no recipe links to the flour reference.
- UTF-8 without BOM and scoped whitespace checks passed.
- No tests or emulator checks were run because this change only adds database JSON data and its
  generated catalog entry.
