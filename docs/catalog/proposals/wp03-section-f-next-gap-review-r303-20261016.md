# WP03 Section F — dry quinoa portion-evidence review (R303, 2026-10-16)

## Review record

- **Status:** Proposal only. No shared catalog, research ledger, plan, roadmap, recipe, or generated file was changed.
- **Selected gap:** Source-specific portion evidence for the existing `ingredient-form-quinoa-dry` form. Its ledger measurement state is still `not_yet_researched`, and it has no measurement observations.
- **Plan context:** The Section F dry/cooked-form checklist remains open for grains needing useful measurements ([plan, line 3885](../../RecipeBook-global-ingredient-catalog-plan.txt#L3894)). Its completed quinoa portion item covers cooked quinoa only; the separate CNF 2026 row inspection reviewed cooked Food Code 5917 ([plan, line 3904](../../RecipeBook-global-ingredient-catalog-plan.txt#L3913); [R267](wp03-next-section-f-gap-review-r267-20261016.md)).
- **Recommendation:** Record the two volume-to-mass portions published for dry quinoa in Health Canada's CNF 2015, Food Code 4495, as edition-specific `portion_weight` observations attached to the existing dry form. Keep them out of active density, mappings, conversions, cooking yields, and recipe amounts.
- **Snapshot:** 1,670 active references, 127 forms, 2,018 research-ledger records, 114 manifest-listed recipes, and 1,123 structured ingredient rows.
- **Proposal-local source ID:** `WP03-QUINOA-DRY-CNF2015-R303-20261016-S01`. It is not registered in the shared ledger. The source URL is already present under `WP03-S5` for the bilingual state label only; this proposal uses a new local ID for the portion evidence rather than changing that existing source record.
- **Proposed observation IDs:** `quinoa-dry-cnf2015-100ml-portion-20261016` and `quinoa-dry-cnf2015-250ml-portion-20261016`; both are unused in the ledger and proposal archive.

## Why this is a distinct gap

The live package already has the generic `quinoa / quinoa` reference and separate dry and cooked forms. The [R267 review](wp03-next-section-f-gap-review-r267-20261016.md) inspected and integrated CNF 2026 rows for cooked quinoa, Food Code 5917. It notes that the CNF 2026 Food Name file also has a distinct dry-quinoa row, Food Code 4495, but does not join or decide that row's measure records. This proposal is limited to the dry form and the accessible CNF 2015 serving page for Food Code 4495; it does not extend R267's cooked values to dry quinoa.

The recent [R255 Sona Masoori identity review](wp03-section-f-gap-review-r255-20261016.md), [R259 puffed-rice Québec terminology review](wp03-section-f-next-gap-review-r259-20261016.md), [R262 Cranberry Almond Crunch cereal review](wp03-section-f-cranberry-almond-crunch-cereal-identity-review-r262-20261016.md), and [R264 OREO PUFFS review](wp03-section-f-oreo-puffs-cereal-identity-review-r264-20261016.md) address other identities or wording. Their product-specific package or serving notes do not provide generic dry-quinoa portions. [R270](wp03-next-section-f-gap-review-r270-20261016.md) is a separate wild-rice CNF 2026 access review.

## Current identity, form, ledger, and recipe state

The live catalog row is `ingredient-ref-quinoa`, displayed as `quinoa / quinoa`, category `GRAIN_AND_CEREAL`, English alias `quinua`, no French aliases, `defaultDensity: null`, and `unitMappings: []`. The same reference has distinct forms:

| Form ID | English / French label | Prep state | Match terms | Density |
|---|---|---|---|---|
| `ingredient-form-quinoa-dry` | `quinoa, dry` / `quinoa, sec` | `dry` | Empty | `null` |
| `ingredient-form-quinoa-cooked` | `quinoa, cooked` / `quinoa, cuit` | `cooked` | Empty | `null` |

The dry-form ledger record is `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its existing `WP03-S5` source confirms the exact CNF bilingual dry-state label but says no serving value was adopted. There are no measurement observations attached to the dry form. The cooked form has separate R267 observations for Food Code 5917 and remains out of scope here.

A static projection of the current phrase-first picker confirms that `quinoa dry` and `quinoa sec` resolve to `ingredient-ref-quinoa` with the dry form available as the state hint. `quinoa` returns ten quinoa-related references, including the separate flour, flakes, puffed, red, and black products. `dry quinoa` currently has no match. No aliases, labels, or match terms are proposed, so these picker results remain unchanged. This is a data projection, not live Android picker QA.

The manifest-listed recipe scan found one structured quinoa row: recipe **016#1**, `2 cups cooked quinoa`, linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`. No bundled recipe requests dry quinoa. Preserve that wording and link; these observations supply no recipe amount or dry-to-cooked yield.

## CNF 2015 finding and exact recommendation

Health Canada's serving-size page identifies Food Code 4495 as `Grains, quinoa, dry / Grains céréaliers, quinoa, sec`. It reports `100 ml = 71.9 g` and `250 ml = 179.6 g`; the same page also shows a 100 g edible-portion basis, `1 serving = 20.0 g`, and total refuse of 0% [S01]. The volume-to-weight rows are exact published portions for this named CNF food record. The page does not state a filling, settling, or packing protocol.

If accepted, append only these observations to `ingredient-form-quinoa-dry`:

| Observation ID | Source quantity | Observed mass | Treatment |
|---|---:|---:|---|
| `quinoa-dry-cnf2015-100ml-portion-20261016` | 100 mL | 71.9 g | CNF 2015 Food Code 4495 source-specific published portion. |
| `quinoa-dry-cnf2015-250ml-portion-20261016` | 250 mL | 179.6 g | CNF 2015 Food Code 4495 source-specific published portion. |

For each observation, use `relationship: portion_weight`, `ingredientFormId: ingredient-form-quinoa-dry`, `valueUnit: g`, `observedMassG` equal to the published mass, `observedVolumeMl` and `sourceQuantity` equal to the published millilitres, and `evidenceKind: published_portion`. Describe the food as dry quinoa (CNF 2015 Food Code 4495); note that no filling or packing method is stated; and identify the quantity basis as an edition-specific published portion, not a reusable conversion. Attach the new proposal-local source ID above.

Do not store the `100 g edible portion = 100 g` baseline as a kitchen measure. Do not store `1 serving = 20.0 g` as a volume measure; it supplies no volume basis. The refuse percentage is not a portion weight. Do not compute density from either volume pair, extrapolate to cups or other volumes, average them, or combine them with cooked-quinoa portions.

The dry-form ledger record's `measurementState` may be set to `researched_supported` to reflect these two exact historical portions. That status must not be described as support for an identity-wide density, volume conversion, or completed 2026 CNF row review. A later CNF 2026 inspection may append separate values under its own edition and Food Code 4495 evidence; it must not overwrite or average these observations. Leave the generic reference and both form density fields unchanged. Keep `unitMappings` empty, add no active measure, conversion, cooking yield, recipe link, or substitution, and leave `substitutionResearchState` unchanged.

## Ownership and product boundaries

| Candidate or adjacent phrase | Current owner / evidence | Recommendation |
|---|---|---|
| `quinoa` / `quinua` | `ingredient-ref-quinoa`; `quinua` is its existing English alias. | Keep the generic reference and alias unchanged. |
| `quinoa, dry` / `quinoa, sec` | `ingredient-form-quinoa-dry` under the generic quinoa reference. | Attach observations to this existing form; add no row or alias. |
| `quinoa, cooked` / `quinoa, cuit` | `ingredient-form-quinoa-cooked`; R267's values are tied to Food Code 5917. | Keep its R267 evidence separate from Food Code 4495. |
| Quinoa flour, flakes, puffed quinoa, red quinoa, and black quinoa | Separate active references and search results. | Do not merge processed or color-qualified products into the generic dry-form observations. |
| `dry quinoa` / reversed word order | No exact current picker result. | Do not add a new alias or match term in this measurement review. |

The 2026 data caveat is material. Health Canada now describes CNF 2026 as relational CSV files and says the 2015 online search remains available as an interim access route [existing source `WP03-QCM-20261012-S05`]. The 2026 portal listing includes Food Name and Measure Weight Conversion files, but direct retrieval of their CSV content was unavailable through the current browser access. No claim is made here about whether CNF 2026 has measurement rows for Food Code 4495 or what values they contain. The 2015 observations remain useful historical evidence and are not presented as the latest CNF values.

## Source register and ownership checks

Sources checked online on **2026-10-16**. Proposal-local IDs below are unallocated; reused source IDs retain their existing owners and scope.

| ID | Source | Evidence and limits |
|---|---|---|
| `WP03-QUINOA-DRY-CNF2015-R303-20261016-S01` | Health Canada, [CNF serving size, Grains, quinoa, dry, Food Code 4495](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495). | Page shows the bilingual dry-state name and Food Code 4495, with 100 mL = 71.9 g and 250 mL = 179.6 g. It also shows a mass-only 20 g serving, 100 g edible portion, and 0% refuse. Page details show 2019-03-01; it is the CNF 2015 online record, not the CNF 2026 row file. No packing method is stated. |
| Reuse `WP03-S5` | Health Canada, same [Food Code 4495 serving-size page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4495), existing dry-form ledger source. | Reuse only for the already accepted bilingual state label. Its existing ledger `supports` field says no serving-size value was adopted; do not stretch or rewrite its prior scope. |
| Reuse `WP03-QCM-20261012-S05` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), page details 2026-06-19. | Says CNF 2026 is published as relational CSV files and that the CNF 2015 online resource remains accessible as an interim measure. It does not give quinoa measurement values. |
| Reuse `WP03-CNF2026-QUINOA-R267-S01` / `S02` only as dataset-resource references | Open Government Portal, CNF 2026 [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv) and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | R267's record uses these source IDs for the cooked Food Code 5917 join and reports a separate dry Food Name row with Food Code 4495. This review does not use those IDs or URLs to claim any Food Code 4495 measurement value. The downloadable CSV content could not be opened through the current browser tool. |

The new S01 source key and both proposed observation IDs were checked against the live ledger and proposal archive and are unused. The Food Code 4495 URL is already present as `WP03-S5`; this is a deliberate source-URL reuse with a new proposal-local source key for its measurement rows, not a claim that the URL is new. R267's cooked-quinoa source IDs remain owned by that cooked-form record and are not reassigned.

## Remaining limits and disposition

- The exact 2015 dry-quinoa volume portions are supported, but they do not provide a fill/packing method or a validated recipe conversion.
- CNF 2026 Food Code 4495 Measure Weight Conversion rows were not inspected here. This proposal makes no row-presence, absence, or value claim for those files.
- No dry-to-cooked yield, substitution, density, or active unit mapping is supported.
- No Québec terminology change is proposed; the existing OQLF-supported generic quinoa naming and current picker forms remain unchanged.

**Proposed disposition:** Add the two edition-specific CNF 2015 `portion_weight` observations to `ingredient-form-quinoa-dry` and set that form's `measurementState` to `researched_supported` for the documented observations. Keep every active conversion and recipe link unchanged. Reopen the dry Food Code 4495 review if row-level CNF 2026 contents become available. Section F remains open.

No software tests, builds, emulator sessions, deployments, or app data integration were run for this proposal-only review.
