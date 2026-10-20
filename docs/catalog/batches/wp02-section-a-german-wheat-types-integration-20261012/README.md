# WP02 Section A German wheat-flour type integration — 2026-10-12

Integrated the five identity-only types from the [Section A residual-flour proposal](../../proposals/wp02-section-a-residual-flour-gap-sweep-20261012.md). The existing country-qualified milling classes remain distinct, with no conversion or equivalence inferred.

## Accepted changes

- Added `ingredient-ref-german-type-405-flour`, `ingredient-ref-german-type-550-flour`, `ingredient-ref-german-type-812-flour`, `ingredient-ref-german-type-1050-flour`, and `ingredient-ref-german-type-1600-flour` as `FLOUR_AND_STARCH` identities.
- Kept the type number and Germany qualifier in both display names. The French names use `farine de blé de type N (Allemagne)` as descriptive catalog constructions. An independent Québec French review accepted the five displays and confirmed that the country qualifier avoids implying a crosswalk; see the [review report](../wp02-section-a-german-flour-quebec-display-review-20261012/README.md). OQLF does not attest these complete German-grade phrases.
- Added only the literal German product label as an English-array search alias for each identity. French aliases remain empty. All five entries have no density, unit mappings, forms, recipe links, or substitutions.
- Added 30 source entries across the five new ledger records and two source entries plus an unresolved decision to the existing whole-wheat-meal ledger record. That hold keeps Backschrot 1700 separate from the active flour and whole-wheat-meal rows; it creates no new reference.
- German sources identify the type number as mineral/ash content rather than fineness. DIN Media's public listing confirms the current DIN 10355 standard and its scope, but does not expose the full type table or class thresholds. Manufacturer pages support the individual product labels, including two separate Type 812 listings. No national-grade crosswalk is inferred.
- The manifest-ordered recipe corpus has no proposed type phrase, German product-label, or Backschrot 1700 line match. No recipe link or demand inference was added.

## Validation snapshot

- The package contains 1,233 ingredient references, 86 forms, and 114 recipes / 1,123 ingredient rows.
- The research ledger contains 1,531 records, 5,263 source entries, and 4,305 distinct source IDs; schema validation passed with zero errors.
- Seed-package validation, ingredient-reference normalization, generated Kotlin catalog freshness, normalized-key ownership, recipe phrase scan, UTF-8/no-BOM, and scoped whitespace checks passed.
- The manifest-ordered recipe corpus remains 752,993 bytes with digest `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.
- No tests or emulator checks were run. This integration adds database JSON data; the current `AGENTS.md` exempts such changes from testing.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 1,233 | `0a0336b7429232a4a48eb344c266d8e5ba94aa587047186c2bd56b6af62b6e0d` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy-import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,531 | `d26175916691ffa17d6ac3b7b79edf8d08afcfbe2da0d26411b52bc2211cc9fa` |
| Generated Kotlin references | 1,233 | `3b7d7141bcc3692b255e2e37b0b5c9d5de6bbbe49c53036eb89553e682d57795` |
| Manifest | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The independent Québec review accepted the current descriptive French grade constructions. The broader Section A regional-flour checklist and any research into the nonpublic DIN type table remain open.
