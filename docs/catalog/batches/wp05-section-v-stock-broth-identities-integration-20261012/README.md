# WP05 Section V — stock, broth, cubes, and branded base integration

- **Date:** 2026-10-12
- **Disposition:** integrated the supported stock/broth identities and exact recipe links; remaining Section V product classes stay open
- **Source proposal:** `docs/catalog/proposals/wp05-section-v-stocks-and-concentrates-followup-20261012.md`

## Identity decisions

- Promoted the existing `ingredient-ref-chicken-stock` legacy candidate as `chicken stock / fond de poulet`. Kept it separate from active `chicken broth / bouillon de poulet`; the low-salt qualifier on recipe 037#9 remains recipe-specific.
- Split vegetable stock and broth. The existing stock is now `vegetable stock / fond de légumes`; removed its `vegetable broth` alias. Added `vegetable broth / bouillon de légumes` as a separate identity.
- Added identity-only `fish stock / fumet de poisson`.
- Added separate flavor-qualified `chicken bouillon cubes / cubes de bouillon de poulet`, `beef bouillon cubes / cubes de bouillon de bœuf`, and `vegetable bouillon cubes / cubes de bouillon de légumes` references. Kept all three distinct from powders, concentrates, stocks, and prepared broth.
- Added the branded family `Better Than Bouillon base / base Better Than Bouillon`. Removed the English and French brand aliases from generic `broth concentrate / concentré de bouillon`.

OQLF pairs *fond* with English *stock* and *fumet de poisson* with *fish-stock*. Campbell’s current Canadian bilingual pages use *broth / bouillon* for prepared chicken and vegetable broth. Metro’s same-code vegetable cooking-stock listing uses *stock / fond*. Knorr’s Canadian product pages list flavor-specific cubes; their English and French chicken pages disagree on reconstitution volume, so no quantity or conversion was stored. Well.ca describes Better Than Bouillon as a multi-flavor family of blendable bases and gives French *base de poulet Better Than Bouillon* wording.

## Recipe links

- Relinked only recipe 099#3 (`1 tbsp Better Than Bouillon`) to the brand-family reference. Kept its source wording, tablespoon amount, and recipe note that any brand flavor can be used.
- Relinked only recipe 105#2 (`8 cups vegetable broth`) to vegetable broth. Kept its source wording, amount, and note that chicken broth also works.
- Kept recipe 044#5 (`2 tsp broth concentrate`) on the provisional generic concentrate owner because the exact row does not name a brand or flavor.
- Kept beef-broth rows 015#4, 034#11, and 078#13; generic broth row 090#9; and low-salt chicken-broth row 037#9 on their existing identities.

No form, density, unit mapping, measurement, package yield, reconstitution direction, conversion, or substitution was added. Fish stock, chicken stock, and the three cube identities have no recipe links.

## Evidence and validation

The ledger records the OQLF *fond* and *fumet* entries; current Campbell chicken/vegetable broth pages; Metro’s bilingual vegetable-stock listing; Campbell foodservice chicken stock code 23026; six flavor-specific Knorr cube product pages; and Well.ca’s English brand-family and French base pages. New evidence uses 16 distinct source IDs across 17 source entries; the OQLF *fond* source is shared between the chicken- and vegetable-stock decisions.

The package now has 1,176 references / 85 forms / 114 recipes / 1,123 ingredient rows; 66 legacy candidates; and 1,476 ledger records / 4,926 source entries / 4,033 distinct source IDs / 8 unit conversions. Package validation and normalization, ingredient-reference normalization, generated catalog freshness, ledger validation, exact-key ownership, exact recipe-row checks, UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator checks were run because this tranche only changes bundled database JSON data.

Generic broth concentrate remains provisional. Consommé, demi-glace, generic dashi/fish broth, stock concentrates, generic cubes, granules, and dry stock powders remain unresolved or held. See the [proposal](../../proposals/wp05-section-v-stocks-and-concentrates-followup-20261012.md); the broader Section V item remains open.
