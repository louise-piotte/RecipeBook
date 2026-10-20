# WP08 R1069 - kale to spinach in baked egg dishes

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This is the only proposed file change. No shared JSON, ledger, plan, roadmap, generated file, recipe, or code was edited; no software tests were run.
- **Scope:** Online substitution research for the verified generic `ingredient-ref-kale` identity in specific baked egg-dish contexts. This is generic ingredient work; no brands, product lines, flavour families, SKUs, retailer variants, or commercial rosters were pursued. Commercial-product counts do not add ingredient diversity.

## Recommendation summary

| Ingredient | Recommended research state | Finding | Active rule |
| --- | --- | --- | --- |
| `ingredient-ref-kale` | `researched_supported` for two named baked egg-dish contexts | Food Network's Cheesy Kale Breakfast Casserole lists 6 oz chopped kale and says spinach would work in that same ingredient slot. An AP-reported make-ahead strata lists 4 oz (about 1 cup packed) greens, including spinach or chopped kale. Preserve each amount and method with its own recipe context. | None. The evidence is tied to named recipe contexts, and the current rule model cannot enforce the exact recipe and preparation scope. |

This state records source-backed, recipe-specific support only. It does not establish that spinach universally replaces kale, that the two greens have identical texture or flavor, or that these amounts transfer to other recipes.

## Why this is a distinct open gap

WP08 remains `in_review` and requires direct online substitution research for accepted identities. The verified kale reference is still `not_yet_researched` for substitutions. It is distinct from the R1065 jackfruit-seed/Matsumae-zuke review and R1066 breadcrumbs/oats review. The earlier leafy-greens identity packet established kale and spinach identities but added no substitution findings. A later stinging-nettle packet records broad advice about nettle replacing spinach or kale; that is a different source ingredient and direction and is not reused or reversed here.

## Live catalog and ledger audit

`ingredient-ref-kale` is the verified generic `VEGETABLE_AND_AROMATIC` identity `kale / chou frisé`, with null density and no unit mappings. It has no forms. Its ledger row has substitution state `not_yet_researched`, no substitution findings, and one existing OQLF terminology source (`WP03K-S20`). Preserve that source and identity decision.

The accepted spinach identity is `ingredient-ref-baby-spinach`, now the generic base `spinach / épinard`; it has one separate young-leaf form, `ingredient-form-spinach-baby-leaves`. Its ledger substitution state is also `not_yet_researched`. The new sources below say spinach without specifying baby leaves, so the proposed replacement is the generic spinach reference with no form ID. Do not apply the baby-leaf form, create a frozen-spinach form, or change spinach's ledger state in this target review.

Both bundled substitution-rule files are empty and have no kale or spinach rule. RecipeBook recipe 027, *Breakfast Casserole*, uses 3 cups fresh chopped kale; its method cooks the kale with sausage and onion for two minutes before adding English muffins and egg custard, then refrigerates and bakes. The Food Network and strata source recipes below use different quantities and methods. Do not attach their amounts or replacement links to recipe 027.

The current contextual resolver needs a positive dish-type match and refuses role- or cooking-method-scoped contextual suggestions. The bundled recipe 027 has breakfast/brunch/oven/shareable tags but no dish-type tag. A broad `Casserole` or `Main Dish` rule would exceed the named recipe contexts. No active runtime rule is supported.

## Supported contexts

### 1. Food Network's Cheesy Kale Breakfast Casserole

Molly Yeh's Food Network recipe lists **6 ounces kale, chopped** and immediately notes that chard or spinach would work. The preparation method combines the green with sourdough, two cheeses, and a cooked onion/butter mixture, covers it with an egg-and-dairy custard, and bakes the casserole at 350 F for 30 minutes covered and about 30 minutes uncovered. The parenthetical is attached to the measured kale ingredient line, so the 6-ounce ingredient amount is carried by the source's spinach option in this named recipe. This is a same-slot recipe recommendation, not a separately weighed comparison or a universal mass equivalence.

The page does not report a spinach-specific preparation, liquid adjustment, flavor or texture difference, or result comparison. The recipe calls for chopped kale but does not say to pre-cook it; it does not separately describe whether/how spinach should be handled. Keep those details unknown beyond the source's statement that spinach works in the listed recipe.

### 2. Lauren Lane's make-ahead breakfast strata, as reported by AP

The AP recipe card lists **4 ounces (about 1 cup packed) greens such as arugula, spinach or chopped kale** for an eight-serving strata. The ingredient list presents spinach and chopped kale as choices in one measured greens slot. The method mixes the ingredients, covers and bakes at 350 F for 35 minutes, then uncovers and bakes until set and browned, about 15 minutes more. The source supports the stated 4-ounce selection in this strata formula; the approximate one-cup packed note is the source's observation, not an independent volume conversion.

The article describes the dish as adaptable and says the listed greens go into the same strata. It does not test greens side by side, explain any kale-to-spinach liquid change, or report a texture, flavor, color, yield, or structure difference. Do not transfer the source's amount or method to another egg bake.

