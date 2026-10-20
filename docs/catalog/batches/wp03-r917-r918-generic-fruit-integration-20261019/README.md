# WP03 R917–R918 generic fruit integration

## Scope

This batch covers generic culinary ingredient diversity across ingredient types. Commercial brand,
product-line, flavour-family, SKU, and retailer-variant rosters are out of scope because commercial
product counts do not add ingredient diversity. The Section F cereal-mix parent remains open for
generic grain diversity; its commercial-roster portion remains out of scope. The active queue scan
found no other roster-only task. Existing branded references remain in place, and no product-only
evidence was generalized without a transferability review.

## Integrated decisions

- Added `ingredient-ref-sweet-cherries` (`sweet cherries / cerises douces`) and
  `ingredient-ref-sour-cherries` (`sour cherries / cerises acides`) as identity-only `FRUIT`
  references for the OQLF-defined *Prunus avium* and *Prunus cerasus* classes.
- Preserved generic `ingredient-ref-cherries`, its pitted form, recipe 029's generic link, and both
  dried-cherry identities. The publisher's 460 g / 1 lb amount remains attached only to the recipe
  source; no general measure, yield, or conversion was derived.
- Added generic `ingredient-ref-dried-citrus-peel` (`dried citrus peel / écorce d’agrumes séchée`)
  as an identity-only `SAUCE_AND_CONDIMENT` reference. It remains separate from generic citrus zest,
  dried orange zest, and candied lemon/orange peel.
- The dried-peel reference has no aliases, forms, recipe links, measurements, conversions, yields, or
  substitutions. The detailed mandarin guidance and the MSU method that removes pith remain scoped
  to those sources.
- Existing references and recipe text were not deleted, merged, renamed, or relinked. No product
  roster was researched.

## Validation

- Bundled package validation passed: `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`.
- Package and reference normalization checks passed with `--check`.
- Generated catalog check passed at 1,942 references.
- Research ledger schema validation passed with zero errors; duplicate record IDs, duplicate
  observation IDs, and source-ID/URL conflicts: zero.
- The package still contains 114 manifest-listed recipes and 1,123 ingredient rows. Recipe 029#1
  remains linked to generic `ingredient-ref-cherries`; neither new cherry identity nor the dried
  citrus-peel identity is linked to a bundled recipe.
- UTF-8, no-BOM and JSON Unicode-escape checks passed. Scoped local-link and `git diff --check`
  checks passed.
- No software tests, build, emulator, or deployment were run. The catalog change adds JSON data;
  `AGENTS.md` says testing is not needed for database JSON-only additions. The generated Kotlin
  catalog was refreshed from the canonical JSON references.

## Sources and proposals

- [R917: generic sweet and sour cherry subtypes](../../proposals/wp03-section-m-generic-cherry-subtype-review-r917-20261019.md)
- [R918: generic dried citrus peel](../../proposals/wp03-section-m-generic-dried-citrus-peel-review-r918-20261019.md)

Other generic fruit-product work remains open under Section M.
