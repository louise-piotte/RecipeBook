# WP02 A7 remaining meal boundaries — 2026-10-10

## Scope and disposition

- **Review date:** 2026-10-10
- **Scope:** Recheck barley meal, dry oat meal/oatmeal, toasted rye flour, and the unqualified wheat-meal candidate against the current catalog, research ledger, plan, prior proposals, and all bundled recipe lines.
- **Status:** Proposal only. No canonical catalog, ledger, recipe, test, plan, or roadmap file is changed here.
- **Proposal-local source IDs:** `WP02-A7-REMAINING-MEALS-REVIEW-20261010-S01` through `S13`. They are stable references within this proposal, not research-ledger IDs.

| Candidate | Disposition | Recommendation |
| --- | --- | --- |
| Barley meal | **Hold** | Do not add a reference or alias yet. Canadian sources establish a whole-grain barley-meal product and a human-food class, but the reviewed evidence does not establish a distinct Québec French display that avoids the existing `barley flour / farine d'orge` identity. |
| Dry oat meal / oatmeal | **Hold as a separate identity or alias** | Keep the existing `oat flour / farine d'avoine` reference. Do not add `oatmeal`, `oat meal`, or `dry oatmeal` as an alias: authoritative sources use `oatmeal` for ground oat flour, rolled oats, and cooked porridge. No source establishes a separate dry meal grade or a Québec French display for it. |
| Toasted rye flour | **Hold pending Québec French review** | Keep it separate from rye flour, rye meal, and malted rye flour. Manufacturer sources establish English and French product names, including a French-mill product listed as `farine de seigle toasté (bio)`, but no Québec authority or Québec-market product label establishes the preferred French display for this un-malted product. Do not borrow `farine grillée` from the unrelated Québec wheat-flour product. |
| Unqualified wheat meal | **Keep the generic candidate unresolved; retain the scoped identity** | Retain the existing `ingredient-ref-wheat-meal` as `whole wheat meal / farine de blé entier brute`, with its current French alternate `farine de blé complet brute`. Do not add bare `wheat meal`, `wheat groats`, `wheat grits`, or `semoule de blé` as aliases. The broad picker query `wheat meal` can return the narrower row because those words occur inside `whole wheat meal`; that search result does not resolve the generic product boundary. |

No new reference, alias, form, recipe link, density, unit mapping, measurement, conversion, yield, or substitution is proposed. The only supported wheat-meal identity remains the existing whole-kernel product; the other candidates stay held.

## Current catalog, ledger, and recipe demand

At this review snapshot the bundled package contains **783 ingredient references** and **36 ingredient forms**. The research ledger contains **1,006 records**, **2,135 source entries**, and **1,730 distinct source IDs**. The manifest lists **114 recipes** containing **1,123 ingredient rows**.

| Snapshot file | SHA-256 |
| --- | --- |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `198dcc88fb36ecaad6515a3a5ad367a99d397ccd0f8e5dcfe8e1bb310eb865a2` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `docs/catalog/research-ledger.v1.json` | `efd9d4de54cda5f9f9c64b2bdc87e77da3ce931f4cb7ca5a60c1dfd8ec22f90c` |

The active neighboring references are `barley flour / farine d'orge`, `oat flour / farine d'avoine`, `oat groats / gruau d'avoine entier`, rolled/quick/instant oats, `rye flour / farine de seigle`, `rye meal / gruau de seigle`, `malted rye flour / farine de seigle malté`, and the narrow `whole wheat meal / farine de blé entier brute` row. No active barley-meal, dry-oat-meal, or un-malted toasted-rye-flour row exists. The current wheat-meal row has no English alias and carries only the Québec French alternate `farine de blé complet brute`.

The scan used every manifest-listed recipe file. It searched `originalText`, `ingredientName`, `preparation`, and `notes` on every ingredient row, then the complete serialized recipe JSON. Search terms were lowercased, NFKD-normalized, accent-folded, punctuation-normalized to spaces, and whitespace-collapsed, matching the project's ingredient-search key behavior.

