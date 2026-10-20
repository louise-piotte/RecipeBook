# WP03 Section F — teff grain French search alias (R96)

Reviewed and integrated on 2026-10-14. Section F and independent human Québec display review remain open.

## Change

Added `graines de teff` as a French alias on the existing `ingredient-ref-teff-grain`, retaining `tef` as its other French alias and `teff d'Abyssinie` as its French display. Kept the separate `ingredient-ref-teff-flour` unchanged. No new identity, form, measure, density, mapping, recipe link, conversion, yield, or substitution was added. Appended the five R96 source records and one accepted alias decision to the existing grain record in `docs/catalog/research-ledger.v1.json`.

The source-based naming evidence has distinct scopes: TERMIUM lists `teff d'Abyssinie` as a normalized term; the CFIA French crop list retains that display; and Yupik's current Montréal-facing French whole-seed listing uses `graines de teff`. The OQLF-hosted GDT still describes `tef` as recommended but non-current. The alias adds an exact product phrase for search without replacing the normalized display or claiming human Québec sign-off.

## Picker and recipe boundary

The static projection follows `IngredientReferenceSearchIndex` complete-phrase matching. `graines de teff` returns only teff grain; `teff` still returns both grain and flour; `tef` and `teff d'Abyssinie` return grain; and `farine de teff` returns flour. The manifest-ordered corpus scan found no teff terms or links across 114 recipes and 1,123 ingredient rows.

Yupik prints a product-specific 1/8 tasse (30 g) portion. It remains a source observation only and was not activated as a generic measure or density.

## Verification

Reference normalization and the bundled package normalization, validation, and generated-index freshness checks passed. The bilingual search projection and ledger-schema validation passed. The updated JSON remains UTF-8 without BOM, with non-ASCII characters escaped. No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data.

See the [R96 source and ownership review](../../proposals/wp03-section-f-teff-grain-quebec-search-terms-review-r96-20261014.md).
