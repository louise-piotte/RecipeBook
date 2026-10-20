# WP02 green plantain flour alias integration

## Decision

Added `plantain flour` and `farine de plantain` as search aliases on the existing
`ingredient-ref-green-plantain-flour` reference. Its canonical names remain `green plantain flour` /
`farine de banane plantain verte`; green banana flour remains a separate identity. No form, recipe
link, density, unit mapping, conversion, yield, or substitution was added.

Le Pro 1600's bilingual Mountain Delight pages use both proposed labels and describe the product as
finely ground, dried green plantains. Épicerie La Hacienda in Laval uses the same bilingual wording
for the same brand and package size. This evidence supports aliases for that green product and does
not make unqualified plantain flour a universal name for every plantain-flour product. The proposal
also retains the boundary against broad banana-flour terms and fufu blends.

Sources: [WP02 plantain flour review](../../proposals/wp02-plantain-flour-boundary-review-20261011.md).

## Files and verification

Updated the reference JSON, its generated Kotlin search index, the existing plantain-flour ledger
record, the global plan, and the roadmap. Package totals remain 1,031 references / 72 forms / 114
recipes / 1,123 ingredient rows. The shared ledger now has 1,323 records / 4,319 source entries /
3,552 distinct source IDs after this integration and the yeast-spread hold.

Passed `normalize_bundled_seed_package.py --check` and `--validate-only`, the ingredient-reference
normalizer check, and the generated-index freshness check. Research-ledger schema validation passed;
the exact aliases resolve to this row only, and the recipe bundle has no matching plantain-flour or
yeast-spread demand. Targeted UTF-8/no-BOM, whitespace, and `git diff --check` checks passed. No tests
or emulator run were needed for the database JSON data update.
