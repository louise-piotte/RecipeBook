# WP08 R1072 — vegetable oil to canola oil in named cake formulas

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This is the only proposed file change. No shared catalog JSON, ledger, plan, roadmap, generated file, recipe, or code was edited; no software tests were run.
- **Scope:** Online substitution research for the accepted generic `ingredient-ref-vegetable-oil` identity. This review covers only recipe contexts that directly list canola oil as an option in the same measured oil slot. It does not expand oil identities, aliases, measurements, or product rosters.

## Recommendation summary

| Ingredient | Recommended research state | Supported context | Active rule |
| --- | --- | --- | --- |
| `ingredient-ref-vegetable-oil` | `researched_supported`, limited to the named recipe formulas below | Sally McKenney's Red Velvet Cake and German Chocolate Cake both list canola or vegetable oil in one measured cake-batter slot. | None. The evidence is attached to named formulas. The resolver can match dish-type tags, but cannot restrict a rule to these exact source recipes; role and cooking-method restrictions are rejected. |

This is a directional ledger recommendation from vegetable oil to canola oil in two specific cake formulas. The source's ingredient lines offer them as same-slot alternatives; neither page reports a side-by-side bake test. Do not turn the evidence into a universal oil equivalence or an automatic reverse rule.

## Why this is a distinct open gap

WP08 section 08 requires online research for accepted ingredients and source-bounded context, amount, adjustment, effect, and limitation records. The verified generic vegetable-oil reference remains `not_yet_researched` for substitutions. This target is distinct from R1065 (jackfruit seeds and Matsumae-zuke), R1066 (breadcrumbs), and R1069 (kale).

The accepted generic identities `ingredient-ref-vegetable-oil` and `ingredient-ref-canola-oil` are both categorized `FAT_AND_OIL`. Their ledger rows keep the identities separate: vegetable oil is source-unspecified, while canola oil names a specific edible-oil source. The vegetable-oil measurement state remains `blocked_pending_evidence`; this review proposes no density, unit mapping, or volume-to-mass conversion.

The bundled recipe corpus contains nine vegetable-oil ingredient lines across cakes, waffles, bao, chocolate galettes, and refried beans. Recipe 091, *Red Velvet Cake with Cream Cheese Frosting*, has a 240 ml vegetable-oil line with an existing note that canola oil also works. Recipe 114, *German Chocolate Cake*, already says “canola or vegetable oil” in its ingredient text. The source pages below confirm those formula-specific choices. Do not extend the cake evidence to the other oil uses or rewrite either recipe line.

Both bundled substitution-rule files currently contain zero rules. The contextual resolver requires a matching positive dish-type tag. It rejects any rule with role restrictions or a cooking-method restriction, and it cannot identify a named source recipe. A generic cake rule would exceed these recipe-specific findings; no active global or contextual rule or recipe-line link is proposed.

The WP08 queue review found no commercial-only lead for this selected target. Any brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only oil roster is out of scope because commercial-product counts do not add ingredient diversity; none was pursued. No existing branded catalog rows or their scoped evidence were reused or changed.

## Supported contexts

### 1. Sally McKenney's Red Velvet Cake with Cream Cheese Frosting

The source ingredient list gives **1 cup (240 ml) canola or vegetable oil**. It is one oil slot in a two-layer cake that also contains butter. The method creams butter with sugar, adds the oil with the egg yolks, vanilla, and vinegar, alternates dry ingredients with buttermilk, folds in separately whipped egg whites, and bakes two 9-inch layers at 350°F for 30–32 minutes.

The quantity is the source formula's stated amount for either named choice in that ingredient slot. This is not a separate measurement of each oil, a controlled comparison, or an independently established unit conversion. The page describes the cake as moist and soft but does not attribute a result difference to canola versus vegetable oil. It gives no oil-specific adjustment.

The source page is the original source already attached to bundled recipe 091. That recipe's 240 ml vegetable-oil line and existing “Canola oil also works” note align with the source. This review proposes only ledger evidence; it does not alter the recipe or convert its amount into a reusable measurement.

### 2. Sally McKenney's German Chocolate Cake

The source ingredient list gives **1/2 cup (120 ml) canola or vegetable oil** for a three-layer chocolate cake. The method mixes the oil with eggs, sour cream, buttermilk, and vanilla, pours the wet ingredients into the dry ingredients, adds hot water or coffee, then bakes three 9-inch layers at 350°F for 21–25 minutes.

As in the red-velvet formula, the amount belongs to this recipe's shared oil slot. It does not establish a general mass or volume ratio for other recipes, oils, or methods. The source reports no comparative flavor, texture, rise, structure, or yield effect between the two choices, and specifies no canola-specific adjustment.

