# WP03 Section F R562 — cooked oat-bran CNF portions

## Review record

- **Status:** Integrated on 2026-10-17 as a ledger-only evidence update and documentation. No active catalog, recipe, or code data was changed.
- **Scope:** The existing cooked-oat-bran form, `ingredient-form-oat-bran-cooked`, matched to Health Canada CNF Food Code **4494**. This is a separate cooked-form review from R559's dry code 4493 and from the pearl-barley work in R556.
- **Recommendation:** Add three CNF 2015 and three CNF 2026 `portion_weight` observations to the existing cooked form. Add no active measure, density, mapping, conversion, cooking-yield relation, recipe link, or substitution.

## Checklist anchor and gap selection

The exact open parent is the Section F item at [plan lines 4360–4361](../../RecipeBook-global-ingredient-catalog-plan.txt#L4369): “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated. Cooking yield is a separate quantity relation.” The dry and cooked oat-bran forms already exist; at proposal review, the ledger had no measurements on the cooked form. R559 is scoped to dry code 4493; this review uses only cooked code 4494. R556's cooked pearl-barley code 4486 and its values are unrelated and unchanged. The open parent remains open.

## Current catalog, source, picker, and recipe ownership

The existing base reference is `ingredient-ref-oat-bran`, displayed as `oat bran / son d'avoine` in `GRAIN_AND_CEREAL`, with no aliases, null density, and no unit mappings. The existing cooked form is:

| Field | Current value |
|---|---|
| ID | `ingredient-form-oat-bran-cooked` |
| English / French label | `oat bran, cooked` / `son d'avoine, cuit` |
| Form code / preparation state | `cooked` / `cooked` |
| Form match terms | Empty in both languages |
| Form density | Null |

The ledger assigns `WP03-S24-COOKED-4494` to the [CNF 2015 cooked page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4494), but currently cites it only for the bilingual cooked-state label. The same source ID is attached to the oat-bran base record and cooked-form record with that exact code-4494 URL; `WP03-S24` remains the separate dry code-4493 source. The cooked form and base reference both still have `measurementState: not_yet_researched`; the cooked-form record has no measurement observations. Keep these source IDs separate and scoped to their respective food codes.

`IngredientReferenceSearchIndex` searches reference names and aliases together with attached form labels and match terms. The exact English query `oat bran, cooked` and French query `son d'avoine, cuit` currently return only `ingredient-ref-oat-bran`, with the matching form hint. R562 changes no reference names, aliases, forms, or match terms, so it has no picker effect. Broad `oat` and `bran` queries remain broad.

A read-only scan of every manifest-listed recipe searched all ingredient rows for the oat-bran reference and form IDs and English/French qualified and cooked phrases. It covered **114 bundled recipes and 1,123 ingredient rows** and found **zero cooked-oat-bran ingredient rows**. No recipe or package-specific demand justifies an active conversion or default amount. No bundled use supports a substitution between cooked and dry oat bran or between oat bran and other grains.

## CNF 2026 direct retrieval and joined rows

On 2026-10-17, I retrieved the four public Health Canada CNF 2026 CSVs by direct HTTPS GET into memory and joined them on `Food_Code`, `Measure_Code`, and `Measure_Type_Code`. No local CSV copy was created. The official [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) identifies the relational release and these resources.

| Resource | Direct official URL | Rows / bytes / SHA-256 |
|---|---|---|
| Food Name | [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | 5,993 / 1,047,745 / `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c` |
| Measure Weight Conversion | [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | 29,868 / 834,367 / `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f` |
| Measure Name | [measure_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | 1,494 / 67,867 / `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f` |
| Measure Type | [measure_type.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | 3 / 172 / `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977` |

The Food Name row identifies Food Code 4494 as **`Grains, oat bran, cooked / Grains céréaliers, son d'avoine, cuit`**. Both alternate descriptions, both comments, and the scientific name are blank; `Food_Source_Code` is 3, `USDA_NDB_Code` is 20034, `CNF_Food_Group_Code` is 20, and `Food_Last_Updated_Date` is 2012-07-31.

The joined measure table has five Food Code 4494 rows. Type 6 is `User-defined / Défini par l'utilisateur`; type 3 is `Refuse / Portion non comestible`. The dates are `Measure_Weight_Conversion_Last_Updated_Date`.

| Type | Measure code | Bilingual measure label | Value | Row date | Disposition |
|---|---:|---|---:|---|---|
| 6 — User-defined | 341 | `100 ml` / `100 ml` | 92.561 g | 1997-05-01 | Record as a CNF 2026 volume portion. |
| 6 — User-defined | 383 | `125 ml` / `125 ml` | 115.702 g | 2003-08-25 | Record as a distinct CNF 2026 volume portion. |
| 6 — User-defined | 415 | `250 ml` / `250 ml` | 231.403 g | 2003-08-25 | Record as a distinct CNF 2026 volume portion. |
| 6 — User-defined | 1457 | `140 g` / `140 g` | 140 g | 2004-08-27 | Exclude from volume portions, density, and mappings; this is mass-only. |
| 3 — Refuse | 750 | `total refuse` / `portion non comestible totale` | 0 g | 1997-05-01 | Exclude from edible portions and kitchen measures. |

There is no type-9 Yield row for code 4494 in this file. The older food-level and conversion-row dates in the CNF 2026 distribution do not establish that these measurements were newly taken in 2026. Neither the file nor the 2015 page specifies filling, levelling, packing, brand, or particle-size method.

## CNF 2015 comparison and measurement limits

The Health Canada [CNF 2015 serving-size page for code 4494](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4494) displays the same bilingual cooked-oat-bran label and reports `100ml = 92.6 g`, `125ml = 115.7 g`, `250ml = 231.4 g`, a 100 g edible-portion baseline, and 0% total refuse. Record only its three volume values as separate CNF 2015 observations. The CNF 2026 portions round to those values at one decimal place; keep editions separate as publication-specific observations and do not average or overwrite them.

These food-code portions are source-specific evidence. Do not infer a general density or activate a g/ml conversion from them. Do not compare the independent dry and cooked food-code portions to derive an oat-bran cooking yield: the rows do not describe the same batch, starting mass, water quantity, or cooking method. No source reviewed here tests substitutions, so leave substitution research unchanged and create no global or contextual rule.

## Source-ID ownership

The existing ID `WP03-S24-COOKED-4494` remains owned by the exact CNF 2015 page for Food Code 4494; update its form-level source note only if the 2015 portions are recorded. Keep `WP03-S24` attached to the dry code-4493 page. A search of the active ledger and proposal corpus found no R562 IDs. The following new IDs are collision-free and scoped to code 4494's 2026 table join:

| Proposed source ID | Resource and supported scope |
|---|---|
| `WP03-CNF2026-OAT-BRAN-4494-R562-S01` | Food Name CSV: Food Code 4494 bilingual name and identifying fields. |
| `WP03-CNF2026-OAT-BRAN-4494-R562-S02` | Measure Weight Conversion CSV: all five code-4494 rows, values, measure-type codes, and row dates. |
| `WP03-CNF2026-OAT-BRAN-4494-R562-S03` | Measure Name CSV: bilingual labels for Measure Codes 341, 383, 415, 1457, and 750. |
| `WP03-CNF2026-OAT-BRAN-4494-R562-S04` | Measure Type CSV: bilingual definitions for Measure Types 3 and 6. |

## Bounded integration delta

On the existing ledger record `ingredient-form-oat-bran-cooked` only:

1. Retain `WP03-S24-COOKED-4494` on the CNF 2015 source URL and update its form-level support note to include the three page-listed volume portions. Add the four new code-specific CNF 2026 CSV sources above.
2. Set this cooked form's `measurementState` to `researched_supported` and add these six edition-specific `portion_weight` observations:

| Proposed observation ID | Portion | Source IDs |
|---|---:|---|
| `oat-bran-cooked-cnf2015-100ml-portion-r562-20261017` | CNF 2015: 100 mL = 92.6 g | Existing `WP03-S24-COOKED-4494` |
| `oat-bran-cooked-cnf2015-125ml-portion-r562-20261017` | CNF 2015: 125 mL = 115.7 g | Existing `WP03-S24-COOKED-4494` |
| `oat-bran-cooked-cnf2015-250ml-portion-r562-20261017` | CNF 2015: 250 mL = 231.4 g | Existing `WP03-S24-COOKED-4494` |
| `oat-bran-cooked-cnf2026-100ml-portion-r562-20261017` | CNF 2026: 100 mL = 92.561 g | New `WP03-CNF2026-OAT-BRAN-4494-R562-S01`–`S04` |
| `oat-bran-cooked-cnf2026-125ml-portion-r562-20261017` | CNF 2026: 125 mL = 115.702 g | New `WP03-CNF2026-OAT-BRAN-4494-R562-S01`–`S04` |
| `oat-bran-cooked-cnf2026-250ml-portion-r562-20261017` | CNF 2026: 250 mL = 231.403 g | New `WP03-CNF2026-OAT-BRAN-4494-R562-S01`–`S04` |

3. Store each as an exact, code- and edition-specific published portion with no packing method stated. Keep `ingredient-form-oat-bran-cooked.densityGPerMl` null, active measures and mappings empty, and the reference's density/mappings unchanged. Leave the base reference's measurement state and both records' substitution states unchanged.
4. Do not change the dry form, its code-4493 observations proposed in R559, either form label, aliases, match terms, picker projection, recipes, conversions, or substitution rules. Add no dry-to-cooked yield or recipe amount. The mass-only and refuse rows are not portion observations.

This cooked-form review does not close the broader Section F parent. The integrated ledger-only change required no software tests under the `AGENTS.md` exemption for database-JSON-only additions.
