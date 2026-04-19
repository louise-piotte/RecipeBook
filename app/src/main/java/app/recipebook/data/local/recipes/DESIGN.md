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
- `RecipeExportCodec.kt`, `RecipeLibraryExporter.kt`: seed-shaped export packaging that writes one recipe JSON per file plus manifest, split catalog files, and packaged media into a single zip; also exposes an internal ingredient-catalog JSON export.
- `IngredientSubstitutionResolver.kt`: domain-facing substitution/conversion helper logic backed by stored and seeded data.
- `RecipePhotoStore.kt`: local file ownership for recipe photos, including webpage-photo downloads into draft storage before the editor saves them permanently.
- `RecipeLocalizationCoordinator.kt`: bilingual save/regeneration seam that treats the active editor language as authoritative, tracks draft sync status, applies regenerated ingredient-line wording, and surfaces ingredient-reference suggestions for repository creation/reuse.
- `RecipeLanguageRegenerator.kt`: pluggable opposite-language generation contract plus the current local stub implementation used to complete the editor UX safely. The contract now allows regenerated ingredient lines and optional bilingual ingredient-reference drafts alongside regenerated localized text.
- `RecipeAiRuntime.kt`: runtime factory plus shared OpenAI-compatible client used to build settings-aware importer AI and opposite-language regeneration with deterministic/local-stub fallback.
- `SharedRecipeImport.kt`: deterministic shared-text and shared-URL intake, staged importer models (`ImportSource`, `ImportDraftJob`, `RawExtractionBundle`, warnings), primary recipe-image extraction from JSON-LD or page metadata, a pluggable `AiRecipeImportService` seam for draft finishing, deterministic fallback mapping, and structured imported-ingredient draft models that can carry quantity/unit/preparation data plus real or pending ingredient-reference decisions into the editor.
- `RecipeKeeper*Import.kt`: import parsing from RecipeKeeper exports into domain-friendly data.

## Core Design
- Repository methods return domain models and flows, not Room entities.
- Validation that protects graph integrity lives close to repository writes.
- Bundled seed data and user-created data are combined by repository orchestration, but the user database becomes authoritative after seeding.
- Export packaging should mirror the bundled seed package layout rather than inventing a parallel recipe archive format, so recipe JSON, manifest references, and packaged media stay compatible with the existing seed loader/tests.
- Import helpers should extract whatever is reliable without AI, keep source evidence and warnings in staged importer models, send the current ingredient catalog plus deterministic draft JSON when AI finishing is available, and fall back deterministically when that finishing step is skipped or invalid.
- Shared webpage imports should keep the source page's primary recipe image when one can be resolved, then hand that image off through the app-managed photo pipeline so `mainPhotoId` behavior stays consistent with manual photo imports.
- Runtime AI integration should read local app settings for `apiKey`, `baseUrl`, and shared `model`, call one OpenAI-compatible backend seam, and preserve deterministic import plus local-stub regeneration as fallbacks.
- Bilingual save orchestration and regeneration should happen here rather than in Compose so later translation/regeneration backends can plug into one persistence-facing seam.
- Import-time ingredient matching should prefer existing ingredient references, carry pending alias/new-reference drafts through the editor without immediate persistence, and resolve those drafts only when the user saves so canceled imports do not mutate the catalog.
- Ingredient-aware regeneration should preserve the AI-regenerated line wording, then create or reuse bilingual ingredient references separately so canonical lookup data does not overwrite the just-regenerated user-facing text.

## Maintenance Notes
- When changing recipe structure, review graph replacement logic carefully; most bugs here are partial-write or mapping drift issues.
- Ingredient reference and substitution behavior spans seed data, Room persistence, and UI editing flows, so keep naming and IDs consistent.
- Photo handling should treat app-managed file paths as internal implementation details; UI should consume domain `PhotoRef`s.
