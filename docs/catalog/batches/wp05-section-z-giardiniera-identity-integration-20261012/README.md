# WP05 Section Z: giardiniera identity integration

Added `ingredient-ref-giardiniera` as `giardiniera / giardiniera` in `SAUCE_AND_CONDIMENT`. The reference has no aliases, forms, default density, or unit mappings. Québec culinary sources and a French Canadian grocery listing use the named product; the reviewed Canadian producer page shows one mixed-vegetable, oil, and vinegar formulation. Italian vinegar-based and Chicago-style oil-containing versions are documented, so no single formula is made canonical. Generic pickled vegetables, antipasto, relish, chutney, piccalilli, and vegetable jardinière preparations remain separate.

The ledger retains five identity and boundary sources, a `researched_no_supported_value` measurement state, and a blocked finding for the local relish/ketchup role analogy. Recipe jar counts, servings, and package volumes do not establish a transferable measure, standard yield, or substitution. No forms, observations, recipe links, or active substitutions were added. A scan of all 114 manifest recipes and 1,123 ingredient rows found no matching giardiniera terms.

## Validation

- Bundled seed-package validation passed.
- Generated ingredient catalog contains 1,327 references and is current.
- Ingredient-reference normalization check passed.
- Research-ledger JSON Schema validation passed.
- Exact search ownership and manifest recipe scans passed; the proposed `giardiniera` query resolves to the new row, while generic mixed-pickle phrases remain unmatched.
- UTF-8 without BOM, final newline, and scoped whitespace checks passed.
- No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data, as specified in `AGENTS.md`.

See the [boundary review](../../proposals/wp05-section-z-giardiniera-identity-review-20261012.md) for the source register and limits.
