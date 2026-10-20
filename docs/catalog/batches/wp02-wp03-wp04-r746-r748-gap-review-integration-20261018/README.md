# WP02/WP03/WP04 R746–R748 gap-review integration — 2026-10-18

## Integrated decisions

- **R746 — Bob’s Red Mill teff-flour serving:** Added one `portion_weight` observation to the existing `ingredient-ref-teff-flour` research record for the manufacturer’s 1/4 cup (35 g) label serving. Refreshed existing source `WP02-S91` in place and recorded that the label gives no cup capacity or flour fill/weigh method. Reusable generic measurement remains unsupported; density and unit mappings remain empty. Preserved the separate R725 substitution finding and research state.
- **R747 — pot-barley French display:** Rechecked the current picker ownership and retained provisional `pot barley / orge en pot`, with `orge mondé` remaining on hulled barley. No catalog or ledger data changed. Independent Québec reviewer approval remains open; the display is not represented as OQLF-preferred or human-approved.
- **R748 — Northern pike:** Added `fresh whole northern pike / grand brochet frais entier` as a `fresh_whole` form under the existing Northern-pike identity, plus one form-level ledger record with one supplier source and the two existing species-identity sources. The supplier’s local-fresh-fish page places Northern Pike under “Whole Fish and Fillets.” The form does not infer SKU, current stock, Québec availability, cleaning/head state, measures, yields, recipe links, conversions, or substitutions.

## Snapshot

- 1,848 ingredient references; 179 ingredient forms.
- 2,236 research-ledger records; 10,496 source entries; 8,858 distinct source IDs; 7,505 distinct source URLs.
- 114 manifest-listed recipes and 1,123 structured ingredient rows.

R746 added one observation and one decision to an existing record without adding a source entry. R747 added no shared data. R748 added one form, one ledger record, and one new source entry.

## Static validation

- Bundled seed-package normalization and validation passed; the normalizer reported no additional package-part changes.
- Generated ingredient-catalog freshness and research-ledger schema validation passed.
- Source-ID-to-URL ownership remained consistent, and the picker projection retained the reviewed Northern-pike and barley phrase behavior.
- The 114-file recipe corpus scan found no candidate-specific recipe rows for these additions.
- Changed JSON remained valid UTF-8 without BOM, with bundled seed text escaped as required. Scoped local-link, whitespace, and `git diff --check` reviews passed.
- No software tests, build, emulator run, or deployment were performed. R746 and R748 only add database JSON data, and R747 is a documentation-only recheck, so testing is not required under `AGENTS.md`.

The broad WP02 A6, WP03 Section F, and WP04 Section P reviews remain open. Independent Québec display approval for pot barley also remains open.
