# WP04 Proposal: Chipotle-in-Adobo Count Portion Candidate

**Review date:** 2026-10-10
**Status:** Proposal-only evidence review. No canonical references, forms, ledger records, recipes, plan items, or code were changed.
**Scope:** One exact plant-food count line outside the recent fresh-produce count reviews: a preserved chipotle pepper in adobo. The catalog keeps this compound product in `SAUCE_AND_CONDIMENT`; this review concerns the pepper counted by the recipe line and adds no identity or form.

## Disposition

Keep recipe `007#3` at one `chipotle in adobo`, count unit, and leave its count-to-mass or edible-portion relationship unavailable. The publisher gives an exact count but no mass, product brand, package size, drainage instruction, or amount of adobo included with the pepper. The current manufacturer source confirms that chipotles are dried and smoked jalapeño chiles packed in a multicomponent sauce and lists several can sizes, but it gives no one-pepper mass. A can size or volume serving cannot be treated as the mass of one pepper.

No reliable primary source retrieved in this review matched the recipe's unbranded, one-pepper quantity with a gram weight and a clear pepper-versus-adobo basis. Recommend a blocked evidence disposition if this research result is later integrated. Do not add a numeric ledger observation, active count mapping, density, package yield, edible-portion yield, or recipe edit.

## Exact bundled recipe demand and current catalog state

| Field | Current value / finding |
|---|---|
| Recipe | `007` — *Refried Pinto Beans*; its parent source recipe is *Mexican Inspired Bento Box Lunch*. |
| Ingredient line | `4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-3` (`007#3`). |
| Exact bundled text | `1 chipotle in adobo, minced`. |
| Structured amount | `quantity: 1`, `unit: "count"`; preparation is minced / émincé. |
| Existing reference | `ingredient-ref-chipotle-in-adobo`, displayed as `chipotle in adobo` / `chipotle en adobo`, category `SAUCE_AND_CONDIMENT`; default density is null and unit mappings are empty. |
| Existing form coverage | No ingredient form is linked to this reference. |
| Existing ledger state | `measurementState: not_yet_researched`; no sources or observations are recorded on the reference. |
| Source method | The publisher's method calls for a “spoonful” of chipotle in adobo, sautéed with garlic for 30–60 seconds before adding the whole can of beans with its liquid. It does not define the spoon or state a pepper mass or how much adobo accompanies the counted pepper. |

The current package-amount integration for this recipe is on a separate line, `007#4` (one can of pinto beans with liquid). This proposal does not revisit that package fact.

## Corpus and prior-review check

The live manifest names 114 recipe files containing 1,123 ingredient rows. A full scan of those lines found one match for `ingredient-ref-chipotle-in-adobo` and for the exact phrase `chipotle in adobo`: `007#3`. No other bundled recipe adds a second count, mass, or preparation basis for this item.

This line is outside the recent WP04/WP12 produce-count review table because its active reference is a compound condiment. The WP06 Mexico/Central America identity reviews mention `007#3` while separating dried chipotle from the existing adobo product; they do not report a count weight. The recent WP04 package integration covers `007#4`, not this pepper line. The line is therefore a distinct remaining plant-food count-evidence gap, not a repeat of the tomato-paste/pinto package case, the cherry/garlic/leek/pepper count reviews, or the excluded tuna, egg, chicken, butter, cocoa, and ham work.

## Measurement dimensions and evidence limits

| Dimension | Supported | Still unknown / do not infer |
|---|---|---|
| **Count** | One chipotle in adobo in this source recipe. | The source does not say whether this count refers to one whole chile selected from a can, a standard-sized chile, or a prepared serving. |
| **Product state** | GOYA describes its product as jalapeño chiles that are dried, smoked, and packed in a sauce; its ingredient statement lists the peppers and sauce ingredients. | The recipe names no brand or SKU, and no label was found that ties a one-pepper amount to the publisher's product. Do not equate every brand or pepper size. |
| **Mass / count weight** | No gram or ounce weight is stated for the recipe's one pepper. | Do not derive grams from a can's net contents, a serving volume, a nutrition serving, or an unrelated pepper portion. |
| **Edible versus as-purchased basis** | The recipe says the pepper is minced and cooked with garlic before beans are added. | It does not say whether the pepper is drained, rinsed, weighed with adobo, or accompanied by a specified spoonful of sauce. Do not claim an edible-portion or refuse factor. |
| **Package and sauce** | The manufacturer lists 7 oz, 12 oz, and 28 oz can sizes for its product. | These are package net sizes, not a pepper count, pepper mass, drained amount, or pepper-to-sauce ratio. Do not create a package yield or can-to-pepper rule. |
| **Cooking / yield** | The pepper is sautéed briefly before the beans are simmered. | No cooked mass, moisture change, retained sauce amount, or recipe yield per pepper is published. |
| **Other dimensions** | The recipe uses a minced pepper. | No density, volume equivalence, substitution, or fresh/dried/rehydrated cross-form mapping is supported. |

## Recommendation and future acceptance checks

