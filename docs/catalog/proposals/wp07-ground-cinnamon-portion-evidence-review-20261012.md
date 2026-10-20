# WP07 Ground-Cinnamon Portion Evidence Review (2026-10-12)

## Status and scope

Integrated on 2026-10-12. The four source-specific portions and two sources are recorded on the existing `ingredient-ref-ground-cinnamon` ledger record; see the [integration README](../batches/wp07-ground-cinnamon-portion-integration-20261012/README.md). The active reference and all recipe amounts remain unchanged.

## Why this candidate

The WP07 plan still lists prioritizing baking and frequently converted pantry ingredients, researching broader forms, validating source units, and recording unsupported values as explicit gaps. Ground cinnamon is a frequent, measurable candidate in the bundled corpus: nine recipe lines use the active reference, all in teaspoons. The live candidate has no measurement source or observation, and the active reference has no density or unit mapping.

## Live owner and recipe audit

The active reference is `ground cinnamon / cannelle moulue` (`ingredient-ref-ground-cinnamon`), in `BAKING_AND_SPICE`; `defaultDensity` is null and `unitMappings` is empty. The ledger record is `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, with zero sources and zero `measurementObservations`.

The nine linked recipe lines range from 1/2 tsp to 2 tsp. Five lines explicitly say “ground cinnamon”; four say only “cinnamon.” Recipe metadata records a publisher and direct URL for eight lines; the carrot-cake record has no source attribution. The measurement proposal below is for the source’s exact food description, “Spices, cinnamon, ground.” It should not be used to decide whether the four bare “cinnamon” lines mean ground spice or another form. No recipe line is changed.

| Recipe | English title | Stored quantity | Source owner recorded in recipe |
| --- | --- | --- | --- |
| 001 | Air Fryer Baked Oats | `1/2 tsp ground cinnamon` | [Healthful Blondie](https://healthfulblondie.com/air-fryer-baked-oats/) |
| 010 | Linzer Cookies | `1/2 tsp ground cinnamon` | [Preppy Kitchen](https://preppykitchen.com/linzer-cookies/) |
| 033 | Air Fryer Churros | `1/2 tsp ground cinnamon` | [Plated Cravings](https://platedcravings.com/air-fryer-churros/#wprm-recipe-container-7808) |
| 042 | Pork Rub | `2 tsp cinnamon` | [Fit Foodie Finds](https://fitfoodiefinds.com/best-dry-rub-for-pork/) |
| 048 | Garam Masala | `1 tsp cinnamon` | [L'Île aux épices](https://ileauxepices.com/blog/2015/01/21/recette-garam-masala-maison/wpid7279/) |
| 053 | Carrot Cake | `1 1/2 tsp cinnamon` | not recorded in bundled source metadata |
| 055 | Coffee Cake | `2 tsp ground cinnamon` | [Preppy Kitchen](https://preppykitchen.com/coffee-cake/#recipe) |
| 055 | Coffee Cake | `2 tsp ground cinnamon` | [Preppy Kitchen](https://preppykitchen.com/coffee-cake/#recipe) |
| 073 | Chocolate Banana Bread | `1 tsp cinnamon` | [Preppy Kitchen](https://preppykitchen.com/chocolate-chip-banana-bread/) |

A separate ledger entry, `ingredient-ref-cinnamon`, is an unresolved legacy candidate absent from the active reference package. It does not own these linked lines. Do not use the new portion source to resolve that identity candidate, alter aliases, or relink recipes. The active ground-cinnamon reference currently has `cinnamon` as an English alias, which is why the four unqualified lines appear in this audit.

## Primary source finding

The USDA Agricultural Research Service’s [SR28 NDB No. 02010 report](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf) names the food **“Spices, cinnamon, ground”** and lists common measures of **1 tsp = 2.6 g** and **1 tbsp = 7.8 g**. These are two values published by the source; the tablespoon value is not calculated here from the teaspoon value.

Health Canada’s [2015 Canadian Nutrient File serving page, food code 178](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=178) lists the same English and French food names and reports **5 ml = 2.3 g** and **15 ml = 6.9 g**. Preserve these as the source’s raw metric measures rather than relabeling them as the app’s teaspoon or tablespoon units. The CNF search page identifies itself as the 2015 publication and says it is not being updated while Health Canada works toward a more user-friendly way to access the [2026 CNF dataset](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). That newer dataset publishes separate food-name and measure-weight files, but its cinnamon rows were not retrieved in this review; no 2026 CNF value is asserted here.

USDA’s [SR28 archive page](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/methods-and-application-of-food-composition-laboratory/mafcl-site-pages/sr11-sr28/) identifies the release as Standard Reference 28, slightly revised, version current May 2016. It describes the database as providing household measures. This is authoritative, source-published portion evidence, but it is an archived U.S. reference, not a current Canadian product specification.

## Integrated ledger evidence

Four non-active `portion_weight` observations were attached to the existing `ingredient-ref-ground-cinnamon` ledger record, using two source entries:

| Observation ID | Food description | Source quantity | Published mass |
| --- | --- | --- | --- |
| `wp07-ground-cinnamon-usda-sr28-02010-tsp-20261012` | Spices, cinnamon, ground (USDA SR28 NDB 02010) | 1 tsp | 2.6 g |
| `wp07-ground-cinnamon-usda-sr28-02010-tbsp-20261012` | Spices, cinnamon, ground (USDA SR28 NDB 02010) | 1 tbsp | 7.8 g |
| `wp07-ground-cinnamon-cnf2015-178-5ml-20261012` | Spices, cinnamon, ground (Health Canada CNF 2015, food code 178) | 5 ml | 2.3 g |
| `wp07-ground-cinnamon-cnf2015-178-15ml-20261012` | Spices, cinnamon, ground (Health Canada CNF 2015, food code 178) | 15 ml | 6.9 g |

Recorded source IDs:

- `WP07-CINNAMON-20261012-S01` — USDA ARS SR28, report `sr28fg02.pdf`, NDB 02010, “Spices, cinnamon, ground,” common-measure entries.
- `WP07-CINNAMON-20261012-S02` — Health Canada, 2015 Canadian Nutrient File, food code 178, “Spices, cinnamon, ground,” serving-size entries.

At review time, no matching source IDs or portion observations existed in the live ledger.

For each observation, the ledger preserves the relationship as `portion_weight` and evidence kind as `published_portion`. For USDA, it records the basis as a published SR28 common-measure entry; the report does not state the spoon volume convention, fill/leveling method, brand, grind specification, or cinnamon species. For Health Canada, it records the basis as the 2015 CNF published metric serving-size entry; the page does not state fill/leveling method, brand, grind specification, or cinnamon species. It preserves `5 ml` and `15 ml` exactly as CNF units. Measurement state remains blocked pending applicability and current-dataset review. No runtime mapping was created.

## Limits and disposition

- Both source descriptions match the active reference’s ground state, but neither specifies cinnamon species, brand, particle size, or fill/leveling method. USDA does not specify spoon volume; CNF gives metric volumes.
- Retain each source’s measures independently. The USDA `tsp` and `tbsp` labels are not directly equivalent here to CNF `5 ml` and `15 ml` records because USDA does not publish spoon volume. Do not average the values or treat their apparent differences as a settled product-level variance.
- Do not turn any value into `g/mL`, cup density, a universal teaspoon-to-gram mapping, or a conversion for cinnamon sticks or other forms.
- The USDA source is an archived 2016 U.S. release. The CNF serving page is from the 2015 publication and is no longer updated. Health Canada publishes a 2026 CNF dataset, but its cinnamon measure rows remain to be checked before activation; the 2015 CNF values do not establish the current dataset’s values.
- Do not extend this measure automatically to the four bare “cinnamon” recipe lines; their exact form is not explicit in the stored ingredient text.
- Keep the candidate’s measurement state blocked and active catalog values null. No recipe quantities, candidate ownership, aliases, or forms are changed.

## Sources

1. USDA Agricultural Research Service, [USDA National Nutrient Database for Standard Reference, Release 28, report SR28fg02](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf), accessed 2026-10-12. NDB No. 02010, “Spices, cinnamon, ground”; common measures: 1 tsp = 2.6 g and 1 tbsp = 7.8 g.
2. USDA Agricultural Research Service, [Standard Reference 11–28 archive](https://www.ars.usda.gov/northeast-area/beltsville-md-bhnrc/beltsville-human-nutrition-research-center/methods-and-application-of-food-composition-laboratory/mafcl-site-pages/sr11-sr28/), accessed 2026-10-12. Identifies SR28 as slightly revised, version current May 2016, and describes its household-measure data.
3. Health Canada, [Canadian Nutrient File 2015 serving size, food code 178](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=178), accessed 2026-10-12. “Spices, cinnamon, ground”; 5 ml = 2.3 g and 15 ml = 6.9 g.
4. Health Canada, [Canadian Nutrient File search page](https://food-nutrition.canada.ca/cnf-fce/index-eng.jsp), accessed 2026-10-12. States the page contains the 2015 CNF, will not be updated, and is retained while Health Canada works toward a user-friendlier way to access the 2026 dataset.
5. Health Canada, [Canadian Nutrient File, 2026 — Open Government Portal](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109), accessed 2026-10-12. Dataset metadata lists food-name and measure-weight conversion CSV resources; the cinnamon records were not evaluated for this proposal.

## Review checks

- [x] Audited all nine linked recipe lines, their quantities, and source ownership metadata.
- [x] Checked the active reference and both the ground-cinnamon and unresolved legacy-cinnamon ledger records for existing measurement observations and duplicate sources.
- [x] Checked the open WP07 plan priorities and found no existing source-specific cinnamon portion proposal.
- [x] Kept the primary source values separate from density, runtime mapping, identity resolution, and recipe edits.
- [x] Marked the older CNF source and unevaluated 2026 CNF record as limits; no unverified current values were inferred.
- [x] Added the four source-specific observations while keeping measurement state blocked and active density, mappings, and recipe amounts unchanged.
