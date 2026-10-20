# WP02 A7 R437 / WP04 Section P R438 / WP06 Europe R439 integration

Integrated on 2026-10-17 after root review of [R437](../../proposals/wp02-section-a7-quinoa-grits-boundary-review-r437-20261017.md), [R438](../../proposals/wp04-section-p-breaded-butterfly-shrimp-product-identity-review-r438-20261017.md), and [R439](../../proposals/wp06-europe-san-marzano-pdo-tomato-identity-review-r439-20261017.md).

## Decisions

- **R437 — quinoa grits:** keep `quinoa grits` / `quinoa grit` unallocated. A research-milled fraction does not establish a Canadian/Québec retail product or product-matched French name. Keep prepared `gruau de quinoa` with the cooked whole-quinoa dish; do not invent `semoule de quinoa` or transfer whole-quinoa portions. No active reference, alias, candidate, source entry, form, measurement, recipe link, conversion, yield, or substitution was added.
- **R438 — breaded butterfly shrimp:** add identity-only `breaded butterfly shrimp / crevettes en papillon panées` as `ingredient-ref-breaded-butterfly-shrimp` in `PROTEIN`, with only the product-title variants listed in the proposal. Keep species, generic breaded shrimp, frozen/cooked states, coconut and popcorn variants, and shrimp balls distinct. The ledger records verified identity, `researched_no_supported_value` measurement state, and `not_yet_researched` substitution state. No form, measurement observation, recipe link, conversion, package yield, or substitution rule was added. The two CFIA sources in proposal-local S02 reuse `WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S03` (Fish List lookup) and `WP04-ABALONE-20261011-S03` (common-names guidance); neither source URL was duplicated.
- **R439 — San Marzano PDO tomatoes:** add identity-only `Tomates pelées San Marzano AOP / San Marzano PDO peeled tomatoes` as `ingredient-ref-pomodoro-san-marzano-pdo` in `VEGETABLE_AND_AROMATIC`, with only the official registered name and qualified market-attested aliases. Keep generic tomatoes, Canadian `San Marzano Type` products, sauces, passata, and other tomato products distinct. The ledger records verified identity, `researched_no_supported_value` measurement state, and `not_yet_researched` substitution state. No form, measurement observation, recipe link, conversion, package yield, or substitution rule was added.

## Catalog and picker effects

- Active references: **1,733**, up from 1,731. Ingredient forms remain at **141**.
- The ledger contains **2,092 records**, **9,500 source entries**, **8,050 distinct source IDs**, and **6,766 distinct URLs**. R438 adds eight source IDs and reuses two existing CFIA sources; R439 adds seven source IDs.
- The bundle remains **114 recipes / 1,123 ingredient rows**. The corpus has no quinoa-grits, breaded butterfly shrimp, or San Marzano PDO demand; no recipe line was changed.
- R438 makes the scoped English and French product queries selectable. Broad `shrimp` grows from five to six results, `crevettes` from nine to ten, and `papillon` adds a second result beside moth beans.
- R439 resolves `San Marzano` to the qualified PDO row and adds one result to `tomatoes` (3 to 4) and `tomates` (6 to 7). Existing generic canned forms remain attached to generic tomatoes; unqualified recipe text is not automatically linked.
- R437 adds no `quinoa`, `grits`, or `gruau` result.

## Validation

- Bundled seed package normalization and validation passed; the ingredient-reference normalizer reports no pending changes.
- Research-ledger validation passed with no errors. The new source IDs and record ownership were checked; bilingual name and alias keys resolve only to their respective new references.
- The generated `BundledIngredientCatalog.kt` index is current at **1,733 references**.
- All **114** manifest-listed recipes and **1,123** ingredient rows were parsed. The candidate phrase scan found no matches. The corpus remains **753,988 bytes**, with manifest-order fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`.
- UTF-8/no-BOM, escaped-Unicode JSON, local links, and scoped whitespace checks passed.
- No app tests, builds, emulator checks, or deployment were run because the integration only adds database JSON data and documentation under `AGENTS.md`.

## Snapshot hashes

- References: `b4c37afbd4e7f6c8806ac38217a6d6bf4a7834e204117d155295e52918a5144f`
- Forms: `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed`
- Research ledger: `9e763b2c2cbcde85a989ef8a73aff58e51fb58fbd0a3a026355737c23eb23460`
- Generated Kotlin index: `d47d4bf3364d8843e9858bec7ed9f482f02eba2a22235f3fd9c6d2f705dc6fb3`

WP02 A7, WP04 Section P, and WP06 Europe remain open for their other grain-milling, seafood, and regional-identity gaps.
