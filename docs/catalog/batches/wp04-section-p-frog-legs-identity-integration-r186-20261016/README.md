# WP04 Section P frog-legs identity integration (R186)

Added identity-only `frog legs / cuisses de grenouille` as `ingredient-ref-frog-legs` in `PROTEIN`.
The row represents edible frog leg cuts sold as food, without assigning a species or representing
whole frogs. Singular aliases are `frog leg` and `cuisse de grenouille`; current Aliments DKL English
and French pages use those exact product titles, and OQLF pairs the standard plural terms.

Mayrand’s current Québec listing places frog legs under frozen seafood but conflicts between its
900 g title and 800 g unit/case details. Congélo O Kilo’s Québec page describes frozen skinless legs
but leaves the 16–20 count basis unclear and has conflicting availability text. Aliments DKL lists
a frozen 2 kg box as two 2.2 lb bags. These are SKU-level claims only. No species, origin, general
frozen/cooked form, measure, density, count mapping, yield, or preparation rule was inferred.

The research ledger records the OQLF terminology and four seller-page sources. Measurement state is
`researched_no_supported_value`; substitution state is `researched_no_supported_substitute`. The full
114-recipe / 1,123-row corpus has no matching demand. No forms, recipe links, conversions, yields, or
substitution rules were added. The nearby smoked-cod identity remains a separate fish product group.

Static package, normalized-reference, generated-index, ledger/schema/source-ownership, picker,
recipe-corpus, encoding, and scoped whitespace validation passed. Totals after integration are
1,566 references, 122 forms, 1,911 research-ledger records / 8,220 source entries / 7,020 distinct
source IDs / 5,814 URLs; 114 recipes / 1,123 ingredient rows. No software tests were run because this
change adds database JSON data under `AGENTS.md`.

See the [R186 proposal](../../proposals/wp04-section-p-frog-legs-identity-boundary-review-r186-20261016.md)
for the source register, picker projection, scope limits, and reopen conditions.
