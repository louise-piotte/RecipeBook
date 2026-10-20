# WP07 USDA FDC Egg Portion Retrieval — 2026-10-10

## Evidence and ledger result

The official April 2026 USDA FoodData Central Foundation Foods JSON archive was inspected after the initial browser-only retrieval attempt failed. The official download page lists this release. The archive SHA-256 is 186e988ec542e913f51ef62b86a47758e8cdd0d1dc3889e7b055581f3c09c77a.

Three exact count portions were added to the existing egg records:

| Item | FDC portion row | Exact source portion | Ledger observation |
| --- | --- | --- | --- |
| FDC 748967 / NDB 1123, Eggs, Grade A, Large, egg whole | 193781 | 1 egg, modifier whole without shell, 50.3 g | WP07-EGG-FDC748967-whole-without-shell |
| FDC 747997 / NDB 1124, Eggs, Grade A, Large, egg white | 190538 | 1 egg, modifier white, 34.0 g | WP07-EGG-FDC747997-large-white |
| FDC 748236 / NDB 1125, Eggs, Grade A, Large, egg yolk | 192336 | 1 egg, modifier yolk, 17.0 g | WP07-EGG-FDC748236-large-yolk |

The whole and white item records also contain 1 RACC = 50 g. Those reference-amount portions are not count-to-mass observations and were excluded. FDC item descriptions do not explicitly identify species, and the portion rows do not state a cooking state. The Grade A, Large designation remains specific to the USDA items and is not mapped to Canadian size classes.

The whole-egg and white count rows have a separate minYearAcquired value of 2019. None of the three count rows has a dataPoints field or portion-weight range. The UK group averages and U.S. brand means remain proposal-only variability context; no individual-egg interval was added.

## Catalog and recipe effects

- The three ledger records remain measurementState blocked_pending_evidence.
- The active egg, egg-white, and egg-yolk references retain null density and empty unit mappings.
- No count conversion, cross-market size rule, species inference, shell factor, recipe relink, alias, form, or substitution was added.
- The current saved recipe quantities and exact ingredient links remain unchanged.

See the [archive retrieval proposal](../../proposals/wp07-fdc-chicken-egg-archive-retrieval-20261010.md) and [initial retrieval/variability review](../../proposals/wp07-fdc-chicken-egg-portion-retrieval-review-20261010.md).

## Validation

- Research ledger validation: 1,107 records, 2,651 source entries, 2,075 distinct source IDs, 165 measurement observations, zero errors.
- Bundled seed package normalization check: passed with no changes.
- Python seed-package suite: 34 tests passed.
- UTF-8 without BOM and JSON parsing: passed.
- git diff whitespace check: passed.
- No Android build, emulator, or deployment was needed: the research ledger is a documentation sidecar and is not included in the app package; no runtime code or bundled seed asset changed.
