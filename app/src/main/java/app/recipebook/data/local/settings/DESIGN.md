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

- `AiBackendSettingsStore.kt` stores only user-entered OpenRouter credentials and model in provider-scoped preferences. The fixed HTTPS endpoint is `https://openrouter.ai/api/v1`; the verified default model is `openai/gpt-5.4`. Legacy Poe preferences are ignored and removed on an explicit settings save. No credential is embedded; blank credentials disable remote AI. Credentials are masked, omitted from settings string representations and activity saved state, and excluded from Android cloud backup/device transfer. Library exports exclude device-local credentials. The earlier Luna request remains deferred.

MainActivity supplies the saved device language after launch sync. A legacy library missing library settings therefore preserves that preference; stored/imported library settings still take precedence.
