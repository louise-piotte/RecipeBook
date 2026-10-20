# WP03 Section I chopped pistachio form integration — 2026-10-12

## Decision

Added `ingredient-form-pistachios-chopped` (`chopped pistachios / pistaches hachées`) under the
existing pistachio identity and linked only recipe `056#29`, the optional decoration row. The
original text, optional state, and missing amount remain unchanged. Exact particle size remains
recipe-specific; no measure, density, mapping, conversion, yield, or substitution was added.

The separate finely-ground demand in recipe `017#1` remains unlinked and is covered by the
[ground-pistachio boundary review](../../proposals/wp03-section-i-ground-pistachio-form-boundary-review-20261012.md).

## Evidence

- [Where Is Cake, Pistachio Chocolate Mousse Cake](https://whereiscake.com/recipe/pistachio-chocolate-mousse-cake/) is the saved recipe's source. Its bundled bilingual ingredient/instruction text names `chopped pistachios` / `pistaches hachées` for decoration. The publisher page was inaccessible to the browser during this review.
- The OQLF [*hacher* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491547/hacher) defines the food-preparation verb as reducing food to small pieces and gives English *chop*. It supports the French wording but sets no pistachio-specific cut size.

The full boundary analysis is in the [chopped pistachio form review](../../proposals/wp03-section-i-chopped-pistachios-form-review-20261012.md).

## Static verification

- Package normalization/validation, reference normalization, generated catalog freshness, ledger validation, exact form ownership, and row-link checks passed.
- Recipe `056#29` alone links `ingredient-form-pistachios-chopped`; it remains optional and amountless. Recipe counts, ingredient-row counts, and source wording remain unchanged.
- Changed JSON files are UTF-8 without BOM and use escaped non-ASCII text, consistent with bundled seed data.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,244 references | `5290188e986484d117873083b9b70ce9482adc494c70d78510a4f83e9a92df0b` |
| `ingredient-forms.v1.json` | 92 forms | `de1191f1e8aab2603b6d743ba6d4256aa4122f67709e26b9899fd10642dff427` |
| `research-ledger.v1.json` | 1,548 records; 5,365 source entries; 4,405 distinct source IDs | `8c2c3cb03c64adb56c34ffd46096235036e8b909d12fda1efbd62f1a80c6abe9` |
| `BundledIngredientCatalog.kt` | 1,244 generated references | `c4c685e98568ef1d3397ee1c53c4c139fd29d6eaf8bc74b03cc4eddaee5dd800` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,607 bytes | `7b78179418205ccba9c5183b3d5bac38c24cd1029b41250047d4bc986268fbbd` |
