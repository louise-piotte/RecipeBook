---

## 1) Product scope

### 1.1 Goal

Build a personal recipe book app that:

* Lets you **add/edit/create/import/export** recipes.
* Supports **full bilingual content (French + English)** per recipe.
* Handles **unit conversions**, **serving scaling**, and **weight ↔ volume** conversions using an **ingredient reference database**.
* Organizes recipes into **collections**, **tags**, searchable ingredient/tag lists, pictures, ratings.
* Syncs to **Google Drive**, and can **auto-open your library from Drive when the app launches**.

### 1.2 Platforms

* **Android 16+ only (initial release).**
* Optional later: **desktop** (and/or other platforms).

### 1.3 Primary users

* Single user / household use (not social, no public sharing by default).

---

## 2) Core concepts & data model (must-have)

### 2.1 Entities

**Recipe**

* `id` (UUID)
* `createdAt`, `updatedAt`
* `source` (optional):

    * `sourceUrl` (string)
    * `sourceName` (string)
* `languages` (bilingual content):

    * `fr`: `title`, `description`, `preparationSteps`, `instructions`, optional `notesSystem`
    * `en`: `title`, `description`, `preparationSteps`, `instructions`, optional `notesSystem`
    * **Rule:** all **system-defined** textual fields must exist in both languages (even if empty).
* **User-entered notes**

    * `userNotes` (free text, user-entered; may be only one language)
    * **Display rule:** if missing in currently selected language, show a placeholder like **“Not available in English / Non disponible en français”** rather than falling back to the other language.
* `ingredients[]` (ordered list)
* `servings` (number + optional unit, e.g., “4”, “1 loaf”)
* `prepTime`, `cookTime`, `totalTime` (minutes)
* `tags[]` (references to Tag entity)
* `collections[]` (references to Collection entity)
* `ratings`:

    * `userRating` (0–5, allow halves optional)
    * optional `madeCount`, `lastMadeAt`
* `photos[]` (local + cloud references)
* `attachments[]` (optional; pdf, etc.)
* `importMetadata` (optional: where it came from, original units, parser version)

**IngredientLine** (per recipe line)

* `id` (UUID)
* `ingredientRefId` (link to IngredientReference; optional but recommended)
* `originalText` (string, as entered)
* Structured fields (to power conversions/scaling):

    * `quantity` (decimal)
    * `unit` (canonical unit enum, e.g., g, ml, tsp, cup)
    * `ingredientName` (string; display)
    * `preparation` (string; “chopped”, “melted”)
    * `optional` (bool)
    * `notes` (string)
* `group` (optional section header: “Dough”, “Filling”)

**IngredientReference** (the “exhaustive list” backbone)

* `id`
* `nameFr`, `nameEn`
* `aliasesFr[]`, `aliasesEn[]`
* `defaultDensity` (g/ml) **when meaningful**
* `unitMappings[]` (optional: “1 cup = 120g” for flour)
* `nutrition` (optional, out-of-scope unless you want it)
* `updatedAt`

**Unit**

* Canonical unit definitions with:

    * `unitId`, `symbol`, `nameFr`, `nameEn`
    * `type` (mass, volume, count, length, temperature, “other”)
    * conversion base (e.g., g as base mass, ml as base volume)

**Tag**

* `id`, `nameFr`, `nameEn`, `slug`

**Collection**

* `id`, `nameFr`, `nameEn`, `descriptionFr?`, `descriptionEn?` (optional), `recipeIds[]`, ordering rules

**Library**

* The user’s full dataset bundle:

    * recipes, ingredient refs, tags, collections, settings, version metadata

---

### 2.2 JSON formats (required)

Two JSON specs must be defined and versioned:

**(A) Recipe Creation JSON (AI-friendly minimal input)**

* A “creation payload” format intended for:

    * Creating a new recipe from scratch
    * Creating a recipe from parsed/imported content
    * Codex/AI generation
* Must support bilingual fields and structured ingredient lines.
* Must include schema version and language completeness rules.

**(B) Full Library JSON (canonical storage/export/import)**

* The complete, lossless format used for:

    * Local persistence
    * Export/import
    * Google Drive sync
* Must include:

    * schema version
    * IDs
    * timestamps
    * all entities (recipes, tags, collections, ingredient references, units metadata if not hardcoded)

**Acceptance criteria**

* Both schemas are documented with field definitions, types, constraints, and examples.
* App can round-trip full data through Full Library JSON without loss.

---

## 3) Functional requirements (FR)

### FR-1 Recipe CRUD (create/edit/delete)

* Create recipes with:

    * Title, description, **preparation steps**, instructions, ingredients, servings, times, tags, photos, rating, source URL, **user notes**.
* Edit any field.
* Delete with undo/restore (soft delete) recommended.

