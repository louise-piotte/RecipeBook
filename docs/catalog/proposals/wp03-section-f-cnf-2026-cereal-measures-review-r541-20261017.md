# WP03 Section F — CNF 2026 dry/cooked grain measures (R541, 2026-10-17)

**Status: integrated.** The official CNF 2026 downloads are now readable. Food Codes 4523, 4495, and 5917 each have a Food Name row and five Measure Weight Conversion rows, all of which join to Measure Name and Measure Type. Integrated only five edition-specific volume-to-mass observations: three for cooked white long-grain rice on the existing cooked-rice ledger record, and two for dry quinoa on its existing dry form. The cooked-quinoa 5917 values match the observations already integrated under R267; leave that record unchanged. Added five source-specific observations and eight Food Code-specific source entries to the research ledger. Closed the 4523 and 4495 row-inspection items in the active plan and recorded the integration in `roadmap.md`; no catalog, picker, recipe, measure, conversion, or substitution data changed.

## Scope and retrieval

This integration closes the row-level evidence gaps for cooked white long-grain rice and dry quinoa in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4373). The prior [R503 rice review](wp03-section-f-cnf-2026-cooked-white-long-grain-rice-row-inspection-r503-20261017.md) and [R507 dry-quinoa review](wp03-section-f-next-gap-review-r507-20261017.md) could not fetch CSV contents. The cooked-quinoa row was already joined and integrated in [R267](wp03-next-section-f-gap-review-r267-20261016.md); this review independently rechecks that target against the same downloads.

On 2026-10-17, read-only requests returned HTTP 200 for the four direct CSV downloads. The files were parsed in memory, without saving a local copy. Filtering `Food_Name.Food_Code` and `Measure_Weight_Conversion.Food_Code` for each exact requested code returned one Food Name row and five conversion rows per code. Every returned `Measure_Code` and `Measure_Type_Code` joined to a row in the listed Measure Name and Measure Type files; no unmatched join key or target code absence was found.

Health Canada describes CNF 2026 as relational CSV data and the CNF 2015 online search as interim access. Its [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) and the [official Open Government CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) establish the edition and its downloads. The downloadable rows below, rather than listing metadata, are the row-level evidence.

## Food Name rows

The joined file headers are `Food_Code`, `Food_Description_EN`, `Food_Description_FR`, `Alternate_Description_EN`, `Alternate_Description_FR`, `Food_Source_Code`, `USDA_NDB_Code`, `CNF_Food_Group_Code`, `Comment_EN`, `Comment_FR`, `ScientificName`, and `Food_Last_Updated_Date`.

| `Food_Code` | `Food_Description_EN` | `Food_Description_FR` | Alternate descriptions (EN / FR) | Other identifying fields | Food row last updated |
|---:|---|---|---|---|---|
| 4523 | `Grains, rice, white, long-grain, regular, cooked` | `Grains céréaliers, riz blanc, grain long, ordinaire, cuit` | `long grain` / blank | `Food_Source_Code=3`; `USDA_NDB_Code=20445`; `CNF_Food_Group_Code=20`; comments blank | 2026-01-28 |
| 4495 | `Grains, quinoa, dry` | `Grains céréaliers, quinoa, sec` | blank / blank | `Food_Source_Code=3`; `USDA_NDB_Code=20035`; `CNF_Food_Group_Code=20`; `ScientificName=Chenopodium quinoa Willd.`; comments blank | 2012-07-31 |
| 5917 | `Grains, quinoa, cooked` | `Grains céréaliers, quinoa, cuit` | blank / blank | `Food_Source_Code=3`; `USDA_NDB_Code=20137`; `CNF_Food_Group_Code=20`; scientific name and comments blank | 2012-07-30 |

The rice row is specifically white, long-grain, regular, and cooked. The two quinoa rows describe separate dry and cooked foods. Their Food Codes in this edition match the historical codes, but each edition’s observations remain separate.

## Joined measure rows

`Measure_Type_Code=6` joins to `User-defined / Défini par l'utilisateur`; code `3` joins to `Refuse / Portion non comestible`. All measure rows join to the following exact bilingual Measure Name labels. The “last updated” column is the row field `Measure_Weight_Conversion_Last_Updated_Date`; it is not the CNF edition date.

