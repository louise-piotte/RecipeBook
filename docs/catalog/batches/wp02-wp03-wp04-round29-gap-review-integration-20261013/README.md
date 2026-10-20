# WP02/WP03/WP04 round-29 gap review integration

Reviewed 2026-10-13. This batch integrates two evidence-based holds and one narrow prepared-product
identity from the round-29 proposals.

## Decisions

- **WP02 A7 — amaranth meal:** Keep inactive. Walmart Canada's retailer title includes “Powder,
  Meal,” but the listing classifies the item as flour/powder and repeats Yupik's description of
  finely milled amaranth. OQLF describes the seed as usable whole or ground into flour, without
  defining a distinct meal product or Québec French name. Do not add an active reference, alias,
  candidate, form, measure, recipe link, conversion, yield, or substitution. See
  [the proposal](../../proposals/wp02-a7-amaranth-meal-boundary-review-20261013-round29.md).
- **WP03 Section F — Tom Brown:** Keep inactive. The evidence spans variable cereal/legume products,
  flours, and prepared porridges without establishing one formula or Québec French product name.
  The current picker would make bare `tom` resolve only to a new Tom Brown row. Do not add an active
  reference, alias, candidate, form, measure, recipe link, conversion, yield, or substitution. See
  [the proposal](../../proposals/wp03-section-f-tom-brown-cereal-mix-boundary-hold-20261013.md).
- **WP04 Section P — crab-flavoured pollock flakes:** Add identity-only
  `crab-flavoured pollock flakes / goberge en flocons à saveur de crabe` as a `PROTEIN` reference
  for Metro's paired Selection listing. Its English and French product phrases are the only search
  terms; do not assign a pollock species or alias it to pollock, goberge, crab meat, surimi, or
  similicrabe. Keep it separate from raw fish, actual crab meat, fish balls, and generic surimi.
  The 227 g listing is a package size. Parallel 2013 Metro quiche recipes disagree at 225 g and
  150 g, so add no reusable measure, form, conversion, yield, or recipe link. No substitution is
  supported. The ledger records the identity and why numeric/substitution data remain empty. See
  [the proposal](../../proposals/wp04-section-p-crab-flavoured-pollock-flakes-product-boundary-review-20261013-round29.md).

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: one prepared-product
  identity.
- `docs/catalog/research-ledger.v1.json`: source-backed product identity record and explicit
  no-supported-value measurement/substitution dispositions.
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`: generated
  search index for the new reference.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: completed the three review items and kept
  WP02 A7, Section F, and Section P open.

No recipe rows, forms, measurements, density, unit mappings, conversions, yields, or substitutions
were added. No roadmap priority changed.

## Verification

Static bundled-package normalization and validation, generated-index freshness, research-ledger
schema/source-ID validation, proposal-link checks, UTF-8/no-BOM checks, and scoped whitespace checks
passed. No unit, instrumentation, emulator, or other tests were run: the catalog change only adds
database JSON data, as allowed by `AGENTS.md`.
