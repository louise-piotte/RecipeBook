# WP07 whole-milk portion evidence hold

## Decision

Keep whole-milk portion research open. Health Canada's archived 2015 CNF Food Code 113 page names
fluid, whole, pasteurized, homogenized, 3.25% M.F. milk and reports 100 mL = 103.1 g and 250 mL =
257.8 g. These are historical source-specific portions, not a laboratory density or a generic milk
conversion.

Health Canada identifies the 2015 online CNF as an interim access surface while the CNF 2026
relational files are the current publication. This review could not retrieve the matching 2026 food
and measure rows through the official dataset listing, direct Food Name/Measure Name/Measure
Type/Measure Weight Conversion CSV routes, the full data ZIP, or the advertised CKAN API routes
using the available web tool. This access limitation does not establish that the 2026 files lack a
matching row.

No 2015 or 2026 observation was added to the ledger. The existing `ingredient-ref-milk`
measurement state remains `blocked_pending_evidence`, active `defaultDensity` remains null, and
`unitMappings` remain empty. No recipe line changed. In particular, CNF's 250 mL household cup does
not redefine RecipeBook's `cup` unit, and the 33 linked milk lines are not all demonstrated to use
this exact whole-milk product.

Resume by retrieving the current CNF Food Name and measure rows for the exact whole-milk Food_Code,
then record the 2026 source observation separately from any historical value. Do not infer that an
unavailable row is absent.

## Sources

- [Health Canada CNF 2015, Food Code 113](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=113&lang=eng): exact food description and historical 100 mL and 250 mL portions.
- [Health Canada CNF search guide](https://aliments-nutrition.canada.ca/cnf-fce/help-aide?lang=eng): identifies the page as 2015 and not updated while CNF 2026 access is being improved.
- [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html): confirms 2026 relational CSV publication and the 2015 interface as an interim measure.
- [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109): lists the Food Name, Measure Name, Measure Type, and Measure Weight Conversion resources; the underlying rows were not read.

## Validation

- The source review and current-access attempts are documented in [the detailed proposal](../../proposals/wp07-whole-milk-portion-evidence-review-20261012.md).
- No catalog or research-ledger data changed. This documentation-only hold required no tests or emulator checks.
