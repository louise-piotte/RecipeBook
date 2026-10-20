# WP04 Section P — sturgeon caviar picker hold (round 34)

**Date:** 2026-10-13  
**Decision:** Keep sturgeon caviar / `caviar d’esturgeon` outside the active ingredient catalog until a bundled recipe selects it.

OQLF defines caviar as salted fish eggs, particularly sturgeon, and says caviar from other fish is qualified by fish name. Current Québec retailer listings use `caviar d’esturgeon` and distinguish sturgeon products from salmon, trout, and other fish caviars. A Canadian producer lists separate shortnose and Atlantic sturgeon products. These sources support a sturgeon-caviar product boundary without selecting one species, origin, or formulation.

The current picker returns finger lime for `caviar`. A hypothetical display-only row for `sturgeon caviar / caviar d’esturgeon` would make both the English and French product phrases searchable, but would expand bare `caviar` to finger lime and sturgeon caviar. The 114 bundled recipe files (1,123 ingredient rows) contain no matching product demand, so no catalog row or research-ledger candidate was added. Existing salmon/trout/lumpfish roe, tobiko, masago, bottarga, sea-urchin roe, and finger lime remain separate. No forms, aliases, measures, densities, unit mappings, recipe links, conversions, yields, or substitutions were added.

The source-specific package sizes and tasting labels do not establish a recipe measure or universal portion. Health Canada’s broad 15 mL / 16 g observation for “Caviar, black or red” does not identify sturgeon caviar and is not used as a density or conversion.

## Files updated

- `docs/catalog/proposals/wp04-section-p-sturgeon-caviar-product-boundary-review-20261013-round34.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`

The Section P parent item remains open. The review is complete as a documentation-only hold; no bundled recipe currently selects the product.

## Verification

Static package validation, generated-index freshness, exact ownership and picker projections across active references/forms, legacy identities, and the research ledger, the bundled-recipe scan, source-prefix uniqueness, UTF-8/no-BOM, local-link, and scoped-whitespace checks passed. No tests were run because this integration changed documentation only and no database JSON data.
