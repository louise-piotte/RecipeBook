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
