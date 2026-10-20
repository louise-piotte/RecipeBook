# WP03 Section F — dry pearl-barley CNF 2026 row-access review (R510, 2026-10-17)

**Status: integrated documentation-only access hold.** Keep the CNF 2026 joined-row inspection open for dry pearl barley, Food Code 4411. The review could not retrieve the official relational-file contents or find a repository copy. It makes no claim that a 2026 food or measure row is present or absent and proposes no catalog or research-ledger data change; see the [R510 integration README](../batches/wp03-section-f-pearl-barley-cnf-2026-access-recheck-integration-r510-20261017/README.md).

## Selected open item and decision

The current Section F checklist asks for the joined CNF 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type rows for dry pearl barley, Food Code 4411, while keeping the prior CNF 2015 values separate ([open plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L4351)). This is distinct from the completed form setup in [R27](wp03-section-f-pearl-barley-dry-cooked-form-review-R27-20261013.md), the historical portions recorded in [R310](wp03-section-f-pearl-barley-dry-measure-review-r310-20261016.md), and the separate row reviews for rice Food Code 4523 ([R503](wp03-section-f-cnf-2026-cooked-white-long-grain-rice-row-inspection-r503-20261017.md)), dry quinoa Food Code 4495 ([R507](wp03-section-f-next-gap-review-r507-20261017.md)), and cooked quinoa Food Code 5917 ([R267](wp03-next-section-f-gap-review-r267-20261016.md)).

**Decision:** leave the Food Code 4411 CNF 2026 inspection open until the official file rows can be read and joined directly. Preserve the two existing CNF 2015 observations as 2015-only evidence. Do not add a CNF 2026 observation, source ID, measure, conversion, density, cooking yield, recipe amount, or substitution from this access review.

## Current identity, forms, measurements, and ownership

At the reviewed package snapshot, the live catalog contains 1,786 references and 143 forms. `ingredient-ref-pearl-barley` owns **pearl barley / orge perlé**, the English alias `jau`, category `GRAIN_AND_CEREAL`, `defaultDensity: null`, and no unit mappings. Its separate `ingredient-form-pearl-barley-dry` and `ingredient-form-pearl-barley-cooked` forms use the labels `pearl barley, dry / orge perlé, sec` and `pearl barley, cooked / orge perlé, cuit`; both have empty match-term lists and null form density. Keep these forms attached only to pearl barley. Nearby hulled barley, pot barley, barley grits, barley semolina, and barley flour remain separately owned products.

The live ledger's dry-form record is `researched_supported` for the two existing CNF 2015 Food Code 4411 portions only; its substitution state remains `not_yet_researched`. The cooked form has no measurement observations and remains `not_yet_researched` for both measurement and substitution research. There is no active pearl-barley density, unit mapping, conversion, or package/cooking yield.

The accessible Health Canada [CNF 2015 Food Code 4411 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411) shows `Grains, barley, pearled, dry / Grains céréaliers, orge, perlé, sec`, 100 mL = 84.5 g, 250 mL = 211.3 g, and the separate `amount to make 125ml = 23.8 g` line. The page is modified 2019-03-01. R310 already records only the two published volume portions as historical `portion_weight` observations; it leaves the “amount to make” field uninterpreted. Keep that treatment unchanged. The current official CNF overview describes the 2015 web search as an interim route while the 2026 relational files are the current publication format; it does not turn the older page into evidence about CNF 2026.

The 56-entry [legacy-import candidate file](../legacy-import-identities.v1.json) contains no pearl-barley, barley, or `jau` candidate. The research ledger has no unresolved pearl-barley identity candidate. Its separate `candidate-barley-meal` record concerns unresolved ground-meal versus cut-grain scope and does not own pearl barley or Food Code 4411.

## Phrase-first picker projection

Static projection follows the live [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) behavior: normalize case, accents, ligatures, punctuation, and spacing; prefer a complete word phrase across reference names, aliases, and attached form labels; use substring fallback only if no phrase match exists. A form hint appears only when the normalized query exactly matches a complete form label or match term.

