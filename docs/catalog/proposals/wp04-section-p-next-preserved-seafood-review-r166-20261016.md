# WP04 Section P — Matjes herring product-boundary review (R166)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** Matjes herring / hareng matjes, including the current Bos salted-herring and Feature Foods spiced/brined product examples.
- **Recommendation:** **Hold** a generic Matjes herring reference, form, legacy mapping, and ledger candidate. Keep all proposed keys and source IDs below proposal-local and unallocated.
- **Scope:** One salt-cured herring product boundary. This review does not reopen the R154 herring-kipper or R165 kippered-sardine holds, the R164 Finnan-haddie hold, accepted Atlantic/Pacific herring species, herring rollmops, or herring roe.
- **Status:** Proposal-only. No shared catalog JSON, legacy identity file, ledger, manifest, recipe, plan, roadmap, batch README, generated file, or code was changed. No tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-MATJES-HERRING-R166-20261016-S01` through `S06`, plus audit ID `WP04-SECTIONP-MATJES-HERRING-R166-20261016-R01`. These are not shared-ledger allocations.

## Why this is a distinct open gap

The active [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5860) leaves smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented seafood product states open. The broad [preserved-fish state review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) kept generic state identities and universal forms inactive without an exact recipe or product request. The R154–R165 archive does not decide Matjes: it reviews kipper, smoked oysters, tarako, horse mackerel, smoked trout, smoked mussels, calamari in marinara, mye, blackfin tuna, Atlantic argentine, Finnan haddie, and kippered sardines. None allocates a Matjes product or its salt-cured boundary. The earlier [herring-rollmops review](wp04-section-p-herring-rollmops-product-boundary-review-20261013-round45.md) explicitly distinguishes rollmops from unrolled marinated herring and other salted-herring products; it does not decide Matjes.

Matjes is a real herring product name, not a new fish species. Government terminology pairs English **matje herring / maatje herring** with French **hareng matjes / maatjes / matjes** and defines the fish by youth, fatness, and maturity. The current Canadian product evidence, however, does not resolve one shared preparation state: one Toronto retailer labels a Bos item as salted Matjes but its French description calls it smoked, while the manufacturer sells spiced, brined Matjes variants with sugar, spices, and beet powder. No bundled recipe selects one of these products. A generic catalog row would add a third result to broad `herring` and `hareng` searches without identifying which preparation a recipe needs.

## Terminology and product evidence

| Wording or evidence | What it supports | Limit |
|---|---|---|
| **matje herring / maatje herring**; **hareng matjes / maatjes / matjes** | TERMIUM Plus record 30 gives these bilingual terms and defines the food as young, fat herring caught early in the season, with gonads slightly developed or undeveloped. [S01] | Terminology evidence. It does not identify a biological species or standardize the process and ingredients of each current Canadian SKU. |
| **Bos Matjes Herring / Hareng Matjes salé Bos** | Holland Store Toronto's current English and French item pages share barcode `833417001151`, describe a traditional Dutch-style salted herring product, list `Herring, salt` / `Hareng, sel`, and show a 150 g item. [S02] | One retailer's manufacturer-specific SKU; no scientific species or package label is shown. The English page says in-store/local pickup only and shows pickup available; the French page reports `Indisponible`. The French page's prose says the matjes are smoked even though its title says `salé` and its ingredient list declares only herring and salt. Do not turn that conflicting prose into a smoked alias or form. |
| **Spiced Matjes Herring Fillets** | Feature Foods' current maker page identifies a product by this name, UPC `063723122008`, and describes herring tidbits in spiced red brine. The ingredient declaration is herring, water, salt, sugar, spices, and beet powder. It reports Gulf of St. Lawrence/North Atlantic catch area and purse-seine catch method. [S03] | The manufacturer does not give a scientific species. Catch area is not a species crosswalk; its product-specific brine does not define all Matjes. |
| **Matjes Herring Tidbits in Wine Marinade** | Feature Foods currently lists a second named Matjes product, UPC `063724124001`, with its own marinade description and the same broad herring ingredient wording. [S04] | A separate finished product; do not combine its tidbits or marinade with the Bos salt-only item or treat the wine wording as a generic Matjes process. The page does not identify species. |
| IKEA Canada **SILL MATJES matjes herring fillets / filets de hareng matjes** | IKEA's current English and French recipe pages use this bilingual product wording in a cold herring plate and give a 250 g recipe amount for four servings; the recipe drains the Matjes. [S05] | External recipe evidence, not a bundled RecipeBook demand or a package-to-serving conversion. The recipe does not provide a fish species or ingredient/process statement for the SKU. |
| Fisheries and Marine Service translation of J. Wurziger's 1977 article | The 1978 report describes the traditional Matjes distinction as herring of a particular maturity kept mildly salted, and discusses how commercial fillet use made the maturity criterion hard to verify. [S06] | Historical translation of a German food-regulation study, not current Canadian law or a Canadian product standard. Its technical salt/fat values are not reusable catalog thresholds. |

Do not expand this review to smoked herring, bloaters, kippers, rollmops, generic pickled or salted herring, herring roe, or unrelated flavored herring salads. Do not call Matjes fermented: none of the reviewed sources establishes fermentation as the shared process. The product boundary, if later requested, must be tied to the precise recipe or package wording.

## Exact ownership and source-ID audit

The current read-only snapshot contains **1,541 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,886 research-ledger records** with **8,048 source entries / 6,887 distinct source IDs / 5,685 distinct URLs**. The manifest contains **114 recipes and 1,123 ingredient rows**. These counts reflect the files read for this proposal.

Exact normalized-key checks covered active bilingual reference names and aliases, form labels and match terms, legacy candidate IDs/names/aliases, ledger record IDs and text, source IDs, and URLs. No exact catalog, form, legacy, or ledger owner was found for `matjes`, `maatjes`, `matje`, `maatje`, `matjes herring`, `matje herring`, `maatje herring`, `maatjes herring`, `hareng matjes`, `hareng maatjes`, `Hareng Matjes salé Bos`, `Spiced Matjes Herring Fillets`, `Matjes Herring Tidbits in Wine Marinade`, or the three listed product codes. No prior R154–R165 proposal/batch file contains `matjes`, `maatjes`, `matje`, or `maatje`.

| Current owner or exact candidate key | Live ownership | Disposition |
|---|---|---|
| `ingredient-ref-atlantic-herring` | `Atlantic herring / hareng de l’Atlantique`, category `PROTEIN`; no aliases, attached forms, density, or unit mappings. Its identity sources are `WP04-FINFISH-FOLLOWUP-20261009-S05` and `S06`. | Keep as a species identity; do not map Matjes to Atlantic herring. |
| `ingredient-ref-pacific-herring` | `Pacific herring / hareng du Pacifique`, category `PROTEIN`; no aliases, attached forms, density, or unit mappings. Its identity sources include `WP04-PACIFIC-HERRING-IDENTITY-20261012-S01` through `S05`. | Keep as a species identity; do not map Matjes to Pacific herring. |
| `matjes`; `maatjes`; `matje herring`; `maatje herring`; `hareng matjes`; `hareng maatjes` | No exact active reference, form, legacy candidate, or ledger record owns these normalized terms. | Do not allocate any of these terms while the current product scope remains unresolved. |
| `833417001151`; `063723122008`; `063724124001` | No exact active reference, form, legacy candidate, or ledger record owns these product codes. | Keep them source-specific; a product code is not a species or general ingredient identity. |
| `ingredient-ref-matjes-herring`; `candidate-matjes-herring` | No matching active, legacy, or ledger ID. | These are illustrative strings only and remain unreserved and unallocated. |

The existing Pacific-herring ledger observations are specific to raw CNF food code 3018, including one fish at 700 g mapped by that source to 378.6 g edible portion, one fillet at 184 g, and one food-guide serving at 90 g. They do not describe salt-cured Matjes. Atlantic herring has no supported measurement observation. Existing species sources remain attached to their current records; R166 adds no shared source entry.

The new R166 source-ID prefix has no exact collision in the live ledger or inspected proposal/batch archive. The URLs in the source register below have no exact source-URL owner in the current ledger. Source IDs in this packet are proposal-local only.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize lowercase text with NFKD accent and punctuation folding, search bilingual names/aliases and attached forms, prefer complete word phrases, then use substring fallback only if there are no phrase matches.

For impact analysis only, the hypothetical row uses display names `Matjes herring / hareng matjes`, English terms `matje herring` and `maatje herring`, and French terms `matjes` and `maatjes`. This is not proposed catalog data.

| Query | Current results | With hypothetical row | Consequence |
|---|---|---|---|
| `matjes`; `maatjes`; `matje herring`; `hareng matjes` | No result | Matjes herring only | Exact product queries would become available. |
| `herring`; `hareng` | Atlantic herring; Pacific herring | Same two plus Matjes herring | Broad species queries gain a third, preparation-specific product result. |
| `Atlantic herring`; `hareng de l’Atlantique` | Atlantic herring only | Same | Qualified species search remains unambiguous. |
| `salted herring`; `hareng salé`; `pickled herring`; `smoked herring`; `rollmops`; `kipper` | No result | No result | The hypothetical term set does not claim equivalence to other salt, marinade, smoke, or rolled-herring products. |

Under the recommendation to hold, all current picker results remain unchanged: `matjes`/`maatjes` remain unmatched, and broad herring searches continue to show only the Atlantic and Pacific species rows.

## Bundled-recipe demand

The manifest-ordered audit opened every listed recipe file and every structured `ingredients[]` row, then searched complete UTF-8 recipe JSON and ingredient-row values for `matjes`, `maatjes`, `matje`, `maatje`, `matjes herring`, `hareng matjes`, and whole-word `herring` / `hareng`. It found **zero matching recipe files and zero matching ingredient rows** for Matjes or herring wording across all **114 recipe files and 1,123 ingredient rows**. No recipe link, ingredient role, preparation method, or amount selects this product.

Nearby fish-related ingredient demand does not establish Matjes use: recipe `077#10` requests 675 g of salmon fillets; `111#1` requests one tuna steak; `093#4` leaves cooked meat or seafood to taste without an ingredient reference; and `093#6` / `095#5` request fish sauce, a condiment. None selects salted or prepared herring. [R01]

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Neither active herring species has an attached form. Do not add a global salted, mildly salted, smoked, brined, spiced, filleted, oil-packed, pickled, or fermented form. The reviewed product sources describe different item-specific states and do not establish one shared process.
- **Measurements and density:** Both herring species have null `defaultDensity` and empty `unitMappings`. The Bos retailer's 150 g listing is package-specific, not a serving, drained weight, or general measure. IKEA's 250 g is one external recipe amount for four servings. Feature Foods' product pages provide no transferable serving basis. Add no density, count conversion, household-volume mapping, or package-to-edible-portion rule.
- **Yields and conversions:** The historical Wurziger report's technical salt/fat observations are not current Canadian product data and must not be applied to these SKUs. The source pages supply no matched raw-to-Matjes mass, drained yield, curing loss, marinade uptake, or cooking yield. Add none.
- **Substitutions:** No global or contextual substitution is supported between Matjes, Atlantic/Pacific herring, rollmops, smoked herring, kippers, other salted herring, or herring roe. The bundle has no Matjes dish context, quantity, or recipe-line link. Add no rule, warning, or substitution link.

