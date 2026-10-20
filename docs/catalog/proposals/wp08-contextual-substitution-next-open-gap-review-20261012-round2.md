# WP08 proposal: butter to margarine in a creamed cake

- **Review date:** 2026-10-12
- **Disposition:** Integrated on 2026-10-12 as a narrow, source-bounded ledger finding; no runtime rule was activated. See the batch README and the independent source-audit addendum.
- **Scope:** One direction only: butter to standard stick margarine in a baked cake batter. The evidence does not cover margarine-to-butter, frosting, pastry, cooking, or a general fat equivalence.

## Why this is an open WP08 gap

The WP08 plan still asks for high-value cooking and baking replacements and keeps unspecified contexts unavailable. The existing WP08 proposals and `docs/catalog/batches/baking-substitutions.md` contain no butter-to-margarine or margarine-to-butter finding. The WP04 and WP05 margarine/butter work distinguishes product identities and boundaries but does not establish recipe substitution behavior. The current bundled global and contextual substitution-rule files are both empty.

The relevant current references are:

| Current reference | Display and category | Current evidence state | Boundary |
|---|---|---|---|
| `ingredient-ref-unsalted-butter` | `unsalted butter / beurre non salé`, `FAT_AND_OIL`; English alias `butter`, French aliases `beurre` and `beurre doux` | Ledger identity is `unreviewed`; its `researched_supported` substitution state comes from the separate WP08 salted-butter-for-unsalted-butter finding only. | The source recipe below names unsalted butter. The generic substitution table says only “butter” and does not specify saltedness. This review does not extend the existing salt finding. |
| `ingredient-ref-margarine` | `margarine / margarine`, `FAT_AND_OIL`; no aliases | Ledger identity is `verified`; substitution state is `not_yet_researched`; measurement state is `blocked_pending_evidence`. The ledger has no substitution findings. | The catalog has no stick, tub, reduced-calorie, or salt-specific margarine form. The Canadian standard separates calorie-reduced margarine from standard margarine and permits some milk-derived ingredients in margarine. |

Neither reference has a default density or unit mappings. No active ingredient form identifies the manufacturer’s 80%-fat stick product. Six bundled recipe lines already use the generic margarine reference, as recorded in the WP05 baking-spread boundary follow-up; their wording does not prove any of those recipes works with butter instead.

## Local recipe demand and exact process

