# WP04 Section P R568 Pacific halibut steak integration — 2026-10-17

## Integrated decision

Added `ingredient-form-pacific-halibut-steak` under the existing `ingredient-ref-pacific-halibut` identity:

- English: `Pacific halibut steak`
- French: `darne de flétan du Pacifique`
- `formCode` / `prepState`: `steak_cut`
- Match terms: empty; density: null

Metro's English listings support Pacific-halibut steak products, and identify *Hippoglossus stenolepis*. OQLF supports `darne de flétan` as the Québec term for halibut steak, and DFO supports `flétan du Pacifique` for this species. The French label composes those established terms; no paired French Metro route for either English SKU was verified. The form does not claim a universal cut thickness, freshness, skin or bone state, or package quantity.

The form ledger record has `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`. Metro products 235792 and 208135 are separate listings; both selected-store pages showed out of stock and neither supplies a reusable mass. Supermarché PA's species-unspecified `Darne de fletan` entry and its approximately 350 g listing remain proposal-local and are not attached to this form. No measure, density, mapping, conversion, yield, recipe link, or active substitution was added.

## Sources and ledger changes

- Added `WP04-SECTIONP-PACIFIC-HALIBUT-STEAK-R568-20261017-S01` for Metro [Pacific Halibut Steak, product 235792](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/pacific-halibut-steak/p/235792).
- Added `...-S02` for the separate Metro [Fresh Pacific Halibut Steak, product 208135](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/fresh-pacific-halibut-steak/p/208135).
- Reused the existing R545 OQLF `darne` and `darne de flétan` source IDs and the existing DFO English/French Pacific-halibut identity source IDs. No duplicate source records were minted for those URLs.
- Added no reference alias. The picker retains the existing `fish steak` boundary; the species-qualified form gives `halibut steak` and `darne de flétan` both Atlantic and Pacific halibut results.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R568 proposal status and integration note

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — bundled seed package valid.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — package already normalized.
- Research-ledger schema and source-reference validation — 2,173 records, zero errors; 10,057 source entries, 8,494 distinct source IDs, and 7,159 distinct URLs.
- Targeted form ownership and finding/source-reference checks passed; the two new Metro product sources and all reused OQLF/DFO sources resolve on the form record.
- Static picker projections passed for the species-qualified form phrases, `halibut steak`, `darne de flétan`, and `fish steak`.
- UTF-8/no-BOM, ASCII-only canonical database JSON, local-link, final-newline, and scoped whitespace checks passed.
- No app tests, build, emulator run, or deployment were run: this is a database-JSON-only addition under `AGENTS.md`.

WP04 Section P remains open.
