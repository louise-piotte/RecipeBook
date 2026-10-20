# WP04 Proposal: Medium Onion Count Portion Evidence Gap

**Review date:** 2026-10-10  
**Status:** Root review found that USDA ERS TB-1927 Appendix A, Table A-2 explicitly lists one raw medium onion (2½-inch diameter) as 110 g. Record that historical, source-specific count-weight observation, but keep runtime use blocked because the report does not label the weight as edible or as-purchased. No recipe data or active mapping changes.

## Scope and disposition

This review reopens one previously screened line because an independent primary source was found that was not present in the existing onion reviews: USDA ERS Technical Bulletin 1927. The prior checks used the historical CNF onion page and USDA SR28 NDB 11282; neither supplied a medium-onion count. Appendix A, Table A-2 lists NDB 11282, raw onions, `1 Medium (2½-inch diameter)`, `110 g`, and `10%` inedible. This matches the recipe's stored `medium onion` unit. The report labels the values as assumptions and does not specify whether 110 g is edible or as-purchased mass, so preserve the source value without deriving a net/gross conversion or activating runtime use.

This is the only exact recipe line included. Other produce, herb, animal-food, and count/portion lines were left out because their existing reviews already cover the available evidence or they are excluded by the assignment. No real recipe count, text, unit, or ingredient link is changed.

## Exact recipe line and current state

| Recipe reference | Exact bundled line | Current structured fields | Recipe preparation and match limit |
| --- | --- | --- | --- |
| `015#2`; ingredient UUID `e1e7939b-206f-4839-97d9-2a91febb28eb-ingredient-2` | `2 onions` | `quantity: 2`; `unit: medium onion`; `ingredientRefId: ingredient-ref-onion` | Recipe 015, *Beef Stroganov*. Instructions cook the onions in margarine before adding other ingredients, so the line enters cooking as raw onion. The source text itself says only `2 onions`; “medium” appears in the stored unit. Preserve that text/unit distinction. |

Recipe file: `app/src/main/assets/seed/bundled-library/recipes/015-boeuf-stroganov-beef-stroganov-e1e7939b-206f-4839-97d9-2a91febb28eb.v1.json`.

The ledger record `ingredient-ref-onion` now contains the ERS source and a source-specific 110 g count-weight observation; its measurement state is `researched_supported`. No runtime count mapping was activated, and the edible/as-purchased basis remains unresolved. The cited SR28 entry contains chopped/sliced volume measures, not an onion count. The existing [produce gap review](wp04-wp12-produce-count-edible-portion-gap-review-20261010.md) and [alternate-source review](wp04-produce-count-alternate-source-review-20261010.md) predate this ERS source and should retain their narrower source-specific claims.

## New primary evidence and limits

USDA ERS Technical Bulletin 1927, Appendix A, Table A-1, row **Fresh onions**, says the broad category includes random-weight and UPC fresh onions, green onions, canned onions, and split fresh-cut mixtures. That row lists `Inedible = 10%` using USDA NDB 11282, `Onions, raw [medium (2½-inch diameter)]`, and separately says `For count data, assumed 1 onion = 110 g`.

Appendix A, Table A-2 resolves the size match that Table A-1 alone leaves ambiguous: its `Onions, raw` / NDB 11282 row lists `1 Medium (2½-inch diameter)`, `110 g`, and `10%` inedible. This is a historical USDA/ERS source assumption, not a direct measurement of the recipe's onions or a current retail-size standard. The table does not label the 110 g as edible or as-purchased mass. Preserve the 110 g observation exactly as published; do not infer a basis from the separate 10% refuse value or derive a second value.

| Source ID | Source and locator | What it supports | What it does not establish |
| --- | --- | --- | --- |
| `WP04-MEDIUM-ONION-ERS-20261010-S01` | USDA Economic Research Service, Muth et al., *Consumer-Level Food Loss Estimates and Their Use in the ERS Loss-Adjusted Food Availability Data*, Technical Bulletin 1927 (January 2011), [official PDF](https://ers.usda.gov/sites/default/files/_laserfiche/publications/47570/8043_tb1927.pdf?v=24481), Appendix A, Table A-1 “Fresh onions” and Table A-2 “Onions, raw” / NDB 11282, PDF pp. 56 and 63. Accessed 2026-10-10. | Table A-2's source-reported assumption `1 medium onion (2½-inch diameter) = 110 g`, with 10% inedible; Table A-1's broader fresh-onion category and count-data assumption. | An individually measured onion; whether the 110 g is edible or as-purchased; a current retail size distribution; cultivar-specific, preparation-specific, or recipe-specific weight. |

### Previously reviewed context

These sources explain why the ERS report is a material new source and why it still does not close the line-specific gap. Their claims are carried forward from the prior reviews; they were not re-retrieved for this proposal.

| Existing source ID | Source and URL | Relevant limit |
| --- | --- | --- |
| `WP04-WP12-PRODUCE-20261010-S02` | Health Canada, CNF 2015, [Onion, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2401), food code 2401. | Lists 1 large raw onion = 150.0 g edible portion and 10% refuse; it does not list a medium-onion portion. It is historical CNF evidence. |
| `WP04-WP12-FDC-ALT-20261010-S05` | USDA ARS, SR28, [Food Group 11: Vegetables and Vegetable Products](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=1140), NDB 11282, *Onions, raw*. | Its readable common-measure list has chopped/sliced volume measures and no medium-onion count. The entry lists 10% refuse. |

## Integrated ledger-only delta

The ERS source citation and a source-specific `count_weight` observation are recorded on `ingredient-ref-onion`: `1 medium raw onion (2½-inch diameter) = 110 g`, source-reported as an assumption. The observation's `quantityBasis` preserves that the source does not label the value edible or as-purchased. An `unresolved` decision explains why the observation cannot be activated as a runtime count conversion. `measurementState: researched_supported` records the bounded numeric observation; it is not a universal or edible-portion value.

Do **not** alter `defaultDensity` or `unitMappings`, or create a count conversion. Keep substitution research unchanged. Do not derive a 10%-adjusted mass, multiply the observation by the recipe quantity of two, or change the recipe line. The source's separate 10% refuse entry is retained as a qualifier only.

## Acceptance checks

- The source register uses the unique proposal-local ID above, the official USDA ERS PDF URL, the bulletin date, and both exact Table A-1 and A-2 locators.
- Any ledger source entry describes 110 g as a historical ERS **assumption** for one medium raw onion, 2½ inches in diameter; it does not present the number as an individually measured onion or as an edible/as-purchased weight.
- The 10% inedible factor is recorded only as a separate source qualifier. No edible or purchase weight is inferred from it.
- No numeric measurement observation, unit mapping, density, recipe edit, or recipe-total calculation is introduced for `015#2`.
- The ledger retains the source-specific observation and blocks runtime use until the edible/as-purchased basis is explicit. The original text `2 onions` and structured `medium onion` unit remain distinct.

The source-specific ledger observation is integrated; no canonical catalog, generated catalog, recipe, or active mapping changed. Verification results are recorded in the corresponding plan/roadmap checkpoint.
