# WP02 Section A7 R635 — durum-semolina portions

**Status:** Accepted and integrated on 2026-10-18.

## Change

Added five directly published portions to the existing `ingredient-ref-durum-semolina` research-ledger row. Its `measurementState` is now `researched_supported`; `substitutionResearchState` remains `not_yet_researched`. The observations preserve their product-label, manufacturer-chart, package-formula, and test-kitchen contexts.

The active ingredient reference is unchanged: default density remains null, unit mappings remain empty, and no form, alias, active conversion, package yield, recipe link, or substitution was added. None of these observations is an identity-wide volume-to-mass mapping.

## Evidence and scope

- Bob's Red Mill's product page gives its Semolina Flour label portion as 1/4 cup (45 g). Its weight chart lists 1 cup (180 g); the chart's 1/4-cup (45 g) cell repeats the product-label value, so it was not added as a duplicate observation. [Product page](https://www.bobsredmill.com/product/semolina-pasta-flour), [flour weight chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart).
- King Arthur's SKU 100227 product page identifies the coarse durum-wheat product. Its package separately prints a 3-tablespoon (28 g) Nutrition Facts serving and a Semolina Sandwich Bread amount of 2 3/4 cups (448 g). [Product page](https://shop.kingarthurbaking.com/items/semolina-flour), [package PDF](https://shop.kingarthurbaking.com/content/packaging/100227_1.pdf).
- King Arthur's Semolina Pasta formula lists 1 3/4 cup (285 g), plus unquantified sprinkling flour, and instructs readers to weigh the flour or gently spoon it into a cup and sweep off excess. This stays recipe-specific. [Recipe](https://www.kingarthurbaking.com/recipes/semolina-pasta-recipe).

No values were averaged, scaled, or converted into density or active measuring behavior. Substitution research remains open.

## Validation

- The research ledger contains 2,199 records and passes its custom validation with zero errors.
- Source IDs and observation IDs were checked for ownership; the Bob's chart entry reuses its existing source ID for the same URL.
- The manifest-listed corpus contains 114 recipes and 1,123 ingredient rows; no durum-semolina or semolina phrase matched, so no recipe link was added.
- No software tests, build, or emulator run were needed because the change only adds database JSON evidence under `AGENTS.md`.

See the [R635 proposal](../../proposals/wp02-a7-next-grain-meal-gap-review-r635-20261018.md), [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt#L2094), [catalog workflow](../../ingredient-catalog-workflow.md), and [research ledger](../../research-ledger.v1.json). Section A7 remains open.
