# WP02 B2/B3 manioc-starch alias integration — 2026-10-12

## Decision

Added only the English alias `manioc starch` to the existing `ingredient-ref-tapioca-starch` row.
The canonical display remains `tapioca starch / fécule de manioc`; the reference remains in
`FLOUR_AND_STARCH`. OQLF's GDT entry for `fécule de manioc` defines the wet-extracted starch product
and lists `manioc starch` as its first English term. The same source was already recorded on the
reference's ledger entry; its access date and support description were refreshed and the accepted
alias decision was recorded there.

Kept `cassava starch` unassigned because its exact phrase overlaps the two active Brazilian
`polvilho` display names, `tapioca flour` inactive because OQLF marks it obsolete, and whole-root
cassava-flour terms on their separate reference. No French aliases or display names changed.

No recipe line, measurement state, substitution state, density, unit mapping, form, conversion,
yield, recipe link, or substitution changed. The 114-recipe corpus has no matching demand.

## Source

- [OQLF: fécule de manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc)
  defines the extracted-starch product, lists `manioc starch`, `cassava starch`, and `tapioca starch`
  as English terms, and marks `tapioca flour` obsolete. This source is recorded as `WP02-S24` on
  the existing ledger entry.

The exact-key and recipe-demand audits, including the two `polvilho` collisions, are in the
[proposal](../../proposals/wp02-b2-b3-next-flour-starch-gap-review-20261012.md).

## Static verification

- Bundled package validation, reference normalization, generated-index freshness, and research-ledger
  validation passed. The ledger has 1,547 records and zero validation errors.
- The manifest still lists 114 recipes and 1,123 ingredient rows. A whole-word scan found no recipe
  text hits for `manioc starch`, `cassava starch`, `tapioca starch`, or `fécule de manioc`.
- No app tests or emulator checks were run because this change only adds database JSON data under
  `AGENTS.md`.

## Snapshot after integration

Hashes cover exact file bytes.

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,244 references | `5290188e986484d117873083b9b70ce9482adc494c70d78510a4f83e9a92df0b` |
| `ingredient-forms.v1.json` | 91 forms | `a8f7634add93654cf144d4d8ed5ef9346b0acc73ddbba1b3f455bac8adc6aad7` |
| `research-ledger.v1.json` | 1,547 records; 5,363 source entries; 4,403 distinct source IDs | `376ba93d364dff733f741acd0576993e4196295737c37a47f9bebbef11445bec` |
| `BundledIngredientCatalog.kt` | 1,244 references | `c4c685e98568ef1d3397ee1c53c4c139fd29d6eaf8bc74b03cc4eddaee5dd800` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,543 bytes | `cf9185da118727a2f0584352af4cfa4625090be2ae5792fd1be253d48b70d23a` |
