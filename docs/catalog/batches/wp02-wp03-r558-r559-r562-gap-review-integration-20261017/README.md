# WP02 / WP03 R558, R559, and R562 integration — 2026-10-17

Root reviewed and integrated three bounded evidence updates. WP02 Section A7 and WP03 Section F remain open.

## R558 — Wheat-starch label reference amount

Recorded one 10 g `portion_weight` observation on the existing `ingredient-ref-wheat-starch` ledger row for Health Canada's current Table of Reference Amounts, item C.10, whose starch category explicitly includes wheat starch. This is nutrition-labelling evidence only. The table does not supply a wheat-starch-specific teaspoon count or grams-per-teaspoon conversion. Substitution research remains open; no density, mapping, form, recipe link, or active rule was added.

## R559 — Dry oat bran, Food Code 4493

Added five edition-specific `portion_weight` observations to the existing `ingredient-form-oat-bran-dry` ledger row:

- CNF 2015: 100/250 mL = 39.7/99.3 g.
- CNF 2026: 100/125/250 mL = 39.73/49.66/99.324 g.

The observations cite the separate Food Code 4493 name, conversion, measure-name, and measure-type CSV sources. The 40 g mass-only and zero-refuse rows are excluded; the type-9 “amount to make 125ml” entry remains uninterpreted. CNF 2015 and 2026 values remain separate observations, not an inferred density or active conversion.

## R562 — Cooked oat bran, Food Code 4494

Added six edition-specific `portion_weight` observations to the existing `ingredient-form-oat-bran-cooked` ledger row:

- CNF 2015: 100/125/250 mL = 92.6/115.7/231.4 g.
- CNF 2026: 100/125/250 mL = 92.561/115.702/231.403 g.

The observations cite the separate Food Code 4494 name, conversion, measure-name, and measure-type CSV sources. The 140 g mass-only and zero-refuse rows are excluded. The independent dry and cooked portions do not establish a cooking-yield relation.

## Shared files and static checks

- Updated `docs/catalog/research-ledger.v1.json`, the A7 and Section F plan checklists, `roadmap.md`, the three proposal statuses, and this README. Active reference/form JSON, recipes, package yields, conversions, and substitution data were not changed.
- `validate_research_ledger()` accepted **2,169 records** with **0 schema/source errors**. The ledger now has **10,035 source entries**, **8,480 distinct source IDs**, and **7,146 distinct source URLs**.
- Targeted checks confirmed the 12 new observations, expected research states, unchanged substitution states, record-local citations, UTF-8 without BOM, and final newline. `git diff --check` passed for the changed ledger, plan, roadmap, and proposal files.
- No app tests, build, emulator check, or deployment were run. These changes only add evidence to database JSON plus documentation, and `AGENTS.md` exempts database-JSON-only changes from testing.
