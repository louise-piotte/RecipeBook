# WP08 R1082 — rolled oats to quick oats in one blended Air Fryer Baked Oats recipe

- **Reviewed:** 2026-10-19.
- **Status:** Integrated. Added one source and a formula-scoped substitution finding to the existing rolled-oats ledger row. No seed catalog, recipe, generated file, or active substitution rule changed. No software tests were run because the change only adds database JSON research data under `AGENTS.md`.
- **Scope:** Online substitution research for the accepted generic rolled-oats identity. The supported direction is rolled oats to quick oats in Healthful Blondie’s named *Air Fryer Baked Oats* formula only. This is not a universal oat conversion or a general recommendation for baked oatmeal.

## Recommendation summary

| Ingredient | Proposed research state | Supported context | Active rule |
| --- | --- | --- | --- |
| **ingredient-ref-rolled-oats** | **researched_supported**, bounded to Healthful Blondie’s one-serving *Air Fryer Baked Oats* formula | RecipeBook line **001#1** lists 1/2 cup old-fashioned rolled oats. The source says quick oats also work in the formula and attributes that option to blending all ingredients before cooking. It does not separately print a quick-oats amount or ratio. | None. Recipe 001 has no **DISH_TYPE** tag, and the resolver cannot scope a rule to this named recipe. |

This finding would record a source-supported option for one formula. It does not establish a global rolled-oats-to-quick-oats substitution rule. It would not claim equal texture, flavour, absorption, cooking time, nutrition, or performance in other oat recipes. Do not infer the reverse direction.

## Why this is an open gap

WP08 calls for curated directional substitutions with their source context, amount basis, adjustments, exclusions, and evidence. The verified generic rolled-oats identity remains **not_yet_researched** with no substitution findings. This candidate is separate from integrated R1075 (beef broth to water in one chili formula), R1076 (pork dry rub identity and RecipeBook line), and R1079 (ground beef to ground lamb in one Shepherd’s Pie formula).

The chosen ingredients are existing generic identities in the same **GRAIN_AND_CEREAL** category. They remain separate identities. This proposal adds no alias, form, quantity conversion, density, unit mapping, or identity merge.

## Exact RecipeBook demand and linked-identity audit

A read-only scan of the bundled recipe files found four linked rolled-oat or quick-oat ingredient lines:

| RecipeBook line | Saved ingredient and text | Scope disposition |
| --- | --- | --- |
| **001#1**, [*Air Fryer Baked Oats*](../../../app/src/main/assets/seed/bundled-library/recipes/001-air-fryer-baked-oats-0a8b29b8-faf0-4597-8514-e09335de6c03.v1.json) | 1/2 cup old-fashioned rolled oats; linked to **ingredient-ref-rolled-oats**. Recipe source metadata points to Healthful Blondie’s matching page. | Direct match. The source explicitly permits quick oats for this particular blended, single-serving formula. |
| **065#1**, *Overnight Oats* | 1 part rolled oats; linked to **ingredient-ref-rolled-oats**. | Do not transfer the baked-oats recommendation to overnight oats. No substitution option is saved on this line. |
| **024#6**, *Date Squares* | 175 g quick oats; linked to **ingredient-ref-quick-oats**. | Separate formula and amount. This is quick-oat demand, not evidence that rolled oats can replace it. |
| **047#4**, *Chocolate Galettes* | 1 1/2 cups quick oats; linked to **ingredient-ref-quick-oats**. | Separate formula and amount. No transfer from recipe 001. |

The source’s recipe card describes one serving and lists the rolled-oat baseline as 1/2 cup. Its substitution section and FAQ name quick oats as an option but do not restate the quantity. Record the baseline slot and amount as context only; do not encode an inferred 1:1 quantity or a volume or mass conversion for quick oats.

## Supported context and method

Healthful Blondie’s *Air Fryer Baked Oats* is a single-serving batter blended before air frying. The page’s “Ingredients needed” section names old-fashioned rolled oats as the tested ingredient, permits quick oats, and excludes steel-cut oats. Its “How to make” section and recipe-card directions blend the base ingredients for 20–30 seconds, then add mix-ins. The recipe card cooks the ramekin at 290°F for 12–15 minutes, checking around 7 minutes. The FAQ explains that both oat choices are suitable in this formula because the ingredients are blended before cooking.

