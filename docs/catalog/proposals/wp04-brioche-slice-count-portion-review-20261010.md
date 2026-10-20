# WP04 Proposal: Brioche-Slice Count and Portion Availability

**Review date:** 2026-10-10
**Status:** Reviewed; the coordinator recorded a measurement blocker in the ledger. No recipe or numeric portion value was changed.
**Scope:** One previously uncovered bundled count line, `075#4` (`5 to 8 slices brioche bread`). It is outside the completed WP04/WP12 produce/herb and animal-food count packets.

## Disposition

Keep the line's count wording and leave its count-to-mass portion unavailable. The bundled recipe and its archived RecipeKeeper export provide no publisher URL or named original source. The saved text gives a range of 5–8 slices, while the structured row stores `quantity: 8`, `unit: "count"`, and the recipe yield says 8 slices. A note says the mixture accommodates about 5–8 slices depending on their thickness. Neither record identifies the brioche product, slice dimensions, or mass.

The online source check did not locate a matching original recipe page or an authoritative portion record for this recipe's unspecified slices. USDA FNDDS documentation confirms that its portion weights are estimates for generic or composite foods and may not cover every size of a product. That methodology cannot supply a recipe-specific weight without a matching food and slice description. Recommend keeping the measurement **blocked pending a matching source**. Do not treat the stored `8` as an exact count, select a representative slice, apply a generic bread-slice weight, or add a density, conversion, yield, or substitution.

## Exact recipe demand and current catalog state

| Field | Current value / finding |
|---|---|
| Recipe | `075` — *French Toast* / *Pain doré*. |
| Ingredient line | `b3aacc80-d2f6-471d-bf42-85ba5fb8843a-ingredient-4` (`075#4`). |
| Exact bundled text | `5 to 8 slices brioche bread`. |
| Structured amount | `quantity: 8`, `unit: "count"`; the original text carries the 5-to-8 range. The recipe yield is 8 slices. |
| Existing reference | `ingredient-ref-brioche-bread`, displayed as `brioche bread` / `pain brioche`, category `BAKING_MIXIN_AND_PANTRY`; no aliases, default density, or unit mappings. |
| Existing ledger state | `identityState: unreviewed`; `measurementState: not_yet_researched`; no sources or observations on this reference. |
| Recipe preparation | The method dips each slice in egg mixture and cooks both sides in a skillet. It gives no slice thickness, loaf dimensions, or product label. |
| Provenance | The bundled row has no `source` object or source URL and carries `sourceType: recipekeeper-manual-cleanup`. The archived RecipeKeeper export also has `sourceUrl: null`; its import snapshot is named `RecipeKeeper_20260320_143058`. |

A full manifest-listed recipe scan found this as one exact brioche ingredient row. The archived export retains the same 5–8 slice wording; it does not identify a publisher or manufacturer. The recipe note explains that thickness changes how many slices the egg mixture covers, so the upper endpoint stored in the structured amount is not a stable one-slice measurement basis.

## Measurement dimensions and evidence boundary

| Dimension | Supported by the bundled source | Unresolved; do not infer |
|---|---|---|
| **Count** | A recipe range of 5–8 slices; stored quantity 8 with count unit; yield text of 8 slices. | Which exact count was used for a particular loaf or execution. Do not collapse the source range to eight slices. |
| **Food identity** | The recipe calls for brioche bread. | Brand, recipe/formulation, loaf shape, package, and whether it is pre-sliced or cut from a loaf. |
| **Slice dimensions** | The recipe's note says thickness affects the count the egg mixture can accommodate. | Thickness, width, length, and whether edge/end slices are included. No slice size is stated. |
| **Mass / count weight** | No mass is given in the recipe or local export. | Do not use an unrelated generic bread slice, one `piece` portion, loaf mass divided by an assumed slice count, or another recipe's ratio as this line's count weight. |
| **Preparation and edible basis** | The ingredient is listed before dipping and pan-frying; the method cooks each dipped slice. | The source gives no raw slice weight, egg uptake, cooked mass, or yield. Do not describe a raw-slice measure as cooked French-toast weight. |
| **Density / conversion / package yield** | None. | No volume measure, loaf weight, package amount, density, piece-to-mass mapping, or reusable package yield is supported. |
| **Identity and substitutions** | Existing generic brioche identity is retained. | No identity alias, brioche-to-challah/other-bread substitution, or recipe-specific equivalence is researched here. |

## Prior-review and corpus check

- The current WP04/WP12 count packets cover the produce/herb lines and their explicit holds; this brioche row is not among their recipe-line tables.
- The completed WP04 animal-food count audits and the egg, pepper, fresh-herb, ham, tuna, cherry, chipotle, pickle, and package reviews do not review `075#4`.
- WP07's chicken/egg count work includes recipe `075#1` (`2 eggs`), not the brioche slice row. WP03 bread-product reviews mention brioche identity but do not establish a portion for `075#4`.
- The exact-source search for `"5 to 8 slices brioche bread"`, `"5 to 8 slices of brioche bread"`, and the paired French phrase `"5 à 8 tranches de pain brioche"` on 2026-10-10 did not identify the original publisher page. Search results for other French-toast recipes were not the same recipe and do not support this line's slice size or mass.

