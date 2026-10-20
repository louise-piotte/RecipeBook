# WP04 proposal: raw 5-inch pie-shell portion review — 2026-10-11

**Status:** Proposal-only; no measurement observation is proposed.

**Scope:** Pecan Pie `109#1`, one raw 5-inch pie crust.

## Recommendation

Preserve the exact line at **1 count** and keep its count-to-mass measurement **blocked pending matching evidence**. The bundled recipe calls for one raw 5-inch shell. Its current linked publisher card also calls for one unbaked shell, but explicitly for a 9-inch pie and a 9-inch pan. Neither that card nor the linked crust formula reports a mass for one raw 5-inch shell. The local component recipe linked from the bundled recipe says it yields four 5-inch shells, but it is a manual-cleanup copy with variable water and optional sugar; it gives no measured dough-batch or per-shell weight.

This follows [FR-5](../../../Requirements.md#L322), which says count amounts generally should not auto-convert unless explicitly mapped. The active WP04 count/edible-portion fixture remains open; this one-line review does not complete it.

The available CNF and USDA records describe other shell types, dimensions, or products. Preserve their own product, state, measure, and refuse qualifiers; they do not establish a portion for `109#1`. Do not scale a 9-inch shell, add or divide ingredient-input masses, treat comparator values as bounds, or infer an edible/as-purchased conversion. No density, count mapping, unit conversion, package yield, baking yield, substitution, or recipe edit is supported.

## Exact bundled demand and catalog state

| Field | Current evidence |
|---|---|
| Manifest entry | `recipes/109-tarte-aux-pacanes-pecan-pie-02721958-323d-47a4-96df-d383ae0994ff.v1.json` is listed in `manifest.v1.json` at recipe-file position 109 of 114. |
| Recipe and line | `109` — Pecan Pie; ingredient line `109#1`; recipe UUID `02721958-323d-47a4-96df-d383ae0994ff`; line UUID `02721958-323d-47a4-96df-d383ae0994ff-ingredient-1`. |
| Exact text and amount | `1 raw 5-inch pie crust`; `quantity: 1`, `unit: "count"`; note: `5-inch sweet pie shell`. |
| Food state and recipe yield | The English and French instructions place pecans in a raw 5-inch shell and bake the filled pie. The recipe yields one 5-inch pie and says to multiply the recipe by three for a 9-inch pie. No top dough is specified for this line. |
| Linked source and provenance | Preppy Kitchen, `https://preppykitchen.com/pecan-pie/`. Import metadata says `recipekeeper-manual-cleanup` (`parserVersion: 2026-04-05`) and preserves no page snapshot or source revision. A component link points to local recipe `041`, whose source URL is `https://preppykitchen.com/classic-pastry-crust/`. |
| Ingredient reference | `ingredient-ref-pie-crust`, `pie crust` / `pâte à tarte`; `defaultDensity: null`, `unitMappings: []`. |
| Ledger state | `identityState: unreviewed`; `measurementState: blocked_pending_evidence`; `substitutionResearchState: not_yet_researched`. The existing pie-crust decision is scoped to Blueberry Pie `106#1`; no measurement observation or decision for `109#1` was found. |

The linked local component recipe `041` says four 5-inch tart shells and stores 300 g flour, 227 g butter, 60 mL ice water plus more as needed, optional sugar, and salt. Its manual-cleanup metadata and shared publisher URL do not make that yield a current, independent measurement. The localized note calls the shell sweet, while the current component page describes its lightly sugared dough as usable for sweet or savory pies and not itself sweet; the note therefore does not identify a distinct dough formula. No final dough-batch mass or measured shell allocation is recorded. Do not sum or divide its recipe inputs to create a shell weight.

## Selection and prior-review audit

A manifest-ordered scan of the current package found six rows linked to `ingredient-ref-pie-crust`: `077#11`, `089#8`, `106#1`, `107#1`, `108#1`, and `109#1`. `077#11` has no structured quantity or unit and is not a count-to-mass line. The focused WP04 reviews already cover `089#8` (four individual 5-inch shells), `106#1` (raw 5-inch shell plus extra top dough), `107#1` (prebaked and cooled 5-inch shell), and `108#1` (raw 5-inch shell plus extra top dough). The Blueberry Pie review also listed `109#1` as an unreviewed, distinct demand. Searches of the prior proposals, batches, and current ledger found no earlier focused portion review or source decision for `109#1`. This proposal covers only `109#1`; the other lines remain separate because their quantity, state, or included dough differs. The open checklist item is [WP04 “Produce count, edible-portion, and composition-sensitive fixtures”](../../RecipeBook-global-ingredient-catalog-plan.txt#L525), and the [roadmap](../../../roadmap.md#L121) still calls for broader count fixtures.

## Source match and measurement limits

The current [Preppy Kitchen Pecan Pie card](https://preppykitchen.com/pecan-pie/) (John Kanell; page shows an update date of September 24, 2025) calls for **one (9-inch) unbaked pie crust** and lists a 9-inch pie pan. Its method fills an unbaked crust; for homemade dough it freezes the shaped crust before filling, and it permits a frozen shaped store-bought crust. This matches the broad one-count and raw-at-assembly state, but not the bundled 5-inch size. The page gives no crust mass, brand, dough formulation for a purchased crust, refuse basis, or edible/as-purchased weight. The current linked [Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/) (updated September 15, 2026) yields two 9-inch crusts and lists 360 g flour, 227 g butter, and 60–90 mL ice water with more added as needed. It reports no total dough mass or individual-shell mass. The size, current recipe version, and lack of direct portion weight prevent either page from measuring the target line.

| Evidence | Source-specific result | Match limit for `109#1` |
|---|---|---|
| Health Canada CNF 2026 | The official dataset listing exposes Food Name, Measure Name, Measure Type, and Measure Weight Conversion files. | The file resource/download endpoints were not accessible through this review interface, so no 2026 food/measure/weight tuple was verified. This is an access limit, not evidence that no matching row exists. |
| Health Canada CNF 2015, Food Code 4031 | *Pie crust, cookie-type, graham cracker, homemade, chilled*: 244 g for one 23 cm crust; 30 g for one-eighth of a 23 cm crust; 30 g for one-sixth of a 20 cm crust; 0% refuse. | Chilled graham-cookie crust, not raw pastry dough. Its recipe, state, and dimensions do not identify the target shell. |
| Health Canada CNF 2015, Food Code 3973 | *Puff pastry, frozen, ready-to-bake*: 47 g for one shell and 245 g for one sheet; 0% refuse. | The exact word “shell” does not establish the same food: this is frozen puff pastry, not the source's pie crust. Do not transfer its portion. |
| USDA SR28, NDB 18402 | *Pie crust, standard-type, prepared from recipe, unbaked*: 24 g for one piece (one-eighth of a 9-inch crust), and 194 g for one single 9-inch crust; 0% refuse. The table labels the measures as amounts in the edible portion of common measures. | The unbaked recipe-prepared state is relevant, but the source reports a 9-inch crust, not this 5-inch recipe or its formulation. Retain both measures as one historical source record; neither is the target portion. |
| USDA SR28, NDB 18945 | *Pie crust, deep dish, frozen, unbaked, made with enriched flour*: 225 g for one average-weight pie crust; 0% refuse. | Frozen enriched deep-dish product; the target's size and product are not established. |
| USDA SR28, NDB 18948 | *Pie crust, refrigerated, regular, unbaked*: 229 g for one average-weight pie crust; 0% refuse. | Refrigerated product with no target diameter or formulation match. Keep distinct from NDB 18945 and 18402; these values are not a range for `109#1`. |
| Health Canada Table of Reference Amounts, A.23 | A 21 g reference amount applies to pie crust, including phyllo and puff-pastry sheets; for an uncut crust, the label measure is a fraction nearest that reference amount. | This is a nutrition-labelling reference amount, not a whole-shell weight or a measured portion for this recipe. |
| USDA FoodData Central | The current download listing shows April 2026 Foundation and Branded data; SR Legacy is final at April 2018. | The FDC search endpoint was inaccessible and current download contents were not reviewed for a matching 5-inch shell. No exact current item-level portion was verified, and no absence claim is made. |

The CNF 2015 web pages are the accessible legacy serving-portion interface; Health Canada describes the 2015 online CNF as an interim surface while the 2026 dataset is provided as relational files. Their source-qualified values above must not be treated as verified 2026 records. USDA SR28 is historical 2015 evidence. All comparator measures are separate source records, not an interval, estimate, or range for the bundled crust.

| Dimension | Supported for `109#1` | Unresolved; do not infer |
|---|---|---|
| Count and size | One shell count; 5-inch as stored. | Whether that dimension is the pan or finished shell, shell thickness, edge trim, or any portion weight. |
| Food state | Raw shell at filling; then baked as part of the pie. | Prebaked/baked empty shell weight, bake loss, or yield. |
| Product and formula | Sweet pie shell in the localized note; component link exists. | Homemade versus purchased shell, brand/SKU, exact recipe version, package, and component formulation for this line. |
| Edible/as-purchased basis | No target weight or basis is published. | Edible portion, as-purchased weight, trim/refuse convention, or conversion between bases. |
| Numeric behavior | The recipe stores `1 count`. | Count mass, interval, density, unit mapping, package yield, substitution, or recipe change. |

## Proposed disposition for later integration

Keep `109#1` at `1 count` and measurement blocked. If this proposal is accepted into the ledger later, record only a line-scoped unresolved decision for `ingredient-ref-pie-crust` explaining that the current publisher source and primary comparators do not directly weigh one raw 5-inch shell of the target product/version. Add no numeric measurement observation. Preserve `defaultDensity: null`, `unitMappings: []`, and the bundled recipe.

A future portion observation for this line should directly report one empty raw 5-inch shell from the relevant recipe version or identified product, with the stated formula/product, precision, and weighing basis (including trim/refuse where applicable). A different pan size, ingredient-input total, filled pie, frozen/puff/graham shell, geometric scale, or average-weight comparator does not meet that match.

## Source register

Sources checked on 2026-10-11 unless otherwise noted. Source identifiers are proposal-local; none is added to the ledger here.

| Source ID | Source and locator | Claim and limit |
|---|---|---|
| `WP04-PIE-CRUST-109-20261011-S01` | Preppy Kitchen, [Pecan Pie](https://preppykitchen.com/pecan-pie/), ingredient card, equipment, and instructions; John Kanell; page shows updated 2025-09-24. Current indexed card content was readable; direct page opening failed in this review interface. | One unbaked 9-inch crust for a 9-inch pan, with homemade or frozen store-bought options; no crust weight. It supports state/count context, not the bundled 5-inch portion. |
| `WP04-PIE-CRUST-109-20261011-S02` | Preppy Kitchen, [Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/), yield and recipe card; John Kanell; updated 2026-09-15. | Two 9-inch crusts; ingredient inputs include variable ice water. No total dough or individual shell mass. |
| `WP04-PIE-CRUST-109-20261011-S03` | Health Canada, [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) and [CNF overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html); dataset metadata last updated 2026-10-04. | The official listing identifies relational Food Name, Measure Name, Measure Type, and Measure Weight Conversion files. Health Canada says the 2015 online serving pages remain an interim access surface while CNF 2026 is distributed in relational files. The CSV download endpoints could not be accessed here; no current CNF row or absence claim is asserted. |
| `WP04-PIE-CRUST-109-20261011-S04` | Health Canada, [CNF Food Code 4031](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4031), serving-size and refuse table. | Chilled homemade graham-cookie crust portions and 0% refuse; not the target pastry type/state. |
| `WP04-PIE-CRUST-109-20261011-S05` | Health Canada, [CNF Food Code 3973](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3973), serving-size and refuse table. | Frozen ready-to-bake puff-pastry sheet/shell portions and 0% refuse; not a pie-crust match. |
| `WP04-PIE-CRUST-109-20261011-S06` | USDA ARS, [SR28 Food Group 18 PDF](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg18.pdf), NDB 18402. | Historical common measures for recipe-prepared, unbaked 9-inch crust: 24 g per one-eighth and 194 g for one 9-inch crust; 0% refuse. State matches broadly, size/formulation do not. |
| `WP04-PIE-CRUST-109-20261011-S07` | USDA ARS, [SR28 Food Group 18 PDF](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg18.pdf), NDB 18945. | Frozen deep-dish unbaked enriched-flour crust, 225 g average-weight crust; 0% refuse. Product and target dimensions do not match. |
| `WP04-PIE-CRUST-109-20261011-S08` | USDA ARS, [SR28 Food Group 18 PDF](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg18.pdf), NDB 18948. | Refrigerated regular unbaked crust, 229 g average-weight crust; 0% refuse. Product and target dimensions do not match. |
| `WP04-PIE-CRUST-109-20261011-S09` | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), item A.23. | 21 g label reference amount and closest-fraction rule for an uncut crust; not a whole-shell measurement. |
| `WP04-PIE-CRUST-109-20261011-S10` | USDA, [FoodData Central downloads](https://fdc.nal.usda.gov/download-datasets/) and [data-type documentation](https://fdc.nal.usda.gov/data-documentation/). | Lists April 2026 Foundation/Branded releases and final April 2018 SR Legacy. No current exact 5-inch product/item portion was verified in this review. |

## Validation

The requested filename and proposal-local source-ID prefix were checked and were unused before writing. This proposal does not change shared catalog data, the ledger, recipes, manifest, plan, checklist, roadmap, tests, or other artifacts. The file is UTF-8 without BOM. No tests were run because this is a proposal-only review.
