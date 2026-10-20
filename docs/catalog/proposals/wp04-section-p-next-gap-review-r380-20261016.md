# WP04 Section P R380 — roe-stuffed fish-ball product boundary

## Scope and recommendation

- **Review date:** 2026-10-16.
- **Open checklist:** the Section P parent “Fish powder, fish balls, and surimi” remains open in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7101).
- **Scope:** Canadian product listings that describe fish balls with fish roe or fish egg stuffing. This review does not reopen the accepted generic `fish balls / boulettes de poisson` identity or the separate fish tofu, shrimp-ball, cuttlefish-ball, chikuwa, fish-powder, and surimi decisions.
- **Recommendation:** **Hold a separate roe-stuffed fish-ball identity.** Keep the current generic fish-ball reference for recipes that request unqualified fish balls. Do not add a new reference, alias, form, legacy mapping, research-ledger candidate, recipe link, measure, yield, conversion, or substitution.

Several Canadian product pages use a fish-ball-with-roe-stuffing name, so this is a real prepared-product wording rather than an inferred synonym. The reviewed products do not establish one shared fish species, roe species, flavouring, composition, French label, or Québec market name. Product pages list frozen or cold-stored SKUs, but those details are product-specific and do not establish a universal form or storage state. One retailer listing names golden threadfin bream and capelin roe for its own formulation; another gives no species or ingredient declaration. These product-specific differences do not justify attaching the filling to every fish ball or adding a product-specific row without recipe demand and a source-matched Québec French name. [S01–S04]

The OQLF supplies the generic pair `boulette de poisson / fish ball` and the generic pair `œufs de poisson / fish roe`. It does not give a term for a roe-stuffed fish ball. The descriptive French phrase `boulette de poisson farcie aux œufs de poisson` would be a construction from those generic terms, not a product name verified by OQLF or a Québec product label. Keep that wording out of the active picker. [R01, R02]

## Current ownership and proposed boundary

| Surface | Current owner or state | R380 disposition |
|---|---|---|
| Active fish-ball reference | `ingredient-ref-fish-balls`, displayed as `fish balls / boulettes de poisson`, with singular aliases `fish ball` / `boulette de poisson`; category `PROTEIN`; no attached forms, density, or unit mappings. | Keep the generic formed-fish-product identity unchanged. Do not add a roe-filling alias or attach filling as a reusable form. |
| Fish roe wording | `fish roe` and `œufs de poisson` currently occur in the descriptive display for `ingredient-ref-bottarga`; `caviar` currently finds `ingredient-ref-finger-lime`. | Do not use generic roe, fish-egg, or caviar terms as aliases for this filled fish-ball product. The filling is not the same identity as dried pressed roe, and the broad `caviar` query already has a different owner. |
| Related formed products | Fish tofu, shrimp balls, frozen cuttlefish balls, and chikuwa have separate active references. Generic fish cake and surimi remain held. | Keep every existing product boundary unchanged; do not alias the roe-filled ball to these products or to fish species. |
| Legacy import candidates | The full legacy-candidate scan found no candidate name or alias for `fish ball with fish roe stuffing`, `fish ball with fish egg stuffing`, `roe-stuffed fish ball`, `stuffed fish ball`, `魚包蛋`, or `魚籽包`. | No legacy identity is mapped or reserved. |
| Research ledger | `ingredient-ref-fish-balls` has its existing verified generic identity record. No roe-stuffed fish-ball record or exact product-variant candidate was found. | Add no variant record and do not change the existing fish-ball record. Existing generic OQLF and CFIA sources are reused by their current IDs below. |
| Plan and archive | Prior work covers the generic fish-ball identity, varied fried/filled/flavoured listings, generic fish-powder and surimi holds, and other distinct seafood-ball products. Before R380, a focused roe-stuffed fish-ball disposition was not found. | This R380 proposal records the product-specific boundary only. The open Section P parent remains open. |

The retailer phrase is kept as evidence, not as a proposed global alias. In the Watson listing, the retailer's ingredient text names golden threadfin bream (*Nemipterus virgatus*), capelin roe (*Osmerus mordax*), and artificial shrimp and crab flavour. The PriceSmart description says only “wild fish” and fish-roe stuffing. Those descriptions establish differing SKU claims, not a single formulation for all roe-filled balls. [S01, S02]

## Picker projection and Québec naming boundary

The current projection was derived from the active reference/form search terms using the phrase-first matching rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The recommendation leaves those terms unchanged.

