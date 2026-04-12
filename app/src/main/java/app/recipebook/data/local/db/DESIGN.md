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