**Acceptance criteria**

* User can create a recipe offline.
* Recipe persists after app restart.
* Recipe fields round-trip correctly through export/import.

---

### FR-2 Import recipes

Support at least these import types:

1. **From URL (website)**

    * Attempt structured extraction (schema.org/JSON-LD when available).
    * Fallback: user-assisted import (paste text, manual mapping).
2. **From text (paste)**

    * Parse ingredients/**preparation steps**/**instructions** with best-effort.
3. **From file**

    * Import app’s own export format (see FR-12).

**Acceptance criteria**

* Import creates a complete recipe record with a `sourceUrl` when provided.
* User can correct parsing results before saving.

---

### FR-3 Bilingual content + localized UI

* **Everything must have French and English equivalents**, including:

    * All system-defined recipe text fields (title/description/prep steps/instructions/system notes)
    * Tags, collections, ingredient reference names/aliases
    * Units and UI strings
* App setting: display language toggle (FR/EN) changes:

    * UI language
    * which bilingual fields are displayed
* **No automatic fallback to the other language for user-entered text.**

    * If the current language value is missing, show a placeholder:

        * English UI: “Not available in English”
        * French UI: “Non disponible en français”
* (System-defined fields may exist but be empty; still required to be present.)

**Acceptance criteria**

* Toggling language updates displayed fields instantly.
* Missing language content shows placeholder (not fallback) for user-entered text.
* UI is fully localized FR/EN.

---

### FR-4 Go to source

* If `sourceUrl` exists, provide a “Go to source” action:

    * Opens in in-app browser or system browser (configurable).
* If no source exists, hide or disable.

**Acceptance criteria**

* Tap opens the correct URL.

---

### FR-5 Unit conversion (including weight ↔ volume)

User can convert ingredient quantities between:

* Mass units (g, kg, oz, lb…)
* Volume units (ml, l, tsp, tbsp, cup…)
* Count (e.g., “2 eggs”) should generally not auto-convert unless explicitly mapped.

**Key rule:** Weight ↔ volume conversions require an ingredient density or mapping.

* If ingredient line is linked to IngredientReference with density/mapping, conversion is automatic.
* If missing, app prompts user to choose:

    * Select ingredient from reference list
    * Or provide a one-time density override for that recipe/line

**Acceptance criteria**

* Converting “100 g flour → cups” uses flour mapping/density.
* If density unknown, user is prompted (not silently wrong).

---

### FR-6 Increase/decrease amount (serving scaling)

* User can scale a recipe by:

    * New serving count (e.g., 4 → 6)
    * Multiplier (e.g., ×0.5, ×2)
* Scaling updates ingredient quantities and optionally times (times usually do NOT scale linearly; keep times unchanged by default).
* Must preserve original values or allow “Reset to original”.

**Acceptance criteria**

* Scaling affects only numeric quantities, not free text.
* Reset restores original quantities.

---

### FR-7 Exhaustive ingredient reference list (to support conversion)

* App includes an IngredientReference database that is:

    * Searchable (FR/EN + aliases)
    * Editable by user (add custom ingredients + densities)
* Ingredient lines should be linkable to a reference ingredient (manual link + optional auto-suggest).

**Acceptance criteria**

* Ingredient search returns matches in both languages.
* Adding a new ingredient makes it available immediately for conversions.

---

### FR-8 Tags (searchable) and filtering

* Tag list is global and searchable.
* Each recipe can have multiple tags.
* Recipe search supports:

    * Full-text search in title/ingredients/prep steps/instructions (current language + optionally both)
    * Filter by tag(s)
    * Filter by collection
    * Optional: filter by rating, “has photo”, “has source URL”

**Acceptance criteria**

* Searching by tag returns all tagged recipes.
* Searching “chocolate” finds recipes with chocolate in ingredients.

---

### FR-9 Pictures support

* Add one or more photos per recipe:

    * From camera, gallery
    * Crop/rotate optional
* Photos stored locally and included in Drive sync/export.

**Acceptance criteria**

* Photos display reliably offline.
* Export/import preserves photo associations.

---

### FR-10 Ratings

* Personal rating per recipe (0–5).
* Sorting by rating.

**Acceptance criteria**

* Rating persists across sync and export/import.

---

### FR-11 Collections

* Create/edit/delete collections (bilingual names).
* Add/remove recipes to/from collections.
* Collections view lists recipes in that collection; support sorting.

**Acceptance criteria**

* Collection membership is preserved after export/import.

---

### FR-12 Import/Export (library portability)

* Export entire library as a single package:

    * Recommended: `zip` containing `library.json` + `photos/` + version file.
* Import merges or replaces:

    * Option A: Replace library
    * Option B: Merge with de-duplication (by recipe id and/or title+sourceUrl heuristic)

