# WP07 R1078 — Generic whole-milk measurement review — 2026-10-19

**Disposition:** Reviewed and integrated on 2026-10-19. Added six source-qualified USDA SR28 portions to the exact generic 3.25% whole-milk records below and set their measurement research state to **researched_supported**. Active density, unit mappings, conversions, recipe lines, and forms remain unchanged. Keep the CNF 2026 row join open; this review did not retrieve its exact food and measure rows.

## Candidate selection and demand

The active WP07 plan prioritizes baking and frequently converted pantry ingredients. Generic milk was selected as a high-demand measurement gap, separate from the integrated R1074 almond review. The current manifest lists 33 ingredient lines linked to **ingredient-ref-milk** across 28 recipes: 15 cup, 5 tablespoon, 7 millilitre, 5 gram, and one unqualified “part” amount. Six original lines explicitly say “whole milk”; the other 27 do not establish a matching fat class. These counts establish demand only. Recipe amounts are not used as measured portions.

Before integration, the ledger had no measurement observations for this ingredient. The row, units, nearby identities, and prior whole-milk hold were audited below. The integrated observations use separate generic USDA food records; they do not apply to every milk line.

## Existing row and ledger ownership

- The active row is **ingredient-ref-milk**, displayed as milk / lait, category **DAIRY_AND_ALTERNATIVE**, with whole milk / lait entier retained as aliases. Its **defaultDensity** is null and **unitMappings** is empty.
- Its verified ledger record has **measurementState: blocked_pending_evidence**, four sources, and no measurement observations: WP04-S20 (CFIA compositional standards), WP04-S44 (OQLF lait entier), WP08-SUGAR-LIQUID-20261016-S06 (Colorado State University Extension substitution table), and WP08-MILK-EVAP-20261016-S01 (Utah State University Extension substitution table). The latter two report the general-table alternative of 1/2 cup evaporated milk plus 1/2 cup water for 1 cup whole milk; this remains a blocked, non-recipe-specific substitution finding and establishes no mass-volume portion.
- The existing whole-milk powder form remains under the same reference and has no density. Keep the fluid observations below off that powdered form.
- Skim milk is a separate identity. Buttermilk, evaporated milk, goat milk, plant beverages, other animal milks, and milk powders also remain separate. Their evidence does not transfer to fluid whole cow’s milk.
- The previous [whole-milk portion hold](wp07-whole-milk-portion-evidence-review-20261012.md) retained Health Canada’s archived CNF 2015 Food Code 113 values as historical context only (100 mL = 103.1 g; 250 mL = 257.8 g). It did not add an observation because the matching CNF 2026 rows were not retrieved. That access limit remains unresolved; this proposal does not label the old interface as the 2026 dataset.

## Generic source evidence and proposed observations

USDA ARS Standard Reference Release 28 (2015), Food Group 01, publishes common-measure weights for two unbranded records of whole milk at 3.25% milkfat. Their food descriptions differ by vitamin fortification; both report the same three portions. Preserve the source descriptions and source-native units as separate observations. The volume measures support their use as whole milk, but the item names do not specify pasteurization or homogenization and the report does not identify a direct measuring procedure.

| Proposed observation | Proposed source ID | Exact source locator | Published source portion | Food and measure limits |
|---|---|---|---|---|
| wp07-milk-sr28-01077-cup-244g-r1078-20261019 | WP07-MILK-R1078-20261019-S01 | USDA ARS, [SR28 Food Group 01 PDF](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR/SR28/reports/sr28fg01.pdf), NDB 01077, “Milk, whole, 3.25% milkfat, with added vitamin D,” Common Measures block. | 1 cup = 244 g | Generic food-composition record; the report does not specify the cup’s volume convention or a fill procedure. |
| wp07-milk-sr28-01077-fl-oz-305g-r1078-20261019 | WP07-MILK-R1078-20261019-S01 | Same report, NDB 01077, Common Measures block. | 1 fl oz = 30.5 g | Preserve the source’s fl oz label; do not infer a millilitre value or attach the app’s US-fluid-ounce convention. |
| wp07-milk-sr28-01077-tbsp-15g-r1078-20261019 | WP07-MILK-R1078-20261019-S01 | Same report, NDB 01077, Common Measures block. | 1 tbsp = 15 g | The report does not state the tablespoon volume or a measuring method. |
| wp07-milk-sr28-01211-cup-244g-r1078-20261019 | WP07-MILK-R1078-20261019-S02 | USDA ARS, [SR28 Food Group 01 PDF](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR/SR28/reports/sr28fg01.pdf), NDB 01211, “Milk, whole, 3.25% milkfat, without added vitamin A and vitamin D,” Common Measures block. | 1 cup = 244 g | Separate SR28 food record; cup convention and fill procedure are unstated. |
| wp07-milk-sr28-01211-tbsp-15g-r1078-20261019 | WP07-MILK-R1078-20261019-S02 | Same report, NDB 01211, Common Measures block. | 1 tbsp = 15 g | Keep the source tablespoon and mass as published. |
| wp07-milk-sr28-01211-fl-oz-305g-r1078-20261019 | WP07-MILK-R1078-20261019-S02 | Same report, NDB 01211, Common Measures block. | 1 fl oz = 30.5 g | Keep the source fl oz and mass as published. |

