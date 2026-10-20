# WP04 Proposal: Alternate Source Review for Produce Count Portions

**Review date:** 2026-10-10  
**Status:** Proposal-only source review. Two exact source-specific portions are candidates; three remain held. No canonical measurement or conversion is activated.

## Disposition

This follow-up checks the five provisional raw-produce count portions from the CNF retrieval hold against USDA FoodData Central (FDC) and the official USDA Standard Reference Release 28 (SR28) report. The check yields two exact matches: one unqualified raw garlic clove and one raw leek. Recommend these only as source-specific `published_portion` observations, preserving source record, portion label, and edible-portion basis. Keep raw onion, raw carrot, and large red-ripe raw tomato held because the alternate records inspected did not publish the requested matching count measure. An unrelated 182 g “1 large” entry is for green tomatoes (NDB 11527), so it does not support the recipe’s large red-ripe tomatoes.

The measures describe reference food portions, not observed retail-size distributions. They do not authorize count conversion at runtime, scaling between item sizes, density, or recipe edits. The prior review’s garlic size-qualified lines remain excluded.

## Exact recipe demand and current mappings

The line IDs and `ingredientRefId` values below were re-read from the bundled recipe JSON on 2026-10-10. Garlic rows whose wording is simply clove/cloves are grouped under the exact unqualified-clove match. Lines that specify a large or medium garlic clove are outside this candidate.

| Food and recipe demand | Exact ingredient-line IDs | Current ingredient-reference mapping | Disposition |
| --- | --- | --- | --- |
| Raw garlic: 1–4 unqualified cloves, minced/chopped/grated/crushed | `4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-2` (1 clove); `4cbff09a-679f-420c-89e2-4175fb8e8662-ingredient-5` (2 cloves); `6cd92702-2256-4fc5-8f41-91ca188b4fbf-ingredient-6` (2 cloves); `e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-5` (3 cloves); `d356eec5-b3c4-4e22-b943-63900317e569-ingredient-10` (2 cloves); `1d0098bc-da72-40b3-ab68-d128d7ba0c3c-ingredient-4` (2 cloves); `89f89f5e-4afc-4e3a-b37f-e7841ac24ff8-ingredient-11` (3 cloves); `834bade3-bdda-432f-a4a6-1cb0fec6f065-ingredient-6` (1 clove); `7239d74f-e895-421d-96e4-09a049546aa1-ingredient-7` (1 clove); `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-4` (4 cloves). | `ingredient-ref-garlic` | Candidate: exact raw-garlic/clove measure. No clove-size qualifier. |
| Raw onion: 1 large, chopped | `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-3` | `ingredient-ref-onion` | Hold: no matching large raw-onion count in the inspected alternate record. |
| Raw carrot: 4 small, diced | `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-6` | `ingredient-ref-carrot` | Hold: no matching small raw-carrot count in the inspected alternate record; size-length qualifier is also unresolved. |
| Raw leek: 1 leek | `1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee-ingredient-2` | `ingredient-ref-leek` | Candidate: exact one-leek measure, with source-defined edible bulb/lower-leaf portion. |
| Raw tomatoes: 4 large, diced | `7f200ce7-8ce5-4f82-97aa-e3eccebc2fd7-ingredient-1` | `ingredient-ref-tomatoes` | Hold: red-ripe record has no large count; the one large measure found is green tomato. |

Excluded garlic size-qualified rows remain: `7f200ce7-8ce5-4f82-97aa-e3eccebc2fd7-ingredient-5` (2 large garlic cloves) and `9dc0c02c-ac20-411c-9adf-38095e980487-ingredient-6` (1 medium garlic clove). The generic 3 g clove portion does not say large or medium.

## Exact-match candidates

| Candidate source ID | Exact source food and portion | Matching recipe line(s) | Limit to preserve |
| --- | --- | --- | --- |
| `WP04-WP12-FDC-ALT-20261010-S02` | FoodData Central record `fdcId=169230`, *Garlic, raw*, data type `SR Legacy`; `foodPortions[id=84480]`: `amount=1.0`, `modifier="clove"`, `gramWeight=3.0`. | The ten unqualified garlic-clove lines above. | No clove-size definition is supplied. Do not apply to the excluded large/medium cloves, dried garlic, garlic powder, or a different form. |
| `WP04-WP12-FDC-ALT-20261010-S04` | USDA SR28 report, NDB `11246`, *Leeks, (bulb and lower leaf-portion), raw*; listed measure `1 leek = 89 g`. The same record states 56% refuse (tops, root end, and skin). | `1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee-ingredient-2` (1 leek). | The 89 g is the record’s edible bulb/lower-leaf portion, not gross weight for an untrimmed whole leek. Retain the large refuse note with the observation; do not add it to 89 g. |

