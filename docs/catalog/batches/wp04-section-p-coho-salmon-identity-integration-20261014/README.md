# WP04 Section P — coho-salmon identity integration (R104)

Reviewed and integrated on 2026-10-14. Section P remains open.

## Change

Added identity-only `coho salmon / saumon coho` as `ingredient-ref-coho-salmon` for *Oncorhynchus kisutch*, with no aliases. OQLF prefers `saumon coho` for Québec fish-product naming; CFIA assigns the taxon TSN 161977, and DFO identifies the species. Current Mayrand listings show fresh and frozen coho fillets, but their seller-specific weights do not establish generic forms or measures.

Kept recipe 077#10 on the generic salmon-fillets reference with its existing 675 g quantity. Added seven evidence sources and three decisions to the new identity ledger record. Six raw-farmed or baked/broiled-wild CNF portions remain source-code-specific ledger observations only. No forms, active measures, density, mappings, recipe links, conversions, yields, or substitutions were added.

## Picker and recipe boundary

The phrase-first picker projection returns the coho row for `coho salmon`, `saumon coho`, and `coho`; broad `salmon` and `saumon` queries return four rows: chum, coho, pink, and generic salmon fillets. `salmon fillets` and `filet de saumon` remain on the generic row. The full manifest-listed bundle has 114 recipe files and 1,123 ingredient rows, with no coho-specific demand.

## Verification

Bundled-reference normalization, package normalization and validation, ledger-schema validation, generated-index freshness, picker projection, recipe scan, and scoped whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because the active change adds database JSON data.

See the [R104 source and identity review](../../proposals/wp04-section-p-coho-salmon-identity-review-r104-20261014.md).
