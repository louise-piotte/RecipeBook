# WP03 Section F Follow-Up: Little Millet Identity and Québec Naming Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** Root reviewed the packet and recorded `candidate-little-millet` as held in the research ledger. No canonical ingredient reference, form, recipe, or generated catalog row was added.
- **Scope:** the uncovered food-grain identity *little millet* (*Panicum sumatrense*), bounded to whole or dehulled grain for human food. Review the exact English name, Québec French naming evidence, catalog and recipe collisions, and evidence limits for other data types.
- **Disposition:** the English identity is supported, but hold integration until a distinct Québec French display name is validated. Keep `petit mil` and `petit millet` inactive. Add no forms, measures, density, yields, conversions, or substitutions.
- **Current snapshot inspected:** 887 active ingredient references, 48 ingredient forms, 114 manifest-listed recipes with 1,123 ingredient rows, and 1,132 research-ledger records.
- **Source access date:** 2026-10-10, except where an existing ledger record's original access date is identified.

## Why this is a disjoint candidate

The open Section F aggregate still calls for species-level grain review. The live catalog contains generic millet and the separate common, foxtail, finger, kodo, and pearl millet identities, but no little-millet reference. The current ledger has no little-millet candidate or decision record. Its only specific ledger mention is in the existing `ingredient-ref-common-millet` record's reused Health Canada crop-group source (`WP03-S181`), which lists little millet as another taxon; that mention is not a little-millet food-product review.

The current WP03 proposal search found no prior little-millet packet. The brown-top millet proposal immediately preceding this review covers *Urochloa ramosa* only and is explicitly excluded. Sushi rice, pot/Scotch barley, farro, hominy/pozole, generic grits, dried sweet corn, rye berries, barley flakes, buckwheat flakes, quinoa flakes, and puffed-grain identities also have separate prior reviews or integrations; none is reopened here. Integrated quinoa, fonio, amaranth, Job's tears, and other millet species remain out of scope.

## Identity and product boundary

The current FSSAI cereal standard says its millet standard applies to whole or dehulled millets and lists `Little Millet (Kutki) — Panicum sumatrense` separately from foxtail, kodo, pearl, and proso millet [S01]. Agriculture and Agri-Food Canada independently uses **little millet** for *Panicum sumatrense* [S02]. A Canadian retail listing sells a polished product as `Little Millet Rice | சாமை | Panicum sumatrense` and labels its product type `Millets` [S03]. Taken together, these sources support a distinct, human-food little-millet grain identity, including a source-attested polished product.

The product page's word `Rice` is a marketed phrase for this millet product. The FSSAI standard separately defines rice as kernels of *Oryza sativa* L. [S01]. Keep the species and the active rice identities distinct: do not make `rice`, `millet rice`, or the unqualified phrase `little millet rice` a global alias. Preserve `little millet rice` as source wording only until a later exact-query review establishes that alias's picker behavior and value.

The evidence does not establish that every product called little millet has the same polishing, hull-removal, cultivar, or preparation state. This proposal is for the named grain identity, not little-millet flour, grits, flakes, popped grain, cooked millet, feed, planting seed, or a formulated product.

## Québec French naming and proposed labels

