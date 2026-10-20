# WP03 Section F Raisin Bran family identity integration (R189)

Met the R188 reopen condition by adding standard Kellogg's Two Scoops Raisin Bran / Kellogg's Raisin
Bran Deux Pelletées and Raisin Bran Crunch / Raisin Bran Deux Pelletées Croquantes together as
separate identity-only `GRAIN_AND_CEREAL` references. Each row has a distinct Québec retailer-title
alias in French: `Raisin Bran Céréales format familial` for standard and
`Raisin Bran Céréales croquantes` for Crunch. Broad `Raisin Bran` and `Deux Pelletées` searches return
both products by their canonical names, and the French `Raisin Bran Céréales` family phrase returns both
by the distinct retailer aliases. `Raisin Bran cereal` also returns both through substring fallback against
those French aliases; no English alias was added. Crunch-qualified searches return Crunch alone.

Recorded the manufacturer SmartLabel nutrition servings only as UPC-specific ledger observations:
1 cup (55 g) for standard Raisin Bran, UPC `00059724102514`, and 1 cup (57 g) for Crunch, UPC
`00064100148109`. The manufacturer does not specify the cup-fill convention, so neither amount is an
active measure, density, or reusable conversion. The bundle has no matching demand across 114 recipe
files and 1,123 ingredient rows. No forms, recipe links, conversions, yields, or substitutions were
added.

Static package, ledger/schema, generated-index, picker, corpus, encoding, source-ID, and scoped
whitespace checks passed. No software tests were run because this change only adds database JSON
data. See the [R189 family review](../../proposals/wp03-section-f-raisin-bran-deux-pelletees-family-identity-review-r189-20261016.md)
for the source register, current ownership, query projection, and product-specific evidence.
