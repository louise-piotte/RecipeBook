# WP06 papa seca identity — 2026-10-09

This coordinator batch adds the source-named `papa seca` product from a Peruvian carapulcra recipe.

## Catalog decision

- ID: `ingredient-ref-papa-seca`
- English display: `dried potato (papa seca)`
- French display: `papa seca` (provisional pending Québec terminology review)
- Category: `VEGETABLE_AND_AROMATIC`
- Aliases: none.
- Perú Travel lists papa seca as an ingredient in carapulcra and gives a recipe-specific sequence to
  toast, cool, wash, soak, and drain it before cooking. That source supports the named dry product
  in that dish; it is not a product standard or universal preparation method.
- Keep it separate from generic potato, potato flour, potato starch, chuño, and tunta. No recipe
  quantity, soak ratio, form, density, unit mapping, measurement, conversion, substitution, or recipe
  link was added.
- A scan of all 114 bundled recipes (1,123 ingredient rows) found no matching name or reference ID.
  No recipe file changed.

## Source

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP06-SOUTHAM-20261009-S03` | Perú Travel, [“La Carapulcra”](https://www.peru.travel/gastronomia/es/recetas/platos-de-fondo/la-carapulcra.html), ingredient list and preparation | Names papa seca and gives one recipe's toast/wash/soak/drain sequence. This is one tourism-site recipe, not a product standard; its quantities and preparation details are not adopted as universal catalog data. |

## Validation

- Package: 477 ingredient references (SHA-256
  `eddaa022806187a6bfc67f21f47d86a5caaa39be9ea40fb324731924f13416f1`), 17 forms (SHA-256
  `2098e1048796a1aba42c25e4020f018d02c04c332567620084fceac8f2d15`); manifest SHA-256
  `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 643 records, 887 source entries, 774 distinct source IDs (SHA-256
  `8a3fb850ebb1741150437e76f432fdf48b33bcb153b468ad629f9bfd436ac7c4`).
- Package normalization, generated-index freshness, ledger schema validation, and all 9 Python
  seed-package tests passed. Android unit tests: 297 passed, 0 failures/errors/skips.
- Pixel 9a / Android 16 connected instrumentation on `emulator-5556`: 29 XML cases, 27 passed,
  2 skipped, 0 failures/errors. The deploy script installed the app and launched `MainActivity`.
- English picker query `dried potato` returned one `dried potato (papa seca)` result. French query
  `papa seca` returned one `papa seca` result. The blank drafts were discarded, and the French
  library returned to 114 recipes.
- Recipe scan: 114 recipes and 1,123 ingredient rows; no papa seca match or recipe relink.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: dried potato](en-picker.png) | `7e0237b5ba67b69c970b51d7911e84609fa03c085a0f1506a37e82134c08a15b` |
| [French picker: papa seca](fr-picker.png) | `7135ef5c812c9aef1207c1426db84a05b1c27a6460b92531ae0b39588cc5b2a5` |
| [French library home, 114 recipes](fr-library-114.png) | `07fedd2b93c63f0d340600295ed3dbb01b14e63b93174a2d873311e17ec8bec8` |

## Open work

Review French wording with an independent Québec culinary terminology reviewer. Compare papa seca,
chuño, and tunta using product specifications and local market evidence before any alias decision.
Andean and broader South American coverage remains open.
