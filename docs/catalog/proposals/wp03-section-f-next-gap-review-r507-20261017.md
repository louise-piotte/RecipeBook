# WP03 Section F — dry quinoa CNF 2026 row-access review (R507, 2026-10-17)

**Status: integrated documentation-only access hold.** Keep the Food Code 4495 row inspection open; no shared catalog or ledger data changed. The current review could not retrieve the official CNF 2026 CSV contents, and no local copies were found. It makes no new row-presence, absence, or value claim for dry quinoa. Retain the separate CNF 2015 observations already recorded on the dry form. See the [R507 integration README](../batches/wp03-section-f-cnf-2026-dry-quinoa-row-access-recheck-integration-r507-20261017/README.md).

## Selected gap and bounded decision

The open Section F checklist asks to inspect the CNF 2026 Food Name and Measure Weight Conversion rows for dry quinoa, Food Code 4495 ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4330)). This is distinct from the completed cooked-quinoa join for Food Code 5917 in [R267](wp03-next-section-f-gap-review-r267-20261016.md), and from [R303](wp03-section-f-next-gap-review-r303-20261016.md), which records CNF 2015 portions for dry quinoa but expressly leaves the 2026 join open. The recent [R503 rice review](wp03-section-f-cnf-2026-cooked-white-long-grain-rice-row-inspection-r503-20261017.md) concerns Food Code 4523, not quinoa.

R267's archived direct-CSV review reports that its Food Name file-wide search found a separate dry-quinoa row, Food Code 4495. That is a prior documented finding, not a new retrieval in R507. The present review did not obtain the file bytes and cannot independently recheck that row or join its measurements. It therefore does **not** determine whether the CNF 2026 Measure Weight Conversion file has rows for Food Code 4495, nor any measure labels, types, or values.

**Disposition:** leave the plan item open until the official Food Name, Measure Weight Conversion, Measure Name, and Measure Type contents can be read and joined by their codes. Add no catalog, ledger, recipe, or source-record data now. Preserve the supported CNF 2015 dry-quinoa observations in place; do not infer 2026 values from them or transfer the cooked-quinoa 2026 values.

## Current identity, form, measurement state, and ownership

The live package contains 1,785 ingredient references and 143 forms. The generic identity is `ingredient-ref-quinoa`, displayed `quinoa / quinoa`, category `GRAIN_AND_CEREAL`, with English alias `quinua`, no French aliases, `defaultDensity: null`, and empty `unitMappings`. The separate processed and color-qualified quinoa identities remain distinct: black quinoa, black-quinoa flour, puffed quinoa, quinoa flakes, quinoa flour, red quinoa, red-quinoa flour, roasted-quinoa flour, and white-quinoa flour.

The generic identity has two forms, each with empty match-term arrays and null form density:

| Form | English / French label | Current evidence state |
|---|---|---|
| `ingredient-form-quinoa-dry` | `quinoa, dry` / `quinoa, sec` | Ledger `measurementState: researched_supported` for the two CNF 2015 Food Code 4495 published portions only; `substitutionResearchState: not_yet_researched`. |
| `ingredient-form-quinoa-cooked` | `quinoa, cooked` / `quinoa, cuit` | Holds the separate CNF 2026 Food Code 5917 portion observations from R267. |

R303 already attached the CNF 2015 observations to the dry form: 100 mL = 71.9 g and 250 mL = 179.6 g. They are edition-specific published portions; the source does not state a fill or packing method. Keep them separate from CNF 2026 and from the cooked-form values. Neither observation establishes a default density, reusable conversion, cooking yield, or recipe mass. No generic or contextual quinoa substitution rule exists in the live rules files.

The legacy-import file has 56 candidates and no candidate containing `quinoa` or `quinua`. The exact active owner of the normalized phrases `quinoa dry` and `quinoa sec` is the generic reference through its dry form; `dry quinoa` has no exact active owner. No identity, form, alias, display text, or match term is proposed, so no picker ownership changes.

## Phrase-first picker projection

