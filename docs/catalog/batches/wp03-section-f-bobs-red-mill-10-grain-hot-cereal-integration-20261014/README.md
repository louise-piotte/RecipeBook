# WP03 Section F — Bob’s Red Mill 10 Grain Hot Cereal integration

Reviewed and integrated 2026-10-14. The broader Section F cereal sweep remains open.

## Decision

Added identity-only **Bob’s Red Mill 10 Grain Hot Cereal / Céréales chaudes à 10 grains (Bob’s Red
Mill)** for the branded dry blend. Keep it separate from Bob’s Red Mill Mighty Tasty, Red River 7
Grain Hot Cereal, generic hot cereals, and its component grains. The row keeps the source-backed
title variants `10 Grain Cereal` and `Céréale chaude à 10 grains`; it does not claim the current
formula from the older preparation page, whose ingredients conflict with the current product page.

The current English and Canadian French manufacturer pages agree on the product's ten-component
blend and label serving of **1/4 cup (40 g)**. That portion is stored only as a product-specific
ledger observation. It does not create an active cup-to-mass mapping, density, or general cereal
conversion. The Québec retailer's 708 g package is SKU-specific and is not a kitchen measure.

No forms, active conversions, yields, recipe links, or substitutions were added. The
114-recipe / 1,123-ingredient-row corpus has no matching demand.

## Integration and static review

- Added `ingredient-ref-bobs-red-mill-10-grain-hot-cereal` and one accepted six-source ledger record
  with one label-serving observation.
- Updated the Section F checklist, roadmap, reviewed proposal, and generated catalog.
- After this and the same-batch lotus-starch integration: 1,438 references, 105 forms, and 1,778
  ledger records.
- Package normalization/validation, reference normalization, ledger-schema validation,
  generated-index freshness, source ownership, picker projection, recipe scan, encoding, local
  links, and scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the change only adds database
  JSON data and its generated catalog index.

See the detailed [review proposal](../../proposals/wp03-section-f-next-grain-gap-review-r100-20261014.md).

## Sources

- Bob’s Red Mill’s Canadian [Céréale chaude à 10 grains page](https://www.bobsredmill.ca/produit/10-grain-hot-cereal)
  and English [10 Grain Hot Cereal page](https://www.bobsredmill.com/product/10-grain-hot-cereal)
  list the current ingredients and 1/4 cup (40 g) serving.
- Québec retailer Nature Santé lists [Céréales chaudes 10 grains](https://naturesante.ca/fr/products/03997830110)
  under the Bob’s Red Mill brand and shows a 708 g package.
- The manufacturer’s [10 Grain Cereal preparation page](https://www.bobsredmill.com/recipes/how-to-make/basic-preparation-instructions-for-10-grain-cereal)
  supports only the short title variant; its ingredient paragraph conflicts with the current
  product-page formula.
- OQLF's [céréales entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26571637/cereales)
  supports the cereal-product wording. Its [gruau entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau)
  describes a cooked dish and does not support using `gruau` as an alias for this dry package.
