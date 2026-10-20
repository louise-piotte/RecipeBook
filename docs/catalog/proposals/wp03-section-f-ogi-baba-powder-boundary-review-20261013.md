# WP03 Section F: Ogi Baba powder boundary review — 2026-10-13

## Review record

- **Status:** Proposal-only review; hold the candidate outside the active catalog.
- **Open checklist:** The live Section F item for regionally significant cereal mixes and preprocessed grains remains open at [plan line 2383](../../RecipeBook-global-ingredient-catalog-plan.txt#L2476).
- **Scope:** The Nigerian sorghum product sold in Canada as Guinea Corn Powder (Ogi Baba), and the boundary between a dry cooking powder and the fermented sorghum slurry or gruel described in food-science sources.
- **Decision:** Do not allocate an active identity, aliases, form, ledger candidate, recipe link, measurement, conversion, yield, or substitution rule. The sources establish that Ogi Baba is a distinct regional sorghum preparation, but do not show that the Canadian dry powder has the same state or composition. No reviewed source gives this exact dry product a Québec French name. An active `Ogi Baba` search term would also capture the bare query `ogi` and replace the current unrelated `ogiri-egusi` substring result with a singleton Ogi Baba result.
- **Prior work boundary:** The [WP02 A6 Round 10 Guinea-corn review](wp02-a6-next-regional-flour-gap-review-20261013-round10.md) integrated `guinea corn` on grain sorghum and `guinea corn flour` on sorghum flour, but explicitly left Ogi Baba / Guinea corn powder unassigned. This review assesses that separate processed product, distinct from the variable cereal-legume mix in the [Tom Brown hold](wp03-section-f-tom-brown-cereal-mix-boundary-hold-20261013.md) and the dry flour blend in the [Hausa Koko review](wp03-section-f-hausa-koko-flour-identity-review-20261013.md). Here, the evidence concerns Nigerian sorghum Ogi Baba, with reports of a fermented slurry and a Canadian dry powder listing.
- **Source-ID prefix:** `WP03-OGI-BABA-BOUNDARY-20261013-`. It was absent from the live ledger and catalog proposal/batch archive before drafting. The FoodBasket product page is already registered under `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S03`; this review reuses that source registration rather than proposing a duplicate ledger source.

## Product boundary and evidence limits

The Canadian product page calls its item **Guinea Corn Powder (Ogi Baba)**, says it is made from whole-grain Guinea corn/sorghum and used to cook a slightly tangy porridge, and gives a package weight. It does not show an ingredient panel or say whether the powder is fermented, dried fermented slurry, a blend, or another processed sorghum product. Its out-of-stock status is not treated as current availability.

Food-science literature uses **Ogi Baba** for fermented sorghum gruel or sediment. One laboratory process soaked red sorghum, wet-milled and sieved it, then fermented the filtrate. A separate powdered-ogi study dried fermented maize-sorghum material and added soybean; another study evaluated sorghum Ogi Baba fortified with Bambara groundnut. These studies establish related product possibilities, not the composition or process of the Canadian retail SKU. Generic `ogi`, `akamu`, `pap`, and `koko` also cover cereal and regional variants; they are not interchangeable aliases for this specific sorghum product.

The English Canadian listings reviewed use `Ogi Baba` and `Guinea Corn Ogi Baba`. A separate Canadian marketplace entry titled `Boullie de Sorgho` appears in a Pap category, but its product page could not be fetched and it is not paired to the Ogi Baba powder. It therefore does not establish the Québec French display for the dry item. Do not construct a French name from `sorgho` or translate the prepared-food wording as if it named a dry ingredient.

| Candidate phrase or boundary | Evidence and disposition |
|---|---|
| `Ogi Baba` / `Ogi-baba` | Sorghum-specific fermented preparation in food-science sources and a name on Canadian powder listings. Do not activate while the retail powder's process/state and French display remain unresolved. |
| `Guinea corn powder` | Current Canadian product wording for a powder used to prepare porridge. Keep out of the generic sorghum-flour aliases; the existing A6 review already made that boundary explicit. |
| Generic `ogi`, `akamu`, `pap`, or `koko` | Broader cereal, locality, and preparation usage. Do not assign any of these as an alias or merge them with Ogi Baba. |
| Prepared `pap` / cooked porridge | A preparation/use of Ogi; not established as the dry catalog ingredient sold in the Canadian listing. |
| Fortified Ogi flour or cereal blends | Research formulas include other cereals and legumes. Keep them separate from any future plain Ogi Baba identity unless a product's own ingredient declaration establishes scope. |

## Live ownership, forms, and archive audit

Read-only snapshot taken on 2026-10-13. Exact normalized ownership follows `normalizeIngredientSearchKey` in `IngredientSearch.kt` (NFKD, case/accent/ligature folding, punctuation to spaces). Exact-key checks are separate from the picker projection below.

| Surface | Live state and ownership result |
|---|---|
| Active ingredient references | 1,364 rows; SHA-256 `80ecf866eb614caa604338c909687c3c4f0ffc228cff2fa6c56d8ab9e6ea3b0d`. No exact candidate name or alias for `ogi baba`, `ogi-baba`, `guinea corn powder`, `sorghum powder`, `ogi flour`, `ogi slurry`, `akamu`, or the reviewed French descriptors. Adjacent owners are `ingredient-ref-grain-sorghum` (`grain sorghum / sorgho à graine`, English alias `guinea corn`), `ingredient-ref-sorghum-flour` (`sorghum flour / farine de sorgho`, English alias `guinea corn flour`), and the separate `ingredient-ref-ogiri-egusi` (`ogiri-egusi / ogiri-egusi`, `SAUCE_AND_CONDIMENT`). No Ogi Baba ID is allocated. |
| Ingredient forms | 100 rows; SHA-256 `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63`. No exact candidate label or match term; neither the sorghum-grain nor sorghum-flour reference has an attached form. |
| Legacy import identities | 64 candidates; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005`. No exact candidate name, alias, or ID. |
| Research ledger | 1,691 records, 6,598 source-entry occurrences, and 5,529 distinct source IDs; SHA-256 `1927a4922e2b0726c1bf8f64ff90a03ea9c09c87823c97755ea3b8771c4b8363`. There is no dedicated Ogi Baba record or candidate. The FoodBasket page appears only as boundary evidence on the existing grain-sorghum and sorghum-flour records under source ID `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S03`. |
| Proposal and batch archive | A focused search found the WP02 A6 Round 10 exclusion cited above, but no dedicated Section F Ogi Baba review or accepted identity. The proposed source-ID prefix above has no prior occurrence. |

Exact normalized phrase ownership was checked for `ogi baba`, `ogi-baba`, `ogi baba powder`, `guinea corn powder`, `sorghum powder`, `fermented sorghum gruel`, `fermented sorghum cereal`, `ogi`, `ogi flour`, `ogi slurry`, `akamu`, `koko`, `ogi gero`, `ogi-gero`, `red sorghum`, `sorghum pap`, `bouillie de sorgho`, `bouillie de sorgho fermentée`, `poudre de sorgho`, and `poudre de céréale fermentée`. No exact active reference, form, or legacy owner was found. The ledger's existing product-page mentions remain boundary evidence, not a dedicated identity allocation.

## Picker and search effect

The projection uses the live catalog and `IngredientReferenceSearchIndex`: complete normalized word-phrase matches take priority over substring fallback. A query word can therefore match inside a longer indexed name or alias.

| Query | Current picker result | Effect if a reference uses the English term `Ogi Baba` |
|---|---|---|
| `ogi` | `ingredient-ref-ogiri-egusi`, returned by substring fallback (`ogi` is inside `ogiri-egusi`). | The longer `ogi baba` term would become a complete word-phrase match for `ogi`; phrase-first search would return the Ogi Baba candidate alone and suppress the current Ogiri result. This is a misleading singleton capture. |
| `ogi baba` / `ogi-baba` | No result. | Would return the proposed candidate, but that exact search benefit does not resolve the unsafe bare `ogi` result. |
| `guinea corn` | `ingredient-ref-grain-sorghum` and `ingredient-ref-sorghum-flour`. | A `Guinea Corn Powder` row would be a third result for this shorter query; its label would need to remain explicit and separate from the grain and flour. |
| `guinea corn powder` | No result. | Would return a powder candidate only if that exact source-backed name were activated. The source does not establish a Québec French display or full product composition. |
| `sorghum` | Five references: grain sorghum, puffed sorghum, sorghum flour, sorghum grits, and sorghum semolina. | A sorghum-qualified display would add another broad result; keep the product descriptor explicit if a future row is approved. |
| `akamu`, `koko`, `ogi flour`, `sorghum powder` | No result. | Keep unassigned; no reviewed source supports these as exact aliases for the Canadian Ogi Baba powder. |

The current matcher makes an active `Ogi Baba` name unsafe while `ogi` is also a substring fallback to a different ingredient. Do not add a candidate ID, name, or alias as a workaround: any active term containing the exact word `ogi` would capture that bare query under the current phrase-first behavior.

## Bundled recipe demand

The manifest lists 114 recipes. All 114 JSON files and all 1,123 ingredient rows were scanned across string fields, including `originalText`, `ingredientName`, and reference IDs. Candidate searches covered the Ogi Baba/ogi spellings, Guinea-corn powder, sorghum powder/gruel/slurry, `akamu`, `koko`, and the reviewed French descriptors.

- Candidate phrase hits: **0 / 114 recipe files** and **0 / 1,123 ingredient rows**.
- Existing links to `ingredient-ref-grain-sorghum` and `ingredient-ref-sorghum-flour`: **0 recipe ingredient rows**.
- No recipe demand, recipe link, or recipe-line change is supported by the bundled corpus.

The manifest has 114 paths and SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`. The recipe files were read in manifest order; no recipe data was changed.

## Numeric, measurement, form, and substitution limits

| Evidence | Keep it bounded to |
|---|---|
| FoodBasket listing weight `1.10231 lb` | One product-page package quantity. It is not a serving, household measure, paired volume/mass observation, or ingredient conversion. The listing is currently out of stock. |
| Otunba et al. laboratory process | One red-sorghum sample was soaked for 3 days, wet-milled and sieved, then the filtrate fermented for 2 days to produce sour sediment. These are study method durations and material states, not a universal process, retail-powder specification, cooking direction, or yield. |
| Omah et al. powdered-ogi experiment | One experimental maize-sorghum blend was soaked for 72 hours, wet-milled, dewatered, oven-dried at 50 °C for 48 hours, and pulverized. Its grain and soybean blend ratios are research formulations; do not transfer them to the Canadian single-name SKU or treat them as replacement ratios. |
| Aliyu et al. Ogi Baba study | Its Bambara-groundnut fortification ratios and 100% controls distinguish study formulas. They do not define one universal Ogi Baba composition or a household recipe measure. |
| Household measures and density | No checked source provides a transferable cup/spoon weight, paired volume and mass, default density, or active unit mapping. Keep all values inactive. |
| Forms, conversions, and yields | Do not add a dry, wet, fermented, or cooked form until the Canadian SKU state is established. No raw-to-fermented/dried yield or product reconstitution conversion is supported. |
| Substitution | No checked source gives a validated ingredient-for-ingredient substitution quantity or recipe context. Do not substitute Ogi Baba powder for sorghum flour, generic ogi, millet cereal products, or a hot cereal by rule. Add no global or contextual substitution. |

## Source register

Sources were checked online on 2026-10-13. New proposal-local IDs use the unique prefix `WP03-OGI-BABA-BOUNDARY-20261013-`; none is added to the shared ledger in this proposal-only review.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| Existing `WP02-A6-GUINEA-CORN-SORGHUM-20261013-R10-S03` | FoodBasket Canada, [GraceCo Guinea Corn Powder (Ogi Baba)](https://foodbasketcanada.com/product/guinea-corn-powder-ogi-baba/), product title, description, status, and listed weight; page checked 2026-10-13. | Calls the product a whole-grain Guinea-corn/sorghum powder for preparing a slightly tangy porridge and lists 1.10231 lb. It showed out of stock. It does not give an ingredient declaration or establish fermentation, drying, a French name, a generic measure, or current availability. Reuse the existing ledger source ID; do not register this page twice. |
| `WP03-OGI-BABA-BOUNDARY-20261013-S01` | Beauty For Ashes, Surrey, British Columbia, [Pap product category](https://africanmarket.ca/product-category/pap/) and [GraceCo Foods Guinea Corn Ogi Baba](https://africanmarket.ca/product/graceco-foods-guinea-corn-ogi-baba/); checked 2026-10-13. | A current Canadian storefront lists the named product in its Pap category and displays it for sale. The SKU page gives no ingredient panel or process details. The same category separately lists a product titled `Boullie de Sorgho`; its detail page could not be fetched and it is not shown to be the same product. This is not a Québec name or bilingual product-label attestation. |
| `WP03-OGI-BABA-BOUNDARY-20261013-S02` | Otunba et al., [“Genomic, biochemical and microbial evaluation of probiotic potentials of bacterial isolates from fermented sorghum products”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8646963/), *Heliyon* 7(12), 2021, Methods §2.1. | Calls Ogi Baba a fermented sorghum gruel/sediment and reports one red-sorghum lab process. It supports the fermented-product boundary, not the composition or state of a retail powder. |
| `WP03-OGI-BABA-BOUNDARY-20261013-S03` | Omah et al., [“Quality Evaluation of Powdered Ogi Produced from Maize-Sorghum and Soybean Flour Blends in Nigeria”](https://www.ajol.info/index.php/ajfand/article/download/231635/218787), *African Journal of Food, Agriculture, Nutrition and Development* 21(10), 2021, pp. 18839–18854. | Describes Ogi as fermented cereal gruel, uses `ogi-baba` for sorghum Ogi, and experimentally makes powdered Ogi from maize-sorghum and soybean blends. This demonstrates possible dry and composite products, not a generic formula, retail SKU composition, Québec display, or household measurement. |
| `WP03-OGI-BABA-BOUNDARY-20261013-S04` | Aliyu et al., [“Nutritive and Antinutritive Values of Fermented Guinea Corn (*Sorghum bicolor* L.) Fortified with Bambara Groundnut (*Vigna subterranea* L.) Flour”](https://lafiascijournals.org.ng/index.php/ljsir/article/view/268), *Lafia Journal of Scientific & Industrial Research* 1(1–2), first published 2023-10-31. | Identifies fermented Guinea corn as processed Ogi Baba and studies Bambara-groundnut-fortified formulas. Its test ratios and controls are study-specific; they do not define all products sold as Ogi Baba. |
| `WP03-OGI-BABA-BOUNDARY-20261013-S05` | FAO, [Sorghum and Millets in Human Nutrition](https://www.fao.org/4/T0818e/T0818e0g.htm), chapter “Culinary preparations,” section “Porridge.” | Describes generic Nigerian Ogi as fermented porridge that may use sorghum, millet, or maize in varying proportions and notes regional names. It supports keeping bare `ogi` and other cereal variants broader than a sorghum-specific candidate; it is not a current Canadian product label. |

## Next action

Reopen only after a current product source supplies the Canadian Ogi Baba SKU's ingredient list and process/state, and a Québec-facing product label or authoritative Québec terminology source establishes its French name. Then rerun exact ownership and picker projections. Before activating any `Ogi Baba` term, address the bare-`ogi` singleton capture so search does not replace the existing Ogiri result with one regional cereal product. Until both questions are resolved, keep the identity, aliases, forms, measurements, recipe links, and substitutions inactive.

This proposal creates no shared catalog, ledger, plan, roadmap, or recipe edits. No tests were run for proposal-only research.
