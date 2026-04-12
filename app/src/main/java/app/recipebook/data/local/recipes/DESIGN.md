# data.local.recipes Design

This package contains the main recipe-library orchestration layer.

## Responsibilities
- Expose the app's primary `RecipeRepository`.
- Load bundled library content and supporting catalogs.
- Handle recipe import helpers, substitution resolution, and app-managed photo file storage.

## Important Pieces
- `RecipeRepository.kt`: main read/write API for recipes, tags, collections, ingredient references, and contextual substitution rules.
- `RecipeRepositoryProvider.kt`: central place to assemble Room + repository dependencies.
- `BundledRecipeLibraryLoader.kt`, `BundledIngredientCatalog.kt`, `BundledTagCatalog.kt`: seed and catalog hydration from assets.
- `IngredientSubstitutionResolver.kt`: domain-facing substitution/conversion helper logic backed by stored and seeded data.
- `RecipePhotoStore.kt`: local file ownership for recipe photos.
- `RecipeKeeper*Import.kt`: import parsing from RecipeKeeper exports into domain-friendly data.

## Core Design
- Repository methods return domain models and flows, not Room entities.
- Validation that protects graph integrity lives close to repository writes.
- Bundled seed data and user-created data are combined by repository orchestration, but the user database becomes authoritative after seeding.

## Maintenance Notes
- When changing recipe structure, review graph replacement logic carefully; most bugs here are partial-write or mapping drift issues.
- Ingredient reference and substitution behavior spans seed data, Room persistence, and UI editing flows, so keep naming and IDs consistent.
- Photo handling should treat app-managed file paths as internal implementation details; UI should consume domain `PhotoRef`s.
