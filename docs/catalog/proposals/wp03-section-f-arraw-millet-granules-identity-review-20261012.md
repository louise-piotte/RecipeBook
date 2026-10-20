# WP03 Section F: millet arraw identity review

## Packet record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated by the root coordinator on 2026-10-12. The accepted JSON and tracking changes are recorded in the batch README.
- **Open checklist item:** **“Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps”** remains open at [plan line 2182](../../RecipeBook-global-ingredient-catalog-plan.txt#L2275).
- **Scope:** Senegalese human-food *arraw* made from millet flour and rolled into granules. Exclude maize-based *arraw*, raw millet grain, millet flour, other rolled millet products, and prepared porridge/dishes.
- **Recommendation:** **integrated identity-only** `ingredient-ref-arraw` as `arraw (millet granules) / granulés de mil (arraw)` in `GRAIN_AND_CEREAL`, with English alias `millet arraw` and French aliases `arraw de mil` and `arraw mil`. No forms, density, unit mappings, active measures, conversions, yields, bundled-recipe links, or substitution rules were added.

## Open item and prior coverage

The plan’s regional cereal/preprocessed-grain item remains open after focused reviews of misugaru, Sankhal, thiéré, sprouted brown rice, quick-cooking rice, and other products. The proposal and batch archive contain Sankhal and thiéré discussions that explicitly keep *arraw* separate; neither is a focused *arraw* review or identity. The active catalog has no `ingredient-ref-arraw` row. The ledger mentions *arraw* only in adjacent product-boundary research; it has no dedicated *arraw* record. This review does not reopen the Sankhal or thiéré decisions.

Senegal’s standards directory lists **Arraw de mil — NS 03-084**. Senegal’s ITA lists production of *Arraw* separately from production of *sankhal* and from *thiacry* or couscous. A market study describes *arraw* as a rolled-granule product made from grain flour and water, and says both millet- and maize-based products exist. This proposal deliberately selects the millet product only. The report and current manufacturer/retail listings distinguish *arraw* from *thiéré* and *thiakry*, while showing that process, moisture, and size can vary. No single grain size, drying state, precooking state, or formula is proposed as universal.

## Product boundary and bilingual naming

Québec-facing product labels directly support the French wording *granulés de mil (arraw)*. A Canadian English product listing uses `ARRAW MILLET`; a Senegalese English recipe source uses `millet arraw`. These are product-market terms, not an OQLF or TERMIUM ruling. OQLF’s entry covers generic *millet / mil / petit mil* and says that generic term can group multiple species; it does not define *arraw*.

| Proposed field or boundary | Recommendation | Evidence and limit |
| --- | --- | --- |
| ID | `ingredient-ref-arraw` | Absent from active references, legacy candidates, and ledger record IDs in the live snapshot below. |
| English display | `arraw (millet granules)` | Canadian English product listing uses `ARRAW MILLET`; the parenthetical is a descriptive gloss, not a standardized English term. |
| Québec French display | `granulés de mil (arraw)` | Maad MTL uses this exact wording on a Montréal-area product page; Naboo uses `GRANULES DE MIL (ARRAW)`. This is Québec market language, not an official terminology ruling. |
| English alias | `millet arraw` | Exact phrase used in NKOSI’s English recipe; the regional product name stays visible in the display. Do not add broad `millet semolina`, `rolled millet`, or `millet flour` aliases. |
| French aliases | `arraw de mil`; `arraw mil` | `Arraw de mil` is the Senegal standard-directory title; `Arraw mil` appears in a Montréal-delivery grocery listing. Both name the millet-specific product and remain aliases rather than a Québec terminology claim. |
| Category | `GRAIN_AND_CEREAL` | The reviewed sources identify a human-food rolled-granule cereal product, not a flour. |
| Millet flour / *soungouf* | Keep separate | Flour is the input material from which sources describe rolling the granules. Do not alias or link the flour identity as a form. |
| Maize *arraw* | Keep separate | IPAR documents both millet and maize versions. The proposed identity is specifically millet-based; do not use bare `arraw` as a generic millet-and-maize class or alias maize granules into it. |
| *Thiéré* / millet couscous | Keep separate | Standards and Québec listings name *couscous de mil / thiéré* separately. Do not add `couscous`, `millet couscous`, or `thiéré`. |
| *Thiakry / thiacri* | Keep separate | Senegal’s standards list and current manufacturer pages present it separately; it is also sold as a separate Québec product. Do not add these names as aliases. |
| *Sankhal / sanxal* | Keep separate | The standards list a separate *Sanxal de mil* specification; Québec product pages distinguish *brisures de mil (sankhal)* from *arraw*. Do not add `sankhal`, `sanxal`, or `brisures de mil`. |
| Porridge and dishes | Keep separate | *Lakh*, *fondé*, *ngumb*, and other prepared dishes use arraw but are not names for the ingredient identity. Do not add dish names as aliases or link external recipes to the bundled corpus. |
| Size and process variants | Do not encode | Sources describe coarse, medium/large, or study-specific millimetre sizes and fresh, dried, steamed, and frozen products. Those are source/product-specific and do not support universal forms or size aliases. |
| Other spellings | Do not add `araw` or `arrow` | The current picker’s `araw` query resolves to caraway seeds through substring fallback; `arrow` resolves to arrowroot. The double-r spelling `arraw` avoids both collisions. |

The recommended row names one millet-derived granule product. It does not assert that every *arraw* product is made only from millet, uses a particular millet species, has a standard granule size, or is sold dry. Some sources call it coarse millet couscous in a recipe context, but the product name remains distinct from the existing wheat couscous and millet-couscous (*thiéré*) identities. Les Ateliers de Iba also gives a homemade production option using millet flour or millet with 100 g rice; that recipe-specific base is not a retail formula or an ingredient-substitution ratio.

## Picker ownership and bundled recipe demand

The static projection follows `normalizeIngredientSearchKey` and the phrase-first / substring-fallback behavior in `IngredientSearch.kt`, over the current reference names and aliases plus form labels and search terms. It is a projection, not a live Android picker observation. Legacy candidate text and all ledger records were also searched for exact candidate phrases and dedicated record ownership.

| Query or surface | Current owner(s) | Projection with proposed row |
| --- | --- | --- |
| `arraw` | No active reference or form match. | Only `ingredient-ref-arraw`. |
| `arraw de mil`, `arraw mil`, `millet arraw`, `millet granules`, `granules de mil` | No active reference or form match. | Only the proposed row; `millet arraw`, `arraw de mil`, and `arraw mil` depend on the proposed aliases. |
| `araw` | `ingredient-ref-caraway-seeds`, by substring fallback. | Still only caraway seeds; the proposed row does not contain the single-r spelling. |
| `arrow` | `ingredient-ref-arrowroot`. | Still only arrowroot. |
| `thiéré`, accent-folded `thiere`, `couscous de mil` | `ingredient-ref-millet-couscous-thiere`. | Unchanged; *arraw* is not returned for these qualified queries. |
| `sankhal`, `sanxal` | `ingredient-ref-sankhal`. | Unchanged; *arraw* is not returned. |
| `thiakry`, `thiacri`, `semoule de mil` | No active reference or form match. | No match; these are not proposed aliases. |
| `millet semolina` | `ingredient-ref-sankhal` from its display `sankhal (broken millet semolina)`. | Still only Sankhal; no *arraw* alias is added for the broader phrase. |
| `millet` | 16 active references, including millet grain, flour, flakes, puffed millet, thiéré, and Sankhal. | 17 references; the proposed qualified identity adds one result. Do not add bare `millet` as an alias. |
| `mil` | `ingredient-ref-millet-couscous-thiere`, `ingredient-ref-pearl-millet-flour`, and `ingredient-ref-sankhal`. | Those three plus the proposed row because its French display contains `mil`. The bare query remains a broad search, not an alias. |
| Forms and legacy candidates | 98 forms and 64 legacy candidates; no exact *arraw* identity/phrase owner. | No forms or legacy candidates proposed. |
| Research ledger | 1,635 records; *arraw* occurs only as adjacent-boundary discussion in existing Sankhal/thiéré research, with no dedicated *arraw* record. | If accepted, add a separate `ingredient_reference` record using the source register below. |
| Full bundled recipe corpus | 114 manifest-listed recipe files and 1,123 ingredient rows. | Static whole-phrase audit found **0 / 114 files** and **0 / 1,123 ingredient rows** for `arraw`, `arraw de mil`, `arraw mil`, `millet arraw`, `arraw millet`, `millet granules`, `granules de mil`, and the neighboring *thiéré*, *thiakry*, *sankhal*, *soungouf*, *lakh*, and *fondé* terms. No recipe links or recipe-line changes are justified. |

The corpus scan searched all string fields in every manifest-listed recipe, not only the ingredient-name fields. Whole-word phrase matching avoids counting unrelated words such as `arrowroot` as an *arraw* recipe hit.

## Measures, density, and substitutions

| Data area | Recommendation | Evidence and limit |
| --- | --- | --- |
| Forms | Add none. | Sources show product-specific fresh, dried, steamed, and frozen contexts. There is no single state common to all millet arraw products. |
| Default measures, density, and unit mappings | Leave unset. | No source gives a transferable mass-per-volume value or standardized household measure. Canadian 500 g / 600 g listings and a Québec 1 kg package are SKU/package quantities, not cup conversions or yields. |
| Recipe amounts | Preserve only as bounded source-specific `portion_weight` observations if the identity record is accepted. | The exact source amounts and limits are specified below. They are complete-recipe ingredient quantities, not default measures or per-person values. |
| Conversions, cooking yield, and package yield | Add none. | Recipe water quantities do not establish density or a conversion. The listed package weights do not establish yield. No paired raw/cooked mass measurement was found. |
| Substitution | Record `researched_no_supported_substitute`; add no rule. | NKOSI says millet flour (*soungouf*) can replace arraw in porridge for a finer texture, while arraw cooks faster and binds more. It supplies no same-quantity instruction, validated ratio, or transferable preparation rule. Record this only as a source-specific reported alternative; do not activate a general substitution. No source supports replacing arraw with rice, wheat couscous, thiéré, thiakry, or Sankhal. |
| Recipe links | Add none. | The complete bundled recipe audit found no candidate demand. External recipes support culinary context only. |

### Proposed ledger research states and observations

If integrated, create a separate `ingredient_reference` ledger record for `ingredient-ref-arraw` with:

- `identityState: verified`
- `measurementState: researched_no_supported_value`
- `substitutionResearchState: researched_no_supported_substitute`

The four observations below are the only recipe amounts recommended for that record. Each is `relationship: portion_weight` and `evidenceKind: published_portion`, with the source quantity preserved. If the ledger stores a normalized gram mass for the 1 kg observation, use the exact kilogram-to-gram unit equivalence; this does not create an ingredient conversion or density.

| Observation ID | Source | Exact observation to retain | Boundary for the ledger |
| --- | --- | --- | --- |
| `arraw-naboo-porridge-200g-20261012` | S08 | Naboo’s preparation lists **200 g granules de mil (arraw)**, with 1 L water and other ingredients; no serving count is stated. | One complete recipe amount with unspecified yield. Do not infer servings, per-person mass, density, or a generic water ratio. The page describes cooking for one hour; that method belongs to this recipe. |
| `arraw-inpho-ngumb-1kg-20261012` | S11 | FAO’s Senegalese *Ngumb* entry lists **1 kg arraw**; no servings are stated. Its method precooks arraw with steam, moistens it, then steams it again for 30 minutes before serving with sauce. | One recipe amount with unspecified yield. The recipe method is source-specific; the source does not establish the product’s starting moisture or an individual portion. |
| `arraw-laakh-soow-250g-six-servings-20261012` | S12 | *Laakh Soow* lists **250 g Arraw** in a recipe for **6 people**, alongside 1 L water. | Keep the 250 g complete-recipe amount and six-person basis as published. Do not divide into a single serving or assume dry/fresh state; the page mentions both dry and fresh product options. |
| `arraw-nkosi-lakh-300g-four-servings-20261012` | S13 | NKOSI’s porridge recipe lists **300 g millet arraw** for **4 servings**, alongside 1.2 L water. | Keep the 300 g recipe amount and four-serving basis as published. Do not infer a universal serving size, cup mapping, density, or water conversion. |

For all four observations, record only the recipe’s listed product amount, recipe title, stated serving basis (or that none is stated), and described pre-preparation state. Do not import the recipe water amount as an ingredient conversion, calculate per-person values, average the observations, or set an active default measure. These recipes vary in dish and method, and none establishes a transferable measurement for all millet arraw.

For the substitution finding, use `findingId: arraw-millet-flour-porridge-review-20261012`, `researchState: researched_no_supported_substitute`, no replacements, and one source-specific rejected candidate: millet flour / *soungouf* for arraw in porridge, supported only by S13. Explain that NKOSI reports a finer result and different cooking/binding behavior without specifying replacement quantities or a validated ratio. No active contextual or global rule follows.

## Live package snapshot before proposed integration

Read-only snapshot taken on 2026-10-12. File hashes are SHA-256 of exact bytes. The recipe-corpus digest is SHA-256 over each manifest-ordered relative path, NUL, raw recipe-file bytes, NUL.

| Surface | Live count / size | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1,327 total; 141 `GRAIN_AND_CEREAL`; 425,002 bytes | `63fa2719dabf943f2e25c9228123a93c59655a83c8bddccb22d3921b0887e225` |
| Ingredient forms | 98; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import identities | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,635 records; 6,065 source entries; 5,081 distinct source IDs; 8 unit conversions; 6,025,719 bytes | `3ee094d992a4e33f69d89516cb455fab3cf8e593960912f26bc8b1c84adab835` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated ingredient catalog | 1,327 references; 581,706 bytes | `9c0db1e6b92d632bd9305f5c0620ad482547e75687c82ba2106ecdc99250ccff` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Before drafting, the proposal path was unused, `ingredient-ref-arraw` was absent from active references, legacy candidates, and ledger record IDs, and prefix `WP03-ARRAW-20261012-` had zero occurrences in `docs/catalog`. The live corpus and picker audit above are static projections; no application was launched.

## Source register

Sources checked on 2026-10-12. Proposal-local IDs use the unique prefix `WP03-ARRAW-20261012-` and are not yet assigned to the shared ledger.

| Source ID | Source and locator | Evidence and limit |
| --- | --- | --- |
| `WP03-ARRAW-20261012-S01` | République du Sénégal, [Répertoire des normes dans le domaine agroalimentaire](https://senegalcommerce.sec.gouv.sn/Documents/ASN/Publications/R%C3%A9pertoire%20des%20Normes%20dans%20le%20Domaine%20Agroalimentaire.PDF), entry `Arraw de mil — NS 03-084`. | Government-hosted standards directory confirms the millet-specific standard title and number. It is a directory, not the full standard text. |
| `WP03-ARRAW-20261012-S02` | FAO / Codex Alimentarius, [Rapport final d’étude de transcription des normes du Codex au Sénégal](https://www.fao.org/fileadmin/user_upload/codexalimentarius/doc/CTF/CTF_SENEGAL4-1-2.pdf), pp. 43, 49. | Lists NS 03-084 `Arraw de mil`, NS 03-099 precooked cereal/vegetable-flour granules `thiakry`, NS 03-103 `Couscous de mil`, and NS 03-113 `Sanxal de mil`. It establishes separate standard titles, not the full product specifications. |
| `WP03-ARRAW-20261012-S03` | Institut de Technologie Alimentaire du Sénégal, [Formation à la carte](https://ita.sn/formation/), lines 163–172. | The ITA lists production of Sankhal, production of thiacry or couscous, and production of Arraw separately. This supports distinct Senegalese processed-grain product identities; it does not specify every product formula or size. |
| `WP03-ARRAW-20261012-S04` | Safietou Barro Samb / IPAR, [Analyse du marché des céréales locales (mil et maïs) au Sénégal](https://ipar.sn/wp-content/uploads/2024/08/Analyse-du-marche-des-cereales-locales-mil-et-mais-au-Senegal-Publie-le-27-janvier-2022.pdf), report dated July 2021, pp. 18–20. | Describes *arraw* made by rolling millet or maize flour (*soungouf*) with water, separates it from thiéré, thiakry, Sankal, and flour, and documents fresh, dried, and frozen product markets. It reports a coarse-size description and that dried arraw accounted for 21% of dried millet-derived products in the cited 2018 dataset; this is not a current consumption share or a universal granule-size standard. |
| `WP03-ARRAW-20261012-S05` | Sène et al., [“Combined Effect of Extrusion Cooking and Hydrocolloids on Senegalese Rolled Millet Flour (‘Arraw’) from *Pennisetum glaucum*”](https://www.scirp.org/journal/paperinformation?paperid=141698), 2025. | The indexed abstract describes rolled dehulled millet flour granules and study sizes of 2.5 and 3.5 mm. The page/PDF returned a cache miss during this review; use only as supporting, study-specific evidence, not as a standard size or formula for retail products. |
| `WP03-ARRAW-20261012-S06` | SENA AGRO INDUSTRIES, [Export product catalogue](https://senaagroindustries.com/products), lines 167–204. | A Senegalese manufacturer lists *Thiakry*, *Arraw*, and *Thiéré* as separate products; it describes arraw as millet granules for porridge and breakfast. Manufacturer marketing supports product naming and uses, not a universal recipe or specification. |
| `WP03-ARRAW-20261012-S07` | Maad MTL, Montréal, [ARRAW (Granulés de mil), 600 g](https://maadmtl.com/products/arraw-granules-de-mil), product description. | Exact Québec-facing name; says millet flour is rolled with water into medium or large granules and dried. The page says postal shipping to Canada, showed the SKU sold out when checked, and gives 600 g package mass only. The listed process is this seller’s product, not a universal state. |
| `WP03-ARRAW-20261012-S08` | Naboo, Montréal, [Granules de mil (Arraw), 600 g](https://naboolaboutique.ca/product/granules-de-mil-arraw-600g/), product title, description, and preparation. | Uses the French display wording, classifies the SKU as a cereal, and lists thiacri, millet flour, thiéré, and Sankhal separately. Its recipe gives 200 g arraw but no serving count. Product/package and recipe evidence are seller-specific. |
| `WP03-ARRAW-20261012-S09` | Panier Marché, [Arraw mil (Granules de mil)](https://paniermarche.ca/produits), current indexed listing. | A Greater Montréal grocery listing uses `Arraw mil (Granules de mil)` and offers 250 g / 500 g variants. The page rendered no text to the browser during this review, so use it only as indexed local product-name evidence; package variants are not measures. |
| `WP03-ARRAW-20261012-S10` | Fresh Foods Centre Des Viandes, [LABEL AFRIK ARRAW MILLET 500g](https://www.freshfoodscentredesviandes.ca/product-page/label-afrik-arraw-millet-500g), Canadian retail listing. | The current indexed product title supports Canadian English-facing `ARRAW MILLET` wording. Direct page retrieval returned a cache miss; no composition, preparation, or active inventory claim is made from the listing. |
| `WP03-ARRAW-20261012-S11` | FAO INPHO, [Ngumb](https://www.fao.org/in-action/inpho/resources/cookbook/detail/en/c/529/), source credited to Senegal’s Ministry of Scientific Research and Technology / ITA (1998). | Lists 1 kg arraw for a Senegalese main-dish recipe, with no servings stated; describes pre-steaming, moistening, steaming 30 minutes, then serving with sauce. This is a whole-recipe quantity and source-specific method. |
| `WP03-ARRAW-20261012-S12` | Les Ateliers de Iba, [Laakh Soow (bouillie de mil au lait caillé)](https://lesateliersdeiba.wordpress.com/2017/06/23/laakh-soow-bouillie-de-mil-au-lait-caille/), 2017, ingredients for six. | Calls arraw coarse millet couscous and lists 250 g for six people. The post also mentions dry and fresh products, with longer cooking for dry arraw. Its homemade production option uses millet flour or millet with 100 g rice; that is specific to the post and does not establish a general formula or replacement ratio. |
| `WP03-ARRAW-20261012-S13` | NKOSI, [Senegalese Millet Porridge: The Lakh and Fondé Recipe](https://www.nkosiagro.com/en/blogs/blog-and-recipes/senegalese-millet-porridge-recipe-creamy-millet-breakfast), accessed 2026-10-12. | Lists 300 g millet arraw for four servings. Its FAQ says millet flour (*soungouf*) can replace arraw for a finer porridge, while arraw cooks faster and binds more; it gives no replacement ratio. The recipe and substitution note remain source-specific. |
| `WP03-ARRAW-20261012-S14` | Office québécois de la langue française, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet). | Gives generic French terms *millet*, *mil*, and *petit mil* and explains that generic millet can group several species. It does not define *arraw* or approve a product-specific Québec French term. |

## Decision

Integrated the identity-only millet-arraw reference with the source-backed display and narrow aliases above. The ledger preserves four external recipe masses only as source-specific whole-recipe observations. The record uses `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`. Active numeric behavior, forms, recipe links, and substitution rules remain empty. Section F remains open.
