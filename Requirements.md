---

## 1) Product scope

### 1.1 Goal

Build a personal recipe book app that:

* Lets you **add/edit/create/import/export** recipes.
* Supports **full bilingual content (French + English)** per recipe.
* Handles **unit conversions**, **serving scaling**, and **weight â†” volume** conversions using an **ingredient reference database**.
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

    * `fr`: `title`, `description`, `instructions`, optional `notesSystem`
    * `en`: `title`, `description`, `instructions`, optional `notesSystem`
    * **Rule:** all **system-defined** textual fields must exist in both languages (even if empty).
* **User-entered notes**

    * `userNotes` (free text, user-entered; may be only one language)
    * **Display rule:** if missing in currently selected language, show a placeholder like **â€œNot available in English / Non disponible en franÃ§aisâ€** rather than falling back to the other language.
* `ingredients[]` (ordered list)
* `servings` (number + optional unit, e.g., â€œ4â€, â€œ1 loafâ€)
* `prepTime`, `cookTime`, `totalTime` (minutes)
* `tags[]` (references to Tag entity)
* `collections[]` (references to Collection entity)
* `ratings`:

    * `userRating` (0â€“5, allow halves optional)
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
    * `preparation` (string; â€œchoppedâ€, â€œmeltedâ€)
    * `optional` (bool)
    * `notes` (string)
* `group` (optional section header: â€œDoughâ€, â€œFillingâ€)
* `substitutions[]` (optional references to `IngredientLineSubstitution` for suggested or selected alternatives)

**IngredientReference** (the â€œexhaustive listâ€ backbone)

* `id`
* `nameFr`, `nameEn`
* `aliasesFr[]`, `aliasesEn[]`
* `defaultDensity` (g/ml) **when meaningful**
* `unitMappings[]` (optional: â€œ1 cup = 120gâ€ for flour)
* `nutrition` (optional, out-of-scope unless you want it)
* `updatedAt`

**IngredientForm** (ingredient state/format used for substitutions and conversions)

* `id`
* `ingredientRefId`
* `formCode` (e.g., dried, cooked, canned_drained, raw, toasted)
* `prepState` (optional normalized state metadata)
* `densityGPerMl` (optional form-level override)
* `notesFr?`, `notesEn?`
* `updatedAt`

**SubstitutionRule** (directed conversion between ingredient forms)

* `id`
* `fromFormId`
* `toFormId`
* `conversionType` (`ratio`, `affine`, `fixed_amount`)
* `ratio?` (for `ratio`)
* `offset?` (for `affine`; usually 0 for cooking use-cases)
* `sourceUnitScope` (mass, volume, count, package)
* `targetUnitScope` (mass, volume, count, package)
* `minQty?`, `maxQty?` (optional validity range)
* `confidence` (`exact`, `tested`, `approximate`)
* `roundingPolicy` (e.g., none, nearest_5g, nearest_0_25cup)
* `notesFr?`, `notesEn?`
* `updatedAt`

**IngredientLineSubstitution** (recipe-line-level substitution suggestion/selection)

* `id`
* `ingredientLineId`
* `substitutionRuleId`
* `isPreferred`
* `customLabelFr?`, `customLabelEn?`
* `createdAt`, `updatedAt`

**ContextualSubstitutionRule** (ingredient-to-ingredient substitution with context limits)

* `id`
* `fromIngredientRefId`
* `toIngredientRefId`
* `conversionType` (`ratio`, `affine`, `fixed_amount`)
* `ratio?`
* `offset?`
* `allowedDishTypes[]` (e.g., sauce, gravy)
* `excludedDishTypes[]` (e.g., cake, pastry)
* `allowedIngredientRoles[]` (e.g., thickener, aromatic, heat)
* `excludedIngredientRoles[]` (optional)
* `allowedCookingMethods[]` (optional)
* `severityIfMisused` (`low`, `medium`, `high`)
* `requiresUserConfirmation` (bool)
* `confidence` (`exact`, `tested`, `approximate`)
* `notesFr?`, `notesEn?`
* `updatedAt`

**Unit**

* Canonical unit definitions with:

    * `unitId`, `symbol`, `nameFr`, `nameEn`
    * `type` (mass, volume, count, length, temperature, â€œotherâ€)
    * conversion base (e.g., g as base mass, ml as base volume)

