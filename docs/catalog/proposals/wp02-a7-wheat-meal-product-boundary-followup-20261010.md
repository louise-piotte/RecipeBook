# WP02 Section A7 wheat-meal product-boundary follow-up

## Scope and status

- **Review date:** 2026-10-10
- **Candidate:** `ingredient-ref-wheat-meal`
- **Disposition:** proposal only; no catalog, ledger, plan, or recipe data changed.
- **Question:** whether an identifiable human-food wheat-meal product has a defensible milling boundary, Québec French name, and catalog category.

The earlier review established that Canadian classification sources recognize wheat meal as a human-food product and distinguish it from wheat flour, but did not define a consumer product or supply a standalone Québec French name. This follow-up found a defensible, narrower product: **whole wheat meal**. A live manufacturer's page defines its milling boundary; OQLF independently supplies a Québec French name. These sources support separate process and terminology claims, not every use of unqualified **wheat meal**.

The previously cited Ottawa Valley Grain product URL returned 404 when rechecked. Its cached search text is not used as evidence in this revision.

## Recommendation

If the candidate is advanced, scope it to the following product identity:

| Field | Proposal |
| --- | --- |
| Candidate ID | `ingredient-ref-wheat-meal` |
| English display | `whole wheat meal` |
| Québec French display | `farine de blé entier brute` |
| English alias proposal | `coarse whole wheat flour` |
| French alias | `farine de blé complet brute` |
| Category | `FLOUR_AND_STARCH` |

**Milling boundary:** the live Heimatsmühle product page describes *Wheat Meal Fine/Medium/Coarse* as milled from whole, cleaned wheat; it retains endosperm, bran, and germ and is less finely milled than wholegrain flour. The page describes bread and muesli uses. This supports one manufacturer's human-food whole-wheat-meal product, but it is not a Canadian product label [WMA7-20261010-S01].

**Coordinator integration:** accepted `ingredient-ref-wheat-meal` as the scoped identity-only reference. The active reference keeps the French alternate `farine de blé complet brute`, has no English alias, and has no recipe links or forms.

**Québec French name:** OQLF maps *farine de blé entier brute* to *coarse whole wheat flour* and *whole wheat meal*, and lists *farine de blé complet brute* as an alternate preferred French term. This is terminology evidence; the OQLF entry does not define the milling process [WMA7-20261010-S02]. Together, these sources support this specific bilingual product boundary, but not every use of unqualified *wheat meal*.

Use `FLOUR_AND_STARCH` for this scoped identity. OQLF places the French term in its flour domain and equates it with coarse whole-wheat flour; the manufacturer describes a milled wheat product. This is a catalog-category judgment, not a claim that the project category reproduces Statistics Canada's product classes. Statistics Canada separately classifies unqualified wheat meal outside its wheat-flour class, which is further reason to retain the *whole* qualifier and not generalize this recommendation to all products called wheat meal [WMA7-20261010-S08, WMA7-20261010-S09].

The proposed aliases are limited to OQLF's coarse-flour equivalent and alternate preferred French term. Do not add bare `wheat meal`, `whole grain wheat meal`, `wheat groats`, `wheat grits`, `coarse ground wheat`, `semoule de blé`, or `gruau de blé`. Keep density, unit mappings, forms, measurements, conversions, yields, and substitutions empty.

**Coordinator integration note:** the active reference uses `whole wheat meal` as its English canonical name and does not activate `coarse whole wheat flour` as an alias. That phrase also contains the existing `whole wheat flour` picker query and would return both flour and meal for that query. The Québec French alternate `farine de blé complet brute` is retained; `whole grain wheat meal` remains excluded.

## Product boundary and adjacent identities

