# WP04 Section P — brook-trout identity integration (2026-10-12)

## Decision

Added identity-only `brook trout / omble de fontaine` for *Salvelinus fontinalis* as
`ingredient-ref-brook-trout` in `PROTEIN`. The French display uses OQLF's normalized term.
`brook charr` and `speckled trout` are English search aliases. `truite mouchetée` is included only as
an internal search alias; OQLF says it was not retained for Québec fish-product marketing, and the
display remains `omble de fontaine`.

Keep rainbow trout, lake trout, Arctic char, generic trout/char terms, and the anadromous form
separate. The alias lets a broad `truite` search return both brook trout and rainbow trout with
their qualified displays. The full 114-recipe, 1,123-row corpus has no candidate or broader trout
request.

No forms, default measures, density, unit mappings, recipe links, conversions, yields, or
substitutions were added. Québec's biological fish size/weight ranges were not used as culinary
measures. The detailed ownership, picker, source, and recipe review is in
[`wp04-section-p-brook-trout-omble-de-fontaine-identity-review-20261012.md`](../../proposals/wp04-section-p-brook-trout-omble-de-fontaine-identity-review-20261012.md).

Evidence includes [OQLF's normalized species entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198650/omble-de-fontaine),
the [Gouvernement du Québec species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/omble-fontaine),
[OQLF's anadromous-form entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199920/omble-de-fontaine-anadrome),
and the [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list).

## Package snapshot after integration

Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a
NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,262 references | 404,065 | `f610b0851813bae1760192504dce3cb122abb94891d756614c181ee426f932d8` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,571 records; 5,511 sources; 4,549 distinct source IDs | 5,388,012 | `d7c3428dba6f3a0f3874f58fdd8e65d8399115f180ec6468f8fd19052589c35a` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,262 references | 553,137 | `b0ef32d61c24fa541f32e51fd46a39111b62c25e855cc3697c1be462692545b4` |

## Static verification

- Reference normalization, generated-index freshness, seed-package validation, research-ledger
  schema validation, and exact phrase ownership passed.
- New display and alias terms have no other exact active/form/legacy owner. Existing sibling species
  and the recipe corpus are unchanged.
- UTF-8 without BOM, explicit Unicode escapes in database JSON, scoped whitespace, and
  `git diff --check` validation passed.
- No app, unit, instrumentation, emulator, or deployment tests were run because the change only adds
  database JSON data, as allowed by `AGENTS.md`.
