# WP04 Section P sole market-group integration (R277)

## Integration

Added identity-only `ingredient-ref-sole-market-group` as:

- English: `sole (market name used for multiple fish species)`
- Québec French: `sole (appellation commerciale utilisée pour plusieurs espèces de poissons)`

The reference is `PROTEIN`, with no aliases, forms, density, unit mappings, recipe links, measures,
conversions, yields, or substitutions. The visible qualifier keeps the unqualified market name from
implying a single taxon. Common sole / *Solea solea*, `filet de sole`, plie, flounder, and turbot remain
outside the row.

The checked R277 item is under Section P; the broader finfish checklist remains open. The bundle has
no matching recipe demand across 114 recipe files and 1,123 ingredient rows.

## Verification

Static seed-package validation, reference normalization, generated-index freshness, ledger schema and
source-reference checks, picker projection, corpus scan, UTF-8/no-BOM, local-link, whitespace, and
`git diff --check` checks passed. No software tests, build, or emulator checks were run because this
change only adds database JSON data under `AGENTS.md`.

## Source and proposal

See the [R277 proposal](../../proposals/wp04-section-p-sole-market-gap-review-r277-20261016.md) for the
market-name evidence, source limitations, exact picker projection, and complete boundary audit.
