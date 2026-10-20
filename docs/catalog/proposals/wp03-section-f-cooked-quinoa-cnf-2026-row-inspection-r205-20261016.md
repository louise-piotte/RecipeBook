# WP03 Section F — cooked quinoa CNF 2026 row inspection (R205, 2026-10-16)

**Recommendation: HOLD the measurement review; make no shared-data change.** The official CNF 2026 listing still advertises the Food Name and Measure Weight Conversion CSVs and an all-files ZIP, but their item-level contents could not be retrieved in this audit. No cooked-quinoa 2026 row, 2026 food code, measure, or weight is claimed. The failed retrieval is not evidence that the rows are absent.

This proposal follows the open plan item at [Section F, line 3614](../../RecipeBook-global-ingredient-catalog-plan.txt#L3623), the [R171 recheck](wp03-section-f-cooked-quinoa-cnf-2026-row-recheck-r171-20261016.md), the [2026-10-13 blocked review](wp03-section-f-cooked-quinoa-cnf-2026-row-recheck-20261013.md), and the earlier [portion evidence review](wp03-section-f-cooked-quinoa-portion-evidence-review-20261012.md). It records a fresh attempt to retrieve and inspect the two required CNF 2026 tables.

## Direct inspection result

The official [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1) is indexed with a **2026-10-04** record modification date. It lists the Food Name CSV, Measure Weight Conversion CSV, supporting Measure Name and Measure Type CSVs, and the [all-files ZIP](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip). Listing metadata establishes that the resources are published; it does not establish their row contents.

| Official resource or route tried | Result in this audit |
|---|---|
| [Food Name CSV resource page](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad) | Search indexing exposed the data dictionary, not Food Name records. The dictionary lists `Food_Code`, English and French food descriptions, English and French alternate descriptions, source/group codes, comments, scientific name, and last-updated date. It provides no quinoa code or description row. Opening the resource page returned 403. |
| [Food Name CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Direct browser open was unavailable. A local `curl` attempt failed because this environment could not resolve `open.canada.ca`; no CSV bytes or quinoa rows were read. |
| [Measure Weight Conversion CSV resource page](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76) and [download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Resource listing confirms the file; direct browser retrieval was unavailable. The local download attempt failed at DNS resolution. No conversion row, measure code, amount, or weight was read. |
| [All-files ZIP](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip) | The official listing advertises the ZIP, but the direct browser open was unavailable. Its contents were not inspected. |
| French Open Government route: [Food Name CSV](https://ouvert.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [Measure Weight Conversion CSV](https://ouvert.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | French-host download URLs were also unavailable in the browser. The French dataset listing confirms the resource names, not rows. |
| Official portal API and datastore alternatives for both files: [Food Name resource metadata API](https://open.canada.ca/data/api/3/action/resource_show?id=e1ffee62-58cb-4e3e-b359-115c658388ad), [Food Name datastore search](https://open.canada.ca/data/api/3/action/datastore_search?resource_id=e1ffee62-58cb-4e3e-b359-115c658388ad&q=quinoa), [Food Name CSV dump](https://open.canada.ca/data/en/datastore/dump/e1ffee62-58cb-4e3e-b359-115c658388ad?format=csv), [measure-weight metadata API](https://open.canada.ca/data/api/3/action/resource_show?id=bb76d816-3ac0-4749-8c4b-f0dbfd0fac76), [measure-weight datastore search](https://open.canada.ca/data/api/3/action/datastore_search?resource_id=bb76d816-3ac0-4749-8c4b-f0dbfd0fac76&q=quinoa), and [measure-weight CSV dump](https://open.canada.ca/data/en/datastore/dump/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76?format=csv) | These official alternate routes were not accessible through the browser tool. The local network could not resolve the portal host. No API result or table row was retrieved. |

Health Canada’s [CNF page](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) is accessible and says CNF 2026 is distributed as relational CSV files. It also explicitly describes the online 2015 CNF as an interim access measure while Health Canada works toward a more user-friendly 2026 access method. The 2015 online cooked-quinoa page therefore cannot answer this 2026 row check. The search-indexed 2026 Food Name data dictionary is schema metadata only; it does not substitute for the requested record inspection.

The exact 2026 cooked-quinoa Food Name row and its associated Measure Weight Conversion rows remain **unverified**. In particular, this packet establishes none of the following: a 2026 bilingual cooked-food description, a 2026 join key, whether such a row is present, measure labels or types, portion quantities, or weights. Do not assume that CNF 2015 food code `5917` is the 2026 key, and do not interpret inaccessible files as a negative search result.

## Measurement and recipe audit

The existing ledger record `ingredient-form-quinoa-cooked` remains `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It retains four separate historical portion observations:

| Publication | Portion retained in the ledger | Treatment |
|---|---:|---|
| Health Canada CNF 2015, food code 5917 | 100 mL = 78.2 g; 125 mL = 97.7 g; 250 mL = 195.5 g | Keep as CNF 2015 source-specific portions; the page states no packing method. |
| Health Canada, *Nutrient Value of Some Common Foods* (2008) | 125 mL = 73 g | Keep separately as a 2008 household-portion observation. |

The two 125 mL amounts conflict. Keep both publication-specific observations, do not average them, and do not promote either to an active measure, density, unit mapping, reusable volume conversion, or cooking yield. No 2026 observation is justified by the resources list or by the older editions.

The manifest-listed recipe corpus still has one structured quinoa line: recipe **016#1**, “2 cups cooked quinoa,” linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`. Preserve its wording, quantity, unit, and existing link. The historical portions do not establish a recipe-specific mass, and this failed 2026 retrieval supports no recipe edit, dry-to-cooked yield, or substitution.

## Source register

The `R205` references below are proposal-local only; no source IDs, ledger records, observations, catalog IDs, or recipe IDs are allocated.

| Key | Source and exact URL | What it establishes |
|---|---|---|
| `R205-S01` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | CNF 2026 uses relational CSV files; the 2015 online interface remains interim access. This provides publication context, not quinoa row data. |
| `R205-S02` | Open Government Portal, [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109?res_page=1) | Indexed listing updated 2026-10-04; lists the Food Name, Measure Weight Conversion, supporting measure tables, and all-files ZIP. |
| `R205-S03` | Open Government Portal, [Food Name resource metadata](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad) and [CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Indexed schema metadata is visible, but the exact file records could not be fetched. |
| `R205-S04` | Open Government Portal, [Measure Weight Conversion resource metadata](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76) and [CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | The listing identifies the table; neither rows nor field values were retrieved. |
| `R205-S05` | Open Government Portal, [all-files CNF 2026 ZIP](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip) | Listed by the official dataset, but its contents were unavailable in this audit. |
| Existing `WP03-S5-COOKED-5917` | Health Canada, [CNF 2015 cooked quinoa, food code 5917](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5917) | Existing ledger source for the cooked-state label and 2015 portions only; it does not verify a CNF 2026 identifier or value. |
| Existing `WP03-QCM-20261012-S04` | Health Canada, [*Nutrient Value of Some Common Foods* (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html) | Existing ledger source for the separate 2008 125 mL = 73 g portion only. |

## Disposition

Keep the Section F checklist item open, retain `measurementState: not_yet_researched`, preserve the four historical observations, and preserve recipe 016#1’s existing cooked-form link. Make no change to the shared catalog, ledger, recipe data, plan, roadmap, or generated files. Reopen the measurement decision after the official 2026 Food Name and Measure Weight Conversion contents can be retrieved and joined using the 2026 documentation. Then record only verified 2026 rows as separate source-specific observations and reconsider the state without overwriting the 2008 or 2015 evidence.

This is proposal-only research and does not change database JSON. No software tests or emulator checks were run. Under the current `AGENTS.md`, if a later integration only adds data to database JSON files, no tests are required for that data-only change.
