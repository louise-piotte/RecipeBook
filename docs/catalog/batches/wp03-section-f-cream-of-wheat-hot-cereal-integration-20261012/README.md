# WP03 Section F cream-of-wheat hot-cereal integration

## Decision

Added the identity-only reference `cream of wheat hot cereal / crème de blé` in
`GRAIN_AND_CEREAL`. Both alias arrays are empty. It remains separate from wheat farina and semolina
as milling products, rice hot cereal, instant/flavored/composite products, and cooked dishes that
may also be described as *crème de blé*. No form, measurement, density, unit mapping, conversion,
yield, recipe link, or substitution was added.

See the [source review](../../proposals/wp03-section-f-cream-of-wheat-hot-cereal-identity-review-20261012.md)
for the exact-key audit, source limits, and current-package snapshot.

## Evidence and boundaries

The [Canadian Cream of Wheat product page](https://creamofwheat.ca/product/original-3-minute/)
describes a ground-wheat hot cereal. Its [French page](https://creamofwheat.ca/fr_ca/product/original-3-minute/)
uses *céréales chaudes Cream of Wheat* for the branded product. [Bob's Red Mill Canada](https://www.bobsredmill.ca/produit/cereales-chaudes-au-ble-cremeux)
describes a separate dry wheat hot cereal and uses *crème de blé*. [RICARDO](https://www.ricardocuisine.com/chroniques/a-votre-sante/39-des-cereales-chaudes-au-petit-dejeuner)
uses the same Québec term for hot cereal while also describing a cooked dish with that wording; the
catalog row is limited to the dry grocery product. The [OQLF wheat-semolina entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432749/semoule-de-ble-tendre)
supports keeping milling terminology separate.

The Metro French search-index title still reads `Crème de blé / Céréales chaudes`, but the direct
product URL redirects to its English `Cream of Wheat Hot Cereal` page. The French listing is recorded
with that limitation and is not the sole basis for the display.

The 114 manifest-listed recipes and 1,123 ingredient rows contain no matching line; no recipe link
was added.

## Static verification

- Bundled seed package validation and normalization checks passed.
- Ingredient-reference normalization and generated-catalog freshness checks passed.
- Research-ledger validation passed with zero errors.
- Exact normalized ownership assigns the English and French display keys only to the new reference.
- UTF-8 without BOM and scoped whitespace checks passed.
- No app tests or emulator checks were run for this database-data addition.
