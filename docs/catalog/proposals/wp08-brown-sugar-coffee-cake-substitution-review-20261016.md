# WP08 brown-sugar coffee-cake substitution review — 2026-10-16

## Scope and current state

This review closes one narrow substitution-research gap for the existing `ingredient-ref-brown-sugar` (`brown sugar / cassonade`) record. It preserves the separate measurement hold: source-specific brown-sugar portions still do not support one active cup convention, packing method, density, or mapping. No ingredient identity, alias, form, recipe line, active rule, conversion, or yield changes are proposed.

The source survey found one directional granulated-sugar alternative in a named King Arthur Baking coffee-cake formula. The source distinguishes the cake batter from its separate filling, so the ledger records them as separate findings. It gives no replacement amount or mass/volume basis. The current runtime rule shape cannot represent that missing ratio or select the exact source recipe and role; the evidence therefore remains ledger-only.

## Source findings

1. **Cake batter:** King Arthur says granulated sugar can replace the small brown-sugar portion in the cake batter of its Cinnamon-Streusel Coffee Cake because the formula uses more granulated than brown sugar and calls for baking powder. The recipe lists 1 1/2 cups (298 g) granulated sugar and 1/3 cup (71 g) brown sugar in the cake; its leavener is 2 1/2 teaspoons baking powder, with no baking soda listed. The article does not state the replacement amount or whether it is matched by mass or volume. [S01, S03]
2. **Separate filling:** The same article says granulated sugar is structurally acceptable in the coffee-cake filling because it has no structure, while warning that brown sugar's caramelized flavor is lost. The recipe lists a separate 1 cup (213 g) packed brown-sugar filling with cinnamon and cocoa. The source does not state the replacement amount or basis. [S01, S03]
3. **Cookie boundary:** King Arthur warns that brown sugar's acidity helps activate baking soda in cookies; replacing it with granulated sugar can require changes to acid and leavening and can affect spread. This is a limitation, not a cookie substitution recommendation. [S02]

The bundled corpus's recipe 055 is a separate coffee-cake formula. It is not the King Arthur recipe, and no recipe-line substitution link is supported.

## Proposed ledger disposition

For `ingredient-ref-brown-sugar`:

- Set `substitutionResearchState` to `researched_supported` for the two recorded, source-bounded directions.
- Add two `researched_supported` findings from `ingredient-ref-brown-sugar` to `ingredient-ref-granulated-sugar`, one for the named cake batter and one for its separate filling. Keep each replacement amount absent.
- Register sources S01–S03 and an accepted decision limiting the findings to those roles in the source formula.
- Keep `measurementState: blocked_pending_evidence` and all active measurement fields unchanged.
- Add no `SubstitutionRule`, `ContextualSubstitutionRule`, recipe-line link, or inverse/transitive inference. Do not infer a 1:1 mass or volume ratio or extend these findings to other cakes, muffins, cookies, toppings, or fillings.

## Sources

| ID | Source | Support and limit |
| --- | --- | --- |
| S01 | King Arthur Baking, [What can I substitute for brown sugar?](https://www.kingarthurbaking.com/blog/2020/03/04/substitute-for-brown-sugar), accessed 2026-10-16. | Names the baking-powder coffee-cake batter example and separately discusses the filling. The same URL already appears on the turbinado-sugar record for a different claim; this record-local source ID preserves brown-sugar evidence and does not create another distinct URL. |
| S02 | King Arthur Baking, [Make your best cookies with these 10 tips](https://www.kingarthurbaking.com/blog/2023/09/27/best-cookie-tips), accessed 2026-10-16. | Documents the acid/leavener and cookie-spread boundary; it does not support a cookie swap. |
| S03 | King Arthur Baking, [Cinnamon Streusel Coffee Cake](https://www.kingarthurflour.com/recipes/cinnamon-streusel-coffeecake-recipe), accessed 2026-10-16. | Confirms the named formula's separate batter/filling amounts and baking-powder leavener. It does not give a replacement amount. |

Searches included `site:kingarthurbaking.com/blog substitute granulated sugar brown sugar cookies 1:1`, `site:extension.usu.edu granulated sugar brown sugar substitute baking`, and `site:extension.illinois.edu sugar substitutes brown sugar granulated sugar baking`. The direct King Arthur article supports only the stated coffee-cake contexts; no extension table or search result was used to broaden that scope.

## Verification notes

The proposal is evidence-only. Ledger schema and source/finding/decision linkage checks passed; the two findings remain one-way and amount-free, `measurementState` remains `blocked_pending_evidence`, and the active substitution-rule arrays and bundled recipe links are untouched. The brown-sugar record reuses the substitution article URL already held on another ingredient record, so the addition does not increase the distinct-URL count. UTF-8/no-BOM, local-link, and scoped whitespace checks passed. The database JSON change does not require software tests under the current `AGENTS.md` rule. See the integration record at `docs/catalog/batches/wp08-brown-sugar-coffee-cake-substitution-integration-20261016/README.md`.
