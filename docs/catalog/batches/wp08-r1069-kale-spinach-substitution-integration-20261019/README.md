# WP08 R1069 — kale and spinach in baked egg dishes

## Finding

The generic kale record now has two separate, recipe-specific findings for generic spinach:

- Food Network’s *Cheesy Kale Breakfast Casserole* lists 6 oz chopped kale and says spinach works in that slot. Keep its recipe amount and casserole method with that formula.
- The Associated Press strata recipe lists 4 oz (about 1 cup packed) greens and names spinach and chopped kale as options. Keep the amount and approximate cup note with that strata formula.

These sources support choices inside their named recipes. They do not establish a universal kale-to-spinach equivalence, transfer either amount to RecipeBook recipe 027, identify a spinach form, or support an active rule.

## Integration

- Added the two source records and findings under the existing `ingredient-ref-kale` ledger record; its substitution research state is `researched_supported` for this scoped evidence.
- Left the generic spinach record, baby-leaf form, and all RecipeBook recipe lines unchanged. Added no form, measurement, conversion, recipe link, or active rule.
- No brand-, product-line-, flavour-family-, SKU-, retailer-variant-, or commercial-roster work was pursued. Existing branded entries and product-scoped evidence remain intact; commercial-product counts do not add ingredient diversity.

## Verification

The Food Network ingredient line explicitly pairs its 6-ounce chopped-kale slot with spinach as an option. AP’s recipe lists spinach and chopped kale among the options in its four-ounce greens slot and gives an approximate packed-cup note. The ledger schema, source linkage, findings IDs, and UTF-8/no-BOM checks passed. No software tests were run because the change only adds research data to the database JSON under `AGENTS.md`.

## Sources

- [Food Network — Cheesy Kale Breakfast Casserole](https://www.foodnetwork.com/recipes/cheesy-kale-breakfast-casserole-7999546)
- [Associated Press — To feed a crowd for Easter brunch, bake your eggs](https://apnews.com/article/ee84e6bc11d1e0651017f5e0d45f1f0c)

See the [R1069 proposal](../../proposals/wp08-next-generic-substitution-review-r1069-20261019.md).
