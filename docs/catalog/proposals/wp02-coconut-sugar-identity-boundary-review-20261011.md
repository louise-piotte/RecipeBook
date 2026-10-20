# WP02 Section C — coconut sugar identity-boundary review

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, recipe, test, or code changes are proposed in this file.
- **Scope:** The open Section C `coconut sugar` candidate, including naming, product boundary, measurements, process yield, and substitution evidence.

## Recommendation

Recognize coconut sugar as its own `SUGAR_AND_SWEETENER` ingredient identity: **coconut sugar / sucre de noix de coco**. It is a sweetener made from tapped coconut-palm inflorescence sap and cooked into a solid, granulated product. It is not a form of coconut flesh, and it should not be merged into generic palm sugar.

If accepted, use these source-supported search terms:

| Language | Canonical name | Supported aliases |
|---|---|---|
| English | coconut sugar | coconut palm sugar; coco sugar; coconut sap sugar; coconut blossom sugar |
| French | sucre de noix de coco | sucre de fleur de coco; sucre de coco |

Do not attach `palm sugar`, `sucre de palme`, coconut sap syrup, coconut flower syrup, coconut palm jaggery, or gula melaka as aliases. Keep granule-size differences as product descriptors; current evidence and recipe demand do not require separate forms. Add no density, unit mapping, mass-volume conversion, recipe link, culinary yield, or substitution rule.

## Repository preflight

The Section C checklist entry at line 1366 still includes coconut sugar and remains open. In the current working-tree snapshot, the active catalog contains 928 ingredient references and 52 forms; the legacy-import file contains 76 candidates.

The nearest active references are `ingredient-ref-coconut` (coconut / noix de coco, category `FRUIT`), `ingredient-ref-coconut-milk`, `ingredient-ref-coconut-oil`, `ingredient-ref-cream-of-coconut`, and `ingredient-ref-shredded-coconut`. There is no coconut-sugar reference or coconut-related form. No exact coconut-sugar record or source was found in the research ledger. Existing WP03 coconut-product work concerns coconut flesh and products such as shredded coconut; WP05’s kaya review treats coconut sap syrup and the source-specific Kampong Speu palm-sugar syrup separately. No existing proposal reviews coconut sugar itself.

An exact normalized-key audit of the active references, forms, and all legacy candidates found no collision for the proposed names or these boundary terms: `coconut sugar`, `coconut palm sugar`, `coco sugar`, `coconut sap sugar`, `coconut blossom sugar`, `sucre de noix de coco`, `sucre de fleur de coco`, `sucre de coco`, `palm sugar`, `sucre de palme`, `coconut syrup`, `coconut sap syrup`, `coconut blossom syrup`, `coconut jaggery`, and `gula melaka`.

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. There are zero matches for the proposed aliases or neighboring syrup/palm-sugar terms in ingredient-line text, names, notes, or reference IDs. The corpus has 15 other coconut or coconut-product rows across 11 recipes, but none requests coconut sugar. No recipe link or demand-based conversion is warranted.

## Source facts and limits

All online sources below were accessed 2026-10-11. The source facts are kept separate from the catalog recommendations that follow.

