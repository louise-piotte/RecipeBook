# WP03 Section F R310 — dry pearl-barley portions

## Decision

Added two Health Canada CNF 2015 Food Code 4411 `portion_weight` observations to the existing
`ingredient-form-pearl-barley-dry` ledger record:

- 100 mL = 84.5 g
- 250 mL = 211.3 g

These are source-specific published portions for dry pearled barley. The CNF page does not state a
filling or packing method. Its separate `amount to make 125ml = 23.8 g` field is not explained on
the page and remains uninterpreted; it was not recorded as a portion, recipe quantity, conversion,
or cooking yield. The edible-portion baseline and refuse value were also excluded.

The two observations do not establish generic density, reusable measures, extrapolated volumes,
dry-to-cooked yield, or mass for a recipe. Active density, mappings, measures, conversions, package
yields, recipes, and substitutions remain unchanged. The dry form's measurement state reflects only
the two supported historical observations. CNF 2026 Food Code 4411 row inspection remains open; the
official file contents were not accessible during the source review, so no current-edition row claim
is made.

## Sources

- Health Canada, [CNF 2015 serving size: Grains, barley, pearled, dry, Food Code 4411](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4411). Reports the exact bilingual state name and the two volume portions; its page details show 2019-03-01.
- Health Canada, [Canadian Nutrient File Users' Guide (2015)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), Section C. Describes conversion factors as food-specific weights of described portions and warns generic weights may differ from local products.
- Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html). Describes CNF 2026 as relational CSVs and the CNF 2015 online route as interim access.
- Open Government Portal, [CNF 2026 dataset listing](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109). Lists the relational resources; direct row contents were not available through checked browser routes.

See the [R310 source proposal](../../proposals/wp03-section-f-pearl-barley-dry-measure-review-r310-20261016.md) for access attempts and picker/corpus boundaries.

## Data checks

- Added four unique record-local research source IDs and two unique measurement observation IDs to the dry pearl-barley form.
- Confirmed the two adopted values against Health Canada's official CNF 2015 page.
- Kept the ambiguous 125 mL “amount to make” field and all active catalog, form, recipe, yield, and substitution data unchanged.
- No software tests, builds, emulator checks, or deployment were run because this integration only adds database JSON research data and checklist notes under the current `AGENTS.md` rule.