This is a static projection following [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, ligatures, punctuation, and spacing; prefer complete word phrases across reference names, aliases, and attached form labels; use substring fallback only when there is no phrase match. A form hint is available only for a complete normalized form phrase.

| Query | Current result | Form hint |
|---|---|---|
| `quinoa` | Ten separate quinoa-related references, including generic quinoa, black/red quinoa, quinoa flour/flakes, puffed quinoa, and qualified quinoa flours. | None. |
| `quinua` | `ingredient-ref-quinoa`. | None. |
| `quinoa dry`, `quinoa, dry`, `quinoa sec` | `ingredient-ref-quinoa`. | `ingredient-form-quinoa-dry`. |
| `dry quinoa` | No result. | None. |
| `quinoa cooked`, `quinoa cuit` | `ingredient-ref-quinoa`. | `ingredient-form-quinoa-cooked`. |

No names, aliases, or forms change under this hold, so the projection remains unchanged. It is not live Android picker QA.

## Manifest recipe corpus

The scan parsed all 114 recipe paths listed in the current seed manifest, covering 1,123 structured ingredient rows and 753,988 raw recipe-file bytes. Corpus fingerprint: SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`, computed in manifest order by hashing each UTF-8 relative path, NUL, raw file bytes, NUL.

The only structured quinoa ingredient row is recipe **016#1**, `2 cups cooked quinoa`, linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`. No structured ingredient row contains dry quinoa, Food Code 4495, or a 2026 measurement claim. Recipe 018 mentions quinoa in prose but has no quinoa ingredient row. Preserve the existing row and links; the CNF 2026 access review supplies no recipe-specific quantity or yield.

## Current official evidence and access attempts

Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) says CNF 2026 is available as relational CSV files and that the CNF 2015 online version remains as an interim access route. The official Open Government [CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the four required data resources and the all-files ZIP; the listing shows an update date of 2026-10-04. Resource metadata for Food Name reports a 2026-05-08 validation timestamp. These facts establish the current edition and file endpoints, not the dry-quinoa measurement rows.

On 2026-10-17, I attempted to open each of the four direct official CSV URLs through the available browser tool. Each returned “URL … is not accessible via this tool.” I then attempted `urllib.request.urlopen(url, timeout=15)` for each exact URL from the workspace environment; all four failed with `URLError: <urlopen error [Errno -3] Temporary failure in name resolution>` before returning response bytes. A hidden-file-aware repository search for the CNF all-files archive, `food_name.csv`, `measure_weight_conversion.csv`, `measure_name.csv`, and `measure_type.csv` found no local copy. No CSV row was parsed in R507.

The separate official [CNF 2015 Food Code 4495 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495) remains accessible and still shows the historic dry-state label and 100 mL = 71.9 g / 250 mL = 179.6 g portions. It is not a CNF 2026 file and does not close this row review.

## Source-ID-to-URL mapping and ownership/archive audit

The current research ledger has 2,142 records, 9,829 source entries, 8,317 distinct source IDs, and 7,027 distinct URLs. Each live source ID maps to one URL; the whole-ledger audit found no source-ID-to-multiple-URL conflicts. Existing IDs below are reused only for their exact already-owned URL and scope. `R507-S01` and `R507-S02` are proposal-local citation keys, not ledger source IDs.

| Source ID | Exactly one URL | Existing owner / scope |
|---|---|---|
| `R507-S01` (proposal-local) | [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Current file-format context only; no ledger ID allocated. |
| `R507-S02` (proposal-local) | [Open Government CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Edition/resource metadata only; no ledger ID allocated. |
| `WP03-CNF2026-QUINOA-R267-S01` | [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | `ingredient-form-quinoa-cooked`; R267's joined cooked-quinoa review, Food Code 5917. Its URL points to this one file. |
| `WP03-CNF2026-QUINOA-R267-S02` | [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | `ingredient-form-quinoa-cooked` and `ingredient-ref-maple-syrup`; R267's Food Code 5917 observations and existing syrup evidence. Not reassigned to dry quinoa. |
| `WP03-CNF2026-QUINOA-R267-S03` | [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | `ingredient-form-quinoa-cooked`; R267's measure labels for the Food Code 5917 join. |
| `WP03-CNF2026-QUINOA-R267-S04` | [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | `ingredient-form-quinoa-cooked`; R267's measure types for the Food Code 5917 join. |
| `WP03-QCM-20261012-S05` | [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Existing ledger owners include cooked quinoa, maple syrup, and wild rice; publication-format context only. |
| `WP03-S5` | [CNF 2015 Food Code 4495 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495) | `ingredient-ref-quinoa` and `ingredient-form-quinoa-dry`; existing bilingual dry-state label evidence. |
| `WP03-QUINOA-DRY-CNF2015-R303-20261016-S01` | [CNF 2015 Food Code 4495 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495) | `ingredient-form-quinoa-dry`; owns the existing 2015 portion observations and their exact scope. |

R267's four direct-file source IDs each map to exactly one URL in the ledger. The R267 proposal's historical file-wide name search reports a dry-food entry, 4495, but its ledger data decision and joined measurements concern cooked quinoa, 5917. R303 separately registers the two 2015 dry observations. The [R302–R304 integration note](../batches/wp02-wp03-wp04-r302-r304-research-integration-20261016/README.md) explicitly leaves the CNF 2026 Food Code 4495 contents uninspected. No source ID or observation ID is proposed for allocation by R507.

## Evidence limits and next inspection

- The 2026 listing and resource metadata do not establish row contents.
- R267's archived direct parse supports its cooked-quinoa 5917 join and records a Food Name file-wide mention of dry quinoa 4495; no raw source file was preserved, and R507 could not retrieve it.
- R507 makes no claim about the presence, absence, values, measure types, row dates, or language labels for the Food Code 4495 joined rows.
- CNF 2015 portions remain edition-specific observations. Do not overwrite, average, extrapolate, or describe them as 2026 values.
- No dry-to-cooked yield, active measure, density, unit mapping, recipe amount, or substitution is proposed.

When the official contents become directly accessible, verify the current bilingual Food Name row and its Food Code, join every matching Measure Weight Conversion row on `Food_Code`, then join Measure Name by `Measure_Code` and Measure Type by `Measure_Type_Code`. Distinguish volume measures from mass-labelled, refuse, or other rows. Record only directly verified rows as edition-specific observations; do not derive a density or reusable conversion from them.

**No software tests, builds, emulator checks, deployments, or app integration were run.** This is a documentation-only access hold; static corpus, ownership, UTF-8, and link checks were performed. The official [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) confirms the relational CSV format and interim 2015 online resource, while the [CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) exposes the four required files without their row contents through the available tools.
