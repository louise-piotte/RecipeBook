# WP02 A6 pearl-millet flour French alias integration — 2026-10-12

Added **`farine de millet perlé`** as one French search alias on the existing
`ingredient-ref-pearl-millet-flour` reference. The established display `pearl millet flour / farine
de mil chandelle` remains unchanged; `bajra flour` remains the only active English alias. The
separate `bajri flour` proposal remains unintegrated and is outside this change.

Canadian French-facing product sources use the alias for pearl-millet flour; OQLF and Usito support
the grain-name wording but do not define this flour phrase as a preferred term. The bundle contains
no matching recipe demand. Health Canada's generic millet-flour portion was not applied to this
species-qualified row.

The ledger now records the bounded research: one laboratory sample's bulk density, **0.63 ± 0.01
g/mL**, under a tapped-cylinder protocol, and one bread study's 1–10% wheat-flour replacement trial
with 5% reported as optimal for that formula. The measurement state is `researched_supported`; the
substitution state remains `blocked_pending_evidence`. Active `defaultDensity` remains null,
`unitMappings` remain empty, and no substitution rule or recipe link was added.

Static package validation, ingredient-reference normalization, generated-catalog freshness, ledger
schema validation, UTF-8/no-BOM, and scoped whitespace checks passed. No app, unit, instrumentation,
or emulator tests were run; this change adds database JSON data under the current `AGENTS.md` rule.
The broader A6 review remains open. See the [proposal](../../proposals/wp02-a6-pearl-millet-flour-quebec-alias-review-20261012-round13.md).
