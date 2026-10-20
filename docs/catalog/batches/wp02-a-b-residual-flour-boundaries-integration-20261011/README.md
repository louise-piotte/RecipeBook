# WP02 A/B residual flour-boundary integration

Integrated the accepted recommendations from the [A/B evidence review](../../proposals/wp02-flour-starch-residual-coverage-review-20261011.md) and its [independent Québec French wording review](../../proposals/wp02-quebec-french-light-rye-defatted-coconut-flour-wording-review-20261011.md).

## Integrated data

### All-purpose flour

Removed French alias `farine tout usage non blanchie` from `ingredient-ref-all-purpose-flour`. Bleached and unbleached flour remain products within the all-purpose family, but the generic picker result must not erase that process qualifier. Kept the generic English/French displays and the other aliases.

Recorded four Health Canada Canadian Nutrient File portions for bleached and unbleached all-purpose flour: 100 mL = 52.8 g and 250 mL = 132.1 g for each food code. Also recorded King Arthur's source-specific 1 cup = 120 g value. The ledger states that the CNF volume method is unspecified and King Arthur's cup volume is not established as the app's U.S. cup. These observations do not create a default density or unit mapping. King Arthur's method guidance reports that fluffing, scooping, and leveling yields around 120 g while condensed flour can reach 160 g, demonstrating why the brand result is not universal. [Health Canada bleached flour](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4501), [Health Canada unbleached flour](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6642), [King Arthur weight chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), [King Arthur measuring guidance](https://www.kingarthurbaking.com/blog/2023/10/13/how-to-measure-flour).

### Light/white rye flour

Added identity-only `light rye flour / farine de seigle claire` with English alias `white rye flour` and French aliases `farine de seigle blanche` and `farine de seigle légère`. The independent review chose `claire` as the display because it has a direct historical bilingual class pairing and appears in Arva's current French description. `blanche` is supported by TERMIUM Plus; `légère` is the title of Arva's current French product page. These are bounded name variants, not a claim that suppliers use universal grade thresholds. [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=90&i=&index=esb&lang=eng&sg_kp_wet=1906290&srchtxt=harina), [Arva French product page](https://arvaflourmills.com/fr/products/light-rye-flour-1), [historical Canadian specification](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-006-1987.pdf).

At this batch checkpoint, medium and dark rye grades were unresolved. The later [medium-rye integration](../wp02-medium-rye-flour-integration-20261011/README.md) added a named middle grade after independent Québec wording review. General dark rye remains held because sources do not establish shared milling thresholds or a consistent product class. Medium rye remains separate from generic rye flour, light rye flour, whole rye flour, rye meal, and pumpernickel meal. No forms, measurements, conversions, yields, or substitutions were added.

### Defatted coconut flour

Added identity-only `defatted coconut flour / farine de noix de coco dégraissée` with no aliases. The independent Québec review accepted the display as a precise description of the narrow process-defined product, while noting it is not an OQLF-preferred term or an exact title found on the reviewed product pages. Québec retailer Origine en Vrac describes dried coconut flesh defatted by pressing; Yupik's Canadian French page describes its coconut flesh as defatted, dried, and finely milled. [Origine en Vrac](https://origine-vrac.ca/fr/Produit-1726-Farine-de-noix-de-coco-non-sucree-392g), [Yupik French product page](https://yupik.com/fr/organic/organic-coconut-flour-p31505).

Kept broad `coconut flour / farine de noix de coco` unresolved because the same names cover products with distinct or undisclosed processing. No generic coconut alias, form, measure, density, mapping, conversion, yield, or substitution was added.

Neither new flour identity matched an ingredient row in the 114-recipe / 1,123-row corpus. All-purpose flour remains directly requested in 50 rows across 47 recipes; no line was changed or relinked.

## Validation

- The reference normalizer processed the updated seed catalog; package validation and the generated-catalog freshness check passed.
- Research-ledger schema validation passed. The package has 1,080 references / 78 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,378 records / 4,560 source entries / 3,733 distinct source IDs.
- Database JSON files are UTF-8 without BOM with non-ASCII characters escaped. Scoped whitespace checks passed.
- No tests or emulator were run under the JSON-only data rule in `AGENTS.md`.

## Current snapshot

Hashes cover exact file bytes. The recipe digest hashes each manifest-listed recipe basename, a NUL byte, exact file bytes, and a trailing NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| Ingredient references | 1,080 | `63a453335070cdceefa0b53db3661ec882ebf2db2516ffd756708de0c541e062` |
| Ingredient forms | 78 | `e80adb0f8d0f7a83c4726f4e60995d924bbd7c4c2324367ac43f69aa5fdf037d` |
| Research ledger | 1,378 records; 4,560 source entries; 3,733 distinct source IDs | `47e15173c90922836b9618672c2bc0dcd2858045df5b20ebe2c20cb3774257ae` |
| Manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 files; 1,123 ingredient rows | `abc542ed162722c03eef640864478f7788196509b0f9620b27c98fcce1c19530` |
| Generated Kotlin index | 1,080 references | `59caa49554a949ed0730517580ab13ac654d3b0d8149a7548be1ee68026fbf4c` |

Broader A/B flour and starch coverage remains open.