These are candidates for distinct, source-specific portion observations, not unit mappings. Garlic is directly readable in FDC and independently corroborated in SR28 at NDB 11215. The leek measure is verified in the official SR28 report; no FDC leek portion was successfully retrieved in this pass.

## Held foods, collisions, and retrieval gaps

| Food | Alternate-source result | Why the recipe demand remains held |
| --- | --- | --- |
| Onion, raw; USDA SR28 NDB `11282` | SR28’s listed common measures are 1 cup chopped = 160 g, 1 cup sliced = 115 g, and 1 tbsp chopped = 10 g. The record states 10% refuse. No large count measure is listed in this report entry. | The recipe requires one large generic raw onion. Volume portions do not match it. Do not substitute the 2015 CNF 150 g value for current CNF data or infer a count from chopped volume. The official FDC search/detail response did not yield a readable matching large-onion portion in this pass. |
| Carrot, raw; USDA SR28 NDB `11124` | SR28 lists 1 cup chopped = 128 g, 1 cup grated = 110 g, and 1 cup strips/slices = 122 g. The record states 11% refuse. No small-carrot count measure is listed in this report entry. | The recipe asks for four small carrots. The earlier 2015 CNF “small (14 cm)” definition cannot be equated to an unspecified recipe small carrot without the current source record and measure. No FDC portion row for a small carrot was readable in this pass. |
| Tomato, red, ripe, raw, year-round average; USDA SR28 NDB `11529` | The SR28 record’s common measures include 1 cup cherry tomatoes = 149 g, 1 cup chopped or sliced = 180 g, and 1 Italian tomato = 62 g; refuse is 9% (core and stem ends). No generic large measure is listed in this record. | “Italian tomato” is a shape/type-specific count and does not match the recipe’s generic large tomatoes. The 182 g “1 large” row found elsewhere in SR28 belongs to *Tomatoes, green, raw*, NDB `11527` (PDF p. 2117), not NDB `11529`; reject it as an identity collision. |

For the CNF 2026 comparison, the parent agent independently retried both official CSV links listed below through the web connector on 2026-10-10. The Food Name and Measure Weight Conversion files remained inaccessible. The prior retrieval-check proposal also records that the portal CSV opens/API requests were inaccessible and a local `curl` attempt failed at DNS resolution (`curl: (6) Could not resolve host: open.canada.ca`). An absent or unreadable row is not evidence that CNF 2026 omits the measure.

The current active mappings remain generic: garlic, onion, carrot, leek, and tomatoes. Recipe preparation text (minced, chopped, grated, crushed, diced) does not change the source portion. Existing identity-collision notes also remain in force: generic onion should not be used as evidence for a named yellow or Spanish onion; “small carrot” may refer to a length class; raw leek edible portion excludes large trim; tomato colour/ripeness and Italian/cherry/green distinctions matter.

## Reproducible source paths and access results

Access date for all checks: 2026-10-10. Source IDs below are unique to this proposal and are not canonical ledger IDs.

