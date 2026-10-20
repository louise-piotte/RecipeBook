# WP02 tigernut flour boundary review

- **Status:** Research-only coordinator proposal; no shared package, ledger, recipe, checklist, roadmap, code, or test changes.
- **Scope:** Existing whole-tuber tigernut flour identity, product boundaries, Québec French wording, recipe demand, measurement, and directional substitution evidence.
- **Access date:** 2026-10-10.
- **WP02 context:** The B4 parent remains open in the plan and batch tracker; the nested identity-only line already includes whole-tigernut flour as checked. The current catalog already has `ingredient-ref-tigernut-flour`. This review supplies residual evidence and does not change checklist status.

## Coordinator proposal

Retain `ingredient-ref-tigernut-flour` as the identity for dried *Cyperus esculentus* tubers directly ground into flour, with the tuber material and its native oil retained. Keep the current displays `tigernut flour` / `farine de souchet` and the `FLOUR_AND_STARCH` category. The botanical source is an edible tuber, not a true nut; the word *nut* in English or *noix* in a Québec retail title must not move this product into the nut category or merge it with almond, chestnut, or hazelnut flour.

The evidence supports three source-attested search aliases on that same reference: English `tiger nut flour` and `chufa flour`, and Québec-market French `farine de noix tigrées`. The French alias is a retailer's exact product title and is explicitly identified there as a tuber product, not a nut. No source supports mapping the tuber names alone (`tiger nut`, `chufa`, `souchet comestible`, `amande de terre`, etc.) to flour; do not add them as flour aliases. No authoritative Québec terminology entry for the flour itself was located. The existing French display is an exact manufacturer product name and also appears in the Québec retailer's product description; keep it as the display while recording that a dedicated OQLF ruling for this flour was not found.

Keep defatted tigernut flour, extracted tigernut starch, and flour made from horchata/plant-milk press residue outside this identity. Fine and extra-fine are one manufacturer's particle-size grades, not global identities. Roasted, fermented, boiled, or blanched flour processing is not established here as a catalog-wide form or identity split; keep those qualifiers unresolved unless recipe demand or product standards warrant a separate review.

## Current package and demand audit

| Surface | Current finding |
|---|---|
| Active reference | `ingredient-ref-tigernut-flour`: `tigernut flour` / `farine de souchet`, category `FLOUR_AND_STARCH`, no aliases, null `defaultDensity`, and no unit mappings. |
| Ingredient forms | No tigernut form rows found. |
| Legacy candidates | No candidate matched `tigernut`, `tiger nut`, `tiger-nut`, `chufa`, or `souchet`. |
| Active neighbors | `ingredient-ref-almond-flour`, `ingredient-ref-chestnut-flour`, and `ingredient-ref-hazelnut-flour` are separate true-nut flour identities. No active reference or form matched the proposed aliases. |
| Bundled recipes | Searched all 114 recipe JSON files for the current reference ID and `tigernut`, `tiger nut`, `tiger-nut`, `chufa`, `souchet`, `farine de noix tigrées`, and `noix de tigre`: zero matches. There are no exact recipe links to add. |
| Existing research record | The ledger marks identity verified, but measurement and substitution research not yet researched. Its prior decision has no aliases, measurements, recipe links, or substitution rules; this proposal supplies additional evidence for coordinator review. |

## Boundary and naming evidence

| Item | Proposed treatment | Evidence and limits |
|---|---|---|
| Ordinary directly milled flour | Keep on the existing identity. | Manufacturer describes traditional flour as direct grinding of selected tigernuts, with its nutritional qualities retained, and marks that product raw [S04]. This supports a direct-ground flour class; it does not specify a universal hull-removal or roast standard. |
| Fine / extra-fine flour | Do not create aliases or separate identities. | The manufacturer lists these grades as distinct flour products and describes fine flour in terms of its milling/granulometry [S05, S07]. The evidence is company-specific and does not establish common particle-size thresholds across the market. |
| Defatted flour | Keep separate from this whole-tuber flour identity; review as a separate candidate only if needed. | The manufacturer says its product follows oil extraction and is then pasteurized and micronized [S06]. This is a materially different processing path. Do not treat “defatted” as a harmless synonym for unqualified flour. |
| Extracted starch | Separate identity; do not alias to flour. | A technical review describes starch extraction as wet milling, filtering, precipitation, and drying, with oil extraction commonly preceding isolation [S12]. This is physically isolated starch rather than milled tuber flour. |
| Horchata / plant-milk residue flour | Keep outside the whole-tuber flour identity. | The review distinguishes wet-milled and filtered tiger-nut beverage from its solid fiber-rich by-product [S13]. Flour milled from that residual press cake is not the same input material as directly ground tuber flour. No such recipe or active catalog item was found. |
| Québec French | Retain `farine de souchet` as display; accept `farine de noix tigrées` as a source-attested market alias, with the limitation below. | Tigernuts Traders uses the exact product name `farine de souchet` [S07]. La Moisson, a Québec retailer, titles an Ecoideas item `Farine de noix tigrées`, describes it as `farine de souchet`, and lists the ingredient as tiger nuts that “are not nuts, but tubers” [S08]. This validates the alias as a local product label, not as an OQLF language ruling. |

