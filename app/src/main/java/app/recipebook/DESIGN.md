# app.recipebook Design

This package contains Android entry points and thin activity-level wiring.

## Responsibilities
- Host top-level activities for the library, detail, editor, collection manager, and ingredient/tag manager flows.
- Create app-scoped dependencies that are still simple enough to build directly in activities.
- Bridge classic Android lifecycle/events into Compose screens.
- Kick off launch-time library restore/sync behavior before Compose screens rely on the current library state.

## Design Rules
- Keep activities thin. Business rules and storage behavior belong in `data` or `domain`.
- Navigation intent extras defined here are part of the app's internal screen contract and should stay explicit.
- Shared state that survives only within a screen flow should usually live in Compose state, not activities.
- Share/import activities should do deterministic intake and then hand off into the normal editor instead of growing a parallel editing stack.

## Key Files
- `MainActivity.kt`: library entry point and language/repository setup.
- `MainActivity.kt`: library entry point, launch-time Drive/cache restore, and shared language/repository setup.
- `RecipeDetailActivity.kt` and `RecipeEditorActivity.kt`: recipe-specific flows.
- `ImportRecipeActivity.kt`: Android share-target entry that resolves shared text or URLs into an imported draft before launching the editor.
- `CollectionManagerActivity.kt` and `IngredientTagManagerActivity.kt`: management flows for supporting catalog data.
- `KeepScreenOn.kt`: activity utility, intentionally kept outside UI screens.

## Maintenance Notes
- If dependency setup grows, prefer introducing a clear app-level composition pattern rather than letting each activity drift.
- When adding a new screen flow, document its intent extras and the screen/repository dependencies it owns.