**Acceptance criteria**

* Export then import results in identical library (round-trip).

---

### FR-13 Google Drive save + auto-open on launch

* User can connect Google account and choose a Drive folder.
* App writes exports to Drive and can keep a “current library file”.
* On app launch:

    * If Drive sync enabled, app checks for the chosen library file and loads it automatically.
    * Must handle offline mode gracefully (open cached local copy).

**Acceptance criteria**

* First-time setup: user selects Drive location and library file name.
* Subsequent launches load the latest available library (Drive if reachable, else local).
* No data loss if offline: changes queued and synced later.

---

## 4) Non-functional requirements (NFR)

### NFR-1 Offline-first

* All core features work without internet (except opening source URL and Drive sync).
* Local persistence required.

### NFR-2 Data integrity & conflict handling

* If edits happen offline and Drive file changed elsewhere:

    * Detect conflict via file revision/etag or timestamp.
    * Provide conflict resolution:

        * “Keep local”, “Keep Drive”, or “Merge” (merge can be phase 2)

### NFR-3 Performance

* Library sizes: target 5,000 recipes / 50,000 ingredient lines.
* Search should return results within ~200ms locally for typical sizes.

### NFR-4 Security & privacy

* Data stored locally encrypted where feasible (platform secure storage).
* Google auth uses standard OAuth.
* No sharing/public upload unless explicitly implemented.

### NFR-5 Internationalization & localization

* UI strings localized FR/EN.
* Units display localized (decimal separators, abbreviations).
* Placeholders localized.

### NFR-6 Accessibility

* Support dynamic text size, screen readers, sufficient contrast.

---

## 5) UX requirements (key screens)

### 5.1 Screens

* Library home (search + filters + collections)
* Recipe detail

    * Language toggle
    * Scale controls
    * Convert units controls
    * Ingredients + **preparation steps** + instructions
    * Photos gallery
    * Rating
    * Go to source
    * **User notes**
* Recipe editor (bilingual fields + user notes per language if you choose, or single notes field with placeholder rules)
* Ingredient reference manager
* Tags manager
* Collections manager
* Import flow (URL/text/file)
* Export/sync settings (Google Drive)

### 5.2 Critical interaction rules

* Language toggle affects displayed text fields, not underlying structured ingredient quantities.
* Scaling + conversion are “view transformations” unless user chooses “apply and save”.
* Missing user-entered language content shows placeholder (not fallback).

---

## 6) Conversion & scaling rules (implementation notes Codex can follow)

### 6.1 Canonical storage

* Store structured ingredient quantities in canonical units:

    * Mass base: grams
    * Volume base: milliliters
* Preserve original user entry for display and audit.

### 6.2 Weight ↔ volume

* Use `density (g/ml)` or per-unit mapping.
* Priority:

    1. Specific mapping (e.g., “1 cup flour = 120g”)
    2. Density (convert via ml ↔ g)
    3. Prompt user (choose ingredient or enter density)

### 6.3 Scaling

* Multiply `quantity` fields only.
* Do not attempt to rewrite preparation steps/instructions text automatically (“bake for 20 minutes”) unless user opts in.

---

## 7) Sync requirements (Google Drive)

### 7.1 Data format & file naming

* Default file: `RecipeLibrary.android16.recipes.zip` (name configurable)
* Include `manifest.json`:

    * app version, schema version, exportedAt, deviceId (optional)

### 7.2 Sync strategy (minimum viable)

* Manual “Sync now”
* Auto-sync:

    * On app background/close
    * On app launch (pull latest)
* Conflict detection using Drive file revision metadata.

---

## 8) Priorities (recommended MVP → v2)

### MVP (must ship)

* FR-1, FR-3, FR-4, FR-6, FR-8, FR-9 (basic), FR-10, FR-11, FR-12 (replace import), FR-13 (basic sync)
* Ingredient reference list minimally editable (FR-7 basic)
* JSON specs defined (2.2)

### V1.1 / V2

* Robust URL import (schema.org + better parsing)
* Merge import + de-dup
* Advanced conflict merge
* Rich unit mappings per ingredient

---

## 9) Out of scope (explicitly not required unless you want it)

* Social sharing/community/public recipes
* Multi-user accounts beyond Google Drive storage
* Automatic translation of recipe text (your content is provided in both languages)

---

## 10) Definition of done (DoD)

* Round-trip test: create recipes with photos + bilingual text + tags + collections + prep steps + notes → export → delete local → import → identical.
* Offline test: edits made offline sync correctly once online.
* Conversion test: flour/water/sugar conversions behave as expected; unknown ingredients prompt.
* Launch behavior: app loads library automatically from Drive when enabled, otherwise local.
* Localization audit: 100% UI strings and system fields localized FR/EN; placeholders shown where user text missing.

---
