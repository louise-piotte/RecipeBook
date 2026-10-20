# WP02 B2 — hazelnut flour measurement and substitution review (R272)

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, generated file, recipe, batch README, or test file was changed.
- **Open checklist item:** Section 04, B2, [global catalog plan line 2307](../../RecipeBook-global-ingredient-catalog-plan.txt#L2307), which lists hazelnut flour among the alternative-flour reviews. This packet reviews only measurement and substitution evidence for the existing identity; it does not close the broader B2 item.
- **Record under review:** `ingredient-ref-hazelnut-flour`, the existing `hazelnut flour / farine de noisette` identity.
- **Source-ID prefix:** `WP02-B2-HAZELNUT-FLOUR-EVIDENCE-R272-20261016`; checked against the current ledger and proposal/batch archive before drafting. The existing Bob’s Red Mill identity source is reused and would be updated in place during integration.
- **Proposed integration README path:** `docs/catalog/batches/wp02-b2-hazelnut-flour-measurement-substitution-r272-20261016/README.md` (not created by this proposal).
- **Snapshot:** 1,656 ingredient references, 125 forms, 2,004 ledger records, 61 legacy candidates, 114 manifest-listed recipes, and 1,123 recipe ingredient rows.

## Recommendation

Record the source-specific measure evidence in the existing hazelnut-flour ledger record and set `measurementState` to `researched_supported`. King Arthur Baking’s current ingredient chart reports 1 cup of hazelnut flour as 89 g. Bob’s Red Mill’s current label reports 2 tablespoons (14 g) for its Hazelnut Flour/Meal Natural product, made from whole raw hazelnuts. Treat each as a published portion for its named source context. Neither source states a fill/level method or establishes one portable cup weight, so keep `defaultDensity` null, `unitMappings` empty, and add no form-level or active conversion.

Record the maker’s suggestion to replace 30% of wheat flour with its hazelnut flour, alongside the 2022 primary study’s 5%, 10%, and 15% wheat-flour replacements in instrument-tested dough. Set `substitutionResearchState` to `researched_no_supported_substitute` for a reusable rule under the current unqualified catalog identity. The two pieces of evidence differ in product, recipe scope, and endpoint; neither establishes an enforceable denominator, weight/volume basis, or validated home-baking outcome for a general rule. Keep global and contextual substitution rules empty.

Retain all existing identity fields and meal/defatted product boundaries. Add no alias, ingredient form, recipe link, conversion, or active behavior. Keep the B2 checklist open.

## Ownership, archive, corpus, and picker audit

The current active row for `ingredient-ref-hazelnut-flour` is `hazelnut flour / farine de noisette`, category `FLOUR_AND_STARCH`, with no aliases, `defaultDensity: null`, and `unitMappings: []`. Its ledger record is identity-verified and currently has `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, six identity/boundary sources, no measurement observations, and no substitution findings.

Earlier hazelnut work was checked to avoid repeating an identity or boundary decision:

- The 2026-10-10 identity review established the ordinary flour display and intentionally left measures and substitutions blank.
- The 2026-10-10 flour/meal review held broad meal, powder, and ground-hazelnut terms outside aliases and likewise made no numeric or substitution change.
- The 2026-10-13 R88 review added separate `ingredient-ref-defatted-hazelnut-flour` and retained the ordinary row unchanged, with numeric behavior empty.
- Existing batch ownership is recorded in the 2026-10-10 alternative-flour integration and the R88 WP02/WP03/WP04 integration. Neither covers the proposed ordinary-flour evidence review. No R272 proposal or batch README with this scope or filename exists.

The manifest-ordered bundle has 114 recipes and 1,123 ingredient rows. No row links to ordinary hazelnut flour or contains a flour-specific hazelnut phrase. Three broader hazelnut/noisette ingredient rows occur in two recipes: finely chopped whole hazelnuts, hazelnut butter, and whole hazelnuts. These provide no flour measure or substitution direction. No recipe relink or inferred demand is proposed.

The picker’s current phrase behavior was statically checked against `IngredientSearch.kt`. This review changes no display or alias, so result sets remain unchanged:

| Query | Current result |
|---|---|
| `hazelnut flour`; `farine de noisette` | Ordinary and defatted hazelnut flour |
| `defatted hazelnut flour`; `farine de noisette déshuilée` | Defatted hazelnut flour only |
| `hazelnut meal`; `hazelnut powder`; `poudre de noisette`; `ground hazelnuts` | No result |

The two broad flour queries already return both flour identities because the defatted display contains the unqualified phrase. This is an existing picker boundary, not a change proposed here.

## Proposed ledger disposition

During a later integration, update only the existing `ingredient-ref-hazelnut-flour` research record:

| Field | Proposed value | Scope |
|---|---|---|
| `identityState` | `verified` | Retain unchanged. |
| `measurementState` | `researched_supported` | Record the two source-specific published portions below; this does not authorize an active measure. |
| `substitutionResearchState` | `researched_no_supported_substitute` | Record the maker guidance and laboratory trial but add no reusable catalog rule. |
| `measurementObservations` | Two `portion_weight` observations | King Arthur chart: 1 cup = 89 g; Bob’s label: 2 tablespoons = 14 g. Preserve each source’s scope and unspecified filling method. |
| `substitutionFindings` | One no-reusable-rule finding | Explain the 30% manufacturer suggestion and 5–15% dough trial, and why they do not resolve a general formula, amount basis, role, or product scope. |
| Active reference, forms, rules, recipes | No change | Keep null density, empty mappings, no added form/recipe link, and no substitution rule. |

Reuse the target row’s existing Bob’s source ID `WP02-HAZELNUT-MEAL-20261010-S01`; expand its locator/support description to include the serving label and substitution recommendation. Add the current King Arthur chart and Pycia/Juszczak primary-study sources under the R272 prefix above. The King Arthur chart has also been cited in the separate almond-flour measurement review; its hazelnut entry is separately scoped here. No shared ledger changes are part of this proposal.

The prospective observation details are:

- **King Arthur chart:** relation `portion_weight`; value `89 g`; source quantity `1 cup`; source context is the chart’s hazelnut-flour row; the cup standard and filling method are unspecified. Do not assign this value as a generic cup conversion.
- **Bob’s Red Mill label:** relation `portion_weight`; value `14 g`; source quantity `2 tablespoons`; food description is its Hazelnut Flour/Meal Natural made from whole raw hazelnuts; the label supplies a serving-size pairing but no scoop, fill, or leveling method. Do not derive a cup weight or density from it.
- **Substitution finding:** record the manufacturer’s product advice and the study’s experiment as evidence, with `researchState: researched_no_supported_substitute`, no `replacements`, and no rule ID. Do not present either percentage as a supported user-facing replacement instruction.

## Source interpretation and limits

| Source | Evidence used | Limits |
|---|---|---|
| King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) (accessed 2026-10-16) | Current chart row lists `Hazelnut flour`, `1 cup`, `3 1/8 oz`, `89 g`. | The row does not identify a specific hazelnut-flour product or state cup capacity, leveling, packing, or settling method. It is a published chart portion, not a measured density or transferable default. The same chart’s separate whole-hazelnut row does not apply to flour. |
| Bob’s Red Mill, [Hazelnut Flour/Meal Natural](https://www.bobsredmill.com/product/hazelnut-flour-meal) (accessed 2026-10-16; existing target-row source `WP02-HAZELNUT-MEAL-20261010-S01`) | The current page says the product is ground from whole raw hazelnuts, gives serving size `2 Tbsp (14g)`, and recommends replacing 30% of wheat flour with hazelnut flour in baking. | The serving is a product-label portion, not a measured household-volume conversion. The page does not specify the amount basis or denominator convention for the 30% advice and does not bound it to a defined recipe class. This is one manufacturer’s product guidance, not a universal substitution rule. |
| Pycia and Juszczak, [“The Effect of the Addition of Hazelnut or Walnut Flour on the Rheological Characteristics of Wheat Dough”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8837007/), *Materials* 15(3), 782 (2022), [DOI 10.3390/ma15030782](https://doi.org/10.3390/ma15030782) (accessed 2026-10-16) | Primary study replaces type 650 wheat flour with 5%, 10%, and 15% hazelnut flour in laboratory dough made with 2020-harvest hazelnut flour. It reports changed water absorption, development time, stability, and softening; higher nut-flour share reduced water absorption and weakened dough structure. | The endpoint is laboratory dough rheology, not a validated baked product or household recipe. The article does not establish a general acceptable replacement percentage, a weight/volume instruction, or applicability to all commercial hazelnut-flour products. Its observations are specific to the flour and test conditions studied. |

The chart and product serving demonstrate that published volume/weight pairings exist, but their different source contexts and unspecified fill methods do not justify an active unit mapping. The manufacturer advice and study establish that wheat-flour replacement is practiced and experimentally studied in defined settings; they do not specify a common user-facing rule. Do not transfer the study’s bread-dough results to cakes, cookies, or other roles, and do not transfer any ordinary-flour evidence to defatted hazelnut flour.

## Source register

Sources were checked on 2026-10-16. R272 source IDs are proposal-local; the existing Bob’s source ID is retained from the target record.

| Source ID | Source | Use in this review |
|---|---|---|
| `WP02-B2-HAZELNUT-FLOUR-EVIDENCE-R272-20261016-S01` | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart). | The chart’s hazelnut-flour row reports 1 cup = 89 g. Supports only that published chart portion. |
| `WP02-HAZELNUT-MEAL-20261010-S01` (existing) | Bob’s Red Mill, [Hazelnut Flour/Meal Natural](https://www.bobsredmill.com/product/hazelnut-flour-meal). | Existing identity source; current page additionally supports the product’s 2 Tbsp (14 g) serving and manufacturer’s 30% wheat-flour replacement suggestion. Retain the existing source ID and update its locator/support description if integrated. |
| `WP02-B2-HAZELNUT-FLOUR-EVIDENCE-R272-20261016-S02` | Pycia and Juszczak, [primary study](https://pmc.ncbi.nlm.nih.gov/articles/PMC8837007/), *Materials* 15(3), 782 (2022). | Documents laboratory replacement trials at 5%, 10%, and 15% in wheat dough and the measured rheological effects. Supports no general home-recipe ratio. |

## Static review record

- Re-read current `AGENTS.md`, the open B2 plan item, active reference/form data, the existing target ledger record, legacy candidates, prior hazelnut proposals/batches, and current picker search semantics.
- Confirmed the existing record has no measurement observations or substitution findings, while the prior identity, meal-boundary, and defatted-flour decisions do not cover this evidence scope.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows. Found no ordinary hazelnut-flour link or exact flour phrase; confirmed three broader hazelnut/noisette ingredient lines in two recipes.
- Reconstructed existing picker results from the unchanged current names and aliases; no query behavior change is proposed.
- Checked the proposed filename, batch README path, and R272 source-ID prefix against the proposal/batch archive. No ownership collision was found.
- Static checks only: confirmed UTF-8 without BOM, final newline, no trailing whitespace or mojibake markers, and a valid local plan link; reviewed the external source links. The proposal contains no JSON example to parse. No tests, build, emulator, or app work was run, and no shared catalog/ledger/plan/roadmap/generated files were changed.
