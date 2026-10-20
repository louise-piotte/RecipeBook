# WP03 Section K — lotus-leaf wrapper integration (R127)

Added `lotus leaves / feuilles de lotus` as a distinct `VEGETABLE_AND_AROMATIC` plant-part identity,
with only the singular aliases `lotus leaf` and `feuille de lotus`. It is separate from lotus root,
lotus-seed products, banana leaves, corn husks, and other wrappers. The category does not claim that
the wrapper is eaten.

Added one `dried` form, `dried lotus leaves / feuilles de lotus séchées`, based on the explicitly dry
Canadian online listing. The local Pointe-Claire dim-sum menu supports Québec use and French wording;
Marché FuTai's Montréal-area 400 g item does not specify whether the leaves are fresh or dried, so no
fresh form was added. The dry listing does not establish Québec availability.

No density, count measure, unit mapping, rehydration ratio, fresh-to-dried conversion, yield, recipe
link, or substitution was added. The 114-recipe / 1,123-row bundle has no matching lotus-leaf demand.
Seven source IDs `WP03-K-LOTUS-LEAVES-IDENTITY-20261015-R127-S01` through `S07` support the identity;
the dried-form ledger record reuses the review and dry-product sources.

After the combined R126/R127 integration, static package validation, reference normalization,
generated-index freshness, picker projection, recipe-corpus scan, source-ID ownership, UTF-8/no-BOM,
local-link, and scoped whitespace checks passed. Final package totals are 1,476 references, 107 forms,
1,819 ledger records, 7,533 source entries, and 6,406 distinct source IDs. The bundle remains 114
recipes / 1,123 ingredient rows. No tests were run because this only adds database JSON data under
`AGENTS.md`.

See the [proposal](../../proposals/wp03-section-k-lotus-leaves-wrapper-identity-review-r127-20261015.md).
