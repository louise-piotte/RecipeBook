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
- Imported drafts can carry structured importer warnings into `RecipeEditorScreen.kt`; the editor should surface them as a compact review summary near the top rather than as a separate full-screen import review flow.
- Imported drafts may also carry pending ingredient-reference suggestions; the editor should treat those suggestions like selected existing ingredients for review, but catalog writes must still wait until the user saves.
- The import review UI should deduplicate repeated warnings, show compact provenance such as the input source type, and mirror important warnings beside the affected editor sections when that keeps review faster.
- In-app import entry points should stay discoverable from the library hamburger menu and reuse the same importer pipeline as Android share intake.
- The library hamburger menu is also the home for direct export actions that do not need a dedicated screen; long-running file work should stay out of composables and use thin launcher/save wiring only.
- Recipe text editing is active-language-only: the editor shows one localized text surface at a time and writes changes back to the currently selected app language while the opposite language is tracked through sync metadata.
- Ingredient-line `preparation` and `notes` follow that same active-language-only editor rule, but `originalText` remains a single shared source field and should never be auto-translated between tabs.
- The editor's regenerate action is asynchronous and currently uses a local stub generator; the UI should show progress, preserve the current draft on failure, and clearly tell the user the stub output still needs review.
