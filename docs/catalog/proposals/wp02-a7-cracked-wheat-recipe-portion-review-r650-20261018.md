# WP02 Section A7 R650: cracked-wheat recipe-portion review

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated. Added one source-specific observation to the existing cracked-wheat ledger record; the active catalog remains unchanged.
- **Plan anchor:** The parent Section A7 item remains open for other grain meals and milling products in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2088).
- **Candidate:** Existing `ingredient-ref-cracked-wheat` (`cracked wheat / blé concassé`). Its identity is verified, while its measurement state is `not_yet_researched` and it has no measurement observations.
- **Scope:** Record one published recipe portion on the existing ledger row. Do not add an active measure, density, mapping, conversion, form, alias, recipe link, yield, or substitution.
- **Distinctness:** R646 covers cracked rye and R647 covers cornmeal. R650 covers the still-unresearched measurement of the separate cracked-wheat identity. It does not reopen R605's toasted stone-cut wheat-meal hold, R624/R628's wheat-germ/bran work, or the Scottish oatmeal and semolina reviews.

## Recommendation

Update only the `ingredient-ref-cracked-wheat` research-ledger record:

1. Change `measurementState` from `not_yet_researched` to `researched_supported` to reflect the narrow source observation below.
2. Add King Arthur Baking's Test Kitchen recipe as one source and append one `portion_weight` observation for the ingredient line **1/4 cup (39 g) cracked wheat**.
3. Append an accepted, source-bounded decision. Leave `identityState: verified` and `substitutionResearchState: not_yet_researched` unchanged.

**Active numeric behavior supported:** none. The source supports a published ingredient amount in one formula only. It does not establish a reusable cup measure, fill method, product or grind equivalence, density, unit mapping, conversion, per-serving quantity, or cooking yield.

## Source evidence and limits

