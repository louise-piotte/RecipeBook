# WP03 Section F R741 — cooked millet CNF 2026 row-join access hold

## Review decision

- **Status:** Accepted as a documentation-only access hold in the WP02/WP03/WP04 R740–R742 batch. No shared JSON changed; the CNF 2026 code-4492 join remains open.
- **Reviewed:** 2026-10-18.
- **Checklist fit:** The Section F dry/cooked-grain parent remains open at [plan line 4652](../../RecipeBook-global-ingredient-catalog-plan.txt#L4661). Its R567 child added a generic cooked-millet form from CNF 2015 Food Code 4492 and explicitly left the CNF 2026 row join open; R570's access attempt also left that join unresolved ([R567](wp03-section-f-next-gap-review-r567-20261017.md), [R570](wp03-section-f-cnf-2026-cooked-millet-row-review-r570-20261017.md), [plan lines 4729–4740](../../RecipeBook-global-ingredient-catalog-plan.txt#L4738)).
- **Bounded item:** Recheck only the four official CNF 2026 files needed to join Food Code 4492 for cooked millet: Food Name, Measure Weight Conversion, Measure Name, and Measure Type.
- **Recommendation:** Keep the current-edition join open. The official portal still lists these relational resources, but its CSV download and resource-page routes do not expose row contents in this review environment. Do not claim that Food Code 4492 is present or absent in CNF 2026, or report a 2026 name, measure, type, or value.
- **Exact delta:** No shared JSON or other project data change. Preserve the existing bilingual cooked form and its three CNF 2015 observations exactly; add no CNF 2026 source, observation, active measure, density, mapping, conversion, cooking yield, recipe link, alias, or substitution.
- **Snapshot:** 1,848 ingredient references, 177 forms, 2,234 research-ledger records, and 114 manifest-listed recipes / 1,123 structured ingredient rows.

This is a current-edition row-access hold for generic cooked millet. It does not reopen R547's separate *Panicum miliaceum* dry form or assign a species to Food Code 4492. The latest integrated checkpoint is R737–R739 in the [roadmap](../../../roadmap.md#L1491) and [catalog workflow](../ingredient-catalog-workflow.md#L3039); R738's Oatmeal Crisp family hold is unrelated and remains unchanged.

## Primary-source check and limits

Labels S01–S05 below are local review labels only. No source IDs are reserved or added to the research ledger.

| Label | Official source and evidence | Limit |
|---|---|---|
| S01 | Health Canada, [Canadian Nutrient File, 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), checked 2026-10-18. The listing identifies the 2026 relational dataset, its CSV resources, an all-files ZIP, and a 2026-10-04 record modification date. | The search-indexed metadata confirms that files are listed; it supplies no Food Code 4492 row content. The dataset record's modified date does not mean the underlying target row changed on that date. |
| S02 | Health Canada / Open Government Portal, [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv), [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), and [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv). Each direct download was attempted on 2026-10-18 and was inaccessible through the browser. Three opened resource pages returned HTTP 403; the Measure Weight Conversion resource page was inaccessible through the tool. | No CSV bytes or joined code-4492 rows were read. These access failures establish neither row presence nor row absence. The workspace network is restricted, so no direct local download was attempted. |
| S03 | Health Canada, [CNF Frequently Asked Questions](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/frequently-asked-questions-canadian-nutrient-file.html), current page checked 2026-10-18. The page distinguishes the downloadable database from the online CNF interface and directs users to the 2015 online version. | Context only; it does not provide 2026 Food Code 4492 rows. |
| S04 | Health Canada, [CNF 2015 serving-size page, Food Code 4492](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4492), accessed 2026-10-18. The page names `Grains, millet, cooked / Grains céréaliers, millet, cuit`, and lists 100 mL = 73.5 g, 125 mL = 91.9 g, and 250 mL = 183.9 g. Its page metadata gives 2019-03-01 as the modification date. | This is the legacy CNF 2015 web application. It supports only the existing 2015 observations; it is not evidence of CNF 2026 row presence, wording, or values. It does not identify a millet species or state a filling/packing method. |
| S05 | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), checked 2026-10-18. It states that CNF 2026 is published as relational CSV files and the 2015 online interface remains available as an interim route. | Release/access context only. It is not a Food Code 4492 row source. |

The current evidence therefore remains **CNF 2015 only**: the exact bilingual food name and three published portions above. Do not promote those historical values to the CNF 2026 edition or derive density, a reusable conversion, or a dry-to-cooked yield from them.

## Current catalog and ledger ownership

