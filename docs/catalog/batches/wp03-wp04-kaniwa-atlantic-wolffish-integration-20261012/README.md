# Kaniwa and Atlantic wolffish identity integration — 2026-10-12

## Decisions

Added two identity-only ingredient references:

| ID | English / Québec French | Category | Aliases |
|---|---|---|---|
| `ingredient-ref-kaniwa` | `kaniwa seeds / graines de kaniwa` | `GRAIN_AND_CEREAL` | French `canihua` |
| `ingredient-ref-atlantic-wolffish` | `Atlantic wolffish / loup de l’Atlantique` | `PROTEIN` | None |

OQLF identifies kaniwa as *Chenopodium pallidicaule*, prefers the French terms `kaniwa` and
`canihua`, and discourages `bébé quinoa`; quinoa is a separate species. Canadian product pages
support the bilingual kaniwa display. The active row therefore excludes `baby quinoa`, `bébé quinoa`,
flour, and puffed products. Atlantic wolffish is scoped to *Anarhichas lupus*. OQLF and CFIA support
the species-qualified name pair; broader wolffish/catfish terms and unretained French names remain
outside its aliases. See the [kaniwa review](../../proposals/wp03-section-f-kaniwa-grain-identity-review-20261012.md)
and [Atlantic wolffish review](../../proposals/wp04-section-p-atlantic-wolffish-species-identity-review-20261012.md)
for source locators and detailed boundaries.

The research ledger holds one Yupik product-specific `1/2 cup (100 g)` kaniwa observation and two
Health Canada CNF observations for raw Atlantic wolffish: `1/2 fillet = 148.4 g` and one Food Guide
serving `= 90 g`. These are source-specific evidence only. No active forms, default measures,
densities, unit mappings, recipe links, conversions, yields, or substitutions were added.

## Snapshot at this batch's integration point

The following snapshot was captured immediately after the kaniwa and Atlantic wolffish integration,
before the later einkorn-berries and cusk additions. Hashes cover exact bytes. The recipe-corpus
fingerprint hashes each manifest-relative path, a NUL byte, exact recipe-file bytes, and a trailing
NUL byte in manifest order. The [einkorn/cusk batch README](../wp03-wp04-einkorn-cusk-integration-20261012/README.md)
records the subsequent current snapshot.

| Artifact | Count / state | SHA-256 or fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,258 references | `fe5119d6027e9916aec60272233b4ce2f92f5e0efc26e769e720ef81689ac085` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,567 records / 5,491 source entries / 4,529 distinct source IDs | `3e66158bfcbdc4d7b64175666b63997c1235d92623c144c03e21b44c868af515` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `BundledIngredientCatalog.kt` | Generated index for 1,258 references | `dd06fcb41258afe69dd06575b34e21fd7e0054c711afbf9b6fea03e6fda1ac2f` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows / 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The normalized exact-owner audit assigns `kaniwa seeds`, `graines de kaniwa`, and `canihua` only
to `ingredient-ref-kaniwa`; it leaves `baby quinoa` and `bébé quinoa` unowned. The species key is
not exposed as a picker term. `Atlantic wolffish` and `loup de l’Atlantique` are owned only by the
new wolffish row; broad `wolffish`, `catfish`, and the excluded French marketing names were not
added as aliases. The 114-recipe / 1,123-row corpus has no candidate phrase hits or links for either
identity.

## Static verification

The bundled package normalizer/check, ingredient-reference normalization check, generated catalog
refresh/check, seed-package validation, research-ledger schema validation, normalized ownership
audit, recipe-corpus scan, UTF-8/no-BOM check, and `git diff --check` passed for this integration.
No app tests, instrumentation tests, emulator checks, or deployment were run; the change only adds
database JSON data plus its generated index and documentation.
