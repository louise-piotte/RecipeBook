# WP03 Section F R556 — cooked pearl-barley CNF portions

**Integrated by root on 2026-10-17.** The existing cooked pearl-barley ledger record now carries the six edition-specific observations described below; the Section F parent remains open. The next bounded dry/cooked-grain evidence gap is the existing cooked pearl-barley form, Health Canada CNF Food Code **4486**. Its ledger record has no measurement observations, although the matching form and a CNF 2015 page are already present. Recommend recording the three CNF 2015 portions and three CNF 2026 portions as edition-specific observations on that cooked form. Do not add or change catalog names, aliases, forms, picker terms, density, unit mappings, active conversions, cooking yield, recipe links, or substitutions. Keep the Section F parent open.

## Checklist anchor and distinct scope

The exact open parent is [Section F, “Dry versus cooked forms for remaining grains”](../../RecipeBook-global-ingredient-catalog-plan.txt#L4362). It says generic rice, quinoa, and oat-bran forms are integrated and that cooking yield remains a separate quantity relation. Pearl barley’s dry and cooked forms were added under the nested item at [plan lines 4389–4396](../../RecipeBook-global-ingredient-catalog-plan.txt#L4398). The dry form’s CNF 2015 review is recorded at [lines 4397–4401](../../RecipeBook-global-ingredient-catalog-plan.txt#L4406), and its separate CNF 2026 row join at [lines 4402–4412](../../RecipeBook-global-ingredient-catalog-plan.txt#L4411).

R544 covered dry pearled barley, Food Code **4411**. The still-unresearched cooked form is Food Code **4486**, a distinct cooked CNF entry; its ledger record currently has zero observations. R556 is limited to that one existing cooked form and code. It does not repeat R544’s dry observations and does not revisit R553’s dry white rice, Food Code 4471, which is complete at [plan line 4419](../../RecipeBook-global-ingredient-catalog-plan.txt#L4428).

## Current form, ledger, source, and picker ownership

The active package currently has **1,805 ingredient references**, **148 forms**, and **2,169 research-ledger records**.

| Existing owner | Current state | R556 treatment |
|---|---|---|
| `ingredient-ref-pearl-barley` | `pearl barley / orge perlé`; English alias `jau`; no French aliases; category `GRAIN_AND_CEREAL`; density null and unit mappings empty. Identity is verified; reference-level measurement and substitution research remain `not_yet_researched`. | Keep identity, aliases, parent states, density, and mappings unchanged. |
| `ingredient-form-pearl-barley-cooked` | Existing `pearl barley, cooked / orge perlé, cuit`, form code/prep state `cooked`, empty match-term arrays, density null. Its ledger record is `verified`, measurement `not_yet_researched`, substitution `not_yet_researched`, with **0 observations**. | Update this existing form-level ledger record with only the source-specific portions below and set its measurement state to `researched_supported`. |
| `ingredient-form-pearl-barley-dry` | Existing `pearl barley, dry / orge perlé, sec`, density null. Its ledger record is `researched_supported` with five observations: two CNF 2015 and three CNF 2026 portions for code 4411. | Keep the dry form and all five Food Code 4411 observations separate and unchanged. |

The current picker terms remain the bilingual parent name, the existing English alias `jau`, and the two existing state labels. Adding ledger evidence alone does not change the projection: `pearl barley / orge perlé` remains the identity, and the explicit cooked phrase continues to indicate the cooked form. Keep barley, hulled barley, pot barley, and pearl barley as their existing distinct references; no new alias or cross-match is proposed.

## Bundled recipe demand

I scanned the **114 manifest-listed recipe files** and **1,123 structured ingredient rows** for pearl-barley terms, `orge perlé`, code 4486, and direct links to `ingredient-ref-pearl-barley`, `ingredient-form-pearl-barley-cooked`, or `ingredient-form-pearl-barley-dry`. The scan found **0 matching recipe rows and 0 direct links**. This is source-backed measurement coverage, not a response to a current bundled recipe line. Do not add a recipe amount or link.

## CNF 2015 page and portions

Health Canada’s [CNF 2015 serving-size page for Food Code 4486](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4486) gives the bilingual label **“Grains, barley, pearled, cooked / Grains céréaliers, orge, perlé, cuit”** and displays 100 mL = 66.4 g, 125 mL = 82.9 g, and 250 mL = 165.9 g, alongside the 100 g edible-portion baseline and 0% total refuse. The page is marked modified 2019-03-01 and belongs to the online CNF 2015 edition. It states no filling or packing method.

The existing source `WP03-PBARLEY-FORMS-R27-20261013-S02` is attached to the cooked-form and pearl-barley reference ledger records and points to this exact page. Its source note already treats the displayed portions as code- and edition-specific and rejects a reusable mapping or cooking-yield relation. Reuse it for the three proposed 2015 observations; do not create a second source ID for the same page.

## CNF 2026 retrieval and complete joined rows

On 2026-10-17, direct HTTPS retrieval of the four official Health Canada CSVs returned HTTP 200. Python `urllib` read the files in memory, and `csv.DictReader` filtered Food Code 4486 in Food Name and Measure Weight Conversion, then joined **all six** conversion rows by `Measure_Code` to Measure Name and by `Measure_Type_Code` to Measure Type. All target codes joined; no local CSV copies were written.

The official [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the relational CSV resources. Health Canada’s [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is published as downloadable relational CSV files and that the CNF 2015 online interface remains available as an interim route.

| Official file | Direct URL | Data rows / bytes | SHA-256 |
|---|---|---:|---|
| Food Name | [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | 5,993 / 1,047,745 | `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c` |
| Measure Weight Conversion | [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | 29,868 / 834,367 | `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f` |
| Measure Name | [measure_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | 1,494 / 67,867 | `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f` |
| Measure Type | [measure_type.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | 3 / 172 | `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977` |

### Food Name row

| Field | Food Code 4486 |
|---|---|
| `Food_Description_EN` | `Grains, barley, pearled, cooked` |
| `Food_Description_FR` | `Grains céréaliers, orge, perlé, cuit` |
| `Alternate_Description_EN` / `Alternate_Description_FR` | blank / blank |
| `Food_Source_Code` / `USDA_NDB_Code` / `CNF_Food_Group_Code` | `3` / `20006` / `20` |
| `Comment_EN` / `Comment_FR` / `ScientificName` | blank / blank / blank |
| `Food_Last_Updated_Date` | `2012-07-31` |

### All joined Measure Weight Conversion rows

Type 6 is `User-defined / Défini par l'utilisateur`; type 3 is `Refuse / Portion non comestible`; type 9 is `Yield / Rendement`. The dates are `Measure_Weight_Conversion_Last_Updated_Date` from the 2026 conversion file.

| Type | Measure code | Bilingual label | Exact file value | Row date | Treatment |
|---|---:|---|---:|---|---|
| 3 — Refuse | 750 | `total refuse` / `portion non comestible totale` | 0 | 1997-05-01 | Refuse row; exclude from edible portions. |
| 6 — User-defined | 341 | `100 ml` / `100 ml` | 66.357 g | 1999-09-02 | Record as a CNF 2026 published portion. |
| 6 — User-defined | 383 | `125 ml` / `125 ml` | 82.946 g | 2003-08-22 | Record separately as a CNF 2026 published portion. |
| 6 — User-defined | 415 | `250 ml` / `250 ml` | 165.892 g | 2003-08-22 | Record separately as a CNF 2026 published portion. |
| 6 — User-defined | 1457 | `140 g` / `140 g` | 140 g | 2004-08-27 | Mass-only row; exclude from volume observations, density, and mappings. |
| 9 — Yield | 680 | `100 ml dry` / `100 ml sec` | 295 | 1997-05-01 | Keep uninterpreted. Do not use as a cooked measure, a dry portion, a 100 mL cooking-yield relation, or a conversion. |

The official [CNF API Guide](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html) describes Yield Amount generally as yield from refuse and/or cooking losses assigned to certain foods, most often for inventory use. That definition does not explain why Food Code 4486 has a type-9 label `100 ml dry` with value 295. Direct requests to Health Canada’s English and French Yield Amount API endpoints for Food Code 4486 each returned HTTP 200 with an empty JSON array (`[]`); they provide no alternative row description or interpretation. Keep the type-9 CSV row outside the observation set.

The exact 2026 type-6 volume values round to the 2015 displayed tenths. The rows were last updated between 1999 and 2004; their presence in the 2026 relational release does not make them new kitchen measurements or establish a fill/packing protocol.

## Source-ID ownership and collision check

The existing 2015 source `WP03-PBARLEY-FORMS-R27-20261013-S02` is the code-4486 page already attached to the cooked form and parent reference. Keep `WP03-PBARLEY-FORMS-R27-20261013-S01`, `WP03-SECTION-F-R310-20261016-S01`, and the four R544 code-4411 CSV IDs on the dry form for Food Code 4411. Do not attach R544’s dry-row observations or code-scoped sources to this cooked form.

The R544 source `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05` already records the official CNF API Guide and is shared with other form records. Its guide may be reused for the general Yield-field definition only; it does not interpret the code-4486 type-9 row. The new IDs below were collision-free in the active ledger and proposal corpus when checked.

| Proposed source ID | Resource and row scope |
|---|---|
| `WP03-CNF2026-PEARL-BARLEY-4486-R556-S01` | Food Name CSV; Food Code 4486 bilingual description and identifiers. |
| `WP03-CNF2026-PEARL-BARLEY-4486-R556-S02` | Measure Weight Conversion CSV; all six code-4486 rows and row dates. |
| `WP03-CNF2026-PEARL-BARLEY-4486-R556-S03` | Measure Name CSV; codes 750, 341, 383, 415, 1457, and 680. |
| `WP03-CNF2026-PEARL-BARLEY-4486-R556-S04` | Measure Type CSV; types 3, 6, and 9. |
| `WP03-CNFAPI-YIELD-4486-R556-S05` | English Health Canada Yield Amount API response for Food Code 4486; empty array only. |
| `WP03-CNFAPI-YIELD-4486-R556-S06` | French Health Canada Yield Amount API response for Food Code 4486; empty array only. |

The API request URLs are [English](https://food-nutrition.canada.ca/api/canadian-nutrient-file/yieldamount/?id=4486&lang=en&type=json) and [French](https://food-nutrition.canada.ca/api/canadian-nutrient-file/yieldamount/?id=4486&lang=fr&type=json). Do not reuse R544’s code-4411 CSV IDs for code 4486.

## Bounded integration recommendation

Add the six tabled observations to the **existing** `ingredient-form-pearl-barley-cooked` ledger record. Keep its identity `verified`, set measurement to `researched_supported`, and leave substitution research `not_yet_researched`. Reuse `WP03-PBARLEY-FORMS-R27-20261013-S02` for the three 2015 observations; use the four new code-specific CSV sources for the three 2026 observations. The API response sources may be linked only to document the empty result and retain the Yield interpretation limit.

| Observation ID | Edition and source portion |
|---|---:|
| `pearl-barley-cooked-cnf2015-100ml-portion-r556-20261017` | CNF 2015, code 4486: 100 mL = 66.4 g |
| `pearl-barley-cooked-cnf2015-125ml-portion-r556-20261017` | CNF 2015, code 4486: 125 mL = 82.9 g |
| `pearl-barley-cooked-cnf2015-250ml-portion-r556-20261017` | CNF 2015, code 4486: 250 mL = 165.9 g |
| `pearl-barley-cooked-cnf2026-100ml-portion-r556-20261017` | CNF 2026, code 4486, Measure 341: 100 mL = 66.357 g |
| `pearl-barley-cooked-cnf2026-125ml-portion-r556-20261017` | CNF 2026, code 4486, Measure 383: 125 mL = 82.946 g |
| `pearl-barley-cooked-cnf2026-250ml-portion-r556-20261017` | CNF 2026, code 4486, Measure 415: 250 mL = 165.892 g |

Use `relationship: portion_weight`, `evidenceKind: published_portion`, exact source values, and edition/code-specific food descriptions. State that no filling or packing method is given. Do not average the editions, overwrite the 2015 values, derive density, extrapolate to other quantities, infer dry-to-cooked yield from the separate 4411 dry code, or activate a conversion or substitution. Leave the 140 g, refuse, and type-9 Yield rows out. The reference’s numeric state and the broad Section F parent remain unchanged.

The ledger schema/source validator accepted 2,169 records with no errors. No software tests were run because this integration only adds database JSON evidence and documentation under `AGENTS.md`.
