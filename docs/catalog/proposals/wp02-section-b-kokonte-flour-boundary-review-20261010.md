# WP02 Section B3 Kokonte flour identity and Québec French boundary review

- **Reviewed:** 2026-10-10
- **Status:** coordinator review completed 2026-10-10; a separate ingredient row remains on hold. See the integration note below.
- **Recommendation:** hold a separate Kokonte row pending resolution of its boundary with the already integrated lafun identity and the product's different marketed stages. Do not alias Kokonte to lafun, generic edible cassava flour, or generic fufu.
- **Scope:** Ghanaian source-named kokonte flour and the name's Québec French product-label evidence. This review does not reopen attiéké, lafun, pupuru, generic fufu/amala, or other already reviewed products.
- **Source-ID prefix:** WP02-KOKONTE-FLOUR-BOUNDARY-20261010-S01–S12. A search of docs/ and app/ found no matching source IDs; these IDs are proposal-local.

## Candidate and disposition

The B3 checklist still leaves other documented regional starches open. Kokonte is a well-attested Ghanaian cassava product, and commercial sources explicitly sell a flour under that name. However, the name is also applied to dried cassava chips and to the cooked staple. An IFPRI cassava review groups Ghanaian kokonte and Nigerian lafun as regional names for dried cassava roots. The sources reviewed here do not establish whether a separate Kokonte-flour row would represent a distinct ingredient from lafun or duplicate the broader dried-cassava flour class already covered by the catalog. **Hold pending a source-specific distinction.**

| Field | Candidate proposal if the boundary is resolved | Evidence and limits |
|---|---|---|
| Suggested ID | ingredient-ref-kokonte-flour (not allocated) | No exact current reference, form, legacy-candidate, or focused-proposal collision was found. |
| Category | FLOUR_AND_STARCH | The candidate is the milled flour product, not cassava root, extracted tapioca starch, chips, or prepared dough. |
| English display | kokonte flour | The CSIR Food Research Institute lists “Improved Kokonte Flour”; a Ghanaian manufacturer names its recipe ingredient “Konkonte cassava flour.” [S01, S11] |
| Québec French display | Kokonté - farine (provisional) | A Canadian retailer's French product title uses “Kokonté - Farine”; a Montréal retailer lists “KOKONTE farine de manioc.” These support a source-led product label, not an OQLF-preferred common name. Do not store the broader descriptor “farine de manioc” as a Kokonte alias. [S09–S10] |
| Possible English spelling alias | konkonte flour (not activated) | The Ghanaian manufacturer uses “konkonte flour” in its preparation instructions. The unaccented/accented Kokonte spelling difference is already handled by search normalization; no French spelling alias is needed. [S11] |
| French aliases | None | “Farine de manioc” is generic OQLF terminology, while “farine de manioc fermentée” is not unique in the reviewed Benin register: it is paired separately with LAFUN and AGBELIMA. Do not attach either phrase to Kokonte. [S12; see also the lafun boundary proposal] |

The candidate scope, if later approved, should be only the source-named unprepared flour. Do not include dried cassava chips, the flour's cooked stiff dough, or a general “brown fufu” identity. The sources support fermentation during some Kokonte processing, but retail listings do not establish a uniform process; do not make “fermented” a universal display qualifier. [S02–S05, S08, S11]

## Separate identity, measurement, form, and substitution decisions

