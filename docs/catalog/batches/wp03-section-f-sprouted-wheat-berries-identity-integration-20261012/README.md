# WP03 Section F sprouted wheat berries identity integration (2026-10-12)

Added identity-only `sprouted wheat berries / grains de blé germés` as
`ingredient-ref-sprouted-wheat-berries` in `GRAIN_AND_CEREAL`. It represents whole wheat kernels
that were sprouted, dried back to shelf-stable moisture, and sold as a cooking grain or for milling.
Kept it distinct from unsprouted wheat berries, wheat germ, sprouted wheat flour, living sprouts or
wheatgrass, and other processed wheat products. No aliases, forms, active measures, density, unit
mappings, yields, recipe links, conversions, or substitutions were added.

Added five source entries and an accepted identity decision to the research ledger. The Healthy Planet
493 g listing's `1/4 cup dry = 50 g` is preserved as a source-specific retailer portion observation
only. The retailer listed the product as out of stock; its cup convention and filling method are
unstated. General measurement research remains `blocked_pending_evidence`, active density is null,
and unit mappings are empty. Manufacturer preparation and replacement suggestions remain contextual
source claims and do not create forms, yields, or substitutions.

The 114-file manifest corpus / 1,123 ingredient rows has no candidate match, so recipe data did not
change. Static seed-package validation, normalization checks, generated-index freshness, ledger
validation, normalized ownership, recipe scan, UTF-8/no-BOM, mojibake, and whitespace checks passed.
At the time of this integration, the package had 1,311 ingredient references; the ledger had 1,619 records, 5,909 source entries, and 4,930 distinct source IDs. The five new source IDs each occur once. No app tests or
emulator checks were run because this change only adds database JSON data and regenerates the
import-audit index. Broader Section F work remains open.

See the [round6 review proposal](../../proposals/wp03-section-f-next-gap-review-20261012-round6.md)
for source-by-source evidence and naming boundaries.