These generic records support published portions for fluid whole milk at the exact source-described 3.25% fat class. They are not branded product evidence. The equal weights across the two records are retained, not averaged or promoted into a density. No observation is proposed for unqualified milk, 2% milk, skim milk, other species, a plant beverage, or a powder.

## Version and transferability limits

The Health Canada [serving-portion page for Food Code 113](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=113&lang=eng) still displays fluid whole, pasteurized, homogenized, 3.25% M.F. milk and the historical 2015 portions 100 mL = 103.1 g and 250 mL = 257.8 g. The page identifies itself as the 2015 interface and was last modified 2019-03-01. Keep it as the already-documented historical finding; do not relabel it as a CNF 2026 result or duplicate it in this proposal’s observation set.

The [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) lists the [Food Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e1ffee62-58cb-4e3e-b359-115c658388ad/download/food_name.csv), [Measure Name CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/104adbc9-f4cc-40b1-9aaa-08290648e24b/download/measure_name.csv), [Measure Type CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/e7eac9fc-b46c-4c18-8729-b962d2412fec/download/measure_type.csv), and [Measure Weight Conversion CSV](https://open.canada.ca/data/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109/resource/bb76d816-3ac0-4749-8c4b-f0dbfd0fac76/download/measure_weight_conversion.csv). Its indexed record shows publication on 2026-05-14 and modification on 2026-10-04. The listing and direct CSV endpoints did not expose the matching rows during this review. This does not show that a 2026 row is absent; retain that join as an open check.

None of the six USDA portions defines RecipeBook’s volume units. The current app unit table defines cup as 236.5882 mL, tablespoon as 14.78676 mL, and US fluid ounce as 29.57353 mL. SR28 does not state matching volumes for its “cup,” “tbsp,” or “fl oz” measures. Do not scale, derive, or map these observations to app units. The two CNF 2015 metric portions also remain their own historical source measures, not a value for the app’s cup.

## Recommendation

Integrated six **portion_weight** observations above to the existing **ingredient-ref-milk** ledger record, using exact food descriptions, source quantities, food states, and source IDs scoped to the two SR28 NDB records. Measurement research is **researched_supported** for these exact published portions, consistent with ledger use of that state for supported evidence that does not authorize an active conversion.

Keep **defaultDensity** null, **unitMappings** empty, all form densities null, and the fluid/powder distinction intact. Do not change ingredient aliases, forms, identities, recipe amounts, or substitution findings. Do not link the six explicit whole-milk recipe lines to these portions: those recipe lines do not establish the same fat content and measuring convention. Leave the other milk-linked recipe lines unassigned.

## Source ownership and preservation audit

- Before integration, the **ingredient-ref-milk** ledger row had no measurement observation or USDA Food Group 01 source. R1078 added the two exact milk-scoped USDA source entries and six observations; its four existing identity/substitution sources and findings remain untouched.
- SR28 Food Group 01 is already cited on egg and egg-part ledger records, but their locators are for egg NDB records. R1078 does not reuse the egg-scoped source ID **WP07-EGG-20261010-S05**; it adds separate milk-scoped source entries for NDB 01077 and NDB 01211.
- The previous whole-milk hold’s CNF 2015 values and the unresolved CNF 2026 retrieval remain preserved in their existing proposal and integration note. Existing branded dairy identities and all product-specific claims and measures remain unchanged.
- The R1078 observation and source IDs were checked against the ledger; no collisions were found.
- No brand, product-line, flavour, SKU, or retailer-variant work was pursued. The reviewed USDA food records are generic food descriptions.

## Search log and no-test disposition

On 2026-10-19, the USDA SR28 Food Group 01 PDF was opened and the two NDB records and their Common Measures blocks were checked directly. Health Canada’s CNF 2015 serving page and the CNF 2026 dataset listing were checked to preserve the earlier version boundary. The current dataset’s exact milk measure rows were not retrieved, and no absence claim is made.

The shared JSON now contains the six source-qualified observations. No recipe, schema, or runtime conversion behavior changed. No software tests, build, emulator, or deployment were run because this application change only adds database JSON under `AGENTS.md`.
