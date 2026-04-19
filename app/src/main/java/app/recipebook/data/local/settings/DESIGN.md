# data.local.settings Design

This package holds lightweight app settings that do not belong in the recipe library database yet.

## Responsibilities
- Persist the selected app language.
- Persist device-local Drive backup document access that should not travel inside exported library JSON.
- Expose settings as flows that screens can observe directly.

## Design Rules
- Keep this package narrow. If a setting becomes part of exported library state, move the authoritative model deliberately instead of mirroring it in two places.
- SAF/Drive document URIs stay local-only here because they are device-granted handles, not portable library data.
- The stored value should remain UI-agnostic and map cleanly to domain enums.

## Maintenance Notes
- `AppLanguageStore.kt` is intentionally simple. Avoid over-abstracting until more settings truly share the same behavior.
