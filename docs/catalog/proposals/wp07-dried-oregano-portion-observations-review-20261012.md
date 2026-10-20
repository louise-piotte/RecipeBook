# WP07 dried-oregano portion observations

**Review date:** 2026-10-12
**Status:** Integrated as four source-specific observations on the existing
`ingredient-ref-dried-oregano` ledger record. No active density, unit mapping, recipe conversion, or
recipe edit was added. See the [integration README](../batches/wp07-dried-oregano-portion-integration-20261012/README.md).

## Evidence and limits

USDA SR28 NDB 02027, “Spices, oregano, dried,” publishes two distinct teaspoon portions: 1 tsp,
leaves = 1.0 g and 1 tsp, ground = 1.8 g. Health Canada's CNF 2015 Food Code 195, “Spices, oregano,
ground / Épices, origan, moulu,” separately reports 5 ml = 1.5 g and 15 ml = 4.6 g. Preserve the
source units, food descriptions, and dataset versions. Do not average the values, scale them between
units, or infer the capacity, fill, or leveling method of a teaspoon or tablespoon.

Health Canada describes the online CNF page as the 2015 publication and an interim access surface
while users access the 2026 relational dataset. The matching 2026 food and measure rows were not
verified in this review; the official Open Government dataset listing returned HTTP 403 through the
available browser. This is an access/research gap, not evidence that a current row is absent.

## Recipe demand and ownership

The active reference `ingredient-ref-dried-oregano` has eight manifest-linked lines across the 114
recipes and 1,123 ingredient rows. They include `dried oregano` and unqualified `oregano`, with tsp
and tbsp quantities. None is linked to the exact USDA leaf or ground form, and no source establishes
the form or jar brand used by those recipe lines. The four published observations therefore remain
ledger-only; no recipe-line link or app conversion was added.

## Integrated treatment

- Record separate observations for USDA leaves (1 tsp = 1.0 g), USDA ground oregano (1 tsp = 1.8 g),
  CNF 2015 ground oregano (5 ml = 1.5 g), and CNF 2015 ground oregano (15 ml = 4.6 g).
- Keep `measurementState` at `blocked_pending_evidence`; do not activate density or unit mappings.
- Leave the active ingredient reference, forms, recipes, and substitutions unchanged. Substitution
  research remains `not_yet_researched`.

## Sources

| ID | Source | Supports and limits |
|---|---|---|
| `WP07-OREGANO-20261012-S01` | USDA Agricultural Research Service, [Standard Reference Release 28, Food Group 02](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg02.pdf), NDB No. 02027. | Publishes the two source-specific teaspoon portions. The source does not specify spoon capacity, fill or leveling method, exact particle size, or brand. |
| `WP07-OREGANO-20261012-S02` | Health Canada, [Canadian Nutrient File serving portions, Food Code 195](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=195&lang=eng). | Names “Spices, oregano, ground / Épices, origan, moulu” and reports 5 ml = 1.5 g and 15 ml = 4.6 g. This is the 2015 CNF publication; no method or brand is stated. |
| `WP07-OREGANO-20261012-S03` | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). | Says the 2015 online CNF remains available as an interim measure while the 2026 relational files provide the current dataset. It does not establish the current oregano rows. |

All pages accessed 2026-10-12. The ledger update changed database JSON only; no app tests or emulator
checks were needed. Ledger validation and scoped encoding/whitespace checks were run.
