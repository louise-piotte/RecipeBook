# WP03 Section F R265 — Gorilla Munch cereal integration

Integrated the [R265 review proposal](../../proposals/wp03-section-f-gorilla-munch-cereal-identity-review-r265-20261016.md).

## Decision

Added identity-only `ingredient-ref-gorilla-munch-cereal` as `EnviroKidz Organic Gorilla Munch cereal / Céréales Gorilla Munch (EnviroKidz)` in `GRAIN_AND_CEREAL`. This names one formulated, ready-to-eat cereal product. Keep it distinct from plain puffed corn, popcorn, cornmeal, corn flakes, cereal components, and other EnviroKidz cereals.

The row has no aliases, forms, density, unit mappings, recipe links, conversions, yields, or substitutions. Keep the French display provisional pending independent Québec review. Do not add `maïs soufflé` or `maïs éclaté`: OQLF reserves those terms for popcorn, and the active picker already assigns them to `ingredient-ref-popcorn`.

## Package observations and recipe demand

The 650 g and 284 g manufacturer package units are retained only as product-specific ledger observations; they do not establish household measures, density, or conversions. The 114-recipe, 1,123-row bundle has no Gorilla Munch mention or ingredient link. The manufacturer's separate recipes are not RecipeBook bundle links.

## Integration record

- Added one reference and an identity ledger record. Allocated the two Canadian manufacturer source IDs and reused the existing Metro Québec and OQLF source IDs.
- Updated the Section F checklist, plan integration log, proposal status, and roadmap. Broader Section F coverage and independent Québec display review remain open.
- Static package normalization/validation, generated-index freshness, ledger schema/source ownership, picker projection, recipe-corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests or emulator checks were run because this change only adds database JSON data and documentation under `AGENTS.md`.

## Evidence

Nature's Path's Canadian product pages identify the Gorilla Munch cereal and its package options. Metro Québec lists the matching 650 g product. The [OQLF `maïs soufflé` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358440/mais-souffle) defines the term as popcorn, so it remains outside this row. The proposal and ledger retain the source URLs and qualifications.
