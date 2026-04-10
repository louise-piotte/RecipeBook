# RecipeBook Agent Instructions

## Project Source of Truth
- The project overview and requirements are in `Requirements.md`.
- The active to-do list is maintained in `roadmap.md`; remove completed items promptly and add new priorities as they change.

## Platform Target
- Target Android 16+.
- Primary device profile: Pixel 9a.

## Testing Requirements
- Maintain both unit tests and Android instrumentation tests.
- Keep tests aligned with the Pixel 9a profile where relevant.
- Test implemented changes on the Android emulator as part of verification.
  - `powershell.exe -NoProfile -Command '& "$env:LOCALAPPDATA\Android\Sdk\emulator\emulator.exe" -avd Pixel_9a'` to start emulator.
- Remove placeholder/stub tests once real coverage is implemented.
- Default reusable verification commands:
  - `.\\gradlew test --no-daemon` when a generic approved test run is sufficient.
  - `.\\gradlew :app:testDebugUnitTest --no-daemon` for unit-test-safe changes when a narrower run is more practical.
  - Use instrumentation-specific Gradle tasks separately when instrumentation coverage is needed.
- After the tests succeed, use `tools/deploy_to_pixel9a_emulator.sh` to upload it to the emulator and use navigation and screenshots to validate the change was correctly implemented.

## Localization
- Localize all user-facing strings in both English and French.
- Keep bilingual and language-logic behavior UI-agnostic in the domain/data layer because UI structure is expected to change multiple times.
- For French instructions, prefer Quebec naming conventions and correct accents/spelling even if the source text was typed on an English keyboard.
- Before adding any new localized string resource, check whether an existing string key already covers the same meaning and reuse it instead of creating a duplicate.
- Preferred Quebec terms for common recipe wording:
  - Use `cuill\u00e8re \u00e0 th\u00e9` instead of `cuill\u00e8re \u00e0 caf\u00e9`.
  - Use `cuill\u00e8re \u00e0 soupe` instead of `cuill\u00e8re \u00e0 table`.
  - Use `bicarbonate de soude` instead of `levure chimique`.

## Long-Term Memory
- Keep entries concise and update the relevant category instead of appending dated duplicate reminders.
- Do not store secrets, tokens, credentials, or private personal data.

### Architecture And Product Rules
- The codebase is still very new and far from a complete product. Pre-MVP, backward compatibility is out of scope unless the user explicitly requests it.
- Do not add backward-compatibility layers, startup migrations, normalization passes, schema-version upgrades, or compatibility shims for draft code, draft schemas, draft databases, debug seed recipes, or bundled library data. Fix or replace the current draft source instead.
- If a change feels too large or too destructive, stop and ask the user before proceeding.
- For any non-trivial change, present a plan and get user confirmation before proceeding. Trivial changes do not require confirmation.
  - Explaining the plan include, but is not limited to:
    - Listing changes or additions to the data structure, inculding implementing stubs.
    - Listing changes to the UI worklflow
    - Listing algorithms and data manipulation flows.

### Schema And Data Rules
- Keep schema DTOs, mappers, round-trip tests, schema files, schema docs, and examples consistent with each other whenever any one of them changes.
- During MVP, evolve schema contents in place within v1. Start schema version upgrades only when real user databases are in circulation and backward compatibility matters.
- Bundled seed data uses the split `seed/bundled-library` package format with a manifest plus part files; recipes live one per file under `seed/bundled-library/recipes`.
- For bundled seed/database JSON text, store French accents and symbols as explicit Unicode escapes such as `\u00e0`, `\u00e9`, `\u0153`, and `\u00b0`. Fix the bundled data itself rather than adding runtime encoding or conversion code.
- Ingredient references carry an internal classification category for normalization, catalog management, and future filtering; pre-MVP, evolve these categories in place without compatibility shims.
- Tags use a fixed built-in category taxonomy, including `OTHER`, with stored category values and localized FR/EN labels; keep categories code-defined rather than user-defined unless explicitly changed.
- A bundled ingredient reference catalog overlay exists with internal FR/EN aliases plus density and unit-mapping data to support duplicate detection and user-facing conversions.
- Shopping list persistence uses a lightweight Android DataStore preferences store under `data/local/shoppinglist`, intentionally separate from JSON schema/DTO export models.
- Room persistence foundation for core entities/DAOs lives in `data/local/db` and already includes a real instrumentation test for DAO round-trip behavior.
- Recipe photo support stores app-managed local image files, tracks a recipe-level `mainPhotoId`, and renders list/detail images with centered square cropping.

### Conversions And Substitutions
- Unit conversions must show temperatures in both C/F in the recipe content.
- Support `lb\u2194g` and `fl oz\u2194ml`, and allow a saved per-ingredient custom density in `g/ml`.
- Ingredient substitutions are modeled as directed form-to-form rules, for example `canned/drained \u2192 dried \u2192 cooked`, with rule type, confidence, rounding policy, and recipe-line substitution links.
- Distinguish global same-ingredient form conversions from contextual ingredient-to-ingredient substitutions. Contextual rules must enforce scope such as dish type, role, or method, with warning/block behavior for risky misuse.
- Normalize pure chocolate chip ingredients to the matching base chocolate ingredient instead of keeping separate `chips` entries. Examples: `chocolate chips` and `semi-sweet chocolate chips` map to `semisweet chocolate`, and `white chocolate chips` maps to `white chocolate`. Do not apply this rule to non-chocolate baking chips.

### Encoding And Text Safety
- When writing recipe JSON, docs, or code that contains accents or degree symbols, preserve correct UTF-8 without BOM and verify the saved result before finishing.
- If recipe or library text shows mojibake markers such as `\u00c3\u0192`, `\u00c3\u00a2\u20ac\u0161`, broken `\u00c2\u00b0`, or damaged French accents, repair it as UTF-8 text that was misread through Latin-1/ISO-8859-1, then rewrite the file as UTF-8 without BOM.
- Never leave mojibake examples such as `p\u00c3\u0192\u00c2\u00a9pites`, `\u00c3\u0192`, `\u00c3\u00a2\u20ac\u0161`, or broken `\u00c2\u00b0` in maintained files.

### UI Preferences
- Prefer classic, compact UI iconography to keep screens clean: hamburger for menu, plus for add/new, trash can for delete, and similar widely recognized symbols over text-only actions when practical.
- Avoid generous padding in phone UI layouts; favor compact spacing.
- Avoid big rounded edges in phone UI layouts when possible; prefer lean square shapes to preserve usable screen space in the activity itself, and very slight rounded edge in pop-ups.
- Default to compact icon-only actions when a single image or button is clear and fits inline with nearby content; use text buttons only when they add real clarity.

### Tooling And Local Environment
- If your preferred tooling is not available, stop and return to the user to install it.
- Bundled ingredient reference maintenance uses `tools/ingredient_catalog/normalize_seed_ingredient_references.py` to normalize the live seed JSON in place with stable formatting and no duplicated database or runtime conversion layer.
- Bundled seed package maintenance also uses `tools/seed_package/normalize_bundled_seed_package.py` to normalize and validate the full `app/src/main/assets/seed/bundled-library` package in place. The ingredient-only script remains a compatibility entry point backed by the same shared seed-package module.