The page does not specify a quick-oats-specific liquid, time, or method adjustment and provides no side-by-side result. The author also advises changing only one or two ingredients so the formula does not change substantially. The proposed substitution changes one ingredient. The page’s stated fluffy, moist, soft-crumb result describes the recipe generally; it is not a comparison proving the same result with quick oats.

If a cook relies on the page’s gluten-free note, it says to use certified gluten-free oats. This note remains scoped to the source recipe and does not establish a new allergen or safety claim.

## Other source options and boundaries

| Source | Exact locator and relevant statement | Use in this proposal |
| --- | --- | --- |
| Healthful Blondie, [*Air Fryer Baked Oats*](https://healthfulblondie.com/air-fryer-baked-oats/) | “Ingredients needed” (oats bullet); “How to make,” step 2; “Ingredient substitutions,” rolled-oats bullet; “Frequently Asked Questions,” quick-oats question; recipe card, ingredients, instructions, and notes. The recipe card lists “½ cup old-fashion rolled oats”; the FAQ says quick oats can be used in this air-fryer baked-oatmeal recipe because all ingredients are blended first. | Primary support for the exact RecipeBook line and context. If accepted, use one proposal-local source ID, **WP08-R1082-OATS-S01** (**sourceKind: culinary_reference**). |
| Feel Good Foodie, Yumna Jawad, [*Baked Oats (TikTok Recipe)*](https://feelgoodfoodie.net/recipe/baked-oats/comment-page-10/) | “Ingredients & substitutions,” rolled-oats bullet; “How to make baked oats,” steps 1–2; recipe card, ingredients and blender instruction. It lists quick oats as an option for its own one-serving blender recipe, whose card lists 1/2 cup rolled oats. | Independent same-method example only. Its 1/2-cup quantity and formula are not a replacement amount for Healthful Blondie’s recipe. Proposal-local source ID **WP08-R1082-OATS-S02**; not included in the proposed finding’s sourceIds. |
| The Kitchn, [*Healthy Baked Oatmeal: The Easiest Make-Ahead Method*](https://www.thekitchn.com/healthy-baked-oatmeal-the-easiest-make-ahead-method-252030) | “For Your Information” says not to use quick-cooking oats for this recipe because their texture is too fine; the method stirs rather than blends the oats, refrigerates the mixture overnight, and then bakes it. | Counterexample establishing a different method boundary. It does not refute the directly stated blender formula. Proposal-local source ID **WP08-R1082-OATS-S03**; not included in the proposed finding’s sourceIds. |
| Food Network, [*What Are Rolled Oats?*](https://www.foodnetwork.com/how-to/packages/food-network-essentials/what-are-rolled-oats) | “Rolled Oats Versus Quick Oats” and “Substitute for Rolled Oats.” The general advice discusses recipes that add oats directly to a batter, such as muffins or cookies, and suggests extra liquid in that context because quick oats absorb more as the batter rests or cooks. | Boundary only. Do not transfer its extra-liquid advice to this formula, where the base ingredients are blended and no oat-specific adjustment is stated. Proposal-local source ID **WP08-R1082-OATS-S04**; not included in the proposed finding’s sourceIds. |

The other source options show why the recommendation must stay with the named blending method. They do not supply a transferable amount, comparison, or adjustment for RecipeBook’s recipe 001.

## Proposed ledger finding

If accepted, update only the existing **ingredient-ref-rolled-oats** ledger row: set **substitutionResearchState** to **researched_supported** and append this one directional finding. Keep the existing measurement state, references, aliases, observations, decisions, and recipe data unchanged.

**Finding ID:** rolled-oats-to-quick-oats-healthful-blondie-air-fryer-baked-oats-r1082-20261019

- **researchState:** researched_supported.
- **fromIngredientRefId:** ingredient-ref-rolled-oats.
- **replacements:** ingredient-ref-quick-oats, with no quantity field. The source supports the option in the same oat slot but does not restate a replacement quantity. Keep the recipe-card baseline of 1/2 cup rolled oats in the context only.
- **context:** Healthful Blondie’s one-serving *Air Fryer Baked Oats* formula, represented by RecipeBook line **001#1**. The oats and other base ingredients are blended for 20–30 seconds before cooking in a ramekin in an air fryer.
- **basis:** The source’s ingredient note and substitution section say quick oats work in this formula; its FAQ attributes this to blending all ingredients before cooking.
- **adjustments:** Follow the source’s blending and cooking method as written. The page gives no quick-oats-specific liquid, temperature, timing, or preparation adjustment. Do not import Food Network’s different batter-resting adjustment.
- **expectedEffects:** The author gives no comparison of rolled oats with quick oats. Do not promise unchanged texture, flavour, moisture, or outcome.
- **limitations:** Limit to this named formula and RecipeBook line **001#1**. Do not infer a replacement quantity, 1:1 conversion, inverse direction, or transfer to overnight oats, date squares, chocolate galettes, other baked-oatmeal recipes, or other methods. The author explicitly excludes steel-cut oats for this formula. Preserve the source’s certified-gluten-free note only as recipe-scoped guidance.
- **sourceIds:** WP08-R1082-OATS-S01 only.

## Resolver disposition

Both bundled substitution-rule arrays are empty. Recipe line **001#1** has no substitution link. Its tags resolve to **MEAL** (breakfast and brunch), **APPLIANCE** (air fryer), and **EFFORT** (quick); none is **DISH_TYPE**. The resolver derives positive recipe context from **DISH_TYPE** tags and applies the same context checks to explicit links. It has no named-recipe condition or role/method boundary. Do not add a contextual rule or a recipe-line substitution link: neither would reliably keep this source-specific option on recipe 001.

## Identity and source-ownership audit

- **ingredient-ref-rolled-oats** is a verified generic **GRAIN_AND_CEREAL** reference. Its active English aliases include old-fashioned oats and old-fashioned rolled oats; its French alias is gros flocons d'avoine. Density is null, unit mappings are empty, no form is attached, and its substitution state is not_yet_researched.
- **ingredient-ref-quick-oats** is a separate verified generic **GRAIN_AND_CEREAL** reference. Its current English alias is quick-cooking oats; its French alias is avoine à cuisson rapide. Density is null, unit mappings are empty, and no form is attached. Keep its separate substitution findings for the named meatloaf-binder and Scottish-oatcake contexts unchanged.
- Healthful Blondie’s URL is already stored as the source metadata for RecipeBook recipe 001. The exact URL has no source record in the research ledger at this audit. If integrated, add one source record to the rolled-oats row using **WP08-R1082-OATS-S01**; do not duplicate this recipe source on quick oats or unrelated references.
- The rolled-oats and quick-oats ledger rows retain existing manufacturer, directory, terminology, and product-serving evidence. Preserve every existing branded entry and product-scoped observation; no measurement or claim from those entries was used or transferred in this review.
- No commercial-only roster was researched. The Section F cereal-roster clause and the previously dispositioned Anson Mills, Nu Life Market/Dempsey, and Mochiko/Shiratamako product-only leads remain out of scope because commercial-product counts do not add ingredient diversity; stop those lines. More generally, any queued brand-, product-line-, flavour-family-, SKU-, retailer-variant-, or commercial-roster-only item across any ingredient category is out of scope for the same reason. Preserve all existing branded entries and their product-specific evidence.

## Queries and review record

Online searches and direct page reviews were made on 2026-10-19:

- quick oats rolled oats substitute blended baked oatmeal recipe quick oats rolled oats site:*.com recipe
- quick oats substitution baked oatmeal rolled oats recipe site:foodnetwork.com OR site:thekitchn.com OR site:allrecipes.com
- “quick oats” “baked oats” “rolled oats” recipe substitution
- Direct review of the Healthful Blondie, Feel Good Foodie, The Kitchn, and Food Network pages listed above.

Search results identified candidate options; the linked source page and its recipe card were opened for the primary finding. The alternate pages were reviewed only to check method boundaries. No product roster or brand-specific claim was researched.

## Final disposition

- Propose one ledger-only finding for rolled oats to quick oats, limited to Healthful Blondie’s blended *Air Fryer Baked Oats* formula and RecipeBook line **001#1**.
- Do not create a global rolled-oats-to-quick-oats substitution rule or infer the reverse direction.
- Preserve 1/2 cup only as the source recipe’s rolled-oat baseline; add no quick-oats quantity or ratio.
- Add no active global or contextual rule, recipe-line substitution link, recipe edit, form, density, unit mapping, measurement, or identity merge.
- Preserve existing branded identities and all source-specific measurements, claims, and substitution evidence.
- **No software tests run:** this is a proposal-only documentation change; the parent agent will review and integrate any accepted ledger change separately.
