# WP04 Section P — Chinook-salmon identity integration (R108)

Reviewed and integrated on 2026-10-14. Section P remains open.

## Change

Added identity-only `chinook salmon / saumon quinnat` as `ingredient-ref-chinook-salmon` for *Oncorhynchus tshawytscha*. Kept `king salmon` and OQLF-preferred `saumon royal` as aliases. Omitted `saumon roi` and `saumon chinook`, which OQLF says were not retained for fish-product terminology, and omitted `spring salmon` because DFO uses it to describe run timing for some populations.

The current Metro listing identifies an Organic King Salmon Fillet as *O. tshawytscha*, from Northeast Pacific/Canada and farm raised; the selected store showed it out of stock when reviewed. Kept recipe 077#10 on the existing generic salmon-fillets reference with its 675 g quantity. Added six sources, three decisions, and five raw/smoked CNF portions to the identity ledger record. The portions remain code-specific ledger observations only. No forms, active measures, density, mappings, recipe links, conversions, yields, or substitutions were added.

## Picker and recipe boundary

The phrase-first projection returns Chinook for `chinook salmon`, `chinook`, `saumon quinnat`, `quinnat`, `saumon royal`, and `king salmon`. Broad `salmon` and `saumon` queries each expand from five to six rows and retain the generic salmon-fillets row. `salmon fillets` and `filet de saumon` remain on that generic row. Existing chum, pink, coho, and sockeye qualified searches are unchanged. `king` and `royal` remain multi-result queries; `spring salmon` returns no result.

The full manifest-listed bundle has 114 recipe files and 1,123 ingredient rows, with no Chinook-specific demand. Its salmon ingredient remains recipe 077 row 10: 675 g generic salmon fillets without skin, linked to `ingredient-ref-salmon-fillets-without-skin`.

## Verification

Bundled-reference normalization, package normalization and validation, ledger-schema validation, generated-index freshness, ownership and picker projections, recipe scan, and scoped document checks passed. No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and the generated catalog index.

See the [R108 source and identity review](../../proposals/wp04-section-p-chinook-salmon-identity-review-r108-20261014.md).
