# WP02 A4 generic rye flour measurement and wheat-replacement review — R569 — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17. The source-bounded portion observation and no-general-replacement finding are recorded on the existing rye-flour ledger record; active reference, recipe, rule, and form data remain unchanged.
- **Scope:** Complete one bounded measurement and reusable wheat-replacement evidence follow-up for the existing `ingredient-ref-rye-flour` row. This is distinct from R555 medium rye flour, R561 rye meal, and R566 whole rye flour.
- **Exact plan anchor:** The open WP02 Section A4 rye-milling parent is at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658). The baseline generic rye-flour identity is already checked off at [line 1741](../../RecipeBook-global-ingredient-catalog-plan.txt#L1741); R555, R561, and R566 address other grade or milling identities under the same open parent. Add this bounded evidence follow-up beneath the open parent and keep that broader parent open.

## Bounded recommendation

**Record one named product's published portion observation and an evidence-only finding that no reusable generic rye-for-wheat replacement rule is supported.** The Agrobio 2023 catalog prints `1/4 cup (30 g)` for its organic rye flour. Preserve that only as a serving declaration for that named product and catalog label version. Do not make it a generic cup-weight conversion.

The current Coop Agrobio Québec page describes its rye flour as an “excellent complement” to wheat flour during breadmaking, but gives no quantity or formula. One peer-reviewed Barbari study tests 20% purchased rye flour with 80% all-purpose wheat flour in that named bread context. Preserve both as bounded evidence; neither supports a reusable home-recipe ratio. Add no active substitution rule.

## Current owner and evidence state

At review time, the [`ingredient-ref-rye-flour` row](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L18032) was **rye flour / farine de seigle**, category `FLOUR_AND_STARCH`, with no aliases, null `defaultDensity`, and empty `unitMappings`. Its [`research-ledger record`](../research-ledger.v1.json#L130071) had verified identity, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, and no measurement observations or substitution findings.

No attached ingredient form, global or contextual substitution rule, or package-yield record points to this reference. The current global and contextual substitution-rule files have no entries for it. The package-yield file also has no entry for it.

| Existing source ID | Current owner and scope | R569 treatment |
|---|---|---|
| `WP02A4-S01` | `ingredient-ref-rye-flour`; OQLF's preferred Québec term `farine de seigle` and English equivalent `rye flour`. | Retain for canonical bilingual naming; do not change displays or aliases. |
| `WP02A4-S02` | `ingredient-ref-rye-flour`; AGROBIO 2023 catalog, product entry and bilingual package-label evidence. | Reuse this owned ID for the serving observation. If integrated, update its locator/support text to include the p. 7 Nutrition Facts panel; do not add a duplicate source ID for the same PDF. |
| `WP02A4-S03` | `ingredient-ref-rye-flour`; La Milanaise Québec whole-rye-flour product. | Retain as a grade boundary only. Do not transfer its product claims or measures to the generic row. |
| `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10` | `ingredient-ref-sprouted-buckwheat-flour`; Health Canada Table C.6. | Refer to only as a label-construction limit: C.6 lists 30 g for flours including rye and a household measure closest in mass to that reference amount. Keep this source ID with its existing owner and out of the R569 observation's `sourceIds`. The Agrobio serving is printed by the product source itself, not inferred from C.6. |
| `WP02-A4-RYF-MEAS-SUB-R569-20261017-S01` | New; no ledger source-ID or URL owner found for the current Coop Agrobio product page. | Add to the generic rye record for current product-page context only. |
| `WP02-A4-RYF-MEAS-SUB-R569-20261017-S02` | New; no ledger source-ID or URL owner found for Pourafshar et al.'s study. | Add to the generic rye record for formula-specific substitution evidence only. |

The proposed observation ID `rye-flour-agrobio-label-portion-r569-20261017` and finding ID `rye-flour-no-general-wheat-replacement-r569-20261017` are unused in the current ledger. The current product-page URL and both proposed source IDs were also checked against the ledger and proposal archive; no collision was found.

## Bilingual names and picker projection

AGROBIO's 2023 package label pairs **FARINE DE SEIGLE** with **ORGANIC RYE FLOUR**. This supports the existing Québec French and English generic displays. `organic` is a product/certification qualifier, not a new catalog synonym; no alias should be added. The current Coop Agrobio page still lists its rye-flour product in 1 kg and 20 kg formats, but it does not establish that the current package has the same 2023 label.

The proposal changes no display name, alias, or form, so the picker projection remains unchanged under the phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Current queries `rye flour` and `farine de seigle` each return the five rye-flour family rows (generic, light, medium, malted, and whole). Broader `rye` and `seigle` queries return 11 rye-family references. The generic name must not be made to absorb grade or milling terms.

## Bundled recipe demand

I scanned all **114 manifest-listed recipes** and their **1,123 structured ingredient rows**, checking full recipe JSON and ingredient-line text for `rye flour`, `farine de seigle`, `seigle`, `whole grain rye flour`, and `complete rye flour`, as well as direct `ingredientRefId` links. The scan found **zero matching recipe files, zero matching ingredient rows, and zero direct links** to `ingredient-ref-rye-flour`.

There is no bundled recipe context for a recipe-specific portion or a contextual replacement. No recipe link or relink is proposed.

## Source findings and limits

### Product serving

The AGROBIO catalog's p. 7 entry names **FARINE DE SEIGLE / ORGANIC RYE FLOUR** and its reproduced bilingual Nutrition Facts panel says **per 1/4 cup (30 g)**. The entry describes the product as stone-ground in Coaticook from organic Québec rye and lists 1 kg and 20 kg packages. The current cooperative page continues to list **Farine de seigle biologique**, with 1 kg and 20 kg formats, but does not expose a current Nutrition Facts label.

The observation is therefore one published portion for the named AGROBIO product in a 2023 catalog version. No physical package was inspected; the catalog does not state a fill, leveling, or packing method. The current page does not verify that its live label still carries the same portion. Do not infer the product's current label version, rye extraction grade, whole-grain status, or milling equivalence to another product. Health Canada's C.6 flour reference amount is a nutrition-labelling rule and does not prove that one quarter cup of generic rye flour weighs 30 g.

A potentially adjacent Save-On listing for **Rogers Rye Flour, 2.5 kg** also shows 1/4 cup (30 g), but it is not added here. The listing marks it out of stock, and Rogers Foods announced that its retail Dark Rye 2.5 kg bag was discontinued in January 2026. The listing's ingredient declaration includes rye bran, and the manufacturer identifies the discontinued product as dark rye. Treat it as a separate, grade-qualified residual-stock label observation if that product is reviewed; do not attach it to the generic row or use it to generalize this R569 serving. No ledger source ID is assigned to that excluded listing.

### Wheat-replacement evidence

The current Coop Agrobio product page says its rye flour is an “excellent complement to wheat flour during breadmaking” and mentions pâtés, tourtières, and végépâtés, but supplies no percentage, amount, denominator, formula, process adjustment, or substitution test. Preserve the sentence as qualitative product use guidance; it is not a ratio.

Pourafshar, Rosentrater, and Krishnan's peer-reviewed study tested market-purchased rye flour at **20% of flour weight** with **80% all-purpose wheat flour** in a traditional Iranian Barbari bread formula. The study measured recipe-specific physical and chemical outcomes. It does not identify the rye flour's extraction grade or establish the Agrobio product as equivalent, and it tests one bread formula rather than general home-baking recipes. Its 20% treatment is evidence about that study formula, not a general recommendation.

The supported conclusion is narrow: the reviewed product guidance and study do not establish a reusable wheat-replacement amount for unqualified rye flour across recipes, roles, and methods. Keep both pieces of evidence in the finding, and do not encode the 20% treatment as an active substitution. Recipe-specific guidance would require an identified role, dish type, method, quantity, and applicable warning/block scope under [Requirements FR-5](../../../Requirements.md#L322) and [§6.5](../../../Requirements.md#L641).

## Integrated ledger delta

The accepted delta updates only the existing `ingredient-ref-rye-flour` ledger row:

| Field | Integrated value |
|---|---|
| `measurementState` | `researched_supported`, limited to one named product's published serving declaration. |
| `substitutionResearchState` | `researched_no_supported_substitute`, for a reusable generic rye-for-wheat amount across home-recipe types, roles, and methods. |
| Observation ID | `rye-flour-agrobio-label-portion-r569-20261017`. |
| Observation | `relationship: portion_weight`; `value: 30`; `valueUnit: g`; `sourceQuantity: { amount: 0.25, unit: cup }`; `observedMassG: 30`; `evidenceKind: published_portion`. |
| Observation context | `foodDescription`: AGROBIO organic rye flour, p. 7 of its 2023 catalog, 1 kg package entry; `foodState`: dry product as sold; `measurementMethod`: reproduced Nutrition Facts serving declaration, with no fill method stated and no physical package inspected; `quantityBasis`: this label's product-specific serving only, not a reusable generic rye-flour mass-volume mapping. |
| Observation `sourceIds` | Existing `WP02A4-S02` only. Do not attach the Health Canada C.6 reference-amount source. |
| Finding ID | `rye-flour-no-general-wheat-replacement-r569-20261017`. |
| Finding `researchState` | `researched_no_supported_substitute`; no `replacements` array. |
| Finding context | Whether generic rye flour has a reusable quantified amount for replacing wheat flour across home-recipe types, roles, and methods. |
| Finding basis | The current Coop Agrobio page qualitatively describes rye flour as a complement to wheat in breadmaking but gives no ratio. One peer-reviewed study tested 20% purchased rye flour with 80% all-purpose wheat flour in a specific Barbari formula; the tested blend and outcomes do not establish reusable guidance across recipes or products. |
| Finding limitations | Preserve the Coop wording as qualitative and the study result as formula-specific. Do not encode 20% as a generic rule or infer hydration, gluten development, mixing, fermentation, leavening, texture, or yield changes. Do not generalize the Agrobio label portion to other rye products. Add no active global or contextual substitution rule. |
| Finding `sourceIds` | New `WP02-A4-RYF-MEAS-SUB-R569-20261017-S01` and `WP02-A4-RYF-MEAS-SUB-R569-20261017-S02`. |
| Active ingredient-reference row | Unchanged: canonical bilingual names and empty alias lists; `defaultDensity: null`; `unitMappings: []`. |
| Forms, rules, yields, and recipes | No changes. |

Do not add `organic rye flour` as an alias, a density, a reusable cup mapping, a rye form, a package yield, a recipe link, or a substitution rule. The A4 parent at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) remains open after this subtask.

## Source register

Sources were accessed on **2026-10-17**. The two new R569 source IDs are now registered on the live `ingredient-ref-rye-flour` record; `WP02A4-S02` remains on that record and now includes the p. 7 serving-panel locator.

| Source ID | Source and locator | Evidence and exact limit |
|---|---|---|
| `WP02-A4-RYF-MEAS-SUB-R569-20261017-S01` | Coop Agrobio Québec, [Produits](https://coopagrobioquebec.com/produits/), `Farine de seigle biologique` entry. | Current Québec cooperative product listing, qualitative complement/use wording and 1 kg / 20 kg formats. No ratio or current label serving. |
| Existing `WP02A4-S02` | Coop Agrobio Québec, [2023 catalog PDF](https://www.coopagrobioquebec.com/wp-content/uploads/2023/05/catalogue-2023.pdf), p. 7, rye-flour entry and bilingual Nutrition Facts panel. | Product name pairing and printed `1/4 cup (30 g)` serving. This is a 2023 label representation, not a physical-package inspection or current-label verification. Existing ID remains owned by `ingredient-ref-rye-flour`. |
| `WP02-A4-RYF-MEAS-SUB-R569-20261017-S02` | Pourafshar S., Rosentrater K. A., and Krishnan P. G., [“Using alternative flours as partial replacement of barbari bread formulation (traditional Iranian bread)”](https://pmc.ncbi.nlm.nih.gov/articles/PMC4554633/), *Journal of Food Science and Technology* 52(9), 5691–5699 (2015), DOI [10.1007/s13197-014-1640-z](https://doi.org/10.1007/s13197-014-1640-z), Table 1, methods, and conclusions. | Primary study uses purchased rye flour at 20% of flour weight with 80% all-purpose wheat flour in a named Barbari formula. It does not specify the rye grade or establish a transferable home-recipe rule. |
| Reused by reference only: `WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10` | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), item C.6, lines 723–727. | Current Canadian label reference: flours including rye, 30 g reference amount, and a household measure chosen closest in weight. Remains owned by the sprouted-buckwheat-flour record; not used to derive the observed Agrobio portion. |
| Excluded; no ledger source ID proposed | Save-On Foods, [Rogers Rye Flour, 2.5 kg](https://www.saveonfoods.com/sm/pickup/rsid/2220/product/rogers-rogers-rye-flour-id-00060179030215), product listing, 1/4-cup serving, ingredients and availability; Rogers Foods, [Dark Rye Flour announcement](https://rogersfoods.com/shop/retail-products/dark-rye-flour/), discontinuation notice dated 2026-01-13. | Retailer listing says 1/4 cup (30 g), product of Canada, ingredients `rye flour, rye bran`, and out of stock. Manufacturer says its retail dark rye 2.5 kg bag was discontinued. This grade-qualified, residual-stock evidence is not added to the generic row. |

## Local checks

- Before integration, confirmed target catalog/ledger ownership and that the two new R569 source IDs and observation/finding IDs were unallocated. Integration added those IDs to the existing `ingredient-ref-rye-flour` record only.
- Confirmed no target forms, substitution rules, or package yields; no direct recipe links.
- Audited the current 114-file, 1,123-row recipe bundle; no generic rye-flour phrase or direct-link demand was found.
- Reviewed the current picker implementation and current rye-family projection; no bilingual display, alias, or picker change is proposed.
- The proposal and integration README received UTF-8, no-BOM, whitespace, and local-link checks. No software tests, app build, emulator run, or deployment were run for this database-JSON-only change.
