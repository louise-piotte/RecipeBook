# WP03 Section F R503 — CNF 2026 cooked white long-grain rice row inspection (2026-10-17)

## Review decision

**Keep the CNF 2026 Food Code 4523 row inspection open; make no catalog or ledger change.** I could not retrieve the four official 2026 CSV contents in this review, and no repository-local copies were found. I therefore make no claim that CNF 2026 does or does not contain Food Code 4523, and report no 2026 food description, measure, measure type, portion, or weight. Preserve the existing CNF 2015 observations separately.

This is the open Section F child to inspect the CNF 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type rows for cooked white long-grain rice, historically Food Code 4523 ([plan, line 4312](../../RecipeBook-global-ingredient-catalog-plan.txt#L4321)). R482 documented an earlier access hold; this review repeats the retrieval attempt and re-audits the current package and ledger. At proposal submission, this file was the only R503 artifact; the reviewer did not edit shared catalog JSON, ledger, plan, workflow, roadmap, recipe, generated file, or code. Root integration records the repeated bounded hold in the plan and roadmap while leaving the row-inspection child open. No software tests, build, emulator, or deployment were run.

## Official file access and evidence limits

Health Canada’s current [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is published as relational CSV files and that the searchable online CNF 2015 remains an interim measure. The indexed [Open Government CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) identifies the four CSV resources and the all-files ZIP. Its indexed record shows a 2026-10-04 modification date; the indexed Food Name resource metadata reports data last updated 2026-05-08. These establish the edition and advertised file resources, not the rice rows.

| Official route attempted on 2026-10-17 | Outcome |
|---|---|
| [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Direct browser open returned HTTP 403. Search indexing exposed listing metadata and resource names only. |
| [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Direct browser open reported that the URL was inaccessible. Local `urllib` returned `URLError: [Errno -3] Temporary failure in name resolution`. No CSV rows were read. |
| [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Direct browser open reported that the URL was inaccessible. Local `urllib` returned `URLError: [Errno -3] Temporary failure in name resolution`. No conversion rows were read. |
| [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Direct browser open reported that the URL was inaccessible. Local `urllib` returned `URLError: [Errno -3] Temporary failure in name resolution`. No measure labels were read. |
| [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Direct browser open reported that the URL was inaccessible. Local `urllib` returned `URLError: [Errno -3] Temporary failure in name resolution`. No measure types were read. |
| [All-files CNF 2026 ZIP](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip) | Direct browser open reported that the URL was inaccessible. Local `urllib` returned `URLError: [Errno -3] Temporary failure in name resolution`. The ZIP was not read. |
| Official Open Government datastore route for Food Name: [`datastore_search`, `q=4523`](https://open.canada.ca/data/api/3/action/datastore_search?resource_id=e1ffee62-58cb-4e3e-b359-115c658388ad&q=4523) | Browser tool could not access the API route. No result was returned. |

A hidden-file-aware repository search for CSV, ZIP, DB, and SQLite files found no CNF copy. The non-CNF archive matches were the exported recipe-list ZIP at `docs/exported-recipe-lists/RecipeKeeper_20260320_143058.zip` and Gradle dependency annotation ZIPs; the recipe ZIP listing contains `recipes.html` and recipe images. R267 previously fetched and parsed these official CSVs in memory for cooked quinoa, Food Code 5917. Its proposal records quinoa rows only; its in-memory data was not preserved in the repository, and it does not document a 4523 result that can be independently rechecked here. That prior retrieval is not evidence for rice. The online Health Canada [Food Code 4523 serving page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523) is the CNF 2015 interface, whose page details give 2019-03-01; it cannot establish CNF 2026 rows.

A current web search using `4523` and the bilingual food description surfaced the Health Canada 2015 serving page and its 2015 search guide, not the CNF 2026 table rows. These results were not used as 2026 evidence.

These failures describe access in this review environment only. They are not a negative search result and do not establish whether the row or any joined measure rows exist.

## Existing identity, forms, and measurement scope

The live package currently has 1,783 ingredient references and 143 forms. The legacy-import file has 56 candidates and no candidate text matching `rice`, `riz`, or `4523`.

| Current owner | Relevant fields and state | R503 boundary |
|---|---|---|
| `ingredient-ref-rice` | `rice / riz`; aliases `chawal`, `uruchi rice`, and `uruchimai`; category `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []`. Ledger measurement state: `not_yet_researched`. | Keep the generic rice identity and aliases unchanged. |
| `ingredient-form-rice-cooked` | `cooked rice / riz cuit`; no match terms; `densityGPerMl: null`. Ledger measurement state: `researched_supported` for the existing CNF 2015 portions only. | Retain all three 2015 observations. Add no 2026 observation, active measure, conversion, density, yield, or substitution. |
| `ingredient-form-rice-dry` | `dry rice / riz sec`; no match terms; `densityGPerMl: null`. | Do not infer dry-rice data or a dry-to-cooked yield from this cooked food review. |
| `ingredient-ref-white-rice` and its dry/cooked forms | `white rice / riz blanchi`; aliases `riz blanc` and `milled rice`; form labels `dry white rice / riz blanchi, sec` and `cooked white rice / riz blanchi, cuit`; densities null. Reference measurement state is `blocked_pending_evidence`. | Keep separate from generic rice and the named long-grain identity. Do not transfer a future 4523 value to this white-rice identity. |
| `ingredient-ref-long-grain-rice` | `long-grain rice / riz à grain long`, alias `riz à grains longs`; identity-only, no density or mappings. | Preserve the separate grain-class identity; add no cooked form from an uninspected row. |

The existing [R307 review](wp03-section-f-next-gap-review-r307-20261016.md) recorded CNF 2015 Food Code 4523 portions on `ingredient-form-rice-cooked`: 100 mL = 66.8 g, 125 mL = 83.5 g, and 250 mL = 166.9 g. Each remains an edition-specific `portion_weight` observation, not a reusable conversion. Keep them unchanged. No portion supports an active density, unit mapping, recipe conversion, cooking yield, or measure without additional evidence.

The research ledger contains no unit conversion referring to rice, and the current global and contextual substitution-rule files are empty. This review proposes no conversion or substitution rule.

The three historical observations are on `ingredient-form-rice-cooked` only. The generic `ingredient-ref-rice` has no measurement observation; neither `ingredient-ref-white-rice` nor `ingredient-ref-long-grain-rice` has a 4523 observation. The separate `ingredient-form-white-rice-cooked` is not a ledger record. Keep the older source scoped exactly as integrated.

## Source-ID-to-URL mapping and ownership/archive audit

The research ledger has 2,140 records, 9,808 source entries, 8,303 distinct source IDs, and 7,013 distinct source URLs. Every live source ID maps to exactly one URL; the whole-ledger audit found no source-ID-to-multiple-URL conflict. Existing IDs below are reused only to identify their exact already-owned URL. R503 creates no ledger source ID, observation ID, or record.

| Source ID | Exactly one mapped URL | Current owner/archive scope |
|---|---|---|
| `R503-S01` (proposal-local citation key only) | [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | CNF publication context; no ledger ID allocated. |
| `R503-S02` (proposal-local citation key only) | [Open Government CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Listing/resource metadata only; no ledger ID allocated. |
| `WP03-CNF2026-QUINOA-R267-S01` | [Food Name CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Existing ledger owner: `ingredient-form-quinoa-cooked`; R267 quinoa 5917 row review only. |
| `WP03-CNF2026-QUINOA-R267-S02` | [Measure Weight Conversion CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Existing ledger owners: `ingredient-form-quinoa-cooked` and `ingredient-ref-maple-syrup`; R267 scoped observations only. |
| `WP03-CNF2026-QUINOA-R267-S03` | [Measure Name CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Existing ledger owner: `ingredient-form-quinoa-cooked`; R267 quinoa 5917 row review only. |
| `WP03-CNF2026-QUINOA-R267-S04` | [Measure Type CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Existing ledger owner: `ingredient-form-quinoa-cooked`; R267 quinoa 5917 row review only. |
| `WP03-SECTION-F-R307-20261016-S01` | [CNF 2015 Food Code 4523 serving page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523) | Existing owner: `ingredient-form-rice-cooked`; supports the three preserved 2015 published portions only. |
| `WP03-S3-COOKED-4523` | [CNF 2015 Food Code 4523 serving page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523) | Existing owners: generic rice, cooked rice form, and white-rice reference; cooked-state wording only. |
| `WP03-S109` | [CNF 2015 Food Code 4523 serving page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523) | Existing owner: long-grain-rice reference; bilingual name context only. |

The R267 proposal and ledger correctly assign one direct CSV URL to each of its four existing source IDs. Those IDs are not reassigned to rice: their archived decisions and observations concern cooked quinoa Food Code 5917 (plus the existing maple-syrup attachment for S02). R482 also records that these sources provide no 4523 row claim. The CNF 2015 page has several existing source IDs, each still pointing to that same exact page; these IDs retain only their prior edition-specific scopes. No 2026 rice observation exists, and this hold allocates none.

The proposal-local keys `R503-S01` and `R503-S02` occur only in this review and do not add ledger source IDs.

## Phrase-first picker projection

The audit follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, ligatures, punctuation, and spacing; searches complete word phrases across reference names, aliases, and attached form labels first; and uses substring matching only when there is no phrase match. A form hint is returned only for a complete normalized form phrase.

There is no alias, form, match-term, or display-label proposal, so the current picker projection is unchanged:

| Query | Current phrase-first result | After R503 hold |
|---|---|---|
| `cooked rice` / `riz cuit` | `ingredient-ref-rice`, with `ingredient-form-rice-cooked` hint | Same. |
| `cooked white rice` / `riz blanchi cuit` | `ingredient-ref-white-rice`, with `ingredient-form-white-rice-cooked` hint | Same. |
| `long-grain rice` | `ingredient-ref-long-grain-rice`; no cooked form | Same. |
| `white rice` | `ingredient-ref-white-rice` and `ingredient-ref-white-rice-flour` | Same. |
| Broad query `rice` / `riz` | 72 / 69 references in the current package snapshot | Same. |

The CNF description is source context only. It is not added as an alias or match term, and the hold does not merge generic rice, white rice, and long-grain rice.

## Manifest-ordered recipe corpus audit

The audit parsed all 114 paths listed in the seed manifest, scanned complete serialized recipe files and structured ingredient rows for `cooked white long-grain rice`, `white long-grain rice, cooked`, both CNF 4523 bilingual description strings, `4523`, and `Food Code 4523`, and separately checked rice-linked ingredient rows. The manifest contains 1,123 structured ingredient rows and 753,988 recipe-file bytes. Its ordered SHA-256 is **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, calculated by hashing each relative path, NUL, exact file bytes, and NUL. It matches the R482 corpus fingerprint.

There are zero full-file or structured-row hits for the CNF description or code `4523`. Five ingredient rows mention rice; one is the distinct crispy-rice-cereal identity, and the four ordinary-rice recipe links are:

| Recipe line | Current text and link |
|---|---|
| 066#14 — Korean Soy-Marinated Jammy Eggs | `Cooked white rice, for serving` → `ingredient-ref-white-rice` / `ingredient-form-white-rice-cooked`. |
| 086#16 — Butter Chicken | `cooked rice, for serving` → `ingredient-ref-rice` / `ingredient-form-rice-cooked`; no numeric amount. |
| 090#16 — African Peanut Stew | `cooked rice, for serving` → `ingredient-ref-rice` / `ingredient-form-rice-cooked`; no numeric amount. |
| 093#1 — Fried Rice | `1/3 cup cooked rice` → `ingredient-ref-rice` / `ingredient-form-rice-cooked`. |

The remaining rice-text row is recipe 040#5, `6 cups crispy rice cereal`, linked to `ingredient-ref-rice-cereal`; it is not demand for the cooked-rice identity. No recipe wording, amount, form, or link change is proposed.

## Disposition and reopen condition

**Hold the CNF 2026 Food Code 4523 row decision and make no data delta.** Preserve the current identities, aliases, forms, four rice recipe links, and all three CNF 2015 observations unchanged. Keep this plan child open. Do not replace, merge, or reinterpret the 2015 portions as 2026 data. Add no density, unit mapping, active measure, conversion, yield, substitution, or recipe-specific mass.

Reopen when official CNF 2026 contents can be fetched or directly inspected. Find the current bilingual cooked white long-grain Food Name row and verify its current Food Code before joining every matching Measure Weight Conversion row to Measure Name and Measure Type. Record only joined rows that are directly verified, keep them edition-specific, and distinguish volume-labelled measures from mass, refuse, or other measure types. Do not infer row presence, absence, code continuity, or values from the 2015 page, CNF listing metadata, R267’s quinoa rows, or failed access.

**Tests rule:** This proposal changes documentation only. No software tests, builds, emulator checks, or deployment were run. If later integration only adds database JSON data, `AGENTS.md` says testing is not needed.
