# WP03 Section K — moringa pods identity review (R1023)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic reference for **moringa pods / gousses de moringa**, scoped to the culinary pods of *Moringa oleifera* Lam.
- **Plan anchor:** Section K's other regional greens and shoots sweep remains open; the existing moringa-leaves entry explicitly keeps pods distinct ([plan, Section K, open regional greens/shoots item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6721); [existing moringa-leaves boundary](../../RecipeBook-global-ingredient-catalog-plan.txt#L6631)).
- **Scope:** Generic plant-part diversity. Ramps (R1021) and Blewitt mushroom (R1019) are recent, separate reviews; this proposal concerns neither. No brand, product line, flavour family, SKU, or retailer-specific variant was researched.
- **Mutation scope:** This proposal creates only this Markdown file. It does not edit the shared catalog, ledger, plan, roadmap, recipes, or other files.

## Recommendation and identity boundary

Add `ingredient-ref-moringa-pods` for the culinary pods of *Moringa oleifera*. FAO AGRIS' record for a 2017 horticultural paper says young, tender pods called “drumsticks” are valued as a vegetable in Asia. The University of Hawai‘i at Mānoa Pacific Food Guide identifies the drumstick tree as *M. oleifera*, describes its immature tender pods, and says pods can be cooked as a vegetable. Kew's Plants of the World Online accepts *M. oleifera* and records young pods among plant parts used as vegetables. The existing OQLF moringa entry independently supports the Québec plant name and the part-specific separation. [S01–S04]

Use **moringa pods / gousses de moringa** as the bilingual display. The French compound is a clear descriptive plant-part name, not a claim that OQLF standardized a separate pod term. Leave aliases empty: the botanical and culinary sources support the proposed qualified names, while bare `drumstick` collides with chicken drumsticks and `drumstick tree` denotes the plant. Do not expose botanical names as picker aliases.

The identity is limited to pods used as food, not all moringa plant parts or products. Keep the existing moringa-leaves reference unchanged. Do not absorb moringa leaves, shoots, flowers, roots, bark, seeds, seed oil, leaf powder, extracts, supplements, or products described only as “moringa.” Do not encode a maturity threshold or preparation default: sources discuss young/tender or immature pods but do not define a reusable culinary cutoff. The review makes no safety, therapeutic, nutritional, or availability claim.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| id | `ingredient-ref-moringa-pods` |
| nameEn | `moringa pods` |
| nameFr | `gousses de moringa` |
| aliasesEn / aliasesFr | `[]` / `[]` |
| defaultDensity | `null` |
| unitMappings | `[]` |
| category | `VEGETABLE_AND_AROMATIC` |
| updatedAt | `2026-10-19T00:00:00Z` |

No form, measure, recipe link, conversion, yield, package yield, or active substitution is proposed. If accepted, create an `ingredient_reference` ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, supported by the new pod-specific sources below and the existing OQLF source ID. No measurement observation or substitution finding is proposed.

## Normalized ownership audit

The inspected live snapshot contains **2,033 active references**, **205 forms**, **55 legacy candidates**, and **2,438 research-ledger records** with **11,408 source entries**. The split seed manifest lists **114 recipe files** and the current bundled recipes contain **1,123 structured ingredient rows**. A root recount confirmed the legacy-candidate total against the source file's `candidateCount` and all 55 candidate records.

I checked normalized candidate phrases using case-folding, Unicode NFKD, common-ligature folding (`œ`/`æ`/`ß`), diacritic removal, punctuation-to-space conversion, and whitespace collapse. The phrase set included `moringa pod(s)`, `gousse(s) de moringa`, `drumstick pod(s)`, `malunggay pod(s)`, `Moringa oleifera`, and the proposed ID. The audit covered active reference IDs, displays and aliases; form IDs, labels and match terms; legacy candidate fields; ledger records, decisions and source text; and manifest-listed recipe JSON.

| Surface | Result and ownership boundary |
|---|---|
| Active references | No active reference owns moringa pods. `ingredient-ref-moringa-leaves` is the sole exact moringa reference; its displays and aliases are leaf-qualified (`moringa leaves / feuilles de moringa`, `malunggay leaves`, `balunggay leaves`, `kalamungay leaves`). Preserve it unchanged. |
| Forms | No moringa-pod form or match term exists. No pod state or preparation form is proposed. |
| Legacy candidates | None of the 4 legacy candidates matches a moringa pod phrase, the proposed ID, or *M. oleifera*. |
| Ledger | No pod-specific record exists. `ingredient-ref-moringa-leaves` has an existing decision that names pods among the separate parts excluded from the leaf identity; its current sources and decision remain owned by that record. The generic word `drumstick` also appears in `ingredient-ref-chicken-thigh` context, where it denotes poultry; that is an unrelated phrase hit and is a reason to omit it as an alias. |
| Source ownership | Reuse the existing OQLF moringa entry, source ID `WP03-RESIDUAL-LEAFY-20261010-S14`, already owned by `ingredient-ref-moringa-leaves`; do not duplicate its URL/source entry. The proposed new source IDs below were not found in the live ledger. |

The exact qualified names should identify the proposed pod row without changing the existing leaf identity. Broad searches for `moringa` may surface both leaf and pod rows, with each result retaining its plant-part wording. Keep the shared bare term unassigned; do not add `moringa` as an alias to either row.

## Bundled recipe demand

I searched all **114 manifest-listed recipe JSON files / 1,123 structured ingredient rows** for the normalized pod phrases, `Moringa oleifera`, and common “drumstick” wording. There were **zero matching files and zero matching ingredient rows** for moringa pods. `Drumstick` poultry wording is not pod demand. No recipe amount, preparation, link, form, or substitution can be inferred from the external sources.

