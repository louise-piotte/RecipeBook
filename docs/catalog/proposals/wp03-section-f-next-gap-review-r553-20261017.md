# WP03 Section F R553 — CNF 2026 dry white long-grain rice portions

**Review status: integrated.** See the [R552–R554 integration README](../batches/wp02-wp03-wp04-r552-r554-gap-review-integration-20261017/README.md). This review covers Food Code **4471** in the Health Canada CNF 2026 relational files. Recommend two edition-specific volume-portion observations on the existing `ingredient-form-white-rice-dry`. Do not add a reference, form, alias, picker term, density, unit mapping, active conversion, dry-to-cooked yield, recipe link, or substitution. The open Section F parent remains open.

## Plan anchor and bounded gap

The exact open checklist parent is [Section F, “Dry versus cooked forms for remaining grains”](../../RecipeBook-global-ingredient-catalog-plan.txt#L4361): generic rice, quinoa, and oat-bran forms are integrated, while additional measurement coverage remains open and cooking yield is a separate relation. This proposal follows the completed CNF 2026 row reviews for cooked rice 4523 and dry quinoa 4495 at [plan lines 4365–4382](../../RecipeBook-global-ingredient-catalog-plan.txt#L4374), then the completed pearl-barley, common-millet, and wild-rice checks at [lines 4401–4417](../../RecipeBook-global-ingredient-catalog-plan.txt#L4410).

The unresolved row-level gap is the dry white long-grain rice row, CNF Food Code **4471**. Its existing 2015 source supports the bilingual dry-food description, but the active ledger contains no portion observations for this code and no R541/R544/R547/R550 review joined its 2026 rows. R553 proposes only the two CNF 2026 volume portions. It neither repeats completed 2015/2026 integration work for other food codes nor closes the broader dry/cooked-grain parent.

## Current catalog, form, ledger, and picker ownership

Current bundled package counts are **1,805 ingredient references**, **148 forms**, and **2,168 research-ledger records**.

| Existing owner | Current data and ledger state | R553 scope |
|---|---|---|
| `ingredient-ref-white-rice` | `white rice / riz blanchi`; English alias `milled rice`; French alias `riz blanc`; category `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []`. Ledger identity is `verified`, measurement is `blocked_pending_evidence`, substitution research is `not_yet_researched`, and there are no observations. | Keep names, aliases, parent states, density, and mappings unchanged. |
| `ingredient-form-white-rice-dry` | Existing form: `dry white rice / riz blanchi, sec`, `formCode/prepState: dry`, empty match-term arrays, and `densityGPerMl: null`. There is currently no ledger record for this form. | Reuse this form as the narrower existing state owner and create one form-level evidence record with two source-specific observations. Do not create another form for “long-grain” or “regular.” |
| `ingredient-form-rice-dry` | Existing generic form: `dry rice / riz sec`, with empty match terms and null density. Its ledger record is `verified`, measurement `not_yet_researched`, substitution `not_yet_researched`, and has zero observations. Its source `WP03-S3` supports only the CNF 2015 dry-state label. | Keep this generic owner and its ledger record unchanged. Do not duplicate Food Code 4471 observations onto generic rice. |
| `ingredient-ref-rice` | `rice / riz`; English aliases `chawal`, `uruchi rice`, `uruchimai`; no French aliases; category `GRAIN_AND_CEREAL`; density null and mappings empty. | No identity or picker change. |

The CNF Food Name row describes white, long-grain, regular rice in the dry state. The selected form already expresses the compatible white-rice/dry scope; the exact Food Code description will remain in each observation. Its long-grain and regular qualifiers do not justify another identity, a new form, or a general measure for all white rice. R553 proposes no bilingual naming or alias change, so the current picker projection is unchanged.

### Bundled recipe demand

I scanned the **114 manifest-listed recipe files** and **1,123 structured ingredient rows** for dry-rice wording, `riz sec`, and links to `ingredient-form-rice-dry` or `ingredient-form-white-rice-dry`. There are **0 dry-rice rows and 0 links** to either dry form. The one matching white-rice row is recipe 066’s “Cooked white rice, for serving,” already linked to `ingredient-ref-white-rice` and `ingredient-form-white-rice-cooked`. No bundled recipe asks for dry white rice or a numeric dry-rice quantity; the proposal addresses source-backed measurement coverage only.

## CNF 2026 retrieval and joined evidence

On 2026-10-17 the four official Health Canada CSV download URLs below were retrieved with direct HTTPS requests (HTTP 200). Python `urllib` read the files into memory; `csv.DictReader` selected Food Code 4471 in Food Name and Measure Weight Conversion, then joined **every** target `Measure_Code` to Measure Name and **every** `Measure_Type_Code` to Measure Type. No CSV was written to the workspace. One Food Name row and all five conversion rows joined; no target measure or type key was unmatched.

The official [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) identifies these relational resources and records a 2026-10-04 modification date. Health Canada’s [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) states that the 2026 CNF is published as relational CSV files and that the 2015 online interface remains interim access.

| Official file | Direct URL | Data rows / bytes | SHA-256 |
|---|---|---:|---|
| Food Name | [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | 5,993 / 1,047,745 | `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c` |
| Measure Weight Conversion | [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | 29,868 / 834,367 | `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f` |
| Measure Name | [measure_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | 1,494 / 67,867 | `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f` |
| Measure Type | [measure_type.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | 3 / 172 | `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977` |

### Food Name row

| Field | Food Code 4471 |
|---|---|
| `Food_Description_EN` | `Grains, rice, white, long-grain, regular, dry` |
| `Food_Description_FR` | `Grains céréaliers, riz blanc, grain long, ordinaire, sec` |
| `Alternate_Description_EN` / `Alternate_Description_FR` | `long grain` / blank |
| `Food_Source_Code` / `USDA_NDB_Code` / `CNF_Food_Group_Code` | `0` / `20444` / `20` |
| `Comment_EN` / `Comment_FR` / `ScientificName` | blank / blank / blank |
| `Food_Last_Updated_Date` | `2026-01-28` |

### All joined Measure Weight Conversion rows

Types are joined from the official Measure Type table: **6 — `User-defined / Défini par l'utilisateur`**, **3 — `Refuse / Portion non comestible`**, and **9 — `Yield / Rendement`**. Row dates are the conversion row’s `Measure_Weight_Conversion_Last_Updated_Date`.

| Type | Measure code | Measure label EN / FR | Value | Row date | R553 disposition |
|---|---:|---|---:|---|---|
| 6 — User-defined | 341 | `100 ml` / `100 ml` | 78.191 g | 1997-05-01 | Record as one CNF 2026 published volume portion. |
| 6 — User-defined | 415 | `250 ml` / `250 ml` | 195.478 g | 2003-08-22 | Record as a distinct CNF 2026 published volume portion. |
| 6 — User-defined | 1601 | `45 g` / `45 g` | 45 g | 2004-08-27 | Mass-only row; exclude from volume observations, density, and mappings. |
| 3 — Refuse | 750 | `total refuse` / `portion non comestible totale` | 0 | 1997-05-01 | Refuse row; exclude from edible portions and kitchen measures. |
| 9 — Yield | 921 | `amount to make 125ml` / `quantité requise pour préparer 125ml` | 35.29 | 2004-08-12 | Keep uninterpreted; do not treat as a 125 mL portion, cooking yield, water requirement, or conversion. |

The official [CNF API Guide](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html), already recorded in the ledger as `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05`, defines Yield Amount generally as yield from refuse and/or cooking losses assigned to certain foods, most often for inventory use. That definition does not explain this row’s “amount to make 125ml” wording or specify its preparation basis. Preserve the type-9 row as uninterpreted evidence.

## Historical evidence and limits

Health Canada’s [CNF 2015 page for Food Code 4471](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471) displays the same bilingual product label and gives 100 mL = 78.2 g, 250 mL = 195.5 g, “amount to make 125ml” = 35.3 g, plus a 100 g edible-portion baseline and 0% total refuse. The existing source ID `WP03-S3` records the 2015 food description/state only; the active ledger has no CNF 2015 portion observations for code 4471. Earlier reviews preserve those figures as historical context, but R553 does not create or repeat 2015 observations.

The CNF 2026 volume values round to those same 2015 displayed tenths. They remain separate edition-specific published observations, not independent kitchen validation and not values to average or overwrite. Neither page specifies a filling or packing method. The source rows do not establish a general white-rice density, a measure for another rice product, a dry-to-cooked yield, or a substitution amount.

The [OQLF entry for `riz blanchi`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432775/riz-blanchi), already represented in the white-rice identity’s ledger, directly pairs the preferred Québec French term with English `white rice`. It supports the current bilingual identity only; it supplies no measure, form conversion, or substitution. No substitution research is claimed in R553.

## Source-ID ownership audit

The existing 2015 source `WP03-S3` points to code 4471 and is already attached to `ingredient-form-rice-dry`, `ingredient-ref-rice`, and `ingredient-ref-white-rice`; retain its prior description/state-only limits. `WP03-S108` is separately attached to `ingredient-ref-long-grain-rice` for the same 2015 URL and likewise supports product wording only. Neither ID is repurposed as a CNF 2026 source. The API Guide source `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05` is already shared by existing form records and can be cited for general Yield semantics only.

The four 2026 resource URLs already have source records for other Food Codes: R544 code 4411, R541 codes 4523 and 4495, R547 code 4491, and R550 codes 4449 and 4450. Those IDs remain scoped to their respective rows. The following **new, collision-free** IDs are specific to code 4471; no `R553` or 2026-code-4471 source ID was present in the active ledger or prior proposal files at review.

| Proposed source ID | Resource | Supported scope |
|---|---|---|
| `WP03-CNF2026-WHITE-RICE-4471-R553-S01` | Food Name CSV | Food Code 4471 bilingual description and identifying fields. |
| `WP03-CNF2026-WHITE-RICE-4471-R553-S02` | Measure Weight Conversion CSV | All five Food Code 4471 measure rows, values, and row dates. |
| `WP03-CNF2026-WHITE-RICE-4471-R553-S03` | Measure Name CSV | Bilingual labels for Measure Codes 341, 415, 1601, 750, and 921. |
| `WP03-CNF2026-WHITE-RICE-4471-R553-S04` | Measure Type CSV | Bilingual definitions for Measure Types 3, 6, and 9. |

## Bounded integration delta

Add one evidence-ledger record for the existing `ingredient-form-white-rice-dry`:

```json
{
  "recordId": "ingredient-form-white-rice-dry",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "not_yet_researched"
}
```

Attach the four new source records above, retain `WP03-S3` only as existing historical label/state evidence, and add these two `portion_weight` / `published_portion` observations:

| Observation ID | Source-specific portion |
|---|---:|
| `white-rice-dry-cnf2026-100ml-portion-r553-20261017` | Food Code 4471, Measure 341: 100 mL = 78.191 g |
| `white-rice-dry-cnf2026-250ml-portion-r553-20261017` | Food Code 4471, Measure 415: 250 mL = 195.478 g |

Store each exact gram value and volume, include the full CNF 2026 Food Code 4471 description, and identify it as a code- and edition-specific published portion with no filling or packing method stated. Link each observation to the four new code-specific CSV sources. Keep `ingredient-form-white-rice-dry.densityGPerMl` null, leave active measures/mappings/conversions empty, add no observation to `ingredient-form-rice-dry`, and leave parent ledger states unchanged. Do not add the 45 g mass-only or refuse rows, and keep the 35.29 g type-9 Yield row uninterpreted. Add no dry-to-cooked or ingredient-to-ingredient substitution, and do not change recipes or picker terms.

The broad dry/cooked-grain checklist remains open. This proposal is documentation-only; no software tests were run, consistent with `AGENTS.md` for data-only additions.
