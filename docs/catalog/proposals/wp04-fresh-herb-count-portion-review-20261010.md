# WP04 Proposal: Fresh-Herb Count Portion Review

**Review date:** 2026-10-10  
**Status:** Proposal-only source review. Both recipe demands remain held; no count-weight observation, unit mapping, density, or recipe edit is proposed.

## Scope and disposition

This packet reviews the remaining unresolved fresh-herb count lines from the produce/herb portion screen: fresh basil leaves and fresh rosemary sprigs. It excludes garlic and leek, whose source-specific observations were accepted, the integrated drained maraschino-cherry portion, and the held onion, carrot, and red-ripe tomato cases. The corpus baseline is 114 bundled recipes and 1,123 ingredient rows; the prior all-recipe count-like screen identified 44 produce/herb rows across 25 recipes. This packet narrows the fresh-herb count portion group to the two rows below.

Official USDA SR28 records are readable for both herbs, but neither publishes the exact count portion demanded by its recipe line. Basil's exact food and fresh form are present, but the only leaf-count measure is five leaves, while the recipe requests ten. Rosemary's record gives teaspoon and tablespoon measures, not a sprig measure; its reported stem refuse does not determine a sprig's edible weight. Keep both lines held. Do not scale the basil five-leaf value, convert rosemary volume portions into sprigs, or infer a weight from stem refuse.

No source-specific ledger observation is recommended in this packet. The source IDs below identify proposal evidence only; they do not define canonical ledger source IDs or measurements.

## Exact recipe-line mappings and dispositions

The source text, quantity, unit, line ID, and reference mapping were checked against the live bundled recipe JSON on 2026-10-10.

| Recipe line ID | Recipe source text | Stored quantity / unit | Current ingredient-reference mapping | Disposition |
| --- | --- | --- | --- | --- |
| `30e4274f-19fd-47df-b90b-75a5eefdb2c8-ingredient-2` | `4 to 5 rosemary sprigs` | `4` / `count`; source text gives a 4-to-5 range | `ingredient-ref-rosemary-sprigs` | Hold. SR28 has fresh rosemary, but only teaspoon and tablespoon measures. No exact sprig-count portion is published. Preserve the source range; do not turn stored quantity 4 into an exact four-sprig demand. |
| `7f200ce7-8ce5-4f82-97aa-e3eccebc2fd7-ingredient-9` | `10 fresh basil leaves` | `10` / `count` | `ingredient-ref-basil` | Hold. SR28 publishes five fresh basil leaves at 2.5 g, not ten leaves. Do not double the observation or derive a per-leaf value. |

These are the only fresh-herb rows from the existing count-like produce/herb screen that remain in scope after the stated exclusions. Neither row has an exact matching source portion, so no recipe line is linked to a proposed numeric observation.

## Source results and exact-match test

| Proposal-local source ID | Exact source food and portion found | Exact-match result for recipe demand | Limits |
| --- | --- | --- | --- |
| `WP04-FRESH-HERB-PORTION-20261010-S01` | USDA SR28, Food Group 02, NDB `02044`, *Basil, fresh*. Common measures: `5 leaves = 2.5 g`; `2 tbsp, chopped = 5.3 g`; `.25 cup leaves, whole = 6.0 g`. The record lists `36%` refuse (tough stems, flower heads, and trimmings). | Food and fresh form match the basil recipe line, but the published leaf-count portion is five leaves and the recipe demands ten. No observation is proposed for that line. | The 5-leaf value is a published portion, not a per-leaf basis. The chopped tablespoon and whole-leaf cup measures are different portions and cannot be used to infer the requested count. The general refuse note must not be used as a leaf-weight adjustment. |
| `WP04-FRESH-HERB-PORTION-20261010-S02` | USDA SR28, Food Group 02, NDB `02063`, *Rosemary, fresh*. Common measures: `1 tsp = 0.7 g`; `1 tbsp = 1.7 g`. The record lists `35%` refuse (stems) and a footnote `1 Leaf`. | Fresh food form matches the recipe's fresh rosemary, but the source has no sprig-count portion. No observation is proposed for that line. | A teaspoon, tablespoon, stem-refuse percentage, or `1 Leaf` footnote does not establish the edible weight of one sprig or the recipe's 4-to-5 sprig range. Do not substitute dried rosemary measures. |

### Proposed observations

None. In particular, do not add either of these as `relationship: count_weight` / `evidenceKind: published_portion` observations from this packet. The five-leaf basil portion may be reconsidered if a recipe line or a separately authorized observation scope matches that exact portion; the current ten-leaf line does not. Rosemary remains held pending an authoritative fresh-rosemary sprig-count measure with a clearly defined edible basis.

## Reproducible sources and access results

Access date for the checks below: 2026-10-10. The official USDA SR28 page-report directory identifies Food Group 02 as *Spices and Herbs* and links its report PDF. The PDF was readable through the research web connector; the food records and measures above were checked in its extracted page text. The SR28 publication is historical (2015), and its published portions are not retail-size distributions.