## Recommendation and future acceptance checks

**Recommendation: keep the count-to-mass relationship blocked pending a matching source.** Preserve the bundled wording, structured amount, and current reference. If the coordinator records the research gap in the existing ledger, `blocked_pending_evidence` is appropriate for the measurement state only if that state is intended to describe this exact, sole recipe demand for `ingredient-ref-brioche-bread`; no numeric observation or source-backed portion is proposed here.

Accept a future source-specific `count_weight` observation only when the source:

1. identifies the brioche product or source recipe that matches the bundled demand;
2. reports an actual mass for a stated number of slices (or one slice) with the slice dimensions/thickness or other source qualifiers intact;
3. states whether the mass is before soaking/cooking or after preparation, and identifies the amount basis;
4. preserves the source's exact value, unit, precision, count wording, method, URL, date/version, and locator; and
5. does not require choosing one endpoint of the recipe's 5–8 range or assuming an unstated product/size.

Even if a future USDA reference lists a generic brioche portion, keep it source-specific to that record. Do not convert `piece` to `slice`, scale across slice counts, treat a USDA survey portion as this unknown recipe product, activate a default count mapping, or infer mass from the egg mixture's capacity.

## Sources and access results

All external source pages below were opened or attempted on **2026-10-10**. No numeric portion was adopted.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP04-BRIOCHE-COUNT-20261010-S01** | U.S. Department of Agriculture, Agricultural Research Service, [FNDDS 2021–2023 documentation](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/fndds/2021_2023_FNDDS_Doc.pdf), portion codes and “Portion Weight”; publication record lists publication date 2024-08-01. | The documentation says weights are estimates representing groups of foods/beverages, may not account for all sizes of a specific product, and a food code may include several products. It describes FNDDS portions as grams of edible food as consumed. This supports a strict source-match boundary, not a mass for the recipe's raw brioche slices. Accessed 2026-10-10. |
| **WP04-BRIOCHE-COUNT-20261010-S02** | USDA ARS, [FNDDS download databases](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/food-surveys-research-group/docs/fndds-download-databases), 2021–2023 “Portions and Weights.xlsx.” | The official page lists the data file and cites the 2021–2023 database. The web connector could not read the XLSX (`unsupported content-type`); its specific brioche rows were therefore not verified. An unreadable file does not establish that no matching row exists. Accessed 2026-10-10. |
| **WP04-BRIOCHE-COUNT-20261010-S03** | USDA FoodData Central, [Download Field Descriptions](https://fdc.nal.usda.gov/portal-data/external/dataDictionary). | Defines the portion fields, including portion description/modifier and gram weight. This explains which fields an exact record would need; the dictionary does not provide this recipe's product or portion. Accessed 2026-10-10. |
| **WP04-BRIOCHE-COUNT-20261010-S04** | USDA FoodData Central, [API Guide](https://fdc.nal.usda.gov/api-guide/). | Describes the Food Search and Food Details endpoints. Direct FDC page/API attempts in this review were inaccessible through the research connector, so no FDC record ID or measurement is claimed. Accessed 2026-10-10. |
| **Local recipe provenance** | [Bundled recipe 075](../../../app/src/main/assets/seed/bundled-library/recipes/075-pain-dore-french-toast-b3aacc80-d2f6-471d-bf42-85ba5fb8843a.v1.json); [archived RecipeKeeper export](../../../docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes/processed_075-pain-dor-french-toast-b3aacc80-d2f6-471d-bf42-85ba5fb8843a.json). | The bundled line and export preserve the 5–8 slice range and no source URL. They establish the saved recipe wording, not an online original publisher or slice weight. Checked 2026-10-10. |

## Remaining coverage gaps

- The exact source page for recipe 075 remains unidentified; the local export cannot establish which brioche loaf or slice dimensions were intended.
- No accepted source-specific mass is available for one slice, the source's 5–8 range, or a cooked French-toast slice.
- This proposal does not reopen covered count/portion work. It leaves all reference identity, recipe text, servings, package data, active conversions, densities, and substitutions unchanged.
- The plan's WP04 count/edible-portion/composition-sensitive fixture work remains open; this blocked line alone does not close that requirement.

## Coordinator integration — 2026-10-10

The ledger now records `ingredient-ref-brioche-bread` as `blocked_pending_evidence` for measurement, with the USDA FNDDS methodology source and an unresolved decision tied to recipe `075#4`. The saved `5 to 8 slices brioche bread` wording and structured count remain unchanged. No measurement observation, conversion, density, substitution, or recipe edit was added.
