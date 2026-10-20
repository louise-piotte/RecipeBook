# WP07 brown-sugar portion observations

**Review date:** 2026-10-12  
**Status:** Integrated as six source-specific observations on `ingredient-ref-brown-sugar`. See the [integration README](../batches/wp07-brown-sugar-portion-integration-20261012/README.md).

## Evidence and limits

The bundled reference has 24 ingredient lines across 20 recipes: 7 use cups, 4 use tablespoons, and 13 already give grams. The ledger already verifies the shared `brown sugar / cassonade` identity and its light and dark shade forms, but it has no portion observations. The active reference has no default density or unit mappings.

King Arthur Baking's Ingredient Weight Chart lists **1 cup packed dark or light brown sugar = 213 g**. Health Canada's CNF 2015 Food Code 4317, “Sweets, sugar, brown / Confiseries, sucre, brun (cassonade),” separately reports **5 ml = 4.6 g**, **100 ml packed = 93.0 g**, **125 ml packed = 116.2 g**, and **250 ml packed = 232.6 g**. The 5 ml row does not say packed, so its fill state remains unspecified. Health Canada's 2008 *Nutrient Value of Some Common Foods* independently reports **5 ml brown sugar = 5 g**. Preserve all six values as source-specific observations; do not average or scale them.

The CNF 2015 small-measure value differs from the 2008 publication. Their measure wording and publication versions are retained separately. The chart's cup convention and the sources' filling procedures are not sufficient to create a generic density or recipe conversion. None of these observations is linked to a recipe line.

## Integrated treatment

- Keep `measurementState` at `blocked_pending_evidence`; active density remains null and unit mappings remain empty.
- Record each published value with its source's food wording, volume unit, packing qualifier, and publication context.
- Add no recipe-line links, forms, conversions, or substitutions. Leave substitution research `not_yet_researched`.
- Leave all 24 recipe ingredient lines unchanged.

## Sources

| ID | Source | Supports and limits |
|---|---|---|
| `WP07-KAB-IWC` | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), “Brown sugar (dark or light, packed)” row. | Reports 1 cup = 7 1/2 oz = 213 g. The chart row specifies packed sugar and permits either shade; it does not identify a brand or state a cup-volume convention or packing procedure. This existing source ID is reused. |
| `WP07-BROWN-SUGAR-20261012-S01` | Health Canada, [Canadian Nutrient File serving portions, Food Code 4317](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4317). | Names “Sweets, sugar, brown / Confiseries, sucre, brun (cassonade)” and reports 5 ml = 4.6 g, 100 ml packed = 93.0 g, 125 ml packed = 116.2 g, and 250 ml packed = 232.6 g. This is the online CNF 2015 publication; no packing method is stated. |
| `WP07-BROWN-SUGAR-20261012-S02` | Health Canada, [Nutrient Value of Some Common Foods, Table 15: Sweets and Sugars](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-15-sweets-sugars-nutrient-value-some-common-foods-2008.html). | The 2008 table lists brown sugar at 5 ml = 5 g. It does not specify packed state; keep this publication-specific value separate from CNF 2015. |

The pages were accessed 2026-10-12. This change adds database JSON evidence and documentation only; app tests and emulator checks were not needed.
