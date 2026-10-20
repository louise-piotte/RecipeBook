# WP02 Section A7 R640 — emmer-semolina recipe portion

Integrated on 2026-10-18 after root review of the [R640 proposal](../../proposals/wp02-a7-emmer-semolina-recipe-portion-review-r640-20261018.md).

## Ledger update

- Updated the existing `ingredient-ref-emmer-semolina` measurement state to `researched_supported` and recorded one manufacturer-recipe portion: Anson Mills' *Gnocchi alla Romana* lists 1½ cups (8 ounces) of its Ancient Emmer Semolina.
- Kept the publisher's ounce amount unchanged. The recipe does not specify a cup convention, capacity, or filling method, so the observation is limited to this formula and product.
- Left substitution research `not_yet_researched`; active density remains null and unit mappings remain empty. No reference, alias, form, conversion, yield, recipe link, or substitution rule was added.
- The recipe corpus has no matching emmer-semolina ingredient line.

## Sources and validation

- [Anson Mills, Gnocchi alla Romana](https://ansonmills.com/recipes/589) lists the named semolina and the paired amount.
- [Anson Mills, Ancient Emmer Semolina](https://ansonmills.com/products/98) provides the existing product-identity context already held on the ledger row.
- Static seed-package validation passed with `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only`.
- Generated catalog freshness passed with `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` (1,830 references).
- Research-ledger JSON Schema validation passed with zero errors across 2,201 records. Source ID and observation ID ownership checks passed.
- No software tests, build, emulator run, or deployment were needed for this database-JSON-only update under `AGENTS.md`.

WP02 Section A7 remains open.