**Recommendation: hold the numeric portion as blocked pending an exact source.** Preserve the existing count line and identity. If the coordinator later records this review, it may classify measurement research as `blocked_pending_evidence`; until then the live ledger remains unchanged.

Accept a later source-specific `count_weight` observation only if the source directly identifies the counted unit and reports a mass for that exact product and basis. The observation must preserve:

1. whether the value is for one whole chile, one drained chile, or chile plus adobo;
2. brand, product/SKU, region, and source version where given;
3. raw/as-purchased versus drained/edible basis, and the preparation state before or after cooking;
4. the reported source quantity, exact value/unit/precision, method, source URL/title/date/locator, and access date.

If a source reports only a volume serving for chipotle peppers in sauce, keep it as that product's source-specific volume-to-mass portion if otherwise eligible; do not relabel it as one pepper. If a product label reports package net contents only, treat that as package data and require separate evidence for pepper count or usable pepper mass. A future branded observation must not resolve the current unbranded recipe line unless the source recipe or user identifies a matching product.

Do not change the recipe's `1 count`, add a form, set a default density or unit mapping, create a reusable package-yield observation, or infer a post-sauté weight. Keep all observations ledger-only; no runtime conversion or substitution is authorized by this source review.

## Remaining coverage gaps

- This exact chipotle line has no count-to-mass evidence, and the pepper-versus-adobo basis is unresolved.
- The recipe's brand/SKU and individual pepper size are unspecified; manufacturer package sizes do not fill that gap.
- The other held produce/herb rows remain governed by the existing WP04/WP12 reviews. This proposal does not change the unresolved onion, scallion, banana, potato, corn, tomato, carrot, celery, citrus, basil, rosemary, or asparagus portion cases.
- No other animal-food count candidate is advanced here: the recent animal-food audits already cover the current pork-rack, pork-shoulder, chicken-breast, tuna, and egg count evidence, while the recent package work is package evidence rather than edible-portion evidence.

## Sources and access

All web sources below were directly opened on **2026-10-10**. No numeric observation was copied from a secondary nutrition or conversion site.

| ID | Primary source | Evidence used and limits |
|---|---|---|
| **WP04-CHIPOTLE-COUNT-20261010-S01** | Ethan Chlebowski, [Mexican Inspired Bento Box Lunch](https://www.ethanchlebowski.com/cooking-techniques-recipes/mexican-inspired-bento-box-lunch), published February 5, 2023; “Refried Beans” ingredients and method. | The ingredient list states `1 chipotle in adobo, minced`; the method calls for a “spoonful” of chipotle in adobo, sautéed with garlic before adding a whole can of pinto beans with liquid. This is the original recipe basis for the count and process, but the spoon measure is undefined and does not state how much pepper versus sauce is used. The source gives no brand, net size, pepper mass, or drained/edible basis. |
| **WP04-CHIPOTLE-COUNT-20261010-S02** | GOYA Foods, [Chipotle Peppers in Adobo Sauce](https://www.goya.com/en/products/chipotle-peppers-in-adobo-sauce/), product description and ingredient statement. | The manufacturer defines this GOYA product as dried, smoked jalapeño chiles packed in sauce; lists 7 oz, 12 oz, and 28 oz sizes and sauce ingredients. It publishes no one-pepper mass or pepper-to-sauce ratio. This is product-identity and package evidence only, not a count portion for recipe 007. |
| **Local corpus** | [Bundled recipe 007](../../../app/src/main/assets/seed/bundled-library/recipes/007-haricots-pinto-refrits-refried-pinto-beans-4392bc3d-9785-43ac-b98e-496f96c1d628.v1.json), ingredient line 3; current references, forms, and ledger. | Checked on 2026-10-10. Confirms the exact amount/unit, existing reference, no linked form, empty ledger sources/observations, and current `not_yet_researched` state. |
| **Related identity reviews** | [WP06 Mexico/Central America gap sweep](wp06-mexico-central-america-gap-sweep-20261009.md) and [WP06 dried-chile boundary review](wp06-mexican-dried-chile-boundaries-20261009.md). | Both mention this recipe line only for existing compound-product identity and the separation of dried chipotle from chipotle in adobo. They do not establish a count weight or edible portion. |
| **Related package integration** | [WP04 recipe package amounts integration](../batches/wp04-recipe-package-amounts-integration-20261010/README.md). | Covers `007#4` pinto-bean can contents and `086#12` tomato-paste package quantity. It does not cover `007#3` or a chipotle portion. |

## Proposal-only conclusion

Recipe `007#3` is an exact, previously unreviewed plant-food count line. The source confirms one chipotle in adobo, then uses an undefined “spoonful” in its brief sauté method. The manufacturer confirms the product's smoked/dried pepper and sauce composition; neither provides a matching one-pepper mass or edible basis. Keep the count unchanged and the measurement unavailable until a primary source reports an exact product-specific portion.

## Coordinator integration result

Recorded the recipe-specific research gap under `ingredient-ref-chipotle-in-adobo`: the count remains one, but measurement is `blocked_pending_evidence` with no numeric observation or runtime mapping. The identity is now source-verified. Recipe 007#3 and its `count` unit, minced preparation, wording, and quantity are unchanged.