Bundled recipe `008`, **Vanilla Cake**, has the clearest bounded target: ingredient line `41d7331d-2cf7-4a72-b1ce-ac90ffb97f33-ingredient-5` requests **340 g unsalted butter, softened to room temperature**, in the cake group. The linked author page gives the same amount as **1 1/2 cups (340 g)**. The method beats the butter and sugar together for about three minutes, then adds eggs and egg whites; cake flour, both chemical leaveners, and buttermilk follow. The author describes the result as a butter-creamed layer cake. [Sally’s Baking, “The Best Vanilla Cake I’ve Ever Had”](https://sallysbakingaddiction.com/vanilla-cake/)

The same recipe has a separate 340 g butter line for vanilla buttercream. Do not include that frosting line: it is not the cake-batter use reviewed here, and the sources below do not validate margarine in frosting. Do not infer that a recipe-level `cake` match makes a frosting line suitable.

## Evidence and candidate finding

| Direction and context | Source amount and basis | Supported adjustments and effects | Restrictions and unresolved points |
|---|---|---|---|
| Butter → margarine, baking; candidate narrowed to the butter-creamed cake batter in recipe `008` | Utah State University Extension’s substitution table lists **1 cup butter → 1 cup margarine**, a volume-to-volume replacement. Sally’s current source recipe expresses its cake-batter butter as **1 1/2 cups (340 g)**, so applying that table would suggest 1 1/2 cups margarine as a *cross-source candidate only*. No reviewed source tests margarine in Sally’s formula. The evidence does not support 340 g margarine or a mass-to-mass ratio. | Land O’Lakes’ manufacturer guidance says its stick margarine made with 80% vegetable oil can replace butter in most baking applications; it reports a softer dough and a different flavor. Utah State lists cookies and cakes among margarine’s baking uses, and notes that both butter and margarine can act as plastic fats in baking. Neither source specifies a cake-batter liquid, sugar, leavener, salt, temperature, timing, or yield adjustment. | The numeric table does not name a margarine formulation or a specific baking method. Land O’Lakes’ claim is for its own 80%-oil stick product, excludes pastry and boiled-syrup candy, and is not a test of this exact recipe. Utah State’s table does not identify saltedness or the product’s water/fat composition. The sources do not establish flavor, rise, crumb, or structure in this cake. Keep the frosting, sauces, roux, sautéing, roasting, pastry, candy, dairy-free claims, and arbitrary recipes out of scope. |

This is enough for a **ledger-only candidate finding**, preserving the one-way direction, the stated 1:1 volume basis, the source-specific stick-margarine condition, and the softer-dough/flavor caveat. It is not evidence that the generic catalog reference is a specified stick product, or that the exact cake formulation was tested. Do not infer the reverse direction.

## Runtime and integration boundary

Do not add a contextual rule. The current rule stores a single ingredient pair and scalar ratio, with no source/target unit basis or product qualifier. The resolver applies only a same-unit ratio; it cannot convert recipe `008`’s stored 340 g butter amount into the source’s volume-based replacement. It also rejects role- or method-scoped rules, so a recipe-level cake match cannot safely distinguish the cake batter from its frosting line. The current catalog has no form that restricts the target to standard 80%-fat stick margarine. Root added five sources and one blocked finding to the existing `ingredient-ref-unsalted-butter` ledger record. No recipe lines, ingredient references, forms, unit data, or active substitution rules changed.

## Sources reviewed

Sources were accessed on 2026-10-12. Claims below are paraphrased and retained only for the stated use.

| ID | Primary source | Claim retained and limit |
|---|---|---|
| **WP08-MARG-BAKING-20261012-S01** | Utah State University Extension, [“List of Ingredient Substitutions for Cooking and Baking”](https://extension.usu.edu/archive/list-of-ingredient-substitutions-for-cooking-and-baking), butter row. | States 1 cup butter may be replaced with 1 cup margarine. This is a volume table entry; it does not name a product, process, cake, or formulation. |
| **WP08-MARG-BAKING-20261012-S02** | Land O’Lakes, [“Can I bake with Margarine?”](https://www.landolakes.com/faqs/butter-spreads/margarine/can-i-bake-with-margarine/). | Specifies Land O’Lakes stick margarine made with 80% vegetable oil for most baking; excludes pastry and candy made from boiled syrup; reports softer dough and different flavor. Manufacturer guidance, not a recipe-specific trial. |
| **WP08-MARG-BAKING-20261012-S03** | Canadian Food Inspection Agency, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 7, 7.3.1 and Volume 8, 8.3.2–8.3.3. | Defines butter at not less than 80% milk fat and standard margarine at not less than 80% fat in a water-in-fat/oil emulsion; permits specified optional milk ingredients in margarine; gives calorie-reduced margarine a separate standard. This establishes product boundaries, not culinary interchangeability. |
| **WP08-MARG-BAKING-20261012-S04** | Utah State University Extension, [“Navigating Dietary Fats: Understanding, Selection, and Usage”](https://extension.usu.edu/nutrition/research/navigating-dietary-fats). | Lists margarine for cookie and cake baking, not sautéing, roasting, or candy making; describes both fats as plastic fats and notes butter’s flavor/function advantage. Educational guidance, not a tested substitution amount. |
| **WP08-MARG-BAKING-20261012-S05** | Sally’s Baking, [“The Best Vanilla Cake I’ve Ever Had”](https://sallysbakingaddiction.com/vanilla-cake/), recipe and instructions. | Current recipe version lists 1 1/2 cups (340 g) unsalted butter for the cake and a separate equal amount for buttercream; identifies the cake’s creaming method. This defines local recipe context and amount basis only; it does not suggest margarine. |

## Checks

- Confirmed current reference IDs, English/French names, category, alias ownership, research states, forms, densities, unit mappings, and existing findings in the live package and ledger.
- Searched the current WP08 plan, all WP08 proposal files, WP08 batch documents, `docs/catalog/batches/baking-substitutions.md`, and related WP04/WP05 product-boundary reviews for prior margarine substitution coverage.
- Root source-checked the cited USU, Land O’Lakes, CFIA, and Sally’s Baking pages. An independent source audit is recorded in [the addendum](wp08-contextual-substitution-butter-margarine-independent-source-audit-20261012.md).
- The finding was integrated into the existing unsalted-butter ledger record only. No app tests or emulator checks were run because this change only adds database JSON data.