| Field | Proposal | Decision |
| --- | --- | --- |
| Candidate ID | `ingredient-ref-little-millet` | Unique in the current catalog and ledger; reserve for review only. |
| English display | `little millet` | Supported by FSSAI, AAFC, and the Canadian product listing. |
| fr-CA display | None approved | Hold. No dedicated OQLF entry or Québec food-product label for *Panicum sumatrense* was located in this review. |
| English aliases, if a bilingual row is later approved | `kutki`, `samai` | Both are source-attested names for this species [S01, S03]. Do not add `saamai` or other spellings without exact source support. |
| French aliases | None | Do not add `petit mil`, `petit millet`, `mil`, `millet`, or `millet des oiseaux`. |
| Category / numeric fields | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` | Category is proposed only. Leave all quantity data empty. |

The OQLF entry for generic *millet* explicitly says it groups several species and may also abbreviate the name of a particular species. It lists `mil`, `petit mil`, and `millet` as preferred terms [S04]. Separate OQLF entries use `petit mil` for foxtail millet (*Setaria italica*) and pearl millet (*Pennisetum* spp.) [S05–S06]. A 2018 Codex working paper also maps French `Petit mil` to *Panicum sumatrense* [S07]. This proves that `petit mil` is in use across more than one species; it does not make the phrase a safe Québec picker label. `Petit millet` is not established by the reviewed Québec terminology sources, so do not adopt it as a mechanical translation of `little millet`.

The current live catalog does not store `petit mil` as an active alias, but its Québec meanings collide with the already separate generic, foxtail, and pearl millet identities. The label therefore remains unresolved even though the English species identity is clear. Reopen French naming only with a Québec terminology-authority entry, a Québec retailer/manufacturer product label paired to this taxon, or a focused OQLF decision that selects a distinct species-qualified term.

## Catalog, alias, ledger, and recipe audit

The current split-package audit covered all 887 ingredient references and 48 forms. The active millet references include generic millet; common, foxtail, finger, kodo, and pearl millet; their existing flour identities; and puffed millet. There is no `ingredient-ref-little-millet`, no little-millet form, and no exact active display or alias for `little millet`, `Panicum sumatrense`, `kutki`, `samai`, `petit mil`, or `petit millet`. The proposed stable ID is unused. The exact name `millet d'Italie` already belongs to the foxtail millet row and is not a little-millet alias.

The ledger audit covered 1,132 records. It found no `ingredient-ref-little-millet` or exact little-millet decision record; the existing `WP03-S181` mention is a cereal crop-group list, not evidence for a separate active row. The proposal search found no previous little-millet source packet or source-ID collision under `WP03-LITTLE-MILLET-20261010`.

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were checked with case-folded, accent-folded, punctuation-normalized whole-phrase matching for `little millet`, `little millet rice`, `Panicum sumatrense`, `kutki`, `samai`, `saamai`, `petit mil`, and `petit millet`. There were **zero recipe-file hits and zero ingredient-row hits**. No recipe links or recipe-text changes are proposed.

## Evidence limits by data type

| Concern | Supported evidence | Do not infer or activate |
| --- | --- | --- |
| **Identity** | A species-qualified human-food grain of *Panicum sumatrense*; the standard covers whole or dehulled millets. | A broader genus-level definition, cultivar, flour, feed, planting seed, or another processed product. |
| **Measures and density** | The Canadian listing gives one package size and weight; FSSAI gives regulatory quality specifications. | A cup, spoon, or serving weight; `g/ml` density; mass-volume mapping; or a household measure. A package weight is not a measure conversion. FSSAI moisture limits and other quality criteria are not recipe amounts or density observations. |
| **Forms and yields** | The standard distinguishes whole and dehulled grain generally; one retailer describes one product as polished. | A canonical polished/dehulled form mapping, dry/cooked forms, a cooking yield, soaking expansion, or a package yield. The reviewed sources do not define equivalent processing states across products. |
| **Conversions** | None. | No unit mapping, mass-volume conversion, or dry-to-cooked conversion. Do not transform regulatory or package values into recipe data. |
| **Substitutions** | None. | No global or contextual substitution rule. The sources provide no tested ingredient replacement, dish scope, amount, or ratio. |

## Source register

Source IDs were added to `candidate-little-millet` in the research ledger. All URLs were accessed on 2026-10-10; the Health Canada crop-group source remains reused from its existing ledger entry.

