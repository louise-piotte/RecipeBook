# WP02 B2/B3 potato-flour French alias integration (2026-10-12)

Added the exact French alias `farine de pommes de terre` to the existing
`ingredient-ref-potato-flour`, retaining the canonical display `potato flour / farine de pomme de
terre`. No reference, form, recipe link, active measure, density, unit mapping, conversion, package
yield, or runtime substitution rule was added. The alias remains distinct from extracted potato
starch; the exact phrase was not added to `ingredient-ref-potato-starch`.

Added seven source records to the potato-flour ledger entry and reused four of those records on the
related potato-starch entry to document the boundary. The ledger records USDA SR28's historical
`1 cup = 160 g` portion only as a source-specific observation. Four King Arthur test-kitchen findings
document cornstarch, all-purpose flour, potato starch, and mashed-potato alternatives in yeast-bread
contexts. These are research records only: no active conversion or substitution rule and no recipe
line link were added. Measurement and substitution research are marked `researched_supported`;
`defaultDensity` remains null and `unitMappings` remain empty. The source cup convention and filling
method are unspecified, and no result is transferred to a Canadian cup or default density.

Rich Products Canada's two bilingual donut ingredient declarations pair English `Potato flour` with
French `Farine de pommes de terre`; both pages are from the same manufacturer and the 85 g values are
finished-donut portions. Galloway's process description and King Arthur's comparison keep whole-potato
flour distinct from extracted potato starch. The broader WP02 B2/B3 review remains open.

The 114-file manifest corpus / 1,123 ingredient rows still has no potato-flour or potato-starch phrase
match or linked recipe row. No recipe data changed. After integration, the package has 1,312 ingredient
references; the ledger has 1,620 records, 5,929 source entries, and 4,946 distinct source IDs. The
seven source IDs introduced by this review are unique; four are referenced on both flour and starch
records.

Static package normalization and validation, ingredient-reference normalization, generated-index
freshness, ledger schema validation, source ownership and recipe-corpus scans, UTF-8/no-BOM,
mojibake, and scoped whitespace checks passed. No app tests or emulator checks were run because this
change only adds database JSON data and regenerates its search index.

See the [round6 review proposal](../../proposals/wp02-b2b3-next-gap-review-20261012-round6.md) for
the source register and product-boundary analysis.