| Record | Live state | R741 disposition |
|---|---|---|
| `ingredient-ref-millet` | `millet / millet`, category `GRAIN_AND_CEREAL`, no aliases, null density, and no unit mappings. | Leave identity, bilingual name, and broad species scope unchanged. |
| `ingredient-form-millet-cooked` | `millet, cooked / millet, cuit` under the generic millet identity; `formCode` and `prepState` are `cooked`; no form match terms and null density. | Keep the current form label. The CNF 2015 page does not establish a particular species, so do not attach this form to common millet or another species row. |
| Ledger record `ingredient-form-millet-cooked` | `measurementState: researched_supported`; `substitutionResearchState: not_yet_researched`; three `portion_weight` observations for CNF 2015 Food Code 4492: 100 mL = 73.5 g, 125 mL = 91.9 g, and 250 mL = 183.9 g. | Preserve those 2015-only observations and states. No CNF 2026 source ID or observation currently supports code 4492. |
| Legacy source owner | `WP03-CNF2015-MILLET-4492-R567-S01` owns the 2015 serving-size page on the cooked-form ledger record. | Reuse only for the legacy 2015 values; do not label it as a 2026 source. |
| Existing owners of 2026 resource URLs | The four CSV URLs in S02 are already registered in the ledger for other food codes, including common millet Food Code 4491 as `WP03-CNF2026-COMMON-MILLET-4491-R547-S01` through `S04`. The dataset listing and CNF overview are also already owned by existing ledger source IDs, including `WP03-SECTION-F-R310-20261016-S03/S04`. | These shared resource records do not support code-4492 row facts. No duplicate source record, source ID, observation ID, or catalog ID is created by this hold. Reconcile any future code-4492 source usage with the existing URL owners. |

Source ownership was checked against the full current ledger for the four exact CSV URLs, dataset listing, overview, and legacy code-4492 page. The four CSV URLs have existing owners for other food-code joins, but **no code-4492-specific CNF 2026 owner** exists. The legacy code-4492 page is owned only as the R567 CNF 2015 source. No R741 source IDs or observation IDs exist in the ledger.

## Bilingual identity and picker projection

The existing generic names remain English `millet` and French `millet`. The existing cooked form uses the Health Canada bilingual CNF 2015 state label `millet, cooked / millet, cuit`. Since no CNF 2026 code-4492 row was available, this review makes no claim that the current edition uses the same wording or scope; no French terminology change is proposed.

The static picker projection was recomputed from all active reference names, aliases, form labels, and form match terms using the phrase-first then substring behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt):

| Query | Current projection | R741 effect |
|---|---|---|
| `millet cooked` | One result: `ingredient-ref-millet`, with the cooked-form hint. | None. |
| `millet cuit` | One result: `ingredient-ref-millet`, with the cooked-form hint. | None. |
| `cooked millet` | One phrase/substring result: `ingredient-ref-thiakry-millet-granules` (`pre-cooked millet granules`). | None. Do not add a reversed-order alias or match term as a side effect of the measurement review. |
| `millet` | 20 references, including the generic, species-qualified, flour, flake, and prepared-product entries. | None; preserve the existing broad choice set. |

These are static projections, not device picker tests. No new name or alias is justified by the inaccessible row join.

## Recipe corpus scan

All 114 recipe paths listed in the live bundled-library manifest were parsed: 1,123 structured ingredient rows. The scan covered `millet`, `millet cooked`, `millet cuit`, `cooked millet`, `common millet`, `millet commun`, `ingredient-ref-millet`, `ingredient-form-millet-cooked`, and code `4492` across complete recipe JSON files and ingredient rows. Result: **0 matching files, 0 ingredient rows, and 0 direct reference/form links**. The manifest-ordered file fingerprint is `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362` (114 recipe files; 754,048 bytes).

## Exact hold and resume conditions

1. Keep the existing generic cooked-millet bilingual form and the three distinct CNF 2015 observations unchanged.
2. Keep the CNF 2026 Food Code 4492 join open. Do not claim row presence or absence, and do not copy any values or state wording from CNF 2015 into CNF 2026.
3. Add no active or ledger data from this review. Do not allocate IDs while no 2026 row evidence has been read.
4. Resume the join only when row contents are accessible for all necessary files. Confirm the code-4492 Food Name row, join every conversion row to its bilingual Measure Name and Measure Type, then retain only clearly classifiable published volume portions. Keep mass-only, refuse, and unexplained Yield rows out of transferable kitchen data unless the exact row semantics are established.
5. Keep the 2015 values edition-specific. Do not infer density, extrapolate to other volumes, derive dry-to-cooked yield, or connect this generic cooked form to *Panicum miliaceum*.

This closes only the R741 access recheck. It does not close the CNF 2026 code-4492 join or the broader Section F dry/cooked-grain parent. The 2026 data endpoint remains an evidence-access gap, not evidence that the row is missing.

## Review checks and test scope

- [x] Re-read current `AGENTS.md`, the open Section F checklist and R737–R739 checkpoint, plus R567/R570 history; confirmed the exact CNF 2026 row-join child remains unresolved.
- [x] Checked current Health Canada/Open Government primary sources. The 2026 dataset listing is available in indexed form; all four row CSV downloads remain inaccessible. Three resource-page requests returned HTTP 403 and the Measure Weight Conversion page remained inaccessible. Checked the separate legacy code-4492 page and kept its 2015 edition explicit.
- [x] Audited current reference/form/ledger state, source URL owners, source IDs, observation IDs, and relevant picker terms. No identifier is allocated.
- [x] Projected exact English/French form queries and broad `millet` search using the current search logic.
- [x] Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; no millet/code-4492 demand or links were found.
- [x] Checked local Markdown links, UTF-8 without BOM, and whitespace after writing.
- **No software tests, build, emulator run, or deployment were performed.** The accepted R741 result is documentation-only and changes no shared catalog data.
