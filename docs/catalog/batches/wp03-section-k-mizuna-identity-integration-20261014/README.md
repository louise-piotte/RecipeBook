# WP03 Section K — mizuna (R116)

Reviewed and integrated on 2026-10-14. The broader leafy-green and brassica sweep and independent Québec terminology review remain open.

## Decision

Added identity-only **mizuna / mizuna** as `ingredient-ref-mizuna`, category `VEGETABLE_AND_AROMATIC`. Québec French-facing seed and marketplace listings use the market name *Mizuna*; the catalog does not claim an OQLF-approved compound term.

Both alias lists are empty. Do not add `Japanese mustard greens`: that source-attested common name overlaps the existing broad mustard-greens picker results. Do not add `verdurette japonaise`, which appears descriptively in seed-product wording rather than as a Québec retail-standard name. Keep red and green cultivars, baby leaves, and microgreens out of this general identity.

The recipe bundle has no matching line among its 114 recipes and 1,123 ingredient rows. The reviewed 80 g retail pack, recipe-specific bunch/cup amounts, mesclun mixture weight, and raw-food refuse percentage were not activated as reusable measurements. No forms, density, mappings, recipe links, conversions, yields, or substitutions were added.

## Changed files

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`: added the identity-only reference.
- `docs/catalog/research-ledger.v1.json`: added the verified identity record, nine bounded sources, and no measurement observations or substitution findings.
- `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`: regenerated from canonical reference data.
- `docs/RecipeBook-global-ingredient-catalog-plan.txt` and `roadmap.md`: recorded the accepted candidate while leaving the broad Section K item open.

See the [R116 proposal](../../proposals/wp03-next-plant-identity-gap-review-20261014-r1.md) for the picker collision, Québec terminology caveat, recipe observations, and source-specific boundaries.

## Static verification

- Ingredient-reference normalization and bundled seed-package validation passed.
- The generated catalog is current at 1,459 references; the research ledger has 1,799 records.
- The existing broad `mustard greens` search results are preserved; no mizuna form, alias, or recipe link was added.
- UTF-8 without BOM and scoped whitespace checks passed.

No application, Gradle, instrumentation, emulator, or deployment tests were run because this change only adds database JSON data and refreshes its generated catalog entry, as directed by `AGENTS.md`.
