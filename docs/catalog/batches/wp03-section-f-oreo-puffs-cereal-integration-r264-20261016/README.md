# WP03 Section F R264 — OREO PUFFS cereal integration

Integrated the [R264 review proposal](../../proposals/wp03-section-f-oreo-puffs-cereal-identity-review-r264-20261016.md).

## Decision

Added `ingredient-ref-oreo-puffs-cereal` as identity-only `OREO PUFFS cereal / Céréales OREO PUFFS` in `GRAIN_AND_CEREAL`. This is one named Canadian, formulated, ready-to-eat cereal product. Keep it separate from Oreo cookies, plain puffed grains, cereal components, and other branded cereal products.

The reference has no aliases, forms, density, or unit mappings. Do not add `Post`, `Oreo`, `puffs`, `cookies and cream`, or ingredient-list wording as aliases. No recipe links, conversions, yields, or substitutions were added.

## Package and recipe demand

The research ledger records the 283 g package only as SKU-specific net mass; it is not a household measure, density, or conversion. The manifest-listed bundle contains 114 recipes and 1,123 structured ingredient rows and has no OREO PUFFS mention or ingredient-reference demand.

## Integration record

- Added five R264 source entries and one package observation to the research-ledger record.
- Updated the Section F checklist, plan integration log, and roadmap. Broader Section F coverage remains open.
- Static seed-package normalization and validation, generated-index freshness, ledger schema and source ownership, picker projection, recipe-corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests or emulator checks were run; `AGENTS.md` exempts changes that only add database JSON data from testing.

## Evidence

Post Consumer Brands Canada's current English and French product pages identify OREO PUFFS as its Canadian cereal product and list 283 g. Metro Québec and Maxi Québec list the same product with French cereal descriptions and the matching package mass. The current manufacturer directory places the product in its Canadian cereal brand lineup. The proposal and ledger retain source URLs and limitations.