- **Identity status:** hold. Ghanaian research and the CSIR technology record establish a named flour product. The unresolved question is whether it is a distinct ingredient from lafun or a country-specific name for an overlapping dried-cassava flour class. A distinct row should wait for a product-level source that resolves this relationship.
- **Density and unit mappings:** no supported kitchen value found in the reviewed sources. If later integrated, keep defaultDensity null and unitMappings empty; measurement state for generic household conversions is researched_no_supported_value. The Homefoods recipe gives 125 g flour with 480 g water for one brand's cooked preparation, but this is a recipe-specific mass ratio, not a volume-to-mass conversion, density, or general preparation rule. [S11]
- **Forms:** add no form. The flour is the ingredient candidate; dried chips are a pre-milling material, and the water-cooked stiff dough is a prepared food. The Ghana market report lists Kokonte both as dried cassava chips and as dried cassava powder, so these should not be collapsed into one selectable form without a source-specific package/recipe boundary. [S05–S06]
- **Substitution:** add no global or contextual rule; overall substitution research remains not_yet_researched. A MoFA/CSIR report says kokonte is unsuitable for bread and pastry use because its drying process ferments the product, unlike high-quality cassava flour. This is a bounded product-use distinction, not a general substitute relationship or ratio. [S02]
- **Recipe links and yields:** add none. The outside-corpus Homefoods recipe is not evidence of demand in RecipeBook and does not establish a cooked yield. [S11]

## Live catalog, proposal, and recipe audit

Snapshot taken on 2026-10-10 from the shared worktree:

| Surface | Current count |
|---|---:|
| Ingredient references | 881 |
| Ingredient forms | 48 |
| Research-ledger records | 1,126 |
| Legacy import candidates | 77 |
| Manifest-listed bundled recipes | 114 files / 1,123 ingredient lines |
| Existing proposal files | 264 Markdown files |

The active checklist leaves “water-chestnut flour and other documented regional starches” open. A prior cassava-cluster review held generic fermented-cassava products and other regional granules; this focused Kokonte review does not repeat the earlier taro-starch hold. A full proposal-directory search found two previous mentions of Kokonte: the lafun proposal's no-result/non-alias audit and the pupuru proposal's exclusion list. Neither is a focused Kokonte identity or Québec French review.

**Exact bundled recipe demand:** zero ingredient-line hits across all 114 manifest-listed recipes / 1,123 lines for kokonte, kokonté, konkonte, kokonte flour, konkonte flour, farine de kokonte, farine de manioc, cassava flour, dried cassava powder, or cassava chips. No source recipe line, amount, recipe link, or relink is inferred.

Search behavior was checked against IngredientSearch.kt: case and accents are folded, punctuation and spacing are normalized, complete word phrases are preferred, and substring matching is the fallback.

| Query or catalog term | Current result / collision boundary |
|---|---|
| kokonte, kokonté, konkonte, kokonte flour, konkonte flour | No active reference or form result. No exact legacy-candidate match. |
| cassava flour | Matches ingredient-ref-cassava-flour, displayed as edible cassava flour / farine comestible de manioc. Keep the generic English phrase off a Kokonte row. |
| farine de manioc | No current exact result. OQLF defines it generically as powder from dry-ground manioc roots; a Québec Kokonte retail label uses this phrase descriptively, but it is not a Kokonte-specific alias. |
| lafun | Resolves to the active ingredient-ref-lafun row. Nweke's regional review groups kokonte in Ghana and lafun in Nigeria as names for dried cassava roots. This potential overlap blocks a new canonical row or cross-alias until product-level evidence settles whether the names identify the same class. |
| tapioca starch, tapioca pearls, gari/garri, attiéké, sago pearls, edible sago flour, yam flour | Each remains a separate product identity; no Kokonte alias or merge is proposed. |
| farine de manioc fermentée | Not proposed as a French alias: a Benin government register uses it for both lafun and agbelima, and it does not settle the Québec term. [S12] |

No Kokonte-specific form or legacy candidate was found. One research-ledger record contains the broad phrase farine de manioc in the lafun record; it is not Kokonte evidence and does not justify a new alias. No source-ID prefix collision was found.

## Acceptance checks if a future review resolves the hold

1. Create only a source-bounded ingredient-ref-kokonte-flour row in FLOUR_AND_STARCH, with English kokonte flour and a Québec French display supported by a local product label; do not claim a preferred OQLF term.
2. Keep generic cassava flour / farine de manioc, the active lafun row, cassava root, tapioca starch/pearls, gari, attiéké, edible sago, and yam flour distinct. Do not alias kokonte to lafun or to generic fufu/amala wording.
3. If the exact product boundary is confirmed, consider only the English spelling alias konkonte flour. Keep French aliases empty; do not store farine de manioc, farine de manioc fermentée, cassava flour, cassava powder, brown fufu, or generic fufu as aliases.
4. Leave density null, unit mappings empty, forms absent, yields absent, and global/contextual substitutions absent. Keep the Homefoods mass recipe as product-specific preparation evidence only.
5. Verify that exact Kokonte and Konkonte queries resolve only to the source-bounded product while generic cassava flour and lafun continue to resolve only to their existing rows.
6. Add no recipe links unless a future manifest-listed ingredient line explicitly names the product.

