# WP03 Section F: sankhal / sanxal product-boundary review

## Packet record

- **Reviewed:** 2026-10-12.
- **Status:** integrated on 2026-10-12 as an identity-only reference and bounded ledger evidence; no recipe or runtime logic changed, and the generated catalog index was refreshed.
- **Scope:** Senegalese *sankhal*/*sanxal*, the standardized human-food product made from dehulled, crushed, and graded millet grain.
- **Integrated reference:** `ingredient-ref-sankhal` is the **sankhal (broken millet semolina) / brisures de mil (sankhal)** identity in `GRAIN_AND_CEREAL`. Keep English aliases empty; use French aliases `sanxal` and `sankhal de mil`. Add no forms, default measure, density, unit mapping, cooking yield, recipe link, conversion, or substitution rule.
- **Evidence summary:** Senegal's standards body lists a dedicated Sanxal de mil specification. A Québec grocer uses the product title *Brisures de mil (Sankhal)* and separately lists thiéré, thiacri, arraw, and millet flour. A Montréal delivery listing separately names Sankhal de mil and millet couscous thiéré. The broken-grain scope is sufficiently distinct for a row, while broad retailer synonym lists make aliases beyond the two sourced French spellings unsafe.

## Open Section F item and prior coverage

The checklist still asks for **“Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps”** at [plan line 2175](../../RecipeBook-global-ingredient-catalog-plan.txt#L2268); the broader continuation items remain open at [lines 9288](../../RecipeBook-global-ingredient-catalog-plan.txt#L9569) and [9445](../../RecipeBook-global-ingredient-catalog-plan.txt#L9762). The earlier thiéré review and integration cover Senegalese millet couscous only. They explicitly keep thiakry separate and do not review sankhal.

Before drafting, I searched the proposal and batch archive, plan, roadmap, live reference catalog, forms, legacy candidates, and research ledger for `sankhal`, `sanxal`, `sankal`, `brisures de mil`, `sankhal de mil`, `millet semolina`, and `broken millet`. No earlier focused sankhal review, active identity, form, legacy candidate, or dedicated ledger record was found. Proposed ID `ingredient-ref-sankhal` and this proposal path were unused before drafting. The proposal-local source prefix `WP03-SANKHAL-20261012-` also had no prior occurrence.

## Product boundary and bilingual naming

The Association Sénégalaise de Normalisation (ASN) lists **Sanxal de mil — Spécifications**, NS 03-113 (2009), in its standards catalog. ASN's own post says that the standard concerns *semoule de mil*. A reproduced synopsis of the standard defines Sanxal as food-grade millet from the Souna and Sanio varieties, obtained after dehulling, crushing, and grading. That synopsis names *Pennisetum americanum*; Kew treats this botanical name as a synonym of *Cenchrus americanus*. The active catalog already has an intact-grain pearl-millet identity, but no processed product at this scope.

Current Québec product wording is more direct than a mechanical translation: Montréal seller Naboo labels its item *Brisures de mil (Sankhal)*, describes it as broken millet grains, and classifies it as a cereal. Its listing separately names *Couscous de mil (Thiéré)*, *Gruau de mil (Thiacri)*, *Granules de mil (Arraw)*, and *Farine de mil (Soungouf)*. The French display follows that Canadian label. The English display keeps the regional name and adds a short descriptive gloss; the gloss is not claimed as an official English standard name. OQLF lists generic *millet* and *mil* as terms for a group that can include multiple species; it does not establish a Québec term for Sankhal itself. A targeted OQLF/TERMIUM search for Sankhal/Sanxal returned no dedicated terminology entry.

| Proposed field or boundary | Recommendation | Evidence and limit |
| --- | --- | --- |
| ID | `ingredient-ref-sankhal` | Absent from the active references, legacy candidates, and ledger record IDs. |
| English display | `sankhal (broken millet semolina)` | Canadian English storefronts use the title `SANKHAL`; the English parenthetical translates the standardized *semoule de mil* product class descriptively. It is not an OQLF, TERMIUM, or English-language standards designation. |
| Québec French display | `brisures de mil (sankhal)` | Exact wording on a Montréal-area product page. The listing was marked out of stock when checked; that limits availability evidence, not the documented label wording. |
| English aliases | None | Keep the complete English product display as the search term; do not add generic `millet`, `broken millet`, or any other broader grain wording. |
| French aliases | `sanxal`; `sankhal de mil` | `Sanxal` is the ASN standard spelling; a Montréal delivery menu lists `Sankhal de mil mina`. Both remain scoped to this named product. |
| Category | `GRAIN_AND_CEREAL` | This is a grain-derived, human-food cereal product, not a flour or prepared dish. |
| Whole millet / pearl millet | Keep separate | Sankhal is a processed cereal product. Do not add it as an alias or form of intact millet or pearl millet. ASN's standard scope is pearl millet; the proposed identity captures the processed product, not another whole-grain species row. |
| Thiéré / millet couscous | Keep separate | ASN's standard catalog lists couscous de mil separately from Sanxal. Québec listings distinguish *Couscous de mil (Thiéré)* from *Brisures de mil (Sankhal)*. Do not add `couscous`, `millet couscous`, `couscous de mil`, or `thiéré`. |
| Thiakry / thiacri | Keep separate | Québec listings and Senegalese sources describe it as a distinct rolled or granulated millet product. Do not add `thiakry`, `thiacri`, `degue`, or `dégué`. |
| Arraw / araw | Keep separate | Retailers list arraw separately as a finer or rolled-grain product. Do not add `arraw`, `araw`, `arrow`, or `soungouf`. The current query `araw` returns caraway by substring fallback, so activating it would create a misleading collision. |
| Generic *semoule de mil* | Keep out of aliases | The phrase is broader in trade descriptions and may cover other millet semolina/granule products. The regional name plus the Québec display preserves Sankhal's narrower scope. |
| Flour and prepared dishes | Keep separate | Do not alias millet flour, soungouf, lakh, lakhou, ngourbane, or other prepared dishes. A recipe's use of Sankhal in a porridge or salad does not make the prepared dish the ingredient identity. |

The name `Sankhal` is not used consistently in all retailer metadata. One Canadian listing treats Sankhal, thiakri, arraw, and other names as interchangeable labels for a broad millet-granule product. A separate Montréal product listing and ASN's dedicated standard support the narrower broken/dehulled/calibrated product scope. Preserve that difference in the alias decision: accept only the product-specific display and sourced alternate spelling, and keep the neighboring names out of the alias arrays.

## Picker ownership and bundled recipe demand

The static projection uses the current `normalizeIngredientSearchKey` and phrase-first matcher in `IngredientSearch.kt`, across active reference names/aliases and form labels/match terms. It is not a live Android picker observation. I also checked exact normalized terms against legacy candidates and all ledger record IDs, then scanned every manifest-listed recipe file and ingredient row for the whole candidate/boundary phrase set.

| Query or surface | Current result | Projected result with the proposed row |
| --- | --- | --- |
| `sankhal`, `sanxal`, `brisures de mil`, `millet semolina`, `broken millet`, `sankhal de mil` | No active reference or form owner; no legacy owner or dedicated ledger record | Each returns only `ingredient-ref-sankhal`; `sanxal` and `sankhal de mil` depend on the proposed French aliases. |
| `semoule de mil` | No exact active owner | Remains unassigned; do not add the broad phrase as an alias. |
| `couscous`, `couscous de mil`, `millet couscous`, `thiéré` | `couscous` returns generic couscous, thiéré, and pearl couscous; the qualified millet-couscous phrases return thiéré only | Unchanged. Sankhal is not returned for couscous queries. |
| `thiakry`, `thiacry`, `arraw` | No active match | No match; keep the adjacent product identities separate. |
| `araw` | `ingredient-ref-caraway-seeds` through substring fallback | Unchanged; do not store `araw` as a sankhal alias. |
| `millet` | 15 qualified and generic millet rows, including thiéré, millet flour/flakes, puffed millet, and species-specific rows | 16 rows; the additional result is the proposed qualified Sankhal identity. Do not add bare `millet` as an alias. |
| `mil` | `ingredient-ref-millet-couscous-thiere` and `ingredient-ref-pearl-millet-flour` | Those two plus Sankhal, because the French display contains `mil`. Keep `mil` out of aliases. |
| Forms and legacy candidates | 98 forms and 64 legacy candidates; no exact candidate-term owner | No forms or legacy identity proposed. |
| Research ledger | 1,633 records; no Sankhal/Sanxal/Sankal candidate or identity record | If accepted, create a new reference record; do not alter the existing millet or thiéré records. |
| Full bundled recipe corpus | 114 manifest-listed recipes and 1,123 ingredient rows; zero normalized whole-phrase hits for the candidate and boundary terms below | No recipe links or recipe-line behavior are justified. |

The full-recipe audit searched all string fields in all 114 recipe files, not only ingredient names. Terms included `sankhal`, `sanxal`, `sankal`, `brisures de mil`, `brisure de mil`, `grains de mil brisés`, `semoule de mil`, `millet semolina`, `broken millet`, `broken millet grains`, `sankhal de mil`, `sanxal de mil`, `thiéré`, `thiakry`, `thiacry`, `arraw`, `araw`, and `soungouf`. Results were **0 / 114 recipe files** and **0 / 1,123 ingredient rows**. External source recipes show culinary use but are not bundled demand.

At integration, use a verified `ingredient_reference` ledger record for `ingredient-ref-sankhal`, with the two research states above and no active forms or conversion data. The proposed `measurementObservations` are exactly:

| Observation ID | Source | Bounded observation to retain | Explicit exclusions |
| --- | --- | --- | --- |
| `sankhal-tabouleh-senegal-local-recipes-400g-20261012` | S05 | `portion_weight`, `published_portion`: 400 g Sankhal (`Brisures de mil (Sankhal)`) for the complete 4–6-serving Tabouleh Sankhal recipe; soak 15 minutes, then steam 25–30 minutes. | Not 400 g per person; do not derive a per-serving range, cup measure, density, or cooked yield. The method belongs to this recipe. |
| `sankhal-lakh-unfcs-recipe-300g-20261012` | S11 | `portion_weight`, `published_portion`: 300 g Sankhal for the complete four-serving lakh recipe, with 1.5 L water and approximately 30 minutes of cooking. | Do not divide to make an individual portion, use the water as a generic ratio or conversion, or infer a density, household measure, or cooking yield. The amount and method belong to this recipe. |

For each observation set `value` and `observedMassG` to 400 or 300, `valueUnit` to `g`, and `sourceQuantity` to the same stated gram amount. Use the exact recipe name and Sankhal wording in `foodDescription`; describe Sankhal as listed before preparation and note that the source does not specify moisture or precooking state. Put the source method and serving count into `measurementMethod` and `quantityBasis`. These are bounded `portion_weight` observations only; they do not support an active measurement value. The ledger's `substitutionResearchState` should be `researched_no_supported_substitute`, with no active rule. If a `substitutionFindings` record is included, use `findingId: sankhal-general-cereal-replacement-review-20261012`, `researchState: researched_no_supported_substitute`, no replacements, and rejected candidates `couscous` and `rice` sourced only to S12; S12 gives a preparation analogy, not a supported replacement rule. The recipes use Sankhal in their own dishes; they do not claim it replaces another ingredient. Keep the full source register S01–S12 below attached to the record if accepted.

## Measures, forms, and substitutions

| Data area | Recommendation | Evidence and limit |
| --- | --- | --- |
| Forms | Add none | Sankhal names the processed-grain product. Preparation can be boiling for lakh or steaming for a savory side/salad. Do not generalize these prepared states into a universal form without demand. |
| Default measure, density, and unit mappings | Leave unset | Montréal's 600 g product package and the Canadian English seller's 500 g / 1 kg package options are SKU/package amounts, not household measures. No reviewed source gives a volume-to-mass basis, packing method, or transferable density. Existing millet, pearl-millet, flour, puffed-millet, and thiéré rows have null density and empty unit mappings. |
| Recipe quantities | Keep two source-specific observations only | S05 lists 400 g of Sankhal for its 4–6-person Tabouleh Sankhal; soak for 15 minutes, then steam for 25–30 minutes. S11 lists 300 g for four servings of lakh, with 1.5 L water and about 30 minutes of cooking. Preserve those whole-recipe amounts and their dish, serving, and method context. Do not divide into a per-person amount, combine the recipes, treat the lakh water amount as a Sankhal conversion, or infer a household measure, density, or cooking yield. |
| Proposed ledger research states | `measurementState: researched_no_supported_value`; `substitutionResearchState: researched_no_supported_substitute` | The two recipe masses are source-specific whole-batch ingredient amounts, not transferable measures. The reviewed sources contain no supported, quantity-qualified and dish-scoped replacement rule. Keep observations in the ledger as bounded evidence if the identity record is accepted; activate no measure or substitution behavior. |
| Substitution | Record `researched_no_supported_substitute`; add no rule | S12 says Sankhal may be prepared “comme du couscous ou du riz,” but provides no tested formula, quantity ratio, matched product state, or dish-specific context. Naboo describes steamed Sankhal served with mafé but does not identify a displaced ingredient or ratio. Treat these as culinary-use statements, not supported replacement rules; do not infer a general replacement for couscous, rice, millet flour, or other grain products. |
| Recipe links / yield | Add none | The bundled corpus has no Sankhal demand. Package weights and external recipe amounts are not yields. |

## Live package snapshot before proposed integration

Read-only snapshot taken on 2026-10-12. Hashes are SHA-256 of exact file bytes. The recipe-corpus hash is SHA-256 over each manifest-ordered relative path, NUL, raw recipe bytes, NUL.

| Surface | Live count | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1,325 total; 140 `GRAIN_AND_CEREAL` | `00bcf8c578cb3c217a4c60238df09546f4625c8f54f8597f9280a432fd37c517` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import identities | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,633 records; 6,048 source entries; 5,064 distinct source IDs; 8 unit conversions | `8190032d7a9b91a9509486c5e8240e269da6d6187ff66a750ec4a0d2152d5864` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated ingredient catalog | 1,325 references; 580,828 bytes | `b18c59cf6f5dcc186e644abaa468b18d34be623807893e1ff9544a24aae6967a` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The active-reference JSON is `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`. The source prefix and candidate ID were checked against the snapshot and archive before drafting. These are live pre-integration values; the proposal does not update them.

## Proposal-local source register

Sources were checked on 2026-10-12. The source IDs below are unique to this packet and were absent from the live ledger and proposal archive before drafting.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-SANKHAL-20261012-S01` | Association Sénégalaise de Normalisation (ASN), [Sanxal de mil — Spécifications, NS 03-113](https://www.asn.sn/fr/normes?page=172); see also the [ASN 2023 standards catalog](https://www.asn.sn/sites/default/files/ASN%20CATALOGUE%202023%20vf_0.pdf). | The ASN catalog lists the dedicated Sanxal de mil standard, NS 03-113 (2009). The catalog establishes the standard's name and scope title, not a recipe measure or package composition. |
| `WP03-SANKHAL-20261012-S02` | ASN, [official post on the NS 03-113 Sanxal/Sankhal standard](https://fr.linkedin.com/posts/asn-associationsenegalaisedenormalisation_cher-abonn%C3%A9s-tout-comme-le-thiakry-il-existe-activity-7029139287455453184-tUHj). | The standards body says NS 03-113 concerns the specifications for *semoule de mil* and records the `Sanxal / Sankhal` spelling family. It is an ASN social post, not the complete standard. |
| `WP03-SANKHAL-20261012-S03` | République du Sénégal, [Répertoire des normes dans le domaine agroalimentaire](https://senegalcommerce.sec.gouv.sn/Documents/ASN/Publications/R%C3%A9pertoire%20des%20Normes%20dans%20le%20Domaine%20Agroalimentaire.PDF), p. 83. | The government-hosted synopsis defines Sanxal as human-food millet semolina made after dehulling, crushing, and grading; it identifies *Pennisetum americanum* and Senegalese Souna/Sanio varieties. This is a reproduced 2009 standard synopsis, not the full standard text. |
| `WP03-SANKHAL-20261012-S04` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Pennisetum americanum*](https://powo.science.kew.org/taxon/77244975-1). | Kew treats *Pennisetum americanum* as a synonym of *Cenchrus americanus*. This verifies the name relationship; the proposed catalog row remains a processed product, not a new species identity. |
| `WP03-SANKHAL-20261012-S05` | République du Sénégal, [Livret de recettes à base de produits locaux](https://informationsanitaire.sec.gouv.sn/dataset/981433b2-f6fd-44d9-8cb4-a29bc57e6f21/resource/f4b05ce3-89dd-4e56-b6a6-280ab9adce3a/download/livret-de-recettes-a-base-de-produits-locaux.pdf), p. 27, Tabouleh Sankhal. | The government-hosted booklet names `Brisures de mil (Sankhal)`, gives 400 g for 4–6 people, and says to soak for 15 minutes and steam for 25–30 minutes. This is one recipe's amount and preparation, not a general serving, density, unit mapping, yield, or universal process. Browser PDF text extraction confirmed the recipe; direct page retrieval was unavailable. |
| `WP03-SANKHAL-20261012-S06` | Naboo, Montréal, Québec, [Brisures de mil (Sankhal), 600 g](https://naboolaboutique.ca/product/brisures-de-mil-sankhal-600g/), product title, description, and adjacent product list. | Uses the exact proposed French display, describes broken millet grains, and separates thiéré, thiacri, arraw, and millet flour. The page showed the product as out of stock; 600 g is product-package mass only. |
| `WP03-SANKHAL-20261012-S07` | Aliments Akagni Inc., Montréal listing via [Uber Eats](https://www.ubereats.com/ca/store/les-aliments-akagni-inc/aK1m1Zp2WXWo5PsDuUP5GQ?diningMode=PICKUP), menu item `Sankhal de mil mina`. | Supports Québec-facing French use of `Sankhal de mil`; the menu separately lists `Couscous de mil thiéré`. This is marketplace menu wording and provides no process, ingredient, or measurement specification. |
| `WP03-SANKHAL-20261012-S08` | Les Aliments MAKEDA, [English product page for SANKHAL](https://www.makedasnfood.com/en/products/sankhal). | A Canadian seller's English-language product page uses the title `SANKHAL` and offers package options. Its generic health claims and package sizes do not establish product composition, household measure, density, or a cooking rule. |
| `WP03-SANKHAL-20261012-S09` | Distribution LovAf, [Granulé de mil / Arraw / Thiakri / Sankhal / Millet](https://distributionlovaf.ca/products/semoule-de-mil). | Canadian retailer metadata groups Sankhal with Arraw, Thiakri, and other names. This documents inconsistent seller terminology; it is not treated as proof those products are equivalent. |
| `WP03-SANKHAL-20261012-S10` | Office québécois de la langue française, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet). | Gives preferred French terms `millet`, `mil`, and `petit mil`, and notes that generic millet can group several species. It supports keeping bare `mil`/`millet` out of the Sankhal alias set; it does not define Sankhal. |
| `WP03-SANKHAL-20261012-S11` | Union Nationale des Femmes Coopératrices du Sénégal, [traditional recipes](https://unfcs.wordpress.com/recettes/), Lakh. | Identifies Sankhal as crushed millet and gives 300 g for a four-person porridge. This is an organization-published recipe, not a transferable portion or volume conversion. |
| `WP03-SANKHAL-20261012-S12` | Seneafood, [Sankhal de Mil Sénégal 400G](https://seneafood.com/produit/sankhal-de-mil-senegal-400g/), product description and usage. | Describes Sankhal as semolina made from crushed and graded millet and says it may be prepared “comme du couscous ou du riz.” It gives no quantity ratio, matched recipe, or test behind that broad suggestion; retain it as retail usage, not a validated substitution. This non-Canadian package is 400 g, not a household measure. |

Pre-integration audit on 2026-10-12: the 12 source IDs were absent from the live ledger and the source prefix was unused outside this proposal. The candidate ID was absent from active references, legacy candidates, and ledger records. During integration, each source ID was added once to the new ledger record and the candidate ID was added to the active reference and ledger. UTF-8/no-BOM, newline, and scoped whitespace checks passed. No app, unit, instrumentation, or emulator tests were run during the proposal-only review.

## Decision

Integrated a separate identity-only Sankhal product row with the bilingual names and two French aliases above. Keep the standard's processed-grain scope distinct from intact pearl millet, millet flour, thiéré, thiakry, arraw, and prepared dishes. Record the two source-specific recipe masses only as bounded ledger evidence; add no active measurement, density, unit mapping, form, cooking yield, recipe link, conversion, or substitution. Section F remains open.


## Integration record

Integrated `ingredient-ref-sankhal` in the active references and research ledger. The reference has no English aliases, forms, active measure, density, or unit mappings. The ledger carries all twelve sources, the two recipe-specific mass observations, the accepted identity decision, and a no-supported-substitute finding that rejects couscous and rice based on S12's preparation analogy. No bundled recipe was linked. Static package, catalog generation, ledger schema, reference normalization, UTF-8/no-BOM, and whitespace checks passed; no app tests were run because the change only adds database JSON data. See the batch record at `docs/catalog/batches/wp03-section-f-sankhal-identity-integration-20261012/README.md`.
