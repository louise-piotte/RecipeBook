# WP02/WP03/WP04 round-32 boundary review integration

Reviewed 2026-10-13. This batch integrates the three round-32 proposals and the root disposition for
the jellyfish identity.

## Decisions

- **WP02 A7 — malted finger millet flour:** Keep the candidate unallocated. Research establishes a
  laboratory product and an inconsistent manufacturer product lead, while a standalone Canadian
  product specification and Québec French display remain unverified. Add no reference, alias,
  ledger candidate, form, measure, recipe link, conversion, yield, or substitution. See the
  [proposal](../../proposals/wp02-a7-malted-finger-millet-flour-boundary-review-20261013-round32.md).
- **WP03 Section F — Fura millet balls:** Keep the cooked millet-ball product unallocated. The
  Canadian listing reviewed uses “Fura” for a milk-and-millet beverage, and no Québec-facing French
  display for standalone Fura balls was established. Add no reference, alias, ledger candidate,
  form, measure, recipe link, conversion, yield, or substitution. See the
  [proposal](../../proposals/wp03-section-f-fura-millet-ball-boundary-hold-20261013.md).
- **WP04 Section P — jellyfish:** Add identity-only `jellyfish / méduse` as
  `ingredient-ref-jellyfish` in `PROTEIN`. The reviewer recommended a hold because current products
  span different states and parts. The integrated row records only the broad edible ingredient
  class: a bilingual Canadian package and a current Québec menu establish French food-name usage,
  and OQLF supports `méduse` as the French term. Product-specific states and parts remain outside
  this row. Add no aliases, forms, measurements, density, unit mappings, conversions, yields, recipe
  links, or substitutions. The 114-recipe / 1,123-row bundle has no matching demand. See the
  [proposal](../../proposals/wp04-section-p-jellyfish-product-boundary-review-20261013-round32.md).

## Updated files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt` (generated)
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

## Verification

- Bundled package validation, ingredient-reference normalization, generated catalog index
  freshness, ledger schema, and source-ID uniqueness checks passed. The package contains 1,365
  active references after the addition.
- Static picker projection returns `ingredient-ref-jellyfish` for both `jellyfish` and `méduse`;
  salted-slice and marinated-product phrases remain unallocated. Active references, forms, and
  legacy candidates have no other exact jellyfish owner.
- The proposals report zero matching recipe demand across the unchanged 114-recipe / 1,123-row
  corpus; manifest-order recipe fingerprint: `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.
- UTF-8/no-BOM, local proposal links, and scoped whitespace checks passed.
- No tests or emulator checks were run. The change adds database JSON data and its generated data
  index; it does not change application behavior code, under the updated `AGENTS.md` rule.

WP02 A7, Section F, and Section P remain open.
