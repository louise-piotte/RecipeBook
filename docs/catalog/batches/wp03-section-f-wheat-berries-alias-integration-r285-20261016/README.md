# WP03 Section F R285 integration: wheat-berries alias

Added `whole wheat kernels` as the sole new English alias on the existing `ingredient-ref-wheat-berries` identity (`wheat berries / grains de blé entiers`). Canadian Food Focus directly defines wheat berries as whole wheat kernels. A Canadian retailer uses the phrase for a named soft-wheat product. Keep named wheat classes, sprouted kernels, cracked wheat, bulgur, flour, bran, and germ separate.

Recorded three focused sources and an accepted alias decision on the existing ledger record. Measurement research found no reusable household measure, density, or conversion: the 30 g Nutrition Facts serving belongs to one hard red spring wheat SKU. Substitution research found no supported active rule: the source's alternatives to rice or pearled barley are qualitative and do not establish a quantity or recipe-role scope. No measurement observation, form, mapping, conversion, yield, recipe link, or active substitution was added. The bundled corpus has no matching wheat-berry demand.

## Files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (regenerated projection)
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- `docs/catalog/proposals/wp03-section-f-wheat-berries-whole-wheat-kernels-alias-review-r285-20261016.md`

## Verification

Static data and package checks passed:

- Bundled package normalization/validation, ingredient-reference normalization, and generated picker-index freshness.
- Research-ledger schema and source-ID/URL ownership validation for the updated record.
- Picker projection and manifest-listed recipe-corpus scan.
- UTF-8 without BOM, escaped Unicode in database JSON, local Markdown links, and scoped whitespace checks.

Totals: 1,661 ingredient references, 126 forms, and 2,010 research-ledger records / 8,840 source entries / 7,483 distinct source IDs / 6,245 distinct URLs; 114 bundled recipes / 1,123 ingredient rows.

No software tests, builds, or emulator checks were run. This change adds database JSON data; the generated Kotlin file is a projection of the canonical references.

## Sources

- [R285 whole-wheat-kernels alias proposal](../../proposals/wp03-section-f-wheat-berries-whole-wheat-kernels-alias-review-r285-20261016.md)
- [Canadian Food Focus: Wheat Product: Wheat Berries](https://canadianfoodfocus.org/courses/wheat-from-farm-to-table/lessons/wheat-in-the-kitchen/topic/14847/)
- [Bulk Mart: Clic Soft Wheat Kernels #1](https://bulkmart.ca/collections/food/products/soft-wheat-kernels-1-2-lbs)
- [Healthy Planet: Oak Manor Organic Hard Wheat Kernels](https://www.healthyplanetcanada.com/en/oak-manor-hard-wheat-kernels-organic-1kg.html)
