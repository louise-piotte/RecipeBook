# data.local.settings Design

This package holds lightweight app settings that do not belong in the recipe library database yet.

## Responsibilities
- Persist the selected app language.
- Expose settings as flows that screens can observe directly.

## Design Rules
- Keep this package narrow. If a setting becomes part of exported library state, move the authoritative model deliberately instead of mirroring it in two places.
- The stored value should remain UI-agnostic and map cleanly to domain enums.

## Maintenance Notes
- `AppLanguageStore.kt` is intentionally simple. Avoid over-abstracting until more settings truly share the same behavior.
