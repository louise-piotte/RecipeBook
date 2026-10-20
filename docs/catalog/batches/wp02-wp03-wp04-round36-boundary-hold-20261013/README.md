# WP02/WP03/WP04 round 36 boundary hold

Reviewed 2026-10-13. The WP03 Section F *tsampa* candidate remains outside the shared catalog and
research ledger. No active ingredient reference, alias, form, recipe link, measure, density, unit
mapping, conversion, yield, substitution, generated index, recipe, or application code changed.

## Decision

The Tibetic lexicon identifies roasted highland barley flour as a common use of *tsampa*, but also
records roasted flour made from wheat, corn, and peas in some regions, plus a regional dough use.
Canadian producer pages support specific barley-tsampa products. They do not establish a universal
barley-flour identity or a Québec French *tsampa* label. Keep `barley tsampa` off the existing
`roasted barley flour / farine d'orge torréfiée` row: the phrase-first picker would then make bare
`tsampa` return that row alone. The full bundled corpus contains no matching demand. See the
[R36 proposal](../../proposals/wp03-section-f-tsampa-roasted-barley-picker-boundary-hold-20261013-r36.md).

## Static checks

- The current picker projection returns no result for `tsampa`, `tsanpa`, `zanba`, `zamba`,
  `barley tsampa`, `tsampa flour`, or `tsampa dough`; no exact active, form, legacy, or ledger owner
  was found.
- Projecting `barley tsampa` as an alias on the roasted-barley-flour row makes bare `tsampa` return
  that row as the only result.
- The scan of all 114 manifest-listed recipes / 1,123 ingredient rows found zero candidate or
  roasted-barley-flour matches.
- The proposal-local source-ID prefix was unused in the previous proposal/batch archive and live
  research ledger. The proposal's relative links resolved; changed documentation is UTF-8 without
  BOM, and scoped whitespace checks passed.

No tests were run because this is a documentation-only boundary hold; no database or code changed.
