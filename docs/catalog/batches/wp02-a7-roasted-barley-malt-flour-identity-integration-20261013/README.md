# WP02 A7: Roasted barley malt flour identity integration

Integrated 2026-10-13 from the [R57 identity and Québec French review](../../proposals/wp02-a7-roasted-barley-malt-flour-identity-boundary-review-20261013-round57.md).

## Catalog decision

Added `ingredient-ref-roasted-barley-malt-flour` as `roasted barley malt flour / farine de malt d'orge, pâle et grillée` in `FLOUR_AND_STARCH`, with empty alias arrays, null density, and no unit mappings. The French display is current Canadian supplier wording for the named product and remains subject to independent Québec review.

Keep this identity distinct from roasted barley flour, ordinary malted barley flour, generic malt flour, and roasted wheat malt flour. The live ledger record marks identity as verified and has `researched_no_supported_value` measurement state and `researched_no_supported_substitute` substitution state.

IREKS North America currently names the English and French product and lists its Ontario location. The [English product page](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-barley-malt-k) lists a 25 kg package and 1–5% flour-basis dosage; these are product-specific industrial details. The [French page](https://www.ireksnorthamerica.com/fr/produits/recherche-de-produits?cHash=b216dd7f734a6dff5e98ca234832a40d&tx_ireksproduct_product%5Baction%5D=detail&tx_ireksproduct_product%5Bcontroller%5D=Product&tx_ireksproduct_product%5Bproduct%5D=100378) supplies the display wording. The [Québec mill's roasted barley flour](https://moulinsdesoulanges.com/language/en/roasted-barley-flour/) and [OQLF's ordinary malted barley flour entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497648/farine-dorge-maltee) support neighboring-identity boundaries, not alias equivalence.

## Recipe and behavior limits

The 114-recipe / 1,123-row bundle has no matching ingredient demand. No aliases, forms, recipe links, legacy candidate, density, unit mappings, household measures, conversions, cooking yields, or substitutions were added. Keep the IREKS package and dosage outside reusable catalog numeric data.

## Integration checks

- The normalized seed package contains 1,382 references, 100 forms, and 63 legacy candidates.
- The generated bundled catalog is current with 1,382 references.
- Research-ledger validation passes with 1,713 records and zero errors.
- Seed-package and ingredient-reference normalization checks pass.
- Static ownership, no-alias/no-numeric-data, local-link, UTF-8/no-BOM, and scoped whitespace checks pass.
- No app tests or emulator checks were needed for this database-JSON addition.

WP02 A7 remains open.
