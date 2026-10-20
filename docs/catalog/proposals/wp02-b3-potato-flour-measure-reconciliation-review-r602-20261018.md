# WP02 B3 R602 — potato-flour portion-weight reconciliation

- **Reviewed:** 2026-10-18.
- **Status:** Integrated 2026-10-18. Four source-specific portion observations were added to the existing potato-flour ledger record; the plan, roadmap, and integration README record the disposition.
- **Scope:** Reconcile the historical USDA common measure with current manufacturer/product-chart evidence for `ingredient-ref-potato-flour`. Do not reopen its identity, aliases, or previously recorded yeast-bread substitution findings.
- **Plan anchors:** The unchecked flour/starch group is at [line 3042](../../RecipeBook-global-ingredient-catalog-plan.txt#L3042); the broader WP02 parent remains open at [line 15893](../../RecipeBook-global-ingredient-catalog-plan.txt#L15921).
- **Disposition:** Preserve the USDA SR28 historical `1 cup = 160 g` observation. Add the current Bob’s Red Mill `1/4 cup = 45 g`, King Arthur chart `1/4 cup = 46 g`, King Arthur package recipe `1/4 cup = 43 g`, and King Arthur package Nutrition Facts `3 tablespoons = 30 g` as separate observations. No common measure protocol or generic mapping is supported, so `measurementState` is `blocked_pending_evidence`; density remains null and mappings remain empty.

## Evidence and limits

Bob’s Red Mill’s current [Potato Flour product page](https://www.bobsredmill.com/product/potato-flour) identifies its product as ground from whole peeled and dehydrated russet potatoes and lists a Nutrition Facts serving of `1/4 cup (45 g)`. The label does not give the cup capacity or filling method.

King Arthur’s [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) lists Potato Flour as `1/4 cup = 1 5/8 ounces = 46 g`. The chart warns that its values may differ from recipe-site gram amounts because of rounding and similar factors and advises using the weight specified in the recipe. It gives no row-specific fill method.

King Arthur’s current [Potato Flour SKU 100157 product page](https://shop.kingarthurbaking.com/items/potato-flour) links a package PDF. The [package PDF](https://shop.kingarthurbaking.com/content/packaging/100157_1.pdf) separately lists `1/4 cup (43 g)` in its Rosemary Potato Rolls recipe and `3 tablespoons (30 g)` as the Nutrition Facts serving. The recipe ingredient amount is not the nutrition serving. The PDF provides no measure procedure that reconciles either quantity with the chart.

These are product, chart, recipe, and nutrition-label declarations with different contexts. They are not averaged, converted to a common cup weight, or treated as density. The existing USDA SR28 value remains a dated US common-measure observation, not a Canadian measure or general mapping. No form, active conversion, or substitution rule was added; the existing source-scoped yeast-bread findings are unchanged.

## Integrated ledger data

The existing `ingredient-ref-potato-flour` record now includes:

| Observation ID | Source context | Value |
| --- | --- | --- |
| `potato-flour-bobs-red-mill-quarter-cup-45g-r602-20261018` | Bob’s Red Mill product Nutrition Facts serving | 1/4 cup = 45 g |
| `potato-flour-king-arthur-chart-quarter-cup-46g-r602-20261018` | King Arthur Ingredient Weight Chart | 1/4 cup = 46 g |
| `potato-flour-king-arthur-package-recipe-quarter-cup-43g-r602-20261018` | King Arthur package Rosemary Potato Rolls ingredient | 1/4 cup = 43 g |
| `potato-flour-king-arthur-package-nutrition-three-tbsp-30g-r602-20261018` | King Arthur package Nutrition Facts | 3 tablespoons = 30 g |

The chart reuses existing ledger source ID `WP07-KAB-IWC` for its existing URL. New source IDs are scoped to the Bob’s Red Mill page, the King Arthur current product page, and its directly linked packaging PDF. No active catalog reference changed; default density remains null and unit mappings remain empty.

## Demand and verification scope

The manifest-listed recipe corpus contains 114 files and 1,123 ingredient rows; a scan found no potato-flour text or ingredient-reference link. The active reference has no attached form, and the current substitution-rule files contain no potato-flour-linked rule. R602 changes only database evidence plus its proposal, batch README, checklist entry, and roadmap line. No app tests, build, emulator run, or deployment were needed under `AGENTS.md`.
