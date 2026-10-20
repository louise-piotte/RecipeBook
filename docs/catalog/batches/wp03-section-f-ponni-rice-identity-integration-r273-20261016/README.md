# WP03 Section F Ponni rice identity integration (R273)

## Integration

Added identity-only `ingredient-ref-ponni-rice` as `Ponni rice / riz Ponni` in
`GRAIN_AND_CEREAL`. The reference has no aliases, forms, density, unit mappings, measures, conversions,
yields, recipe links, or substitutions. The 114-recipe / 1,123-row corpus has no Ponni demand.

Kept this source-attested market name separate from Improved White Ponni as a named variety, generic
rice, grain-length classes, Sona Masoori, and brand names. The evidence does not establish that all
Ponni-labeled products share one cultivar or processing state. The Laxmi raw/boiled listings remain
SKU wording only. The R255 Ponni-to-Sona-Masoori substitution claim remains blocked.

## Verification

Static package validation passed; the reference normalizer reports the data canonical, and the
generated catalog is current at 1,657 references. The 2,005-record research ledger passed schema and
source-reference validation. Picker projection returns only this reference for `Ponni`, `Ponni
rice`, and `riz Ponni`; package-state-qualified queries remain unmatched. The 114 recipe files / 1,123
ingredient rows have no Ponni mentions. UTF-8/no-BOM, local-link, whitespace, and `git diff --check`
checks passed. No software tests or emulator checks were run because this change adds database JSON
data under the current `AGENTS.md` rule.

## Sources and proposal

See the [R273 proposal](../../proposals/wp03-section-f-ponni-rice-identity-review-r273-20261016.md)
for source links, package-crawl limitations, and the full identity-boundary audit.
