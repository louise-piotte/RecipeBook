# WP02 Section 04 B3 high-amylose corn-starch integration (2026-10-15)

## Decision

Added identity-only **high amylose corn starch / amidon de maïs à haute teneur en amylose** as
`ingredient-ref-high-amylose-corn-starch`. The alias arrays contain only Health Canada's paired
class names: English `resistant corn starch` and French `amidon résistant de maïs`. Keep the row
distinct from ordinary cornstarch and modified corn starch. Density is null and unit mappings are
empty; no forms, recipe links, conversions, yields, or active substitution rules were added.

The ledger records six external sources and the University of Guelph commercial-bagel formulation as
one source-specific supported substitution finding. It notes the tested 168 kg HI-MAIZE 260 / 112 kg
hard-wheat-flour formula, 224 kg water, and 28 kg added gluten, with the corresponding control using
280 kg hard-wheat flour and 136.1 kg water. The source's per-bagel resistant-starch measurements are
preserved as study outcomes. None of those quantities is activated as a reusable replacement ratio,
measure, density, conversion, or recipe rule.

Exact qualified English and French names resolve to this row. Broad `corn starch` and
`amidon de maïs` searches return ordinary cornstarch, modified corn starch, and high-amylose corn
starch; `modified corn starch` remains specific to the R92 row. `resistant starch` remains
unassigned. The 114-recipe / 1,123-row bundle has no high-amylose or resistant-corn demand. Existing
ordinary cornstarch remains linked in nine rows across eight recipes.

## Review record

See the [R123 high-amylose corn-starch proposal](../../proposals/wp02-b3-r123-high-amylose-corn-starch-identity-review-20261015.md).

## Verification

- Bundled package and ledger validation passed: `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`.
- Reference ordering check passed: `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`.
- Generated index is current: `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` (1,468 references).
- Bundle remains at 114 recipes and 1,123 ingredient rows; totals are 1,468 references, 105 forms, and 1,809 research-ledger records with 7,469 source entries and 6,347 distinct source IDs.
- No app, Gradle, instrumentation, emulator, or deployment tests were run. Under the updated `AGENTS.md` rule, testing is not needed for changes limited to new database JSON data; the static checks above validate package, ledger, normalization, and generated-index consistency.

Section 04 B3 remains open for other regional starches and product-boundary reviews.
