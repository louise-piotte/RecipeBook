# WP04 Section P — canned mackerel in tomato sauce product review (R799)

- **Review and source-access date:** 2026-10-19.
- **Open checklist:** [Section P preservation review, line 8379](../../RecipeBook-global-ingredient-catalog-plan.txt#L8397), which leaves preserved fish and seafood product states open.
- **Recommendation:** Add one identity-only, species-neutral finished-product reference, proposed as `ingredient-ref-canned-mackerel-in-tomato-sauce`, displayed as **canned mackerel in tomato sauce / maquereau en conserve à la sauce tomate**.
- **Scope:** A bounded Canadian market identity for canned mackerel products whose product wording identifies tomato sauce. It represents the named product family evidenced below, not a generic form of every canned-mackerel product and not one individual SKU. Keep fish species, sauce recipe, cut, package, and any recipe-specific use at their source scope.
- **Status:** Integrated on 2026-10-19 as one identity-only reference and ledger record. Root reuses R176's Brunswick and Walmart source IDs and allocated R799-S01–S03; see the [R797–R799 integration README](../batches/wp02-wp03-wp04-r797-r799-gap-review-integration-20261019/README.md). No software tests were run for this database-JSON-only change.
- **Identifiers:** Reference ID `ingredient-ref-canned-mackerel-in-tomato-sauce`; source IDs `WP04-SECTIONP-CANNED-MACKEREL-TOMATO-SAUCE-R799-20261019-S01` through `-S03`; audit label `WP04-SECTIONP-CANNED-MACKEREL-TOMATO-SAUCE-R799-20261019-R01`.

## Why this is a distinct open gap

The [R794–R796 integration](../batches/wp02-wp03-wp04-r794-r796-gap-review-integration-20261019/README.md) added dried flatfish powder but left broader Section P work open. The open preservation checklist still calls for work on smoked, cured, dried, canned, packed, and fermented fish/seafood products. R176 added the broad `canned mackerel / maquereau en conserve` market identity, with no forms. Its decision kept packing medium, cut, and package product-specific; its Brunswick source S06 already records an exact manufacturer SKU named **Mackerel in Tomato Sauce**. That source was treated as evidence of another SKU, not a generic form. This review follows that product-specific evidence into a separate, narrowly named prepared-food identity rather than changing the parent or turning tomato sauce into a universal canned-mackerel form. Reuse R176 source S06; see [the R176 proposal](wp04-section-p-canned-mackerel-boundary-review-r176-20261016.md) and [integration README](../batches/wp02-wp03-wp04-r176-gap-review-integration-20261016/README.md).

This is consistent with other Section P decisions that treat a fish product sold with tomato sauce as a distinct finished-food identity: **canned sardines in tomato sauce** ([R514](wp04-section-p-next-seafood-review-r514-20261017.md)) and **herring fillets in tomato sauce** ([R178](wp04-section-p-canned-herring-fillets-tomato-sauce-boundary-review-r178-20261016.md)). A form such as canned fish in water can describe a packing medium; a named fish-and-sauce product has a composite product identity and SKU-specific sauce formulation. R799 does not reopen those rows or claim their formulations match.

Current Canadian retail evidence shows multiple plain tomato-sauce mackerel products alongside separately chili-qualified products. Grace Foods Canada’s current French product catalogue lists **Maquereau en sauce tomate** under Grace and Dunn’s River, and separately lists **Mackerel in Hot Tomato Sauce** with chili ingredients. Its same page also lists **Chinchard en sauce tomate** separately. The proposed identity therefore covers only products whose reviewed wording identifies mackerel in tomato sauce without an additional named flavour such as chili; it does not absorb chili-qualified mackerel or the separately named chinchard product. The current sources do not resolve a scientific fish species or establish one common recipe. [S01–S03; reused R176-S06–S07]

## Current product evidence and limits

| Source | Evidence relevant to this proposal | Limit |
|---|---|---|
| Brunswick Seafood manufacturer product page [reused R176-S06] | Its current page titles a product **Mackerel in Tomato Sauce**, describes mackerel in tomato sauce, and lists mackerel and tomato sauce as ingredients. The page also shows that this is one named product among other mackerel presentations. | This is one manufacturer SKU. The ingredient proportions, can amount in the title, nutrition data, and formula are product-specific; the page gives no scientific fish name and does not define all tomato-sauce mackerel products. |
| Walmart Canada **Canned Mackerel** category [reused R176-S07] | The currently accessible category lists Old Fisherman **Blue Mackerel Chunks In Tomato Sauce** among canned mackerel products and separately lists Uni-Pak **Mackerel in Tomato Sauce with Chili**. This supports a current Canadian retail product family and makes the chili boundary visible. | Category and brand names are not species identification. The chili-qualified product is excluded from the proposed plain-tomato-sauce identity. Package weights and availability are listing-specific. |
| Grace Foods Canada, official French [Poissons catalogue](https://gracefoods.ca/product/poissons/?lang=fr) [S03] | The manufacturer lists **Maquereau en sauce tomate** for both Grace and Dunn’s River products, and separately lists Grace **Mackerel in Hot Tomato Sauce** with chili ingredients and **Chinchard en sauce tomate**. This directly supports the Québec-facing French phrase and the product boundaries. | It does not give scientific names or establish that the listed products share one sauce formula. The listed ingredient declarations and package formats belong to their named products. The hot-tomato and chinchard products are excluded from the proposed identity. |
| Aliments Toyo, Québec City, [Ligo Maquereau en sauce Tomate](https://alimentstoyo.ca/products/ligo-maquereau-en-sauce-tomate-425g) [S01] | The current Québec retailer page uses the French product wording **Ligo Maquereau en sauce Tomate** and identifies its Québec City store. This supplies direct local wording for the proposed French search term. | The listing showed **Épuisé** when accessed. It supports the product name, not current stock, ingredients, species, or a general package amount. |
| Provigo Québec, [Old Fisherman Morceaux de Maquereau en Sauce Tomate](https://www.provigo.ca/fr/morceaux-de-maquereau-en-sauce-tomate/p/21121323_EA) [S02] | The retailer’s current product-page search preview uses **Morceaux de Maquereau en Sauce Tomate** and identifies a Longueuil listing. This corroborates Québec use of the base fish-and-sauce wording across another brand. | The dynamic product page returned a cache miss on direct open; the preview supports the title only. Do not rely on its local stock, package amount, or description as a stable fact. The word *morceaux* belongs to this product title and is not a catalog-wide cut claim. |

The French display is an editorial bilingual catalog label built from the active parent’s `maquereau en conserve` wording and the manufacturer/Québec retailers’ exact `maquereau en sauce tomate` wording. Grace and Dunn’s River use the same French product phrase for their listed product families, while Grace lists a chili-qualified item and a separate *chinchard* product. This is a useful naming boundary, not an OQLF ruling, a scientific species assignment, or evidence that brands share a formulation.

## Proposed identity-only delta

If accepted, add one `PROTEIN` reference and one matching identity-level ledger record:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-canned-mackerel-in-tomato-sauce` |
| English display | `canned mackerel in tomato sauce` |
| Québec French display | `maquereau en conserve à la sauce tomate` |
| English aliases | none |
| French aliases | `maquereau en sauce tomate`; `morceaux de maquereau en sauce tomate` |
| Default density | `null` |
| Unit mappings | none |
| Attached forms | none |

The two French aliases are source-attested product-name variants: `maquereau en sauce tomate` appears in the Grace Foods Canada catalogue and the Ligo Québec listing; `morceaux de maquereau en sauce tomate` is the Old Fisherman listing. The second alias routes that exact product phrase to the family identity; it does not assert that every product in the identity is sold as pieces. Do not add `blue mackerel`, `jack mackerel`, `chinchard`, `chili`, or a brand name as aliases. Do not add the generic form code `canned_in_tomato_sauce` under `ingredient-ref-canned-mackerel`: R799 proposes a separate prepared-product identity, not a generic form and not a single-SKU identity.

For the ledger record, use `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Reuse the two R176 source IDs below instead of duplicating their URLs; add the new Québec retailer sources S01–S02 and manufacturer-catalogue source S03. Keep observations, substitutions, forms, conversions, yields, and recipe links empty.

## Ownership and archive audit

The read-only snapshot after R796 integration contains **1,881 references, 197 forms, 56 legacy candidates, 2,287 research-ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows**. The active `ingredient-ref-canned-mackerel` row remains the broad species-neutral parent, with no forms. No active reference/form/legacy identity or separate ledger record owns the proposed reference ID or exact bilingual display/alias terms.

| Existing owner or decision | Boundary for R799 |
|---|---|
| `ingredient-ref-canned-mackerel` and its R176 ledger record | Keep the broad parent unchanged. Its decision leaves packing medium and cut product-specific. The only exact overlap is the already-owned Brunswick product source S06 and canned-category source S07; reuse those source IDs and URLs, do not register duplicates. |
| `ingredient-ref-canned-sardines-in-tomato-sauce` (R514) | A separate sardine product identity. Its tomato-sauce wording supports the product-identity precedent, not an alias, fish species, or formula for mackerel. |
| `ingredient-ref-herring-fillets-in-tomato-sauce` (R178) | A separate herring product identity. Keep the fillet cut and herring product terms off the mackerel row. |
| `ingredient-ref-tomato-sauce` | Standalone sauce ingredient, not a fish-and-sauce product. |
| Atlantic, Pacific, Indian, short, and Spanish mackerel references; `ingredient-ref-smoked-mackerel` | Keep species identities and smoked mackerel separate. Neither source titles nor the generic parent identify the fish in the reviewed tomato-sauce SKUs. |
| Prior work | R176 resolved only the generic canned-mackerel market identity and left forms unspecified. R514 and R178 created distinct tomato-sauce fish products. R796 added dried flatfish powder and did not review this product boundary. No focused proposal or integration for canned mackerel in tomato sauce was found. |
| Proposed identity and R799 source prefix | The proposed reference ID and exact bilingual names are absent from active data. The R799 source-ID prefix is absent from the active ledger and prior proposal/batch archive. The proposed IDs are not allocated. |

The audit checked active reference names and aliases, form labels and match terms, all legacy candidate identities, ledger record IDs and source-ID/URL ownership, and focused proposal/batch history. R176’s parent ledger record already mentions its Brunswick tomato-sauce source; that is evidence owned by the broad parent, not an existing tomato-sauce reference, alias, or form. The exact Toyo, Provigo, and Grace product URLs have no current ledger owner. The R799 source IDs each map to one new URL; reused R176 IDs keep their existing URL mapping.

## Picker impact

Projection follows phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The figures below count distinct reference rows, before and after the proposed identity; exact phrases are case- and accent-insensitive.

| Query | Before | After | Effect |
|---|---|---|---|
| `canned mackerel in tomato sauce`; `mackerel in tomato sauce` | No result | Proposed identity only | The English product phrase becomes directly searchable. |
| `maquereau en conserve à la sauce tomate`; `maquereau en sauce tomate`; `morceaux de maquereau en sauce tomate` | No result | Proposed identity only | The Québec display and source-attested retailer wording resolve to the prepared product. |
| `canned mackerel`; `maquereau en conserve` | Broad canned-mackerel parent | Parent plus proposed identity | The selected sauce product appears beside the broad group; both names keep the distinction visible. |
| `mackerel` | 9 rows | 10 rows | Broad search remains multi-result. |
| `maquereau` | 7 rows | 8 rows | Broad search remains multi-result and still includes the separate gooseberry lexical match. |
| `tomato sauce`; `sauce tomate` | 3 rows: standalone tomato sauce, canned sardines in tomato sauce, and herring fillets in tomato sauce | Those 3 plus proposed identity | Broad sauce queries remain multi-result. |
| `canned`; `en conserve` | 19 / 18 rows | 20 / 19 rows | Each remains broad and gains one visibly qualified seafood product. |
| `mackerel in tomato sauce with chili` | No result for this exact qualified phrase | No result for this exact qualified phrase | Do not absorb the separately chili-qualified listing or add a chili alias. |

No product-specific can size, portion, cut, species, sauce percentage, or readiness claim is added to picker data.

## Bundled recipe corpus

The manifest lists **114** recipe files and **1,123** structured ingredient rows. A manifest-ordered read-only scan of all recipe JSON and ingredient rows found **zero mackerel/maquereau mentions and zero rows** matching the proposed identity or aliases. The one tomato-sauce ingredient row is recipe [090, African Peanut Stew](../../../app/src/main/assets/seed/bundled-library/recipes/090-ragout-aux-arachides-africain-african-peanut-stew-89f89f5e-4afc-4e3a-b37f-e7841ac24ff8.v1.json), which requests generic `tomato sauce` and remains linked to `ingredient-ref-tomato-sauce`; it is not seafood demand. Add no recipe link or ingredient-row change.

## Measures, substitutions, and product limits

- **Measures and package amounts:** The source titles’ package amounts and the Brunswick SKU’s formulation are source-only observations. They do not establish a shared can size, fish-only mass, drained fraction, yield, serving, or kitchen measure. Add no measurement observation, package yield, density, unit mapping, or conversion.
- **Species and preparation:** Leave species, cut, skin/bone state, sauce formula, added seasonings, storage condition, and drained state unresolved at the family level. In particular, do not transfer the Old Fisherman `blue mackerel` wording or Brunswick’s ingredient proportions to the other products.
- **Product boundary:** Keep the plain tomato-sauce identity separate from water/brine/oil presentations on the broad canned-mackerel parent; raw and smoked mackerel; canned sardines in tomato sauce; herring fillets in tomato sauce; standalone tomato sauce; and products with an explicitly different sauce or flavor, including tomato sauce with chili.
- **Substitutions:** No source or bundled recipe establishes an equal-amount replacement between this prepared product, plain canned mackerel, other packing media, mackerel species, canned sardines, herring in tomato sauce, or standalone tomato sauce. Add no global or contextual substitution, warning, or recipe-line link.

## Source register

Online pages were checked on 2026-10-19. Proposal-local S01–S03 are unallocated; reused IDs retain their existing ownership. Package and composition values below are specific to the named listing only.

| Source ID | Source and evidence | Ownership / limit |
|---|---|---|
| **Reused `WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S06`** | Brunswick Seafood, [Mackerel in Tomato Sauce](https://brunswick.ca/products/mackerel/brunswick-mackerel-in-tomato-sauce-425g-2/). Current manufacturer page names the product and describes its ingredients. | Existing owner: `ingredient-ref-canned-mackerel`. Reuse the same source ID and URL. Its product title includes one package amount; its listed 74% mackerel / 26% tomato-sauce composition is SKU-specific, not a family ratio or measure. The page identifies no species. |
| **Reused `WP04-SECTIONP-CANNED-MACKEREL-R176-20261016-S07`** | Walmart Canada, [Canned Mackerel category](https://www.walmart.ca/en/c/kp/canned-mackerel). The current category includes an Old Fisherman chunks-in-tomato-sauce product and a distinct Uni-Pak tomato-sauce-with-chili product. | Existing owner: `ingredient-ref-canned-mackerel`. Reuse the same source ID and URL. Retail taxonomy and titles support product names and the chili boundary, not fish taxonomy or a shared formula. |
| **`WP04-SECTIONP-CANNED-MACKEREL-TOMATO-SAUCE-R799-20261019-S01`** | Aliments Toyo, [Ligo Maquereau en sauce Tomate](https://alimentstoyo.ca/products/ligo-maquereau-en-sauce-tomate-425g). | New product-listing URL. Supports this Québec City retailer’s French product wording; it showed out of stock when accessed and provides no product composition or species. Its title’s package amount is listing-specific. |
| **`WP04-SECTIONP-CANNED-MACKEREL-TOMATO-SAUCE-R799-20261019-S02`** | Provigo Québec, [Old Fisherman Morceaux de Maquereau en Sauce Tomate](https://www.provigo.ca/fr/morceaux-de-maquereau-en-sauce-tomate/p/21121323_EA). | New product-listing URL. The current search preview supports the French title; direct page open returned a cache miss. Use the product name only, not the preview’s dynamic price, stock, package amount, or description. |
| **`WP04-SECTIONP-CANNED-MACKEREL-TOMATO-SAUCE-R799-20261019-S03`** | Grace Foods Canada, [Poissons catalogue (French)](https://gracefoods.ca/product/poissons/?lang=fr). | New manufacturer-catalogue URL. Lists Grace and Dunn’s River **Maquereau en sauce tomate** products with product-specific ingredient declarations and package formats. It also distinguishes a chili-qualified Grace mackerel product and Grace **Chinchard en sauce tomate**; neither is part of the proposed identity. The page gives no scientific species name, and none of its package or formula details is transferable. |
| **`WP04-SECTIONP-CANNED-MACKEREL-TOMATO-SAUCE-R799-20261019-R01`** | Read-only audit of the open checklist, live references/forms, legacy candidates, research ledger and source ownership, relevant prior proposals/batches, `IngredientSearch.kt`, manifest-listed recipe files, and ingredient rows. | Repository audit label only; no external URL. Supports the snapshot, ownership, phrase projection, and recipe-corpus findings in this proposal. |

## Final disposition

**Integrated on 2026-10-19.** Root added one identity-only, species-neutral `canned mackerel in tomato sauce / maquereau en conserve à la sauce tomate` reference and ledger record. The evidence supports an English manufacturer product name, Québec French manufacturer and retailer wording, and current Canadian canned-retail listings. The row remains separate from the broad canned-mackerel parent and from other fish, tomato-sauce, chinchard, and chili-qualified products. It is a finished-product identity for the reviewed market wording, not a generic packing-medium form or a single-SKU record. No measures, forms, recipe links, conversions, yields, or substitutions were added. The absence of bundled recipe demand and all SKU-specific details remain explicit; see the [R797–R799 integration README](../batches/wp02-wp03-wp04-r797-r799-gap-review-integration-20261019/README.md).
