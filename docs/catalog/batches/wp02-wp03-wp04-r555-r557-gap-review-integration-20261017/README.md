# WP02 / WP03 / WP04 R555–R557 integration — 2026-10-17

Root reviewed and integrated three bounded reviews. WP02 Section A, WP03 Section F, and WP04 Section P remain open.

## R555 — Medium rye flour

Completed bounded measurement and general wheat-replacement research on the existing `ingredient-ref-medium-rye-flour` ledger row. Recorded USDA SR28 NDB 20064, `Rye flour, medium`, one cup = 102 g as a historical source-specific published portion. The source does not state cup volume or filling method and does not define an identity-wide conversion. Recorded an evidence-only no-general-home-replacement finding while preserving Angioloni and Collar’s 20:20:20:40 oat/rye/buckwheat/wheat blend only for its tested breadmaking context. No density, mapping, form, yield, recipe link, or active substitution was added. The identity, names, and aliases are unchanged. Sources: [USDA SR28 Food Group 20](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg20.pdf), [Angioloni and Collar](https://pubmed.ncbi.nlm.nih.gov/21337578/), and [Health Canada reference amounts, C.6](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html).

## R556 — Cooked pearl barley, Food Code 4486

Added six edition-specific `portion_weight` observations to the existing `ingredient-form-pearl-barley-cooked` ledger row:

- CNF 2015: 100/125/250 mL = 66.4/82.9/165.9 g.
- CNF 2026: 100/125/250 mL = 66.357/82.946/165.892 g.

The 2015 portions cite the existing bilingual [CNF 2015 code 4486 page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4486). The four code-specific CNF 2026 CSV records identify the food row, conversion rows, measure labels, and measure types. The 140 g mass-only and refuse rows remain excluded; the type-9 `100 ml dry` Yield row remains uninterpreted, with the English/French API requests returning empty arrays. No density, extrapolation, dry-to-cooked yield, conversion, recipe amount, or substitution was added. The dry Food Code 4411 record is unchanged.

## R557 — Swordfish steak picker-boundary hold

Accepted a documentation-only hold for `ingredient-form-swordfish-steak`. The proposed label `swordfish steak / darne d’espadon` would make the current picker’s substring fallback return Swordfish alone for broad `fish steak`, while omitting the existing Atlantic-halibut-steak result. The manifest-listed recipe corpus has no swordfish-steak demand. Keep the form ID and new Metro product/recipe source IDs proposal-local; no reference, form, ledger record, recipe link, measurement, or substitution was added.

Metro product 241275 indexes the English/French value-pack pair and an approximately 200 g average item mass, but both routes are in frozen-category paths without an explicit frozen state in the title/details; the listing was out of stock in the selected store and direct opens returned 403. Keep state and mass SKU-specific. Product 225926 is a separate, explicitly frozen listing whose search-index crawl was about two months old; treat it as stale corroboration and do not merge its title or sourcing into 241275. Metro’s older recipe’s 450 g steaks are recipe-specific and do not establish a standard steak weight. See [product 241275](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/swordfish-steak/p/241275), [product 225926](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-swordfish-steak/p/225926), and the [Metro swordfish recipe](https://www.metro.ca/en/recipes-occasions/recipes/grilled-swordfish-with-melon-salsa).

## Shared files and static checks

- Updated `docs/catalog/research-ledger.v1.json` for R555 and R556 only. No bundled seed JSON, application code, recipes, active reference/form JSON, package-yield data, or substitution-rule data changed.
- Marked R555, R556, and R557 integrated and added checked children under their still-open plan parents. Updated `roadmap.md` and this README.
- `validate_research_ledger()` accepted **2,169 records** with **0 schema/source errors**. The R555 observation and finding cite sources attached to their record; all six R556 observations cite record-local sources. The ledger contains **10,026 source entries**, **8,471 distinct source IDs**, and **7,146 distinct source URLs**.
- Targeted checks confirmed the 102 g medium-rye observation, the R555 no-general-substitution state, the six exact CNF portions, UTF-8 without BOM, and final newlines. R557’s form ID and product source IDs remain proposal-local.
- No app tests, build, emulator check, or deployment were run. R555/R556 only add evidence to database JSON plus documentation, for which `AGENTS.md` says testing is not needed; R557 is documentation-only.
