# WP03 hemp-seed butter boundary integration — 2026-10-11

## Decision

Keep hemp-seed butter as an unresolved prepared-food candidate. Cru Nature’s current English and
French product listings name the same Québec-made raw hemp-seed butter, but the product description
does not say whether its pre-germinated seeds are hulled or whole. Keep butter wording off the
separate hulled-hemp-hearts and whole-hemp-seeds identities.

The Manitoba Harvest recipe makes one source-specific spread from hemp hearts and hemp oil. It does
not identify the seeds in Cru Nature’s packaged product or establish a reusable butter formula,
measurement, yield, or conversion. The registered Canadian goods list treats hemp-seed butter as a
named goods category but does not supply its ingredients or hull state. A Québec cosmetic listing
uses bare *beurre de chanvre* for a topical product, so that phrase is not safe as an unqualified
food alias.

## Changes

- Added held ledger record `candidate-hemp-seed-butter` with five scoped sources and an
  `unresolved` decision.
- Kept the active ingredient references, forms, recipes, measurements, conversions, yields, and
  substitutions unchanged.
- Updated the WP03 plan and this proposal with the held result.

The proposal contains the source-to-claim map:
[`wp03-hemp-seed-butter-hull-boundary-review-20261011.md`](../../proposals/wp03-hemp-seed-butter-hull-boundary-review-20261011.md).

## Verification

- Bundled seed package check: normalized; no package file needed rewriting.
- Python package tests: 111 passed.
- Package: 971 references / 61 forms / 114 recipes / 1,123 ingredient rows.
- Research ledger: 1,246 records / 3,905 source entries / 3,197 distinct source IDs / 8 conversions / 0 validation errors.
- The update changes only research evidence and documentation; it adds no app-visible identity or behavior.
