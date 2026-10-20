# WP02 B2/B3 R90 review — white bean flour product boundary

- **Reviewed:** 2026-10-13.
- **Status:** Integrated documentation-only hold; no shared catalog or ledger data changed.
- **Plan fit:** The open Section 04 alternative-flour scope remains active. Focused reviews for whole Navy and whole Great Northern bean flour explicitly left generic white-bean flour unassigned; this review checks that open boundary with current Canadian and Québec evidence. See the [Section 04 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1838), the [Navy-flour review](wp02-b2b3-next-gap-review-20261012-round9.md), and the [Great Northern-flour review](wp02-b2b3-next-gap-review-20261012-round10.md).
- **Source-ID prefix:** **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90**. S01–S11 are unique to this proposal and are not allocated in the shared ledger.
- **Recommendation:** Keep both unqualified “white bean flour” and the directory-listed “whole white bean flour” candidate outside active references and the ledger. No identifier is assigned or reserved.

## Decision

**Hold the flour identity and its names unallocated.** Current sources use “white bean flour” for at least one flour made from white Navy beans, while Celiac Canada’s July 2026 finder separately lists AGT whole white-bean flour, whole Navy-bean flour, and other named whole-pulse flours. The finder does not state which white-bean variety or processing specification its white-bean entry represents. AGT’s current public flour table does not list white-bean flour, and its bean overview treats white as a family of varieties. The source names do not establish one market-wide English identity or an exact Québec French flour name. [S01–S06, S09]

The evidence confirms that white-bean flours are used in Canadian recipes and Québec ingredient declarations, but those uses do not settle what bean a standalone “white bean flour” query should select. The current Canadian retail listing identifies its product as white Navy bean; the Canadian product finder also distinguishes a whole white-bean flour from whole Navy-bean flour. Assigning the broad phrase to either row would discard one of those source distinctions. [S01, S04, S07–S08]

The reviewed recipes and studies provide no reusable mass-to-volume value or transferable substitution. Keep the whole-white-beans row, the Navy and Great Northern bean rows, and the source-scoped Navy and Great Northern flour rows unchanged. [S05–S11]

## Current ownership and picker boundary

The live reference catalog has 1,421 rows. The relevant current owners are:

| Phrase | Current owner | Boundary |
|---|---|---|
| **white beans**, **white bean**, **haricots blancs** | **ingredient-ref-white-beans**, category LEGUME_AND_PULSE. The singular English phrase is an alias; the plural French phrase is the display name. | Whole pulse, not flour. Its accepted ledger decision describes a broad white common-bean identity and intentionally avoids the ambiguous French singular haricot blanc. |
| **navy beans**, **navy bean**, **white pea bean(s)**, **haricots Navy**, **petit haricot blanc** | **ingredient-ref-navy-beans**, category LEGUME_AND_PULSE. | Whole Navy pulse. OQLF maps petit haricot blanc to Navy bean / white pea bean and distinguishes it within the wider white-bean family. |
| **Great Northern beans**, **Great Northern bean**, **haricots Great Northern**, **haricot Great Northern** | **ingredient-ref-great-northern-beans**, category LEGUME_AND_PULSE. | Whole Great Northern pulse; keep it distinct from generic white beans and Navy beans. |
| **whole navy bean flour**, **farine de haricots Navy entiers** | **ingredient-ref-navy-bean-flour**, category FLOUR_AND_STARCH; both alias arrays are empty. | Source-scoped whole-Navy flour. The short phrase navy bean flour matches its display. |
| **whole Great Northern bean flour**, **farine de haricots Great Northern entiers** | **ingredient-ref-great-northern-bean-flour**, category FLOUR_AND_STARCH; both alias arrays are empty. | Source-scoped whole Great Northern flour. |
| **black bean flour**; **faba bean flour**; **fava bean flour**; **Lima bean flour**; **whole pinto bean flour**; **whole red kidney bean flour** | **ingredient-ref-black-bean-flour**, **ingredient-ref-faba-bean-flour**, **ingredient-ref-fava-bean-flour**, **ingredient-ref-lima-bean-flour**, **ingredient-ref-pinto-bean-flour**, and **ingredient-ref-red-kidney-bean-flour**, respectively. Their alias arrays are empty. | Keep each named pulse flour distinct. No current display or alias owns the exact phrases white bean flour, whole white bean flour, farine de haricots blancs, or farine de haricots blancs entiers. |

