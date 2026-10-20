# WP02 Section B R261 — African yam bean seed-flour gap review

- **Reviewed:** 2026-10-16.
- **Status:** Reviewed and recorded as a hold on 2026-10-16; no shared catalog or ledger data changed. See the [integration README](../batches/wp02-section-b-african-yam-bean-seed-flour-hold-integration-r261-20261016/README.md).
- **Plan fit:** One candidate under Section 04, B “Alternative flours starches and regional starch products,” within the still-open legume-flour coverage. This does not close the broader Section B checklist.
- **Proposal-local source-ID prefix:** **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S**. No R261 source ID or African-yam-bean seed-flour owner was found in the live ledger/catalog. The FAO Compendium and OQLF URLs below are intentionally reused general sources already referenced by other ledger entries; the other listed URLs had no exact ledger URL match when checked.

## Recommendation

**Hold an active African-yam-bean seed-flour reference, display, aliases, forms, and ledger candidate pending a paired review of the whole-seed identity and a product-matched Québec French name.**

The ingredient itself is supported: *Sphenostylis stenocarpa* is accepted by Kew as African yam bean, its seeds are edible, FAO describes seeds being ground into flour for baked foods, and food-science studies use African yam bean seed flour. This establishes a real flour concept, but not a Canadian retail product name or a Québec French display. The Canadian-facing flour listings checked use generic “beans flour” or distinct yam-flour wording and do not identify *S. stenocarpa*. This bounded scan is not proof that no Canadian supplier exists. [S01–S06, S09–S10]

There is also a name and picker boundary. The OQLF entry for jicama identifies *Pachyrhizus erosus*, lists “yam bean” and “yam-bean” among its English terms, and says jicama differs from yam-bean. The live catalog does not activate those English terms on jicama, but a new display containing “African yam bean” would match an unqualified “yam bean” query through the picker’s substring fallback. No whole-*S. stenocarpa* seed identity exists to appear alongside it. A paired seed-and-flour review can preserve the plant-part distinction and prevent the flour from becoming the only result for a broad name query. Do not import the jicama terms as aliases. [S03]

## Candidate names and product boundaries

| Candidate or neighbor | Disposition | Evidence and limit |
|---|---|---|
| **African yam bean seed flour** | Research-qualified candidate name only; do not activate now. | Food research and FAO describe flour made from African yam bean seeds. Adding “seed” makes the plant part explicit, but it is not a verified Canadian package display. [S02, S05–S08] |
| **African yam bean flour** | Research wording only; no alias now. | Used in food-science literature and FAO’s food-use description. It does not itself identify the seed versus tuber product in a picker. [S02, S06–S07] |
| **Sphenostylis stenocarpa seed flour** | Scientific search wording only; no alias now. | Makes the species and plant part explicit, but has not been found as a Canadian consumer product name. [S01, S05–S08] |
| **Farine de graines de Sphenostylis stenocarpa** | Possible descriptive French construction for a future review, not an approved Québec display or alias. | No Québec source or Canadian French product label was found for this flour. Feedipedia lists French common names for the plant, but not a product-matched seed-flour name. [S04, S09–S10] |
| **Yam bean / yam-bean / yam pea** | Keep unassigned as aliases for this flour. | “Yam bean” and “yam-bean” occur in the OQLF jicama entry for *Pachyrhizus erosus*, with a note distinguishing jicama from yam-bean. “Yam pea” is a species common name, not a source-attested flour name. [S01, S03] |
| **Yam flour / farine d’igname** | Keep with the existing true-yam root-flour identity. | The active row is **ingredient-ref-yam-flour**; it is not flour from African yam bean seeds. [S01] |
| African yam bean tuber flour, whole seeds, isolated starch, defatted flour, protein concentrate/isolate, and composites | Keep as separate products or future reviews; none is a form of this proposed seed flour. | The species has both edible seeds and tubers. Studies also prepare different processed flours and protein fractions; these do not establish shared consumer forms or equivalence. [S02, S04, S07–S08] |

## Ownership, picker, archive, and recipe audit

