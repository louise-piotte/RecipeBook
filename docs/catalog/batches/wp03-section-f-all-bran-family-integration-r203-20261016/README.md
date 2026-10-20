# WP03 Section F All-Bran family integration (R203)

Added the four separately named Canadian All-Bran cereals as identity-only
`GRAIN_AND_CEREAL` references: Flakes, Original, Buds, and Frosted Bran Flakes. This resolves the
R187 Buds hold by making the full current manufacturer-listed family available to broad `All-Bran`
searches. Each SKU remains distinct from generic bran-flakes cereal, wheat bran, psyllium, and its
three siblings. No aliases, forms, active measures, density, unit mappings, recipe links, conversions,
yields, or substitutions were added.

The manufacturer’s 1/2 cup (36 g) Original, 1/3 cup (28 g) Buds, and 1 cup (44 g) Frosted servings
are retained only as SKU-specific ledger observations. The Flakes product has a 34 g-only
manufacturer serving; an indexed Provigo panel could not be directly inspected, so no household
volume observation was added. Cup conventions are unspecified by the manufacturer. The manufacturer
lists Buds or Original for one named topping recipe; that is not a general substitution. No matching
recipe demand was found in the 114-recipe / 1,123-row corpus.

The French manufacturer family and Where-to-Buy pages list all four products. The English brand page
currently lists three and omits Frosted Bran Flakes, while both current English and French
Where-to-Buy pages list it. The Frosted product detail page is unavailable and Metro’s selected-store
listing was out of stock; this integration makes no local-stock claim. Use the manufacturer’s French
product title `Flocons de son givrés All-Bran`.

The ledger reuses the existing generic bran-flakes product-page and family-page source IDs and the
R187 Buds source IDs, including the named topping recipe. New R203 source URLs have unique IDs; no
duplicate URL was registered under another ID. The plan now records the R187 hold as resolved by
this family addition.

Static bundled-package, schema, generated-index, ownership, picker, corpus, and encoding checks were
run after integration. No software tests or emulator checks were run because the change only adds
database JSON data under `AGENTS.md`. See the [R203 review](../../proposals/wp03-section-f-all-bran-family-review-r203-20261016.md)
and [R187 hold](../../proposals/wp03-section-f-all-bran-buds-family-picker-hold-review-r187-20261016.md).
