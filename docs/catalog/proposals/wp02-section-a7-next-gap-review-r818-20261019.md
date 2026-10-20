# WP02 Section A7 R818 — whole-wheat pastry-flour substitution evidence

- **Reviewed:** 2026-10-19
- **Status:** Proposal only; no shared catalog, ledger, plan, workflow, or generated-index files were changed.
- **A7 anchor:** Section A7 remains open for other grain meals and milling products ([plan, Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2282)). R803 recorded product-scoped measurement evidence for whole-wheat pastry flour but left its substitution research unreviewed. R815 addressed the separate malted-wheat-flour row.

## Recommendation

On the existing `ingredient-ref-whole-wheat-pastry-flour` ledger row:

1. Set `substitutionResearchState` to `researched_supported` and add one source-scoped finding from this row to the active `ingredient-ref-pastry-flour` identity.
2. Refresh the row's existing King Arthur source `WP02A1-S04` to record the current product-use statement for King Arthur Whole Wheat Pastry Graham Flour, SKU 212374. Reuse that source ID and URL; do not add a duplicate.

King Arthur's current product page says the named whole-wheat pastry product can be used **“interchangeably with regular pastry flour.”** This supports a qualitative, product-specific pastry substitution direction. Keep the finding on the ledger; do not add a global or contextual runtime rule because the evidence is tied to one King Arthur product and does not give a quantity or dough adjustment.

Keep the existing bilingual identity, empty aliases, `defaultDensity: null`, empty `unitMappings`, `measurementState: researched_supported`, and its one King Arthur 1 cup (96 g) observation unchanged. The Québec Food Directory's conflicting 1/4 cup (30 g) and 1/3 cup (60 g) fields remain held under R803 and are not used here.

## Identity and substitution boundary

The active target row is `ingredient-ref-whole-wheat-pastry-flour`, **whole-wheat pastry flour / farine de blé entier à pâtisserie**, category `FLOUR_AND_STARCH`. The replacement row is `ingredient-ref-pastry-flour`, **pastry flour / farine à pâtisserie**. Both rows have empty aliases, null density, and empty unit mappings. No identity, English or Québec French label, alias, or category change is proposed.

King Arthur's current manufacturer page identifies its product as **Whole Wheat Pastry Graham Flour**, SKU **212374**. It says the flour is made from the complete wheat kernel, has lower gluten-forming protein than all-purpose flour, and can be used interchangeably with regular pastry flour as a matter of personal taste. Record only the product-to-pastry-flour direction. Do not create `graham flour` as an alias for the target row: a separate active Graham-flour identity owns that phrase.

The finding is limited to the named King Arthur product page's use statement. It does not establish that every brand or milling grade represented by the generic whole-wheat-pastry-flour row performs the same way. It provides no explicit mass or volume ratio, measuring convention, hydration adjustment, or recommendation for bread or other all-purpose-flour applications. Do not infer any of those values from “interchangeably.”

The current King Arthur *Tender Pie Crust* page is useful application context: it lists 2 cups (213 g) of King Arthur Pastry Flour and tells bakers they may substitute whole-wheat pastry flour for an equal amount of “your unbleached white,” suggesting they start with about 1/2 cup until they find a preferred ratio. Since that tip does not name its target as pastry flour, and it is limited to that pie-crust recipe, this review does not treat it as independent proof of a generic 1:1 substitution. It is not added to the ledger source list.

## Existing data and ownership audit

