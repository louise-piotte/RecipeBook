# WP02/WP03/WP04 R142 gap review integration — 2026-10-15

## Integrated decisions

- **WP02 Section 04 B3:** Held isolated foxtail-millet starch (*Setaria italica*) outside active
  references and the research ledger. The studies reviewed describe isolated laboratory fractions;
  current Canadian listings reviewed identify whole grain, flour, or rava, and no product-specific
  Québec French starch name was established. The parent remains open.
- **WP03 Section L:** Added fresh-market `Hungarian wax pepper / piment fort hongrois`, with the
  source-qualified English plural aliases `Hungarian wax peppers` and `Hungarian wax chili peppers`,
  and one `fresh` form. French aliases remain empty: CFIA's `Piment hongrois` is a retail product-
  type label in a fresh-hot-pepper report, not a cultivar identification, and the bare phrase could
  make a future sweet Hungarian/banana-pepper query look resolved to this hot identity. Kept the
  AP/Milk Street banana-or-wax option as a recipe-scoped ledger finding; added no reusable measure,
  density, mapping, conversion, yield, or active substitution.
- **WP04 Section P:** Held Pacific calico scallop, *Argopecten ventricosus*, outside the active
  picker and ledger. An *A. ventricosus*-only row would make broad `calico` and `calico scallop`
  searches misleading singletons while *A. gibbus* remains unrepresented. FAO supports the French
  name `pétoncle volant` internationally, but no Québec product name or species-specific Canadian
  product listing was found.

The bundled recipe scan found no matching ingredient rows for these candidates. Only the Hungarian
wax reference, fresh form, and ledger record were added; the two holds add no catalog or ledger data.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` and `--validate-only`
  passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed with
  1,499 generated references.
- Research-ledger JSON Schema validation passed. The new ledger record has eight distinct source IDs,
  each previously unused.
- Static picker projection matched the proposal: source-qualified English phrases and
  `piment fort hongrois` resolve to the new row; bare `piment hongrois` remains at zero; broad
  `pepper`, `peppers`, and `piment` results remain multi-result.
- The manifest scan covered 114 recipes / 1,123 ingredient rows and found zero candidate ingredient
  hits.
- All 126 bundled-package and ledger JSON files parse as valid UTF-8 without a BOM and use ASCII-
  escaped text. Local links in the three proposals resolve, and their text has no mojibake markers.
- No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. The only catalog
  data change adds database JSON data and regenerates its index, covered by the project's
  JSON-only no-testing rule.

The package contains **1,499 references**, **116 forms**, and **1,844 research-ledger records** with
**7,748 source entries / 6,604 distinct source IDs**. The bundled recipe library remains
**114 recipes / 1,123 ingredient rows**. Sections 04 B3, L, and P remain open.

## Proposals

- [WP02 foxtail-millet starch product-boundary hold](../../proposals/wp02-section-04-next-starch-gap-review-r142-20261015.md)
- [WP03 Hungarian wax pepper fresh-market review](../../proposals/wp03-section-l-next-fresh-pepper-review-r142-20261015.md)
- [WP04 Pacific calico scallop identity and product-boundary hold](../../proposals/wp04-section-p-next-identity-gap-review-r142-20261015.md)
