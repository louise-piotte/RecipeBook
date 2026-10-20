# WP07 Proposal: Whole-Milk Published Portion Evidence Review

**Review date:** 2026-10-12  
**Status:** Integrated as a documentation-only evidence hold on 2026-10-12. Health Canada's archived 2015 interface confirms the source-specific values below, but the corresponding CNF 2026 rows could not be retrieved through the available browser/API routes. No ledger observation or active value was added. See the [hold integration README](../batches/wp07-whole-milk-portion-hold-integration-20261012/README.md).

## Disposition

Health Canada's archived CNF serving-portion page for Food code 113, **milk, fluid, whole, pasteurized, homogenized, 3.25% M.F.**, publishes two portions:

| Published CNF portion | Published mass |
|---:|---:|
| 100 mL | 103.1 g |
| 250 mL | 257.8 g |

These are historical, published portion equivalences for one exact whole-milk food description. The CNF search guide identifies the serving-portion interface as the **2015 CNF publication**, says it will not be updated, and points users to the CNF 2026 dataset. The 2026 dataset is available and includes measure-weight, measure-name, and food-name tables, but this review did not retrieve the matching whole-milk rows from those tables. Therefore, treat the two values above as 2015 observations only; do not describe them as current 2026 values.

The page does not state a measuring or weighing method and does not label either value as a laboratory density. Do not average the portions into a ratio, extrapolate to other volumes, or promote them to `defaultDensity` or a general `unitMapping`. First verify the exact Food_Code and measure rows in the 2026 dataset; preserve both versions separately if their values differ.

The 250 mL CNF portion is not the app's `cup`: `units.v1.json` defines `cup` as 236.5882 mL, while Health Canada's household conversion table uses 250 mL per cup. Recipe lines written as `cup` therefore cannot inherit the CNF 250 mL portion without a verified recipe-source convention. Do not reinterpret any original recipe quantity.

## Candidate ownership and current state

