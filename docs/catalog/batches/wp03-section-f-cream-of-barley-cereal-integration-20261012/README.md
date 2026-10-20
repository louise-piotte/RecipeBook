# Cream of barley cereal integration — 2026-10-12

## Decision

Added identity-only `cream of barley cereal / crème d’orge` as
`ingredient-ref-cream-of-barley-cereal` in `GRAIN_AND_CEREAL`. Keep the complete English qualifier
visible: the current phrase-first picker returns this single clearly named product for `barley cereal`.
Bare `barley` and `orge` still return ten qualified barley identities, including this one, so those
queries retain their broad scope. No generic `barley cereal` alias was added.

The French display is current Québec product-language evidence, not an OQLF or TERMIUM ruling. Moulin
Abénakis markets a breakfast cereal as *crème d’orge* and publishes product-specific directions; the
Aliments du Québec registry lists it under cereals and granola. Alaska Flour Company directly uses
*Cream of Barley Cereal*, and Alaska's state product registry lists it among the company's barley
grain products. These sources establish product-name attestations, not one shared ingredient
statement, grind, or process. [Moulin Abénakis](https://moulinabenakis.com/products/creme-orge-bio),
[Aliments du Québec](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/cremes-de-cereales-dorge-biologique),
[Alaska Flour Company](https://alaskaflour.com/products/16oz-cream-of-barley-cereal),
[Alaska Department of Commerce](https://www.commerce.alaska.gov/dcra/akmadeproducts/business/Details/76e93a9d-87e6-4bf2-a458-111bcab07383).

Keep barley flakes, barley meal, hulled/pearl/pot barley, barley flours, puffed barley, cream of rice,
cream of wheat, creamy buckwheat cereal, and prepared porridge separate. The unresolved
`candidate-barley-meal` remains unchanged. The full 114-recipe, 1,123-row scan found no candidate or
neighboring barley demand.

No aliases, forms, recipe links, density, unit mappings, reusable measures, conversions, yields, or
substitutions were added. The source's preparation ratio and 300 g / 10 kg package formats remain
product-specific observations, not catalog values.

The detailed source limits, ownership audit, query analysis, and recipe-demand scan are recorded in
[`wp03-section-f-cream-of-barley-cereal-identity-review-20261012.md`](../../proposals/wp03-section-f-cream-of-barley-cereal-identity-review-20261012.md).

## Package snapshot after integration

Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a
NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,263 references | 404,375 | `fa5123156c369ab870e50bfc12b366770f37c424c82b903d3d9bcc8ed3bfe82a` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,572 records; 5,516 source entries; 4,554 distinct source IDs | 5,392,937 | `5306fd896e1ab17155850bff4d3f44a7e80ebf65a346ca96719b047d5d18feb4` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,263 references | 553,572 | `b91e73ca64db5c0748aeb1ac947f72f8cd1eadce4f5f727e17e91358cd6942a0` |

## Static verification

- Reference normalization, generated-index freshness, seed-package normalization, and bundled
  package validation passed.
- The research ledger validates with 1,572 records and zero errors. All five new source IDs occur
  once and are linked to the accepted identity record.
- Normalized `cream of barley cereal`, `cream of barley`, `barley cereal`, and `crème d’orge` phrase
  searches have only the new reference as owner. Bare `barley` and `orge` each retain ten qualified
  reference matches.
- Database JSON uses explicit Unicode escapes. Touched files decode as UTF-8 without BOM; scoped
  `git diff --check` passed.
- No unit, app, instrumentation, emulator, or deployment tests were run because this change only
  adds database JSON data, as permitted by `AGENTS.md`.
