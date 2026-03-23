# RecipeBook Agent Instructions

## Project Source of Truth
- The project overview and requirements are in `Requirements.md`.

## Platform Target
- Target Android 16+.
- Primary device profile: Pixel 9a.

## Testing Requirements
- Maintain both unit tests and Android instrumentation tests.
- Keep tests aligned with the Pixel 9a profile where relevant.
- Remove placeholder/stub tests once real coverage is implemented.

## Localization
- Localize all user-facing strings in both English and French.
- For French instructions, prefer Quebec naming conventions.
- Ensure French text uses proper accents and corrected spelling/typos during conversion, even when source text is typed on an English keyboard.
- Keep bilingual/language logic UI-agnostic (domain/data layer), because UI structure is expected to change multiple times.
- Preferred Quebec terms for common recipe wording:
  - Use `cuillÃƒÂ¨re ÃƒÂ  thÃƒÂ©` instead of `cuillÃƒÂ¨re ÃƒÂ  cafÃƒÂ©`.
  - Use `cuillÃƒÂ¨re ÃƒÂ  soupe` instead of `cuillÃƒÂ¨re ÃƒÂ  table`.
  - Use `bicarbonate de soude` instead of `levure chimique`.

## Active Roadmap
- The active to-do list is maintained in `roadmap.md`.
- Remove items from `roadmap.md` as soon as they are completed.
- Add new items to `roadmap.md` anytime as priorities change.

## Schema Versioning Policy
- Do not upgrade JSON schema versions until a minimal working product (MVP) is complete.
- During MVP development, evolve schema contents in place within v1 as needed.
- Start schema version upgrades only when real user databases are in circulation and backward compatibility matters.
- Schema DTOs and schema round-trip tests must always stay consistent with each other and with the active schema files.
- Any schema/DTO change must include corresponding test updates in the same change.

## Long-Term Memory
- Persist durable project notes in this `AGENTS.md` file under the `Memory Log` section.
- Add concise, dated entries only for information that should influence future work.
- Do not store secrets, tokens, credentials, or private personal data.

