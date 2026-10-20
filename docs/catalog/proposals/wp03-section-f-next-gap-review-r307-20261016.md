# WP03 Section F — cooked-rice portion-evidence review (R307, 2026-10-16)

## Review record

- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, generated file, recipe, or app file was changed.
- **Selected gap:** Published portion evidence for the existing `ingredient-form-rice-cooked`. Its ledger record is `measurementState: not_yet_researched` and has no measurement observations.
- **Exact checklist linkage:** The open Section F item says, “Dry versus cooked forms for remaining grains where recipes or measurements need them; generic rice, quinoa, and oat bran forms are integrated. Cooking yield is a separate quantity relation” ([plan, line 3891](../../RecipeBook-global-ingredient-catalog-plan.txt#L3900)). This review covers only the cooked-rice form's source-specific portion evidence. The plan's separate dry-quinoa CNF 2026 follow-up is excluded.
- **Recommendation:** Record the three published volume-to-mass portions on Health Canada's CNF 2015 page for Food Code 4523 as edition-specific `portion_weight` observations on `ingredient-form-rice-cooked`. Keep these observations out of active density, unit mappings, conversions, cooking yields, and recipe amounts.
- **Snapshot:** 1,671 active ingredient references, 127 forms, 2,018 research-ledger records, 114 manifest-listed recipes, and 1,123 structured ingredient rows. Counts describe the reviewed workspace snapshot on 2026-10-16.
- **Proposal-local source-ID prefix:** `WP03-SECTION-F-R307-20261016-S`. No source entries were added to the shared ledger.
- **Proposed observation IDs:** `cooked-rice-cnf2015-100ml-portion-r307-20261016`, `cooked-rice-cnf2015-125ml-portion-r307-20261016`, and `cooked-rice-cnf2015-250ml-portion-r307-20261016`. These IDs were checked against the live ledger and proposal archive and are unused.

## Why this is a distinct gap

The active package already has generic `rice / riz` and separate dry and cooked forms. The cooked form is linked to three bundled recipe ingredient lines, while its ledger record has only the source for the cooked-state label; it has no portion observations. The recipe/form checklist remains open for grains where recipes or measurements need them. This is a measurement review of the existing cooked-rice form, not a new identity or another state form.

This does not repeat the dry-quinoa review R303 or its open CNF 2026 row-inspection follow-up. R303 concerns `ingredient-form-quinoa-dry`, Food Code 4495. The completed cooked-quinoa CNF 2026 review R267 concerns Food Code 5917. Neither assigns data to the rice form. The current R270 CNF-access review concerns wild rice. No previous focused proposal or batch review was found for cooked-rice portions from Food Code 4523; earlier use of that source establishes cooked-state wording only and expressly did not import its portions.

## Current identity, form, ledger, and recipe state

The live base row is `ingredient-ref-rice`, displayed as `rice / riz`, category `GRAIN_AND_CEREAL`, with `defaultDensity: null` and `unitMappings: []`. It has separate forms:

| Form ID | English / French label | Preparation state | Match terms | Density |
|---|---|---|---|---|
| `ingredient-form-rice-dry` | `dry rice / riz sec` | `dry` | Empty | `null` |
| `ingredient-form-rice-cooked` | `cooked rice / riz cuit` | `cooked` | Empty | `null` |

The cooked-form ledger record is identity-verified, has `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`, and has no `measurementObservations`. Its existing `WP03-S3-COOKED-4523` source confirms the cooked descriptor for CNF Food Code 4523; its `supports` field explicitly adopts no yield or density. The generic rice base has no measurement observations either. The separately modeled white-rice reference, its forms, and its recipe link are outside this review.

The manifest-listed recipe scan found three structured lines linked to `ingredient-ref-rice` and `ingredient-form-rice-cooked`:

| Recipe line | Source text | Quantity boundary |
|---|---|---|
| 086#16 — Butter Chicken | `cooked rice, for serving` | No numeric amount |
| 090#16 — African Peanut Stew | `cooked rice, for serving` | No numeric amount |
| 093#1 — Fried Rice | `1/3 cup cooked rice` | Existing recipe quantity remains unchanged; no mass is recorded |

Recipe 066 separately requests optional `Cooked white rice, for serving` and is linked to `ingredient-ref-white-rice` plus its cooked form. Keep that white-rice row separate. The source-specific observations below do not supply a mass for any of these recipe lines, and do not establish a dry-to-cooked yield.

## Picker boundary

The static projection follows the current phrase-first, accent-folding search implementation in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L8). It is not live Android picker QA. No names, aliases, form labels, or match terms are proposed, so picker behavior remains unchanged.

| Query | Current owner/result | Boundary retained |
|---|---|---|
| `cooked rice` | `ingredient-ref-rice`, with the cooked form available as the exact form hint | Generic cooked-rice searches stay on the existing row. |
| `riz cuit` | `ingredient-ref-rice`, with the cooked form available as the exact form hint | French cooked-rice search stays on the existing row. |
| `cooked white rice` | `ingredient-ref-white-rice` and its cooked form | The white qualifier remains separate from generic cooked rice. |
| `wild rice, cooked` | `ingredient-ref-wild-rice` | A wild-rice form remains attached only to the wild-rice identity. |

## CNF 2015 finding and proposed observations

Health Canada's serving-size page identifies Food Code 4523 as `Grains, rice, white, long-grain, regular, cooked / Grains céréaliers, riz blanc, grain long, ordinaire, cuit`. It reports these volume portions and 0% total refuse [S01]:

| Observation ID | Source quantity | Published mass | Treatment |
|---|---:|---:|---|
| `cooked-rice-cnf2015-100ml-portion-r307-20261016` | 100 mL | 66.8 g | CNF 2015 Food Code 4523 published portion only. |
| `cooked-rice-cnf2015-125ml-portion-r307-20261016` | 125 mL | 83.5 g | CNF 2015 Food Code 4523 published portion only. |
| `cooked-rice-cnf2015-250ml-portion-r307-20261016` | 250 mL | 166.9 g | CNF 2015 Food Code 4523 published portion only. |

If accepted, attach only these three observations to `ingredient-form-rice-cooked`, with `relationship: portion_weight`, `valueUnit: g`, `observedMassG` equal to the reported mass, `observedVolumeMl` and `sourceQuantity` equal to the listed millilitres, and `evidenceKind: published_portion`. Describe the food as CNF 2015 Food Code 4523, white long-grain regular rice, cooked; state that the CNF page does not report a filling or packing method; and scope the quantity basis to the edition-specific published portion, not a reusable rice conversion. Use proposal-local source ID `WP03-SECTION-F-R307-20261016-S01` for these exact numeric rows. Reuse the existing `WP03-S3-COOKED-4523` only for the already accepted bilingual cooked-state wording; do not change its former scope.

Do not store the `100 g edible portion = 100 g` baseline as a kitchen measure. The 0% refuse figure is not a portion weight. Do not derive a density or extrapolate to a cup or another volume. In particular, do not calculate a mass for recipe 093's `1/3 cup cooked rice`, alter the source quantity, or assign the white long-grain result to a particular rice variety. Do not compare these values with a dry-rice portion to infer cooking yield.

If these observations are accepted, set only the cooked-form ledger record's measurement state to `researched_supported`, scoped to the three documented source-specific historical portions. This does not mean that generic cooked rice has an identity-wide density, an active volume conversion, or a completed CNF 2026 measurement review. Keep the generic rice base measurement state unchanged; leave both density fields, active measures, unit mappings, conversions, and yields unchanged; leave substitution research unchanged; and do not edit recipe links or quantities.

## CNF 2026 access limitation

Health Canada's current CNF page says the 2026 release is published as relational CSV files and that the searchable CNF 2015 remains available as an interim measure [S02]. I checked the official Open Government Portal dataset and the current Food Name and Measure Weight Conversion download URLs on 2026-10-16 [S03–S05]. The portal listing returned HTTP 403 in the browser tool, and the direct CSV resources were reported inaccessible. The restricted local network also prevents an independent local retrieval. Therefore this proposal makes **no claim** about whether CNF 2026 contains Food Code 4523 measurement rows or what those values are.

Keep a separate follow-up open to inspect and join the CNF 2026 Food Name, Measure Weight Conversion, Measure Name, and Measure Type rows for Food Code 4523 when the official file contents become accessible. The historical observations above must remain separate from any later CNF 2026 values. The access problem does not block verification of the three 2015 values from the accessible official Health Canada page.

## Source register and ownership checks

Sources checked online on **2026-10-16**. All source IDs below use the requested proposal-local prefix and are not registered in the shared ledger.

| ID | Source | Evidence and limits |
|---|---|---|
| `WP03-SECTION-F-R307-20261016-S01` | Health Canada, [CNF serving size: white long-grain regular rice, cooked, Food Code 4523](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523). | The page reports 100 mL = 66.8 g, 125 mL = 83.5 g, 250 mL = 166.9 g, 100 g edible portion = 100 g, and 0% total refuse. Page details show 2019-03-01. This is the accessible CNF 2015 online record, not an inspected CNF 2026 row or a packing-method specification. |
| `WP03-SECTION-F-R307-20261016-S02` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), page details 2026-06-19. | States that CNF 2026 is published as relational CSV files and that the 2015 online resource remains as an interim access route. It supplies no rice portion values. |
| `WP03-SECTION-F-R307-20261016-S03` | Open Government Portal, [Canadian Nutrient File 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). | Official dataset route linked by Health Canada. The browser returned HTTP 403; no dataset-row evidence is claimed. |
| `WP03-SECTION-F-R307-20261016-S04` | Open Government Portal, [CNF 2026 Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv). | Official resource URL checked; file contents were inaccessible through the browser tool. No Food Code 4523 presence or absence is inferred. |
| `WP03-SECTION-F-R307-20261016-S05` | Open Government Portal, [CNF 2026 Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Official resource URL checked; file contents were inaccessible through the browser tool. No Food Code 4523 presence or absence is inferred. |

The exact CNF 2015 URL is already owned by `WP03-S3-COOKED-4523` for the cooked-state label. The new S01 key deliberately scopes that same page to the newly reviewed portion data; no source ID is reassigned. The proposal-local source prefix and all three observation IDs were checked against the current ledger and proposal archive and are unused.

## Remaining limits and disposition

- The accessible 2015 CNF page supports three exact cooked-rice portions, but not a filling/packing method or an identity-wide measure.
- The CNF 2026 item-level rows for Food Code 4523 remain uninspected because the official portal and CSV downloads were inaccessible during this review. Do not claim row presence, absence, or values until retrieval succeeds.
- No density, active unit mapping, cup conversion, cooking yield, recipe mass, or substitution is supported.
- No picker change or recipe edit is proposed. The existing generic and white-rice links remain separate.

**Proposed disposition:** Add the three edition-specific CNF 2015 `portion_weight` observations to `ingredient-form-rice-cooked`; mark that form's measurement state researched-supported only for those documented observations; and leave an explicit CNF 2026 Food Code 4523 row-inspection follow-up open. Section F remains open.

No software tests, builds, emulator sessions, deployments, or app-data integrations were run for this proposal-only review.
