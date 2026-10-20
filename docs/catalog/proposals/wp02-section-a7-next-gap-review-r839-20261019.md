# WP02 Section A7 R839 — white whole-wheat flour substitution evidence

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, workflow, generated index, or recipe file was changed.
- **Plan anchor:** The open Section A7 parent remains “Continue A7 review of other grain meals (including the unresolved wheat-meal candidate) and milling products” ([plan line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). The checked R824 child records only King Arthur Baking’s shared flour portion for the existing white whole-wheat row ([plan line 2291](../../RecipeBook-global-ingredient-catalog-plan.txt#L2291)); R824 deliberately left substitution research open. This proposal reviews that separate, still-unresearched substitution dimension for `ingredient-ref-white-whole-wheat-flour`. It does not overlap R833 granular flour, R836 emmer semolina, R809 durum semolina, R827–R829, or the R836–R838 integration batch.

## Recommendation

On the existing `ingredient-ref-white-whole-wheat-flour` ledger row, set `substitutionResearchState` to `researched_supported` and add one narrowly scoped, evidence-only finding for King Arthur Baking’s direction: use its white whole-wheat flour to replace up to 50% of the all-purpose flour in favorite baked recipes.

Keep the direction explicit: `ingredient-ref-all-purpose-flour` → `ingredient-ref-white-whole-wheat-flour`. The guide names white whole-wheat flour, rather than generic whole-wheat flour, and the all-purpose-flour target. Its 50% ceiling has no stated mass or volume basis. Retain that limitation in prose; do not infer a one-for-one ratio, reverse direction, or broader substitution rule.

Do not activate a global or contextual rule. The guide is general baking guidance and does not define an enforceable dish/method scope or source/target quantity basis. No catalog reference, alias, form, measurement, recipe link, or active rule change is proposed.

## Identity, prior-work boundary, and source

The active target is `ingredient-ref-white-whole-wheat-flour`, category `FLOUR_AND_STARCH`, displayed as **white whole-wheat flour / farine intégrale de blé blanc**, with the existing English alias **hard white whole wheat flour**. The target is distinct from generic `ingredient-ref-whole-wheat-flour`. The existing target ledger row has verified identity, `researched_supported` measurement status, one R824 shared-recipe portion observation, and `not_yet_researched` substitution status.

The WP08 findings `WP08-WHEAT-20261010-F05` and `WP08-WHEAT-20261010-F12` concern generic whole-wheat flour and explicitly keep King Arthur Golden Wheat product evidence from being generalized to that generic identity. R839 does not revise either finding. King Arthur’s current [Baking with Whole Grains guide](https://www.kingarthurbaking.com/learn/guides/whole-grains) separately names white whole-wheat flour, links that section to its Golden Wheat product, and gives the all-purpose-flour direction directly. This supports recording the source-bounded finding on the white whole-wheat row only; it does not make Golden Wheat a catalog alias or establish equivalent behavior across every brand.

| Proposed source ID | Primary source | Evidence and limit |
| --- | --- | --- |
| `WP02-A7-WHITE-WHOLE-WHEAT-SUB-R839-20261019-S01` | King Arthur Baking, [Baking with Whole Grains](https://www.kingarthurbaking.com/learn/guides/whole-grains), wheat section and “Getting started” advice. | The guide describes white whole-wheat flour and recommends it for replacing up to 50% of all-purpose flour in favorite recipes. It says the difference is slight aside from darker color in light-colored baked goods, and separately says no liquid adjustment is needed; a 20–30 minute rest can ease yeast-dough stickiness. The page does not state whether the 50% is measured by mass or volume, identify a tested recipe formula, or support another brand’s product. |

The page was opened on 2026-10-19. Its English title is `Baking with Whole Grains`; the linked white-whole-wheat item is King Arthur’s product. The source ID and exact URL above have no current ledger owner, so no source record is reused or duplicated.

## Catalog, picker, rule, and recipe audit

| Surface | Current state and proposed effect |
| --- | --- |
| Identity and alias ownership | One reference owns the target ID, English/French displays, and `hard white whole wheat flour`. `ingredient-ref-whole-wheat-flour` separately owns generic whole-wheat flour. Keep all names and aliases unchanged; do not add `Golden Wheat` as a generic alias. |
| Ledger and source ownership | The target row has one measurement observation from R824 and no substitution findings. Its substitution state is `not_yet_researched`. The new finding ID `white-whole-wheat-flour-kab-whole-grains-partial-ap-substitution-r839-20261019` is absent. The proposed source ID and URL are absent from the shared ledger. |
| Forms and measurements | No form is attached to the target. `defaultDensity` is null and `unitMappings` is empty. Preserve the existing R824 observation; add no measurement data or form. |
| Active substitution rules | `substitution-rules.v1.json` and `contextual-substitution-rules.v1.json` each contain zero rules and no target mention. Add no active rule. |
| Picker projection | Reproducing the current phrase-first search in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), `white whole wheat flour`, `white whole-wheat flour`, `hard white whole wheat flour`, `farine intégrale de blé blanc`, and accent-folded `farine integrale de ble blanc` each return only the target. `whole wheat flour` returns generic whole-wheat, white whole-wheat, and sprouted whole-wheat flour; `all-purpose flour` and `farine tout usage` each return only all-purpose flour. No picker terms change. |
| Bundled recipe demand | A manifest-driven scan of all 114 recipe files and 1,123 ingredient rows (1,097 with `ingredientRefId`) found no link to the target and no text hit for its displays/aliases or `Golden Wheat`. No recipe link or recipe edit is proposed. |

## Exact proposed ledger delta

Apply only to `records[]` where `recordId == "ingredient-ref-white-whole-wheat-flour"`. Retain the identity, measurement state, R824 source/observation, active catalog, and all other ledger records unchanged.

```json
{
  "replace": {
    "substitutionResearchState": "researched_supported"
  },
  "addSource": {
    "sourceId": "WP02-A7-WHITE-WHOLE-WHEAT-SUB-R839-20261019-S01",
    "url": "https://www.kingarthurbaking.com/learn/guides/whole-grains",
    "title": "King Arthur Baking, Baking with Whole Grains",
    "accessedOn": "2026-10-19",
    "locator": "Wheat section describing white whole-wheat flour; Getting started advice on partial replacement of all-purpose flour, color, liquid, and yeast-dough rest.",
    "supports": "King Arthur Baking's guide recommends using white whole-wheat flour to replace up to 50% of the all-purpose flour in favorite recipes. It describes a slight difference apart from darker color in light-colored baked goods. The guide separately says no liquid adjustment is needed and that an optional 20–30 minute rest can ease yeast-dough stickiness. The percentage has no stated mass-or-volume basis; the guide is not a tested formula or cross-brand product comparison.",
    "sourceKind": "test_kitchen"
  },
  "addSubstitutionFinding": {
    "findingId": "white-whole-wheat-flour-kab-whole-grains-partial-ap-substitution-r839-20261019",
    "researchState": "researched_supported",
    "fromIngredientRefId": "ingredient-ref-all-purpose-flour",
    "replacements": [
      {
        "ingredientRefId": "ingredient-ref-white-whole-wheat-flour"
      }
    ],
    "context": "King Arthur Baking's whole-grain baking guidance: use its white whole-wheat flour for up to 50% of the all-purpose flour in favorite baked recipes.",
    "basis": "The source gives an upper limit of 50% but does not say whether that percentage is by mass or volume. No equal mass, equal volume, or other replacement ratio is inferred.",
    "adjustments": [
      "The guide says no liquid adjustment is needed; it notes that a 20–30 minute rest can ease yeast-dough stickiness."
    ],
    "expectedEffects": [
      "The guide describes the difference as slight, except for somewhat darker color in light-colored baked goods."
    ],
    "limitations": [
      "Keep this finding scoped to white whole-wheat flour; WP08's generic whole-wheat findings remain unchanged.",
      "The source is King Arthur Baking guidance linked to its Golden Wheat product. Do not generalize the result to every brand or add Golden Wheat as an alias.",
      "The source supports a partial substitution only, up to 50%; it does not support full replacement or the reverse direction.",
      "The source does not state a mass or volume basis for the 50% ceiling, identify a tested formula, or define a runtime-enforceable dish/method scope. Keep this evidence in the ledger and add no active substitution rule."
    ],
    "sourceIds": [
      "WP02-A7-WHITE-WHOLE-WHEAT-SUB-R839-20261019-S01"
    ]
  },
  "addDecision": {
    "outcome": "accepted",
    "reason": "Complete the still-open substitution-evidence review for white whole-wheat flour with King Arthur Baking's direct, partial replacement guidance. Preserve the direction and 50% ceiling, distinguish the source's white whole-wheat product from generic whole-wheat flour, and add no runtime rule because the quantity basis and enforceable recipe context are unspecified.",
    "sourceIds": [
      "WP02-A7-WHITE-WHOLE-WHEAT-SUB-R839-20261019-S01"
    ]
  }
}
```

## Static checks and scope

- Read the current `AGENTS.md`, A7 checklist, roadmap, catalog workflow, R824–R826 and R833–R838 integration notes, the active target and neighboring catalog/ledger rows, forms, both rule files, picker implementation, and manifest-listed recipes before selecting this gap.
- Reopened King Arthur Baking’s current guide. Confirmed its direct white-whole-wheat to all-purpose direction, maximum partial replacement, color note, and liquid/rest guidance. Checked the wording against the older WP08 generic whole-wheat findings and did not broaden those findings.
- Confirmed one active target reference, no attached forms or active rules, current search results, the R824 observation, and no target demand in the 114 manifest-listed recipes. Checked that the proposed source ID, URL, and finding ID have no current ledger owner.
- The deliverable is proposal-only Markdown. If accepted, the only database edit proposed is source and substitution evidence in the research-ledger JSON. Under `AGENTS.md`, a database-JSON-only change needs no software tests, build, emulator run, or deployment; none were run for this review.