| Food Code | Type code and label | Measure code | Measure label EN / FR | `Measure_Weight_Conversion` value / interpretation | Row last updated |
|---:|---|---:|---|---:|---|
| 4523 | 6 — User-defined / Défini par l'utilisateur | 341 | `100 ml` / `100 ml` | 66.779 g | 2023-05-26 |
| 4523 | 6 — User-defined / Défini par l'utilisateur | 383 | `125 ml` / `125 ml` | 83.474 g | 2003-08-25 |
| 4523 | 6 — User-defined / Défini par l'utilisateur | 415 | `250 ml` / `250 ml` | 166.948 g | 2003-08-25 |
| 4523 | 6 — User-defined / Défini par l'utilisateur | 1457 | `140 g` / `140 g` | 140 g | 2004-08-27 |
| 4523 | 3 — Refuse / Portion non comestible | 750 | `total refuse` / `portion non comestible totale` | 0 (refuse entry; not edible mass) | 1997-05-01 |
| 4495 | 6 — User-defined / Défini par l'utilisateur | 341 | `100 ml` / `100 ml` | 71.851 g | 1997-05-01 |
| 4495 | 6 — User-defined / Défini par l'utilisateur | 867 | `1 serving` / `1 portion` | 20 g | 2003-08-25 |
| 4495 | 6 — User-defined / Défini par l'utilisateur | 415 | `250 ml` / `250 ml` | 179.628 g | 2003-08-25 |
| 4495 | 6 — User-defined / Défini par l'utilisateur | 1601 | `45 g` / `45 g` | 45 g | 2004-08-27 |
| 4495 | 3 — Refuse / Portion non comestible | 750 | `total refuse` / `portion non comestible totale` | 0 (refuse entry; not edible mass) | 1997-05-01 |
| 5917 | 6 — User-defined / Défini par l'utilisateur | 341 | `100 ml` / `100 ml` | 78.191 g | 2011-06-14 |
| 5917 | 6 — User-defined / Défini par l'utilisateur | 383 | `125 ml` / `125 ml` | 97.739 g | 2011-06-14 |
| 5917 | 6 — User-defined / Défini par l'utilisateur | 415 | `250 ml` / `250 ml` | 195.477 g | 2011-06-14 |
| 5917 | 6 — User-defined / Défini par l'utilisateur | 1457 | `140 g` / `140 g` | 140 g | 2005-04-21 |
| 5917 | 3 — Refuse / Portion non comestible | 750 | `total refuse` / `portion non comestible totale` | 0 (refuse entry; not edible mass) | 2005-04-21 |

The three target codes all have confirmed rows, so there is no absence claim. Each target has three useful volume entries plus two additional source rows: a mass-labelled entry (`140 g` for 4523 and 5917; `45 g` for 4495), and a total-refuse entry. Dry quinoa also has `1 serving = 20 g`. These rows are included above to preserve the complete join. The mass-labelled rows add no volume equivalence; the serving row has no volume basis; and refuse is not edible food. Do not use any of these three classes as active volume mappings or portion-weight observations in this batch.

## Edition comparison and integrated ledger delta

The currently owned records already have `measurementState: researched_supported` for source-specific observations. Keep those states. Preserve the following editions as distinct ledger evidence:

| Existing ledger record | Existing observations | CNF 2026 comparison | Integrated disposition |
|---|---|---|---|
| `ingredient-form-rice-cooked` | CNF 2015 Food Code 4523: 100 mL = 66.8 g; 125 mL = 83.5 g; 250 mL = 166.9 g. | 66.779 / 83.474 / 166.948 g, which round to the existing values. | Append three separate CNF 2026 `portion_weight` observations. Do not overwrite the 2015 rows. |
| `ingredient-form-quinoa-dry` | CNF 2015 Food Code 4495: 100 mL = 71.9 g; 250 mL = 179.6 g. | 71.851 / 179.628 g, which round to the existing values. | Append two separate CNF 2026 `portion_weight` observations. Do not overwrite the 2015 rows. |
| `ingredient-form-quinoa-cooked` | CNF 2015 Food Code 5917: 100 mL = 78.2 g; 125 mL = 97.7 g; 250 mL = 195.5 g. Health Canada’s 2008 booklet: 125 mL = 73 g. | 78.191 / 97.739 / 195.477 g, which round to the existing CNF 2015 values. | No ledger change: R267 already recorded these exact CNF 2026 observations. Retain the conflicting 2008 125 mL value separately. |

The five integrated observations use `relationship: portion_weight`, `evidenceKind: published_portion`, the existing form IDs, and the exact stored grams and volumes in the joined rows. Each describes a CNF 2026-edition portion; no filling or packing protocol is reported, and no density or extrapolation is derived.

Integrated observation IDs:

- `cooked-rice-cnf2026-100ml-portion-r541-20261017`
- `cooked-rice-cnf2026-125ml-portion-r541-20261017`
- `cooked-rice-cnf2026-250ml-portion-r541-20261017`
- `quinoa-dry-cnf2026-100ml-portion-r541-20261017`
- `quinoa-dry-cnf2026-250ml-portion-r541-20261017`

