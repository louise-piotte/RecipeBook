# WP07 garlic-powder portion observations (2026-10-12)

Recorded four source-specific values on the existing `ingredient-ref-garlic-powder` ledger record:

- USDA SR28 NDB 02020: 1 tsp = 3.1 g; 1 tbsp = 9.7 g.
- Health Canada CNF 2015 Food Code 188: 5 ml = 2.9 g; 15 ml = 8.5 g.

Keep these as published observations, not reusable conversions. Preserve source units and versions;
do not average or scale. The current CNF 2026 food and measure rows were not retrieved from the
official dataset routes available to this review, which returned HTTP 403. This does not establish
that the current row is absent. Keep `measurementState: blocked_pending_evidence`, active density
null, and unit mappings empty.

The bundle has eight linked garlic-powder lines, including one granulated-powder line and one “to
taste” line. None is linked to a source-specific form or measure. Recipes and substitutions remain
unchanged. The [review proposal](../../proposals/wp07-garlic-powder-portion-observations-review-20261012.md)
contains the full source register and limits. Ledger validation and scoped encoding/whitespace checks
passed. No app tests or emulator checks were run because this only adds database JSON evidence.
