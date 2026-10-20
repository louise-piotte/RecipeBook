# WP07 Baking-Powder Portion Evidence Review (2026-10-12)

## Status and scope

**Status: Integrated on 2026-10-12.** See [integration README](../batches/wp07-baking-powder-portion-integration-20261012/README.md).

This reviews the published teaspoon-to-mass evidence for the existing `ingredient-ref-baking-powder` identity and its bundled recipe demand. Integration added one source entry and one source-specific ledger observation; it made no active catalog, recipe, form, plan, or roadmap measurement conversion.

## Finding

The live catalog reference is `baking powder / poudre à pâte`, category `BAKING_AND_SPICE`, with `defaultDensity: null` and no unit mappings. Before integration, the corresponding ledger record was `identityState: verified`, `measurementState: blocked_pending_evidence`, had four identity/substitution sources, and had **zero `measurementObservations`**. Its pre-existing source set covered the product boundary and substitution research, not mass per spoon.

A direct [King Arthur Baking Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) publishes the row “Baking powder”: **1 teaspoon = 1/8 ounce = 4 g**. This is a useful source-specific `portion_weight` observation for the WP07 record. It is not enough to activate a general recipe conversion or density: the chart does not identify a brand or formulation, define its teaspoon volume convention, or state a filling/leveling method. King Arthur also cautions that gram amounts on recipe pages can differ from its chart because of rounding and similar factors, and advises following the specific recipe weight.

## Recipe and ownership audit

The split bundled recipe package contains 22 lines linked to this candidate: **21 teaspoon amounts** and **one direct mass amount (5 g)**. Teaspoon quantities range from 1/4 tsp to 4 tsp. Nineteen lines have a named publisher and source URL in recipe metadata; three recipe records have no source attribution recorded. The table reflects the seed's stored source ownership and quantities; those recipe amounts are not new measurements.