The Canadian government source TERMIUM Plus places the edible tuber in the food-industry domain and records English `tiger nut`, `tigernut`, `chufa`, and `earth almond`, alongside French `souchet comestible`, `souchet`, `amande de terre`, `noix tigrée`, `noix de tigre`, and `chufa` [S02]. Health Canada also uses `souchet comestible (*Cyperus esculentus*)` for this edible species in its crop-group material [S01]. These are tuber names, not flour terms. The OQLF GDT result located for unqualified `souchet` defines a generic Cyperus weed, not edible *C. esculentus* flour [S03]. Therefore the exact market/manufacturer phrase is preferable to expanding the flour alias list with bare plant or tuber synonyms. No OQLF entry for edible tigernut flour was located in this review.

### Candidate names and aliases

| Language | Display | Source-vetted alias candidates | Do not add |
|---|---|---|---|
| English | `tigernut flour` | `tiger nut flour`; `chufa flour` | `tiger nut`, `chufa`, `earth almond`, `yellow nutsedge`, `rush nut`, `tiger nut powder`, `tigernuts flour` as a separate product identity, and `defatted tigernut flour` |
| fr-CA | `farine de souchet` | `farine de noix tigrées` (exact Québec retailer product title; tuber status is explicit on that listing) | Bare `souchet`, `souchet comestible`, `amande de terre`, `noix tigrée`, `noix de tigre`, `chufa`, or an inferred `farine de souchet comestible` |

The two English aliases are supported as flour compounds in food-science product usage: the primary flour study uses “tiger nut flour” [S09], while the bread study explicitly tests “chufa tuber flour” [S10]. TERMIUM's acceptance of the underlying tuber synonyms alone would not be enough to create these flour aliases. The French market alias is supported by a Québec listing of the exact phrase for a single-ingredient tuber flour [S08].

## Measurement and density

One primary study measured organic whole tigernut flour at a bulk density of **0.74 ± 0.01 g/mL** [S09]. Its method placed 10 g in a 25 mL graduated cylinder and tapped it ten times from a specified height; the table reports mean ± standard deviation for three determinations. This is a source-specific tapped bulk-density measurement, not an untapped scoop measure or a validated recipe conversion.

A 2026 composite-flour study prepared dried, milled tigernut flour and reported settled bulk density for wheat/tigernut blends, from 0.73 g/mL for all-wheat flour to 0.85 g/mL at 20% tigernut inclusion [S11]. Those are blended-flour values, not pure tigernut density. Different sample composition and tapping procedure prevent them from validating the 2024 single-flour value as a universal recipe density.

**Package recommendation:** retain `defaultDensity: null`, add no unit mappings, and do not derive cup/spoon mass from either paper. A recipe-facing density would need a representative product-specific measurement and a defined packing method; no bundled recipe currently asks for one.

## Directional substitution evidence

The 2023 bread study tested wheat flour with 10%, 20%, and 40% chufa tuber flour additions. It describes the best overall results at up to 20% in its bread formulation, while the 40% sample also received favorable sensory scores [S10]. A 2026 study tested wheat/tigernut composite flour at 5%, 10%, 15%, and 20% for composition and functional properties, not finished-recipe acceptance [S11]. These support the direction “tigernut flour can partially replace wheat flour in some tested bakery formulas,” but do not establish a universal replacement ratio, volume-for-volume rule, or substitution for every flour. A 2024 study's cookies use 100% organic *C. esculentus* flour, with or without 5% honey syrup; this is evidence of a specific standalone formulation, not evidence that ordinary recipes can be converted by simple replacement [S09].

**Package recommendation:** add no global form conversion, contextual substitution rule, or recipe-line substitution link. Preserve tested percentages as study-specific formulation evidence only. The seed has no exact tigernut recipe demand.

## Package implications

1. Keep the existing reference ID, displays, and `FLOUR_AND_STARCH` category.
2. If the coordinator accepts aliases, add only `tiger nut flour`, `chufa flour`, and the Québec-market label `farine de noix tigrées` to this same reference. Do not add tuber names by themselves or create a second whole-tigernut flour reference.
3. Keep `defaultDensity` null, leave unit mappings and ingredient forms empty, and add no substitution rules.
4. Keep defatted flour, extracted starch, and milk-residue flour outside this identity. Do not classify tigernut flour as a nut flour because its English/French trade names contain “nut/noix.”
5. Leave roasting and other processing qualifiers unresolved; this review found no source basis for making them catalog forms.

