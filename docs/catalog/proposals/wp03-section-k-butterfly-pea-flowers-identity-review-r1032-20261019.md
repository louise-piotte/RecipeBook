# WP03 Section K — butterfly pea flowers identity review (R1032)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic reference for **butterfly pea flowers / fleurs de pois bleus**, scoped to the culinary flowers of *Clitoria ternatea* L.
- **Plan anchor:** Section K remains open to documented edible flowers, while excluding a generic `edible flowers` identity and genus-wide edible-part claims ([open item, line 6688](../../RecipeBook-global-ingredient-catalog-plan.txt#L6688)). The moringa-flower addition at line 6690 is already integrated; this review covers a separate species and part.
- **Scope:** Generic culinary plant-part diversity. No brand, product-line, flavour-family, SKU, or retailer-variant research is part of this review.
- **Mutation scope:** Proposal only. This Markdown file is the only proposed change; shared catalog references, forms, ledger, recipes, plan, roadmap, and generated files remain unchanged.

## Recommendation and identity boundary

Add `ingredient-ref-butterfly-pea-flowers` for the flowers of *Clitoria ternatea* L. Kew accepts *C. ternatea* as a species. Singapore Botanic Gardens' horticulture feature pairs the common name Butterfly Pea with *C. ternatea*, calls its flowers edible, and describes food uses including salads, cakes, desserts, and beverages. UF/IFAS likewise identifies Butterfly Pea as *C. ternatea* and discusses its flowers in tea and food-coloring use. These sources support a culinary flower identity for this species, not for the entire *Clitoria* genus or for other flowers in the pea family. [S01–S03]

Use **butterfly pea flowers / fleurs de pois bleus** as the bilingual display. The French-language Pacific Community guide lists `fleurs de pois bleus (clitoria)` among edible flowers, supporting the descriptive compound; it does not identify the species in that list or establish a Québec-standardized name. Kew, NParks, and UF/IFAS provide the species boundary. Leave both alias arrays empty. Do not assign bare `pea`, `blue pea`, `clitoria`, `butterfly pea`, local-language names, or the botanical name as picker aliases; they either omit the part or need a separate naming review.

Limit the identity to the flowers of *C. ternatea* used as food. The sources describe whole flowers, petals, and flower extracts in different contexts; treat petal extraction as source-specific preparation, not a separate identity or active form. Do not extend the row to other *Clitoria* species, leaves, young shoots, pods, seeds, roots, dyes sold as products, or non-food extracts. The sources note that flower color varies; color and pigment behavior are not separate ingredient identities, and the blue-dye findings below should not be generalized to every color form.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-butterfly-pea-flowers` |
| nameEn | `butterfly pea flowers` |
| nameFr | `fleurs de pois bleus` |
| aliasesEn / aliasesFr | `[]` / `[]` |
| defaultDensity | `null` |
| unitMappings | `[]` |
| category | `VEGETABLE_AND_AROMATIC` |
| updatedAt | `2026-10-19T00:00:00Z` |

Propose no form, recipe link, reusable measure, conversion, yield, package yield, or active substitution. If integrated, create an `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Any retained amounts belong only to the cited tea, dye-extraction, or rice-study contexts; they must not become generic measures or mappings.

## Current ownership and demand audit

The live snapshot contains **2,041 active ingredient references**, **205 forms**, **55 legacy candidates**, and **2,446 research-ledger records / 11,440 source entries**. The manifest lists **114 recipe files** with **1,123 structured ingredient rows**. Candidate ID `ingredient-ref-butterfly-pea-flowers` has no active owner, and none of the proposal's R1032 source IDs is present in the live ledger.

| Surface | Current finding | Proposal effect |
|---|---|---|
| Active references | No reference owns `butterfly pea`, `blue pea`, `Clitoria ternatea`, `clitoria`, or `fleurs de pois bleus`. Other flower identities, including tawny daylily buds and moringa flowers, are separately named and scoped. | Add one distinct flower identity; preserve every existing row. |
| Active forms | No matching form ID, label, or match term exists. | Add no flower, dried-flower, extract, or tea form. |
| Legacy candidates | None of the 55 candidates matches the proposed terms or taxon. | Do not revive or merge a legacy candidate. |
| Research ledger | No *C. ternatea* or butterfly-pea record exists. The Pacific Community PDF URL is already cited on `ingredient-ref-moringa-flowers` as `WP03-K-MORINGA-FLOWERS-R1029-20261019-S03` for its separate `fleurs de moringa` locator and claim. Kew, UF/IFAS, NParks, and PubMed URLs below have no ledger owner. | Leave the moringa record and source unchanged. If integrated, add a separate Pacific Community source entry for the blue-violet flower list and new entries for the other sources. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were searched for the proposed English/French names, `Clitoria ternatea`, `clitoria`, and `blue pea` variants. There are **0 matching files and 0 matching rows**. | No recipe link, amount, or recipe-derived form is proposed. |

## Forms, numeric evidence, and substitution limits

UF/IFAS describes fresh flowers in salads and a tea recipe using **¼ cup dried flowers per 1–2 cups water**, steeped for up to **8 minutes**. Its dye instructions use **1 g flowers per 20 mL solvent**, heat the extract to a maximum of **170°F**, and steep for **60 minutes**. These are separate tea and dye preparation amounts, not interchangeable quantities, an ingredient density, a reusable conversion, yield, or general serving guidance. [S02]

The peer-reviewed rice study tested dried petal extracts at **0.2%, 0.4%, 0.6%, and 0.8% w/v** in one blue-rice protocol and reported **0.6%** as suitable in its consumer evaluation. Those concentrations are specific to its prepared extract and rice method. They do not establish a flower-to-rice ratio, household measure, general colorant dose, or substitution amount. [S04]

No source provides a reusable fresh-to-dried conversion, flower count-to-mass conversion, density, or edible yield. Do not turn any of these amounts into reference unit mappings. If the details are retained in a ledger, keep each observation attached to its exact tea, dye, or rice-study method.

NParks describes butterfly-pea dye as a substitute for red-cabbage dye in an acid-base learning activity. That is a demonstration-material substitution, not a food-ingredient replacement. No reviewed source supports replacing another flower or ingredient in a recipe. Keep global and contextual substitution behavior inactive.

## Sources

Sources were reviewed on 2026-10-19. IDs below are proposal-local and have not been added to the shared ledger.

| ID | Source | What it supports; limits |
|---|---|---|
| `WP03-K-BUTTERFLY-PEA-FLOWERS-R1032-20261019-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Clitoria ternatea*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:486606-1) | Confirms the accepted species and taxonomic boundary. Kew's general food-use tag does not by itself establish which plant part is eaten or a cooking method. `sourceKind: other`. |
| `WP03-K-BUTTERFLY-PEA-FLOWERS-R1032-20261019-S02` | University of Florida IFAS Extension, [Butterfly Pea](https://gardeningsolutions.ifas.ufl.edu/plants/ornamentals/butterfly-pea/) | Directly pairs Butterfly Pea with *C. ternatea*, describes flower edibility and tea/dye use, and gives separate tea and dye procedures. Keep its quantities and temperature scoped to those procedures. It discusses leaves, shoots, and pods too; those parts are excluded from this proposal. `sourceKind: extension`. |
| `WP03-K-BUTTERFLY-PEA-FLOWERS-R1032-20261019-S03` | Singapore Botanic Gardens, NParks, [“Appreciating the colours of the Butterfly Pea’s flowers,” *Gardenwise*, vol. 53 (August 2019), pp. 34–35](https://www.nparks.gov.sg/sbg/research/publications/-/media/sbg/gardenwise/gw_pdf_2010-2019/gw_2019_vol_53_%28aug%29.pdf) | Names *Clitoria ternatea*, calls its flowers edible, and describes fresh-flower salad/cake uses and regional food-coloring uses. Color and pigment statements remain specific to the described flower forms; no general measure or recipe substitution follows. `sourceKind: other`. |
| `WP03-K-BUTTERFLY-PEA-FLOWERS-R1032-20261019-S04` | Maneechot et al., [“A natural blue colorant from butterfly pea (*Clitoria ternatea*) petals for traditional rice cooking,” *Journal of Food Science and Technology* 60(8), 2255–2264 (2023)](https://pubmed.ncbi.nlm.nih.gov/37273557/) | Primary study of dried-petal extracts in a rice-coloring protocol. The 0.2–0.8% w/v levels and 0.6% sensory result belong to this extract and method; they are not generic ingredient measures. `sourceKind: other`. |
| `WP03-K-BUTTERFLY-PEA-FLOWERS-R1032-20261019-S05` | Communauté du Pacifique, [*De la couleur dans nos assiettes ! Pour être en bonne santé, mangeons coloré*](https://www.service-public.pf/dsp/wp-content/uploads/sites/12/2023/04/De-la-couleur-dans-nos-assiettes.pdf), p. 29 (2022) | Lists `fleurs de pois bleus (clitoria)` among edible flowers, supporting the descriptive French compound. It does not specify *C. ternatea* in that list or establish a Québec-standardized term; use it only for the French wording and general edible-flower context. `sourceKind: other`. The same PDF URL is already used by the moringa-flowers ledger record for a different locator and claim; leave that record unchanged. |

No brand, product-line, flavour, SKU, or retailer-variant research was conducted. No roster-only queue item is part of the selected Section K task. If a queued item only requests commercial variants, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop pursuing it. Preserve existing branded entries and all product-scoped evidence.

## Disposition

Recommend one identity-only **butterfly pea flowers / fleurs de pois bleus** reference in `VEGETABLE_AND_AROMATIC`, limited to the flowers of *C. ternatea*. Keep it separate from other *Clitoria* species, leaves, shoots, pods, seeds, extracts, and unrelated edible flowers. Add no aliases, forms, measures, recipe links, conversions, yields, or substitutions. Preserve all current catalog rows and evidence.

## Link and encoding checks

- The Section K plan link resolves to the open edible-flower item at line 6688.
- Kew, UF/IFAS, NParks, the peer-reviewed study, and the Pacific Community guide were opened during this review.
- This file is UTF-8 without BOM and ends with a newline. No tests or builds were run because the task is proposal-only.
