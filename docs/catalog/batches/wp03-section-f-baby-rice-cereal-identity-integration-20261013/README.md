# WP03 Section F baby rice cereal identity integration

Reviewed and integrated on 2026-10-13 from [the proposal](../../proposals/wp03-section-f-baby-rice-cereal-identity-review-20261013.md).

## Decision

Add identity-only `baby rice cereal / céréales de riz pour bébés` as `ingredient-ref-baby-rice-cereal` in `GRAIN_AND_CEREAL`. Keep it separate from crispy rice cereal, plain rice, rice flour, and cream of rice. Canadian manufacturer pages and Québec public-health material support the product class and bilingual display. The current ingredient formula and instructions vary by product, so the 5 tbsp / 28 g and 90 mL values remain package-specific and are not catalog measures.

The row has empty aliases, no forms, null density, and no unit mappings. Its research record documents the identity and the lack of a supported reusable measure or substitution. Broad `rice cereal` / `céréales de riz` queries now show both infant and crispy products; qualified infant-cereal queries select the new row. The 114-recipe / 1,123-row corpus has no infant-specific demand, and no recipe was changed.

## Files

- Active reference: `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- Research evidence: `docs/catalog/research-ledger.v1.json`
- Generated import index: `app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt`
- Plan and roadmap: `docs/RecipeBook-global-ingredient-catalog-plan.txt`, `roadmap.md`
- Proposal: [baby rice cereal review](../../proposals/wp03-section-f-baby-rice-cereal-identity-review-20261013.md)

Static reference/package, ledger, ownership, picker-projection, recipe, generated-index, UTF-8/no-BOM, link, and whitespace checks passed. No tests or emulator checks were run under the database-JSON-only rule in `AGENTS.md`.