This source page is already attached to bundled recipe 114. Its current ingredient line names both options. Keep the line and its current generic reference unchanged; do not add an inferred recipe-line substitution link.

## Candidates considered and scoped out

| Candidate or evidence | Disposition |
| --- | --- |
| Canola oil in the two Sally's Baking cake formulas | **Supported narrowly.** Each recipe line names canola and vegetable oil as choices and gives its own amount. Record as two formula-specific findings; do not combine their amounts. |
| King Arthur Baking's *Cake Guide* | **Qualitative corroboration only.** Under “Vegetable Oil Cake,” the guide recommends a neutral-flavoured oil such as vegetable or canola oil and describes gentle mixing. It gives no substitute amount or direct comparison, so it does not broaden the findings or set a ratio. |
| King Arthur Baking's *No-Roll Pie Crust* | **Not transferred to cakes.** Its formula allows 7 tablespoons (85 g) of canola, vegetable, olive, or peanut oil for one 9-inch crust. This supports choices in that distinct crust formula, not a transferable cake amount. No RecipeBook vegetable-oil pie-crust line matches it. |
| Avocado or coconut oil in the Sally red-velvet page's reader comments | **Not proposed.** A staff reply says either could work in a pinch but may taste different from the more neutral vegetable or canola oil; it does not state a replacement amount. Do not infer a ratio or generalize to other cake formulas. |
| Olive oil and peanut oil | **Not proposed for this target finding.** King Arthur lists them alongside vegetable and canola oil only in its no-roll pie-crust formula. Do not transfer that source's choice to cake batter. |
| Butter, applesauce, or yogurt | **Not accepted as oil replacements in this review.** The reviewed sources do not give a direct amount and adjustment for these candidates in either named vegetable-oil cake formula. The red-velvet formula separately uses butter and oil; that does not support removing or replacing either fat. |
| Any vegetable oil use outside the named cakes | **Out of scope for this evidence.** Waffles, bao, galettes, beans, sautéing, and frying have different formula roles or methods not established by these cake sources. |

No flavor, nutrition, smoke-point, allergy, or dietary equivalence is inferred. Keep source-unspecified vegetable oil separate from canola oil; do not turn `canola oil` into an alias for vegetable oil.

## Proposed ledger disposition

If accepted, update only the existing `ingredient-ref-vegetable-oil` ledger row's `substitutionResearchState` to `researched_supported` and append two source records and two findings. Preserve its existing identity decision, CFIA source, blocked measurement state, null default density, empty unit mappings, the full `ingredient-ref-canola-oil` row, and all recipe lines and notes. Do not add an active rule, recipe-line link, form, alias, measurement, density, unit conversion, or new ingredient reference.

Evidence strength is **moderate and recipe-specific**: an established baking author directly lists both oils in the same measured slot in two formulas, but does not report a controlled comparison or transferable performance effect.

### Finding 1: `vegetable-oil-canola-red-velvet-cake-r1072-20261019`

- `researchState`: `researched_supported`
- `fromIngredientRefId`: `ingredient-ref-vegetable-oil`; no form specified.
- `replacements`: `ingredient-ref-canola-oil`, **1 cup (240 ml)**, as the same source ingredient-line choice.
- `context`: Sally McKenney's Red Velvet Cake with Cream Cheese Frosting; creamed butter/sugar batter, oil added with yolks and flavourings, dry ingredients alternated with buttermilk, whipped whites folded in, then two 9-inch layers baked at 350°F for 30–32 minutes.
- `basis`: The recipe line states “1 cup (240ml) canola or vegetable oil.” Retain that same-slot quantity for this formula only. It is not a head-to-head result, a global volume equivalence, or a measurement conversion.
- `adjustments`: None stated for choosing canola rather than vegetable oil. Keep the rest of the recipe method unchanged only within this source formula.
- `expectedEffects`: The source reports no comparative effect attributable to the oil choice.
- `limitations`: Exact named formula only. No transfer to other cakes, waffles, breads, pie dough, frying, or sautéing; no reverse inference; no effect or measurement claim for other oil identities.
- `sourceIds`: `WP08-R1072-VEGOIL-S01`.

### Finding 2: `vegetable-oil-canola-german-chocolate-cake-r1072-20261019`

