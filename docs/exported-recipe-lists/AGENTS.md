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

## Recipe Import And Library Cleanup
- Recipe import cleanup means converting recipes into the app's bundled startup-import files under `app/src/main/assets/seed/bundled-library` so they are imported by the app on first load; normalize wording consistently across recipes, use Quebec French, replace outdated ingredient-tag assumptions with current tags, add missing translations, and add missing ingredient/tag entries or aliases when needed.
- After adding recipes to the seed, validate that the app is still correctly populated with the recipes using the emulator.
- Bundled seed recipe filenames must keep the original recipe-name slug before the UUID, for example `005-bao-buns-vapeur-steamed-bao-buns-<uuid>.v1.json`, instead of collapsing to a UUID-only filename.
- Consistency is a primary rule for recipe cleanup. Keep recurring conventions such as oven temperature wording, unit phrasing, capitalization, punctuation, and bilingual terminology aligned across the whole library.
- Recipe cleanup formatting rules:
  - Write temperatures as `x\u00b0C/y\u00b0F`.
  - Write times as `xh ymin zsec`, omitting zero-value parts such as `0 h` or `0 sec`.
  - Fill missing structure and translations as accurately as possible without inventing missing factual data such as absent cook times.
- If recipe text include "marketing" words like: "The best" or "way better" remove them.
- Recipe titles should use direct translations validated against the term actually used in context. When a source URL exists, consult it for translation context only. Do not overwrite personalized recipe amounts from the user's saved copy even if the source now differs.
- If source images are available, recipe import cleanup should port recipe pictures into the app database/assets flow as part of the same import work.
- If a source recipe still contains unresolved either/or ingredient choices or variant selections, stop and ask the user instead of importing every option.
- Once an exported source recipe has been processed into the app format, rename the original export file to append `processed_` at the start of the name. Do not alter that source file's content, and do not carry forward the old `\u00c0 nettoyer/To Clean` source grouping as an imported tag.
- A long-term goal is to clean, normalize, and integrate the contents of `docs/exported-recipe-lists`; when inconsistencies or typos or just bad formulation are found there, fix them rather than preserving them.
- Always review the language, in both French and English and fix it when cleaning a recipe.
- Do not add unit tests that lock in individual recipe content details. Shared ingredient catalogs, shared tag catalogs, schema shape, and generic structural validation are fine to test.
- If the source gives both volume and weight, weight is always preferred.
- Remove numbers for the instructions steps.

## Notes
- If the export contains inconsistencies, duplicates, encoding issues, or awkward bilingual phrasing, fix them in derived data and normalization code rather than treating them as behavior to preserve.
- When new exports are added, prefer the same pattern: keep the raw export, generate reproducible split files, then build audits/normalizers on top.