The read-only package snapshot contains **1,650 active ingredient references**, **125 ingredient forms**, **61 legacy-import candidates**, and **1,998 research-ledger records**. The bundled manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Finding |
|---|---|
| Active references and forms | No exact owner, alias, or form was found for African yam bean, *Sphenostylis stenocarpa*, African yam bean flour, yam bean flour, or the proposed French construction. Nearby active identities include **ingredient-ref-yam-flour** (true-yam flour), **ingredient-ref-yam** (true yam), and **ingredient-ref-jicama** (jicama). No candidate row or aliases are proposed. |
| Legacy imports | No African-yam-bean, *Sphenostylis*, or yam-bean flour candidate appears in the 61 legacy identities. |
| Research ledger | No African-yam-bean or *Sphenostylis* flour record was found among the 1,998 records. The R261 source-ID prefix is unused. The FAO Compendium URL is already cited by the vernonia-leaves record, and the OQLF jicama URL is already cited by jicama and yacon records; both are reused here only for their generally relevant evidence. No R261 ledger record is created. |
| Proposal and batch archive | Searches found no focused African-yam-bean seed-flour review or active owner. Existing jicama reviews keep “yam bean” unresolved; those do not review flour of *S. stenocarpa*. |
| Picker | **IngredientSearch.kt** normalizes queries, prefers complete word-phrase matches, then uses substring matching. A future “African yam bean seed flour” display could be returned for the broad query “yam bean”; without a whole-seed row it could be the sole result. Keep the unqualified “yam bean,” “yam pea,” “bean flour,” and “yam flour” aliases inactive. |
| Bundled recipes | A manifest-ordered scan of all 114 recipe files and 1,123 ingredient rows found no candidate-name phrase and no candidate ingredient-reference link. No recipe link, relabeling, or substitution rule is proposed. |

## Category, forms, measurements, and substitution

- **Category if later accepted:** **FLOUR_AND_STARCH**.
- **Display:** no active English or French display is approved now. The research-qualified English candidate is **African yam bean seed flour**. The French phrase **farine de graines de Sphenostylis stenocarpa** is only a descriptive construction pending Québec terminology or product-label evidence.
- **Aliases:** none proposed. Do not add **yam bean**, **yam-bean**, **yam pea**, **yam flour**, **bean flour**, or an unqualified French construction.
- **Forms:** none. Raw, soaked, dehulled, roasted, boiled, blanched, autoclaved, and defatted samples are research preparations. They do not establish standardized retail forms or directed form conversions. Protein concentrates and isolates are different products.
- **Measurements and mappings:** none. Agunwah et al. report bulk densities of 0.35 ± 0.10 for full-fat flour and 0.50 ± 0.01 for defatted flour, but the abstract omits the unit. Igbokwe et al. report 0.43–0.68 mg/mL, a stated unit that is unsuitable for activation without clarification. Obasi et al.’s 0.53–0.71 g/mL range is reported among the tested biscuit samples, not as a reusable kitchen measure. These study-specific functional results do not establish a package amount, cup weight, density, or unit mapping. [S06–S08]
- **Substitution:** no general flour replacement or runtime rule. Obasi et al. tested 25% and 50% African yam bean flour in a particular wheat-biscuit formula and found those samples comparable to that study’s control. Adamson et al. optimized one wheat-bread formulation at 15% *S. stenocarpa* flour. Those results are formulation- and process-specific; they do not establish a ratio for arbitrary recipes. [S05–S06]

## Limitations and bounded next step

The Canadian product search was limited to targeted searches and current Toronto/GTA retailer listings. It does not establish market-wide absence, import status, standardized grades, or regulatory suitability. FAO and food-science evidence supports food use in its source contexts, not safety or equivalence for every processing state. The French common names found outside Québec are not approved Québec terminology. This review does not establish a standard seed-preparation process, consumer form, measure, density, yield, or substitution.

Reopen when the review can assess the whole *S. stenocarpa* seed identity alongside its flour, verify a Canadian or Québec-facing culinary product or stronger consumer naming evidence, and obtain product-matched Québec French wording. Then recheck picker queries for **African yam bean**, **yam bean**, and **yam flour** before proposing any display or alias. Until then, keep the candidate and evidence proposal-local.

## Source register

Sources checked 2026-10-16. IDs are proposal-local; no ledger records are added.