| Recipe | English title | Stored baking-powder amount | Source owner recorded in recipe |
| --- | --- | --- | --- |
| 001 | Air Fryer Baked Oats | `1/2 tsp baking powder` | [Healthful Blondie](https://healthfulblondie.com/air-fryer-baked-oats/) |
| 008 | Vanilla Cake | `2 tsp baking powder` | [Sally's Baking Addiction](https://sallysbakingaddiction.com/vanilla-cake/) |
| 013 | Pinwheel Cookies | `1.5 tsp baking powder` | [Preppy Kitchen](https://preppykitchen.com/pinwheel-cookies/) |
| 021 | Yule Log | `1 tsp baking powder` | [Sally's Baking Addiction](https://sallysbakingaddiction.com/buche-de-noel-yule-log/) |
| 024 | Date Squares | `1/4 tsp baking powder` | [Ricardo Cuisine](https://www.ricardocuisine.com/recettes/5263-carre-aux-dattes-le-meilleur) |
| 038 | Buttermilk Pancakes | `1/2 tsp baking powder` | [NYT Cooking](https://cooking.nytimes.com/recipes/1018180-perfect-buttermilk-pancakes) |
| 039 | Pancakes | `1 tsp baking powder` | [One Dish Kitchen](https://onedishkitchen.com/how-to-make-pancakes-for-one/#recipe) |
| 049 | Strawberry Shortcake | `4 tsp baking powder` | [Sally's Baking Addiction](https://sallysbakingaddiction.com/easy-homemade-strawberry-shortcake/#tasty-recipes-68038) |
| 050 | Devil's Food Cake | `1/2 tsp baking powder` | [Preppy Kitchen](https://preppykitchen.com/devils-food-cake/#recipe) |
| 051 | Strawberry Cake | `2 tsp baking powder` | [Sally's Baking Addiction](https://sallysbakingaddiction.com/strawberry-cake/#tasty-recipes-66510) |
| 052 | Mango Cake | `1 tsp baking powder` | [Allrecipes](https://www.allrecipes.com/recipe/242162/delightfully-exotic-mango-cake/) |
| 053 | Carrot Cake | `2 tsp baking powder` | not recorded in bundled source metadata |
| 055 | Coffee Cake | `2 tsp baking powder` | [Preppy Kitchen](https://preppykitchen.com/coffee-cake/#recipe) |
| 056 | Pistachio Chocolate Mousse Cake | `5 g baking powder` | [Where Is Cake](https://whereiscake.com/recipe/pistachio-chocolate-mousse-cake/) |
| 057 | Chocolate Truffle Cake | `2 tsp baking powder` | [Food & Wine](https://www.foodandwine.com/recipes/chocolate-truffle-layer-cake) |
| 058 | Queen Elizabeth Cake | `1 tsp baking powder` | [Allrecipes](https://www.allrecipes.com/recipe/7666/queen-elizabeth-cake-i/) |
| 059 | Buttermilk Waffles | `2 tsp baking powder` | [Allrecipes](https://www.allrecipes.com/recipe/233920/tender-and-easy-buttermilk-waffles/) |
| 060 | Waffles | `2 tsp baking powder` | not recorded in bundled source metadata |
| 069 | Double Chocolate Muffins | `1 tsp baking powder` | not recorded in bundled source metadata |
| 073 | Chocolate Banana Bread | `1 tsp baking powder` | [Preppy Kitchen](https://preppykitchen.com/chocolate-chip-banana-bread/) |
| 094 | Brownie Cookie Sandwiches | `1 tsp baking powder` | [Browned Butter Blondie](https://brownedbutterblondie.com/brownie-cookie-sandwiches-with-cookie-dough-buttercream/) |
| 114 | German Chocolate Cake | `1 tsp baking powder` | [Sally's Baking Addiction](https://sallysbakingaddiction.com/german-chocolate-cake/) |

The 5 g entry belongs to the “Pistachio Chocolate Mousse Cake” record from Where Is Cake. Its imported recipe line has a source URL but no paired teaspoon amount. The publisher URL did not load in this review, so the 5 g value is treated only as the existing bundled line, not as independently verified evidence. It cannot establish that the King Arthur chart's 1 tsp equals 5 g or contradict its separate 4 g chart entry.

A directly accessible publisher example is [RICARDO’s Date Squares recipe](https://www.ricardocuisine.com/recettes/5263-carre-aux-dattes-le-meilleur): its ingredient list gives baking powder as **1 ml (1/4 tsp)**. This verifies that this recipe source pairs a small spoon portion with millilitres, but publishes no mass. Keep that source-specific recipe quantity as-is; do not derive grams from the metric volume.

## Candidate and duplicate audit

- Candidate owner: `ingredient-ref-baking-powder`; active reference remains the existing `poudre à pâte` identity, separate from baking soda.
- Pre-integration ledger: zero baking-powder measurement observations. No existing observation ID or baking-powder weight value was duplicated.
- Existing chart source ID: `WP07-KAB-IWC` already identifies the same King Arthur chart in other ingredient records. Reuse that source ID if the observation is integrated; do not mint a second source entry for the same chart.
- Existing candidate sources are `WP02-E-SODA-POWDER-20261010-S02` (OQLF identity terminology), `WP02-E-SODA-POWDER-20261010-S05` (CFIA product standard), and two baking-powder substitution sources. None includes a mass-per-volume observation.
- The common baking measurement packet excludes baking powder from its stated scope. No prior baking-powder portion proposal or observation was found in the plan/ledger search.

## Source-specific proposal

One non-active observation was added to `ingredient-ref-baking-powder`:

| Field | Proposed value |
| --- | --- |
| Observation ID | `wp07-baking-powder-kab-iwc-20261012-tsp` |
| Relationship | `portion_weight` |
| Source food description | “Baking powder” as listed in King Arthur Baking’s Ingredient Weight Chart |
| Source quantity | 1 teaspoon |
| Published mass | 4 g (chart also reports 1/8 ounce) |
| Evidence kind | `published_portion` |
| Source ID | Existing `WP07-KAB-IWC` |
| Measurement method / basis | Chart-published equivalence; product/formulation, teaspoon convention, cup/spoon capacity, and fill method are not stated. Preserve only as this chart’s portion observation. |

The Canadian Food Inspection Agency standard defines baking powder as a combination of sodium or potassium bicarbonate, acid-reacting material, and starch or another neutral material, subject to a carbon-dioxide-yield standard. That authoritative product definition supports keeping baking powder distinct from sodium bicarbonate; it supplies no teaspoon weight and no single product formula. Do not turn that standard into a density assumption.

## Limits and disposition

- Retain the 4 g per teaspoon value only as a King Arthur source-published portion observation. Do not activate `defaultDensity`, a unit mapping, or a recipe-wide conversion.
- Do not generalize from the chart’s unqualified “Baking powder” row to every Canadian product or formulation. The CFIA standard allows multiple ingredient choices within the product class.
- Do not infer a value from the 5 g recipe line, scale it against a different publisher’s teaspoon quantity, or treat the RICARDO `1 ml (1/4 tsp)` pairing as a mass measurement.
- Keep all 22 recipe quantities and source links unchanged. Preserve the three records whose source attribution is missing as a separate recipe-metadata gap.
- The chart observation is recorded, but measurement state remains blocked and active catalog values remain null pending a reviewer decision on applicability and unit convention.

## Sources

1. King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), live chart, accessed 2026-10-12. “Baking powder” row: 1 teaspoon, 1/8 ounce, 4 g. The page’s note explains that recipe-site gram values may differ due to rounding and related factors, and says to follow the amount shown in the recipe.
2. Canadian Food Inspection Agency, [Canadian Food Compositional Standards, Volume 3 — Baking Powder](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), accessed 2026-10-12. Section 3.1.1 defines the compound product and carbon-dioxide-yield threshold; it gives no household measure or weight.
3. RICARDO, [Carré aux dattes (le meilleur)](https://www.ricardocuisine.com/recettes/5263-carre-aux-dattes-le-meilleur), accessed 2026-10-12. Ingredient list: 1 ml (1/4 tsp) baking powder; no gram weight.

## Review checks

- [x] Audited all recipe lines assigned to the live baking-powder candidate and preserved their source owner and quantity.
- [x] Checked current candidate, active reference, and ledger measurement observations for duplicate values.
- [x] Reused the already registered King Arthur chart source ID instead of creating a duplicate source identity.
- [x] Kept source-specific portion evidence separate from physical density, catalog mapping, recipe conversion, identity, and substitution.
- [x] Attach the chart observation to the existing ledger record without activating a density, unit mapping, or recipe conversion. Static ledger validation and UTF-8/no-BOM and scoped whitespace checks passed. No app tests or emulator checks were run because the change only adds database JSON data under `AGENTS.md`.
