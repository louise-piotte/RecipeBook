# R137 WP02, WP03, and WP04 catalog gap integration

Integrated the reviewed proposals for breadnut seed starch, Habanero pepper, and Kumamoto oyster on 2026-10-15.

## Decisions

- **WP02 Section 04 B3 — *Artocarpus camansi* seed starch:** hold the isolated seed-starch fraction outside active references and the research ledger. Studies describe research fractions, while the Québec “Breadnut” listing is for unspecified whole produce and no current Canadian standalone starch product or supported Québec French product name was found. No database JSON changed for this hold.
- **WP03 Section L — Habanero:** add `habanero pepper / piment habanero` with only the scoped plural aliases `habaneros` and `habanero peppers`, plus fresh and whole-dehydrated forms. Keep `piment antillais` unresolved against the separate Scotch Bonnet identity. Do not assign a species, cultivar, or fixed heat level; do not add a reusable quantity, conversion, substitution, or recipe link.
- **WP04 Section P — Kumamoto oyster:** add identity-only `Kumamoto oyster / huître Kumamoto` for *Magallana sikamea*, with the source-backed English and French plural aliases. Keep it separate from generic fresh-oyster, Pacific-oyster, Eastern-oyster, and dried-oyster identities. Seacore’s case count and shell size remain supplier-specific facts; add no form, measure, mapping, conversion, substitution, or recipe link.

## Evidence packets

- [WP02 breadnut seed-starch hold proposal](../../proposals/wp02-section-04-b3-breadnut-seed-starch-boundary-review-r137-20261015.md)
- [WP03 Habanero proposal](../../proposals/wp03-section-l-habanero-pepper-identity-review-r137-20261015.md)
- [WP04 Kumamoto oyster proposal](../../proposals/wp04-section-p-next-gap-review-r137-20261015.md)

## Package state

The bundled catalog contains **1,492 references** and **112 forms**. The research ledger contains **1,837 records**, **7,700 source entries**, and **6,556 distinct source IDs**. The manifest lists **114 recipes / 1,123 ingredient rows**; no recipe file or ingredient row changed. Sections 04 B3, L, and P remain open.

Static package normalization and validation, reference normalization, generated-index freshness, research-ledger validation, source-ID checks, picker projection, recipe-corpus scan, encoding, local-link, and whitespace checks passed. No tests were run for the database-JSON additions or documentation-only hold under the updated `AGENTS.md` rule.
