# WP03 Section I crushed-nuts garnish form integration — 2026-10-12

## Decision

Added form `ingredient-form-nuts-crushed` (`crushed nuts / noix concassées`) under the existing
generic `ingredient-ref-nuts` identity and attached it only to recipe 031#4, the optional
species-unspecified garnish. The source recipe also includes named peanut, hazelnut, and almond
variants; those ingredient rows remain linked to their own references and do not use this generic
form.

Preserved the original text `crushed nuts, for topping`, optional state, and missing amount. The
source names the topping but gives no fixed nut species or particle size. No density, measure, unit
mapping, conversion, or yield was added. The form’s French label follows the recipe bundle’s
`noix concassées` wording; no OQLF terminology claim is made.

## Evidence

- [Cooking With Ayeh, Chocolate Dates (3 Flavors)](https://cookingwithayeh.com/chocolate-dates/) names crushed nuts as a topping and presents peanut, hazelnut, and almond versions separately. The recipe supplies no fixed species or quantity for the optional topping.
- The already recorded source entry `WP03-HI-GAP-20261011-S05` in `ingredient-ref-nuts` supports the main recipe’s unspecified crushed-nut garnish. Its ledger locator and support text now include the explicit garnish step; the form decision cites the same source ID.

The broader source and recipe-link decision is in the [generic nuts review](../../proposals/wp03-section-h-i-pulses-nuts-gap-review-20261011.md).

## Static verification

- Bundled package validation, reference normalization, generated-catalog freshness, and ledger validation passed.
- Exact form ownership assigns the English and French labels to `ingredient-form-nuts-crushed`, whose parent is `ingredient-ref-nuts`. Recipe 031#4 links this form; the original wording and optional state remain unchanged. Named peanuts, hazelnuts, and almonds are not linked to it.
- All 114 recipes and 1,123 ingredient rows remain present. The recipe corpus is now 753,051 bytes with manifest-ordered digest `f1435e690f238e09a76bc7fdfcf9b332e72d25760f4952a2c391b8a2d5cdf500` after the single added form link.
- Updated JSON files are UTF-8 without BOM with non-ASCII characters represented as Unicode escapes. No tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,243 references | `9be692678b8bd18ea4e64ef478e27a2c6824a0738a21097192c378a4fa2ad0e9` |
| `ingredient-forms.v1.json` | 87 forms | `20330400c65f80f7ef470ca959bf3b5f1a29886c4d26a6b02fb842108969aa54` |
| `research-ledger.v1.json` | 1,542 records; 5,346 source entries; 4,388 distinct source IDs | `d0dfd1cb48958c06097786ae7883dc25e0c36a4d6a5c135c40ade0e659875518` |
| `BundledIngredientCatalog.kt` | 1,243 generated references | `53ae99d6df20027693b138d6beeb9a0713d908f6b742e42762972a10d949c26e` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,051 bytes | `f1435e690f238e09a76bc7fdfcf9b332e72d25760f4952a2c391b8a2d5cdf500` |

The wider review of nut and seed preparation forms remains open.
