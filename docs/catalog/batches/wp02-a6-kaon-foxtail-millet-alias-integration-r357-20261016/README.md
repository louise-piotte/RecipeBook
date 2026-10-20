# WP02 A6 R357 — Kaon foxtail-millet grain alias

## Integrated change

Added `kaon` to the English-search aliases on the existing `ingredient-ref-foxtail-millet` grain row. The existing display remains `foxtail millet / millet d'Italie`. No new identity or French alias was added. The separate flour identity is unchanged; `kaon flour`, `kaon atta`, and other flour-qualified phrases remain unassigned under the earlier boundary review.

## Evidence and limits

ICAR–Indian Institute of Millets Research lists Bengali `Kaon` in its Foxtail Millet language row. Its 2025 foxtail-millet leaflet identifies the crop as *Setaria italica* and independently lists `Kaon (Bengali)`. The existing OQLF source continues to support the unchanged Québec French display `millet d'Italie`. These sources establish a grain-name mapping; they do not establish a foxtail-flour name, measure, conversion, yield, or substitution.

The research ledger reuses existing IIMR source IDs and records the accepted grain alias on the existing reference record. No new source URL or source ID was allocated.

## Picker and recipe impact

The live picker projection returns only `ingredient-ref-foxtail-millet` for `kaon`. Queries `kaon flour` and `kaon atta` return no result. Existing `foxtail millet` and `millet d'Italie` queries still return the grain and flour pair. No form hint is created.

The manifest-listed bundle has 114 recipes and 1,123 ingredient rows. No recipe file or ingredient row contains `kaon`; no recipe link, ingredient text, or quantity changed.

No form, measure, density, unit mapping, conversion, yield, or substitution was added. Existing measurement and substitution research states remain unchanged.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed; generated index contains 1,693 references.
- `validate_research_ledger()` — passed with zero validation errors; the ledger has 2,049 records.
- Static picker projection returned only the foxtail-millet grain for `kaon`; the two flour-qualified queries returned no result; existing broad grain/flour queries remained paired.
- Recipe corpus scan — 114 recipes / 1,123 ingredient rows; zero `kaon` file hits.
- Updated JSON files decode as UTF-8 without BOM. No software tests were run because this change only adds database JSON data under `AGENTS.md`.
