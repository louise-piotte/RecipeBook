# WP03 Section M — fruit pitting form integration

**Date:** 2026-10-11

## Change

- Added pitted-only forms for generic dates, Medjool dates, and cherries.
- Added source-specific ledger observations for RICARDO’s `425 g (2½ cups)` pitted/chopped/lightly packed Medjool dates and Baking With Butter’s `460 g (1 lb)` fresh-or-frozen pitted cherries.
- Linked the existing USDA SR28 `1 pitted Medjool date = 24 g` observation to the Medjool pitted form without changing the observation.
- Preserved all recipe text, amount, units, ingredient references, and preparation. No active unit conversions, densities, yields, or substitutions were added.

## Boundaries

- The generic dates form records pitting only. Local product sources describe dried date products, but recipe 058#2 does not say dried; the form does not resolve that state or assign a variety.
- Recipe 024#1’s chopping and light-packing state does not become a reusable form. Recipe 029#1 retains its fresh/frozen options; no thawing, draining, or before/after-pitting mass basis was inferred.
- The MAPAQ listing’s `5 units = 40 g` is specific to its organic Deglett product and was not imported.
- The recipe portions remain source-specific observations. They do not create general cup, pound, count, or pitting-yield conversions.

## Validation

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- `git diff --check`
- UTF-8/no-BOM and mojibake scan

The checks passed. The current package has 1,016 references / 69 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,299 records / 4,180 source entries / 3,424 distinct source IDs / 8 unit conversions. The generated reference index remains current at 1,016 references.

No tests were run because this change adds database data only, as allowed by `AGENTS.md`.

## Research proposal

See `../../proposals/wp03-section-m-fruit-pitting-form-review-20261011.md` for the exact recipe-line audit, source-to-claim map, and disposition.

