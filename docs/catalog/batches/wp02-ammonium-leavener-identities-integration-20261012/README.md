# WP02 ammonium leavener identity integration

Integrated on 2026-10-12 from the [independent baking-ammonia review](../../proposals/wp02-baking-ammonia-ammonium-leaveners-review-20261009.md).

## Catalog changes

- Added `ingredient-ref-ammonium-bicarbonate` / `ammonium bicarbonate` / `bicarbonate d’ammonium` in `BAKING_AND_SPICE`.
- Added English aliases `ammonium hydrogen carbonate` and `acid ammonium carbonate`, plus French aliases `carbonate acide d’ammonium` and `hydrogénocarbonate d’ammonium`.
- Added `ingredient-ref-ammonium-carbonate` / `ammonium carbonate` / `carbonate d’ammonium` as a separate identity-only reference.
- Kept `baker’s ammonia`, `baking ammonia`, hartshorn, salt of hartshorn, and sal volatile unresolved because sources map those common names to different salts or mixtures. Aqueous ammonia remains separate.
- The 114 bundled recipes / 1,123 ingredient rows contain no ammonium-related line. Added no recipe links, forms, measurements, density, unit mappings, conversions, or substitutions. Treat ammonium-carbonate composition as product-specific; do not assume a pure-compound formula or fixed mixture ratio.
- Added re-review source records `WP02-E-AMMONIA-REREVIEW-20261012-S01` through `S12` to the research ledger.

## Resulting snapshot

- Ingredient references: 1,192; SHA-256 `cadcbf8364313c2c8ebe73647082aa66c0648bfad40e8b54528cda451cd48318`.
- Ingredient forms: 86; SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`.
- Research ledger: 1,493 records, 5,009 source entries, 4,086 distinct source IDs, and 8 unit conversions; SHA-256 `1cc991e9f32200ea398dee8b029d5d47b9f1df16731d80944b76e31abddbe59f`.
- Manifest: 114 recipe files; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Legacy import candidates: 66; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`.

Static package validation, ledger schema/evidence validation, reference normalization, and generated-index freshness passed. No tests or emulator checks were run; this integration changes catalog data and its supporting documentation only.