## Source register

All pages were accessed on 2026-10-10. Where a page does not show a publication/update date, it is marked undated; search-index dates are not treated as publication dates.

| Source ID | Source and date | Scope / limitation |
|---|---|---|
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S01` | Health Canada, [Crop groups and residue chemistry properties](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html). Page date not shown; accessed 2026-10-10. | Government French usage `souchet comestible (Cyperus esculentus)` in edible root/tuber crop-group material; not a flour term. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S02` | Translation Bureau, [TERMIUM Plus: TIGER NUT](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=TIGER+NUT). Record dated 2022-08-12; accessed 2026-10-10. | Food-industry terminology, edible-tuber definition, and English/French names; names refer to the tuber, not flour. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S03` | OQLF, [GDT: souchet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8466738/souchet). Entry attributed to ACCT, 1977; accessed 2026-10-10. | The unqualified term is defined as a generic Cyperus weed; no edible flour terminology ruling. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S04` | Tigernuts Traders, [Traditional tigernuts flour](https://www.tigernuts.com/products/tigernuts-flour/). Undated product page, current site copyright 2026; accessed 2026-10-10. | Manufacturer says traditional flour comes from direct grinding of selected tubers and marks the product raw. Scope is this company's product. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S05` | Tigernuts Traders, [Fine tigernut flour](https://www.tigernuts.com/products/fine-tigernuts-flour/). Undated product page; accessed 2026-10-10. | Supports manufacturer-specific grind grade and bakery positioning; gives no universal mesh class. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S06` | Tigernuts Traders, [Defatted tigernuts flour](https://www.tigernuts.com/products/defatted-tigernuts-flour/). Undated product page; accessed 2026-10-10. | Distinct oil-extraction, pasteurization, and micronization process; manufacturer-specific. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S07` | Tigernuts Traders, [Farine de souchet fine](https://www.tigernuts.com/fr/produits/farine-de-souchet-fine/). Undated product page; accessed 2026-10-10. | Exact French product wording and manufacturer flour-grade family; not an independent Québec terminology ruling. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S08` | La Moisson, [Farine de noix tigrées](https://lamoisson.com/collections/farines-preparations-flour-meal-flour-mixtures/products/farine-de-noix-tigrees). Undated Québec retailer listing; accessed 2026-10-10. | Exact local product title, description also says `farine de souchet`, and sole ingredient is identified as tubers rather than nuts. Retail-market evidence only. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S09` | Belmadani et al., [Functional *Cyperus esculentus* cookies enriched with *L. rhamnosus* SL42](https://doi.org/10.3390/foods13162541), *Foods* 13(16):2541, published 2024-08-15. | Primary study of 100% organic whole tigernut flour; includes the 0.74 ± 0.01 g/mL tapped bulk-density measurement and one cookie formulation. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S10` | Özcan, [Quality evaluation of bread prepared from wheat–chufa tuber composite flour](https://doi.org/10.3390/foods12030444), *Foods* 12(3):444, published 2023-01-17. | Primary bread study with 10%, 20%, and 40% chufa flour additions; results apply to that formulation. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S11` | Aderinola and Olufemi, [Functional and nutritional properties of tigernut-wheat flour](https://www.explorationpub.com/Journals/eff/Article/1010153), *Exploration of Foods and Foodomics* 4:1010153, published 2026-05-25. | Primary composite-flour assay at 5–20% inclusion, not a finished-baked-product substitution trial; bulk-density figures are for blends. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S12` | RSC, [Tiger nut starch: extraction, composition, structure, properties, modification and uses](https://pubs.rsc.org/en/content/articlehtml/2024/fb/d3fb00246b), *Sustainable Food Technology*, 2024. | Technical review describing extracted starch and its distinct process; secondary source. |
| `WP02-TIGERNUT-FLOUR-REVIEW-20261010-S13` | Yu et al., [Tiger Nut (*Cyperus esculentus L.*): Nutrition, Processing, Function and Applications](https://pmc.ncbi.nlm.nih.gov/articles/PMC8871521/), 2022 review. | Secondary source distinguishing wet-milled beverage and its solid fiber-rich by-product from direct-ground tuber flour. |

## Limitations and unresolved items

- No exact tigernut recipe line or legacy candidate was found in the current bundled corpus.
- Manufacturer product pages describe individual products and do not establish an industry-wide standard for raw, peeled/unpeeled, roasted, fermented, or particle-size properties.
- The French market wording is documented in Québec commerce, but the search found no OQLF entry explicitly naming the edible tuber flour. Keep that limitation visible for future language review.
- The measured bulk density is a single flour's standardized tapped value; no transferable cup or spoon mass is established.
- Bakery substitution trials are recipe-specific and do not justify a global directed rule.