An exact-name/alias scan found no current reference, form, legacy candidate, or allocated ledger identity for the candidate phrases. No relevant flour form is attached to the existing whole-pulse or flour rows. The base white-bean ledger record is identity-verified, while its measurement and substitution research remain not yet researched; this proposal does not change that record. [current catalog and ledger]

The picker in IngredientSearch.kt returns complete word-phrase matches before falling back to partial matches. This read-only projection applies its phrase behavior to the current names and aliases, then to a hypothetical row with display names “whole white bean flour” and “farine de haricots blancs entiers” and no aliases:

| Query | Current projected result | If that hypothetical row were added |
|---|---|---|
| **white bean flour** | No result. | The hypothetical row alone. |
| **whole white bean flour** | No result. | The hypothetical row alone. |
| **farine de haricots blancs entiers** | No result. | The hypothetical row alone. |
| **white bean** | ingredient-ref-white-beans | ingredient-ref-white-beans plus the hypothetical flour row. |
| **white beans** | ingredient-ref-white-beans | ingredient-ref-white-beans only; the flour display uses singular bean. |
| **haricots blancs** | ingredient-ref-white-beans | ingredient-ref-white-beans plus the hypothetical flour row. |
| **haricot blanc** or **petit haricot blanc** | ingredient-ref-navy-beans | ingredient-ref-navy-beans; the French flour display does not match this singular Navy term. |
| **navy bean flour** or **whole navy bean flour** | ingredient-ref-navy-bean-flour | ingredient-ref-navy-bean-flour only. |
| **Great Northern bean flour** | ingredient-ref-great-northern-bean-flour | ingredient-ref-great-northern-bean-flour only. |
| **bean flour** | Eight named flour references: black, faba, fava, Great Northern, Lima, Navy, pinto, and red kidney. | Those eight plus the hypothetical white-bean flour row. |

This projection exposes the key decision boundary. Adding the hypothetical row would make the broad search white bean flour return one result, even though Bare Market’s current Canadian product titled “White Bean Flour” is made from white Navy beans. Adding white bean flour as an alias to the Navy flour would also make that phrase return only Navy, despite the separate AGT “Whole White Bean Flour” listing. Do not create either singleton result until a maker source establishes what the distinct white-bean product contains and how its name is used. [S01, S04]

## Recipe demand

The read-only scan covered all **114 manifest-listed recipe files and 1,123 ingredient rows**. It found zero recipe strings for white bean flour, whole white bean flour, the reviewed French flour phrases, or the related Navy and Great Northern flour names, and zero ingredient rows linked to the whole-white-bean, Navy-bean, Great Northern-bean, or their flour reference IDs. No recipe link, recipe-level measure, or recipe-specific substitution is supported.

## Measurement, density, and conversion evidence

- Ontario Bean Growers, for a Pulse Canada pizza-crust recipe, specifies **2/3 cup (150 mL) white bean flour** alongside tapioca flour and xanthan gum. The page supplies no gram mass, flour brand, or bean variety. This is a recipe volume only, not a mass-to-volume conversion. [S08]
- Jacques et al. report bulk-density observations of **0.90 ± 0.01 g/mL** for ungerminated white-bean flour and **0.75 ± 0.02 g/mL** after three days of germination. Their Daloa-market beans were oven-dried for 48 hours at 65°C and ground for the study; the method describes weighing flour into a cylinder and tapping it ten times. The method heading calls this “bulk density of the starch” while the method text and results describe flour. These are process- and method-specific laboratory observations, not a household cup weight or a value for the Canadian retail or AGT product. Do not set defaultDensity or a unit mapping from these values. [S10]
- Molendum’s current manufacturer page names wholemeal white-bean flour milled from dry, mature, industrially cleaned Phaseolus vulgaris beans. It establishes a manufacturer-defined wholemeal product class, but gives no cultivar, Canadian or Québec market scope, or French flour name. AGT’s public page says pulse flours may be made from whole or dehulled pulses; this describes a wider product family, not the whole-white-bean product’s process. [S02, S09]

