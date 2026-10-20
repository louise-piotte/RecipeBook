# WP02 A7 held-candidate recheck — 2026-10-10

## Scope and status

- **Review date:** 2026-10-10
- **Scope:** Recheck the four held A7 candidates from today's integration: barley meal, dry oat meal, generic malt flour, and toasted rye flour.
- **Disposition:** Proposal only. Recommend one generic identity-only reference for malt flour; hold the other three. No catalog, research ledger, recipe, test, plan, or roadmap file is changed here.
- **Proposal-local source IDs:** WP02-A7-HELD-CANDIDATE-RECHECK-20261010-S01 through S13; these are not research-ledger IDs.
- **Review inputs:** Repository AGENTS.md, Requirements.md, roadmap.md, the global catalog plan, the catalog workflow, the current A7 grain-meals/malt/toasted proposal, the wheat-meal follow-up, and the rye-meal boundary proposal.

## Recommendations

| Candidate | Disposition | Recommended catalog fields | Decision and limit |
| --- | --- | --- | --- |
| Barley meal | **Hold** | No ID, display, alias, or category proposed. | A Canadian maker's whole-grain barley-meal product and Statistics Canada's human-food classification establish that the product exists. No source reviewed supplies a separate Québec French display. Do not reuse the active barley-flour term **farine d'orge** or infer **gruau d'orge**. |
| Dry oat meal | **Hold as a separate identity or alias** | No ID or alias proposed. Retain the existing **oat flour / farine d'avoine** identity. | OQLF includes **oatmeal** as an English term for the dry flour product and, in a separate entry, marks the English term **oatmeal** as U.S. usage for the cooked dish **gruau**. That is not enough to assign the unqualified term globally or to establish a distinct product called **dry oat meal**. |
| Generic malt flour | **Recommend one identity-only reference** | ID **ingredient-ref-malt-flour**; English **malt flour**; Québec French **farine maltée**; English alias **malted cereal flour**; category **FLOUR_AND_STARCH**. | TERMIUM supplies the bilingual generic product term and definition. Keep this generic identity separate from cereal-specific malted-flour rows and from malt extract/syrup. The exact query has a known phrase overlap with the existing longer display **roasted wheat malt flour**; that is a search overlap, not equivalence. |
| Toasted rye flour | **Hold pending Québec French review** | No ID, final French display, or aliases proposed. The French-manufacturer label **farine de seigle toasté (bio)** is a review lead only. | Several current manufacturers identify toasted rye flour as a human-food bakery product. The French source found is from France, not Québec; no OQLF or Canadian source found in this pass confirms the Québec display or a processing boundary. Keep it separate from plain rye flour and malted rye flour. |

For the proposed malt-flour row, add no density, unit mapping, measurement, yield, form, conversion, recipe link, or substitution. Do not add an active/inactive or diastatic/non-diastatic form: a current baking-technology source says enzyme activity depends on malting and later heat treatment [S02]. Do not add a generic malt-flour alias to any cereal-specific row.

## Current catalog and exact recipe demand

The live bundled package at review contained 781 ingredient references and 36 ingredient forms. Relevant existing references include barley flour / **farine d'orge**, barley grain, oat flour / **farine d'avoine**, oat groats / **gruau d'avoine entier**, rolled/quick/instant oats, malted barley flour / **farine d'orge maltée**, malted wheat flour / **farine de blé maltée**, roasted wheat malt flour / **farine de malt de blé torréfié**, and malted rye flour / **farine de seigle malté**. The four held candidate phrases had no exact active reference or form owner. The exact query **malt flour** has a phrase-search result from **roasted wheat malt flour**; it is not an exact owner. The proposed ID **ingredient-ref-malt-flour** was unoccupied at this snapshot.

