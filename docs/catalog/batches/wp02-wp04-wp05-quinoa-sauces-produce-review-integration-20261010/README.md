# WP02, WP04, and WP05 Flour, Produce Portion, and Sauce Review

**Date:** 2026-10-10

## Decisions

- Added `ingredient-ref-roasted-quinoa-flour` as an identity-only `FLOUR_AND_STARCH` reference with the mill-listed English and French names. It has no aliases, forms, measurements, conversions, or recipe links. Independent Québec terminology review remains open. Hattai-ko and mugikogashi remain unresolved because the reviewed evidence does not establish a stable global roasted-barley identity.
- Added identity-only references for pesto, tapenade, anchovy paste, passata, and Piemonte bagna cauda. No forms, measurement data, conversions, yields, substitutions, or recipe links were added. The French display for bagna cauda remains under independent Québec review.
- Verified the existing tomato-sauce and marinara-sauce identities and preserved the exact recipe mappings: recipe 087's marinara line remains linked to `ingredient-ref-marinara-sauce`, and recipe 090's tomato-sauce line remains linked to `ingredient-ref-tomato-sauce`.
- Kept capers and caperberries distinct and routed them to the pickled-products review. `Caprons` is not an active alias. Prepared béchamel and hollandaise remain held candidates because the current Canadian retail examples are dry mixes and the bundled recipes do not identify those products; bare `hollandaise` also collides with existing Dutch-process cocoa search text.
- Audited 44 count-like produce and herb lines across 25 bundled recipes. Five exact values found in the 2015 Canadian Nutrient File remain provisional because Health Canada now publishes the 2026 file and the current measure-weight rows could not be retrieved for comparison. No count-to-mass conversion, portion observation, recipe edit, or inferred size was activated.

The source packets contain the complete line audits, evidence limits, and source links: [WP02 roasted-flour review](../../proposals/wp02-hattai-ko-mugikogashi-boundary-review-20261010.md), [WP04 produce portion review](../../proposals/wp04-wp12-produce-count-edible-portion-gap-review-20261010.md), [WP04 CNF 2026 retrieval follow-up](../../proposals/wp04-wp12-cnf-2026-portion-retrieval-check-20261010.md), and [WP05 cooking-sauce review](../../proposals/wp05-cooking-sauces-exact-recipe-demand-review-20261010.md).

## Package snapshot

| Artifact | Current state | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 759 | `10c86fb2e36756c55ce8005c4dc4daafc7465c0334a0a2f2a5c631d0541f98c1` |
| Ingredient forms | 36 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Seed manifest | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 968 records; 1,996 source links; 1,617 distinct source IDs; 8 unit conversions | `a5608f595f237796c00195bd639e2e438a618d7be487a4f014098a6ed5bb3016` |
| Bundled recipe corpus | 114 files; 1,123 ingredient rows | `d4ba08e849c8f276446433fd1e8c70a78a0b31bd750c0283647e8e5b569604ee` |

The manifest and bundled recipe corpus are unchanged by this integration.

## Verification and remaining QA

- `python3 -m unittest tools.seed_package.test_bundled_seed_package`: 16 tests passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`: passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py`: passed with 0 changed parts.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`: passed; generated index contains 759 references.
- `validate_research_ledger()`: 968 records, 0 errors.
- `./gradlew -g /tmp/recipebook-gradle-home :app:testDebugUnitTest --no-daemon --offline`: all 335 Android unit tests passed.

The repository deploy script's Gradle test and debug assembly stages passed. Pixel 9a live picker navigation and screenshots remain pending because `adb install -r` failed with `INSTALL_FAILED_INSUFFICIENT_STORAGE`; `/data` showed 409 MB free. No app data or AVD image was cleared.
