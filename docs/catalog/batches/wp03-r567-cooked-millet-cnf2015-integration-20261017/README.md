# WP03 Section F R567 cooked millet integration — 2026-10-17

## Integrated decision

Added `millet, cooked / millet, cuit` as `ingredient-form-millet-cooked` under the broad `ingredient-ref-millet`. The CNF 2015 Food Code 4492 page gives that exact bilingual cooked-millet name but no scientific name, so the form remains generic and is not attached to `common millet / millet commun`. No match terms or density were added.

Recorded the three separate CNF 2015 volume portions on the new form ledger record:

- 100 mL = 73.5 g
- 125 mL = 91.9 g
- 250 mL = 183.9 g

Each remains a Food Code 4492 observation for the CNF 2015 edition. The displayed 100 g edible-portion baseline and 0% refuse are excluded. No density, extrapolation, reusable conversion, dry-to-cooked yield, recipe link, or substitution was added. The generic millet reference and substitution states remain unchanged; the new form's substitution research remains unresearched. No CNF 2026 row or value claim is made, and its code-4492 join remains open.

## Sources and ledger changes

- Added `WP03-CNF2015-MILLET-4492-R567-S01` to the new form record: Health Canada, [CNF 2015 Food Code 4492 serving-size page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4492).
- Added observations `millet-cooked-cnf2015-100ml-portion-r567-20261017`, `millet-cooked-cnf2015-125ml-portion-r567-20261017`, and `millet-cooked-cnf2015-250ml-portion-r567-20261017`.
- The existing generic OQLF name source remains on `ingredient-ref-millet`; the existing common-millet identity and dry form were not changed.

## Files updated

- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R567 proposal status and integration note

## Verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — bundled seed package valid.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — package already normalized.
- Research-ledger schema and observation/source-reference validation — 2,173 records, zero errors; 10,057 source entries, 8,494 distinct source IDs, and 7,159 distinct URLs.
- Targeted form ownership and exact 100/125/250 mL observation checks passed; all three observations resolve to the R567 source on the form record.
- UTF-8/no-BOM, ASCII-only canonical database JSON, local-link, final-newline, and scoped whitespace checks passed.
- No app tests, build, emulator run, or deployment were run: this is a database-JSON-only addition under `AGENTS.md`.

WP03 Section F and the CNF 2026 Food Code 4492 row join remain open.
