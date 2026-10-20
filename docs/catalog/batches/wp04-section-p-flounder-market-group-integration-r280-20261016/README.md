# WP04 Section P flounder / plie market-group integration (R280)

## Integration

Added identity-only `ingredient-ref-flounder-market-group` as:

- English: `flounder (name used for multiple fish species)`
- Québec French: `plie (nom utilisé pour plusieurs espèces de poissons)`

The reference is `PROTEIN`, with no aliases, taxon, forms, density, unit mappings, recipe links,
measures, conversions, yields, or substitutions. The visible qualifier preserves the multi-species
name scope in the picker. American plaice / `plie canadienne`, yellowtail flounder, winter flounder,
sole, fillet terms, and turbot remain outside the row. The separate R277 sole market group is
unchanged.

Added the accepted identity decision to the research ledger with the CFIA fish-list overview and
flounder query, OQLF terminology, Pêcheries Gaspésiennes product wording, and the stale Super C
snapshot. The Super C listing is not treated as current stock evidence; its 907 g package remains
SKU-specific. No reusable measure or product-state claim follows from it.

The checklist item is checked under Section P; the broader finfish checklist remains open. The
bundle has no matching recipe demand across 114 recipe files and 1,123 ingredient rows.

## Verification

Static seed-package validation, reference normalization, generated-index freshness, ledger schema
and source-ID/URL checks, picker projection, corpus scan, UTF-8/no-BOM and escaped-Unicode checks,
local links, scoped whitespace, and `git diff --check` passed. The picker returns the new group for
`flounder`; `plie` returns American plaice plus the group; `plie canadienne` and `American plaice`
remain on American plaice; `sole` remains on the R277 group; and filets, yellowtail flounder, winter
flounder, and turbot remain unmatched. The manifest-listed corpus has no flounder/plie phrase match.
Totals after integration: 1,659 references, 125 forms, and 2,007 ledger records / 8,813 source
entries / 7,461 distinct source IDs / 6,225 distinct URLs; 114 recipes / 1,123 ingredient rows. No
software tests, build, or emulator checks were run because this change only adds database JSON data
under `AGENTS.md`.

## Source and proposal

See the [R280 proposal](../../proposals/wp04-section-p-flounder-market-group-review-r280-20261016.md)
for the market-name evidence, source limits, picker projection, and ownership audit.
