# WP02 Section A7 R695: Scottish oatmeal oatcake substitution review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated on 2026-10-18 as one recipe-scoped ledger finding. No runtime rule, amount, ratio, recipe link, or picker change was added. See the [R695–R697 integration README](../batches/wp02-wp03-wp04-r695-r697-gap-review-integration-20261018/README.md). Ownership details below describe the pre-integration snapshot.
- **Plan anchor:** WP02 Section A7 remains open for further review of grain meals and milling products ([plan, lines 2094–2109](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094)).
- **Target:** Existing `ingredient-ref-scottish-oatmeal`, displayed `Scottish oatmeal / gruau écossais`.
- **Selection and duplicate audit:** R631 recorded a Bob’s Red Mill product-label portion and left this row’s substitution research `not_yet_researched`. The earlier identity review established only the narrow whole-groat, coarse-meal product class. R418/R458 reviewed the separate unresolved `oat grits` and `gruau d'avoine` naming boundary; R678 reviewed rolled oats’ dry/cooked boundary. None reviewed a Scottish-oatmeal substitution for a named oatcake formula. R692 concerns roasted wheat flour; R693–R694 concern WP03 and WP04.

## Recommendation

Record one recipe-scoped, manufacturer-recommended alternative on the existing Scottish-oatmeal ledger row: for Bob’s Red Mill’s *Bob’s Favorite Scottish Oatcakes*, use Old Fashioned Rolled Oats pulsed briefly until coarse, or Quick Cooking Rolled Oats. The source warns that the quick-cooking option may change texture. This directly supports two alternatives for that named formula only.

Propose a ledger-only update:

1. Set `substitutionResearchState` to `researched_supported`.
2. Add the recipe page as one new, uniquely identified source on `ingredient-ref-scottish-oatmeal`.
3. Append the R695 finding below with `ingredient-ref-rolled-oats` and `ingredient-ref-quick-oats` as its replacement owners.
4. Do not record an amount or ratio for either alternative, or add a runtime/global/contextual rule, alias, form, recipe link, or catalog value.

This proposal preserves the Québec French display `gruau écossais`. Reopen any broader substitution only with evidence for the intended dish and preparation method.

## Current primary source

