# WP03 Section F R580 — grain sorghum CNF 2026 access hold

Date: 2026-10-17

## Decision

R580 rechecked the official CNF 2026 files for grain sorghum, Food Code 4432, and the state scope of the already-recorded CNF 2015 portions. Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) describes CNF 2026 as relational CSV files and says the online CNF 2015 publication remains interim. The [CNF 2015 code-4432 page](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4432) gives 100 mL = 81.2 g, 250 mL = 202.9 g, and 1 serving = 20.0 g, but does not identify whole versus decorticated grain, raw versus cooked state, or a packing method.

The current Food Name, Measure Weight Conversion, Measure Name, and Measure Type CSV contents were inaccessible through the workspace network and browser retrieval. The access failures establish no CNF 2026 row presence or absence, description, state, measure, or value. Keep the code-4432 row join open. Do not create a dry or cooked form or assign the CNF 2015 observations to one.

The bundled corpus has no sorghum recipe demand. No catalog, ledger, recipe, form, alias, measurement, conversion, yield, or substitution data changed. Keep the Section F dry/cooked-grain and millet/sorghum parents open.

## Verification

- Checked the official CNF overview, dataset listing, and 2015 Food Code 4432 page.
- Recorded the four direct CSV access failures without interpreting them as negative row searches.
- Confirmed the existing Food Code 4432 observations and ownership remain unchanged; no new source IDs or measurements were added to the ledger.
- UTF-8/no-BOM, local-link, scoped whitespace, and seed-package validation passed.
- No software tests, build, emulator run, or deployment were needed for this documentation-only access review.

See the [R580 proposal](../../proposals/wp03-section-f-next-gap-review-r580-20261017.md), the [open Section F dry/cooked-form checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4396), and the [R570 cooked-millet CNF 2026 access hold](../wp03-r570-cnf2026-cooked-millet-access-integration-20261017/README.md).
