# R462 — Spelt groats alias integration

Added only the English alias **`spelt groats`** to the existing `ingredient-ref-spelt-berries` row (`spelt berries / grains d’épeautre`). Oak Manor Organic’s Ontario product page titles its item `Organic Spelt Groats (Kernels)` and explicitly describes groats as hulled spelt kernels that may be cooked whole. The Québec display remains unchanged.

Kept the row separate from spelt grits, meal, semolina, flour, and flakes. Generic `groats` and `groat` searches each gain the spelt-berries result; broad `spelt` and exact French-display searches retain their previous results. The complete bundle has no matching recipe demand.

Added three sources and an accepted alias decision to the existing spelt-berries research record. Added no ingredient row, French alias, form, density, unit mapping, measure, conversion, yield, recipe link, or substitution.

Static package normalization, generated-index freshness, ledger-schema validation, source ownership, picker projection, recipe-corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No app or Android tests were run for this database-JSON addition under `AGENTS.md`.

R462 integration snapshot, after R459 and before R464 integration: 1,747 references / 141 forms; 2,106 ledger records / 9,591 source entries / 8,138 distinct source IDs / 6,851 distinct source URLs; 114 recipes / 1,123 ingredient rows.

See the [R462 proposal](../../proposals/wp02-section-a7-next-milling-gap-review-r462-20261017.md). The broader Section A7 checklist remains open.
