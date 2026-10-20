# WP03 Section M: naranjilla identity and frozen-pulp form integration

Integrated on 2026-10-12 from the [lulo / naranjilla boundary review](../../proposals/wp03-section-m-lulo-naranjilla-boundary-review-20261012.md).

## Catalog change

Added `ingredient-ref-naranjilla` as `naranjilla / naranjilla`, category `FRUIT`. The English alias list contains `lulo`; the French aliases are `lulo`, `naranrille`, and `morelle de Quito`. Added `ingredient-form-naranjilla-frozen-pulp`, displayed as `frozen lulo pulp / pulpe de lulo congelée`, with match terms for naranjilla pulp. Its formulation, dilution, and concentration are unspecified, so it has no density or conversion.

The reference covers edible *Solanum quitoense*. Its Latin taxonomy stays in the evidence ledger, rather than the picker display. Keep *S. pseudolulo* and the existing cocona / *S. sessiliflorum* identity separate. OQLF's entry spells one French term `morelle de Ouito`; the integrated `morelle de Quito` follows the independent USDA ARS and EPPO spelling. The full recipe corpus has no matching demand.

## Evidence and limitations

- [Kew Plants of the World Online, *Solanum quitoense*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:820696-1/general-information) treats the species as accepted and records food use and both lulo/naranjilla names. [USDA ARS GRIN](https://npgsweb.ars-grin.gov/gringlobal/taxon/taxonomydetail?id=101253) and [EPPO](https://gd.eppo.int/taxon/SOLQU) corroborate French and English name variants.
- [OQLF, naranjilla](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18058934/naranjilla) supports the Québec French display and its listed terms. Its older Latin cross-reference differs from Kew's currently accepted spelling.
- [Épicerie Tropica's frozen lulo pulp](https://epicerietropica.com/product/pulpa-de-lulo/) supports local French product wording. [Walmart Canada's Canoa listing](https://www.walmart.ca/en/ip/Brar-s-Canoa-Lulo-Fruit-Pulp/6000197659916) is additional frozen-pulp evidence, but was marked out of stock in the review. A [Canadian distributor's lulo listing](https://www.latinfrozenfruits.com/fr/products/lulo) was available only as a search-index snapshot, so it remains corroborative.
- [Kew, *Solanum pseudolulo*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:239554-2/general-information) documents the separate species that also has lulo-related names; those names are not aliases for this reference.

No source establishes a general measure, density, pulp yield, or replacement ratio. The review does not establish verified in-stock availability of fresh fruit or every frozen pulp product's formulation. The research ledger records the identity decision and bounded no-substitute finding; no observation, recipe link, conversion, yield, or substitution rule was added.

## Validation

The complete bundle has 114 recipes and 1,123 ingredient rows; none contains the candidate terms. The reference and form names each have one exact active owner. The package validator, reference normalization check, generated-index check, and research-ledger validation passed at 1,284 references, 97 forms, and 1,591 ledger records; the ledger has 5,679 source entries and 4,710 distinct source IDs. JSON files are UTF-8 without BOM and contain only ASCII bytes through escaped Unicode where needed. No app tests or emulator checks were run because this change only adds database JSON data.
