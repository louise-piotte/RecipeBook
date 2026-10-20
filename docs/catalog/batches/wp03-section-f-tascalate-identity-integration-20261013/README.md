# WP03 Section F tascalate identity integration — 2026-10-13

## Decision

Added `ingredient-ref-tascalate` as an identity-only `GRAIN_AND_CEREAL` reference, displayed as
`tascalate / tascalate`, for the named Chiapas dry mix. The state artisan marketplace lists a bag of
tascalate with maize, cacao, sugar, cinnamon, and achiote; Visit Chiapas describes a related powdered
mixture for preparing the drink. The sources do not establish one universal formulation. Keep the
French loan-name display provisional because no Québec-facing package or terminology ruling was
found. No aliases, forms, density, unit mappings, recipe links, measurements, conversions, yields, or
substitutions were added.

The state marketplace's 250 g package and the tourism page's example beverage recipe quantities are
source-specific and are not reusable ingredient measures. Keep prepared tascalate, pinole, pozol,
roasted corn flour, cornmeal, and masa harina distinct.

## Evidence and data changes

- The [Chiapas state artisan marketplace](https://casadelasartesaniaschiapas.gob.mx/online/detalle_producto.php?id=99)
  lists a named 250 g bag with maize, cacao, sugar, cinnamon, and achiote.
- [Visit Chiapas](https://visitchiapas.com/v1/1tascalate) describes tascalate as a powdered maize,
  cacao, cinnamon, and achiote mixture used with water or milk, and provides a beverage preparation
  example. Its quantities do not describe the marketplace bag's formula.
- The [French Chiapas tourism guide](https://programadestinosmexico.com/guias-turisticas-de-mexico/chiapas-guia/Guide-Touristique-de-chiapas.pdf)
  retains `tascalate` as the name of a regional maize-based drink, but gives a different ingredient
  gloss. It supports the loan-name spelling, not a universal formula or Québec terminology ruling.

The proposal's scan found no matching term in 114 bundled recipes or 1,123 ingredient rows.

- Added one reference to `ingredient-references.v1.json` with empty aliases, null density, empty unit
  mappings, and category `GRAIN_AND_CEREAL`.
- Added one verified identity record and three source records to `research-ledger.v1.json`. Measurement
  and substitution states remain blocked pending exact recipe/product evidence.
- Regenerated `BundledIngredientCatalog.kt` from the canonical reference JSON. The manifest and schema
  did not change.

No app tests or emulator checks were run because this change only adds database JSON data and its
generated catalog index. Static seed-package, ingredient-normalization, and generated-index checks
were used. See the [proposal](../../proposals/wp03-section-f-chiapas-tascalate-dry-mix-identity-review-20261013-r50.md)
and [Section F checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
