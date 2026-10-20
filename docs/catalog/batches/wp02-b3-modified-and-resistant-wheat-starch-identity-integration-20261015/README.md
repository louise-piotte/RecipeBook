# WP02 Section 04 B3 modified and resistant wheat starch integration (2026-10-15)

## Decision

Integrated two distinct, identity-only flour-and-starch references after the separate R121 and R122
reviews:

- `ingredient-ref-modified-wheat-starch`: **modified wheat starch / amidon de blé modifié**. The
  French display follows current CFIA wording and is also present on a bilingual Canadian food
  label. Keep aliases empty so the ordinary and modified starch identities remain distinct.
- `ingredient-ref-resistant-wheat-starch`: **resistant wheat starch / amidon résistant de blé**.
  This row is limited to Health Canada's cross-linked, phosphorylated resistant-starch class. Keep
  the broad Canadian label wording on the modified-wheat-starch row; it does not distinguish the
  resistant subtype.

Both rows have empty alias arrays, null density, empty unit mappings, and no forms, recipe links,
conversions, yields, or active substitutions. The modified row's measurement and substitution
research remains `not_yet_researched`. The resistant row is marked
`researched_no_supported_value` and `researched_no_supported_substitute`; its industrial product
specifications and bread-study replacement levels remain bounded to their sources, with no kitchen
measure or reusable recipe rule recorded.

The picker returns ordinary, modified, and resistant wheat starch for broad `wheat starch` searches.
The exact qualified phrases resolve to their respective rows. `amidon de blé` returns ordinary and
modified wheat starch; `amidon de froment` remains on ordinary wheat starch. The broad
`modified starch` and `amidon modifié` queries remain unassigned. The manifest-listed bundle has no
matching wheat-starch ingredient rows, so no recipe links were added.

## Review records

- [R121 modified-wheat-starch proposal](../../proposals/wp02-b3-r121-modified-wheat-starch-identity-review-20261014.md)
- [R122 resistant-wheat-starch proposal](../../proposals/wp02-b3-r122-resistant-wheat-starch-identity-review-20261015.md)

## Verification

- Bundled package and ledger validation passed: `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`.
- Reference ordering check passed: `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`.
- Generated index is current: `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` (1,467 references).
- Bundle remains at 114 recipes and 1,123 ingredient rows; totals are 1,467 references, 105 forms, and 1,808 research-ledger records with 7,463 source entries and 6,341 distinct source IDs.
- No app, Gradle, instrumentation, emulator, or deployment tests were run. Under the updated `AGENTS.md` rule, testing is not needed for changes limited to new database JSON data; the static checks above validate package, ledger, normalization, and generated-index consistency.

Section 04 B3 remains open for other regional starches and product-boundary reviews.