No reviewed source supplies a product-matched gram-per-cup value, a recipe mass measure, or a validated conversion for one consistent white-bean flour identity. Keep defaultDensity null and unitMappings empty if the candidate is revisited.

## Substitution evidence and limits

Han et al. tested white kidney bean flour produced by Shandong Pair and Multi-Mac Foods in high-gluten wheat-flour noodles. Their wheat-flour mixtures used 10%, 20%, 30%, and 40% white kidney bean flour; 20% scored best in that noodle study, while 30–40% performed worse on the reported quality measures. The product is specifically white kidney bean flour, the application is noodles, and the tested ratios are formulation results—not a general replacement rule for white-bean flour, wheat flour, or other foods. No global or contextual substitution rule is supported. [S11]

The Ontario pizza-crust recipe is a specific blend of white bean flour, tapioca flour, and xanthan gum, not an evaluation of interchangeable flours. Neither it nor the noodle study justifies a recipe-line substitution, yield, or form conversion. [S08, S11]

## Recommended catalog and ledger delta

**Hold: no delta.** Do not:

- Add a white-bean-flour ingredient reference, alias, legacy candidate, or ledger candidate.
- Assign or reserve an ingredient-reference ID.
- Add a French alias based on the composite-bread ingredient phrase; retain that phrase as source wording only.
- Add a form, default density, unit mapping, package yield, conversion, recipe link, or global/contextual/recipe-line substitution.
- Reassign or broaden the existing whole-white-bean, Navy, Great Northern, or named flour rows.

Revisit only if a current manufacturer specification or Canadian product label identifies the variety and milling/process scope of the separately listed whole white-bean flour; an independent Québec source attests the matching standalone French flour name; and any proposed mass conversion or substitution is supported by product- and method-matched measurements. Until then, keep the broad terms unassigned and preserve the current picker results.

## Source register

Sources checked online on 2026-10-13. The full R90 source IDs below are local to this review; none was added to the live ledger.

