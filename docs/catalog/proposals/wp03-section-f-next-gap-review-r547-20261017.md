# WP03 Section F R547 — dry common millet form and CNF portions (2026-10-17)

## Decision

**Integrated decision: add one dry form to the existing common-millet reference and record four edition-specific CNF portions on its ledger form record.** Use the exact CNF 2015 values separately from the higher-precision CNF 2026 values. Do not create a new ingredient identity, density, unit mapping, active conversion, recipe link, cooking yield, or substitution.

- **Selected unfinished gap:** the dry form and published portions for common millet (*Panicum miliaceum*), CNF Food Code 4491. The broad WP03 Section F species and product sweep remains open; this is one bounded form-and-measure review after R544, not closure of the parent checklist ([active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2240), [common-millet identity item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4174)).
- **Distinct from R544:** R544 inspected dry pearl barley, Food Code 4411. R547 targets proso/common millet, Food Code 4491, with separate rows, a separate form owner, and new record-local CNF sources.
- **Status:** Integrated on 2026-10-17 by root.

## Identity, form, and ledger ownership

The active catalog has 1,805 ingredient references and 147 forms. `ingredient-ref-common-millet` already owns `common millet / millet commun`, category `GRAIN_AND_CEREAL`, for *Panicum miliaceum*. Its English aliases are `chena`, `proso millet`, `barri`, `cheno`, `cheena`, `cheena millet`, and `panivaragu`; French aliases are empty. Default density is null and unit mappings are empty. The separate generic `ingredient-ref-millet` remains `millet / millet`. The proso-millet flour row remains separate as `proso millet flour / farine de millet commun`; no grain alias or form should be transferred to that flour.

There is no form on `ingredient-ref-common-millet`. The ledger's only matching record is the identity record `ingredient-ref-common-millet`: `identityState=verified`, `measurementState=not_yet_researched`, `substitutionResearchState=not_yet_researched`, and no measurement observations. It already owns OQLF source `WP03-S180` and crop/species evidence, but no 4491 source, dry-form record, or recipe measurement. No source ID for Food Code 4491 or the CNF 2015 4491 page was found in the current ledger or proposal archive.

The bilingual name is supported by two sources with separate jobs. OQLF's GDT identifies *Panicum miliaceum*, lists `millet commun` as a preferred French term and `common millet` / `proso millet` in English; the page was last updated in 2010 and describes the plant, not a dry retail grade. The CNF 2026 Food Name row supplies the explicit `dry / sec` state and the species name. The proposed French form label `millet commun, sec` is an app-display inference that combines OQLF's species-qualified term with CNF's dry-state label; CNF's literal French food description is the more generic `Grains céréaliers, millet, sec`. The English `common millet, dry` similarly combines OQLF's English term with CNF's state and species evidence. Do not add `millet sec`, `millet dry`, or another broad alias.

| Proposed form field | Value |
|---|---|
| ID / owner | `ingredient-form-common-millet-dry` / `ingredient-ref-common-millet` |
| `formCode` / `prepState` | `dry` / `dry` |
| English / French labels | `common millet, dry` / `millet commun, sec` |
| Match terms | Empty in both languages; the bilingual labels themselves are exact picker terms. |
| Density | `null`; do not calculate a density from two portions. |
| Form note | State that this is the CNF dry state and that no general density or reusable conversion is established. |

Leave the reference's aliases, default density, unit mappings, and display fields unchanged. Keep substitution research `not_yet_researched`; the portion evidence does not support a substitution or cooking relationship.

## Static picker projection

`IngredientSearch.kt` matches complete phrases before partial matches and returns a form hint only when the full normalized form label or match term is present. This is a source-code projection, not a runtime or emulator test.

| Query | Current result | After this form is added |
|---|---|---|
| `common millet` | Common millet only; no form hint | Same result; no form hint |
| `millet commun` | Common millet and proso-millet flour | Same two references; no form hint |
| `proso millet` | Common millet and proso-millet flour | Same two references; no form hint |
| `common millet, dry` | No result | Common millet only; exact dry-form hint |
| `millet commun, sec` | No result | Common millet only; exact dry-form hint |
| `millet` | 20 references, including separate generic and species-specific millet entries | Same 20 references; the added form does not change the broad query's scope |

The proposal uses a species-qualified French label and leaves generic `millet`, `mil`, and existing cross-millet picker results unchanged.

## CNF 2015 and 2026 evidence

Health Canada's current CNF overview says CNF 2026 is published as relational CSV files and that the online 2015 CNF remains accessible as an interim route. The 2026 Open Government listing identifies the four CSV resources. These pages establish edition and file context; the joined rows are the quantitative evidence.

