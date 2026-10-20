# WP03 Section F — flattened-rice regional spelling cluster (Round 70, 2026-10-13)

## Review record

- **Scope:** review the unowned romanized product names **powa, pawa, pauwa, pauaa, paunva, and poya** as possible search terms for the existing flattened-rice (poha) reference. This is one related terminology cluster; it does not propose a new grain identity or a new product form.
- **Plan context:** Section F remains open for regional cereal-mix and preprocessed-grain review in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10470). The roadmap also keeps Section F open.
- **Prior work:** R65 reviewed only sira; its Rani citation happens to name “Poha (Powa)” in the source title, but did not decide Powa. The separate R70 atukulu review covered only that alias. The R69 phovu decision also did not cover this cluster.
- **Artifact status:** Proposal reviewed and integrated; root integration is recorded below. The proposal author edited only this review file. No app tests or emulator checks were run because the accepted change only adds database JSON data and its generated index.

## Recommendation

**Add powa, pawa, pauwa, pauaa, and paunva as English-search aliases on the existing ingredient-ref-flattened-rice-poha reference. Hold poya unallocated.**

The current technical and product sources distinguish these accepted spellings as names for the existing plain rice-flake product. NIFTEM’s PMFME presentation directly lists Paunva as Gujarati for flaked rice. Poya appears only in a broad, unassigned synonym list and derivative secondary lists; the review did not find independent current product or regional-authority evidence sufficient to allocate it.

Keep the displays, category, existing aliases, forms, and numeric data unchanged. Add no identity, form, recipe link, density, conversion, yield, measurement, or substitution.

| Field | Recommended scope |
| --- | --- |
| Existing reference | ingredient-ref-flattened-rice-poha |
| English display | Keep flattened rice (poha) |
| fr-CA display | Keep flocons de riz (poha) |
| Add to aliasesEn | powa, pawa, pauwa, pauaa, paunva |
| Keep out of aliasesEn | poya |
| aliasesFr | Keep riz aplati and riz battu; add none of the South Asian spellings |
| Category | Keep GRAIN_AND_CEREAL |
| New references, forms, recipe links, or numeric behavior | None |

## Candidate decisions and evidence

| Candidate | Evidence and boundary | Decision |
| --- | --- | --- |
| **powa** | The 1970 Supreme Court of India judgment *Chinta Lingam v. Government of India* describes beaten rice as “powa” and distinguishes it from puffed/parched rice called murmura. A current Rani product is titled Poha (Powa) Thin Cut (Flattened Rice); the 2025 Heera product catalog lists medium, thick, and thin Powa as separate commercial grades. This supports the unqualified product name, not a thin-grade mapping. | **Add** as an English-search alias of generic flattened rice. |
| **pawa** | The official NIFTEM PMFME flaked-rice process presentation says the product is commonly sold as poha or pawa. Current manufacturer Top-Op lists Pawa Thin as an Indian-origin product in its Pawa/rice-products range. The manufacturer page’s Thin qualifier belongs to that SKU; the NIFTEM wording supports the broader product family. | **Add** as an English-search alias; do not map it to the thin form. |
| **pauwa** | Angur’s current product page identifies its product as Poha — Flattened Rice and names Pauwa as a Gujarati regional name. The page is a current seller/brand source, not a formal Gujarati-language ruling. | **Add** as an English-search alias; do not treat it as Québec French. |
| **pauaa** | The current Gujarat exporter Siya Agri Exports lists “Pauaa (પૌઆ)” as a Gujarati name in its thick-poha product terminology. The Rani page also includes pauaa in a broad alternate-name list. The direct product listing supports this spelling as a product-family query; it does not establish a thickness-specific catalog form. | **Add** as an English-search alias; do not map it to the thick form. |
| **paunva** | NIFTEM’s PMFME presentation lists “Paunva - Gujarati” under flaked rice in its common-names table (page 2); page 19 also says flaked rice is sold as poha or pawa. Rani’s current alternate-name list independently includes the combined “pauaa/paunva” spelling, though without assigning each spelling a language. The official regional label supports this as a product-family query, not a form or Québec French term. | **Add** as an English-search alias; do not map it to a particular grade. |
| **poya** | Rani’s broad alternate-name list includes poya without a language assignment. The secondary list found in this review identifies it as Rajasthani but says that list was taken from Wikipedia; no independent current product or regional-authority source was found. | **Hold** pending independent product or regional terminology evidence. |

