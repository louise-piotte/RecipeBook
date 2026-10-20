# Coarse and extra-coarse bulgur forms

## Integration record

- **Integrated:** 2026-10-10
- **Scope:** Add the bilingual federal No. 3 coarse and No. 4 extra-coarse grind classes under the existing `ingredient-ref-bulgur` identity.
- **Package result:** Added `ingredient-form-bulgur-coarse-grind` / `coarse bulgur` / `boulgour gros` and `ingredient-form-bulgur-extra-coarse-grind` / `extra coarse bulgur` / `boulgour extra gros`. Both are dry forms with empty match terms and no density.
- **No recipe edits:** The 114 bundled recipes contain no bulgur or boulgour ingredient lines.

## Naming and boundaries

The federal bilingual food-purchase specification pairs No. 3 `Coarse / gros` and No. 4 `Extra coarse / extra gros`. A Québec packer lists coarse bulgur locally, while the source page heading misspells the product as “Boulgur Gros”; that typo is not adopted. Canadian retail and Duru manufacturer pages support the marketed English extra-coarse product. The catalog uses the federal bilingual descriptors as the grade labels, not as global numeric aliases.

Do not assign generic `very coarse bulgur` or `boulgour très grossier` to No. 4. The federal No. 5 `Half Cuts / extra large grind / mouture très grossière`, Bob’s “very coarse,” and Duru’s brand-specific grades do not have a supported crosswalk. Keep these names and numbers out of forms and aliases. Preserve the distinct `blé concassé / cracked wheat` identity.

## Measurements and substitutions

The sources do not provide dry mass per standardized household volume for either form. Cooking water ratios and cooked-yield guidance are product-specific and omit a transferable dry-volume basis. Broad grain/rice substitute language lacks a recipe role, method, or replacement ratio. No density, unit mapping, cooking-yield conversion, form-to-form conversion, or substitution rule was added.

## Evidence

The detailed proposal is [`wp02-bulgur-coarse-very-coarse-quebec-review-20261010.md`](../../proposals/wp02-bulgur-coarse-very-coarse-quebec-review-20261010.md). The 12 reviewed sources are recorded in the research ledger under `WP02-BULGUR-COARSE-QUEBEC-20261010-S01` through `S12`.

## Package checks

The final shared-package counts and fingerprints are recorded in the [WP04 butter integration snapshot](../wp04-butter-products-integration-20261010/README.md#package-snapshot): 853 ingredient references, 47 forms, and 1,099 research-ledger records. The 114 bundled recipes contain no bulgur lines, so these new forms have no recipe-picker line to inspect.

- Package normalization, ingredient-reference normalization, generated-index freshness, and ledger validation passed; the ledger had no validation errors.
- Python bundled-seed package tests: 29 passed. Android unit tests: 349 passed, 0 failed. Connected instrumentation: 30 cases, 28 passed, 2 skipped, 0 failures/errors.
- `tools/deploy_to_pixel9a_emulator.sh` passed its test/build steps, installed the debug APK, and launched the app on a disposable Pixel 9a / Android 16 API 36 clone. Seed loading and navigation were checked on-device; the original AVD data image remained unchanged. See the [shared Pixel screenshots](../wp04-butter-products-integration-20261010/README.md#verification).
- `git diff --check` passed.
