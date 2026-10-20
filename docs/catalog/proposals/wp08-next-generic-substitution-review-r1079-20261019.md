# WP08 R1079 — ground beef to ground lamb in one Shepherd’s Pie formula

- **Reviewed:** 2026-10-19.
- **Status:** Reviewed and integrated on 2026-10-19. Added one source-scoped finding to the existing ground-beef ledger row. No active rule, recipe-line substitution link, recipe edit, or runtime behavior changed. No software tests were run because the application change only adds database JSON under `AGENTS.md`.
- **Scope:** Online substitution research for the accepted generic `ingredient-ref-ground-beef` identity. The only supported direction is its source-stated ground-lamb option in The Wholesome Dish’s *The Best Classic Shepherd’s Pie*. This does not establish a general ground-meat exchange or a general ground-beef-to-lamb rule.

## Recommendation summary

| Ingredient | Recommended research state | Supported context | Active rule |
| --- | --- | --- | --- |
| `ingredient-ref-ground-beef` | `researched_supported`, limited to The Wholesome Dish’s named *The Best Classic Shepherd’s Pie* formula | The source gives **1 lb. 90% lean ground beef—or ground lamb** in one filling slot. RecipeBook recipe `078#3` retains that same option and amount. | None. The resolver cannot restrict a contextual rule to recipe `078`; a `main-dish` scope would also reach the beef-chili and meatloaf lines. The generic lamb reference also does not preserve the source’s “ground” qualifier. |

This recommendation records one directional, formula-specific choice. It does not claim that beef and lamb have identical flavor, fat content, nutrition, safety properties, or performance across recipes. Do not infer a reverse direction.

## Why this is an open gap

WP08 remains in review and calls for directional substitutions with source context, adjustments, exclusions, and evidence. Before R1079 integration, the verified generic ground-beef identity had `substitutionResearchState: not_yet_researched` and no `substitutionFindings`. This target is distinct from [integrated R1075](wp08-next-generic-substitution-review-r1075-20261019.md) (water in Ricardo’s *Classic Beef Chili*) and [R1076](../batches/wp02-wp07-wp08-r1073-r1076-generic-gap-integration-20261019/README.md) (the generic pork dry-rub identity and its linked recipe line).

The source page was already recorded for `ingredient-ref-ground-beef` to preserve the exact RecipeBook `078#3` line and its local ground-lamb note. Earlier [ground-meat qualifier](wp04-section-o-ground-meat-qualifier-review-20261010.md) and [generic-lamb identity](wp04-section-o-generic-lamb-identity-review-r1010-20261019.md) reviews correctly rejected using that line as a **general** substitution or as generic lamb demand. This review proposes a single recipe-scoped finding for the exact choice the source makes; it does not broaden the earlier evidence or change the catalog identity boundary.

## Active identity and linked-recipe audit

- `ingredient-ref-ground-beef` is the verified generic `PROTEIN` reference `ground beef / bœuf haché`. It has no aliases, default density, or unit mappings. Its ledger row has no substitution findings and remains `not_yet_researched`.
- `ingredient-ref-lamb-meat` is the verified generic `PROTEIN` identity `lamb / agneau`. It is not a ground-lamb identity: it has no `ground lamb` alias or ground form. Use it as the replacement reference only while keeping “ground” in the source-recipe context; do not create a ground-lamb alias or form here.
- A read-only scan of the bundled 114-recipe corpus found three linked ground-beef lines:

| RecipeBook line | Saved ingredient and link | Demand audit |
| --- | --- | --- |
| [`078#3`, *Shepherd’s Pie*](../../../app/src/main/assets/seed/bundled-library/recipes/078-pate-chinois-shepherd-s-pie-d356eec5-b3c4-4e22-b943-63900317e569.v1.json) | `1 lb. 90% lean ground beef -or ground lamb`; linked to `ingredient-ref-ground-beef`; English and French notes preserve the lamb option. | Direct match to the linked source’s same-slot choice. Keep the line and notes unchanged. |
| [`034#4`, *Classic Beef Chili*](../../../app/src/main/assets/seed/bundled-library/recipes/034-chili-classique-au-boeuf-classic-beef-chili-4cbff09a-679f-420c-89e2-4175fb8e8662.v1.json) | `1 kg ground beef`; linked to `ingredient-ref-ground-beef`. | A separate source formula with no lamb option in the bundled line. Do not transfer `078#3`’s choice. |
| [`074#1`, *Meatloaf*](../../../app/src/main/assets/seed/bundled-library/recipes/074-pain-de-viande-meatloaf-35267f47-fcd6-4d69-9124-c6e8ac85aa57.v1.json) | `1 1/2 lb ground beef`; linked to `ingredient-ref-ground-beef`. | A separate source formula with no lamb option in the bundled line. Do not transfer `078#3`’s choice. |

