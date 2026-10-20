# WP03 Section F — Red River cereal integration (2026-10-12)

## Decision

Added identity-only `ingredient-ref-red-river-cereal` as **`Red River cereal / Céréales Red River`**
in `GRAIN_AND_CEREAL`. English aliases are `Red River hot cereal` and `Original Red River Cereal`;
French aliases are `céréales chaudes Red River` and `céréale Red River`.

The identity covers Arva's original dry Red River mix. Keep its cracked wheat, cracked rye, and flax
components separately named, along with Arva's distinct 7-grain cereal and generic hot cereal. No
forms, default density, active measure, unit mapping, recipe link, yield, or substitution rule was
added. The research ledger preserves Arva's approximate 200 g per manufacturer cup as a
source-specific observation; the cup volume convention is unspecified, so the value does not support
an app conversion or reusable density.

The exact Canadian product title, French title, component list, and approximate mass are documented
by [Arva Flour Mills](https://arvaflourmills.com/products/red-river-cereal-908g/1000) and its
[French product page](https://arvaflourmills.com/fr/products/red-river-cereal-908g). Arva's
[FAQ](https://arvaflourmills.com/pages/arva-faq) confirms the original cereal's four ingredients.
The [Metro listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/cereales-chaudes/p/059000039602)
supports the Québec French grocery wording; a [French Nunavut breakfast cookbook](https://livehealthy.gov.nu.ca/sites/default/files/BPCB_FRsm.pdf)
provides historical culinary wording and preparation context. These sources do not establish
regional prevalence or a general cooked yield. See the [full identity review](../../proposals/wp03-next-open-grain-gap-review-20261012.md)
for the source register and product boundaries.

## Picker and recipe audit

The actual `IngredientReferenceSearchIndex` normalization and whole-phrase matching behavior was
applied to the live reference and form names. Each exact English or French display/alias query resolves
to the new reference alone. The generic `hot cereal` query returns four distinct references:
cream of rice hot cereal, cream of wheat hot cereal, creamy buckwheat hot cereal, and Red River
cereal. The component query `cracked wheat` continues to resolve to cracked wheat.

The full manifest lists 114 recipes and 1,123 ingredient rows. Scanning every recipe file for Red
River phrases and both new reference IDs found zero hits and no recipe links.

## Package snapshot after integration

Hashes cover exact bytes. The recipe corpus digest hashes each manifest-relative path, a NUL byte, its
exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count / size | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,274 references; 408,049 bytes | `7dd8e817ac83fb11b5ee486007178f90e966e062cd890944dfa1a430a103b726` |
| `ingredient-forms.v1.json` | 94 forms; 70,793 bytes | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates; 15,508 bytes | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,582 records; 5,608 source entries; 4,644 source IDs; 8 conversions; 5,487,917 bytes | `bf2cba1f35c4d6281475358bb9623f42a2570be0991cc14fc6bc274aa566da14` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,274 references; 558,452 bytes | `51494e0aaed4b5546a2cb93ada4d559903807453e9640adf608374867be2318c` |

## Validation

- Ingredient-reference normalization, bundled-package normalization, package validation, and
  generated-catalog freshness checks passed.
- Exact picker queries for all six displays and aliases resolve only to this reference; the broad
  `hot cereal` result retains the three existing hot-cereal choices alongside it.
- The 114-file / 1,123-row corpus scan found no Red River phrase or reference-ID hit.
- The research ledger contains the eight Red River sources and one source-specific approximate
  portion observation; the app has no Red River measurement, form, mapping, recipe link, or rule.
- No app tests or emulator checks were run because this change only adds database JSON data and its
  generated index, as stated in `AGENTS.md`.
