# WP04 Proposal: Raspberry Pie Raw 5-Inch Crust and Top Dough

**Review date:** 2026-10-11

**Status:** Proposal only; no catalog, ledger, recipe, plan, roadmap, or test changes.

## Recommendation

Keep Raspberry Pie `108#1` at **1 count** with its current wording: `1 raw 5-inch pie crust, plus extra dough for the top crust`. Keep count-to-mass and edible-portion measurement unavailable; the pie-crust reference remains `blocked_pending_evidence`.

The bundled count names one 5-inch raw bottom shell plus an unspecified amount of dough for the top. The current linked publisher recipe describes a homemade all-butter, double-crust 9-inch pie made from two dough discs. It gives no total dough weight, per-disc weight, or weight for the shell-plus-top-dough amount in the bundled line. It therefore confirms a related raw double-crust preparation, but does not measure this exact line. Do not scale by diameter or area, divide recipe ingredients by a stated yield, treat the top dough as a second counted shell, or convert any source portion to this line.

## Exact line and selection audit

| Field | Current bundled evidence |
| --- | --- |
| Recipe and line | `108` — Raspberry Pie; `108#1`; recipe UUID `166eae41-5c40-4a1c-8c3e-2cec590ab18c`; ingredient-line UUID `166eae41-5c40-4a1c-8c3e-2cec590ab18c-ingredient-1`. |
| Structured amount | `quantity: 1`; `unit: count`; `ingredientRefId: ingredient-ref-pie-crust`. |
| Exact source text | `1 raw 5-inch pie crust, plus extra dough for the top crust`. The English note says `5-inch sweet pie shell, plus extra dough for the top crust`. |
| Recipe state and yield | The instruction fills a raw shell, covers it with extra dough, then bakes the assembled pie; the recipe yield is one 5-inch pie. No post-bake crust weight or yield is stated. |
| Direct source | The bundled recipe names The Busy Baker and links `https://thebusybaker.ca/classic-raspberry-pie/`. |
| Component link | The recipe links to local recipe `041`, Pie Crust. That manually cleaned component lists four 5-inch shells, but no shell or dough-batch weight. Its current publisher page does not verify that local four-shell version. |
| Current ledger | `ingredient-ref-pie-crust` is `blocked_pending_evidence`, with null default density and empty unit mappings. Its existing unresolved decision covers only Blueberry Pie `106#1`; it contains no measurement observation for `108#1`. |

The manifest lists 114 recipe files. Recipe 108 is at zero-based index 107, after excluded review lines `089#8` and `107#1`; `109#1` is the following separate crust demand. A search of prior WP04 count/portion proposals, batches, and the current ledger found no focused review or line-specific observation for `108#1`. The earlier Blueberry Pie crust proposal lists `108#1` as a separate open demand and explicitly scopes itself to `106#1`; the `089#8` and `107#1` proposals also leave this line outside their scope. The active WP04 plan still has the produce count, edible-portion, and composition-sensitive fixture work open.

## Source checks and limits

