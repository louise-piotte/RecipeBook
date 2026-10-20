# WP02/WP03/WP04 R141 gap review integration — 2026-10-15

## Integrated decisions

- **WP02 Section 04 B3:** Added identity-only `lentil starch / amidon de lentille` as `FLOUR_AND_STARCH`, separate from whole lentils, lentil flour, and starch-rich lentil flour. The French display is descriptive and provisional. Added no aliases, forms, measurement observations, recipe links, conversions, yields, or substitutions. The live research-ledger record includes the seven reviewed source IDs, an accepted identity decision, and unresolved measurement and substitution decisions.
- **WP03 Section L:** Added fresh-market `Padrón pepper / piment de Padrón` with the English alias `Padron peppers` and one `fresh` form. Québec grower wording supports the local French crop name, not an official terminology claim. Species, cultivar, origin, and fixed heat remain unspecified. The Shishito alternative is retained as a source-scoped finding for one blistered-pepper recipe; no active substitution or reusable quantity was added.
- **WP04 Section P:** Held *Argopecten gibbus* / Calico scallop outside active references and the ledger. CFIA applies `Pétoncle Calicot` and `Peigne Baie De L'Atlantique` across *A. gibbus* and the already represented bay scallop, *A. irradians*; it also lists *A. ventricosus* as `Pacific Calico Scallop`. An *A. gibbus*-only row would make broad `calico` searches misleading singletons. Reopen after picker coverage can represent the calico species and shared French names without hiding taxa.

No candidate phrase was found in the bundled ingredient rows. The hold adds no catalog or ledger data.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` and `--validate-only` passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` passed.
- Research-ledger schema validation passed with zero errors. The two R141 references and ledger records and the fresh form each have one live owner; all 13 new source IDs are distinct and previously unused.
- Static picker projection confirmed named lentil-starch and Padrón searches each resolve to one row, plural whole-lentil searches are unchanged, broad pepper searches remain multi-result, and `piments` stays empty. Calico projection confirms a single *A. gibbus* row would create the documented singleton risk.
- The 114 manifest-listed recipes and 1,123 ingredient rows contain no matches for lentil starch, Padrón/Padron, or Calico scallop terms.
- Bundled JSON remains valid UTF-8 without BOM and stores accents as ASCII escapes. Local proposal links and scoped whitespace checks passed.

The package contains **1,498 references**, **115 forms**, and **1,843 ledger records** with **7,740 source entries / 6,596 distinct source IDs**. The recipe bundle remains **114 recipes / 1,123 ingredient rows**.

No app, Gradle, unit, instrumentation, emulator, or deployment tests were run. The catalog changes only add database JSON data and refresh the generated reference index; the Calico scallop decision is documentation-only, per the repository's JSON-only no-testing rule.

## Proposals

- [WP02 lentil-starch review](../../proposals/wp02-section-04-next-starch-gap-review-r141-20261015.md)
- [WP03 Padrón pepper review](../../proposals/wp03-section-l-padron-pepper-identity-review-r141-20261015.md)
- [WP04 Calico scallop review](../../proposals/wp04-section-p-calico-scallop-species-picker-review-r141-20261015.md)
