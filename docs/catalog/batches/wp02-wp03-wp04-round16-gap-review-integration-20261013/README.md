# WP02 / WP03 / WP04 round-sixteen gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — pearl-millet regional names:** Added `sajje` to `ingredient-ref-pearl-millet` and the exact flour phrase `sajje hittu` to `ingredient-ref-pearl-millet-flour`. Kept `sajje flour`, French variants, other transliterations, forms, active measures, recipe links, and substitutions unchanged. Reused the existing IIMR and Kalagura sources; added the Karnataka agriculture policy and the secondary Silkrute listing as limited supporting ledger sources. Silkrute's selected options were out of stock and its direct page fetch was unavailable, so it is corroboration only.
- **WP03 Section F — barri:** Added only `barri` to the English aliases for `ingredient-ref-common-millet`. IIMR maps Hindi Barri to proso millet, and A1's current Barrie listing pairs Proso Millet with `Chena / Cheno / Barri`. Preserved `millet commun`, the flour row, measurements, forms, recipe links, and substitutions. Reused existing source IDs and URLs; no duplicate source records were added.
- **WP04 Section P — winter flounder:** Held winter flounder / plie rouge (*Pseudopleuronectes americanus*) outside active references and the research ledger. Its supported English display includes `flounder`, which would make the broad query a misleading one-species result under the current picker; CFIA lists Flounder for many taxa. No recipe demand offsets that picker problem. No active or ledger row was added.

## Shared data changes

The active reference package has **1,344 references** and **98 forms**. It gained three aliases on existing rows; no new reference or form was created. `BundledIngredientCatalog.kt` was regenerated from the reference JSON.

The research ledger remains at **1,657 records** and now has **6,421 source entries** and **5,379 distinct source IDs**. It retains **342 measurement observations** and **195 substitution findings**. The two new source entries are attached to the existing pearl-millet grain and flour records. The existing common-millet record now documents the accepted `barri` alias using already registered sources.

No recipe files or recipe links changed. The recipe corpus remains 114 files / 1,123 ingredient rows with fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Verification

- Bundled seed-package normalization and validation passed.
- Generated ingredient-catalog index freshness passed.
- Research-ledger JSON Schema validation passed.
- Focused changed-key picker projections and source-ID/URL checks passed, including `barri`, `sajje`, `sajje hittu`, and unchanged broad millet results.
- Recipe corpus fingerprint, UTF-8 without BOM, local Markdown links, and changed-file whitespace checks passed.
- No app, unit, instrumentation, or emulator tests were run. The shared data changes only add database JSON data, so tests were not needed under the updated workspace rule. The winter-flounder hold is documentation-only.

The active plan and roadmap record the dispositions. WP02 A6, WP03 Section F, and WP04 Section P remain open. See the [WP02 Sajje proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round16-sajje-pearl-millet.md), [WP03 Barri proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round16-barri-alias.md), and [WP04 winter-flounder proposal](../../proposals/wp04-section-p-winter-flounder-identity-boundary-review-20261013-round16.md).