Bob’s Red Mill, [Bob’s Favorite Scottish Oatcakes](https://www.bobsredmill.com/recipes/how-to-make/bobs-favorite-scottish-oatcakes), recipe ingredients, instructions, and FAQ (accessed 2026-10-18; current page, lines 258–320).

The 12-oatcake recipe lists **1½ cups, divided** Scottish Oatmeal and bakes the dough at 325°F for about 25 minutes. In its substitution FAQ, Bob’s Red Mill recommends quickly pulsing Old Fashioned Rolled Oats a few times until coarse, taking care not to turn them into flour. It also says Quick Cooking Rolled Oats can be used, with a possible difference in finished texture. The recipe page says its recommendations are its best options but that not every variation has been tested or can be guaranteed.

The source identifies replacements and processing for this one oatcake formula. It gives no alternate quantity, replacement ratio, hydration change, or outcome guarantee. Do not infer an equal-volume replacement from the 1½-cup target amount.

## Current ownership, picker, and recipe-demand audit

| Surface | Live state and proposal effect |
|---|---|
| Target reference | `ingredient-ref-scottish-oatmeal`; `Scottish oatmeal / gruau écossais`; category `GRAIN_AND_CEREAL`; aliases `Scotch oatmeal` and `Scottish oats`; `defaultDensity: null`; `unitMappings: []`. Preserve these values. |
| Ledger | Identity `verified`; measurement `researched_supported`; substitution `not_yet_researched`; one existing measurement observation; no substitution findings before R695. The proposal adds one source and one substitution finding only. |
| Replacement references | `ingredient-ref-rolled-oats` is `rolled oats / flocons d'avoine` and already has alias `old-fashioned rolled oats`. `ingredient-ref-quick-oats` is `quick oats / flocons d'avoine à cuisson rapide` and has alias `quick-cooking oats`. Keep both active references and their aliases unchanged; the recipe page’s product descriptions are recorded in the finding’s scope. |
| Source ownership | The recipe URL below has no current research-ledger owner and does not appear in the prior A7 proposal archive. Its proposed R695 source ID is free. Existing Scottish-oatmeal sources `WP02-SCOTTISH-OATMEAL-20261011-S01` through `S05` remain owned by the target row and are not duplicated or changed. |
| Forms and rules | No forms are attached to the target or either replacement. No active global or contextual substitution rule references the target. Add none. |
| Picker | Current `IngredientSearch.kt` results: `Scottish oatmeal`, `Scotch oatmeal`, `Scottish oats`, and accent-folded `gruau écossais` each return only the target. Broad `oatmeal` returns four identities; `rolled oats` returns rolled oats and sprouted rolled oats; `quick oats` returns quick oats alone. The ledger-only proposal adds no searchable term, so all results stay unchanged. |
| Bundled corpus | Parsed all 114 manifest-listed recipes and 1,123 ingredient rows, checking serialized recipe data and reference IDs. There are no target-ID hits or mentions of `Scottish oatmeal`, `Scotch oatmeal`, `Scottish oats`, `gruau écossais`, or Scottish oatcakes. This external manufacturer formula does not create a bundled recipe link or recipe demand. |

## Proposed ledger delta

Update only `ingredient-ref-scottish-oatmeal`.

### Substitution state

```json
{
  "substitutionResearchState": "researched_supported"
}
```

### Append one source

```json
{
  "sourceId": "WP02-A7-SCOTTISH-OATMEAL-SUBSTITUTION-R695-20261018-S01",
  "url": "https://www.bobsredmill.com/recipes/how-to-make/bobs-favorite-scottish-oatcakes",
  "title": "Bob's Red Mill, Bob's Favorite Scottish Oatcakes",
  "accessedOn": "2026-10-18",
  "locator": "12-oatcake recipe ingredient list and method; substitution FAQ for Scottish Oatmeal.",
  "supports": "The recipe lists 1 1/2 cups, divided, Scottish Oatmeal. Its FAQ recommends Old Fashioned Rolled Oats quickly pulsed until coarse, or Quick Cooking Rolled Oats, for this oatcake recipe; it notes that the quick-cooking option may yield a different texture. The page does not state alternate quantities or a replacement ratio and says not every variation is tested or guaranteed.",
  "sourceKind": "test_kitchen"
}
```

### Append one finding

```json
{
  "findingId": "scottish-oatmeal-scottish-oatcakes-r695-20261018",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-scottish-oatmeal",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-rolled-oats",
      "roleInCompound": "Bob's Red Mill Old Fashioned Rolled Oats, briefly pulsed in a food processor to a coarse texture; alternative only in Bob's Favorite Scottish Oatcakes."
    },
    {
      "ingredientRefId": "ingredient-ref-quick-oats",
      "roleInCompound": "Bob's Red Mill Quick Cooking Rolled Oats; alternative only in Bob's Favorite Scottish Oatcakes, with possible texture difference."
    }
  ],
  "context": "Bob's Red Mill's 12-oatcake Bob's Favorite Scottish Oatcakes formula, which lists 1 1/2 cups divided Scottish Oatmeal and bakes at 325°F for approximately 25 minutes.",
  "basis": "The manufacturer's recipe FAQ explicitly recommends quickly pulsing Old Fashioned Rolled Oats until coarse, without milling them into flour, or using Quick Cooking Rolled Oats in this recipe. The page notes the quick-cooking option may change the finished texture and that not all variations are tested or guaranteed.",
  "limitations": [
    "Keep both alternatives scoped to Bob's Favorite Scottish Oatcakes; do not generalize to porridge, other oatcakes, or baking recipes.",
    "The source gives no alternate quantity or ratio. Do not infer equal-volume replacement from the listed 1 1/2 cups Scottish Oatmeal.",
    "For Old Fashioned Rolled Oats, preserve the brief pulsing step and coarse endpoint; do not use oat flour as the alternative.",
    "The source warns that Quick Cooking Rolled Oats may change texture and does not guarantee untested variations.",
    "Do not activate a global or contextual substitution rule or create a recipe link from this external recipe."
  ],
  "sourceIds": [
    "WP02-A7-SCOTTISH-OATMEAL-SUBSTITUTION-R695-20261018-S01"
  ]
}
```

Append this accepted decision:

```json
{
  "outcome": "accepted",
  "reason": "Bob's Red Mill's oatcake recipe explicitly recommends briefly pulsed Old Fashioned Rolled Oats or Quick Cooking Rolled Oats as alternatives for its named Scottish oatcake formula. Record these as recipe-scoped research findings only. The source gives no alternate quantity or ratio, cautions that texture may differ for the quick-cooking option, and does not guarantee untested variations. Keep active catalog identities, picker behavior, recipe links, and substitution rules unchanged.",
  "sourceIds": [
    "WP02-A7-SCOTTISH-OATMEAL-SUBSTITUTION-R695-20261018-S01"
  ]
}
```

No measurement observation, conversion, density, unit mapping, form, package yield, recipe link, or active substitution rule is proposed.

## Pre-integration identifier and file audit

- The recipe source URL, R695 source ID, and finding ID were unallocated before integration.
- The target reference and replacement reference IDs already exist and retain their current single owners. No ingredient ID, alias, or source URL ownership is reassigned.
- The R695 proposal path was absent before drafting; the reviewer created this proposal before the integration lead applied the ledger delta.

## Integration result

Added the source and one supported recipe-scoped substitution finding to `ingredient-ref-scottish-oatmeal`; its substitution research state is now `researched_supported`. The existing label-serving observation, reference names and aliases, picker projection, forms, recipe links, and active rules are unchanged. Static package and ledger checks passed. No software tests, build, emulator run, or deployment were run because this update only adds database JSON data under `AGENTS.md`.
