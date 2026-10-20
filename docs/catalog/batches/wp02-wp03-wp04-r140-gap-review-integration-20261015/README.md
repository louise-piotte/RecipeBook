# R140 WP02, WP03, and WP04 catalog gap integration

Integrated the three reviewed proposals on 2026-10-15.

## Decisions

- **WP02 Section 04 B4 — elephant-foot-yam corm flour:** hold *Amorphophallus paeoniifolius* corm flour outside active references and the research ledger. The reviewed Canadian listing was for frozen corm, and no current standalone Canadian/Québec flour product or product-specific Québec French name was established. Suriya et al.'s bulk density and cookie formulation remain study-specific evidence; they do not establish a reusable measure or substitution. Keep this hold separate from R117's isolated-starch candidate and the existing *Dioscorea* yam flour. No database JSON changed for this hold.
- **WP03 Section L — Shishito pepper:** add `Shishito pepper / piment Shishito` with only the English plural alias `Shishito peppers` and one explicit `fresh` form. Keep French plural/retailer-specific qualifiers, `Japanese pepper`, pepperoncini, and Padrón outside the aliases. No bundled recipe demand or reusable measure was found; the farm resemblance and a Cayenne substitution applying to a separate mayonnaise line remain source-scoped.
- **WP04 Section P — bay scallop:** add identity-only `bay scallop / pétoncle de baie` for *Argopecten irradians*, with source-backed English and French plurals. Keep `peigne baie de l'Atlantique` out because CFIA applies it to two *Argopecten* taxa. Describe OQLF's 1998 `Aequipecten sp.` record as genus-level and under-resolved; WoRMS supports the synonymy of *Aequipecten irradians* and *Argopecten irradians*, while the exact French-to-species pairing comes from the 2025 OQLF entry and current product listings. Keep Pêcheries Océanic's `1/2 cup (112 g)` only as a product-specific published-portion observation. No recipe link, active form, reusable measure, conversion, yield, or substitution was added.

See the [WP02 proposal](../../proposals/wp02-b4-elephant-foot-yam-flour-product-boundary-review-r140-20261015.md), [WP03 proposal](../../proposals/wp03-section-l-shishito-pepper-identity-review-r140-20261015.md), and [WP04 proposal](../../proposals/wp04-section-p-bay-scallop-species-picker-review-r140-20261015.md) for source registers, picker projections, exact JSON, and reconsideration conditions.

## Package state and verification

The bundled catalog contains **1,496 ingredient references** and **114 forms**. The research ledger contains **1,841 records**, **7,727 source entries**, and **6,583 distinct source IDs**. The manifest lists **114 recipes / 1,123 ingredient rows**; no recipe file or ingredient row changed.

Static package normalization and validation, reference normalization, generated-index freshness, research-ledger schema validation, source-ID ownership, picker projection, recipe-corpus scan, UTF-8/no-BOM checks, local-link checks, and scoped whitespace checks passed. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run: the only catalog-data changes add JSON records and refresh the generated ingredient index, while the WP02 decision is a documentation-only hold. Sections 04 B3, L, and P remain open.
