# WP08 brown-sugar coffee-cake substitution review — 2026-10-16

## Decision

Recorded two separate, directional, qualitative alternatives from brown sugar to granulated sugar in the cake batter and separate filling of King Arthur Baking's Cinnamon-Streusel Coffee Cake. The article says the batter swap is supported because the brown-sugar amount is smaller than the granulated-sugar amount and the formula uses baking powder; it says granulated sugar is structurally acceptable in the filling, with a loss of caramel flavor. The recipe lists 1 1/2 cups (298 g) granulated sugar and 1/3 cup (71 g) brown sugar in the batter, 2 1/2 teaspoons baking powder, and a separate filling with 1 cup (213 g) packed brown sugar. Neither source gives a replacement amount or mass/volume basis.

The ledger records both findings as `researched_supported`, scoped to those two parts of that named source recipe. They remain ledger-only: the runtime model cannot encode the missing amount or enforce the exact source formula and role. No recipe-line link, active substitution rule, alias, form, measurement, conversion, or yield was added. Measurement research remains `blocked_pending_evidence`; its active fields are unchanged.

King Arthur's separate cookie guidance warns that brown sugar's acidity helps activate baking soda and that replacing it with granulated sugar may require acid/leavener changes and alter spread. This is recorded as a scope boundary, not a cookie substitution.

The bundled corpus recipe 055 is a different coffee-cake formula. It is not linked to either source-specific finding.

## Sources

- [King Arthur Baking, What can I substitute for brown sugar?](https://www.kingarthurbaking.com/blog/2020/03/04/substitute-for-brown-sugar), sections on substituting granulated sugar and the named coffee-cake batter and filling.
- [King Arthur Baking, Make your best cookies with these 10 tips](https://www.kingarthurbaking.com/blog/2023/09/27/best-cookie-tips), brown-sugar acidity, leavener, and cookie-spread boundary.
- [King Arthur Baking, Cinnamon Streusel Coffee Cake](https://www.kingarthurflour.com/recipes/cinnamon-streusel-coffeecake-recipe), batter and filling ingredient lists and leavener.

The substitution article URL was already present on the turbinado-sugar record for another claim. Its new record-local brown-sugar source ID creates no additional distinct URL.

## Validation

- Ledger schema validation and source/finding/decision linkage checks passed: 1,908 records, 8,202 source entries, 7,007 distinct source IDs, and 5,801 distinct URLs.
- The brown-sugar record has two one-way findings to `ingredient-ref-granulated-sugar`; both have no replacement amount and cite their record-local source IDs. `measurementState` remains `blocked_pending_evidence`; active substitution-rule arrays and recipe-line links are unchanged.
- The bundled corpus contains 114 recipes and 1,123 ingredient rows. No recipe line was linked to these findings.
- UTF-8/no-BOM, local-link, and scoped whitespace checks passed.
- No software tests were run because this batch adds database JSON research data only, under the current `AGENTS.md` rule.

## Review record

- [WP08 brown-sugar coffee-cake substitution proposal](../../proposals/wp08-brown-sugar-coffee-cake-substitution-review-20261016.md)

Broader WP08 contextual-substitution research remains open.
