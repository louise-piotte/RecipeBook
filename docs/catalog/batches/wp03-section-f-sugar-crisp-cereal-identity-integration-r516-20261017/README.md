# WP03 Section F R516 integration — Sugar Crisp cereal

- **Date:** 2026-10-17
- **Catalog ID:** `ingredient-ref-sugar-crisp-cereal`
- **Identity:** `Sugar Crisp cereal / Céréales Sugar-Crisp`, category `GRAIN_AND_CEREAL`, no aliases.
- **Boundary:** named Canadian ready-to-eat cereal, separate from plain `puffed wheat / blé soufflé`. No brand-history or character names are aliases.
- **Ledger measurement:** one `portion_weight` observation retains Provigo's listing-specific 1 cup (40 g) nutrition serving for item `20071915001_EA`. The cup convention and filling method are unspecified; no active cup mapping, density, or volume-to-mass conversion was added.
- **Other behavior:** no forms, recipe links, component links, reusable measures, conversions, yields, or substitutions. Substitution research remains unresearched.

## Evidence and picker boundary

Post Consumer Brands Canada's English page uses Sugar Crisp and lists 365 g and 550 g boxes. Its French-Canadian product page uses Sugar-Crisp and lists the same sizes. The manufacturer's French brand history describes the product as sweetened puffed-wheat cereal and distinguishes its Canadian name from historical and U.S. names. Québec retailers Super C and Provigo list the named cereal; Provigo's indexed nutrition panel supports only the source-specific portion observation above.

Exact searches for `Sugar Crisp`, `Sugar-Crisp`, `Sugar Crisp cereal`, and `Céréales Sugar-Crisp` return the new reference. Broad `Sugar`, `cereal`, and `céréales` result counts increase 23→24, 56→57, and 52→53. `puffed wheat`, `blé soufflé`, `wheat`, and `blé` remain on their current results. Golden Crisp, Super Sugar Crisp, Sugar Bear, and descriptive wheat-cereal wording remain outside aliases.

Sources: [Post Consumer Brands Canada — Original Sugar Crisp](https://www.postconsumerbrands.ca/brand/sugar-crisp/original-sugar-crisp/); [Post Consumer Brands Canada — Sugar-Crisp](https://www.postconsumerbrands.ca/fr-ca/marques/sugar-crisp-fr/sugar-crisp/); [Post Consumer Brands Canada — Notre histoire](https://www.postconsumerbrands.ca/fr-ca/marques/sugar-crisp-fr/notre-histoire/); [Super C — Céréales de blé au miel, Sugar-Crisp](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-de-ble-a-saveur-de-miel/p/628154138006); [Provigo — Céréales Sugar Crisp](https://www.provigo.ca/fr/c-r-ales-sugar-crisp/p/20071915001_EA).

## Recipe corpus and static checks

The full manifest scan found zero Sugar-Crisp-specific mentions in 114 recipe files or 1,123 ingredient rows. The unchanged manifest-ordered fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

The bundled seed package normalized without additional changes and validated successfully. The generated Kotlin index is current with 1,792 references. After the R516/R517 integrations and existing R518 entry, the catalog contains 143 forms and 56 legacy candidates; the ledger has 2,149 records, 9,863 source entries, 8,347 distinct source IDs, and 7,057 distinct URLs, with no source ID mapped to multiple URLs. Seed reference JSON is UTF-8 without BOM and uses ASCII escapes for non-ASCII characters.

No software tests, build, emulator check, or deployment were run because the changes add database JSON data under `AGENTS.md`. See the [R516 proposal](../../proposals/wp03-section-f-next-gap-review-r516-20261017.md). Section F remains open.
