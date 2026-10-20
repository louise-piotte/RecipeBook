# WP03 Section I — ginkgo seed identity and handling review

- **Reviewed:** 2026-10-12
- **Status:** Proposal only. Recommendation: **hold from active catalog integration** pending a representable food-preparation boundary.
- **Scope:** The seed/kernel of *Ginkgo biloba* sold or described as a food ingredient, its English and Québec French names, source-bounded product states, exact-key ownership, and bundled-recipe demand.
- **Not in scope:** Ginkgo leaves, roots, extracts, supplements, traditional-medicine ingredients, ornamental or foraged plant material, measurement data, recipe links, forms, or substitutions. No shared catalog, ledger, recipe, checklist, roadmap, code, or test file was changed.

## Recommendation

Ginkgo seeds are a genuinely distinct food-use candidate for the open WP03 Section I item on additional seed identities and processing-sensitive kernels. The OQLF entry for *ginkgo* says that the plant's seeds are eaten in some Asian countries after the fleshy outer covering is removed and the seeds are roasted. Health Canada's crop-group table identifies *Ginkgo biloba* as a crop commodity, and current Canadian grocery listings use the product name **ginkgo nuts**. These sources support reviewing the seed as its own candidate, separate from sacred lotus, makhana, egusi, watermelon kernels, and other already reviewed identities. [S01–S03, S06–S07]

Keep the candidate **held** for active integration. The reviewed handling sources make clear that raw or improperly prepared seeds can be hazardous, but the relevant instructions are either an expert Chinese food-risk advisory or Canadian requirements scoped to a Traditional Chinese Medicine ingredient. Neither is a Canadian culinary-food preparation standard. The live grocery listings also use different and sometimes internally inconsistent state wording (`fresh`, `boiled`, `unshelled`, and a product ingredient list including water), and the reviewed product labels provide no Québec French food name. The bundled corpus has no ginkgo line that would narrow the intended product state. A bare active reference would not preserve these limits in a schema with no safety/preparation field. [S01, S04–S07]

This is a hold on **catalog readiness**, not a finding that ginkgo seeds lack food use. Do not create an active reference or a ledger candidate from this proposal alone.

## Narrow candidate naming if reopened

| Field | Candidate value | Evidence boundary |
|---|---|---|
| Proposed ID | `ingredient-ref-ginkgo-seeds` | Unused in the live reference and legacy ID surfaces. Not reserved. |
| Category | `NUT_SEED_AND_DRIED_FRUIT` | Appropriate only for the food-use seed/kernel identity. |
| English display | `ginkgo seeds` | Botanically precise wording; the OQLF identifies the consumed plant part as seeds. |
| Provisional fr-CA display | `graines de ginkgo` | Descriptive Québec French wording based on the OQLF's French description of the consumed seeds. It is not an OQLF-preferred food-product term. |
| English alias candidates | `ginkgo nut`; `ginkgo nuts` | Current Canadian grocery product wording. “Nut” is a market name for this seed, not a botanical classification. |
| French aliases | none | Current food listings reviewed here are English-facing. Although a Canadian trademark goods list uses `noix de ginkgo`, it is not a product label or OQLF ruling. [S08] |
| Default density / unit mappings | `null` / `[]` | No transferable kitchen measure or density is supported. |

If the candidate is reopened, scope it to the *Ginkgo biloba* seed/kernel as a food product, not to the fleshy outer seed covering, planting seed, or all material sold under the tree's name. Do not let “ginkgo nut” imply that ginkgo is a botanical nut or that an unshelled/fresh seed is ready to eat. Keep these terms out of global aliases: `bai guo`, `baiguo`, `yin xing`, `yinxing`, `white fruit`, `silver apricot`, `ginko`, `gingko`, `maidenhair tree`, and `Ginkgo biloba extract`. Some are source-language names, translations, alternate tree spellings, misspellings, or terms for the plant or its extracts; none was established as a Québec food-label synonym for the edible seed.

## Product, handling, and source limits

