# data.local Design

This package contains the local-first implementation of app storage.

## Responsibilities
- Persist the core recipe library in Room.
- Seed the database from bundled assets when needed.
- Store lightweight app preferences separately when they do not belong in the recipe library model.

## Structure
- `db`: Room entities, relations, DAOs, and database setup.
- `recipes`: repository logic, seed package loading, imports, substitutions, and photo storage.
- `settings`: app-level preference state such as selected language.
- `shoppinglist`: separate DataStore-backed persistence for shopping list work-in-progress state.

## Design Rules
- Recipe library persistence is relational and lives in Room.
- App settings and shopping list state intentionally avoid being modeled as schema/export DTOs right now.
- Seed loading initializes the library. Later seed checks may add missing bundled ingredient-reference IDs, while preserving existing reference rows and deleted bundled recipes.
- Shipped ingredient identities and standard units come from the split seed package; catalog matching and unit conversions must use the generated/reference-backed data rather than a second hand-maintained list.
- Package-yield observations are another split bundled/catalog part, persisted with the other measurement catalogs. Recipe-line package amounts stay nullable in Room so legacy recipe rows remain intact.

## Maintenance Notes
- Keep cross-package responsibilities clear: `db` stores, `recipes` orchestrates, `settings` and `shoppinglist` persist narrow concerns.
- If a feature starts as local-only but later becomes part of import/export, document that transition and move the authoritative model carefully.