The audit covered all 114 recipes in the current manifest (1,123 ingredient rows). It checked ingredient **originalText**, **ingredientName**, **preparation**, and **notes**, plus each complete serialized recipe JSON. Search keys were lowercased, normalized with NFKD, folded for accents and common ligatures, and reduced to whitespace-separated alphanumeric words.

| Candidate | Audited terms, including French and adjacent spellings | Ingredient-line matches | Full recipe JSON matches |
| --- | --- | ---: | ---: |
| Barley meal | **barley meal**, **whole grain barley meal**, barley grits/grist, **gruau d'orge**, **semoule d'orge**, coarse/whole barley flour | 0 | 0 |
| Dry oat meal | **dry oat meal**, **dry oatmeal**, **oat meal**, **oatmeal**, **oatmeal flour**, **oat flour**, **farine d'avoine**, **gruau d'avoine** | 0 | 0 |
| Generic malt flour | **malt flour**, **malted cereal flour**, **farine maltée**, **farine de malt**, and cereal-specific malted-flour terms | 0 | 0 |
| Toasted rye flour | **toasted rye flour**, **roasted rye flour**, toasted rye, **farine de seigle toasté**, **farine de seigle grillée**, **farine de seigle torréfiée** | 0 | 0 |

No bundled recipe line supports a link for these candidates. The malt-flour recommendation is based on a source-defined generic product name, not recipe demand.

## Candidate boundaries

### Barley meal

The Ontario Made profile for Ottawa Valley Grain Products names a specific product, **Whole Grain Barley Meal**. It describes the product as whole barley that is crushed and ground, with a texture range from fine to coarse and the bran, germ, and endosperm retained [S06]. Statistics Canada's NAPCS 2022 also lists **barley meal for human consumption** in a grain-products class [S07]. These sources support a marketed product and a human-food classification, not a universal consumer definition or a Québec French label.

OQLF's entry for **farine d'orge** gives **barley flour** as its English equivalent; that French term already belongs to the distinct barley-flour identity [S08]. A current WIPO Nice goods-class revision pairs English **barley meal** with French **farine d'orge**, but it is a trademark goods list, not a product definition or Québec terminology ruling, and it collides with OQLF's barley-flour entry [S09]. OQLF's Québec **gruau** entry defines the cooked oat-flake dish and lists U.S. **oatmeal** as an English equivalent; it does not name barley meal [S05]. Therefore neither **farine d'orge** nor **gruau d'orge** is adopted for this candidate.

**Precise hold:** keep the generic barley-meal candidate unresolved until an authoritative Québec French source or a Québec-market bilingual product label establishes a distinct display and enough milling scope to separate it from barley flour, whole/pearled barley, and grits. Do not create an English-only row. If a later review advances the Ontario product, scope it to the source's whole-grain product instead of generalizing its milling boundary to every barley meal.

### Dry oat meal

OQLF defines **farine d'avoine** as flour made by milling whole or non-whole oat grains; it notes that it may also be made from rolled oats. Its English terms are **oatmeal** and **oat flour** [S04]. The current catalog already has **oat flour / farine d'avoine**.

The same OQLF database separately defines Québec **gruau** as a cooked dish made from oat flakes and lists U.S. English **oatmeal** as an English equivalent [S05]. This supports a dry flour sense and a prepared-dish sense for the same English word. It does not establish a distinct coarse dry meal, nor does it make **oat meal** a safe global alias for oat flour.

