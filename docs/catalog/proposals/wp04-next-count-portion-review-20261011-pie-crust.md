# WP04 proposal: prebaked 5-inch pie-crust portion review

**Review date:** 2026-10-11
**Status:** Proposal-only; no portion observation is proposed.
**Scope:** French Silk Pie `107#1`, one prebaked 5-inch pie crust, cooled.

## Disposition

Keep bundled recipe `107#1` at **1 count** and its count-to-mass portion unavailable. The exact line specifies one prebaked, cooled 5-inch shell, but the current linked publisher recipe is for a deep 9-inch pie and gives no shell mass. The linked crust formula makes two 9-inch shells and likewise gives no total dough mass or individual-shell weight. These pages support the general preparation context, not a measured portion for this exact 5-inch shell.

The current USDA SR28 report supplies source-specific weights for other baked-crust products, but neither record identifies a 5-inch crust or the product/formulation used here. The CNF 2015 page that mentions “pie” is for a filled commercial two-crust apple pie. The CNF 2026 download files and the current FDC detail/API could not be inspected in this review, so their exact-match status is unverified. Do not interpret that access limitation as evidence that no matching row exists.

Recommend **blocked pending a source-matched 5-inch prebaked-shell portion**. Preserve the stored quantity, size, state, cooled condition, text, and pie-crust reference. Do not adopt the 198 g or 154 g USDA values for this line, treat them as bounds, scale a 9-inch crust, infer a raw-to-baked yield, or create a generic count conversion, density, package yield, edible-portion factor, substitution, or recipe edit.

## Exact bundled demand and prior-review boundary

| Field | Bundled evidence |
|---|---|
| Manifest entry | `recipes/107-tarte-soyeuse-au-chocolat-french-silk-pie-ae0f1410-da1e-478b-98a0-67fa6b420576.v1.json` is listed in `manifest.v1.json`. |
| Recipe / line | `107` — French Silk Pie; `107#1`; recipe UUID `ae0f1410-da1e-478b-98a0-67fa6b420576`; ingredient-line UUID `ae0f1410-da1e-478b-98a0-67fa6b420576-ingredient-1`. |
| Exact text and amount | `1 prebaked 5-inch pie crust, cooled`; quantity `1`, unit `count`. The English note says `5-inch sweet pie shell, prebaked and cooled`; the French note says `abaisse à tarte sucrée de 5 po, précuite et refroidie`. Recipe yield is one 5-inch pie, and its note says to multiply the recipe by two for a 9-inch pie. |
| Reference and local provenance | `ingredient-ref-pie-crust`; the recipe file names Preppy Kitchen and links `https://preppykitchen.com/french-silk-pie/`. Import metadata says manual cleanup but contains no page snapshot or source revision identifier. |
| Current ledger state | The reference is `blocked_pending_evidence`. Its existing unresolved decision and source citations are expressly scoped to Blueberry Pie `106#1`, not this line. There is no portion observation for `107#1`. |

The previous Blueberry Pie review explicitly left `107#1` as a separate open demand while covering only `106#1` (raw 5-inch crust plus extra dough for the top). A search across the prior WP04/WP12 proposals and batches for `107#1` and this line UUID found no prior focused portion review. The other pie-crust lines remain distinct demands; their raw, prebaked, multi-shell, or extra-top-dough wording cannot be transferred to this cooled prebaked shell.

## Source match and measurement limits

