# WP08 granulated-sugar liquid-sweetener review — integration

Recorded source-bounded liquid-sweetener research on `ingredient-ref-granulated-sugar`.

- The generic corn-syrup direction is supported only for partial replacement: the sources report 1:1 by volume, Colorado State Extension caps it at half the recipe's sugar, and both Extension tables advise reducing other liquid by 1/4 cup. It remains ledger-only because the runtime model cannot enforce that limit and adjustment.
- Honey and maple-syrup directions remain blocked. Sources disagree on ratios and recipe adjustments; no values were averaged or activated. Maple syrup's catalog identity remains unreviewed.
- Generic molasses was not assigned to a replacement finding because its identity and grade scope remain unresolved.
- The corpus contains 65 granulated-sugar, 1 honey, 3 maple-syrup, and 2 corn-syrup ingredient rows. Recipes that contain both sugar and syrup use them in separate formula roles; no recipe line was linked or edited.
- No ingredient reference, form, measurement, active substitution rule, or recipe data was changed.

## Sources

- [King Arthur Baking, Baking with liquid sweeteners](https://www.kingarthurbaking.com/blog/2017/08/18/baking-with-liquid-sweeteners)
- [Utah State University Extension, Thriving Hives: Making Products With Honey](https://extension.usu.edu/beekeeping/research/making-products-with-honey-skincare-and-food-recipes)
- [Utah State University Extension, List of Ingredient Substitutions for Cooking and Baking](https://extension.usu.edu/archive/list-of-ingredient-substitutions-for-cooking-and-baking)
- [University of Maine Cooperative Extension, Make Mine Real Maple Syrup!](https://extension.umaine.edu/food-health/2022/03/10/make-mine-real-maple-syrup/)
- [Maple from Canada, The Versatility of Maple Syrup](https://maplefromcanada.ca/cook-with-maple/versatility/)
- [Colorado State University Extension, Ingredient Substitutions](https://extension.colostate.edu/resource/ingredient-substitutions/)

## Validation

- Ledger schema and source-reference checks passed: 1,963 records, 8,575 source entries, 7,279 distinct source IDs, and 6,054 distinct source URLs; no source-ID-to-URL conflicts or dangling source references were found.
- The granulated-sugar record has one supported, partial corn-syrup finding and two blocked liquid-sweetener findings; no active rule or recipe-line link was added.
- Replacement endpoint IDs resolve to the bundled catalog. UTF-8/no-BOM, local-link, and whitespace checks passed.
- No new active substitution-rule data was found in the bundled rules file.
- No software tests were run because the change adds JSON database research data only, under the current `AGENTS.md` rule.

## Review record

- [WP08 granulated-sugar liquid-sweetener proposal](../../proposals/wp08-granulated-sugar-liquid-sweetener-review-20261016.md)