| Query | Current result | R380 projection | Boundary |
|---|---|---|---|
| `fish ball`; `fish balls` | `ingredient-ref-fish-balls` | Same | Keep the generic fish-ball identity for unqualified recipe language. |
| `boulette de poisson`; `boulettes de poisson` | `ingredient-ref-fish-balls` | Same | The OQLF-backed generic French term remains on the generic row. |
| `fish ball with fish roe stuffing`; `fish egg stuffing`; `roe-stuffed fish ball`; `stuffed fish ball` | No result | No result | These retailer-specific phrases are not adopted as aliases. |
| `fish roe`; `œufs de poisson` | `ingredient-ref-bottarga` | Same | Do not make a filled fish ball another broad roe result without an exact recipe or a Québec-facing product label. |
| `caviar` | `ingredient-ref-finger-lime` | Same | Do not attach a caviar alias to a fish-ball product. |
| `fish tofu`; `tofu au poisson` | `ingredient-ref-fish-tofu` | Same | Existing fish-tofu identity stays separate. |
| `shrimp balls`; `boulettes de crevettes` | `ingredient-ref-shrimp-balls` | Same | Existing shrimp-ball identity stays separate. |
| `frozen cuttlefish balls`; `boulettes de seiche surgelées` | `ingredient-ref-cuttlefish-balls` | Same | Existing cuttlefish-ball identity stays separate. |
| `chikuwa` | `ingredient-ref-chikuwa` | Same | The named formed-fish-paste product stays separate. |
| `surimi`; `fish cake` | No result | No result | The generic surimi and fish-cake boundaries remain held. |

If a future decision adds a specific filled-ball row, it should use the exact source name and a verified French product name, then project the broad `fish ball` and roe queries against the new item explicitly. Do not assume that the French phrase assembled from generic OQLF components is a standardized Québec product label. Do not claim that `roe`, `fish eggs`, `capelin roe`, `caviar`, `tobiko`, `masago`, or salmon roe is interchangeable with this composite product.

## Manifest-listed recipe demand and numeric limits

The scan read every recipe JSON listed by `manifest.v1.json`, all structured ingredient rows, and the complete recipe JSON text. It searched for the product phrases `fish ball with fish roe stuffing`, `fish ball with fish egg stuffing`, `fish ball stuffed with fish roe`, `roe-stuffed fish ball`, `stuffed fish ball`, `fish roe stuffing`, `fish egg stuffing`, `魚包蛋`, and `魚籽包`; and for nearby `fish ball(s)`, `boulette(s) de poisson`, `fish roe`, `œufs de poisson`, fish tofu, shrimp balls, cuttlefish balls, chikuwa, kamaboko, naruto maki, fish cake(s), and surimi wording. The scan found **zero matching recipe files, ingredient rows, or links**. Recipe 019 is titled “Crab Balls,” but its seafood ingredient is jumbo lump crab meat; it is not a fish-ball or roe-stuffed fish-ball request.

The reviewed listings show 500 g, 454 g, 340 g, or a wholesale case of 20 × 340 g. These are product/package declarations only; none establishes piece count, a recipe portion, transferable measure, density, yield, or conversion. No recipe or product source tests a replacement between roe-stuffed fish balls, generic fish balls, fish tofu, shrimp or cuttlefish balls, fish roe, surimi, fish cakes, or actual crab. Add no quantity behavior, substitution rule, safety statement, or recipe-line link.

## Snapshot and source-uniqueness checks

Read-only snapshot from the shared checkout at final verification on **2026-10-16**. The recipe-corpus SHA-256 uses each manifest-relative recipe path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order.

| Artifact | Snapshot |
|---|---|
| Active ingredient references / forms | 1,699 / 141 |
| Legacy import candidates | 56 |
| Research ledger | 2,055 records; 9,262 source entries; 7,838 distinct source IDs; 6,560 distinct URLs |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,988 bytes; SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

Ownership checks across active references/forms, legacy candidates, ledger records, the plan, proposals, and batch notes found no exact roe-stuffed fish-ball variant owner or reserved candidate. The active `ingredient-ref-fish-balls` row is the only owner of the generic phrase. Before this R380 proposal was written, source prefix `WP04-SECTIONP-FISH-ROE-BALL-R380-20261016-`, new IDs S01–S04, and the four new product-page URLs were absent from the ledger and prior catalog archive. S03's Superwafer site-disclaimer URL is an explicit reuse from R377; the OQLF and CFIA sources are also reused under their existing IDs. No duplicate source record is proposed.

## Recommendation and reopen conditions

Keep roe-stuffed fish balls inside the existing generic fish-ball scope when a future recipe calls for unqualified fish balls. Keep the variant unallocated until a bundled recipe or an exact product request establishes the intended product and Québec-facing wording. Reopen only with evidence that supports a durable product identity beyond one SKU name, or when a recipe needs this specific filling. Preserve separate fish species, fish roe products, fish tofu, shrimp balls, cuttlefish balls, chikuwa, surimi, and generic fish-ball identities. At proposal-only handoff, no shared catalog, forms, legacy, ledger, plan, roadmap, batch, code, or test files had been changed; root integration is recorded below.

## Source register