| ID | Source and observed facts | Limits |
|---|---|---|
| **WP02-CS-20261011-S01** | Office québécois de la langue française, [sucre de fleur de coco, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26522575/sucre-de-fleur-de-coco). The 2013 entry defines it as sugar from coconut-palm flower sap; lists `sucre de fleur de coco`, `sucre de coco`, and `sucre de noix de coco` as French terms, and `coconut sugar`, `coconut palm sugar`, and `coco sugar` in English. | Strong Québec terminology evidence, but not a product standard. Its additional note that the sugar is “90% fructose and sucrose” has no cited analytical basis or clear denominator here and is not used as a composition value. |
| **WP02-CS-20261011-S02** | Lantic & Rogers, [Coconut Sugar](https://lanticrogers.com/en/products/coconut-sugar/). The Canadian supplier says its product is made from sweet sap of tropical coconut blossoms, presents it as a cane-sugar alternative, and lists a countrywide 450 g bag. | Supports a Canadian retail name, source, and package size for this product. Its “1:1 replacement” claim does not state whether the ratio is by mass or volume. |
| **WP02-CS-20261011-S03** | Lantic & Rogers, [Sucre de noix de coco](https://lanticrogers.com/fr/products/sucre-de-noix-de-coco/). The French product heading is `Sucre de noix de coco`; the description says the sweetener comes from sap of tropical coconut-palm buds and lists the 450 g bag. It says cane sugar can be replaced “dans les mêmes proportions.” | Direct Canadian French product wording. The replacement statement is a maker claim with no explicit measure basis or tested recipe scope. |
| **WP02-CS-20261011-S04** | Philippine Department of Agriculture, Bureau of Agriculture and Fisheries Standards, [approved Philippine national standards](https://bafs.da.gov.ph/index.php/approved-philippine-national-standards/), lists PNS/BAFS 76:2016, `Coconut sap sugar – Grading and classification`. The linked [2016 product-standard PDF](https://www.pca.gov.ph/images/Article/market_2025/PNS-BAFS_76-2016_-_Coconut_Sap_Sugar__Product_Standard__Specification.pdf) sets water activity ≤0.60, moisture ≤3.5%, glucose 2–3%, fructose 1–4%, sucrose 78–89%, ash ≤2.4%, and permits no additives. | The BAFS index was accessible; direct PDF retrieval returned 403, while its indexed text exposed the table. These are specifications for product conforming to this standard, not a guarantee about every retail item sold under a similar name. |
| **WP02-CS-20261011-S05** | Philippine Coconut Authority, Food Product Development Division, [Coconut Sugar Guide No. 05](https://www.pca.gov.ph/images/brochure/2023/FPDD_Guide_No_05_Coconut_Sugar.pdf). Indexed guide text describes tapping unopened coconut inflorescence, cooking the sap, continuing to stir as it becomes viscous until it granulates, then sieving, drying, weighing, and packaging. It gives heating around 115°C for about 3–4 hours depending on sap volume and method. | Direct PDF retrieval returned 403; process details were available in the search index. This is a production guide, not a home recipe or a household conversion standard. |
| **WP02-CS-20261011-S06** | Philippine Coconut Authority, [Coconut sap syrup processing guide](https://www.pca.gov.ph/pdf/cocoTech/processingTechnologies_Food/CoconutSapSyrup.pdf). Indexed text describes sap syrup as fresh sap boiled until sticky, concentrated to about 75–78°Brix, and packed hot in containers. | Direct PDF retrieval returned 403; the indexed text was available. It supports a liquid sap-syrup product endpoint, not a volume or substitution conversion. |
| **WP02-CS-20261011-S07** | Philippine Coconut Authority, [Coconut sap-based products technology description](https://www.pca.gov.ph/pdf/cocoTech/processingTechnologies_Food/CoconutSapBasedProducts.pdf). Indexed text describes granulated sugar after sap is boiled and stirred to a granular endpoint; it states that 1 kg of coconut sap sugar can be produced from about 7–8 L of fresh sweet sap. | Direct PDF retrieval returned 403; indexed text was available. This is an agricultural process-yield estimate with unspecified variability, not a recipe, package, or ingredient conversion. |
| **WP02-CS-20261011-S08** | Yupik, [Organic Coconut Sugar Crystals](https://yupik.com/en/organic-coconut-sugar-crystals-p31081). The Canadian product page calls the product “Organic Coconut Palm Sugar”; gives origin as India/Indonesia and ingredients as organic coconut sugar; its bilingual nutrition panel declares 1 tsp / 1 c. à thé (4 g). It also claims a 1:1 replacement for refined sugar. | The 4 g serving is product-label evidence for this product, not a universal teaspoon weight or density. The replacement claim has no stated mass-versus-volume basis. |
| **WP02-CS-20261011-S09** | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), lists coconut sugar as 1/2 cup = 2 3/4 oz = 77 g. | One editorial chart entry; the coconut-sugar row does not state brand, granule size, or a packing/leveling procedure. It does not by itself establish a catalog-wide density. |
| **WP02-CS-20261011-S10** | Kharisman Tropical Ventures, [Coconut Sugar](https://www.kharismanventures.com/products/coconut-sugar). This Indonesian producer/exporter describes sugar made from filtered sap of *Cocos nucifera* flower buds and heated to crystalline granules, offers fine/medium/coarse sizes, and claims 1:1 replacement for regular sugar. Its published product spec gives sucrose 78–89%, reducing sugars ≤9%, and moisture ≤3%. | Producer and product-specific evidence; the claims do not establish universal granule, composition, measure, or substitution behavior. |
| **WP02-CS-20261011-S11** | LOC Industries, [Coconut Blossom Sugar](https://locindustries.com/product/coconut-sugar/). The B2B page uses `Coconut Blossom Sugar` and describes it as sugar from cut flower-bud sap of the coconut palm; it also calls the product coconut sugar. | Supplier product evidence for the English name. The page contains unrelated, inconsistent product metadata elsewhere; only its title and sap-source description are used here. |
| **WP02-CS-20261011-S12** | Wrage et al., [Coconut sugar (*Cocos nucifera* L.): Production process, chemical characterization, and sensory properties](https://doi.org/10.1016/j.lwt.2019.05.125), *LWT* 112 (2019), article 108227; see also the authors' [University of Hamburg dissertation record](https://ediss.sub.uni-hamburg.de/handle/ediss/8629?mode=full). The study assessed 107 commercial samples. The dissertation record reports C4-sugar addition ≥10 g/100 g in 10 of 59 tested samples and gluten ≥20 mg/kg in 3 of 36 tested samples; the article abstract also notes starch and coconut/palm oils in some samples. | Primary analytical study, but its retail/producer sample set and tested subsets are not a market-wide prevalence estimate. Some added materials may have a processing function; this does not show that every product contains them or invalidate the standard-defined identity. |
| **WP02-CS-20261011-S13** | European Commission, [Skor Thnot Kampong Speu protected-name specification](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A52022XC0725%2803%29). It identifies that palm sugar as made from *Borassus flabellifer* sap and lists granulated, paste, block, and syrup product types. | This is evidence about the named Cambodian product, not a definition of all palm sugars. It demonstrates why the bare `palm sugar` phrase is too broad for a coconut-specific alias. |
| **WP02-CS-20261011-S14** | Coconut Development Board of India, [Neera — Coconut Inflorescence Sap](https://coconutboard.in/neera-article.htm). The page describes coconut flower syrup as concentrated fresh sap, coconut palm jaggery as boiled sap crystallized in moulds, and coconut palm sugar as fine granules produced by further crystallizing syrup/jaggery. | Government board article with mixed secondary material and inconsistent nutrition claims. Used only to document neighboring product forms and process terminology, not composition, health claims, or a yield ratio. |

## Identity and boundary interpretation

- The OQLF, Canadian product label, and Philippine standard converge on a sugar product from coconut-palm flower/inflorescence sap. The coconut reference is the fruit/flesh identity. Therefore coconut sugar deserves its own sweetener identity rather than a coconut-flesh form.
- `Coconut palm sugar`, `coco sugar`, and the French terms are explicitly paired with coconut sugar by OQLF. A supplier uses `coconut blossom sugar`, and the Philippine standard uses `coconut sap sugar` for this sap-derived crystalline product. These terms are appropriate search aliases within the coconut-specific boundary.
- Sap syrup shares the raw material but is sold and used as a sticky liquid product; the PCA describes it separately from the granulated sugar endpoint. Do not alias or convert coconut syrup into coconut sugar. Coconut palm jaggery is also left separate: the Coconut Development Board describes it as a molded product and describes granulated sugar as a further crystallized endpoint. That page also describes a process connection, so the evidence does not support a universal synonym or yield rule between them.
- Do not use unqualified `palm sugar` or `sucre de palme` as aliases. The European Commission’s Kampong Speu specification covers *Borassus flabellifer*, not *Cocos nucifera*. The open plan separately covers palm sugar and regional culinary sugars.
- Fine, medium, and coarse granules are cited product grades, not separate ingredient identities. With no coconut-sugar recipe lines, there is no demand for granularity forms or conversions.
- The PNS composition ranges describe a standardized product. The 2019 study found variable commercial composition and some additives in its sample set. Keep that variability as a product-label/procurement concern; do not encode a universal nutrition composition or assume every retail product meets the standard.

## Measures, conversion, yield, and substitution

| Evidence | What it establishes | Catalog action |
|---|---|---|
| Lantic 450 g bag [S02–S03] | One Canadian package size for the named product. | Preserve as source evidence only; no package-yield mapping. |
| Yupik 1 tsp = 4 g [S08] | A bilingual nutrition-label serving for one product. | Do not generalize to a default spoon measure or density. |
| King Arthur 1/2 cup = 77 g [S09] | One published volume-to-mass observation for a generic chart row. | Do not create a default density or unit mapping; packing and product basis are unspecified. |
| PCA 1 kg sugar from about 7–8 L sap [S07] | A farm-scale raw-sap production yield estimate. | Do not use as a culinary conversion or packaged-ingredient yield. |
| Lantic, Yupik, and Kharisman 1:1 statements [S02–S03, S08, S10] | These sellers describe coconut sugar as a 1:1 cane/refined/regular sugar replacement. | Record as unqualified product claims only. No mass/volume basis or recipe-specific performance is established; add no substitution rule. |

There is no source-backed general density, package-to-recipe yield, or robust household conversion for coconut sugar in the reviewed material. No substitution rule is proposed.

## Proposed catalog disposition

If the coordinator accepts this review, create a standalone reference with a provisional ID such as `ingredient-ref-coconut-sugar`, names and aliases shown above, category `SUGAR_AND_SWEETENER`, `defaultDensity: null`, and no unit mappings. Do not create a form or numeric conversion at this time. Keep the recipe corpus untouched; there are no matching recipe lines to relink.

Before integration, repeat the catalog and recipe-corpus audit because the shared working tree is changing in parallel.
