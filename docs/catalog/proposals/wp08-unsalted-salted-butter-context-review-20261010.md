# WP08 unsalted-to-salted butter context review — 2026-10-10

**Status:** Integrated as one directional, source-bounded ledger finding; no runtime rule.

## Recommendation

For a King Arthur recipe that calls for unsalted butter, the source supports using salted butter in
the recipe amount and reducing the added recipe salt by 1/4 teaspoon for each 8 tablespoons of
butter used. This is directional guidance for the source's recipe context, not a general composition
equivalence or a verified product-level salt conversion.

Record the finding under `ingredient-ref-unsalted-butter`, with `ingredient-ref-salted-butter` as the
replacement. Keep it in the research ledger only. The active substitution model cannot represent the
required salt adjustment alongside the butter replacement, and the source does not establish the
salt content of every salted-butter product. Do not add a runtime rule, infer salted-to-unsalted in
reverse, or generalize to other dairy fats.

## Repository and recipe context

- Both butter identities already exist as separate `FAT_AND_OIL` references. Neither has an active
  density or unit mapping.
- The canonical substitution and contextual-substitution rule parts are empty. The existing
  `existing_rule_needs_review` state was therefore a stale research state, not evidence of an active
  butter substitution rule.
- The manifest-listed corpus has 68 lines linked to unsalted butter and 3 linked to salted butter.
  This review does not relink or alter those lines.

## Finding

| Field | Accepted scope |
|---|---|
| Direction | Recipe calls for unsalted butter → use salted butter in the recipe's butter amount. |
| Explicit adjustment | Reduce added salt by 1/4 teaspoon per 8 tablespoons of butter used, as King Arthur directs. |
| Amount basis | Preserve the recipe's stated butter amount; King Arthur supplies the salt adjustment in tablespoons, not a butter mass conversion. |
| Context | Recipes following King Arthur's test-kitchen standards; the guide's default butter is unsalted American-style butter. |
| Effects and limits | Salted butter contributes salt; reduce the separately added salt as directed. Product salt levels vary and are not quantified in the guide. Do not reverse the recommendation or extend it to other recipe contexts without evidence. |
| Runtime | None. The current substitution rule cannot carry the companion salt adjustment or product-specific salt uncertainty. |

## Source

| ID | Source | Supports |
|---|---|---|
| `WP08-BUTTER-SALT-20261010-S01` | King Arthur Baking, [Recipe Success Guide](https://www.kingarthurbaking.com/recipes/resources/recipe-success-guide) | Its ingredient standard names unsalted American-style butter as the default; its salted/unsalted note directs reducing recipe-added salt by 1/4 teaspoon per 8 tablespoons of butter when using salted butter in a recipe that calls for unsalted. It does not state a universal salt concentration for products. |

## Acceptance checks

- The ledger finding is attached to the unsalted-butter source identity and names only the salted
  butter replacement.
- The finding is directional and includes the recipe salt adjustment; no reverse or transitive
  substitution is created.
- No runtime rules, recipe links, density, or unit mapping are changed.
- Package/ledger validation passes.