| Source ID | Source and locator | What it establishes | Why it does not measure `108#1` |
| --- | --- | --- | --- |
| `WP04-PIE-CRUST-108-20261011-S01` | The Busy Baker, [Raspberry Pie](https://thebusybaker.ca/classic-raspberry-pie/), modified 2023-12-12; recipe-card ingredients and instructions for the crust and assembly. Accessed 2026-10-11. | Calls for homemade all-butter crust; the instructions vary water with weather/flour, divide dough into two discs, line a 9-inch plate with one disc, and place the second over the filling. The pie is assembled with raw crust and baked. The page reports no total dough mass or per-disc weight. | The publisher's 9-inch formula and two-disc double crust do not match the bundled 5-inch shell plus unspecified extra top dough. The 9-inch pan, dough batch, and top/bottom allocation are not a measured portion for the local line. |
| `WP04-PIE-CRUST-108-20261011-S02` | Preppy Kitchen, [Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/), recipe-card yield, ingredients, and method; current page says two 9-inch crusts. Accessed 2026-10-11. | This is the publisher linked by local component recipe 041. The current card lists 360 g flour, 227 g butter, and 60–90 ml ice water, with more as needed, and divides the dough into two discs. It does not publish total dough mass or per-crust weight. | The current publisher's two 9-inch crusts differ from local recipe 041's manually cleaned four 5-inch shells. Neither that local yield nor the publisher's ingredient inputs establish a measured shell-plus-top-dough portion. Do not sum inputs or divide by yield. |
| `WP04-PIE-CRUST-108-20261011-S03` | Health Canada, [Canadian Nutrient File 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), including the Food Name, Measure Name, and Measure Weight Conversion resources. Accessed 2026-10-11. | The official dataset index lists the relational food and measure files needed for a joined portion lookup. | The dataset page and direct CSV downloads returned 403 in this review environment. No current CNF 2026 food/measure/weight tuple for a raw pastry shell or this 5-inch line was verified; this does not establish that no such row exists. |
| `WP04-PIE-CRUST-108-20261011-S04` | Health Canada, [CNF Food Code 4031](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4031), serving-size page. Accessed 2026-10-11. | The page identifies *Pie crust, cookie-type, graham cracker, homemade, chilled* and reports source-specific measures: 244 g for one 23 cm crust, 30 g for a 1/8-of-23-cm crust, and 30 g for a 1/6-of-20-cm crust; refuse is 0%. | This is a chilled graham-cookie crust, not the raw pastry dough in the recipe. Its whole-crust size and formulation do not match the target. These values are not a range or substitute for `108#1`. |
| `WP04-PIE-CRUST-108-20261011-S05` | USDA ARS, [Standard Reference Release 28, Food Group 18](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg18.pdf), NDB 18945, *Pie crust, deep dish, frozen, unbaked, made with enriched flour*, edible-portion common-measure table. | Reports 225 g for one average-weight frozen unbaked deep-dish crust and 0% refuse. | Frozen enriched deep-dish product; not the homemade all-butter 5-inch shell plus extra dough. The measure does not identify the target diameter or product. |
| `WP04-PIE-CRUST-108-20261011-S06` | USDA ARS, [Standard Reference Release 28, Food Group 18](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg18.pdf), NDB 18948, *Pie crust, refrigerated, regular, unbaked*, edible-portion common-measure table. | Reports 229 g for one average-weight refrigerated unbaked crust and 0% refuse. | A distinct refrigerated product without the target recipe's formulation, diameter, or top-dough amount. It cannot be assigned to `108#1`. |
| `WP04-PIE-CRUST-108-20261011-S07` | USDA ARS, [Standard Reference Release 28, Food Group 18](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg18.pdf), NDB 18402, *Pie crust, standard-type, prepared from recipe, unbaked*, edible-portion common-measure table. | Reports 24 g for one 1/8 piece of a 9-inch crust and 194 g for one single 9-inch crust; refuse is 0%. | The 9-inch record is a different recipe and size, and its single-crust amount excludes the target's unspecified extra top dough. Keep the two measures source-specific; do not scale or combine them. |
| `WP04-PIE-CRUST-108-20261011-S08` | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), item A.23. | Sets a 21 g reference amount for pie crust, including phyllo and puff-pastry sheets; for an uncut crust, the labelled serving is a fraction closest in weight to that reference amount. | This is a nutrition-labelling reference amount and serving-expression rule, not a whole-shell mass, recipe yield, or measurement of this line. |
| `WP04-PIE-CRUST-108-20261011-S09` | USDA, [FoodData Central downloads](https://fdc.nal.usda.gov/download-datasets/) and [data-type documentation](https://fdc.nal.usda.gov/data-documentation/). Accessed 2026-10-11. | The current download page lists Foundation and Branded data releases for April 2026; SR Legacy is final at April 2018. | The current FoodData Central item search did not provide a verifiable matching 5-inch homemade crust portion in this review. No exact current item-level measure was verified, and no absence claim is made. SR28 comparator values above remain historical source-specific records. |

## Measurement boundary

| Dimension | Supported for `108#1` | Unresolved; do not infer |
| --- | --- | --- |
| Count and wording | One count as stored; the count covers a raw 5-inch bottom shell plus extra dough for the top. | A separate count or quantity for the top dough. |
| Food state | Raw at assembly and before the pie bake. | Baked shell mass, bake loss, or a post-bake yield. |
| Size and product | The local line says 5-inch and sweet pie shell. | A source-measured 5-inch mass, exact formulation, brand/package, or equivalence to any USDA/CNF comparator. |
| Edible / as-purchased basis | No exact basis is stated for a weighed target portion. | An edible-portion or as-purchased weight, trim adjustment, or conversion from the 0%-refuse comparators. |
| Numeric behavior | No numeric observation or recipe mass is supported for this line. | `count_weight`, `portion_weight`, edible-portion yield, density, unit mapping, conversion, substitution, or recipe edit. |

If this proposal is later integrated, add only a line-scoped unresolved decision explaining the size, formula, and count-basis mismatch. Do not add a measurement observation. Keep `defaultDensity: null`, `unitMappings: []`, and the recipe line unchanged. No tests were run because this proposal does not change implementation or data.
