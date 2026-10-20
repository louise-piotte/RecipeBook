# WP08 granulated-sugar liquid-sweetener review — 2026-10-16

## Scope and disposition

Reviewed source guidance for replacing the high-frequency `ingredient-ref-granulated-sugar` with corn syrup, honey, maple syrup, and molasses. The evidence is now recorded on the granulated-sugar research-ledger record. No active substitution rule, measurement, form, ingredient identity, or recipe-line link was added.

One bounded direction is supported in general substitution tables: generic corn syrup can replace part of the granulated sugar at equal volume, with Colorado State Extension limiting the replacement to at most half of the recipe's sugar and requiring a liquid adjustment. It remains ledger-only because the runtime rule cannot enforce that limit and adjustment.

Honey and maple-syrup guidance is blocked. Reviewed sources disagree on ratios and on liquid, acidity/leavener, and oven-temperature adjustments. Their instructions remain source-specific; they are not averaged. Maple syrup's catalog identity also remains unreviewed. Generic molasses was not recorded as a replacement because the active catalog does not establish a generic molasses identity or grade boundary.

## Source findings

1. **Corn syrup:** Utah State Extension lists 1 cup corn syrup for 1 cup granulated sugar and says to reduce the recipe liquid by 1/4 cup. Colorado State Extension gives the same volume ratio and liquid reduction but explicitly says not to replace more than half the sugar called for. Retain the stricter, source-stated partial-replacement limit; do not infer full replacement. [S03, S06]
2. **Honey:** King Arthur Baking and Utah State's archived substitution table recommend about 3/4 cup honey per cup of granulated sugar; Colorado State lists 13/16 cup. Utah State's 2025 guide instead recommends 1/2 cup. Guidance also differs on liquid reduction, added baking soda, and baking temperature. The ratios and adjustments stay separate, with no general rule selected. [S01–S03, S06]
3. **Maple syrup:** King Arthur Baking and Maple from Canada recommend 1 cup syrup per cup sugar. University of Maine Cooperative Extension recommends 3/4 cup; Colorado State gives a 3/4–1 cup range. Their liquid reductions and additional baking adjustments also differ. King Arthur reports that its maple-sweetened soft cookies became moister and more cake-like and could spread more. No ratio is selected. [S01, S04–S06]
4. **Molasses:** Utah State and Colorado State provide broad replacement instructions, but the catalog has no accepted generic molasses identity; Québec and Canadian product evidence distinguishes molasses grades. Keep this wording unassigned until identity and grade scope are resolved. [S01, S03, S06]

## Proposed ledger disposition

For `ingredient-ref-granulated-sugar`:

- Add three directional findings: a source-bounded, partial granulated-sugar-to-corn-syrup finding; a blocked granulated-sugar-to-honey finding; and a blocked granulated-sugar-to-maple-syrup finding.
- Set `substitutionResearchState` to `blocked_pending_evidence` because the common liquid-sweetener candidates are not resolved into safe general instructions.
- Record the corn-syrup finding as supported evidence only. Keep the maximum one-half share and liquid adjustment in its limits; add no active rule.
- Keep honey and maple-syrup ratios and adjustments source-specific. Do not choose, average, invert, or transfer them to a recipe line.
- Keep `measurementState`, active measurement fields, seed identities, active rule files, and recipes unchanged.

## RecipeBook corpus boundary

The bundled corpus has 114 recipes and 1,123 ingredient rows: 65 rows reference granulated sugar, 1 honey, 3 maple syrup, and 2 generic corn syrup. A few recipes contain both granulated sugar and a liquid sweetener in separate formula roles. For example, recipe 025 uses granulated sugar in the crust and maple syrup in the filling. These are not substitution links; no recipe line was changed.

## Sources

| ID | Source | Support and limit |
| --- | --- | --- |
| S01 | King Arthur Baking, [Baking with liquid sweeteners](https://www.kingarthurbaking.com/blog/2017/08/18/baking-with-liquid-sweeteners), published 2017-08-18, accessed 2026-10-16. | Test-kitchen guidance and selected test bakes. Gives honey and maple ratios and adjustments, warns about honey scorching, and reports texture effects; does not establish one universal formula. |
| S02 | Utah State University Extension, [Thriving Hives: Making Products With Honey](https://extension.usu.edu/beekeeping/research/making-products-with-honey-skincare-and-food-recipes), published 2025-07-17, accessed 2026-10-16. | Recommends 1/2 cup honey per cup of white sugar with distinct liquid, oven-temperature, and baking-soda instructions. Its ratio conflicts with the other reviewed honey guidance. |
| S03 | Utah State University Extension, [List of Ingredient Substitutions for Cooking and Baking](https://extension.usu.edu/archive/list-of-ingredient-substitutions-for-cooking-and-baking), accessed 2026-10-16. | Lists generic corn syrup, molasses, and honey for granulated sugar with its own liquid and soda adjustments. It does not state a maximum corn-syrup share or demonstrate a tested recipe. |
| S04 | University of Maine Cooperative Extension, [Make Mine Real Maple Syrup!](https://extension.umaine.edu/food-health/2022/03/10/make-mine-real-maple-syrup/), published 2022-03-10, accessed 2026-10-16. | Recommends 3/4 cup maple syrup per cup sugar with baking-specific liquid, acidity, and temperature adjustments. |
| S05 | Maple from Canada, [The Versatility of Maple Syrup](https://maplefromcanada.ca/cook-with-maple/versatility/), accessed 2026-10-16. | Recommends equal amounts for most recipes and a 1/4-cup liquid reduction per cup of sugar; excludes pastry recipes with large sugar amounts. Producer-association guidance, not a tested recipe conversion. |
| S06 | Colorado State University Extension, [Ingredient Substitutions](https://extension.colostate.edu/resource/ingredient-substitutions/), accessed 2026-10-16. | Provides ratios and adjustments for corn syrup, honey, maple syrup, and molasses. Explicitly limits corn syrup to replacing at most half of recipe sugar; broad substitution table, not a controlled recipe test. |

## Verification notes

The ledger change preserves three one-way findings, source IDs, and evidence limits. Only the corn-syrup partial replacement is marked `researched_supported`; honey and maple syrup remain `blocked_pending_evidence`. No active rule arrays or bundled recipe lines were changed. Ledger schema, source linkage, endpoint identity, UTF-8/no-BOM, local-link, and scoped whitespace checks are recorded in the integration README. No software tests were run because this change adds JSON database research data only, under `AGENTS.md`.
