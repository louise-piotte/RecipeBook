# WP04 Section P beaked redfish identity — R73 integration

## Decision

Added identity-only `ingredient-ref-beaked-redfish` for *Sebastes mentella*, displayed as `Beaked redfish / sébaste atlantique` in `PROTEIN`. Both alias arrays remain empty. TERMIUM recommends the English trade name and standardizes the French commercial name; Québec species and product pages support local naming context.

The new species row stays distinct from `Québec redfish / sébaste du Québec`, the broader local market group, and R72's `Acadian redfish / sébaste acadien` for *S. fasciatus*. Broad `redfish` and `sébaste` searches can show all three rows together. Alternate names and product-specific terminology were not made aliases.

The Metro item and Health Canada CNF codes remain source-scoped. No form, recipe link, density, mapping, conversion, yield, or substitution was added.

## Data changes

- Added one active reference and its accepted identity ledger record with five new sources.
- Kept alias arrays empty and numeric fields null/empty.
- Refreshed the generated bundled ingredient catalog from the canonical reference JSON.

No app tests or emulator checks were run because this integration only adds database JSON data. Static validation covered package normalization, ledger structure, source IDs, generated-index freshness, encoding, local links, and whitespace. See the [proposal](../../proposals/wp04-section-p-next-open-seafood-boundary-review-20261013-r73.md) and the [global plan](../../../RecipeBook-global-ingredient-catalog-plan.txt#L4201).
