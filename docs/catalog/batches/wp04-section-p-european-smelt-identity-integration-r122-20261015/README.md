# WP04 Section P R122 — European smelt identity integration

## Decision

Add identity-only `ingredient-ref-european-smelt` as `European smelt / éperlan européen` for *Osmerus eperlanus*. CFIA supplies the qualified English/French fish name pair, and a Canadian supplier identifies an edible product under this species. OQLF’s current Québec fish-product entry keeps bare `éperlan` with *O. mordax*, so both alias arrays stay empty. Accent-folded matching of the qualified displays means broad `smelt` and `éperlan` searches now surface both species.

Mayrand’s Québec listing remains generic and was not assigned to this row. Its approximate package size is not a recipe measure. No form, density, unit mapping, recipe link, conversion, yield, or substitution was added. The 114-recipe / 1,123-row bundle has no matching smelt demand.

The six proposal sources `WP04-SECTIONP-EUROPEAN-SMELT-R122-20261015-S01` through `S06` are recorded on the ingredient-reference ledger entry. See the [review packet and source register](../../proposals/wp04-section-p-european-smelt-picker-boundary-review-r122-20261015.md). Measurement and substitution states record that review found no supported reusable value.

## Verification

Static package and ledger validation, reference normalization, generated-index freshness, picker projection, exact-name ownership, source-ID uniqueness, recipe-corpus boundary, UTF-8/no-BOM, local-link, and scoped whitespace checks are recorded after integration. No Gradle, application, instrumentation, emulator, or deployment tests were run because the only database change adds JSON data under `AGENTS.md`.

At integration, the package contains 1,469 ingredient references, 105 forms, 1,810 ledger records, 7,475 source entries, and 6,353 distinct source IDs; the recipe bundle remains 114 recipes / 1,123 ingredient rows. Section P remains open.
