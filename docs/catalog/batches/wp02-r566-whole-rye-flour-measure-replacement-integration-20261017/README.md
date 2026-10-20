# WP02 A4 R566 whole rye flour evidence integration — 2026-10-17

## Integrated decisions

Added `whole grain rye flour` as a search-only English alias of the existing `ingredient-ref-whole-rye-flour`, based on Anita's manufacturer product title. The existing French display and alias remain unchanged. Whole rye flour remains separate from rye meal, pumpernickel, and the open light, medium, and dark rye grade questions.

Recorded one named-product Nutrition Facts serving for Anita's Organic Mill Whole Grain Rye Flour, 1 kg: **1/4 cup = 30 g**. Loblaws item `21384443_EA` and Voilà item `473008EA` both transcribe that serving. The observation stays product-specific; the two pages may share product-feed data, no physical package was inspected, and neither page states a fill or leveling method. It is not a generic rye-flour cup-weight conversion or an independently measured mass.

Recorded an evidence-only finding that no reusable whole-rye-for-wheat replacement amount is supported across home-recipe types and roles. The publisher abstract's 60% replacement result is limited to its enriched-wheat-bread experiment; no percentage or process adjustment was added as a recipe rule. No French alias, product form, density, unit mapping, cup conversion, yield, recipe link, or active substitution was added.

## Sources and ledger changes

- R566 adds four sources to the existing whole-rye-flour record:
  - `WP02-A4-WRF-MEAS-SUB-R566-20261017-S01` — Anita's Organic Mill / Nature's Path, [Whole Grain Rye Flour](https://naturespath.com/en-ca/products/whole-grain-rye-flour-aom-ca), supporting the exact English product-title alias and qualitative baking-use scope.
  - `...-S02` — Loblaws, [Anita's Organic Mill Organic Whole Grain Rye Flour, 1 kg](https://www.loblaws.ca/en/farine-de-seigle-grains-entiers/p/21384443_EA?source=nspt), item `21384443_EA`, transcribing the product serving.
  - `...-S03` — Voilà, [Anita's Organic Mill Rye Flour Whole Grain, 1 kg](https://voila.ca/products/anita-s-organic-mill-rye-flour-whole-grain-1-kg/473008EA), item `473008EA`, also transcribing the serving.
  - `...-S04` — Koletta et al., [publisher abstract](https://www.sciencedirect.com/science/article/abs/pii/S073352101400160X), DOI `10.1016/j.jcs.2014.08.003`, supporting only the formula-specific 60% enriched-bread result.
- Added observation `whole-rye-flour-anitas-label-portion-r566-20261017` with `evidenceKind: published_portion`; its source IDs are the two retailer listings only.
- Added finding `whole-rye-flour-no-general-wheat-replacement-r566-20261017`; its source IDs are the manufacturer product page and study abstract.
- Added one accepted decision to the existing record. No ingredient-reference row or other ledger record was created.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R566 proposal status and integration note

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — bundled seed package valid.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — package already normalized.
- Research-ledger schema and source-reference validation — 2,171 records, zero errors; 10,054 source entries, 8,491 distinct source IDs, and 7,156 distinct URLs.
- Targeted alias ownership and observation/source-reference checks passed; the new English alias has exactly one active owner, and both evidence items resolve to sources on the target ledger record.
- UTF-8/no-BOM, ASCII-only canonical database JSON, local-link, final-newline, and scoped whitespace checks passed.
- No app tests, build, emulator run, or deployment were run: this integration adds database JSON evidence and documentation only, under the JSON-only testing rule in `AGENTS.md`.

WP02 Section A4 remains open.
