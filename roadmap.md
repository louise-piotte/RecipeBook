# RecipeBook Roadmap (Active To-Do)

- Implement enhanced unit conversion behavior:
  - Show both C and F for temperatures
  - Support lb ↔ g conversion
  - Support fl oz ↔ ml conversion
  - Add per-ingredient custom density (g/ml) for weight ↔ volume conversion
- Expand persistence/data-layer search support:
  - Recipe search across ingredients and instructions
  - Tag and collection filtering support in the local data layer
  - Ingredient reference search across French/English names and aliases
- Deepen contextual substitution enforcement:
  - Capture structured ingredient roles and cooking methods so contextual rules can enforce more than dish-type tags
  - Expand the seeded substitution catalog beyond the initial butter, chickpea, and flour/cornstarch examples
- Review recipe-to-recipe links:
  - Decide whether linked recipes should be part of the product requirements
  - If yes, add the requirement to `Requirements.md` and plan the supporting seed/schema model
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