New R380 source IDs and URLs:

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-FISH-ROE-BALL-R380-20261016-S01** | PriceSmart Foods, [Searay Fish Ball with Fish Roe Stuffing, 500 g](https://www.pricesmartfoods.com/product/searay-fish-ball-w-fish-roe-stuffing-id-00827510010783), product number `00827510010783`; page set to Richmond–Ackroyd (accessed 2026-10-16). | Retailer description calls it a frozen fish ball with fish roe stuffing, says it is produced from wild fish, and suggests hot pot/noodles. The listing names no fish or roe species, ingredients, French product name, or Québec availability; the 500 g figure is this package only. |
| **WP04-SECTIONP-FISH-ROE-BALL-R380-20261016-S02** | Walmart Canada, [Watson Frozen Fish Ball with Fish Egg Stuffing — Crab Flavor, 454 g](https://www.walmart.ca/en/ip/Watson-Frozen-Fish-Ball-With-Fish-Egg-Sutffing-Crab-Flavor-454g/38LPZIIKE613) (accessed 2026-10-16). | Retailer title contains the spelling `Sutffing`; its item details list golden threadfin bream (*Nemipterus virgatus*), capelin roe (*Osmerus mordax*), and artificial shrimp/crab flavour among the ingredients. The listing showed the item out of stock. Ingredient wording and 454 g are specific to this Watson listing, not a general fish-ball formula or measure. |
| **WP04-SECTIONP-FISH-ROE-BALL-R380-20261016-S03** | Superwafer, [fish ball with fish roe stuffing](https://www.superwafer.ca/public/en/product/19197/fish-ball-with-fish-roe-stuffing), item 19197, and [site disclaimer](https://www.superwafer.ca/en/page/disclaimer), last updated 1 December 2019 (accessed 2026-10-16). | The Toronto online listing names one 340 g SKU and showed it sold out. The page labels the image reference-only and says the actual item is final; the site's general disclaimer disclaims responsibility for errors or omissions and reserves additions, deletions, or changes to site content without prior notice. The listing gives no ingredient declaration, species, French product name, or Québec availability. |
| **WP04-SECTIONP-FISH-ROE-BALL-R380-20261016-S04** | My Seafood Wholesale, [Exploded Fish Ball with Fish Roe](https://myseafoodwholesale.ca/products/exploded-fish-ball-with-fish-egg) (accessed 2026-10-16). | Toronto wholesaler lists a frozen case of 20 × 340 g (about 6.8 kg), sold by case; the page showed sold out. This supports a wholesale product-name example only, not a consumer portion, piece count, ingredient formula, fish/roe species, or Québec French term. |

Reused source records; no new source IDs are assigned to these URLs:

| Reused source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-BONGA-POWDER-20261011-S08** | OQLF, [boulette de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435974/boulette-de-poisson), preferred term and English equivalent. | Supports the generic `boulette de poisson / fish ball` pair. The 1983 entry does not name roe stuffing or define a commercial recipe. |
| **WP04-SECTIONP-MENTAIKO-20261013-R40-S03** *(archive source ID reused)* | OQLF, [œufs de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435851/oeufs-de-poisson), preferred term and English equivalent, last updated 1983. | Supports generic `œufs de poisson / fish roe`; it does not name the filling of a specific fish-ball product or provide the compound French product name. This source ID appears in the existing R40 proposal archive, not the live ledger. |
| **WP04-DOYS-S04** | Canadian Food Inspection Agency, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Surimi” and common-name guidance. | The guidance says surimi products should use the name by which the food is generally known, with additional descriptors as appropriate, and gives examples of imitation-product wording. It is labeling guidance, not an endorsement of these retailer titles as a universal picker identity or a Québec French term. |

## Root review and integration

Root independently reviewed the four retailer pages. PriceSmart identifies a frozen Searay fish ball with fish-roe stuffing and says it is made from wild fish, without naming the species or formula. Walmart's Watson listing names golden threadfin bream, capelin roe, and artificial shrimp/crab flavour for its own crab-flavour SKU. Superwafer and My Seafood Wholesale show separate 340 g and case-pack listings; neither supplies a Québec French product name or ingredient declaration. These pages support examples of the product wording, not one shared formulation or picker identity.

The active reference scan confirms `ingredient-ref-fish-balls` remains the only generic owner; candidate phrases were absent from active references, forms, legacy identities, and live ledger records. The manifest scan independently read all 114 recipe files and 1,123 ingredient rows (753,988 bytes; SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`); no candidate or nearby formed-seafood phrase matched a recipe file or ingredient row. Root integrated this documentation-only hold into the open Section P checklist and roadmap and added the batch README. No database JSON changed; no software tests, build, or emulator checks were run.

The Section P parent remains open. Reopen this variant only when a recipe requests it or stronger evidence establishes a durable product identity and Québec-facing name.
