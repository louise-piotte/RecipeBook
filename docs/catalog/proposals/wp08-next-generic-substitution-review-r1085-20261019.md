# WP08 R1085 — breakfast sausage to mushroom in one Breakfast Casserole formula

- **Reviewed:** 2026-10-19.
- **Status:** Integrated. One source-scoped finding was added to the existing generic breakfast-sausage ledger row; no seed catalog, recipe, rule, link, or runtime data changed. No software tests were run because the change only adds research data to database JSON under `AGENTS.md`.
- **Scope:** Review the generic `ingredient-ref-breakfast-sausage` to generic `ingredient-ref-mushroom` option named in Preppy Kitchen’s current *Breakfast Casserole* formula. The option is limited to that source formula and its method. It does not establish a general sausage-to-mushroom substitution or support RecipeBook line `027#1`.

## Integrated finding summary

| Ingredient | Integrated research state | Supported context | Amount | Active rule |
| --- | --- | --- | --- | --- |
| `ingredient-ref-breakfast-sausage` | `researched_supported`, with one source-specific finding | Preppy Kitchen’s current *Breakfast Casserole*, which uses ground pork sausage and explicitly suggests mushrooms for its meat-free variation | No mushroom amount or ratio is stated. The source’s 2 lb sausage is only the baseline amount in its own 12-serving formula. | None. The resolver cannot enforce this named-recipe boundary. |

The source names mushrooms as one vegetable option with umami flavor. Its adjacent option, sun-dried tomatoes, is also unquantified; it is noted as a source boundary and is not included in this proposal’s finding. No amount, ratio, cooking adjustment, or equivalent texture/result is inferred for mushrooms.

## Why this is an open gap

WP08 calls for online, directional substitution research that retains the ingredient, recipe context, amount basis, adjustments, limits, and uncertainty. At review start, the verified generic breakfast-sausage identity had `substitutionResearchState: not_yet_researched` and no findings. The current Preppy Kitchen page contains a specific meat-free mushroom option, supporting one formula-scoped finding.

RecipeBook’s linked recipe is not the same formula as the page currently published at the same URL. That source/version conflict is material and prevents transferring the current page’s choice to RecipeBook line `027#1`. This review records the current web formula as its own named context and keeps the bundled recipe unchanged.

## Recipe demand and linked-identity audit

A read-only scan of the 114 manifest-listed recipes found this demand:

| RecipeBook line | Saved ingredient and text | Scope disposition |
| --- | --- | --- |
| **027#1**, [*Breakfast Casserole*](../../../app/src/main/assets/seed/bundled-library/recipes/027-casserole-dejeuner-breakfast-casserole-9015696d-4126-49ee-91f5-578d66061fd9.v1.json) | `1 lb breakfast sausage`, linked to `ingredient-ref-breakfast-sausage`; the saved recipe serves eight. | Recipe demand for the generic identity, but **not an exact match** to the current source page. Do not attach the source option to this line, use its 1 lb amount as a replacement basis, or edit its text. |
| **037#7** and **037#12**, *Cream of Mushroom Soup* | `1 lb white mushrooms, sliced` and additional sautéed mushrooms to taste, linked to `ingredient-ref-mushroom`. | Separate recipe and context; not sausage substitution evidence. |
| **089#3**, *Mushroom and Ham Quiche* | `1/2 box mushrooms`, linked to `ingredient-ref-mushroom`. | Separate recipe and context; not sausage substitution evidence. |

RecipeBook `027#1` serves eight and includes onion, kale, toasted English muffins, eggs, milk, and cheese. Its method browns the breakfast sausage, softens onion, wilts kale, combines the mixture with toasted muffin cubes and eggs, chills covered for at least two hours or overnight, then bakes covered and uncovered. The current web page instead describes a 12-serving hashbrown, bell-pepper, green-onion casserole. The shared URL does not make the two formulas interchangeable.

## Supported source context and method

