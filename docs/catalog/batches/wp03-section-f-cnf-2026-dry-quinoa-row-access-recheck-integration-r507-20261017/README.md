# WP03 Section F — CNF 2026 dry-quinoa row access hold (R507)

Date: 2026-10-17

## Decision

R507 rechecked access to the CNF 2026 relational files for dry quinoa, Food Code 4495. The official listing confirms the Food Name, Measure Weight Conversion, Measure Name, and Measure Type CSV resources, but their contents could not be retrieved through the browser tool or the workspace network. No local copies were found. Keep the joined-row inspection open and make no claim about 2026 row presence, absence, labels, or values.

Health Canada describes the CNF 2026 package as relational CSV files and says the CNF 2015 online version remains available as an interim route. The official listing and overview establish the edition and access route; neither establishes any Food Code 4495 measurement row. See [Health Canada's CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) and the [CNF 2026 Open Government listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109).

The existing CNF 2015 dry-quinoa observations remain edition-specific on `ingredient-form-quinoa-dry`: 100 mL = 71.9 g and 250 mL = 179.6 g. Do not infer 2026 data from them or transfer the separate cooked-quinoa Food Code 5917 values. The current recipe 016#1 remains linked to cooked quinoa; the recipe corpus has no structured dry-quinoa ingredient demand.

## Verification

- Static ownership and picker projection remain unchanged; no active reference, form, alias, measure, density, mapping, recipe link, or substitution changed.
- The 114-recipe / 1,123-row corpus scan and fingerprint are recorded in the [R507 review](../../proposals/wp03-section-f-next-gap-review-r507-20261017.md).
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests, build, emulator run, or deployment were needed because this is a documentation-only access hold under `AGENTS.md`.

The CNF 2026 row inspection remains open until the four files can be joined directly by `Food_Code`, `Measure_Code`, and `Measure_Type_Code`. See the [R507 proposal](../../proposals/wp03-section-f-next-gap-review-r507-20261017.md).
