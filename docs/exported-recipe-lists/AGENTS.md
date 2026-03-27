# Exported Recipe Lists Notes

## Purpose
- This folder stores raw and derived exports from external recipe apps/sites for cleanup and integration into RecipeBook.
- Treat these exports as source material to normalize, not as canonical final data.
- Use this folder for export-specific cleanup guidance only; project-wide rules live in the repository root `AGENTS.md`.

## Working Rules
- Prefer fixing typos, inconsistent naming, malformed characters, and mixed-language formatting instead of preserving them.
- Preserve enough raw source data to trace where cleaned content came from.
- Keep split per-recipe files reproducible from the original export when possible.
- Keep image references associated with each recipe during transforms.
- Ingredient cleanup should favor canonical ingredient references plus aliases rather than adding duplicate near-match ingredients.

## Current Structure
- `RecipeKeeper_20260320_143058/recipes.html`: original RecipeKeeper HTML export.
- `RecipeKeeper_20260320_143058/images/`: image files referenced by the export.
- `RecipeKeeper_20260320_143058/recipes/`: one raw JSON file per extracted recipe plus `_manifest.json`.
- `recipekeeper-ingredient-audit.md`: current ingredient matching audit against the bundled ingredient catalog.

## Notes
- If the export contains inconsistencies, duplicates, encoding issues, or awkward bilingual phrasing, fix them in derived data and normalization code rather than treating them as behavior to preserve.
- When new exports are added, prefer the same pattern: keep the raw export, generate reproducible split files, then build audits/normalizers on top.
