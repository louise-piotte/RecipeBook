# WP02 / WP03 / WP04 round-fourteen gap-review integration

Date: 2026-10-13

## Dispositions

- **WP02 A6 — Kambu:** reconsidered the earlier evidence-limited hold. Added `kambu` to the existing pearl-millet grain row and `kambu flour` to its existing flour row. Reused the registered IIMR source ID for Tamil Kambu and added the FreshOnTheGo and Shastha Canada product sources. Kept Kambu transliterations, sprouted flour, French aliases, recipe links, forms, measures, and substitutions unchanged.
- **WP03 Section F — Navane:** added `navane` as an English alias to the existing foxtail-millet grain row. Updated the existing IIMR source summaries and added the Singal's and PushmyCart source entries. Retained the French display and separate flour identity; added no flour alias, form, measurement, recipe link, or substitution.
- **WP04 Section P — yelloweye rockfish:** held *Sebastes ruberrimus* outside active references because its display would make broad `rockfish` a one-result query in the current picker. The candidate has no bundled recipe demand. No catalog or ledger allocation was made.

## Shared data changes

The active reference package remains at 1,343 rows and 98 forms. Three aliases were added to existing rows: `kambu`, `kambu flour`, and `navane`. The generated `BundledIngredientCatalog.kt` was refreshed from the canonical reference JSON. No reference row or form was added.

The research ledger remains at 1,655 records and now contains 6,395 source entries and 5,361 distinct source IDs. It has 342 measurement observations and 192 substitution findings, unchanged from round 13. Four new source IDs were registered; the existing IIMR source ID was reused and its foxtail-grain summaries were updated on the grain and flour records. No numeric behavior, recipe links, forms, or substitutions changed.

## Verification

Bundled-package normalization and validation, generated-index freshness, ledger schema validation, focused source-link checks for the R14 records, alias/numeric-field assertions, UTF-8 and whitespace checks, and the unchanged recipe-corpus fingerprint passed. No app, unit, instrumentation, or emulator tests were run because the active changes only add database JSON data and the yelloweye hold is documentation-only, following the updated workspace rule.

A broad source-ID/URL consistency scan also surfaced a pre-existing unrelated reuse of `WP03-S24` for two different Health Canada CNF oat-bran serving URLs. Those oat-bran records were not changed in this batch; R14 source checks were scoped to the changed records and reused IDs.

The active checklist and roadmap record these dispositions. A6, Section F, and Section P remain open. See the [WP02 Kambu proposal](../../proposals/wp02-a6-next-regional-flour-gap-review-20261013-round14-kambu-pearl-millet.md), [WP03 Navane proposal](../../proposals/wp03-section-f-next-cereal-gap-review-20261013-round14-navane-alias.md), and [WP04 yelloweye-rockfish proposal](../../proposals/wp04-section-p-yelloweye-rockfish-picker-boundary-review-20261013-round14.md) for sources and revisit conditions.