| Source ID | Source | Evidence used | Limits |
|---|---|---|---|
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S01** | Celiac Canada, [Gluten-Free Product Finder](https://www.celiac.ca/gf-product-finder/), last updated July 2026. | Lists AGT Whole White Bean Flour and Whole White Bean Flour – Deflavored separately from Whole Navy Bean Flour, Whole Great Northern Bean Flour, and other source-named pulse flours. | The finder says it is not updated in real time and some entries may be manufacturer ingredients. The white products have no UPC and no cultivar, process, detailed specification, or availability details. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S02** | AGT Foods, [PulsePlus Flours](https://www.agtfoods.com/ingredients/pulseplus-ingredients/flours), current manufacturer page. | Says pulse flours may be made from whole or dehulled pulses; explains AGT’s deflavouring technology and gives its current public product table. | The listed current flours are pea, lentil, chickpea, and faba; white-bean and Navy-bean flour are not listed. The omission does not establish that either product was discontinued. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S03** | AGT Foods, [Beans](https://www.agtfoods.com/about/productcategories/pulses/beans), current manufacturer page. | Lists multiple varieties in its white-bean family, including Navy and Great Northern. | Whole-bean family context only; it does not map the finder’s white-bean-flour product to a variety. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S04** | Bare Market, [White Bean Flour](https://baremarket.ca/products/bean-flour), current Canadian retailer listing. | The product title is White Bean Flour; its ingredient line says “white navy bean,” with 10 kg and 20 kg case sizes. This directly demonstrates one Canadian use of the broad product title for Navy flour. | Retailer copy rather than a manufacturer specification; no milling, heat-treatment, French-label, or household-measure details. Case size is not a recipe measure. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S05** | Office québécois de la langue française, [haricot blanc, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296956/haricot-blanc), updated 1991. | Gives haricot blanc as the preferred singular term, English white kidney bean, and Phaseolus vulgaris; its note says many varieties fall under white-bean wording. | Whole-bean terminology only; no flour compound or product identity. The entry is historical and does not attest today’s flour labels. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S06** | Office québécois de la langue française, [petit haricot blanc, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083589/petit-haricot-blanc), updated 1991. | Gives petit haricot blanc for Navy bean / white pea bean and notes Navy within the wider white-bean family. | Whole-pulse terminology only; does not name a Navy flour or resolve generic flour labeling. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S07** | Metro Québec, [Queen St. Bakery white-bean and millet bread](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-emballes/sans-gluten-et-dietes-speciales/pains-tranches-aux-haricots-blancs-et-graine-de-millet/p/833966000025), current indexed listing. | Its French ingredient statement includes FARINE DE HARICOTS BLANCS. | A composite bread ingredient statement, not a standalone flour package or variety specification. The search-indexed statement was available during review; direct page retrieval returned a cache miss. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S08** | Ontario Bean Growers, [Pizza Crust](https://ontariobeans.on.ca/recipe/pizza-crust/), recipe author Pulse Canada. | Uses 2/3 cup (150 mL) white bean flour in a Canadian recipe. | No flour mass, brand, bean variety, or standalone substitution trial. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S09** | Molendum Ingredients, [Wholemeal white, red, and pinto bean flour](https://www.molendum.com/en/food-industry-ingredients/natural-flour/wholemeal-flours/manufacturer-wholemeal-flour-white-red-pinto-beans/), current manufacturer page. | Names wholemeal white-bean flour and says it is milled from dry, mature, industrially cleaned Phaseolus vulgaris beans. | Non-Canadian manufacturer page; it gives no cultivar or Québec French product name and does not establish that its product matches AGT’s finder entry or the Canadian retailer’s Navy flour. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S10** | Gnanwa Mankambou Jacques et al. (2021), [Enzymatic activities, digestibility and functional properties of germinated white beans](https://www.innspub.net/wp-content/uploads/2022/05/IJB-V19-No5-p148-157.pdf), International Journal of Biosciences 19(5), 148–157. | Reports 0.90 ± 0.01 and 0.75 ± 0.02 g/mL bulk densities for the study’s ungerminated and three-day-germinated white-bean flour samples. | Daloa-market beans; no cultivar or Canadian product match. The lab method is a tapped-cylinder bulk-density procedure, and its heading says “starch” although its text and table refer to flour. Not a household conversion. |
| **WP02-B2B3-WHITE-BEAN-FLOUR-20261013-R90-S11** | Jiahui Han et al. (2022), [Effect of White Kidney Bean Flour on the Rheological Properties and Starch Digestion Characteristics of Noodle Dough](https://pmc.ncbi.nlm.nih.gov/articles/PMC9689948/), Foods 11(22), 3680. | Tests a named white-kidney flour in wheat noodles at 10–40%; 20% is the preferred level within that study. | One China-produced flour and one noodle formulation; no generic white-bean identity, household measurement, or transferable substitution ratio. |

## Static checks performed

- Read the active plan, work packet, latest roadmap entries, and the prior Navy and Great Northern reviews. Confirmed the broad B2/B3 scope remains open and the generic white-bean-flour phrase had not received a focused review.
- Ran read-only Python scans of the live seed package and ledger: 1,421 ingredient references, 104 forms, 63 legacy candidates, 1,760 ledger records, and 7,075 source entries; the manifest contains 114 recipe paths and 1,123 ingredient rows.
- Scanned all 1,123 recipe rows for the candidate English/French phrases and related white, Navy, and Great Northern flour wording, plus exact links to their existing reference IDs; found zero matching strings or links.
- Checked exact candidate-name ownership and the prospective R90 source-ID prefix against live references, forms, legacy candidates, and ledger entries. No exact owner or prefix collision was found.
- Read IngredientSearch.kt and ran read-only phrase-projection scans against current names and aliases, including the hypothetical whole-white-bean-flour display. Root independently rechecked candidate ownership, picker projection, and the recipe corpus while integrating this hold. No app or Gradle test was run because no database JSON changed.
- After saving, checked the proposal and integration note for UTF-8 without BOM, final newlines, trailing whitespace, mojibake markers, unique source IDs, and resolving local Markdown links. Root also updated the active Section 04 subtask and roadmap; no catalog or ledger data changed.

Root recorded this hold in the Section 04 plan, roadmap, and [integration note](../batches/wp02-b2b3-white-bean-flour-boundary-hold-integration-20261013/README.md). No Gradle, instrumentation, emulator, or app tests were run. This proposal does not complete WP02; the broader Section 04 B2/B3 work remains open.