Preppy Kitchen’s page is authored by John Kanell and shows an update date of November 29, 2023. In “What You Need to Make This Recipe,” its sausage paragraph describes ground pork sausage as providing classic breakfast-sausage flavour. The recipe card is for 12 servings in a 9×13-inch pan and lists 2 lb ground pork sausage with frozen shredded hash browns, red bell pepper, green onion, eggs, milk, and cheddar.

The “Pro Tips For Making This Recipe” meat-free note says to skip the sausage and replace it with a vegetable such as sun-dried tomatoes or mushrooms for umami flavour. The same note appears in the recipe-card notes. This is direct support for mushrooms as an option in this source formula; neither passage gives a mushroom quantity, a ratio, or an instruction for preparing the mushrooms.

The method browns and breaks up the sausage in a skillet, removes it with a slotted spoon while leaving the drippings, cooks hash browns, bell pepper, and green onion in that skillet for about five minutes, then mixes the cooked components with the egg mixture and cheese. It bakes the casserole at 350°F for about 55 minutes and rests it for five minutes. The meat-free note does not say whether mushrooms should be sautéed, how to manage their moisture, or how the no-sausage method relates to the skillet drippings. These details must not be filled in by assumption.

## Integrated source-scoped ledger finding

Integration updated only the existing `ingredient-ref-breakfast-sausage` ledger row: it set `substitutionResearchState` to `researched_supported` and appended the one formula-specific finding below. Its identity, earlier sources and decisions, measurement state, recipe data, and all other ledger rows remain unchanged.

**Finding ID:** `breakfast-sausage-to-mushroom-preppy-kitchen-breakfast-casserole-r1085-20261019`

- **`researchState`:** `researched_supported`.
- **`fromIngredientRefId`:** `ingredient-ref-breakfast-sausage`. In this source formula, the sausage ingredient is specified as ground pork sausage; this finding does not make a species claim about the generic breakfast-sausage identity or extend to other sausage classes.
- **`replacements`:** `ingredient-ref-mushroom`, with no quantity field. Do not use the source’s 2 lb sausage amount as a mushroom amount or infer a 1:1 amount. The 2 lb is only the source formula’s sausage baseline.
- **`context`:** Preppy Kitchen’s current 12-serving, 9×13-inch *Breakfast Casserole* with ground pork sausage, hash browns, bell pepper, green onion, egg, milk, and cheddar. The meat-free note suggests mushroom in this particular casserole formula. RecipeBook `027#1` is recorded as linked demand for breakfast sausage, but is not attached to this finding because its saved ingredients and method differ materially from the current page.
- **`basis`:** The author’s “Pro Tips For Making This Recipe” and recipe-card notes directly name mushrooms as one vegetable option when omitting the sausage. The recipe card itself gives no mushroom amount.
- **`adjustments`:** The source gives no mushroom-specific preparation, skillet order, fat/liquid replacement, seasoning change, temperature, timing, or other adjustment. Its sausage browning and retained-drippings instructions cannot be assumed to describe mushroom preparation. The source’s separate 350°F/approximately 55-minute casserole direction remains only for its formula as written.
- **`expectedEffects`:** The author characterizes mushrooms as an umami-flavoured meat-free option. No comparison or evidence establishes matching flavour, texture, structure, protein, yield, moisture, or cooking result.
- **`limitations`:** Limit this finding to the current named Preppy Kitchen formula and its stated meat-free option. Do not infer an amount, conversion ratio, inverse direction, or recommendation for RecipeBook `027#1`, another casserole, other sausage identities/species, other vegetables, or other methods. The source labels the variation meat-free; this does not establish vegan, allergen-safe, nutrition-equivalent, or food-safety claims. Do not treat the adjacent sun-dried-tomato option as an amount or as part of a multi-ingredient replacement.
- **`sourceIds`:** `WP08-R1085-SAUSAGE-S01` only, registered on the breakfast-sausage ledger row.

## Resolver disposition

