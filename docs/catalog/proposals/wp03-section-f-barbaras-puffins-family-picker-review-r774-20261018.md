# WP03 Section F R774 — Barbara’s Puffins product picker review — 2026-10-18

## Review record

- **Open checklist item:** the Section F checklist keeps regional cereal mixes and preprocessed grains open at [the current plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4898).
- **Scope:** two Barbara’s Puffins ready-to-eat cereal variants currently presented on Post Consumer Brands Canada’s English and French product pages: Original and Cinnamon. This is the Canada-site-supported set, not a claim that every Puffins product sold in every market is represented. Cheez Puffs are snacks and are outside this cereal review.
- **Recommendation:** add two bilingual, identity-only `GRAIN_AND_CEREAL` references, one for each supported variant. Record each Canadian manufacturer page’s one-cup serving as a product-specific source observation: Original, 42 g; Cinnamon, 43 g. Do not add aliases, ingredient-component links, recipe links, forms, reusable measures, density, unit mappings, conversions, yields, or substitutions.
- **Variant boundary:** do not add Peanut Butter Puffins to this Canadian set. Post Consumer Brands’ wider product-information page mentions a Peanut Butter variant, and a Walmart Canada French listing displays one, but the Canadian Barbara’s product overview shows Original and Cinnamon, the Walmart page was out of stock when checked, and no manufacturer crosswalk ties that retail listing to a current Canadian product detail page. Keep the retailer wording as evidence only; do not present it as a manufacturer-approved French title or assert that the product is unavailable in Canada.
- **Status:** proposal only. No shared catalog, ledger, plan, roadmap, workflow, generated file, integration README, or application file is changed.

## Current Canadian product evidence

Post Consumer Brands Canada’s English and French Barbara’s product overview pages identify Puffins as a cereal line and display Original and Cinnamon product images separately from Cheez Puffs. Each Puffins variant also has a current, language-specific Canadian manufacturer product page. The English/French page pairs provide exact localized product names, the same 283 g package size, and product-specific one-cup servings. The maker’s Canada pages support these two variants; they do not establish the global Puffins assortment.

The manufacturer’s broader product-information page also refers to Puffins Peanut Butter, while Walmart Canada has a French-language listing for `Céréales puffins au beurre d'arachide de Barbara's Bakery` at 312 g. Walmart showed that listing as out of stock on 2026-10-18. The retailer page does not supply a matching Canadian manufacturer product page or package-code crosswalk. I therefore keep the Canadian proposal to the two current bilingual product-page pairs and leave the Peanut Butter listing unallocated pending evidence that it belongs to the current Canadian product set.

If accepted, use the manufacturer-supported titles as product names, with no stored aliases:

| Proposed reference ID (checked, not allocated) | English display | French display | Manufacturer portion observation |
|---|---|---|---|
| `ingredient-ref-barbaras-original-puffins-cereal` | `Barbara’s Original Puffins cereal` | `Céréales Puffins Originales de Barbara’s` | 1 cup / 1 tasse = 42 g, product-specific |
| `ingredient-ref-barbaras-cinnamon-puffins-cereal` | `Barbara’s Cinnamon Puffins cereal` | `Céréales Puffins Cannelle de Barbara’s` | 1 cup / 1 tasse = 43 g, product-specific |

The English display appends “cereal” to the manufacturer’s shorter product title because the same page identifies Puffins as cereal. The French displays follow the full French manufacturer titles. Keep the two prepared, formulated cereal products distinct from cornmeal, oat flour, generic corn or oat cereal, plain puffed grains, and other Puffins products. Do not alias flavor words, ingredient-declaration terms, or the broad `Puffins` family phrase to either row.

## Source register and ownership

The source register was checked on 2026-10-18. The proposal-local R774 source IDs and all reviewed URLs are unowned in the live ledger. The source-ID prefix is unique in the proposal archive. The two candidate reference IDs are absent from the active references, forms, legacy identities, and ledger record IDs; they are not reserved.