## Forms, numeric evidence, and substitution limits

The live catalog has no moringa-pod form, density, unit mapping, conversion, yield, recipe link, or active substitution. The existing moringa-leaves ledger record has source-specific one-cup recipe observations for leaves in local stews; those quantities belong only to leaves and do not transfer to pods. [S05]

The World Agroforestry food-composition database distinguishes raw and boiled “drumstick pods” as *M. oleifera*, confirming the food/part boundary. Its per-100-g nutrient composition is not a household measure, cup weight, density, preparation conversion, or yield. The Pacific Food Guide's storage/preparation notes and FAO AGRIS' general culinary-use statement likewise give no reusable kitchen measure. Add no numeric catalog value. [S02, S04]

No reviewed source provides a directed pod-to-leaf, pod-to-green-bean, or pod-to-other-vegetable replacement rule. A culinary-use comparison is not substitution evidence. Leave both global and contextual substitution behavior empty; do not activate a rule or recipe-line link. If substitution research is later pursued, it must be scoped by dish role and method and must distinguish pod flesh from leaves and seeds.

## Source register

Sources were checked on 2026-10-19. The IDs below are proposal-local and have not been added to the shared ledger. The existing OQLF source is reused under its current source ID, not duplicated.

| ID | Source | What it supports; limits |
|---|---|---|
| Existing `WP03-RESIDUAL-LEAFY-20261010-S14` | Office québécois de la langue française, [moringa (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17019213/moringa) | Québec terminology and *Moringa oleifera* context; the existing ledger support note says the entry lists several consumed plant parts. It supports keeping pods separate from the leaf identity, not a standardized pod name, measure, or preparation. `sourceKind: regional_authority`. |
| `WP03-K-MORINGA-PODS-R1023-20261019-S01` | FAO AGRIS, Ebert & Palada, [“Moringa — a vegetable tree for improved nutrition, health and income of smallholder farmers”](https://agris.fao.org/search/fr/records/65dfcd204c5aef494fe57b01), *Acta Horticulturae* 1158 (2017), pp. 309–316; paper presented 2015. | Abstract identifies *M. oleifera* as a vegetable tree and says young tender pods, called drumsticks, are highly valued as a vegetable in Asia. The region and maturity wording are retained as stated. It supplies no pod measure, mass conversion, or general substitution. `sourceKind: other`. |
| `WP03-K-MORINGA-PODS-R1023-20261019-S02` | University of Hawai‘i at Mānoa, College of Tropical Agriculture and Human Resources, [Pacific Food Guide: Drumstick tree](https://manoa.hawaii.edu/ctahr/pacificfoodguide/index.php/grown-from-the-ground/drumstick-tree/). | Identifies the drumstick tree as *M. oleifera*, refers to immature tender pods, and states pods can be cooked as a vegetable. Its storage and preparation notes are general source content, not a form definition or exact cooking instruction; the traditional-name list is not imported as aliases. `sourceKind: extension`. |
| `WP03-K-MORINGA-PODS-R1023-20261019-S03` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Moringa oleifera*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:584736-1/general-information). | Confirms *M. oleifera* as an accepted species and records young pods among culinary vegetable parts in the cited flora entries. Kew's aggregated flora descriptions are taxon/part evidence, not Québec naming or retail-market evidence. `sourceKind: other`. |
| `WP03-K-MORINGA-PODS-R1023-20261019-S04` | World Agroforestry, [Priority Food Tree and Crop Food Composition Database: Drumstick pods, boiled (V0026)](https://apps.worldagroforestry.org/products/nutrition/index.php/food/food_item_details/V0026). | Names boiled drumstick pods as a vegetable and identifies *M. oleifera*. Nutrient values per 100 g edible portion are source food-composition data only; they do not establish household measures, density, conversions, yields, or recipe amounts. `sourceKind: other`. |
| Existing `WP03-RESIDUAL-LEAFY-20261010-S15–S19` | Existing sources on the `ingredient-ref-moringa-leaves` record (UC Davis, University of Hawai‘i, Philippine DOST-PCAARRD, and Metro Québec). | Preserve these owners and their leaf/product-scoped evidence. They support the existing leaf identity, not pod amounts or a pod alias. Do not transfer the one-cup stew recipe observations from leaves to pods. |

No manufacturer or retailer measurement was used. No commercial-product roster was pursued; commercial-product counts do not add ingredient diversity. If any queued item concerns only a brand, product line, flavour family, SKU, or retailer-specific variant, mark it out of scope on that basis and stop pursuing it. Preserve all current branded entries and their product-scoped evidence; this proposal suggests no merge.

## Disposition

Recommend one identity-only generic **moringa pods / gousses de moringa** reference for the culinary pods of *Moringa oleifera*, in `VEGETABLE_AND_AROMATIC`. Keep aliases, forms, measures, recipe links, mappings, conversions, yields, and substitutions empty. Preserve the existing moringa-leaves identity and its source-scoped observations unchanged. Section K's broader regional produce and plant-part sweep remains open.

## Root review disposition

Accepted and integrated the proposed identity-only **moringa pods / gousses de moringa** row for the culinary pods of *Moringa oleifera*. The FAO AGRIS, University of Hawai‘i, Kew, and World Agroforestry sources support the species and part boundary. The display remains descriptive; no aliases, forms, measurements, recipe links, conversions, yields, or substitutions were added. The existing moringa-leaves row and all leaf-specific measures remain unchanged. `Drumstick` was omitted as an alias because it is ambiguous with poultry.

The final data state and static validation are recorded in the [R1022–R1024 integration README](../batches/wp02-wp03-wp04-r1022-r1024-generic-gap-integration-20261019/README.md). No software tests were run because the active application changes only add database JSON under `AGENTS.md`.
