# WP04 count, edible-portion, and composition fixture integration

Date: 2026-10-11

## Scope

This batch closes the fixture deliverable left by the WP04 recipe-corpus audit. The new fixtures load the canonical bundled package and exercise actual recipe lines and catalog references. They preserve the boundary between source text and reusable conversion data: a count, package, size, or composition is not converted unless the package contains a supported mapping or yield.

Coverage includes:

- Amaretti's `2 large egg whites (60 g)` and Habitant Pea Soup's `1 large onion` and `4 small carrots`: retain the original count and preparation, and offer no inferred gram conversion.
- Recipe 015#4's one can of beef broth, 089#3's half-box of mushrooms, and 098#1's box of cranberries: package size, count basis, and yield remain unresolved, with no mass conversion offered.
- Magic Cookie Bars' source wording for Eagle Brand condensed milk: preserve the `1 can (300 mL)` product choice and do not infer a mass conversion.
- Recipe-line serialization round trips for product choices, alternatives, ground-meat qualifiers, and a source-stated turkey weight. Tests compare ingredient lines because the existing recipe mapper intentionally normalizes photo paths.
- Python package fixtures that guard these source rows and the absence of unsupported mappings or ground-meat substitutions.

The WP04 audit's three package rows remain unresolved until their household or publisher source and package contents are available. The synthetic 30 g egg-white mapping remains mechanics-only and is not used as evidence for the bundled recipe.

## Verification

- `python3 -m unittest tools.seed_package.test_bundled_seed_package`: 109 tests passed.
- `./gradlew :app:testDebugUnitTest --no-daemon --console=plain`: 415 tests passed.
- `./gradlew :app:connectedDebugAndroidTest --no-daemon --console=plain` on Pixel 9a / Android 16 (API 36): 37 tests total, 35 passed, 2 skipped, 0 failed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`: package already normalized.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`: package valid.
- `./tools/deploy_to_pixel9a_emulator.sh`: build, install, and launch succeeded.
- Manual Pixel 9a navigation opened the bundled Habitant Pea Soup recipe and long-pressed its onion line. The English dialog stated that no supported unit conversions are available. One initial cold launch showed Android's wait prompt; choosing Wait completed startup and the manual check succeeded.
- `git diff --check` is clean for files changed by this batch. The repository already contains unrelated whitespace findings in imported/exported recipe material.

## Pixel 9a evidence

English onion count-line dialog screenshot: [Habitant onion no-conversion](screenshots/habitant-onion-no-conversion.png)

SHA-256: `389e4696034f7fc64f1f0d21a7cc97e3de70797f53a57996ff8b294b775c734b`

No catalog data, recipe text, schema, or runtime conversion behavior changed in this batch; the changes add tests and test data-loading helpers.
