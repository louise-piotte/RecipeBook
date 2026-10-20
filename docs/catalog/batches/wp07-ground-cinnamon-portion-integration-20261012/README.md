# WP07 ground-cinnamon portion integration

## Decision

Added four source-specific `portion_weight` observations to the existing
`ingredient-ref-ground-cinnamon` ledger record:

| Source | Reported quantity | Reported mass |
| --- | ---: | ---: |
| USDA SR28, NDB 02010 | 1 tsp | 2.6 g |
| USDA SR28, NDB 02010 | 1 tbsp | 7.8 g |
| Health Canada CNF 2015, food code 178 | 5 ml | 2.3 g |
| Health Canada CNF 2015, food code 178 | 15 ml | 6.9 g |

The ledger keeps the two sources' measurements separate and preserves CNF's metric units. It does
not infer a spoon-volume convention, fill or leveling method, brand, particle size, or cinnamon
species. The CNF page is part of the 2015 publication; the exact cinnamon rows in the 2026 dataset
remain unchecked.

The measurement state remains `blocked_pending_evidence`. The active reference retains null
`defaultDensity` and empty `unitMappings`. The four unqualified `cinnamon` recipe rows are not
assigned a new form interpretation, and none of the nine linked recipe quantities changed.

## Sources

- [USDA ARS SR28, Food Group 02 report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf), NDB 02010, “Spices, cinnamon, ground,” common-measure rows.
- [Health Canada CNF serving size, food code 178](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=178), “Spices, cinnamon, ground”; 5 ml and 15 ml servings.
- [Health Canada CNF search page](https://food-nutrition.canada.ca/cnf-fce/index-eng.jsp) describes the 2015 publication and points to future 2026 access. The exact 2026 cinnamon measure rows were not retrieved in this review.

## Validation

- The four observations and both source IDs pass research-ledger schema validation; the full ledger has 1,614 records and zero validation errors at this checkpoint.
- The active ground-cinnamon reference still has no density or unit mappings.
- No app tests or emulator checks were run because this update only adds database JSON research data; static ledger validation was used.

See [the evidence review](../../proposals/wp07-ground-cinnamon-portion-evidence-review-20261012.md).
