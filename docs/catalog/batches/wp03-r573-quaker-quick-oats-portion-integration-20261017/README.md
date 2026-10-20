# WP03 Section F R573 — Quaker quick-oats portion integration

Date: 2026-10-17

## Decision

Recorded Quaker Canada's bilingual 1/3-cup (30 g) serving as one branded portion observation on the existing `ingredient-ref-quick-oats` ledger row. The current English product page declares `Per 1/3 Cup (30 g)` and lists 100% rolled oats. The French narrative gives `1/3 de tasse (30 g)` and identifies oat flakes; its Nutrition Facts heading has a typo (`1/3 coup`), so the observation relies on the French narrative and English Nutrition Facts table. CFIA guidance establishes that serving sizes for foods requiring preparation are listed for the food as sold, with a prepared serving optional.

Health Canada's CNF 2015 Food Code 1439 page is retained as historical corroboration. Its `amount to make 175ml cooked` row remains uninterpreted and does not become an app yield. No claim is made about Food Code 1439's rows in CNF 2026 because those CSV contents were not accessible during review.

The observation remains Quaker-specific. No generic quick-oats cup weight, density, active unit mapping, form, conversion, cooking yield, recipe link, recipe edit, or substitution was added. The bundled recipe quantities (`024#6`, 175 g; `047#4`, 1 1/2 cups) remain unchanged. The existing identity, aliases, measurement state, and unresearched substitution state remain unchanged.

## Sources

- [Quaker Canada, Quick Oats](https://www.tastyrewards.com/en-ca/brands/quaker/products/quick-quakerr-oats): English product title, 1/3-cup (30 g) serving, and ingredients.
- [Quaker Canada, Gruau Quaker Rapide](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/gruau-quakerr-rapide): French narrative serving and ingredient wording; product title was not added as a picker alias.
- [Health Canada, CNF 2015 Food Code 1439](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1439&wbdisable=true): historical dry Quaker quick-oats entry and serving sizes.
- [CFIA, Information within the Nutrition Facts table](https://inspection.canada.ca/en/food-labels/labelling/industry/nutrition-labelling/nutrition-facts-table?wbdisable=false): serving-size rule for foods requiring preparation.

## Files updated

- `docs/catalog/research-ledger.v1.json`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R573 proposal and this integration README

## Verification

- Static seed-package validation and normalization checks passed.
- Research-ledger schema and source-reference validation passed; targeted checks confirmed the branded observation and unchanged recipes, active reference, and form data.
- UTF-8/no-BOM, local-link, final-newline, and scoped whitespace checks passed.
- No software tests, app build, emulator run, or deployment were run for this database-JSON-only update under `AGENTS.md`.

WP03 Section F and the CNF 2026 Food Code 1439 join remain open. See the [R573 proposal](../../proposals/wp03-section-f-next-gap-review-r573-20261017.md).