## Proposed delta

**No catalog or shared-ledger delta is proposed.** Do not create `ingredient-ref-matjes-herring`, `candidate-matjes-herring`, a Matjes form, a legacy mapping, or a research-ledger record. Do not attach `matjes` to Atlantic or Pacific herring. Keep all reviewed names, UPCs, and source IDs proposal-local. Reopen if a bundled recipe selects a specific Matjes product and its exact package/name/process establishes which variant the recipe needs.

## Source register

Online sources were accessed on 2026-10-16 unless the source entry itself is historical. Proposal-local source IDs are not ledger records. Existing herring source IDs cited above remain attached to their current ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-MATJES-HERRING-R166-20261016-S01** | Government of Canada, Translation Bureau, [TERMIUM Plus: hareng search, record 30](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=73&i=&index=frb&lang=fra&sg_kp_wet=1945395&srchtxt=HARENG), 2018-03-09. | English `matje herring` / `maatje herring`; French `hareng matjes`, `maatjes`, `matjes`; defines the fish by early-season maturity and fatness. It is terminology evidence, not a current product standard. |
| **WP04-SECTIONP-MATJES-HERRING-R166-20261016-S02** | Holland Store Toronto, [Bos Matjes Herring](https://hollandstore.ca/products/bos-matjes-herring) and [Hareng Matjes salé Bos](https://hollandstore.ca/fr/products/bos-matjes-herring), barcode `833417001151`. | Current Canadian bilingual retailer listings, 150 g item and herring/salt ingredients. The English page says in-store/local pickup only and shows pickup available; the French page reports `Indisponible`. The French description conflicts with the product title and ingredients by calling it smoked; no package image or scientific species is provided. |
| **WP04-SECTIONP-MATJES-HERRING-R166-20261016-S03** | Feature Foods, [Spiced Matjes Herring Fillets](https://featurefoods.ca/products/0-spiced-matjes-herring-fillets), UPC `063723122008`. | Current manufacturer page, herring ingredient, Gulf of St. Lawrence/North Atlantic catch area, purse-seine method, brine wording, and item-specific ingredient declaration. Does not name a taxon. |
| **WP04-SECTIONP-MATJES-HERRING-R166-20261016-S04** | Feature Foods, [Matjes Herring Tidbits in Wine Marinade](https://featurefoods.ca/products/0-matjes-tidbits-in-wine-marinade), UPC `063724124001`. | Current manufacturer page for a separately named tidbit/marinade product; supports variation among Matjes-labeled products, not a universal composition or process. Does not name a taxon. |
| **WP04-SECTIONP-MATJES-HERRING-R166-20261016-S05** | IKEA Canada, [Herring plate with potatoes & condiments](https://www.ikea.com/ca/en/rooms/kitchen/how-to/herring-plate-with-potatoes-and-condiments-pub686bbc40/) and [French page](https://www.ikea.com/ca/fr/rooms/kitchen/how-to/assiette-de-harengs-avec-pommes-de-terre-et-condiments-pub686bbc40/). | Bilingual product wording `SILL MATJES matjes herring fillets / filets de hareng matjes`; the external recipe uses 250 g for four servings and drains the product. Not bundled demand or a reusable measure. |
| **WP04-SECTIONP-MATJES-HERRING-R166-20261016-S06** | Fisheries and Marine Service, Translation Series No. 4334, [Contribution to the evaluation of herring fillets designated as Matjes herrings from the point of view of food regulations](https://waves-vagues.dfo-mpo.gc.ca/Library/115688.pdf), J. Wurziger, original 1977; Canadian translation 1978. | Historical technical discussion of maturity, mild salting, commercial fillets, and limitations of judging the traditional quality criterion after filleting. Not current Canadian law, a product specification, or a source for catalog numeric values. |
| **WP04-SECTIONP-MATJES-HERRING-R166-20261016-R01** | [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5860), R154–R165 proposal/batch archive, [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only exact-key, source-ID/URL, archive, picker, corpus, numeric, form, and substitution audit at the snapshot counts stated above. |

## Final disposition

**Hold** Matjes herring outside active references, forms, legacy identities, and the shared research ledger. The official bilingual term pair is real, and current Canadian makers and sellers use Matjes product names, but the reviewed SKUs span salt-only, spiced-brine, and tidbit/marinade presentations; the Bos French description conflicts with its title and ingredients on smoking; and none identifies herring species. Adding a row would create a third broad `herring` / `hareng` result with no bundled recipe to select a product state. Keep the R154/R165 kipper holds, R164 Finnan-haddie hold, and accepted Atlantic/Pacific herring identities unchanged.
