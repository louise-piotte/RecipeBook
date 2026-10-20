# R136 WP02, WP03, and WP04 catalog gap integration

Integrated the reviewed proposals for tigernut starch, fresh-market Poblano, and Icelandic scallop on 2026-10-15.

## Decisions

- **WP02 Section 04 B3 — tigernut starch:** hold the isolated starch fraction outside active references and the research ledger. The reviewed studies concern laboratory fractions, while current Canadian/Québec product evidence found whole-tuber flour rather than a standalone starch product; a product-specific Québec French name remains unsupported. No catalog JSON changed for this hold.
- **WP03 Section L — Poblano:** add `poblano pepper / piment poblano` with only the qualified aliases `poblano peppers` and `poblanos`, plus a `fresh` form. Keep dried Ancho outside the fresh reference/form pending a separate identity-versus-form review. Store Metro/Food Basics’ 226 g item listing and Mayrand’s approximate 450 g unit as separate retailer-specific observations. Add no reusable measure, conversion, substitution, or recipe link.
- **WP04 Section P — Icelandic scallop:** add identity-only `Icelandic scallop / pétoncle d’Islande` for *Chlamys islandica*, with species-qualified aliases. Keep MAPAQ’s 7–25 g muscle range as a source-reported observation only; add no form, density, mapping, conversion, recipe link, or substitution.

## Evidence packets

- [WP02 tigernut-starch hold proposal](../../proposals/wp02-section-04-b3-tigernut-starch-boundary-review-r136-20261015.md)
- [WP03 Poblano proposal](../../proposals/wp03-section-l-poblano-pepper-identity-review-r136-20261015.md)
- [WP04 Icelandic-scallop proposal](../../proposals/wp04-section-p-next-gap-review-r136-20261015.md)

## Package state

The bundled catalog contains **1,490 references** and **110 forms**. The research ledger contains **1,835 records**, **7,678 source entries**, and **6,534 distinct source IDs**. The manifest still lists **114 recipes / 1,123 ingredient rows**; no recipe file or ingredient row changed. Section 04 B3, Section L, and Section P remain open.

Static package, reference, generated-index, ledger-schema, source-ID, picker-projection, recipe-corpus, encoding, local-link, and whitespace checks passed. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run because the active changes only add database JSON data under the updated `AGENTS.md` rule; the tigernut decision is documentation-only.
