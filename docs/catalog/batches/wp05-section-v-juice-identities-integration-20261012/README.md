# WP05 Section V — juice identities integration

- **Date:** 2026-10-12
- **Disposition:** integrated three identity-only references; the broader Section V item remains open
- **Source proposal:** `docs/catalog/proposals/wp05-section-v-fruit-and-vegetable-juices-followup-20261012.md`

## Decisions

Added:

- `coconut water / eau de coco`, with no aliases, as `SAUCE_AND_CONDIMENT` to align with the plain-water identity. OQLF distinguishes it from commercial coconut beverage and culinary coconut milk.
- `tomato juice / jus de tomates`, with no aliases, as `VEGETABLE_AND_AROMATIC`.
- `vegetable juice / jus de légumes`, as `VEGETABLE_AND_AROMATIC`, with only `mixed vegetable juice` and `jus de légumes mélangés` as aliases.

The current CFIA standard separates vegetable juice from tomato juice and gives concentrated tomato juice a separate standard. The OQLF entries supply the Québec French/English term pairs. Keep coconut water distinct from coconut beverage, culinary coconut milk, and plain water; keep tomato juice distinct from vegetable juice, tomato cocktail, tomato concentrate, paste, and sauce. Generic fruit juice, nectar, concentrates, drink/cocktail products, and `100% juice` claims remain held.

All 114 manifest-listed recipes / 1,123 ingredient rows were audited. The 13 existing juice-related rows retain their current links; no row matched coconut water, tomato juice, or vegetable juice. No forms, recipe links, measurements, density, unit mappings, conversions, yields, or substitutions were added. The ledger uses source IDs `WP05-FRUIT-JUICE-20261012-S02`, `S08`, `S09`, and `S10` from the proposal’s source register.

## Validation

At this oil/juice checkpoint, before the later stock/broth follow-up, the package had 1,169 references / 85 forms / 114 recipes / 1,123
ingredient rows; 67 legacy candidates; and 1,470 research-ledger records / 4,909 source entries /
4,017 distinct source IDs / 8 unit conversions. Package validation and normalization, ingredient
reference normalization, generated catalog freshness, ledger validation, exact-key ownership,
recipe scan, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run
because this change only adds database JSON data under `AGENTS.md`.

See the companion [deodorized coconut-oil integration](../wp05-section-s-deodorized-coconut-oil-integration-20261012/README.md).
