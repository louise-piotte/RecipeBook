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

- Ingredient editor rows preserve optional flags, groups, and substitution links through saves/regeneration. Invalid quantities and serving counts show localized validation and disable save/regeneration until corrected.
- `localizedString` observes `LocalConfiguration` and caches its localized context so configuration changes trigger updated strings without recreating a context for every recomposition. Both languages are bundled to support offline switching.
- Recipe detail caches substitution suggestions independently of checkbox state and language display changes.
- Recipe detail scaling stays in local screen state: it scales structured numeric quantities, displayed serving counts, and normalized package counts used by package-yield conversions. Scaling preserves each package's declared size, type, product qualifiers, packing medium, requested net/drained/edible basis, and the stored original ingredient text. It feeds scaled values into unit and substitution displays while leaving instructions and cooking times untouched. Reset returns the display scale and package-yield result to the recipe's stored values.

Editor ingredient rows (including raw quantity input and substitution metadata), photos, recipe links, selected tags/collections, and pending camera captures use saveable state. The activity saves the initial recipe identity and actual local media paths; recreation restores the draft instead of importing again. Draft photos are cleaned on final dismissal or successful save, not configuration changes. Photo persistence copies draft sources so failed database writes can be retried. Local save failure leaves the editor open with a localized message; concurrent save taps are guarded. Collection recipe counts use localized plurals.

Actual editor/activity recreation coverage runs against the side-by-side `app.recipebook.qa` application (build with `--init-script tools/qa/isolated_application.init.gradle`), preserving the normal application's database. The integration test uses a generated local photo and synthetic recipe, edits comma/fraction quantities across EN/FR, recreates the real activity, saves, and verifies nested ingredient metadata and managed photo files. Importer coverage continues to inject mock AI services; device QA does not invoke a real provider.

AI settings identify OpenRouter, mask the user-entered key without saving it in activity state, show the fixed endpoint read-only, and allow changing the provider/model identifier. The status indicates local completeness only, not online credential validation; clearing the key disables remote AI.
- Ingredient detail and newly composed editor source text share domain count-ingredient presentation. Qualified count units remain stored for their existing size-dependent mappings; display grammar follows the current count. Measurement-unit lines retain their existing presentation.
- Ingredient editor forms are selected from forms belonging to the selected reference; the bilingual form selector remains distinct from free-text preparation. An exact bilingual form phrase in the picker shows a form label, and selecting that reference carries the matching form onto the line. Partial or ambiguous wording does not select a form. The chosen form and original source wording survive editor recreation and saves. Recipe detail and editor previews use the localized selected-form label when a separate preparation phrase is not already displayed, so a named grade such as Jumbo Lump remains visible after linking to its broader ingredient identity.
- Ingredient picker and ingredient manager search use the shared domain accent/ligature fold and prefer complete word phrases before partial matching. Exact form phrases narrow results to their base references while other searches retain broad phrase matching; displayed labels keep their original spelling.
- Picker and ingredient-manager screens retain an immutable `IngredientReferenceSearchIndex` for the current reference/form lists, so typing reuses normalized terms and word postings. The Compose `remember` keys follow those lists; catalog edits create a new index.
- Recipe detail constructs one `IngredientSubstitutionResolver` for the current recipe, tags, reference list, and substitution catalog, then reuses it for every line. A changed input snapshot rebuilds the resolver.
- Recipe-detail unit choices come from the canonical unit definitions passed by the repository. Ingredient-specific and form-specific conversions are offered only when the unit graph has one consistent path.
- Package expressions in original ingredient text are parsed into nullable structured package amounts when saved; the original expression remains intact. Detail conversions require an explicit usable basis and a unique package-yield record matching the selected form and declared package size. Generic matches carry a bilingual source-specific qualifier, and fractional counts state the proportional-yield assumption.