**Tag**

* `id`, `nameFr`, `nameEn`, `slug`

**Collection**

* `id`, `nameFr`, `nameEn`, `descriptionFr?`, `descriptionEn?` (optional), `recipeIds[]`, ordering rules

**Library**

* The userâ€™s full dataset bundle:

    * recipes, ingredient refs, tags, collections, settings, version metadata

---

### 2.2 JSON formats (required)

Two JSON specs must be defined and versioned:

**(A) Recipe Creation JSON (AI-friendly minimal input)**

* A â€œcreation payloadâ€ format intended for:

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

    * Title, description, instructions, ingredients, servings, times, tags, photos, rating, source URL, **user notes**.
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

    * Parse ingredients/**instructions** with best-effort.
3. **From file**

    * Import appâ€™s own export format (see FR-12).

**Acceptance criteria**

* Import creates a complete recipe record with a `sourceUrl` when provided.
* User can correct parsing results before saving.

---

### FR-3 Bilingual content + localized UI

* **Everything must have French and English equivalents**, including:

    * All system-defined recipe text fields (title/description/instructions/system notes)
    * Tags, collections, ingredient reference names/aliases
    * Units and UI strings
* App setting: display language toggle (FR/EN) changes:

    * UI language
    * which bilingual fields are displayed
* **No automatic fallback to the other language for user-entered text.**

    * If the current language value is missing, show a placeholder:

        * English UI: â€œNot available in Englishâ€
        * French UI: â€œNon disponible en franÃ§aisâ€
* (System-defined fields may exist but be empty; still required to be present.)

**Acceptance criteria**

* Toggling language updates displayed fields instantly.
* Missing language content shows placeholder (not fallback) for user-entered text.
* UI is fully localized FR/EN.

---

### FR-4 Go to source

* If `sourceUrl` exists, provide a â€œGo to sourceâ€ action:

    * Opens in in-app browser or system browser (configurable).
* If no source exists, hide or disable.

**Acceptance criteria**

* Tap opens the correct URL.

---

### FR-5 Unit conversion (including weight â†” volume)

User can convert ingredient quantities between:

* Mass units (g, kg, oz, lbâ€¦)
* Volume units (ml, l, tsp, tbsp, cupâ€¦)
* Temperature units must display in both Celsius (C) and Fahrenheit (F) at the same time for recipe steps and ingredient lines where temperature is present.
* Count (e.g., â€œ2 eggsâ€) should generally not auto-convert unless explicitly mapped.
* Mass conversion must support pounds (lb) â†” grams (g).
* Volume conversion must support fluid ounces (fl oz) â†” milliliters (ml).
* Form substitutions (e.g., canned â†” dried â†” cooked) must support different equivalent amounts via `SubstitutionRule`.
* Contextual substitutions between different ingredients (e.g., flour â†” cornstarch) must use `ContextualSubstitutionRule` and must not be treated as globally valid.

**Key rule:** Weight â†” volume conversions require an ingredient density or mapping.

* If ingredient line is linked to IngredientReference with density/mapping, conversion is automatic.
* If missing, app prompts user to choose:

    * Select ingredient from reference list
    * Or provide a one-time density override for that recipe/line
* User can define and save a custom weight-to-volume ratio (density in g/ml) per ingredient for future conversions.
* Substitution results must expose confidence (`exact`, `tested`, `approximate`) and apply rule-specific rounding policy.
* Contextual substitutions must enforce scope (dish type/role/method) and apply warning or block behavior when out of scope.

**Acceptance criteria**

* Converting â€œ100 g flour â†’ cupsâ€ uses flour mapping/density.
* If density unknown, user is prompted (not silently wrong).
* Temperatures are shown as dual units (for example: 180 C / 356 F).
* Converting lb â†” g and fl oz â†” ml works from recipe view and edit flows.
* A saved custom density is reused automatically for later conversions of the same ingredient.
* Chickpea form substitution example is supported: a canned amount can convert to equivalent dried or cooked amounts using form rules.
* A contextual substitution valid for sauces/gravy can be offered there, but is blocked or strongly warned for cakes/pastries.

---

### FR-6 Increase/decrease amount (serving scaling)

* User can scale a recipe by:

    * New serving count (e.g., 4 â†’ 6)
    * Multiplier (e.g., Ã—0.5, Ã—2)
* Scaling updates ingredient quantities and optionally times (times usually do NOT scale linearly; keep times unchanged by default).
* Must preserve original values or allow â€œReset to originalâ€.

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

    * Full-text search in title/ingredients/instructions (current language + optionally both)
    * Filter by tag(s)
    * Filter by collection
    * Optional: filter by rating, â€œhas photoâ€, â€œhas source URLâ€

**Acceptance criteria**

* Searching by tag returns all tagged recipes.
* Searching â€œchocolateâ€ finds recipes with chocolate in ingredients.

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

* Personal rating per recipe (0â€“5).
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
* App writes exports to Drive and can keep a â€œcurrent library fileâ€.
* On app launch:

    * If Drive sync enabled, app checks for the chosen library file and loads it automatically.
    * Must handle offline mode gracefully (open cached local copy).

**Acceptance criteria**

* First-time setup: user selects Drive location and library file name.
* Subsequent launches load the latest available library (Drive if reachable, else local).
* No data loss if offline: changes queued and synced later.

---

### FR-14 Shopping lists (full functionality)

* User can generate a shopping list from one or more selected recipes.
* Shopping list is a checklist where each entry has:

    * `name` (required)
    * `amount` (optional)
    * `section/category` (optional)
    * `checked` status
* User can add arbitrary manual entries (free text), not only recipe-derived entries.
* Any entry (manual or auto-generated) is editable after creation:

    * Edit name
    * Edit amount
    * Edit section/category
* Amount display behavior:

    * Amounts are optional.
    * If present, amounts are hidden by default and can be shown on demand.
* Deletion controls:

    * Delete one entry
    * Delete all checked entries
    * Delete all entries
* Local memory for quick re-entry:

    * Store previously entered entry names (not amounts) with their section/category.
    * Match suggestions case-insensitively.
    * Provide typo-tolerant suggestions for near matches.
    * Storage is local only (no social/media/cloud sharing requirement for this memory).
* Sections/categories:

    * User can add, rename, and delete sections/categories.
    * Section/category definitions are stored locally.

**Acceptance criteria**

* User can build one combined checklist from multiple recipes and add custom lines manually.
* User can edit name/amount/section for any checklist line, including auto-generated lines.
* Default list view hides amounts while preserving them in data.
* Single-delete, delete-checked, and delete-all actions all work correctly.
* Name suggestions are case-insensitive and resilient to minor typos.
* Section/category edits persist locally across app restarts.

---

## 4) Non-functional requirements (NFR)

### NFR-1 Offline-first

* All core features work without internet (except opening source URL and Drive sync).
* Local persistence required.

### NFR-2 Data integrity & conflict handling

* If edits happen offline and Drive file changed elsewhere:

    * Detect conflict via file revision/etag or timestamp.
    * Provide conflict resolution:

        * â€œKeep localâ€, â€œKeep Driveâ€, or â€œMergeâ€ (merge can be phase 2)

### NFR-3 Performance

* Library sizes: target 5,000 recipes / 50,000 ingredient lines.
* Search should return results within ~200ms locally for typical sizes.

### NFR-4 Security & privacy

* Data stored locally encrypted where feasible (platform secure storage).
* Google auth uses standard OAuth.
* No sharing/public upload unless explicitly implemented.

### NFR-5 Internationalization & localization

* UI strings localized FR/EN.
* French recipe instructions use Quebec naming conventions.
* During recipe conversion, French text must be normalized to proper accents and corrected spelling/typos, even if source text was entered on an English keyboard.
* Preferred Quebec terms for conversions and normalization:
  * Use "cuillÃ¨re Ã  thÃ©" instead of "cuillÃ¨re Ã  cafÃ©".
  * Use "cuillÃ¨re Ã  soupe" instead of "cuillÃ¨re Ã  table".
  * Use "bicarbonate de soude" instead of "levure chimique".
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
    * Ingredients + instructions
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
* Scaling + conversion are â€œview transformationsâ€ unless user chooses â€œapply and saveâ€.
* Missing user-entered language content shows placeholder (not fallback).

---

## 6) Conversion & scaling rules (implementation notes Codex can follow)

### 6.1 Canonical storage

* Store structured ingredient quantities in canonical units:

    * Mass base: grams
    * Volume base: milliliters
* Preserve original user entry for display and audit.

### 6.2 Weight â†” volume

* Use `density (g/ml)` or per-unit mapping.
* Priority:

    1. Specific mapping (e.g., â€œ1 cup flour = 120gâ€)
    2. Density (convert via ml â†” g)
    3. Prompt user (choose ingredient or enter density)

### 6.3 Scaling

* Multiply `quantity` fields only.
* Do not attempt to rewrite instruction text automatically (for example bake for 20 minutes) unless user opts in.

### 6.4 Substitutions (form-to-form)

* Model substitutions as directed rules between `IngredientForm` records, not plain ingredient-name aliases.
* Suggested conversion order:

    1. Convert source amount to canonical base (usually grams or milliliters) from source form mappings.
    2. Apply `SubstitutionRule` (`ratio`, `affine`, or `fixed_amount`).
    3. Convert result to target display unit from target form mappings.
    4. Apply `roundingPolicy` and show `confidence` + notes.
* Example forms for chickpeas:

    * `chickpea_dried`
    * `chickpea_cooked`
    * `chickpea_canned_drained`
* Package mappings (e.g., â€œ1 can (15 oz)â€) may be represented in unit mappings and linked to form-specific drained mass.

### 6.5 Contextual substitutions (ingredient-to-ingredient)

* Keep two substitution classes:

    1. Global equivalent conversions (`SubstitutionRule`): same ingredient across forms; generally safe everywhere.
    2. Contextual substitutions (`ContextualSubstitutionRule`): different ingredients; valid only in specific contexts.
* Evaluation order for contextual substitutions:

    1. Match recipe context (dish type, ingredient role, cooking method when available).
    2. If context matches, offer substitution with confidence and notes.
    3. If context is unknown, require explicit user confirmation.
    4. If context is excluded/high-risk, block or show high-severity warning.
* Example policy:

    * `flour -> cornstarch` can be allowed for `sauce` or `gravy` when role is `thickener`.
    * The same rule should be excluded for `cake` and `pastry`.

---

## 7) Sync requirements (Google Drive)

### 7.1 Data format & file naming

* Default file: `RecipeLibrary.android16.recipes.zip` (name configurable)
* Include `manifest.json`:

    * app version, schema version, exportedAt, deviceId (optional)

### 7.2 Sync strategy (minimum viable)

* Manual â€œSync nowâ€
* Auto-sync:

    * On app background/close
    * On app launch (pull latest)
* Conflict detection using Drive file revision metadata.

---

## 8) Priorities (recommended MVP â†’ v2)

### MVP (must ship)

* FR-1, FR-3, FR-4, FR-6, FR-8, FR-9 (basic), FR-10, FR-11, FR-12 (replace import), FR-13 (basic sync)
* Ingredient reference list minimally editable (FR-7 basic)
* JSON specs defined (2.2)

### V1.1 / V2

* Publish/export recipes to a printable PDF format (first post-MVP nice-to-have).
* Pantry mode + â€œcook with what I haveâ€ filtering.
* Full shopping list functionality (FR-14): checklist, manual entries, full editability, delete controls, local name memory, editable sections.
* Dietary/allergen profiles with safe filtering/substitution prompts.
* Recipe version history (revision list + restore).
* Scaling lock controls for sensitive ingredients (for example salt/yeast).
* Step timers linked to instructions (support multiple concurrent timers).
* Batch cooking mode (scaled batches + yield/container notes).
* Printable PDF layout templates (for example compact, one-page, large-text).
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

## 10) Potential ideas (not committed)

* OCR import from photos/scans of handwritten or printed recipes.

---

## 11) Definition of done (DoD)

* Round-trip test: create recipes with photos + bilingual text + tags + collections + notes -> export -> delete local -> import -> identical.
* Offline test: edits made offline sync correctly once online.
* Conversion test: flour/water/sugar conversions behave as expected; unknown ingredients prompt.
* Launch behavior: app loads library automatically from Drive when enabled, otherwise local.
* Localization audit: 100% UI strings and system fields localized FR/EN; placeholders shown where user text missing.

---

