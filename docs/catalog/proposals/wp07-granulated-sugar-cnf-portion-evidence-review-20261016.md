# WP07 granulated-sugar CNF portion evidence review (2026-10-16)

## Status and scope

Integrated as five source-specific portions on the existing `ingredient-ref-granulated-sugar` research-ledger record. No active conversion or recipe edit was made. The catalog reference, its empty `unitMappings`, null `defaultDensity`, and existing forms remain unchanged.

## Finding

Health Canada's Canadian Nutrient File serving page names food code 4318 `Sweets, sugars, granulated / Confiseries, sucre, granulé` and publishes five metric volume portions:

| CNF amount | Published mass |
| --- | ---: |
| 5 mL | 4.2 g |
| 15 mL | 12.7 g |
| 100 mL | 84.5 g |
| 125 mL | 105.7 g |
| 250 mL | 211.3 g |

The page identifies the food and listed portions but does not report how the volume was filled, levelled, or packed. Each value is therefore stored as a separate `portion_weight` observation for CNF food code 4318. No density or unit mapping is inferred.

## Existing identity and recipe context

The active reference is `granulated sugar / sucre granulé` (`ingredient-ref-granulated-sugar`), category `SUGAR_AND_SWEETENER`. Its `defaultDensity` remains null and `unitMappings` remains empty. The bundle contains 65 linked granulated-sugar ingredient rows across 54 recipes. Recipe amounts, ingredient links, and text are unchanged.

The ledger already keeps USDA SR28's 200 g per source cup and King Arthur's 198 g per source cup as separate observations because their cup conventions and row-specific methods are not specified. The new metric-volume CNF values do not establish a cross-source cup interpretation or filling method. They are not averaged, converted, or used to reconcile the earlier cup portions.

The ledger measurement state is `researched_supported` for the now documented source-specific portions. This status does not indicate an active runtime mapping. Substitution research remains `not_yet_researched`.

## Source

- **WP07-CNF-GRANULATED-20261016-S01** — Health Canada, [CNF serving size, food code 4318](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4318). The page gives the bilingual food name and all five listed amounts above; page details show a modification date of 2019-03-01.

## Integration checks

The research-ledger Draft 2020-12 schema validation, unique source and observation ID checks, UTF-8/no-BOM check, focused recipe linkage/count audit, and `git diff --check` passed. The reference catalog, bundled package files, and generated index were not modified. No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data, as directed by `AGENTS.md`.
