# WP03 Section K — moringa flowers identity review (R1029)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic reference for **moringa flowers / fleurs de moringa**, scoped to the culinary flowers of *Moringa oleifera* Lam.
- **Plan anchors:** Section K asks to continue reviewing documented edible flowers without creating a generic `edible flowers` identity or extending a species-specific claim across a genus ([open item, line 6687](../../RecipeBook-global-ingredient-catalog-plan.txt#L6687)). The existing leaf-part boundary is at [line 6631](../../RecipeBook-global-ingredient-catalog-plan.txt#L6631); the moringa-pods integration is recorded at [line 24069](../../RecipeBook-global-ingredient-catalog-plan.txt#L24069).
- **Scope:** Generic culinary plant-part diversity across categories. No brand, product-line, flavour-family, SKU, or retailer-variant roster is part of this review.
- **Mutation scope:** Proposal only. This Markdown file is the only proposed change; shared catalog references, forms, ledger, recipes, plan, roadmap, and other files remain unchanged.

## Recommendation and identity boundary

Add `ingredient-ref-moringa-flowers` for the flowers of *Moringa oleifera* Lam. The OQLF's Québec entry recognizes `moringa`, lists *M. oleifera* and *M. pterygosperma*, and says the flowers are consumed. Kew accepts *M. oleifera* and includes *M. pterygosperma* in its synonym data; its cited *Flora of the Cayman Islands* states that the flowers can be cooked as a vegetable. Tamil Nadu Agricultural University's moringa treatise has a separate flower-preparation section describing cooked, fried, battered, and steamed uses. These sources support one species-bounded culinary part, not an edible-flower claim for the entire *Moringa* genus. [Existing OQLF source; S01–S02]

Use the bilingual display **moringa flowers / fleurs de moringa**. OQLF supports `moringa` as a French noun in Québec; the French compound is part-qualified and appears in a French-language edible-flower guide from the Pacific Community. Treat the compound as a clear descriptive name, not as a separate OQLF-standardized term. Leave both alias arrays empty: do not assign whole-plant terms such as `moringa`, `ben ailé`, `moringa ailé`, `drumstick tree`, or `horseradish tree`, and do not expose the botanical name as a picker alias.

The identity covers only flowers used as food from *M. oleifera*. The sources do not define whether the culinary portion includes the flower stalk, buds, or particular floral structures, so do not narrow it to petals or encode an unverified trimming boundary. Keep the existing moringa-leaves and moringa-pods identities separate. Do not extend the claim to other *Moringa* species, leaves, shoots, pods, seeds, seed oil, roots, bark, leaf powder, extracts, supplements, or unqualified whole-plant products. The synonym *M. pterygosperma* is taxonomic context for *M. oleifera*, not an additional culinary species claim. [Existing OQLF source; S02]

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-moringa-flowers` |
| nameEn | `moringa flowers` |
| nameFr | `fleurs de moringa` |
| aliasesEn / aliasesFr | `[]` / `[]` |
| defaultDensity | `null` |
| unitMappings | `[]` |
| category | `VEGETABLE_AND_AROMATIC` |
| updatedAt | `2026-10-19T00:00:00Z` |

Propose no form, measure, recipe link, conversion, yield, package yield, or active substitution. If integrated, create an `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; add no measurement observations or substitution findings. Reuse the existing OQLF source entry and add only flower-scoped source entries for the other cited pages.

## Current ownership and demand audit

The live snapshot contains **2,038 active ingredient references**, **205 forms**, **55 legacy candidates**, and **2,443 research-ledger records / 11,428 source entries**. The manifest lists **114 recipes** with **1,123 structured ingredient rows**. Candidate ID `ingredient-ref-moringa-flowers` and source-ID prefix `WP03-K-MORINGA-FLOWERS-R1029-20261019` have no current owner.

| Surface | Current finding | Proposal effect |
|---|---|---|
| Active references | The only moringa references are `ingredient-ref-moringa-leaves` (`moringa leaves / feuilles de moringa`; English aliases `malunggay leaves`, `balunggay leaves`, `kalamungay leaves`) and `ingredient-ref-moringa-pods` (`moringa pods / gousses de moringa`; no aliases). | Add one flower-only identity. Preserve both existing rows and aliases. |
| Active forms | No form is attached to either moringa reference; no flower form or flower match term exists. | Add no form or preparation-state matching terms. |
| Legacy candidates | None of the 55 candidates matches the proposed flower identity or ID. | Do not revive, merge, or rewrite a legacy candidate. |
| Research ledger | There is no flower-specific record. The leaves record is `verified / researched_no_supported_value / researched_no_supported_substitute`; the pods record is `verified / not_yet_researched / not_yet_researched`. Existing OQLF source `WP03-RESIDUAL-LEAFY-20261010-S14` is shared by those two records and already covers Québec naming and consumed plant parts. Kew's URL also occurs on the pods record under its existing pod-focused locator. | Reuse OQLF source S14 unchanged. If integrated, give Kew a separate flower-scoped source entry; leave both existing records, source descriptions, and decisions intact. |
| Bundled recipes | All 114 manifest-listed recipe files and 1,123 ingredient rows were searched for moringa, flower-qualified moringa terms, and drumstick wording. There are **0 matching recipe files and 0 matching rows**. | No recipe link, amount, or recipe-based form is proposed. |

## Forms, numeric evidence, and substitution limits

Tamil Nadu Agricultural University's treatise mentions fresh or dried flowers in tea and food-additive contexts and describes cooked and steamed uses. Those statements do not define a catalog form, fresh-to-dried conversion, or preparation boundary, so no forms are proposed. Its two cups of fresh leaves to one cup of water belongs to a moringa-leaf sauce; its 5 cm pod sections belong to a pod dish. Neither amount transfers to flowers. The reviewed sources provide no flower-specific household portion, mass, volume, cup-packing basis, density, edible yield, or reusable conversion. [S01]

The TNAU statement that flowers “can be mixed with any leaf recipes” does not identify a recipe line, replacement ingredient, direction, ratio, or dish role. Treat it as a broad use description, not a substitution rule. No reviewed source supports a global flower-to-leaf replacement or a scoped contextual substitution. Keep all substitution behavior inactive.

## Sources

Sources were reviewed on 2026-10-19. IDs below are proposal-local and have not been added to the shared ledger. The existing OQLF source is reused under its current ID without changing its record.

| ID | Source | What it supports; limits |
|---|---|---|
| Existing `WP03-RESIDUAL-LEAFY-20261010-S14` | Office québécois de la langue française, [moringa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17019213/moringa) | Supports Québec French `moringa`, identifies *M. oleifera* and *M. pterygosperma*, and lists flowers among consumed parts. It does not standardize a separate flower term or provide a culinary measure. `sourceKind: regional_authority`. |
| `WP03-K-MORINGA-FLOWERS-R1029-20261019-S01` | Tamil Nadu Agricultural University, Horticultural College and Research Institute, [*Advances in Production of Moringa*](https://agritech.tnau.ac.in/horticulture/pdf/Moringa%20English%20book.pdf), §17.3 “Preparations from flowers,” printed p. 115 | Describes flowers as food and mentions cooked, fried, battered, steamed, and salad uses. It also says flowers may be mixed with leaf recipes; that line is not a quantified substitution. Leaf and pod quantities elsewhere in the book remain scoped to those parts. `sourceKind: extension`. |
| `WP03-K-MORINGA-FLOWERS-R1029-20261019-S02` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Moringa oleifera*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:584736-1/general-information) | Confirms *M. oleifera* as accepted and includes *M. pterygosperma* synonym data; the cited *Flora of the Cayman Islands* says flowers can be cooked as a vegetable. The food-use statement remains attributed to that flora. Kew's URL is already cited on the moringa-pods record, but its current locator/support text is pod-scoped; preserve it and use a separate flower-scoped entry if integrated. `sourceKind: other`. |
| `WP03-K-MORINGA-FLOWERS-R1029-20261019-S03` | Communauté du Pacifique, [*De la couleur dans nos assiettes ! Pour être en bonne santé, mangeons coloré*](https://www.service-public.pf/dsp/wp-content/uploads/sites/12/2023/04/De-la-couleur-dans-nos-assiettes.pdf), PDF p. 15 (printed p. 30), 2022 | Lists `fleurs de moringa` among edible flowers, supporting the descriptive French compound. The list does not give a botanical name for this item and does not establish Québec standardization, a measure, or preparation specifics; species scope comes from the other sources. `sourceKind: other`. |

No brand, product-line, flavour, SKU, or retailer roster was pursued. A commercial page appeared incidentally in broad term discovery and was excluded; no product, claim, or package data from it are used here. No roster-only item is part of the selected Section K task. If a queued item only requests commercial variants, record it out of scope because commercial-product counts do not add ingredient diversity, then stop pursuing it. Preserve existing branded entries and all product-scoped evidence.

## Disposition

Recommend one identity-only **moringa flowers / fleurs de moringa** reference in `VEGETABLE_AND_AROMATIC`, limited to the culinary flowers of *M. oleifera*. Keep it distinct from moringa leaves, moringa pods, other plant parts, and other *Moringa* species. Add no aliases, forms, measures, recipe links, conversions, yields, or substitutions. Preserve all current catalog rows and evidence.

## Link and encoding checks

- The Section K plan links resolve to the stated edible-flower and moringa boundaries.
- The OQLF, TNAU, Kew, and Pacific Community sources were opened during this review.
- This file is UTF-8 without BOM and ends with a newline. No tests or builds were run because the task is proposal-only.
