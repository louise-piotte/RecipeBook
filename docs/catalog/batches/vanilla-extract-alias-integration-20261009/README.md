# Vanilla/extract alias verification — 2026-10-09

Pixel 9a emulator (`emulator-5556`, Android 16 / API 36) was deployed with the freshly seeded package. Picker checks were run in English and fr-CA. The temporary recipe was discarded; the library returned to the French home with 114 recipes. No ingredient was saved from the draft.

- `vanilla bean` returns the vanilla pod.
- `pure vanilla extract` and French `essence de vanille` return vanilla extract.
- Bare `vanilla` keeps vanilla extract and vanilla pod as separate results.
- In fr-CA, `vanilla bean` displays as `gousse de vanille`; `essence de vanille` displays as `extrait de vanille`.

Screenshots are the original 1080×2424 emulator captures. SHA-256:

- `essence-de-vanille-en-ui.png` — `aedd23ee6320ec082363b9fa6a2cb50609e981c494c02b53b7989978b90cef3d`
- `essence-de-vanille-fr-ui.png` — `c24051a95ba7330c25bbc4d6fa2f7e0e7337ebfd61c690cd8ffa12b367e1eff2`
- `fr-home-114-recipes.png` — `477ffd74c032b7903c022481e8dbcebcae901560f4af65bd5b688c858387f950`
- `pure-vanilla-extract-en.png` — `3321b4419316f670a14564b68a337efdc1869017ef505de96f0a6078a59979c0`
- `vanilla-bean-en.png` — `bd09d60aa3446907957b74e500fa04f2d07944f10e31b672037e670e0ed5a93f`
- `vanilla-bean-fr-ui.png` — `e863ed3db5cfa62b602c69b9e4d7d6f2e1e4d62e08b403b71c981f9e2cce0fba`
- `vanilla-both-results-en.png` — `fd9befb99c19164410150ff1c8a7097d9bff7a317225b1dd1e9f959c0746fb60`
