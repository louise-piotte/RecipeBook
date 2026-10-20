# WP02/WP03/WP04 round-eleven gap-review integration — 2026-10-13

## Integrated decisions

- **WP02 A6 — Sajjalu:** Added `sajjalu` to the English aliases for pearl millet and `sajjalu flour` to pearl-millet flour. Registered ICAR–IIMR’s grain crosswalk and the separate flour product listing on their respective ledger rows. Existing displays, forms, numeric behavior, and substitution findings remain unchanged.
- **WP03 Section F — puffed rice:** Added `muri` and `murmura` to the English aliases for puffed rice. Registered five new sources and reused the existing NIFTEM source ID with a separate puffed-rice locator. Kept rice flakes, prepared snacks, and crispy rice cereal separate; the French display and its inherited terminology question remain unchanged.
- **WP04 Section P — black bullhead:** Added identity-only `black bullhead / barbotte noire` for *Ameiurus melas* in `PROTEIN`, with empty aliases, null density, and no unit mappings. The ledger records no supported measurement or substitution, with no measurement observation and one no-supported-substitute finding. Three existing source IDs were reused and seven new sources registered. Current Québec retail availability remains unestablished.

No recipe was changed or linked. No active form, measure, conversion, yield, or substitution rule was added.

## Verification

Static bundled-package normalization and validation, generated-index freshness, ledger schema and source-link checks, focused picker projections, recipe-corpus fingerprint, UTF-8/no-BOM, and whitespace checks passed. The recipe corpus remains 114 files / 1,123 ingredient rows with digest `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. The catalog has 1,343 references; the ledger has 1,654 records, 6,363 source entries, 5,340 distinct source IDs, 342 measurement observations, and 192 substitution findings. No app, unit, instrumentation, or emulator tests were run because the changes add database JSON data.

A6, Section F, and Section P remain open for later gaps. See the [WP02 proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round11-sajjalu.md), [WP03 proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round11-puffed-rice-regional-aliases.md), and [WP04 proposal](../../proposals/wp04-section-p-next-fish-gap-review-20261013-round11.md).
