# WP02 A7 R110: light caramelized barley malt flour

## Disposition

Added identity-only `light caramelized barley malt flour / farine de malt d'orge légèrement caramélisée` as `ingredient-ref-light-caramelized-barley-malt-flour`, category `FLOUR_AND_STARCH`.

Castle Ingredients' current English and French listings name CaraBelga 30 as a light caramelized barley malt flour and list roasted barley malt products separately. The French wording is manufacturer-attested, not an OQLF ruling or independent Québec approval, so the display remains provisional. Keep the row separate from roasted barley malt flour, ordinary malted barley flour, roasted barley flour, and generic malt flour. Treat `non-diastatic` as a product-specific specification, not a form or universal class property.

The row has no aliases, density, unit mappings, forms, recipe links, conversions, yields, or substitutions. The 114-recipe / 1,123-row bundle has no matching product-name demand. Product-family listings and the adjacent IREKS product do not support a transferable household measure or substitution.

## Evidence and review

- Castle Ingredients, [English Malt Flours listing](https://www.shop.castle-ingredients.com/shop/category/baking-flours-malt-15?order=name+asc).
- Castle Ingredients, [French bakery-flour listing](https://www.shop.castle-ingredients.com/fr/shop/category/farines-de-boulangerie-9).
- IREKS North America, [Aroma Barley Malt K](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-barley-malt-k), reviewed only as a distinct roasted-product neighbor.
- Detailed ownership, picker, recipe-demand, and source boundaries are in the [R110 proposal](../../proposals/wp02-a7-light-caramelized-barley-malt-flour-review-20261014.md); accepted source entries and decisions are in the [research ledger](../../research-ledger.v1.json).

## Static checks

- Ingredient-reference normalization and bundled-package validation passed.
- The generated catalog index contains 1,452 references, including the new row.
- Ledger schema and source-reference validation passed.
- Static picker projection and the 114-recipe / 1,123-row corpus scan found the expected exact-name result and no recipe demand.
- UTF-8/no-BOM, local-link, and whitespace checks passed.
- No application tests were run; the active change only adds database JSON data and its generated catalog entry, under the updated `AGENTS.md` rule.

WP02 A7 and independent Québec French review remain open.
