# WP03 Section F R550 — wild-rice CNF 2026 row join (2026-10-17)

## Decision

**Integrated on 2026-10-17.** Two evidence-ledger records were added for the already-integrated dry and cooked wild-rice forms, with five CNF 2026 volume-to-weight portions. No ingredient or form, alias, picker term, density, unit mapping, active conversion, cooking yield, recipe link, or substitution was added. See the [R549–R551 integration README](../batches/wp02-wp03-wp04-r549-r551-gap-review-integration-20261017/README.md).

- **Selected gap:** the open dry-versus-cooked grain parent at [plan line 4351](../../RecipeBook-global-ingredient-catalog-plan.txt#L4360). The wild-rice child at [plan line 4412](../../RecipeBook-global-ingredient-catalog-plan.txt#L4421) says measurements remain open pending CNF 2026 rows. The [R270 access check, lines 4413–4415](../../RecipeBook-global-ingredient-catalog-plan.txt#L4422) found the files but could not read their contents.
- **Scope:** directly join Food Codes **4449** (wild rice, dry) and **4450** (wild rice, cooked) from the CNF 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type files. The dry/cooked forms already exist from R177; this follow-up adds evidence only.
- **Not a parent closure:** leave the broad [Section F coverage item at line 564](../../RecipeBook-global-ingredient-catalog-plan.txt#L564) and the dry/cooked grain parent open. Integration marks only this wild-rice row-inspection follow-up complete.
- **Distinct from R177/R270:** R177 added bilingual state forms and retained CNF 2015 portions as historical context; it did not inspect 2026 rows. R270 documented an access hold. R541, R544, and R547 later established a successful direct-file retrieval method on different food codes. R550 applies that method to wild rice only.

## Current catalog, ledger, names, and picker ownership

The review-time package snapshot before R549–R551 integration had **1,805 references**, **148 forms**, and **2,166 research-ledger records**. The ledger had 9,994 source entries, 8,449 distinct source IDs, and 7,141 distinct URLs.

| Existing owner | Current fields | R550 treatment |
|---|---|---|
| `ingredient-ref-wild-rice` | `wild rice / riz sauvage`; category `GRAIN_AND_CEREAL`; empty English and French aliases; `defaultDensity: null`; `unitMappings: []`. Its ledger record is `identityState: verified`, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, with no measurement observations. | Keep the identity, aliases, density, mappings, and parent ledger states unchanged. Record measures on the state-specific form ledger records. |
| `ingredient-form-wild-rice-dry` | `wild rice, dry / riz sauvage, sec`; `formCode/prepState: dry`; empty match terms; `densityGPerMl: null`. | Keep the existing ID and bilingual labels. |
| `ingredient-form-wild-rice-cooked` | `wild rice, cooked / riz sauvage, cuit`; `formCode/prepState: cooked`; empty match terms; `densityGPerMl: null`. | Keep the existing ID and bilingual labels. |

OQLF lists **riz sauvage** as the preferred Québec French term and **wild rice** as its English equivalent. Ontario's Ministry of Agriculture identifies northern wild rice as *Zizania palustris* and describes its culinary use as a cooked whole grain. The CNF dry row gives `ScientificName=Zizania spp.`; the cooked row's scientific-name field is blank. Do not narrow the active reference to a single species or infer one from the blank cooked-row field. The exact bilingual CNF state names support the two existing qualified form labels; no alias or broader term is needed.

Nearby active identities remain separate: puffed wild rice, wild-rice blend, wild-rice flour, and ordinary rice. A static projection of the current `IngredientSearch.kt` phrase matching gives:

| Query | Current result | R550 effect |
|---|---|---|
| `wild rice` / `riz sauvage` | Four references: plain wild rice, puffed wild rice, wild-rice blend, and wild-rice flour. | Unchanged. |
| `wild rice, dry` / `riz sauvage, sec` | `ingredient-ref-wild-rice`, with the exact dry-form hint. | Unchanged. |
| `wild rice, cooked` / `riz sauvage, cuit` | `ingredient-ref-wild-rice`, with the exact cooked-form hint. | Unchanged. |
| `cooked rice` / `riz cuit` | Ordinary `ingredient-ref-rice`, with its exact cooked-form hint. | Unchanged. |

R550 proposes no catalog names, aliases, or form match terms, so it causes no picker projection change.

## Bundled recipe demand

I scanned all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows** for wild-rice English/French wording, *Zizania*, and the active reference/form IDs. The scan found **0 matching files, 0 matching ingredient rows, and 0 direct links**. R550 is source-backed measurement coverage; it does not address a current bundled recipe need. Add no recipe text, amount, or link.

## CNF 2026 retrieval and joined rows

On 2026-10-17, direct HTTPS GET requests to the four Health Canada/Open Government CSV download URLs returned HTTP 200. Python `urllib` fetched the files into memory; `csv.DictReader` filtered `Food_Code` 4449 and 4450 in the Food Name and Measure Weight Conversion files, then joined every target `Measure_Code` and `Measure_Type_Code` against the complete Measure Name and Measure Type tables. No local CSV copies were written. Each Food Code returned one Food Name row and five conversion rows; every measure and type key joined successfully.

| Official file | Direct URL | Data rows / bytes | SHA-256 |
|---|---|---:|---|
| Food Name | [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | 5,993 / 1,047,745 | `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c` |
| Measure Weight Conversion | [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | 29,868 / 834,367 | `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f` |
| Measure Name | [measure_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | 1,494 / 67,867 | `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f` |
| Measure Type | [measure_type.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | 3 / 172 | `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977` |

### Food Name rows

| Food Code | English description | French description | Alternate descriptions / comments | Other fields | Food row date |
|---:|---|---|---|---|---|
| 4449 | `Grains, rice, wild, dry` | `Grains céréaliers, riz sauvage, sec` | Blank | `Food_Source_Code=0`; `USDA_NDB_Code=20088`; `CNF_Food_Group_Code=20`; `ScientificName=Zizania spp.` | `2012-07-31` |
| 4450 | `Grains, rice, wild, cooked` | `Grains céréaliers, riz sauvage, cuit` | Blank | `Food_Source_Code=0`; `USDA_NDB_Code=20089`; `CNF_Food_Group_Code=20`; `ScientificName` blank | `2012-07-30` |

The last-updated dates are the dates carried in the Food Name rows; they do not make these anything other than rows retrieved from the 2026 relational release.

### All joined Measure Weight Conversion rows

Type 6 is `User-defined / Défini par l'utilisateur`; type 3 is `Refuse / Portion non comestible`; type 9 is `Yield / Rendement`. Measure-row dates below are `Measure_Weight_Conversion_Last_Updated_Date`.

| Food Code / state | Type | Measure code | Measure label EN / FR | Value | Row date | Treatment |
|---|---|---:|---|---:|---|---|
| 4449 dry | 6 — User-defined / Défini par l'utilisateur | 341 | `100 ml` / `100 ml` | 67.625 g | 1997-05-01 | Record as its own CNF 2026 portion observation. |
| 4449 dry | 6 — User-defined / Défini par l'utilisateur | 415 | `250 ml` / `250 ml` | 169.062 g | 2003-08-22 | Record as a separate portion observation. |
| 4449 dry | 6 — User-defined / Défini par l'utilisateur | 1601 | `45 g` / `45 g` | 45 g | 2004-08-27 | Mass-only; exclude from volume portions, density, and mappings. |
| 4449 dry | 3 — Refuse / Portion non comestible | 750 | `total refuse` / `portion non comestible totale` | 0 | 1997-05-01 | Refuse row; exclude from edible portions. |
| 4449 dry | 9 — Yield / Rendement | 921 | `amount to make 125ml` / `quantité requise pour préparer 125ml` | 32.5 | 2004-08-12 | Keep uninterpreted; do not record as a 125 mL portion, yield relation, conversion, or cooking ratio. |
| 4450 cooked | 6 — User-defined / Défini par l'utilisateur | 341 | `100 ml` / `100 ml` | 69.315 g | 1997-05-01 | Record as its own CNF 2026 portion observation. |
| 4450 cooked | 6 — User-defined / Défini par l'utilisateur | 383 | `125 ml` / `125 ml` | 86.644 g | 2003-08-22 | Record as a separate portion observation. |
| 4450 cooked | 6 — User-defined / Défini par l'utilisateur | 415 | `250 ml` / `250 ml` | 173.288 g | 2003-08-22 | Record as a separate portion observation. |
| 4450 cooked | 6 — User-defined / Défini par l'utilisateur | 1457 | `140 g` / `140 g` | 140 g | 2004-08-27 | Mass-only; exclude from volume portions, density, and mappings. |
| 4450 cooked | 3 — Refuse / Portion non comestible | 750 | `total refuse` / `portion non comestible totale` | 0 | 1997-05-01 | Refuse row; exclude from edible portions. |

The Health Canada [CNF API Guide](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html), already owned in the ledger as `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05`, defines Yield Amount generally as yields from refuse and/or cooking losses assigned to certain foods, most often used for food-inventory purposes. That general definition does **not** explain the preparation basis of the dry wild-rice `amount to make 125ml` label. Keep the 32.5 value uninterpreted; the cooked code has no type-9 row.

Health Canada's [CNF 2015 dry page, code 4449](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4449) lists 100 mL = 67.6 g and 250 mL = 169.1 g, plus the separate “amount to make 125ml = 32.5 g” entry. Its [cooked page, code 4450](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4450) lists 100 mL = 69.3 g, 125 mL = 86.6 g, and 250 mL = 173.3 g. R177 already records these pages as 2015 edition-specific context on the wild-rice identity record. The CNF 2026 portions round to the same one-decimal figures. Keep editions separate; do not duplicate the 2015 values as R550 observations or treat the matching rounded figures as independent kitchen validation.

## Bounded ledger recommendation

Create records only for the two existing forms, with `recordType: ingredient_form`, `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. Put the source-specific observations below on their corresponding form record. Keep the parent `ingredient-ref-wild-rice` identity record and its `measurementState` unchanged.

| Form record | CNF 2026 portion observation | Proposed observation ID |
|---|---:|---|
| `ingredient-form-wild-rice-dry` | Measure 341, 100 mL = 67.625 g | `wild-rice-dry-cnf2026-100ml-portion-r550-20261017` |
| `ingredient-form-wild-rice-dry` | Measure 415, 250 mL = 169.062 g | `wild-rice-dry-cnf2026-250ml-portion-r550-20261017` |
| `ingredient-form-wild-rice-cooked` | Measure 341, 100 mL = 69.315 g | `wild-rice-cooked-cnf2026-100ml-portion-r550-20261017` |
| `ingredient-form-wild-rice-cooked` | Measure 383, 125 mL = 86.644 g | `wild-rice-cooked-cnf2026-125ml-portion-r550-20261017` |
| `ingredient-form-wild-rice-cooked` | Measure 415, 250 mL = 173.288 g | `wild-rice-cooked-cnf2026-250ml-portion-r550-20261017` |

Use the ledger's `portion_weight` / `published_portion` structure, retain the exact `value` and `observedMassG`, and record `sourceQuantity` in mL with no fill/packing method stated. Link each observation to the four code-specific CNF 2026 source records for its food code. Describe each as a Food Code- and edition-specific published portion, not a reusable conversion.

Keep reference and form densities `null`, unit mappings empty, and active measures/conversions unchanged. The dry and cooked rows are not paired measurements of one preparation; do not compare their volumes or masses to infer a dry-to-cooked yield. The sources establish no wild-rice substitution for ordinary rice, a blend, quinoa, or another grain and no substitution amount. Add no global form conversion, contextual substitution, or recipe-line substitution link.

## Source-ID ownership and register

The wild-rice identity ledger record already owns `WP03-S12` (OQLF), `WP03-S13` (OMAFRA), `WP03-QCM-20261012-S05` (Health Canada CNF overview), the R177 Food Codes 4449/4450 CNF 2015 sources `WP03-WILDRICE-FORMS-R177-20261016-S01/S02`, and R177's Health Canada recipe source `...-S03`. Preserve those owners and source limits. R270's dataset-listing citation `WP03-WILDRICE-CNF2026-R270-20261016-S02` remains proposal history; do not reuse it as a data-row source. The API Guide source ID above is already shared by the pearl-barley and common-millet form ledger records and may be reused for its general Yield definition only.

Each official 2026 CSV URL was already registered against other foods with food-code-specific IDs: R544 for pearl barley 4411, R267 for cooked quinoa 5917, R541 for cooked rice 4523 and dry quinoa 4495, and R547 for common millet 4491. Those IDs remain attached to their existing target rows. The following new IDs were collision-free at review and are now attached to the two wild-rice form ledger records:

| Proposed source ID | Resource | Row scope supported |
|---|---|---|
| `WP03-CNF2026-WILDRICE-4449-R550-S01` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Food Code 4449 bilingual description, identifiers, scientific name, and food-row date. |
| `WP03-CNF2026-WILDRICE-4449-R550-S02` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | All five Food Code 4449 rows, including values and row dates. |
| `WP03-CNF2026-WILDRICE-4449-R550-S03` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Bilingual labels for measure codes 341, 415, 1601, 750, and 921. |
| `WP03-CNF2026-WILDRICE-4449-R550-S04` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Bilingual measure types 3, 6, and 9. |
| `WP03-CNF2026-WILDRICE-4450-R550-S01` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Food Code 4450 bilingual description, identifiers, blank scientific-name field, and food-row date. |
| `WP03-CNF2026-WILDRICE-4450-R550-S02` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | All five Food Code 4450 rows, including values and row dates. |
| `WP03-CNF2026-WILDRICE-4450-R550-S03` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Bilingual labels for measure codes 341, 383, 415, 1457, and 750. |
| `WP03-CNF2026-WILDRICE-4450-R550-S04` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Bilingual measure types 3 and 6; Food Code 4450 has no type-9 row. |

The [official CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) identifies these relational resources; Health Canada's [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) explains that CNF 2026 is available as relational CSV and the CNF 2015 web interface remains interim access. The listing and overview provide release context, not wild-rice row evidence.

## Sources and limits

- **OQLF, [riz sauvage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418384/riz-sauvage)** (`WP03-S12`, existing): preferred French term and English equivalent; last updated 1985. It does not provide measures.
- **OMAFRA, [Riz sauvage](https://www.omafra.gov.on.ca/CropOp/fr/field_grain/spec_grains/wiri.html)** (`WP03-S13`, existing): identifies *Zizania palustris* and describes culinary use; page last updated 2012-10-17. It does not provide household measures or a preparation yield.
- **Health Canada, [CNF 2015 code 4449](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4449)** (`WP03-WILDRICE-FORMS-R177-20261016-S01`, existing) and [code 4450](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4450) (`...-S02`, existing): historical bilingual food labels and portions; pages modified 2019-03-01. They do not substitute for CNF 2026 rows.
- **Health Canada, [CNF API Guide](https://produits-sante.canada.ca/api/documentation/cnf-documentation-en.html)** (`WP03-CNF2026-PEARL-BARLEY-4411-R544-S05`, existing): general Yield Amount field semantics only. It does not interpret the specific wild-rice 32.5 row.
- **Health Canada, [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109)** and direct CSVs above: official release/resource context and row-level joined evidence. Direct files support only the specific descriptions and values recorded here; they do not state a fill method, density, standardized conversion, cooking yield, or substitute.

## Integration boundary

Integration added five 2026 `portion_weight` observations to two new form ledger records for the existing wild-rice forms, reused the current identity and CNF context sources where appropriate, and added the eight code-specific CSV source entries above. The parent identity state, active catalog, picker, recipe corpus, conversions, yields, and substitution data remain unchanged. R177 and R270 remain historical records; the outstanding wild-rice row inspection is superseded by the joined evidence. The JSON-only addition required no software tests under `AGENTS.md`.