| ID | Source | Supports and limits |
|---|---|---|
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S01** | Kew, [Plants of the World Online: *Sphenostylis stenocarpa*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:519235-1/general-information). | Accepts the scientific name, gives tropical Africa as native range, and lists “African Yam Bean” and “Yam Pea” as common names. Taxonomy and plant common names do not establish a flour package name. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S02** | FAO, [Compendium of Forgotten Foods](https://openknowledge.fao.org/3/cc5044en/cc5044en.pdf), African yam bean entry. | Identifies *S. stenocarpa*, reports seeds boiled or ground into flour and used in baked products, and separately describes tuber uses. The PDF URL is already cited under the vernonia-leaves ledger record; the African-yam-bean entry is reused here as general evidence. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S03** | Office québécois de la langue française, [dolique bulbeux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17020934/dolique-bulbeux). | Identifies jicama as *Pachyrhizus erosus*, lists “yam bean” and “yam-bean” among English terms, and notes jicama differs from yam-bean. It does not name African yam bean or a seed flour. The URL is already cited on jicama and yacon ledger records. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S04** | Feedipedia, [African yam bean (*Sphenostylis stenocarpa*)](https://feedipedia.review.fao.org/node/704). | Lists seeds and tubers and English/French common plant names including “African yam bean,” “yam-pea,” “pois tubéreux africain,” and “haricot igname.” This is not a Québec terminology source and does not establish a flour display. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S05** | Adamson, Indrani, and Prabhasankar, [“Nutritional evaluation of *Sphenostylis stenocarpa* flour, its bread and effect of additives”](https://pmc.ncbi.nlm.nih.gov/articles/PMC9046504/), *Journal of Food Science and Technology* 59(5) (2022), 1889–1900. | Primary bread study reports optimizing a wheat-blend formulation at 15% *S. stenocarpa* flour. This is a single bread formulation and does not establish a general replacement ratio or retail name. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S06** | Obasi, Uchechukwu, and Eke-Obia, [“Production and Evaluation of Biscuits from African Yam Bean (*Sphenostylis stenocarpa*) and Wheat (*Triticum aestivum*) Flours”](https://www.iiste.org/Journals/index.php/FSQM/article/view/2720), *Food Science and Quality Management* 7 (2012). | Primary biscuit study describes sorting, drying, roasting, soaking, dehulling, milling, and sieving the seeds; it tested wheat/flour blends at 100:0, 75:25, 50:50, 25:75, and 0:100. Its sensory and functional findings are specific to those samples and that biscuit formula. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S07** | Agunwah et al., [“Evaluation of the Proximate and Functional Properties of Flours from Brown Variety of African Yam Bean (*Sphenostylis stenocarpa*) Seeds”](https://doi.org/10.9734/cjast/2019/v38i630388), *Current Journal of Applied Science and Technology* 38(6) (2019). | Primary study produces full-fat flour from soaked, dehulled seeds and then defatted flour, protein isolate, and protein concentrate. Its abstract reports bulk densities of 0.35 ± 0.10 and 0.50 ± 0.01 but omits the unit; neither value is activated. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S08** | Igbokwe, Okoye, and Egbujie, [“Effect of Thermal Processing Treatments on the Proximate, Functional and Pasting Properties of African Yam Bean Seed Flours”](https://www.journalajfrn.com/index.php/AJFRN/article/view/136), *Asian Journal of Food Research and Nutrition* 3(2) (2024). | Primary study compares raw, boiled, blanched, roasted, and autoclaved seed flours. Its abstract gives bulk density as 0.43–0.68 mg/mL, so the value is not used as active conversion evidence. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S09** | iLeOja, [Beans Flour 1Kg](https://ileoja.ca/beans-flour/), Toronto/GTA retailer. | Current Canadian-facing page uses a generic beans-flour title and does not identify *S. stenocarpa*. This is one bounded retailer check, not proof that a species-specific product is unavailable in Canada. |
| **WP02-SECTION-B-AYB-SEED-FLOUR-R261-20261016-S10** | Starfish Market, [Flours](https://starfishmarket.ca/collections/flour), Canadian retailer. | Current listing includes generic “Beans Flour” and a separately named “Yam Flour”; neither listing identifies African yam bean seed flour. This supports checking product identity carefully, not a market-wide absence claim. |
