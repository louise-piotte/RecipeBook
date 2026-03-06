# RecipeBook Roadmap (Active To-Do)

- Build MVP functional screens:
  - Library list + search
  - Recipe detail
  - Recipe editor
  - Basic tags and collections management
- Implement enhanced unit conversion behavior:
  - Show both C and F for temperatures
  - Support lb ↔ g conversion
  - Support fl oz ↔ ml conversion
  - Add per-ingredient custom density (g/ml) for weight ↔ volume conversion
- Finalize substitution modeling before implementation:
  - Global form-to-form equivalent rules (same ingredient states)
  - Contextual ingredient-to-ingredient rules with scope (dish type/role/method)
  - Warning/block behavior for out-of-scope or high-risk substitutions
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

## Maintenance Rules
- Remove an item immediately when it is done.
- Add items anytime when new work is identified.
