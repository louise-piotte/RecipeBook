# WP05 Section V generic broth identity integration

- Date: 2026-10-12
- Status: generic broth identity and one exact recipe link are integrated; broader stocks and liquids work remains open.

## Integrated decision

Added identity-only `broth / bouillon` under `STOCK_AND_BROTH`. Linked only recipe 090#9, whose ingredient row says `2 cups broth` without naming a source animal or product type. Kept it distinct from beef stock, beef/chicken/vegetable broth references, concentrates, dry powders, and consommé. The row's quantity and notes are unchanged.

The Cotter Crunch recipe source says “broth or stock” for this stew and names vegetable or chicken broth/stock as local options. That is recipe-specific wording; it creates no catalog synonym, global substitution, or choice for the bundled unqualified line.

No other recipe rows changed. No forms, densities, measurements, conversions, yields, or substitutions were added.

## Evidence

- OQLF's [bouillon entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8431643/bouillon) gives the Québec French term and English `broth`, and separately describes consommé terminology.
- The linked publisher page, [African Peanut Stew](https://www.cottercrunch.com/crock-pot-west-african-peanut-stew/), has a recipe-card line for two cups of broth and discusses broth or stock options for that stew. Its amounts and contextual options were not generalized.
- The existing beef-stock/broth integration keeps those identities distinct. This addition does not broaden the existing vegetable-stock wording or resolve consommé, demi-glace, dashi, concentrates, cubes, or powders.

## Data checks

The package contains 1,133 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy-candidate file has 71 entries. The ledger contains 1,430 records / 4,763 source entries / 3,900 distinct source IDs / 8 unit conversions.

Seed-package validation and normalization checks passed; the generated Kotlin index is current; the research ledger validates with no errors. Exact phrase ownership, recipe link, UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this change only updates bundled database JSON, consistent with `AGENTS.md`.
