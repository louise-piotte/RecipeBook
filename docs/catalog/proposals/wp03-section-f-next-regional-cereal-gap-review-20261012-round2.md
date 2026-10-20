# WP03 Section F: thiakry millet-granule identity review

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated on 2026-10-13 as a millet-scoped identity with French aliases `thiacry` and `thiacri`; the 200 g FAO recipe quantity remains source-scoped, and no active conversion or substitution was added. See [the integration note](../batches/wp03-section-f-thiakry-identity-integration-20261013/README.md).
- **Open checklist item:** “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” remains open at [plan line 2182](../../RecipeBook-global-ingredient-catalog-plan.txt#L2275).
- **Scope:** Senegalese millet-based thiakry sold as a precooked cereal granule ingredient. This is a product identity review, not a proposal to treat every cereal or plant-flour granule called thiakry in West Africa as the same formulation.
- **Integration:** Added identity-only **ingredient-ref-thiakry-millet-granules** as **thiakry (pre-cooked millet granules) / thiakry (granulés de mil précuits)** in **GRAIN_AND_CEREAL**. French aliases are **thiacry** and **thiacri**; English aliases remain empty. Density is null and unit mappings are empty. No forms, active measures, conversions, yields, recipe links, or substitution rules were added. Measurement research remains blocked pending an accessible CNF 2026 review.

## Open item and prior coverage

The Section F checklist remains open after the focused reviews and integrations for Sankhal, thiéré, and millet arraw. These are separate products: Senegal’s standards directory lists NS 03-099 for precooked cereal and/or other-plant flour granules called thiakry, NS 03-084 for millet arraw, NS 03-103 for millet couscous, and NS 03-113 for Sankhal. The Senegalese Institute of Food Technology (ITA) likewise lists production of thiacry or couscous, Arraw, and Sankhal separately. These sources support separate product identities, not universal formulas or household measurements.

Codex’s 2025 African regional committee report records that the Senegalese new-work proposal concerned precooked cereal/plant granules known as tiacry and that the project document then focused on millet. Delegates noted that other cereal and plant flours are also used and that names differ by country. The committee asked Senegal to revise and resubmit the proposal at CCAFRICA26. This was a proposed standard still requiring revision, not an adopted Codex product specification. Accordingly, this proposal names only the concrete millet-based product supported by Senegalese and Québec market sources; it does not claim that every regional thiakry product is millet-based or identical.

The candidate is distinct from existing active references **ingredient-ref-arraw**, **ingredient-ref-millet-couscous-thiere**, and **ingredient-ref-sankhal**. Existing references, forms, legacy candidates, and ledger mentions were checked before proposing it. The ledger contains neighboring product-boundary references to thiakry but no dedicated thiakry identity record.

## Proposed row and naming boundary

| Proposed field | Recommendation | Evidence boundary |
| --- | --- | --- |
| ID | **ingredient-ref-thiakry-millet-granules** | No active reference, form, legacy candidate, or ledger record owns this ID or the exact candidate phrases in the snapshot below. |
| English display | **thiakry (pre-cooked millet granules)** | Descriptive English gloss attached to the regional product name. It is not presented as a standardized English term. |
| Québec French display | **thiakry (granulés de mil précuits)** | Senegalese standards use the precooked-granule description; Montréal-area sellers identify thiakry/thiacri as millet-based granules. This is a clear French display, not an OQLF terminology ruling. |
| English aliases | None | The product name and qualified English display already provide search terms. Do not add broad “millet couscous” or “millet semolina.” |
| French aliases | **thiacry**; **thiacri** | Both spellings appear in product or source wording. These are source-attested variants, not a claim that OQLF has standardized them. |
| Category | **GRAIN_AND_CEREAL** | The reviewed sources describe a human-food precooked cereal granule product. |
| Density and unit mappings | Null; empty list | No transferable volume-to-mass value was established. |
| Forms, conversions, yields, recipe links, substitutions | None active | The evidence does not establish generic state conversions, cooking or package yield, bundled recipe demand, or an amount-qualified substitute. |

Use the proposed identity for the sourced millet-based product only. Do not use it as a universal row for plantain-, sorghum-, or other non-millet granules that may be called thiakry in broader regional usage. Do not add **dégué / dêguê** as an alias: Codex documents country-dependent names, and a Montréal seller also uses “Thiakry (Dégué)” while describing a yogurt-served prepared dish. That evidence does not make the terms interchangeable across ingredient and prepared-dish contexts.

Do not use **gruau de mil** as the French display or alias. A Montréal seller uses the phrase on its product listing, but the OQLF’s Québec/Canada entry defines *gruau* as a cooked oatmeal dish and notes an extension to other cereal porridges. The proposed row names dry/pre-cooked granules, not the prepared yogurt dessert or porridge. OQLF supports generic French **millet**, **mil**, and **petit mil**, while noting that *millet* can group multiple species; it does not define thiakry or prescribe this product name.

Keep **thiéré / millet couscous**, **arraw**, and **Sankhal** separate. In particular, do not alias **couscous de mil**, **millet couscous**, **granulés de mil** alone, **brisures de mil**, or **millet semolina** to thiakry. The first two belong to the existing thiéré reference; broad granule phrases can legitimately return both Arraw and thiakry.

## Live ownership, picker, and recipe audit

This read-only snapshot was taken on 2026-10-13 before drafting. File hashes are SHA-256 over exact bytes. The corpus digest hashes each manifest-ordered recipe-relative path, NUL, exact recipe bytes, and trailing NUL.

| Surface | Live snapshot |
| --- | --- |
| Active ingredient references | 1,329 total; 142 in GRAIN_AND_CEREAL; SHA-256 **9b7f314205bddd57e6dab025c73dbcc4e96d945a3f8b0f349af3e6b832669853** |
| Ingredient forms | 98; SHA-256 **b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c** |
| Legacy import identities | 64; SHA-256 **69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005** |
| Research ledger | 1,637 records; 6,089 source entries; 5,105 distinct source IDs; 8 unit conversions; SHA-256 **a976db6579ae00a627c2f95633dfd5955c3d82b62a4e77ebd0ac553c685437b2** |
| Seed manifest | 114 recipe paths; SHA-256 **b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984** |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe-file bytes; corpus digest **7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c** |

The exact-ownership check covered active reference IDs, names, and aliases; all form IDs, labels, and match terms; all 64 legacy candidate records; ledger record IDs; and recipe content. It found no exact owner for **thiakry**, **thiacry**, **thiacri**, **thiaçry**, **thiakri**, **pre-cooked millet granules**, **precooked millet granules**, or the proposed ID. “Thiakry” occurs only as adjacent-boundary evidence in the Arraw, thiéré, and Sankhal ledger records, not as a dedicated record. Proposal-local source prefix **WP03-THIAKRY-20261013-** was unused before drafting.

The static picker projection follows the current IngredientSearch.kt normalization and phrase-first / substring-fallback behavior, using reference names and aliases plus form labels and match terms. It is a source-code projection, not an Android runtime observation.

| Query | Current owner | Projection with proposed row |
| --- | --- | --- |
| **thiakry**, **thiacry**, **thiacri** | No active match | Only proposed thiakry row |
| **pre-cooked millet granules** | No active match | Only proposed thiakry row |
| **granulés de mil précuits** | No active match | Only proposed thiakry row |
| **millet granules**, **granules de mil** | Arraw | Arraw and thiakry; expected broader search results |
| **millet couscous**, **couscous de mil**, **thiéré** | Existing thiéré reference | Unchanged; thiakry is not returned |
| **sankhal**, **sanxal** | Existing Sankhal reference | Unchanged; thiakry is not returned |
| **gruau de mil**, **dégué** | No active match | Still no match; neither is proposed as an alias |
| **millet** | 17 references | 18 references |
| **mil** | 4 references | 5 references |

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned across string fields for thiakry spellings, the proposed English/French displays, granule phrases, and neighboring thiéré, Arraw, Sankhal, and dégué terms. The scan found **0 of 114 recipe files** and **0 of 1,123 ingredient rows** with a whole-phrase match. No bundled recipe link, recipe-line change, or recipe-derived demand is supported.

## Measurement, form, and substitution disposition

| Data area | Recommendation | Evidence and limit |
| --- | --- | --- |
| Measurement state | **blocked_pending_evidence** | Health Canada’s CNF 2026 is the current Canadian reference dataset, but its published Food Name and Measure Weight Conversion CSV routes returned 403 during this review. Do not interpret that access failure as evidence that the file has no matching record. Reopen when the endpoint is accessible. |
| Source-specific recipe amount | Keep only as a cited, source-scoped observation if the ledger later records it | FAO’s “Thiacry Mil” recipe lists **200 g granulés de thiacry de mil prêts à cuire** and gives no serving count. This is a whole-recipe amount for that recipe, not a per-person quantity or active measure. |
| Ambiguous recipe amount | Do not attribute to thiakry | Naboo’s page for its THIACRI product includes a recipe line for **200 g grains de mil**, but the line names millet grain rather than thiacri. Do not treat it as a thiakry observation or infer that it is the product quantity. |
| Package weights | Do not convert or generalize | The Montréal listings show 600 g packages. Package mass is not a cup measure, serving size, or recipe yield. |
| Density and unit mappings | Keep null / empty | No thiakry-specific, transferable mass-per-volume evidence is available. Do not borrow millet-grain, couscous, Arraw, or Sankhal values. |
| Forms and process conversion | Add none | Sellers describe precooking and drying, while preparation instructions vary and may include soaking followed by additional steaming or microwaving. This variation does not support a universal dry/rehydrated form mapping or conversion. |
| Cooking and package yield | Add none | No paired before/after mass or source-neutral package yield was found. |
| Substitution | No active rule | Afritibi’s broad product copy suggests using thiakry in place of rice or pasta, but gives no recipe context, amount, cooking method, or validated ratio. This marketing claim does not support a global or contextual substitution rule. |

Do not infer a recipe water ratio from FAO or seller instructions. Keep the measurement state blocked until the CNF 2026 name and measure files can be checked; then assess any result for exact product identity and dry/prepared state before proposing a mapping. No app tests or emulator verification are needed for this proposal-only task.

## Proposal-local source register

Sources were reviewed on 2026-10-13. The source IDs below are local to this proposal and are not registered in the shared ledger.

| Source ID | Source and locator | Evidence and limit |
| --- | --- | --- |
| **WP03-THIAKRY-20261013-S01** | République du Sénégal, [Répertoire des normes dans le domaine agroalimentaire](https://senegalcommerce.sec.gouv.sn/Documents/ASN/Publications/R%C3%A9pertoire%20des%20Normes%20dans%20le%20Domaine%20Agroalimentaire.PDF), cereal entry NS 03-099. | Government-hosted directory lists granules of cereal flours under NS 03-099. Use it as evidence that a product standard exists, not as the full standard text or a recipe specification. |
| **WP03-THIAKRY-20261013-S02** | FAO / Codex, [Report on transcription of Codex standards in Senegal](https://www.fao.org/fileadmin/user_upload/codexalimentarius/doc/CTF/CTF_SENEGAL4-1-2.pdf), pp. 43 and 49. | Lists NS 03-099 precooked cereal/other-plant flour granules “thiakry” separately from NS 03-084 millet Arraw, NS 03-103 millet couscous, and NS 03-113 Sanxal de mil. It is a transcription report, not the complete standards. |
| **WP03-THIAKRY-20261013-S03** | FAO / WHO Codex Alimentarius, [REP25/AFRICA final report](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FMeetings%252FCX-707-25%252FFINAL%252520REPORT%252FREP25_AFRICAe.pdf), paras. 63–68. | Records the millet-based scope then proposed by Senegal, regional comments that other flours and country names occur, and the request to revise and resubmit at CCAFRICA26. It documents ongoing standards work; it is not an adopted thiakry standard. |
| **WP03-THIAKRY-20261013-S04** | FAO / WHO Codex Alimentarius, [CX/AFRICA 25/25/10 Add.2](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FMeetings%252FCX-707-25%252FWorking%2BDocuments%252Fca25_10_Add2e.pdf), proposed project paper and process diagram. | Provides a proposed description and example process for precooked cereal/other-plant flour granules. Its draft values and process are proposal-specific and do not establish universal preparation or yield. |
| **WP03-THIAKRY-20261013-S05** | Institut de Technologie Alimentaire du Sénégal, [Formations à la carte](https://ita.sn/formation/), lines 163–172. | Lists production of Sankhal, thiacry or couscous, and Arraw separately. Supports the distinct product boundary, not an ingredient formula or measure. |
| **WP03-THIAKRY-20261013-S06** | Maad MTL, [Thiakry (Dégué), 600 g](https://maadmtl.com/products/thiakry-degue), product description and preparation. | Montréal-area seller describes millet flour rolled into granules, steam-precooked and dried, then gives product-specific rehydration and serving directions with milk or yogurt. The 600 g is package mass. The page also uses “Dégué” and “gruau de mil”; those seller terms are not promoted to global aliases. |
| **WP03-THIAKRY-20261013-S07** | Naboo, Montréal, [Gruau de mil (Thiacri), 600 g](https://naboolaboutique.ca/product/gruau-de-mil-thiacri-600g/), product listing and description. | Uses THIACRI as the product label, describes fine millet granules cooked by steam and used with yogurt, and separately lists Arraw, Sankhal, millet flour, and thiéré. Its attached 200 g recipe says “grains de mil,” so that quantity is not assigned to thiacri. The package weight is product-specific. |
| **WP03-THIAKRY-20261013-S08** | FAO Senegal, [Thiacry Mil recipe collection](https://www.fao.org/fileadmin/templates/olq/files/generaldoc/Senegal_libretto.pdf), p. 13. | Explicitly lists 200 g of ready-to-cook millet thiacry granules, with no serving count. Supports one source-scoped whole-recipe amount, not a default measure, density, or yield. |
| **WP03-THIAKRY-20261013-S09** | Office québécois de la langue française, [GDT: millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet). | Lists French terms millet, mil, and petit mil and says millet is a generic term covering multiple species. It does not define thiakry or approve a product-specific display. |
| **WP03-THIAKRY-20261013-S10** | Office québécois de la langue française, [GDT: gruau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau). | Defines Québec/Canada gruau as a cooked oatmeal dish and notes the meaning can extend to other cereal porridges. Supports keeping this prepared-food term off the dry granule identity; it does not adjudicate the Montréal retailer’s product label. |
| **WP03-THIAKRY-20261013-S11** | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) and [CNF 2026 Open Government record](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1). | Confirms CNF 2026 is Health Canada’s current relational CSV database. The Food Name and Measure Weight Conversion download endpoints returned 403 to the review tool; no claim is made about whether those files contain thiakry or useful measures. |
| **WP03-THIAKRY-20261013-S12** | Afritibi, [Thiakry](https://afritibi.com/en/produit/thiakry/), product copy. | Makes a broad rice-or-pasta replacement claim without a quantity, dish scope, or preparation crosswalk. It is insufficient evidence for an active substitution rule. |

## Proposal disposition

**Integrated an identity-only, millet-scoped thiakry row.** The standards records, Senegalese product sources, and Montréal listings support this regional preprocessed-grain identity and its separation from Arraw, thiéré, Sankhal, and prepared dairy dessert. Broader non-millet regional products remain outside the row. The FAO 200 g amount is source-scoped; no active measures, forms, recipe links, yields, conversions, or substitutions were added. Measurement research remains **blocked_pending_evidence** until CNF 2026 files can be inspected. No app tests or emulator checks were run for this catalog-data update; only the generated index changed outside the database JSON data. Section F remains open.
