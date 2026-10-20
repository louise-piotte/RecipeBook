# WP05 Section Z R446 steak-sauce identity integration

## Decision

Added identity-only `steak sauce / sauce à bifteck` as `ingredient-ref-steak-sauce` in `SAUCE_AND_CONDIMENT`, with the French alias `sauce à steak`. The row represents commercially marketed steak-sauce products without asserting a shared formula. Keep barbecue sauce and Worcestershire sauce separate; do not add product-brand aliases, a generic brown-sauce crosswalk, or a formula. See the [R446 review](../../proposals/wp05-section-z-steak-sauce-identity-review-r446-20261017.md).

The bundled package has no matching recipe demand. The official A.1. 1 tbsp (15 mL) serving is product-specific, and the external Canadian Beef quantities are recipe-specific; no reusable measure, density, mapping, form, recipe link, conversion, yield, or substitution was added. Measurement research found no supported generic value; substitution research remains open.

## Catalog and corpus

- Added one active reference and one identity-ledger record; no recipe JSON or ingredient forms changed.
- Exact English and French queries map to the new identity. The broad `sauce` query adds one row.
- The 114 manifest-listed recipes / 1,123 ingredient rows contain no steak-sauce demand. Existing barbecue sauce rows in recipes 036 and 082 and Worcestershire rows in 074 and 078 remain linked unchanged.
- Package normalization and ledger validation completed. The change only adds database JSON data, so no app tests, build, emulator check, or deployment was needed.

WP05 Section Z remains open for its other condiment identities and broader Québec terminology review.
