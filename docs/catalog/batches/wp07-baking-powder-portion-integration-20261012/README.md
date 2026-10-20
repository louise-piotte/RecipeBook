# WP07 baking-powder portion evidence integration

Recorded King Arthur Baking's published **1 teaspoon = 1/8 ounce = 4 g** baking-powder chart entry as one `portion_weight` observation on the existing `ingredient-ref-baking-powder` ledger record. The chart does not name a brand or formulation, teaspoon volume convention, or fill method, so the value remains source-specific.

The ledger measurement state remains `blocked_pending_evidence`; the active reference still has `defaultDensity: null` and no unit mappings. No recipe line changed. In particular, the separate 5 g baking-powder ingredient line does not provide a teaspoon pairing or establish a conversion.

The current package contains 1,613 ledger records with zero ledger validation errors. UTF-8/no-BOM and scoped whitespace checks passed. No app tests or emulator checks were run because this update only adds database JSON data under `AGENTS.md`.

Sources: [proposal and recipe audit](../../proposals/wp07-baking-powder-portion-evidence-review-20261012.md), [King Arthur Baking Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), [CFIA baking-powder standard](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0).
