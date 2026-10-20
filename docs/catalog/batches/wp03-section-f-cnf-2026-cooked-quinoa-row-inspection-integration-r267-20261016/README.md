# WP03 Section F R267 — cooked-quinoa CNF 2026 row inspection

Integrated the [R267 review proposal](../../proposals/wp03-next-section-f-gap-review-r267-20261016.md).

## Decision

Closed the cooked-quinoa CNF 2026 row-inspection item by recording three edition-specific `portion_weight` observations on the existing `ingredient-form-quinoa-cooked` ledger record:

| CNF measure | Published mass | Measure code | Row date |
|---:|---:|---:|---|
| 100 mL | 78.191 g | 341 | 2011-06-14 |
| 125 mL | 97.739 g | 383 | 2011-06-14 |
| 250 mL | 195.477 g | 415 | 2011-06-14 |

The official Food Name row is Food Code 5917, `Grains, quinoa, cooked / Grains céréaliers, quinoa, cuit`. The values match the CNF 2015 portions after rounding. Their row dates are from 2011; this is a CNF 2026-edition data observation, not a new 2026 measurement trial. The 140 g measure-labelled row supplies no volume, and the total-refuse row is not edible food.

The 2008 125 mL = 73 g and CNF 2015 portions remain unchanged as separate historical observations. The 125 mL values conflict and are not averaged. The active measurement state is now `researched_supported` for the source-specific published portions; there is still no packing method, density, active unit mapping, reusable conversion, dry-to-cooked yield, or source mass for recipe 016#1. The recipe and its existing form link remain unchanged, and substitution research remains `not_yet_researched`.

## Integration record

- Added four source entries and three published-portion observations to the existing cooked-quinoa form record; no reference, form, recipe, picker, or active conversion data changed.
- Checked the Section F CNF 2026 row-inspection item, updated the plan log, roadmap, and proposal status. Broader Section F coverage remains open.
- Static seed-package validation, generated-index freshness, ledger schema/source-ID and source-ID-to-URL checks, observation-ID uniqueness, exact row-value consistency, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests or emulator checks were run. This change only adds database JSON data under the current `AGENTS.md` rule.

## Evidence and access

The Food Name, Measure Weight Conversion, Measure Name, and Measure Type CSV rows were fetched from the official Open Government Portal URLs recorded as `WP03-CNF2026-QUINOA-R267-S01` through `S04` in the ledger. The browser's portal/API routes returned 403, and a later repeat of the direct CSV request timed out; the earlier direct retrieval parsed the joined rows in memory. Health Canada's accessible [CNF page](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) confirms that CNF 2026 is published as relational CSV files and that the 2015 online version remains accessible as an interim measure.
