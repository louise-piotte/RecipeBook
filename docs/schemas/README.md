# RecipeBook JSON Schemas

This directory contains the versioned JSON Schemas used by RecipeBook.

## Files
- `recipe-creation.schema.v1.json`: AI-friendly payload for creating a single recipe.
- `full-library.schema.v1.json`: Canonical, lossless full-library format for persistence/import/export.

## Versioning
- Schema versions are explicit in each document via:
  - `schemaVersion` field constraint (const)
  - `$id` with versioned path
- Any breaking change requires a new versioned schema file (for example `*.v2.json`).
