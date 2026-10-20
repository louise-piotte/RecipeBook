# WP05 Section Z — Salsa macha identity review (R257)

- **Reviewed:** 2026-10-16.
- **Disposition:** Recommend one identity-only `SAUCE_AND_CONDIMENT` reference for salsa macha.
- **Scope:** The named Mexican condiment family, including commercially prepared products. Do not define one recipe or ingredient formula for the family.

## Recommendation

Add `Salsa macha / salsa macha` as a distinct condiment identity. Aliments du Québec lists a Québec-made `Salsa Macha Épicée` as a condiment in French and `Salsa macha spicy` in English. Pasumecha also sells sweet, spicy, and maple versions under the salsa macha name. These are direct Québec market and manufacturer naming evidence; they do not establish an OQLF-approved French term. Preserve the borrowed name as the provisional fr-CA display.

Use no aliases. Case and accents are already normalized by the bilingual search index, and neither `sauce piquante`, `chili oil`, `chili crisp`, `salsa roja`, nor `salsa verde` is an equivalent name. Keep salsa macha distinct from salsa Lizano, Mexican adobo sauce, chipotles in adobo, mole paste, and generic hot sauces. Do not add variant rows for sweet, spicy, or maple products from these sources alone.

## Identity and product boundaries

The Québec listing classifies its product as a condiment and describes dried peppers, corn oil, peanuts, garlic, and sesame. Pasumecha describes salsa macha as a Mexican condiment and sells multiple versions with different heat or maple profiles. A Mexican maker's product page lists a different mix of chiles, garlic, nuts, seeds, cranberries, spices, and olive oil. The evidence supports a named condiment family with variable formulas; it does not support a universal component list, allergen claim, or shared recipe formula.

Retain `Salsa macha` and `salsa macha` in the English and French display fields respectively; leave aliases empty. Keep the French wording provisional because a product title is market evidence rather than a terminology ruling.

## Catalog, picker, and recipe audit

No active ingredient reference or form owns `salsa macha`, `salsa macha spicy`, or `salsa macha épicée`. The only existing active phrase owner containing `salsa` is the separate Lizano sauce reference, with `Salsa Lizano` as a product-name alias. Under the current search behavior, the exact query `salsa macha` returns the proposed row; `macha` returns the proposed row; broad `salsa` returns both salsa macha and Lizano. Keep that broad query visibly multi-result rather than assigning it to either condiment.

The live manifest has 114 recipes and 1,123 ingredient rows. The current corpus has no `salsa macha` phrase or linked ingredient line; no recipe link is proposed.

## Data boundary

If accepted, add one identity-only `SAUCE_AND_CONDIMENT` reference and record source-specific package/ingredient observations only. Aliments du Québec lists one 250 mL SKU; preserve that as a source-specific package observation, not a reusable measure or unit conversion. Add no aliases, forms, density, unit mappings, recipe links, conversions, yields, or substitutions. Do not activate ingredient components, preservation guidance, or product variants as generic properties.

## Source register

Pages checked online on **2026-10-16**. No ledger source IDs have been allocated in this proposal.

| ID | Source | Evidence and limit |
|---|---|---|
| `WP05-SALSA-MACHA-R257-20261016-S01` | Aliments du Québec, [Salsa Macha Épicée](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/salsa-macha-epicee) | Québec listing places the product under condiments, calls it salsa macha, describes one product's ingredients, and lists 250 mL. Product-specific; it does not define the whole family. |
| `WP05-SALSA-MACHA-R257-20261016-S02` | Aliments du Québec, [Salsa macha spicy](https://alimentsduquebec.com/en/certified-products/seasonings-sauces-and-condiments/salsa-macha-spicy) | English listing uses the matching product name, classifies it as a condiment, and lists 250 mL. Confirms one Québec-market English/French product pair, not an OQLF ruling. |
| `WP05-SALSA-MACHA-R257-20261016-S03` | Pasumecha, [Salsa Macha artisanale fabriquée au Québec](https://pasumecha.ca/) | Manufacturer describes salsa macha products inspired by Veracruz and distinguishes spicy, mild, and maple versions. Product-family evidence; its product-specific ingredients are not a universal formula. |
| `WP05-SALSA-MACHA-R257-20261016-S04` | Luna Brava, [Salsa Macha](https://www.lunabrava.mx/productos/salsa-macha) | Mexican maker describes a packaged salsa macha with its own chiles, nuts, seeds, fruit, spice, and oil ingredients, in 200 g and 300 g presentations. Supports formulation variability; not Québec terminology or a transferable package/measure. |

## Implementation boundary

If accepted, add one identity-only condiment reference with empty aliases, null density, and empty unit mappings; record the Québec and Mexican product observations with their own source IDs. Keep all recipe and runtime conversion/substitution behavior unchanged. The wider Section Z condiment and regional-coverage work remains open.
