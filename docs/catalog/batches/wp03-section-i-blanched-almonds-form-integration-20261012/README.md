# WP03 Section I blanched almonds form integration — 2026-10-12

## Decision

Added `ingredient-form-almonds-blanched` (`blanched almonds / amandes mondées`) under
`ingredient-ref-almonds`, using OQLF terminology for almonds with their skins removed. Linked only
source-backed recipe 079#1 (`210 g blanched almonds`). Its original wording, mass, unit, and
preparation text remain unchanged.

The current publisher card names whole blanched almonds, but the bundled ingredient text omits
“whole,” so the form captures only the skin-removed state. No measure, density, unit mapping,
conversion, yield, or substitution was added. See the
[source review](../../proposals/wp03-section-i-blanched-almonds-form-review-20261012.md).

## Evidence

- [OQLF, amande mondée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059925/amande-mondee): defines the removed-skin state and supplies the English equivalent.
- [Foodtasia, Easy Homemade Almond Paste (and Marzipan!)](https://foodtasia.com/almond-paste-and-marzipan/): lists whole blanched almonds with a 210 g mass.
- [Foodtasia, How to Blanch Almonds](https://foodtasia.com/blanched-almonds/): distinguishes blanched from raw almonds by skin state.

## Static verification

- Bundled package validation passed.
- Ingredient-reference normalization passed; the generated catalog is current at 1,243 references.
- Research ledger validation passed with 1,545 records and 0 errors.
- The French and English form labels have unique catalog ownership. Recipe 079#1 links to the form and retains its `210 g` source line.
- All 114 recipes and 1,123 ingredient rows remain present. The recipe corpus is 753,473 bytes with manifest-ordered SHA-256 `b26ee67c255ecf363312358661c18a35575c35c75ce2c4dcb82b4134e1ed7f8f`.
- Updated JSON has no BOM and stores non-ASCII text as Unicode escapes. Scoped `git diff --check` passed.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-forms.v1.json` | 90 forms | `26b0c9b0f340babccc5ba09b58d6502280fb9f498711f54cdeca0333dc6ee750` |
| `research-ledger.v1.json` | 1,545 records; 5,357 source entries; 4,397 distinct source IDs | `f0a4267deee402cd76f6bd238851c03117b2214afb83e676c2f2613657a0c354` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,473 bytes | `b26ee67c255ecf363312358661c18a35575c35c75ce2c4dcb82b4134e1ed7f8f` |
