# WP02 A7 — roasted oat malt flour identity integration

Reviewed and integrated 2026-10-13 from the [R30 proposal](../../proposals/wp02-a7-roasted-oat-malt-flour-identity-review-20261013-round30.md).

## Decision

Add identity-only `roasted oat malt flour / farine de malt d'avoine torréfiée` as a
`FLOUR_AND_STARCH` reference for Castle Oat 80. The English and French displays follow Castle's
current manufacturer listings. Castle's English listing calls the product roasted oat malt flour,
non-enzymatic; its French listing says farine de malt d'avoine torréfiée, non enzymatique. The
manufacturer's general malt-flour page describes malt flour as finely milled germinated and dried
cereal grain and describes controlled drying, roasting, and milling. The French wording is
manufacturer language, not an OQLF ruling or Québec retail label.

Keep this identity separate from plain oat flour, ordinary roasted oat flour, generic malt flour,
other cereal-specific malt flours, and Hodmedod's recipe-specific malted naked oat flour. Do not
add aliases, forms, measures, density, unit mappings, conversions, yields, recipe links, or
substitutions. The bundle has no matching ingredient line. Hodmedod's 50 g amount and flour
alternative remain specific to its own recipe and product wording.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: one identity-only
  reference with empty aliases and unit mappings and null density.
- `docs/catalog/research-ledger.v1.json`: four source records plus the identity decision and
  explicit researched-no-supported-value measurement/substitution states.
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`: regenerated
  search index.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`: completed this bounded item; WP02 A7
  remains open.

## Verification

Static package normalization and validation, ingredient-reference normalization,
generated-index freshness, ledger schema/source-ID validation, UTF-8/no-BOM, local-link, and scoped
whitespace checks passed. No unit, instrumentation, emulator, or other tests were run because the
change only adds database JSON data, per `AGENTS.md`.
