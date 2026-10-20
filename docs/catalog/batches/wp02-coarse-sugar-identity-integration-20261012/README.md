# WP02 Section C coarse-sugar identity integration — 2026-10-12

## Decisions

- Added identity-only `coarse sugar / sucre à gros cristaux` as `ingredient-ref-coarse-sugar`, separate from granulated sugar and pearl sugar.
- Linked only Recipe 049 ingredient row 11 (`Coarse sugar, for sprinkling`). Kept the existing recipe wording and translated notes unchanged; the source row has no quantity or unit.
- Kept `sucre cristallisé` and `sucre cristal` out of aliases because they can overlap with the generic granulated-sugar identity. Kept `sanding sugar`, `decorating sugar`, and `sucre décoratif` with pearl sugar.
- Added no forms, measurements, density, unit mappings, conversions, yields, or substitutions.

## Evidence

- OQLF, [sucre à gros cristaux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360533/sucre-a-gros-cristaux): Québec display, exact English equivalent, decoration use, and crystal-size distinction from granulated sugar.
- Canadian Sugar Institute, [Types of Sugar](https://www.sugar.ca/sugar-basics/types-of-sugar?lang=en): coarse sugar and pearl sugar are separate products; pearl sugar is described as lumps of refined sugar particles.
- CFIA, [List of ingredients and allergens on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens): Annex 1A lists coarse sugar separately from pearl sugar (sanding sugar).
- McCall’s, [Coarse Sugar Red](https://www.mccalls.ca/Ingredients/COLORED-SUGAR/sugar-coarse-red-5kg.html): one Canadian decorative coarse-sugar product; its color and stated crystal size remain product-specific.
- Sally’s Baking Addiction, [Homemade Strawberry Shortcake](https://sallysbakingaddiction.com/easy-homemade-strawberry-shortcake/): recipe publisher lists coarse sugar for sprinkling on shortcake biscuits without an amount.

Detailed locators and limits are in the research ledger entry `ingredient-ref-coarse-sugar` and [the review proposal](../../proposals/wp02-coarse-sugar-identity-review-20261012.md).

## Snapshot and ownership audit

The pre-integration package contained 1,255 references, 94 forms, 66 legacy candidates, 1,564 research-ledger records with 5,472 source entries / 4,510 distinct source IDs, and 114 manifest-listed recipes. Pre-integration SHA-256 values:

| Artifact | SHA-256 before integration |
|---|---|
| `ingredient-references.v1.json` | `d05f2d2ef59a9862ab5cbe69501e857f5ee7dfe0747e88284447b64d1e1fdcf8` |
| `ingredient-forms.v1.json` | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | `fefdb8d64fd00372f35fbcb29b79211221b7f439d280233ac5af05be94b1b157` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Exact normalized phrase ownership was checked across active reference displays and aliases, form labels and match terms, legacy candidates, and ledger evidence. Before integration, `coarse sugar` and `sucre à gros cristaux` had no owner; after integration each is the matching canonical display. The two ambiguous French phrases remain inactive. The manifest-ordered recipe audit found exactly one coarse-sugar ingredient row: Recipe 049 row 11. Its post-integration corpus has 114 files / 1,123 ingredient rows / 753,792 bytes and fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Static verification

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py` completed with 0 package parts changed; package check and validate-only passed.
- `python3 -B tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed at 1,256 references.
- Research-ledger JSON Schema validation passed; the ledger now has 1,565 records / 5,477 source entries / 4,515 distinct source IDs.
- Exact-owner, recipe-demand, UTF-8/no-BOM, final-newline, trailing-whitespace, and `git diff --check` checks passed.
- No app tests, Android instrumentation tests, emulator checks, or deployment were run. The updated `AGENTS.md` rule exempts changes limited to database JSON data from testing.
