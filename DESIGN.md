# RecipeBook Design Notes

This file is the architectural index for the current Android app. Package-level `DESIGN.md` files go deeper into each layer and should be updated alongside code changes.

## Current Shape
- Single-module Android app in `app/`.
- Android entry points live in `app/src/main/java/app/recipebook`.
- The app currently centers on a local-first recipe library backed by Room, bundled seed data, Compose screens, and a small domain layer.
- The product is still pre-MVP, so the design favors clear in-place evolution over compatibility layers.

## Layer Overview
- `app.recipebook`: Android activities and app entry points. These wire navigation, repository access, and screen setup.
- `app.recipebook.data`: Persistence, seed loading, import/export schema DTOs, and local stores.
- `app.recipebook.domain`: Stable in-memory models and language-resolution helpers that should stay UI-agnostic.
- `app.recipebook.ui`: Compose screens, reusable UI helpers, and theme definitions.

## Main Runtime Flow
1. `MainActivity` creates the repository and language store.
2. The repository seeds bundled library data if the local database is empty.
3. Shared webpage imports build a staged draft, download the recipe's primary image into app-managed draft photo storage when available, then launch the editor with that photo already attached as the main image.
4. Compose screens observe repository flows and render domain models.
5. User edits go back through `RecipeRepository`, which validates invariants and writes full Room graph updates.

## Data Ownership
- Room entities are internal storage shapes, not the app's source-of-truth API.
- Domain models in `domain/model` are the main cross-layer contract used by UI and repository code.
- Schema DTOs in `data/schema` describe import/export payloads and must stay aligned with the domain model and docs.
- Bundled seed assets provide initial catalog and recipe content, not a separate compatibility format.

## Important Invariants
- User-facing content is bilingual and should remain UI-agnostic until rendered.
- Pre-MVP work should update draft data/models directly instead of introducing migrations or compatibility shims.
- Recipe graph writes should preserve related tags, collections, links, ingredient lines, substitutions, and photos together.
- Storage, schema docs, seed data, and tests should evolve together when data structures change.

## Where To Start
- New feature touching persistence: read `data/local/recipes/DESIGN.md` and `data/local/db/DESIGN.md`.
- New import/export or schema change: read `data/schema/DESIGN.md`.
- New UI flow: read `ui/recipes/DESIGN.md` plus the relevant activity in `app.recipebook`.
- Localization behavior: read `domain/DESIGN.md` and `data/local/settings/DESIGN.md`.
