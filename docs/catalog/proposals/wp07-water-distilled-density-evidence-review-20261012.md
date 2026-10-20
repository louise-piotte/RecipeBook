# WP07 Proposal: Water Density Evidence Review

**Review date:** 2026-10-12  
**Status:** Integrated on 2026-10-12. See [integration README](../batches/wp07-water-distilled-density-integration-20261012/README.md). Two sample-specific readings are in the water ledger record; no temperature-unspecified recipe default was added.

## Disposition

The recipe bundle contains substantial demand for converting water between volume and mass, but the active `water / eau` reference has no density or unit mapping and its ledger measurement state remains `blocked_pending_evidence`. A NIST-authored primary measurement paper reports a distilled, degassed water sample at **20.000 °C ± 0.001 °C** with two direct density readings:

| Measurement | Published value |
|---|---:|
| Initial calibration reading | 0.9982028 ± 0.00000083 g/cm³ |
| Repeat reading after the oil measurements | 0.9982004 ± 0.0000015 g/cm³ |

Treat these as two separate measured observations for the exact sample and conditions. Do not average them or turn one into the active `defaultDensity`. The study sample was distilled and degassed; the recipe input is generally unqualified water and sometimes explicitly hot, boiling, cold, ice, warm, or lukewarm. The app's active density field cannot express sample purity or temperature. Keep water mass-volume conversion unavailable until the model and accepted evidence can represent a defensible recipe-water basis.

The U.S. Geological Survey's explanatory material independently warns that water density changes with temperature and dissolved material. That supports the boundary: this evidence is for a laboratory sample, not proof that every tap, mineral, salted, or otherwise dissolved water product can be assigned the same value. It also does not authorize assigning water's density to other liquids.

## Candidate ownership and current state

- This is a WP07 measurement task for the existing identity `ingredient-ref-water`; no new identity or form is proposed.
- The active row is `water / eau`, with `defaultDensity: null` and no `unitMappings`. No form for water is active.
- Before integration, the ledger record had two CFIA identity/labeling sources from the WP05 water-and-ice review, zero `measurementObservations`, and `measurementState: blocked_pending_evidence`. The existing unresolved decision says removed draft numeric values must not be restored without a source, exact food/form, unit convention, method or basis, and review.
- The ledger's water wording and identity boundary remain owned by WP05. This proposal owns only a source-specific WP07 measurement observation. It does not repeat or change the WP05 conclusion about plain water versus sparkling/mineral/spring water and packaged ice.
- Other ledger observations that mention water refer to other foods, such as canned artichoke packed in water, and are not observations of the water ingredient.

## Recipe-demand and ownership audit

Scanned all 114 manifest-listed recipe files (1,123 ingredient rows) and selected only rows linked to `ingredient-ref-water`. The bundle has **21 lines across 19 recipes**: 9 `cup`, 8 `ml`, 3 `tbsp`, and 1 `g`. Eight of the 20 volume lines explicitly qualify water temperature (two ice-water lines, one lukewarm, one warm, one cold, one hot, and two boiling); the other 12 volume lines do not. The one gram line already has a mass quantity and needs no density conversion.

These are recipe-input demands, not measurement observations. Original quantities, temperatures, and the publisher attribution stored in the bundle are listed below. A missing URL means the bundled source object has no source URL saved.

