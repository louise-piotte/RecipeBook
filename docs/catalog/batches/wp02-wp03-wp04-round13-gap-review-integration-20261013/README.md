# WP02 / WP03 / WP04 round-thirteen gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — Rala:** added `rala` as an English alias to the existing foxtail-millet grain row from ICAR–IIMR. Held `rala flour`, `rala peeth`, and `rala atta` off the flour row because the only direct Rala Peeth result applies to a sold-out soaked-and-sundried product and is absent from its current visible heading; no Québec flour display was supported. Added an accepted grain-alias decision and an unresolved flour-boundary decision on the existing ledger rows. Updated existing IIMR source entries in place, preserving their IDs. No measurement observation or active measure changed.
- **WP03 Section F — Iburu:** added `iburu` as an English alias to the existing black-fonio grain row for *Digitaria iburua*. Kept the French display, white-fonio row, separate flour rows, forms, measures, and substitution research unchanged.
- **WP04 Section P — shrimp powder:** held `shrimp powder / poudre de crevette` outside active references and forms. Sources span ground dried shrimp, a shrimp-and-salt noodle ingredient, and powder inside a compound seafood base; the Québec standalone listing lacks an ingredient declaration. No catalog or ledger allocation was made.

## Shared data changes

The active reference JSON now has two alias additions on existing rows: `rala` and `iburu`. No reference row or form was added. The generated `BundledIngredientCatalog.kt` was refreshed from the canonical reference JSON. The research ledger remains at 1,655 records and now has 6,390 source entries and 5,357 distinct source IDs; measurement observations remain 342 and substitution findings remain 192. The Rala flour boundary adds one source record and one unresolved decision; the black-fonio alias decision adds three new sources and one reused TERMIUM source occurrence. Existing IIMR and TERMIUM source records were updated in place to include the evidence now cited. No recipe links, unit conversions, measurements, yields, or substitutions were added.

## Verification

Static package normalization/validation, generated-index freshness, ledger schema and focused source-link checks, picker ownership projections, recipe-corpus fingerprint, UTF-8, and whitespace checks passed. No Android tests or emulator checks were run because the active catalog changes add database JSON data; the shrimp-powder hold is documentation-only, consistent with the updated workspace rule.

The active checklist and roadmap record the three dispositions. A6, Section F, and Section P remain open. See the linked WP02, WP03, and WP04 round-thirteen proposals for sources and revisit conditions.
