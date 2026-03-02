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
