# WP04 Section P — pink-salmon identity integration (R103)

Reviewed and integrated on 2026-10-14. Section P remains open.

## Change

Added identity-only `pink salmon / saumon rose` as `ingredient-ref-pink-salmon` for *Oncorhynchus gorbuscha*, with no aliases. OQLF prefers `saumon rose` for Québec fish-product marketing, and the CFIA Fish List assigns that species to its separate pink-salmon names. Keep the row distinct from chum/keta salmon and other taxa.

Preserved recipe 077#10 as generic `salmon fillets without skin`, with its existing reference link and quantity unchanged. The recipe does not identify a species. Added nine source records and three decisions to the new reference's ledger record; the ledger retains nine CNF observations for their source-specific raw, baked/broiled, and salted-canned food codes. These values do not create active measures, density, mappings, conversions, or a cooking yield. No form, recipe link, yield, or substitution rule was added.

## Picker and recipe boundary

The static phrase-first picker projection returns pink salmon for `pink salmon` and `saumon rose`; generic `salmon` / `saumon` returns the generic fillets, chum, and pink rows. `salmon fillets` / `filet de saumon` remains on the generic row, while chum-qualified terms remain on the chum row.

The manifest lists 114 recipe files and 1,123 ingredient rows. The only salmon recipe line is 077#10 and remains generic; no pink-salmon phrase or species link occurs in the bundle.

## Verification

Bundled-reference normalization, package normalization and validation, ledger-schema validation, generated-index freshness, picker projection, recipe scan, and scoped whitespace checks passed. The JSON uses escaped non-ASCII text and UTF-8 without BOM. No app, Gradle, instrumentation, or emulator tests were run because the only active change adds database JSON data.

See the [R103 source and identity review](../../proposals/wp04-section-p-pink-salmon-identity-review-r103-20261014.md).
