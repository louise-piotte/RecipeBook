# WP02 Section A7 R842 — cracked-rye porridge alternative review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated into the bundled research ledger as a source-scoped finding; no active substitution rule or catalog behavior was added. See the [R842–R844 integration README](../batches/wp02-wp03-wp04-r842-r844-gap-review-integration-20261019/README.md).
- **Plan anchor:** The A7 parent remains open to review of other grain meals and milling products in the [global catalog plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289). R646 completed a separate cracked-rye measurement review at [plan lines 2401–2405](../../RecipeBook-global-ingredient-catalog-plan.txt#L2401); its ⅓ cup (70 g) Pumpkin Rye Scones observation does not resolve this substitution dimension.
- **Target:** Existing `ingredient-ref-cracked-rye` (`cracked rye / seigle concassé`).
- **Scope:** Review one official Janie’s Mill porridge formula that explicitly permits either its cracked wheat or cracked rye. This is distinct from R646’s Pumpkin Rye Scones measurement and R713’s cracked-wheat-to-wheat-germ finding in Fleischmann’s loaf.

## Recommendation

**Record one source-scoped substitution finding on the existing `ingredient-ref-cracked-rye` ledger row.** Janie’s Mill says its hot breakfast cereal is equally good with its Organic Cracked Wheat or Cracked Rye; the ingredient line lists 1 cup of either product, and the directions use either under the same cooking method.

At integration, append the source and finding shown below, add an accepted source-bounded decision, and set the target row’s `substitutionResearchState` to `researched_supported`. Preserve the existing identity and measurement evidence. The 1 cup quantity is part of this named formula only. Do not treat it as a reusable 1:1 volume conversion, a mass equivalence, or evidence about products from other mills.

Add no active substitution rule, catalog alias, form, measurement observation, density, unit mapping, cooking yield, package yield, recipe link, or bundled recipe edit. Keep the active cracked-rye and cracked-wheat identities separate.

## Current ownership and archive audit

| Surface | Current state | R842 disposition |
|---|---|---|
| Active references | `ingredient-ref-cracked-rye` is `cracked rye / seigle concassé`, and `ingredient-ref-cracked-wheat` is `cracked wheat / blé concassé`; both are `GRAIN_AND_CEREAL`. Both have empty alias arrays, null `defaultDensity`, and empty `unitMappings`. | Keep both distinct and unchanged. The recipe’s one-product alternative does not make either grain a synonym or alias for the other. |
| Cracked-rye ledger row | Identity is `verified`; measurement is `researched_supported` with R646’s one Janie’s Mill Pumpkin Rye Scones observation (`⅓ cup (70 g)`); substitution is `not_yet_researched` with no findings. | Preserve R646’s observation and all existing sources. Do not transfer its scone amount or mass to this porridge formula. Add only this source, finding, and decision; update only the substitution research state. |
| Cracked-wheat ledger row | The separate row is `verified`, with R650’s King Arthur portion and R713’s Fleischmann’s wheat-germ finding. R713 concerns wheat germ as an alternative for cracked wheat in a named loaf and has no bearing on the current Janie’s Mill formula or on the cracked-rye target row. | Leave the cracked-wheat row and R713 finding unchanged. Do not add cracked rye as a cracked-wheat alias or modify R713. |
| Forms, mappings, rules, and yields | No active form or package-yield record references either cracked-grain identity. The same-ingredient and contextual substitution-rule files each contain zero rules. | Keep forms, mappings, active rules, yields, and recipe-line substitution links unchanged. |
| Source and identifier ownership | Before drafting, the exact porridge URL, proposed source ID `WP02-A7-CRACKED-RYE-SUBSTITUTION-R842-20261019-S01`, and finding ID `cracked-rye-cracked-wheat-janies-mill-porridge-r842-20261019` had no owner in the active ledger or prior A7 proposal/batch archive. The proposed R842 file path was also absent. | Treat the source and finding IDs as proposal-local until root integration. |
| Latest integrated batch | The [R839–R841 integration](../batches/wp02-wp03-wp04-r839-r841-gap-review-integration-20261019/README.md) covers white whole-wheat substitution, couscous forms, and Atlantic cod portions. | R842 is a separate A7 substitution dimension on cracked rye; no overlap with those integrated items. |

## Primary-source evidence and limits

| Proposal-local source handle | Source and direct evidence | Limits retained |
|---|---|---|
| `WP02-A7-CRACKED-RYE-SUBSTITUTION-R842-20261019-S01` | Janie’s Mill, [Hot Breakfast Cereal (porridge) with Cracked Wheat or Rye](https://www.janiesmill.com/blogs/recipes/cracked-wheat-or-cracked-rye-porridge), official mill recipe page, posted 2020-10-18; accessed 2026-10-19. The introduction says the recipe is equally good with Janie’s Mill Organic Cracked Wheat or Cracked Rye. The ingredient list gives “1 cup” of Janie’s Mill Cracked Wheat or Cracked Rye, and the instructions add either grain and simmer for 15–20 minutes. | Supports the two named Janie’s Mill options in this porridge formula only. It does not state a mass equivalent, document product granulation equivalence across suppliers, or recommend a general replacement across recipes. It supplies no Québec French name. |

This is direct evidence for retaining the source’s alternative in the named formula. The source prints one shared 1-cup amount for the either/or ingredient line; that amount stays attached to this recipe context and does not establish an active unit conversion or generic substitution ratio. The page does not explain whether the two products have matching particle size or an identical cooking result outside this recipe.

## Bundled recipe demand scan

Parsed all **114** recipe files listed in the current bundled-library manifest and all **1,123** structured ingredient rows. Scanned recipe content and ingredient rows for both reference IDs and the English/French names, including accent-folded `seigle concassé` and `blé concassé`. Found no target references or matching name phrases. The Janie’s Mill formula is external evidence only; add no bundled recipe line, source recipe link, or recipe text.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) builds picker search from active reference names, aliases, and attached forms. The proposal changes only research-ledger evidence, so search results remain unchanged:

| Query | Current result | Projected result |
|---|---|---|
| `cracked rye`; `seigle concasse` | `ingredient-ref-cracked-rye` | Unchanged |
| `cracked wheat`; `ble concasse` | `ingredient-ref-cracked-wheat` | Unchanged |
| `cracked` | Both cracked-grain references | Unchanged |

The ledger finding will not appear in the picker or activate a runtime substitution. Do not add either name as an alias of the other.

## Proposal-only ledger delta

At integration, append this source to the `ingredient-ref-cracked-rye` record. The ID remains proposal-local until accepted:

```json
{
  "sourceId": "WP02-A7-CRACKED-RYE-SUBSTITUTION-R842-20261019-S01",
  "url": "https://www.janiesmill.com/blogs/recipes/cracked-wheat-or-cracked-rye-porridge",
  "title": "Janie's Mill, Hot Breakfast Cereal (porridge) with Cracked Wheat or Rye",
  "versionOrDate": "Posted 2020-10-18",
  "accessedOn": "2026-10-19",
  "locator": "Introductory note, ingredient list, and cooking instructions.",
  "supports": "The official recipe page says the porridge is equally good with Janie's Mill Organic Cracked Wheat or Cracked Rye. Its ingredient line gives 1 cup of either product, and the instructions add either and simmer for 15–20 minutes. This supports a source-scoped option in this named formula only; it does not establish a mass equivalent, a cross-supplier grind match, or a general substitution rule.",
  "sourceKind": "culinary_reference"
}
```

Append this finding to the same cracked-rye row and set `substitutionResearchState` to `researched_supported`. The replacement quantity retains the source’s 1-cup formula amount; it is not a reusable conversion.

```json
{
  "findingId": "cracked-rye-cracked-wheat-janies-mill-porridge-r842-20261019",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-cracked-rye",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-cracked-wheat",
      "quantity": {
        "amount": 1,
        "unit": "cup",
        "unitConvention": "The source does not specify a cup convention; this is only the amount printed for this formula."
      },
      "roleInCompound": "Janie's Mill Cracked Wheat is the expressly named alternative to Cracked Rye on the same one-cup porridge ingredient line."
    }
  ],
  "context": "Only Janie's Mill's Hot Breakfast Cereal (porridge) with Cracked Wheat or Rye formula; the ingredient list gives one cup of Janie's Mill Cracked Wheat or Cracked Rye, followed by the same 15–20-minute simmer directions.",
  "basis": "Janie's Mill says this recipe is equally good with its Organic Cracked Wheat or Cracked Rye and lists the same one-cup amount for either option.",
  "limitations": [
    "Keep this alternative within the named Janie's Mill porridge formula and its named products; do not generalize it to other recipes, dish roles, suppliers, or cracked-grain products.",
    "The one-cup amount is source-specific to this formula. Do not infer a reusable 1:1 volume conversion, equal mass, density, or a gram amount. Do not transfer R646's separate Pumpkin Rye Scones observation to this formula.",
    "The source does not establish equivalent granulation, a shared product specification, or identical results outside this formula.",
    "Do not add a global or contextual runtime rule: the evidence is tied to this named external recipe and its specific products.",
    "Do not add aliases, forms, conversions, yields, or a bundled recipe link. The source provides no Québec French wording for the alternative."
  ],
  "sourceIds": [
    "WP02-A7-CRACKED-RYE-SUBSTITUTION-R842-20261019-S01"
  ]
}
```

Append an accepted decision with the same source ID. Keep the active catalog, the cracked-wheat ledger row, the measurement observation, and both substitution-rule files unchanged.

```json
{
  "outcome": "accepted",
  "reason": "Record Janie's Mill's Cracked Wheat only as an alternative to its Cracked Rye option in the named hot-breakfast-cereal formula. The page lists one cup of either product, but that amount is limited to the printed formula and does not establish a reusable conversion, mass equivalence, cross-supplier grind match, or general replacement rule. Keep the finding in the research ledger only.",
  "sourceIds": [
    "WP02-A7-CRACKED-RYE-SUBSTITUTION-R842-20261019-S01"
  ]
}
```

## Static review checks and limits

- Read the current `AGENTS.md`, A7 plan anchor, roadmap entries, catalog workflow, latest R839–R841 integration README, relevant R646 and R713 records, active reference/form/rule/package-yield files, ledger schema and rows, picker search implementation, and bundled manifest.
- Checked the exact source URL, source ID, finding ID, and proposal path against the active ledger and A7 proposal/batch archive; no existing owner was found.
- Recounted the manifest-listed recipe corpus and structured ingredient rows; the 114 recipe files and 1,123 ingredient rows contain no cracked-rye or cracked-wheat IDs or name hits.
- Projected phrase-first picker behavior from the current reference names, aliases, and forms. No active search term changes are proposed.
- This proposal does not edit database JSON. No software tests, build, emulator run, or deployment were needed or run under the data-only exception in `AGENTS.md`. Static checks on this proposal are recorded after drafting.
