# RecipeBook JSON Schemas

This directory contains the versioned JSON Schemas used by RecipeBook.

## Files
- `recipe-creation.schema.v1.json`: AI-friendly payload for creating a single recipe.
- `full-library.schema.v1.json`: Canonical, lossless full-library format for persistence/import/export.
- Recipes may include `mainPhotoId` to mark which attached photo should be rendered as the primary image.
- Media references in schema payloads must use package-relative paths such as `photos/...` and `attachments/...`, never device-local absolute filesystem paths.

## Versioning
- Schema versions are explicit in each document via:
  - `schemaVersion` field constraint (const)
  - `$id` with versioned path
- Any breaking change requires a new versioned schema file (for example `*.v2.json`).

## Consistency rule
- Keep schema files, this documentation, schema examples, DTO/mappers, and schema tests fully consistent.
- Any change to one of these artifacts requires updating the others in the same change.


