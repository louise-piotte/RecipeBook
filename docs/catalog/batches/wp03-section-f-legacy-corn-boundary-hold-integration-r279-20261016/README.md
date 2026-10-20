# WP03 Section F R279 — generic corn identity rejection

## Decision

Rejected the unresolved legacy `ingredient-ref-corn` (`corn / mais`) as a separate recipe-ready identity. The bare crop term does not distinguish loose kernels, ears, dry field-corn kernels, hominy, or other corn-derived products. Do not create a generic active reference, add a bare `corn` alias to the kernel reference, or map the candidate automatically to `ingredient-ref-corn-kernels`.

Removed the ID from `legacy-import-identities.v1.json`, which holds unresolved candidates, and kept its stable-ID record in the research ledger with `identityState: rejected` and a source-backed rejected decision. The legacy list now has 60 candidates. No active ingredient reference, alias, form, recipe link, measure, conversion, yield, or substitution changed.

## Evidence and limits

This integration closes the scoped review under the still-open [Section F identity and terminology item](../../../RecipeBook-global-ingredient-catalog-plan.txt#L528). The [proposal](../../proposals/wp03-section-f-legacy-corn-identity-boundary-review-r279-20261016.md) records current picker results, recipe demand, and the candidate/ownership audit.

The OQLF defines `maïs` broadly for the plant and its grain and separately names `maïs en grains / kernel corn`. Health Canada's CNF code 2068 is one cooked, drained yellow sweet-corn entry that covers with-cob and off-cob presentations; its listed portions do not establish a generic corn conversion. Health Canada's chowder recipe explicitly requests `maïs en grains` and permits fresh or frozen kernels. The bundle has no bare-corn ingredient line, so no recipe link or legacy mapping is justified.

## Validation

- The research ledger JSON parses and validates against its schema; the corn candidate records the two reused OQLF source IDs and two new Health Canada source IDs.
- The unresolved legacy JSON parses, contains 60 candidates, and its `candidateCount` matches the array length.
- No software tests, builds, or emulator checks were run. The changes are limited to database JSON records and documentation; static JSON and ledger validation is recorded above.
