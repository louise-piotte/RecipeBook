# WP02/WP03/WP04 round-ten gap-review integration — 2026-10-13

## Integrated decisions

- **WP02 A6 — Guinea corn:** Added `guinea corn` to the English aliases on grain sorghum and `guinea corn flour` to sorghum flour. Registered the five reviewed sources across those two ledger records and accepted both alias decisions. Added Westpoint’s 3 tbsp (30 g) label serving as one source-specific flour `portion_weight` observation. Recorded qualitative wheat-use guidance as blocked pending evidence. No density, active mapping, substitution rule, or recipe link was added; the Ogi Baba / powder product stays separate.
- **WP03 Section F — fonio flakes:** Added unresolved ledger-only `candidate-fonio-flakes`. It has no active reference, aliases, forms, measurement values, recipe links, or substitutions. The record reuses the live OQLF source `WP03-S34` and the Mako source ID from the puffed-fonio review, plus seven new round-ten sources.
- **WP04 Section P — chain pickerel:** Held *Esox niger* outside the picker because the display phrase `chain pickerel` would turn broad `pickerel` into a misleading single-species result despite current Canadian pickerel use for walleye and other *Sander* taxa. No catalog or ledger row was added.

## Verification

Static package normalization/validation, generated-index freshness, ledger schema and identifier/source-link checks, focused picker projections, recipe-corpus fingerprint, UTF-8/no-BOM and whitespace checks passed. The recipe corpus remains 114 files / 1,123 ingredient rows with digest `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. No app, unit, instrumentation, emulator, or application tests were run because the catalog changes only add database JSON data; the chain-pickerel item is documentation-only.

A6, Section F, and Section P remain open for later gaps. See the [WP02 proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round10.md), [WP03 proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round10-fonio-flakes.md), and [WP04 proposal](../../proposals/wp04-section-p-next-fish-gap-review-20261013-round10.md).
