# data.local.shoppinglist Design

This package stores shopping-list state outside the main recipe library schema.

## Responsibilities
- Persist shopping-list data in a lightweight local-only form.
- Keep shopping-list implementation decoupled from import/export schema work while the feature is still evolving.

## Design Rules
- Treat this as app-local persistence, not canonical library interchange.
- Keep models focused on what the shopping list needs today; do not prematurely merge them into recipe schema DTOs.

## Maintenance Notes
- If shopping-list data eventually becomes exportable or syncable, revisit ownership and document the new source of truth here first.
