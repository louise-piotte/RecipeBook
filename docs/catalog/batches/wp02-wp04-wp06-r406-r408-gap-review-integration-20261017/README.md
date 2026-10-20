# WP02 A7 R406 / WP04 Section P R407 / WP06 Europe R408 integration

Integrated on 2026-10-17. The three reviewed proposals are [R406](../../proposals/wp02-section-a7-next-milling-gap-review-r406-20261017.md), [R407](../../proposals/wp04-section-p-next-seafood-gap-review-r407-20261017.md), and [R408](../../proposals/wp06-europe-next-regional-identity-review-r408-20261017.md).

## Decisions

- **R406 — unqualified wheat meal:** keep `wheat meal` and `wheatmeal` unallocated. Retain `ingredient-ref-wheat-meal` only for the whole-wheat-qualified identity and existing French alias. The source refresh did not establish one generic consumer milling boundary or a Québec French name. No catalog or ledger data changed.
- **R407 — salmon roe:** promote the existing `candidate-salmon-roe` ledger record in place to verified `ingredient-ref-salmon-roe`, and add identity-only `salmon roe / œufs de saumon` in `PROTEIN`, with only `salmon caviar` and `caviar de saumon` as qualified aliases. Keep `ikura` product-specific; preserve the separate trout, cod, bottarga, milt, and caviar boundaries. The broad `roe` query now returns bottarga, milt, trout roe, and salmon roe; `caviar` still returns finger lime and trout roe and gains salmon roe through its qualified alias. Add no forms, measurement observations, recipe links, conversions, yields, or substitutions. Measurement remains `researched_no_supported_value`; substitution research remains `researched_no_supported_substitute`.
- **R408 — Espelette pepper powder:** add identity-only `piment d'Espelette moulu / Espelette pepper powder` in `BAKING_AND_SPICE`, with empty aliases, null density, and no mappings. Keep the row to the powder presentation and Basque PDO boundary; do not include Québec-grown Gorria, fresh peppers, strings, or prepared products. Metro's recipe has one pinch in each of two components, but publishes no mass or volume equivalent. Preserve those quantities in source evidence only: recording `1 pinch` as a `portion_weight` would mislabel the source quantity, and no numeric mass/volume result is supported. Keep measurement at `researched_no_supported_value` and substitution research at `not_yet_researched`; the Metro cayenne wording remains recipe-specific.

The complete manifest scan found no matching recipe files or ingredient rows for these reviews: 114 recipe files and 1,123 structured ingredient rows. No recipe links were added. The plan and roadmap now record the three dispositions; A7, Section P, and Europe-wide coverage remain open.

## Static validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — bundled seed package valid.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — references normalized.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog current at 1,714 references.
- `docs/catalog/research-ledger.v1.json` validates against `research-ledger.schema.json` with 2,073 records and zero schema errors.
- Source ownership and decision references were checked; the two new ledger records have no missing local decision sources.
- Picker projection follows `IngredientSearch.kt`: `wheat meal` returns only the whole-wheat row and `wheatmeal` returns none; `roe` returns four roe identities; `caviar` returns finger lime, trout roe, and salmon roe; the salmon-roe qualified phrases and the four Espelette powder phrases return their intended rows; `ikura` and `Piment Gorria` remain unmatched.
- Manifest scan: 114 recipe files, 1,123 ingredient rows, zero matches for the reviewed terms.
- UTF-8/no-BOM, escaped-Unicode seed JSON, local links, and scoped whitespace checks passed.
- Totals: 1,714 references, 141 forms, 2,073 ledger records, 9,384 source entries, 7,947 distinct source IDs, and 6,665 distinct source URLs.

No software tests, builds, instrumentation, emulator checks, or deployment were run. The active data changes add database JSON data, so the JSON-only exception in `AGENTS.md` applies.
