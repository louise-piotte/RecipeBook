# data.local.recipes Design

This package contains the main recipe-library orchestration layer.

## Responsibilities
- Expose the app's primary `RecipeRepository`.
- Load bundled library content and supporting catalogs.
- Handle recipe import helpers, substitution resolution, and app-managed photo file storage.

## Important Pieces
- `RecipeRepository.kt`: main read/write API for recipes, tags, collections, ingredient references, and contextual substitution rules.
- `RecipeRepositoryProvider.kt`: central place to assemble Room + repository dependencies.
- `BundledRecipeLibraryLoader.kt` and `BundledTagCatalog.kt`: seed and tag-catalog hydration from assets. `BundledIngredientCatalog.kt` is the generated Kotlin import-audit index derived from the canonical ingredient-reference JSON.
- `RecipeExportCodec.kt`, `RecipeLibraryExporter.kt`: seed-shaped export packaging that writes one recipe JSON per file plus manifest, split catalog files, and packaged media into a single zip; also exposes an internal ingredient-catalog JSON export.
- `RecipeLibraryImportCodec.kt`, `RecipeLibraryAssetStore.kt`: replace-mode import reader for that same canonical seed-shaped zip plus staged media materialization into app-managed files.
- `RecipeLibrarySyncCoordinator.kt`, `RecipeLibraryCacheStore.kt`: local cached-library snapshots plus Storage Access Framework backed Drive backup/pull behavior using one configured Drive zip document.
- `IngredientSubstitutionResolver.kt`: domain-facing substitution/conversion helper logic backed by stored and seeded data.
- `RecipePhotoStore.kt`: local file ownership for recipe photos, including webpage-photo downloads into draft storage before the editor saves them permanently.
- `RecipeLocalizationCoordinator.kt`: bilingual save/regeneration seam that treats the active editor language as authoritative, tracks draft sync status, preserves shared ingredient-line source text during opposite-language regeneration, merges bilingual ingredient preparation/notes updates, and surfaces ingredient-reference suggestions for repository creation/reuse.
- `RecipeLanguageRegenerator.kt`: pluggable opposite-language generation contract plus the current local stub implementation used to complete the editor UX safely. The contract now allows regenerated ingredient lines and optional bilingual ingredient-reference drafts alongside regenerated localized text.
- `RecipeAiRuntime.kt`: runtime factory plus shared OpenRouter client for settings-aware importer AI and opposite-language regeneration with deterministic/local-stub fallback. `RecipeAiJsonSchema.kt` derives strict response schemas from the serializable recipe DTOs.
- `SharedRecipeImport.kt`: deterministic shared-text and shared-URL intake, staged importer models (`ImportSource`, `ImportDraftJob`, `RawExtractionBundle`, warnings), primary recipe-image extraction from JSON-LD or page metadata, a pluggable `AiRecipeImportService` seam for draft finishing, deterministic fallback mapping, and structured imported-ingredient draft models that can carry quantity/unit plus authoritative-language preparation/notes data and real or pending ingredient-reference decisions into the editor.
- `RecipeKeeper*Import.kt`: import parsing from RecipeKeeper exports into domain-friendly data.
- `IngredientUnitConverter.kt`: builds a deterministic graph from bundled unit definitions, ingredient mappings, and the explicitly selected form's density; disagreeing paths are unavailable.

## Core Design
- Repository methods return domain models and flows, not Room entities.
- Validation that protects graph integrity lives close to repository writes.
- Bundled seed data and user-created data are combined by repository orchestration, but the user database becomes authoritative after seeding.
- Export packaging should mirror the bundled seed package layout rather than inventing a parallel recipe archive format, so recipe JSON, manifest references, and packaged media stay compatible with the existing seed loader/tests.
- Full-library import/export/sync should use that same canonical seed-package zip layout everywhere, including bundled data, Drive backup, cached local snapshots, and any future whole-library handoff flows.
- Import helpers should extract whatever is reliable without AI, keep source evidence and warnings in staged importer models, send the current ingredient catalog plus deterministic draft JSON when AI finishing is available, and fall back deterministically when that finishing step is skipped or invalid.
- Drive backup uses Android's document provider flow rather than a separate Drive REST client: the app persists one document URI locally, pushes a fresh canonical zip after each library mutation, pulls it on launch, and falls back to the last cached local zip if Drive is unavailable.
- Shared webpage imports should keep the source page's primary recipe image when one can be resolved, then hand that image off through the app-managed photo pipeline so `mainPhotoId` behavior stays consistent with manual photo imports.
- Runtime AI integration reads provider-scoped OpenRouter settings, uses the fixed HTTPS endpoint and the verified default `openai/gpt-5.4`, and preserves deterministic import plus local-stub regeneration as fallbacks. Requests carry strict JSON schemas derived from response DTOs and require supporting endpoints; provider data collection is denied. Missing keys make no request. HTTP redirects are disabled, responses/errors are sanitized, cancellation propagates, and raw backend text, credentials and private recipe prompts are not logged.
- Bilingual save orchestration and regeneration should happen here rather than in Compose so later translation/regeneration backends can plug into one persistence-facing seam.
- Import-time ingredient matching should prefer existing ingredient references, carry pending alias/new-reference drafts through the editor without immediate persistence, and resolve those drafts only when the user saves so canceled imports do not mutate the catalog.
- Ingredient-aware regeneration must not overwrite shared `IngredientLine.originalText` or `ingredientName` when generating the opposite recipe language because those fields are still single-language source data; only bilingual recipe text, bilingual ingredient preparation/notes, and ingredient-reference suggestions should change.