**Precise hold:** do not add a dry-oat-meal reference or an **oatmeal**/**oat meal** alias. Keep oat flour, oat groats, rolled oats, quick oats, instant oats, and prepared oatmeal separate. A future recipe line explicitly naming oat flour can use the existing identity.

### Generic malt flour

TERMIUM Plus, a Government of Canada terminology record in Milling and Cereal Industries, lists **malt flour** and **malted cereal flour** as correct English terms and **farine maltée** as the French term. Its definition is flour made by grinding malted (germinated) wheat or barley and used as a bread-flour adjunct [S01]. IREKS's current technical compendium describes malt flour as milled malt from barley, wheat, rye, or spelt; it also states that enzyme activity depends on the malting and heat-treatment process [S02]. Together these sources support a generic malted-cereal-flour identity while showing why no one cereal or enzyme state should be inferred from the generic name.

Molino Merano's 2024 manufacturer catalogue lists **MALT FLOUR** and **BARLEY MALT FLOUR** as separate products [S03]. This supports keeping the generic name distinct from **malted barley flour**; it does not establish that all generic malt flour has the composition or performance of either seller's product. The current catalog also has separate malted-wheat, malted-rye, and roasted-wheat-malt-flour rows.

**Recommendation:** add only the identity fields in the table above. Keep **malted cereal flour** as the source-supported English alias. Do not add **malt powder**, **malt extract**, **malt syrup**, cereal-specific flour names, or diastatic-state aliases. The manufacturer's Pollak-unit product figures are not transferred as recipe measurements, conversions, or functional claims.

### Toasted rye flour

Several sources establish that toasted rye flour is sold as a bakery ingredient. Harinas Polo's manufacturer page lists **Toasted Rye flour** within a malted/toasted-products family, separate from its rye flour and other listed malted/toasted products [S10]. Eurogerm KB lists product 11156 as organic toasted rye flour [S11]. Molino Merano's 2024 catalogue names **Toasted rye flour** and describes its baking use for flavour and crust colour; a separate bread ingredient declaration lists malted flour and toasted rye flour separately [S03].

Moulins Bourgeois's 2024 French catalogue lists **Farine de seigle toasté (bio)** as a bakery ingredient and says it adds colour and a toasted taste to country or rye breads [S12]. This is direct French product-name evidence, but Moulins Bourgeois identifies itself as a French mill and the source does not establish a Québec-preferred term. The reviewed OQLF and Canadian sources did not confirm whether Québec should display this as **farine de seigle toasté**, **farine de seigle toastée**, or another form. The manufacturer pages also do not establish a universal sequence for whether grain or flour is toasted, a roast level, or equivalence to rye malt flour.

**Precise hold:** keep the product candidate open for an independent Québec French check. Treat **farine de seigle toasté (bio)** as the French maker's wording only, not as an accepted Québec display. Do not add **roasted rye flour**, **farine de seigle torréfiée**, **farine de seigle grillée**, or a toasted form under ordinary rye flour without product-specific Québec terminology/process evidence. Keep toasted rye flour separate from malted rye flour and ordinary rye flour; add no numeric or substitution data.

## Proposal-local source register

Sources were accessed on 2026-10-10. The IDs below are local to this proposal.

| ID | Source and locator | Supports | Claim limits |
| --- | --- | --- | --- |
| **S01** | Government of Canada Translation Bureau, [TERMIUM Plus, malt flour](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=enr&lang=fra&srchtxt=CEREAL+PREPARATION), Milling and Cereal Industries, record dated 2011-02-18. | Correct terms **malt flour**, **malted cereal flour**, and **farine maltée**; definition as ground malted wheat or barley. | Terminology/definition source, not a current product specification; does not identify cereal or process properties for any particular recipe item. |
| **S02** | IREKS, [Definition and composition of malt flour and malt extract](https://www.ireks-kompendium.com/en/malt-flours-and-malt-extracts/definition-and-composition-of-malt-flour-and-malt-extract), “Malt” section and lines on activity/thermal treatment. | Current technical description covers malt flour from barley, wheat, rye, or spelt and explains that enzyme activity varies with processing. | Manufacturer's technical compendium; not a Québec terminology source or a universal product standard. No activity values are adopted. |
| **S03** | Molino Merano, [General Product Catalogue (2024)](https://www.meranermuehle.it/media/74/b3/01/1707726283/EN_catalogo_generale_molino_merano.pdf), p. 23 ingredient list and p. 47 complimentary-product entries; copyright 2024. | Lists malted flour and toasted rye flour separately in a rye bread mix; lists **MALT FLOUR** and **BARLEY MALT FLOUR** separately as products; describes bakery use for toasted rye flour. | One Italian mill's commercial range. Its product identifiers, Pollak figures, and processing performance are not transferable. |
| **S04** | OQLF, [farine d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497598/farine-davoine), entry 2497598, last updated 2017. | Defines the dry flour product and lists English **oatmeal** and **oat flour**. | The English word alone is not unambiguous; the entry does not define a separate coarse oat meal. |
| **S05** | OQLF, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), entry 8363388, last updated 2002. | Defines Québec **gruau** as cooked oat flakes and lists U.S. English **oatmeal**; notes the dish sense may extend to other cereals. | Supports the prepared-dish sense only; does not name barley meal or a dry oat-meal product. |
| **S06** | Ontario Made, Ottawa Valley Grain Products, [Whole Grain Barley Meal](https://supportontariomade.ca/explore-products/whole-grain-barley-meal), product description. | Current Ontario listing describes whole barley crushed and ground, fine-to-coarse, with bran, germ, and endosperm retained. | One maker's whole-grain product; English-only and not a universal milling specification or Québec label. |
| **S07** | Statistics Canada, [NAPCS Canada 2022, 1821294 examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022), modified 2026-01-08. | Lists **barley meal for human consumption** in a Canadian product-classification entry. | Classification example only; it supplies no consumer definition, milling process, or French display. |
| **S08** | OQLF, [farine d'orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge), entry 9489060, last updated 1982. | Gives Québec French **farine d'orge** for English **barley flour**. | Older terminology entry; does not define barley meal. It is evidence against reusing this exact French term for a separate proposed meal identity without resolving the collision. |
| **S09** | WIPO, [Nice Classification 2026 revision file](https://www.wipo.int/nice/its4nice/ITSupport_and_download_area/20260101/revision_files/ncl-20260101-EF-revision_file.pdf), Class 30, item 300061. | Pairs the English goods term **barley meal** with French **farine d'orge**. | A trademark goods-list translation, not a food definition or Québec terminology ruling; the French phrase collides with OQLF's barley-flour entry. Not used as a catalog alias. |
| **S10** | Harinas Polo, [Toasted Rye flour](https://www.harinaspolo.com/en/products/toasted-rye-flour/), manufacturer product page, “Malted and toasted products.” | Exact product name and placement among malted/toasted bakery products; rye flour is listed separately. | The page gives little process detail and no Québec French product name. |
| **S11** | Eurogerm KB, [Organic Baking Ingredients](https://problend-eurogerm.com/products/organic.html), Sensory Ingredients table, product 11156. | Lists organic toasted rye flour as a commercial bakery ingredient. | US company page in English; no French display or processing specification. |
| **S12** | Moulins Bourgeois, [Catalogue produits 2024](https://www.moulins-bourgeois.com/pdf/Catalogue-produits-MoulinsBourgeois2024.pdf), p. 8, “Ingrédients toastés / torréfiés,” entry **Farine de seigle toasté (bio)**. | Current French product name and bakery use for colour/toasted taste. | French mill catalog, not a Québec terminology authority; no roasting sequence or measured process boundary. |
| **S13** | Moulins Bourgeois, [Catalogue bio 2024](https://www.moulins-bourgeois.com/wp-content/uploads/2024/01/Catalogue-bio-MoulinsBourgeois2024.pdf), toasted/roasted flour section. | Corroborates French-market use of **farine de seigle toasté**. | French-market terminology only; not used to claim a Québec-preferred display. |

## Integration boundary

Only the generic malt-flour identity is recommended for coordinator review. The remaining candidates stay held with the specific evidence gaps above. This proposal does not close A7, alter existing candidate checklists, add recipe links, or change any shared catalog data.