| Source | Evidence | Limits |
|---|---|---|
| King Arthur Baking Test Kitchen, [Harvest Wheat Bread for the Bread Machine](https://www.kingarthurbaking.com/recipes/harvest-wheat-bread-for-the-bread-machine-recipe), updated July 1, 2022; accessed 2026-10-18 | The ingredient list prints **1/4 cup (39 g) cracked wheat**. The page names King Arthur Test Kitchen as recipe author, gives a yield of one 8 1/2-inch by 4 1/2-inch loaf, and instructs the cook to combine the cracked wheat with boiling water and let it soften for 30 minutes. | The page gives no cracked-wheat brand, particle-size specification, cup-fill method, or separate weighing procedure. Record the printed amount as a recipe-specific published portion. Do not scale it to a general cup weight or infer density, conversion, or a cooking yield. The English wording is not new Québec French terminology evidence. |
| Existing ledger source `WP02-S101`, [Canadian Food Compositional Standards, standard 12.1.7](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | The current cracked-wheat identity review records the federal definition and its distinction between cracked wheat and crushed/coarse-ground wheat. | Reuse this existing source for the identity boundary; do not add a duplicate source record or treat King Arthur's recipe as a product specification. |

The King Arthur page uses the active English display phrase `cracked wheat`, so its formula amount can be recorded on the existing identity as a source-specific observation. The source does not show whether its ingredient meets any narrower particle-size or sieve criterion. Keep the measurement limited to the wording and formula actually published.

The prior Dalia review's 40 g nutrition serving is not a cracked-wheat observation: that listing describes whole wheat as coarsely ground, and the ledger records it as outside this identity's measurement evidence. Preserve that earlier boundary and do not reuse or combine its value with the King Arthur amount.

## Ownership, picker, and recipe-demand audit

| Surface | Current state | R650 disposition |
|---|---|---|
| Active identity and aliases | `ingredient-ref-cracked-wheat` is `cracked wheat / blé concassé`, category `GRAIN_AND_CEREAL`, with no aliases, `defaultDensity: null`, and `unitMappings: []`. The active `ingredient-ref-bulgur` remains a distinct `bulgur / boulgour` identity. | Preserve names, category, aliases, density, mappings, and the cracked-wheat/bulgur boundary. Add no ingredient or alias. |
| Ledger and source ownership | The target row is verified with measurement and substitution research both `not_yet_researched`, no measurement observations, and existing identity sources `WP02-S101`–`WP02-S104` plus the Dalia boundary sources. The King Arthur URL, proposed source ID, and observation ID were absent from the active ledger and proposal archive at review time. | Reuse `WP02-S101` for the existing Canadian identity boundary. Add only the R650 source, observation, and decision below. Do not duplicate an existing source. |
| Prior Dalia evidence | `WP03-DALIA-WHEAT-ALIAS-20261012-S02` is the Fortinos/Loblaw listing for Suraj Cracked Wheat Dalia, described as coarsely ground and separately distinguished from cracked wheat in the ledger. | Keep its 40 g serving excluded from this row's observation data. R650 does not add Dalia aliases or alter that boundary. |
| Forms, conversions, substitutions, and package yields | No ingredient form, same-ingredient conversion, contextual substitution, or package-yield entry refers to `ingredient-ref-cracked-wheat`. Density is null and mappings are empty. | Add none. Keep substitution research open; soaking in this recipe does not establish a form conversion or cooking yield. |
| Québec terminology and picker | The active French display remains `blé concassé`, supported by existing French guidance and Ontario mill evidence; independent bilingual Québec review remains pending in the identity packet. The exact active English and French names are owned by the cracked-wheat reference. | Add no French translation or alias. Since the proposal changes only the research ledger, English and French picker results remain unchanged. |
| Bundled recipe demand | Parsed all 114 manifest-listed recipes and 1,123 structured ingredient rows. Found no `ingredient-ref-cracked-wheat` link and no `cracked wheat`, `blé concassé`, or accent-folded `ble concasse` text in the recipe corpus. | The King Arthur formula is external evidence only. Add no bundled recipe line or link. |

The proposal-local IDs are `WP02-A7-CRACKED-WHEAT-R650-20261018-S01` and `cracked-wheat-king-arthur-harvest-bread-quarter-cup-39-g-r650-20261018`. The exact King Arthur URL and both IDs were checked against the ledger and proposal archive before drafting; no R650 proposal filename was present.

## Exact proposed ledger delta

Merge into `recordId: ingredient-ref-cracked-wheat`, retaining all current fields and source entries. Set `measurementState` to `researched_supported`, append this source, append the observation below, and append the decision. No active catalog JSON change is proposed.

```json
{
  "sourceId": "WP02-A7-CRACKED-WHEAT-R650-20261018-S01",
  "url": "https://www.kingarthurbaking.com/recipes/harvest-wheat-bread-for-the-bread-machine-recipe",
  "title": "King Arthur Baking Test Kitchen, Harvest Wheat Bread for the Bread Machine",
  "versionOrDate": "Updated 2022-07-01",
  "accessedOn": "2026-10-18",
  "locator": "Recipe author, yield, ingredient list, and instruction 1",
  "supports": "The King Arthur Test Kitchen ingredient list gives 1/4 cup (39 g) cracked wheat in a formula yielding one 8 1/2-inch by 4 1/2-inch loaf. Instruction 1 combines it with boiling water and lets it soften for 30 minutes. The page gives no brand, particle-size specification, cup-fill method, or separate weighing procedure; this supports only the published formula portion.",
  "sourceKind": "test_kitchen"
}
```

Append this observation. Preserve the source's printed quarter-cup and gram values; do not derive a cup weight, density, or conversion.

```json
{
  "observationId": "cracked-wheat-king-arthur-harvest-bread-quarter-cup-39-g-r650-20261018",
  "relationship": "portion_weight",
  "value": 39,
  "valueUnit": "g",
  "foodDescription": "Cracked wheat as named in King Arthur Test Kitchen's Harvest Wheat Bread for the Bread Machine formula.",
  "foodState": "Unsoaked ingredient as listed; the recipe subsequently combines it with boiling water and lets it soften for 30 minutes.",
  "measurementMethod": "The ingredient list directly prints 1/4 cup (39 g). The page gives no separate weighing procedure or cup-fill method for the cracked wheat.",
  "quantityBasis": "One published formula yielding one 8 1/2-inch by 4 1/2-inch loaf. Keep the pair specific to this source and formula; do not infer a reusable cup measure, product or grind equivalence, density, unit mapping, conversion, per-serving amount, or cooking yield.",
  "sourceQuantity": {
    "amount": 0.25,
    "unit": "cup"
  },
  "observedMassG": 39,
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP02-A7-CRACKED-WHEAT-R650-20261018-S01"
  ]
}
```

Append this decision. Keep `defaultDensity: null`, `unitMappings: []`, and `substitutionResearchState: not_yet_researched` unchanged.

```json
{
  "outcome": "accepted",
  "reason": "Record King Arthur Test Kitchen's published 1/4-cup (39-g) cracked-wheat amount for its Harvest Wheat Bread for the Bread Machine formula only. The page reports no brand, particle-size specification, cup-fill method, or separate weighing procedure, so this is not a reusable cracked-wheat measure, product equivalence, density, unit mapping, conversion, per-serving amount, or cooking yield. Preserve the active bilingual identity and picker behavior, null density, empty mappings, forms, recipe links, and substitution behavior.",
  "sourceIds": [
    "WP02-S101",
    "WP02-A7-CRACKED-WHEAT-R650-20261018-S01"
  ]
}
```

## Static review checks

- Re-read `AGENTS.md`, the relevant `Requirements.md` conversion and substitution rules, the current A7 plan and roadmap, the active reference and ledger row, recipe manifest, forms/rules/yields files, and recent A7 proposal history through R647.
- Reopened King Arthur's current Test Kitchen recipe page. Its ingredient list reports 1/4 cup (39 g); its instruction describes a 30-minute soak; its yield line reports one 8 1/2-inch by 4 1/2-inch loaf. No value was derived from those quantities.
- Audited current identity/alias ownership, existing Dalia and cracked-wheat evidence, proposed source URL and IDs, forms, conversion/substitution rules, package yields, picker impact, and all 114 recipe files / 1,123 ingredient rows.
- Parsed the three proposed JSON fragments, simulated the merge into the current ledger row, and validated it against `research-ledger.schema.json`. UTF-8 without BOM, relative links, whitespace, source/ID ownership, package references, and recipe-demand checks passed. No software tests, build, emulator run, or deployment were needed because this only adds database JSON data under `AGENTS.md`.
