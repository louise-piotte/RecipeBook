# RecipeBook Roadmap (Active To-Do)


- Expand recipe importer beyond shared text and `schema.org/Recipe` URLs:
  - Add richer webpage fallback extraction when no recipe schema is present
  - Add image/OCR intake
  - Replace the local stub regenerator with a real AI-backed bilingual generation backend through `RecipeLanguageRegenerator`
  - Add AI-assisted draft finishing and normalization
- Implement full-library export/import (replace mode first).
- Add export/import integrity tests.
- Implement basic Google Drive sync:
  - File selection/setup
  - Pull on launch
  - Offline fallback to local cached copy
- Post-MVP first nice-to-have:
  - Publish/export recipes to printable PDF
- Add full shopping list functionality (post-MVP):
  - Generate checklist from selected recipes
  - Allow manual arbitrary entries
  - Allow editing name/amount/section on all entries (including auto-generated)
  - Hide amounts by default (show on demand)
  - Support delete one, delete checked, delete all
  - Keep local-only reusable name memory with section, case-insensitive and typo-tolerant suggestions
  - Allow add/rename/delete sections and persist locally
- Expose bundled ingredient conversion data in user-facing recipe screens:
  - Show reference-based unit conversions using saved density and explicit ingredient mappings
  - Surface duplicate warnings and ingredient suggestions using internal aliases/synonyms

## Maintenance Rules
- Remove an item immediately when it is done.
- Add items anytime when new work is identified.