These decisions apply only to bare product-name queries. They do not create aliases such as “red Powa,” “Makkai Powa,” “Pawa Thin,” “Nylon Pauaa,” or named dishes. The current catalog keeps red rice flakes and corn poha separate from generic rice poha.

## Current ownership and exact-key audit

The live ingredient catalog contains 1,390 references, 100 forms, and the legacy-import file contains 63 candidates. The research ledger contains 1,723 records. A normalized exact-term scan covered active reference names and aliases, form labels and match terms, all legacy candidates, ledger record IDs and text, and proposal/batch archives.

| Candidate | Active reference/form/legacy exact owner | Ledger exact owner | Prior archive disposition |
| --- | --- | --- | --- |
| powa | None | None | No focused review. It appears once in the R65 sira proposal as part of the cited Rani product title. |
| pawa | None | None | None found. |
| pauwa | None | None | None found. |
| pauaa | None | None | None found. |
| paunva | None | None | None found. |
| poya | None | None | None found. |

The one R65 mention of Powa is incidental source-title text, not an alias, owner, or decision. The Rani product page itself contains a wider alternate-name list, but R65 scoped its finding to sira and did not allocate those other names.

Current relevant active rows are:

| Reference | Current search identity | Boundary |
| --- | --- | --- |
| ingredient-ref-flattened-rice-poha | flattened rice (poha) / flocons de riz (poha); English aliases beaten rice, flaked rice, rice flakes, chiura, aval, atukulu, avalakki, chira, chuda, sira, phovu; French aliases riz aplati, riz battu | Owner for generic plain rice flakes and unqualified regional names supported by this review. defaultDensity is null and unitMappings is empty. |
| ingredient-ref-red-rice-flakes | red rice flakes / riz rouge aplati; English alias red rice poha; French alias poha rouge | Keep red-specific searches here. |
| ingredient-ref-corn-poha | corn poha / poha de maïs; English aliases maize poha, makai poha, makka poha; French alias makkai poha | Keep maize product searches separate from rice flakes. |

The generic poha reference has three forms: thin, medium, and thick. None of the six candidates is a current form label or match term. Their form densities are null. No proposed source-ID prefix collision was found during proposal work. Root later added R70 sources S01–S08 to the shared research-ledger record; source S09 remains proposal-only.

## Picker projection

IngredientSearch.kt normalizes search text, returns complete word-phrase matches first, then tries substring matches. A static projection from the current JSON and search code gives:

| Query | Current picker result | Result after this proposal |
| --- | --- | --- |
| powa | No result | One result: ingredient-ref-flattened-rice-poha |
| pawa | No result | One result: ingredient-ref-flattened-rice-poha |
| pauwa | No result | One result: ingredient-ref-flattened-rice-poha |
| pauaa | No result | One result: ingredient-ref-flattened-rice-poha |
| paunva | No result | One result: ingredient-ref-flattened-rice-poha |
| poya | No result | No result; held |
| poha | Three results: generic flattened rice, red rice flakes, corn poha | Same three results |
| red rice poha | One result: ingredient-ref-red-rice-flakes | Same red-specific result |
| corn poha | One result: ingredient-ref-corn-poha | Same maize-specific result |
| rice flakes | Three results: brown rice flakes, generic flattened rice, red rice flakes | Same three results |

Each proposed spelling replaces an empty search result with one generic rice-flake result. The holds remain empty. The proposal does not make a bare spelling identify a color, corn product, commercial grade, or prepared dish.

## Bundled recipe demand

A read-only scan parsed all 114 recipe paths in the bundled-library manifest and all 1,123 ingredient rows. It searched each recipe’s serialized content and ingredient rows for the six candidates and for the generic phrases poha, flattened rice, beaten rice, flaked rice, and rice flakes.

| Corpus measure | Result |
| --- | ---: |
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Files containing any candidate or generic rice-flake phrase | 0 |
| Rows containing any candidate or generic rice-flake phrase | 0 |
| Existing links to ingredient-ref-flattened-rice-poha | 0 |
| Manifest-order recipe-corpus fingerprint | 81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552 |

The bundle creates no recipe demand, form-specific use, or recipe-linked measure for these names.

## Québec French scope

