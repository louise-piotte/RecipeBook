# WP03 Section F R564 — CNF 2015 wild-rice portions — 2026-10-17

## Integrated data

Added five `portion_weight` observations to the existing wild-rice form ledger records, reusing the R177 CNF 2015 page sources:

- Dry wild rice, CNF Food Code 4449: **100 mL = 67.6 g** and **250 mL = 169.1 g**.
- Cooked wild rice, CNF Food Code 4450: **100 mL = 69.3 g**, **125 mL = 86.6 g**, and **250 mL = 173.3 g**.

The observations remain specific to CNF 2015 and their food codes. They are separate from R550’s CNF 2026 observations, which round to the same values at one decimal place. Do not treat the rounded agreement as independent kitchen validation or average the editions.

The dry code-4449 page also lists “amount to make 125ml” = 32.5 g; that entry remains uninterpreted and was not recorded as a portion. The 0% refuse rows were excluded. Neither CNF edition supplies a packing method, and the dry/cooked page amounts are not paired measurements of one batch. No active measure, density, mapping, conversion, dry-to-cooked yield, recipe link, or substitution was added. The wild-rice parent remains open.

## Sources

- Existing source `WP03-WILDRICE-FORMS-R177-20261016-S01` supports the dry Food Code 4449 observations: [Health Canada CNF 2015 dry wild rice](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4449).
- Existing source `WP03-WILDRICE-FORMS-R177-20261016-S02` supports the cooked Food Code 4450 observations: [Health Canada CNF 2015 cooked wild rice](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4450).
- No source IDs or source rows were added. The ledger remains at **2,171 records, 10,050 source entries, 8,487 distinct source IDs, and 7,152 distinct URLs**.

## Files updated

- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- [R564 proposal](../../proposals/wp03-section-f-next-gap-review-r564-20261017.md)

## Verification

- `validate_research_ledger()` — 2,171 records, no schema or measurement-source-reference errors.
- Targeted values, source ownership, observation-ID uniqueness, UTF-8/no-BOM, local links, final newline, and whitespace checks passed.
- No app tests, build, emulator run, or deployment were run: this change only adds database JSON evidence, under the testing exemption in `AGENTS.md`.

WP03 Section F remains open.
