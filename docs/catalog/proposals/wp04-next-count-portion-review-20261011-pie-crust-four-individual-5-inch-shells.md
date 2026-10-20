# WP04 proposal: four individual 5-inch pie-crust portion review

**Review date:** 2026-10-11

**Status:** Proposal-only; no portion observation is proposed.

**Scope:** Mushroom and Ham Quiche `089#8`, four individual 5-inch pie crusts.

## Recommendation

Keep recipe `089#8` at **4 count** and keep count-to-mass measurement **blocked pending evidence**. The line gives four individual 5-inch crusts but does not say whether they are raw, prebaked, or baked empty; whether they are homemade or purchased; which formulation or product is used; or how much one shell or all four weigh. It has no direct recipe source URL in the bundled recipe.

The linked component recipe `041` is a local four-shell adaptation that points to Preppy Kitchen's current crust page. That current page now specifies two 9-inch crusts, not four 5-inch shells, and gives no total dough or per-crust mass. The current page therefore cannot verify the component adaptation or the quiche line's exact portion. No numeric mass or defensible mass range is supported.

Do not apply other USDA crust weights, treat them as bounds, infer a raw/baked state from the quiche method, sum or divide ingredient inputs, scale by pan size, infer trimming or baking loss, or add a count mapping, density, package yield, edible-portion factor, substitution, or recipe edit. Preserve the stated four-count and 5-inch size as written.

## Exact line and review boundary

| Field | Bundled evidence |
|---|---|
| Manifest entry | `recipes/089-quiche-au-jambon-et-champignons-mushroom-and-ham-quiche-1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee.v1.json` is listed in `manifest.v1.json`. |
| Recipe / line | `089` — Mushroom and Ham Quiche; `089#8`; recipe UUID `1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee`; line UUID `1dbb8fd6-8c57-4a12-ab50-93ebd0c15fee-ingredient-8`. |
| Exact text and amount | `4 individual 5-inch pie crusts`; quantity `4`, unit `count`; English note `5-inch`, French note `5 po`. The recipe yields four 5-inch pies. |
| Direct provenance | `sourceName` and `sourceUrl` are empty. The source export is not preserved in the bundled recipe. |
| Component link | `recipeLinks` points to local recipe `041` (`1d0e8bf3-4792-46f3-8766-5f2ab51af7ca`, Pie Crust), whose stored source URL is Preppy Kitchen's Pie Crust Recipe. |
| Current ledger | `ingredient-ref-pie-crust` remains `blocked_pending_evidence`. Its existing decision and sources concern Blueberry Pie `106#1`; it has no measurement observation for `089#8`. |

The manifest-ordered scan covered all 114 recipes and 1,123 ingredient rows. Within recipe 089, the preceding one-leek line `089#2` has a source-specific CNF observation; `089#3` is a half-box mushroom package boundary with no package size and was held; and the four-egg line `089#6` is within the egg-count review. The next exact count-like pie-crust demand, `089#8`, is left open in the [Blueberry Pie crust review](wp04-blueberry-pie-crust-count-portion-review-20261010.md), which covers only `106#1`. The prior [French Silk Pie crust review](wp04-next-count-portion-review-20261011-pie-crust.md) covers only `107#1`. Later manifest entries `108#1` and `109#1` are separate crust demands and are not covered here. Recipe `077#11` has no structured quantity or unit and is not a structured count-to-mass candidate.

## Source match and portion limits

The current [Preppy Kitchen Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/) page, updated September 15, 2026, says the recipe makes two 9-inch crusts. Its card lists 360 g flour, 227 g butter, and 60–90 ml ice water, with additional water as needed. It publishes no total dough mass or per-shell mass. The current source's two 9-inch yield and ingredient specification differ from the locally cleaned component recipe 041, which says four 5-inch shells and lists 300 g flour, optional sugar, 227 g butter, and 60 ml water plus more as needed. Recipe 041 has manual-cleanup import metadata but no saved source snapshot or page revision. Its local yield is not an independently verified publisher portion, and neither version provides an exact measured portion for `089#8`.

The quiche instructions distribute filling among four 5-inch crusts and bake the assembled quiches for 55 minutes. They do not state whether the crusts are raw or prebaked. Recipe 041 permits either use depending on the downstream recipe, so the component link does not resolve the crust state. Neither the exact line nor its linked component identifies a brand, package, dough formulation, trim basis, shell mass, or whether a weight would be edible portion or as-purchased.

Health Canada's current [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists Food Name, Measure Name, and Measure Weight Conversion data files. The portal's metadata is accessible, but the 2026 CSV contents could not be inspected through this review environment. No matching 5-inch shell row was verified; this access limit is not evidence that no such row exists. The accessible [CNF 2015 Food Code 3941](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3941) is for a filled commercial two-crust apple pie: it lists 99 g for one-sixth of a 20 cm pie and 125 g for one-eighth of a 23 cm pie, with 0% refuse. These are filled pie portions, not empty shells.

Health Canada's [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), item A.23, sets a 21 g reference amount for pie crust, phyllo, and puff-pastry sheets. For an uncut or unmarked product, it describes a household measure as the fraction of the whole product closest to that reference amount, with the weight of that fraction reported. This is a nutrition-labelling reference amount, not a 21 g full-shell portion or a weight for one 5-inch shell.

