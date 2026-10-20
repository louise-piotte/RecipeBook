# WP03 Section F R482 — CNF 2026 cooked-rice row-inspection hold (2026-10-17)

## Review record

- **Scope:** The open Section F follow-up to inspect Health Canada CNF 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type rows for cooked white long-grain rice, historically Food Code 4523.
- **Recommendation:** **Hold the 2026 row decision.** The official 2026 file listing is visible, but this review could not retrieve the underlying rows. Make no claim about whether code 4523 is present in CNF 2026 or what values it contains. Preserve the already integrated CNF 2015 observations as edition-specific evidence.
- **Status:** Proposal only. This file is the only change made for R482; no shared reference, form, ledger, plan, roadmap, manifest, recipe, index, or code file was edited. No tests, builds, emulator checks, or deployment were run.
- **Checklist fit:** This is the specific unchecked child of the open Section F dry/cooked-grain measurement item: inspect the four CNF 2026 tables for cooked white long-grain rice, Food Code 4523, when their contents are accessible ([plan, line 4296](../../RecipeBook-global-ingredient-catalog-plan.txt#L4305)).
- **Snapshot:** 1,759 active ingredient references, 143 forms, 56 legacy-import candidates, and 2,118 research-ledger records with 9,663 source entries, 8,201 distinct source IDs, and 6,914 distinct source URLs. The manifest lists 114 recipe files and 1,123 ingredient rows. These are live workspace counts checked on 2026-10-17.

## Prior-work boundary

R307 recorded the accessible CNF 2015 Food Code 4523 portions on the existing `ingredient-form-rice-cooked` ledger record: 100 mL = 66.8 g, 125 mL = 83.5 g, and 250 mL = 166.9 g. R307 explicitly left the CNF 2026 row inspection open. R482 addresses only that remaining follow-up; it neither repeats nor revises the 2015 observations.

R267 successfully retrieved and parsed the same four official CNF 2026 CSV files in memory for its cooked-quinoa review, Food Code 5917. Its proposal records only quinoa rows and values. That earlier success establishes that the files were retrievable in that review context; it does **not** supply or imply any Food Code 4523 row, code continuity, or rice value. The R267 file source IDs already own the four direct CSV URLs in the live ledger, so R482 must reuse those IDs if later row evidence is retrieved.

Recent R476–R481 work does not overlap this measurement question: R476 held foxtail-millet flakes pending Québec French naming; R479 integrated `Irish oats`, `pinhead oats`, and `avoine irlandaise` aliases on the existing steel-cut-oats row; R477, R478, R480, and R481 cover other seafood and regional identities. The R476–R478 and R479–R481 integration notes confirm those boundaries. R482 makes no oat, cereal identity, alias, or picker change.

## Live identity, form, candidate, and ledger audit

The active identity and forms are already in place:

| Owner | Current state | R482 boundary |
|---|---|---|
| `ingredient-ref-rice` | `rice / riz`, category `GRAIN_AND_CEREAL`; aliases `chawal`, `uruchi rice`, `uruchimai`; `defaultDensity: null`; `unitMappings: []`. | Keep the generic identity and aliases unchanged. |
| `ingredient-form-rice-cooked` | `cooked rice / riz cuit`; empty match terms; `densityGPerMl: null`. Its ledger record is `researched_supported` only for the three R307 CNF 2015 portions and has no supported substitution finding. | Keep the existing three historical observations. Add no 2026 observation, measure, conversion, or form hint. |
| `ingredient-ref-white-rice` and its cooked form | `white rice / riz blanchi` with `riz blanc` and `milled rice` aliases; separate dry and cooked forms. Reference and form densities are null. | Do not transfer a result from the exact white long-grain CNF food to this named milling identity or its cooked form. |
| `ingredient-ref-long-grain-rice` | `long-grain rice / riz à grain long`, with `riz à grains longs`; identity-only, with no density or mappings. | Keep the cooked CNF food descriptor as source context; add no cooked form here. |
| Legacy candidates | The 56-candidate file contains no candidate text matching `rice`, `riz`, or `4523`. | Create no candidate, identity, or reserved ID from an uninspected 2026 row. |

The three R307 observations remain attached only to `ingredient-form-rice-cooked`. The existing `ingredient-ref-rice`, `ingredient-ref-white-rice`, and cooked-white-rice form have no CNF 2026 Food Code 4523 observation. The only 2026 observations currently found for these source files are the cooked-quinoa findings from R267; they belong to Food Code 5917 and remain on quinoa.

### Exact research-ledger ownership

The whole-ledger check found **zero source-ID-to-URL conflicts**. The exact source URL owners relevant to this review are:

| Exact URL | Existing source ID(s) and record owner(s) |
|---|---|
| `https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523` | `WP03-S3-COOKED-4523` is attached to `ingredient-form-rice-cooked`, `ingredient-ref-rice`, and `ingredient-ref-white-rice`; `WP03-SECTION-F-R307-20261016-S01` is on `ingredient-form-rice-cooked`; `WP03-S109` is on `ingredient-ref-long-grain-rice`. All three IDs map to this exact URL. The page supports the CNF 2015 label/portions only. |
| `https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html` | Existing IDs include `WP03-SECTION-F-R310-20261016-S03` (`ingredient-form-pearl-barley-dry`), `WP03-QCM-20261012-S05` (quinoa, maple-syrup, and wild-rice records), `WP03-H-URAD-FORM-R73-20261013-S08`, `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S33`, `WP04-PICKLE-PORTION-20261010-S03`, `WP07-OREGANO-20261012-S03`, `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S04`, `WP03-K-RAPINI-IDENTITY-20261015-R124-S08`, `WP04-SECTIONP-SALMON-FILLETS-R268-20261016-S04`, and `WP07-GARLIC-POWDER-20261012-S03`. The exact URL has 22 ledger source entries across these 10 IDs. |
| `https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109` | Existing IDs include `WP03-SECTION-F-R310-20261016-S04`, `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S32`, `WP04-ASPARAGUS-BUNCH-FOLLOWUP-20261011-S02`, `WP04-WP12-CNF-2026-PRODUCE-20261011-CARROT`, `WP04-WP12-CNF-2026-PRODUCE-20261011-GARLIC`, `WP04-WP12-CNF-2026-PRODUCE-20261011-LEEK`, `WP04-LEMON-066-20261011-S02`, `WP04-WP12-CNF-2026-PRODUCE-20261011-ONION`, `WP04-PIE-CRUST-089-20261011-S02`, `WP04-PIE-CRUST-108-20261011-S03`, `WP04-PIE-CRUST-109-20261011-S03`, `WP04-CNF2026-SERRANO-20261011-S01`, and `WP04-WP12-CNF-2026-PRODUCE-20261011-TOMATO`. The exact URL has 20 ledger source entries across these 13 IDs. |
| `https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv` | `WP03-CNF2026-QUINOA-R267-S01`, on `ingredient-form-quinoa-cooked`. |
| `https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv` | `WP03-CNF2026-QUINOA-R267-S02`, on `ingredient-form-quinoa-cooked` and `ingredient-ref-maple-syrup`. |
| `https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv` | `WP03-CNF2026-QUINOA-R267-S03`, on `ingredient-form-quinoa-cooked`. |
| `https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv` | `WP03-CNF2026-QUINOA-R267-S04`, on `ingredient-form-quinoa-cooked`. |

The R267 IDs above correctly map to their exact file URLs, but they document the quinoa 5917 review, not a rice 4523 review. No existing source ID is assigned to a 2026 rice row. The CNF 2026 all-files ZIP URL listed by Open Canada has no exact URL owner in the ledger and is not used as row evidence. No `WP03-SECTION-F-R482-20261017-S*` source ID or R482 observation ID is allocated for this hold; no 4523 2026 measurement observation exists in the live ledger.

## Source check and access outcome

Health Canada's current [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) describes CNF 2026 as relational CSV files and says that the 2015 online CNF remains available as an interim measure. The official [Open Government CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the Food Name, Measure Weight Conversion, Measure Name, and Measure Type files. Those pages establish the current edition and where its files are listed; they do not establish the row values for rice.

The accessible Health Canada [serving-size page for Food Code 4523](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523) displays `Grains, rice, white, long-grain, regular, cooked / Grains céréaliers, riz blanc, grain long, ordinaire, cuit` and the R307 2015 portions. Its page details show a 2019-03-01 modification date. Health Canada's CNF search page explicitly says it contains the 2015 publication, will not be updated, and remains available while a friendlier 2026 access route is developed. Therefore the online serving page cannot stand in for a CNF 2026 row inspection.

R482 attempted direct browser access to the Open Government dataset and CSV download URLs; the dataset listing returned 403 and direct file reads were unavailable through the web tool. A read-only `urllib` attempt against the same four direct CSV URLs failed at DNS resolution in this review environment. These are access failures in this review context, not evidence that a file or Food Code 4523 row is absent. R267's earlier in-memory retrieval of the files for Food Code 5917 does not change this conclusion because its proposal reports no Food Code 4523 rows.

## Picker and query effects

The projection follows the existing phrase-first, accent-folding search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The proposal changes no display, alias, form label, or match term, so results remain unchanged:

| Query | Current result | After R482 hold |
|---|---|---|
| `cooked rice` / `riz cuit` | `ingredient-ref-rice`, with exact hint `ingredient-form-rice-cooked` | Same. |
| `cooked white rice` / `riz blanchi cuit` | `ingredient-ref-white-rice`, with exact hint `ingredient-form-white-rice-cooked` | Same; keep distinct from generic cooked rice. |
| `long-grain rice` | `ingredient-ref-long-grain-rice` | Same; no cooked form is added. |
| `white rice` | Two rows: `ingredient-ref-white-rice` and `ingredient-ref-white-rice-flour` | Same. |
| `rice` / `riz` | 71 / 66 rows | Same. |

The CNF's precise English and French food-description strings are not active aliases or picker terms. No emulator query is proposed because the catalog search data does not change.

## Manifest recipe audit

The audit parsed the manifest in listed order and scanned complete serialized recipe files and structured ingredient rows for `cooked white long-grain rice`, `white long-grain rice, cooked`, the CNF English/French food description, `4523`, and `Food Code 4523`. The corpus contains **114 manifest-listed files, 1,123 ingredient rows, and 753,988 recipe-file bytes**. Its manifest-ordered SHA-256 is **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, computed by hashing each relative manifest path, NUL, exact file bytes, and NUL. The fingerprint matches the R476 and R479–R481 review snapshots.

There are zero file and zero structured-row hits for the CNF food description or code `4523`. The four rice-linked ingredient rows are:

| Recipe line | Existing source text and link |
|---|---|
| 066#14 — Korean Soy-Marinated Jammy Eggs | `Cooked white rice, for serving` → `ingredient-ref-white-rice` / `ingredient-form-white-rice-cooked`. |
| 086#16 — Butter Chicken | `cooked rice, for serving` → `ingredient-ref-rice` / `ingredient-form-rice-cooked`; no numeric amount. |
| 090#16 — African Peanut Stew | `cooked rice, for serving` → `ingredient-ref-rice` / `ingredient-form-rice-cooked`; no numeric amount. |
| 093#1 — Fried Rice | `1/3 cup cooked rice` → `ingredient-ref-rice` / `ingredient-form-rice-cooked`; preserve the existing quantity. |

No recipe link, wording, quantity, or form assignment is proposed. The CNF 2026 food descriptor is source evidence for a future row review only; it is not bundled recipe demand.

## Numeric, form, yield, and substitution limits

- Keep the three R307 CNF 2015 portion observations unchanged and scoped to that edition and Food Code 4523. Do not replace or merge them with uninspected CNF 2026 values.
- Add no measure, density, `unitMapping`, active volume-to-mass conversion, or recipe conversion. A published portion is not by itself a reusable packed-cup measure, and this review has no 2026 portion row to assess.
- Add no new dry/cooked form, form hint, or cooking-yield relation. Do not compare this cooked food code with dry rice to derive yield.
- Keep `ingredient-form-rice-cooked`, `ingredient-form-white-rice-cooked`, and the white long-grain rice identity separate. Do not transfer any future 4523 value across rice types or identities without source-specific review.
- Add no recipe link, substitution finding, substitution rule, or recipe-line substitution. No source in this bounded row-access review establishes one.

## Disposition and reopen condition

**Hold the CNF 2026 Food Code 4523 row decision and make no data delta.** Keep the exact Section F child checkbox open. Preserve the existing 2015 observations, current identities/forms, picker results, four recipe rows, measurement state, and substitution state unchanged.

Reopen when the official CNF 2026 contents can be retrieved. Search the Food Name table by the bilingual cooked white long-grain description and verify the food code before joining all matching Measure Weight Conversion rows to Measure Name and Measure Type. Record file/version and row-date evidence, keep any 2026 values separate from CNF 2015, and propose only source-specific observations actually supported by the joined rows. Do not infer absence from an inaccessible file, assume the 2015 code or portions carry forward, or promote a published portion to a general density, conversion, or cooking yield.

**Root-review recommendation:** Accept this bounded, documentation-only hold and leave the CNF 2026 Food Code 4523 checkbox open until the joined rows are directly verified. R482 changes no shared catalog data.
