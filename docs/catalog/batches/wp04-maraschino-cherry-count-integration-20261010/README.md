# WP04 Maraschino Cherry Count Evidence

**Date:** 2026-10-10  
**Status:** Integrated as source-specific evidence; no runtime count conversion.

## Decision

Accepted USDA SR28 NDB 09328's published portion of one canned, drained maraschino cherry at
5.0 g. Recipe 028 has an exact matching line, `16 maraschino cherries, drained and chopped`, mapped
to `ingredient-ref-cerises-au-marasquin`. Chopping does not change the source's one-cherry measure.

Recipe 067's `18 maraschino cherries` line remains unsupported because it does not specify whether
the cherries are drained. The source observation does not establish a weight for cherries retaining
liquid or for an unspecified drainage state. No generic `item` mapping, density, recipe edit, or
inferred 16- or 18-cherry total was added.

## Evidence

- Official source: [USDA ARS Standard Reference Release 28, Food Group 09](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf#page=526), NDB 09328, pp. 525–526.
- Record: *Maraschino cherries, canned, drained*, 0% refuse.
- Published portion: `1 cherry (NLEA serving) = 5.0 g`.
- Canonical source ID: `WP04-MARASCHINO-PORTION-20261010-S01`.
- Ledger relationship: `count_weight`; evidence kind: `published_portion`.
- Proposal and exact recipe-line IDs: `docs/catalog/proposals/wp04-maraschino-cherry-count-portion-review-20261010.md`.

## Files and verification

- Updated `docs/catalog/research-ledger.v1.json` with one source entry, acceptance decision, and one
  source-specific measurement observation. Identity review and substitution research remain
  untouched.
- Added a Python regression check that verifies the observation is restricted to the drained
  source state and that both recipe lines retain their exact source text and mappings.
- Updated the WP04 count-evidence checklist and this batch record. The recipe files, seed references,
  forms, manifest, generated catalog, application code, and UI were unchanged.

Validation passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — 770 references
- research-ledger validator — 988 records, 0 errors
- `python3 -m unittest discover -s tools/seed_package -p 'test_*.py'` — 20 tests passed
- `git diff --check`

No Android or emulator run was needed for this ledger-only evidence update: no bundled app asset,
runtime data, catalog search behavior, or UI changed.

## Package snapshot

- 770 ingredient references; 36 ingredient forms
- 988 ledger records; 2,056 source entries; 1,670 distinct source IDs
- 114 recipes; 1,123 ingredient rows
- Ingredient-reference SHA-256: `086adb131bf0abf4df3b25be430878173ce51a8ac1bcb2191834b4b73b72a4b4`
- Research-ledger SHA-256: `27300b14879b50bcd61ee46955ba8ecb0e05b3b9110e152bb99f24505c710df9`
- Recipe-set digest: `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a`

