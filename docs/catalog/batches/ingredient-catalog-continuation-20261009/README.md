# Ingredient catalog continuation — Pixel 9a QA

Verification for the 2026-10-09 integration of dried oyster, sourdough starter, Japanese white soy sauce (shiro shoyu), and Japanese saishikomi soy sauce. Device: Pixel 9a profile, Android 16 / API 36, serial `emulator-5556`.

## Snapshot and checks

- 457 ingredient references (`89586580eb03269159e3ada21e6a0310b3fb0cc2f4ce98d2f5f1d71e50422610`); 17 forms (`2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15`).
- 624 research-ledger records / 840 source entries (`bdcc5d8ebf93da1043c13d08d7a70f6eb4ed78a21b3a78053d506c1abd6c381c`); 735 distinct source IDs.
- 99 legacy candidates; 114 recipe files / 1,123 ingredient rows; recipe-corpus digest `b4723f4a0dc4a19008c9f866307696235320845eaa8c0cfb21b8327d055f5194`.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; legacy-candidate SHA-256: `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b`.
- Bundled package normalization reported zero changed parts; generated catalog index is current at 457 references. Research-ledger/package validation passed.
- All 9 Python package tests and 282 Android unit tests passed.
- Connected instrumentation on `emulator-5556`: 29 cases, 27 passed, 2 skipped, 0 failures. Gradle also detected `emulator-5554`, which ran zero tests and reported insufficient install space; that second-device issue did not affect the selected Pixel 9a report.
- The deployment script's test and APK assembly steps passed, and the final APK installed and launched on `emulator-5556`.

## Picker checks

- English `dried oyster` returned `dried oyster`; the accent-folded French query `huitre sechee` returned `huître séchée`.
- English `sourdough starter` returned `sourdough starter`; French `levain` returned `levain naturel`.
- English `white soy sauce` returned the shiro identity; French `shiro` displayed `sauce soya extra-claire (shiro shoyu)`.
- Broad English `shoyu` returned generic `soy sauce` and the white-soy subtype before the saishikomi addition; the focused `shiro shoyu` query returned the subtype alone. Automated search tests preserve distinct tamari and Chinese-style light/dark soy-sauce rows.
- English `saishikomi soy sauce` returned the new identity. In the French interface, accent-folded `sauce soya refermentee` displayed `sauce soya refermentée (saishikomi)`. Broad `shoyu` now returns generic soy sauce, white soy sauce, and saishikomi soy sauce through their qualified style terms.
- The source-qualified name `Yokhoss` was not activated as a global alias. No recipe ingredient line was relinked, and no draft recipe was saved.
- The French library home was restored and showed `Toutes les recettes (114)`.

## Screenshots

Hashes below are for the exact PNG bytes captured from the emulator.

| Screen | Screenshot | SHA-256 |
|---|---|---|
| Dried oyster — English | [dried-oyster-en.png](dried-oyster-en.png) | `e3e20fec07de043a0c25e5606bed3b020b1f39cd5469b931b87e21d948173a0a` |
| Dried oyster — fr-CA | [dried-oyster-fr-ca.png](dried-oyster-fr-ca.png) | `f88d88d8a1d3d008ec170e7b8b2b7b78408e848e27efa581ba80cac71c5d9ec5` |
| French library home — 114 recipes | [pixel9a-home-fr-ca-114.png](pixel9a-home-fr-ca-114.png) | `ff0bb1026f257a731b5ae5b3b81d5123f34dd680158fff09f5897b636fae7cd4` |
| Generic shoyu — English | [shoyu-en.png](shoyu-en.png) | `af8be2a66847ae7e9e79a1ba22a2a8896218d417724daacf2718d9f9f9c86c19` |
| Sourdough starter — English | [sourdough-starter-en.png](sourdough-starter-en.png) | `80712e7e4fd7c87a29929ff140befe69465db31e943525bb7a551b6d9ac55ac8` |
| Sourdough starter — fr-CA | [sourdough-starter-fr-ca.png](sourdough-starter-fr-ca.png) | `660e8e496442b1f5895e355bc79dd3c14ddf90cc433b589232cb7f8659462f60` |
| White soy sauce — English | [white-soy-sauce-en.png](white-soy-sauce-en.png) | `0e657bd3e3c0dc00b62c725d1cb00a851656f519fdc0dc263541da5b974d84eb` |
| White soy sauce — fr-CA | [white-soy-sauce-fr-ca.png](white-soy-sauce-fr-ca.png) | `9ad2ce57cf19030cb36f8001afb029b9de59d3e60b151280646f31cd430d587d` |
| Saishikomi soy sauce — English | [saishikomi-soy-sauce-en.png](saishikomi-soy-sauce-en.png) | `4fa610b4c80cfd089e4c96159f831dd227d24b013384275f7f7f8025bfaae2be` |
| Saishikomi soy sauce — fr-CA | [saishikomi-soy-sauce-fr-ca.png](saishikomi-soy-sauce-fr-ca.png) | `90965788b00bc6732203b601da335d1aaa056f2098d54289bcaba7030c0a4a99` |
| French library home after saishikomi — 114 recipes | [pixel9a-home-fr-ca-114-after-saishikomi.png](pixel9a-home-fr-ca-114-after-saishikomi.png) | `78c695883ecd1e911c757c8a6ebe1e16f39e02be042510ffd2b7192fa9b72570` |
