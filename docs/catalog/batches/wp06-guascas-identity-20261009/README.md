# WP06 Guascas identity — 2026-10-09

## Catalog decision

- ID: `ingredient-ref-guascas`
- English and French displays: `guascas` (French usage remains provisional)
- Category: `HERB`
- The source-attested singular `guasca` is the only alias in both locales.
- No species, forms, density, unit mappings, measurements, conversions, substitutions, or recipe links are assigned.
- Keep it separate from cilantro/coriander and other source-named herbs. Colombian sources use the culinary name with two accepted *Galinsoga* species, so the reference does not assert one botanical species.

## Evidence

The [Jardín Botánico de Bogotá and Muisca community publication](https://jbb.gov.co/documentos/publicaciones/Memorias_cultivos_y_sabores.pdf) identifies guascas as ajiaco seasoning and lists leaves, flowers, and stems as usable parts. The [Bogotá botanical names platform](https://nombrescomunes.jbb.gov.co/site/combinacion?q=1078) and [Kew Plants of the World Online](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:208554-1/general-information) document the species/name boundary. See the full [research proposal](../../proposals/wp06-guascas-boundary-review-20261009.md) for source locators, limits, and the exact audit method.

## Collision and recipe checks

The proposal scanned 20 normalized candidate phrases across the 484-reference pre-integration package, its 18 forms, and 99 legacy candidates. It found no exact phrase owner and no hits in the 114 bundled recipes / 1,123 ingredient rows. The current package contains 487 references; no recipe text or links were changed.

## Validation

- Current reference file: 487 entries, SHA-256 `de40604fe47b36f504b59febe5f6473dcbae59818e0a9c289764954688d8db48`.
- Forms: 18, SHA-256 `ee299dbe8f4a2349a16c495b37ac6ee4830a128fdceffd91f3bf2001f1e10617`.
- Manifest: 114 recipe paths, SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Research ledger: 654 records / 972 source entries / 845 distinct source IDs, SHA-256 `7acc14614d9f92dba2a4dfea40993f22c349481d04d920e4c6fff16342fe2d94`; schema validation reported zero errors.
- Package normalization, generated-index freshness, all 9 Python package tests, and all 305 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 XML cases, 27 passed, 2 skipped, 0 failures or errors. The deploy script installed and launched the build.
- English search `guasca` and French search `guasca` each returned the single localized guascas result. The unsaved recipe draft was discarded and the French home returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| English picker: guascas | `e197c0b96c5fbf8a9f800a260801959ce883d44d44d35ac6cbca6a7ee466a144` |
| French picker: guasca → guascas | `7dd6b11950b2648e9f48efd14e301f74cbedac6fc94bf07d5d3fc1e2b8306e0a` |
| French home, 114 recipes | `32cd824106f7ee7a5173a5d30f404dc66ff2930f6f938870a0aff6b127a44c86` |

## Open work

Independent Québec terminology review and the broader South American identity/gap sweep remain open.
