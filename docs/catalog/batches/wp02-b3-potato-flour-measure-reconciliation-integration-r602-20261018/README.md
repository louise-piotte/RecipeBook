# WP02 B3 R602 potato-flour measure reconciliation

- **Status:** Integrated 2026-10-18.
- **Proposal:** [R602 review](../../proposals/wp02-b3-potato-flour-measure-reconciliation-review-r602-20261018.md).
- **Plan anchors:** flour/starch group at [line 3042](../../../RecipeBook-global-ingredient-catalog-plan.txt#L3042) and broader WP02 work at [line 15893](../../../RecipeBook-global-ingredient-catalog-plan.txt#L15921).

## Ledger update

Four source-specific `portion_weight` observations are recorded on `ingredient-ref-potato-flour`:

| Context | Declared amount |
| --- | --- |
| Bob’s Red Mill product Nutrition Facts | 1/4 cup (45 g) |
| King Arthur Ingredient Weight Chart | 1/4 cup (46 g) |
| King Arthur package Rosemary Potato Rolls recipe | 1/4 cup (43 g) |
| King Arthur package Nutrition Facts | 3 tablespoons (30 g) |

The two King Arthur package declarations have different roles: one is a recipe ingredient amount, the other is the Nutrition Facts serving. Neither is substituted for the chart value. The earlier USDA SR28 `1 cup = 160 g` record remains as historical evidence. All values remain source-specific; the generic measurement state is `blocked_pending_evidence`, density remains null, and unit mappings remain empty.

No identity, alias, form, active conversion, recipe link, yield, or substitution rule changed. Existing bounded yeast-bread substitution findings remain as they were.

## Verification

The R602 ledger record, source/observation IDs, package schema, generated catalog, and bundled seed package are checked. No app tests, build, emulator run, or deployment are required for this database-JSON-only evidence update under `AGENTS.md`.
