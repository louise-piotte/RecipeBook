# WP02 B2/B3 canna-starch identity integration — 2026-10-12

## Decision

Added identity-only `canna starch / fécule de toloman` as `ingredient-ref-canna-starch` in
`FLOUR_AND_STARCH`, scoped to food-grade starch extracted from edible *Canna indica* rhizomes,
including older *Canna edulis* naming. Added English aliases `achira starch`, `canna indica starch`,
and `toloman starch`, plus the French goods phrase `amidon de canna indica à usage alimentaire`.
The French display is provisional Canadian terminology, not an OQLF ruling or evidence of current
Québec retail availability.

Keep whole-rhizome flour, `achira flour`, bare `sagú`/`sagu`, and Queensland-arrowroot wording
separate. The regional `sagú` homonym is unsafe as a global alias, and generic arrowroot already
belongs to a separate identity. No forms, recipe links, measures, density, unit mappings, conversions,
yields, or substitutions were added. The complete recipe corpus has no candidate-term match.

## Evidence

- [TERMIUM Plus: fécule de Toloman](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=FECULE+TOLOMAN) pairs `canna starch / fécule de toloman`, lists `toloman starch`, and identifies *Canna edulis* as the source plant.
- [Kew Plants of the World Online](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:795997-1) treats *Canna edulis* as a synonym of *Canna indica*.
- The primary [achira flour and starch study](https://doi.org/10.1002/star.201100149) analyzes the two rhizome products as separate fractions; it provides no universal kitchen measure or density.
- [AGROSAVIA’s technical manual](https://repository.agrosavia.co/server/api/core/bitstreams/1b71cc28-2d96-4582-bdf9-5475ed5e1547/content) describes extraction from rhizomes and Colombian regional `sagú` usage. This term is not generalized as an alias.
- The [Canadian Trademarks Journal, French issue](https://publications.gc.ca/collections/collection_2026/opic-cipo/RG42-2-73-3719-fra.pdf) contains `amidon de canna indica à usage alimentaire`; the [CIPO English trademark entry](https://ised-isde.canada.ca/cipo/trademark-search/pdf/2400592?lang=eng) contains `canna indica starch for food`. These are administrative goods descriptions, not product labels.
- Canada-facing [Unimarket biscuit listing](https://unimarket.ca/products/achiras-del-huila-bizcochitos-6-bags-of-17-gr-each-102-gr) and the [manufacturer product page](https://usachirasdelhuila.com/AchirasDelHuila) list achira starch in finished foods; neither establishes a standalone retail package name.

The proposal contains the complete source register and detailed product, alias, ownership, and recipe-demand review:
[WP02 B2/B3 canna-starch identity review](../../proposals/wp02-b2-b3-canna-starch-identity-gap-review-20261012.md).

## Static verification

- Bundled package validation and reference normalization passed; the generated ingredient catalog is current.
- Research-ledger validation passed with zero errors. The nine new source IDs occur once each.
- Exact normalized ownership assigns the new English/French displays and four aliases only to the new reference. The complete 114-recipe / 1,123-row corpus has no candidate-term match and remains unchanged.
- The updated JSON files are UTF-8 without BOM with non-ASCII characters represented as Unicode escapes. The recipe corpus remains 752,993 bytes with manifest-ordered digest `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,242 references | `d40be0bdff5ae32179dfe0a099ba17c931972cd50e5fd26801f716fc8ebc1c86` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `research-ledger.v1.json` | 1,541 records; 5,341 source entries; 4,383 distinct source IDs | `f00bf8b007542fc2f33b0223f77354159ac5304fa9235590f3a1947cf861bdce` |
| `BundledIngredientCatalog.kt` | 1,242 generated references | `7e03ea281d3c64120881e3546c0949765a8f3601289a01576c55b06d111e98cc` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,993 bytes | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

The broader WP02 B2/B3 flour and starch review remains open.
