# WP02 Section A7 R692: roasted-wheat-flour substitution review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated on 2026-10-18 as source-scoped substitution research on the existing ledger row. No active rule or picker behavior changed. See the [R692–R694 integration README](../batches/wp02-wp03-wp04-r692-r694-gap-review-integration-20261018/README.md).
- **Plan anchor:** The A7 checklist remains open for review of other grain meals and malted or toasted flours ([plan, line 2115](../../RecipeBook-global-ingredient-catalog-plan.txt#L2115)).
- **Target:** Existing `ingredient-ref-roasted-wheat-flour`, displayed `roasted wheat flour / farine de blé torréfiée`.
- **Selection audit:** R659 reviewed measurement only and explicitly left substitution research open. R674 concerns the unresolved whole-wheat-meal candidate; R689 concerns whole-grain oat-flour cookie guidance. No earlier A7 proposal reviewed substitution evidence for this target row. Identity and French-display reviews do not resolve this substitution question.

## Recommendation

Record the Québec mill’s statement that this product may be combined with other white flours as a **blocked, source-scoped blending lead** on the existing target ledger row. The statement names no particular partner flour, formula, proportion, or replacement method. It is not enough to support a reusable or recipe-level substitution rule.

Propose a ledger-only update:

1. Set `substitutionResearchState` to `blocked_pending_evidence`.
2. Refresh the two existing product-page source records, `WP02-S126` and `WP02-S127`, to capture the combination statement and its limits.
3. Append the R692 blocked finding below, using only those existing source IDs.
4. Keep the active catalog, measurement observations, forms, mappings, rules, recipe links, and picker behavior unchanged. Add no `replacements` array and no active rule.

Reopen only if a product-matched recipe or technical source identifies the white-flour partner, formula role, and usable proportion or method.

## Current product evidence

The current English and French pages from Les Moulins de Soulanges identify the same Québec roasted-wheat-flour product. Each says that combining it with other types of white flour increases nutritional values and protein. They also describe flavor, aroma, handling, and suggested bakery applications. Neither page names the other flour, reports a specific formula, gives a ratio, nor says that the roasted product can replace another flour at a stated amount.

| Existing source | Current evidence and limit |
|---|---|
| `WP02-S126` — Les Moulins de Soulanges, [Roasted Wheat Flour](https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/), product description and suggested uses, accessed 2026-10-18. | The page describes flavor/aroma and handling, suggests sourdough bread, baguette, pie, and brioche, and says combining the product with other types of white flour increases nutritional values and protein. It names no partner, formula, proportion, or replacement method, and gives no recipe quantity, serving size, package amount, mass-to-volume pair, density, or measurement method. |
| `WP02-S127` — Les Moulins de Soulanges, [Farine de Blé Torréfié](https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/), product description and suggested uses, accessed 2026-10-18. | The French page describes flavor/aroma and handling, suggests Miche Campagnarde, baguette, pie, and brioche, and repeats the combination statement. It gives no recipe quantity, serving size, package amount, mass-to-volume pair, density, or measurement method, and identifies no blend partner, proportion, or replacement method. Preserve the catalog’s Québec French display `farine de blé torréfiée`; the manufacturer’s page heading does not create a new alias. |

The reviewed pages are current manufacturer sources. Their wording supports co-use only; it does not establish a substitution relationship or an active quantity. Do not transfer baking proportions from ordinary wheat flour, malted wheat flour, roasted wheat-malt flour, or roasted barley flour.

## Pre-integration ownership, picker, and recipe-demand audit

| Surface | Live state and effect of the proposal |
|---|---|
| Active reference | `ingredient-ref-roasted-wheat-flour`; category `FLOUR_AND_STARCH`; no aliases; `defaultDensity: null`; `unitMappings: []`. Keep the Québec bilingual display and all fields unchanged. |
| Research ledger at the proposal snapshot | Identity `verified`; measurement `researched_no_supported_value`; substitution `not_yet_researched`; zero measurement observations and zero substitution findings before R692. The proposal changes only substitution research evidence/state. |
| Source ownership | `WP02-S126` and its English URL are owned by `ingredient-ref-roasted-wheat-flour` only. `WP02-S127` and its French URL are owned by that row only. Reuse and refresh them; add no duplicate source ID or URL. The manufacturer’s broader functional-ingredients URL is owned by the separate roasted-quinoa-flour ledger row and is not copied or used for this target. |
| Adjacent owners | Malted wheat flour, roasted wheat-malt flour, roasted barley flour, general wheat flours, whole-wheat meal, and the separate toasted/roasted products keep their existing identities. No proposed alias moves between them. |
| Forms and rules | No form, global substitution rule, contextual substitution rule, or package-yield entry references this target. Keep all absent. |
| Picker | Using the current `IngredientSearch.kt` phrase and substring behavior, `roasted wheat flour` and accent-folded `farine de blé torréfiée` each return only this row. Broad `wheat flour` returns 27 rows and `farine de blé` returns 30; both include this row. `toasted wheat flour` returns no row. Since the proposal is ledger-only, every picker result remains unchanged. |
| Bundled recipes | Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows, including serialized recipe text and reference IDs. There are zero direct target-ID links and zero hits for `roasted wheat flour`, `roasted-wheat-flour`, `farine de blé torréfiée`, its unaccented form, or `toasted wheat flour`. The bundle has no product-specific demand or recipe context for a substitution. |

## Proposed ledger delta

Update only `ingredient-ref-roasted-wheat-flour`.

### Substitution state

```json
{
  "substitutionResearchState": "blocked_pending_evidence"
}
```

### Refresh existing source records

Retain the same source IDs, URLs, titles, and source kind. Update the locators and `supports` text so they record the combination statement as well as its limits:

```json
[
  {
    "sourceId": "WP02-S126",
    "url": "https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/",
    "title": "Les Moulins de Soulanges, Roasted Wheat Flour",
    "accessedOn": "2026-10-18",
    "locator": "Product description, white-flour combination statement, suggested uses, and measurement limits.",
    "supports": "The current Québec mill page identifies its roasted wheat flour, describes flavor/aroma and handling, and suggests sourdough bread, baguette, pie, and brioche. It says combining the product with other types of white flour increases nutritional values and protein, but names no partner, formula, proportion, or replacement method. It gives no recipe quantity, serving size, package amount, mass-to-volume pair, density, or measurement method; the uses do not establish a general dose or substitution ratio.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP02-S127",
    "url": "https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/",
    "title": "Les Moulins de Soulanges, Farine de Blé Torréfié",
    "accessedOn": "2026-10-18",
    "locator": "French product description, white-flour combination statement, suggested uses, and measurement limits.",
    "supports": "The current Québec mill page names Farine de Blé Torréfié, discusses its flavor/aroma, handling, and roasting, and suggests Miche Campagnarde, baguette, pie, and brioche. It says combining the product with other types of white flour increases nutritional values and protein, but names no partner, formula, proportion, or replacement method. It gives no recipe quantity, serving size, package amount, mass-to-volume pair, density, or measurement method; the uses do not establish a general dose or substitution ratio. Preserve the catalog display farine de blé torréfiée.",
    "sourceKind": "manufacturer"
  }
]
```

### Append one blocked finding

```json
{
  "findingId": "roasted-wheat-flour-white-flour-combination-r692-20261018",
  "researchState": "blocked_pending_evidence",
  "context": "The Québec mill's general statement that its roasted wheat flour can be combined with other types of white flour; no dish, base flour, formula, or proportion is specified.",
  "basis": "The manufacturer describes co-use and a nutritional/protein benefit, but does not name the other flour or state that the roasted product replaces it. The page supplies no proportion, preparation method, or result for a defined recipe.",
  "limitations": [
    "Treat the claim as a product-specific blending lead only; do not encode a replacement or same-quantity substitution.",
    "Do not infer a partner identity from the generic phrase other types of white flour.",
    "Do not transfer a proportion, density, measure, or baking adjustment from other roasted, malted, or ordinary wheat flours.",
    "Do not activate a global or contextual substitution rule without a product-matched formula and usable method."
  ],
  "sourceIds": [
    "WP02-S126",
    "WP02-S127"
  ]
}
```

Append this accepted ledger decision:

```json
{
  "outcome": "accepted",
  "reason": "The current bilingual Québec-mill pages say the roasted-wheat-flour product may be combined with other white flours but do not name a partner, formula, proportion, or replacement method. Record the manufacturer statement as blocked, source-scoped blending evidence and keep substitution research blocked pending product-matched recipe or technical evidence. Add no replacement, runtime rule, or active catalog behavior.",
  "sourceIds": [
    "WP02-S126",
    "WP02-S127"
  ]
}
```

No `replacements` array, active substitution rule, observation, form, conversion, density, unit mapping, package yield, or recipe link is proposed.

## Identifier and file audit

- `ingredient-ref-roasted-wheat-flour`, `WP02-S126`, `WP02-S127`, and both source URLs already exist and have the single row-scoped ownership shown above.
- The R692 finding ID was searched in the live ledger and proposal archive and is free. No new source ID or source URL is introduced.
- The proposed R692 path was absent before drafting. This proposal is the only file written for this review.

## Integration result

The ledger now records the bilingual manufacturer statement as a blocked, source-scoped blending lead on `ingredient-ref-roasted-wheat-flour`. Source IDs `WP02-S126` and `WP02-S127` were refreshed in place. No replacement, active rule, measurement observation, form, recipe link, or picker behavior was added. Static ledger/package and documentation checks are recorded in the [R692–R694 integration README](../batches/wp02-wp03-wp04-r692-r694-gap-review-integration-20261018/README.md). No software tests, build, emulator run, or deployment were run for this database-JSON change.
