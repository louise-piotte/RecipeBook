# WP03 Section F R307 — cooked-rice portions

## Decision

Added three Health Canada CNF 2015 Food Code 4523 `portion_weight` observations to the existing
`ingredient-form-rice-cooked` research record:

- 100 mL = 66.8 g
- 125 mL = 83.5 g
- 250 mL = 166.9 g

These are source-specific published portions for cooked white long-grain regular rice. The CNF page
does not state a filling or packing method. The observations do not establish a generic density,
reusable cup conversion, dry-to-cooked yield, mass for any bundled recipe line, or a measure for a
different rice variety. Active measures, mappings, conversions, recipe lines, and substitutions remain
unchanged. The cooked-form measurement research state reflects only these supported historical
observations.

CNF 2026 Food Code 4523 joined-row inspection remains open because the official downloadable file
contents could not be retrieved in the review environment. No row presence, absence, or value is
claimed. The 2015 observations remain separate from that future review.

## Source

- Health Canada, [CNF serving size: white long-grain regular rice, cooked, Food Code 4523](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523), accessed 2026-10-16. The page lists the bilingual food name and all three volume-to-mass portions. Its page details show 2019-03-01.
- Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), accessed 2026-10-16. The overview describes CNF 2026 as relational CSV data and says the 2015 online CNF remains available as an interim access route.

See the [R307 source proposal](../../proposals/wp03-section-f-next-gap-review-r307-20261016.md) for the identity, recipe, and picker boundaries and the access notes for the CNF 2026 files.

## Data checks

- Confirmed all three source values against the accessible official Health Canada Food Code 4523 page.
- Added one new record-local source ID and three unique measurement observation IDs to the cooked-rice form; no ingredient reference, form, recipe line, or active conversion changed.
- No software tests, builds, emulator checks, or deployment were run because this integration only adds research data to the JSON database and plan notes under the current `AGENTS.md` rule.
