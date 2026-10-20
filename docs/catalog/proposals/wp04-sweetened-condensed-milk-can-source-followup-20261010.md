# WP04 Proposal: Sweetened-Condensed-Milk Can Source Follow-Up

**Review date:** 2026-10-10
**Status:** reviewed and integrated on 2026-10-10. The recipe source was updated to the current official page and its source-specific product wording; the 300 ml quantity remains unchanged.
**Scope:** Recheck of one exact dairy package line whose recorded source URL is inaccessible.

## Disposition

Retain the structured amount on `026#3` — Magic Cookie Bars — as `300 ml`. The accessible official Eagle Brand export for this exact recipe confirms `1 can (300 mL)` and specifies the source product choice as Eagle Brand Original or Low Fat sweetened condensed milk.

Update the recipe's recorded source URL to the current canonical official recipe page and preserve the source's brand/product-choice wording in `originalText`. Keep `ingredientName` and `ingredientRefId` on the existing generic `sweetened condensed milk` identity; do not create brand aliases or split Original and Low Fat into catalog identities or forms. Do not add a package-yield observation or new conversion. A structured line-level package amount is source-supported in principle, but hold it until the current parser can preserve the package count separately from the row's millilitre quantity.

## Exact line and source comparison

| Recipe line | Live bundled row | Current catalog/model | Direct source and disposition |
| --- | --- | --- | --- |
| `026#3` — Magic Cookie Bars; `ff66e4f7-c719-4203-970b-06993cdb25de-ingredient-3` | `1 can (300 ml) sweetened condensed milk`; quantity `300`, unit `ml`; linked to `ingredient-ref-sweetened-condensed-milk` | `sweetened condensed milk / lait condensé sucré`, category `DAIRY_AND_ALTERNATIVE`, no aliases, null default density, no unit mappings; no linked form or package-yield observation | Eagle Brand's official recipe export for “Magic Cookie Bars” lists one 300 mL can of its Original or Low Fat sweetened condensed milk. Preserve `300 ml`; recommend source URL and original-text updates only. |

The source is the manufacturer's own English recipe export. The older URL currently recorded on the bundled recipe returned HTTP 404 when opened, but an official export route for the same recipe title and ingredient list is accessible. The export says the can is poured evenly over the crumb crust. This confirms the recipe-stage package amount, not a product label for a specified SKU.

## Catalog and package-model fit

The live `ingredient-ref-sweetened-condensed-milk` reference remains identity-only: its ledger record is `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`, with no source or measurement observations. No ingredient form or sweetened-condensed-milk package-yield observation exists. The only current package-yield record is for S&W canned black beans.

The official recipe source supports retaining these recipe-local facts: one can, declared 300 mL contents, Eagle Brand, and the stated Original-or-Low-Fat product choice. It does not provide a net mass, product code/SKU, country of origin, drained or edible mass, or composition values. The package-yield model requires an `ingredientFormId`; the existing identity has no form, and this source supplies no food-state distinction that would justify adding one. Do not add a form or catalog package-yield record solely to encode this recipe line; `packageType` already represents the can.

The recipe-line `IngredientPackageAmount` shape can preserve a package count/type, declared net size/unit, and brand. However, the current `packageAmountForIngredientLine` helper takes a positive `ingredient.quantity` as package `count` without checking whether the row unit is a package unit. This line has `quantity: 300`, `unit: ml`, while `originalText` says `1 can`; the helper would therefore treat the volume amount as the can count if invoked. Do not add structured `packageAmount` data until that parsing path preserves the explicit package count. The existing `300 ml` recipe amount is directly supported and needs no conversion.

## Separate evidence status

| Evidence dimension | Status | Supported conclusion and limit |
| --- | --- | --- |
| **Identity** | Existing identity; no new row | Keep the generic sweetened-condensed-milk reference. Do not alias Eagle Brand, evaporated milk, dulce de leche, or caramel products to it. |
| **Package/count** | Direct source support for this recipe | One can contains 300 mL in the exact Eagle Brand recipe; the source names Original or Low Fat as its product choice. Preserve this wording on the recipe line and retain the structured `300 ml`. Do not treat it as a universal can size. |
| **Composition** | Unavailable | “Original or Low Fat” identifies the source's product options but gives no quantified fat, sugar, milk-solids, or other composition. Do not infer a composition value or choose one variant. |
| **Edible portion / mass / cooking yield** | Unavailable | The source gives net volume and says the contents are poured onto the crust before baking. It provides no net mass, refuse, post-bake retained amount, or cooked yield. |
| **Conversions** | No reusable relation | The source directly states `300 mL`; no mass/volume density, ounce conversion, or alternate package-size mapping is proposed. |
| **Substitution** | Product choice in one source line; no rule | The exact line permits Eagle Brand Original or Low Fat. This is source-specific product wording, not evidence for a directional global substitution or a quantity relation between distinct catalog foods. No rule is proposed. |

## Source register

| ID | Source | Evidence and limits |
| --- | --- | --- |
| **WP04-SC-MILK-CAN-20261010-S01** | Eagle Brand, [Magic Cookie Bars](https://www.eaglebrand.ca/en/recipes/bars-and-cookies/magic-cookie-bars), “Ingredients” and directions. | Current canonical official manufacturer recipe page opened 2026-10-10. Lists `1 can (300 mL) Eagle Brand® Original or Low Fat Sweetened Condensed Milk`; the directions pour it over the crumb crust. Direct exact-recipe evidence for this package count and volume only; not a net-mass, edible-yield, composition, SKU, or general conversion source. |
| **WP04-SC-MILK-CAN-20261010-S02** | Eagle Brand, [Barres magiques](https://www.eaglebrand.ca/fr/recettes/barres-et-biscuits/barres-magiques), official French recipe. | Québec French page lists `1 boîte (300 mL) de lait condensé sucré Eagle Brand® régulier ou faible en gras`; this corroborates the French product wording and package amount for that recipe. |
| **Held URL** | Eagle Brand, [previously recorded Magic Cookie Bars URL](https://www.eaglebrand.ca/En/Recipes/Magic-Cookie-Bars). | The old recorded URL returned HTTP 404 when opened 2026-10-10; it was replaced with the accessible current canonical recipe page. |

## Review boundary

Root opened Eagle Brand's current English and French canonical recipe pages on 2026-10-10. Updated the bundled source URL and source text to the English page's `1 can (300 mL) Eagle Brand® Original or Low Fat Sweetened Condensed Milk`; the structured quantity remains `300 ml`. No package metadata, form, conversion, yield, or ledger measurement was added. The old recorded URL was replaced because it returned 404. See `docs/catalog/batches/wp03-puffed-quinoa-and-wp04-recipe-source-corrections-identity-integration-20261010/README.md`.
