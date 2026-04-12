# domain Design

This layer contains app-facing models and logic that should remain independent from specific UI layouts and storage details.

## Responsibilities
- Define shared in-memory models for recipes, ingredient references, substitutions, tags, collections, and language state.
- Resolve bilingual display behavior without coupling that logic to Compose widgets.

## Current Structure
- `model/LibraryModels.kt`: the main domain contract used throughout the app.
- `localization/BilingualTextResolver.kt`: language-specific selection and fallback presentation logic.

## Design Rules
- Keep domain models stable and readable; they are the handoff contract between `data` and `ui`.
- Language rules belong here or in data, not sprinkled across screens.
- Avoid leaking Room-specific or JSON-specific annotations into core models unless there is a strong reason.

## Maintenance Notes
- When adding a field, verify whether it belongs in the domain model, storage entities, schema DTOs, or all three.
- Domain models are allowed to evolve aggressively pre-MVP, but the rest of the stack must be updated in lockstep.