| Candidate terms searched | Ingredient-line hits | Full-recipe JSON hits |
| --- | ---: | ---: |
| Barley meal, whole-grain barley meal, barley grits/grist, `gruau d'orge`, `semoule d'orge` | 0 | 0 |
| Dry oat meal, dry oatmeal, oat meal, oatmeal, oatmeal flour, oat-meal flour | 0 | 0 |
| Toasted/roasted rye flour, toasted/roasted rye, `farine de seigle toasté(e)`, `farine de seigle grillée`, `farine de seigle torréfiée`, `farine de seigle malté toasté` | 0 | 0 |
| Wheat meal, whole wheat meal, whole-grain wheat meal, coarse whole-wheat flour, wheat groats/grits, `gruau(x) de blé`, `semoule de blé`, `farine de blé entier/complet brute` | 0 | 0 |

There is no bundled recipe demand for these candidates. In particular, the oatmeal decision is not a recipe-driven alias request. A recipe that later explicitly names oat flour can use the existing oat-flour row without adding `oatmeal` globally.

## Candidate boundaries

### Barley meal

Ottawa Valley Grain Products lists **Whole Grain Barley Meal** as a human-food product made by crushing and grinding whole barley, with texture ranging from fine to coarse [S01]. The page's next sentence unexpectedly says the product includes “wheat bran,” germ, and endosperm. Because that conflicts with the product being barley and the preceding whole-barley description, do not use that sentence as evidence of a specific barley-bran composition. Statistics Canada's current NAPCS Canada 2022 examples independently list **barley meal for human consumption** and place it among grain products for human consumption [S02]. This is product/classification evidence, not a milling specification or bilingual consumer label.

OQLF assigns **farine d'orge** to English **barley flour** [S03], which is already the active French display for `ingredient-ref-barley-flour`. Neither the Ontario product nor the statistical class establishes that `farine d'orge` can name a distinct meal product in Québec. The sources reviewed did not establish `gruau d'orge`, `semoule d'orge`, or another Québec display for this product. Do not infer one from generic grits terminology, a trademark list, or the translation of another cereal's meal.

**Precise hold:** keep barley meal unresolved until a Québec-market bilingual product label or authoritative Québec terminology source names a clearly delimited barley-meal product. Do not create an English-only row or alias meal to barley flour, hulled/pearled barley, or barley grits. If a later review uses the Ontario product, scope any proposed identity to the source's whole-grain product rather than generalizing its fine-to-coarse name to every barley meal.

### Dry oat meal / oatmeal

OQLF's Québec entry for **farine d'avoine** defines flour milled from whole or non-whole oat grains and lists **oatmeal** and **oat flour** as English terms [S04]. The live catalog already has the corresponding `oat flour / farine d'avoine` identity. However, OQLF separately defines Québec **gruau** as cooked oat flakes and lists U.S. **oatmeal** as an English term for that prepared dish [S05]. Health Canada's oat-product decision also calls **rolled oats** “oatmeal,” while distinguishing rolled oats from whole oat flour by their separate processing descriptions [S06].

These primary Canadian/Québec sources use the same English word for flour, rolled oats, and prepared porridge. They do not support a single unqualified catalog alias or a separate product called **dry oat meal**. `Oatmeal flour` and `dry oatmeal` were not source-attested as a distinct product name in this review. Preserve `oat flour`, oat groats, rolled oats, quick oats, instant oats, and prepared oatmeal as distinct concepts. Do not add bare `gruau` as a French display or alias for a dry milling product.

**Precise hold:** no new dry-oat-meal identity and no `oatmeal`/`oat meal` alias on oat flour or rolled oats. Keep `oat flour / farine d'avoine` unchanged; revisit only if a Québec-market bilingual label or terminology source establishes a specific dry meal product and disambiguating French name.

### Toasted rye flour

Harinas Polo lists a commercial **Toasted Rye flour** product under its special flours for human consumption, but its page supplies no French product name or detailed toast/milling sequence [S07]. Eurogerm independently lists **organic toasted rye flour** as a product in its sensory-ingredient range [S08]. A 2024 Moulins Bourgeois catalogue, from a French mill rather than a Québec supplier, lists **Farine de seigle toasté (bio)** under toasted/roasted ingredients and describes it as adding colour and toasted flavour to country or rye breads [S09]. This is direct French product-name evidence, but it does not establish a Québec-preferred display or make the French maker's adjective form a Québec standard.

