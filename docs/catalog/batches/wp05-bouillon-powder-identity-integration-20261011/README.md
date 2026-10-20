# WP05 chicken bouillon powder identity integration

## Decision

Added identity-only `chicken bouillon powder / bouillon de poulet en poudre` in `STOCK_AND_BROTH`,
with no aliases. Lee Kum Kee Professional Canada uses the bilingual wording for dry chicken-flavoured
products. Its English and French pages have different ingredient declarations, so the names support
the bilingual display pair only; no formulation or exact-SKU equivalence is assumed. A separate
current Québec retailer listing corroborates the English product-class wording.

Kept unqualified broth/stock powders, cubes, granules, dry bases, liquid concentrates, prepared broth,
and brand names separate. The 114 bundled recipes contain no dry bouillon line; no recipe link, form,
density, unit mapping, package yield, conversion, or substitution was added.

Sources: [bouillon-powder product-boundary review](../../proposals/wp05-bouillon-powder-product-boundary-review-20261011.md),
[Lee Kum Kee EN](https://ca.lkk.com/en/foodservices/products/premium-chicken-bouillon-powder),
[Lee Kum Kee FR](https://ca.lkk.com/fr-ca/foodservices/products/chicken-bouillon-powder),
[Super C Québec listing](https://www.superc.ca/en/aisles/pantry/herbs-spices-sauces/stock-gravy/chicken-bouillon-powder/p/048001015258),
[Satau product categories](https://satau.ca/en/our-products/gobio/),
[Unilever liquid base](https://www.unileverfoodsolutions.ca/en/product.1-EN-859529.html).

## Files and verification

Updated the reference JSON, generated Kotlin search index, research ledger, global plan, and roadmap. The
package has 1,034 references / 72 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,326
records / 4,335 source entries / 3,568 distinct source IDs.

Package normalization and validation, reference normalization, generated-index freshness, research-ledger
schema validation, exact collision and recipe-demand checks, UTF-8/no-BOM, whitespace, and scoped
`git diff --check` passed. No tests or emulator were needed for the database JSON addition.
