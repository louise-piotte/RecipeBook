# WP03 Section F: pozole-corn boundary hold

The R114 review keeps `ingredient-ref-pozole-corn` ledger-only in `needs_clarification`. Allzone's
Canadian bulk page distinguishes dried raw kernels for the buyer's lime cook from processed hominy,
but it is a quote-only umbrella listing without a confirmed lot specification or French label.
Mon Épicerie Mexicaine lists `Maíz pozolero` and ships to Québec without stating processing state or
a French display. Casa Sabor's Québec collection lists `Carey – Maïs Pozolero Blanc` without state.
The Montréal Rancho listing identifies a canned, ready-to-serve item as hominy and uses `Maïs
Pozolero Blanco`, so that French wording does not establish the name of raw dry kernels.

Root added the three directly reviewed Canadian/Québec listings to the shared ledger as
`WP03-PZ-QC-RETAIL-R114-20261014-S01` through `S03` and added a new unresolved decision that keeps
the dry product separate from the active `hominy corn / maïs lessivé` identity. The recipe bundle
has no matching ingredient demand. Add no active identity, alias, form, measure, conversion, recipe
link, yield, or substitution. Dry-product Québec French naming remains open.

See the [R114 pozole-corn product-boundary review](../../proposals/wp03-section-f-pozole-corn-product-boundary-review-r114-20261014.md)
and the [research-ledger entry](../../research-ledger.v1.json). Static ledger validation and scoped
encoding, link, and whitespace checks passed. No app tests or emulator checks were run; this change
only adds research data to the JSON ledger and documentation.
