# WP02 A7 round 35 boundary integration

Reviewed 2026-10-13. One unresolved candidate was added to the research ledger:
`candidate-malted-buckwheat-flour`. No active ingredient reference, alias, form, recipe link,
measurement, density, unit mapping, conversion, yield, substitution, generated index, or application
code changed.

## Decision

Keep malted buckwheat flour unallocated. A Québec producer lists malted buckwheat and offers custom
milling, but the sources do not identify a standalone malted-buckwheat flour product, item-specific
grind or specification, or Québec French flour label. The English phrase appears in research and
external recipes, but those sources do not establish the Québec product boundary. Keep this separate
from plain or sprouted buckwheat flour, whole malted buckwheat, and generic malt flour. The two
external recipe masses remain recipe-specific; no density, reusable measure, or general
substitution is supported. See the [R35 proposal](../../proposals/wp02-a7-malted-buckwheat-flour-boundary-review-20261013-round35.md).

## Static checks

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed; the
  generated index remains current at 1,365 references.
- The research-ledger validator accepted all 1,698 records with zero errors. The six R35 source IDs
  are unique, and the decision links to every source.
- Active-reference, form, and legacy projections found no owner for six exact candidate phrases.
  `buckwheat flour` and `farine de sarrasin` each return two current references; a hypothetical
  candidate row would make each query return three.
- Scanning every manifest-listed recipe found 0 matches in 114 files / 1,123 ingredient rows.
- Changed files are UTF-8 without BOM; the ledger stores non-ASCII values as explicit Unicode
  escapes. All relative proposal links resolved, and scoped `git diff --check` passed.

No tests were run because the change only adds database JSON candidate data and documentation under
`AGENTS.md`.
