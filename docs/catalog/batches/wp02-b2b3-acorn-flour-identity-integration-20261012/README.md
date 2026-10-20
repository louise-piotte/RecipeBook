# WP02 B2/B3 acorn flour identity integration (2026-10-12)

Added identity-only `acorn flour / farine de glands de chêne` as `ingredient-ref-acorn-flour` in
`FLOUR_AND_STARCH`, scoped to human-food flour from edible oak fruits/acorn kernels. Added no English
aliases; retained four source-attested French product phrases: `farine de chêne`, `farine de chênes`,
`farine de noix de chênes`, and `farine de glands de chêne du Québec`. Kept it separate from acorn
squash, extracted acorn starch, acorn meal, and animal feed. No forms, recipe links, yields, conversions,
or substitution rules were added.

Added nine external source records and three decisions to the research ledger. USDA SR28 NDB 12060
reports 1 oz = 28.35 g for `Nuts, acorn flour, full fat`; this remains a food-code-specific portion
observation only. General measurement research remains `blocked_pending_evidence`, default density is
null, and unit mappings are empty. Reviewed manufacturer guidance and bread studies support no reusable
substitution rule; substitution research is marked `researched_no_supported_substitute`.

The full 114-file manifest corpus / 1,123 ingredient rows has no acorn-flour match or acorn-squash
link. Static seed-package validation, reference normalization, generated-index freshness, ledger schema,
normalized ownership, recipe scan, UTF-8/no-BOM, mojibake, and whitespace checks passed. The package
has 1,312 references; the ledger has 1,620 records, 5,918 source entries, and 4,939 distinct source
IDs. Each of the nine new source IDs occurs once. No app tests or emulator checks were run because this
change only adds database JSON data and regenerates its index. Broader WP02 B2/B3 work remains open.

See the [round5 proposal](../../proposals/wp02-b2b3-next-gap-review-20261012-round5.md) for the full
source register and product-boundary review.
