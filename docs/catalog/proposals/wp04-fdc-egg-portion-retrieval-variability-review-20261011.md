# WP04 Proposal: FDC Egg Portions and Source-Preserving Variability Evidence

**Review date:** 2026-10-11
**Status:** Coordinator-reviewed and integrated as source-bounded ledger intervals and a checklist update. All runtime egg measurements remain blocked; no recipe lines or active mappings changed.

## Disposition

The USDA FoodData Central (FDC) Foundation Foods April 2026 archive was successfully retrieved and inspected in the coordinator review dated 2026-10-10. Its exact one-count portions are already present as source-specific observations in the live research ledger. Keep them there; do not add duplicates or activate a conversion.

The three FDC items are labelled **Grade A, Large**, but their descriptions do not state species. Their `foodPortions` rows give one whole egg without shell, one white, and one yolk. The rows do not state raw/fresh/cooked preparation. They therefore match the reviewed recipe demand on count, item part, and the FDC size label where a recipe explicitly says “large,” but they do not establish an exact raw-state match. Preserve that missing state and do not claim that the FDC items are chicken or that U.S. Grade A Large equals Canadian Large.

FDC reports one gram weight for each count portion and no egg-portion min/max or weight distribution. The Foundation sample metadata concerns the food's analyzed components; it does not supply physical egg-weight variability for these portion rows. The independent variability studies are now also recorded in the live ledger as derived ranges across published group/brand means, with source-specific qualifiers attached; they are not individual-egg ranges.

## Current FDC portions already in the ledger

| Ledger source / observation | Official FDC item and portion | Published portion | Basis and limits |
| --- | --- | --- | --- |
| `WP07-FDC-EGG-20261010-S01` / `WP07-EGG-FDC748967-whole-without-shell` | FDC 748967 / NDB 1123, *Eggs, Grade A, Large, egg whole*; `foodPortions` ID 193781; amount 1 egg; modifier “whole without shell” | 50.3 g | Whole edible contents without shell. The item and portion do not state species or preparation state. |
| `WP07-FDC-EGG-20261010-S02` / `WP07-EGG-FDC747997-large-white` | FDC 747997 / NDB 1124, *Eggs, Grade A, Large, egg white*; `foodPortions` ID 190538; amount 1 egg; modifier “white” | 34.0 g | White portion under the Grade A, Large item. The item and portion do not state species or preparation state. |
| `WP07-FDC-EGG-20261010-S03` / `WP07-EGG-FDC748236-large-yolk` | FDC 748236 / NDB 1125, *Eggs, Grade A, Large, egg yolk*; `foodPortions` ID 192336; amount 1 egg; modifier “yolk” | 17.0 g | Yolk portion under the Grade A, Large item. The item and portion do not state species or preparation state. |

The whole-egg and white records also have separate `1 RACC = 50 g` portions. Those are reference-amount servings, not one-egg count portions; exclude them from count-weight evidence. The yolk item has no RACC row. Do not substitute an RACC amount for a count portion or multiply a one-count value to fill a recipe line requesting multiple eggs, whites, or yolks.

These observations are already stored as `count_weight` / `published_portion` with their exact source IDs, portion IDs, quantity, basis, state limits, and FDC item IDs. Their ledger measurement states remain `blocked_pending_evidence`.

## Exact recipe-line comparison

The current recipe audit in [WP04 recipe-matched egg portion review](wp04-egg-count-portion-review-20261010.md) covers 65 egg-related ingredient rows in 55 recipes. FDC's one-count portions match these lines on count, part, and explicit large-size wording:

| FDC portion | Recipe lines with matching count, part, and size | Remaining mismatch |
| --- | --- | --- |
| One Grade A, Large whole egg without shell | `001#2`, `033#6`, `038#7`, `039#5`, `054#7`, `060#1`, `109#5` | Recipe ingredients are used before the recipe's cooking step, but FDC does not state raw/fresh/cooked. FDC also does not identify species or a Canadian grade. |
| One Grade A, Large white | `021#14` | The recipe uses a separated raw white; FDC's portion row does not state preparation state or species. |
| One Grade A, Large yolk | `110#4` | The recipe uses a separated raw yolk; FDC's portion row does not state preparation state or species. |

