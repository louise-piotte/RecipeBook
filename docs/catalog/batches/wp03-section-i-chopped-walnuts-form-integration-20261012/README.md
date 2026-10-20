# WP03 Section I chopped-walnut form integration — 2026-10-12

## Decision

Added `ingredient-form-walnuts-chopped` (`chopped walnuts / noix de Grenoble hachées`) under the
existing walnut identity and linked only row `058#11`. The source and saved row both specify 1/2
cup; the original wording, amount, unit, and preparation text are unchanged. No mass equivalent,
density, general measure, conversion, yield, particle-size standard, or substitution was added.

The other chopped-walnut row, `055#10`, remains unlinked. Its current Preppy Kitchen source page no
longer names walnuts in the recipe card. The saved row/source mismatch remains open for separate
reconciliation.

## Evidence

- [Allrecipes, Queen Elizabeth Cake](https://www.allrecipes.com/recipe/7666/queen-elizabeth-cake-i/) lists 1/2 cup chopped walnuts, matching the saved volume in row `058#11`.
- The OQLF [*noix de Grenoble* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361125/noix-de-grenoble) lists `noix de Grenoble` and `noix` as preferred terms and English `walnut`.
- The OQLF [*hacher* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491547/hacher) defines the culinary verb as reducing food to small pieces and gives English `chop`; it sets no walnut-specific particle size.
- Preppy Kitchen's [current Coffee Cake page](https://preppykitchen.com/coffee-cake/) (updated 2025-10-21) has no walnut mention. It does not support saved row `055#10`.

The full reasoning and source-ID audit are in the [chopped-walnut review](../../proposals/wp03-section-i-chopped-walnuts-form-review-20261012.md).

## Static verification

- Bundled package normalization/validation, reference normalization, generated-catalog freshness, and ledger validation passed.
- Exact form ownership assigns the two labels to `ingredient-form-walnuts-chopped`, whose parent is `ingredient-ref-walnuts`. Only recipe `058#11` links the form; its 1/2 cup amount and source text remain unchanged.
- Full manifest recipe scan found two rows mentioning chopped walnuts: `055#10` and `058#11`. Only `058#11` is source-confirmed; `055#10` remains unlinked.
- Updated JSON is UTF-8 without BOM and stores French accents as Unicode escapes. No tests or emulator checks were run because this is a database-JSON-only change under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,244 references | `5290188e986484d117873083b9b70ce9482adc494c70d78510a4f83e9a92df0b` |
| `ingredient-forms.v1.json` | 93 forms | `de4c25d0fd3c20e6f0c2bc4d1695d031b31df9820174ab57ac44073818ff2400` |
| `research-ledger.v1.json` | 1,549 records; 5,369 source entries; 4,409 distinct source IDs | `ff256ccbf3daaa7acf6eaf47e7057ff446c8e0e24b532129f65aa9ded4553157` |
| `BundledIngredientCatalog.kt` | 1,244 generated references | `c4c685e98568ef1d3397ee1c53c4c139fd29d6eaf8bc74b03cc4eddaee5dd800` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,668 bytes | `2d18d99b7329cc4d099516d7adb8da94a149d3a6c8e91335b6a8a66cc08e9f88` |