USDA SR28 Food Group 18 reports the following source-specific crust measures in its edible-portion tables. Each listed record reports 0% refuse, but none identifies a 5-inch shell or the recipe's product/formulation. These values are separate records, **not a range** for `089#8`:

| USDA record | Published measure | Match limit |
|---|---|---|
| NDB 18946, “Pie crust, refrigerated, regular, baked” (p. 1804) | 198 g for 1 pie crust | Baked refrigerated product; diameter and match to this recipe are not stated. |
| NDB 18948, “Pie crust, refrigerated, regular, unbaked” (p. 1807) | 229 g for 1 average-weight pie crust | Unbaked refrigerated product; diameter and match to this recipe are not stated. |
| NDB 18335, “Pie crust, standard-type, frozen, ready-to-bake, enriched, baked” (p. 1819) | 154 g for 1 average-weight baked crust | Baked frozen enriched product; diameter and match to this recipe are not stated. |

The official USDA [FoodData Central download page](https://fdc.nal.usda.gov/download-datasets/) currently lists Foundation and Branded releases dated April 2026; it identifies SR Legacy's April 2018 data as its final release. The live FDC detail/API record and current download contents were not readable in this review environment. The bundled quiche does not identify a brand or exact product, and no current USDA record for its four 5-inch crusts was verified. Do not infer that current Foundation or Branded data contain no relevant product.

| Dimension | Supported for `089#8` | Unresolved; do not infer |
|---|---|---|
| Count and size | Four individual crusts; 5-inch. | Whether 5 inches means pan or finished shell diameter; thickness and trim. |
| State | The quiche is baked with filling for 55 minutes. | Whether each crust enters raw, prebaked, or baked empty; stage for any hypothetical weighing. |
| Product | Pie crust. | Homemade versus purchased, brand/SKU, package, formula, and version of recipe 041's source. |
| Portion basis | No weight is stated for one shell or the four shells. | Edible versus as-purchased basis, refuse/trim convention, and any count-weight interval. |
| Conversion | The recipe stores four `count`. | Mass, density, unit mapping, package yield, bake yield, substitution, or aggregate mass. |

## Proposed disposition for later integration

If accepted into the ledger, add only an unresolved decision on `ingredient-ref-pie-crust` that names `089#8` and records the source/version mismatch and lack of a matching portion. Do not add a measurement observation. Keep the reference's runtime count-to-mass state blocked, its density null, and unit mappings empty. Keep recipe 089, recipe 041, and the manifest unchanged.

A future observation would require either the exact quiche source or an identified 5-inch product/component source that directly reports the mass for four shells or one shell. Retain whether the shells are raw, prebaked, or baked empty; product/formulation; size; measured or source-reported range and precision; and the edible/as-purchased and trim basis. Do not estimate the amount from a different shell size/product or from its recipe-input ingredients.

## Source register

Sources accessed on 2026-10-11 unless otherwise stated. Source IDs are proposal-local; no source or decision is added to the ledger here.

| Source ID | Source and locator | Claim and limit |
|---|---|---|
| `WP04-PIE-CRUST-089-20261011-S01` | Preppy Kitchen, [Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/), John Kanell, updated 2026-09-15; yield, recipe card, and instructions. | Current page makes two 9-inch crusts; ingredient list includes variable water; no dough or shell mass. It does not verify the local four-shell adaptation or 089's exact source/version. |
| `WP04-PIE-CRUST-089-20261011-S02` | Health Canada, [Canadian Nutrient File 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109); dataset resource listing. | Lists food-name and measure-weight files. CSV contents were inaccessible here; no exact-match or absence claim is made. |
| `WP04-PIE-CRUST-089-20261011-S03` | Health Canada, [Pie, apple, commercial, 2 crust, CNF 2015 Food Code 3941](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3941); serving-size and refuse table. | Reports portions for filled 20 cm and 23 cm apple pies, not empty shells. |
| `WP04-PIE-CRUST-089-20261011-S04` | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), item A.23. | The 21 g reference amount is for nutrition labelling; the household-measure rule is a fraction of the product. It is not a 5-inch whole-shell portion. |
| `WP04-PIE-CRUST-089-20261011-S05` | USDA ARS, [Standard Reference Release 28, Food Group 18](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg18.pdf), NDB 18946 (p. 1804), 18948 (p. 1807), and 18335 (p. 1819). | Reports source-specific 198 g baked refrigerated, 229 g unbaked refrigerated, and 154 g baked frozen enriched crust measures, each with 0% refuse in the edible-portion table. None is size- or product-matched to the recipe line. |
| `WP04-PIE-CRUST-089-20261011-S06` | USDA, [FoodData Central downloadable data](https://fdc.nal.usda.gov/download-datasets/); release-date table and SR Legacy note. | Lists current April 2026 Foundation/Branded releases and SR Legacy's final April 2018 release. No matching live FDC item was verified. |
| Local evidence | Manifest, recipes `089` and `041`, and `ingredient-ref-pie-crust` ledger record; checked 2026-10-11. | Confirms exact count/size, empty 089 source fields, component link, current blocked state, and that prior portion decisions are scoped to other lines. |

## Validation

This is proposal-only. No shared catalog, ledger, recipe, manifest, test, plan, checklist, batch, or roadmap file was changed. The unique proposal path was checked before creation; the saved file was checked as UTF-8 without BOM and for trailing whitespace. No tests were run.