These are partial qualifier matches, not complete source-to-line matches under a strict preparation-state check. The line audit does not support using the FDC values for unsized eggs, the two-medium-egg line, mass-based lines, or multi-count recipes. It also does not support deriving a recipe total from the one-count portion. Keep the exact recipe-specific `003#4` Amaretti value of two whites at 60 g separate; it is a source-recipe target, not a general FDC or egg-white portion.

## Retrieval audit and reproducibility

The official [FDC download page](https://fdc.nal.usda.gov/download-datasets/) currently lists Foundation Foods April 2026 as its latest release. The earlier successful archive inspection and SHA-256 are recorded in [WP07 official FDC archive retrieval](wp07-fdc-chicken-egg-archive-retrieval-20261010.md):

- Archive: [FoodData Central Foundation Foods JSON, April 2026](https://fdc.nal.usda.gov/fdc-datasets/FoodData_Central_foundation_food_json_2026-04-30.zip).
- Recorded archive SHA-256: `186e988ec542e913f51ef62b86a47758e8cdd0d1dc3889e7b055581f3c09c77a`.
- Internal file: `FoodData_Central_foundation_food_json_2026-04-30.json`.
- Recheck by locating the foods by `fdcId` 748967, 747997, and 748236, then inspect the matching `foodPortions` IDs 193781, 190538, and 192336. Confirm each row's `amount`, `modifier`, `gramWeight`, and any `dataPoints`, `footnote`, or `minYearAcquired` fields. Do not treat a `minYearAcquired` value as a sample count or a weight range.

On 2026-10-11, I rechecked the official download and search pages. The official Foundation search identifies the three item descriptions and NDB numbers, but its readable result does not show the portions. Fresh retrieval attempts could not expose the binary payloads in this environment:

| Official route attempted | Result |
| --- | --- |
| Foundation Foods April 2026 JSON archive linked from the current FDC download page | Web reader rejected the ZIP as unsupported `application/zip`; local `curl` could not resolve `fdc.nal.usda.gov`. The item portions above rely on the already successful 2026-10-10 official archive extraction and its recorded archive hash, not a new extraction in this review. |
| FDC detail API for FDC IDs 748967, 747997, and 748236 using the documented `DEMO_KEY` route | Web reader returned “URL is not accessible”; local `curl` could not resolve `api.nal.usda.gov`. |
| FNDDS 2021–2023 JSON archive and the USDA ARS `Foods and Beverages` and `Portions and Weights` spreadsheets | Official links are present, but the web reader rejected ZIP/XLSX content types and local `curl` could not resolve USDA hosts. No egg rows or FNDDS weights were read. |
| SR Legacy April 2018 JSON archive | Official link is present, but the web reader rejected the ZIP and local `curl` could not resolve `fdc.nal.usda.gov`. No archive rows were read in this review. |

The official [FDC API Guide](https://fdc.nal.usda.gov/api-guide/) describes item-detail and search endpoints. The official [data downloads](https://fdc.nal.usda.gov/download-datasets/) page lists FNDDS 2021–2023 (October 2024) and SR Legacy (April 2018); SR Legacy is the final, no-longer-updated release, not the current FDC release. The USDA ARS [FNDDS download documentation](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/food-surveys-research-group/docs/fndds-download-databases/) exposes the current FNDDS `Foods and Beverages` and `Portions and Weights` tables. The [official field descriptions](https://fdc.nal.usda.gov/docs/Download_Field_Descriptions_Oct2020.pdf) define `food_portion` fields including amount, unit, modifier, gram weight, data points, footnote, and minimum acquisition year. Those tables remain a useful next retrieval path when their files can be read; no FNDDS or SR Legacy portion is claimed here.

## Variability evidence and limits

The earlier [WP07 variability review](wp07-fdc-chicken-egg-portion-retrieval-review-20261010.md) examined two independent studies. They provide bounded sample-level context but do not yield a Canadian/U.S. large-egg count conversion:

| Proposal source ID from the prior review | Source result | What the result represents |
| --- | --- | --- |
| `WP07-EGG-VAR-AUDIT-20261010-S01` (now a ledger source linked to derived sample/brand-mean interval observations) | UK Department of Health, *Nutrient analysis of eggs — Sampling Report* (2012): for 12 published group means per size band, raw white means span 34.4–37.5 g for UK medium and 39.1–42.7 g for UK large; yolk means span 14.1–15.7 g and 15.7–17.7 g respectively. | Ranges across published sample-group averages, not individual-egg minima/maxima or confidence intervals. UK shell-on size bands (medium 53–62.9 g; large 63–73 g) are not mapped to Canadian or U.S. carton classes. The report's sampling summary dates conflict with some detailed subsample dates. White/yolk separation and contamination notes must stay attached. |
| `WP07-EGG-VAR-AUDIT-20261010-S02` (now a ledger source linked to derived sample/brand-mean interval observations) | Hisasaga, Griffin, and Tarrant (2020), U.S. retail study: across six brand means, yolk spans 14.9–21.4 g, albumen 30.3–35.5 g, and total shell-on egg 59.6–62.4 g. | Brand-mean spread in selected retail products; the source does not report a size class. Total egg includes shell. The article's printed “±” statistic is not defined in the accessible text, and the brand counts total 306 while the methods state 309 eggs. Do not treat “±” or brand-mean spread as an individual-egg range. |

The current FDC Foundation rows add one point each: 50.3 g whole without shell, 34.0 g white, and 17.0 g yolk. They do not disclose an individual egg-weight distribution. Foundation Foods can show sample-level analytical nutrient/component values; those nutrient values and their statistics do not represent sample-level egg weights. The FDC field description defines `data_points` for a food portion as a count of determinations where present, while `min_year_acquired` records the earliest acquisition year. The previously inspected egg count rows have no `dataPoints` value or weight range; their `minYearAcquired` value of 2019 is an earliest acquisition year, not a sample count or weight distribution.

## Source-preserving ledger representation

The coordinator integrated the derived intervals using the existing v1 interval shape, preserving rather than flattening the published basis:

| Evidence element | Existing ledger field(s) to use |
| --- | --- |
| Source name, publication/release year, URL, review date, FDC archive version, exact FDC food and portion IDs | `sources[].title`, `versionOrDate`, `url`, `accessedOn`, `locator`, and `supports`; put the FDC food ID, NDB number, archive filename, and portion ID in `locator`. |
| Species, size class, egg part, and the food's exact name | `foodDescription`; say “not stated” where the source does not specify species or a qualifier. Do not infer chicken from a generic egg label or equate national size classes. |
| Raw/fresh/frozen/cooked, separated part, shell-on/off, and source-specific preparation | `foodState`; preserve source wording and explicitly record unknown state rather than adding “raw” because the recipe is raw. |
| One egg / one white / one yolk and the source's unit wording | `sourceQuantity`, plus the exact source unit/portion phrase in `measurementMethod`. |
| Edible versus as-purchased basis, refuse percentage and method, and contamination/separation notes | `quantityBasis` and `measurementMethod`; record whether refuse is stated, not stated, or measured. Never apply a source's refuse factor to another population. |
| One published point versus an actual reported or observed interval | Keep a single portion as scalar `value` + `valueUnit`. Use `valueIntervals` only for a source-reported or measured interval, with unit, endpoint semantics, `intervalKind`, `origin`, and source text/precision as required by the existing schema. |
| Sample size, grouping, brand/market, collection dates, averaging basis, and calculation provenance | Preserve in `measurementMethod`, `foodState`, `quantityBasis`, and `calculation`; keep the corresponding source entry linked through `sourceIds`. |

For the UK report, the ledger now records the range across the 12 published sample-group means for each scoped measure as an `observed_sample_range` with `origin: derived` and an explicit calculation. The description and basis identify the interval as a range across sample-group means, not individual egg weights. The report's source-reported sample size and date inconsistency remain visible. For the U.S. study, the ledger records the range across brand means; it is not labelled an individual-egg range, standard deviation, standard error, or size-grade measure. These intervals remain separate from the FDC portion scalars.

## Existing catalog boundary check

The current egg references retain these bilingual identities and aliases:

| Reference | Current English alias(es) | Current French alias(es) |
| --- | --- | --- |
| `ingredient-ref-egg` | `eggs` | `gros œuf`, `gros oeufs`, `œuf entier`, `œufs entiers`, `œuf large`, `oeufs`, `œufs moyens` |
| `ingredient-ref-egg-white` | `egg whites` | `gros blanc d'oeuf`, `gros blancs d'oeufs` |
| `ingredient-ref-egg-yolk` | `egg yolks` | `gros jaune d'oeuf`, `gros jaunes d'œufs`, `jaunes d'œufs` |

These are search names; they do not establish a source market, raw state, species, size equivalence, or gram value. The whole-egg alias `œufs moyens` likewise does not make the U.S. FDC item a medium egg.

All three egg references still have `defaultDensity: null` and `unitMappings: []`; there are no egg forms. The bundled contextual-substitution-rules file has no active egg rule. The whole-egg ledger contains a selected-baking egg-to-aquafaba finding marked `blocked_pending_evidence`; it is research only. Egg-white and egg-yolk substitution states remain `not_yet_researched`. No current density or active substitution value applies to these portions.

## Plan status and next review boundary

The plan's WP07 checklist marks the readable April 2026 Foundation archive retrieval and UK/U.S. variability review complete (Section 07, around lines 868–900). The live ledger contains the three official archive observations and nine derived ranges across published UK sample-group and U.S. brand means. The 2026-10-10 checkpoint's earlier statement that the archive rows were unavailable describes that failed retrieval attempt and is now annotated as superseded. The remaining recipe-line gap is exact species, preparation state, market/size, and edible-basis matching; the broader Section Q egg-identity checklist also remains open for other species and processed egg products.

The coordinator reconciled the active plan wording and retained open follow-up for exact recipe-state matching. Keep all three runtime egg measurement states blocked, and leave recipe lines and canonical package data unchanged.

## Sources and related records

- USDA FDC, [Download datasets](https://fdc.nal.usda.gov/download-datasets/) and [Foundation Foods egg search](https://fdc.nal.usda.gov/food-search/?query=eggs&type=Foundation).
- USDA FDC, [Foundation Foods documentation](https://fdc.nal.usda.gov/Foundation_Foods_Documentation/), [data type documentation](https://fdc.nal.usda.gov/data-documentation/), [API guide](https://fdc.nal.usda.gov/api-guide/), [FAQ](https://fdc.nal.usda.gov/faq/), and [Download Field Descriptions](https://fdc.nal.usda.gov/docs/Download_Field_Descriptions_Oct2020.pdf).
- USDA ARS Food Surveys Research Group, [FNDDS 2021–2023 documentation and databases](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/food-surveys-research-group/docs/fndds-download-databases/).
- [WP04 recipe-matched egg portion review](wp04-egg-count-portion-review-20261010.md), [WP07 official FDC archive retrieval](wp07-fdc-chicken-egg-archive-retrieval-20261010.md), and [WP07 egg variability review](wp07-fdc-chicken-egg-portion-retrieval-review-20261010.md).

At proposal creation, no tests were run. The coordinator integration added a Python regression assertion; validation results are in the integration README.