Keep the existing French display flocons de riz (poha) and French aliases riz aplati and riz battu. Québec-facing retailer and recipe sources in the existing ledger support this product wording, including Atlantic Superstore and Provigo listings. Those sources support local product language; this proposal does not claim an OQLF or TERMIUM preference.

The reviewed uses of powa, pawa, pauwa, pauaa, and paunva are South Asian regional/product terms. None was verified as a Québec French name. Store the accepted spellings in aliasesEn under the existing catalog convention for non-French search terms; do not add them to aliasesFr or invent a French translation.

## Numeric evidence and limits

- **Density and unit mapping:** The generic reference has defaultDensity: null and unitMappings: []. All three attached forms have densityGPerMl: null. No reviewed product source publishes a usable mass-per-volume value for a household measure. Keep these values unchanged.
- **Existing recipe-scoped measure:** The current poha ledger record already stores one FAO / Bangladesh Breastfeeding Foundation observation: 60 g, described as three fistfuls, for the complete Chirar Polao formula yielding one 230 g cooked bowl and two child servings. The dry chira is weighed before soaking/cooking; the source gives no fist-size or weighing protocol. This is not a per-serving amount, universal fistful conversion, or reusable measure for Powa/Pawa/Pauwa/Pauaa/Paunva.
- **Commercial package values:** Rani lists its Powa product at 64 oz / 4 lb / 1.81 kg. Heera’s June 2025 catalog lists medium, thick, and thin Powa in cases of 20 × 300 g or 6 × 1 kg; its red Powa and Makkai Powa are separate qualified products. Top-Op lists Pawa Thin in 10 × 250 g and 6 × 1 kg packs. Angur lists its poha product in a 500 g pack. These are package configurations and product labels, not serving sizes, density measurements, or household conversions.
- **Process figures:** The NIFTEM handbook reports flake thicknesses of about 1 mm for thick, about 0.6 mm for medium, 0.3–0.55 mm for thin, and below 0.3 mm for very thin flakes. It reports a 55–70% flaked-rice process yield that varies with paddy variety, paddy quality, processing conditions, and flake type. These are industrial grade/process figures; they do not establish universal retail cutoffs, alias-to-form mappings, recipe yield, or a kitchen measure. Heera’s listing of Powa in several grades reinforces that Powa alone does not mean thin, medium, or thick.
- **Conversions and substitutions:** No unit conversion or ingredient substitution is supported for these spelling aliases. The generic reference’s substitution research remains blocked_pending_evidence; its grade forms do not gain a conversion or substitution from this review. Add no yield, conversion, or substitution record.

## Source register

At proposal stage, the `WP03-POHA-NAME-CLUSTER-20261013-R70-*` IDs below were proposal-local. Root later added S01–S08 to the existing flattened-rice ledger record; S09 remains proposal-only. The explicitly marked existing-ledger source IDs are cited in place without modification.

