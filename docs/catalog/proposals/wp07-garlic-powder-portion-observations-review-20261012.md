# WP07 garlic-powder portion observations

**Review date:** 2026-10-12
**Status:** Integrated as four source-specific observations on `ingredient-ref-garlic-powder`. See the [integration README](../batches/wp07-garlic-powder-portion-integration-20261012/README.md).

## Evidence and limits

USDA SR28 NDB 02020, “Spices, garlic powder,” reports 1 tsp = 3.1 g and 1 tbsp = 9.7 g. Health Canada's CNF 2015 Food Code 188, “Spices, garlic powder / Épices, ail, poudre,” reports 5 ml = 2.9 g and 15 ml = 8.5 g. Preserve each source's food description, version, and unit exactly. Do not average the values or scale one measure to another.

Health Canada identifies its 2026 relational files as the current CNF and says its online CNF 2015 interface remains available as an interim access surface. The official 2026 dataset listing exposes Food Name and Measure Weight Conversion CSV resources, but retrieval of the listing and downloadable files returned HTTP 403 in this review. The current garlic-powder food and measure rows were not verified; this access limitation is not evidence that such a row is absent.

## Recipe demand and ownership

The existing `ingredient-ref-garlic-powder` reference has eight linked ingredient lines across the bundle: five measured tsp lines, one measured tbsp line, one 2 tbsp line marked `granulated`, and one “to taste” line. The six source portions are not linked to these recipe rows. In particular, no recipe line identifies USDA's product/measure convention, CNF's metric measure, or the brand and particle size used; the granulated line is not proven equivalent to powdered garlic.

## Integrated treatment

- Record USDA's 1 tsp and 1 tbsp portions separately, plus CNF 2015's 5 ml and 15 ml portions separately.
- Keep `measurementState` at `blocked_pending_evidence`; active density remains null and unit mappings remain empty.
- Add no recipe-line links or conversions. Leave substitution research `not_yet_researched`.
- Leave all recipe amounts, names, and notes unchanged.

## Sources

| ID | Source | Supports and limits |
|---|---|---|
| `WP07-GARLIC-POWDER-20261012-S01` | USDA Agricultural Research Service, [Standard Reference Release 28, Food Group 02](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf), NDB No. 02020. | Reports 1 tsp = 3.1 g and 1 tbsp = 9.7 g for “Spices, garlic powder.” The source does not specify spoon capacity, fill or leveling method, brand, or particle-size standard. |
| `WP07-GARLIC-POWDER-20261012-S02` | Health Canada, [Canadian Nutrient File serving portions, Food Code 188](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=188). | Names “Spices, garlic powder / Épices, ail, poudre” and reports 5 ml = 2.9 g and 15 ml = 8.5 g. This is the CNF 2015 online publication; no brand or fill method is stated. |
| `WP07-GARLIC-POWDER-20261012-S03` | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Identifies the 2026 relational files as the current CNF dataset and describes the online 2015 CNF as an interim access surface. It does not establish a current garlic-powder row or portion. |
| `WP07-GARLIC-POWDER-20261012-S04` | Open Government Portal, [Canadian Nutrient File 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1). | Lists 2026 Food Name and Measure Weight Conversion resources. Direct listing/resource retrieval returned HTTP 403 through the available browser, so the current food and measure rows were not checked. This is an access gap, not evidence of absence. |

All pages were accessed 2026-10-12. The ledger update changes database JSON only; no app tests or emulator checks were needed.
