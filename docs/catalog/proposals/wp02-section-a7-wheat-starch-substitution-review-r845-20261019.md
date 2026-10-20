# WP02 Section A7 R845 — wheat-starch replacement evidence review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated as a blocked, source-scoped finding on the existing wheat-starch research-ledger row; no active replacement or catalog behavior was added. See the [R845–R847 integration README](../batches/wp02-wp03-wp04-r845-r847-gap-review-integration-20261019/README.md).
- **Plan anchors:** The A7 parent remains open at [plan line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289). The checked wheat-starch identity checkpoint at [line 12444](../../RecipeBook-global-ingredient-catalog-plan.txt#L12472) establishes the existing reference, the R558 nutrition-labelling amount, and a recipe scan; it explicitly did not add substitution data. This review covers the separate, previously unresearched substitution dimension on that ledger row.
- **Target:** Existing `ingredient-ref-wheat-starch` (`wheat starch / amidon de blé`), category `FLOUR_AND_STARCH`.
- **Scope:** Review one manufacturer statement about replacing an unspecified portion of flour with its native wheat starch in some baked goods. Keep this separate from A7 identity/measurement work and the newer wheat-starch subtype identities.

## Recommendation

**Record one blocked, source-scoped replacement lead on the existing wheat-starch ledger row.** Lantmännen Biorefineries’ official Native Wheat Starch page says that for baked goods requiring flour with lower gluten content, “part of the flour can be replaced with wheat starch.” The page does not identify the flour being replaced, the amount or basis, a formula, or a method.

At integration, append the manufacturer source and blocked finding below, append an accepted source-bounded decision, and set the target row’s `substitutionResearchState` to `blocked_pending_evidence`. Leave the verified identity, R558 measurement evidence, active reference fields, and other wheat-starch rows unchanged.

This source supports a product-specific application lead, but not a directed mapping to a catalog ingredient or a usable recipe replacement. Omit `fromIngredientRefId` and `replacements`: the source's generic “flour” does not identify a base ingredient, and it supplies no proportion or recipe. Do not use `researched_no_supported_substitute`; an explicit replacement direction exists, but the information needed to scope it safely is missing.

Add no active global or contextual substitution rule, alias, form, measurement observation, density, unit mapping, cooking yield, package yield, recipe link, or bundled recipe edit. Keep native, modified, pregelatinized, and resistant wheat-starch references distinct.

## Ownership, picker, and recipe audit

| Surface | Current state | R845 disposition |
|---|---|---|
| Active target reference | `ingredient-ref-wheat-starch` is `wheat starch / amidon de blé`, category `FLOUR_AND_STARCH`, with French alias `amidon de froment`, no English aliases, null `defaultDensity`, and empty `unitMappings`. | Preserve the reference and all fields. Do not add `native wheat starch` as an alias or display: this review covers one manufacturer's native product and substitution statement only. |
| Adjacent starch references | The catalog separately owns modified wheat starch, pregelatinized wheat starch, resistant wheat starch, and cornstarch. Their names and search terms remain separate; the existing CFIA source `WP02-S109` also lists wheat starch separately from wheat flour and wheat meal. | Do not transfer Lantmännen's native-product claim to modified, pregelatinized, resistant, or other starch products. Do not infer which flour identity is meant. |
| Research ledger | The target row is `verified`; measurement is `researched_supported` with R558's 10 g Health Canada C.10 nutrition-labelling observation; substitution is `not_yet_researched` with no findings. R558 does not provide a recipe or substitution measure. | Preserve identity and measurement evidence. Append only the source, blocked finding, and decision shown below; update only substitution research state. |
| Forms, rules, and yields | No form references the four wheat-starch identities. `substitution-rules.v1.json` and `contextual-substitution-rules.v1.json` are empty. The single package-yield record is unrelated and no package yield applies to wheat starch. | Keep forms, rules, conversions, yields, and recipe-line substitutions unchanged. |
| Source ownership | Before drafting, the exact Lantmännen page URL and proposed source ID `WP02-A7-WHEAT-STARCH-SUBSTITUTION-R845-20261019-S01` had no owner in the active ledger or proposal/batch archive. The finding ID `wheat-starch-lantmannen-lower-gluten-flour-replacement-lead-r845-20261019` and R845 proposal path were also unused. | Treat both IDs as proposal-local until root integration. |
| Latest integration | The [R842–R844 integration README](../batches/wp02-wp03-wp04-r842-r844-gap-review-integration-20261019/README.md) records the cracked-rye porridge finding, Fruity Cheerios identity/portion, and Atlantic mackerel portions. The A7 parent remains open. | R845 concerns wheat starch and has no overlap with R842–R844. |

**Selection audit:** R558 reviewed the Health Canada C.10 reference amount only. The nearby R121/R122 and R187/R199 reviews concern modified, resistant, pregelatinized, or waxy wheat-starch identity and product boundaries; none reviews the ordinary wheat-starch row's substitution evidence. No prior A7 proposal or integration record was found for that dimension.

### Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) searches active names, aliases, and attached forms; it does not index research-ledger findings. The current phrase-first projection is:

| Query | Current result | Projected result |
|---|---|---|
| `wheat starch` | Ordinary, modified, pregelatinized, and resistant wheat-starch references | Unchanged |
| `amidon de blé` | Ordinary, modified, and pregelatinized wheat starch | Unchanged |
| `amidon de froment` | Ordinary wheat starch only | Unchanged |
| `native wheat starch` | No result | Unchanged |

Do not add an alias that could change the broad wheat-starch result set. The proposed blocked finding will not appear in the picker or activate runtime behavior.

### Bundled recipe demand

Parsed all **114** recipe files listed in the current bundled-library manifest and all **1,123** structured ingredient rows. Searched serialized recipe text and ingredient rows for `ingredient-ref-wheat-starch`, `wheat starch`, `amidon de blé` (including accent-folded `amidon de ble`), and `amidon de froment`. Found no target links or name hits. There is no bundled recipe context to resolve the unspecified flour or amount; add no recipe link or recipe change.

## Primary-source evidence and limits

| Proposal-local source handle | Source and direct evidence | Limits retained |
|---|---|---|
| `WP02-A7-WHEAT-STARCH-SUBSTITUTION-R845-20261019-S01` | Lantmännen Biorefineries, [Native wheat starch](https://www.lantmannenbiorefineries.com/food-ingredients/products/food-starch/native-wheat-starch/), current official manufacturer page; accessed 2026-10-19. Under “Native wheat starch,” the page describes baked-goods uses and says that when flour with a lower gluten content is beneficial, part of the flour can be replaced by wheat starch. | The page names Lantmännen's native wheat starch but not the base flour, its catalog identity, a quantity, ratio, baking formula, or method. It is ingredient-supplier guidance, not a household recipe or an independent test. Do not generalize it to other starch grades, products, or recipes. |

The source's purpose is to lower the gluten content of some baked goods. It does not say whether the unspecified flour is all-purpose, bread, pastry, or another flour, and “part” supplies no usable amount or proportion. Even though the catalog contains `ingredient-ref-all-purpose-flour`, mapping this statement to that row would be an unsupported assumption. The source also does not support a same-weight or same-volume replacement, liquid adjustment, or baking result beyond its stated gluten-content goal.

## Proposal-only ledger delta

At integration, append this source to the existing `ingredient-ref-wheat-starch` record. The ID remains proposal-local until root accepts it:

```json
{
  "sourceId": "WP02-A7-WHEAT-STARCH-SUBSTITUTION-R845-20261019-S01",
  "url": "https://www.lantmannenbiorefineries.com/food-ingredients/products/food-starch/native-wheat-starch/",
  "title": "Lantmännen Biorefineries, Native wheat starch",
  "accessedOn": "2026-10-19",
  "locator": "Native wheat starch section, baked-goods application statement.",
  "supports": "The manufacturer identifies its food-approved native wheat starch and says that for baked goods requiring flour with a lower gluten content, part of the flour can be replaced with wheat starch. The page does not name the flour or catalog ingredient being replaced, an amount or ratio, a formula, or a method. Keep this as a product-specific blocked lead; do not infer a general or recipe-level replacement.",
  "sourceKind": "manufacturer"
}
```

Append this blocked finding to the same ledger row and set `substitutionResearchState` to `blocked_pending_evidence`. Omit `fromIngredientRefId` and `replacements` because the source does not identify the base flour or a usable replacement amount.

```json
{
  "findingId": "wheat-starch-lantmannen-lower-gluten-flour-replacement-lead-r845-20261019",
  "researchState": "blocked_pending_evidence",
  "context": "Lantmännen Biorefineries' native wheat-starch application statement for baked goods where flour with a lower gluten content is beneficial; no specific flour, formula, or amount is identified.",
  "basis": "The manufacturer explicitly says that part of the flour can be replaced by its wheat starch in this application, but does not identify which flour or quantify the replacement. The lead cannot be mapped to an active flour reference or a usable recipe substitution.",
  "limitations": [
    "Keep the statement scoped to Lantmännen's native wheat starch and the manufacturer's lower-gluten baked-goods application; do not generalize it to modified, pregelatinized, resistant, or other supplier-specific wheat starches.",
    "Do not set a fromIngredientRefId or replacement reference: the source uses only unspecified flour and does not establish that it means all-purpose flour or another active flour identity.",
    "The source gives no amount, proportion, mass/volume basis, formula, or method. Do not infer a ratio, equal-weight or equal-volume replacement, liquid change, or baking adjustment.",
    "Do not add a global or contextual runtime rule, alias, form, measure, conversion, yield, or recipe link; the evidence is an unquantified manufacturer application statement with no bundled recipe match."
  ],
  "sourceIds": [
    "WP02-A7-WHEAT-STARCH-SUBSTITUTION-R845-20261019-S01"
  ]
}
```

Append an accepted decision with the same source ID. Keep the active catalog, R558's measurement observation, adjacent wheat-starch records, and both substitution-rule files unchanged.

```json
{
  "outcome": "accepted",
  "reason": "Record Lantmännen Biorefineries' statement that its native wheat starch can replace part of unspecified flour in baked goods where lower gluten content is beneficial as a blocked, product-specific lead. The page provides no base flour identity, quantity, ratio, formula, or method. Keep substitution research blocked pending evidence that can identify and quantify a safe use; add no replacement, active rule, or catalog behavior.",
  "sourceIds": [
    "WP02-A7-WHEAT-STARCH-SUBSTITUTION-R845-20261019-S01"
  ]
}
```

Reopen this question if a product-matched recipe or technical source identifies the flour being replaced and gives a usable amount or proportion, with the relevant baking context. A general product guide or the current statement alone is not enough to create an active rule.

## Static review checks and retrieval limits

- Read the current `AGENTS.md`, A7 parent and wheat-starch plan anchors, current roadmap entries, catalog workflow, R842–R844 integration README, wheat-starch identity/measurement history, active catalog and ledger records, ledger schema, forms, rules, package yields, search projection, and manifest.
- Checked the official Lantmännen page directly. The exact page is accessible; it gives a product/application statement but no date, named base flour, proportion, recipe, or method. This review uses no household recipe or independent test to fill those gaps.
- Checked the proposed source URL, source ID, finding ID, and proposal path against current ledger and proposal/batch ownership; no prior owner was found.
- Parsed all manifest-listed recipe files and structured ingredient rows; found no wheat-starch reference or name demand.
- Per `AGENTS.md`, database-JSON-only changes do not require software tests. This is proposal-only and makes no active data change, so no software tests, build, emulator run, or deployment were performed. Static checks on the proposal are recorded after drafting.
