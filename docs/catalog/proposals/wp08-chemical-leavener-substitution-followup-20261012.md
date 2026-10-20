# WP08 chemical leavener substitution follow-up — 2026-10-12

- **Status:** Integrated into the research ledger as source-bounded findings; no runtime substitution rule was added.
- **Scope:** Baking powder replacement mixtures and cream-of-tartar alternatives for whipped egg-white stabilization.
- **Access date:** 2026-10-12 for new/rechecked sources. Existing King Arthur Baking source `WP08-S01` was first recorded on 2026-10-05 and rechecked for this follow-up.
- **Out of scope:** New ingredient identities or aliases, active measures, default densities, forms, recipe-line changes, and general substitution rules for every use of these ingredients.

## Recommendation and integration result

The ledger now records four complete King Arthur baking-powder mixture candidates: baking soda with cream of tartar and either cornstarch or tapioca starch; and baking soda with either lemon juice or white vinegar. Each mixture remains a separate directional finding for a recipe that calls for baking powder. The ledger also preserves the different Utah State University Extension alternatives as a blocked research finding. Its amounts are not averaged with King Arthur's formulas.

The cream-of-tartar record now contains two directional alternatives for one use: lemon juice or generic vinegar when stabilizing whipped egg whites. King Arthur's amount is a range stated per egg white; the ledger preserves it in the finding basis rather than reducing it to a single replacement quantity. The finding does not apply to baking powder formulas, syrups, or candy crystallization.

Both records now have `substitutionResearchState: researched_supported` because source-backed alternatives exist in the stated contexts. This is evidence status only. There are no matching active rules in either substitution-rule JSON file. The current runtime cannot enforce a multi-ingredient mixture, egg-white role, quantity ranges, or the recipe-specific balance changes left unspecified by the sources, so nothing was activated.

No ingredient reference, form, density, unit mapping, recipe link, or authored recipe quantity changed. The two existing cream-of-tartar recipe lines remain as written; neither is treated as a recipe-specific validation of the source substitutions.

## Evidence and source register

| ID | Source and locator | Claim retained and limits |
|---|---|---|
| Existing `WP08-S01` | King Arthur Baking, [“What’s the difference between baking soda and baking powder?”](https://www.kingarthurbaking.com/blog/2021/09/10/baking-soda-vs-baking-powder-substitutions), substitutions for baking powder; published 2021-09-10. | For 1 tsp baking powder, gives 1/4 tsp baking soda + 1/2 tsp cream of tartar + 1/4 tsp cornstarch **or** tapioca starch; alternatively, 1/4 tsp baking soda + 1/2 tsp lemon juice **or** white vinegar. It says these substitutions will not perform exactly like the original and does not validate a particular recipe. Reused from the existing soda finding rather than assigned another ID. |
| `WP08-LEAVENER-20261012-S01` | King Arthur Baking, [“What is cream of tartar? And do I really need it to whip egg whites?”](https://www.kingarthurbaking.com/blog/2023/02/27/what-is-cream-of-tartar), substitution section, especially the amount per egg white; published 2023-02-27. | For a recipe calling for a pinch to 1/8 tsp cream of tartar per egg white, advises starting with 1/8–1/4 tsp lemon juice or vinegar per egg white. The source cautions that the replacement's flavor may be noticeable. The vinegar is not further specified; it remains mapped to the generic vinegar identity. This is limited to whipped egg-white stabilization. |
| `WP08-LEAVENER-20261012-S02` | Utah State University Extension, [“List of Ingredient Substitutions for Cooking and Baking”](https://extension.usu.edu/archive/list-of-ingredient-substitutions-for-cooking-and-baking), opening caveat and baking-powder row; page undated. | Lists 1 tsp baking powder replacements including baking soda + 5/8 tsp cream of tartar; baking soda + fully soured milk or buttermilk; baking soda + vinegar/lemon juice with milk to make 1/2 cup; and baking soda + 1/4–1/2 cup molasses. It warns that substitutions can change flavor, color, texture, or volume. These are preserved as different source candidates, not combined with or averaged against King Arthur's formulas. |

## Research log

Targeted searches on 2026-10-12 included:

- `site:kingarthurbaking.com/blog/2023/02/27/what-is-cream-of-tartar "egg whites" lemon juice vinegar`
- `site:kingarthurbaking.com/blog/2021/09/10/baking-soda-vs-baking-powder-substitutions "1/2 teaspoon cream of tartar"`
- Direct review of the King Arthur cream-of-tartar article, King Arthur's existing baking-soda/baking-powder article, and the current Utah State University Extension substitution table.

The English and Québec French catalog references already exist for each named replacement: baking soda, cream of tartar, cornstarch, tapioca starch, lemon juice, white vinegar, and generic vinegar. This follow-up adds no names or aliases, so no term-ownership change is required.

## Unresolved limits

- The King Arthur formulas are not validated against individual bundled recipes or every baking-powder formulation.
- Utah State University's complete alternatives differ from King Arthur's formula and include large liquid or molasses additions without recipe-specific balance directions. Keep those candidates blocked from reusable suggestions.
- Neither source establishes a general soda/powder equivalence or supports reversing any direction.
- King Arthur's cream-of-tartar amount is an egg-white-specific range. It does not support a direct replacement in baking-powder mixes, syrup/candy work, or other cream-of-tartar functions.
- No flavor, texture, rise, pH, or liquid-balance outcome is inferred beyond the source statements.

## Checks

- [x] Confirmed new source IDs were unused in the live ledger and proposal archive before assignment; existing `WP08-S01` was reused.
- [x] Confirmed all replacement ingredient IDs already exist in the bundled reference catalog.
- [x] Recorded complete replacement components, direction, source amounts/basis, context, known effects, and limitations.
- [x] Kept all findings out of runtime rule JSON and preserved the recipe lines and quantities.
- [x] Revalidated the 1,605-record research ledger with zero errors; bundled-package validation and normalization checks passed; the generated catalog is current at 1,297 references. Scoped `git diff --check` and UTF-8/no-BOM checks passed.
- No unit-test or emulator run is planned because this follow-up only adds source-backed database research data and does not change app code or runtime rules, consistent with `AGENTS.md`.