## Candidates considered and scoped out

| Candidate or evidence | Disposition |
| --- | --- |
| Spinach (`ingredient-ref-baby-spinach`) for kale in Molly Yeh's named breakfast casserole | **Supported narrowly.** The same ingredient line gives 6 oz chopped kale and says spinach would work. Preserve this amount only for that formula. |
| Spinach or chopped kale in Lauren Lane's make-ahead strata | **Supported as same-slot choices.** The source lists 4 oz (about 1 cup packed) for its greens slot and names both spinach and chopped kale. Do not turn its approximate cup note into a general kale/spinach density or cup conversion. |
| Spinach in American Egg Board's Baked Eggs with Kale & Ricotta | **Recommendation noted; no separate amount finding proposed.** The recipe calls for 1 cup packed finely shredded kale with stems removed and says to substitute favorite greens such as spinach. Its tip does not restate the replacement amount or spinach preparation; keep it as qualitative corroboration, not a third ratio or active rule. |
| Frozen chopped spinach for sautéed kale in Food Network Magazine's Mix-and-Match Quiche | **Kept separate by form and method.** That formula pairs chopped, sautéed kale with frozen chopped spinach that is thawed and drained. It allows 1/2 to 1 cup total vegetables, choosing up to three, so it does not assign a separate amount to this green. Do not transfer it to the unspecified or baby-leaf spinach form, or use it to set a one-to-one amount. |
| Swiss chard | Food Network's Molly Yeh recipe also names chard as an option, but this review follows one kale-to-spinach pair. No chard ledger state or separate finding is proposed. |
| Oregon State Extension's stinging-nettle advice from R961 | **Not reused or reversed.** It is a broad suggestion for properly prepared nettle leaves to replace spinach or kale; its ledger finding remains blocked because it lacks dish role, method, amount, and adjustments. It does not support kale-to-spinach. |

No replacement is proposed for raw salads, soups, sautés, or other kale uses. No nutrition, allergen, or dietary-safety equivalence is inferred.

## Proposed ledger disposition

If accepted, update only the existing `ingredient-ref-kale` ledger row's substitution state to `researched_supported` and append two source-scoped findings. Preserve its identity, measurement state, current source and decision, recipe data, spinach reference and form, and all active catalog values. Do not add a rule or recipe-line link.

**Finding 1: `kale-spinach-cheesy-breakfast-casserole-r1069-20261019`**

- `researchState`: `researched_supported`
- `fromIngredientRefId`: `ingredient-ref-kale`; no form specified by the source.
- `replacements`: `ingredient-ref-baby-spinach`, quantity `6 oz` in the Food Network recipe's ingredient measure; no form ID.
- `context`: Molly Yeh's Cheesy Kale Breakfast Casserole; the parenthetical says spinach works in the measured chopped-kale slot. Sourdough, cheese and the green are combined with cooked onion/butter, covered with egg/dairy custard, and baked at 350 F, 30 minutes covered and about 30 minutes uncovered.
- `basis`: 6 oz to 6 oz as the same measured ingredient slot in that source recipe. This is not a head-to-head test, a weight/volume conversion, or a transferable rule.
- `adjustments`: No spinach-specific preparation or liquid/timing correction is stated. Keep the rest of the source method with this named formula only.
- `expectedEffects`: The source says spinach would work but gives no separate comparative flavor, texture, color, structure, or yield result.
- `limitations`: Exact recipe only; no transfer to recipe 027 or other casseroles, raw greens, other methods, baby spinach as a form, or generic one-to-one rule. Do not infer spinach handling or an adjustment that the source does not state.
- `sourceIds`: `WP08-R1069-KALE-S01`.

**Finding 2: `kale-spinach-make-ahead-strata-r1069-20261019`**

- `researchState`: `researched_supported`
- `fromIngredientRefId`: `ingredient-ref-kale`; no form specified by the source.
- `replacements`: `ingredient-ref-baby-spinach`, quantity `4 oz` as the source's listed greens amount; no form ID.
- `context`: Lauren Lane's eight-serving make-ahead breakfast strata as reported by AP. Spinach or chopped kale is one option for the greens slot among eggs, dairy, bread, cheese, and other additions; the source bakes covered at 350 F for 35 minutes, then uncovered until set, about 15 minutes.
- `basis`: The recipe lists 4 oz of greens, including either spinach or chopped kale; it also reports this as about 1 cup packed. Keep the 4 oz selection and approximate cup note source-bound. Do not convert between them or generalize a density.
- `adjustments`: The source gives no kale-specific or spinach-specific liquid, fat, salt, timing, or other adjustment.
- `expectedEffects`: No comparative sensory or structural effects are reported; both are listed as options in the same greens slot.
- `limitations`: Keep the finding within this named strata formula. It does not support a conversion for another casserole, an individual-greens amount when several vegetables are selected, or an active rule.
- `sourceIds`: `WP08-R1069-KALE-S02`.