| Recipe lines | Bundled recipe | Original water quantity text | Stored source |
|---|---|---|---|
| `002#5` | All Butter Pie Crust | `120 ml ice water, plus more as needed` | [Sally's Baking Addiction](https://sallysbakingaddiction.com/all-butter-pie-crust/) |
| `005#5` | Steamed Bao Buns | `140 ml lukewarm water` | [Red House Spice](https://redhousespice.com/steamed-bao-buns/) |
| `021#3` | Yule Log | `180 ml water` | [Sally's Baking Addiction](https://sallysbakingaddiction.com/buche-de-noel-yule-log/) |
| `024#2` | Date Squares | `1 cup water` | [Ricardo Cuisine](https://www.ricardocuisine.com/recettes/5263-carre-aux-dattes-le-meilleur) |
| `033#1` | Air Fryer Churros | `1/2 cup water` | [Plated Cravings](https://platedcravings.com/air-fryer-churros/#wprm-recipe-container-7808) |
| `041#5` | Pie Crust | `60 ml ice water` | [Preppy Kitchen](https://preppykitchen.com/classic-pastry-crust/) |
| `044#1` | Corn on the Cob | `2 cups water` | No source URL stored |
| `045#13` | Strawberry Fraisier Cake | `50 g water` | [Anne-Sophie Fashion Cooking](https://www.fashioncooking.fr/2016/09/fraisier-traditionnel/) |
| `046#2` | French Buttercream | `3 tbsp water` | [Preppy Kitchen](https://preppykitchen.com/how-to-make-french-buttercream/) |
| `057#5`, `057#24` | Chocolate Truffle Cake | `1 cup water`; `1/4 cup plus 2 tbsp water` | [Food & Wine](https://www.foodandwine.com/recipes/chocolate-truffle-layer-cake) |
| `058#1` | Queen Elizabeth Cake | `1 1/4 cups boiling water` | [Allrecipes](https://www.allrecipes.com/recipe/7666/queen-elizabeth-cake-i/) |
| `064#4` | Marzipan Frosting | `2 tbsp hot water` | [Odense](https://odense.com/odense-recipes/marzipan-frosting-recipe/) |
| `066#7` | Korean Soy-Marinated Jammy Eggs | `1 cup water` | [The Kitchn](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937) |
| `072#3`, `072#5` | Hamburger Buns | `30 ml water`; `150 ml water` | [Joshua Weissman](https://www.joshuaweissman.com/post/mcdonald-s-big-mac-but-better) |
| `076#1` | Pizza Dough | `180 ml warm water` | [Preppy Kitchen](https://preppykitchen.com/spring-pizzas/) |
| `077#3` | Salmon Pot Pie | `1 tbsp water` | [Ricardo Cuisine](https://www.ricardocuisine.com/recettes/6174-pate-au-saumon-style-pot-en-pot-de-ricardo) |
| `080#5` | Puff Pastry | `120 to 150 ml cold water` | [Preppy Kitchen](https://preppykitchen.com/puff-pastry/) |
| `098#2` | Cranberry Sauce | `1/2 cup water` | No source URL stored |
| `099#4` | Gravy | `2 cups boiling water` | No source URL stored |

Recipe text confirms both ordinary and temperature-qualified demand. It does not provide the water's exact temperature, mineral content, or measured volume-to-mass relationship. Do not use recipe counts as evidence for NIST's sample conditions.

## Integrated ledger treatment

Two `mass_density` observations were added to `ingredient-ref-water` with `evidenceKind: measured`, retaining the values and uncertainties separately. Their IDs are `wp07-water-nist-degassed-20c-initial` and `wp07-water-nist-degassed-20c-repeat`. The food description identifies distilled water, degassed by boiling, as the NIST densimeter calibration sample. Each preserves 20.000 °C ± 0.001 °C and its reported uncertainty; the pressure for this water-sample reading is unstated.

The ledger sets `measurementState: researched_supported` for the exact laboratory observations, alongside an unresolved decision that neither observation justifies an active water mapping for unspecified recipe temperatures or dissolved-solids content. Keep `defaultDensity` null, add no `unitMapping`, and link no recipe row to either observation. If a future runtime mapping is proposed, it needs an explicit reference temperature/sample convention and a tested policy for ice, heated, or chemically modified water; do not carry this evidence over to milk, broth, juice, oil, or any other liquid.

## Sources

All pages accessed 2026-10-12. Each source is limited to the claims stated here.

| ID | Source | Use and limit |
|---|---|---|
| `WP07-WATER-20261012-S01` | J. H. Hendricks, J. R. Ricker, J. H. Chow, and D. A. Olson, [“Effect of Dissolved Nitrogen Gas on the Density of Di-2-Ethylhexyl Sebacate: Working Fluid of the NIST Oil Ultrasonic Interferometer Manometer Pressure Standard”](https://tsapps.nist.gov/publication/get_pdf.cfm?pub_id=900223), *MEASURE*, vol. 4, no. 2 (2009), pp. 52–59. | Primary NIST-authored study. Its calibration sample of distilled water, degassed by boiling, was measured at 20.000 °C ± 0.001 °C as 0.9982028 ± 8.3×10⁻⁷ g/cm³ before and 0.9982004 ± 1.5×10⁻⁶ g/cm³ after the oil measurements. These are lab-sample readings, not recipe-water portions. The paper does not state a pressure for the water sample. |
| `WP07-WATER-20261012-S02` | U.S. Geological Survey, [Water Density](https://www.usgs.gov/water-science-school/science/water-density) | States that water is roughly 1 g/mL but density changes with temperature and dissolved substances. This is a boundary/corroboration source; it does not provide the NIST sample's exact reading or a recipe conversion. |

## Audit method and limits

- Used the manifest-listed bundled recipe files as the source of truth; matched exact `ingredientRefId`, preserved `originalText`, and read recipe publisher metadata from each matching recipe object.
- Before integration, checked the live water reference and forms, unit definitions, the exact `ingredient-ref-water` ledger record, and existing ledger measurement observations whose food description or state mentions water. No pure-water measurement observation was then present; observations for foods packed or prepared in water were not duplicates.
- The NIST paper's water measurement is an explicit, lab-sample density result. It does not verify generic household tap water, hard/mineral water, saline or sugared water, water at a different temperature, or recipe-specific `ice`, `hot`, `lukewarm`, `warm`, or `boiling` conditions.
- No kitchen-unit equivalence was derived from the NIST density. The active water reference remains without density or unit mappings, and recipe lines remain unchanged. Ledger validation passed; no app tests or emulator checks were run because this update only adds database JSON data under `AGENTS.md`.

