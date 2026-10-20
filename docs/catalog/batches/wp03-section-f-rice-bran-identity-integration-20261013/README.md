# WP03 Section F: rice bran identity integration

Added identity-only `ingredient-ref-rice-bran` as `rice bran / son de riz` in `GRAIN_AND_CEREAL`, with no aliases. Kept it separate from rice-bran oil, rice germ, whole rice, rice flour, feed-grade material, and composite crispy-rice products.

Recorded Westpoint Naturals' stabilized-product serving, 2 tbsp (15 g), only as a source-specific ledger observation. The suggested replacement of up to one-fourth of flour in muffins or cakes remains blocked from active substitution behavior because it is limited to one product and formula context. Default density, unit mappings, forms, conversions, yields, recipe links, and active substitutions remain empty. No bundled recipe ingredient matches rice bran or son de riz.

The source register, identity boundaries, and pre-integration picker projection are in the [review proposal](../../proposals/wp03-section-f-rice-bran-identity-review-20261013.md). After integration, the existing oil row remains the only match for `rice bran oil` and `rice oil`; `rice bran` returns the oil and bran rows, while `son de riz` returns the new bran row. Broad `bran` and `son` queries still return multiple choices.

Static seed-package normalization, generated-index freshness, ledger schema validation, exact ownership, picker projection, recipe-corpus, UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data. Section F remains open.
