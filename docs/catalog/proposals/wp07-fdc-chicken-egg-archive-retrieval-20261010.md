# WP07 Coordinator Follow-up: Official FDC Egg Portion Retrieval

**Review date:** 2026-10-10  
**Status:** Official source retrieval completed and merged as ledger-only evidence. Runtime egg conversions remain blocked.

## Retrieval outcome

The initial browser and API attempts did not expose the official item payload. The USDA FoodData Central download page lists an April 2026 Foundation Foods JSON release. Its public archive was retrieved and the JSON records for the three egg items were inspected directly.

Archive: [USDA FoodData Central Foundation Foods JSON, April 2026](https://fdc.nal.usda.gov/fdc-datasets/FoodData_Central_foundation_food_json_2026-04-30.zip). The [official download page](https://fdc.nal.usda.gov/download-datasets/) identifies April 2026 as the current Foundation Foods release. The inspected archive SHA-256 was 186e988ec542e913f51ef62b86a47758e8cdd0d1dc3889e7b055581f3c09c77a.

| Ingredient record | Exact FDC item | Portion row | Published count portion |
| --- | --- | --- | --- |
| ingredient-ref-egg | FDC 748967 / NDB 1123, Eggs, Grade A, Large, egg whole | 193781; amount 1 egg; modifier whole without shell | 50.3 g |
| ingredient-ref-egg-white | FDC 747997 / NDB 1124, Eggs, Grade A, Large, egg white | 190538; amount 1 egg; modifier white | 34.0 g |
| ingredient-ref-egg-yolk | FDC 748236 / NDB 1125, Eggs, Grade A, Large, egg yolk | 192336; amount 1 egg; modifier yolk | 17.0 g |

The whole-egg and white records also contain separate 1 RACC = 50 g rows. Those are reference-amount portions, not one-egg count portions, and were excluded from the count-weight observations. The yolk record has no RACC row.

The FDC item labels provide a Grade A, Large designation, but do not explicitly name the egg species. The portion rows do not specify a cooking state. Preserve those exact source limits; do not infer chicken identity from the item labels or equate the U.S. size class with Canadian Large.

## Variability and runtime disposition

The egg count rows contain a single gram weight each and no dataPoints field or portion-weight distribution. minYearAcquired is 2019 for the three count rows; it is not a portion sample count or a weight range. These rows add no individual-egg variability evidence.

The UK Department of Health report and U.S. retail study reviewed in the [initial retrieval review](wp07-fdc-chicken-egg-portion-retrieval-review-20261010.md) remain bounded proposal evidence. Their group averages and brand means are not individual-egg ranges or a cross-market count conversion. No sample interval was added to the ledger.

The three exact portions were added to the existing ledger records as source-qualified count_weight observations. Each record remains measurementState: blocked_pending_evidence; its active ingredient reference still has null defaultDensity and empty unitMappings. No size crosswalk, species inference, variability interval, runtime mapping, recipe relink, or substitution was added.

The shared ledger source IDs are WP07-FDC-EGG-20261010-S01 through S03. Their observation IDs are WP07-EGG-FDC748967-whole-without-shell, WP07-EGG-FDC747997-large-white, and WP07-EGG-FDC748236-large-yolk.

## Verification scope

A Python regression test now checks each official source and count observation, confirms all three measurement states remain blocked, and confirms that active densities and unit mappings remain empty. This is ledger and test coverage only; no Android behavior changed.
