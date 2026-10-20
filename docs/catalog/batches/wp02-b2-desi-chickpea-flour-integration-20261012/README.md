# Desi chickpea flour integration — 2026-10-12

## Decision

Added identity-only `Desi chickpea flour / farine de pois chiches Desi` as
`ingredient-ref-desi-chickpea-flour` in `FLOUR_AND_STARCH`, with no aliases. A Canadian farm/mill
names the English product and describes it as finely milled from Desi chickpeas; a current French-
language Canadian grocery listing uses the proposed French display. OQLF identifies `pois chiche
desi` as the French name for the smaller brown type, while CFIA classifies Desi and Kabuli chickpeas
as distinct types of *Cicer arietinum*. The exact flour wording is product-language evidence, not an
OQLF ruling or a standardized flour specification. [Axten Farms](https://www.axtenfarms.ca/product/desi-chickpea-flour),
[Maxi](https://www.maxi.ca/fr/farine-de-pois-chiches-desi/p/21071316_EA),
[OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche),
[CFIA](https://inspection.canada.ca/en/plant-health/seeds/seed-inspection-procedures/pulse-crops).

Keep generic `chickpea flour`, whole Desi chickpeas, black/Kala Chana chickpeas, and roasted
Bengal-gram flour/chana sattu distinct. The recipe-corpus scan found no matching product or chickpea-
flour demand. Maxi's 5 kg package size is not a kitchen measure; no recipe amounts, forms, density,
unit mappings, conversions, yields, or substitutions were added.

The type-qualified English and French phrases return the new row. Broad `chickpea flour` and `farine
de pois chiches` queries return three rows: generic chickpea flour, Desi chickpea flour, and chana
sattu through its roasted-chickpea-flour alias. `pois chiches Desi` returns both the whole-pulse and
flour rows. No broad alias was added to force an exact result.

The detailed source limits, pre-integration ownership audit, recipe-demand scan, and alias boundaries
are recorded in
[`wp02-b2-desi-chickpea-flour-identity-boundary-review-20261012.md`](../../proposals/wp02-b2-desi-chickpea-flour-identity-boundary-review-20261012.md).

## Package snapshot after integration

Hashes cover exact file bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a
NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,264 references | 404,684 | `c373d1cf4f192b0cfdaf8f8095b8642a5bd6d55cd50be822ef81ed3060914d39` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,573 records; 5,526 source entries; 4,562 distinct source IDs | 5,402,058 | `f0caa10408e515af8bc74cf7a158d73f7f3b5ad8873d1f5c9d0622664bd14965` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,264 references | 554,013 | `0b3de1e4170f8603744378f38b2adb8cfef1e6a25fb87cb38bbbf8af2cd1b065` |

## Static verification

- Reference normalization, generated-index freshness, seed-package normalization, and bundled
  package validation passed.
- The research ledger validates with 1,573 records and zero errors. Eight proposal-local source IDs
  and two previously recorded chickpea-boundary sources are linked to the accepted decision.
- Normalized exact English and French flour phrases are owned only by the new row. Generic flour
  queries retain three results; the existing `pois chiches Desi` query retains both whole and flour
  identities. No form or legacy candidate owns an exact candidate phrase.
- UTF-8 without BOM, explicit Unicode escapes in the database JSON, and scoped `git diff --check`
  validation passed.
- No unit, app, instrumentation, emulator, or deployment tests were run because this change only
  adds database JSON data, as permitted by `AGENTS.md`.
