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
  - Use `cuillère à thé` instead of `cuillère à café`.
  - Use `cuillère à soupe` instead of `cuillère à table`.
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
- 2026-03-06: French localization should use Quebec naming conventions for recipe instructions with proper accents/spelling (e.g., cuillère à thé, cuillère à soupe, bicarbonate de soude).
- 2026-03-06: Unit conversion requirements expanded: show temperatures in both C/F, support lb↔g and fl oz↔ml, and allow saved per-ingredient custom density (g/ml).
- 2026-03-06: Ingredient substitutions should be modeled as form-to-form directed rules (e.g., canned/drained ↔ dried ↔ cooked) with rule type, confidence, rounding policy, and recipe-line substitution links.
- 2026-03-06: Distinguish global same-ingredient form conversions from contextual ingredient-to-ingredient substitutions; contextual rules must enforce scope (dish type/role/method) with warning/block behavior for risky misuse.
- 2026-03-06: After MVP, prioritize printable PDF publishing/export as the first nice-to-have feature.
- 2026-03-06: Added post-MVP nice-to-haves: pantry mode, smart shopping list, dietary/allergen profiles, recipe version history, scale locks, step timers, batch mode, and printable PDF templates. OCR import is tracked separately as a potential (not committed) idea.
- 2026-03-06: Shopping list scope expanded to full functionality: checklist + manual entries, full editability of all entries, optional hidden-by-default amounts, delete one/checked/all actions, local-only reusable name memory with section and typo-tolerant case-insensitive suggestions, plus editable locally persisted sections.
- 2026-03-06: Implemented a lightweight shopping-list local store using Android DataStore preferences under `data/local/shoppinglist`, intentionally separate from JSON schema/DTO export models.
- 2026-03-06: Schema maintenance rule tightened: schema files, schema docs, examples, DTO/mappers, and schema tests must be updated together whenever any one of them changes.
- 2026-03-06: Set up Room persistence foundation for core entities/DAOs in `data/local/db` with a real instrumentation test for DAO round-trip behavior.
- 2026-03-06: Bilingual foundation must keep language/placeholder logic UI-agnostic so UI layout/structure can evolve without rewriting core behavior.