## Maintenance Notes
- When changing recipe structure, review graph replacement logic carefully; most bugs here are partial-write or mapping drift issues.
- Ingredient reference and substitution behavior spans seed data, Room persistence, and UI editing flows, so keep naming and IDs consistent.
- Recipe detail reuses one `IngredientSubstitutionResolver` across all ingredient lines. It builds reference/form/rule maps and groups rules by source once for a recipe/catalog snapshot; callers must rebuild it when the recipe, tags, references, or catalog changes.
- Photo handling should treat app-managed file paths as internal implementation details; UI should consume domain `PhotoRef`s.

- Seed initialization is transactional and recorded in library metadata; reopening an initialized library must not restore deleted bundled recipes or overwrite edited collections. On later startup, newly added bundled ingredient-reference IDs are inserted only when absent, preserving existing user-edited rows. For an initialized bundled library with a stored catalog, new form and package-yield IDs are appended only when absent; same-ID edits and imported libraries remain untouched.
- `RecipeWorkResult.kt` propagates coroutine cancellation through import, regeneration and backup fallback boundaries. Unexpected AI failures retain deterministic drafts; malformed numeric output is rejected and raw exception/backend response text is not persisted as recipe metadata.
- Local backup snapshots are staged and atomically replaced after a complete copy, preserving the last usable zip when a copy fails. Imported asset identifiers are validated before directory creation or file writes.
- Local-stub regeneration remains available as a fallback, but its generated language stays marked as needing regeneration rather than claiming a validated translation.

Imported ingredient forms, source-specific package-yield observations, global form-substitution rules, and units persist in a dedicated catalog preferences DataStore using the existing schema part DTOs. An explicitly empty imported catalog remains empty after restart. Full-library import/export carries these parts through the canonical manifest ZIP. Catalog writes are restored when replacement fails. Media imports stage beside managed files, retain prior media through the database commit, and roll back normal filesystem/database failures. Cancellation is deferred during the short commit. Abrupt process termination between the separate durable stores is not an atomic cross-store transaction. Backup failures after local mutation show a localized warning without failing the completed local write.

When a library settings row exists, it remains authoritative, including imported language choices. When it is absent, an explicitly supplied device language outranks bundled language defaults while other bundled settings are retained. Calls without a device preference retain the bundled/default behavior.
- Count import guidance preserves supported size-specific catalog units alongside canonical ingredient identity and separate preparation. Imported/saved source text, quantities, units, notes and mappings are retained; count display is composed in domain localization without a startup migration.

The split seed package is authoritative for both shipped ingredient references and unit definitions. `BundledIngredientCatalog.kt` is generated from the canonical reference JSON by `tools/ingredient_catalog/generate_bundled_ingredient_catalog.py`; its `--check` mode detects drift. The generator emits groups of at most 64 references into separate helper methods so the catalog does not exceed the JVM's per-method bytecode limit as it grows. Source-backed identity edits update the canonical reference JSON, research ledger, and generated index together; unresolved regional identities stay out of active matching. Former Kotlin-only identities remain in `docs/catalog/legacy-import-identities.v1.json` as unresolved review candidates and are not used for automatic matching. Unverified densities, mappings, form conversions, and contextual substitutions remain inactive and are tracked in the research ledger.

Ingredient lines persist an explicitly selected form, a personal alias hint, and structured package details through Room, recipe DTOs, editor state, import/export, and full-library ZIP packaging. Form rules require that selected form; no form is guessed from a sole candidate or a text tie. A package conversion requires a requested net/drained/edible basis plus one matching source record for the ingredient, selected form, package type, declared net size/unit, and any supplied product qualifiers. A generic size match is shown as a visibly source-specific estimate; explicit product, size, form, medium, or origin conflicts remain unavailable. Fractional package counts disclose the proportional-yield assumption. Contextual rules require a matching positive dish scope; role- or method-scoped rules stay unavailable without line-level context. High-risk rules are excluded from automatic suggestions and remain warning-bearing when explicitly linked.

Package counts resolve from an explicit package-unit quantity first, then a parsed package expression, then saved structured package metadata. Mass and volume quantities never become package counts merely because a line also records package details.

Package aliases normalize consistently between structured unit fields and free-text parsing. In particular, English `can`/`tin` and Québec French `boîte`/`boîte de conserve` terms share the `CAN` package type; they do not produce two package classes for the same supported source yield.