| Proposal-local source ID | Source and direct support | Scope limit |
|---|---|---|
| `WP03-BARBARA-PUFFINS-R774-20261018-S01` | Post Consumer Brands Canada, [Barbara’s English product overview](https://www.postconsumerbrands.ca/brand/barbaras/products/), current products section. Identifies “Puffins Cereal” separately from Cheez Puffs. | Line-level family context; the overview does not state an exhaustive worldwide roster. |
| `WP03-BARBARA-PUFFINS-R774-20261018-S02` | Post Consumer Brands Canada, [Barbara’s French product overview](https://www.postconsumerbrands.ca/fr-ca/marques/barbaras-fr/produits/), current products section. Identifies `Céréales Puffins` and displays Original and Cinnamon product images separately from Cheez Puffs. | French family context; the page’s product images are not used as the exact localized titles. |
| `WP03-BARBARA-PUFFINS-R774-20261018-S03` | Post Consumer Brands Canada, [Barbara’s Original Puffins](https://www.postconsumerbrands.ca/brand/barbaras/products/barbaras-original-puffins/), product title, 283 g package, and one-cup serving. | Current Canadian manufacturer page; one cup (42 g) is specific to this product page. No UPC or package crosswalk was inspected. |
| `WP03-BARBARA-PUFFINS-R774-20261018-S04` | Post Consumer Brands Canada, [Céréales Puffins Originales de Barbara’s](https://www.postconsumerbrands.ca/fr-ca/marques/barbaras-fr/produits/cereales-puffins-originales-de-barbaras/), French product title and one-tasse serving. | Manufacturer’s French Canadian wording; confirms 283 g and 1 tasse (42 g) on the same product page. |
| `WP03-BARBARA-PUFFINS-R774-20261018-S05` | Post Consumer Brands Canada, [Barbara’s Cinnamon Puffins](https://www.postconsumerbrands.ca/brand/barbaras/products/barbaras-cinnamon-puffins/), product title, 283 g package, and one-cup serving. | Current Canadian manufacturer page; one cup (43 g) is specific to this product page. No UPC or package crosswalk was inspected. |
| `WP03-BARBARA-PUFFINS-R774-20261018-S06` | Post Consumer Brands Canada, [Céréales Puffins Cannelle de Barbara’s](https://www.postconsumerbrands.ca/fr-ca/marques/barbaras-fr/produits/cereales-puffins-cannelle-de-barbaras/), French product title and one-tasse serving. | Manufacturer’s French Canadian wording; confirms 283 g and 1 tasse (43 g) on the same product page. |
| `WP03-BARBARA-PUFFINS-R774-20261018-S07` | Post Consumer Brands, [Cereal nutrition and production information](https://www.postconsumerbrands.com/cereal-nutrition-production-information/), Puffins section. Names Original, Cinnamon, and Peanut Butter varieties. | Wider Post portfolio context, not a Canadian variant roster, bilingual product source, or Canadian SKU mapping. |
| `WP03-BARBARA-PUFFINS-R774-20261018-S08` | Walmart Canada, [Céréales puffins au beurre d'arachide de Barbara's Bakery](https://www.walmart.ca/fr/ip/C-r-ales-puffins-au-beurre-d-arachide-de-Barbara-s-Bakery/6000192484001), retailer title, 312 g listing, cereal aisle, and stock state. | Retailer-displayed French wording only. The page showed out of stock and states product information may come from manufacturers, suppliers, or marketplace sellers and is not independently verified by Walmart. It does not establish a current manufacturer-approved Canadian identity. |

The exact English and French page URLs for the two proposed products have no existing ledger owner. The Canadian product overview URLs and the wider U.S.-domain and Walmart URLs are also unowned. The proposal-local S01–S08 source IDs have no ledger owner and no prior archive use. No existing source ID is reused.

## Ownership and prior-review audit

The read-only audit covered the Section F checklist and its R765, R767, and R771 follow-up decisions, active references and forms, legacy identities, the research ledger, proposal and integration archives, roadmap, picker terms, and manifest-listed recipes.

| Surface | Finding |
|---|---|
| Active references and aliases | No exact Puffins, Barbara’s Original Puffins, Barbara’s Cinnamon Puffins, `Céréales Puffins Originales`, or `Céréales Puffins Cannelle` owner. Nearby branded cereals and generic corn/oat/puffed-grain identities remain separate. |
| Forms | No Puffins form, match term, or form owner. No product state warrants a new ingredient form. |
| Legacy identities | The 56 legacy candidates contain no Puffins or Barbara’s cereal candidate. |
| Ledger and source ownership | The 2,262 live ledger records contain no proposed reference ID or Puffins identity. None of the eight exact URLs or R774 source IDs is already owned. |
| Proposal and plan history | No prior Puffins review, product ID, source prefix, or focused checklist decision was found. R265 Gorilla Munch, R735 Reese’s Puffs, R765 Harvest Crunch, R767 Holy Crap Superseed, R771 Oatmeal Crisp, and the R762 Post Shredded Wheat & Bran review concern different products and do not decide this family. The broad regional cereal/preprocessed-grain checklist remains open. |
| Candidate IDs | Both proposed IDs are absent from the live references, forms, legacy candidate data, and ledger record IDs. They are checks only, not allocations or reservations. |

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, accent and ligature folding, complete word-phrase matching before substring fallback, and reference/form term collection. It uses the two proposed display names only, with no aliases.

| Query | Current results | With R774 | Effect |
|---|---:|---:|---|
| `Puffins` | 0 | 2 | Returns both Canadian manufacturer-documented variants. |
| `Puffins cereal` | 0 | 2 | Returns both variants; does not return the out-of-stock Peanut Butter retailer listing because it is not added. |
| `Céréales Puffins` | 0 | 2 | Returns both localized manufacturer product rows. |
| Each full English or French product title | 0 | 1 | Resolves to its matching Original or Cinnamon product. |
| `cereal` / `céréales` | 91 / 88 | 93 / 90 | Adds two distinct ready-to-eat cereal products to each broad category search. |
| `puffed corn` / `maïs soufflé` | 0 / 1 | 0 / 1 | No puffed-corn alias or popcorn collision is introduced. |

## Measurement, forms, and recipe demand

If accepted, record one manufacturer-label `portion_weight` observation on each product identity: Original, 1 cup = 42 g; Cinnamon, 1 cup = 43 g. These label servings support `measurementState: researched_supported` for product-specific portions only. They are not a generic cereal cup mass or a physically measured fill. Keep the 283 g package size as package context; do not turn package mass or servings per package into a household measure or package yield. Add no active measure, default density, unit mapping, form, conversion, cooked state, or yield. Substitution research was not performed; keep `substitutionResearchState: not_yet_researched` and add no global or contextual rule.

The manifest lists **114 recipe files** with **1,123 structured ingredient rows**. A full scan of every listed recipe file and structured ingredient row for `Puffins`, `Barbara’s`, both proposed titles and IDs, the French manufacturer titles, Cinnamon, Original, and Peanut Butter found **0 recipe files and 0 ingredient rows**. No recipe link or line change is proposed.

## Static checks and test scope

- [x] Read the current `AGENTS.md`, the active Section F checklist, roadmap, live reference/form/legacy/ledger data, recent Section F family decisions, and the R770–R772 integration checkpoint.
- [x] Checked the current Canadian manufacturer product overview and both English/French product-page pairs; verified exact displayed titles, shared 283 g package size, and product-specific one-cup portions.
- [x] Inspected the separate U.S.-domain Peanut Butter reference and Walmart Canada listing. Kept Walmart wording retailer-attributed, recorded its out-of-stock state, and did not treat it as manufacturer-approved or map it to a Canadian SKU.
- [x] Checked candidate reference IDs, R774 source IDs, exact source URLs, archive ownership, current picker projection, and the complete manifest-listed recipe corpus.
- [x] Proposal-only checks cover UTF-8 without BOM, local Markdown links, whitespace, and mojibake markers. No catalog, ledger, plan, roadmap, workflow, generated, application, or integration file changed.
- [x] No software tests, build, emulator run, or deployment were run. This is proposal-only documentation work.