## Bounded unresolved gaps

- The source-level relationship between Ghanaian kokonte flour and the active Nigerian lafun identity is unresolved. IFPRI groups them as regional terms for dried cassava roots, while Ghana-specific research describes Kokonte flour produced by drying chips with fermentation. The reviewed sources do not provide a direct product comparison or a stable universal boundary. [S02–S07]
- Kokonte is used for chips, powder/flour, and the cooked staple. The market report explicitly lists both dried cassava chips (Kokonte) and dried cassava powder (Kokonte); a future row must remain flour-specific and must not model chips or dough as forms. [S05–S06, S08, S11]
- The Montréal/Québec product listings support source-name use in French, but not a standardized Québec dictionary term. The proposed spelling Kokonté - farine is product-label evidence only; independent Québec terminology review remains open. [S09–S10]
- The proposed English spelling alias konkonte flour is supported by one Ghanaian brand's source wording. Broader spelling variants and French aliases remain unreviewed. [S11]
- The corpus has no direct recipe demand. The one reviewed external brand recipe provides a flour-to-water mass ratio for a cooked dough, not ingredient density, household measure, yield, or a transferable cooking instruction. [S11]

## Source register

All web sources were accessed 2026-10-10. Source IDs are proposal-local.

| ID | Source, date, and support |
|---|---|
| **S01** | Council for Scientific and Industrial Research (CSIR) Ghana, [Processed Foods Technologies](https://technologies.csirgh.com/mainprocessedfoods), undated page; the “Improved Kokonte Flour” technology is dated 1989. CSIR Food Research Institute describes solar/mechanical drying for high-quality fermented cassava flour and household/food-joint use. |
| **S02** | Ghana Ministry of Food and Agriculture / CSIR Food Research Institute, Lawrence Krampa et al., [“Awareness Creation on the Uses of High Quality Cassava Flour and Follow-up Meetings with Trained Bakers and Confectioners”](https://csirspace.foodresearchgh.org/bitstream/1/615/1/Awareness_Creation_Uses_High_Quality_Cassava_Flour.pdf), project report, March 2003. Distinguishes fermented konkonte from non-fermented high-quality cassava flour and says kokonte is unsuitable for bread/pastry use; community notes also use kokonte for cassava chips. |
| **S03** | University of Ghana, Eric Mantey Obilie, [MPhil thesis, “Microbiological and Biochemical Changes in the Production of Akyeke - A Fermented Cassava Product”](https://ugspace.ug.edu.gh/bitstreams/180c7b89-ab08-494b-ae01-2a194c8f8a96/download), June 2001, literature review pp. 1–2. Describes konkonte as fermented cassava flour made from cassava chips fermented while sun-drying; distinguishes it from high-moisture agbelima and other cassava products. This is literature-review context inside a thesis about Akyeke, not a Kokonte comparative trial. |
| **S04** | Quintson Philip Attah-Kumah, [“Effect of variety and processing methods (holding period and drying method) on quality of cassava flour (Kokonte) in the Hohoe Municipality of the Volta region of Ghana”](https://ir.knust.edu.gh/handle/123456789/8134), MPhil thesis, Kwame Nkrumah University of Science and Technology, April 2015. Studies local Kokonte flour from cassava chips, holding periods, and sun/solar drying; analytical/pasting findings are not kitchen measurements. |
| **S05** | Ghana Ministry of Food and Agriculture, [Techiman Market Monthly Report: Wholesale/Retail, January 2024](https://tecma.gov.gh/wp-content/uploads/2024/01/TECHIMAN-MARKET-MONTHLY-REPORTWHOLE-SALE-RETAIL-JANUARY-2024.pdf), January 2024. Lists “Dried Cassava Powder (Kokonte)” and “Dried Cassava Chips (Kokonte)” separately; supports the product-stage naming ambiguity, not equivalence between stages. |
| **S06** | Felix I. Nweke, International Food Policy Research Institute, [New Challenges in the Cassava Transformation in Nigeria and Ghana](https://ageconsearch.umn.edu/bitstream/16113/1/ep040118.pdf), EPTD Discussion Paper 118, 2004, p. 17. Groups dried roots as kokonte in Ghana and lafun in Nigeria, and notes chips/balls may be milled into flour. This is regional synthesis based partly on COSCA surveys, not a product-specific comparison; retained as evidence of a possible collision, not as a synonym authority. |
| **S07** | Ghana News Agency, Laudia Sawer, [“Kokonte: The publicly denied but secretly loved Ghanaian food”](https://gna.org.gh/2024/03/kokonte-the-publicly-denied-but-secretly-loved-ghanaian-food/), 2024-03-26. Describes dried cassava pieces milled into flour and current commercial flour; reports local preparation context. News feature, not a technical standard. |
| **S08** | George Amponsah Annor, Kwaku Tano Debrah, and Allen Essen, [“Mineral and phytate contents of some prepared popular Ghanaian foods”](https://link.springer.com/article/10.1186/s40064-016-2202-9), SpringerPlus 5, 581 (2016), DOI 10.1186/s40064-016-2202-9. Defines the prepared Konkonte dish as fermented cassava flour cooked to a paste with water, distinct in the study from cassava-and-plantain fufu. This is a food-composition study, not a flour-equivalence or substitution trial. |
| **S09** | HOGO Market, [French Montréal market listing for “KOKONTE farine de manioc”](https://shop.hogomarket.ca/shop/catalog/search?c=Derivesdumanioc&language=fr), undated product listing, accessed 2026-10-10. The page identifies the seller address as Montréal, Québec. Direct local label evidence only; it does not establish composition, preparation, or a preferred French term. |
| **S10** | LeRonier, [“Kokonté - Farine”](https://leronier.ca/fr/collections/semoules-et-pates/products/kokonte-flour), undated product page, accessed 2026-10-10. French product title and 2 kg cassava-flour package description; local product wording, not a terminology standard or composition statement. |
| **S11** | Homefoods Ghana, [Konkonte recipe and flour listing](https://homefoodsghana.com/index.php/recipes/recipes-list/110-konkonte), undated manufacturer page, accessed 2026-10-10. Names “Homefoods Konkonte cassava flour” and gives one recipe with 125 g flour and 480 g water to prepare cooked dough. The amount is recipe-specific and has no volume basis. |
| **S12** | Office québécois de la langue française, [farine de manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc), GDT; term attribution to AFNOR, 1979, accessed 2026-10-10. Defines the generic term as powder from dry-ground cassava roots and lists English cassava/manioc flour. It does not identify Kokonte. A targeted OQLF search for Kokonte/Kokonté found no dedicated entry. |

## Coordinator integration — 2026-10-10

Root reviewed the IFPRI cassava-processing synthesis, the CSIR Ghana technology record, and the Montréal/Québec listings. The evidence confirms Kokonte as a named flour product in Ghanaian sources and documents Canadian French retail labels, but does not resolve whether the stored flour identity overlaps the existing Nigerian lafun reference at the relevant product stage. IFPRI groups kokonte and lafun as dried cassava roots; Ghanaian sources distinguish named dried chips, flour, and prepared dough. This is insufficient to create a distinct row or an alias to lafun or generic cassava flour.

**Decision: hold `ingredient-ref-kokonte-flour` unallocated.** No active reference, alias, form, recipe link, measurement, or substitution was added. The proposal's no-recipe-hit result and its source-bounded spelling/Québec terminology limits stand. Reopen only with product-level comparative evidence that distinguishes Ghanaian Kokonte flour from the lafun product already represented in the catalog.
