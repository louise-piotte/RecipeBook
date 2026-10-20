# RecipeBook JSON Schemas

This directory contains the versioned JSON Schemas used by RecipeBook.

## Files
- `recipe-creation.schema.v1.json`: AI-friendly payload for creating a single recipe.
- `full-library.schema.v1.json`: Canonical, lossless full-library format for persistence/import/export.
- Recipes may include `mainPhotoId` to mark which attached photo should be rendered as the primary image.
- Media references in schema payloads must use package-relative paths such as `photos/...` and `attachments/...`, never device-local absolute filesystem paths.
- Substitution rules carry an explicit risk level, and `high_risk` rules must include bilingual warning text.
- Ingredient lines may preserve nullable `ingredientFormId`, `ingredientAliasHint`, and `packageAmount` fields in both payload schemas. Package amounts separate count/type from declared net size/unit and requested net/drained/edible basis; the original ingredient text is retained.
- Full-library v1 carries source-qualified package-yield observations in the canonical `package-yields.v1.json` ZIP part. A package yield remains tied to its ingredient, form, package size, product qualifiers, source, and reported basis.

## Versioning
- Schema versions are explicit in each document via:
  - `schemaVersion` field constraint (const)
  - `$id` with versioned path
- During MVP, evolve schema contents in place within v1 as required by repository policy; start a version upgrade only when real user databases are in circulation and compatibility matters.

## Consistency rule
- Keep schema files, this documentation, schema examples, DTO/mappers, and schema tests fully consistent.
- Any change to one of these artifacts requires updating the others in the same change.


