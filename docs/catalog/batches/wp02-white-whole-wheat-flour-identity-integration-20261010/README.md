# WP02 white whole-wheat flour identity integration

**Date:** 2026-10-10  
**Scope:** Add one white whole-wheat flour identity and correct the all-purpose flour alias boundary. No recipe line or conversion data changed.

## Catalog decision

Added `ingredient-ref-white-whole-wheat-flour` as `white whole-wheat flour` / `farine intégrale de blé blanc`, with only the English alias `hard white whole wheat flour`. The French display follows the Québec mill’s direct product wording and remains under independent Québec terminology review. A white wheat grain class does not imply that a flour is whole-grain; the new identity is limited to products explicitly described as whole wheat/whole grain.

Removed `farine blanche` from all-purpose flour aliases because OQLF defines it as refined white flour. Retained `farine tout usage non blanchie`; the current catalog schema cannot store bleaching as an independent product qualifier.

The two new/changed rows remain identity/search data only: no form, default density, unit mapping, conversion, package yield, substitution, or recipe link was added.

## Sources

- [OQLF, farine blanche](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8356361/farine-blanche) distinguishes the refined white-flour term.
- [OQLF, farine tout usage](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage) supports the all-purpose term.
- [CFIA, Canadian Food Compositional Standards, Volume 12](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) separately defines refined flour and whole-wheat flour.
- [Canadian Grain Commission, Canadian wheat classes](https://www.grainscanada.gc.ca/en/grain-quality/grain-grading/wheat-classes.html) documents white-wheat classes without establishing that a flour is whole-grain.
- [Expeditor Dry Goods, Hard White Whole Wheat Flour](https://expeditordrygoods.com/products/hard-white-wheat-flour) documents an explicitly whole-wheat hard-white retail flour.
- [Moulin de Charlevoix, farine intégrale de blé blanc](https://www.moulin-charlevoix.net/farines-flour) attests the selected Québec French product wording and its whole-grain scope; it is not an OQLF generic-term entry.

## Verification

The English and French picker screenshots show `white whole-wheat flour` and the accent-folded `farine integrale de ble blanc` query returning the new identity. The French name is displayed as `white whole-wheat flour` because this QA session uses the English app locale.

The running emulator retains an older local all-purpose-flour row, and a `farine blanche` picker query still finds that old row. The canonical bundled source and unit tests confirm the alias was removed. No persisted local catalog row was rewritten; the project is pre-MVP and the seed source remains authoritative for new installs.

The final combined WP02/WP03 verification ran 12 Python seed-package tests, 332 Android unit tests, package and alias normalization checks, generated-index freshness, deployment/build, and manual Pixel 9a / Android 16 picker navigation. The Pixel home was restored with 114 recipes. Package state at combined verification: 739 ingredient references, 34 forms, 928 ledger records, 1,866 source entries / 1,526 source IDs, and 114 recipes / 1,123 ingredient rows.

| Screenshot | SHA-256 |
| --- | --- |
| [English picker](pixel9a-picker-en.png) | `9e75156bdd0660fadb16ba904c65f7d6cce05ac6fed81019c7f18fca36a5d8f8` |
| [French search picker](pixel9a-picker-fr.png) | `5764c71255368e4b915701f26b4b01b2a1b279849c737aed2f9dada59f8c340b` |

Independent Québec review of the exact French display, bleaching-qualifier handling, and the broader WP02 flour/starch plan remain open.
