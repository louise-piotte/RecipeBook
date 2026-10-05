# RecipeBook Roadmap (Active To-Do)

- Add full shopping list functionality:
  - Generate checklist from a recipe (add an option to add to shopping list and have the user select ingredient entry)
  - Allow manual arbitrary entries
  - Allow editing name/amount/section on all entries (including auto-generated)
  - Hide amounts by default (show on demand)
  - Support delete one, delete checked, delete all
  - Keep local-only reusable name memory with section, case-insensitive and typo-tolerant suggestions
  - Allow add/rename/delete sections and persist locally
- Expand recipe importer beyond shared text and `schema.org/Recipe` URLs:
  - Add richer webpage fallback extraction when no recipe schema is present
  - Add image/OCR intake
  - Add AI-assisted draft finishing and normalization

- Post-MVP first nice-to-have:
  - Publish/export recipes to printable PDF

- Expose bundled ingredient conversion data in user-facing recipe screens:
  - Show reference-based unit conversions using saved density and explicit ingredient mappings
  - Surface duplicate warnings and ingredient suggestions using internal aliases/synonyms

## Review Follow-ups
- Count ingredient QA follow-ups outside the current count-only repair: implement serving-scaling controls; review mass/volume conversion-label floating-point rounding and source preparation carried into substitution suggestions; unquantified units displayed with numeric amounts; unlinked source ingredient names remaining English in French views.
- Luna model selection remains deferred; OpenRouter uses the verified `openai/gpt-5.4` model until a new model is explicitly requested.

## Maintenance Rules
- Remove an item immediately when it is done.
- Add items anytime when new work is identified.