| Evidence | What it supports | What it does not support |
|---|---|---|
| OQLF's 2026 *ginkgo* entry [S01] | The French botanical name `ginkgo`, accepted Latin name *Ginkgo biloba*, and a note that seeds are consumed in some Asian countries after depulping and roasting. | A standardized food display such as `graines de ginkgo`, a general recipe preparation, a safe raw state, or a serving amount. |
| Health Canada's crop-group table [S02] | Canadian regulatory recognition of `Ginkgo (Ginkgo biloba)` as a crop commodity in its residue-chemistry grouping. | Food-use authorization, culinary handling instructions, a consumer product name, or a recipe identity by itself. |
| Chinese Food Science and Technology Society risk advisory hosted on China's State Administration for Market Regulation site [S03] | Identifies `ginkgo fruit` / `bai guo` as the tree's seed and a food-and-medicine material; distinguishes outer covering, hard shell, seed coat, embryo, and the main edible endosperm; warns that raw or improperly consumed seeds can cause poisoning. | A Canadian or Québec food rule. Its preparation advice is source- and jurisdiction-specific and is not copied into app instructions or generalized here. No portion recommendation from this advisory is transferred. |
| Environment and Climate Change Canada's risk-management scope [S04] | Health Canada's NHPID lists ginkgo seeds for medicinal use and attaches handling/testing conditions to a Traditional Chinese Medicine ingredient. | A general food standard. Those medicinal-ingredient conditions are not adopted as recipe preparation or product-form rules. |
| Health Canada's *Ginkgo biloba and your health* page [S05] | The Canadian federal assessment concerns *Ginkgo biloba* extracts in products such as supplements, herbal teas, and cosmetics. | A safety assessment of whole culinary seeds. Extract and seed identities remain separate. |
| Superwafer / ChaoJi Canadian online grocery listing [S06] | A current product page titled `fresh ginkgo nuts`, marked in stock and shown as a 100 g retail package. The retailer also lists a separate `boiled ginkgo` product in its grocery category. | A recipe measure, a verified preparation method, exact edible-part scope, or Québec inventory. The page warns that product and package information may not be current or complete. |
| Galleria Online Mall listing [S07] | A Canadian retailer's page titled `UNSHELLED GINKGO NUTS 100G`, marked in stock when checked. | A consistent product-state definition: the detail page's ingredient line says `GINKGO NUTS, WATER`, while its title says “unshelled.” The retailer says inventory varies by store. It provides no preparation guidance or Québec French label. |

The reviewed sources therefore support the candidate's distinct species and food use, but do not settle a source-neutral, recipe-ready preparation boundary. The proposal does not infer that roasting, boiling, dehulling, peeling, or any other state is universally safe or interchangeable. The product pages' 100 g figures describe packages only; they are not transferred as recipe amounts, household measures, conversions, density, or yield.

## Related catalog and prior-review boundary

The global catalog plan still lists **“additional melon-seed products and regional culinary kernels”** as an open Section I item and separately keeps the broader processing-sensitive-kernel work open ([plan, Section I](../../RecipeBook-global-ingredient-catalog-plan.txt)). This candidate is a different species and product question; it does not revisit the held `magaz` / `magaj` market term, variable melon-seed products, or the accepted pili, perilla, and chironji identities. It also does not change the existing lotus-seed, makhana, egusi, dried-watermelon-kernel, or generic-nuts references. [S09–S11]

Searches of current proposal, batch, and plan text for `ginkgo`, `gingko`, `maidenhair`, `silver apricot`, `bai guo`, `yin xing`, `noix de ginkgo`, and `graines de ginkgo` found no prior ginkgo proposal, integration, or hold. The nearby processing-sensitive comparator is the candlenut hold, which likewise keeps an identity out of the active picker where source evidence does not establish a representable handling boundary; it is a workflow precedent, not evidence about ginkgo. [S10–S11]

## Exact-key and recipe-demand audit

Read-only snapshot on 2026-10-12:

| Artifact | Count | Result |
|---|---:|---|
| Active ingredient references | 1,288 | No exact owner for the candidate ID or proposed EN/FR names and alias candidates. |
| Active ingredient forms | 98 | No exact owner for the proposed or boundary product terms. |
| Legacy-import candidates | 64 | No exact candidate ID, name, or alias owner. |
| Research-ledger records | 1,596 | No exact normalized candidate phrase in record IDs or serialized source/decision content; no ginkgo record. |
| Ledger source entries / distinct source IDs | 5,718 / 4,743 | The checked prefix `WP03-I-GINKGO-SEEDS-20261012` has no source-ID collision. |
| Manifest recipes / ingredient rows | 114 / 1,123 | No ginkgo file or ingredient-row demand. |

Exact-key checks used `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` across active reference IDs, names, and aliases; form IDs, labels, and match terms; legacy IDs, names, and aliases; and ledger record IDs and text. Candidate keys checked included `ginkgo seeds`, `ginkgo seed`, `ginkgo nuts`, `ginkgo nut`, `ginkgo kernels`, `ginkgo kernel`, `graines de ginkgo`, `graine de ginkgo`, `noix de ginkgo`, `noix du ginkgo`, `bai guo`, `baiguo`, `yin xing`, `yinxing`, `white fruit`, `silver apricot`, and *Ginkgo biloba*. The proposed ID `ingredient-ref-ginkgo-seeds` has no exact ID collision. No ginkgo key is assigned to the existing generic `nuts / noix` reference.

The complete manifest-listed corpus was searched in every recipe JSON file and ingredient row for `ginkgo`, `ginko`, `gingko`, `maidenhair`, `銀杏`, `白果`, `bai guo`, `bai-guo`, `baiguo`, `yin xing`, `yin-xing`, `yinxing`, `noix de ginkgo`, `graine(s) de ginkgo`, and `silver apricot`. Result: **0 full-file hits and 0 ingredient-row hits**. No recipe link, measure, form, or substitution is proposed.

## Hold conditions and numeric boundary

Keep the candidate out of the active catalog until a future review can represent the food-use preparation boundary without implying that raw, unknown-state, or unshelled material is ready to eat, and can select Québec French wording from food-label or culinary usage rather than a translated goods list. The complete absence of recipe demand reinforces that this is source-coverage research only; it does not convert uncertainty into a recipe form.