On 2026-10-17, direct HTTPS GET requests to the four official CSV download URLs returned HTTP 200. Python's CSV reader parsed the responses in memory; no local copies were saved. I filtered `Food_Name.Food_Code` and `Measure_Weight_Conversion.Food_Code` for exactly `4491`, then joined every returned `Measure_Code` and `Measure_Type_Code` to the complete Measure Name and Measure Type files. The target returned one Food Name row and five measure rows. All measure and type keys joined; none was unmatched. The files' row counts, sizes, and SHA-256 values are recorded in the source register.

### Food Name row

| Food Code | English description | French description | Other identifying fields | Food row date |
|---:|---|---|---|---|
| 4491 | `Grains, millet, dry` | `Grains céréaliers, millet, sec` | `Alternate_Description_EN` and `Alternate_Description_FR` blank; `Food_Source_Code=3`; `USDA_NDB_Code=20031`; `CNF_Food_Group_Code=20`; `ScientificName=Panicum miliaceum`; comments blank | `Food_Last_Updated_Date=2012-07-31` |

The date above is the row's last-updated field. It does not change the fact that the row was read from the CNF 2026 relational file.

### All joined Measure Weight Conversion rows

`Measure_Type_Code=6` is `User-defined / Défini par l'utilisateur`; code 3 is `Refuse / Portion non comestible`; code 9 is `Yield / Rendement`. Measure-row dates below are `Measure_Weight_Conversion_Last_Updated_Date`, not edition dates.

| Type code / bilingual type | Measure code | Measure label EN / FR | Value | Row date | Bounded treatment |
|---|---:|---|---:|---|---|
| 6 — `User-defined / Défini par l'utilisateur` | 341 | `100 ml` / `100 ml` | 84.531 g | 1997-05-01 | Propose as a distinct CNF 2026 100 mL `portion_weight` observation. |
| 6 — `User-defined / Défini par l'utilisateur` | 415 | `250 ml` / `250 ml` | 211.327 g | 2003-08-22 | Propose as a separate CNF 2026 250 mL observation. |
| 6 — `User-defined / Défini par l'utilisateur` | 1601 | `45 g` / `45 g` | 45 g | 2004-08-27 | Mass-only row; exclude from volume portions and mappings. |
| 3 — `Refuse / Portion non comestible` | 750 | `total refuse` / `portion non comestible totale` | 0 | 1997-05-01 | Refuse row; exclude from edible portions. |
| 9 — `Yield / Rendement` | 921 | `amount to make 125ml` / `quantité requise pour préparer 125ml` | 46.04 | 2004-08-12 | Keep uninterpreted; do not record as a 125 mL portion, recipe yield, conversion, or cooking ratio. |

The 2026 API Guide's general “Yield Amount” definition says these are yields from refuse and/or cooking losses assigned to certain foods, often for food-inventory purposes. That broad field definition does not resolve the preparation basis of Food Code 4491's `amount to make 125ml` row. Leave it uninterpreted.

The Health Canada [CNF 2015 serving-size page for Food Code 4491](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4491) lists `Grains, millet, dry / Grains céréaliers, millet, sec`, `100ml = 84.5 g`, `250ml = 211.3 g`, and `amount to make 125ml = 46.0 g`. Its page details show `2019-03-01` as the modification date. The “amount to make” value is not a reported 125 mL portion; keep it uninterpreted just as the corresponding type-9 2026 row is kept uninterpreted.

### Proposed ledger observations

Add four separate `portion_weight` observations to a new `ingredient-form-common-millet-dry` ledger record, each linked only to its record-local evidence sources:

| CNF edition | Source portion | Proposed stored mass | Proposed observation ID |
|---|---:|---:|---|
| 2015 | 100 mL | 84.5 g | `common-millet-dry-cnf2015-100ml-portion-r547-20261017` |
| 2015 | 250 mL | 211.3 g | `common-millet-dry-cnf2015-250ml-portion-r547-20261017` |
| 2026 | Measure 341, 100 mL | 84.531 g | `common-millet-dry-cnf2026-100ml-portion-r547-20261017` |
| 2026 | Measure 415, 250 mL | 211.327 g | `common-millet-dry-cnf2026-250ml-portion-r547-20261017` |

The 2015 and 2026 numbers agree after rounding the 2026 values to one decimal place. Preserve the editions as separate published observations; do not overwrite, average, or treat agreement as independent kitchen validation. Record `measurementState=researched_supported` on the new form record if integrated. Every observation should say that no fill/packing method is stated and that it is a source-specific published portion, not a reusable conversion. The CNF 2015/2026 `amount to make 125ml` values remain excluded and uninterpreted.

## Recipe-bundle demand

