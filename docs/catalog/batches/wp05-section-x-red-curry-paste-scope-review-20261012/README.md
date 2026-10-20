# WP05 Section X — red curry paste scope review

- **Date:** 2026-10-12
- **Status:** reviewed boundary subtask; identity ownership remains held pending source provenance or recipe-owner confirmation.
- **Scope:** relation between the active unqualified `red curry paste` reference and Thai red curry paste.

## Decision

Keep `ingredient-ref-red-curry-paste` and its current English/French labels and aliases unchanged. Sources confirm Thai red curry paste as a named product style, and Québec-facing sources attest `pâte de cari rouge thaïe`; they do not establish that the current reference or recipe 095 means that style. Do not add a Thai alias or a second identity without provenance or owner confirmation.

The archived [RecipeKeeper export for recipe 095](../../../exported-recipe-lists/RecipeKeeper_20260320_143058/recipes/processed_095-sat-satay-9ec0ba36-1f7e-47d0-aedc-22ca03a5c672.json) has `sourceUrl: null`. Its bilingual ingredient line says only “store-bought red curry paste” / `pâte de cari rouge du commerce`. The current seed row is also unqualified. The recipe title and dish context do not resolve the paste style.

This closes the bounded product/terminology review. The plan keeps an open follow-up to recover the original source or ask the recipe owner to confirm intent. If neither is available, keep the existing identity unchanged.

## Catalog and recipe effects

- No catalog references, forms, aliases, or recipe links changed.
- The research ledger now records `ingredient-ref-red-curry-paste` as `needs_clarification` with an unresolved identity decision and nine scoped sources.
- No measurement, conversion, yield, or substitution behavior was added.

## Current review snapshot

- 1,190 ingredient references / 86 forms / 66 legacy candidates.
- 114 manifest-listed recipes / 1,123 ingredient rows.
- 1,491 research-ledger records / 4,983 source entries / 4,066 distinct source IDs / 8 unit conversions; ledger SHA-256: `e014f19fdf72353f16ef99adff433ce131eaeef7feafbe2c0e067a659802a914`.
- Recipe-corpus SHA-256: `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`.

## Sources

- Full evidence, limits, exact-name audit, and follow-up conditions: [red curry paste scope proposal](../../proposals/wp05-section-x-red-curry-paste-scope-review-20261012.md).
- Pantainorasingh identifies its [Red Curry Paste](https://pantainorasingh.com/products/red-curry-paste) as Thai red curry paste and made in Thailand. That evidence applies to its own product.
- Ajinomoto Thailand labels its [Ready to cook Red Curry Paste](https://www.ajinomoto.co.th/en/our-product/retail-product/rosdee-menu/ready-to-cook-red-curry-paste/) as having Thai curry taste. That product does not define every unqualified red-paste name.
- SAQ uses `pâte de cari rouge thaïe` in its [Québec French recipe](https://www.saq.com/fr/cari-crevettes-lait-coco). This supports the phrase, not the ownership of recipe 095's row.

This documentation and research-ledger update added no database JSON catalog data; no tests or emulator checks were needed.
