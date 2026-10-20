# WP02 Section 04 B3 — modified rice starch (R116)

Reviewed and integrated on 2026-10-14. The broader Section 04 B3 regional-starch checklist remains open.

## Decision

Added identity-only **modified rice starch / amidon de riz modifié** as `ingredient-ref-modified-rice-starch`, category `FLOUR_AND_STARCH`. Kept it separate from ordinary rice starch and from modified starches made from other plants. Both alias lists are empty; do not generalize native pre-cooked grades, product codes, brands, or process-specific starch grades into aliases.

The CFIA naming construction supports the English form, while current Québec-facing ingredient declarations use the French wording. OQLF gives *amidon* as the preferred general French term. These sources support the display pair without claiming that all modified rice starch products share one chemistry or function.

No bundled recipe demand was found in the 114 manifest-listed recipes and 1,123 ingredient rows. No forms, measures, density, unit mappings, recipe links, conversions, yields, or substitutions were added. Product case size, SKU properties, and one manufacturer formula proportion remain source-specific.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added the identity-only reference.
- `docs/catalog/research-ledger.v1.json`: added the verified identity record, eight bounded sources, and no measurement observations or substitution findings.
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`: regenerated from canonical reference data.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` and `roadmap.md`: recorded the accepted subitem while keeping B3 open.

See the [R116 proposal](../../proposals/wp02-next-b3-regional-starch-gap-review-20261014-r1.md) for the full ownership, picker, recipe-corpus, source, and numeric-boundary review.

## Static verification

- Ingredient-reference normalization and bundled seed-package validation passed.
- The generated catalog is current at 1,459 references; the research ledger has 1,799 records.
- The row has no forms or numeric behavior. The broader `rice starch` / `amidon de riz` searches continue to include both ordinary and modified rice starch.
- The 114-recipe / 1,123-row bundle contains no modified-rice-starch line or recipe link.
- UTF-8 without BOM and scoped whitespace checks passed.

No application, Gradle, instrumentation, emulator, or deployment tests were run because this change only adds database JSON data and refreshes its generated catalog entry, as directed by `AGENTS.md`.