The current manifest lists 114 recipe files and 1,123 ingredient rows. I scanned manifest-listed recipe text and ingredient values for `common millet`, `millet commun`, `proso millet`, dry-millet phrasing, and *Panicum miliaceum*: zero file hits and zero ingredient-row hits. There are no direct links to `ingredient-ref-common-millet` or the proposed form. The corpus totals 753,988 bytes and its manifest-ordered fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

This addition is source-backed catalog coverage, not a response to current recipe demand. No recipe line, recipe quantity, or recipe mass is proposed.

## Source-ID ownership and source register

The four CNF 2026 CSV URLs already have code-specific ledger owners for other foods (R541, R544, and R267). Do not reuse their food-code-specific source IDs for 4491. Add four new source entries to the proposed dry-form ledger record, with locators limited to Food Code 4491 and its joined codes. The exact CSV URLs are:

| Proposed source ID | Official source and direct URL | Retrieved file / target evidence |
|---|---|---|
| `WP03-CNF2026-COMMON-MILLET-4491-R547-S01` | Health Canada CNF 2026, [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | 5,993 data rows; 1,047,745 bytes; SHA-256 `ee75a3208e8b79ee523ec5adffcf149f3f21806ac5d9942a9449077efe414c6c`. Food Code 4491 descriptions, scientific name, and row date above. |
| `WP03-CNF2026-COMMON-MILLET-4491-R547-S02` | Health Canada CNF 2026, [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | 29,868 data rows; 834,367 bytes; SHA-256 `9d41fac4ba1471fddd25ea7e51a8352aec66de4f3c88802b0a2e02a85ebc3e6f`. All five Food Code 4491 values, measure/type codes, and row dates above. |
| `WP03-CNF2026-COMMON-MILLET-4491-R547-S03` | Health Canada CNF 2026, [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | 1,494 data rows; 67,867 bytes; SHA-256 `429cf2e8d4bbd2b732a6e9acf35427ce6d3b4e9447aabaf86b427c48833b112f`. Supplies bilingual labels for measure codes 341, 415, 1601, 750, and 921. |
| `WP03-CNF2026-COMMON-MILLET-4491-R547-S04` | Health Canada CNF 2026, [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | 3 data rows; 172 bytes; SHA-256 `ce6ecd0f370820d6800d7b7b88ae5710691b5d7b358c0503273d36a1a878f977`. Confirms bilingual type labels for codes 3, 6, and 9. |
| `WP03-CNF2015-COMMON-MILLET-4491-R547-S01` | Health Canada, [CNF 2015 serving-size page, Food Code 4491](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4491) | Bilingual dry-food name, 100 mL and 250 mL portions, the separately excluded 46.0 g “amount to make 125ml” value, and 2019-03-01 page modification detail. This is the interim 2015 online route, not the CNF 2026 row source. |

Reuse existing general sources rather than duplicating their URLs: OQLF `WP03-S180` for the species-qualified French/English name; Health Canada overview `WP03-SECTION-F-R310-20261016-S03` and Open Government listing `WP03-SECTION-F-R310-20261016-S04` for edition/file context; and API Guide `WP03-CNF2026-PEARL-BARLEY-4411-R544-S05` for general Yield Amount field semantics. The API Guide source does not establish the meaning of either code 4491 “amount to make” value. The Open Government listing identifies resources but is not row-level evidence.

## Bounded integration recommendation and limits

Add only the dry common-millet form, with null density and no match terms beyond its bilingual labels, then add the four separate 2015/2026 `portion_weight` observations to its ledger record. Do not change the existing common-millet reference aliases, generic-millet identity, flour row, recipe corpus, or substitution state. Keep all five 2026 source rows accounted for: use the two volume rows as observations; exclude the `45 g` mass-only row and total-refuse row; retain the type-9 `46.04` amount-to-make row uninterpreted. Keep the 2015 page's `46.0 g` amount-to-make entry uninterpreted too.

The evidence does not specify filling or packing, establish a general density, create a reusable volume-to-mass rule, describe a cooking/soaking process, give a dry-to-cooked yield, or support substitution. No software tests, builds, or emulator checks are needed for this documentation-only proposal; the shared catalog, ledger, plan, roadmap, and code remain untouched by this proposal.


## Integration result

Added ingredient-form-common-millet-dry with empty match terms and null density, then recorded the four separate CNF 2015/2026 Food Code 4491 portions on its form ledger record. The 45 g mass-only and refuse rows remain excluded; both editions' amount-to-make entries remain uninterpreted. No conversion, yield, recipe link, or substitution was added. The Section F dry-versus-cooked parent remains open. See the [R546–R548 integration README](../batches/wp02-wp03-wp04-r546-r548-gap-review-integration-20261017/README.md).