For interval observations, `validate_research_ledger` in [`bundled_seed_package.py`](../../../tools/seed_package/bundled_seed_package.py#L510) checks that cited sources are attached to the same record. The five portions here do not use value intervals, but their evidence is kept record-local and each cites only sources attached to its target record. Existing R267 source IDs `WP03-CNF2026-QUINOA-R267-S01` through `S04` belong to the cooked-quinoa 5917 record (and `S02` is also used by the maple-syrup record), so they do not support the cooked-rice or dry-quinoa observations. The following four source entries were added to each target record.

For each source entry below, set `versionOrDate` to `CNF 2026 relational file`, `accessedOn` to `2026-10-17`, and `sourceKind` to `food_composition`. The `title`, URL, `locator`, and `supports` text identify the source and its contribution. These eight source IDs were checked against the current ledger and prior proposal archive, were unowned before integration, and are now allocated to their target records.

| Target record | Integrated source ID | Official CSV URL and title | Locator | Supports |
|---|---|---|---|---|
| `ingredient-form-rice-cooked` | `WP03-CNF2026-RICE-4523-R541-S01` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv); Health Canada, Canadian Nutrient File 2026, Food Name file | `Food_Code 4523; English and French descriptions, alternate descriptions, and Food_Last_Updated_Date.` | Food Code 4523 is `Grains, rice, white, long-grain, regular, cooked / Grains céréaliers, riz blanc, grain long, ordinaire, cuit`; alternate EN is `long grain`, alternate FR is blank, and the food row date is 2026-01-28. |
| `ingredient-form-rice-cooked` | `WP03-CNF2026-RICE-4523-R541-S02` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv); Health Canada, Canadian Nutrient File 2026, Measure Weight Conversion file | `Food_Code 4523; Measure_Type_Codes 3 and 6; Measure_Codes 341, 383, 415, 1457, and 750; exact values and row dates.` | Reports 66.779 g/100 mL, 83.474 g/125 mL, and 166.948 g/250 mL; also has the mass-labelled 140 g row and a total-refuse entry, which are not volume portions. |
| `ingredient-form-rice-cooked` | `WP03-CNF2026-RICE-4523-R541-S03` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv); Health Canada, Canadian Nutrient File 2026, Measure Name file | `Measure_Codes 341, 383, 415, 1457, and 750; English and French measure names.` | Supplies the bilingual labels for all five measure codes joined to Food Code 4523, including the three volume labels, `140 g`, and total refuse. |
| `ingredient-form-rice-cooked` | `WP03-CNF2026-RICE-4523-R541-S04` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv); Health Canada, Canadian Nutrient File 2026, Measure Type file | `Measure_Type_Codes 3 and 6; English and French type descriptions.` | Confirms type 6 is `User-defined / Défini par l'utilisateur` and type 3 is `Refuse / Portion non comestible`. |
| `ingredient-form-quinoa-dry` | `WP03-CNF2026-QUINOA-4495-R541-S01` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv); Health Canada, Canadian Nutrient File 2026, Food Name file | `Food_Code 4495; English and French descriptions, alternate descriptions, ScientificName, and Food_Last_Updated_Date.` | Food Code 4495 is `Grains, quinoa, dry / Grains céréaliers, quinoa, sec`; alternate descriptions are blank, the scientific name is `Chenopodium quinoa Willd.`, and the food row date is 2012-07-31. |
| `ingredient-form-quinoa-dry` | `WP03-CNF2026-QUINOA-4495-R541-S02` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv); Health Canada, Canadian Nutrient File 2026, Measure Weight Conversion file | `Food_Code 4495; Measure_Type_Codes 3 and 6; Measure_Codes 341, 867, 415, 1601, and 750; exact values and row dates.` | Reports 71.851 g/100 mL and 179.628 g/250 mL; also has `1 serving = 20 g`, a mass-labelled 45 g row, and a total-refuse entry, which are not volume portions. |
| `ingredient-form-quinoa-dry` | `WP03-CNF2026-QUINOA-4495-R541-S03` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv); Health Canada, Canadian Nutrient File 2026, Measure Name file | `Measure_Codes 341, 867, 415, 1601, and 750; English and French measure names.` | Supplies the bilingual labels for all five measure codes joined to Food Code 4495, including the two volume labels, `1 serving / 1 portion`, `45 g`, and total refuse. |
| `ingredient-form-quinoa-dry` | `WP03-CNF2026-QUINOA-4495-R541-S04` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv); Health Canada, Canadian Nutrient File 2026, Measure Type file | `Measure_Type_Codes 3 and 6; English and French type descriptions.` | Confirms type 6 is `User-defined / Défini par l'utilisateur` and type 3 is `Refuse / Portion non comestible`. |

Each 4523 observation cites `WP03-CNF2026-RICE-4523-R541-S01` through `S04`; each 4495 observation cites `WP03-CNF2026-QUINOA-4495-R541-S01` through `S04`. These target-record entries use the same official URLs as R267 but scope the source locator and supports to the relevant Food Code. Keep the existing R267 source entries and observations on `ingredient-form-quinoa-cooked` unchanged.