- `researchState`: `researched_supported`
- `fromIngredientRefId`: `ingredient-ref-vegetable-oil`; no form specified.
- `replacements`: `ingredient-ref-canola-oil`, **1/2 cup (120 ml)**, as the same source ingredient-line choice.
- `context`: Sally McKenney's German Chocolate Cake; wet ingredients include the named oil, eggs, sour cream, buttermilk, and vanilla; the wet mix is added to dry ingredients with hot water or coffee, then baked in three 9-inch layers at 350°F for 21–25 minutes.
- `basis`: The recipe line states “1/2 cup (120ml) canola or vegetable oil.” Preserve this quantity and mixing/baking context with this formula only; do not combine it with Finding 1 or generalize it.
- `adjustments`: None stated for choosing canola rather than vegetable oil.
- `expectedEffects`: The source reports no comparative effect attributable to the oil choice.
- `limitations`: Exact named formula only. Do not transfer the amount or claim to other chocolate cakes or baking roles; no reverse inference, generalized ratio, or product-specific oil claim.
- `sourceIds`: `WP08-R1072-VEGOIL-S02`.

Do not activate either finding. The current resolver cannot enforce these named-formula boundaries. Dish-type matching alone would expose a rule to other cakes; the resolver refuses role or method restrictions, and it cannot match a specific source recipe.

## Queries recorded

Searches and page reviews were conducted on 2026-10-19. Search results were used to identify original culinary pages; the linked pages were opened and checked for their ingredient lines, method, amount, and limits.

- `site:kingarthurbaking.com "vegetable oil" "canola oil" substitute baking`
- `vegetable oil canola oil substitute equal amounts cake recipe test kitchen`
- `site:americastestkitchen.com canola oil vegetable oil substitute cake`
- `King Arthur Baking "vegetable oil" "canola oil" cake guide`
- `Sally's Baking Addiction red velvet layer cake "1 cup" "canola or vegetable oil"`
- `"vegetable oil" "canola oil also works" cake test kitchen`
- Direct page review of Sally's Baking Addiction, *Upgraded German Chocolate Cake*.

The America's Test Kitchen domain search was blocked by robots.txt; no inaccessible page content was used.

## Sources and locators

IDs prefixed `WP08-R1072` are proposal-local; they are not allocated shared-ledger IDs. All pages below were reviewed on **2026-10-19**.

| ID | Source | Locator, support, and limits |
| --- | --- | --- |
| **WP08-R1072-VEGOIL-S01** | Sally McKenney, Sally's Baking, [*Red Velvet Cake with Cream Cheese Frosting*](https://sallysbakingaddiction.com/red-velvet-layer-cake-with-cream-cheese-frosting/). | Recipe ingredient list: 1 cup (240 ml) canola or vegetable oil. Recipe context and method: lines/steps for a two-layer cake with butter, oil, separated eggs, buttermilk, and a 350°F bake. The source offers both in one recipe slot; it gives no side-by-side oil test or comparative effect. This is also the source URL already attached to bundled recipe 091. `sourceKind: culinary_reference`. |
| **WP08-R1072-VEGOIL-S02** | Sally McKenney, Sally's Baking, [*Upgraded German Chocolate Cake*](https://sallysbakingaddiction.com/german-chocolate-cake/). | Recipe ingredient list: 1/2 cup (120 ml) canola or vegetable oil. Directions: mix oil with eggs, sour cream, buttermilk, and vanilla, combine with dry ingredients and hot water/coffee, and bake three layers at 350°F for 21–25 minutes. Formula-specific option only; no comparative effect or transferable ratio. This is also the source URL already attached to bundled recipe 114. `sourceKind: culinary_reference`. |
| Qualitative corroboration, not used for a ratio | King Arthur Baking, [*Cake Guide*](https://www.kingarthurbaking.com/learn/guides/cake). | “Vegetable Oil Cake” section: recommends a neutral-flavoured oil, such as vegetable or canola oil, and gentle mixing. The guide has no replacement amount or direct comparison; it does not widen the two formula-scoped findings. `sourceKind: test_kitchen`. |
| Considered, separate context | King Arthur Baking, [*No-Roll Pie Crust*](https://www.kingarthurbaking.com/recipes/no-roll-pie-crust-recipe). | Ingredient line lists 7 tablespoons (85 g) canola oil, vegetable oil, olive oil, or peanut oil for one 9-inch crust; directions mix oil with cold water, then combine with dry ingredients. This is not transferred to cake batter. `sourceKind: test_kitchen`. |

## Final proposal

- Recommend `substitutionResearchState: researched_supported` for `ingredient-ref-vegetable-oil`, limited to the two named Sally's Baking cake formulas and their separate amounts above.
- Preserve both generic oil identities and all existing rows; add no aliases or branded evidence.
- Preserve the vegetable-oil measurement state as `blocked_pending_evidence` and add no reusable measurement or conversion.
- Add no active rule, recipe-line substitution link, form, or recipe edit because the app cannot enforce the exact source context.