- This is a WP07 measurement-evidence task for the existing identity `ingredient-ref-milk`; no new ingredient identity or form is proposed.
- The active row is `milk / lait`, with whole-milk wording retained as an alias. Its `defaultDensity` is `null` and `unitMappings` is empty. The separate skim-milk identity remains distinct.
- The existing ledger record `ingredient-ref-milk` has two identity sources (CFIA compositional standards and OQLF's *lait entier* entry), no structured measurement observations, and `measurementState: blocked_pending_evidence`. Its unresolved decision says a numeric value needs an exact food/form and a documented basis before restoration.
- The current ledger has no other milk portion observation. Existing cream, buttermilk, milk-powder, and evaporated-milk evidence refers to different products or states and is not transferred here.
- This review records a measurement-research disposition for one exact whole-milk product. It leaves the active catalog, ledger, and recipe data unchanged; the plan and roadmap record the evidence hold.

## Recipe-demand and ownership audit

Scanned all 114 files named by `manifest.v1.json` (1,123 ingredient rows) and selected rows linked to `ingredient-ref-milk`. The bundle contains **33 linked lines in 28 recipes**: 15 `cup`, 5 `tbsp`, 7 `ml`, 5 `g`, and one unqualified `part` quantity. Six original lines explicitly say `whole milk`; the rest mostly say only `milk`. The five gram quantities already have mass units and need no density conversion. The `part` line has no defined ratio.

The table preserves each affected recipe/line owner and original quantity. Source names and links are the provenance stored on those bundled recipe objects; a missing link means the bundle has no source URL recorded, not that the recipe has no publisher.

| Recipe lines | Bundled recipe | Original milk quantity text | Stored source |
|---|---|---|---|
| `001#4` | Air Fryer Baked Oats | `3 tbsp milk` | [Healthful Blondie](https://healthfulblondie.com/air-fryer-baked-oats/) |
| `011#3`, `011#8` | Almond Bonbon Cookies | `60 ml milk`; `3 tbsp milk` | [Taste of Home](https://www.tasteofhome.com/recipes/almond-bonbon-cookies/) |
| `015#7` | Beef Stroganov | `1 cup milk` | No source URL stored |
| `023#8` | Air Fried Calamari | `1/2 cup milk` | No source URL stored |
| `027#7` | Breakfast Casserole | `2 cups milk` | [Preppy Kitchen](https://preppykitchen.com/breakfast-casserole/) |
| `030#1` | Nutella Hot Chocolate | `2 cups milk` | [Celebrating Sweets](https://celebratingsweets.com/nutella-hot-chocolate/) |
| `039#6` | Pancakes | `3/4 cup milk` | [One Dish Kitchen](https://onedishkitchen.com/how-to-make-pancakes-for-one/#recipe) |
| `044#2` | Corn on the Cob | `1 cup milk` | No source URL stored |
| `045#5` | Strawberry Fraisier Cake | `500 g milk` | [Anne-Sophie Fashion Cooking](https://www.fashioncooking.fr/2016/09/fraisier-traditionnel/) |
| `050#13` | Devil's Food Cake | `120 ml whole milk, room temperature` | [Preppy Kitchen](https://preppykitchen.com/devils-food-cake/#recipe) |
| `051#11` | Strawberry Cake | `120 ml whole milk, room temperature` | [Sally's Baking Addiction](https://sallysbakingaddiction.com/strawberry-cake/#tasty-recipes-66510) |
| `052#3` | Mango Cake | `60 ml milk` | [Allrecipes](https://www.allrecipes.com/recipe/242162/delightfully-exotic-mango-cake/) |
| `053#16` | Carrot Cake | `2 tbsp milk` | No source URL stored |
| `054#13` | Cookie Cake | `2 tbsp milk` | [Preppy Kitchen](https://preppykitchen.com/cookie-cake/) |
| `055#21` | Coffee Cake | `2 tbsp whole milk` | [Preppy Kitchen](https://preppykitchen.com/coffee-cake/#recipe) |
| `056#6`, `056#11`, `056#18`, `056#24` | Pistachio Chocolate Mousse Cake | `40 g milk`; `30 g milk` (three lines) | [Where Is Cake](https://whereiscake.com/recipe/pistachio-chocolate-mousse-cake/) |
| `060#3` | Waffles | `1/2 cup milk` | No source URL stored |
| `065#2` | Overnight Oats | `1 part milk` | No source URL stored |
| `069#6` | Double Chocolate Muffins | `1/2 cup milk` | No source URL stored |
| `072#2`, `072#4` | Hamburger Buns | `60 ml whole milk`; `125 ml whole milk` | [Joshua Weissman](https://www.joshuaweissman.com/post/mcdonald-s-big-mac-but-better) |
| `074#4` | Meatloaf | `1 cup milk` | [Allrecipes](https://www.allrecipes.com/recipe/16354/easy-meatloaf/) |
| `075#2` | French Toast | `1/4 cup milk` | No source URL stored |
| `077#8` | Salmon Pot Pie | `250 ml milk, plus more for brushing` | [Ricardo Cuisine](https://www.ricardocuisine.com/recettes/6174-pate-au-saumon-style-pot-en-pot-de-ricardo) |
| `088#3` | Chocolate Pudding | `2 cups whole milk, divided` | [Five Heart Home](https://www.fivehearthome.com/easy-classic-homemade-chocolate-pudding/#recipe) |
| `089#4` | Mushroom and Ham Quiche | `1/4 cup milk` | No source URL stored |
| `100#4` | Candy Cap Gravy | `1 1/2 cups milk` | [Bittersweet Blog](https://bittersweetblog.com/2022/11/07/candy-cap-mushrooms/) |
| `103#4` | Chocolate Syrup | `1 1/2 cups milk` | No source URL stored |
| `104#4` | Asparagus Souffle | `1 cup cold milk` | [Allrecipes](https://www.allrecipes.com/recipe/220991/chef-johns-asparagus-souffle/) |

The recipe corpus establishes repeated demand for volume and mass inputs, but a recipe quantity is not itself a measured mass-volume observation. Most rows are unqualified `milk`; only six state whole milk explicitly, and their exact product fat content is not supplied. The recipe audit therefore supports prioritizing the evidence review, not mapping all 33 lines to Food code 113.

## Future ledger treatment

Before ledger integration, retrieve and join the 2026 Food Name, Measure Name, Measure Type, and Measure Weight Conversion rows for the exact whole-milk food. If the 2026 source confirms a portion, add a `published_portion` observation to the existing `ingredient-ref-milk` record with `foodDescription` and `foodState` naming its exact food description and dataset version. Do not replace a differing 2015 observation; preserve the versions separately. If the exact 2026 row remains unavailable, retain this proposal's 2015 evidence and leave the ledger measurement state unchanged.

If a matching 2026 portion is verified, mark measurement research `researched_supported` for that exact published portion while retaining an explicit unresolved decision for any general milk density, active mapping, or `cup` conversion. Do not add recipe-line links: no source establishes that the 33 inputs used the same 3.25% homogenized product, and the bundle already preserves the original source text and quantity.

## Sources

All pages accessed 2026-10-12. Sources support only the stated values and measurement-convention limits.

| ID | Source | Use and limit |
|---|---|---|
| `WP07-MILK-20261012-S01` | Health Canada, [Canadian Nutrient File serving portion, Food code 113](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=113&lang=eng) | The 2015 serving-portion page names fluid whole pasteurized homogenized 3.25% M.F. milk and publishes 100 mL = 103.1 g and 250 mL = 257.8 g with 0% refuse. The page gives no method, temperature, or claim that these are laboratory density measurements. |
| `WP07-MILK-20261012-S02` | Health Canada, [CNF search guide](https://aliments-nutrition.canada.ca/cnf-fce/help-aide?lang=eng) | States that the old serving-portion interface contains 2015 CNF data, will not be updated, and refers users to the CNF 2026 dataset. |
| `WP07-MILK-20261012-S03` | Health Canada, [Canadian Nutrient File, 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) — [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv), and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv) | Confirms the current CNF dataset and relevant relational tables are published. The exact matching milk rows were not retrieved in this review; this source does not support assigning the 2015 values to 2026. |
| `WP07-MILK-20261012-S04` | Health Canada, [Measure ingredients like a pro](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/cooking-skills/measure-ingredients-pro.html) | Recommends a liquid measuring cup for milk and gives the household conversion 250 mL = 1 cup. This is a Canadian household-measure convention; it does not redefine the app's `cup` or resolve the source convention of any recipe. |

## Audit method and limits

- Used the current manifest-listed recipe files as the recipe source of truth, matching the exact `ingredientRefId` and retaining each row's `originalText`, recipe index, and stored publisher metadata.
- Checked the active milk reference, skim-milk reference, unit definitions, and exact ledger record. No milk numeric observation was already recorded, no active milk density/mapping exists, and other dairy observations were not treated as milk evidence.
- The 2015 CNF portion page establishes historical published equivalences, not the measurement method or a universal density for milk. Exact 2026 CNF rows remain unverified in this review. No value is inferred for skim milk, partly skimmed milk, goat milk, plant beverages, heated milk, or unspecified milk products.
- This source review does not establish a recipe-specific 250 mL cup, a mass conversion for `cup`/`tbsp`, or the ratio behind `1 part milk`.

