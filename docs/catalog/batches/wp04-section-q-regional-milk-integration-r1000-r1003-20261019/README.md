# R1000–R1003 regional milk identity integration

Integrated 2026-10-19 from the review in [`wp04-section-q-regional-milk-identity-review-r1000-r1003-20261019.md`](../../proposals/wp04-section-q-regional-milk-identity-review-r1000-r1003-20261019.md).

## Changes

- Added identity-only camel milk / `lait de chamelle`, yak milk / `lait de yak`, mare milk / `lait de jument`, and donkey milk / `lait d'ânesse` in `DAIRY_AND_ALTERNATIVE`.
- Added only the OQLF/FAO-supported mare and donkey English aliases. No commercial products or variants were researched.
- Added four verified identity ledger records with measurement and substitution states left `not_yet_researched`; no forms, measures, recipe links, conversions, yields, or active rules were added.
- Kept species comparisons, composition values, raw/fermented context, and dairy-product processing source-scoped. Preserved all existing milk, camelid, fermented-dairy, branded, and product-specific rows and evidence.
- Reconfirmed that roster-only product work is out of scope across ingredient types because commercial-product counts do not add ingredient diversity. No new roster-only task was found in the reviewed queue.

## Validation

Pre-integration exact-name scans found no owner in 2,014 references, 205 forms, 2,420 ledger records, 55 legacy identities, or 114 recipe files / 1,123 ingredient rows. Post-integration checks passed at 2,018 references, 205 forms, 2,424 ledger records, and 114 recipes / 1,123 ingredient rows:

- `normalize_bundled_seed_package.py --validate-only` and `--check` passed; the latter confirmed the package is already normalized. The package check includes the research-ledger schema and source-ID ownership validation.
- `generate_bundled_ingredient_catalog.py` regenerated the derived index, and `--check` confirmed it is current at 2,018 references.
- Eleven exact bilingual/alias terms each have exactly one expected identity owner. No related forms, legacy identities, or recipe lines were found.
- UTF-8/no-BOM, 20 local Markdown links, and scoped `git diff --check` passed.

No software tests, build, emulator, or deployment were run for these JSON database additions under `AGENTS.md`.
