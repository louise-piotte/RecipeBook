# WP03 Section F R834 — CNF 2026 parboiled-rice row access recheck

- **Reviewed:** 2026-10-19.
- **Target:** Health Canada Canadian Nutrient File (CNF) 2026 Food Code 4472, corresponding to the existing `ingredient-ref-parboiled-rice` identity.
- **Recommendation:** Keep the CNF 2026 row inspection open. The official release and relational files are listed, but their row contents could not be retrieved or queried in this review. Make no claim that Food Code 4472 is present, absent, renamed, or measured in the 2026 files.
- **Write scope:** Proposal only. No ledger, active catalog, recipe, or plan data changes are recommended.

## Open item and separation from completed work

The Section F checklist records the CNF 2015 Food Code 4472 dry-parboiled-rice portions and the exact 25.7 g input to the stated 125 mL prepared-product amount. It explicitly leaves the CNF 2026 join open ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L567); [R825 proposal](wp03-section-f-next-gap-review-r825-20261019.md); [R824–R826 integration README](../batches/wp02-wp03-wp04-r824-r826-gap-review-integration-20261019/README.md)). R834 rechecks only that still-open 2026 row access. It does not repeat R825's completed 2015 observations, R828's common-millet amount-to-make entries, or R831's white-rice Food Code 4471 entries.

The next valid measurement review would require joining the official 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type files for Food Code 4472. Until those row contents are available, an empty result from this review environment cannot establish that the food or measures are absent from the edition.

## Official source review

Health Canada's current [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) identifies CNF 2026 as downloadable relational CSV files and says the CNF 2015 online search remains available as an interim access path. The [official 2026 Open Government Portal dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the required English CSV resources:

- [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv)
- [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv)
- [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv)
- [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv)

During this review, the web tool could open the Health Canada overview and the existing [CNF 2015 Food Code 4472 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4472), but direct opens of each 2026 CSV returned “not accessible” and the Open Government Portal resource page returned HTTP 403. The documented CKAN GET route was also attempted at `/data/en/api/3/action/`: `package_show` for the CNF dataset, `resource_show` for the Food Name resource, and `datastore_search` against Food Name and Measure Weight Conversion using the CSV resource IDs. None returned API JSON through the web tool. A read-only workspace fetch of the official CSV also failed before connection because DNS resolution for `open.canada.ca` was unavailable. The French Open Government Portal host did not expose the CKAN response either. The accessible official listing confirms the 2026 resources exist; it does not expose Code 4472 row contents. Accordingly, the 2015 page's bilingual label and values remain the already-recorded 2015 evidence only.

The 2015 page identifies **“Grains, rice, white, long-grain, parboiled, dry / Grains céréaliers, riz blanc, grain long, étuvé, sec”**, Food Code 4472, and displays 100 mL = 78.2 g, 250 mL = 195.5 g, and “amount to make 125 mL” = 25.7 g. Those observations are already integrated by R825. Do not treat them as evidence of any CNF 2026 row, carry-forward, or change.

The existing terminology source, the [OQLF *riz étuvé* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488742/riz-etuve), still identifies *riz étuvé* as the preferred Québec French term and *parboiled rice* as English. It lists *riz précuit* only for some contexts and identifies “Converted rice” as a trademark. The active aliases remain empty; no alias change is proposed. This entry was updated in 1988 and does not support current measurements.

## Current catalog and ledger ownership

The live bundled catalog contains **1,886 references** and **199 forms**. `ingredient-ref-parboiled-rice` remains `parboiled rice / riz étuvé`, category `GRAIN_AND_CEREAL`, with empty alias arrays, null `defaultDensity`, and empty `unitMappings`. No form is currently attached to that reference.

The existing ledger row is `ingredient-ref-parboiled-rice`, with identity `verified`, measurement `researched_supported`, and substitution research `not_yet_researched`. It already owns the source-specific CNF 2015 entry `WP03-S52`, the OQLF/Codex identity sources, the R825 CFIA guidance source, and R825's three CNF 2015 observations. No CNF 2026 source ID or CNF 2026 row-level evidence is recorded in the ledger; its existing Food Code 4472 entries are CNF 2015 only. R834 allocates no new source ID and recommends no edit to the existing R825 source, observations, or decision.

The identity boundary remains unchanged: the CNF 2015 description is specifically white, long-grain, dry parboiled rice, while the active reference is the broader processing identity. Do not use the unverified 2026 row to add a form or assign measurements to a dry parboiled form. The broader portion values remain source- and edition-specific, not a density or generic measure. No reviewed source evaluates a substitution; leave substitution research unchanged and add no finding or rule.

## Picker and bundled-recipe audit

Because this proposal changes no reference, form, alias, or recipe, the current picker projection is unchanged. The active bilingual `parboiled rice / riz étuvé` identity remains the sole exact identity result for those exact terms. No dry form hint is available or added, and none of the CNF measurement labels are added as searchable ingredient aliases.

The manifest lists **114 recipe files** and a read-only count found **1,123 structured ingredient rows**. Searching recipe titles, instructions, notes, ingredient text, and links found no mention or link for parboiled rice / *riz étuvé*. No recipe demand supports creating a dry form, measure, conversion, recipe link, or substitution in this review.

## Exact recommended disposition

Keep the CNF 2026 Food Code 4472 join open until the official file contents can be retrieved and all four relational tables can be joined. For this proposal:

- Make no change to `docs/catalog/research-ledger.v1.json` and add no 2026 source record or measurement observation.
- Preserve all three R825 CNF 2015 observations and their existing source ownership unchanged.
- Make no change to active references, aliases, forms, densities, unit mappings, recipes, conversions, yields, or substitution records.
- Do not characterize the CNF 2026 row as present or missing, or infer a label, measure, value, preparation state, or update to the 2015 values.

This is an evidence-access hold, not a conclusion that the 2026 source lacks a parboiled-rice row. A future review should record an exact row join only from retrieved official CSV contents or a verifiable official query result, keeping edition-specific values and source ownership separate.

## Static checks and no-test rule

Static inspection confirmed the existing target identity and its empty aliases/numeric fields, no attached form, the existing R825 source and observations, no CNF 2026 Code 4472 ledger ownership, no source-ID collision from this hold, and no matching recipe text or links in the manifest package. This R834 review changes only this proposal file. No tests, build, emulator run, or deployment are needed for this documentation-only access hold; if a later accepted change only adds database JSON data, the `AGENTS.md` exception also says no testing is needed.
