# WP02 A1 — High-gluten flour French alias (2026-10-12)

## Decision

Added `farine de blé de force` as a French search alias on the existing
`ingredient-ref-high-gluten-flour` identity. The canonical display remains `high-gluten flour /
farine à haute teneur en gluten`; no English alias was added.

The OQLF defines `farine de blé de force` as flour from strong wheat that is rich in gluten and used
mainly for bread. It lists `hard wheat flour` as the English equivalent, not `high-gluten flour`, so
the catalog mapping is an editorial search decision supported by Ardent Mills Canada's current
high-gluten product name and description. It does not make all bread flour, generic hard wheat flour,
or `farine forte` equivalent to this row.

Keep the separate bread-flour and durum-flour identities, their recipe links, and all existing
product-specific evidence unchanged. No forms, measurements, densities, unit mappings, conversions,
recipe links, yields, or substitutions were added.

## Sources

- OQLF, [`farine de blé de force` (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357376/farine-de-ble-de-force): preferred Québec term, definition, and English equivalent.
- Ardent Mills Canada, [French `Haute teneur en gluten`](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/high-gluten/) and [English `High Gluten Flour`](https://ardentmills.ca/products/traditional-wheat/standard-flours/high-gluten/): matching Canadian product names and use context. Product specifications remain supplier-specific.
- Ardent Mills Canada separately lists [Artisan farine à pain](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/artisan/) / [Artisan Bread Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/artisan/) and [Farine forte](https://ardentmills.ca/fr/products/traditional-wheat/standard-flours/strong-bakers/) / [Strong Bakers Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/strong-bakers/). These support the product boundary; they do not establish universal class equivalence.

The seven reviewed sources are recorded on the existing ledger identity under
`WP02-HG-FORCE-20261012-S01` through `S07`.

## Static verification

- Reference normalization, generated-index freshness, bundled-package validation, and research-ledger
  schema validation passed.
- The proposed phrase has one active normalized owner after integration and no form or legacy owner.
  The 114-file, 1,123-row recipe corpus has no matching phrase or high-gluten recipe link; existing
  bread-flour links remain unchanged.
- JSON uses UTF-8 without BOM and explicit Unicode escapes. No tests or emulator checks were run
  because this change only adds database JSON data under `AGENTS.md`.
