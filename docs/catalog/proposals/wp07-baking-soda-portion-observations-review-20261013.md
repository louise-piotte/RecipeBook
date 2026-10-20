# WP07 baking-soda portion observations

**Review date:** 2026-10-13  
**Status:** Integrated as two source-specific `portion_weight` observations on `ingredient-ref-baking-soda`. See the [integration record](../batches/wp07-baking-soda-portion-integration-20261013/README.md).

## Findings and limits

The active baking-soda identity is verified and appears on 21 recipe lines in the bundled corpus. Its measurement research state is `blocked_pending_evidence`, with no active density or unit mappings.

King Arthur Baking's Ingredient Weight Chart reports **1/2 teaspoon = 1/10 ounce = 3 g** for baking soda. The chart does not identify a teaspoon volume convention or a fill/leveling method. Health Canada's *Nutrient Value of Some Common Foods*, revised 1999, reports **5 mL = 5 g** for “Leavening agents, baking soda”; the publication says its nutrient values were taken from the 1997 Canadian Nutrient File and does not specify fill/leveling method, brand, or product specification.

These source values are not normalized or averaged. The King Arthur amount uses “teaspoon” without an explicit volume convention, while Health Canada reports metric volume. The sources do not supply comparable measuring methods. Their values remain ledger observations only; they do not establish a reusable density or recipe conversion.

## Integrated treatment

- Keep `measurementState` at `blocked_pending_evidence`.
- Add the two reported portions separately with source, quantity, food, and method limitations.
- Keep the active reference's density null and unit mappings empty.
- Do not change recipe quantities, form data, or substitution data.

## Sources

| Source ID | Source | Evidence |
|---|---|---|
| `WP07-KAB-IWC` | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart), “Baking soda” row. | 1/2 teaspoon = 1/10 ounce = 3 g; no spoon-volume convention or fill/leveling method is stated. |
| `WP07-BAKING-SODA-20261013-S01` | Health Canada, [Nutrient Value of Some Common Foods](https://publications.gc.ca/collections/Collection/H58-28-1999E.pdf), revised 1999, printed p. 41. | “Leavening agents, baking soda” row: 5 mL = 5 g. The publication notes values are from the 1997 CNF; no fill/leveling method, brand, or product specification is stated. |

This update adds research evidence to database JSON and documentation only. Per `AGENTS.md`, no app tests or emulator checks were needed.
