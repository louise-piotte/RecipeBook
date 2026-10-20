# WP02/WP03/WP04 R710–R712 integration — 2026-10-18

Integrated three reviewed gap proposals across flour measurement evidence, grain aliases, and fish terminology.

## Decisions

- **R710 — durum-flour portions:** Added two `portion_weight` observations to the existing `ingredient-ref-durum-flour` ledger row: King Arthur Baking's Durum Flour SKU 100243 at 1 cup = 124 g, and Janie's Mill Organic Durum Flour at 1 cup = 129.5 g. The chart values remain separate and product-specific. Janie's Mill describes a light-fill method; King Arthur does not state a row-specific method, and neither chart states cup capacity. No generic density, mapping, conversion, form, recipe link, package yield, or substitution was added. The chart's shared `WP07-KAB-IWC` source ID was reused on the target row. See the [R710 proposal](../../proposals/wp02-a7-next-open-gap-review-r710-20261018.md).
- **R711 — broken rice:** Added only romanized Hindi `tukda chawal` to `ingredient-ref-broken-rice.aliasesEn`. Organic Mandya directly identifies the phrase for broken rice; the indexed Sports Authority of India “Rice Tukda” procurement line is corroboration only, with no product specification. No bare `tukda`, reordered phrase, French alias, form, or recipe link was added. See the [R711 proposal](../../proposals/wp03-section-f-next-open-gap-review-r711-20261018.md).
- **R712 — scrod boundary:** Added only `scrod cod` to Atlantic cod and `scrod haddock` to Haddock as English search aliases. Bare `scrod` remains unassigned so the picker can show both qualified results; `schrod` remains excluded based on one seller listing. Canonical names and French aliases were not changed. FDA marks the qualified names as vernacular cross-references and generally unsuitable for U.S. interstate product labeling; the catalog aliases are search terms, not product-label guidance. See the [R712 proposal](../../proposals/wp04-section-p-next-open-gap-review-r712-20261018.md).

## Package state

- 1,841 ingredient references, 174 forms, 114 recipes, and 1,123 ingredient rows.
- 2,224 research-ledger records, 10,433 source entries, 8,802 distinct source IDs, and 7,451 distinct source URLs.
- No recipe rows, active conversions, substitutions, or forms changed.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — valid.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated index current at 1,841 references.
- Ledger source IDs map consistently to one URL; all R710 observation source IDs are attached to the durum-flour row.
- Picker projection from `IngredientSearch.kt`: `tukda chawal` and `tukda` return broken rice; `chawal` returns generic rice and broken rice; reversed `rice tukda` / `tukda rice` remain empty. `scrod` returns Atlantic cod and Haddock; `scrod cod` and `scrod haddock` select their respective references; `schrod` remains empty; generic `cod` and `haddock` projections are unchanged.
- The 114-recipe / 1,123-row corpus contains no R710–R712 candidate-term matches or links to the affected references.
- UTF-8/no-BOM, escaped non-ASCII in bundled JSON, local Markdown links, and scoped whitespace checks passed.

No software tests, build, emulator run, or deployment were performed; the active application and research updates only add database JSON data under `AGENTS.md`. Sections A7, F, and P remain open.
