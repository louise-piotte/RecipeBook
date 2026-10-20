# WP02 Section A7 R713 — cracked-wheat substitution evidence review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Proposal only. No shared catalog, ledger, plan, workflow, roadmap, generated file, recipe, or integration record was changed.
- **Plan anchor:** The A7 parent remains open for other grain meals and milling products in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2115).
- **Target:** Existing `ingredient-ref-cracked-wheat` (`cracked wheat / blé concassé`).
- **Scope:** Review one current primary-source, recipe-scoped alternative for cracked wheat. This follows R650's formula-portion review of the same reference, but does not reopen that measurement, cracked-wheat identity, or the separate Wheatlets and durum-flour work in R707 and R710.

## Recommendation

**Record one source-bounded substitution finding on `ingredient-ref-cracked-wheat`:** Fleischmann's official *Cracked Wheat Loaf* page says that wheat germ may replace the cracked wheat ingredient in that recipe.

At integration, attach the one new proposal-local source handle below to the existing ledger row, append the finding, and set `substitutionResearchState` to `researched_supported`. Leave the verified identity, `researched_supported` measurement state, names, aliases, and all active catalog fields unchanged.

This supports only the source-stated option in Fleischmann's one-loaf formula. The ingredient list specifies **1/2 cup cracked wheat**, but the substitution note gives **no amount for wheat germ**. Do not infer equal volume, equal mass, a ratio, preparation or hydration adjustments, or use outside that named formula. Add no active global or contextual substitution rule, recipe link, measure, conversion, form, yield, or picker term.

## Current ownership and archive audit

| Surface | Current state | R713 disposition |
|---|---|---|
| Cracked-wheat reference | `ingredient-ref-cracked-wheat` is `cracked wheat / blé concassé`, category `GRAIN_AND_CEREAL`, with empty alias arrays, null `defaultDensity`, and empty `unitMappings`. | Keep the current identity and fields. Add no alias or form. |
| Replacement reference | `ingredient-ref-wheat-germ` is `wheat germ / germe de blé`, also in `GRAIN_AND_CEREAL`, with empty alias arrays, null density, and empty mappings. | Link it only as the replacement named in this recipe. Keep wheat germ as a distinct ingredient identity; do not merge or cross-alias it with cracked wheat. |
| Neighboring grain boundary | `ingredient-ref-bulgur` (`bulgur / boulgour`) is separate. Existing `WP02-S101`–`WP02-S104` record the Canadian cracked-wheat standard, Canadian French guidance, Arva's product, and OQLF's bulgur distinction. | Preserve the cracked-wheat/bulgur boundary; no terms from this substitution review affect it. |
| Cracked-wheat ledger row | Identity is `verified`; measurement is `researched_supported` with R650's King Arthur formula observation; substitution is `not_yet_researched`, with no substitution findings. | Keep R650's `1/4 cup (39 g)` observation unchanged. Add only the R713 source and finding. |
| Wheat-germ ledger row | Measurement and substitution research are `researched_supported`. R624's existing findings concern wheat germ to wheat bran in King Arthur's Banana Pancakes and wheat germ to sunflower seeds in its Morning Glory Muffins. | Those findings have a different source ingredient and direction; they do not cover wheat germ replacing cracked wheat. No wheat-germ ledger change is proposed. |
| Forms and active rules | No form references either target or replacement. The same-ingredient and contextual substitution rule files contain no applicable rule; the package-yield file contains no entry for either reference. | Keep forms, rules, conversions, yields, and recipe links unchanged. |
| Source and identifier ownership | The exact Fleischmann's recipe URL below has no exact owner in the active research ledger or A7 proposal/batch archive. Proposed source ID `WP02-A7-CRACKED-WHEAT-SUBSTITUTION-R713-20261018-S01` and finding ID `cracked-wheat-wheat-germ-fleischmanns-loaf-r713-20261018` are also unowned there. The R713 proposal path was absent before drafting. | These are proposal-local handles only. No source ID, finding ID, or other shared identifier is allocated here. |
| Related A7 decisions | R650 records cracked wheat's King Arthur formula portion; R646 records a separate cracked-rye portion; R624 records wheat-germ alternatives in two other named King Arthur recipes; R695 records rolled-oat alternatives for one Scottish-oatcake formula; R707 records a blocked Wheatlets application lead. | None evaluates Fleischmann's wheat-germ option for cracked wheat. R695 is the closest precedent for preserving a recipe-specific alternative as a ledger finding without activating runtime rules or inferring a missing amount. |

## Primary-source evidence and limits

| Proposal-local source handle | Source and direct evidence | Limits retained |
|---|---|---|
| `WP02-A7-CRACKED-WHEAT-SUBSTITUTION-R713-20261018-S01` | Fleischmann's, [Cracked Wheat Loaf](https://www.fleischmannsyeast.com/recipe/cracked-wheat-loaf/), official recipe page, ingredients and recipe note; accessed 2026-10-18. The recipe yields one loaf and lists `1/2 cup cracked wheat`. Its note says wheat germ may be substituted for cracked wheat. | The note states no replacement quantity, quantity basis, preparation method, hydration adjustment, or expected result. The page separately gives an all-purpose-flour alternative on the flour line; that flour option does not alter the grain add-in or provide evidence about wheat germ. The source is one brand-owned recipe, not a general substitution guide or independent test of other formulas. It provides no Québec French wording for either ingredient. |

