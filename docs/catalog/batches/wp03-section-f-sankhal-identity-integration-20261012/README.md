# WP03 Section F: Sankhal identity integration

Integrated `ingredient-ref-sankhal` as `sankhal (broken millet semolina) / brisures de mil (sankhal)` in `GRAIN_AND_CEREAL`, with French aliases `sanxal` and `sankhal de mil`. English aliases remain empty. The product is sourced as dehulled, crushed, and graded millet semolina; keep intact millet, pearl millet flour, thiéré, thiakry, arraw, and prepared dishes separate.

The active reference has no forms, default density, or unit mappings. The ledger records twelve sources and two source-specific recipe masses: 400 g for the complete 4–6-serving Tabouleh Sankhal recipe, and 300 g for the complete four-serving lakh recipe. These amounts are not per-person measures and do not establish density, household measures, yield, or a conversion. A separate no-supported-substitute finding rejects couscous and rice as replacements because Seneafood's “like couscous or rice” wording is only a preparation analogy without a ratio, tested formula, product-state match, or dish scope. No substitution rule or recipe link was added. The bundled corpus remains unchanged.

## Validation

- Bundled seed-package validation passed; no recipe part or package normalization was needed for this reference/ledger-only change.
- Generated ingredient catalog contains 1,326 references and is current.
- Ingredient-reference normalization check passed.
- Research-ledger JSON Schema validation passed.
- UTF-8 without BOM, final newline, and scoped whitespace checks passed.
- No app, unit, instrumentation, or emulator tests were run because this change only adds database JSON data, as specified in `AGENTS.md`.

See the [boundary review](../../proposals/wp03-section-f-sankhal-product-boundary-review-20261012.md) for the source register and product-scope analysis.
