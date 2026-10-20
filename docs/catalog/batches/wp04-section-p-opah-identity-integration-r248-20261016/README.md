# WP04 Section P opah identity integration (R248)

Integrated the [R248 proposal](../../proposals/wp04-section-p-residual-seafood-gap-review-r248-20261016.md) as an identity-only, species-neutral market name.

## Catalog decision

- Added `ingredient-ref-opah`, with English and Québec French display `opah`, category `PROTEIN`.
- Kept both alias lists empty. CFIA assigns `moonfish` to several taxa, while OQLF assigns `poisson-lune` to *Mola mola* despite Metro using that phrase for opah.
- Added no form, density, unit mapping, package amount, recipe link, conversion, yield, or substitution.
- Recorded the CFIA, Metro Québec, Seafood Depot, NOAA Fisheries, OQLF, and 2018 taxonomic-review evidence in the research ledger. Supplier presentations and NOAA's 4 oz raw nutrition serving remain source-specific observations.
- The bundled recipe corpus has no opah-related ingredient rows.

The canonical bundle now has 1,640 references, 124 forms, and 1,987 research-ledger records. Section P remains open.

## Static verification

- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed.
- Research-ledger schema, source-ID uniqueness, package ownership, exact English/French picker projection, recipe occurrence, UTF-8/no-BOM, and `git diff --check` checks — passed.
- No software tests or emulator checks were run because the change only adds database JSON data, as directed in `AGENTS.md`.