This is direct evidence that the publisher presents wheat germ as an alternative for the cracked-wheat line in this formula. It does not show that wheat germ is an equal-volume or equal-mass replacement. Record no amount for the wheat-germ alternative. Third-party recipe pages and search snippets were not used to extend this source's claim.

## Bundled recipe demand scan

Parsed all **114** recipe files listed by the current bundled-library manifest and all **1,123** structured ingredient rows. Scanned serialized recipe content and ingredient rows for the two reference IDs and relevant English/French wording: `cracked wheat`, `blé concassé` / accent-folded `ble concasse`, `wheat germ`, and `germe de blé` / accent-folded `germe de ble`. Found zero matching files or ingredient rows and zero links to either reference. No bundled recipe demand or recipe-specific user-library line is present; the Fleischmann's page is external evidence only. Add no recipe link or recipe edit.

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) indexes active reference names, aliases, and forms, not ledger findings. This proposal changes only future ledger evidence, so picker results stay unchanged:

| Query | Current result | Projected result |
|---|---|---|
| `cracked wheat`; `blé concassé` | `ingredient-ref-cracked-wheat` | Unchanged |
| `wheat germ`; `germe de blé` | `ingredient-ref-wheat-germ` | Unchanged |
| `wheat`; `blé` | 62 and 67 phrase-first matches, respectively | Unchanged |

Do not add wheat germ as a cracked-wheat alias, since it is an alternative ingredient rather than a name for the same ingredient. The ledger finding will not create a picker suggestion or an active substitution rule.

## Proposal-only ledger disposition

At integration, append this source to `ingredient-ref-cracked-wheat`. The ID is proposal-local and is not yet allocated in the shared ledger:

```json
{
  "sourceId": "WP02-A7-CRACKED-WHEAT-SUBSTITUTION-R713-20261018-S01",
  "url": "https://www.fleischmannsyeast.com/recipe/cracked-wheat-loaf/",
  "title": "Fleischmann's, Cracked Wheat Loaf",
  "accessedOn": "2026-10-18",
  "locator": "Yield, ingredient list, directions 1–2, and recipe note.",
  "supports": "The official one-loaf formula lists 1/2 cup cracked wheat, and the recipe note says wheat germ may be substituted for cracked wheat. The note does not state a wheat-germ quantity or amount basis, preparation method, hydration change, or expected result. Limit this alternative to the named formula; do not infer equal volume, equal mass, a ratio, or broader use.",
  "sourceKind": "culinary_reference"
}
```

Append this finding on the same row and set `substitutionResearchState` to `researched_supported` for the explicit, recipe-scoped alternative. Omit `quantity`; the source does not give one.

```json
{
  "findingId": "cracked-wheat-wheat-germ-fleischmanns-loaf-r713-20261018",
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-cracked-wheat",
  "replacements": [
    {
      "ingredientRefId": "ingredient-ref-wheat-germ",
      "roleInCompound": "Alternative named only for the 1/2 cup cracked-wheat ingredient in Fleischmann's Cracked Wheat Loaf; the source gives no replacement amount or method."
    }
  ],
  "context": "Only Fleischmann's Cracked Wheat Loaf, a one-loaf formula listing 1/2 cup cracked wheat.",
  "basis": "The recipe note explicitly says that wheat germ may be substituted for cracked wheat. It does not state a quantity or how to prepare the replacement.",
  "limitations": [
    "Keep this alternative scoped to the named Fleischmann's formula; do not generalize it to other breads, dish types, roles, methods, or cracked-wheat products.",
    "The source gives no wheat-germ amount or amount basis. Do not infer equal volume, equal mass, or any ratio from the original 1/2 cup cracked wheat.",
    "The source gives no change to soaking, liquid, hydration, mixing, rise, or baking. Do not invent a preparation or process adjustment.",
    "Do not add a global or contextual runtime rule: the current model cannot enforce this named-recipe scope and the replacement amount is unspecified.",
    "Do not add a wheat-germ alias, form, measure, conversion, yield, or bundled recipe link."
  ],
  "sourceIds": [
    "WP02-A7-CRACKED-WHEAT-SUBSTITUTION-R713-20261018-S01"
  ]
}
```

Append an accepted decision with the same source handle, preserving all current identity and measurement data. Keep active substitution rule files unchanged and add no recipe-line substitution.

```json
{
  "outcome": "accepted",
  "reason": "Record Fleischmann's explicit wheat-germ alternative only for its named Cracked Wheat Loaf formula. The page lists 1/2 cup cracked wheat but gives no wheat-germ amount, amount basis, preparation method, or process adjustment. Do not infer equal volume, equal mass, a ratio, or broader use; keep the finding ledger-only with no active substitution rule or recipe link.",
  "sourceIds": [
    "WP02-A7-CRACKED-WHEAT-SUBSTITUTION-R713-20261018-S01"
  ]
}
```

## Review checks and scope

- Read `AGENTS.md`, `Requirements.md`, the current A7 plan item, the active roadmap entries through R710–R712, the active reference package, the research-ledger schema and target/replacement records, and relevant A7 proposals/batches including R624, R646, R650, R695, R707, and R710.
- Rechecked current source and ownership for the Fleischmann's recipe, source handle, finding ID, and proposal path. Confirmed the target and replacement have no active forms or applicable rules.
- Compared projected picker results using the repository's phrase-first ingredient-search behavior; active names and search terms are unchanged.
- Scanned the manifest-listed 114 recipes and 1,123 ingredient rows; no matching demand was found.
- This is a documentation proposal only. No software tests, builds, emulator runs, or deployments were run, and no files outside this proposal were changed by this review.