| Source ID | Official source and locator | Evidence / retrieval result |
| --- | --- | --- |
| `WP04-FRESH-HERB-PORTION-20261010-S01` | USDA ARS, [SR28 Food Group 02: Spices and Herbs PDF](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf#page=3), NDB `02044`, *Basil, fresh*, PDF page 3 (common-measure block; food record begins on PDF page 1). Official [SR28 report directory](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/methods-and-application-of-food-composition-laboratory/mafcl-site-pages/sr28-page-reports/). | Readable on 2026-10-10. The record lists five leaves at 2.5 g, two tablespoons chopped at 5.3 g, and one-quarter cup whole leaves at 6.0 g; it lists 36% refuse. None is a ten-leaf portion. |
| `WP04-FRESH-HERB-PORTION-20261010-S02` | USDA ARS, [SR28 Food Group 02: Spices and Herbs PDF](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf#page=21), NDB `02063`, *Rosemary, fresh*, PDF page 21 (common-measure block; food record begins on PDF page 19). Same official [SR28 report directory](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/methods-and-application-of-food-composition-laboratory/mafcl-site-pages/sr28-page-reports/). | Readable on 2026-10-10. The record lists 0.7 g per teaspoon and 1.7 g per tablespoon, 35% stem refuse, and footnote 1, `Leaf`. No sprig-count weight is listed in the measure block. |
| `WP04-FRESH-HERB-PORTION-20261010-S03` | USDA FoodData Central, [API Guide](https://fdc.nal.usda.gov/api-guide/), Food Search and Food Details endpoints; attempted direct queries: [Basil, fresh, SR Legacy search](https://api.nal.usda.gov/fdc/v1/foods/search?api_key=DEMO_KEY&query=Basil%2C%20fresh&dataType=SR%20Legacy&pageSize=5) and [Rosemary, fresh, SR Legacy search](https://api.nal.usda.gov/fdc/v1/foods/search?api_key=DEMO_KEY&query=Rosemary%2C%20fresh&dataType=SR%20Legacy&pageSize=5). | The official API guide was readable and confirms the search/detail endpoint model. The web connector returned the direct API query URLs as inaccessible on 2026-10-10; no FDC result, food ID, portion, or omission is claimed. SR28 PDF evidence above is the readable primary record used for this review. |

### Access and reproduction notes

- Reopen the official SR28 page-report directory and Food Group 02 PDF at the direct URLs above. Search the PDF for NDB `02044` or `02063`, then inspect the common-measure block following the food entry.
- The basil block says `Measure 1 = 2.5g: 5 leaves`, `Measure 2 = 5.3g: 2 tbsp, chopped`, and `Measure 3 = 6.0g: .25 cup leaves, whole`.
- The rosemary block says `Measure 1 = 0.7g: 1 tsp` and `Measure 2 = 1.7g: 1 tbsp`; the record lists `35% Stems` and footnote `1 Leaf`.
- The two USDA FDC search URLs were attempted through the web connector, but its response explicitly marked them inaccessible. That is an access limitation, not evidence that the FDC records or portions are absent.

## Current pre-integration snapshot

Snapshot taken from the shared workspace on 2026-10-10. The recipe-set hash sorts the 114 recipe-relative paths and hashes each path, NUL byte, raw file bytes, NUL byte.

| Artifact | Count / scope | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| Ingredient references | 770 references | 242,893 | `086adb131bf0abf4df3b25be430878173ce51a8ac1bcb2191834b4b73b72a4b4` |
| Ingredient forms | 36 forms | 24,403 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Units | 30 units | 5,447 | `6f6e3afc8b2c12fe9120dbcf453d1e675fee596fa754f93cfead040a7ba8c8e4` |
| Seed manifest | 13 fields; 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Package yields | 1 record | 853 | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Research ledger | 988 records; 8 unit conversions; 2,056 source entries; 1,670 distinct source IDs | 2,181,453 | `27300b14879b50bcd61ee46955ba8ecb0e05b3b9110e152bb99f24505c710df9` |
| Recipes | 114 files; 1,123 ingredient rows | 750,593 combined | `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

At this snapshot, `ingredient-ref-basil` is a `HERB` reference named basil / basilic with `defaultDensity: null` and `unitMappings: []`; `ingredient-ref-rosemary-sprigs` is a `HERB` reference named rosemary / romarin with `defaultDensity: null` and `unitMappings: []`. Their ledger entries each have `identityState: unreviewed`, `measurementState: not_yet_researched`, no sources, and no decisions. Neither selected line has an active count mapping or source-specific measurement observation.

## Source-ID uniqueness and integration boundary

The three `WP04-FRESH-HERB-PORTION-20261010-S0*` IDs are proposal-local and unique to this file; they do not collide with existing research-ledger source IDs. These identifiers document the evidence and access attempt only. Do not add canonical source rows or measurement records from this review.

No canonical seed, ledger, recipe, plan, roadmap, test, or code file was edited. No tests were run.
