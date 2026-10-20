# WP04 Section P — Muskellunge / maskinongé identity integration (2026-10-12)

## Decision

Added identity-only `muskellunge / maskinongé` as `ingredient-ref-muskellunge`, scoped to *Esox masquinongy*. OQLF-supported English aliases `muskie` and `musky` are the only aliases. The Québec-preferred French term is the display name; the accentless OQLF spelling is found through accent-folded search and is not duplicated as an alias.

Keep Northern pike (*Esox lucius*) distinct. Do not add bare `pike`, `pickerel`, or `brochet`, and do not add secondary Québec names or scientific names as aliases. No forms, density, unit mappings, measures, conversions, yields, recipe links, or substitutions were added. No retail availability is claimed.

## Evidence and picker boundary

- OQLF’s [maskinongé entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8872761/maskinonge) prefers `maskinongé`, pairs it with `muskellunge` and *Esox masquinongy*, places it in the edible-fish domain, and lists `muskie` and `musky` among English terms. Its length description is biological, not a kitchen measure.
- The [Québec species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/maskinonge), updated 2026-10-02, gives `Maskinongé / Muskellunge`, the same scientific name, and distinguishes it from grand brochet. The profile’s size and weight data are biological observations.
- The [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Muskellunge) lists *E. masquinongy* with Muskellunge / Maskinongé as acceptable common-name evidence for Canadian fish labeling. It does not prove that the product is currently sold in Québec.
- Québec’s [sport-fishing rules](https://www.quebec.ca/tourisme-loisirs-sport/activites-sportives-et-de-plein-air/peche-sportive), including current [zone 7](https://www.quebec.ca/tourisme-loisirs-sport/activites-sportives-et-de-plein-air/peche-sportive/zones-periodes/zones-de-peche/zone-7) and [zone 25](https://www.quebec.ca/tourisme-loisirs-sport/activites-sportives-et-de-plein-air/peche-sportive/zones-periodes/zones-de-peche/zone-25) pages, contain sport-catch and zone-specific harvest conditions. The 137 cm retention threshold and whole/eviscerated requirement are not ingredient measures or active product forms. Sport-caught fish restrictions do not imply that any current commercial product is available.
- Québec’s [fish consumption recommendations](https://www.quebec.ca/sante/alimentation/saines-habitudes-alimentaires/consommation-de-poisson-et-sante/recommandations) give sport-caught-fish guidance with a 230 g before-cooking meal basis. This is health guidance, not a recipe serving default or conversion basis. The separate [freshwater commercial fishing permit page](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce) does not establish retail availability.

The live picker boundary after integration is:

| Query | Result |
|---|---|
| `muskellunge` | `ingredient-ref-muskellunge` |
| `maskinongé` or `maskinonge` | `ingredient-ref-muskellunge` |
| `muskie` or `musky` | `ingredient-ref-muskellunge` |
| `pike` or `brochet` | `ingredient-ref-northern-pike` only |
| `lunge` or `Maski` | `ingredient-ref-muskellunge` via partial matching; neither is stored as an alias |
| `muskallunge`, `requin d’eau douce`, or *Esox masquinongy* | No result |

## Recipe demand

The manifest-listed recipe corpus has 114 files and 1,123 ingredient rows. A parsed full-corpus scan for the candidate names, alternative spellings, secondary names, and scientific name found zero hits. No recipe line or recipe link changed.

## Ledger and static validation

The research ledger records identity as verified, no supported culinary measure, and no supported substitute. It records the scientific/name evidence and keeps sport-fishing, health, and permit observations separate from active recipe data.

- Ingredient-reference normalization passed.
- Bundled seed-package normalization and validation passed.
- Research-ledger validation passed: 1,578 records and zero errors; all six integration source IDs are unique and attached to `ingredient-ref-muskellunge`.
- Generated `BundledIngredientCatalog.kt` is current at 1,270 references.
- Exact ownership and picker-boundary checks passed; the full recipe scan found zero candidate hits.
- The reference and ledger JSON are UTF-8 without BOM and store non-ASCII characters as explicit Unicode escapes. Scoped whitespace checks passed.
- No app, unit, instrumentation, emulator, or deployment tests were run because this change only adds database JSON data, as specified by `AGENTS.md`.

Hashes cover exact file bytes. The recipe fingerprint hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,270 references | 406,628 | `5eee521502de2d060c6276c2c4a4e8048d4d8ba7a1f413f73811832395932843` |
| `ingredient-forms.v1.json` | 94 forms | 70,793 | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates | 15,508 | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,578 records; 5,572 source entries; 4,608 distinct source IDs | 5,447,983 | `c6c248fbcd60fa20a087d24ff6821e27a8bca61ebc4d21525a55d1c398ba6952` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 753,792 | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,270 references | 556,613 | `baa6fe5d41d05067a73e801473ca7cf3deb0ae7d62dbb8535c4defba8b678cbf` |

See the [proposal](../../proposals/wp04-section-p-muskellunge-maskinonge-identity-review-20261012.md) for the ownership preflight and source boundaries.
