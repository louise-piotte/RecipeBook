# WP05 Section X — pandan leaf powder form

- **Date:** 2026-10-12
- **Status:** one source-backed dry form added under the existing pandan-leaf identity.
- **Scope:** pure powdered pandan leaf only. Other pandan preparations remain separate or held.

## Decision

Added `ingredient-form-pandan-leaves-powdered` under `ingredient-ref-pandan-leaves`:

- EN: `pandan leaf powder`
- fr-CA: `poudre de feuilles de pandan`
- Form code: `powdered`; preparation state: `dry`
- Match terms: none; density: `null`

The form is limited to pandan leaves milled to a dry powder. A Canadian listing for one La Plantation
product describes it as 100% pure pandan leaf powder, and another Canadian listing declares organic
pandan leaf as the powder's ingredient. La Plantation Canada's French product title supplies
`poudre de feuilles de pandan`. This supports the form for pure leaf products; it does not establish
bare `pandan powder` as a safe global match term across extract powders, flavourings, and blends.

Kept leaf juice, extract powders, essences, and pastes separate from the raw-leaf identity. No other
forms, aliases, recipe links, densities, unit mappings, measures, conversions, package/preparation
yields, or substitutions were added. The current recipe corpus has no pandan ingredient-line matches.
R345 independently reviewed and retained the existing fr-CA displays; no OQLF-preferred-term claim or broader alias was added. See the [R345 terminology review](../../proposals/wp05-pandan-quebec-french-terminology-review-r345-20261016.md). The identity and product boundaries described above remain in force.

## Current package snapshot

- 1,190 references / 86 forms / 114 recipes / 1,123 ingredient rows.
- 66 legacy candidates.
- 1,491 research-ledger records / 4,974 source entries / 4,057 distinct source IDs / 8 unit
  conversions.
- No recipe JSON changed; the recipe corpus digest remains
  `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622`.

## Evidence

- `WP05-PAN-S09` — [Gusta Supplies, LA PLANTATION Organic Pandan Leaf Powder](https://supplies.gusta.ca/products/la-plantation-organic-pandan-leaves-powder-50g). The Canadian retailer identifies the named product as 100% pure pandan-leaf powder with no added colouring, flavouring, or preservatives. This is product-specific evidence, not a global equivalence claim.
- `WP05-PAN-S10` — [La Plantation Canada, Poudre de feuilles de pandan](https://laplantation.ca/fr/products/pandan-leaves-powder-50g). Supports the French product wording on the Canadian storefront; it is not an OQLF terminology ruling.
- `WP05-PAN-S11` — [Lemon Lily Tea Wholesale, Pandan Powder](https://www.lemonlilytea.ca/products/pandan-powder). The Canadian wholesale listing calls one SKU “Pandan Powder” and declares “Organic Pandan Leaf.” This supports that exact product only, so the bare phrase is not added as a global form match term.
- Existing leaf, preparation, and recipe evidence remains in the [WP05 pandan follow-up proposal](../../proposals/wp05-southeast-asian-pandan-followup.md) and ledger record `ingredient-ref-pandan-leaves` (`WP05-PAN-S01`–`S08`).

## Verification

- Seed-package normalization/validation, reference normalization, generated-index freshness, ledger
  validation, exact form-key ownership, recipe-demand scan, UTF-8/no-BOM, and scoped whitespace
  checks passed.
- No tests or emulator checks were run because this batch only adds database JSON data, as allowed
  by `AGENTS.md`.
