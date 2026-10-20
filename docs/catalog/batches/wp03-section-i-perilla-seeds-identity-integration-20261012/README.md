# WP03 Section I perilla-seed identity integration — 2026-10-12

## Decision

Added identity-only `perilla seeds / graines de périlla` as `ingredient-ref-perilla-seeds` in
`NUT_SEED_AND_DRIED_FRUIT`, scoped to food seeds of *Perilla frutescens*. Added singular aliases
`perilla seed` and `graine de périlla`.

Keep leaves/shiso, seed oil, powder, sowing seed, and sesame separate. Health Canada's current
English and French lists include whole or minimally processed seeds and describe a history of food
use; the listings explicitly say they did not undergo a food-use safety assessment. This is not a
preparation guide or a general safety claim. No forms, recipe links, measures, density, unit mappings,
conversions, yields, or substitutions were added. The complete recipe corpus has no candidate-term
match.

## Evidence

- Health Canada’s [English non-novel determinations list](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html) lists *Perilla frutescens* seeds as whole or minimally processed, and limits the entry to novelty status and a history of food use.
- Santé Canada’s [French list](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html) uses `Graine de perilla` and `Graine de perilla entière ou minimalement transformée`.
- Ontario’s [Specialty Cropportunities profile](https://www.omafra.gov.on.ca/CropOp/en/herbs/culinary/peril.html) identifies *Perilla frutescens* and describes seed use separately from leaves.
- Montréal grocer Marché Korea lists [perilla seed powder](https://marchekorea.com/shop/choya-perilla-seed-powder-%EB%93%A4%EA%B9%A8%EA%B0%80%EB%A3%A8-200g/) and French [périlla powder](https://marchekorea.com/product-category/grocery/powderflourdrymix/); these are processed product names, not whole-seed forms or measures.
- Québec horticultural retailer [Pépinière.ca](https://www.pepiniere.ca/products/pepiniere-ca-perilla) uses accented `Périlla` for the plant and describes its leaves. This does not make `shiso` or bare `périlla` a seed alias.
- [Gimpo Malt Food](https://en.kimpomaca.co.kr/product/perilla-seeds-powder-korean-imported/53/) describes a 100% perilla-seed powder and its uses; the listing is out of stock and supplies no whole-seed conversion.

The proposal contains the complete source register and detailed identity, alias, ownership, and recipe-demand review:
[WP03 Section I perilla-seed identity review](../../proposals/wp03-section-i-perilla-seed-identity-review-20261012.md).

## Static verification

- Bundled package validation and reference normalization passed; the generated ingredient catalog is current.
- Research-ledger validation passed with zero errors. The seven new source IDs occur once each.
- Exact normalized ownership assigns the two displays and two singular aliases only to the new reference. The complete 114-recipe / 1,123-row corpus has no candidate-term match and remains unchanged.
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

The broader Section I seed, kernel, and butter/paste checklist remains open.