- **Whole-wheat flour:** OQLF defines *farine de blé entier* as a product of milling and bolting wheat from which part of the outer bran layer has been removed. The mill's meal retains all parts of the kernel and is less finely ground than flour. These sources support separate product names while leaving any unreported mill settings unspecified [WMA7-20261010-S01, WMA7-20261010-S03].
- **Durum semolina:** OQLF defines *semoule de blé dur* as a product of coarse milling moistened durum wheat, followed by drying and sifting. The proposed meal is made from whole wheat with bran and germ retained; it is not a durum-semolina name or a general `semoule de blé` alias. The active catalog already has `durum semolina / semoule de blé dur` and `remilled durum semolina / semoule de blé dur remoulue` [WMA7-20261010-S01, WMA7-20261010-S04].
- **Groats:** the current Canadian tariff groups cereal groats and meal in one customs heading, so that heading does not establish a consumer synonym or one French name for wheat meal. The Canadian Grain Commission glossary defines *groats* specifically as hulled oat kernels; it does not name a wheat product. The proposed product is ground whole wheat, rather than a whole kernel with its hull removed. Do not reuse the active oat-groat French name `gruau d'avoine entier` or infer `gruau de blé` [WMA7-20261010-S07, WMA7-20261010-S10, WMA7-20261010-S11].
- **Wheat bran:** bran is one milling fraction. The proposed product source says meal retains bran together with germ and endosperm, so it is not wheat bran or a bran alias. The active catalog keeps `wheat bran / son de blé` separately [WMA7-20261010-S01].
- **Cracked wheat:** OQLF uses *blé concassé* for *coarse ground wheat*, *cracked wheat*, and *crushed wheat*. CFIA defines cracked wheat as wheat cracked or cut into angular fragments and lists it separately from crushed/coarse-ground wheat. The mill describes its meal as a ground whole-kernel product, not as angular cracked-wheat fragments. Do not use the overlapping broad English phrase `coarse ground wheat` as an alias; keep the active `cracked wheat / blé concassé` row distinct [WMA7-20261010-S05, WMA7-20261010-S06].

A withdrawn Canadian General Standards Board specification for uncooked wheat cereal historically described whole-wheat meal as wheat ground or cracked into reasonably uniform granules without removing bran or other wheat constituents, and listed cracked whole wheat separately. It corroborates the product/process distinction but is not a current standard and does not supply a current catalog specification. No sieve limits or other thresholds from it are adopted [WMA7-20261010-S12].

## Catalog, forms, and recipe audit

The current reference catalog has no wheat-meal entry. Relevant neighbors are whole-wheat flour, durum flour, durum semolina, remilled durum semolina, cracked wheat, wheat berries, wheat bran, and wheat germ. The existing French displays `semoule de blé dur`, `semoule de blé dur remoulue`, `blé concassé`, `gruau d'avoine entier`, `gruau de maïs`, and `gruau de sarrasin, rôti, sec` do not provide a generic French equivalent for wheat meal. No form is attached to a wheat-meal candidate or these wheat milling identities.

All 114 bundled recipe JSON files were searched for `wheat meal`, `whole wheat meal`, `wheat groats`, `wheat grits`, `gruau(x) de blé`, and `semoule de blé`, with accented and unaccented `blé` spellings. No exact phrase match was found. This follow-up does not relink or edit recipe lines.

## Evidence limits

- The live manufacturer page defines one marketed whole-wheat-meal product but is German, not Canadian. It does not define every product that Canadian standards, customs, or statistical classifications call wheat meal. No live Canadian manufacturer product page with an accessible process description was found for this follow-up.
- A live Canadian Grain Commission testing page separately names whole meal, white flour, and semolina sample procedures and says the whole-wheat-meal test sample is milled on a named laboratory mill; it does not define a consumer product or its composition [WMA7-20261010-S13].
- The Canadian General Standards Board source is accessible but withdrawn; it is historical corroboration, not a current standard [WMA7-20261010-S12].
- The Ottawa Valley Grain product URL returned 404 on recheck; cached search text is excluded from the evidence.
- OQLF independently supports the French name for *whole wheat meal*, not for unqualified *wheat meal*.
- The tariff's combined groats-and-meal heading does not resolve all potential market uses of *wheat groats*. No groats synonym is proposed.
- The category recommendation applies only to the scoped whole-wheat meal product. It does not settle the category of every possible wheat meal.
- Independent human Québec French review remains a separate integration check. This proposal records source support and does not claim that review has occurred.