The two bundled substitution-rule arrays are empty. The resolver indexes contextual rules by source ingredient and exposes them when recipe dish-type tags match. It requires a positive dish-type match and rejects role and cooking-method restrictions; it has no named-recipe condition. All three ground-beef recipes carry `tag-main-dish`. An explicit line link still receives these same context checks, so it would not keep the suggestion on `078#3` alone. Do not add a contextual rule or a recipe-line substitution link.

## Supported context: The Wholesome Dish’s *The Best Classic Shepherd’s Pie*

The author says the recipe is written for ground beef or ground lamb, typically uses beef because it is widely available, and would choose lamb for a special occasion. The recipe serves six. Its meat-filling ingredient line reads **“1 lb. 90% lean ground beef -or ground lamb.”** The recipe method adds either meat to the sautéed onion, seasons it with parsley, rosemary, thyme, salt, and pepper, and browns it for 6–8 minutes. The remaining instructions make one shared filling with garlic, Worcestershire sauce, flour, tomato paste, beef broth, peas and carrots, and corn; the filling is topped with mashed potatoes and baked.

The printed one-pound amount applies to the shared ingredient slot in this formula. The printed `90% lean` modifier precedes ground beef only; the source does not give a lean percentage for the lamb option. The same method is provided for both choices, but the source reports no side-by-side test, comparative flavor or texture result, separate lamb adjustment, or evidence that either choice needs the same timing in other recipes.

## Other source options and boundaries

| Candidate or evidence | Disposition |
| --- | --- |
| Ground lamb in The Wholesome Dish’s formula | **Supported narrowly.** The source names ground lamb in the same measured slot as ground beef. Retain 1 lb only for this formula and RecipeBook line `078#3`. |
| Ground lamb in The Kitchn’s *Shepherd’s Pie* | **Independent recipe-context corroboration only.** The recipe lists 1½ lb ground lamb, lean ground beef, or a combination for 6–8 servings and says to brown the chosen meat. This is its own formula and amount; do not use 1½ lb as a conversion or transfer its combination option to RecipeBook’s recipe. |
| Food Network Kitchen’s *Beef-and-Lamb Shepherd’s Pie* | **Not a replacement finding.** It lists 12 oz ground beef **and** 12 oz ground lamb. That is a mixed-meat formula, not a same-slot choice or a one-for-one amount. |
| Ground turkey, mentioned in The Kitchn’s helpful-swaps section | **Not proposed.** It is outside the option saved by RecipeBook’s linked source and would be a separate contextual finding. |
| Ground lamb in chili, meatloaf, or other ground-beef uses | **Not transferred.** No source reviewed here recommends it for those lines. |

No brand-, product-line-, flavour-family-, SKU-, or retailer-variant roster was researched. Commercial-product counts do not add ingredient diversity. No branded identity or product-specific evidence was used or changed.

## Integrated ledger disposition

Integrated disposition: update only the existing `ingredient-ref-ground-beef` ledger row’s substitution state to `researched_supported` and append one source-scoped finding. Preserve the identity, measurement state, current source records and decisions, `ingredient-ref-lamb-meat`, all recipe files, and every existing branded row and its evidence.

**Finding ID:** `ground-beef-ground-lamb-wholesome-dish-shepherds-pie-r1079-20261019`

- `researchState`: `researched_supported`.
- `fromIngredientRefId`: `ingredient-ref-ground-beef`; the source specifies a ground preparation in this formula.
- `replacements`: `ingredient-ref-lamb-meat`, with `1 lb` as the source’s same-slot amount in this formula. Do not transfer the `90% lean` modifier to lamb or create a generic ground-lamb measure/form.
- `context`: The Wholesome Dish’s six-serving *The Best Classic Shepherd’s Pie*. The ground meat is browned with seasonings, then cooked into a gravy with garlic, Worcestershire sauce, flour, tomato paste, broth, and vegetables; the filling is topped with mashed potato and baked.
- `basis`: The source explicitly names ground lamb as the alternative in the same one-pound ingredient line. This is recipe guidance, not a controlled comparison, a mass conversion, or a general ground-meat ratio.
- `adjustments`: The source gives the same recipe method for ground beef or ground lamb and no lamb-specific seasoning, liquid, timing, or fat adjustment. Its method says to brown the selected meat for 6–8 minutes in this formula only.
- `expectedEffects`: The author distinguishes the traditional lamb version from the beef version by dish naming and says lamb is a special-occasion choice. No comparative sensory, texture, yield, or cooking result is reported.
- `limitations`: Restrict the finding to this exact formula and RecipeBook `078#3`. Do not transfer to chili `034#4`, meatloaf `074#1`, other recipes, other ground-meat identities, or an inverse lamb-to-beef direction. The lamb’s grinding state is source-specific because the active replacement reference is generic lamb. Do not infer lamb’s fat percentage from `90% lean`, or claim nutritional, allergen, dietary-safety, or product equivalence.
- `sourceIds`: `WP04-GROUND-BEEF-90-20261010-S01` only. This already-owned source directly supports the exact recipe option; the comparison pages below do not broaden the finding.

