# WP04 Section P lake trout identity integration — 2026-10-12

## Decision

Added identity-only `lake trout / touladi` as `ingredient-ref-lake-trout` in `PROTEIN`, scoped
to *Salvelinus namaycush*. Added `lake charr` as the only English alias. OQLF directly pairs
`touladi` with `lake trout`, gives the scientific name, and lists `lake charr` as an English term.
Fisheries and Oceans Canada confirms the same English/French names and taxon in its paired species
profiles.

Kept bare `trout`, `truite`, `char`, `charr`, and `omble` out of the alias arrays, along with
`grey trout` and `truite grise`. The CFIA fish list and OQLF terminology notes show why these terms
can cross species or are not retained for Québec fish-product marketing. The identity does not
imply current local availability or sourcing authorization.

The 114-recipe corpus contains no matching demand. No recipe link, form, measurement, density, unit
mapping, conversion, yield, or substitution was added. Measurement and substitution research remain
`not_yet_researched`.

## Sources

- [OQLF: touladi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198855/touladi) —
  preferred Québec edible-fish term, *lake trout*, *lake charr*, and *Salvelinus namaycush*; its
  notes distinguish other salmonids and Québec fish-product names.
- Fisheries and Oceans Canada species profiles: [Lake Trout](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lake-trout-touladi-eng.html)
  and [Touladi](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lake-trout-touladi-fra.html)
  confirm the bilingual names and same taxon.
- [CFIA Fish List query for Lake Trout](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Lake%20Trout&wbdisable=true)
  lists multiple common-name rows for the species; the overlapping bare terms were not copied as
  catalog aliases.

The exact source register, key-ownership review, and recipe-demand audit are in the
[proposal](../../proposals/wp04-section-p-next-fish-gap-review-20261012.md).

## Static verification

- Bundled package validation, reference normalization, generated-index freshness, and research-ledger
  validation passed. The ledger has 1,547 records and zero validation errors.
- The manifest still lists 114 recipes and 1,123 ingredient rows. A whole-word scan found no recipe
  text hits for `lake trout`, `touladi`, `lake charr`, or *Salvelinus namaycush*.
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