## Memory Log
- 2026-03-02: General project overview was added to `Requirements.md`.
- 2026-03-02: Freeze schema version upgrades until MVP is complete and real persisted databases exist.
- 2026-03-02: Schema DTOs and schema tests must always remain consistent with each other and with active schemas.
- 2026-03-06: French localization should use Quebec naming conventions for recipe instructions with proper accents/spelling (e.g., cuillÃƒÂ¨re ÃƒÂ  thÃƒÂ©, cuillÃƒÂ¨re ÃƒÂ  soupe, bicarbonate de soude).
- 2026-03-06: Unit conversion requirements expanded: show temperatures in both C/F, support lbÃ¢â€ â€g and fl ozÃ¢â€ â€ml, and allow saved per-ingredient custom density (g/ml).
- 2026-03-06: Ingredient substitutions should be modeled as form-to-form directed rules (e.g., canned/drained Ã¢â€ â€ dried Ã¢â€ â€ cooked) with rule type, confidence, rounding policy, and recipe-line substitution links.
- 2026-03-06: Distinguish global same-ingredient form conversions from contextual ingredient-to-ingredient substitutions; contextual rules must enforce scope (dish type/role/method) with warning/block behavior for risky misuse.
- 2026-03-06: After MVP, prioritize printable PDF publishing/export as the first nice-to-have feature.
- 2026-03-06: Added post-MVP nice-to-haves: pantry mode, smart shopping list, dietary/allergen profiles, recipe version history, scale locks, step timers, batch mode, and printable PDF templates. OCR import is tracked separately as a potential (not committed) idea.
- 2026-03-06: Shopping list scope expanded to full functionality: checklist + manual entries, full editability of all entries, optional hidden-by-default amounts, delete one/checked/all actions, local-only reusable name memory with section and typo-tolerant case-insensitive suggestions, plus editable locally persisted sections.
- 2026-03-06: Implemented a lightweight shopping-list local store using Android DataStore preferences under `data/local/shoppinglist`, intentionally separate from JSON schema/DTO export models.
- 2026-03-06: Schema maintenance rule tightened: schema files, schema docs, examples, DTO/mappers, and schema tests must be updated together whenever any one of them changes.
- 2026-03-06: Set up Room persistence foundation for core entities/DAOs in `data/local/db` with a real instrumentation test for DAO round-trip behavior.
- 2026-03-06: Bilingual foundation must keep language/placeholder logic UI-agnostic so UI layout/structure can evolve without rewriting core behavior.
- 2026-03-13: Converted the Boite de Noel recipe PDF into a curated bundled full-library JSON kept in docs/recipes and app assets for seed/demo use.
- 2026-03-16: The codebase is still very new and far from a complete product. Do not add backward-compatibility layers for draft code, draft schemas, or debug seed recipes. Prefer removing and replacing problematic draft code/data instead of stacking compatibility logic. If a change feels too large or too destructive, stop and ask the user before proceeding.
- 2026-03-16: Treat backward compatibility as out of scope until explicitly requested by the user. For this pre-MVP codebase, do not preserve old draft behavior, old draft databases, old draft schemas, or compatibility shims by default.
- 2026-03-16: For any non-trivial change, present a plan and get user confirmation before proceeding. Trivial changes do not require a confirmation step.
- 2026-03-16: Prefer classic, compact UI iconography to keep screens clean: hamburger for menu, plus for add/new, trash can for delete, and similar widely recognized symbols over text-only actions when practical.
- 2026-03-20: Recipe photo support stores app-managed local image files, tracks a recipe-level `mainPhotoId`, and renders list/detail images with centered square cropping.
- 2026-03-20: Avoid generous padding in phone UI layouts; favor compact spacing because excess padding wastes too much screen space.
- 2026-03-20: Avoid rounded edges in phone UI layouts when possible; prefer squarer shapes to preserve usable screen space.
- 2026-03-20: Default to compact icon-only actions when a single image/button is clear and can fit inline with nearby content; treat text buttons as the exception unless the user flags a case.
- 2026-03-20: Before adding any new localized string resource, always check whether an existing string key already covers the same text/meaning and reuse it instead of creating a duplicate.
- 2026-03-20: Ingredient references now carry a first-pass internal classification category for normalization, catalog management, and future filtering; pre-MVP, evolve these categories in place without backward-compatibility shims.
- 2026-03-20: Added a bundled ingredient reference catalog overlay with internal FR/EN aliases plus density and unit-mapping data to support duplicate detection and upcoming user-facing conversions.
- 2026-03-20: A long-term goal is to clean, normalize, and integrate the contents of docs/exported-recipe-lists; when inconsistencies or typos are found there, fix them rather than preserving them.
- 2026-03-22: Tags now carry a fixed built-in category taxonomy (including OTHER) with stored category values and FR/EN localized category labels; keep categories code-defined rather than user-defined until explicitly changed.
- 2026-03-22: Default reusable local verification command is .\\gradlew :app:testDebugUnitTest --no-daemon for unit-test-safe changes; use instrumentation-specific Gradle tasks separately when needed.
- 2026-03-23: Recipe import cleanup work must convert recipes to the current format, normalize wording consistently across recipes, use Quebec French, replace old ingredient-tag assumptions with relevant current tags, add missing translations, and add missing ingredient/tag entries or aliases when needed.
- 2026-03-23: Consistency is a primary rule for recipe cleanup; keep recurring conventions such as oven temperature wording, unit phrasing, capitalization, punctuation, and bilingual terminology aligned across the whole library rather than deciding case by case.
- 2026-03-23: Recipe cleanup formatting rules: write temperatures as `xÃ‚Â°C/yÃ‚Â°F`; write times as `xh ymin zsec`, omitting any zero-value parts such as `0 h` or `0 sec`; fill missing structure and translations as accurately as possible without inventing missing factual data such as absent cook times.
- 2026-03-23: Recipe titles should use direct translations validated against the term actually used in context, and when a source URL exists it should be consulted for translation context only; do not overwrite personalized recipe amounts from the user's saved copy even if the source now differs.
- 2026-03-23: Recipe import cleanup should also port recipe pictures into the app database/assets flow as part of the same import work whenever source images are available.
- 2026-03-23: Prefer running verification through the generic approved Gradle command `.\\gradlew test --no-daemon` when possible so test reruns do not require extra approval prompts.
- 2026-03-23: Once an exported source recipe has been processed into the app format, rename the original export file to append `_processed` before the extension; do not alter that source file's content, and do not carry forward the old `Ãƒâ‚¬ nettoyer/To Clean` source grouping as an imported tag.
- 2026-03-23: If a source recipe still contains unresolved either/or ingredient choices or variant selections, stop and ask the user instead of importing every option; only import the version the user actually uses.
- 2026-03-23: When writing recipe JSON, docs, or code that contains accents or degree symbols, explicitly preserve UTF-8 encoding so characters such as `ÃƒÂ `, `ÃƒÂ©`, and `Ã‚Â°` do not turn into mojibake or replacement glyphs.
- 2026-03-23: If recipe/library text already shows mojibake markers such as `ÃƒÆ’`, `Ãƒâ€š`, broken `Ã‚Â°`, or lost French accents, repair it as UTF-8 text that was misread through Latin-1/ISO-8859-1, then rewrite the file as UTF-8 without BOM. Treat this as the default fix for recurring recipe-import encoding corruption.
- 2026-03-23: Encoding safety is mandatory, not optional: when editing recipe/code/docs text with accents or symbols, always preserve correct UTF-8 without BOM, and verify the actual saved result before finishing. Never leave mojibake such as `pÃƒÆ’Ã‚Â©pites`, `ÃƒÆ’`, `Ãƒâ€š`, broken `Ã‚Â°`, or damaged accents in the file.
- 2026-03-23: Normalize pure chocolate chip ingredients to the matching base chocolate ingredient instead of keeping separate `chips` entries: e.g. `chocolate chips`/`semi-sweet chocolate chips` -> `semisweet chocolate`, `white chocolate chips` -> `white chocolate`, and similarly for other plain chocolate variants. Do not apply this rule to non-chocolate baking chips such as peanut butter chips or butterscotch chips.
- 2026-03-23: Do not add unit tests that lock in individual recipe content details; recipe-entry text/content is not reusable and may change during cleanup. Shared ingredient catalogs, shared tag catalogs, schema shape, and generic structural validation are fine to test.
- 2026-03-23: Pre-MVP, do not add startup conversion, normalization, migration, or backward-compatibility code for bundled library data. Fix the bundled source library itself instead and load it directly.
- 2026-03-23: Bundled seed data is now a split seed/bundled-library package with manifest + part files (recipes, ingredient references, tags, etc.); do not reintroduce the removed single-file bundled seed format or old boite-de-noel package/library identifiers.
- 2026-03-23: For bundled seed/database JSON text, store French accents and symbols as explicit Unicode escapes such as `\u00e0`, `\u00e9`, `\u0153`, and `\u00b0` when editing the data files. Fix the bundled data itself and do not add runtime encoding or conversion code.
