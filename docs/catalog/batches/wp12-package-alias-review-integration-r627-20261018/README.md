# WP12 package alias review integration — R627 — 2026-10-18

## Change

Aligned the parser's free-text and explicit-unit package aliases. English `can`/`tin` terms now all resolve to `CAN`; accented and unaccented singular/plural French `boîte(s) de conserve` terms resolve to `CAN` in both input paths. Alias normalization trims punctuation, while the recipe's original wording remains authoritative and unchanged.

This was a parser code correction, not a database-JSON addition. The R624–R626 database changes were not covered by software tests.

## Verification

- Focused unit class: `PackageYieldConverterTest`, 12 tests passed.
- Pixel 9a / Android 16 instrumentation: `PackageYieldInteractionTest`, 2 tests passed.
- `:app:assembleDebug` succeeded; the APK installed and launched. The recipe-list screenshot showed 114 bundled recipes.
- The broader `test` task encountered 430 unit tests with 11 failures in existing catalog/picker search-boundary assertions (Japanese mayonnaise, rye, cereal, and recipe-picker cases). It stopped the standard deploy script before that script's assembly/install steps. The targeted package-yield tests passed; these broader catalog failures remain outside R627.

WP12 remains in progress because serving-scaling preservation and inverse package-count evidence remain unresolved.