The values support source-specific portions only. They do not report a fill or packing method. The dry and cooked quinoa rows are separate food records, not a cooking experiment; do not calculate a dry-to-cooked yield or substitution. Do not add density, unit mappings, active measures, recipe masses, or substitutions. The older and current-edition values agree after rounding for the three foods; the 2008 cooked-quinoa 125 mL value still differs and must not be averaged with either CNF edition.

## Catalog, picker, and recipe implications

The current catalog has distinct `ingredient-ref-rice`, `ingredient-ref-white-rice`, and identity-only `ingredient-ref-long-grain-rice` references; the cooked rice Food Code 4523 evidence is already scoped to `ingredient-form-rice-cooked` by the prior R307 review. Keep that owner and do not transfer its evidence to the white-rice form or create a long-grain form. Generic quinoa remains `ingredient-ref-quinoa` with separate dry and cooked forms. This is ledger-only evidence and changes no search term, alias, picker result, or conversion behavior.

The 114-file recipe manifest has 1,123 structured ingredient rows. The only quinoa line is recipe 016#1, `2 cups cooked quinoa`, already linked to `ingredient-form-quinoa-cooked`; there is no dry-quinoa line. Rice-related rows include three generic cooked-rice lines, one `cooked white rice` line already linked to the separate white-rice form, and one crispy-rice-cereal line owned by its cereal reference. None asks for long-grain rice explicitly. Preserve every recipe text, quantity, unit, and existing link. No recipe mass or cooking yield follows from these published portions.

## Source register and limits

The following are official primary source URLs; the direct CSVs were retrieved on 2026-10-17 and parsed in memory.

| Source | Exact URL | Use |
|---|---|---|
| Health Canada, CNF overview | [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Confirms the relational CSV format and describes the online 2015 CNF as interim access; it does not establish these row values. |
| Open Government Portal, CNF 2026 listing | [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Identifies the official edition and resources. Listing metadata alone is not row evidence. |
| Food Name CSV | [Direct download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Exact bilingual food descriptions and row dates for Food Codes 4523, 4495, and 5917. Existing `WP03-CNF2026-QUINOA-R267-S01` belongs to the 5917 record; record-specific 4523 and 4495 source entries are integrated above. |
| Measure Weight Conversion CSV | [Direct download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | All five conversion entries per target code, including exact values and row dates. Existing `WP03-CNF2026-QUINOA-R267-S02` belongs to the 5917 record and is also used by the maple-syrup record; record-specific 4523 and 4495 source entries are integrated above. |
| Measure Name CSV | [Direct download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | English and French labels for every measure code used above. Existing `WP03-CNF2026-QUINOA-R267-S03` belongs to the 5917 record; record-specific 4523 and 4495 source entries are integrated above. |
| Measure Type CSV | [Direct download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Confirms type 6 (`User-defined`) and type 3 (`Refuse`). Existing `WP03-CNF2026-QUINOA-R267-S04` belongs to the 5917 record; record-specific 4523 and 4495 source entries are integrated above. |
| CNF 2015 cooked-rice page | [Food Code 4523](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523) | Existing `WP03-SECTION-F-R307-20261016-S01` owns the three historical rice observations. It is not the CNF 2026 source. |
| CNF 2015 dry-quinoa page | [Food Code 4495](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495) | Existing `WP03-QUINOA-DRY-CNF2015-R303-20261016-S01` owns the two historical dry-quinoa observations. It is not the CNF 2026 source. |
| CNF 2015 cooked-quinoa page | [Food Code 5917](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=5917) | Existing `WP03-S5-COOKED-5917` owns the historical cooked-quinoa observations. It is not the CNF 2026 source. |
| Health Canada 2008 food table | [Nutrient Value of Some Common Foods (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html) | Existing `WP03-QCM-20261012-S04` supports the separate cooked-quinoa 125 mL = 73 g observation. |

## Integrated disposition

Five source-specific volume observations and eight record-local CNF 2026 sources are now recorded on the existing cooked-rice and dry-quinoa ledger records. All earlier observations and measurement states remain intact, including the R267 cooked-quinoa 5917 record. The 4523 and 4495 joined-row inspection items are checked in the plan; the broader Section F dry/cooked-grain work remains open. No app, recipe, catalog, picker, active measure, conversion, yield, or substitution data changed. Static ledger/schema and source-ownership checks were used; software tests, build, emulator, and deployment were unnecessary under the database-JSON data exemption in `AGENTS.md`. See the [R541–R542 integration README](../batches/wp03-wp04-r541-r542-gap-review-integration-20261017/README.md).