| Query | Current phrase-first result | Form hint |
|---|---|---|
| `pearl barley` | `ingredient-ref-pearl-barley` | None |
| `pearl barley dry`, `pearl barley, dry` | `ingredient-ref-pearl-barley` | `ingredient-form-pearl-barley-dry` |
| `orge perlé` | `ingredient-ref-pearl-barley` | None |
| `orge perlé sec` | `ingredient-ref-pearl-barley` | `ingredient-form-pearl-barley-dry` |
| `pearl barley cooked` | `ingredient-ref-pearl-barley` | `ingredient-form-pearl-barley-cooked` |
| `dry pearl barley` | No result | None |
| `jau` | `ingredient-ref-pearl-barley` and `ingredient-ref-barley-flour` | None |

The short `jau` query currently matches the full alias `jau atta` on barley flour as well as the exact pearl-barley alias. This is existing behavior, not a change proposed by R510. No identity, alias, label, form, or match term changes under this hold. These are static data projections, not live Android picker QA.

## Manifest recipe corpus and demand

The scan parsed all **114 recipe files** listed in the live seed manifest, covering **1,123 structured ingredient rows** and **753,988 raw recipe-file bytes**. Fingerprint: SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`, computed in manifest order by hashing each UTF-8 relative path, NUL, raw file bytes, NUL.

The scan searched decoded recipe data and ingredient rows for `pearl barley`, `pearled barley`, `orge perlé`/`orge perle`, the whole word `jau`, Food Code `4411`, and the pearl-barley reference/form IDs. It found **zero candidate recipe files, zero matching ingredient rows, and zero links** to the pearl-barley reference or either form. No bundled recipe asks for a pearl-barley amount, so the CNF review supplies no recipe-specific quantity or yield. The scan covers the manifest-listed bundle only.

## Current official CNF 2026 evidence and access attempts

Health Canada's [current CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) states that CNF 2026 is published as relational CSV files and that the CNF 2015 online search remains accessible as an interim measure. The official Open Government [CNF 2026 listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists Food Name, Measure Weight Conversion, Measure Name, Measure Type, and an all-files ZIP. The listing shows the dataset record modified 2026-10-04; Food Name metadata reports data last updated 2026-05-08 and validation on 2026-05-08. These listing facts identify the current resources, not any Food Code 4411 row.

On 2026-10-17, the available browser tool was asked to open each official [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv), [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), and [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv); each direct download was reported inaccessible. The [all-files ZIP](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip) and a [datastore search route for Food Code 4411](https://open.canada.ca/data/api/action/datastore_search?resource_id=e1ffee62-58cb-4e3e-b359-115c658388ad%26q=4411) were also inaccessible through that tool. From the workspace, `urllib.request.urlopen(url, timeout=10)` failed for all four CSV URLs and the ZIP with `URLError: <urlopen error [Errno -3] Temporary failure in name resolution>` before receiving bytes.

A hidden-file-aware repository search for the four exact CSV filenames and `cnf_fcen_all-files-data_2026.zip` found no CNF copy. The only repository `.zip` found by the broader file-extension search is the unrelated `docs/exported-recipe-lists/RecipeKeeper_20260320_143058.zip`. No Food Name, measure conversion, measure name, or measure type rows were parsed in R510. This is an access limitation, not evidence that a file or matching row is absent.

## Source-ID-to-URL mapping and archive audit

The current ledger has **2,143 records, 9,835 source entries, 8,323 distinct source IDs, and 7,033 distinct URLs**. A whole-ledger audit found **no source ID mapped to multiple URLs**. Proposal-local `R510-Sxx` keys below each identify exactly one URL and are documentation citations only; R510 registers no new shared ledger source IDs.

| Source ID | Exactly one URL | Ownership and scope |
|---|---|---|
| `R510-S01` (proposal-local) | [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Current publication-format context only; no Food Code 4411 row evidence. |
| `R510-S02` (proposal-local) | [Open Government CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Resource and dataset metadata only; no row evidence. |
| `R510-S03` (proposal-local) | [Food Name CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) | Attempted endpoint; bytes unavailable. Existing ID `WP03-CNF2026-QUINOA-R267-S01` maps to this one URL and is owned by `ingredient-form-quinoa-cooked` for Food Code 5917; do not reassign it to 4411. |
| `R510-S04` (proposal-local) | [Measure Weight Conversion CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Attempted endpoint; bytes unavailable. Existing ID `WP03-CNF2026-QUINOA-R267-S02` maps to this one URL and is owned by the cooked-quinoa form plus maple-syrup evidence; do not reassign it to 4411. |
| `R510-S05` (proposal-local) | [Measure Name CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv) | Attempted endpoint; bytes unavailable. Existing ID `WP03-CNF2026-QUINOA-R267-S03` maps to this one URL and is owned by `ingredient-form-quinoa-cooked` for Food Code 5917; do not reassign it to 4411. |
| `R510-S06` (proposal-local) | [Measure Type CSV download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv) | Attempted endpoint; bytes unavailable. Existing ID `WP03-CNF2026-QUINOA-R267-S04` maps to this one URL and is owned by `ingredient-form-quinoa-cooked` for Food Code 5917; do not reassign it to 4411. |
| `R510-S07` (proposal-local) | [All-files ZIP download](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/019f2a90-e3a9-489d-b6e1-f74f4ba1d006/download/cnf_fcen_all-files-data_2026.zip) | Attempted endpoint; bytes unavailable. No ledger ID or repository-local CNF archive was found. |
| `R510-S08` (proposal-local) | [Food Name datastore query for 4411](https://open.canada.ca/data/api/action/datastore_search?resource_id=e1ffee62-58cb-4e3e-b359-115c658388ad&q=4411) | Attempted access route only; unavailable and not a row observation. |
| `WP03-PBARLEY-FORMS-R27-20261013-S01` | [CNF 2015 Food Code 4411 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411) | Existing source for the pearl-barley reference and dry form's bilingual state label. |
| `WP03-PBARLEY-FORMS-R27-20261013-S02` | [CNF 2015 Food Code 4486 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4486) | Existing source for the pearl-barley reference and cooked form's bilingual state label. |
| `WP03-SECTION-F-R310-20261016-S01` | [CNF 2015 Food Code 4411 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411) | Existing dry-form owner for the two CNF 2015 portion observations and the uninterpreted “amount to make” caveat. |
| `WP03-SECTION-F-R310-20261016-S02` | [CNF 2015 Users' Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html) | Existing dry-form context for keeping published historical portions food-specific; no 2026 row evidence. |
| `WP03-SECTION-F-R310-20261016-S03` | [Health Canada CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) | Existing dry-form owner for publication-format context; no Food Code 4411 row values. |
| `WP03-SECTION-F-R310-20261016-S04` | [Open Government CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Existing dry-form owner for the prior access review; listing only, not row values. |

The four R267 direct-file IDs remain scoped to its Food Code 5917 review and each retains a one-ID-to-one-URL mapping. The 2015 IDs above remain scoped to their existing food-code and label/portion claims. No existing ID is reused for new 4411 evidence, and no observation ID is proposed.

## Evidence limits and future inspection

- The listing confirms that the official relational resources exist; it does not confirm whether Food Code 4411 appears in the CNF 2026 Food Name file or has measure-weight rows.
- R510 verified no CNF 2026 Food Name, measure label, measure type, row date, volume, or mass for Food Code 4411. Make no presence, absence, continuity, or value claim.
- Keep the CNF 2015 observations separate. Do not overwrite, average, extrapolate, or relabel them as CNF 2026 data. Keep `amount to make 125ml = 23.8 g` uninterpreted.
- When direct official file bytes are available, verify the Food Name row and Food Code first, then join every matching Measure Weight Conversion row to its Measure Name and Measure Type codes. Record only directly verified source-specific rows. Do not infer a density, reusable conversion, or dry-to-cooked yield from a published portion.
- No identity/form, measurement, recipe, picker, substitution, or shared-ledger field change is proposed. The checklist item remains open.

**Verification:** Documentation-only access hold; no software tests, builds, emulator checks, deployments, or app integration were needed. Static ownership, picker, manifest-corpus, source-ID, UTF-8, local-link, and whitespace checks were performed. The joined-row inspection remains open.
