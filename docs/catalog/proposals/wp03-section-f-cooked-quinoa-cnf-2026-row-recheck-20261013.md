# WP03 Section F — cooked quinoa CNF 2026 row recheck (2026-10-13)

**Status: Integrated as a documented blocked recheck on 2026-10-13.** The cooked-quinoa identity is supported by the readable CNF 2015 row, but that does not establish what appears in CNF 2026. Health Canada’s current page identifies CNF 2026 as relational CSV data and describes the 2015 online file as interim. On 2026-10-13, the official 2026 Food Name and Measure Weight Conversion contents could not be fetched through the available browser. Keep the measurement review open and `measurementState` unchanged. See [the integration note](../batches/wp03-section-f-cooked-quinoa-cnf-2026-blocked-review-integration-20261013/README.md).

## Open plan item

The active plan asks to inspect CNF 2026 Food Name and Measure Weight Conversion rows for cooked quinoa before closing the measurement review or changing `measurementState`; the CSV links returned 403 during the 2026-10-12 review (`docs/RecipeBook-global-ingredient-catalog-plan.txt`, lines 2185–2187).

| Finding | Status | What the evidence establishes |
|---|---|---|
| Cooked quinoa identity | Supported at the 2015 CNF scope | CNF 2015 food code 5917 is labelled “Grains, quinoa, cooked / Grains céréaliers, quinoa, cuit,” matching the active cooked state. |
| CNF 2026 food identity and measure rows | Blocked | Current official resources are listed, but their contents remain inaccessible through the available browser. No 2026 row, code, portion, or weight is claimed. |
| Measurement review | Remains open | The 2026 check has not been completed. Keep the ledger state `not_yet_researched`; do not close the review based on the older publication. |

## Current identity and ledger state

The active reference is `ingredient-ref-quinoa` (`quinoa` / `quinoa`, category `GRAIN_AND_CEREAL`). The form `ingredient-form-quinoa-cooked` is labelled `quinoa, cooked` / `quinoa, cuit`, with `prepState: cooked`. The form has no match terms or density. The reference has no aliases, default density, or unit mappings. The cooked-form ledger record has `identityState: verified` and `measurementState: not_yet_researched`.

The readable CNF 2015 food-code-5917 page reports 100 mL = 78.2 g, 125 mL = 97.7 g, and 250 mL = 195.5 g, with 0% total refuse; it states no packing method. The existing ledger also records Health Canada’s 2008 cooked-quinoa household portion of 125 mL = 73 g. Keep these as publication-specific evidence. The two 125 mL weights differ, so do not average them or turn them into a reusable density, unit mapping, conversion, or cooking yield.

I rescanned the live manifest-listed package: it contains 114 recipe files and 1,123 structured ingredient rows. Recipe 016, ingredient 1, remains the only structured quinoa row: “2 cups cooked quinoa,” linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`. Preserve its text, link, quantity, and unit. The existing dry-quinoa form remains a separate state; these sources do not support a dry-to-cooked yield or substitution.

## CNF 2026 access recheck

All source checks below were made on 2026-10-13.

| Official source or endpoint | Result |
|---|---|
| [Health Canada: Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Accessible. Health Canada says the CNF is published as relational, Excel-compatible CSV files; links to the 2026 file and a 2026 database-structure guide; and says the 2015 online search remains available as an interim measure while a more user-friendly 2026 access method is developed. The page is dated 2026-06-19. |
| [Open Government Portal: CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1) | Search indexing on the access date showed the Health Canada dataset record with a 2026-10-04 update and listed the all-files ZIP, Food Name CSV, and Measure Weight Conversion CSV. Opening the dataset record returned 403. The indexed listing establishes that the resources are listed, not their row contents. |
| [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Direct open/download was unavailable through the browser. No cooked-quinoa row or identifier was read. |
| [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Direct open/download was unavailable through the browser. No measure or weight row was read. |
| [All-files CNF 2026 ZIP](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip) | Direct open/download was unavailable through the browser. |
| [French Open Government Portal food-name CSV](https://ouvert.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [measure-weight CSV](https://ouvert.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | French-host download attempts were also unavailable through the browser. |
| [CNF 2015 cooked-quinoa serving-size page, code 5917](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5917) | Accessible. Confirms the exact bilingual cooked-state label and the historical 2015 portion values listed above. |
| [CNF 2015 food search](https://food-nutrition.canada.ca/cnf-fce/newSearch) | Accessible, but explicitly describes itself as the 2015 publication and says it will not be updated while Health Canada works toward friendlier access to CNF 2026. It cannot answer the 2026 row question. |

“Unavailable through the browser” describes this review’s source-access limit. It is not evidence that the 2026 files lack a cooked-quinoa row or a measure-weight entry.

## Follow-up when the 2026 files are accessible

1. Use the 2026 structure and file-content guide to identify the official join fields. Do not assume that the 2015 food code `5917` remains the 2026 identifier or join key.
2. Search the Food Name file using the English and French cooked-quinoa descriptions, then inspect the returned food identity, food code or identifier, alternate descriptions, and relevant comments as provided by the 2026 file.
3. Join that 2026 food identifier to all of its Measure Weight Conversion rows using the documented key. Consult the 2026 measure-name and measure-type files to interpret each measure label and unit. Record the reported values exactly and preserve the source edition.
4. Confirm that each returned row describes cooked quinoa rather than dry quinoa or another preparation. Do not treat a missing row as confirmed until the retrieved file and the search terms are documented.
5. Keep any 2026 portions separate from the existing 2008 and 2015 observations. Do not average conflicting source-version values or promote a published portion into density, unit mapping, general conversion, or cooking yield without evidence that supports that use.

## Disposition

This recheck supports the existing cooked-form identity only at the CNF 2015 level. It does not resolve the planned CNF 2026 inspection. Keep the plan item open, leave `measurementState: not_yet_researched`, and retain all four existing source-specific observations unchanged. Add no measurement, density, unit mapping, conversion, yield, substitution, recipe link, or catalog entry from this blocked check.

The blocked recheck is recorded in the plan and roadmap. No catalog JSON, ledger, recipe, or application file changed. No app tests or emulator checks were run because this was documentation-only.
