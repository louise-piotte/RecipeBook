# R138 WP02, WP03, and WP04 catalog gap integration

Integrated the three reviewed proposals on 2026-10-15.

## Decisions

- **WP02 Section 04 B3 — jackfruit seed starch:** hold the isolated *Artocarpus heterophyllus* seed-starch fraction outside active references and the research ledger. Primary studies establish a research fraction and a sauce-specific application, but no current Canadian/Québec standalone human-food product or supported product-specific Québec French name was found. No catalog JSON changed for this hold.
- **WP03 Section L — Anaheim pepper:** add `Anaheim pepper / piment Anaheim` with the scoped aliases `Anaheim peppers` and `piment d’Anaheim`, plus one explicit fresh form. Keep the retailer's 113 g figure and CFIA sample count out of reusable measurements. Keep Hatch/New Mexico dried products and Metro's Anaheim-or-Cuban wording separate; no substitution or recipe link was added.
- **WP04 Section P — Japanese sea cucumber:** hold *Apostichopus japonicus* outside active references and the ledger. CFIA and WoRMS document a bilingual species name, but the local supplier listing does not identify the binomial, and adding `bêche-de-mer japonaise` would make broad `bêche-de-mer` a singleton in the picker. No catalog or ledger JSON changed for this hold.

See the [WP02 proposal](../../proposals/wp02-section-04-b3-jackfruit-seed-starch-boundary-review-r138-20261015.md), [WP03 proposal](../../proposals/wp03-section-l-anaheim-pepper-identity-review-r138-20261015.md), and [WP04 proposal](../../proposals/wp04-section-p-next-gap-review-r138-20261015.md) for sources, exact boundaries, and reconsideration conditions.

## Package state and verification

The bundled catalog contains **1,493 ingredient references** and **113 forms**. The research ledger contains **1,838 records**, **7,704 source entries**, and **6,560 distinct source IDs**. The manifest lists **114 recipes / 1,123 ingredient rows**; no recipe file or ingredient row changed.

Static package normalization and validation, reference normalization, generated-index freshness, research-ledger validation, R138 source-ID ownership, Anaheim picker projection, recipe-corpus scan, encoding, local-link, and scoped whitespace checks passed. No app, Gradle, unit, instrumentation, emulator, or deployment tests were run: the catalog update only adds database JSON data, and the two holds are documentation-only. Sections 04 B3, L, and P remain open.
