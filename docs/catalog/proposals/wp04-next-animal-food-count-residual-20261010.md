# WP04 Proposal: Animal-Food and Alternative Package-Count Residual

**Review date:** 2026-10-10
**Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, code, or test files changed.
**Scope:** Recheck the current animal-food and WP04 alternative recipe lines expressed as counts or packages, excluding the prior pork-rack, pork-shoulder, chicken-breast, egg, pepper, herb, cherry, CNF-retrieval, and tuna-steak reviews.

## Disposition

The current scan found one directly sourced package descriptor for a WP04 alternative, but it is already preserved on its exact recipe line: `081#12`, one can of cream of coconut, with the existing note `15 oz can`. The linked Just A Pinch recipe page specifies one 15 oz can, so accept that wording as recipe-specific package evidence. Do not create a new package mapping, edible-portion weight, or conversion from this review.

The remaining animal-derived package-count line is `015#4`, `1 can beef broth`. The bundled recipe has no source URL; the archived RecipeKeeper export labels its source `Maman` and also gives only one can, without package content. Keep its amount unavailable. Do not infer a common can size or reuse the cream-of-coconut package descriptor.

## Current recipe and reference audit

The current manifest lists **114 recipe files and 1,123 ingredient rows**. I re-read the count/package rows across the current animal-food and WP04 alternative surface and checked their active references, forms, ledger records, and package-yield entries.

| Exact line | Current row and catalog state | Direct source evidence | Disposition |
| --- | --- | --- | --- |
| `081#12` — Pistachio Coconut Almond Cheesecake; `c838fd50-8230-4df7-bc03-a90f3928c39a-ingredient-12` | `1 can cream of coconut`; linked to `ingredient-ref-cream-of-coconut`; current notes already say `15 oz can` / `boîte de 15 oz`. Reference display is `cream of coconut / crème de noix de coco`; it has no aliases, density, or unit mappings. | The recipe's source URL is the direct Just A Pinch page. Its ingredient list specifies one 15 oz can. The source page gives yield `8+`; the bundled recipe lists 12 servings, so do not derive a per-serving package amount. | Accept the source-specific package descriptor already retained in the recipe note. No recipe edit, new package-yield record, numeric conversion, or edible-mass observation is proposed. |
| `015#4` — Beef Stroganov; `e1e7939b-206f-4839-97d9-2a91febb28eb-ingredient-4` | `1 can beef broth`; no ingredient reference is linked. The active catalog already has `ingredient-ref-beef-stock` with EN alias `beef broth` and FR alias `canette de bouillon de bœuf`; this establishes a possible existing identity match, not package content. | The bundled recipe's `source` field is absent. The archived RecipeKeeper HTML identifies the source only as `Maman` and lists one can, with no can size or external URL. Its instructions say to add the broth and simmer; they add no product or amount qualifier. | Hold package quantity and all mass/volume/edible-portion values. Do not infer a standard retail can size, concentrated-versus-ready broth, or a source link to another Stroganoff recipe. The row-level link question is outside this package-evidence proposal. |

The WP04 animal-food count lines already covered by the excluded reviews remain out of scope. Other unresolved food rows from the previous residual audit, including `027#5` (`2 cups shredded cheese`) and `058#15` (`90 ml cream`), are not count/package lines and receive no new identity evidence here.

## Product, state, and basis boundaries

- **Cream of coconut:** This is the existing `DAIRY_AND_ALTERNATIVE` reference. Keep the source's exact phrase `cream of coconut`; do not rewrite it as `coconut cream`, dairy cream, or coconut milk. The earlier [WP03 coconut-products review](wp03-coconut-products-coordinator-review-20261009.md) already covers those identity boundaries; this pass only verifies the package note. The page shows the ingredient mixed into cheesecake filling before baking. It does not provide a composition, brand, drained state, or edible-yield basis.
- **Beef broth:** The recipe names beef broth as the ingredient and uses it in a simmered dish. The local source attribution provides no manufacturer, concentration, package label, or declared net quantity. The existing beef-stock reference does not fill those evidence gaps.
- **As-purchased versus edible:** For `081#12`, the source gives a package descriptor, not a drained, edible, or post-bake portion. For `015#4`, even the package content is unstated. Neither line supports an edible-portion or cooking-yield value.
- **Species and cut:** The two remaining package rows do not name an animal cut or animal species-specific meat portion. The cream-of-coconut row is plant-derived and is included only because WP04 covers alternatives.

## Separate evidence status

| Evidence dimension | Status | Supported conclusion and limit |
| --- | --- | --- |
| **Package / count** | **One exact source descriptor; one unsupported animal package count** | Just A Pinch directly supports `081#12`'s existing `15 oz can` note. Preserve the source's package wording as recipe-specific. `015#4` remains one can with unknown contents because its local family source gives no size. |
| **Composition** | **Unavailable** | Neither source provides a product ingredient list, concentration, fat class, or standardized composition for these exact lines. |
| **Conversions / edible portion** | **Unavailable** | Do not convert the cream-of-coconut can to mass or volume, interpret its `oz` as a separate measure convention, infer edible contents, or derive cooked yield. The beef-broth can has no package amount to convert. |
| **Substitutions** | **Not researched** | No cream-of-coconut, coconut-cream, beef-broth, or stock substitution is proposed. |

The active `ingredient-ref-cream-of-coconut` ledger record is still `unreviewed` / `not_yet_researched`, with no source or measurement observations. The current package-yield file has no cream-of-coconut entry. This review does not promote the recipe note into a general product package size. The WP04 count/edible-portion fixture checkbox remains open.

## Source register

| ID | Source | Evidence and limits |
| --- | --- | --- |
| **WP04-ALT-PACKAGE-20261010-S01** | Just A Pinch, Gale LuQuette, [Pistachio Coconut Amaretto Cheesecake](https://www.justapinch.com/recipes/dessert/cake/pistachio-coconut-amaretto-cheesecake.html), ingredient list and method. | Direct source for `081#12`. The ingredient list states one 15 oz can of cream of coconut, used in the cheesecake filling before baking. This supports the exact source-specific package note only; it does not supply composition, a net edible portion, a brand, a general package-yield mapping, or a conversion. Accessed 2026-10-10. |
| **Local export only; no source ID proposed** | RecipeKeeper export, `docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes.html`, Beef Stroganov entry. | Identifies the household source as `Maman` and retains `1 can of beef broth`; no package size or external source URL is recorded. This is insufficient for a package-quantity or edible-portion observation. |

## Review boundary

Searches covered the 114 manifest-listed recipes and 1,123 ingredient rows, with count/package units cross-checked against animal-food and alternative-product terms and current reference categories. The tuna line and the explicitly excluded prior animal count lines were not re-audited for their evidence. The direct Just A Pinch source is accessible. No direct source page or package-size text is recorded for the family-sourced beef-broth line, and no other unreviewed animal-derived count/package line with exact-source amount evidence was identified.
