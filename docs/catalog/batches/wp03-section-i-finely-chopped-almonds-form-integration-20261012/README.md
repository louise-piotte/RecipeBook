# WP03 Section I finely chopped almond form integration — 2026-10-12

## Decision

Added `ingredient-form-almonds-finely-chopped` (`finely chopped almonds / amandes hachées finement`)
under the existing almond identity and linked only recipe `006#7`. The saved row remains required
with `40 g` and original wording unchanged.

The current publisher card supports the finely chopped form, but lists `1/2 cup` and marks it
optional. That differs from the saved 40 g required row; the discrepancy remains unresolved. No
mass conversion, density, transferable measure, yield, particle-size standard, or substitution was
added.

## Evidence

- [Allrecipes, Nanaimo Bars](https://www.allrecipes.com/recipe/25095/nanaimo-bars-iii/) (updated 2026-01-20) lists `1/2 cup finely chopped almonds (Optional)`. This supports the form only; it does not establish that the bundle's 40 g amount is equivalent or that the saved row is optional.
- The OQLF [*hacher* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491547/hacher) defines the culinary verb as reducing food to small pieces and gives English *chop*. The fine modifier comes from the recipe source; the OQLF entry does not define an almond-specific cut size.

The complete reasoning and source-ID audit are in the [finely chopped almond review](../../proposals/wp03-section-i-finely-chopped-almond-form-review-20261012.md).

## Static verification

- Bundled package normalization/validation, reference normalization, generated-catalog freshness, and ledger validation passed.
- Exact form ownership assigns the labels to `ingredient-form-almonds-finely-chopped`, whose parent is `ingredient-ref-almonds`. Only row `006#7` links it; its original text, 40 g amount, and required state remain unchanged.
- The complete manifest scan found this single finely chopped almond row. Sliced, blanched, whole, and unqualified almond rows retain their existing data.
- Updated JSON is UTF-8 without BOM and stores French accents as Unicode escapes. No tests or emulator checks were run because this is a database-JSON-only change under `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,244 references | `5290188e986484d117873083b9b70ce9482adc494c70d78510a4f83e9a92df0b` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `research-ledger.v1.json` | 1,550 records; 5,371 source entries; 4,411 distinct source IDs | `5fc666785e398c77976db2716bb92336e176c22d79495884f581e36802747dba` |
| `BundledIngredientCatalog.kt` | 1,244 generated references | `c4c685e98568ef1d3397ee1c53c4c139fd29d6eaf8bc74b03cc4eddaee5dd800` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,736 bytes | `58de476b5be72e03610500561d69a4b79820888c460960e34147444601159e13` |
