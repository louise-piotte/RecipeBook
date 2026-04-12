# ui.theme Design

This package defines the app's visual foundation.

## Responsibilities
- Centralize colors, typography, shapes, and the top-level Compose theme wrapper.
- Keep shared visual tokens consistent across screens.

## Design Rules
- Theme primitives should be generic and reusable; screen-specific styling belongs in `ui/recipes`.
- Changes here have app-wide impact, so prefer deliberate token updates over one-off overrides.

## Maintenance Notes
- If compact phone-first UI guidance changes, update shared tokens here before patching many screens individually.