| Surface | Current state and proposed effect |
| --- | --- |
| Target identity | `ingredient-ref-whole-wheat-pastry-flour` owns `whole-wheat pastry flour / farine de blé entier à pâtisserie`; its aliases are empty. Preserve both labels and the separate Graham-flour row. |
| Replacement identity | `ingredient-ref-pastry-flour` owns `pastry flour / farine à pâtisserie`; its aliases are empty. The target finding points to this ID and does not add an alias or reciprocal finding. |
| Measurement | The target ledger row is `researched_supported` with one King Arthur chart observation: 1 cup (96 g) for the named SKU 212374 product. Keep it unchanged. R803 holds the conflicting Québec directory fields; do not add an observation or derive density. |
| Target source ownership | `WP02A1-S04` is the target row's current source for `https://shop.kingarthurbaking.com/items/whole-wheat-pastry-graham-flour`. Refresh that source record in place with the current use statement. The same URL appears on the separate Graham-flour boundary row under its own ID `WP02-A4-GRAHAM-FLOUR-20261011-S04`; leave that row and source untouched. |
| Existing pastry-flour research | The pastry-flour ledger row has a `researched_no_supported_substitute` finding for pastry flour to all-purpose flour in other reviewed uses. It does not cover whole-wheat pastry flour to pastry flour; leave that separate direction and its sources unchanged. |
| Forms and active rules | The package has 199 forms; neither target nor replacement has a form. There are zero global and zero contextual substitution rules mentioning either row. Add no form or active rule. |
| Proposed finding ownership | `whole-wheat-pastry-flour-kab212374-pastry-flour-r818-20261019` is absent from the current ledger. The source URL already belongs to the target row under `WP02A1-S04`; reuse it rather than creating another source ID. No legacy-import candidate owns the reviewed whole-wheat-pastry or regular-pastry names. |
| Picker projection | Current phrase-first, accent-folded results: `whole-wheat pastry flour`, `whole wheat pastry flour`, and `farine de blé entier à pâtisserie` each return the target row only; `pastry flour` returns both the generic pastry row and whole-wheat pastry row by contiguous subphrase; `farine à pâtisserie` returns the generic pastry row only; `graham flour` returns the separate Graham-flour row. No name or alias change is proposed, so every result stays unchanged. |
| Bundled recipe demand | The current manifest has 114 recipe files with 1,123 ingredient-array rows; 1,097 rows carry `ingredientRefId`. A recursive scan found no direct target reference and no normalized full-file or ingredient-row hit for whole-wheat pastry flour, the complete product name, its Québec French display, or the La Milanaise GTIN. The King Arthur pie-crust page is external context, not bundled demand; no recipe link is proposed. |

The recipe scan lowercased and NFKD-normalized each manifest-listed JSON file, folded accents, converted punctuation to spaces, and normalized whitespace using the same behavior as `IngredientSearch.kt`. It separately counted each object in each recipe's `ingredients` array and checked both full files and ingredient rows for the target ID and phrases above.

## Exact proposed ledger delta

Apply to `records[]` entry `recordId == "ingredient-ref-whole-wheat-pastry-flour"`:

```json
{
  "replace": {
    "substitutionResearchState": "researched_supported"
  },
  "reuseAndUpdateSource": {
    "sourceId": "WP02A1-S04",
    "accessedOn": "2026-10-19",
    "locator": "Current product page, SKU 212374: product information and Why You'll Love It use statement.",
    "supports": "Identifies King Arthur Whole Wheat Pastry Graham Flour, SKU 212374, as a whole-kernel whole-wheat pastry flour. The current page says this product can be used interchangeably with regular pastry flour and describes the result as a matter of personal taste. The page gives no amount, mass/volume ratio, or hydration adjustment; this is product-specific evidence only.",
    "sourceKind": "manufacturer"
  },
  "addSubstitutionFinding": {
    "findingId": "whole-wheat-pastry-flour-kab212374-pastry-flour-r818-20261019",
    "researchState": "researched_supported",
    "fromIngredientRefId": "ingredient-ref-whole-wheat-pastry-flour",
    "replacements": [
      {
        "ingredientRefId": "ingredient-ref-pastry-flour"
      }
    ],
    "context": "King Arthur Whole Wheat Pastry Graham Flour, SKU 212374, used in pastry applications. The manufacturer product page says the whole-wheat pastry flour can be used interchangeably with regular pastry flour.",
    "basis": "Current manufacturer guidance directly names regular pastry flour as an interchangeable use for this specific whole-wheat pastry product.",
    "adjustments": [],
    "expectedEffects": [
      "King Arthur describes the whole-wheat product as nutty and slightly dense and says the choice is a matter of personal taste."
    ],
    "limitations": [
      "Evidence is for King Arthur SKU 212374 only; do not generalize it to all products or milling grades covered by the generic whole-wheat-pastry-flour identity.",
      "The product page gives no explicit quantity, mass or volume ratio, measuring basis, or hydration adjustment. Do not encode a 1:1 numeric rule or density.",
      "The evidence names pastry flour as the destination. It does not support substituting whole-wheat pastry flour for all-purpose flour or using it as a bread-flour replacement.",
      "No active substitution rule or bundled recipe link is proposed; the finding remains ledger evidence scoped to the named product."
    ],
    "sourceIds": [
      "WP02A1-S04"
    ]
  },
  "addDecisions": [
    {
      "outcome": "accepted",
      "reason": "Record King Arthur's current product-specific interchangeability statement as a supported direction from its Whole Wheat Pastry Graham Flour SKU 212374 to the existing pastry-flour identity. Preserve R803's separate measurement evidence and the active catalog unchanged.",
      "sourceIds": ["WP02A1-S04"]
    },
    {
      "outcome": "unresolved",
      "reason": "Do not turn one named product's manufacturer statement into a global or contextual runtime rule for all whole-wheat pastry flour. The source provides no explicit quantity or formula-level adjustment, and the bundled library has no direct demand for this row.",
      "sourceIds": ["WP02A1-S04"]
    }
  ]
}
```

This delta updates only the existing whole-wheat-pastry-flour ledger row. Do not change the pastry-flour ledger row, add an alias or reference, create a form, density, mapping, conversion, package yield, recipe link, global rule, contextual rule, or line-level substitution.

## Sources and limits

| Source | Evidence used | Limits |
| --- | --- | --- |
| Reuse `WP02A1-S04` — King Arthur Baking, [Whole Wheat Pastry Graham Flour, SKU 212374](https://shop.kingarthurbaking.com/items/whole-wheat-pastry-graham-flour). | Current product page identifies a complete-kernel whole-wheat pastry product and states it may be used interchangeably with regular pastry flour. | Direct evidence for this product's manufacturer advice; no explicit ratio, mass, volume, or hydration instructions. Do not transfer to other brands or infer a generic active rule. |
| Context only — King Arthur Baking, [Tender Pie Crust](https://www.kingarthurbaking.com/recipes/tender-pie-crust-recipe), updated 2025-06-04. | The named double-crust formula uses 2 cups (213 g) King Arthur Pastry Flour. Its tip offers whole-wheat pastry flour for an equal amount of “your unbleached white” and advises starting with about 1/2 cup until the baker finds a preferred ratio. | The tip does not name its target as pastry flour and is limited to that pie-crust context. It is not used to infer a global ratio or added as a ledger source. |
| Existing R803 measurement source `WP07-KAB-IWC` — King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart). | Links the combined “Whole Wheat Pastry Flour / Graham Flour” chart row to the named King Arthur SKU and supports the existing 1 cup (96 g) observation. | This chart portion is already recorded and remains limited to the named product; it is not substitution evidence. No source edit is proposed for this chart record. |

## Static checks and test scope

- Read the live A7 checklist, the R803 whole-wheat-pastry measurement proposal, the R815 A7 integration, the active target and replacement rows, relevant ledger findings, and the current workflow/schema before selecting this follow-up.
- Reopened King Arthur's current SKU 212374 product page and its *Tender Pie Crust* recipe; checked the manufacturer statement, named product, application context, and the recipe tip's target wording separately.
- Audited ownership of both active identities, the product URL and source IDs, aliases, forms, active substitution files, legacy-import identities, phrase-first picker results, and the 114 manifest-listed recipes / 1,123 ingredient-array rows.
- This is a proposal-only Markdown change. If accepted, the ledger integration would only add database JSON evidence. Under the current `AGENTS.md` rule, database-JSON-only changes need no software tests; no tests, app build, emulator run, or deployment were performed.
