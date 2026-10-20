# WP02 / WP03 / WP04 round-eight gap-review integration

**Date:** 2026-10-13

## Integrated decisions

- **WP02 A6 — `jowar atta`:** added the exact English alias to `ingredient-ref-sorghum-flour`. The French display and aliases, forms, density, unit mappings, measurement state, substitution state, and recipe links remain unchanged. Sources are ICAR–IIMR and two Canadian retail listings.
- **WP03 Section F — maize arraw:** added identity-only `ingredient-ref-maize-arraw`, displayed as `arraw (corn granules) / arraw de maïs`. It has no aliases, forms, active measures, density, mappings, recipe links, or substitutions. Measurement research found no supported reusable value; substitution research remains open. The existing millet arraw remains separate.
- **WP04 Section P — saffron cod:** held *Eleginus gracilis* outside the active picker. CFIA's French `Morne Boréale` and DFO's `navaga jaune` do not resolve the local display, while the latter would cause the broad `navaga` query to select this one species. No catalog or ledger row was added.

## Review records

- [WP02 A6 proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round8.md)
- [WP03 Section F proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round8.md)
- [WP04 Section P proposal](../../proposals/wp04-section-p-next-fish-gap-review-20261013-round8.md)

## Validation

Static seed-package normalization/validation, generated catalog freshness, ledger schema and ID checks, focused ownership and picker projections, full bundled-recipe scan, UTF-8/no-BOM checks, and scoped whitespace checks passed. The catalog updates are database JSON changes with a regenerated data index. No app, unit, instrumentation, or emulator tests were run; the saffron-cod hold was documentation-only.
