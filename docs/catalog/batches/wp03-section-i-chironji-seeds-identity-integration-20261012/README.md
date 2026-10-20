# WP03 Section I chironji-seed identity integration — 2026-10-12

## Decision

Added identity-only `chironji seeds / graines de chironji` as `ingredient-ref-chironji-seeds` in
`NUT_SEED_AND_DRIED_FRUIT`, scoped to food seeds of *Buchanania lanzan*. Added the singular aliases
`chironji seed` and `graine de chironji`; both Health Canada language listings support these forms.
Keep fruit pulp, seed oil, planting use, and the regional names `charoli`, `Cuddapah almond`, and
`almondette` outside the alias arrays.

The ledger records no supported general measurement: a NIFTEM example recipe uses one tablespoon,
and the booklet reports cultivar-specific kernel weights, but neither supplies a transferable
conversion or density. NIFTEM also calls chironji an almond substitute in confectionery, but gives no
recipe ratio, method, or adjustment; the ledger records a bounded no-supported-substitute finding
and adds no rule. No form, recipe link, default density, unit mapping, conversion, yield, or
measurement observation was added. The full recipe corpus has no candidate-term match.

## Evidence

- Health Canada’s [English non-novel determinations list](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html) identifies Chironji seeds as *Buchanania lanzan*, whole or minimally processed, with a history of food use. The list says these entries did not undergo a food-use safety assessment.
- Santé Canada’s [French list](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html) uses `Graines de chironji` and singular `Graine de chironji`.
- The Ministry of Food Processing Industries’ [NIFTEM / ICAR KVK booklet](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/08/chironjiprocessing.pdf) describes the edible kernel, confectionery use, a specific kheer formula, processing, and cultivar-specific data. The formula quantity and cultivar weights are not generalized as measures; its broad almond comparison does not supply a recipe substitution ratio.
- The Government of India’s [National Agriculture Market commodity parameter list](https://enam.gov.in/web/docs/221_commodity_list.pdf) identifies dried *Buchanania lanzan* seeds and market quality parameters, not household measures.
- A Canada-facing [DistaCart product listing](https://www.distacart.com/en-ca/products/gropure-organic-chironji-seeds) uses the English product name. It is not a Québec French label or evidence of local stock.

The proposal contains the source register and full identity, measurement, substitution, ownership, and recipe-demand audit:
[WP03 Section I chironji-seed identity review](../../proposals/wp03-section-i-chironji-seeds-identity-review-20261012.md).

## Static verification

- Bundled package validation and reference normalization passed; the generated ingredient catalog is current.
- Research-ledger validation passed with zero errors. All five new source IDs occur once each.
- Exact normalized ownership assigns the two displays and two singular aliases only to the new reference. The complete 114-recipe / 1,123-row corpus has no candidate-term match and remains unchanged.
- The updated JSON files are UTF-8 without BOM with non-ASCII characters represented as Unicode escapes. The recipe corpus remains 752,993 bytes with manifest-ordered digest `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,243 references | `9be692678b8bd18ea4e64ef478e27a2c6824a0738a21097192c378a4fa2ad0e9` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `research-ledger.v1.json` | 1,542 records; 5,346 source entries; 4,388 distinct source IDs | `0cca662548a16d399cc0b06437077a7716cdb319184311676f39d0fdfb7bd20f` |
| `BundledIngredientCatalog.kt` | 1,243 generated references | `53ae99d6df20027693b138d6beeb9a0713d908f6b742e42762972a10d949c26e` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,993 bytes | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

The broader Section I seed, kernel, and butter/paste checklist remains open.
