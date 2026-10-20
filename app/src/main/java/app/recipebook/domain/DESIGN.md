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
- Ingredient-line `preparation` and `notes` are bilingual domain data, while `originalText` and `ingredientName` remain single-source fields tied to the imported or edited source wording.

- `localization/IngredientAmounts.kt` owns locale-independent quantity parsing, French/English unit normalization, and bilingual amount display. Decimal commas, fraction glyphs, and mixed fractions resolve to the same shared numeric value; locale changes do not mutate quantities. Explicit conversion units and small positive quantities remain visible.
- `localization/IngredientPresentation.kt` composes count-unit and ingredient identity into a single FR/EN noun phrase, with size-preserving singular/plural forms and bounded preparation agreement. It leaves mass/volume names, amounts, units and preparation unchanged; no stored recipe fields are rewritten.
- Ingredient search uses `localization/IngredientSearch.kt` to fold accents, common ligatures, and punctuation consistently while keeping stored and displayed spellings intact. Search prefers complete normalized word phrases across the result set, then falls back to partial matching when no complete phrase matches. A complete form phrase narrows results to the attached base identities; a unique complete form phrase can be carried as a form hint when the user selects that identity. Partial or ambiguous text does not select a form.
- `IngredientReferenceSearchIndex` stores normalized reference/form terms and word postings for reuse across queries on one catalog snapshot. Complete form phrases use a direct lookup; partial matching scans the already-normalized terms. Callers rebuild the immutable index when the reference or form snapshot changes.
- `IngredientLine.ingredientFormId` records an explicitly selected catalog form; `ingredientAliasHint` preserves the recipe or personal wording alongside the canonical reference.
- `IngredientPackageAmount` keeps package count/type, declared net size/unit, packing medium, optional product qualifiers, and requested net/drained/edible basis separate. `PackageYieldObservation` is a source-qualified product/package relationship, not a generic conversion factor.
