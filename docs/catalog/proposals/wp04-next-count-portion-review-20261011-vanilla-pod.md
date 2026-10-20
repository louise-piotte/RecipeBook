# WP04 proposal: vanilla-pod count portion review

**Review date:** 2026-10-11
**Status:** The exact count-only disposition for `045#6` was recorded in the 2026-10-11 follow-up integration; no recipe edit or whole-pod mass was added. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).

## Recommendation

Keep bundled line `045#6` as **`1 vanilla pod`**, with structured quantity `1` and no unit field. Its directly linked Fashion Cooking page lists `1 gousse de vanille` and directs the cook to split the pod, scrape out the seeds, and add them to the milk. This supports the line's count and culinary role.

The publisher provides no pod mass, size, species, curing or drying state, edible-versus-as-purchased basis, or weight range. The matching CNF 2026 and USDA evidence reviewed here contains vanilla extract products, not a whole-pod portion. Do not add a numeric count-weight observation, a reusable count mapping, or any density, unit mapping, conversion, yield, substitution, or recipe edit. Keep the ledger's `measurementState: researched_no_supported_value` for `ingredient-ref-vanilla-pod`.

## Exact bundled demand and source match

| Field | Bundled record and current linked source |
|---|---|
| Recipe | `045`, *Fraisier* / *Strawberry Fraisier Cake*, recipe UUID `b8cf19ee-618b-495a-9ecb-9a90e88a9dac`. |
| Exact line | `045#6`, ingredient UUID `b8cf19ee-618b-495a-9ecb-9a90e88a9dac-ingredient-6`: `1 vanilla pod`; quantity `1`; no `unit` field; reference `ingredient-ref-vanilla-pod`; group `Mousseline Cream`. |
| Current linked page | Anne-Sophie Fashion Cooking, *Fraisier traditionnel*, lists `1 gousse de vanille`. Its method says to split the pod in half, recover the seeds, and put them in the milk before bringing the milk to a boil. |
| Match result | Exact count and ingredient match, with a matching pastry-cream use. The page does not state mass or pod dimensions. It says its recipe and design are inspired by Chloé Délice and that the recipe uses an official CAP recipe; this review uses only the amount on the linked page and does not claim a separate recipe lineage for the bundled adaptation. |

The bundled instructions also split the pod and add the seeds to the milk. Neither the page nor the bundled line says what happens to the scraped pod shell afterward. Neither describes the pod as raw, cured, or dried.

## Portion-source audit and limits

| Evidence | Finding | Match limit |
|---|---|---|
| Health Canada CNF 2026 relational files | Food codes 216–218 are vanilla extract and imitation vanilla extracts. Their joined measure records are millilitre measures; no whole vanilla-pod food record or pod mass is present. CNF measure label `1 gousse` (code 482) is English `1 clove`, and the generic `1 pod` labels (codes 529–532) join to other foods such as cowpeas, yardlong beans, moringa, and okra. | The French word or generic pod measure label alone does not match a vanilla pod. Extract measures and other plant pods cannot supply this line's mass. |
| USDA FoodData Central, Foundation Foods April 2026 | The USDA downloads page lists April 2026 Foundation Foods as the latest Foundation release on the review date. A text search of its downloaded JSON archive found no `vanilla` record. | This archive supplies no whole-pod item or portion. This finding is scoped to that Foundation Foods archive; it does not claim that every FDC data type was checked. |
| USDA Standard Reference Release 28, Food Group 02 | The spices-and-herbs report contains vanilla extract (NDB 02050) and imitation vanilla extracts (NDB 02051 and 02052); it contains no whole vanilla pod item. | Any extract measures in this legacy report describe the extract product. They cannot be assigned to the counted whole pod. |

No source establishes a pod length, diameter, cultivar, mass, moisture state, refuse percentage, or population range. No source reports a weight for the whole pod before scraping, for seeds alone, or for the scraped shell. Do not infer an edible mass, as-purchased mass, seed yield, or cooked-milk flavouring yield from the count or method.

## Prior-review and ledger audit

The manifest-listed recipe and line were checked against the WP04 count/portion proposals, batch records, and current research ledger. Earlier WP04 count/portion work does not cover `045#6`. The WP02 vanilla identity review mentions the row while confirming the separate vanilla-pod identity; it does not assess portion weight. The current ledger lists identity sources only for `ingredient-ref-vanilla-pod`, has no measurement observations, and reports `measurementState: researched_no_supported_value`.

If this audit is later represented in the ledger, add source-scoped review evidence and an unresolved decision for `045#6`; add no numeric measurement observation. Preserve `defaultDensity: null`, `unitMappings: []`, and the current recipe text and amount.

## Source register

Sources accessed 2026-10-11 unless otherwise stated.

| Source ID | Source and locator | Claim and limit |
|---|---|---|
| `WP04-VANILLA-POD-PORTION-20261011-S01` | Anne-Sophie Vidal, Fashion Cooking, [Fraisier traditionnel](https://www.fashioncooking.fr/2016/09/fraisier-traditionnel/), mousseline ingredient list and pastry-cream method. | Lists one vanilla pod and uses its scraped seeds in milk. Directly matches the count and role in `045#6`; gives no size, mass, or edible/as-purchased basis. |
| `WP04-VANILLA-POD-PORTION-20261011-S02` | Health Canada, [Canadian Nutrient File 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-7ed7-4043-bc28-ff00e10f3109); [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-7ed7-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-7ed7-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-7ed7-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv), and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-7ed7-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). | Joined food, measure, type, and weight rows for vanilla-related records. Found extract/imitation-extract records and no whole-pod portion. Codes 482 and 529–532 do not denote vanilla pods. Retrieved file fingerprints are recorded in `docs/catalog/batches/wp04-wp12-cnf-2026-portion-retrieval-integration-20261011/README.md`. |
| `WP04-VANILLA-POD-PORTION-20261011-S03` | USDA ARS, [FoodData Central downloads](https://fdc.nal.usda.gov/download-datasets/) and [Foundation Foods April 2026 JSON archive](https://fdc.nal.usda.gov/fdc-datasets/FoodData_Central_foundation_food_json_2026-04-30.zip). | The downloads page lists Foundation Foods 04/2026 as the latest Foundation release. The retrieved archive SHA-256 is `186e988ec542e913f51ef62b86a47758e8cdd0d1dc3889e7b055581f3c09c77a`; a text search found no `vanilla` record. No pod measurement is attributed to FDC. |
| `WP04-VANILLA-POD-PORTION-20261011-S04` | USDA ARS, [Standard Reference Release 28, Food Group 02: Spices and Herbs](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf), NDB 02050–02052. | Lists vanilla extract and imitation extracts, with no whole-pod item. Its source-specific extract measures are not used for `045#6`. |

## Acceptance checks

1. Preserve `045#6` as `1 vanilla pod`, quantity `1`, with no structured unit added.
2. Record no pod mass, count-weight observation, range, or reusable count conversion.
3. Keep all source-specific extract measures separate from the whole-pod recipe line.
4. Do not assign pod state, dimensions, species, edible/as-purchased basis, shell disposition, or yield without matching evidence.
5. This file preserves the source review. Its count-only outcome was recorded in the follow-up integration; see the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md). No recipe edit or whole-pod mass was added.

## Validation

UTF-8 without a byte-order mark. Whitespace and encoding checks apply to this proposal only. No tests were run during the source review; implementation verification is recorded in the batch README.
