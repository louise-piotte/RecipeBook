# R617 — Farm Girl Rainbow Hoops cereal

Added identity-only `Farm Girl Rainbow Hoops cereal / Céréales anneaux arc-en-ciel Farm Girl` as `ingredient-ref-farm-girl-rainbow-hoops-cereal` in `GRAIN_AND_CEREAL`.

The French search alias is brand-qualified as `Cerceaux arc-en-ciel Farm Girl`. Search for the shorter `Cerceaux arc-en-ciel` phrase still finds the row because it is a phrase prefix, but the unqualified descriptor is not stored as an alias. The 2025 Purity Life order form ties the French wording and UPC `628678617544` to its FARM GIRL section; Metro’s Québec listing identifies the same 280 g SKU but returned HTTP 403 on direct retrieval.

Farm Girl’s current product page declares `1 cup (40 g)`. It does not show a UPC, so the ledger keeps that as a manufacturer-page-only portion observation and does not crosswalk it to the 280 g retailer SKU. The manufacturer and retailer ingredient declarations differ, so no fixed formula is asserted. The bundled recipe corpus has no matching row. No reusable measure, density, unit mapping, form, conversion, recipe link, package yield, or substitution was added.

Static checks passed:

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`
- Picker projection for exact, broad, and competitor queries; ownership and recipe-corpus scan; source-ID/URL uniqueness; UTF-8/no-BOM; local links; scoped whitespace.

No software tests, builds, emulator checks, or deployment were run. The shared change only adds database JSON data and catalog documentation, which is exempt from testing by `AGENTS.md`.

The source review and detailed evidence limits are in the [R617 proposal](../../proposals/wp03-section-f-farm-girl-rainbow-hoops-identity-review-r617-20261018.md).
