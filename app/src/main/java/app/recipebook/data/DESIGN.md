# data Design

This layer owns persistence formats, local storage access, seed loading, and schema mapping.

## Responsibilities
- Convert between storage representations and domain models.
- Keep Room, DataStore-backed settings, seed packages, and import/export DTOs coordinated.
- Enforce storage-facing validation close to write paths.

## Subpackages
- `local`: Room database, repository, seed loaders, settings store, and shopping-list persistence.
- `schema`: serialized DTOs and mappers for import/export payloads.

## Boundaries
- UI code should not depend on Room entities or schema DTOs directly.
- Domain models should remain the handoff format between data and UI.
- Storage concerns such as transaction shape, aliases normalization, and seed hydration should stay here.

## Maintenance Notes
- When a model changes, check all three surfaces: Room/entity mapping, schema DTO mapping, and seed content/tooling.
- Prefer explicit mapping code over clever reflection or generic abstraction because the product model is still changing quickly.
