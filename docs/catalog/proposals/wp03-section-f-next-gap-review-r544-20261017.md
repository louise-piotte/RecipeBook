# WP03 Section F R544 — dry pearl-barley CNF 2026 row review (2026-10-17)

## Review decision

**Decision: propose three separate, edition-specific CNF 2026 `portion_weight` observations on the existing dry pearl-barley form.** The official joined files contain Food Code 4411 and three type-6 volume measures: 100 mL = 84.531 g, 250 mL = 211.327 g, and `250 ml dry` = 211.327 g. Keep all CNF 2015 observations unchanged and separate. This is a proposal for root integration only; it does not change the shared ledger or any active catalog behavior.

- **Selected unfinished gap:** CNF 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type rows for dry pearl barley, Food Code 4411 ([active plan, lines 4394–4396](../../RecipeBook-global-ingredient-catalog-plan.txt#L4403)).
- **R544 scope:** This is the successful follow-up to the R510 Food Code 4411 access hold. R541 established a direct retrieval method for the same four official CSV resources using other food codes; this review applied that method to 4411 and completed the joins ([R510 proposal](wp03-section-f-next-gap-review-r510-20261017.md); [R541 proposal](wp03-section-f-cnf-2026-cereal-measures-review-r541-20261017.md)).
- **Distinct from R541:** R541's joined-code scope was cooked white long-grain rice 4523, dry quinoa 4495, and cooked quinoa 5917. R544 supplies separate source-specific evidence for dry pearl barley 4411; it reuses neither R541's target rows nor its source IDs ([roadmap, R541 summary](../../../roadmap.md#L1329)).
- **Status:** Integrated on 2026-10-17. See the [R543–R545 integration README](../batches/wp02-wp03-wp04-r543-r545-gap-review-integration-20261017/README.md). At proposal review, no shared catalog, forms, ledger, plan, roadmap, recipe, or generated file had been changed.

## Current identity, form, and picker ownership

The live catalog contains 1,805 references and 146 forms. The already allocated `ingredient-ref-pearl-barley` is `pearl barley / orge perlé` in `GRAIN_AND_CEREAL`, with English alias `jau`, no French aliases, null default density, and no unit mappings. OQLF's `orge perlé` entry directly pairs the Québec French term with English `pearl barley` and defines the processed grain; its page says it was last updated in 2004, so it supports the existing label and boundary, not current retail usage or measurement [S01].

The existing `ingredient-form-pearl-barley-dry` is attached to that reference with labels `pearl barley, dry / orge perlé, sec`, empty match-term lists, and null form density. Its cooked sibling is `pearl barley, cooked / orge perlé, cuit`. Do not create another identity or form from Food Code 4411.

The read-only ledger snapshot has 2,164 records, 9,965 source entries, 8,432 distinct source IDs, and 7,132 distinct URLs; no source ID maps to multiple URLs. The 56 legacy-import candidates contain no pearl-barley, barley, `orge perlé`, or `jau` candidate. The dry-form ledger record already owns the R27 bilingual-label source and R310 CNF 2015 portion/access sources; its current states and observations are summarized below.

Current phrase-first picker projection, using [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current result | Exact form hint |
|---|---|---|
| `pearl barley`; `orge perlé` | Pearl barley | None |
| `pearl barley, dry`; `orge perlé, sec` | Pearl barley | Dry pearl-barley form |
| `pearl barley, cooked` | Pearl barley | Cooked pearl-barley form |
| `jau` | Barley flour and pearl barley | None; existing partial match to the separate `jau atta` alias remains |
| `dry pearl barley` | No result | None |

No aliases, labels, or match terms are proposed, so these results remain unchanged. A ledger-only, source-specific measurement observation would not change picker scope.

## Existing CNF 2015 evidence and limits

Health Canada's [CNF 2015 serving-size page for Food Code 4411](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411) identifies `Grains, barley, pearled, dry / Grains céréaliers, orge, perlé, sec` and displays `100ml = 84.5 g`, `250ml = 211.3 g`, plus `amount to make 125ml = 23.8 g`. The page details give a 2019-03-01 modification date. The existing dry-form ledger record already stores only the 100 mL and 250 mL entries as separate CNF 2015 `portion_weight` observations [S02].

The page does not explain the “amount to make” field or report a filling/packing method. Keep `23.8 g` uninterpreted; do not call it a 125 mL dry portion, recipe amount, conversion, or cooking yield. Do not derive density, interpolate another volume, transfer values to the cooked form, or infer a dry-to-cooked ratio. The dry-form record remains `measurementState: researched_supported` for the two documented 2015 portions and `substitutionResearchState: not_yet_researched`.

## CNF 2026 retrieval and joined rows

Health Canada's [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) describes CNF 2026 as relational CSV files and the CNF 2015 online search as an interim access route. The official [Open Government CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) identifies the four source files below.

On 2026-10-17, direct HTTPS GET requests to the official CSV download URLs returned the files. The first sandboxed request failed DNS resolution; the successful read used the same direct-file retrieval method as R541 with approved read-only network access. Python's CSV reader parsed each response in memory. No local copy was saved. Filtering Food Name by `Food_Code=4411` returned one row; filtering Measure Weight Conversion by `Food_Code=4411` returned seven rows. All seven `Measure_Code` and `Measure_Type_Code` values joined to Measure Name and Measure Type. The evidence is the downloaded row content, not listing metadata.

The target Food Name row is:

| `Food_Code` | `Food_Description_EN` | `Food_Description_FR` | Other identifying fields | `Food_Last_Updated_Date` |
|---:|---|---|---|---|
| 4411 | `Grains, barley, pearled, dry` | `Grains céréaliers, orge, perlé, sec` | `Food_Source_Code=0`; `USDA_NDB_Code=20005`; `CNF_Food_Group_Code=20`; alternate descriptions, comments, and scientific name blank | 2012-07-31 |

All seven joined measure rows are included below. The last-updated date is the row's `Measure_Weight_Conversion_Last_Updated_Date`, not the CNF edition date.

| Type code and bilingual type | Measure code | Measure label EN / FR | `Measure_Weight_Conversion` | Row last updated | Proposed treatment |
|---|---:|---|---:|---|---|
| 6 — `User-defined / Défini par l'utilisateur` | 341 | `100 ml` / `100 ml` | 84.531 g | 1997-05-01 | Record as a CNF 2026 source-specific 100 mL portion. |
| 6 — `User-defined / Défini par l'utilisateur` | 415 | `250 ml` / `250 ml` | 211.327 g | 2003-08-14 | Record as a distinct CNF 2026 source-specific 250 mL portion. |
| 6 — `User-defined / Défini par l'utilisateur` | 1339 | `250 ml dry` / `250 ml sec` | 211.327 g | 2003-08-14 | Record separately from Measure 415; preserve the explicit `dry/sec` label. |
| 6 — `User-defined / Défini par l'utilisateur` | 1601 | `45 g` / `45 g` | 45 g | 2004-08-27 | Mass-only; do not record as a volume portion or mapping. |
| 3 — `Refuse / Portion non comestible` | 750 | `total refuse` / `portion non comestible totale` | 0 | 1997-05-01 | Refuse row; exclude from edible portions. |
| 9 — `Yield / Rendement` | 921 | `amount to make 125ml` / `quantité requise pour préparer 125ml` | 23.77 | 2004-08-12 | Yield type; retain as uninterpreted source evidence, not a recipe yield or portion. |
| 9 — `Yield / Rendement` | 680 | `100 ml dry` / `100 ml sec` | 0.84531 | 2023-05-26 | Yield type despite volume-like label; retain uninterpreted, not a 100 mL mass. |

The official [CNF API Guide, “Yield Amount” section](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html) says yield amounts contain yields from refuse and/or cooking losses assigned to certain foods and are most often used for food inventory purposes. Thus neither type-9 row establishes a general kitchen measure, recipe cooking yield, or dry-to-cooked conversion. The guide's general definition does not resolve the intended interpretation of either exact type-9 row; leave both uninterpreted.

The official bilingual CNF API also returns the type-9 Measure 921 value and labels for Food Code 4411: `yield_amount=23.77`, English food name `Grains, barley, pearled, dry`, and yield name `amount to make 125ml`; the French endpoint returns `23.77`, `Grains céréaliers, orge, perlé, sec`, and `quantité requise pour préparer 125ml`. This corroborates that row's label/value only. It is an API endpoint, not the CNF 2026 CSV source, and it does not interpret the value or corroborate the separate 2026 Measure 680 row.

| Proposal-local source ID | Official source URL | File verification / scoped evidence |
|---|---|---|
| `WP03-CNF2026-PEARL-BARLEY-4411-R544-S01` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | 5,993 data rows; 1,047,745 bytes; SHA-256 `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c`; Food Code 4411 bilingual name and identifying fields above. |
| `WP03-CNF2026-PEARL-BARLEY-4411-R544-S02` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | 29,868 data rows; 834,367 bytes; SHA-256 `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f`; all seven Food Code 4411 conversion rows and exact dates above. |
| `WP03-CNF2026-PEARL-BARLEY-4411-R544-S03` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | 1,494 data rows; 67,867 bytes; SHA-256 `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f`; bilingual labels for Measure Codes 341, 415, 1339, 1601, 750, 921, and 680. |
| `WP03-CNF2026-PEARL-BARLEY-4411-R544-S04` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | 3 data rows; 172 bytes; SHA-256 `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977`; bilingual labels for type codes 3, 6, and 9. |

These R544 IDs are proposal-local and are not allocated in the shared ledger. The four CSV URLs already have other code-specific ledger owners, including R541's 4523 and 4495 entries and the earlier 5917 entries. Root integration should use new record-local source IDs on `ingredient-form-pearl-barley-dry`, with Food Code 4411 locators; do not repurpose any source ID belonging to another Food Code.

For independent corroboration of Measure 921 only: [CNF API yield amount, English](https://food-nutrition.canada.ca/api/canadian-nutrient-file/yieldamount/?id=4411&lang=en&type=json) and [French](https://food-nutrition.canada.ca/api/canadian-nutrient-file/yieldamount/?id=4411&lang=fr&type=json). The API guide above defines the yield field generally; neither API response establishes that 23.77 is a recipe yield or states a preparation protocol.

## Bundle demand, numeric behavior, and substitutions

The current manifest lists 114 recipe files and 1,123 structured ingredient rows. This review scanned the manifest-listed ingredient rows for the pearl/pearled-barley names, `orge perlé`, the existing reference/form IDs, and the whole-word alias `jau`: **zero matching rows and zero links** to the pearl-barley reference or forms. The corpus fingerprint matches the R510 snapshot (`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`). The bundle supplies no recipe amount or demand that would justify a measure or yield.

The existing dry-form ledger record has two edition-specific CNF 2015 observations only. The package has no pearl-barley density, unit mapping, active conversion, or package yield. No source reviewed here supports substituting pearl barley for another grain, a cooked-to-dry quantity, or a recipe-line link. Leave all such behavior absent; do not change the substitution research state based on this access review.

## Bounded integration recommendation and evidence limits

Append three separate CNF 2026 `portion_weight` observations to the existing `ingredient-form-pearl-barley-dry` ledger record: 100 mL = 84.531 g (Measure 341), 250 mL = 211.327 g (Measure 415), and 250 mL dry = 211.327 g (Measure 1339). Preserve Measures 415 and 1339 as separate source observations even though their numeric values match. Scope each to a CNF 2026 published portion for Food Code 4411; retain the exact volume and mass values and cite the record-local R544 source entries for the four CSV files. Keep all CNF 2015 observations as separate edition evidence.

Of the four type-6 rows, exclude the `45 g` mass-only row; also exclude the type-3 total-refuse row. Keep both type-9 `Yield / Rendement` rows uninterpreted, including `amount to make 125ml = 23.77` and `100 ml dry = 0.84531`; do not treat the latter as 0.84531 g or as a 100 mL portion. Add no density, reusable unit mapping, active measure, cooking yield, dry-to-cooked conversion, substitution, recipe link, alias, picker term, or catalog identity/form. The CNF API guide's general yield semantics and API corroboration of Measure 921 are insufficient to resolve either row's specific preparation basis.

This proposal supports only the three volume-to-mass observations as published by CNF 2026. It does not establish a fill/packing method, general density, household standard, cooking/soaking ratio, recipe amount, edible yield, or substitution. At proposal review, the shared catalog, ledger, plan, roadmap, recipe, and generated files were unchanged; root integration followed this proposal review.

No software tests, builds, emulator checks, or deployment were run for this documentation-only proposal.

## Sources

| ID | Source | What it supports and does not support |
|---|---|---|
| S01 | Office québécois de la langue française, [orge perlé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358518/orge-perle). | Preferred Québec French term and its English equivalent; definition describes processed pearl barley. Entry last updated 2004; no household measure. Existing ledger source ID: `WP03-S16`. |
| S02 | Health Canada, [CNF 2015 serving-size page, Food Code 4411](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411). | Existing bilingual dry-state label and exact 2015 portions. It does not establish 2026 data, a packing method, or the meaning of “amount to make.” Existing ledger owners: `WP03-PBARLEY-FORMS-R27-20261013-S01` and `WP03-SECTION-F-R310-20261016-S01`. |
| S03 | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), page details dated 2026-06-19. | Current edition format and 2015 interim-access context; no Food Code 4411 row data. Existing ledger source ID: `WP03-SECTION-F-R310-20261016-S03`. |
| S04 | Open Government Portal, [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). | Official dataset and resource listing; direct page fetch returned 403 in the current browser. Listing metadata does not establish target-row presence or values. Existing ledger source ID: `WP03-SECTION-F-R310-20261016-S04`. |
| `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05` | Health Canada, [Canadian Nutrient File API Guide, “Yield Amount”](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html). | Defines yield amounts as yields from refuse and/or cooking losses assigned to certain foods, most often used for food inventory purposes. It gives general field semantics; it does not resolve the preparation basis of either Food Code 4411 type-9 row. |
| `WP03-CNF2026-PEARL-BARLEY-4411-R544-S06` | Health Canada, [CNF API yield amount for Food Code 4411, English](https://food-nutrition.canada.ca/api/canadian-nutrient-file/yieldamount/?id=4411&lang=en&type=json). | Corroborates Measure 921's `23.77` and English food/yield labels. This API read is secondary to the CNF 2026 CSVs and does not interpret the value or establish a cooking protocol; it does not corroborate Measure 680. |
| `WP03-CNF2026-PEARL-BARLEY-4411-R544-S07` | Health Canada, [CNF API yield amount for Food Code 4411, French](https://food-nutrition.canada.ca/api/canadian-nutrient-file/yieldamount/?id=4411&lang=fr&type=json). | Corroborates Measure 921's `23.77` and French food/yield labels. This API read is secondary to the CNF 2026 CSVs and does not interpret the value or establish a cooking protocol; it does not corroborate Measure 680. |

## Integration

Integrated on 2026-10-17: added record-local sources for the four CNF 2026 CSV files, the official API guide, and the English/French yield-amount API responses. Added three separate CNF 2026 `portion_weight` observations to `ingredient-form-pearl-barley-dry`: Measure 341 (100 ml = 84.531 g), Measure 415 (250 ml = 211.327 g), and Measure 1339 (250 ml dry = 211.327 g). Measures 415 and 1339 remain distinct. The 45 g mass-only row and total-refuse row were excluded; both type-9 Yield rows remain uninterpreted. No density, active mapping, conversion, yield interpretation, recipe link, or substitution changed. See the [R543–R545 integration README](../batches/wp02-wp03-wp04-r543-r545-gap-review-integration-20261017/README.md).
