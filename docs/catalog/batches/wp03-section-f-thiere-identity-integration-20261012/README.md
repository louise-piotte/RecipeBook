# WP03 Section F: thiéré millet-couscous identity integration

## Decision

Added identity-only `ingredient-ref-millet-couscous-thiere`:

- English display: `millet couscous (thiéré)`
- French display: `couscous de mil (thiéré)`
- Category: `GRAIN_AND_CEREAL`
- English alias: `tyere`
- French aliases: none
- Density: `null`; unit mappings and forms: none

Senegal’s standards body names the human-food product `couscous de mil` / `Thiéré`. Montréal and Canadian product pages use the French and English product wording. Keep this distinct from durum-wheat couscous, pearl couscous, millet grain and flours, thiakry, and localized or additive-containing products such as thiéré lalo.

## Evidence and boundaries

Thiéré products vary in rolling, steaming, drying, fermentation, additives, and preparation. No transferable household measure or density was found. The ledger records that measurements have no supported general value and keeps a general wheat-couscous replacement blocked; recipe-specific alternatives do not justify an active rule. No forms, measures, conversions, package yields, recipe links, or substitutions were added. The 114-file / 1,123-row bundled recipe corpus has no matching demand.

The full source register, picker boundaries, recipe scan, and evidence limits are in [the accepted proposal](../../proposals/wp03-section-f-thiere-millet-couscous-identity-review-20261012.md). The existing `couscous` and `pearl couscous` identities remain unchanged.

## Verification

The bundled ingredient catalog generator was rerun to refresh `BundledIngredientCatalog.kt` after the reference JSON changed. No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data. Section F remains open.
