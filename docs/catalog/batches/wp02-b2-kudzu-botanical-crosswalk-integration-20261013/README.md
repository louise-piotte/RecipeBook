# WP02 B2 kudzu botanical crosswalk — R73 integration

## Decision

Added four sources and one accepted, narrowly scoped decision to the existing `ingredient-ref-kudzu-starch` record in `docs/catalog/research-ledger.v1.json`. The decision maps the scientific name *Pueraria lobata* used by MEXT food-table item 02029 to Kew's accepted *Pueraria montana* var. *lobata*.

The shared reference remains `kudzu starch / kouzou`, with its current aliases and numeric fields unchanged. Its ledger identity state remains `needs_clarification`: this item-specific crosswalk does not resolve the botanical source of the broader commercial class. No scientific names were added as picker terms, and no form, measurement, mapping, conversion, yield, recipe link, or substitution was added.

The Government of Québec flora page identifies the plant as *Pueraria montana* and states that sale of the plant and cultivation for propagation are prohibited in Québec. That plant-level regulatory note does not make a claim about finished extracted starch.

## Data changes

- Added Kew var. *lobata*, Kew *P. montana*, MEXT item 02029, and Québec flora-page sources to the existing ledger record.
- Added an accepted decision scoped to the MEXT item; kept the existing measurement and substitution states and prior decisions.
- No active catalog JSON or generated index changed.

No app tests or emulator checks were run; this integration only adds research data to database JSON. Static validation covered the package, ledger schema, source IDs, encoding, local links, and whitespace. See the [proposal](../../proposals/wp02-b2-kudzu-starch-botanical-scope-review-20261013-r73.md) and the [global plan](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14028).