Do not activate a global or contextual rule and do not add a recipe-line substitution link. Recipe `078#3` already retains the publisher’s note. Runtime suggestions would either lose the source’s ground-meat qualifier or leak to other `tag-main-dish` recipes.

## Ownership audit

- The primary source URL is already owned by `ingredient-ref-ground-beef` as `WP04-GROUND-BEEF-90-20261010-S01`; reuse that source ID rather than registering a duplicate. The same recipe URL also appears under `ingredient-ref-frozen-peas-and-carrots` and `ingredient-ref-parmesan-cheese`, each with its own ingredient-specific locator and support. Those records remain untouched; no pea/carrot or cheese evidence is transferred to the substitution finding.
- Earlier WP04 reviews attached this page to the ground-beef row for its exact source wording and recipe-local choice, and explicitly kept it from becoming a general substitution or a separate generic ground-lamb catalog demand. This proposal keeps both limits and treats the choice only as a named-formula finding.
- The Kitchn and Food Network Kitchen URLs below had no exact URL owner in the shared ledger at this audit. Their source IDs are proposal-local and are not added to the shared ledger here.
- The source pages are generic culinary references. No manufacturer, brand, retailer, or commercial-product claim was used. Preserve all existing branded entries and product-scoped evidence.

## Queries recorded

Searches and direct page reviews were conducted on **2026-10-19**. Search results located the pages; the recipe and ingredient-card sections were opened and reviewed for the choices, amounts, serving yield, method, and limits.

- `site:thewholesomedish.com/the-best-classic-shepherds-pie "1 lb" "ground lamb"`
- `ground beef ground lamb same amount shepherd's pie recipe ground lamb option recipe source`
- `ground beef can be replaced by ground lamb shepherd's pie recipe amount culinary source`
- `ground lamb substitute for ground beef in shepherd's pie source recipe`
- Direct review of The Wholesome Dish, The Kitchn, and Food Network Kitchen source pages below.

## Sources and locators

| ID | Source | Exact locator, support, and limits |
| --- | --- | --- |
| **WP04-GROUND-BEEF-90-20261010-S01** (existing shared source) | The Wholesome Dish, Amanda Finks, [*The Best Classic Shepherd’s Pie*](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/). | “Irish Shepherd’s Pie” paragraph says the recipe is written for ground beef or ground lamb and describes the author’s usual choice; recipe card, “Meat Filling” ingredient list: `1 lb. 90% lean ground beef -or ground lamb`; serves six; method “Make the Meat Filling,” brown chosen meat for 6–8 minutes with seasonings, then add the remaining filling ingredients; finish by baking under mashed potatoes. Direct support for this source formula only. The `90% lean` qualifier is not assigned to the lamb option. `sourceKind: culinary_reference`. |
| **WP08-R1079-BEEF-S02** (proposal-local; not registered) | The Kitchn, Patty Catalano, [*Shepherd’s Pie*](https://www.thekitchn.com/shepherds-pie-recipe-23634685). | “Key Ingredients in Shepherd’s Pie” and “Helpful Swaps”; recipe card yield 6–8 and ingredient list `1 1/2 pounds ground lamb, lean ground beef, or a combination`; method step 2 browns the selected meat. Supports another formula’s named options and amount only. It is not the amount basis for RecipeBook `078#3`, and no comparative test result is claimed. `sourceKind: culinary_reference`. |
| **WP08-R1079-BEEF-S03** (proposal-local; not registered) | Food Network Kitchen, [*Beef-and-Lamb Shepherd’s Pie*](https://www.foodnetwork.com/recipes/food-network-kitchen/beef-and-lamb-shepherds-pie-3364518). | Recipe card ingredients list 12 oz ground beef and 12 oz ground lamb; direction 3 cooks both together. Reviewed as a mixed-meat boundary example only. It does not support replacement of the full beef amount by lamb. `sourceKind: culinary_reference`. |

## Final disposition

- Set `substitutionResearchState: researched_supported` for `ingredient-ref-ground-beef`, limited to the one ground-lamb choice in The Wholesome Dish’s named formula.
- Preserve the source’s 1 lb same-slot amount and keep `90% lean` attached only to the beef wording.
- Keep the separate 1½ lb Kitchn and 12 oz + 12 oz Food Network quantities scoped to their own recipes; the mixed-meat formula is not a substitute amount.
- Add no active global/contextual rule, recipe-line link, recipe edit, ground-lamb alias/form, measurement, density, mapping, or conversion.
- Preserve all existing generic and branded identities and their source-scoped evidence.
- **No software tests run:** this application change only adds database JSON under `AGENTS.md`; no runtime behavior changed.
