# ui.recipes Design

This package contains the main Compose product UI.

## Responsibilities
- Render the library list, detail, editor, collection manager, and ingredient/tag manager experiences.
- Hold screen-specific state and small reusable components that are specific to recipe workflows.
- Coordinate activity launches for screen-to-screen navigation through the host activities.

## Current Screen Set
- `RecipeLibraryScreen.kt`: main library browsing, search, filtering, and top-level actions.
- `RecipeDetailScreen.kt`: read-only recipe presentation and recipe actions.
- `RecipeEditorScreen.kt`: recipe editing flow and supporting form logic.
- `CollectionManagerScreen.kt` and `IngredientTagManagerScreen.kt`: supporting catalog management.
- `RecipePhotoUi.kt`, `RecipePhotoLifecycle.kt`, `RecipeRatingStars.kt`, `ReferenceDraftDialogs.kt`: recipe-specific reusable UI helpers.

## Design Rules
- Keep state as local as possible to the screen that owns it.
- Shared helpers in this package should still be recipe-flow specific; move them elsewhere only if they become broadly reusable.
- Prefer domain models as input props rather than exposing storage-layer types to Compose.

## Maintenance Notes
- Large screen files can grow quickly. When splitting them, group extracted components by workflow instead of making generic utility files too early.
- When adding UI around new data fields, confirm the repository and localization behavior already support the intended workflow.
- Imported recipes should still open in `RecipeEditorScreen.kt` so parsing review happens inside the normal editing experience instead of a separate draft-only screen for now.