The current [Preppy Kitchen French Silk Pie page](https://preppykitchen.com/french-silk-pie/) identifies one homemade or store-bought pie crust. Its instructions transfer dough to a **deep 9-inch** pan, blind-bake the crust, then cool it completely before filling. This is consistent with the broad baked/cooled state in the bundled line, but it does not specify a 5-inch crust or publish a shell mass. The page was published Oct. 14, 2021; its current content was checked on 2026-10-11. Since the bundled recipe records a one 5-inch pie and a two-times note for 9 inches, the currently accessible page does not establish whether the bundle is a documented scaled adaptation or which crust product/version it used.

The linked [Preppy Kitchen Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/) (updated Sep. 15, 2026) says it makes two 9-inch crusts. It reports ingredient quantities but not the total dough mass, mass of one crust, or mass after prebaking and cooling. A current recipe yield of two 9-inch crusts is not a measured 5-inch prebaked portion.

Health Canada’s current [CNF 2026 dataset landing page](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists relational Food Name, Measure Name, and Measure Weight Conversion CSV files. The landing page returned 403 and the direct CSV URLs were inaccessible through this review environment. Thus no matching CNF 2026 food/measure/weight row was verified, and absence cannot be concluded. The accessible [CNF 2015 entry, Food Code 3941](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3941), is “Pie, apple, commercial, 2 crust”: it reports 99 g for one-sixth of a 20 cm pie and 125 g for one-eighth of a 23 cm pie, with 0% refuse. Those are filled pie portions of different sizes, not empty 5-inch shells, and provide no portion for `107#1`.

USDA SR28 Food Group 18 reports two baked-crust common measures in its edible-portion table: NDB 18946, “Pie crust, refrigerated, regular, baked,” 198 g for one pie crust; and NDB 18335, “Pie crust, standard-type, frozen, ready-to-bake, enriched, baked,” 154 g for one average baked crust. Both entries list 0% refuse. Neither states a 5-inch diameter or identifies the product in recipe 107. They are separate historical product-specific records, not a range for this recipe. USDA’s [FoodData Central download page](https://fdc.nal.usda.gov/download-datasets/) identifies SR Legacy as last released in April 2018 and says it will not be updated; its current Foundation and Branded downloads are listed as April 2026. The FDC detail/API path did not return a readable record during this review, and no current product-specific portion for the unbranded bundled line was verified.

| Dimension | Supported for `107#1` | Unresolved; do not infer |
|---|---|---|
| Count and size | One shell; 5-inch. | Shell geometry, thickness, edge/trim amount, or whether 5 inches refers to pan or finished shell diameter. |
| State | Prebaked and cooled. | Exact bake endpoint, moisture loss, shell composition, or a raw-to-baked yield. |
| Product | Sweet pie shell in the localized notes. | Homemade versus purchased, brand/SKU, formula, package, and whether the current 9-inch publisher formula is the source version for this scaled recipe. |
| Portion and basis | No mass is stated for the empty shell. | A shell mass, edible/as-purchased basis, trim/refuse convention, or any count-weight interval. |
| Other measures | The recipe stores `count`. | Density, volume mapping, generic count weight, package yield, substitution, or mass of filling-inclusive pie. |

## Proposed disposition for later integration

If this review is accepted into the ledger, add only a source-scoped unresolved decision for `ingredient-ref-pie-crust` that names recipe `107#1` and states that available publisher and government evidence does not match its exact size/product portion. Do not add a `count_weight`, `published_portion`, edible-portion, or yield observation. Keep `defaultDensity: null`, `unitMappings: []`, and recipe content unchanged.

A future portion observation should require a direct weight for one empty **prebaked and cooled 5-inch** shell from the recipe's version or identified product, with its formulation/product, measurement precision, and weighing/trim basis retained. A generic full-size crust, filled pie wedge, ingredient-input total, geometric scaling, or assumed brand is not an acceptable substitute.

## Source register

Sources accessed on 2026-10-11 unless otherwise stated. Source IDs are proposal-local; no source record is added here.

| Source ID | Source and locator | Claim and limit |
|---|---|---|
| `WP04-PIE-CRUST-107-20261011-S01` | Preppy Kitchen, [French Silk Pie](https://preppykitchen.com/french-silk-pie/), John Kanell, published 2021-10-14; ingredient card and crust instructions. | Current page specifies one homemade or store-bought crust, a deep 9-inch pan, blind baking, and cooling. No 5-inch size or shell mass. |
| `WP04-PIE-CRUST-107-20261011-S02` | Preppy Kitchen, [Pie Crust Recipe](https://preppykitchen.com/classic-pastry-crust/), John Kanell, updated 2026-09-15; yield and recipe card. | Makes two 9-inch crusts and publishes no total dough or per-crust mass, including after baking. |
| `WP04-PIE-CRUST-107-20261011-S03` | Health Canada, [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-7ed7-4043-bc28-ff00e10f3109); relational resource listing. | Confirms the 2026 Food Name, Measure Name, and Measure Weight Conversion files are published. The landing page returned 403 and direct CSV access was unavailable here; no exact row was verified, and no absence claim is made. |
| `WP04-PIE-CRUST-107-20261011-S04` | Health Canada, [Pie, apple, commercial, 2 crust, CNF 2015, Food Code 3941](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3941); serving-size and refuse table. | Provides portions for filled 20 cm and 23 cm apple pies, not an empty 5-inch shell. Not applied to the recipe line. |
| `WP04-PIE-CRUST-107-20261011-S05` | USDA ARS, [Standard Reference Release 28, Food Group 18](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg18.pdf), NDB 18946 (p. 1804) and NDB 18335 (p. 1819). | Source-specific common measures are 198 g for one refrigerated regular baked crust and 154 g for one average frozen enriched baked crust; both list 0% refuse. Product and diameter do not match or identify `107#1`. |
| `WP04-PIE-CRUST-107-20261011-S06` | USDA ARS, [FoodData Central downloads](https://fdc.nal.usda.gov/download-datasets/); latest download table and SR Legacy note. | Lists current 2026 Foundation/Branded downloads and SR Legacy’s final April 2018 release. The live FDC detail/API was not readable in this review; no exact current product portion is asserted. |
| Local evidence | Manifest, bundled recipe `107`, and `ingredient-ref-pie-crust` research-ledger record; checked 2026-10-11. | Confirms the exact line, source URL, recipe yield note, blocked reference state, and that the existing decision covers `106#1` only. |

## Validation

This is proposal-only. No catalog, ledger, recipe, manifest, test, plan, checklist, batch, or roadmap file was changed. The new proposal is UTF-8 without BOM; whitespace and encoding checks apply to this file only. No tests were run.
