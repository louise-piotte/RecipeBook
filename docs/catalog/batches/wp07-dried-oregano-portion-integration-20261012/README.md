# WP07 dried-oregano portion observations (2026-10-12)

Recorded four source-specific values on the existing `ingredient-ref-dried-oregano` research-ledger
record:

- USDA SR28 NDB 02027: 1 tsp, leaves = 1.0 g; 1 tsp, ground = 1.8 g.
- Health Canada CNF 2015 Food Code 195, ground oregano: 5 ml = 1.5 g; 15 ml = 4.6 g.

These remain published observations, not reusable conversions. Preserve each source's state, units,
and dataset version. Do not average or scale them, equate source units to the app's spoon conventions,
or attach them to recipe lines. The bundled recipes contain eight oregano lines, but none specifies
the same exact source form. The current CNF 2026 rows have not been retrieved; keep
`measurementState: blocked_pending_evidence`, active density null, and unit mappings empty. Recipe
amounts and substitution data are unchanged.

The [review proposal](../../proposals/wp07-dried-oregano-portion-observations-review-20261012.md)
contains the full source register, recipe demand audit, and measurement limits. Ledger validation and
scoped encoding/whitespace checks passed. No app tests or emulator checks were run because this only
adds database JSON evidence.
