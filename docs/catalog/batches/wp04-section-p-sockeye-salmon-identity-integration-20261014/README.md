# WP04 Section P — sockeye-salmon identity integration (R105)

Reviewed and integrated on 2026-10-14. Section P remains open.

## Change

Added identity-only `sockeye salmon / saumon rouge` as `ingredient-ref-sockeye-salmon` for *Oncorhynchus nerka*, with `red salmon` and `saumon sockeye` as sourced aliases. OQLF and CFIA support the Québec names and taxon. Kept `kokani` and `saumon nerka` out because OQLF marks them as contextual and not retained for Québec fish-product terminology. Kept `blueback` out because CFIA assigns that common-name row to coho.

Kept recipe 077#10 linked to generic salmon fillets with its existing 675 g quantity. Added eight sources and three decisions to the new identity ledger record. Ten raw, baked or broiled, and canned CNF portions remain code-specific ledger observations only. No forms, active measures, density, mappings, recipe links, conversions, yields, or substitutions were added.

## Picker and recipe boundary

The phrase-first picker projection returns sockeye for `sockeye salmon`, `sockeye`, `saumon rouge`, `saumon sockeye`, and `red salmon`. Broad `salmon` and `saumon` queries each return five rows: chum, coho, pink, generic salmon fillets, and sockeye. `red` remains multi-result. `salmon fillets` and `filet de saumon` remain on the generic row; existing chum, pink, and coho qualified searches are unchanged.

The full manifest-listed bundle has 114 recipe files and 1,123 ingredient rows, with no sockeye-specific demand. Its salmon ingredient remains recipe 077 row 10: 675 g generic salmon fillets without skin, linked to `ingredient-ref-salmon-fillets-without-skin`.

## Verification

Bundled-reference normalization, package normalization and validation, research-ledger schema validation, generated-index freshness, picker projection, recipe scan, and scoped whitespace checks passed. No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and the generated catalog index.

See the [R105 source and identity review](../../proposals/wp04-section-p-sockeye-salmon-identity-review-r105-20261014.md).
