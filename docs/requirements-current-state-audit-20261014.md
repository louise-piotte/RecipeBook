# Requirements current-state audit

Date: 2026-10-14  
Scope: source and resource inspection against [Requirements.md](../Requirements.md). This records the working tree as inspected on this date. “Implemented” means the code path is present; this audit did not run tests, launch the app, or verify emulator behavior.

## Status key

- **Implemented in code**: the requested behavior is represented by an app path or data contract.
- **Partial**: some behavior exists, with a material requirement gap.
- **Not implemented**: no user-facing or runtime implementation was found.
- **Unverified**: source inspection alone cannot establish the acceptance criterion.

## Product scope and data model

| Requirement | Status | Current state |
|---|---|---|
| Android 16+ | Implemented in configuration | App min and target SDK are 36 in [app/build.gradle.kts](../app/build.gradle.kts#L8). This audit did not validate the Pixel 9a runtime profile. |
| Core entities (2.1) | Partial | Room and domain models cover recipes, ingredients, bilingual fields, tags, collections, ratings, links, photos, attachments, import metadata, ingredient forms, substitutions, units, and library settings. The recipe model has deletedAt, but the repository delete path removes the recipe directly. Rating and attachment fields exist in storage/export, though ratings have no editor. See [LibraryModels.kt](../app/src/main/java/app/recipebook/domain/model/LibraryModels.kt#L28) and [RecipeRepository.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeRepository.kt#L393). |
| Versioned JSON formats (2.2) | Implemented in code | Versioned creation and full-library DTOs and schema files exist. Library export uses the manifest-plus-part-files ZIP, including recipe files and photo/attachment assets. The round-trip acceptance criterion was not re-executed for this audit. See [SchemaDtos.kt](../app/src/main/java/app/recipebook/data/schema/SchemaDtos.kt#L6), [RecipeExportCodec.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeExportCodec.kt#L28), and [RecipeLibraryImportCodec.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeLibraryImportCodec.kt#L28). |

## Functional requirements

| Requirement | Status | Current state and remaining gap |
|---|---|---|
| FR-1 Recipe CRUD | Partial | Offline Room persistence and editor support exist for bilingual text, ingredients, servings, times, tags, collections, links, photos, source, and notes. The editor has no rating control. Delete is hard delete, with no undo/restore. Export round-trip behavior was not verified in this audit. [RecipeEditorScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt#L97) |
| FR-2 Recipe import | Partial | Paste/share text parsing and URL import exist. The URL path reads schema.org Recipe JSON-LD and opens the result in the editor for correction. There is no generic file-based recipe import; full-library ZIP replacement is exposed through the Drive backup flow. The richer webpage fallback is tracked as future work. [SharedRecipeImport.kt](../app/src/main/java/app/recipebook/data/local/recipes/SharedRecipeImport.kt#L444) |
| FR-3 Bilingual content and UI | Partial | FR/EN recipe fields, a language toggle, and no-fallback note placeholders are implemented. Static resource-key comparison found 245 English keys and 245 French keys, with no key-set differences. This does not verify translation quality or the requirement that every system field has complete text. Opposite-language regeneration can fall back to a local stub. [BilingualTextResolver.kt](../app/src/main/java/app/recipebook/domain/localization/BilingualTextResolver.kt#L20), [RecipeDetailScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeDetailScreen.kt#L221), [RecipeAiRuntime.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeAiRuntime.kt#L53) |
| FR-4 Go to source | Implemented in code | Recipe detail renders a clickable source when the URL is usable and opens it through the platform URI handler. This is marked Done in Requirements.md; tap behavior was not exercised in this audit. [RecipeDetailScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeDetailScreen.kt#L448) |
| FR-4B Recipe links | Implemented in code | Editor supports typed links, bilingual labels, ordering, and target selection; it filters out the current recipe. Repository validation rejects self-links and exact duplicate links. Detail shows unavailable targets and only navigates when a target exists. Persistence/export code is present; no round-trip test was run here. [RecipeEditorScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt#L1472), [RecipeDetailScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeDetailScreen.kt#L326), [RecipeRepository.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeRepository.kt#L315) |
| FR-5 Unit conversion | Partial | The converter supports configured unit conversions, lb↔g, fl oz↔ml, reference mappings, density, and form-level density. A saved density can be edited through the ingredient manager. Missing conversion paths show “unavailable”; there is no prompt to choose an ingredient or enter a one-time density. Temperature is not displayed in C and F together. Contextual runtime matching currently uses dish-type tags; rules requiring ingredient roles or cooking methods are rejected. [IngredientUnitConverter.kt](../app/src/main/java/app/recipebook/data/local/recipes/IngredientUnitConverter.kt#L64), [RecipeDetailScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeDetailScreen.kt#L657), [IngredientSubstitutionResolver.kt](../app/src/main/java/app/recipebook/data/local/recipes/IngredientSubstitutionResolver.kt#L215) |
| FR-6 Serving scaling | Not implemented | Detail shows the serving count, but no multiplier/new-serving controls, scaled quantity view, or reset behavior were found. [RecipeDetailScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeDetailScreen.kt#L366) |
| FR-7 Ingredient references | Partial | A searchable FR/EN reference catalog, aliases, user-created references, density/mapping editing, and recipe-line linking exist. The catalog is still being expanded, so “exhaustive” is not complete. No automatic suggestion is applied without a user selecting a picker result. [IngredientTagManagerScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/IngredientTagManagerScreen.kt#L93), [IngredientSearch.kt](../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L23) |
| FR-8 Tags and recipe search | Partial | Global tag search, tag filters, collection filters, and title/description search across both languages exist. Recipe search does not inspect ingredient lines or instructions. Rating, photo, and source filters are absent. [RecipeLibraryScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeLibraryScreen.kt#L1004) |
| FR-9 Photos | Implemented in code | Editor supports multiple gallery and camera photos, local app-managed paths, a main-photo choice, and photo display in library/detail. The library ZIP includes photo assets and associations. Offline reliability and export/import behavior were not exercised in this audit. [RecipePhotoUi.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipePhotoUi.kt#L85), [RecipeExportCodec.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeExportCodec.kt#L108) |
| FR-10 Ratings | Partial | Rating data persists and read-only stars are shown. No rating editor or sort-by-rating control was found. [RecipeRatingStars.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeRatingStars.kt#L31), [RecipeRepository.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeRepository.kt#L851) |
| FR-11 Collections | Partial | Bilingual collection create/edit/delete, recipe membership editing, and collection filtering exist. Collection membership is included in library export. The sort-order enum has rating/title/recent values, but the UI does not apply collection sorting. [CollectionManagerScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/CollectionManagerScreen.kt#L98), [RecipeLibraryScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeLibraryScreen.kt#L1020), [LibraryModels.kt](../app/src/main/java/app/recipebook/domain/model/LibraryModels.kt#L384) |
| FR-12 Library portability | Partial | Canonical ZIP export and replace-import codecs include metadata, catalogs, recipes, photos, and attachments. Replace import is wired through the Drive document flow; a generic local ZIP import picker and merge/deduplication are absent. Code supports the round-trip shape, but the acceptance criterion was not run here. [RecipeExportCodec.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeExportCodec.kt#L49), [RecipeLibraryImportCodec.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeLibraryImportCodec.kt#L35), [RecipeLibraryScreen.kt](../app/src/main/java/app/recipebook/ui/recipes/RecipeLibraryScreen.kt#L187) |
| FR-13 Google Drive | Partial | User-selected Drive ZIP document, mutation-triggered backup, launch-time pull, and local cached fallback exist. The flow uses Android's document provider rather than an app-managed account/folder connection. There is no Drive revision/ETag conflict detection, conflict choice, background/close sync, or durable queued-upload state. Launch-time replacement can overwrite local edits made while offline. [RecipeLibrarySyncCoordinator.kt](../app/src/main/java/app/recipebook/data/local/recipes/RecipeLibrarySyncCoordinator.kt#L37), [MainActivity.kt](../app/src/main/java/app/recipebook/MainActivity.kt#L29) |
| FR-14 Shopping lists | Not implemented in UI; local data foundation exists | DataStore models and a local store cover entries, checked state, sections, deletion operations, remembered names, and typo-tolerant suggestions. No shopping-list screen, recipe selection/generation flow, or entry editing UI was found. This is explicitly listed as V1.1/V2 work. [ShoppingListModels.kt](../app/src/main/java/app/recipebook/data/local/shoppinglist/ShoppingListModels.kt#L1), [ShoppingListLocalStore.kt](../app/src/main/java/app/recipebook/data/local/shoppinglist/ShoppingListLocalStore.kt#L17) |

## Non-functional requirements

| Requirement | Status | Current state |
|---|---|---|
| NFR-1 Offline-first | Partial | Recipe/library persistence is local Room, photos are app-managed files, and Drive has a local cache fallback. Features without UI and network-dependent URL/AI paths mean the full requirement is not complete. |
| NFR-2 Data integrity/conflicts | Not implemented | No Drive revision/ETag comparison or Keep Local/Keep Drive/Merge flow was found. Launch sync replaces the current library. |
| NFR-3 Performance | Unverified | No 5,000-recipe/50,000-line benchmark or 200 ms search measurement was found. The library currently filters loaded recipes in memory. |
| NFR-4 Security/privacy | Partial | Room uses the standard local database file and no database encryption layer was found. Android backup is enabled. Drive access is granted through the document provider; no app-managed OAuth flow was found in the inspected code. |
| NFR-5 Localization | Partial | Both resource files have matching key sets, and unit formatting includes localized Quebec terms such as cuillère à thé and cuillère à soupe. Full translation quality and Quebec normalization of recipe text are not audited or guaranteed. |
| NFR-6 Accessibility | Partial / unverified | Compose screens include many localized content descriptions and state semantics, and use Material typography. No systematic dynamic-text, screen-reader, or contrast review was performed. |

## Conversion and sync implementation notes

| Requirement area | Status | Gap |
|---|---|---|
| 6.1 Canonical quantity storage | Partial | Ingredient lines retain structured source quantity and unit plus original text; mass and volume are not normalized as the stored quantity. |
| 6.2 Weight ↔ volume | Partial | Reference mappings and density drive conversions; unavailable paths do not prompt for a reference selection or one-time density override. |
| 6.3 Scaling | Not implemented | No quantity-only scaling view or reset-to-original control exists. |
| 6.4 Form substitutions | Partial | Directed form rules carry conversion type, confidence, risk, warnings, and rounding; runtime supports bounded conversion paths. Rule coverage and all package/form cases are not verified here. |
| 6.5 Contextual substitutions | Partial | Dish-type scope is evaluated using recipe tags, and high-risk rules require bilingual warning text. Role and cooking-method constraints are not evaluated by runtime. |
| 7.1 Package naming/manifest | Partial | Export is a versioned manifest-plus-part-files ZIP with separate metadata and assets. The generated/default backup names differ from the proposed default filename. |
| 7.2 Sync strategy | Partial | Launch pull and mutation backup exist. Manual Sync now, background/close sync, revision conflict detection, and conflict resolution are missing. |

## UX and Definition of Done

The library, recipe detail/editor, ingredient/tag manager, collection manager, and basic URL/text import screens exist. Detail includes language switching, conversion, links, photos, ratings, source, and notes; scale controls are absent. Export and Drive controls live in the library menu. The full shopping-list screen and generic file-import flow are absent.

The Definition of Done is **not verified** by this audit. It requires the photo/bilingual/collection round trip, offline sync behavior, conversion prompts, launch behavior, and a full localization audit. No unit, instrumentation, or emulator checks were run for this source-inspection report.

## MVP gaps to track

1. Add recipe scaling and reset behavior (FR-6).
2. Add rating editing and rating sorting (FR-10), plus collection recipe sorting (FR-11).
3. Search recipe ingredients and instructions (FR-8).
4. Complete density-missing prompts and dual C/F temperature display (FR-5).
5. Add generic library ZIP import and verify round-trip behavior (FR-12).
6. Protect offline edits with Drive revision/conflict handling and queued sync (FR-13, NFR-2).
7. Complete the remaining FR-1 editor/delete behavior and FR-3 localization audit.

Shopping-list UI remains explicitly tracked as V1.1/V2 work; local persistence and suggestion logic alone do not satisfy FR-14.