Both bundled substitution-rule arrays are empty. RecipeBook `027#1` has no substitution link and carries breakfast/brunch meal tags, oven appliance tag, and a shareable tag; it has no positive `DISH_TYPE` tag. The resolver requires a matching positive dish-type scope for contextual rules, applies the same context checks to explicit links, and has no named-recipe condition. It also does not apply the source’s named cooking-method boundary. Do not add an active contextual rule or a recipe-line link: neither can safely encode this source-only recommendation for the local recipe.

## Identity and source-ownership audit

- `ingredient-ref-breakfast-sausage` is the existing verified generic `PROTEIN` reference `breakfast sausage / saucisse à déjeuner`. It has no aliases, density, or unit mappings. Its ledger row now contains this one formula-scoped substitution finding and is marked `researched_supported`. Its earlier Canadian regulatory, OQLF, and Québec product-class sources remain unchanged; no product-specific species or formulation claim from them is used here.
- `ingredient-ref-mushroom` is the verified generic, species-unspecified `VEGETABLE_AND_AROMATIC` reference `mushroom / champignons`, with the grammatical English plural alias `mushrooms`. It has no density or unit mappings; its substitution state is `not_yet_researched`. No mushroom species, form, amount, or preparation is inferred.
- The exact Preppy Kitchen URL also appears on `ingredient-ref-cheddar-cheese` as `WP04-Q-CHEESE-20261010-S36`, with a cheddar-specific locator and support note. That record remains unchanged; its source claim about cheddar is not transferred to the sausage row. The same URL is separately registered under breakfast sausage using `WP08-R1085-SAUSAGE-S01` and its sausage/mushroom-specific locator. Do not duplicate the page as evidence on the mushroom row without a separate ingredient-specific reason.
- Existing branded breakfast-sausage entries and their product-specific evidence remain untouched. No brands, product lines, flavours, SKUs, retailer variants, or commercial rosters were researched. Such commercial-only work is out of scope because commercial-product counts do not add ingredient diversity; stop those lines. Preserve all existing branded identities and do not transfer their product claims or measurements.

## Source and review record

Reviewed online on **2026-10-19**. The RecipeBook source metadata provided the page URL; the direct page and recipe card were opened and checked. No commercial-product search or roster work was performed.

| ID | Source and exact locator | Supported scope |
| --- | --- | --- |
| **WP08-R1085-SAUSAGE-S01** (registered on the breakfast-sausage row) | Preppy Kitchen, John Kanell, [*Breakfast Casserole*](https://preppykitchen.com/breakfast-casserole/), updated Nov 29, 2023. “What You Need to Make This Recipe,” sausage paragraph; “How to Make Breakfast Casserole,” steps 1–2; “Pro Tips For Making This Recipe,” meat-free bullet; recipe card “Ingredients,” “Instructions,” and “Notes,” especially the meat-free note. | Supports a qualitative mushroom option for the current ground-pork-sausage formula. The current recipe card lists 2 lb sausage for 12 servings. No mushroom amount, ratio, preparation method, or comparative result is stated. This source is separately recorded for breakfast sausage; the earlier cheddar record remains cheddar-specific. `sourceKind: culinary_reference`. |

## Final disposition

- Integrated one ledger-only finding for generic breakfast sausage to generic mushroom, confined to Preppy Kitchen’s current named *Breakfast Casserole* formula.
- Keep the source’s 2 lb ground-pork-sausage amount as that formula’s baseline only; add no mushroom amount, ratio, or method.
- Do not apply the finding to RecipeBook `027#1`; the bundled formula is materially different from the current page at the same URL.
- Add no active global/contextual rule, recipe-line substitution link, recipe edit, form, density, unit mapping, measurement, or identity change because the resolver cannot enforce the named-formula boundary.
- Preserve all existing generic and branded identities and evidence, including the cheddar row’s source-specific record for the same URL.
- **No software tests run:** integration only added research data to an existing database JSON record under `AGENTS.md`; no seed catalog, recipe, or runtime behavior changed.