| Source ID | Source and locator | Scope and limits |
| --- | --- | --- |
| `WP03-LITTLE-MILLET-20261010-S01` | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §23, PDF pp. 17–18; §24, PDF p. 19. | Current consolidated official food standard: the millet standard covers whole or dehulled grain and lists little millet (Kutki) as *Panicum sumatrense*, separately from other millets. The standard's moisture and quality limits are regulatory specifications, not cooking measures or conversion data. Its §24 defines rice separately as *Oryza sativa* L. |
| `WP03-LITTLE-MILLET-20261010-S02` | Agriculture and Agri-Food Canada, [Shining a Spotlight on Millet](https://agriculture.canada.ca/en/science/story-agricultural-science/scientific-achievements-agriculture/shining-spotlight-millet), “The mighty little millet.” | Canadian government source identifies little millet as *Panicum sumatrense* and discusses it as a cereal crop. It is not a Québec French terminology source or a retail package specification. |
| `WP03-LITTLE-MILLET-20261010-S03` | Ceylon Groceries, [Little Millet Rice (சாமை) (Panicum sumatrense) Polished](https://ceylongroceries.com/collections/products/products/little-millet), product page. | Current Canadian retail listing explicitly names the taxon, the marketed phrase `Little Millet Rice`, the regional name `samai`, and a polished product. This is retailer copy, not an inspected manufacturer label; its package size/weight does not establish density, serving size, or cooked yield, and it supplies no Québec French term. |
| `WP03-LITTLE-MILLET-20261010-S04` | OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), Grand dictionnaire terminologique, last updated 2010. | Québec terminology authority says generic *millet* groups several species and lists `mil`, `petit mil`, and `millet`. It does not give the little-millet taxon or product as a dedicated entry. |
| `WP03-LITTLE-MILLET-20261010-S05` | OQLF, [millet des oiseaux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), Grand dictionnaire terminologique, last updated 2010. | Defines the foxtail millet plant as *Setaria italica* and lists `petit mil` as a preferred term. This is direct Québec evidence that the proposed short French term is not unique to little millet. |
| `WP03-LITTLE-MILLET-20261010-S06` | OQLF, [millet perle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle), Grand dictionnaire terminologique, last updated 2010. | Defines pearl millet and lists `petit mil` as a preferred term. It further confirms the ambiguity; it does not supply a name for little millet. |
| `WP03-LITTLE-MILLET-20261010-S07` | FAO/WHO Codex Alimentarius, [CX/PR 18/50/8, Révision de la classification des produits destinés à l'alimentation humaine et animale](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FMeetings%252FCX-718-50%252FWD%252Fpr50_08f.pdf), March 2018, Annex I, PDF p. 7. | A Codex working paper's French commodity table maps `Petit mil` to *Panicum sumatrense*. It is international classification evidence, not a Québec-preferred term or current consumer-label source; its conflict with the OQLF usages is a reason to hold the short phrase. |
| `WP03-S181` (existing ledger source, reused) | Health Canada, [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html), cereal grains, crop group 15-21E. | Lists `Millet, little (Panicum sumatrense)` separately from barnyard, finger, foxtail, pearl, and proso millets. It supports a Canadian taxonomic boundary only; crop-group membership is not a food-label, measure, or substitution source. The ledger originally records access on 2026-10-07; the page was rechecked for this packet on 2026-10-10. |

## Proposed decisions and acceptance checks

1. Retain `little millet / Panicum sumatrense` as an uncovered candidate for Section F integration review; do not allocate the catalog ID until an exact fr-CA display has evidence.
2. If a Québec naming source later resolves the display, use `little millet` in English. Consider only `kutki` and `samai` as source-backed English aliases. Keep `little millet rice`, `rice`, and `millet rice` out of active aliases unless a later exact-query collision review approves a narrow phrase.
3. Keep `petit mil`, `petit millet`, `mil`, and bare `millet` out of the new row. Preserve the existing generic, foxtail, and pearl millet identities and their names.
4. Do not add recipe links: the current corpus has no matching recipe line. Add no forms, measurements, density, yields, unit mappings, conversions, or substitutions.
5. Before any later integration, recheck the proposed ID and aliases against the then-current reference and form keys; confirm the French label with a Québec authority or Québec food-product source; and keep source-specific product wording separate from the canonical identity.

## Review disposition

The species and human-food grain identity are supported by current official standards, Canadian government material, and a current Canadian product listing. Keep the candidate **on hold for a distinct Québec French display name**. The short phrase `petit mil` is specifically unsafe as a global label because Québec sources use it for more than one other millet species while Codex also maps it to little millet. No canonical data or recipe demand justifies bypassing that unresolved naming conflict.

**File verification:** saved as UTF-8 without BOM with LF line endings and one final newline; after saving, the file was checked for valid UTF-8, BOM absence, and trailing whitespace. No tests were run for this proposal.