No form, measurement observation, default density, unit mapping, conversion, yield, recipe link, or substitution is recommended. The reviewed quantities are retail package sizes or preparation guidance in non-Canadian sources, not transferable recipe measures. No source reviewed establishes a tested replacement ingredient, direction, recipe role, or ratio. No measurement or substitution fact is invented or inferred.

## Source register

All web sources were checked on 2026-10-12. Source labels S01–S10 are local to this proposal, are not canonical ledger entries, and are not reserved.

| ID | Source | Supports and limits |
|---|---|---|
| **S01** | Office québécois de la langue française, [GDT: *ginkgo*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408550/ginkgo), updated 2026. | Names the French plant and accepted species *Ginkgo biloba*. Its note reports seed consumption after depulping and roasting in some Asian countries. It does not define a food-product term or a general preparation rule. |
| **S02** | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), crop group 14. | Lists Ginkgo (*Ginkgo biloba*) in a regulatory crop group. This is commodity/taxon context, not a food-use authorization, label, or preparation standard. |
| **S03** | China Society of Food Science and Technology, [Risk Reminder Regarding Ginkgo Nuts](https://www.samr.gov.cn/spcjs/yjjl/art/2022/art_6b42cdb8f21c418c9095cdea89efca9a.html), published 2022-10-27 on the State Administration for Market Regulation site. | Describes the seed and its parts, food use, toxic constituents, and risks from raw or improper consumption. It is an expert advisory in a Chinese context, not Canadian regulation. Its preparation and portion advice is not transferred into this catalog proposal. |
| **S04** | Environment and Climate Change Canada, [Risk Management Scope for Certain Substances in the Fourteen Terpene and Terpenoid Substances Group](https://www.canada.ca/en/environment-climate-change/services/evaluating-existing-substances/risk-management-scope-fourteen-terpene-terpenoid-substances-group.html), section 7.1.4. | Says the Canadian NHPID lists ginkgo seeds for medicinal use and associates them with specific conditions for Traditional Chinese Medicine ingredients. It is not a culinary-food standard. |
| **S05** | Health Canada, [Ginkgo biloba and your health](https://www.canada.ca/en/health-canada/services/chemicals-product-safety/ginko-biloba.html). | Concerns Ginkgo biloba extracts and exposure through supplements, herbal teas, and other products. It does not assess whole culinary seeds. |
| **S06** | Superwafer / ChaoJi, [fresh ginkgo nuts](https://www.chaoji.ca/en/product/17495/fresh-ginkgo-nuts) and [Packaged Vegetables aisle](https://www.chaoji.ca/en/products/packaged-vegetables). | Canadian online grocery product terms and a 100 g retail package; the aisle separately lists boiled ginkgo. Product-page information may not match current packaging and does not establish preparation safety or a kitchen measure. |
| **S07** | Galleria Supermarket, [UNSHELLED GINKGO NUTS 100G](https://www.galleriasm.com/Category/ProductDetailView?BrandNo=&LangCode=EN&prodBarcode=859267007266); retailer [home and store locations](https://www.galleriasm.com/). | Canadian grocery listing marked in stock when checked, with an ingredient line containing ginkgo nuts and water. The retailer says inventory varies by store; the title and ingredient information do not settle shell or preparation state. It supplies no Québec French label or food-safety guidance. |
| **S08** | Canadian Intellectual Property Office, [Trade-marks Journal, 2025-01-29](https://www.ic.gc.ca/opic-cipo/tmj/eng/29Jan2025_fr.pdf?edition=01-29), French goods list. | Uses `noix de ginkgo fraîches` in a Canadian commercial-goods description. It is a translated trademark goods list, not a food package, Québec market attestation, or OQLF term. |
| **S09** | WP03 Section I [magaz/magaj product-boundary review](wp03-section-i-magaz-melon-kernel-product-boundary-review-20261011.md) and [regional melon-seed review](wp03-section-i-melon-seed-regional-kernel-gap-review-20261011.md). | Prior held decisions for unqualified and variable melon-seed market terms. They do not cover ginkgo. |
| **S10** | WP03 Section I [candlenut and kemiri identity and handling review](wp03-candlenut-kemiri-boundary-review-20261009.md). | Processing-sensitive-kernel hold precedent only; no identity or handling claims are transferred to ginkgo. |
| **S11** | WP03 Section I [pili-nut identity review](wp03-section-i-pili-nut-identity-review-20261012.md), [chironji-seed identity review](wp03-section-i-chironji-seeds-identity-review-20261012.md), and [perilla-seed identity integration record](../batches/wp03-section-i-perilla-seeds-identity-integration-20261012/README.md). | Confirms distinct, previously reviewed species identities in the open Section I scope. It does not cover ginkgo. |

No source-backed basis was found here for a ginkgo measurement, yield, density, conversion, or substitution. The Section I checklist remains open.

## Encoding and file check

This proposal is UTF-8 text without a BOM, ends with a newline, and has been checked for known mojibake markers. No tests or emulator checks were run because this is proposal-only work.
