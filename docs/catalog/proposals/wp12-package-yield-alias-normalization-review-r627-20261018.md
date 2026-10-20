# WP12 package-yield alias normalization review — R627 — 2026-10-18

## Review outcome

The parser's unit-field path already mapped `tin` and `tins` to `IngredientPackageType.CAN`, while its free-text package-expression path could return a separate `TIN` value. The French compound phrase `boîte(s) de conserve` was also missing from parts of the parser's alias handling. This left equivalent supported package terms inconsistent across recipe input fields.

Normalize `tin` and `tins` to `CAN` in free text, trim punctuation-normalized aliases, and accept accented/unaccented singular and plural `boîte(s) de conserve` in both free text and explicit unit fields. Keep original recipe wording unchanged. This is a code-only parser correction: no database catalog data, schema, source record, package yield, or UI string changed.

## Review and coverage

The new `canAndTinAliasesNormalizeConsistentlyAcrossTextAndUnitFields` unit test checks English can/tin aliases and accented/unaccented French singular/plural conserve phrases across text and unit fields. The focused `PackageYieldConverterTest` class passed all 12 tests.

On Pixel 9a / Android 16, `PackageYieldInteractionTest` passed both tests:

- `drainedPackageYieldIsQualifiedAndLocalizedInRecipeDetails`
- `declaredCanAmountIsDisplayedWithLocalizedPackageNote`

The APK assembled, installed, and launched. A screenshot of the recipe list showed all 114 bundled recipes. The package-yield instrumentation test exercised the detail interaction.

## Remaining WP12 work

Serving-scaling preservation is still open. No inverse drained-mass-to-package-count estimate is offered. These checks do not close WP12.

## Files

- Parser: `app/src/main/java/app/recipebook/data/local/recipes/PackageYieldConverter.kt`.
- Unit coverage: `app/src/test/java/app/recipebook/data/local/recipes/PackageYieldConverterTest.kt`.
- Architecture note: `app/src/main/java/app/recipebook/data/local/recipes/DESIGN.md`.
- Integration note: [`package alias review integration README`](../batches/wp12-package-alias-review-integration-r627-20261018/README.md).

No new external source was required; the review concerns consistency among the existing accepted parser aliases and the package identity model.
