# WP05 Section V — Named fruit-juice integration

**Date:** 2026-10-12  
**Disposition:** Five source-specific identities integrated; generic juice and unrequested product states remain held.

## Integrated identities

Added identity-only references for:

| English | Québec French | Category |
| --- | --- | --- |
| apple juice | jus de pomme | `FRUIT` |
| grape juice | jus de raisin | `FRUIT` |
| grapefruit juice | jus de pamplemousse | `FRUIT` |
| orange juice | jus d'orange | `FRUIT` |
| pineapple juice | jus d'ananas | `FRUIT` |

Each new reference has only the same-fruit ready-to-use aliases `(... juice) from concentrate`,
`reconstituted (... juice)`, `jus de (fruit) fait de concentré`, and `jus de (fruit) reconstitué`.
The existing lemon and lime juice references received the equivalent bounded aliases. Canada's
current standard defines these reconstituted juices as water added to concentrate from the same
named fruit. The water-removed concentrate remains a distinct product and was not added without
exact recipe demand.

The catalog continues to hold generic `fruit juice`, generic nectar, source-unspecified concentrates,
fruit blends, juice drinks/cocktails, sparkling juice, cranberry and cherry juice, and brand-specific
bottled lemon/lime wording. Generic `nectar` is also a search-substring collision with nectarine, and
the broad phrase `fruit juice` occurs inside monk-fruit juice concentrate. No broad aliases were
added.

## Recipe and numeric audit

The 114-recipe corpus contains 13 juice-word rows. Twelve remain linked to their current specific
owners; recipe 007#5 remains the unlinked `vinegar or lime juice` alternative. No row requests any of
the five new juices or a from-concentrate product, so no recipe link changed. No forms, density,
unit mappings, conversions, package yields, or substitutions were added. Regulatory density intervals
for apple and grape juice were not activated as cooking measures.

## Evidence and validation

The proposal records the full candidate/owner audit and product-state limits:
[`wp05-section-v-fruit-juice-residual-products-sweep-20261012.md`](../../proposals/wp05-section-v-fruit-juice-residual-products-sweep-20261012.md).
The current CFIA English and French Volume 10 standards define all five names and the same-fruit
reconstitution boundary. OQLF confirms the Québec apple, grapefruit, and orange terms; its usage
guidance also covers apple, grape, and orange juice names.

After integration, the package contains 1,181 ingredient references, 85 forms, 114 recipes / 1,123
ingredient rows, 66 legacy candidates, and 1,481 ledger records / 4,945 source entries / 4,038
distinct source IDs / 8 unit conversions. Package normalization, generated-index freshness, ledger
schema validation, normalized exact-key ownership, UTF-8/no-BOM, and scoped whitespace checks passed.
No app tests or emulator checks were run because the change only adds database JSON data.