## Proposal-local source register

These IDs are local to this follow-up and are distinct from the IDs in the earlier WP02 review.

- **WMA7-20261010-S01 — Heimatsmühle, [Wheat Meal Fine/Medium/Coarse](https://www.heimatsmuehle.com/en/commercial-customers/products/wheat-meal-fine-medium-coarse).** Live manufacturer page, accessed 2026-10-10. Describes a human-food whole-wheat-meal product milled from whole, cleaned wheat; it retains endosperm, bran, and germ and is less finely milled than wholegrain flour. Bread and muesli uses are listed. This is process evidence from a German manufacturer, not Canadian product-terminology evidence.
- **WMA7-20261010-S02 — OQLF, [farine de blé entier brute](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497897/farine-de-ble-entier-brute).** Gives *farine de blé entier brute* and *farine de blé complet brute* as preferred French terms and lists *coarse whole wheat flour* and *whole wheat meal* in English. This supports the Québec French name, not the milling process.
- **WMA7-20261010-S03 — OQLF, [farine de blé entier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361931/farine-de-ble-entier).** Defines whole-wheat flour as a milled and bolted wheat product with part of the outer bran layer removed; distinguishes Graham flour.
- **WMA7-20261010-S04 — OQLF, [semoule de blé dur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432752/semoule-de-ble-dur).** Defines durum semolina as coarsely milled moistened durum wheat that is then dried and sifted; directly supports the existing bilingual term.
- **WMA7-20261010-S05 — OQLF, [blé concassé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2494947/ble-concasse).** Gives *blé concassé* for *coarse ground wheat*, *cracked wheat*, and *crushed wheat*.
- **WMA7-20261010-S06 — CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0).** Lists wheat meal as a possible bread ingredient without defining its composition; separately defines cracked wheat and crushed/coarse-ground wheat.
- **WMA7-20261010-S07 — Canadian Grain Commission, [Glossary](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/28-glossary/glossary.html).** Defines groats as hulled grains and specifically identifies oat kernels with the hull removed; does not define wheat groats.
- **WMA7-20261010-S08 — Statistics Canada, [NAPCS 2022, 1821294: Grain products for human consumption, n.e.c.](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1821294&CST=17022022&CVD=1386659&Function=getVD&MLV=4&TVD=1384502).** Lists wheat meal, except durum semolina, as an illustrative human-consumption grain product.
- **WMA7-20261010-S09 — Statistics Canada, [NAPCS 2022, 18212: Flour and other grain mill products](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=2&CPV=18212&CST=17022022&CVD=1384663&D=1&Function=getVD&MLV=4&TVD=1384502).** Excludes wheat meal from the statistical wheat-flour class; classification evidence only.
- **WMA7-20261010-S10 — CBSA, [Customs Tariff T2026-2, Chapter 11 (English)](https://www.cbsa.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html).** Groups wheat groats and meal for tariff classification; this is not a consumer-name definition.
- **WMA7-20261010-S11 — ASFC, [Tarif des douanes T2026-2, chapitre 11 (français)](https://www.cbsa.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-fra.html).** Uses collective wording *gruaux et semoules de froment (blé)* for groats and meal and does not isolate a French name for whole wheat meal.
- **WMA7-20261010-S12 — Canadian General Standards Board, [Wheat cereal, uncooked / Céréale de blé non cuit, standard 32.15-87](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-015-1987.pdf); [catalogue record](https://publications.gc.ca/site/eng/9.841473/publication.html).** Historical bilingual food-service procurement specification; withdrawn in 2020. Its whole-wheat meal and cracked-whole-wheat classes corroborate distinct processing descriptions only.
- **WMA7-20261010-S13 — Canadian Grain Commission, [Analytical testing services](https://www.canada.ca/en/grain-commission/services/services-fees/analytical-testing-services.html).** Current Canadian government page. Separately describes the wet-gluten sample procedures for white flour, semolina, and whole meal, and identifies the mill used for the whole-wheat-meal sample. This supports the Canadian testing distinction only; it does not define a consumer product or its composition.
