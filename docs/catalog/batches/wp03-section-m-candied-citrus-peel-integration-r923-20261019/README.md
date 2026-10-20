# WP03 Section M — candied citrus peel integration (R923)

## Decision

Added identity-only generic `candied citrus peel / écorce d’agrumes confite` in `FRUIT`, with only the source-attested plural aliases `candied citrus peels` and `écorces d’agrumes confites`. The generic cross-citrus identity is supported by Bon Appétit and King Arthur Baking culinary sources and by Québec publisher Zeste. Zeste names lemon, orange, or grapefruit as ingredient choices; the English sources likewise document a cross-citrus peel product.

Kept the new identity distinct from candied lemon peel, candied orange peel, dried citrus peel, citrus zest, and dried orange zest. Added no recipe links, forms, density, unit mappings, measurement observations, conversions, yields, or substitutions. Each source recipe's amounts, preparation details, and yield remain scoped to that recipe. Existing branded entries and their product-specific evidence remain unchanged. No brand, product-line, flavour, SKU, or retailer-variant roster was researched.

## Static verification

- Bundled reference count: 1,945; ingredient forms: 204.
- New reference has a unique ID and no normalized name/alias collision.
- Ledger entry is `verified`, with measurement state `researched_no_supported_value` and substitution state `researched_no_supported_substitute`; recipe-specific values were not copied into the ledger.
- Seed package normalization and validation passed; generated index contains 1,945 references.
- Recipe scan: 114 recipes, 1,123 ingredient rows; no exact candied citrus peel ingredient demand, so no recipe link was added.
- UTF-8/no-BOM and local-link checks passed.

No software tests were run: the active catalog change adds database JSON data, with the Kotlin catalog index regenerated from that data, under the exception in `AGENTS.md`.

See the [R923 proposal](../../proposals/wp03-section-m-candied-citrus-peel-boundary-review-r923-20261019.md).
