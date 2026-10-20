# WP08 independent source audit: butter to margarine

- **Review date:** 2026-10-12
- **Audited proposal:** [WP08 butter-to-margarine proposal, round 2](wp08-contextual-substitution-next-open-gap-review-20261012-round2.md)
- **Disposition:** Accept a narrowly documented, inactive ledger finding. Do not create a runtime rule or change a recipe.
- **Scope:** One-way butter → margarine advice for baking, with the candidate recipe limited to the cake batter in recipe `008`. The sources do not validate this exact formula.

The requested unsuffixed proposal path, `wp08-contextual-substitution-next-open-gap-review-20261012.md`, is not present. The matching current document is the round-2 file linked above; this audit reviews its butter-to-margarine finding.

## Source verdict

| Question | Audit result |
|---|---|
| Direction | Supported only as **butter → margarine**. Utah State University Extension (USU) lists “Butter, 1 cup” followed by “1 cup margarine”; Land O’Lakes asks whether its stick margarine can be substituted for butter and answers yes for most baking. Neither source supports reversing the direction. |
| Quantity basis | USU’s amount is **volume-to-volume**, one cup for one cup. It is not a 1:1 mass claim. The table does not define its cup convention. The 340 g value on the cake recipe page must not be copied as 340 g margarine. |
| Product qualifier | The numeric USU row says only “margarine.” The manufacturer’s broader baking advice specifically names **Land O’Lakes stick margarine made with 80% vegetable oil**. Keep that as the source-specific candidate product; do not broaden the manufacturer statement to every margarine or spread. CFIA’s Canadian standard separately defines standard margarine at a minimum of 80% fat and calorie-reduced margarine at no more than 40% fat. This regulatory boundary is not a baking test and does not establish that every Canadian margarine has the manufacturer’s exact formulation. |
| Context | USU’s use guide lists margarine for cookie and cake baking and against sautéing, roasting, and candy making. Land O’Lakes excludes pastry and candy made from boiled syrup. These sources support a baking-only candidate; they do not establish suitability for frosting, sauces, roux, sautéing, roasting, or arbitrary recipes. |
| Product and recipe effects | Land O’Lakes reports a softer dough and a different flavor from butter. Neither source reports a tested result for Sally’s Vanilla Cake, nor recipe-specific adjustments to salt, liquid, temperature, timing, or yield. |

## Application to recipe 008

Sally’s current source page lists `1 1/2 cups (340 g)` unsalted butter in the cake batter and repeats the same amount under a separate vanilla-buttercream heading. Its instructions cream the cake butter with sugar. The two lines have different culinary roles: the sources support no inference for the frosting. Applying USU’s 1:1 **volume** entry to the cake line gives only a cross-source candidate of 1 1/2 cups of the named stick product. This is not a tested swap, a recommendation to replace 340 g with 340 g, or a margarine density/volume mapping.

The recipe says *unsalted butter*, while the substitution sources do not establish the salt content of the target margarine or provide a salt adjustment. Do not claim dairy-free or vegan suitability: CFIA’s margarine standard permits specified milk-derived ingredients. The generic catalog reference has no form that encodes the manufacturer, stick format, or fat composition, so this qualification can only remain in ledger prose for now.

## Root-ready ledger recommendation

If accepted, append one finding to `ingredient-ref-unsalted-butter` using the source IDs already assigned in the round-2 proposal (`WP08-MARG-BAKING-20261012-S01` through `S05`). The butter record already has `substitutionResearchState: researched_supported` because of the separate salted-butter finding; retain that state and its existing finding. Do not change `ingredient-ref-margarine`’s identity, measurement state, or substitution research state just because it is the replacement target.

| Ledger field | Recommended value |
|---|---|
| `findingId` | `WP08-MARG-BAKING-20261012-F01` |
| `researchState` | `researched_supported` (source-supported candidate guidance; keep all limits below in the finding) |
| `fromIngredientRefId` | `ingredient-ref-unsalted-butter` |
| `replacements[0].ingredientRefId` | `ingredient-ref-margarine` |
| `replacements[0].quantity` | `1 cup`, with `unitConvention` explicitly saying “USU’s one-cup-to-one-cup table entry; volume basis only; table does not define cup convention; no mass equivalence.” |
| `context` | Butter → the specifically described Land O’Lakes 80%-vegetable-oil stick margarine for most baking; keep the local candidate to recipe 008’s cake batter, not its buttercream. |
| `basis` | USU gives 1 cup butter → 1 cup margarine. Land O’Lakes separately supports its named stick product in most baking. Their combination is a cross-source candidate, not a trial of recipe 008. |
| `expectedEffects` | Land O’Lakes reports softer dough and a different flavor. Do not state a tested cake rise, crumb, structure, or flavor result. |
| `limitations` | One direction only; volume only; no mass conversion; no exact-recipe test; source-product qualifier is not encoded by the generic reference; no salt adjustment; not for frosting, pastry, boiled-syrup candy, cooking, sautéing, roasting, or unreviewed recipes; no dairy-free/vegan claim; no runtime rule. |
| `sourceIds` | S01–S05 from the audited proposal. |

No `ruleId` is recommended. The current generic margarine reference cannot enforce the product restriction, the recipe’s stored mass cannot consume the source’s volume ratio, and recipe-level `cake` does not distinguish batter from frosting. Keep the finding informational and inactive.

## Sources independently opened

Sources were opened on 2026-10-12. The source IDs below match the round-2 proposal.

- **S01 — USU Extension, [List of Ingredient Substitutions for Cooking and Baking](https://extension.usu.edu/archive/list-of-ingredient-substitutions-for-cooking-and-baking), butter row.** Directly gives 1 cup butter → 1 cup margarine. This is a table amount in cups; it names no brand, formulation, baking process, or cup convention.
- **S02 — Land O’Lakes, [Can I bake with Margarine?](https://www.landolakes.com/faqs/butter-spreads/margarine/can-i-bake-with-margarine/), stick-margarine answer.** Says its stick margarine made with 80% vegetable oil can replace butter in most baking, except pastry and boiled-syrup candy; says dough is softer and flavor differs. Manufacturer guidance, not a recipe trial.
- **S03 — CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Vol. 7 §7.3.1 and Vol. 8 §§8.3.2–8.3.3.** Butter has at least 80% milk fat; standard margarine has at least 80% fat; calorie-reduced margarine is separately defined with at most 40% fat. The margarine standard allows specified milk-derived ingredients. Identity boundary only.
- **S04 — USU Extension, [Navigating Dietary Fats: Understanding, Selection, and Usage](https://extension.usu.edu/nutrition/research/navigating-dietary-fats), use table and discussion.** Lists margarine for cookie and cake baking, not sautéing, roasting, or candy making; describes both butter and margarine as plastic fats and notes butter’s flavor/function advantage. This is use guidance, not a ratio or tested recipe.
- **S05 — Sally’s Baking, [The Best Vanilla Cake I’ve Ever Had](https://sallysbakingaddiction.com/vanilla-cake/), recipe and instructions.** Lists the cake and buttercream amounts separately and describes creaming butter with sugar for the cake. It establishes local recipe demand and amount formats only.

This addendum changes no shared catalog, ledger, plan, roadmap, batch, recipe, or runtime file. It is documentation-only; no app or emulator testing was required.
