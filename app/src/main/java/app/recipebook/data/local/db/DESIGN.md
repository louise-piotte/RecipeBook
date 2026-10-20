# data.local.db Design

This package is the Room storage foundation for the recipe library.

## Responsibilities
- Define normalized entity tables and relation views for recipes and supporting catalogs.
- Expose DAOs used by `RecipeRepository` and related write/read orchestration.
- Contain database construction details in one place.

## Current Model Shape
- Recipes are stored as a graph: base recipe row plus ingredient lines, substitutions, links, tag cross refs, and collection cross refs.
- Supporting catalogs such as tags, collections, ingredient references, and contextual substitution rules have dedicated entities and DAOs.
- Relation wrappers provide the assembled storage graph consumed by repository mapping code.

## Design Rules
- Entities should model storage needs, not screen convenience.
- Relations should be explicit enough for repository mapping to remain readable.
- Transactional graph replacement is preferred over piecemeal mutation when editing a recipe.

## Maintenance Notes
- Any entity or DAO change usually requires matching updates in repository mappers and instrumentation coverage.
- Because the app is pre-MVP, evolve the schema in place instead of adding compatibility layers.
- Keep line/link/cross-ref deletion behavior obvious so edits do not leave orphaned rows.
- Ingredient-line localized editor fields are stored explicitly as paired FR/EN columns in Room so draft language switching does not depend on runtime descriptor translation.

Room schema version 10 stores nullable `ingredientFormId`, `ingredientAliasHint`, and `packageAmountJson` values on recipe ingredient lines. The 9-to-10 migration adds only the nullable package column, so existing lines remain unchanged; the existing 5/6/7-to-8 paths chain through versions 9 and 10. Package details are encoded with the recipe schema DTO and retain the original text. Migration instrumentation checks the columns and preserves recipe content, child rows, and media metadata.

The supported legacy upgrades preserve existing libraries. Versions 5, 6, and 7 first migrate to version 8; the observed installed version-5 variant already includes later contextual-rule and recipe-link tables, so those rows are retained while missing historical tables are created. Ingredient lines are rebuilt with both language fields retaining the sole legacy preparation/note text; IDs, quantities, units, optional/group metadata, substitutions, links, media JSON/paths, and existing settings/catalogs remain intact. Legacy libraries missing an initialization marker receive one so the current seed loader cannot restore or overwrite old user data on upgrade. Unsupported versions fail without deleting data. Instrumentation validates historical versions, the observed variant, relations and foreign keys, a second open, and unsupported-version failure using synthetic file databases under test-owned cache directories.
