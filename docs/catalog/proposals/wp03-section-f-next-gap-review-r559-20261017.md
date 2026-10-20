# WP03 Section F R559 — dry oat-bran CNF portions

## Review record

- **Status:** Integrated on 2026-10-17 as a ledger-only evidence update and documentation. No active catalog, recipe, or code data was changed.
- **Scope:** One existing state form, `ingredient-form-oat-bran-dry`, matched to Health Canada CNF Food Code **4493**. Record the edition-specific volume portions visible in CNF 2015 and the joined CNF 2026 tables. Keep the cooked form, Food Code 4494, outside this review.
- **Recommendation:** Add two CNF 2015 and three CNF 2026 `portion_weight` observations to the existing dry form. Keep the type-9 “amount to make 125ml” entries uninterpreted. Add no active measure, density, mapping, conversion, yield, recipe link, or substitution.

## Checklist anchor and reason for selection

The exact open parent is the Section F item at [plan lines 4360–4361](../../RecipeBook-global-ingredient-catalog-plan.txt#L4369): “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated. Cooking yield is a separate quantity relation.” R550, R553, and R556 completed different food codes and forms. At proposal review, the live parent had no CNF portion review for dry oat bran, although the state form was already present. R559 does not repeat the completed dry/cooked pearl-barley, common-millet, wild-rice, white-rice, quinoa, or cooked-rice work.

## Current catalog, source, and picker ownership

The live reference is `ingredient-ref-oat-bran`, with `oat bran / son d'avoine`, category `GRAIN_AND_CEREAL`, empty English and French alias arrays, null `defaultDensity`, and no unit mappings. Its two existing forms are:

| Form ID | Existing English / French label | State | Match terms | Form density |
|---|---|---|---|---|
| `ingredient-form-oat-bran-dry` | `oat bran, dry` / `son d'avoine, sec` | dry | empty | null |
| `ingredient-form-oat-bran-cooked` | `oat bran, cooked` / `son d'avoine, cuit` | cooked | empty | null |

The ledger already assigns `WP03-S24` to the CNF 2015 page for Food Code 4493 and `WP03-S24-COOKED-4494` to the separate cooked Food Code 4494 page. The first currently supports the dry bilingual label only and explicitly says that no serving-size value was imported; the second supports the cooked state only. Both existing form records have `measurementState: not_yet_researched` and no measurement observations. Keep the two code-specific source IDs separate.

The editor's `IngredientReferenceSearchIndex` searches the reference's bilingual names and aliases together with attached form labels and form match terms. The exact queries `oat bran` and `son d'avoine` currently resolve to the existing oat-bran reference; the full dry labels provide a dry-form hint. R559 changes no names, aliases, or forms, so the picker projection is unchanged. Broad `oat` and `bran` searches remain broad. No new synonym is justified by portion data.

## Bundled recipe demand

A read-only scan of every path in `manifest.v1.json` covered **114 recipes and 1,123 ingredient rows**. It searched the ingredient-row JSON for `ingredient-ref-oat-bran`, `ingredient-form-oat-bran`, `oat bran`, `oat bran, dry`, `oat bran, cooked`, and French `son d'avoine` dry/cooked wording after accent and punctuation normalization. It found **zero candidate-specific ingredient rows**. No bundled recipe demand or package-specific requirement justifies an active conversion, default amount, form link, or substitution.

## CNF 2026 retrieval and joined rows

On 2026-10-17, the four public Health Canada CSVs were retrieved read-only by direct HTTPS GET into memory and joined on `Food_Code`, `Measure_Code`, and `Measure_Type_Code`. No local CSV copy was created. The official [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) identifies this release and its relational resources.

| Resource | Direct official URL | Rows / bytes / SHA-256 |
|---|---|---|
| Food Name | [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | 5,993 / 1,047,745 / `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c` |
| Measure Weight Conversion | [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | 29,868 / 834,367 / `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f` |
| Measure Name | [measure_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | 1,494 / 67,867 / `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f` |
| Measure Type | [measure_type.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | 3 / 172 / `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977` |

The Food Name row identifies Food Code 4493 as **`Grains, oat bran, dry / Grains céréaliers, son d'avoine, sec`**. Its alternate descriptions, comments, and scientific name are blank; `Food_Source_Code` is 3, `USDA_NDB_Code` is 20033, `CNF_Food_Group_Code` is 20, and `Food_Last_Updated_Date` is 2012-07-31.

All six matching Measure Weight Conversion rows join as follows. Type 6 is `User-defined / Défini par l'utilisateur`; type 3 is `Refuse / Portion non comestible`; type 9 is `Yield / Rendement`. Each date is `Measure_Weight_Conversion_Last_Updated_Date`.

| Type | Measure code | Bilingual label | Value | Row date | Disposition |
|---|---:|---|---:|---|---|
| 6 — User-defined | 341 | `100 ml` / `100 ml` | 39.73 g | 1997-05-01 | Record as a CNF 2026 volume portion. |
| 6 — User-defined | 383 | `125 ml` / `125 ml` | 49.66 g | 2007-08-22 | Record as a distinct CNF 2026 volume portion. |
| 6 — User-defined | 415 | `250 ml` / `250 ml` | 99.324 g | 2003-08-25 | Record as a distinct CNF 2026 volume portion. |
| 6 — User-defined | 1456 | `40 g` / `40 g` | 40 g | 2011-04-18 | Exclude from volume portions, density, and mappings; this is mass-only. |
| 3 — Refuse | 750 | `total refuse` / `portion non comestible totale` | 0 g | 1997-05-01 | Exclude from edible portions and kitchen measures. |
| 9 — Yield | 921 | `amount to make 125ml` / `quantité requise pour préparer 125ml` | 20 g | 2004-08-12 | Keep uninterpreted. Do not record as a 125 mL portion, yield conversion, or recipe instruction. |

The 2026 release contains the Food Name row, but its food-level date and the individual measure-row dates are earlier than this release. The distribution edition establishes which CNF file supplied these values; it does not show that these oat-bran measurements were remeasured in 2026. No filling, levelling, packing, brand, or particle-size method is specified.

## CNF 2015 comparison and limits

The [Health Canada CNF 2015 page for Food Code 4493](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4493) displays the same bilingual dry-oat-bran food label and reports `100ml = 39.7 g`, `250ml = 99.3 g`, `amount to make 125ml = 20.0 g`, a 100 g edible-portion baseline, and 0% total refuse. It does **not** label 49.7 g as a 125 mL volume portion. Record only the two labeled 2015 volume portions as separate edition-specific observations. Keep the page's `amount to make 125ml` entry uninterpreted.

The CNF 2015 values round to the corresponding CNF 2026 100 mL and 250 mL rows at one decimal place. They are still separate edition-specific published observations, not independent kitchen trials or values to average. The 2026 explicit 125 mL row is separate from the type-9 “amount to make 125ml” row in the same release.

Health Canada's [CNF API Guide, “Yield Amount”](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html), already represented by `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05`, defines that field generally as yield from refuse and/or cooking losses assigned to certain foods, most often for food-inventory purposes. This broad field definition does not explain why code 4493's type-9 label says “amount to make 125ml,” nor its preparation basis. Keep both CNF 2015 and 2026 type-9 values uninterpreted. Do not infer dry-to-cooked yield, density, a 125 mL amount from the type-9 rows, or a reusable conversion from the published portions.

Nothing in the CNF rows tests oat bran as a substitute for rolled oats, oat flour, other cereal bran, or cooked oat bran. Leave `substitutionResearchState` unchanged and add no global or contextual substitution.

## Source-ID ownership

The existing `WP03-S24` remains owned by the code-4493 CNF 2015 page, and `WP03-S24-COOKED-4494` remains owned by the code-4494 page. Do not reuse either ID for CNF 2026 or for the other food code. The API Guide ID cited above is already in the ledger and needs no new source record. A scan of the active ledger and proposal corpus found no `R559` source IDs; the following new IDs are unique and scoped to the dry code-4493 row join:

| Proposed source ID | Resource and supported scope |
|---|---|
| `WP03-CNF2026-OAT-BRAN-4493-R559-S01` | Food Name CSV: Food Code 4493 bilingual name and identifying fields. |
| `WP03-CNF2026-OAT-BRAN-4493-R559-S02` | Measure Weight Conversion CSV: all six code-4493 rows, exact values, measure-type codes, and row dates. |
| `WP03-CNF2026-OAT-BRAN-4493-R559-S03` | Measure Name CSV: bilingual labels for Measure Codes 341, 383, 415, 1456, 750, and 921. |
| `WP03-CNF2026-OAT-BRAN-4493-R559-S04` | Measure Type CSV: bilingual definitions for Measure Types 3, 6, and 9. |

## Bounded integration delta

On the existing `ingredient-form-oat-bran-dry` ledger record:

1. Update the existing `WP03-S24` source description to include the two displayed CNF 2015 volume portions while retaining its exact Food Code 4493 scope. Add the four new code-specific CNF 2026 CSV sources above.
2. Set only this form's `measurementState` to `researched_supported` and add five source-specific `portion_weight` observations. Keep the displayed 2015 and CNF 2026 values separate:

| Proposed observation ID | Edition-specific portion | Source IDs |
|---|---:|---|
| `oat-bran-dry-cnf2015-100ml-portion-r559-20261017` | 100 mL = 39.7 g | Existing `WP03-S24` |
| `oat-bran-dry-cnf2015-250ml-portion-r559-20261017` | 250 mL = 99.3 g | Existing `WP03-S24` |
| `oat-bran-dry-cnf2026-100ml-portion-r559-20261017` | 100 mL = 39.73 g | New `WP03-CNF2026-OAT-BRAN-4493-R559-S01`–`S04` |
| `oat-bran-dry-cnf2026-125ml-portion-r559-20261017` | 125 mL = 49.66 g | New `WP03-CNF2026-OAT-BRAN-4493-R559-S01`–`S04` |
| `oat-bran-dry-cnf2026-250ml-portion-r559-20261017` | 250 mL = 99.324 g | New `WP03-CNF2026-OAT-BRAN-4493-R559-S01`–`S04` |

3. For each observation, retain its edition, Food Code 4493 bilingual description, exact volume, exact gram value, and source IDs. Describe it as a CNF food-code-specific published portion, not as a general oat-bran density or an active kitchen conversion.
4. Keep `ingredient-form-oat-bran-dry.densityGPerMl` null, all active measures and mappings empty, and the base reference density and mappings unchanged. Keep `ingredient-form-oat-bran-cooked` and its CNF Food Code 4494 source and ledger record unchanged. Keep the reference and dry-form names, aliases, form match terms, picker projection, recipes, and substitutions unchanged. Add no cooking-yield relation or recipe amount.
5. Leave both editions' type-9 `amount to make 125ml = 20.0 g` values uninterpreted; exclude the 40 g mass-only row and the zero-refuse row from observations.

The open Section F parent remains open after this dry-form measurement review. The integrated ledger-only change required no software tests under the `AGENTS.md` exemption for database-JSON-only additions.