Do not add an active contextual rule. The current data model cannot restrict suggestions to either named recipe, and broad dish-type matching would extend the evidence beyond its tested/recommended formulas. No line-specific substitution link is proposed for RecipeBook recipe 027; its 3 cups fresh kale and sautéed method do not match either source formula.

## Queries recorded

All searches and page reviews were done on 2026-10-19. Search snippets were used to locate sources, then the linked pages were opened for the findings recorded above.

- `kale substitute spinach breakfast casserole egg bake recipe source`
- `site:extension.* kale spinach substitute quiche recipe equal amount`
- `"kale" "spinach" substitute casserole recipe test kitchen`
- `kale spinach interchangeable quiche amounts culinary source`
- `site:foodnetwork.com/recipes/cheesy-kale-breakfast-casserole "spinach would always work"`
- `site:incredibleegg.org/recipe/baked-eggs-kale-ricotta "Substitute your favorite greens"`
- `site:apnews.com Easter breakfast recipe baked eggs strata "spinach" "chopped kale"`

## Sources and locators

All sources were opened on **2026-10-19**. IDs prefixed `WP08-R1069` are proposal-local and not allocated shared-ledger source IDs.

| ID | Source | Locator, support, and limits |
| --- | --- | --- |
| **WP08-R1069-KALE-S01** | Food Network, Molly Yeh, [*Cheesy Kale Breakfast Casserole*](https://www.foodnetwork.com/recipes/cheesy-kale-breakfast-casserole-7999546). | Ingredient line: 6 oz chopped kale, with the parenthetical “chard or spinach would always work”; Directions 1-5: sourdough-and-cheese casserole, egg/dairy custard, 350 F bake covered then uncovered. This supports spinach in the same measured ingredient slot in this named recipe, not a controlled comparison or universal equivalence. `sourceKind: culinary_reference`. |
| **WP08-R1069-KALE-S02** | Associated Press, Albert Stumm, [*To feed a crowd for Easter brunch, bake your eggs. Two chefs offer their recipes*](https://apnews.com/article/easter-breakfast-recipe-baked-eggs-ee84e6bc11d1e0651017f5e0d45f1f0c). | Lauren Lane's Make-ahead Breakfast Strata ingredient list and method: 4 oz (about 1 cup packed) greens such as arugula, spinach or chopped kale; serves 8; mix, bake covered 35 minutes at 350 F, then uncovered about 15 minutes until set. The amount is for the source's interchangeable greens slot, not a density or universal conversion. `sourceKind: culinary_reference`. |
| Considered, qualitative only | American Egg Board, [*Baked Eggs with Kale & Ricotta*](https://www.incredibleegg.org/recipe/baked-eggs-kale-ricotta/). | Ingredients, Directions, Tips: 1 cup packed finely shredded kale with stems removed; toss with oil, divide among four 8-oz ramekins; bake at 400 F for 12-15 minutes; tip says spinach is an option. The tip does not state a separate amount or spinach-specific method, so it is not used for a replacement quantity. `sourceKind: culinary_reference`. |
| Considered, frozen form only | Food Network Magazine, [*Mix-and-Match Quiche*](https://www.foodnetwork.com/recipes/articles/mix-and-match-quiche). | “Choose Your Vegetables”: 1/2 to 1 cup total, choose up to three; option line pairs chopped/sautéed kale with frozen chopped spinach, thawed and drained. This is separately scoped frozen spinach advice; it does not specify an individual amount or support a fresh/baby-leaf conversion. `sourceKind: culinary_reference`. |
| Existing identity sources, not duplicated | OQLF, [*chou frisé*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522794/chou-frise) (`WP03K-S20`); OQLF, [*épinard*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082833/epinard) (`WP03K-S04`). | Preserve the current identity source records. They support bilingual identities, not substitution. |
| Existing evidence, not reused | Oregon State University Extension Service, [*Wild Edibles: Stinging Nettle*](https://extension.oregonstate.edu/catalog/em-9373-wild-edibles-stinging-nettle) (`WP03-K-STINGING-NETTLE-LEAVES-R961-20261019-S02`). | Existing R961 source about nettle leaves in recipes that use spinach or kale. The direction is nettle-to-greens, not kale-to-spinach; its broad statement remains blocked in the nettle ledger finding. Do not duplicate the source or reverse it. |

## Final proposal

- Recommend `substitutionResearchState: researched_supported` for `ingredient-ref-kale`, limited to the two named baked egg-dish contexts and source amounts described above.
- Keep the two recipe formulas, prep methods, amount bases, and evidence limits separate; do not transfer either amount to RecipeBook's Recipe 027.
- Add no active global or contextual rule, recipe-line link, new reference, form, measurement, density, unit mapping, alias, or conversion.
- Preserve existing generic and branded references and their scoped evidence.
