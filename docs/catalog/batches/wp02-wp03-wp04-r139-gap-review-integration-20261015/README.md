# R139 WP02, WP03, and WP04 catalog gap integration

Integrated the three reviewed proposals on 2026-10-15.

## Decisions

- **WP02 Section 04 B3 — pearl-millet starch:** hold the isolated starch fraction outside active references and the research ledger. Primary studies establish a research material, but the reviewed Canadian/Québec evidence supports grain, flour, and blended products rather than a standalone pearl-millet-starch product; no product-specific Québec French term was established. No catalog JSON changed for this hold.
- **WP03 Section L — Hatch-type pepper:** keep the checklist wording unallocated pending a clear choice between Hatch-grown chile and a broader Hatch-style/New Mexican-type product. NMSU defines Hatch by growing origin, the Canadian fresh listing does not identify origin, and Québec French listings found here describe prepared products. No catalog or ledger JSON changed for this hold.
- **WP04 Section P — European flat oyster:** add identity-only `European flat oyster / huître plate` for *Ostrea edulis*, with the qualified alias `European oyster`. Keep `Belon` as supplier-specific wording, broad oyster/huître terms out of aliases, and the generic fresh-oyster candidate and Olympia hold separate. Add no form, measure, conversion, yield, recipe link, or substitution.

See the [WP02 proposal](../../proposals/wp02-section-04-b3-pearl-millet-starch-boundary-review-r139-20261015.md), [WP03 proposal](../../proposals/wp03-section-l-hatch-type-pepper-boundary-review-r139-20261015.md), and [WP04 proposal](../../proposals/wp04-section-p-european-flat-oyster-identity-product-boundary-review-r139-20261015.md) for sources, picker projections, exact boundaries, and reconsideration conditions.

## Package state and verification

The bundled catalog contains **1,494 ingredient references** and **113 forms**. The research ledger contains **1,839 records**, **7,708 source entries**, and **6,564 distinct source IDs**. The manifest lists **114 recipes / 1,123 ingredient rows**; no recipe file or ingredient row changed.

Static package normalization and validation, reference normalization, generated-index freshness, research-ledger validation, R139 source-ID ownership, picker projection, recipe-corpus scan, encoding, local-link, and scoped whitespace checks passed. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run: the catalog update only adds database JSON data, and the two holds are documentation-only. Sections 04 B3, L, and P remain open.