Québec sources do not bridge that exact identity in this pass. OQLF's `farine de seigle` is simply **rye flour** [S10]. Aliments du Québec lists Blouin's **farine de blé grillée** and says the company roasts flour of wheat, corn, and rice; Metro's current label for Blouin's extra-light toasted flour lists wheat flour as its ingredient [S11]. Those sources support a Québec toasted-wheat-flour product, not toasted rye flour. Do not shorten it to `farine grillée` or repurpose that Quebec product name as a rye alias.

A current Canadian retailer lists **farine de seigle malté toasté** in a La Fournée Dorée bun ingredient declaration [S12]. This names a *malted and toasted* rye flour ingredient; it is not evidence that the separate unqualified **toasted rye flour** product is malted or that one is an alias for the other. Keep it distinct from the active `malted rye flour / farine de seigle malté` row and from existing `rye meal / gruau de seigle`; the latter is a source-defined coarse whole-kernel product [WP02-RYEMEAL-20261010-S01–S03]. Do not add toast/roast aliases to rye flour or rye meal, or to cereal-specific roasted barley/wheat rows.

**Precise hold:** keep toasted rye flour unassigned until Québec French product terminology is independently reviewed. Do not create aliases `roasted rye flour`, `farine de seigle grillée`, `farine de seigle torréfiée`, or `farine grillée`. The product sources do not provide a universal processing sequence or establish equivalence to toasted malted rye flour.

### Unqualified wheat meal versus whole wheat meal

The active `ingredient-ref-wheat-meal` is a **narrow whole-kernel product**, not a general resolution of bare `wheat meal`. Heimatsmühle describes its **Wheat Meal Fine/Medium/Coarse** as milled from whole, cleaned wheat, retaining endosperm, bran, and germ, and as less finely milled than wholegrain flour [WMA7-20261010-S01]. OQLF independently maps **whole wheat meal** and **coarse whole wheat flour** to the Québec French terms **farine de blé entier brute** and **farine de blé complet brute** [WMA7-20261010-S02]. The catalog intentionally keeps only the canonical `whole wheat meal / farine de blé entier brute` and the French alternate; `coarse whole wheat flour` remains excluded because it overlaps the existing whole-wheat-flour picker query.

Canadian classification/regulatory sources continue to leave the bare term broader. CFIA lists `wheat meal` as one of several possible bread ingredients but does not define its composition in that provision [WP02-S118]. Statistics Canada classifies **wheat meal (except durum semolina)** among grain products for human consumption, without a consumer milling definition [WP02-S119]. The Canadian tariff groups wheat groats and meal; its French tariff text uses the collective `gruaux et semoules de froment (blé)` rather than an isolated Québec name [WP02-S121–S122]. None of these sources turns all wheat meal into the whole-kernel product or supports generic `semoule de blé` as an alias; the latter would collide with the active durum-semolina identities.

The Canadian Grain Commission's glossary defines groats with reference to oat kernels whose hulls have been removed; it does not establish `wheat groats` or `barley groats` as synonyms for either meal product [S13].

The current picker can return `ingredient-ref-wheat-meal` for the query **wheat meal** because those words are contiguous inside its canonical display **whole wheat meal**. This is a phrase-search overlap, not evidence that the generic candidate is resolved. The ledger's earlier unresolved decision for bare wheat meal and later accepted decision for whole wheat meal should remain scoped to those separate claims.

**Precise disposition:** retain the existing whole-wheat-meal reference and its source-backed bilingual scope. Keep the generic bare-wheat-meal candidate unresolved; do not add generic `wheat meal`, `wheat groats`, `wheat grits`, `gruau de blé`, `gruaux de blé`, or `semoule de blé` as aliases. Add no measurement or substitution data.

## Proposal-local source register

Sources were accessed on 2026-10-10. Source IDs in this register are local to this proposal; the `WP02-*` and `WMA7-*` IDs cited inline already exist in the current research ledger or named prior proposal.

| ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **S01** | Ontario Made, Ottawa Valley Grain Products, [Whole Grain Barley Meal](https://supportontariomade.ca/explore-products/whole-grain-barley-meal), product profile. | Whole-barley meal product made by crushing and grinding, with fine-to-coarse texture. | The page is English-only. It inconsistently says “wheat bran” in a sentence about the barley product; that phrase is not used as composition evidence. Not a universal definition or Québec name. |
| **S02** | Statistics Canada, [NAPCS Canada 2022, 1821294 examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022). | Lists barley meal for human consumption and separately lists other grain products. | Classification examples only; no milling description or French consumer term. |
| **S03** | OQLF, [farine d'orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge), entry 9489060, updated 1982. | Maps Québec French `farine d'orge` to English `barley flour`. | Does not define barley meal; the existing catalog already assigns this French term to barley flour. |
| **S04** | OQLF, [farine d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497598/farine-davoine), entry 2497598, updated 2017. | Defines oat flour as milled oats and lists English `oatmeal` and `oat flour`. | Does not disambiguate the English word from rolled oats or cooked oatmeal. |
| **S05** | OQLF, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), entry 8363388, updated 2002. | Defines Québec `gruau` as cooked oat flakes and lists U.S. English `oatmeal`. | Prepared dish only; not a dry milling product. |
| **S06** | Health Canada, [Summary of Assessment of a Health Claim about Oat Products and Blood Cholesterol Lowering](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/pdf/label-etiquet/claims-reclam/assess-evalu/oat_avoine-eng.pdf), pp. 1–2. | Calls rolled oats `oatmeal`; distinguishes rolled oats from whole oat flour by processing. | Regulatory health-claim context; used only to show English-name ambiguity, not as a consumer-label standard. |
| **S07** | Harinas Polo, [Toasted Rye flour](https://www.harinaspolo.com/en/products/toasted-rye-flour/), product page. | Names a human-food toasted rye flour product and offers it in a 25 kg bag. | No French display, toast/milling sequence, or Québec market evidence. |
| **S08** | Eurogerm KB, [Organic Baking Ingredients](https://problend-eurogerm.com/products/organic.html), sensory ingredients, product 11156. | Lists organic toasted rye flour as a bakery ingredient. | Commercial product listing only; no French display or detailed processing boundary. |
| **S09** | Moulins Bourgeois, [Catalogue produits 2024](https://www.moulinsbourgeois.fr/pdf/Catalogue-produits-MoulinsBourgeois2024.pdf), p. 8, `Farine de seigle toasté (bio)`. | French-language mill lists a toasted rye-flour product and its bread use. | French market, not Québec; no exact process sequence or Québec-preferred French form. |
| **S10** | OQLF, [farine de seigle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle), entry 9489069, updated 1982. | Maps `farine de seigle` to `rye flour`. | Does not define toasted rye flour. |
| **S11** | Aliments du Québec, [Farine Grillée Pâle](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-grillee-pale); Metro, [Blouin extra-light toasted flour](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/farines-et-essentiels-de-cuisson/farine-grillee-extra-pale/p/058109579866). | Québec product is named `farine de blé grillée`; manufacturer profile says it roasts wheat, corn, and rice flours, and Metro lists wheat flour as the selected product's ingredient. | Does not support a rye product or the alias `farine de seigle grillée`. |
| **S12** | Metro, [La Fournée Dorée brioche buns](https://www.metro.ca/epicerie-en-ligne/allees/pains-et-patisseries/pains-a-hamburger-et-petits-pains/petits-pains/buns-brioche-au-sesame/p/059243000216), product 059243000216, ingredient declaration. | Current Canadian retailer lists `farine de seigle malté toasté`, explicitly a malted-and-toasted rye-flour ingredient. | Finished-product ingredient label; not a generic toasted-rye-flour name or independent terminology ruling. |
| **S13** | Canadian Grain Commission, [Glossary](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/28-glossary/glossary.html), `groats`. | Defines groats in its Canadian grading glossary as hulled oat kernels. | Oat-specific term; does not establish barley or wheat meal as groats. |

## Integration boundary

Keep the A7 review open. This packet recommends no catalog or ledger mutation. The next evidence needed is: a Québec bilingual product/terminology source for barley meal; a disambiguated Québec term or product label before using `oatmeal` as a catalog alias; Québec French review for toasted rye flour; and a source that defines a consumer product called bare `wheat meal` before merging that unresolved generic candidate with the already accepted whole-kernel identity.
