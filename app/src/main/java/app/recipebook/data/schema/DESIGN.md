# data.schema Design

This package defines serialized payload shapes and explicit mapping to and from domain models.

## Responsibilities
- Define the app's JSON payload contracts for recipe creation and full-library export/import.
- Keep mapping code explicit so schema changes are easy to audit.

## Key Files
- `SchemaDtos.kt`: serialized DTO definitions and schema version constants.
- `SchemaMappers.kt`: conversion between DTOs and domain models.

## Design Rules
- DTOs are wire/storage contracts, not business objects.
- Schema versions should change only when the payload contract changes, not for unrelated implementation details.
- Keep bilingual completeness and library round-trip behavior aligned with `Requirements.md` and docs under `docs/schemas`.

## Maintenance Notes
- Any change here should trigger a review of domain models, seed examples, schema docs, and round-trip tests.
- During MVP, evolve v1 in place as directed by repo rules instead of adding compatibility layers.
- Ingredient-line bilingual fields such as `preparation` and `notes` should stay modeled as `{ fr, en }` objects in both recipe-creation and full-library payloads; only source-capture fields like `originalText` stay single-language.
- Recipe ingredient lines may carry nullable `ingredientFormId` and `ingredientAliasHint` fields. These preserve an explicit preparation choice and user wording through recipe creation and canonical full-library v1 JSON; both fields are represented in the JSON Schema and round-trip tests.
- Ingredient lines may carry nullable `packageAmount` data for parsed package count/type, declared net size/unit, packing medium, product qualifiers, and requested usable basis. Full-library v1 also carries a separate `packageYields` catalog part with source and product qualifiers; both surfaces are represented in the recipe/package schemas, canonical ZIP manifest, mapper round trips, and tests.

Catalog storage and editor saved state reuse internal schema part mappers. These internal mapper visibility changes do not change DTO fields, schema versions, or the canonical full-library ZIP layout. Editor state explicitly retains actual local photo/attachment paths rather than export-relative paths.