| Source ID | Source and locator | Finding and limit |
| --- | --- | --- |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S01 | Supreme Court of India, *Chinta Lingam & Ors. v. Government of India & Ors.*, 30 Nov 1970, 1971 AIR 474, [judgment text rehosted by Indian Kanoon](https://indiankanoon.org/doc/179636/), judgment paragraph beginning “There the petitioners…”. | Calls beaten rice “powa” and distinguishes it from murmura. This is a historical court record in an Andhra Pradesh rice-trade context; it supports the product/spelling distinction, not a current language-standard ruling. |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S02 | NIFTEM PMFME, Government of India Ministry of Food Processing Industries, [Puffed and Flaked Rice](https://www.niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/Rice-based-product-Process-PPT.pdf), “Common Names in Indian States,” page 2 and flaked-rice slide, page 19. | Indexed text of page 2 lists “Paunva - Gujarati” under flaked rice; page 19 says flaked rice is sold as poha or pawa. This is an official food-processing training source and directly supports Paunva’s regional product-name scope. Direct PDF fetch returned a 502 gateway error in this review, so both locators were checked in indexed text. It gives no household measure. |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S03 | Rani Brand, [Poha (Powa) Thin Cut (Flattened Rice), 64 oz](https://ranibrand.com/products/rani-poha-powa-thin-cut-flattened-rice-4lb-64oz-bulk-all-natural-salt-free-vegan-no-colors-gluten-friendly-indian-origin), current manufacturer/store page. | Product title and ingredient description identify flattened rice; product origin is India and net weight is 64 oz / 4 lb / 1.81 kg. The alternate-name list includes all six reviewed spellings, but it is broad, does not assign a language to each, and is not by itself sufficient to accept every spelling. Weight is package mass only. |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S04 | Heera Foods, [2025 product catalog](https://www.heerafoods.com/wp-content/uploads/2025/06/Catalogue-06-2025-compressed.pdf), p. 28, “Rice | Poha | Mamra”. | Indexed PDF text lists medium, thick, and thin Powa, plus separate red Powa and Makkai Powa SKUs. Direct PDF fetch failed in this review. Pack configurations are product packaging, not household measures. The catalog supports trade range at publication; it does not prove current stock. |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S05 | TOP-OP Foods, [Top-Op Pawa Thin](https://www.top-op.com/brands/topop/mamra_pawa_and_rice_products/topop_pawa_thin/), product details. | Product page identifies Pawa Thin, product category “Mamra, Pawa and Rice Products”, origin India, with 10 × 250 g and 6 × 1 kg packs. The indexed page is current; direct retrieval returned a cache miss. Thin and pack sizes are SKU-specific. |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S06 | Angur, [Premium Poha (Flattened Rice)](https://www.angur.com/product/poha), regional-name statement and product specifications. | The current product page names Pauwa as a Gujarati name for flattened rice and offers its poha in a 500 g pack. This is current brand/seller wording, not a formal language authority; package mass is not a portion. |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S07 | Siya Agri Exports LLP, [Poha Thick](https://siyaagriexports.com/products/poha-thick/), technical specifications and regional terminology. | The exporter lists Gujarati “Pauaa (પૌઆ)” for poha. Its moisture and packaging figures are seller-specific and are not used as general measures or standards. This is commercial terminology, not a Québec French source. |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S08 | Pavithra’s Kitchen, [Aval upma / poha upma recipe](https://www.paviskitchen.com/2021/04/poha-upma-recipe-aval-upma.html), regional-name list. | Lists Paunva and Poya, then states that the list was taken from Wikipedia. It is documented as a derivative lead only and does not independently establish those names. |
| WP03-POHA-NAME-CLUSTER-20261013-R70-S09 | Indian Institute of Food Processing Technology, Ministry of Food Processing Industries, [Handbook of Processing of Puffed & Flaked Rice](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/Rice-Based-Product-Handbook.pdf), pp. 16, 23–24. | Defines the flaked-rice process and reports the cited thickness and process-yield figures. These are technical product/process observations, not household measurements, density, or alias-to-form mappings. |
| Existing ledger source WP03-CHIRA-20261013-R3-S04 | FAO / Bangladesh Breastfeeding Foundation, [Complementary feeding for children aged 6–23 months](https://www.fao.org/fileadmin/user_upload/nutrition/docs/education/resources/by_country/Bangladesh/EN-Recipe_booklet_complementary_feeding_English.pdf), Chirar Polao ingredient table and footnotes. | Existing source entry supports the bounded 60 g / 3 fistfuls observation and its recipe-only limits; this review does not widen or alter it. |
| Existing ledger sources WP03-S95 and WP03-SIRA-20261013-R65-S06 | [Atlantic Superstore](https://www.atlanticsuperstore.ca/fr/clpplp/clpplp/clpplp/food/international-foods/c/58044) and [Provigo](https://www.provigo.ca/fr/alimentation/aliments-internationaux/aliments-de-l-asie-du-sud/c/58045), Québec French retail category listings. | Existing records support the French product wording in the current catalog, not a formal OQLF/TERMIUM preference. |

## Integration outcome (2026-10-13)

Root accepted the five English aliases `powa`, `pawa`, `pauwa`, `pauaa`, and `paunva` on the existing
flattened-rice reference. Root independently opened the official NIFTEM PMFME PDF and verified page
2's `Paunva - Gujarati` entry and page 19's poha/pawa statement; no generated alias-to-grade mapping
was added. Root also accepted the hold on `poya` and recorded it as an unresolved term decision on
the existing flattened-rice research-ledger record. Seven accepted source records and one additional
source record supporting the hold were added to that ledger record. No French aliases, forms,
measures, conversions, yields, recipe links, or substitutions changed. See the
[integration README](../batches/wp03-section-f-regional-poha-aliases-integration-20261013/README.md).

The change only adds database JSON data and its generated index, so no app tests or emulator checks
were run.
