# Ingredient catalog merge — Pixel 9a QA

Final verification for the 2026-10-09 catalog snapshot. Device: isolated Pixel 9a profile, Android 16 / API 36, serial `emulator-5556`.

## Snapshot and checks

- 453 ingredient references; 17 forms; 620 research-ledger records with 808 source entries; 99 legacy candidates.
- 114 recipes and 1,123 ingredient rows. The temporary picker probes were discarded; no recipe was saved.
- Bundled package normalization reported zero changed parts. The generated catalog index reports 453 references. Research-ledger/package validation passed.
- All 9 Python package tests and 282 Android unit tests passed. The deploy script's test and APK assembly steps passed; the final APK installed and launched on `emulator-5556`.
- Connected instrumentation on `emulator-5556`: 29 cases, 27 passed, 2 existing environment skips, 0 failures. Gradle also detected `emulator-5554`; it ran zero tests and reported insufficient install space. That second-device error did not affect the selected Pixel 9a report.

## Picker checks

- English `dried shrimp` returned the dried-shrimp identity.
- French accent-folded `crevette sechee` returned `crevette séchée`; `petoncle seche` returned `pétoncle séché`.
- English `instant yeast` returned the instant-yeast identity; French `levure a action rapide` returned `levure à action rapide`.
- English `shoyu` returned generic `soy sauce`; `tamari` returned the separate tamari identity. French `tamari` also returned the separate tamari identity.
- Existing regression searches still returned dark corn syrup, oyster sauce plus vegan oyster sauce, and the roasted/popped makhana form hint in both locales.
- After discarding the unsaved probes, the French library home showed `Toutes les recettes (114)`.

## Screenshots

Each SHA-256 is for the exact PNG bytes in this folder.

| Screen | Screenshot | SHA-256 |
|---|---|---|
| Dark corn syrup — English | [pixel9a-dark-corn-syrup-en.png](pixel9a-dark-corn-syrup-en.png) | `f80a3a864541afd64220a0f5960a1764ae53fcfd197595236c0b2f29a3f797d4` |
| Dark corn syrup — fr-CA | [pixel9a-dark-corn-syrup-fr-ca.png](pixel9a-dark-corn-syrup-fr-ca.png) | `7f7d7ef1fce43529f728da580aa3827b3926db391fb20b98c43569ad4bb454c0` |
| Dried scallop — fr-CA | [pixel9a-dried-scallop-fr-ca.png](pixel9a-dried-scallop-fr-ca.png) | `344e362f2a67d158d5f36e16e2474b79b9a49d4f304be0fd8bc1b1e372a02916` |
| Dried shrimp — English | [pixel9a-dried-shrimp-en.png](pixel9a-dried-shrimp-en.png) | `13dcac4cf9012a010d42f8a0e07a6177c83bd9ea674f0012e2689dc85d499daf` |
| Dried shrimp — fr-CA | [pixel9a-dried-shrimp-fr-ca.png](pixel9a-dried-shrimp-fr-ca.png) | `ac91dfa0bf4f3e40e6dcda546fa1df273c7b7930417176e1adbfb8c2f34c39eb` |
| Library home — fr-CA | [pixel9a-home-fr-ca-114.png](pixel9a-home-fr-ca-114.png) | `63759958fa6cab921d052338e61241d334890c74bb045db149aaab797e6e0316` |
| Instant yeast — English | [pixel9a-instant-yeast-en.png](pixel9a-instant-yeast-en.png) | `9684273423a882fa2936692d967e0f007e1c49ce3e502366f3b04ce9d3a6821b` |
| Instant yeast — fr-CA | [pixel9a-instant-yeast-fr-ca.png](pixel9a-instant-yeast-fr-ca.png) | `22199cf986a57ab1c627cfb7c15b4c5960357324f5fd71953fabce9e5fc05eaa` |
| Makhana form — English | [pixel9a-makhana-form-en.png](pixel9a-makhana-form-en.png) | `57298023235824d3a819a3f298bbdf47f4b6a3ed4a7c9c33f0aabbe87c6102c9` |
| Makhana form — fr-CA | [pixel9a-makhana-form-fr-ca.png](pixel9a-makhana-form-fr-ca.png) | `edfbec5fcb629a8f7682f0870116ce34b273ca5f45e9e56e3285ec15528eb71f` |
| Oyster sauce — English | [pixel9a-oyster-sauce-en.png](pixel9a-oyster-sauce-en.png) | `ca1c03cf901ae93a515309cb47f210663a089bea3522487d7f3e873c62afd655` |
| Oyster sauce — fr-CA | [pixel9a-oyster-sauce-fr-ca.png](pixel9a-oyster-sauce-fr-ca.png) | `c73274569b177600de0d05d9844c7790623829ca500a2bfce88b607365c79386` |
| Shoyu — English | [pixel9a-shoyu-en.png](pixel9a-shoyu-en.png) | `89a21a94a75aeab6a9df3dc67c081f447897dd2f457407690c1019ab26856401` |
| Tamari — English | [pixel9a-tamari-en.png](pixel9a-tamari-en.png) | `8687e0f31b40374d6e63535fe4676ede15e74ffdb559ebf2822084228b275bf8` |
| Tamari — fr-CA | [pixel9a-tamari-fr-ca.png](pixel9a-tamari-fr-ca.png) | `520a01b8c34050126f616625dda861de6ecd1dda5d65108284660b0c058e966d` |
