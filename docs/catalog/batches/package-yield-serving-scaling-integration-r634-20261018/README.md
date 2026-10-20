# WP12 R634 — Package yield under serving scaling

**Status:** Implemented and verified on 2026-10-18.

## Change

Recipe-detail serving scaling now scales the structured package count used by package-yield display. It leaves declared package size and unit, package type, qualifiers, packing medium, requested basis, and the stored original ingredient expression unchanged. Reset recalculates from the stored recipe at scale factor 1.

The display remains an evidence-qualified estimate for the exact package-yield observation. This change does not add inverse mass-to-package-count estimates.

## Verification

- Focused `RecipeDetailScreenTest`: 21 tests passed, including a test that verifies scale changes only package count and reset restores the stored amount.
- Focused Pixel 9a profile / Android 16 `PackageYieldInteractionTest`: 3 tests passed. The new UI test showed 480 g drained beans at four servings and restored 240 g after reset while preserving `1 x 15 oz can` and the drained basis.
- The repository deploy script stopped at the project-wide unit gate: 431 tests completed with 11 existing catalog and picker search-boundary failures. It stopped before assembly or install.
- The already-built debug APK was installed and launched manually on the connected Android 16 emulator. The bundled library loaded to 114 recipes and a home-screen screenshot was captured at `/tmp/recipebook-validation.png`.

The broader unit failures remain outside this serving-scaling change. The focused unit and emulator interaction tests passed.