| Source ID | Official source, URL, and locator | Evidence / retrieval result |
| --- | --- | --- |
| `WP04-WP12-FDC-ALT-20261010-S01` | USDA FoodData Central, [API Guide](https://fdc.nal.usda.gov/api-guide/). | Official endpoint reference for Food Details by FDC ID. The guide was readable. `DEMO_KEY` is used only in the public detail URL below; no credential is embedded. |
| `WP04-WP12-FDC-ALT-20261010-S02` | USDA FoodData Central API, [Garlic, raw, FDC ID 169230](https://api.nal.usda.gov/fdc/v1/food/169230?api_key=DEMO_KEY), JSON locator `foodPortions[id=84480]`. | On the earlier successful detail response in this review chain, the record returned `fdcId=169230`, `description="Garlic, raw"`, `dataType="SR Legacy"`, `ndbNumber=11215`, and portion ID `84480`, 1 clove = 3.0 g. A fresh web-connector retry on 2026-10-10 returned an internal error, so retain the exact URL/record/portion locator and treat that retry as a reproducibility limitation. |
| `WP04-WP12-FDC-ALT-20261010-S03` | USDA ARS, [Standard Reference Release 28, Food Group 11: Vegetables and Vegetable Products (PDF)](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=778), NDB `11215`, p. 778. | *Garlic, raw*; 1 clove = 3.0 g. Entry also lists 13% refuse (knob and skin). The PDF was readable. SR28 is a 2015 publication and is used as a corroborating historical USDA reference, not represented as a new current sample. |
| `WP04-WP12-FDC-ALT-20261010-S04` | Same [USDA SR28 report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=887), NDB `11246`, p. 887. | *Leeks, (bulb and lower leaf-portion), raw*; 1 leek = 89 g; 56% refuse (tops, root end, skin). The PDF was readable. |
| `WP04-WP12-FDC-ALT-20261010-S05` | Same [USDA SR28 report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=1140), NDB `11282`, pp. 1138–1140. | *Onions, raw*; inspected common-measure list has chopped/sliced cup and tablespoon measures, not a large count. The record also states 10% refuse. |
| `WP04-WP12-FDC-ALT-20261010-S06` | Same [USDA SR28 report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=449), NDB `11124`, p. 449. | *Carrots, raw*; inspected common-measure list has chopped/grated/strips-or-slices cups, not a small count. The record states 11% refuse. |
| `WP04-WP12-FDC-ALT-20261010-S07` | Same [USDA SR28 report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=2143), NDB `11529`, pp. 2141–2143. | *Tomatoes, red, ripe, raw, year-round average*; 149 g cherry-tomato cup, 180 g chopped-or-sliced cup, 62 g Italian tomato; 9% refuse. No generic large measure in the listed measures. The 182 g large measure is separately labeled NDB `11527`, *Tomatoes, green, raw*, p. 2117. |
| `WP04-WP12-FDC-ALT-20261010-S08` | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html); Open Government, [CNF 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). | Official listing/path context only. CNF 2026 Food Name CSV: [food_name.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv); Measure Weight Conversion CSV: [measure_weight_conversion.csv](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). Parent-agent web-connector retest still could not open either CSV. No CNF 2026 food/measure row is claimed or compared. |

### Access log for FDC

- The official FDC API guide was readable.
- The garlic FDC API detail record was successfully read earlier in this research chain and returned the fields recorded above. A fresh connector retry returned an internal error.
- The carrot detail endpoint `https://api.nal.usda.gov/fdc/v1/food/170393?api_key=DEMO_KEY` returned a response identifying *Carrots, raw* / `fdcId=170393`, but the connector output ended before the full `foodPortions` section. It therefore does not verify a small-carrot portion.
- Official FDC search/detail requests for the matching large raw onion, one raw leek, and large red-ripe raw tomato did not yield readable portion records through the connector during this pass. No unverified FDC record ID or portion is asserted for those foods.

## Pre-integration snapshot

Snapshot taken from the shared workspace on 2026-10-10 before integration of this proposal. This is the live state at review time; hashes from the earlier produce review are historical and should not be substituted for this snapshot. Recipe-set hashing sorts relative recipe paths and hashes each relative path, NUL, file bytes, NUL.

| Artifact | Count / scope | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| Ingredient references | 761 references | 240,253 | `c2b385fbeffa8e7e0146665c8530377a3cf6afb073e7034de733ecce08be7384` |
| Ingredient forms | 36 forms | 24,403 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Units | 30 units | 5,447 | `6f6e3afc8b2c12fe9120dbcf453d1e675fee596fa754f93cfead040a7ba8c8e4` |
| Seed manifest | 13 fields | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Package yields | 1 record | 853 | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Research ledger | 979 records | 2,153,482 | `92ccae5f6da21a238c0e538edaa571b502918baf79028b05545a4a40df336cba` |
| Recipes | 114 files, 1,123 ingredient lines | 750,593 combined | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

At this snapshot, all five targeted ingredient references have `defaultDensity: null` and `unitMappings: []`. The garlic and leek ledger records have no accepted portion observation. Onion, carrot, and tomato ledger records have no accepted portion observation; their existing source/decision material concerns identity terminology, not measurement. This proposal contributes no canonical source ID, ledger row, or active mapping.

## Integration boundary

If integrated after independent review, store only the exact garlic FDC record portion and leek SR28 portion as source-specific published-portion observations, preserving `sourceId`, food description, source identifier, portion wording, gram weight, raw state, and edible basis/refuse qualifier. Keep onion, carrot, and tomato held until an accessible CNF 2026 row or another primary record verifies the matching count measure. Do not use density, broad runtime count conversion, size scaling, recipe changes, package-yield logic, or values from the excluded chicken-egg packet or S&W black-bean package-yield record.

No canonical seed, ledger, recipe, plan, roadmap, tests, or code was edited. No tests were run.
