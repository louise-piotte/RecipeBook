# WP03 Section F R270 — wild-rice CNF 2026 row-access review

## Decision

Rechecked the official CNF 2026 resource listing and the Food Name, Measure Weight Conversion, Measure Name, and Measure Type download routes for the existing wild-rice dry and cooked forms. The official listing confirms the relational CSV resources, but the CSV contents could not be retrieved through the available browser or the restricted local network. No 2026 row-presence or absence claim is made.

Keep `ingredient-ref-wild-rice` at `measurementState: not_yet_researched`. Do not infer 2026 measurements from the existing CNF 2015 serving pages. No catalog, ledger, recipe, or generated-index data changed. The row-level review remains open until the official CSV contents can be inspected and joined.

## Sources and review record

- [Health Canada — Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html): identifies the 2026 relational CSV files and the 2015 online CNF as interim access.
- [Open Government Portal — Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109): official dataset listing for the Food Name, Measure Weight Conversion, Measure Name, and Measure Type resources.
- [R270 proposal](../../proposals/wp03-next-section-f-gap-review-r270-20261016.md): records the wild-rice catalog state, source-specific CNF 2015 context, access attempts, and exact follow-up procedure.

The review attempted the portal resource pages, direct CSV download URLs, and read-only local URL retrieval. Browser access to the raw files failed; local retrieval failed before receiving data with a name-resolution error. No downloaded data or new source/observation IDs were produced.

## Files updated

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: logged the completed access recheck while leaving the CNF 2026 row inspection open.
- `roadmap.md`: recorded the review and its unresolved access limitation.
- This README: captured the disposition and evidence boundaries.

No software tests, builds, emulator checks, or deployments were needed for this documentation-only review.
