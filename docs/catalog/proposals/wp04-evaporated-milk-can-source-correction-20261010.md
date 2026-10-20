# WP04 Proposal: Evaporated-Milk Can Quantity Source Correction

**Review date:** 2026-10-10
**Status:** reviewed and integrated on 2026-10-10. Recipe 114 line 17 was corrected to the directly published 354 ml quantity; no reusable package conversion or yield was added.
**Scope:** One source-backed dairy package/count line not handled by the earlier WP04 count packets.

## Disposition

Correct the source-derived quantity for `114#17` — German Chocolate Cake — to the directly published recipe amount: one can, `12 ounces; 354ml` of evaporated milk. The bundled line currently says `1 can (8 ounces; 240 ml)` and stores `240 ml`; both values conflict with the currently accessible linked recipe page. Preserve the existing evaporated-milk identity and link.

Treat `354 ml` as an exact recipe-source quantity, not a new evaporated-milk conversion or a package-size default. Keep the source's paired `12 ounces; 354ml` text as written; do not infer or activate an ounce-to-millilitre mapping. Do not add a package-yield observation, form, density, count weight, edible-portion value, cooking yield, or substitution rule from this page.

## Exact recipe demand and current catalog model

| Recipe line | Live bundled data | Current reference/model | Source-backed disposition |
| --- | --- | --- | --- |
| `114#17` — German Chocolate Cake; `e2d11309-7775-4efb-981c-2c78a8d03da6-ingredient-17` | `1 can (8 ounces; 240 ml) evaporated milk`; quantity `240`, unit `ml`; linked to `ingredient-ref-evaporated-milk` | `evaporated milk / lait évaporé`, category `DAIRY_AND_ALTERNATIVE`, no aliases, null default density, no unit mappings; no linked ingredient form or package-yield observation | The linked source's filling ingredient line reads `1 can (12 ounces; 354ml) evaporated milk`. Recommend source-correcting the recipe text and structured volume to `354 ml`, while retaining one can and the existing reference. Do not change unrelated recipe quantities. |

The source page identifies this as evaporated milk, distinguishes it from sweetened condensed milk, and says the filling uses the milk before being cooked on the stove. It does not name a brand, product code, country, package label, milk-fat class, or drained/edible basis. It is recipe evidence for this exact line, not a SKU-level product specification.

The ledger record `ingredient-ref-evaporated-milk` is currently `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: existing_rule_needs_review`; it has no sources or measurement observations. A separate source-less draft cooking-cream-to-evaporated-milk rule is recorded as blocked/unresolved and was removed from the active catalog. This recipe page supplies no basis to restore that rule. `package-yields.v1.json` has no evaporated-milk entry; its only current record is for S&W canned black beans.

## Package-model fit and runtime boundary

The recipe line is specific enough to retain the source's one-can count and published `354 ml` amount on that recipe. It is not sufficient for a reusable `PackageYieldObservation`: the source is not a manufacturer/package label, gives no brand or SKU, and the active observation model requires an ingredient form; evaporated milk currently has no form. Do not invent a `canned` form solely to satisfy that model or generalize this recipe's can size to other evaporated-milk products.

The line-level `IngredientPackageAmount` shape can represent a package count/type and one declared net-size pair, but the source publishes both an ounce phrase and a millilitre amount. Keep both in the recipe's original text if the source wording is corrected. If structured package metadata is considered later, record only source-supported values and verify the package parser first: `packageAmountForIngredientLine` currently derives package `count` from `ingredient.quantity` whenever a positive quantity exists, even when the unit is a volume unit. With this hybrid line (`can` in source text, `ml` as the structured unit), that path would read the volume amount as the package count. No `packageAmount` field or package-yield record is proposed here.

The supported recipe-row correction does not create an active package-to-volume conversion. No default `can` size, net mass, density, volume-to-mass relation, or package yield is supported.

## Separate evidence status

| Evidence dimension | Status | Supported conclusion and limit |
| --- | --- | --- |
| **Identity** | Existing identity; no new row | Preserve `ingredient-ref-evaporated-milk`. The source's distinction from sweetened condensed milk supports keeping the two products separate; no new alias or form follows. |
| **Package/count** | Direct recipe evidence for one exact line | The accessible source lists one can and states `12 ounces; 354ml`. Correct the bundled source text and structured line quantity to the published amount if approved. The page is not a manufacturer package label and does not establish a universal can size. |
| **Composition** | Unavailable | The article characterizes evaporated milk as unsweetened and concentrated, but provides no product-specific label composition, solids, fat percentage, or brand. Do not add composition values. |
| **Edible portion / mass / cooking yield** | Unavailable | The source gives a volume amount used in a cooked filling. It gives no net mass, refuse, edible-mass yield, or finished-filling loss/yield. Keep those values unknown. |
| **Conversions** | No reusable relation | Preserve the direct `354 ml` source amount. Do not calculate a volume from `12 ounces`, add an ounce mapping, infer density, or convert to mass. |
| **Substitution** | Recipe-context wording only; no rule | The article says half-and-half can also be used for this filling. It does not publish a measured replacement amount or a general equivalence. Do not create a global or contextual catalog rule in this packet. |

## Remaining animal-food package candidates

The current 114-file, 1,123-row scan found this as the next accessible exact-source package discrepancy outside the prior exclusions. Other can-form rows are not silently generalized into this result:

- `026#3` — Magic Cookie Bars, `1 can (300 ml) sweetened condensed milk`, linked to the Eagle Brand recipe URL. The recorded URL returned HTTP 404 on 2026-10-10. Keep its package claim unresolved until the exact source is accessible; do not replace it with a mirror or another brand's recipe.
- `015#4` — Beef Stroganov, one can beef broth, and `081#12` — Pistachio Coconut Almond Cheesecake, one can cream of coconut, are covered by the earlier WP04 package-count packet and are not re-audited here.
- Egg, pork-rack/shoulder, chicken-breast, and tuna count/portion rows remain outside this packet under the prior review boundaries.

## Source register

| ID | Source | Evidence and limits |
| --- | --- | --- |
| **WP04-EVAP-MILK-CAN-20261010-S01** | Sally McKenney, Sally's Baking, [Upgraded German Chocolate Cake](https://sallysbakingaddiction.com/german-chocolate-cake/), updated 2022-04-10; Coconut Pecan Filling ingredient list and preparation. | Direct linked recipe page accessed 2026-10-10. Ingredient list says `1 can (12 ounces; 354ml) evaporated milk`; preparation cooks it with the filling ingredients. The article names no brand or SKU and gives no mass, edible fraction, product composition, or reusable package rule. It also mentions half-and-half as an option for the filling, without a quantified replacement relation. |
| **Held source check** | Eagle Brand, [Magic Cookie Bars](https://www.eaglebrand.ca/En/Recipes/Magic-Cookie-Bars), the recorded source for `026#3`. | Direct URL returned HTTP 404 when opened on 2026-10-10. No package value is verified in this packet. |

## Review method and boundary

Root re-opened the exact Sally's Baking page on 2026-10-10 and confirmed the filling ingredient line reads `1 can (12 ounces; 354ml) evaporated milk`. Updated only recipe 114 line 17 original text, structured amount, and recipe timestamp. The evidence remains local to that recipe line; the ledger has no generalized package measurement or conversion. The neighboring Eagle Brand source was separately refreshed from the current official recipe page; see `wp04-sweetened-condensed-milk-can-source-followup-20261010.md` and the integration README.

The accepted correction is recorded in `docs/catalog/batches/wp03-puffed-quinoa-and-wp04-recipe-source-corrections-identity-integration-20261010/README.md`.
