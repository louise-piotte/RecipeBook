# WP03 Section F R570 — cooked-millet CNF 2026 access review

Date: 2026-10-17

## Decision

R570 rechecked whether the official CNF 2026 relational files could be joined for cooked millet, Food Code 4492. Health Canada's [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) describes the 2026 release as relational CSV files, and the [Open Government listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the Food Name, Measure Weight Conversion, Measure Name, and Measure Type resources. In this review environment, direct file requests failed at DNS resolution and browser access to the download, listing, and API routes failed or was inaccessible.

The access failures establish no Food Code 4492 row presence or absence, description, scientific name, measure, or value. Keep the current-edition join open. R567's CNF 2015 observations remain the only row-level measurements recorded for generic cooked millet: 100 mL = 73.5 g, 125 mL = 91.9 g, and 250 mL = 183.9 g.

No catalog, ledger, recipe, form, alias, measurement, conversion, yield, or substitution data changed. The broader Section F dry/cooked-grain parent remains open.

## Verification

- Confirmed the official dataset listing and its resource descriptions; no current CNF 2026 row content was available to inspect.
- Recorded the workspace-only retrieval failures without interpreting them as negative searches.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed for this documentation-only access review.

See the [R570 review](../../proposals/wp03-section-f-cnf-2026-cooked-millet-row-review-r570-20261017.md), the [R567 integration](../wp03-r567-cooked-millet-cnf2015-integration-20261017/README.md), and the still-open [WP03 Section F checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4383).
